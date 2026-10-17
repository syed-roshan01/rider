import re, sys, os
sys.stdout.reconfigure(encoding='utf-8', errors='replace')
sys.path.insert(0, 'tools')

SMALI = os.path.join('decoded-apktool', 'smali')
TARGET = 'Lcom/auto/accept/service/RideAcceptorService;'

# re-use the module by exec'ing just the parsing part
src = open('tools/deobf.py', encoding='utf-8').read()
# cut everything from the "static short[] field" section onward
cut = src.index('# static short[] field')
ns = {}
exec(compile(src[:cut], 'deobf_part', 'exec'), ns)

parse = ns['parse']
RE_FILL_ARRAY = ns['RE_FILL_ARRAY']
RE_SPUT_OBJ = ns['RE_SPUT_OBJ']

# find the class file
path = None
for dp, _, fs in os.walk(SMALI):
    for f in fs:
        if f.endswith('.smali'):
            p = os.path.join(dp, f)
            cls, methods, arrays, fields = parse(p)
            if cls == TARGET:
                path = p
                print('file:', p)
                print('methods:', len(methods))
                print('array labels found:', list(arrays.keys()))
                for lab, buf in arrays.items():
                    print('   %s -> %d shorts' % (lab, len(buf)))
                # FIELD_ARR style resolution for this class
                for m in methods:
                    if m.name != '<clinit>':
                        continue
                    print('\n<clinit> name=%s proto=%s lines=%d' % (m.name, m.proto, len(m.lines)))
                    reg_lab = {}
                    for i, ln in enumerate(m.lines):
                        fm = RE_FILL_ARRAY.match(ln)
                        if fm:
                            reg_lab[fm.group(1)] = fm.group(2)
                            print('   [%d] fill-array-data %s -> %s' % (i, fm.group(1), fm.group(2)))
                        pm = RE_SPUT_OBJ.match(ln)
                        if pm and pm.group(4) == '[S':
                            print('   [%d] sput-object %s %s->%s:[S  lab=%s' % (
                                i, pm.group(1), pm.group(2), pm.group(3), reg_lab.get(pm.group(1))))
                # the getter method
                for m in methods:
                    if m.proto == '()[S':
                        print('\ngetter %s%s lines=%d' % (m.name, m.proto, len(m.lines)))
                        for i, ln in enumerate(m.lines):
                            if ln.strip():
                                print('   [%d] %s' % (i, ln.strip()))
                # one decrypt call site
                for m in methods:
                    if m.name == '<clinit>':
                        for i, ln in enumerate(m.lines):
                            if '[SIII)Ljava/lang/String;' in ln:
                                print('\ncall site context (clinit):')
                                for j in range(max(0, i - 12), min(len(m.lines), i + 3)):
                                    print('   [%d] %r' % (j, m.lines[j]))
                                break
                break
    if path:
        break
