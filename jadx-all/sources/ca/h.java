package ca;

import x9.x;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f3073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3075c;

    public h(x xVar, int i10, String str) {
        this.f3073a = xVar;
        this.f3074b = i10;
        this.f3075c = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f3073a == x.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.f3074b);
        sb.append(' ');
        sb.append(this.f3075c);
        String string = sb.toString();
        d7.a.l(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
