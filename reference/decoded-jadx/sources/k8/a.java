package k8;

import h0.i;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10628c;

    public a(i iVar) {
        int i10;
        Object obj = iVar.f7404c;
        this.f10626a = (String) iVar.f7405d;
        int i11 = iVar.f7403b;
        if (i11 == -1) {
            String str = (String) obj;
            if (str.equals("http")) {
                i10 = 80;
            } else if (str.equals("https")) {
                i10 = 443;
            } else {
                i11 = -1;
            }
            i11 = i10;
        }
        this.f10627b = i11;
        this.f10628c = iVar.toString();
    }

    public static int a(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        if (c10 >= 'a' && c10 <= 'f') {
            return c10 - 'W';
        }
        if (c10 < 'A' || c10 > 'F') {
            return -1;
        }
        return c10 - '7';
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && ((a) obj).f10628c.equals(this.f10628c);
    }

    public final int hashCode() {
        return this.f10628c.hashCode();
    }

    public final String toString() {
        return this.f10628c;
    }
}
