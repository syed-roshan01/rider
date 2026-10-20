package k0;

import aa.C0011;
import aa.C0012;
import android.os.C0013;
import android.support.v4.app.C0014;
import android.support.v4.app.C0015;
import android.support.v4.graphics.drawable.C0016;
import androidx.activity.C0017;
import b7.C0053;
import c0.C0057;
import c3.C0063;
import c4.C0066;
import com.auto.accept.ui.viewmodel.C0074;
import com.google.android.gms.auth.api.signin.C0080;
import com.google.android.gms.internal.ads_identifier.C0089;
import com.google.android.gms.internal.stats.C0100;
import com.google.android.gms.internal.tasks.C0103;
import com.google.firebase.annotations.C0128;
import com.google.firebase.annotations.concurrent.C0126;
import com.google.firebase.auth.ktx.C0133;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.iid.internal.C0168;
import com.google.firebase.messaging.C0191;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0196;
import dagger.hilt.android.components.C0228;
import dagger.hilt.android.internal.C0235;
import dagger.hilt.android.internal.earlyentrypoint.C0231;
import e2.C0261;
import g4.C0289;
import h6.C0309;
import l2.C0341;
import m3.C0352;
import m5.C0355;
import p8.C0379;
import q0.C0382;
import s0.C0410;
import s2.C0411;
import u4.C0435;
import v5.C0445;
import w1.C0455;
import w2.C0456;
import w6.C0464;
import x5.C0470;
import y.C0475;
import z.C0481;
import z3.C0485;

/* JADX INFO: loaded from: classes.dex */
public final class p4 extends d9.j implements c9.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c9.e f9361c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(float f10, long j10, c9.e eVar) {
        super(C0126.f152 ^ (-205));
        this.f9359a = f10;
        this.f9360b = j10;
        this.f9361c = eVar;
        int iM1029 = C0053.m1029();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1029 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.decode(C0481.m9376("r06uHivN1JN6A8Mx1hPWHr")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:71:0x014d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:80:0x0176. Please report as an issue. */
    @Override // c9.f
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i10;
        int i11;
        y0.o oVar = (y0.o) obj;
        m0.m mVar = (m0.m) obj2;
        int iM8515 = C0435.m8515((Number) obj3);
        int i12 = C0410.f681;
        int i13 = 1616;
        while (true) {
            i13 ^= 1633;
            switch (i13) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i13 = ((i12 ^ 947) & iM8515) == 0 ? 1709 : 1678;
                    break;
                case 204:
                    boolean zM2013 = C0103.m2013((m0.q) mVar, oVar);
                    int i14 = 1740;
                    while (true) {
                        i14 ^= 1757;
                        switch (i14) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i14 = zM2013 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                i11 = 2;
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                i11 = 4;
                                int i15 = 1864;
                                while (true) {
                                    i15 ^= 1881;
                                    switch (i15) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i15 = 48674;
                                            continue;
                                        case 47483:
                                            break;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    i10 = (i11 & iM8515) | (iM8515 ^ i11);
                    break;
                case 239:
                    i10 = iM8515;
                    break;
                default:
                    break;
            }
        }
        int i16 = C0191.f215;
        int i17 = 48767;
        while (true) {
            i17 ^= 48784;
            switch (i17) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    break;
                case 76:
                    m0.q qVar = (m0.q) mVar;
                    boolean zM1625 = C0074.m1625(qVar);
                    int i18 = 48891;
                    while (true) {
                        i18 ^= 48908;
                        switch (i18) {
                            case 22:
                                break;
                            case 53:
                                C0470.m9156(qVar);
                                int i19 = 49790;
                                while (true) {
                                    i19 ^= 49807;
                                    switch (i19) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            return C0012.m238();
                                        case 241:
                                            i19 = 49821;
                                            break;
                                    }
                                }
                                break;
                            case 503:
                                i18 = !zM1625 ? 49635 : 48953;
                                break;
                            case 32495:
                                int i20 = 49666;
                                while (true) {
                                    i20 ^= 49683;
                                    switch (i20) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i20 = 49697;
                                            continue;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 239:
                    i17 = ((i16 ^ (-467)) & i10) == 18 ? 48860 : 48829;
                    break;
                default:
                    break;
            }
        }
        y0.o oVarM1725 = C0080.m1725(oVar, C0066.m1272(this));
        long jM9455 = C0485.m9455(this);
        c9.e eVarM6687 = C0341.m6687(this);
        m0.q qVar2 = (m0.q) mVar;
        C0261.m4990(qVar2, 733328563 ^ C0011.f31);
        r1.j0 j0VarM2476 = C0128.m2476(C0456.m8889(), false, qVar2);
        C0261.m4990(qVar2, (-1323940545) ^ C0013.f33);
        int iM276 = C0014.m276(qVar2);
        m0.r1 r1VarM275 = C0014.m275(qVar2);
        C0014.m280(C0379.m7428());
        t1.j jVarM4451 = C0231.m4451();
        u0.b bVarM6976 = C0355.m6976(oVarM1725);
        boolean z10 = C0196.m3764(qVar2) instanceof m0.d;
        int i21 = 49914;
        while (true) {
            i21 ^= 49931;
            switch (i21) {
                case 497:
                    if (z10) {
                        i21 = 50658;
                    }
                    break;
                case 1711:
                    break;
                case 1736:
                    C0235.m4537();
                    throw null;
                case 1769:
                    C0100.m1961(qVar2);
                    boolean zM7502 = C0382.m7502(qVar2);
                    int i22 = 50689;
                    while (true) {
                        i22 ^= 50706;
                        switch (i22) {
                            case 19:
                                i22 = zM7502 ? 50782 : 50751;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                C0445.m8685(qVar2);
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                C0017.m346(qVar2, jVarM4451);
                                int i23 = 50813;
                                while (true) {
                                    i23 ^= 50830;
                                    switch (i23) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 243:
                                            i23 = 50844;
                                            continue;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    C0089.m1904(qVar2, j0VarM2476, C0063.m1208());
                    C0089.m1904(qVar2, r1VarM275, C0464.m9055());
                    t1.i iVarM5562 = C0289.m5562();
                    boolean zM7503 = C0382.m7502(qVar2);
                    int i24 = 51588;
                    while (true) {
                        i24 ^= 51605;
                        switch (i24) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i24 = !zM7503 ? 51681 : 51650;
                                break;
                            case 54:
                                break;
                            case 87:
                                C0133.m2574(iM276, qVar2, iM276, iVarM5562);
                                break;
                            case 116:
                                boolean zM4399 = C0228.m4399(C0411.m8078(qVar2), C0057.m1083(iM276));
                                int i25 = 51712;
                                while (true) {
                                    i25 ^= 51729;
                                    switch (i25) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i25 = !zM4399 ? 51805 : 51774;
                                            break;
                                        case 47:
                                            break;
                                        case 76:
                                            C0133.m2574(iM276, qVar2, iM276, iVarM5562);
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
                    C0352.m6912(0, bVarM6976, new m0.l2(qVar2), qVar2, (-2058660721) ^ C0309.f457);
                    C0168.m3208(jM9455, C0015.m291((e5) C0475.m9256(qVar2, C0455.m8878())), eVarM6687, qVar2, 0, 0);
                    C0016.m325(qVar2, false, true, false, false);
                    break;
                default:
                    continue;
            }
            i21 = 50627;
        }
        return C0012.m238();
    }
}
