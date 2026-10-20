package q6;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class p implements m, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13220a;

    public p(Object obj) {
        this.f13220a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return y3.e.f0(this.f13220a, ((p) obj).f13220a);
        }
        return false;
    }

    @Override // q6.m
    public final Object get() {
        return this.f13220a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13220a});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f13220a + ")";
    }
}
