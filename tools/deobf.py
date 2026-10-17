#!/usr/bin/env python3
"""
NP-Manager (NP管理器 3.1.43) deobfuscation helper for "Ride Accepter-v6.apk".

The obfuscator applies:
  1. Package flattening + name scrambling (ASCII + Arabic-Indic lookalikes)
  2. Control-flow flattening: a `sparse-switch` dispatcher keyed on
     String.hashCode() of short Unicode "state token" strings.
  3. String literal hiding: real literals are returned by tiny accessor
     methods scattered through unrelated library classes.
  4. ([SIII)String XOR string decryption over `short[]` blobs.
  5. Bogus/dead "decryptor" methods seeded with Math.random() + junk loops.

This script recovers (2), (3) and (4) and rebuilds the real basic-block
order of the app's own classes.
"""
import os
import re
import sys
import json

try:
    sys.stdout.reconfigure(encoding='utf-8', errors='replace')
    sys.stderr.reconfigure(encoding='utf-8', errors='replace')
except Exception:
    pass

SMALI = os.path.join('decoded-apktool', 'smali')
OUT = 'analysis'
os.makedirs(OUT, exist_ok=True)

APP_PREFIX = 'com/auto/accept/'


# --------------------------------------------------------------------------
def unescape(s):
    out, i = [], 0
    while i < len(s):
        c = s[i]
        if c == '\\' and i + 1 < len(s):
            n = s[i + 1]
            if n == 'u' and i + 5 < len(s):
                out.append(chr(int(s[i + 2:i + 6], 16)))
                i += 6
                continue
            simple = {'n': '\n', 't': '\t', 'r': '\r', 'b': '\b', 'f': '\f',
                      '"': '"', "'": "'", '\\': '\\', '0': '\0'}
            out.append(simple.get(n, n))
            i += 2
            continue
        out.append(c)
        i += 1
    return ''.join(out)


def jhash(s):
    h = 0
    for ch in s:
        h = (h * 31 + ord(ch)) & 0xFFFFFFFF
    return h - 0x100000000 if h >= 0x80000000 else h


def num(tok):
    tok = tok.strip()
    return int(tok, 16) if 'x' in tok.lower() else int(tok)


def visible(s):
    if s == '':
        return False
    if all(0x0600 <= ord(c) <= 0x077F for c in s):
        return False                      # Arabic-Indic obfuscation alphabet
    pr = sum(1 for c in s if 32 <= ord(c) < 127 or ord(c) > 159)
    return pr >= max(1, int(len(s) * 0.8))


RE_CLASS = re.compile(r'^\.class\b.*?\s+(L[^;\s]+;)')
RE_METH = re.compile(r'^\.method\s+(.*?)\((.*)\)(\S+)\s*$')
RE_CONST = re.compile(r'^\s*const-string(?:/jumbo)?\s+([vp]\d+),\s*"(.*)"\s*$')
RE_SPARSE_SW = re.compile(r'^\s*sparse-switch\s+([vp]\d+),\s*:(\w+)')
RE_LABEL = re.compile(r'^\s*:(\w+)\s*$')
RE_SPARSE_CASE = re.compile(r'^\s*(-?0x[0-9a-fA-F]+|-?\d+)\s*->\s*:(\w+)')
RE_FILL_ARRAY = re.compile(r'^\s*fill-array-data\s+([vp]\d+),\s*:(\w+)')
RE_SGET_OBJ = re.compile(r'^\s*sget-object\s+([vp]\d+),\s*(L[^;]+;)->([^:]+):(\S+)')
RE_SPUT_OBJ = re.compile(r'^\s*sput-object\s+([vp]\d+),\s*(L[^;]+;)->([^:]+):(\S+)')
RE_NEW_ARRAY = re.compile(r'^\s*new-array\s+([vp]\d+),')
RE_ARRAY_HDR = re.compile(r'^\s*\.array-data\s+(\d+)')
RE_ARRAY_VAL = re.compile(r'^\s*(-?0x[0-9a-fA-F]+|-?\d+)[sS]?\s*$')
RE_INVOKE = re.compile(r'^\s*invoke-(\w+)(?:/range)?\s+\{([^}]*)\},\s*(L[^;]+;)->([^\s(]+)\((.*?)\)(\S+)')
RE_CONSTNUM = re.compile(r'^\s*const(?:/16|/8|/4|/high16)?\s+([vp]\d+),\s*(-?0x[0-9a-fA-F]+|-?\d+)\s*$')


