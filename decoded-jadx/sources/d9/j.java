package d9;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class j implements g, Serializable {
    private final int arity;

    public j(int i10) {
        this.arity = i10;
    }

    @Override // d9.g
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        v.f4953a.getClass();
        String strA = w.a(this);
        d7.a.l(strA, "renderLambdaToString(...)");
        return strA;
    }
}
