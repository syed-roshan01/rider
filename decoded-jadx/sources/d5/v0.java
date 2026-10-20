package d5;

import a.C0000;
import aa.C0012;
import c3.C0062;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.common.api.internal.C0082;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.C0088;
import com.google.android.gms.internal.p000authapiphone.C0091;
import com.google.android.gms.tasks.C0106;
import com.google.firebase.emulators.C0141;
import com.google.firebase.firestore.core.C0153;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.model.C0160;
import com.google.firebase.iid.C0171;
import com.google.firebase.iid.internal.C0168;
import com.google.firebase.internal.api.C0178;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.C0201;
import com.google.firebase.remoteconfig.internal.C0195;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.gson.internal.bind.C0207;
import d2.C0215;
import d9.C0224;
import d9.C0225;
import dagger.hilt.internal.definecomponent.C0249;
import e2.C0261;
import ea.C0268;
import f6.C0277;
import h3.C0301;
import j9.C0329;
import java.util.Map;
import m0.l3;
import m4.C0353;
import m7.C0358;
import o1.C0367;
import o4.C0369;
import p3.C0375;
import p8.C0379;
import s7.C0415;
import t0.C0418;
import t9.C0427;
import u4.C0435;
import v9.C0451;
import y.C0474;
import z3.C0486;
import z3.C0487;

