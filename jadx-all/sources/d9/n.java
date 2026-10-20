package d9;

import m0.l3;

/* JADX INFO: loaded from: classes.dex */
public abstract class n extends p implements j9.e {
    @Override // d9.c
    public final j9.a a() {
        v.f4953a.getClass();
        return this;
    }

    @Override // c9.a
    public final Object invoke() {
        z.n nVar = (z.n) this;
        int i10 = nVar.f17095o;
        Object obj = nVar.f4935b;
        switch (i10) {
            case 0:
                return ((l3) obj).getValue();
            case 1:
                return ((l3) obj).getValue();
            default:
                return obj.getClass().getSimpleName();
        }
    }
}