class Method:
    __slots__ = ('cls', 'name', 'proto', 'access', 'lines')

    def __init__(self, cls, name, proto, access, lines):
        self.cls, self.name, self.proto, self.access, self.lines = cls, name, proto, access, lines

    @property
    def key(self):
        return '%s->%s%s' % (self.cls, self.name, self.proto)


def parse(path):
    with open(path, 'r', encoding='utf-8') as fh:
        raw = fh.read().split('\n')
    cls, methods, arrays, fields = None, [], {}, []
    i, n = 0, len(raw)
    while i < n:
        line = raw[i]
        m = RE_CLASS.match(line)
        if m:
            cls = m.group(1)
            i += 1
            continue
        if line.startswith('.field'):
            for tok in line.split()[1:]:
                if ':' in tok:
                    fn, ft = tok.split(':', 1)
                    fields.append((ft, fn))
                    break
            i += 1
            continue
        m = RE_METH.match(line)
        if m:
            head, args, ret = m.groups()
            parts = head.split()
            name = parts[-1]
            access = ' '.join(parts[:-1])
            j = i + 1
            while j < n and not raw[j].startswith('.end method'):
                j += 1
            methods.append(Method(cls, name, '(%s)%s' % (args, ret), access, raw[i:j + 1]))
            i = j + 1
            continue
        i += 1

    cur = None
    for idx, line in enumerate(raw):
        lm = RE_LABEL.match(line)
        if lm:
            cur = lm.group(1)
            continue
        am = RE_ARRAY_HDR.match(line)
        if am and int(am.group(1)) == 2:
            buf = []
            j = idx + 1
            while j < n and not raw[j].strip().startswith('.end array-data'):
                vm = RE_ARRAY_VAL.match(raw[j])
                if vm:
                    v = num(vm.group(1)) & 0xFFFF
                    buf.append(v - 0x10000 if v >= 0x8000 else v)
                j += 1
            if cur:
                arrays[cur] = buf
    return cls, methods, arrays, fields


print('parsing smali ...')
ALL_METHODS, CLS_METHODS, CLS_ARRAYS, CLS_FIELDS = {}, {}, {}, {}
files = 0
for path, _, fs in os.walk(SMALI):
    for f in fs:
        if not f.endswith('.smali'):
            continue
        cls, methods, arrays, fields = parse(os.path.join(path, f))
        if not cls:
            continue
        CLS_METHODS[cls], CLS_ARRAYS[cls], CLS_FIELDS[cls] = methods, arrays, fields
        for m in methods:
            ALL_METHODS[m.key] = m
        files += 1
print('  parsed %d smali files, %d methods' % (files, len(ALL_METHODS)))


# --------------------------------------------------------------------------
# static short[] field -> array blob   (resolved from <clinit>)
# --------------------------------------------------------------------------
FIELD_ARR = {}          # ('Lcls;', 'fieldname') -> [shorts]
for cls, methods in CLS_METHODS.items():
    arrays = CLS_ARRAYS.get(cls, {})
    if not arrays:
        continue
    for m in methods:
        if m.name != '<clinit>':
            continue
        reg_lab, lab_arr = {}, dict(arrays)
        for ln in m.lines:
            fm = RE_FILL_ARRAY.match(ln)
            if fm:
                reg_lab[fm.group(1)] = fm.group(2)
            pm = RE_SPUT_OBJ.match(ln)
            if pm and pm.group(4) == '[S':
                lab = reg_lab.get(pm.group(1))
                if lab and lab in lab_arr:
                    FIELD_ARR[(pm.group(2), pm.group(3))] = lab_arr[lab]
