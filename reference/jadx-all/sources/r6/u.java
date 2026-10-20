package r6;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class u extends c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient s f13584a;

    public u(f0 f0Var, Comparator comparator) {
        this.f13584a = f0Var;
        if (comparator != null) {
            v.r(comparator);
        } else {
            int i10 = t.f13582c;
            Object[] objArr = g0.f13544p;
        }
    }

    @Override // r6.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public s a() {
        return this.f13584a;
    }
}
