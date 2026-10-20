package androidx.compose.ui.focus;

import c1.k;
import c1.m;
import t1.u0;
import y0.n;

/* JADX INFO: loaded from: classes.dex */
final class FocusRequesterElement extends u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f1703b;

    public FocusRequesterElement(k kVar) {
        this.f1703b = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && d7.a.d(this.f1703b, ((FocusRequesterElement) obj).f1703b);
    }

    @Override // t1.u0
    public final int hashCode() {
        return this.f1703b.hashCode();
    }

    @Override // t1.u0
    public final n l() {
        m mVar = new m();
        mVar.f2906u = this.f1703b;
        return mVar;
    }

    @Override // t1.u0
    public final void m(n nVar) {
        m mVar = (m) nVar;
        mVar.f2906u.f2905a.m(mVar);
        k kVar = this.f1703b;
        mVar.f2906u = kVar;
        kVar.f2905a.c(mVar);
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f1703b + ')';
    }
}
