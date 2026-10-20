package k0;

import a3.C0006;
import a7.C0008;
import aa.C0012;
import android.support.v4.graphics.drawable.C0016;
import androidx.compose.ui.draw.C0029;
import androidx.compose.ui.input.pointer.C0034;
import c7.C0069;
import com.google.android.gms.common.internal.C0084;
import com.google.android.gms.internal.stats.C0100;
import com.google.firebase.C0205;
import com.google.firebase.analytics.ktx.ktxtesting.C0118;
import com.google.firebase.firestore.bundle.C0148;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.messaging.C0191;
import com.google.firebase.messaging.C0192;
import com.google.firebase.messaging.reporting.C0189;
import com.google.firebase.remoteconfig.C0200;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.internal.definecomponent.C0250;
import e0.C0257;
import i.C0316;
import java.util.ArrayList;
import java.util.List;
import m9.C0360;
import n.C0361;
import n1.C0363;
import n9.C0367;
import p5.C0378;
import p8.C0381;
import s8.C0418;
import t2.C0421;
import t2.C0424;
import u7.C0438;
import v0.C0443;

/* JADX INFO: loaded from: classes.dex */
public final class m2 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f9208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f9209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f9210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b3.s f9211e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f9212f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f9213n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final y.i1 f9214o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r1.i1 f9215p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f9216q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f9217r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Integer f9218s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List f9219t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Integer f9220u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, b3.s sVar, int i10, int i11, y.i1 i1Var, r1.i1 i1Var2, int i12, int i13, Integer num, ArrayList arrayList5, Integer num2) {
        super(1);
        this.f9207a = arrayList;
        this.f9208b = arrayList2;
        this.f9209c = arrayList3;
        this.f9210d = arrayList4;
        this.f9211e = sVar;
        this.f9212f = i10;
        this.f9213n = i11;
        this.f9214o = i1Var;
        this.f9215p = i1Var2;
        this.f9216q = i12;
        this.f9217r = i13;
        this.f9218s = num;
        this.f9219t = arrayList5;
        this.f9220u = num2;
        int iM568 = C0029.m568();
        int i14 = 1616;
        while (true) {
            i14 ^= 1633;
            switch (i14) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM568 >= 0) {
                        i14 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.decode(C0257.m4895("OkAG2DMixOLKfG6s46RmTh")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i14 = 1678;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0044. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x0085. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:47:0x00f2. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0010. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:61:0x012a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:81:0x017a. Please report as an issue. */
    @Override // c9.c
    public final Object invoke(Object obj) {
        int iM7190;
        int i10 = 0;
        r1.w0 w0Var = (r1.w0) obj;
        List listM3832 = C0200.m3832(this);
        int iM171 = C0008.m171(listM3832);
        int i11 = 0;
        while (true) {
            int i12 = 1616;
            while (true) {
                i12 ^= 1633;
                switch (i12) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i12 = i11 < iM171 ? 1709 : 1678;
                        break;
                    case 204:
                        break;
                    case 239:
                        break;
                    default:
                        break;
                }
                List listM2834 = C0148.m2834(this);
                int iM172 = C0008.m171(listM2834);
                int i13 = 0;
                while (true) {
                    int i14 = 1864;
                    while (true) {
                        i14 ^= 1881;
                        switch (i14) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i14 = i13 < iM172 ? 48736 : 48705;
                                break;
                            case 47384:
                                break;
                            case 47417:
                                break;
                            case 47483:
                                break;
                            default:
                                break;
                        }
                        List listM3674 = C0192.m3674(this);
                        int iM173 = C0008.m171(listM3674);
                        int i15 = 0;
                        while (true) {
                            int iM2287 = C0118.m2287(this);
                            int i16 = 48891;
                            while (true) {
                                i16 ^= 48908;
                                switch (i16) {
                                    case 22:
                                        break;
                                    case 53:
                                        break;
                                    case 503:
                                        i16 = i15 < iM173 ? 49635 : 48953;
                                        break;
                                    case 32495:
                                        break;
                                    default:
                                        break;
                                }
                                List listM7106 = C0363.m7106(this);
                                int iM174 = C0008.m171(listM7106);
                                int i17 = 0;
                                while (true) {
                                    int i18 = 49790;
                                    while (true) {
                                        i18 ^= 49807;
                                        switch (i18) {
                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                break;
                                            case 51:
                                                break;
                                            case 84:
                                                break;
                                            case 241:
                                                i18 = i17 < iM174 ? 49883 : 49852;
                                                break;
                                            default:
                                                break;
                                        }
                                        b3.s sVarM1333 = C0069.m1333(this);
                                        int i19 = 51588;
                                        while (true) {
                                            i19 ^= 51605;
                                            switch (i19) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    if (sVarM1333 != null) {
                                                        i19 = 51681;
                                                    }
                                                    break;
                                                case 54:
                                                    break;
                                                case 87:
                                                    break;
                                                case 116:
                                                    List listM7399 = C0378.m7399(this);
                                                    int iM175 = C0008.m171(listM7399);
                                                    while (true) {
                                                        int i20 = 51712;
                                                        while (true) {
                                                            i20 ^= 51729;
                                                            switch (i20) {
                                                                case Code.UNAVAILABLE /* 14 */:
                                                                    break;
                                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i20 = i10 < iM175 ? 51805 : 51774;
                                                                    break;
                                                                case 47:
                                                                    break;
                                                                case 76:
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                            break;
                                                        }
                                                        r1.x0 x0Var = (r1.x0) C0316.m6101(listM7399, i10);
                                                        Integer numM117 = C0006.m117(this);
                                                        C0189.m3608(numM117);
                                                        C0016.m326(w0Var, x0Var, C0100.m1960(sVarM1333), ((iM2287 - 20) - C0367.m7190(numM117)) + 20);
                                                        i10 += C0418.f688 ^ 540;
                                                        int i21 = 51836;
                                                        while (true) {
                                                            i21 ^= 51853;
                                                            switch (i21) {
                                                                case 241:
                                                                    i21 = 52518;
                                                                    break;
                                                                case 1963:
                                                                    break;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            i19 = 51650;
                                        }
                                        return C0012.m238();
                                    }
                                    r1.x0 x0Var2 = (r1.x0) C0316.m6101(listM7106, i17);
                                    Integer numM4768 = C0250.m4768(this);
                                    int i22 = 49914;
                                    while (true) {
                                        i22 ^= 49931;
                                        switch (i22) {
                                            case 497:
                                                i22 = numM4768 != null ? 50658 : 50627;
                                                break;
                                            case 1711:
                                                break;
                                            case 1736:
                                                iM7190 = 0;
                                                break;
                                            case 1769:
                                                iM7190 = C0367.m7190(numM4768);
                                                int i23 = 50689;
                                                while (true) {
                                                    i23 ^= 50706;
                                                    switch (i23) {
                                                        case 19:
                                                            i23 = 50720;
                                                            break;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                    break;
                                                }
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    C0016.m326(w0Var, x0Var2, 0, ((iM2287 + 0) - iM7190) + 0);
                                    int i24 = (C0381.f651 ^ (-707)) + i17;
                                    int i25 = 50813;
                                    while (true) {
                                        i25 ^= 50830;
                                        switch (i25) {
                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                break;
                                            case 243:
                                                i25 = 50844;
                                                break;
                                        }
                                    }
                                    i17 = i24;
                                }
                            }
                            r1.x0 x0Var3 = (r1.x0) C0316.m6101(listM3674, i15);
                            int iM8549 = (((C0438.m8549(this) + 18) - C0084.m1810(this)) - 18) / (C0029.f49 ^ (-483));
                            r1.i1 i1VarM8632 = C0443.m8632(this);
                            C0016.m326(w0Var, x0Var3, (iM8549 + (C0421.m8261(C0034.m659(this), i1VarM8632, C0360.m7050(i1VarM8632)) + 19)) - 19, ((iM2287 + 21) - C0424.m8297(this)) - 21);
                            int i26 = (C0191.f215 ^ (-449)) + i15;
                            int i27 = 49666;
                            while (true) {
                                i27 ^= 49683;
                                switch (i27) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i27 = 49697;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                }
                            }
                            i15 = i26;
                        }
                    }
                    C0016.m326(w0Var, (r1.x0) C0316.m6101(listM2834, i13), 0, 0);
                    int i28 = (C0361.f631 ^ 739) + i13;
                    int i29 = 48767;
                    while (true) {
                        i29 ^= 48784;
                        switch (i29) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case 239:
                                i29 = 48798;
                                break;
                        }
                    }
                    i13 = i28;
                }
            }
            C0016.m326(w0Var, (r1.x0) C0316.m6101(listM3832, i11), 0, 0);
            int i30 = (C0205.f229 ^ 428) + i11;
            int i31 = 1740;
            while (true) {
                i31 ^= 1757;
                switch (i31) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i31 = 1771;
                        break;
                    case 54:
                        break;
                }
            }
            i11 = i30;
        }
    }
}
