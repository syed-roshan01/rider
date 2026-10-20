package g8;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f6912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e8.c f6913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f6914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e8.k0 f6915d;

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.f6912a.equals(l0Var.f6912a) && this.f6913b.equals(l0Var.f6913b) && y3.e.f0(this.f6914c, l0Var.f6914c) && y3.e.f0(this.f6915d, l0Var.f6915d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6912a, this.f6913b, this.f6914c, this.f6915d});
    }
}
