package k6;

import android.support.v4.graphics.drawable.C0016;
import b.C0049;
import b1.C0050;
import com.google.firebase.components.C0134;
import com.google.firebase.components.C0135;
import com.google.firebase.encoders.C0143;
import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.model.C0161;
import com.google.firebase.inject.C0172;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.messaging.C0191;
import com.google.firebase.messaging.reporting.C0189;
import com.google.firebase.remoteconfig.C0201;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.ktx.C0199;
import com.google.gson.internal.bind.C0207;
import d1.C0214;
import d9.C0225;
import dagger.hilt.android.migration.C0239;
import dagger.hilt.internal.componenttreedeps.C0249;
import ga.C0296;
import l0.C0340;
import l2.C0342;
import m5.C0355;
import o1.C0368;
import p5.C0378;
import q0.C0382;
import t1.C0420;
import v7.C0449;
import v9.C0452;
import w.C0454;
import w0.C0455;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f10094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f10095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f10096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f10097e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i f10098f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final i f10099n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final i f10100o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final i f10101p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final i[] f10102q;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f550short = {1621, 1614, 1619, 1605, 1620, 757, 738, 746, 744, 755, 738, 760, 739, 738, 737, 742, 754, 747, 755, 483, 500, 508, 510, 485, 500, 494, 501, 500, 509, 500, 502, 496, 485, 504, 510, 511, 2511, 2499, 2508, 2507, 2500, 2503, 2513, 2518, 1210, 1213, 1210, 1191, 1210, 1202, 1215, 1210, 1193, 1202, 1191, 1210, 1212, 1213, 2204, 2189, 2196, 1360, 1371, 1370, 1375, 1367, 1356, 1362, 1360, 1360, 1372, 1350, 1373, 1351, 1573, 1570, 1578, 1583, 1584, 1570, 1573, 1574};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f10103a;

    static {
        i iVar = new i(C0143.m2756(f550short, 0, C0449.f719 ^ (-826), 1536), 0, '0');
        f10094b = iVar;
        i iVar2 = new i(C0161.m3082(f550short, 5, C0135.f161 ^ (-907), 679), 1, '1');
        f10095c = iVar2;
        i iVar3 = new i(C0142.m2731(f550short, 19, C0214.f237 ^ (-32), 433), C0382.f652 ^ (-18), '2');
        f10096d = iVar3;
        i iVar4 = new i(C0454.m8856(f550short, 36, C0016.f36 ^ (-868), 2434), C0199.f223 ^ (-53), '3');
        f10097e = iVar4;
        i iVar5 = new i(C0173.m3297(f550short, 44, C0452.f722 ^ 706, 1267), C0340.f610 ^ (-973), '4');
        f10098f = iVar5;
        i iVar6 = new i(C0189.m3620(f550short, 58, C0172.f196 ^ 291, 2269), C0378.f648 ^ 186, '5');
        f10099n = iVar6;
        i iVar7 = new i(C0249.m4755(f550short, 61, C0201.f225 ^ 49, 1299), C0225.f304 ^ 852, '6');
        f10100o = iVar7;
        i iVar8 = new i(C0050.m980(f550short, 74, C0455.f725 ^ 316, 1635), C0355.f625 ^ 302, '9');
        f10101p = iVar8;
        i[] iVarArr = new i[8];
        iVarArr[C0368.f638 ^ (-545)] = iVar;
        iVarArr[C0191.f215 ^ (-449)] = iVar2;
        iVarArr[C0134.f160 ^ (-861)] = iVar3;
        iVarArr[C0420.f690 ^ 89] = iVar4;
        iVarArr[C0049.f69 ^ 299] = iVar5;
        iVarArr[C0207.f231 ^ (-624)] = iVar6;
        iVarArr[C0239.f318 ^ (-769)] = iVar7;
        iVarArr[C0342.f612 ^ (-758)] = iVar8;
        f10102q = iVarArr;
    }

    public i(String str, int i10, char c10) {
        super(str, i10);
        this.f10103a = c10;
        int iM5679 = C0296.m5679();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5679 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.parseLong(C0172.m3287("IFOkfIhTnBy5Ts9Vl2")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    public static i[] values() {
        return (i[]) f10102q.clone();
    }
}