print('  resolved %d static short[] blobs' % len(FIELD_ARR))


# --------------------------------------------------------------------------
# string accessor recovery
# --------------------------------------------------------------------------
print('recovering scattered string accessors ...')
ACCESSOR = {}
for key, m in ALL_METHODS.items():
    if m.proto != '()Ljava/lang/String;':
        continue
    if m.name in ('toString', 'name', 'getSimpleName', 'getCanonicalName', 'getMessage'):
        continue
    lits = []
    for ln in m.lines:
        cm = RE_CONST.match(ln)
        if cm:
            s = unescape(cm.group(2))
            if visible(s):
                lits.append(s)
    lits = list(dict.fromkeys(lits))
    if len(lits) == 1:
        ACCESSOR['%s->%s%s' % (m.cls, m.name, m.proto)] = lits[0]
print('  recovered %d accessor literals' % len(ACCESSOR))

with open(os.path.join(OUT, 'accessor_strings.json'), 'w', encoding='utf-8') as fh:
    json.dump(ACCESSOR, fh, ensure_ascii=False, indent=1, sort_keys=True)

with open(os.path.join(OUT, 'all_literals.txt'), 'w', encoding='utf-8') as fh:
    for cls in sorted(CLS_METHODS):
        for m in CLS_METHODS[cls]:
            for ln in m.lines:
                cm = RE_CONST.match(ln)
                if cm:
                    s = unescape(cm.group(2))
                    if visible(s):
                        fh.write('%s\t%r\n' % (m.key, s))
print('  wrote analysis/all_literals.txt')


# --------------------------------------------------------------------------
# ([SIII)String XOR decryption
# --------------------------------------------------------------------------
def decrypt_xor(arr, off, ln, key):
    if off < 0 or ln < 0 or off + ln > len(arr):
        return None
    return ''.join(chr((arr[off + i] ^ key) & 0xFFFF) for i in range(ln))


print('decoding ([SIII) XOR strings ...')

RE_MOV = re.compile(r'^\s*move(?:/16)?\s+([vp]\d+),\s*([vp]\d+)\s*$')
RE_BINLIT = re.compile(r'^\s*(xor|add|sub|mul|or|and)-int/lit16\s+([vp]\d+),\s*([vp]\d+),\s*(-?0x[0-9a-fA-F]+|-?\d+)\s*$')
RE_BIN2 = re.compile(r'^\s*(xor|add|sub|mul|or|and)-int(?:/addr)?\s+([vp]\d+),\s*([vp]\d+)(?:,\s*([vp]\d+))?\s*$')
RE_HIGH = re.compile(r'^\s*const/high16\s+([vp]\d+),\s*(-?0x[0-9a-fA-F]+|-?\d+)\s*$')
RE_NEWS = re.compile(r'^\s*new-array\s+([vp]\d+),\s*[vp]\d+,\s*\[S\s*$')
RE_MRES = re.compile(r'^\s*move-result(?:-object|-wide)?\s+([vp]\d+)\s*$')
RE_RETOBJ = re.compile(r'^\s*return-object\s+([vp]\d+)\s*$')
RE_INVOKE_S = re.compile(r'^\s*invoke-\w+(?:/range)?\s+\{[^}]*\},\s*(L[^;]+;)->([^\s(]+)\((.*?)\)(\[S)\s*$')

UNRES = object()
ARR_M_CACHE = {}


def resolve_array_method(mkey, depth=0):
    """What [S does a zero-arg method return?  (memoised)"""
    if mkey in ARR_M_CACHE:
        return ARR_M_CACHE[mkey]
    if depth > 6:
        return UNRES
    ARR_M_CACHE[mkey] = UNRES
    m = ALL_METHODS.get(mkey)
    if m is None:
        return UNRES
    res = UNRES
    for i, ln in enumerate(m.lines):
        rm = RE_RETOBJ.match(ln)
        if rm:
            res = resolve_reg(m.lines, i, rm.group(1), CLS_ARRAYS.get(m.cls, {}),
                              FIELD_ARR, depth + 1, mkey)
            break
    ARR_M_CACHE[mkey] = res
    return res


