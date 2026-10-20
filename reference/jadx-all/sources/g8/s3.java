package g8;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q3 f7103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f7104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f7105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h5 f7106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f7107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f7108f;

    public s3(q3 q3Var, HashMap map, HashMap map2, h5 h5Var, Object obj, Map map3) {
        this.f7103a = q3Var;
        this.f7104b = Collections.unmodifiableMap(new HashMap(map));
        this.f7105c = Collections.unmodifiableMap(new HashMap(map2));
        this.f7106d = h5Var;
        this.f7107e = obj;
        this.f7108f = map3 != null ? Collections.unmodifiableMap(new HashMap(map3)) : null;
    }

    public static s3 a(Map map, boolean z10, int i10, int i11, Object obj) {
        h5 h5Var;
        Map mapG;
        h5 h5Var2;
        if (z10) {
            if (map == null || (mapG = m2.g("retryThrottling", map)) == null) {
                h5Var2 = null;
            } else {
                float fFloatValue = m2.e("maxTokens", mapG).floatValue();
                float fFloatValue2 = m2.e("tokenRatio", mapG).floatValue();
                y3.e.N("maxToken should be greater than zero", fFloatValue > 0.0f);
                y3.e.N("tokenRatio should be greater than zero", fFloatValue2 > 0.0f);
                h5Var2 = new h5(fFloatValue, fFloatValue2);
            }
            h5Var = h5Var2;
        } else {
            h5Var = null;
        }
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        Map mapG2 = map == null ? null : m2.g("healthCheckConfig", map);
        List<Map> listC = m2.c("methodConfig", map);
        if (listC == null) {
            listC = null;
        } else {
            m2.a(listC);
        }
        if (listC == null) {
            return new s3(null, map2, map3, h5Var, obj, mapG2);
        }
        q3 q3Var = null;
        for (Map map4 : listC) {
            q3 q3Var2 = new q3(map4, z10, i10, i11);
            List<Map> listC2 = m2.c("name", map4);
            if (listC2 == null) {
                listC2 = null;
            } else {
                m2.a(listC2);
            }
            if (listC2 != null && !listC2.isEmpty()) {
                for (Map map5 : listC2) {
                    String strH = m2.h("service", map5);
                    String strH2 = m2.h(FirebaseAnalytics.Param.METHOD, map5);
                    if (f6.a.Y(strH)) {
                        y3.e.E(strH2, "missing service name for method %s", f6.a.Y(strH2));
                        y3.e.E(map, "Duplicate default method config in service config %s", q3Var == null);
                        q3Var = q3Var2;
                    } else if (f6.a.Y(strH2)) {
                        y3.e.E(strH, "Duplicate service %s", !map3.containsKey(strH));
                        map3.put(strH, q3Var2);
                    } else {
                        String strA = e8.p1.a(strH, strH2);
                        y3.e.E(strA, "Duplicate method name %s", !map2.containsKey(strA));
                        map2.put(strA, q3Var2);
                    }
                }
            }
        }
        return new s3(q3Var, map2, map3, h5Var, obj, mapG2);
    }

    public final r3 b() {
        if (this.f7105c.isEmpty() && this.f7104b.isEmpty() && this.f7103a == null) {
            return null;
        }
        return new r3(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s3.class != obj.getClass()) {
            return false;
        }
        s3 s3Var = (s3) obj;
        return y3.e.f0(this.f7103a, s3Var.f7103a) && y3.e.f0(this.f7104b, s3Var.f7104b) && y3.e.f0(this.f7105c, s3Var.f7105c) && y3.e.f0(this.f7106d, s3Var.f7106d) && y3.e.f0(this.f7107e, s3Var.f7107e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7103a, this.f7104b, this.f7105c, this.f7106d, this.f7107e});
    }

    public final String toString() {
        q6.g gVarJ0 = f6.a.j0(this);
        gVarJ0.a(this.f7103a, "defaultMethodConfig");
        gVarJ0.a(this.f7104b, "serviceMethodMap");
        gVarJ0.a(this.f7105c, "serviceMap");
        gVarJ0.a(this.f7106d, "retryThrottling");
        gVarJ0.a(this.f7107e, "loadBalancingConfig");
        return gVarJ0.toString();
    }
}
