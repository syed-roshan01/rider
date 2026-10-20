package s1;

import d7.t;
import m0.n1;
import m0.o3;

/* JADX INFO: loaded from: classes.dex */
public final class j extends f6.a {
    public final n1 A = t.g0(null, o3.f11621a);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final c f13914z;

    public j(c cVar) {
        this.f13914z = cVar;
    }

    @Override // f6.a
    public final boolean B(c cVar) {
        return cVar == this.f13914z;
    }

    @Override // f6.a
    public final Object I(i iVar) {
        if (iVar != this.f13914z) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Object value = this.A.getValue();
        if (value == null) {
            return null;
        }
        return value;
    }
}
