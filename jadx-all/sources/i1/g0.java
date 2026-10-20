package i1;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends i0 implements Iterable, e9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f7804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f7805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f7806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f7807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f7808f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f7809n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f7810o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f7811p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f7812q;

    public g0(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, List list2) {
        this.f7803a = str;
        this.f7804b = f10;
        this.f7805c = f11;
        this.f7806d = f12;
        this.f7807e = f13;
        this.f7808f = f14;
        this.f7809n = f15;
        this.f7810o = f16;
        this.f7811p = list;
        this.f7812q = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof g0)) {
            g0 g0Var = (g0) obj;
            return d7.a.d(this.f7803a, g0Var.f7803a) && this.f7804b == g0Var.f7804b && this.f7805c == g0Var.f7805c && this.f7806d == g0Var.f7806d && this.f7807e == g0Var.f7807e && this.f7808f == g0Var.f7808f && this.f7809n == g0Var.f7809n && this.f7810o == g0Var.f7810o && d7.a.d(this.f7811p, g0Var.f7811p) && d7.a.d(this.f7812q, g0Var.f7812q);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7812q.hashCode() + ((this.f7811p.hashCode() + l.q.a(this.f7810o, l.q.a(this.f7809n, l.q.a(this.f7808f, l.q.a(this.f7807e, l.q.a(this.f7806d, l.q.a(this.f7805c, l.q.a(this.f7804b, this.f7803a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new f0(this);
    }
}