def _apply(op, a, b):
    if op == 'xor':
        return a ^ b
    if op == 'add':
        return a + b
    if op == 'sub':
        return a - b
    if op == 'mul':
        return a * b
    if op == 'or':
        return a | b
    return a & b


def resolve_reg(lines, upto, reg, arrays, field_arr, depth=0, mkey=None):
    """Walk backwards from `upto` to find what `reg` holds.
    Returns int, list-of-shorts, or UNRES."""
    if depth > 12:
        return UNRES
    for i in range(upto - 1, -1, -1):
        ln = lines[i]
        m = RE_CONSTNUM.match(ln)
        if m and m.group(1) == reg:
            if RE_HIGH.match(ln):
                return num(m.group(2)) << 16
            return num(m.group(2))
        m = RE_MRES.match(ln)
        if m and m.group(1) == reg:
            # value came from the invoke just above (smali puts blank lines
            # between instructions, so step over them)
            for j in range(i - 1, max(-1, i - 6), -1):
                if not lines[j].strip():
                    continue
                im = RE_INVOKE_S.match(lines[j])
                if im:
                    return resolve_array_method('%s->%s(%s)%s' % (im.group(1), im.group(2),
                                                                  im.group(3), im.group(4)),
                                                depth + 1)
                break
            return UNRES
        m = RE_MOV.match(ln)
        if m and m.group(1) == reg:
            return resolve_reg(lines, i, m.group(2), arrays, field_arr, depth + 1)
        m = RE_BINLIT.match(ln)
        if m and m.group(2) == reg:
            base = resolve_reg(lines, i, m.group(3), arrays, field_arr, depth + 1)
            return _apply(m.group(1), base, num(m.group(4))) if isinstance(base, int) else UNRES
        m = RE_BIN2.match(ln)
        if m and m.group(2) == reg:
            if m.group(4) is None:                       # /2addr form
                base = resolve_reg(lines, i, m.group(3), arrays, field_arr, depth + 1)
                return _apply(m.group(1), base, base) if isinstance(base, int) else UNRES
            a = resolve_reg(lines, i, m.group(3), arrays, field_arr, depth + 1)
            b = resolve_reg(lines, i, m.group(4), arrays, field_arr, depth + 1)
            return _apply(m.group(1), a, b) if (isinstance(a, int) and isinstance(b, int)) else UNRES
        m = RE_FILL_ARRAY.match(ln)
        if m and m.group(1) == reg:
            return arrays.get(m.group(2), UNRES)
        m = RE_NEWS.match(ln)
        if m and m.group(1) == reg:
            return []                                    # empty array, later filled
        m = RE_SGET_OBJ.match(ln)
        if m and m.group(1) == reg:
            if m.group(4) == '[S':
                return field_arr.get((m.group(2), m.group(3)), UNRES)
            return UNRES
        # any other definition of this register kills the backward search
        if re.match(r'^\s*(?!#)', ln) and reg in re.findall(r'\b[vp]\d+\b', ln):
            head = ln.strip().split()[0] if ln.strip() else ''
            if head.endswith('') and not head.startswith(('if-', 'goto', 'return',
                                                          'sparse-switch', 'packed-switch',
                                                          '.array-data', 'fill-array-data')):
                if re.match(r'^\S+\s+' + re.escape(reg) + r'\b', ln.strip()):
                    return UNRES
    return UNRES


