package m9;

/* JADX INFO: loaded from: classes.dex */
public abstract class z extends u8.a implements u8.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y f12024b = new y(0);

    public z() {
        super(u8.f.f15436a);
    }

    public abstract void c0(u8.j jVar, Runnable runnable);

    public boolean d0() {
        return !(this instanceof f2);
    }

    public z e0(int i10) {
        h6.g.d(i10);
        return new r9.i(this, i10);
    }

    @Override // u8.a, u8.j
    public final u8.h f(u8.i iVar) {
        d7.a.m(iVar, "key");
        if (!(iVar instanceof u8.b)) {
            if (u8.f.f15436a == iVar) {
                return this;
            }
            return null;
        }
        u8.b bVar = (u8.b) iVar;
        u8.i iVar2 = this.f15428a;
        d7.a.m(iVar2, "key");
        if (iVar2 != bVar && bVar.f15430b != iVar2) {
            return null;
        }
        u8.h hVar = (u8.h) bVar.f15429a.invoke(this);
        if (hVar instanceof u8.h) {
            return hVar;
        }
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + e0.z(this);
    }

    @Override // u8.a, u8.j
    public final u8.j u(u8.i iVar) {
        d7.a.m(iVar, "key");
        boolean z10 = iVar instanceof u8.b;
        u8.k kVar = u8.k.f15438a;
        if (z10) {
            u8.b bVar = (u8.b) iVar;
            u8.i iVar2 = this.f15428a;
            d7.a.m(iVar2, "key");
            if ((iVar2 == bVar || bVar.f15430b == iVar2) && ((u8.h) bVar.f15429a.invoke(this)) != null) {
                return kVar;
            }
        } else if (u8.f.f15436a == iVar) {
            return kVar;
        }
        return this;
    }
}
