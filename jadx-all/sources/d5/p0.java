package d5;

import aa.C0012;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.firebase.analytics.connector.internal.C0115;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import d8.C0222;
import dagger.hilt.android.components.C0228;
import dagger.hilt.codegen.C0243;
import ea.C0268;
import f0.C0273;
import g.C0283;
import g3.C0289;
import h0.C0300;
import i6.C0320;
import j9.C0330;
import k0.a3;
import m0.l3;
import m7.C0358;
import m9.C0360;
import p8.C0380;
import r2.C0398;
import t0.C0419;
import u0.C0431;
import v5.C0446;

/* JADX INFO: loaded from: classes.dex */
public final class p0 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f282short = {1017, 1019, 1014, 1014, 954, 1006, 1013, 954, 957, 1000, 1023, 1001, 1007, 1015, 1023, 957, 954, 1016, 1023, 1020, 1013, 1000, 1023, 954, 957, 1011, 1012, 1004, 1013, 1009, 1023, 957, 954, 1005, 1011, 1006, 1010, 954, 1017, 1013, 1000, 1013, 1007, 1006, 1011, 1012, 1023};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MainViewModel f4714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l3 f4716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a3 f4717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MainViewModel f4718e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(l3 l3Var, a3 a3Var, MainViewModel mainViewModel, u8.e eVar) {
        super(C0115.f141 ^ (-574), eVar);
        this.f4716c = l3Var;
        this.f4717d = a3Var;
        this.f4718e = mainViewModel;
        int iM4660 = C0243.m4660();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4660 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.decode(C0115.m2222("BesvN2mgc07T8HslTWolV")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۥۦۦۢ, reason: contains not printable characters */
    public static short[] m4195() {
        int iM5113 = C0268.m5113();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5113 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f282short;
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
        String str = "ۣۨ۟";
        a3 a3VarM5255 = null;
        MainViewModel mainViewModelM7054 = null;
        l3 l3VarM4262 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1747683:
                    str = "۠ۧۢ";
                    mainViewModelM7054 = C0360.m7054(this);
                    break;
                case 1747841:
                    return this;
                case 1754532:
                    this = new p0(l3VarM4262, a3VarM5255, mainViewModelM7054, eVar);
                    str = "۠ۥۦ";
                    break;
                case 1755340:
                    a3VarM5255 = C0273.m5255(this);
                    str = "ۣ۠۠";
                    break;
                default:
                    str = "ۧۤۡ";
                    l3VarM4262 = C0222.m4262(this);
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "ۦۣۤ";
        u8.e eVarM7765 = null;
        q8.l lVarM238 = null;
        Object objM6185 = obj;
        m9.d0 d0Var = null;
        u8.e eVar = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56319:
                    eVarM7765 = C0398.m7765(this, d0Var, eVar);
                    str = "ۡۤۦ";
                    break;
                case 1746757:
                    return objM6185;
                case 1748771:
                    str = "ۣۢۡ";
                    this = (p0) eVarM7765;
                    break;
                case 1749696:
                    str = "ۧۤ۠";
                    lVarM238 = C0012.m238();
                    break;
                case 1753573:
                    str = "ۣۡ۠";
                    d0Var = (m9.d0) objM6185;
                    break;
                case 1754531:
                    objM6185 = C0320.m6185(this, lVarM238);
                    str = "۟ۡۧ";
                    break;
                default:
                    str = "۠۟";
                    eVar = (u8.e) obj2;
                    break;
            }
        }
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        MainViewModel mainViewModelM5447;
        v8.a aVarM5766 = C0300.m5766();
        int iM7006 = C0358.m7006(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = iM7006 != 0 ? 1709 : 1678;
                    break;
                case 204:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = iM7006 == 1 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                throw new IllegalStateException(C0289.m5556(m4195(), 0, C0446.f716 ^ 530, 922));
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                mainViewModelM5447 = C0283.m5447(this);
                                C0330.m6365(obj);
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
                    C0330.m6365(obj);
                    String str = (String) C0419.m8214(C0222.m4262(this));
                    int i13 = 48767;
                    while (true) {
                        i13 ^= 48784;
                        switch (i13) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                return C0012.m238();
                            case 76:
                                MainViewModel mainViewModelM7054 = C0360.m7054(this);
                                this.f4714a = mainViewModelM7054;
                                this.f4715b = 1;
                                Object objM8435 = C0431.m8435(C0273.m5255(this), str, this);
                                int i14 = 48891;
                                while (true) {
                                    i14 ^= 48908;
                                    switch (i14) {
                                        case 22:
                                            break;
                                        case 53:
                                            mainViewModelM5447 = mainViewModelM7054;
                                            break;
                                        case 503:
                                            i14 = objM8435 == aVarM5766 ? 49635 : 48953;
                                            break;
                                        case 32495:
                                            return aVarM5766;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            case 239:
                                i13 = str != null ? 48860 : 48829;
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
        C0228.m4382(C0380.m7430(mainViewModelM5447), null);
        return C0012.m238();
    }
}
