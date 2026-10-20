package f0;

import aa.C0012;
import androidx.compose.foundation.relocation.C0024;
import androidx.compose.ui.platform.C0038;
import com.google.android.gms.internal.stats.C0101;
import com.google.crypto.tink.shaded.protobuf.C0110;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.util.C0166;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0197;
import dagger.hilt.android.internal.modules.C0233;
import dagger.hilt.components.C0244;
import dagger.hilt.internal.aggregatedroot.codegen.C0245;
import h0.C0299;
import j3.C0325;
import j9.C0329;
import l6.C0344;
import o7.i2;
import x7.C0472;

/* JADX INFO: loaded from: classes.dex */
public final class m1 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f367short = {641, 643, 654, 654, 706, 662, 653, 706, 709, 656, 647, 657, 663, 655, 647, 709, 706, 640, 647, 644, 653, 656, 647, 706, 709, 651, 652, 660, 653, 649, 647, 709, 706, 661, 651, 662, 650, 706, 641, 653, 656, 653, 663, 662, 651, 652, 647};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t.d f5817b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(t.d dVar, u8.e eVar) {
        super(C0166.f190 ^ (-571), eVar);
        this.f5817b = dVar;
        int iM1975 = C0101.m1975();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1975 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.parseDouble(C0325.m6285("D48kyScWep")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۧ۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static short[] m5196() {
        int iM9193 = C0472.m9193();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM9193 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f367short;
                case 239:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
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
        t.d dVarM742 = null;
        String str = "\u06e3\u06e2\u06e0";
        while (true) {
            switch (C0124.m2383(str)) {
                case 56297:
                    return this;
                case 1750625:
                    dVarM742 = C0038.m742(this);
                    str = "\u06e2\u06e4\u06e0";
                    break;
                default:
                    this = new m1(dVarM742, eVar);
                    str = "\u06df\u06e8";
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "\u06e4\u06e3\u06e7";
        u8.e eVar = null;
        q8.l lVarM238 = null;
        m9.d0 d0Var = null;
        Object objM4699 = obj;
        u8.e eVarM471 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1748706:
                    str = "\u06e3\u06e1\u06e8";
                    this = (m1) eVarM471;
                    break;
                case 1750783:
                    objM4699 = C0245.m4699(this, lVarM238);
                    str = "\u06e7\u06e2\u06e2";
                    break;
                case 1751624:
                    str = "\u06e5\u06e1\u06e0";
                    d0Var = (m9.d0) objM4699;
                    break;
                case 1751714:
                    eVarM471 = C0024.m471(this, d0Var, eVar);
                    str = "\u06e1\u06e2\u06e3";
                    break;
                case 1752516:
                    str = "\u06e4\u06e6\u06e4";
                    eVar = (u8.e) obj2;
                    break;
                case 1754471:
                    return objM4699;
                default:
                    str = "\u06e3\u06e7\u06e3";
                    lVarM238 = C0012.m238();
                    break;
            }
        }
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVarM5766 = C0299.m5766();
        int iM2133 = C0110.m2133(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2133 != 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (iM2133 == 1) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                throw new IllegalStateException(C0197.m3785(m5196(), 0, C0244.f324 ^ 555, 738));
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                C0329.m6365(obj);
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
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
                    m0 m0VarM6745 = C0344.m6745();
                    l1 l1Var = new l1(C0038.m742(this), null);
                    this.f5816a = 1;
                    Object objM4491 = C0233.m4491(m0VarM6745, l1Var, this);
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
                                if (objM4491 == aVarM5766) {
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
