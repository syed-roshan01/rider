package x1;

import i1.f;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f16286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16287b;

    public a(f fVar, int i10) {
        this.f16286a = fVar;
        this.f16287b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return d7.a.d(this.f16286a, aVar.f16286a) && this.f16287b == aVar.f16287b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16287b) + (this.f16286a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
        sb.append(this.f16286a);
        sb.append(", configFlags=");
        return a7.a.o(sb, this.f16287b, ')');
    }
}
