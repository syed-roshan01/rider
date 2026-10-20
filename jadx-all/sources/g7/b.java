package g7;

import java.util.Objects;
import v6.g;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f6626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6629d;

    public b(g gVar, int i10, String str, String str2) {
        this.f6626a = gVar;
        this.f6627b = i10;
        this.f6628c = str;
        this.f6629d = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f6626a == bVar.f6626a && this.f6627b == bVar.f6627b && this.f6628c.equals(bVar.f6628c) && this.f6629d.equals(bVar.f6629d);
    }

    public final int hashCode() {
        return Objects.hash(this.f6626a, Integer.valueOf(this.f6627b), this.f6628c, this.f6629d);
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.f6626a, Integer.valueOf(this.f6627b), this.f6628c, this.f6629d);
    }
}
