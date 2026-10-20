package x1;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources.Theme f16288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16289b;

    public b(int i10, Resources.Theme theme) {
        this.f16288a = theme;
        this.f16289b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return d7.a.d(this.f16288a, bVar.f16288a) && this.f16289b == bVar.f16289b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16289b) + (this.f16288a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Key(theme=");
        sb.append(this.f16288a);
        sb.append(", id=");
        return a7.a.o(sb, this.f16289b, ')');
    }
}
