package k0;

import a3.C0006;
import a7.C0008;
import aa.C0012;
import b1.C0050;
import com.auto.accept.data.model.C0071;
import com.google.android.gms.auth.api.signin.C0080;
import com.google.android.gms.tasks.C0106;
import com.google.android.play.core.integrity.client.C0107;
import com.google.firebase.appcheck.interop.C0130;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.database.collection.C0138;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.messaging.ktx.C0186;
import com.google.firebase.messaging.reporting.C0188;
import com.google.firebase.remoteconfig.internal.Code;
import d9.C0226;
import dagger.hilt.internal.aggregatedroot.C0246;
import e9.C0266;
import f.C0269;
import h.C0298;
import h8.C0314;
import i.C0315;
import j9.C0329;
import java.util.ArrayList;
import java.util.List;
import k4.C0336;
import m1.C0350;
import m7.C0356;
import r4.C0398;
import w.C0453;
import w6.C0464;
import z.C0481;

/* JADX INFO: loaded from: classes.dex */
public final class i4 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r1.i1 f9043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c9.e f9044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d9.s f9045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f9046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f9047f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c9.f f9048n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f9049o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f9050p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(ArrayList arrayList, r1.i1 i1Var, c9.e eVar, d9.s sVar, long j10, int i10, c9.f fVar, ArrayList arrayList2, int i11) {
        super(1);
        this.f9042a = arrayList;
        this.f9043b = i1Var;
        this.f9044c = eVar;
        this.f9045d = sVar;
        this.f9046e = j10;
        this.f9047f = i10;
        this.f9048n = fVar;
        this.f9049o = arrayList2;
        this.f9050p = i11;
        int iM4717 = C0246.m4717();
        int i12 = 1616;
        while (true) {
            i12 ^= 1633;
            switch (i12) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4717 >= 0) {
                        i12 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.decode(C0329.m6362("hggKijhaJCpLH")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i12 = 1678;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0061. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x00d6. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0010. Please report as an issue. */
    @Override // c9.c
    public final Object invoke(Object obj) {
        r1.w0 w0Var = (r1.w0) obj;
        List listM2083 = C0107.m2083(this);
        int iM171 = C0008.m171(listM2083);
        int i10 = 0;
        while (true) {
            int i11 = 1616;
            while (true) {
                i11 ^= 1633;
                switch (i11) {
                    case Code.UNAVAILABLE /* 14 */:
                        break;
                    case 49:
                        i11 = i10 < iM171 ? 1709 : 1678;
                        break;
                    case 204:
                        break;
                    case 239:
                        break;
                    default:
                        break;
                }
                l4 l4VarM118 = C0006.m118();
                c9.e eVarM7791 = C0398.m7791(this);
                r1.i1 i1VarM6527 = C0336.m6527(this);
                List listM1463 = C0071.m1463(i1VarM6527, l4VarM118, eVarM7791);
                long jM9047 = C0464.m9047(this);
                int iM172 = C0008.m171(listM1463);
                int i12 = 0;
                while (true) {
                    int iM3590 = C0188.m3590(this);
                    int i13 = 1864;
                    while (true) {
                        i13 ^= 1881;
                        switch (i13) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i13 = i12 < iM172 ? 48736 : 48705;
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
                        List listM1464 = C0071.m1463(i1VarM6527, C0138.m2664(), new u0.b((-1621993376) ^ C0266.f346, new v.n0(C0356.f627 ^ 730, C0226.m4351(this), C0106.m2057(this)), true));
                        int iM173 = C0008.m171(listM1464);
                        int i14 = 0;
                        while (true) {
                            int i15 = 48891;
                            while (true) {
                                i15 ^= 48908;
                                switch (i15) {
                                    case 22:
                                        break;
                                    case 53:
                                        break;
                                    case 503:
                                        i15 = i14 < iM173 ? 49635 : 48953;
                                        break;
                                    case 32495:
                                        break;
                                    default:
                                        break;
                                }
                                return C0012.m238();
                            }
                            C0050.m966(w0Var, C0453.m8844((r1.i0) C0315.m6101(listM1464, i14), C0136.m2622(C0080.m1717(this), iM3590)), 0, 0);
                            int i16 = (C0314.f462 ^ 259) + i14;
                            int i17 = 49666;
                            while (true) {
                                i17 ^= 49683;
                                switch (i17) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i17 = 49697;
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                }
                            }
                            i14 = i16;
                        }
                    }
                    r1.x0 x0VarM8844 = C0453.m8844((r1.i0) C0315.m6101(listM1463, i12), C0186.m3547(jM9047, 0, 0, 0, 0, 11));
                    C0050.m966(w0Var, x0VarM8844, 0, ((iM3590 - 15) - C0350.m6867(x0VarM8844)) + 15);
                    int i18 = (C0130.f156 ^ (-58)) + i12;
                    int i19 = 48767;
                    while (true) {
                        i19 ^= 48784;
                        switch (i19) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case 239:
                                i19 = 48798;
                                break;
                        }
                    }
                    i12 = i18;
                }
            }
            C0050.m966(w0Var, (r1.x0) C0315.m6101(listM2083, i10), C0269.m5138(C0481.m9372(this)) * i10, 0);
            int i20 = (C0298.f446 ^ (-140)) + i10;
            int i21 = 1740;
            while (true) {
                i21 ^= 1757;
                switch (i21) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i21 = 1771;
                        break;
                    case 54:
                        break;
                }
            }
            i10 = i20;
        }
    }
}