XOR_RES, xor_tried = [], 0
XOR_BY_TXT = {}
CALLS = []
_DBG = os.environ.get('DEOBF_DEBUG') == '1'
dbg_n = 0
for cls in sorted(CLS_METHODS):
    arrays = CLS_ARRAYS.get(cls, {})
    for m in CLS_METHODS[cls]:
        for idx, ln in enumerate(m.lines):
            im = RE_INVOKE.match(ln)
            if not im or im.group(6) != 'Ljava/lang/String;' or im.group(5) != '[SIII':
                continue
            xor_tried += 1
            regs = [r.strip() for r in im.group(2).split(',')]
            if len(regs) != 4:
                continue
            arr = resolve_reg(m.lines, idx, regs[0], arrays, FIELD_ARR)
            if not isinstance(arr, list) or not arr:
                continue
            off = resolve_reg(m.lines, idx, regs[1], arrays, FIELD_ARR)
            key = resolve_reg(m.lines, idx, regs[3], arrays, FIELD_ARR)
            if not (isinstance(off, int) and isinstance(key, int)):
                continue
            if off < 0 or off >= len(arr):
                continue
            field = None
            for j in range(idx + 1, min(idx + 5, len(m.lines))):
                sp = RE_SPUT_OBJ.match(m.lines[j])
                if sp:
                    field = '%s.%s' % (sp.group(2)[1:-1].replace('/', '.'), sp.group(3))
                    break
            CALLS.append((id(arr), arr, off, key, m.key, ln.strip(), field))

# --- pass B: recovered strings sit contiguously inside each short[] blob, so an
#     entry's exact length is (next entry's offset - this entry's offset).  Use
#     that where possible; otherwise fall back to a strict printable run (real
#     values are code identifiers / URLs / messages, while an over-read tail
#     decodes to random Indic/Cyrillic code points under the wrong key).
OK_CHARS = set(chr(c) for c in range(32, 127)) | set(
    '\u20b9\u2705\u26a0\ufe0f\u2026\u2019\u2018\u201c\u201d\u2013\u2014\u2022'
    '\u00d7\u00b7\u2192\u2713\u2714\u2605\u00a0')


def strict_run(raw):
    out = []
    for c in raw:
        if c not in OK_CHARS:
            break
        out.append(c)
    return ''.join(out).rstrip()


groups = {}
for _c in CALLS:
    groups.setdefault(_c[0], []).append(_c)

for _arrid, items in groups.items():
    _arr = items[0][1]
    _offs = sorted({c[2] for c in items})
    _nxt = {o: (_offs[i + 1] if i + 1 < len(_offs) else None) for i, o in enumerate(_offs)}
    _seen = set()
    for _, __arr, off, key, mkey, txt, field in items:
        if (mkey, txt) in _seen:
            continue
        _seen.add((mkey, txt))
        s = None
        end = _nxt.get(off)
        if end and end > off and end <= len(_arr):
            cand = decrypt_xor(_arr, off, end - off, key)
            if cand and all(c in OK_CHARS for c in cand):
                s = cand
        if s is None:
            raw = decrypt_xor(_arr, off, min(400, max(1, len(_arr) - off)), key) or ''
            cand = strict_run(raw)
            if len(cand) >= 2:
                s = cand
        if not s:
            continue
        XOR_RES.append((mkey, s, '', field))
        XOR_BY_TXT[(mkey, txt)] = s

print('  %d ([SIII) call sites seen, %d strings recovered' % (xor_tried, len(XOR_RES)))
for k, s, _, fld in XOR_RES[:400]:
    print('    %s  %s -> %s' % (fld or '-', k, ascii(s)))

with open(os.path.join(OUT, 'xor_strings.txt'), 'w', encoding='utf-8') as fh:
    fh.write('# NP-Manager ([SIII) XOR string decryption\n')
    fh.write('# assigned-field \t method \t decryptor \t plaintext\n')
    for k, s, tgt, fld in XOR_RES:
        fh.write('%s\t%s\t%s\t%s\n' % (fld or '-', k, tgt, ascii(s)))

with open(os.path.join(OUT, 'decrypted_constants.txt'), 'w', encoding='utf-8') as fh:
    fh.write('# Static String constants recovered from the ([SIII) XOR blobs,\n')
    fh.write('# keyed by the field they are assigned to in <clinit>.\n\n')
    for k, s, tgt, fld in sorted(XOR_RES, key=lambda r: (r[3] or '~', r[0])):
        if fld:
            fh.write('%-72s = %s\n' % (fld, ascii(s)))
