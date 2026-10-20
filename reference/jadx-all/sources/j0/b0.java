package j0;

import android.content.SharedPreferences;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.KeyEvent;
import e8.l1;
import g8.p1;
import g8.y5;
import i3.e0;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import k6.l4;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f8248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f8249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f8250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f8251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f8252e;

    public b0(l4 l4Var, String str) {
        this.f8252e = l4Var;
        f6.a.u(str);
        this.f8249b = str;
        this.f8250c = null;
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z10) {
        e0[] e0VarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (e0VarArr = (e0[]) editable.getSpans(selectionStart, selectionEnd, e0.class)) != null && e0VarArr.length > 0) {
            for (e0 e0Var : e0VarArr) {
                int spanStart = editable.getSpanStart(e0Var);
                int spanEnd = editable.getSpanEnd(e0Var);
                if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public final List b(byte[] bArr) {
        List list = (List) ((ConcurrentMap) this.f8249b).get(new v6.o(bArr));
        return list != null ? list : Collections.emptyList();
    }

    @Override // g8.p1
    public final p1 c(boolean z10) {
        return this;
    }

    @Override // g8.p1
    public final void close() {
        this.f8248a = true;
        y3.e.N("Lack of request message. GET request is only supported for unary requests", ((byte[]) this.f8251d) != null);
        ((h8.l) ((g8.b) this.f8252e)).f7669o.A((l1) this.f8249b, (byte[]) this.f8251d);
        this.f8251d = null;
        this.f8249b = null;
    }

    @Override // g8.p1
    public final p1 d(e8.s sVar) {
        return this;
    }

    @Override // g8.p1
    public final void e(int i10) {
    }

    @Override // g8.p1
    public final boolean f() {
        return this.f8248a;
    }

    @Override // g8.p1
    public final void flush() {
    }

    @Override // g8.p1
    public final void g(InputStream inputStream) {
        y3.e.N("writePayload should not be called multiple times", ((byte[]) this.f8251d) == null);
        try {
            this.f8251d = s6.g.b(inputStream);
            y5 y5Var = (y5) this.f8250c;
            for (o7.d0 d0Var : y5Var.f7292a) {
                d0Var.c0(0);
            }
            byte[] bArr = (byte[]) this.f8251d;
            long length = bArr.length;
            long length2 = bArr.length;
            for (o7.d0 d0Var2 : y5Var.f7292a) {
                d0Var2.d0(length, length2, 0);
            }
            long length3 = ((byte[]) this.f8251d).length;
            for (o7.d0 d0Var3 : y5Var.f7292a) {
                d0Var3.e0(length3);
            }
            long length4 = ((byte[]) this.f8251d).length;
            for (o7.d0 d0Var4 : y5Var.f7292a) {
                d0Var4.f0(length4);
            }
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        }
    }

    public final boolean h(CharSequence charSequence, int i10, int i11, i3.d0 d0Var) {
        if ((d0Var.f7952c & 3) == 0) {
            i3.i iVar = (i3.i) this.f8251d;
            j3.a aVarC = d0Var.c();
            int iA = aVarC.a(8);
            if (iA != 0) {
                aVarC.f8336b.getShort(iA + aVarC.f8335a);
            }
            i3.e eVar = (i3.e) iVar;
            eVar.getClass();
            ThreadLocal threadLocal = i3.e.f7953b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i10 < i11) {
                sb.append(charSequence.charAt(i10));
                i10++;
            }
            TextPaint textPaint = eVar.f7954a;
            String string = sb.toString();
            int i12 = u2.e.f15399a;
            boolean zA = u2.d.a(textPaint, string);
            int i13 = d0Var.f7952c & 4;
            d0Var.f7952c = zA ? i13 | 2 : i13 | 1;
        }
        return (d0Var.f7952c & 3) == 2;
    }

    public final Object i(CharSequence charSequence, int i10, int i11, int i12, boolean z10, i3.s sVar) {
        int i13;
        char c10;
        i3.v vVar = new i3.v((i3.z) ((i3.a0) this.f8250c).f7943c, this.f8248a, (int[]) this.f8252e);
        int iCodePointAt = Character.codePointAt(charSequence, i10);
        boolean zB = true;
        int i14 = 0;
        int iCharCount = i10;
        loop0: while (true) {
            i13 = iCharCount;
            while (true) {
                if (iCharCount < i11 && i14 < i12 && zB) {
                    SparseArray sparseArray = vVar.f7999f.f8014a;
                    i3.z zVar = sparseArray == null ? null : (i3.z) sparseArray.get(iCodePointAt);
                    if (vVar.f7994a == 2) {
                        if (zVar != null) {
                            vVar.f7999f = zVar;
                            vVar.f7996c++;
                        } else {
                            if (iCodePointAt == 65038) {
                                vVar.c();
                            } else if (iCodePointAt != 65039) {
                                i3.z zVar2 = vVar.f7999f;
                                if (zVar2.f8015b != null) {
                                    if (vVar.f7996c != 1) {
                                        vVar.f8000g = zVar2;
                                        vVar.c();
                                    } else if (vVar.d()) {
                                        vVar.f8000g = vVar.f7999f;
                                        vVar.c();
                                    } else {
                                        vVar.c();
                                    }
                                    c10 = 3;
                                } else {
                                    vVar.c();
                                }
                            }
                            c10 = 1;
                        }
                        c10 = 2;
                    } else if (zVar == null) {
                        vVar.c();
                        c10 = 1;
                    } else {
                        vVar.f7994a = 2;
                        vVar.f7999f = zVar;
                        vVar.f7996c = 1;
                        c10 = 2;
                    }
                    vVar.f7995b = iCodePointAt;
                    if (c10 == 1) {
                        iCharCount = Character.charCount(Character.codePointAt(charSequence, i13)) + i13;
                        if (iCharCount >= i11) {
                            break;
                        }
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        break;
                    }
                    if (c10 == 2) {
                        int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                        if (iCharCount2 < i11) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                        }
                        iCharCount = iCharCount2;
                    } else if (c10 == 3) {
                        if (!z10 && h(charSequence, i13, iCharCount, ((i3.z) vVar.f8000g).f8015b)) {
                            break;
                        }
                        zB = sVar.b(charSequence, i13, iCharCount, ((i3.z) vVar.f8000g).f8015b);
                        i14++;
                        break;
                    }
                } else {
                    break loop0;
                }
            }
        }
        if (vVar.f7994a == 2 && vVar.f7999f.f8015b != null && ((vVar.f7996c > 1 || vVar.d()) && i14 < i12 && zB && (z10 || !h(charSequence, i13, iCharCount, vVar.f7999f.f8015b)))) {
            sVar.b(charSequence, i13, iCharCount, vVar.f7999f.f8015b);
        }
        return sVar.a();
    }

    public final String j() {
        if (!this.f8248a) {
            this.f8248a = true;
            this.f8251d = ((l4) this.f8252e).s().getString((String) this.f8249b, null);
        }
        return (String) this.f8251d;
    }

    public final void k(String str) {
        SharedPreferences.Editor editorEdit = ((l4) this.f8252e).s().edit();
        editorEdit.putString((String) this.f8249b, str);
        editorEdit.apply();
        this.f8251d = str;
    }
}
