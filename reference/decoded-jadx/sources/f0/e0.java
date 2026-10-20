package f0;

import aa.C0012;
import androidx.compose.foundation.layout.C0021;
import ca.C0070;
import com.auto.accept.ui.viewmodel.C0073;
import com.google.android.datatransport.cct.C0078;
import com.google.firebase.analytics.ktx.ktxtesting.C0120;
import com.google.firebase.annotations.C0127;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.firestore.auth.C0146;
import com.google.firebase.firestore.auth.C0147;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.ktx.C0179;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.C0201;
import com.google.firebase.remoteconfig.internal.Code;
import d1.C0213;
import d8.C0221;
import dagger.hilt.C0255;
import dagger.hilt.internal.componenttreedeps.C0248;
import e1.C0258;
import e2.C0262;
import ea.C0268;
import g.C0283;
import h1.C0300;
import h6.C0309;
import i6.C0320;
import k1.C0332;
import o7.i2;
import q5.C0385;
import q7.C0389;
import q7.C0390;
import r1.C0393;
import r2.C0396;
import r5.C0400;
import s0.C0409;
import s2.C0411;
import v0.C0441;
import v9.C0451;
import z8.C0492;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2.i0 f5674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g2.a0 f5675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f5676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f5677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g2.o f5678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f5679f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c2 f5680n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final g2.s f5681o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h0.v0 f5682p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c1.k f5683q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(g2.i0 i0Var, g2.a0 a0Var, boolean z10, boolean z11, g2.o oVar, boolean z12, c2 c2Var, g2.s sVar, h0.v0 v0Var, c1.k kVar) {
        super(1);
        this.f5674a = i0Var;
        this.f5675b = a0Var;
        this.f5676c = z10;
        this.f5677d = z11;
        this.f5678e = oVar;
        this.f5679f = z12;
        this.f5680n = c2Var;
        this.f5681o = sVar;
        this.f5682p = v0Var;
        this.f5683q = kVar;
        int iM2805 = C0147.m2805();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2805 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.decode(C0248.m4759("616FCQlSF")));
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
        y1.v vVar = (y1.v) obj;
        a2.e eVarM1585 = C0073.m1585(C0258.m4933(this));
        C0201.m3861();
        y1.u uVarM2400 = C0124.m2400();
        j9.f[] fVarArrM3861 = C0201.m3861();
        j9.f fVar = fVarArrM3861[14];
        C0255.m4872(uVarM2400, vVar, eVarM1585);
        g2.a0 a0VarM1690 = C0078.m1690(this);
        long jM5972 = C0309.m5972(a0VarM1690);
        y1.u uVarM5460 = C0283.m5460();
        j9.f fVar2 = fVarArrM3861[15];
        C0255.m4872(uVarM5460, vVar, new a2.b0(jM5972));
        q8.l lVarM238 = C0012.m238();
        boolean zM8609 = C0441.m8609(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = !zM8609 ? 1709 : 1678;
                    break;
                case 204:
                    C0492.m9574((y1.j) vVar, C0268.m5120(), lVarM238);
                    break;
                case 239:
                    break;
                default:
                    break;
            }
        }
        boolean zM8042 = C0409.m8042(this);
        int i11 = 1740;
        while (true) {
            i11 ^= 1757;
            switch (i11) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i11 = zM8042 ? 1833 : 1802;
                    break;
                case 54:
                    break;
                case 471:
                    break;
                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                    C0492.m9574((y1.j) vVar, C0396.m7751(), lVarM238);
                    break;
                default:
                    break;
            }
        }
        c2 c2VarM7857 = C0400.m7857(this);
        C0073.m1574(vVar, new v(c2VarM7857, C0411.f682 ^ 39));
        boolean zM7623 = C0389.m7623(this);
        y1.j jVar = (y1.j) vVar;
        C0492.m9574(jVar, C0262.m5007(), new y1.a(null, new a0(zM7623, zM8609, c2VarM7857, vVar)));
        C0492.m9574(jVar, C0300.m5790(), new y1.a(null, new b0(C0389.m7623(this), C0441.m8609(this), C0400.m7857(this), vVar, C0078.m1690(this))));
        C0492.m9574(jVar, C0390.m7645(), new y1.a(null, new c0(C0385.m7555(this), C0441.m8609(this), C0078.m1690(this), C0179.m3409(this), C0400.m7857(this))));
        g2.o oVarM2399 = C0124.m2399(this);
        int iM414 = C0021.m414(oVarM2399);
        u.r0 r0Var = new u.r0(C0146.f171 ^ (-433), c2VarM7857, oVarM2399);
        C0492.m9574(jVar, C0441.m8613(), new g2.n(iM414));
        C0492.m9574(jVar, C0332.m6456(), new y1.a(null, r0Var));
        C0492.m9574(jVar, C0070.m1364(), new y1.a(null, new d0(c2VarM7857, C0320.m6193(this), zM7623)));
        h0.v0 v0VarM3409 = C0179.m3409(this);
        C0492.m9574(jVar, C0127.m2459(), new y1.a(null, new z(v0VarM3409, 1)));
        boolean zM4273 = C0221.m4273(C0309.m5972(a0VarM1690));
        int i12 = 1864;
        while (true) {
            i12 ^= 1881;
            switch (i12) {
                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i12 = !zM4273 ? 48736 : 48705;
                    break;
                case 47384:
                    break;
                case 47417:
                    int i13 = 48767;
                    while (true) {
                        i13 ^= 48784;
                        switch (i13) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                break;
                            case 76:
                                C0492.m9574(jVar, C0073.m1590(), new y1.a(null, new z(v0VarM3409, C0213.f237 ^ (-13))));
                                int i14 = 48891;
                                while (true) {
                                    i14 ^= 48908;
                                    switch (i14) {
                                        case 22:
                                            break;
                                        case 53:
                                            break;
                                        case 503:
                                            i14 = zM8609 ? 49635 : 48953;
                                            break;
                                        case 32495:
                                            int i15 = 49666;
                                            while (true) {
                                                i15 ^= 49683;
                                                switch (i15) {
                                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i15 = !zM7623 ? 49759 : 49728;
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    case 76:
                                                        C0492.m9574(jVar, C0451.m8795(), new y1.a(null, new z(v0VarM3409, C0120.f146 ^ 476)));
                                                        break;
                                                    case 83:
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
                            case 239:
                                i13 = !zM8042 ? 48860 : 48829;
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
        int i16 = 49790;
        while (true) {
            i16 ^= 49807;
            switch (i16) {
                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    break;
                case 51:
                    break;
                case 84:
                    int i17 = 49914;
                    while (true) {
                        i17 ^= 49931;
                        switch (i17) {
                            case 497:
                                if (!zM7623) {
                                    i17 = 50658;
                                }
                                break;
                            case 1711:
                                break;
                            case 1736:
                                break;
                            case 1769:
                                C0492.m9574(jVar, C0393.m7715(), new y1.a(null, new z(v0VarM3409, 0)));
                                break;
                            default:
                                continue;
                        }
                        i17 = 50627;
                    }
                    break;
                case 241:
                    if (zM8609) {
                        i16 = 49883;
                    }
                    break;
                default:
                    continue;
            }
            i16 = 49852;
        }
        return lVarM238;
    }
}
