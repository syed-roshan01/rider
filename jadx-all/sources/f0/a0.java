package f0;

import aa.C0012;
import com.google.android.gms.internal.stats.C0101;
import com.google.android.gms.internal.tasks.C0103;
import com.google.firebase.appcheck.interop.C0130;
import com.google.firebase.firestore.bundle.C0148;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0196;
import dagger.hilt.internal.componenttreedeps.C0249;
import dagger.hilt.internal.generatesrootinput.C0251;
import f6.C0278;
import j2.C0324;
import k1.C0333;
import k3.C0335;
import l3.C0343;
import o7.i2;
import r4.C0399;
import r9.C0406;
import s8.C0417;
import w1.C0456;
import z7.C0490;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c2 f5590c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(boolean z10, boolean z11, c2 c2Var, y1.v vVar) {
        super(1);
        this.f5588a = z10;
        this.f5589b = z11;
        this.f5590c = c2Var;
        int iM2838 = C0148.m2838();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2838 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.parseLong(C0399.m7790("fDuAmpYCYysTQITNyb")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        q8.l lVarM238 = null;
        a2.e eVar = (a2.e) obj;
        boolean zM6464 = C0333.m6464(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (!zM6464) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    boolean zM6263 = C0324.m6263(this);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (!zM6263) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                c2 c2VarM5378 = C0278.m5378(this);
                                g2.h0 h0VarM3751 = C0196.m3751(c2VarM5378);
                                v vVarM4757 = C0249.m4757(c2VarM5378);
                                int i12 = 48767;
                                while (true) {
                                    i12 ^= 48784;
                                    switch (i12) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            break;
                                        case 76:
                                            g2.a0 a0VarM6718 = C0343.m6718(C0101.m1984(c2VarM5378), C0406.m7965(new g2.i[]{new g2.f(), new g2.a(eVar, 1)}));
                                            C0103.m2029(h0VarM3751, null, a0VarM6718);
                                            C0130.m2513(vVarM4757, a0VarM6718);
                                            lVarM238 = C0012.m238();
                                            break;
                                        case 239:
                                            i12 = h0VarM3751 != null ? 48860 : 48829;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                int i13 = 48891;
                                while (true) {
                                    i13 ^= 48908;
                                    switch (i13) {
                                        case 22:
                                            break;
                                        case 53:
                                            break;
                                        case 503:
                                            i13 = lVarM238 == null ? 49635 : 48953;
                                            break;
                                        case 32495:
                                            String strM5369 = C0278.m5369(eVar);
                                            int iM8181 = C0417.m8181(strM5369);
                                            C0130.m2513(vVarM4757, new g2.a0(strM5369, C0251.m4797(iM8181, iM8181), C0490.f763 ^ (-535)));
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                Boolean boolM6483 = C0335.m6483();
                                int i14 = 49666;
                                while (true) {
                                    i14 ^= 49683;
                                    switch (i14) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i14 = 49697;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            return boolM6483;
                                    }
                                }
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                int i15 = 1864;
                                while (true) {
                                    i15 ^= 1881;
                                    switch (i15) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i15 = 48674;
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
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
        return C0456.m8876();
    }
}
