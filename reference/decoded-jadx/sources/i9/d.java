package i9;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f8181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f8182b;

    public d(float f10, float f11) {
        this.f8181a = f10;
        this.f8182b = f11;
    }

    public static boolean b(Float f10, Float f11) {
        return f10.floatValue() <= f11.floatValue();
    }

    public final boolean a() {
        return this.f8181a > this.f8182b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            if (!a() || !((d) obj).a()) {
                d dVar = (d) obj;
                if (this.f8181a != dVar.f8181a || this.f8182b != dVar.f8182b) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (a()) {
            return -1;
        }
        return (Float.hashCode(this.f8181a) * 31) + Float.hashCode(this.f8182b);
    }

    public final String toString() {
        return this.f8181a + ".." + this.f8182b;
    }
}
