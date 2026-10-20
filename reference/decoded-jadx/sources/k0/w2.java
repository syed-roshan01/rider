package k0;

import a2.C0005;
import a6.C0007;
import aa.C0012;
import android.os.C0013;
import androidx.compose.ui.graphics.C0032;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.C0195;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.gson.internal.bind.C0207;
import g2.C0286;
import h0.C0299;
import h7.C0312;
import j9.C0329;
import l0.C0339;
import s8.C0417;
import t7.C0425;
import v9.C0452;

/* JADX INFO: loaded from: classes.dex */
public final class w2 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f510short = {2671, 2669, 2656, 2656, 2604, 2680, 2659, 2604, 2603, 2686, 2665, 2687, 2681, 2657, 2665, 2603, 2604, 2670, 2665, 2666, 2659, 2686, 2665, 2604, 2603, 2661, 2658, 2682, 2659, 2663, 2665, 2603, 2604, 2683, 2661, 2680, 2660, 2604, 2671, 2659, 2686, 2659, 2681, 2680, 2661, 2658, 2665};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t.d f9609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t.n f9611d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(t.d dVar, boolean z10, t.n nVar, u8.e eVar) {
        super(C0195.f219 ^ (-950), eVar);
        this.f9609b = dVar;
        this.f9610c = z10;
        this.f9611d = nVar;
        int iM8825 = C0452.m8825();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8825 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.decode(C0417.m8199("LhEYlcxlzsbl53GBVLqvbfyRl")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣۧۥۢ, reason: not valid java name and contains not printable characters */
    public static short[] m6440() {
        int iM104 = C0005.m104();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM104 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f510short;
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
        boolean zM8826 = false;
        String str = "\u06e6\u06e7\u06e2";
        t.n nVarM3969 = null;
        t.d dVarM6042 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1749824:
                    return this;
                case 1750757:
                    str = "\u06e8\u06e7\u06e0";
                    dVarM6042 = C0312.m6042(this);
                    break;
                case 1753665:
                    str = "\u06e8\u06e0\u06e7";
                    zM8826 = C0452.m8826(this);
                    break;
                case 1755585:
                    this = new w2(dVarM6042, zM8826, nVarM3969, eVar);
                    str = "\u06e2\u06e7\u06e5";
                    break;
                default:
                    nVarM3969 = C0207.m3969(this);
                    str = "\u06e3\u06e6\u06e8";
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "\u06df\u06e5\u06e5";
        m9.d0 d0Var = null;
        u8.e eVar = null;
        Object objM637 = obj;
        q8.l lVarM238 = null;
        u8.e eVarM5512 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746879:
                    str = "\u06e8\u06e0\u06e1";
                    d0Var = (m9.d0) objM637;
                    break;
                case 1747654:
                    objM637 = C0032.m637(this, lVarM238);
                    str = "\u06e1\u06e3\u06e1";
                    break;
                case 1747780:
                    eVarM5512 = C0286.m5512(this, d0Var, eVar);
                    str = "\u06e6\u06e7\u06e7";
                    break;
                case 1748735:
                    return objM637;
                case 1753670:
                    str = "\u06e7\u06e5\u06e3";
                    this = (w2) eVarM5512;
                    break;
                case 1754565:
                    str = "\u06e0\u06df\u06e5";
                    lVarM238 = C0012.m238();
                    break;
                default:
                    str = "\u06e0\u06e3\u06e7";
                    eVar = (u8.e) obj2;
                    break;
            }
        }
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        float f10;
        v8.a aVarM5766 = C0299.m5766();
        int iM246 = C0013.m246(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = iM246 != 0 ? 1709 : 1678;
                    break;
                case 204:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = iM246 == 1 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                throw new IllegalStateException(C0425.m8346(m6440(), 0, C0007.f27 ^ (-400), 2572));
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                C0329.m6365(obj);
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i12 = 48674;
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
                    break;
                case 239:
                    C0329.m6365(obj);
                    boolean zM8826 = C0452.m8826(this);
                    int i13 = 48767;
                    while (true) {
                        i13 ^= 48784;
                        switch (i13) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                f10 = 0.8f;
                                break;
                            case 76:
                                f10 = 1.0f;
                                int i14 = 48891;
                                while (true) {
                                    i14 ^= 48908;
                                    switch (i14) {
                                        case 22:
                                            break;
                                        case 503:
                                            i14 = 48922;
                                            continue;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 239:
                                i13 = zM8826 ? 48860 : 48829;
                                break;
                            default:
                                break;
                        }
                    }
                    Float f11 = new Float(f10);
                    this.f9608a = 1;
                    Object objM6662 = C0339.m6662(C0312.m6042(this), f11, C0207.m3969(this), this);
                    int i15 = 49666;
                    while (true) {
                        i15 ^= 49683;
                        switch (i15) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i15 = objM6662 == aVarM5766 ? 49759 : 49728;
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                break;
                            case 76:
                                return aVarM5766;
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
        return C0012.m238();
    }
}
