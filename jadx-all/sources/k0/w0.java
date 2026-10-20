package k0;

import aa.C0012;
import com.google.firebase.abt.C0112;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.firestore.remote.C0164;
import com.google.firebase.firestore.remote.C0165;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.android.components.C0228;
import l6.C0344;
import m0.C0350;
import p3.C0376;
import rikka.shizuku.C0407;
import t7.C0426;

/* JADX INFO: loaded from: classes.dex */
public final class w0 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9599b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(float f10, long j10) {
        super(1);
        this.f9598a = f10;
        this.f9599b = j10;
        int iM4380 = C0228.m4380();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4380 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.decode(C0407.m7980("vZxwd")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        g1.g gVar = null;
        float fM7364 = 0.0f;
        float fM2209 = 0.0f;
        float fM6741 = 0.0f;
        int i10 = 0;
        int i11 = 0;
        float f10 = 0.0f;
        float fM22010 = 0.0f;
        long jM3152 = 0;
        long jM2401 = 0;
        long jM6851 = 0;
        String str = "ۢۢۧ";
        q8.l lVarM238 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56322:
                    return lVarM238;
                case 56325:
                    i10 = C0112.f138;
                    str = "ۧۧۡ";
                    break;
                case 56419:
                    C0426.m8335(gVar, jM6851, jM3152, jM2401, fM2209, 0, i11);
                    str = "ۨۨۨ";
                    break;
                case 56448:
                    fM22010 = C0114.m2209(gVar, fM7364);
                    str = "ۣۥ۟";
                    break;
                case 1746935:
                    f10 = i11;
                    str = "ۦۨۨ";
                    break;
                case 1748709:
                    jM2401 = C0124.m2401(gVar);
                    str = "ۦۦ";
                    break;
                case 1749570:
                    fM7364 = C0376.m7364(this);
                    str = "ۥۧۦ";
                    break;
                case 1749671:
                    str = "ۢ۟۟";
                    gVar = (g1.g) obj;
                    break;
                case 1749729:
                    fM6741 = C0114.m2209(gVar, fM7364);
                    str = "ۣۣ۟";
                    break;
                case 1750535:
                    i10 = C0165.f189;
                    str = "ۧۡۢ";
                    break;
                case 1750632:
                    jM6851 = C0350.m6851(this);
                    str = "۠ۥ";
                    break;
                case 1750717:
                    fM7364 = fM22010 / f10;
                    str = "ۦۧۥ";
                    break;
                case 1752708:
                    fM2209 = C0114.m2209(gVar, fM7364);
                    str = "ۣۢۤ";
                    break;
                case 1753668:
                    jM2401 = C0164.m3152(fM6741, fM7364);
                    str = "ۣۢۧ";
                    break;
                case 1753702:
                    fM22010 = fM6741 / f10;
                    str = "ۣۨۥ";
                    break;
                case 1754440:
                    i11 = i10 ^ 293;
                    str = "۟ۧ۟";
                    break;
                case 1754625:
                    i11 = i10 ^ 968;
                    str = "ۣۦ";
                    break;
                case 1755466:
                    jM3152 = C0164.m3152(0.0f, fM22010);
                    str = "ۡۢۦ";
                    break;
                case 1755624:
                    str = "۠ۢ";
                    lVarM238 = C0012.m238();
                    break;
                default:
                    fM6741 = C0344.m6741(jM2401);
                    str = "ۤۤ";
                    break;
            }
        }
    }
}
