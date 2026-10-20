package e8;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class l1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f5302c = Logger.getLogger(l1.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x9.v f5303d = new x9.v(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final s6.c f5304e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f5305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5306b;

    static {
        s6.c cVar = s6.e.f14057c;
        Character ch = cVar.f14059b;
        s6.c cVarG = cVar;
        if (ch != null) {
            cVarG = cVar.g(cVar.f14058a);
        }
        f5304e = cVarG;
    }

    public final void a(i1 i1Var) {
        if (this.f5306b == 0) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = this.f5306b;
            if (i10 >= i12) {
                Arrays.fill(this.f5305a, i11 * 2, i12 * 2, (Object) null);
                this.f5306b = i11;
                return;
            }
            if (!Arrays.equals(i1Var.f5285b, e(i10))) {
                byte[] bArrE = e(i10);
                Object[] objArr = this.f5305a;
                int i13 = i11 * 2;
                objArr[i13] = bArrE;
                Object obj = objArr[(i10 * 2) + 1];
                if (objArr instanceof byte[][]) {
                    b(objArr != null ? objArr.length : 0);
                }
                this.f5305a[i13 + 1] = obj;
                i11++;
            }
            i10++;
        }
    }

    public final void b(int i10) {
        Object[] objArr = new Object[i10];
        int i11 = this.f5306b;
        if (i11 != 0) {
            System.arraycopy(this.f5305a, 0, objArr, 0, i11 * 2);
        }
        this.f5305a = objArr;
    }

    public final Object c(i1 i1Var) {
        int i10 = this.f5306b;
        do {
            i10--;
            if (i10 < 0) {
                return null;
            }
        } while (!Arrays.equals(i1Var.f5285b, e(i10)));
        Object obj = this.f5305a[(i10 * 2) + 1];
        if (obj instanceof byte[]) {
            return i1Var.a((byte[]) obj);
        }
        a7.a.w(obj);
        throw null;
    }

    public final void d(l1 l1Var) {
        int i10 = l1Var.f5306b;
        if (i10 == 0) {
            return;
        }
        Object[] objArr = this.f5305a;
        int length = objArr != null ? objArr.length : 0;
        int i11 = this.f5306b;
        int i12 = length - (i11 * 2);
        if (i11 == 0 || i12 < i10 * 2) {
            b((i10 * 2) + (i11 * 2));
        }
        System.arraycopy(l1Var.f5305a, 0, this.f5305a, this.f5306b * 2, l1Var.f5306b * 2);
        this.f5306b += l1Var.f5306b;
    }

    public final byte[] e(int i10) {
        return (byte[]) this.f5305a[i10 * 2];
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    public final void f(i1 i1Var, Serializable serializable) {
        y3.e.J(i1Var, "key");
        y3.e.J(serializable, FirebaseAnalytics.Param.VALUE);
        int i10 = this.f5306b;
        int i11 = i10 * 2;
        if (i11 == 0) {
            b(Math.max(i10 * 4, 8));
        } else {
            Object[] objArr = this.f5305a;
            if (i11 == (objArr != null ? objArr.length : 0)) {
                b(Math.max(i10 * 4, 8));
            }
        }
        int i12 = this.f5306b;
        this.f5305a[i12 * 2] = i1Var.f5285b;
        this.f5305a[(i12 * 2) + 1] = i1Var.b(serializable);
        this.f5306b++;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i10 = 0; i10 < this.f5306b; i10++) {
            if (i10 != 0) {
                sb.append(',');
            }
            byte[] bArrE = e(i10);
            Charset charset = q6.d.f13203a;
            String str = new String(bArrE, charset);
            sb.append(str);
            sb.append('=');
            if (str.endsWith("-bin")) {
                Object obj = this.f5305a[(i10 * 2) + 1];
                if (!(obj instanceof byte[])) {
                    a7.a.w(obj);
                    throw null;
                }
                sb.append(f5304e.c((byte[]) obj));
            } else {
                Object obj2 = this.f5305a[(i10 * 2) + 1];
                if (!(obj2 instanceof byte[])) {
                    a7.a.w(obj2);
                    throw null;
                }
                sb.append(new String((byte[]) obj2, charset));
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
