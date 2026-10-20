package w8;

import d9.v;
import d9.w;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends c implements d9.g {
    private final int arity;

    public i(int i10, u8.e eVar) {
        super(eVar);
        this.arity = i10;
    }

    @Override // d9.g
    public int getArity() {
        return this.arity;
    }

    @Override // w8.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        v.f4953a.getClass();
        String strA = w.a(this);
        d7.a.l(strA, "renderLambdaToString(...)");
        return strA;
    }
}
