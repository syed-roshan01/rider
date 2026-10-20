package r8;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class o implements k9.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13659b;

    public /* synthetic */ o(Object obj, int i10) {
        this.f13658a = i10;
        this.f13659b = obj;
    }

    @Override // k9.i
    public final Iterator iterator() {
        int i10 = this.f13658a;
        Object obj = this.f13659b;
        switch (i10) {
            case 0:
                return ((Iterable) obj).iterator();
            case 1:
                c9.e eVar = (c9.e) obj;
                d7.a.m(eVar, "block");
                k9.j jVar = new k9.j();
                jVar.f10648c = d7.t.M(jVar, jVar, eVar);
                return jVar;
            default:
                return (Iterator) obj;
        }
    }
}
