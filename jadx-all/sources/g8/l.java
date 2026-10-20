package g8;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class l implements z5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e8.b f6910a = new e8.b("io.grpc.internal.GrpcAttributes.securityLevel");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e8.b f6911b = new e8.b("io.grpc.internal.GrpcAttributes.clientEagAttrs");

    public static s2 r() {
        return q4.f7064e == null ? new q4() : new o(0);
    }

    public static Set t(String str, Map map) {
        e8.z1 z1VarValueOf;
        List listC = m2.c(str, map);
        if (listC == null) {
            return null;
        }
        EnumSet enumSetNoneOf = EnumSet.noneOf(e8.z1.class);
        for (Object obj : listC) {
            if (obj instanceof Double) {
                Double d10 = (Double) obj;
                int iIntValue = d10.intValue();
                y3.e.J0(obj, "Status code %s is not integral", ((double) iIntValue) == d10.doubleValue());
                z1VarValueOf = e8.c2.c(iIntValue).f5227a;
                y3.e.J0(obj, "Status code %s is not valid", z1VarValueOf.f5425a == d10.intValue());
            } else {
                if (!(obj instanceof String)) {
                    throw new androidx.fragment.app.a0("Can not convert status code " + obj + " to Status.Code, because its type is " + obj.getClass());
                }
                try {
                    z1VarValueOf = e8.z1.valueOf((String) obj);
                } catch (IllegalArgumentException e4) {
                    throw new androidx.fragment.app.a0("Status code " + obj + " is not valid", e4);
                }
            }
            enumSetNoneOf.add(z1VarValueOf);
        }
        return Collections.unmodifiableSet(enumSetNoneOf);
    }

    public static List u(Map map) {
        String strH;
        ArrayList arrayList = new ArrayList();
        if (map.containsKey("loadBalancingConfig")) {
            List listC = m2.c("loadBalancingConfig", map);
            if (listC == null) {
                listC = null;
            } else {
                m2.a(listC);
            }
            arrayList.addAll(listC);
        }
        if (arrayList.isEmpty() && (strH = m2.h("loadBalancingPolicy", map)) != null) {
            arrayList.add(Collections.singletonMap(strH.toLowerCase(Locale.ROOT), Collections.emptyMap()));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static e8.r1 x(List list, e8.b1 b1Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            s5 s5Var = (s5) it.next();
            String str = s5Var.f7116a;
            e8.a1 a1VarB = b1Var.b(str);
            if (a1VarB != null) {
                if (!arrayList.isEmpty()) {
                    Logger.getLogger(l.class.getName()).log(Level.FINEST, "{0} specified by Service Config are not available", arrayList);
                }
                e8.r1 r1VarI = a1VarB.i(s5Var.f7117b);
                return r1VarI.f5357a != null ? r1VarI : new e8.r1(new t5(a1VarB, r1VarI.f5358b));
            }
            arrayList.add(str);
        }
        return new e8.r1(e8.c2.f5218g.g("None of " + arrayList + " specified by Service Config are available."));
    }

    public static List z(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            if (map.size() != 1) {
                throw new RuntimeException("There are " + map.size() + " fields in a LoadBalancingConfig object. Exactly one is expected. Config=" + map);
            }
            String str = (String) ((Map.Entry) map.entrySet().iterator().next()).getKey();
            arrayList.add(new s5(str, m2.g(str, map)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // g8.z5
    public void a(int i10) {
        h8.k kVarY = y();
        kVarY.getClass();
        o8.b.c();
        kVarY.o(new e(kVarY, i10));
    }

    @Override // g8.z5
    public void c(boolean z10) {
        s().c(z10);
    }

    @Override // g8.z5
    public void d(e8.s sVar) {
        p1 p1VarS = s();
        y3.e.J(sVar, "compressor");
        p1VarS.d(sVar);
    }

    @Override // g8.z5
    public void flush() {
        if (s().f()) {
            return;
        }
        s().flush();
    }

    @Override // g8.z5
    public boolean k() {
        return y().e();
    }

    @Override // g8.z5
    public void l(InputStream inputStream) {
        y3.e.J(inputStream, "message");
        try {
            if (!s().f()) {
                s().g(inputStream);
            }
        } finally {
            s1.b(inputStream);
        }
    }

    @Override // g8.z5
    public void n() {
        h8.k kVarY = y();
        x3 x3Var = kVarY.f6752d;
        x3Var.f7218a = kVarY;
        kVarY.f6749a = x3Var;
    }

    public abstract p1 s();

    public abstract boolean v(r5 r5Var);

    public abstract void w(r5 r5Var);

    public abstract h8.k y();
}
