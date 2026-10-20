package w8;

import d9.v;
import d9.w;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends g implements d9.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16259a;

    public h(u8.e eVar) {
        super(eVar);
        this.f16259a = 2;
    }

    @Override // d9.g
    public final int getArity() {
        return this.f16259a;
    }

    @Override // w8.a
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        v.f4953a.getClass();
        String strA = w.a(this);
        d7.a.l(strA, "renderLambdaToString(...)");
        return strA;
    }
}
