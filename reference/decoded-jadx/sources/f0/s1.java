package f0;

import a8.C0010;
import aa.C0012;
import androidx.profileinstaller.C0046;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.appcheck.interop.C0130;
import com.google.firebase.database.collection.C0138;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.installations.ktx.C0175;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0198;
import d9.C0224;
import d9.C0225;
import f1.C0273;
import h0.C0299;
import j3.C0325;
import j9.C0329;
import o4.C0369;
import o7.i2;
import r.C0392;
import r6.C0402;
import t0.C0418;
import w4.C0459;
import x4.C0469;

/* JADX INFO: loaded from: classes.dex */
public final class s1 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f378short = {2058, 2056, 2053, 2053, 2121, 2077, 2054, 2121, 2126, 2075, 2060, 2074, 2076, 2052, 2060, 2126, 2121, 2059, 2060, 2063, 2054, 2075, 2060, 2121, 2126, 2048, 2055, 2079, 2054, 2050, 2060, 2126, 2121, 2078, 2048, 2077, 2049, 2121, 2058, 2054, 2075, 2054, 2076, 2077, 2048, 2055, 2060};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f5895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m0.g1 f5897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f5898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x.m f5899e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(m0.g1 g1Var, long j10, x.m mVar, u8.e eVar) {
        super(C0325.f473 ^ 369, eVar);
        this.f5897c = g1Var;
        this.f5898d = j10;
        this.f5899e = mVar;
        int iM9143 = C0469.m9143();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM9143 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.decode(C0010.m204("bzupPtqF5LlV4RvNgPeVaCMfPx")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۠ۢۢۨ, reason: not valid java name and contains not printable characters */
    public static short[] m5206() {
        int iM3800 = C0198.m3800();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3800 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f378short;
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
        long jM5258 = 0;
        String str = "\u06e5\u06e1\u06e6";
        x.m mVarM3339 = null;
        m0.g1 g1VarM892 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1748641:
                    return this;
                case 1749570:
                    str = "\u06e1\u06e0\u06e0";
                    this = new s1(g1VarM892, jM5258, mVarM3339, eVar);
                    break;
                case 1749606:
                    mVarM3339 = C0175.m3339(this);
                    str = "\u06e2\u06df\u06df";
                    break;
                case 1751619:
                    jM5258 = C0273.m5258(this);
                    str = "\u06e2\u06e0\u06e4";
                    break;
                default:
                    g1VarM892 = C0046.m892(this);
                    str = "\u06e4\u06e3\u06e2";
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "\u06e5\u06e4\u06e8";
        m9.d0 d0Var = null;
        u8.e eVarM4344 = null;
        Object objM7682 = obj;
        u8.e eVar = null;
        q8.l lVarM238 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746818:
                    return objM7682;
                case 1747774:
                    str = "\u06e5\u06e8\u06e3";
                    eVar = (u8.e) obj2;
                    break;
                case 1751748:
                    objM7682 = C0392.m7682(this, lVarM238);
                    str = "\u06df\u06e3\u06e6";
                    break;
                case 1752617:
                    str = "\u06e0\u06e3\u06e1";
                    d0Var = (m9.d0) objM7682;
                    break;
                case 1752736:
                    eVarM4344 = C0225.m4344(this, d0Var, eVar);
                    str = "\u06e1\u06e8\u06e1";
                    break;
                case 1754444:
                    str = "\u06e4\u06e7\u06e7";
                    lVarM238 = C0012.m238();
                    break;
                default:
                    str = "\u06e7\u06e1\u06e6";
                    this = (s1) eVarM4344;
                    break;
            }
        }
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        m0.g1 g1Var;
        x.o oVar;
        v8.a aVarM5766 = C0299.m5766();
        int iM8956 = C0459.m8956(this);
        x.m mVarM3339 = C0175.m3339(this);
        m0.g1 g1VarM892 = C0046.m892(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = iM8956 != 0 ? 1709 : 1678;
                    break;
                case 204:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = iM8956 != 1 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                g1Var = (m0.g1) C0402.m7888(this);
                                C0329.m6365(obj);
                                int i12 = 48891;
                                while (true) {
                                    i12 ^= 48908;
                                    switch (i12) {
                                        case 22:
                                            break;
                                        case 503:
                                            i12 = 48922;
                                            continue;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                int i13 = 1864;
                                while (true) {
                                    i13 ^= 1881;
                                    switch (i13) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (iM8956 == 2) {
                                                i13 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            throw new IllegalStateException(C0369.m7239(m5206(), 0, C0138.f164 ^ (-539), 2153));
                                        case 47417:
                                            oVar = (x.o) C0402.m7888(this);
                                            C0329.m6365(obj);
                                            int i14 = 48767;
                                            while (true) {
                                                i14 ^= 48784;
                                                switch (i14) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case 239:
                                                        i14 = 48798;
                                                        break;
                                                }
                                            }
                                            break;
                                        case 47483:
                                            break;
                                        default:
                                            continue;
                                    }
                                    i13 = 48705;
                                }
                                C0224.m4315(g1VarM892, oVar);
                                return C0012.m238();
                            default:
                                break;
                        }
                    }
                    C0224.m4315(g1Var, null);
                    break;
                case 239:
                    C0329.m6365(obj);
                    x.o oVar2 = (x.o) C0418.m8214(g1VarM892);
                    int i15 = 49666;
                    while (true) {
                        i15 ^= 49683;
                        switch (i15) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i15 = oVar2 != null ? 49759 : 49728;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                x.n nVar = new x.n(oVar2);
                                int i16 = 49790;
                                while (true) {
                                    i16 ^= 49807;
                                    switch (i16) {
                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 51:
                                            break;
                                        case 84:
                                            this.f5895a = g1VarM892;
                                            this.f5896b = 1;
                                            Object objM2517 = C0130.m2517(mVarM3339, nVar, this);
                                            int i17 = 49914;
                                            while (true) {
                                                i17 ^= 49931;
                                                switch (i17) {
                                                    case 497:
                                                        i17 = objM2517 == aVarM5766 ? 50658 : 50627;
                                                        break;
                                                    case 1711:
                                                        break;
                                                    case 1736:
                                                        break;
                                                    case 1769:
                                                        return aVarM5766;
                                                    default:
                                                        break;
                                                }
                                            }
                                            break;
                                        case 241:
                                            i16 = mVarM3339 != null ? 49883 : 49852;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                g1Var = g1VarM892;
                                C0224.m4315(g1Var, null);
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
        oVar = new x.o(C0273.m5258(this));
        int i18 = 50689;
        while (true) {
            i18 ^= 50706;
            switch (i18) {
                case 19:
                    if (mVarM3339 != null) {
                        i18 = 50782;
                    }
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 76:
                    this.f5895a = oVar;
                    this.f5896b = 2;
                    Object objM2518 = C0130.m2517(mVarM3339, oVar, this);
                    int i19 = 50813;
                    while (true) {
                        i19 ^= 50830;
                        switch (i19) {
                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 53:
                                break;
                            case 243:
                                if (objM2518 == aVarM5766) {
                                    i19 = 51557;
                                }
                                break;
                            case 4075:
                                return aVarM5766;
                            default:
                                continue;
                        }
                        i19 = 50875;
                    }
                    break;
                default:
                    continue;
            }
            i18 = 50751;
        }
        C0224.m4315(g1VarM892, oVar);
        return C0012.m238();
    }
}