/* JADX INFO: loaded from: classes.dex */
public final class v0 extends d9.j implements c9.g {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f291short = {2653, 2573, 2577, 2576, 2570, 2653, 2609, 2582, 2571, 2576, 2563, 2582, 2583, 2573, 2584, 2581, 2601, 2584, 2590, 2588, 2571};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainViewModel f4797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l3 f4798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l3 f4799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l3 f4800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l3 f4801e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l3 f4802f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l3 f4803n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l3 f4804o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l3 f4805p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l3 f4806q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m9.d0 f4807r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b0.h0 f4808s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(MainViewModel mainViewModel, l3 l3Var, l3 l3Var2, l3 l3Var3, l3 l3Var4, l3 l3Var5, l3 l3Var6, l3 l3Var7, l3 l3Var8, l3 l3Var9, m9.d0 d0Var, b0.h0 h0Var) {
        super(C0379.f650 ^ 314);
        this.f4797a = mainViewModel;
        this.f4798b = l3Var;
        this.f4799c = l3Var2;
        this.f4800d = l3Var3;
        this.f4801e = l3Var4;
        this.f4802f = l3Var5;
        this.f4803n = l3Var6;
        this.f4804o = l3Var7;
        this.f4805p = l3Var8;
        this.f4806q = l3Var9;
        this.f4807r = d0Var;
        this.f4808s = h0Var;
        int iM2938 = C0153.m2938();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2938 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.decode(C0415.m8165("NwAaIef8rReAdxC7nZ")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣۤۢ, reason: not valid java name and contains not printable characters */
    public static short[] m4204() {
        int iM9496 = C0487.m9496();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM9496 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f291short;
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

    @Override // c9.g
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int iM8515 = C0435.m8515((Number) obj2);
        m0.m mVar = (m0.m) obj3;
        C0435.m8515((Number) obj4);
        C0375.m7360((b0.y) obj, C0249.m4771(m4204(), 0, C0367.f638 ^ (-566), 2681));
        l3 l3VarM8387 = C0427.m8387(this);
        l3 l3VarM8373 = C0427.m8373(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8515 != 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    int i11 = C0062.f82 ^ 330;
                    MainViewModel mainViewModelM3051 = C0160.m3051(this);
                    int i12 = 1740;
                    while (true) {
                        i12 ^= 1757;
                        switch (i12) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (iM8515 != 1) {
                                    i12 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                m0.q qVar = (m0.q) mVar;
                                C0261.m4990(qVar, (-1809113325) ^ C0268.f348);
                                C0168.m3207(mainViewModelM3051, C0000.m14((Boolean) C0418.m8214(l3VarM8387)), qVar, i11);
                                C0171.m3270(qVar, false);
                                int i13 = 50813;
                                while (true) {
                                    i13 ^= 50830;
                                    switch (i13) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 243:
                                            i13 = 50844;
                                            break;
                                    }
                                }
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                int i14 = 1864;
                                while (true) {
                                    i14 ^= 1881;
                                    switch (i14) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (iM8515 != 2) {
                                                i14 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            m0.q qVar2 = (m0.q) mVar;
                                            C0261.m4990(qVar2, (-1809113555) ^ C0141.f167);
                                            C0225.m4340(mainViewModelM3051, (Map) C0418.m8214(l3VarM8373), qVar2, C0301.f449 ^ 1014);
                                            C0171.m3270(qVar2, false);
                                            int i15 = 50689;
                                            while (true) {
                                                i15 ^= 50706;
                                                switch (i15) {
                                                    case 19:
                                                        i15 = 50720;
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                }
                                            }
                                            break;
                                        case 47417:
                                            int i16 = 48767;
                                            while (true) {
                                                i16 ^= 48784;
                                                switch (i16) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        m0.q qVar3 = (m0.q) mVar;
                                                        C0261.m4990(qVar3, 1809113510 ^ C0369.f640);
                                                        C0474.m9237(mainViewModelM3051, qVar3, i11);
                                                        C0171.m3270(qVar3, false);
                                                        int i17 = 49914;
                                                        while (true) {
                                                            i17 ^= 49931;
                                                            switch (i17) {
                                                                case 497:
                                                                    i17 = 50596;
                                                                    break;
                                                                case 1711:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 76:
                                                        int i18 = 48891;
                                                        while (true) {
                                                            i18 ^= 48908;
                                                            switch (i18) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    m0.q qVar4 = (m0.q) mVar;
                                                                    C0261.m4990(qVar4, (-1809114029) ^ C0088.f122);
                                                                    C0329.m6360(mainViewModelM3051, qVar4, i11);
                                                                    C0171.m3270(qVar4, false);
                                                                    int i19 = 49790;
                                                                    while (true) {
                                                                        i19 ^= 49807;
                                                                        switch (i19) {
                                                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                break;
                                                                            case 241:
                                                                                i19 = 49821;
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 503:
                                                                    if (iM8515 != 4) {
                                                                        i18 = 49635;
                                                                    }
                                                                    break;
                                                                case 32495:
                                                                    m0.q qVar5 = (m0.q) mVar;
                                                                    C0261.m4990(qVar5, 1809113325 ^ C0106.f132);
                                                                    C0171.m3270(qVar5, false);
                                                                    int i20 = 49666;
                                                                    while (true) {
                                                                        i20 ^= 49683;
                                                                        switch (i20) {
                                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                                i20 = 49697;
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                default:
                                                                    continue;
                                                            }
                                                            i18 = 48953;
                                                        }
                                                        break;
                                                    case 239:
                                                        if (iM8515 != 3) {
                                                            i16 = 48860;
                                                        }
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i16 = 48829;
                                            }
                                            break;
                                        case 47483:
                                            break;
                                        default:
                                            continue;
                                    }
                                    i14 = 48705;
                                }
                                break;
                            default:
                                continue;
                        }
                        i12 = 1802;
                    }
                    break;
                case 239:
                    m0.q qVar6 = (m0.q) mVar;
                    C0261.m4990(qVar6, 1809114531 ^ C0091.f125);
                    C0215.m4104(C0160.m3051(this), C0000.m14((Boolean) C0418.m8214(l3VarM8387)), C0000.m14((Boolean) C0418.m8214(C0486.m9480(this))), C0000.m14((Boolean) C0418.m8214(C0178.m3390(this))), C0000.m14((Boolean) C0418.m8214(C0000.m23(this))), C0435.m8515((Number) C0418.m8214(C0224.m4324(this))), C0435.m8515((Number) C0418.m8214(C0195.m3736(this))), (String) C0418.m8214(C0207.m3948(this)), C0201.m3863((Number) C0418.m8214(C0277.m5374(this))), (Map) C0418.m8214(l3VarM8373), new u.r0(C0451.f722 ^ 734, C0358.m7027(this), C0082.m1755(this)), qVar6, 1073742705 ^ C0353.f624, 0);
                    C0171.m3270(qVar6, false);
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
        return C0012.m238();
    }
}
