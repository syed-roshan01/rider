package m2;

import l.q;

/* JADX INFO: loaded from: classes.dex */
public final class m implements n2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f11818a;

    public m(float f10) {
        this.f11818a = f10;
    }

    @Override // n2.a
    public final float a(float f10) {
        return f10 / this.f11818a;
    }

    @Override // n2.a
    public final float b(float f10) {
        return f10 * this.f11818a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Float.compare(this.f11818a, ((m) obj).f11818a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f11818a);
    }

    public final String toString() {
        return q.l(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f11818a, ')');
    }
}
