package k3;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import i3.l;

/* JADX INFO: loaded from: classes.dex */
public final class e implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f9728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i2.f f9729b;

    public e(TextView textView) {
        this.f9728a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        TextView textView = this.f9728a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iB = l.a().b();
        if (iB != 0) {
            if (iB == 1) {
                if ((i13 == 0 && i12 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i10 != 0 || i11 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i10, i11);
                }
                return l.a().g(0, charSequence.length(), charSequence);
            }
            if (iB != 3) {
                return charSequence;
            }
        }
        l lVarA = l.a();
        if (this.f9729b == null) {
            this.f9729b = new i2.f(textView, this);
        }
        lVarA.h(this.f9729b);
        return charSequence;
    }
}
