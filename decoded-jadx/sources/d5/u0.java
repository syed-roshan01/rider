package d5;

import aa.C0012;
import androidx.activity.C0017;
import androidx.compose.foundation.layout.C0021;
import androidx.compose.ui.draw.C0028;
import ca.C0070;
import com.google.android.gms.internal.tasks.C0103;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.database.collection.C0138;
import com.google.firebase.firestore.bundle.C0149;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.ktx.C0158;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.platforminfo.C0193;
import com.google.firebase.remoteconfig.internal.Code;
import h0.C0299;
import i6.C0319;
import j9.C0329;
import s2.C0411;

/* JADX INFO: loaded from: classes.dex */
public final class u0 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f290short = {1419, 1417, 1412, 1412, 1480, 1436, 1415, 1480, 1487, 1434, 1421, 1435, 1437, 1413, 1421, 1487, 1480, 1418, 1421, 1422, 1415, 1434, 1421, 1480, 1487, 1409, 1414, 1438, 1415, 1411, 1421, 1487, 1480, 1439, 1409, 1436, 1408, 1480, 1419, 1415, 1434, 1415, 1437, 1436, 1409, 1414, 1421};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0.h0 f4792b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(b0.h0 h0Var, u8.e eVar) {
        super(C0158.f182 ^ 416, eVar);
        this.f4792b = h0Var;
        int iM332 = C0017.m332();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM332 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.valueOf(C0021.m422("cfoNb0Ax8A2fQGR0sE")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۢۦۥۡ, reason: not valid java name and contains not printable characters */
    public static short[] m4203() {
        int iM2662 = C0138.m2662();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2662 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f290short;
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

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        b0.h0 h0VarM2571 = null;
        String str = "\u06e3\u06e8\u06e4";
        while (true) {
            switch (C0124.m2383(str)) {
                case 56382:
                    return this;
                case 1750815:
                    h0VarM2571 = C0133.m2571(this);
                    str = "\u06df\u06e4\u06e0";
                    break;
                default:
                    this = new u0(h0VarM2571, eVar);
                    str = "\u06e2\u06e0";
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "\u06df\u06e4\u06e7";
        Object objM3697 = obj;
        m9.d0 d0Var = null;
        q8.l lVarM238 = null;
        u8.e eVar = null;
        u8.e eVarM2030 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746850:
                    str = "\u06e7\u06e2\u06e8";
                    d0Var = (m9.d0) objM3697;
                    break;
                case 1748733:
                    str = "\u06e2\u06df\u06e8";
                    this = (u0) eVarM2030;
                    break;
                case 1751716:
                    eVarM2030 = C0103.m2030(this, d0Var, eVar);
                    str = "\u06e1\u06e3\u06df";
                    break;
                case 1754381:
                    return objM3697;
                case 1754477:
                    str = "\u06e4\u06e6\u06e6";
                    eVar = (u8.e) obj2;
                    break;
                case 1754627:
                    objM3697 = C0193.m3697(this, lVarM238);
                    str = "\u06e7\u06df\u06e5";
                    break;
                default:
                    str = "\u06e7\u06e7\u06e3";
                    lVarM238 = C0012.m238();
                    break;
            }
        }
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVarM5766 = C0299.m5766();
        int iM1357 = C0070.m1357(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1357 != 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (iM1357 == 1) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                throw new IllegalStateException(C0028.m554(m4203(), 0, C0319.f467 ^ 227, 1512));
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                C0329.m6365(obj);
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i12 = 48674;
                                            break;
                                        case 47483:
                                            break;
                                    }
                                }
                                break;
                            default:
                                continue;
                        }
                        i11 = 1802;
                    }
                    break;
                case 239:
                    C0329.m6365(obj);
                    this.f4791a = 1;
                    Object objM8067 = C0411.m8067(C0133.m2571(this), C0149.f174 ^ (-141), this);
                    int i13 = 48767;
                    while (true) {
                        i13 ^= 48784;
                        switch (i13) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                break;
                            case 76:
                                return aVarM5766;
                            case 239:
                                if (objM8067 == aVarM5766) {
                                    i13 = 48860;
                                }
                                break;
                            default:
                                continue;
                        }
                        i13 = 48829;
                    }
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
        return C0012.m238();
    }
}
