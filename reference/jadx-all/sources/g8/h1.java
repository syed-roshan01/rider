package g8;

import java.net.URI;

/* JADX INFO: loaded from: classes.dex */
public final class h1 extends e8.t1 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final boolean f6823x;

    static {
        boolean z10 = false;
        try {
            Class.forName("android.app.Application", false, h1.class.getClassLoader());
            z10 = true;
        } catch (Exception unused) {
        }
        f6823x = z10;
    }

    @Override // e8.t1
    public boolean P() {
        return true;
    }

    @Override // o7.d0
    public final g1 a0(URI uri, e8.q1 q1Var) {
        if (!"dns".equals(uri.getScheme())) {
            return null;
        }
        String path = uri.getPath();
        y3.e.J(path, "targetPath");
        if (!path.startsWith("/")) {
            throw new IllegalArgumentException(f6.a.c0("the path component (%s) of the target (%s) must start with '/'", path, uri));
        }
        String strSubstring = path.substring(1);
        uri.getAuthority();
        return new g1(strSubstring, q1Var, s1.f7100p, new q6.l(), f6823x);
    }

    @Override // e8.t1
    public int o0() {
        return 5;
    }
}
