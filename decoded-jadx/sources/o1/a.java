package o1;

/* JADX INFO: loaded from: classes.dex */
public final class a implements q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12345b;

    public a(int i10) {
        this.f12345b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!d7.a.d(a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        d7.a.k(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.f12345b == ((a) obj).f12345b;
    }

    public final int hashCode() {
        return this.f12345b;
    }

    public final String toString() {
        return a7.a.o(new StringBuilder("AndroidPointerIcon(type="), this.f12345b, ')');
    }
}