print('  wrote analysis/decrypted_constants.txt')


# --------------------------------------------------------------------------
# linearize hashCode() token dispatchers
# --------------------------------------------------------------------------
def split_blocks(lines):
    blocks, order, cur = {}, [], '__entry__'
    blocks[cur] = [cur]
    order.append(cur)
    blocks[cur] = []
    for ln in lines:
        lm = RE_LABEL.match(ln)
        if lm:
            cur = lm.group(1)
            if cur not in blocks:
                blocks[cur] = []
                order.append(cur)
            continue
        blocks[cur].append(ln)
    return blocks, order


NOISE_MOVE = re.compile(r'^move(-wide|-object|-object/from16|-wide/from16)?\s+v\d+,\s*[vp]\d+\s*$')
NOISE_CONST = re.compile(r'^const(?:/16|/8|/4|/high16)?\s+[vp]\d+,\s*-?0x[0-9a-fA-F]+\s*$')
NOISE_ARITH = re.compile(r'^(xor|or|and|add|sub|shl|shr|ushr|mul|div|rem|rsub)-int')
NOISE_SGET = re.compile(r'^sget\s+[vp]\d+,')


def clean(ln, token_reg):
    s = ln.strip()
    if not s or s.startswith('.') or s.startswith('#'):
        return None
    cm = RE_CONST.match(ln)
    if cm and cm.group(1) == token_reg:
        return None
    if s.startswith('goto :goto_') or s.startswith('goto/32 :goto_'):
        return None
    if s.startswith('goto ') and (':cond_' in s or ':sswitch_' in s or ':pswitch_' in s):
        return None
    if s.startswith('sparse-switch') or s.startswith('packed-switch'):
        return None
    if NOISE_CONST.match(s) or NOISE_ARITH.match(s) or NOISE_SGET.match(s) or NOISE_MOVE.match(s):
        return None
    return s


print('linearizing app control flow ...')

RE_XORLIT = re.compile(r'^\s*xor-int/lit16\s+([vp]\d+),\s*([vp]\d+),\s*(-?0x[0-9a-fA-F]+|-?\d+)\s*$')
RE_MOVERES = re.compile(r'^\s*move-result\s+([vp]\d+)\s*$')
RE_GOTO = re.compile(r'^\s*goto(?:/16|/32)?\s+:(\w+)')
NOISE_MOVE = re.compile(r'^move(-wide|-object|-object/from16|-wide/from16|-result.*)?\s')
NOISE_CONST = re.compile(r'^const(?:/16|/8|/4|/high16)?\s+[vp]\d+,\s*-?0x[0-9a-fA-F]+\s*$')
NOISE_ARITH = re.compile(r'^(xor|or|and|add|sub|shl|shr|ushr|mul|div|rem|rsub)-int')
NOISE_SGET = re.compile(r'^sget\s+[vp]\d+,')


def find_dispatcher(lines):
    """Detect the flattened-CFG dispatcher.

    style 'int'  : xor-int/lit16 d,d,MASK ; sparse-switch d   (state machine)
    style 'hash' : invoke-static {T},..(Object;)I ; move-result d ; sparse-switch d
    """
    for idx, ln in enumerate(lines):
        sw = RE_SPARSE_SW.match(ln)
        if not sw:
            continue
        dreg, dlabel = sw.group(1), sw.group(2)
        for k in range(idx - 1, max(-1, idx - 8), -1):
            xm = RE_XORLIT.match(lines[k])
            if xm and xm.group(1) == dreg and xm.group(2) == dreg:
                disp_label = None
                for k2 in range(idx, max(-1, idx - 40), -1):
                    lm = RE_LABEL.match(lines[k2])
                    if lm:
                        disp_label = lm.group(1)
                        break
                return dict(style='int', state=dreg, mask=num(xm.group(3)),
                            data=dlabel, disp=disp_label, swline=idx)
        for k in range(idx - 1, max(-1, idx - 8), -1):
            mr = RE_MOVERES.match(lines[k])
            if mr and mr.group(1) == dreg:
                for k2 in range(k - 1, max(-1, k - 8), -1):
                    im = RE_INVOKE.match(lines[k2])
                    if im and im.group(6) == 'I' and im.group(5) == 'Ljava/lang/Object;':
                        disp_label = None
                        for k3 in range(idx, max(-1, idx - 40), -1):
                            lm = RE_LABEL.match(lines[k3])
                            if lm:
                                disp_label = lm.group(1)
                                break
                        return dict(style='hash', token=im.group(2).strip(), state=dreg,
                                    data=dlabel, disp=disp_label, swline=idx)
                break
    return None


