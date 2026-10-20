package g8;

import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class v1 extends a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final e8.j1 f7170v = e8.r0.a(":status", new x9.v(1));

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public e8.c2 f7171r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public e8.l1 f7172s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Charset f7173t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f7174u;

    public static Charset j(e8.l1 l1Var) {
        String str = (String) l1Var.c(s1.f7093i);
        if (str != null) {
            String[] strArrSplit = str.split("charset=", 2);
            try {
                return Charset.forName(strArrSplit[strArrSplit.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return q6.d.f13204b;
    }

    public static e8.c2 k(e8.l1 l1Var) {
        char cCharAt;
        Integer num = (Integer) l1Var.c(f7170v);
        if (num == null) {
            return e8.c2.f5223l.g("Missing HTTP status code");
        }
        String str = (String) l1Var.c(s1.f7093i);
        if (str != null && 16 <= str.length()) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (lowerCase.startsWith("application/grpc") && (lowerCase.length() == 16 || (cCharAt = lowerCase.charAt(16)) == '+' || cCharAt == ';')) {
                return null;
            }
        }
        return s1.g(num.intValue()).a("invalid content-type: " + str);
    }
}
