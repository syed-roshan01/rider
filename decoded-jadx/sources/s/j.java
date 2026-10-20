package s;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class j implements m0.n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13797a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13800d;

    public j(v0.i iVar, v0.j jVar, Object obj) {
        this.f13799c = iVar;
        this.f13800d = jVar;
        this.f13798b = obj;
    }

    @Override // m0.n0
    public final void a() {
        int i10 = this.f13797a;
        Object obj = this.f13798b;
        Object obj2 = this.f13800d;
        Object obj3 = this.f13799c;
        switch (i10) {
            case 0:
                ((w0.u) obj3).remove(obj);
                ((w) obj2).f13883d.remove(obj);
                break;
            default:
                v0.i iVar = (v0.i) obj3;
                v0.j jVar = (v0.j) obj2;
                Map map = jVar.f15866a;
                if (iVar.f15863b) {
                    Map mapB = iVar.f15864c.b();
                    boolean zIsEmpty = mapB.isEmpty();
                    Object obj4 = iVar.f15862a;
                    if (zIsEmpty) {
                        map.remove(obj4);
                    } else {
                        map.put(obj4, mapB);
                    }
                }
                jVar.f15867b.remove(obj);
                break;
        }
    }

    public j(w0.u uVar, Object obj, w wVar) {
        this.f13799c = uVar;
        this.f13798b = obj;
        this.f13800d = wVar;
    }
}
