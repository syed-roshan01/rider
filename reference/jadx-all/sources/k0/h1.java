package k0;

import com.google.firebase.abt.C0112;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.components.C0135;
import com.google.firebase.firebase_analytics.C0144;
import com.google.firebase.iid.C0171;
import e2.C0262;
import h7.C0313;
import w0.C0455;
import y.C0476;

/* JADX INFO: loaded from: classes.dex */
public final class h1 implements j0.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h1 f8968a = new h1();

    @Override // j0.w
    public final j0.h a(m0.m mVar) {
        String str = "ۦ۟ۧ";
        m0.q qVar = null;
        j0.h hVarM6043 = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56443:
                    C0171.m3270(qVar, false);
                    str = "۟ۨ۟";
                    break;
                case 1746966:
                    return hVarM6043;
                case 1748675:
                    C0262.m4990(qVar, i10);
                    str = "ۦ۟ۦ";
                    break;
                case 1752546:
                    i10 = (-1285764124) ^ i11;
                    str = "ۣۡۡ";
                    break;
                case 1753421:
                    str = "ۤ۟";
                    hVarM6043 = C0313.m6043();
                    break;
                case 1753422:
                    qVar = (m0.q) mVar;
                    str = "ۣۢۨ";
                    break;
                default:
                    i11 = C0144.f170;
                    str = "ۥۢ۟";
                    break;
            }
        }
    }

    @Override // j0.w
    public final long b(m0.m mVar) {
        long jM8864 = 0;
        String str = "ۥۨۦ";
        m0.q qVar = null;
        m0.p0 p0VarM2168 = null;
        Object objM9256 = null;
        e1.r rVar = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56418:
                    jM8864 = C0455.m8864(rVar);
                    str = "ۦۤۨ";
                    break;
                case 1748866:
                    objM9256 = C0476.m9256(qVar, p0VarM2168);
                    str = "ۣۨۧ";
                    break;
                case 1749697:
                    str = "ۡۧۨ";
                    p0VarM2168 = C0112.m2168();
                    break;
                case 1749822:
                    C0262.m4990(qVar, i10);
                    str = "ۣۢۢ";
                    break;
                case 1750564:
                    return jM8864;
                case 1752739:
                    str = "ۧۦۢ";
                    qVar = (m0.q) mVar;
                    break;
                case 1753578:
                    C0171.m3270(qVar, false);
                    str = "ۣ۠ۡ";
                    break;
                case 1754595:
                    i11 = C0135.f161;
                    str = "ۣ۟ۨ";
                    break;
                case 1755588:
                    str = "ۣۥ";
                    rVar = (e1.r) objM9256;
                    break;
                default:
                    i10 = 2059469737 ^ i11;
                    str = "ۣۢۧ";
                    break;
            }
        }
    }
}
