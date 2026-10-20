package i3;

import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;

/* JADX INFO: loaded from: classes.dex */
public final class g extends k.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile j0.b0 f7961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile a0 f7962d;

    public final int O(int i10, CharSequence charSequence) {
        j0.b0 b0Var = this.f7961c;
        b0Var.getClass();
        if (i10 < 0 || i10 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            e0[] e0VarArr = (e0[]) spanned.getSpans(i10, i10 + 1, e0.class);
            if (e0VarArr.length > 0) {
                return spanned.getSpanEnd(e0VarArr[0]);
            }
        }
        return ((t) b0Var.i(charSequence, Math.max(0, i10 - 16), Math.min(charSequence.length(), i10 + 16), Integer.MAX_VALUE, true, new t(i10))).f7991c;
    }

    public final int P(int i10, CharSequence charSequence) {
        j0.b0 b0Var = this.f7961c;
        b0Var.getClass();
        if (i10 < 0 || i10 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            e0[] e0VarArr = (e0[]) spanned.getSpans(i10, i10 + 1, e0.class);
            if (e0VarArr.length > 0) {
                return spanned.getSpanStart(e0VarArr[0]);
            }
        }
        return ((t) b0Var.i(charSequence, Math.max(0, i10 - 16), Math.min(charSequence.length(), i10 + 16), Integer.MAX_VALUE, true, new t(i10))).f7990b;
    }

    public final void Q() {
        try {
            ((l) this.f8599b).f7975f.a(new f(this));
        } catch (Throwable th) {
            ((l) this.f8599b).e(th);
        }
    }

    public final CharSequence R(CharSequence charSequence, int i10, int i11, boolean z10) {
        g0 g0Var;
        e0[] e0VarArr;
        j0.b0 b0Var = this.f7961c;
        b0Var.getClass();
        boolean z11 = charSequence instanceof c0;
        if (z11) {
            ((c0) charSequence).a();
        }
        if (z11) {
            g0Var = new g0((Spannable) charSequence);
        } else {
            try {
                if (charSequence instanceof Spannable) {
                    g0Var = new g0((Spannable) charSequence);
                } else if (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i10 - 1, i11 + 1, e0.class) > i11) {
                    g0Var = null;
                } else {
                    g0Var = new g0();
                    g0Var.f7963a = false;
                    g0Var.f7964b = new SpannableString(charSequence);
                }
            } finally {
                if (z11) {
                    ((c0) charSequence).b();
                }
            }
        }
        if (g0Var != null && (e0VarArr = (e0[]) g0Var.f7964b.getSpans(i10, i11, e0.class)) != null && e0VarArr.length > 0) {
            for (e0 e0Var : e0VarArr) {
                int spanStart = g0Var.f7964b.getSpanStart(e0Var);
                int spanEnd = g0Var.f7964b.getSpanEnd(e0Var);
                if (spanStart != i11) {
                    g0Var.removeSpan(e0Var);
                }
                i10 = Math.min(spanStart, i10);
                i11 = Math.max(spanEnd, i11);
            }
        }
        int i12 = i10;
        if (i12 != i11 && i12 < charSequence.length()) {
            g0 g0Var2 = (g0) b0Var.i(charSequence, i12, i11, Integer.MAX_VALUE, z10, new r(g0Var, (l2.l) b0Var.f8249b));
            if (g0Var2 != null) {
                return g0Var2.f7964b;
            }
            if (!z11) {
                return charSequence;
            }
        } else if (!z11) {
            return charSequence;
        }
        return charSequence;
    }

    public final void S(EditorInfo editorInfo) {
        Bundle bundle = editorInfo.extras;
        j3.b bVar = (j3.b) this.f7962d.f7941a;
        int iA = bVar.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? bVar.f8336b.getInt(iA + bVar.f8335a) : 0);
        Bundle bundle2 = editorInfo.extras;
        ((l) this.f8599b).getClass();
        bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
