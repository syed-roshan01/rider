package n8;

import e8.a1;
import e8.b1;
import e8.c2;
import e8.j0;
import e8.r1;
import e8.z0;
import g8.m2;
import g8.t5;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class q extends a1 {
    public static r1 j(Map map) {
        p.a aVar;
        p.a aVar2;
        List list;
        Integer num;
        Integer num2;
        Long lI = m2.i("interval", map);
        Long lI2 = m2.i("baseEjectionTime", map);
        Long lI3 = m2.i("maxEjectionTime", map);
        Integer numF = m2.f("maxEjectionPercentage", map);
        Long l10 = lI != null ? lI : 10000000000L;
        Long l11 = lI2 != null ? lI2 : 30000000000L;
        Long l12 = lI3 != null ? lI3 : 300000000000L;
        Integer num3 = numF != null ? numF : 10;
        Map mapG = m2.g("successRateEjection", map);
        if (mapG != null) {
            Integer num4 = 100;
            Integer numF2 = m2.f("stdevFactor", mapG);
            Integer numF3 = m2.f("enforcementPercentage", mapG);
            Integer numF4 = m2.f("minimumHosts", mapG);
            Integer numF5 = m2.f("requestVolume", mapG);
            Integer num5 = numF2 != null ? numF2 : 1900;
            if (numF3 != null) {
                y3.e.H(numF3.intValue() >= 0 && numF3.intValue() <= 100);
                num = numF3;
            } else {
                num = num4;
            }
            if (numF4 != null) {
                y3.e.H(numF4.intValue() >= 0);
                num2 = numF4;
            } else {
                num2 = 5;
            }
            if (numF5 != null) {
                y3.e.H(numF5.intValue() >= 0);
                num4 = numF5;
            }
            aVar = new p.a(num5, num, num2, num4);
        } else {
            aVar = null;
        }
        Map mapG2 = m2.g("failurePercentageEjection", map);
        if (mapG2 != null) {
            Integer num6 = 85;
            Integer num7 = 100;
            Integer num8 = 5;
            Integer num9 = 50;
            Integer numF6 = m2.f("threshold", mapG2);
            Integer numF7 = m2.f("enforcementPercentage", mapG2);
            Integer numF8 = m2.f("minimumHosts", mapG2);
            Integer numF9 = m2.f("requestVolume", mapG2);
            if (numF6 != null) {
                y3.e.H(numF6.intValue() >= 0 && numF6.intValue() <= 100);
                num6 = numF6;
            }
            if (numF7 != null) {
                y3.e.H(numF7.intValue() >= 0 && numF7.intValue() <= 100);
                num7 = numF7;
            }
            if (numF8 != null) {
                y3.e.H(numF8.intValue() >= 0);
                num8 = numF8;
            }
            if (numF9 != null) {
                y3.e.H(numF9.intValue() >= 0);
                num9 = numF9;
            }
            aVar2 = new p.a(num6, num7, num8, num9);
        } else {
            aVar2 = null;
        }
        List listC = m2.c("childPolicy", map);
        if (listC == null) {
            list = null;
        } else {
            m2.a(listC);
            list = listC;
        }
        List listZ = g8.l.z(list);
        if (listZ == null || listZ.isEmpty()) {
            return new r1(c2.f5223l.g("No child policy in outlier_detection_experimental LB policy: " + map));
        }
        r1 r1VarX = g8.l.x(listZ, b1.a());
        if (r1VarX.f5357a != null) {
            return r1VarX;
        }
        t5 t5Var = (t5) r1VarX.f5358b;
        if (t5Var == null) {
            throw new IllegalStateException();
        }
        if (t5Var != null) {
            return new r1(new j(l10, l11, l12, num3, aVar, aVar2, t5Var));
        }
        throw new IllegalStateException();
    }

    @Override // e8.i
    public final z0 c(j0 j0Var) {
        return new p(j0Var);
    }

    @Override // e8.a1
    public String f() {
        return "outlier_detection_experimental";
    }

    @Override // e8.a1
    public int g() {
        return 5;
    }

    @Override // e8.a1
    public boolean h() {
        return true;
    }

    @Override // e8.a1
    public r1 i(Map map) {
        try {
            return j(map);
        } catch (RuntimeException e4) {
            return new r1(c2.f5224m.f(e4).g("Failed parsing configuration for " + f()));
        }
    }
}
