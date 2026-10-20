package m0;

/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f11715b;

    public v0(Integer num, Object obj) {
        this.f11714a = num;
        this.f11715b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return d7.a.d(this.f11714a, v0Var.f11714a) && d7.a.d(this.f11715b, v0Var.f11715b);
    }

    public final int hashCode() {
        int iHashCode;
        Object obj = this.f11714a;
        int iHashCode2 = 0;
        if (obj instanceof Enum) {
            iHashCode = ((Enum) obj).ordinal();
        } else {
            iHashCode = obj != null ? obj.hashCode() : 0;
        }
        int i10 = iHashCode * 31;
        Object obj2 = this.f11715b;
        if (obj2 instanceof Enum) {
            iHashCode2 = ((Enum) obj2).ordinal();
        } else if (obj2 != null) {
            iHashCode2 = obj2.hashCode();
        }
        return iHashCode2 + i10;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f11714a + ", right=" + this.f11715b + ')';
    }
}
