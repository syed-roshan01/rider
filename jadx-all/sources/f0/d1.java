package f0;

import aa.C0012;
import android.support.v4.app.C0014;
import androidx.appcompat.widget.C0020;
import com.google.firebase.analytics.connector.C0116;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.iid.C0170;
import com.google.firebase.installations.local.C0176;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.android.lifecycle.C0238;
import dagger.hilt.internal.definecomponent.C0250;
import f6.C0279;
import h0.C0300;
import h3.C0304;
import h8.C0314;
import j9.C0330;
import la.C0349;
import o7.i2;
import r5.C0400;
import v6.C0447;
import w.C0454;

/* JADX INFO: loaded from: classes.dex */
public final class d1 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f356short = {2005, 2007, 2010, 2010, 1942, 1986, 2009, 1942, 1937, 1988, 2003, 1989, 1987, 2011, 2003, 1937, 1942, 2004, 2003, 2000, 2009, 1988, 2003, 1942, 1937, 2015, 2008, 1984, 2009, 2013, 2003, 1937, 1942, 1985, 2015, 1986, 2014, 1942, 2005, 2009, 1988, 2009, 1987, 1986, 2015, 2008, 2003};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o1.z f5665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1 f5666c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(o1.z zVar, k1 k1Var, u8.e eVar) {
        super(C0447.f717 ^ (-48), eVar);
        this.f5665b = zVar;
        this.f5666c = k1Var;
        int iM5394 = C0279.m5394();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5394 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.decode(C0014.m274("bKEwjFE9Pupe0q0Ne9r65Ox47OQEZ")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۤۡۡۧ, reason: not valid java name and contains not printable characters */
    public static short[] m5185() {
        int iM4779 = C0250.m4779();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4779 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f356short;
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
        String str = "ۨۧۤ";
        o1.z zVarM8855 = null;
        k1 k1VarM3252 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1749821:
                    return this;
                case 1753665:
                    str = "ۤ۟ۨ";
                    k1VarM3252 = C0170.m3252(this);
                    break;
                case 1755589:
                    zVarM8855 = C0454.m8855(this);
                    str = "ۦۧۢ";
                    break;
                default:
                    this = new d1(zVarM8855, k1VarM3252, eVar);
                    str = "ۢۧۢ";
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "ۦۨۢ";
        u8.e eVar = null;
        m9.d0 d0Var = null;
        Object objM6071 = obj;
        u8.e eVarM3349 = null;
        q8.l lVarM238 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1748797:
                    str = "ۣۨۡ";
                    eVar = (u8.e) obj2;
                    break;
                case 1749576:
                    objM6071 = C0314.m6071(this, lVarM238);
                    str = "ۣ۟ۨ";
                    break;
                case 1750540:
                    return objM6071;
                case 1750812:
                    eVarM3349 = C0176.m3349(this, d0Var, eVar);
                    str = "ۣۧ۟";
                    break;
                case 1751712:
                    str = "ۢ۟ۥ";
                    lVarM238 = C0012.m238();
                    break;
                case 1753696:
                    str = "ۡۥۡ";
                    d0Var = (m9.d0) objM6071;
                    break;
                default:
                    str = "ۤۦۢ";
                    this = (d1) eVarM3349;
                    break;
            }
        }
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        int i10 = 1;
        int i11 = 0;
        v8.a aVarM5766 = C0300.m5766();
        int iM4578 = C0238.m4578(this);
        q8.l lVarM238 = C0012.m238();
        int i12 = 1616;
        while (true) {
            i12 ^= 1633;
            switch (i12) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4578 != 0) {
                        i12 = 1709;
                    }
                    break;
                case 204:
                    int i13 = 1740;
                    while (true) {
                        i13 ^= 1757;
                        switch (i13) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (iM4578 == 1) {
                                    i13 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                throw new IllegalStateException(C0349.m6825(m5185(), 0, C0116.f142 ^ 195, 1974));
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                C0330.m6365(obj);
                                int i14 = 1864;
                                while (true) {
                                    i14 ^= 1881;
                                    switch (i14) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i14 = 48674;
                                            break;
                                        case 47483:
                                            return lVarM238;
                                    }
                                }
                                break;
                            default:
                                continue;
                        }
                        i13 = 1802;
                    }
                    break;
                case 239:
                    C0330.m6365(obj);
                    this.f5664a = 1;
                    k1 k1VarM3252 = C0170.m3252(this);
                    f1 f1Var = new f1(k1VarM3252, i11);
                    g1 g1Var = new g1(k1VarM3252, i11);
                    g1 g1Var2 = new g1(k1VarM3252, i10);
                    s.i iVar = new s.i(k1VarM3252, C0020.f40 ^ (-672));
                    C0304.m5854();
                    Object objM7820 = C0400.m7820(C0454.m8855(this), new v.h0(f1Var, iVar, g1Var2, g1Var, null), this);
                    int i15 = 48767;
                    while (true) {
                        i15 ^= 48784;
                        switch (i15) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                objM7820 = lVarM238;
                                break;
                            case 76:
                                int i16 = 48891;
                                while (true) {
                                    i16 ^= 48908;
                                    switch (i16) {
                                        case 22:
                                            break;
                                        case 503:
                                            i16 = 48922;
                                            continue;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 239:
                                i15 = objM7820 == aVarM5766 ? 48860 : 48829;
                                break;
                            default:
                                break;
                        }
                    }
                    int i17 = 49666;
                    while (true) {
                        i17 ^= 49683;
                        switch (i17) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i17 = objM7820 == aVarM5766 ? 49759 : 49728;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                int i18 = 49790;
                                while (true) {
                                    i18 ^= 49807;
                                    switch (i18) {
                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 241:
                                            i18 = 49821;
                                            continue;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 83:
                                objM7820 = lVarM238;
                                break;
                            default:
                                break;
                        }
                    }
                    int i19 = 49914;
                    while (true) {
                        i19 ^= 49931;
                        switch (i19) {
                            case 497:
                                if (objM7820 == aVarM5766) {
                                    i19 = 50658;
                                }
                                break;
                            case 1711:
                                break;
                            case 1736:
                                return lVarM238;
                            case 1769:
                                return aVarM5766;
                            default:
                                continue;
                        }
                        i19 = 50627;
                    }
                    break;
                default:
                    continue;
            }
            i12 = 1678;
        }
    }
}
