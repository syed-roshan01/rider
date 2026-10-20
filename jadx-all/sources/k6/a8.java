package k6;

import a.C0000;
import a2.C0005;
import aa.C0011;
import androidx.compose.foundation.layout.C0023;
import c0.C0057;
import com.google.android.datatransport.cct.C0078;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.android.gms.internal.stats.C0101;
import com.google.android.gms.internal.tasks.C0102;
import com.google.android.play.core.integrity.client.C0107;
import com.google.android.play.core.integrity.client.C0108;
import com.google.firebase.analytics.connector.C0116;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.analytics.ktx.ktxtesting.C0120;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.measurement.C0183;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0187;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0197;
import d1.C0212;
import dagger.hilt.internal.aggregatedroot.C0247;
import dagger.hilt.internal.componenttreedeps.C0249;
import f0.C0272;
import g3.C0289;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k1.C0333;
import l9.C0348;
import m7.C0358;
import o1.C0368;
import o4.C0370;
import r7.C0404;
import s6.C0414;
import s8.C0418;
import u8.C0439;
import v5.C0446;
import v6.C0447;
import z3.C0488;
import z7.C0491;

/* JADX INFO: loaded from: classes.dex */
public final class a8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzfi.zzl f9897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BitSet f9898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BitSet f9899e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f9900f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q.f f9901g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z7 f9902h;

    public a8(z7 z7Var, String str) {
        this.f9902h = z7Var;
        this.f9895a = str;
        this.f9896b = true;
        this.f9898d = new BitSet();
        this.f9899e = new BitSet();
        this.f9900f = new q.f(0);
        this.f9901g = new q.f(0);
        int iM7254 = C0370.m7254();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7254 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.valueOf(C0333.m6465("g0Okay")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0027. Please report as an issue. */
    public a8(z7 z7Var, String str, zzfi.zzl zzlVar, BitSet bitSet, BitSet bitSet2, q.f fVar, q.f fVar2) {
        this.f9902h = z7Var;
        this.f9895a = str;
        this.f9898d = bitSet;
        this.f9899e = bitSet2;
        this.f9900f = fVar;
        this.f9901g = new q.f(0);
        Iterator itM2319 = C0120.m2319((q.c) C0005.m108(fVar2));
        while (true) {
            boolean zM3327 = C0174.m3327(itM2319);
            int i10 = 1616;
            while (true) {
                i10 ^= 1633;
                switch (i10) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i10 = zM3327 ? 1709 : 1678;
                        break;
                    case 204:
                        break;
                    case 239:
                        break;
                    default:
                        break;
                }
                this.f9896b = false;
                this.f9897c = zzlVar;
                int iM8696 = C0447.m8696();
                int i11 = 1864;
                while (true) {
                    i11 ^= 1881;
                    switch (i11) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            if (iM8696 <= 0) {
                                i11 = 48736;
                            }
                            break;
                        case 47384:
                            return;
                        case 47417:
                            System.out.println(Float.valueOf(C0247.m4727("HzHlcvdqGeUkt")));
                            return;
                        case 47483:
                            break;
                        default:
                            continue;
                    }
                    i11 = 48705;
                }
            }
            Integer num = (Integer) C0414.m8115(itM2319);
            ArrayList arrayList = new ArrayList();
            C0358.m6998(arrayList, (Long) C0183.m3495(fVar2, num));
            C0289.m5548(C0174.m3318(this), num, arrayList);
            int i12 = 1740;
            while (true) {
                i12 ^= 1757;
                switch (i12) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i12 = 1771;
                        break;
                    case 54:
                        break;
                }
            }
        }
    }

    public final void a(d dVar) {
        int iM1998 = C0102.m1998(dVar);
        Boolean boolM7208 = C0368.m7208(dVar);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = boolM7208 != null ? 1709 : 1678;
                    break;
                case 204:
                    C0249.m4760(C0404.m7924(this), iM1998, C0000.m14(boolM7208));
                    break;
                case 239:
                    break;
                default:
                    break;
            }
        }
        Boolean boolM8691 = C0446.m8691(dVar);
        int i11 = 1740;
        while (true) {
            i11 ^= 1757;
            switch (i11) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i11 = boolM8691 != null ? 1833 : 1802;
                    break;
                case 54:
                    break;
                case 471:
                    break;
                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                    C0249.m4760(C0101.m1973(this), iM1998, C0000.m14(boolM8691));
                    break;
                default:
                    break;
            }
        }
        Long lM3770 = C0197.m3770(dVar);
        int i12 = 1864;
        while (true) {
            i12 ^= 1881;
            switch (i12) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i12 = lM3770 != null ? 48736 : 48705;
                    break;
                case 47384:
                    break;
                case 47417:
                    Integer numM1083 = C0057.m1083(iM1998);
                    Map mapM5219 = C0272.m5219(this);
                    Long l10 = (Long) C0488.m9501(mapM5219, numM1083);
                    long jM9543 = C0491.m9543(C0197.m3770(dVar)) / 1000;
                    int i13 = 48767;
                    while (true) {
                        i13 ^= 48784;
                        switch (i13) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                C0212.m4035(mapM5219, C0057.m1083(iM1998), C0439.m8554(jM9543));
                                break;
                            case 76:
                                long jM9544 = C0491.m9543(l10);
                                int i14 = 48891;
                                while (true) {
                                    i14 ^= 48908;
                                    switch (i14) {
                                        case 22:
                                            break;
                                        case 53:
                                            break;
                                        case 503:
                                            i14 = jM9543 > jM9544 ? 49635 : 48953;
                                            break;
                                        case 32495:
                                            C0212.m4035(mapM5219, C0057.m1083(iM1998), C0439.m8554(jM9543));
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            case 239:
                                i13 = l10 != null ? 48860 : 48829;
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 47483:
                    break;
                default:
                    break;
            }
        }
        Long lM2244 = C0116.m2244(dVar);
        int i15 = 49666;
        while (true) {
            i15 ^= 49683;
            switch (i15) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (lM2244 != null) {
                        i15 = 49759;
                    }
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 76:
                    q.f fVarM3318 = C0174.m3318(this);
                    Object arrayList = (List) C0183.m3495(fVarM3318, C0057.m1083(iM1998));
                    int i16 = 49790;
                    while (true) {
                        i16 ^= 49807;
                        switch (i16) {
                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 51:
                                break;
                            case 84:
                                arrayList = new ArrayList();
                                C0289.m5548(fVarM3318, C0057.m1083(iM1998), arrayList);
                                break;
                            case 241:
                                if (arrayList == null) {
                                    i16 = 49883;
                                }
                                break;
                            default:
                                continue;
                        }
                        i16 = 49852;
                    }
                    boolean zM2073 = C0107.m2073(dVar);
                    int i17 = 49914;
                    while (true) {
                        i17 ^= 49931;
                        switch (i17) {
                            case 497:
                                i17 = zM2073 ? 50658 : 50627;
                                break;
                            case 1711:
                                break;
                            case 1736:
                                break;
                            case 1769:
                                C0023.m462(arrayList);
                                break;
                            default:
                                break;
                        }
                    }
                    boolean zM2968 = C0154.m2968();
                    String strM8202 = C0418.m8202(this);
                    z7 z7VarM212 = C0011.m212(this);
                    int i18 = 50689;
                    while (true) {
                        i18 ^= 50706;
                        switch (i18) {
                            case 19:
                                i18 = zM2968 ? 50782 : 50751;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                boolean zM3575 = C0187.m3575(C0091.m1951(z7VarM212), strM8202, C0114.m2206());
                                int i19 = 50813;
                                while (true) {
                                    i19 ^= 50830;
                                    switch (i19) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 53:
                                            break;
                                        case 243:
                                            i19 = zM3575 ? 51557 : 50875;
                                            break;
                                        case 4075:
                                            boolean zM1681 = C0078.m1681(dVar);
                                            int i20 = 51588;
                                            while (true) {
                                                i20 ^= 51605;
                                                switch (i20) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i20 = zM1681 ? 51681 : 51650;
                                                        break;
                                                    case 54:
                                                        break;
                                                    case 87:
                                                        break;
                                                    case 116:
                                                        C0023.m462(arrayList);
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    boolean zM2969 = C0154.m2968();
                    int i21 = 51712;
                    while (true) {
                        i21 ^= 51729;
                        switch (i21) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i21 = zM2969 ? 51805 : 51774;
                                break;
                            case 47:
                                break;
                            case 76:
                                boolean zM3576 = C0187.m3575(C0091.m1951(z7VarM212), strM8202, C0114.m2206());
                                int i22 = 51836;
                                while (true) {
                                    i22 ^= 51853;
                                    switch (i22) {
                                        case 241:
                                            i22 = zM3576 ? 52580 : 52549;
                                            break;
                                        case 1963:
                                            break;
                                        case 1992:
                                            break;
                                        case 2025:
                                            long jM9545 = C0491.m9543(C0116.m2244(dVar)) / 1000;
                                            boolean zM2099 = C0108.m2099(arrayList, C0439.m8554(jM9545));
                                            int i23 = 52611;
                                            while (true) {
                                                i23 ^= 52628;
                                                switch (i23) {
                                                    case 23:
                                                        if (!zM2099) {
                                                            i23 = 52704;
                                                        }
                                                        break;
                                                    case 54:
                                                        break;
                                                    case 85:
                                                        break;
                                                    case 116:
                                                        C0348.m6795(arrayList, C0439.m8554(jM9545));
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i23 = 52673;
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                        return;
                    }
                    C0348.m6795(arrayList, C0439.m8554(C0491.m9543(C0116.m2244(dVar)) / 1000));
                    return;
                case 83:
                    return;
                default:
                    continue;
            }
            i15 = 49728;
        }
    }
}
