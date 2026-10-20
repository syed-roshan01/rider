package f5;

import aa.C0012;
import b7.C0053;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.measurement.internal.C0104;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.annotations.concurrent.C0126;
import com.google.firebase.appcheck.C0131;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.installations.ktx.C0175;
import com.google.firebase.messaging.C0192;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.android.components.C0228;
import h0.C0300;
import h3.C0302;
import h3.C0303;
import j9.C0330;
import n.C0362;
import o7.i2;
import p3.C0376;
import r5.C0400;
import s7.C0415;
import s8.C0418;
import v0.C0444;
import z.C0481;
import z7.C0489;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f399short = {836, 838, 843, 843, 775, 851, 840, 775, 768, 853, 834, 852, 850, 842, 834, 768, 775, 837, 834, 833, 840, 853, 834, 775, 768, 846, 841, 849, 840, 844, 834, 768, 775, 848, 846, 851, 847, 775, 836, 840, 853, 840, 850, 851, 846, 841, 834};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainViewModel f6245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f6247d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(MainViewModel mainViewModel, String str, byte[] bArr, u8.e eVar) {
        super(C0053.f73 ^ (-152), eVar);
        this.f6245b = mainViewModel;
        this.f6246c = str;
        this.f6247d = bArr;
        int iM3346 = C0175.m3346();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3346 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.decode(C0126.m2442("liIQCxW2Vfe34U1E")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟۠, reason: not valid java name and contains not printable characters */
    public static short[] m5335() {
        int iM5797 = C0302.m5797();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5797 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f399short;
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
        String str = "ۣۧ۟";
        MainViewModel mainViewModelM2040 = null;
        String strM8195 = null;
        byte[] bArrM9507 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56350:
                    this = new d0(mainViewModelM2040, strM8195, bArrM9507, eVar);
                    str = "ۥۡۤ";
                    break;
                case 1748765:
                    str = "ۦۡ۠";
                    bArrM9507 = C0489.m9507(this);
                    break;
                case 1752520:
                    return this;
                case 1753477:
                    mainViewModelM2040 = C0104.m2040(this);
                    str = "ۡ۟";
                    break;
                default:
                    str = "ۡۤ۠";
                    strM8195 = C0418.m8195(this);
                    break;
            }
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str = "ۢۨۤ";
        u8.e eVar = null;
        Object objM5820 = obj;
        u8.e eVarM8647 = null;
        q8.l lVarM238 = null;
        m9.d0 d0Var = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56354:
                    str = "۠ۧۢ";
                    lVarM238 = C0012.m238();
                    break;
                case 56356:
                    return objM5820;
                case 1747899:
                    objM5820 = C0303.m5820(this, lVarM238);
                    str = "ۡۥ";
                    break;
                case 1748677:
                    eVarM8647 = C0444.m8647(this, d0Var, eVar);
                    str = "ۣۢ۟";
                    break;
                case 1749574:
                    str = "ۣۡ";
                    this = (d0) eVarM8647;
                    break;
                case 1749854:
                    str = "ۣ۠ۨ";
                    d0Var = (m9.d0) objM5820;
                    break;
                default:
                    str = "ۡۡۥ";
                    eVar = (u8.e) obj2;
                    break;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        Object objM2532;
        v8.a aVarM5766 = C0300.m5766();
        int iM9356 = C0481.m9356(this);
        MainViewModel mainViewModelM2040 = C0104.m2040(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = iM9356 != 0 ? 1709 : 1678;
                    break;
                case 204:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = iM9356 == 1 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                throw new IllegalStateException(C0415.m8127(m5335(), 0, C0192.f216 ^ (-783), 807));
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                C0330.m6365(obj);
                                objM2532 = C0362.m7093((q8.h) obj);
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
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
                    a5.z zVarM7827 = C0400.m7827(mainViewModelM2040);
                    this.f6244a = 1;
                    objM2532 = C0131.m2532(zVarM7827, C0418.m8195(this), C0489.m9507(this), this);
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
                                i13 = objM2532 == aVarM5766 ? 48860 : 48829;
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
        boolean z10 = objM2532 instanceof q8.g;
        int i14 = 48891;
        while (true) {
            i14 ^= 48908;
            switch (i14) {
                case 22:
                    break;
                case 53:
                    break;
                case 503:
                    i14 = ((((z10 ? 1 : 0) ^ 65535) & 1) | ((z10 ? 1 : 0) & 65534)) != 0 ? 49635 : 48953;
                    break;
                case 32495:
                    C0228.m4382(C0376.m7368(mainViewModelM2040), (String) objM2532);
                    break;
                default:
                    break;
            }
        }
        return C0012.m238();
    }
}
