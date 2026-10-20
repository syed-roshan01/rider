package k3;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import i3.l;
import x9.v;

/* JADX INFO: loaded from: classes.dex */
public final class h extends v {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g f9735n;

    public h(TextView textView) {
        super(6, (Object) null);
        this.f9735n = new g(textView);
    }

    @Override // x9.v
    public final void H(boolean z10) {
        if (!l.c()) {
            return;
        }
        this.f9735n.H(z10);
    }

    @Override // x9.v
    public final void I(boolean z10) {
        boolean z11 = !l.c();
        g gVar = this.f9735n;
        if (z11) {
            gVar.f9734p = z10;
        } else {
            gVar.I(z10);
        }
    }

    @Override // x9.v
    public final TransformationMethod K(TransformationMethod transformationMethod) {
        return l.c() ^ true ? transformationMethod : this.f9735n.K(transformationMethod);
    }

    @Override // x9.v
    public final InputFilter[] s(InputFilter[] inputFilterArr) {
        return l.c() ^ true ? inputFilterArr : this.f9735n.s(inputFilterArr);
    }

    @Override // x9.v
    public final boolean z() {
        return this.f9735n.f9734p;
    }
}
