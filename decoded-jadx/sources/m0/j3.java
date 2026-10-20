package m0;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class j3 implements Iterable, e9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n2 f11575a;

    public j3(n2 n2Var, s0 s0Var) {
        this.f11575a = n2Var;
        s0Var.getClass();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new i3(this.f11575a, null);
    }
}
