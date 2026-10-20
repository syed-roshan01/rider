package x9;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f16465b = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f16466c = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16467a;

    public u(String str) {
        this.f16467a = str;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof u) && d7.a.d(((u) obj).f16467a, this.f16467a);
    }

    public final int hashCode() {
        return this.f16467a.hashCode();
    }

    public final String toString() {
        return this.f16467a;
    }
}
