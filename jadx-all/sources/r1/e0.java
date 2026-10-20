package r1;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f13356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13357b;

    public e0(f0 f0Var, Object obj) {
        this.f13356a = f0Var;
        this.f13357b = obj;
    }

    @Override // r1.f1
    public final void a() {
        f0 f0Var = this.f13356a;
        f0Var.e();
        androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) f0Var.f13368q.remove(this.f13357b);
        if (aVar != null) {
            if (f0Var.f13373v <= 0) {
                throw new IllegalStateException("No pre-composed items to dispose".toString());
            }
            androidx.compose.ui.node.a aVar2 = f0Var.f13359a;
            int iIndexOf = aVar2.o().indexOf(aVar);
            int size = aVar2.o().size();
            int i10 = f0Var.f13373v;
            if (iIndexOf < size - i10) {
                throw new IllegalStateException("Item is not in pre-composed item range".toString());
            }
            f0Var.f13372u++;
            f0Var.f13373v = i10 - 1;
            int size2 = (aVar2.o().size() - f0Var.f13373v) - f0Var.f13372u;
            aVar2.f1746r = true;
            aVar2.G(iIndexOf, size2, 1);
            aVar2.f1746r = false;
            f0Var.d(size2);
        }
    }

    @Override // r1.f1
    public final int b() {
        androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) this.f13356a.f13368q.get(this.f13357b);
        if (aVar != null) {
            return aVar.m().size();
        }
        return 0;
    }

    @Override // r1.f1
    public final void c(int i10, long j10) {
        f0 f0Var = this.f13356a;
        androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) f0Var.f13368q.get(this.f13357b);
        if (aVar == null || !aVar.C()) {
            return;
        }
        int size = aVar.m().size();
        if (i10 < 0 || i10 >= size) {
            throw new IndexOutOfBoundsException("Index (" + i10 + ") is out of bound of [0, " + size + ')');
        }
        if (!(!aVar.D())) {
            throw new IllegalArgumentException("Pre-measure called on node that is not placed".toString());
        }
        androidx.compose.ui.node.a aVar2 = f0Var.f13359a;
        aVar2.f1746r = true;
        ((u1.w) t1.g.z(aVar)).s((androidx.compose.ui.node.a) aVar.m().get(i10), j10);
        aVar2.f1746r = false;
    }
}
