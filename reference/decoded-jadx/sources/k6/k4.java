package k6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.graphics.drawable.C0016;
import b.C0049;
import c3.C0063;
import com.auto.accept.service.C0072;
import com.google.firebase.C0205;
import com.google.firebase.appcheck.interop.C0129;
import com.google.firebase.components.C0135;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.internal.api.C0178;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.ktx.C0199;
import d5.C0218;
import dagger.hilt.android.migration.C0238;
import e1.C0259;
import ea.C0268;
import fa.C0281;
import g7.C0292;
import h4.C0304;
import h8.C0313;
import i6.C0319;
import j5.C0327;
import ja.C0330;
import k.C0331;
import l0.C0340;
import l3.C0342;
import m5.C0354;
import n.C0361;
import o5.C0370;
import q1.C0383;
import r6.C0401;
import t1.C0419;
import t7.C0425;
import v0.C0440;
import v0.C0443;
import w0.C0454;
import w1.C0455;
import z3.C0485;

/* JADX INFO: loaded from: classes.dex */
public final class k4 extends BroadcastReceiver {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f557short = {2318, 2357, 2345, 2366, 2364, 2354, 2344, 2351, 2366, 2345, 2354, 2357, 2364, 2427, 2360, 2356, 2357, 2357, 2366, 2360, 2351, 2354, 2349, 2354, 2351, 2338, 2427, 2360, 2355, 2362, 2357, 2364, 2366, 2427, 2345, 2366, 2360, 2366, 2354, 2349, 2366, 2345, 1567, 1592, 1584, 1589, 1596, 1597, 1657, 1581, 1590, 1657, 1580, 1591, 1579, 1596, 1598, 1584, 1578, 1581, 1596, 1579, 1657, 1581, 1585, 1596, 1657, 1591, 1596, 1581, 1582, 1590, 1579, 1586, 1657, 1595, 1579, 1590, 1592, 1597, 1594, 1592, 1578, 1581, 1657, 1579, 1596, 1594, 1596, 1584, 1583, 1596, 1579, 2300, 2263, 2246, 2245, 2269, 2240, 2265, 2288, 2240, 2269, 2259, 2262, 2257, 2259, 2241, 2246, 2272, 2263, 2257, 2263, 2267, 2244, 2263, 2240, 2194, 2240, 2263, 2257, 2263, 2267, 2244, 2263, 2262, 2194, 2259, 2257, 2246, 2267, 2269, 2268, 1409, 1422, 1412, 1426, 1423, 1417, 1412, 1486, 1422, 1413, 1428, 1486, 1411, 1423, 1422, 1422, 1486, 1443, 1455, 1454, 1454, 1445, 1443, 1460, 1449, 1462, 1449, 1460, 1465, 1471, 1443, 1448, 1441, 1454, 1447, 1445, 968, 995, 1010, 1009, 1001, 1012, 1005, 964, 1012, 1001, 999, 994, 997, 999, 1013, 1010, 980, 995, 997, 995, 1007, 1008, 995, 1012, 934, 1012, 995, 997, 995, 1007, 1008, 995, 994, 934, 1011, 1000, 1005, 1000, 1001, 1009, 1000, 934, 999, 997, 1010, 1007, 1001, 1000};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p7 f10151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10153c;

    public k4(p7 p7Var) {
        this.f10151a = p7Var;
        int iM5634 = C0292.m5634();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5634 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.decode(C0238.m4586("wotQmQSEBdzmip9tdmBaWlOrAk")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۨۧ۠, reason: not valid java name and contains not printable characters */
    public static short[] m6569() {
        int iM7269 = C0370.m7269();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7269 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f557short;
                case 239:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public final void a() {
        p7 p7VarM3397 = C0178.m3397(this);
        C0331.m6405(p7VarM3397);
        C0063.m1219(C0485.m9461(p7VarM3397));
        C0063.m1219(C0485.m9461(p7VarM3397));
        boolean zM1561 = C0072.m1561(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (!zM1561) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    int iM2492 = C0129.m2492();
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (iM2492 <= 0) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                return;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                System.out.println(Long.valueOf(C0259.m4946("8WWYZEK8ReJCqj")));
                                return;
                            default:
                                continue;
                        }
                        i11 = 1802;
                    }
                    break;
                case 239:
                    d4 d4VarM6333 = C0327.m6333(p7VarM3397);
                    C0135.m2604(C0136.m2634(d4VarM6333), C0340.m6675(m6569(), 0, C0354.f625 ^ 259, 2395));
                    this.f10152b = false;
                    this.f10153c = false;
                    try {
                        C0205.m3924(C0319.m6184(C0313.m6073(p7VarM3397)), this);
                        return;
                    } catch (IllegalArgumentException e4) {
                        d4 d4VarM6334 = C0327.m6333(p7VarM3397);
                        C0419.m8245(C0454.m8871(d4VarM6334), C0304.m5865(m6569(), 42, C0268.f348 ^ 717, 1625), e4);
                        return;
                    }
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        p7 p7VarM3397 = C0178.m3397(this);
        C0331.m6405(p7VarM3397);
        String strM4226 = C0218.m4226(intent);
        d4 d4VarM6333 = C0327.m6333(p7VarM3397);
        C0419.m8245(C0136.m2634(d4VarM6333), C0049.m957(m6569(), 93, C0455.f726 ^ 536, 2226), strM4226);
        boolean zM321 = C0016.m321(C0383.m7518(m6569(), 133, C0281.f426 ^ 781, 1504), strM4226);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (zM321) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    j4 j4VarM8649 = C0443.m8649(p7VarM3397);
                    C0173.m3298(j4VarM8649);
                    boolean zM3815 = C0199.m3815(j4VarM8649);
                    boolean zM8594 = C0440.m8594(this);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (zM8594 != zM3815) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                return;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                this.f10153c = zM3815;
                                C0342.m6719(C0485.m9461(p7VarM3397), new m4(0, this, zM3815));
                                return;
                            default:
                                continue;
                        }
                        i11 = 1802;
                    }
                    break;
                case 239:
                    d4 d4VarM6334 = C0327.m6333(p7VarM3397);
                    C0419.m8245(C0330.m6385(d4VarM6334), C0401.m7861(m6569(), 169, C0425.f696 ^ (-353), 902), strM4226);
                    int iM2492 = C0129.m2492();
                    int i12 = 1864;
                    while (true) {
                        i12 ^= 1881;
                        switch (i12) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (iM2492 <= 0) {
                                    i12 = 48736;
                                }
                                break;
                            case 47384:
                                return;
                            case 47417:
                                System.out.println(Float.parseFloat(C0361.m7078("JDrcBKEMHzhQPYeXLJsLIqd")));
                                return;
                            case 47483:
                                break;
                            default:
                                continue;
                        }
                        i12 = 48705;
                    }
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }
}