def block_state(lines, dsp):
    """What state/token does a block hand back to the dispatcher?"""
    if dsp['style'] == 'hash':
        tok = None
        for ln in lines:
            cm = RE_CONST.match(ln)
            if cm and cm.group(1) == dsp['token']:
                tok = unescape(cm.group(2))
        return ('hash', tok) if tok is not None else (None, None)
    val = None
    for ln in lines:
        cm = RE_CONSTNUM.match(ln)
        if cm and cm.group(1) == dsp['state']:
            val = num(cm.group(2))
    if val is None:
        return (None, None)
    return ('int', val ^ dsp['mask'])


def clean(ln, drop_regs):
    s = ln.strip()
    if not s or s.startswith('.') or s.startswith('#'):
        return None
    if re.match(r'^-?(0x[0-9a-fA-F]+|\d+)s$', s):        # .array-data short values
        return None
    cm = RE_CONST.match(ln)
    if cm and cm.group(1) in drop_regs:
        return None
    if RE_GOTO.match(ln):
        return None
    if s.startswith('sparse-switch') or s.startswith('packed-switch'):
        return None
    if NOISE_CONST.match(s) or NOISE_ARITH.match(s) or NOISE_SGET.match(s) or NOISE_MOVE.match(s):
        return None
    return s


def annotate(mkey, ln):
    d = XOR_BY_TXT.get((mkey, ln.strip()))
    if d:
        return '   ==> DECRYPTED %s' % ascii(d)
    im = RE_INVOKE.match(ln)
    if im:
        call = '%s->%s%s' % (im.group(3), im.group(4), im.group(5))
        if call in ACCESSOR:
            return '   ==> STRING %s' % ascii(ACCESSOR[call])
    return ''


report = ['NP-MANAGER CONTROL-FLOW RECONSTRUCTION  (com.auto.accept.**)',
          'flattened CFG: blocks hand a "state" back to a sparse-switch dispatcher',
          "  style 'int'  = state const XORed with a mask",
          "  style 'hash' = String.hashCode() of a Unicode token",
          '']
