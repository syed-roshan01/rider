package i9;

import d7.t;

/* JADX INFO: loaded from: classes.dex */
public class e implements Iterable, e9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8185c;

    public e(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f8183a = i10;
        this.f8184b = t.Z(i10, i11, i12);
        this.f8185c = i12;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final f iterator() {
        return new f(this.f8183a, this.f8184b, this.f8185c);
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            if (!isEmpty() || !((e) obj).isEmpty()) {
                e eVar = (e) obj;
                if (this.f8183a != eVar.f8183a || this.f8184b != eVar.f8184b || this.f8185c != eVar.f8185c) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f8183a * 31) + this.f8184b) * 31) + this.f8185c;
    }

    public boolean isEmpty() {
        int i10 = this.f8185c;
        int i11 = this.f8184b;
        int i12 = this.f8183a;
        if (i10 > 0) {
            if (i12 <= i11) {
                return false;
            }
        } else if (i12 >= i11) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb;
        int i10 = this.f8184b;
        int i11 = this.f8183a;
        int i12 = this.f8185c;
        if (i12 > 0) {
            sb = new StringBuilder();
            sb.append(i11);
            sb.append("..");
            sb.append(i10);
            sb.append(" step ");
            sb.append(i12);
        } else {
            sb = new StringBuilder();
            sb.append(i11);
            sb.append(" downTo ");
            sb.append(i10);
            sb.append(" step ");
            sb.append(-i12);
        }
        return sb.toString();
    }
}
