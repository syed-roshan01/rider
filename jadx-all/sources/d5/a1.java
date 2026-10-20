package d5;

import a2.C0005;
import aa.C0012;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.C0195;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.android.components.C0228;
import dagger.hilt.android.internal.C0236;
import dagger.hilt.codegen.C0242;
import e1.C0258;
import f.C0270;
import f4.C0276;
import g.C0284;
import h0.C0300;
import i9.C0322;
import j9.C0330;
import k0.a3;
import l9.C0348;
import m0.C0350;
import m0.l3;
import m7.C0358;
import o8.C0372;
import p7.C0379;
import t0.C0419;
import u0.C0431;

/* JADX INFO: loaded from: classes.dex */
public final class a1 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f244short = {2618, 2616, 2613, 2613, 2681, 2605, 2614, 2681, 2686, 2603, 2620, 2602, 2604, 2612, 2620, 2686, 2681, 2619, 2620, 2623, 2614, 2603, 2620, 2681, 2686, 2608, 2615, 2607, 2614, 2610, 2620, 2686, 2681, 2606, 2608, 2605, 2609, 2681, 2618, 2614, 2603, 2614, 2604, 2605, 2608, 2615, 2620};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MainViewModel f4393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l3 f4395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a3 f4396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MainViewModel f4397e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(l3 l3Var, a3 a3Var, MainViewModel mainViewModel, u8.e eVar) {
        super(C0322.f469 ^ (-619), eVar);
        this.f4395c = l3Var;
        this.f4396d = a3Var;
        this.f4397e = mainViewModel;
        int iM4629 = C0242.m4629();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4629 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.parseLong(C0236.m4532("ggxTYuV02vtPn")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۡۥ۠۠, reason: not valid java name and contains not printable characters */
    public static short[] m4150() {
        int iM6838 = C0350.m6838();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6838 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f244short;
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
        String str = "ۦۥۧ";
        a3 a3VarM5462 = null;
        MainViewModel mainViewModelM3731 = null;
        l3 l3VarM4923 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56418:
                    str = "ۣ۟ۦ";
                    l3VarM4923 = C0258.m4923(this);
                    break;
                case 56568:
                    str = "ۣۥ";
                    mainViewModelM3731 = C0195.m3731(this);
                    break;
                case 1746818:
                    this = new a1(l3VarM4923, a3VarM5462, mainViewModelM3731, eVar);
                    str = "ۡ۟ۨ";
                    break;
                case 1753608:
                    a3VarM5462 = C0284.m5462(this);
                    str = "ۨ۠";
                    break;
                default:
                    return this;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "ۤۦۧ";
        m9.d0 d0Var = null;
        q8.l lVarM238 = null;
        u8.e eVar = null;
        u8.e eVarM5295 = null;
        Object objM7278 = obj;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56418:
                    eVarM5295 = C0276.m5295(this, d0Var, eVar);
                    str = "ۢ۠ۤ";
                    break;
                case 1749606:
                    str = "ۤ۠ۤ";
                    this = (a1) eVarM5295;
                    break;
                case 1751528:
                    str = "ۦ۟ۧ";
                    lVarM238 = C0012.m238();
                    break;
                case 1751717:
                    str = "ۦۣۨ";
                    d0Var = (m9.d0) objM7278;
                    break;
                case 1753422:
                    objM7278 = C0372.m7278(this, lVarM238);
                    str = "ۨ۠ۨ";
                    break;
                case 1755376:
                    return objM7278;
                default:
                    str = "ۣۥ";
                    eVar = (u8.e) obj2;
                    break;
            }
        }
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        MainViewModel mainViewModelM7009;
        v8.a aVarM5766 = C0300.m5766();
        int iM6802 = C0348.m6802(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = iM6802 != 0 ? 1709 : 1678;
                    break;
                case 204:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = iM6802 == 1 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                throw new IllegalStateException(C0005.m102(m4150(), 0, C0270.f349 ^ (-470), 2649));
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                mainViewModelM7009 = C0358.m7009(this);
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
                    String str = (String) C0419.m8214(C0258.m4923(this));
                    int i13 = 48767;
                    while (true) {
                        i13 ^= 48784;
                        switch (i13) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                return C0012.m238();
                            case 76:
                                MainViewModel mainViewModelM3731 = C0195.m3731(this);
                                this.f4393a = mainViewModelM3731;
                                this.f4394b = 1;
                                Object objM8435 = C0431.m8435(C0284.m5462(this), str, this);
                                int i14 = 48891;
                                while (true) {
                                    i14 ^= 48908;
                                    switch (i14) {
                                        case 22:
                                            break;
                                        case 53:
                                            mainViewModelM7009 = mainViewModelM3731;
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
        C0228.m4382(C0379.m7412(mainViewModelM7009), null);
        return C0012.m238();
    }
}
