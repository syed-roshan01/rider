package androidx.compose.foundation.layout;

import t1.u0;
import y.l;
import y0.d;
import y0.g;
import y0.n;

/* JADX INFO: loaded from: classes.dex */
final class BoxChildDataElement extends u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f1640b;

    public BoxChildDataElement(g gVar) {
        this.f1640b = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null;
        if (boxChildDataElement == null) {
            return false;
        }
        return d7.a.d(this.f1640b, boxChildDataElement.f1640b);
    }

    @Override // t1.u0
    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f1640b.hashCode() * 31);
    }

    @Override // t1.u0
    public final n l() {
        l lVar = new l();
        lVar.f16617u = this.f1640b;
        lVar.f16618v = false;
        return lVar;
    }

    @Override // t1.u0
    public final void m(n nVar) {
        l lVar = (l) nVar;
        lVar.f16617u = this.f1640b;
        lVar.f16618v = false;
    }
}
