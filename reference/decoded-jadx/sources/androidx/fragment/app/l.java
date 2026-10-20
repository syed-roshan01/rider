package androidx.fragment.app;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1 f1964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x2.g f1965b;

    public l(s1 s1Var, x2.g gVar) {
        this.f1964a = s1Var;
        this.f1965b = gVar;
    }

    public final void a() {
        s1 s1Var = this.f1964a;
        HashSet hashSet = s1Var.f2027e;
        if (hashSet.remove(this.f1965b) && hashSet.isEmpty()) {
            s1Var.b();
        }
    }

    public final boolean b() {
        s1 s1Var = this.f1964a;
        int iD = a7.a.d(s1Var.f2025c.mView);
        int i10 = s1Var.f2023a;
        return iD == i10 || !(iD == 2 || i10 == 2);
    }
}