app_classes = [c for c in sorted(CLS_METHODS) if c.startswith('L' + APP_PREFIX)]
stats = {'hash': 0, 'int': 0, 'none': 0}
for cls in app_classes:
    report += ['', '=' * 78, 'CLASS %s' % cls, '=' * 78]
    for m in CLS_METHODS[cls]:
        blocks, order = split_blocks(m.lines)
        dsp = find_dispatcher(m.lines)
        if dsp:
            stats[dsp['style']] += 1
        else:
            stats['none'] += 1

        report += ['', '-' * 78, 'METHOD %s%s   [%s]' % (m.name, m.proto, m.access)]
        if not dsp:
            report.append('  (straight-line - no flattened dispatcher)')
            for ln in m.lines:
                s = clean(ln, set())
                if s:
                    report.append('      %s%s' % (s, annotate(m.key, ln)))
            continue

        report.append("  dispatcher: style=%s  state-reg %s  table :%s  loop-head :%s"
                      % (dsp['style'], dsp['state'], dsp['data'], dsp['disp']))
        if dsp['style'] == 'hash':
            report.append('  token-reg %s  (dispatch key = token.hashCode())' % dsp['token'])
            drop = {dsp['token'], dsp['state']}
        else:
            report.append('  dispatch key = state_const XOR 0x%x' % (dsp['mask'] & 0xFFFF))
            drop = {dsp['state']}

        # ---- sparse-switch table
        case_map = {}
        in_tbl = False
        for ln in m.lines:
            lm = RE_LABEL.match(ln)
            if lm:
                in_tbl = (lm.group(1) == dsp['data'])
                continue
            if in_tbl:
                if '.end sparse-switch' in ln or '.end packed-switch' in ln:
                    break
                cm = RE_SPARSE_CASE.match(ln)
                if cm:
                    case_map.setdefault(cm.group(2), []).append(num(cm.group(1)))

        def case_for(kind, v):
            if kind is None:
                return None
            key = jhash(v) if kind == 'hash' else v
            for lab, keys in case_map.items():
                if key in keys:
                    return lab
            return None

        # ---- successors
        succ, block_state_val = {}, {}
        for lab, blines in blocks.items():
            if lab.endswith('_data_0') or lab == dsp['disp'] or lab.startswith('array_'):
                continue
            kind, v = block_state(blines, dsp)
            block_state_val[lab] = (kind, v)
            tgt = case_for(kind, v)
            if tgt:
                succ[lab] = tgt

        entry_kind, entry_v = block_state_val.get('__entry__', (None, None))
        cur = case_for(entry_kind, entry_v)
        if cur is None and case_map:
            cur = sorted(case_map, key=lambda l: min(case_map[l]))[0]

        seq, guard = [], 0
        while cur and cur not in seq and guard < 500:
            seq.append(cur)
            cur = succ.get(cur)
            guard += 1

        report.append('  REAL EXECUTION ORDER  (%d reachable state blocks):' % len(seq))
        for i, s in enumerate(seq, 1):
            report.append('     %2d. :%s' % (i, s))
        unresolved = [l for l in order
                      if l not in seq and l != '__entry__'
                      and l != dsp['disp'] and not l.endswith('_data_0')
                      and not l.startswith('array_')]
        if unresolved:
            report.append('  not on the resolved path: %s' % ', '.join(':' + u for u in unresolved))

        show = [('  ENTRY', '__entry__')] + [('  block :%s' % s, s) for s in seq] + \
               [('  block :%s   [off-path]' % u, u) for u in unresolved]
        for title, lab in show:
            blines = blocks.get(lab)
            if not blines:
                continue
            kind, v = block_state_val.get(lab, (None, None))
            tgt = succ.get(lab)
            state_desc = 'token %s -> :%s' % (ascii(v), tgt) if kind == 'hash' \
                else ('state 0x%x -> :%s' % (v, tgt) if kind == 'int' else 'state <dynamic> -> %s' % (tgt or 'TERMINAL'))
            if lab == '__entry__' and tgt:
                state_desc += '   (initial state)'
            elif lab != '__entry__' and not tgt:
                state_desc = 'state %s -> TERMINAL' % (ascii(v) if kind == 'hash' else ('0x%x' % v if kind == 'int' else '<dynamic>'))
            report.append('')
            report.append(title)
            report.append('     %s' % state_desc)
            for ln in blines:
                s = clean(ln, drop)
                if not s:
                    continue
                report.append('        %s%s' % (s, annotate(m.key, ln)))

report.append('')
report.append('=' * 78)
report.append('dispatcher style totals: %s' % stats)
report.append('recovered accessor string literals: %d' % len(ACCESSOR))
report.append('decoded ([SIII) XOR strings: %d  (best-effort; args partly derive from opaque static ints)'
              % len(XOR_RES))

with open(os.path.join(OUT, 'app_flow.txt'), 'w', encoding='utf-8') as fh:
    fh.write('\n'.join(report))
print('  wrote analysis/app_flow.txt  (%d app classes, dispatcher styles %s)' % (len(app_classes), stats))
print('\ndone. outputs in ./analysis/')
