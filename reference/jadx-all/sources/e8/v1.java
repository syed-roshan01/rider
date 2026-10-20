package e8;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class v1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f5383e = Logger.getLogger(v1.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static v1 f5384f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u1 f5385a = new u1(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f5386b = "unknown";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f5387c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r6.s f5388d = r6.f0.f13537n;

    public final synchronized void a() {
        try {
            HashMap map = new HashMap();
            String str = "unknown";
            int iO0 = Integer.MIN_VALUE;
            for (t1 t1Var : this.f5387c) {
                t1Var.getClass();
                t1 t1Var2 = (t1) map.get("dns");
                if (t1Var2 == null || t1Var2.o0() < t1Var.o0()) {
                    map.put("dns", t1Var);
                }
                if (iO0 < t1Var.o0()) {
                    iO0 = t1Var.o0();
                    str = "dns";
                }
            }
            this.f5388d = r6.s.a(map);
            this.f5386b = str;
        } catch (Throwable th) {
            throw th;
        }
    }
}
