package q6;

import java.util.Arrays;
import l.z2;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z2 f13206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z2 f13207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13208d;

    public g(String str) {
        z2 z2Var = new z2();
        this.f13206b = z2Var;
        this.f13207c = z2Var;
        this.f13208d = false;
        this.f13205a = str;
    }

    public final void a(Object obj, String str) {
        z2 z2Var = new z2();
        this.f13207c.f10985d = z2Var;
        this.f13207c = z2Var;
        z2Var.f10984c = obj;
        z2Var.f10983b = str;
    }

    public final void b(String str, long j10) {
        d(String.valueOf(j10), str);
    }

    public final void c(String str, boolean z10) {
        d(String.valueOf(z10), str);
    }

    public final void d(String str, String str2) {
        f fVar = new f();
        this.f13207c.f10985d = fVar;
        this.f13207c = fVar;
        fVar.f10984c = str;
        fVar.f10983b = str2;
    }

    public final String toString() {
        boolean z10 = this.f13208d;
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f13205a);
        sb.append('{');
        String str = "";
        for (z2 z2Var = (z2) this.f13206b.f10985d; z2Var != null; z2Var = (z2) z2Var.f10985d) {
            Object obj = z2Var.f10984c;
            if ((z2Var instanceof f) || obj != null || !z10) {
                sb.append(str);
                Object obj2 = z2Var.f10983b;
                if (((String) obj2) != null) {
                    sb.append((String) obj2);
                    sb.append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    sb.append(obj);
                } else {
                    String strDeepToString = Arrays.deepToString(new Object[]{obj});
                    sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                }
                str = ", ";
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
