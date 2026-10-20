package f0;

import com.google.android.play.core.integrity.client.C0108;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.remoteconfig.internal.Code;
import e2.C0263;
import ea.C0269;
import l0.C0341;
import o7.i2;
import o8.C0372;
import p3.C0376;
import w6.C0465;
import z8.C0493;

/* JADX INFO: loaded from: classes.dex */
public final class m0 implements y0.p {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f366short = {2416, 2428, 2429, 2407, 2422, 2411, 2407};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m0 f5815a = new m0();

    /* JADX INFO: renamed from: ۣ۟۠ۦ۟, reason: not valid java name and contains not printable characters */
    public static short[] m5195() {
        int iM7283 = C0372.m7283();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7283 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f366short;
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

    @Override // u8.j
    public final u8.j O(u8.j jVar) {
        String str = "ۢۧ";
        short[] sArrM5195 = null;
        String strM6675 = null;
        u8.j jVarM2092 = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56389:
                    sArrM5195 = m5195();
                    str = "ۥۣ۠";
                    break;
                case 1746696:
                    str = "ۣۨۨ";
                    jVarM2092 = C0108.m2092(this, jVar);
                    break;
                case 1750630:
                    C0376.m7360(jVar, strM6675);
                    str = "۟۟ۨ";
                    break;
                case 1750819:
                    return jVarM2092;
                case 1752578:
                    i10 = C0269.f348;
                    str = "ۥۧۡ";
                    break;
                case 1752703:
                    i11 = i10 ^ 761;
                    str = "ۦۤۨ";
                    break;
                default:
                    str = "ۣۢۥ";
                    strM6675 = C0341.m6675(sArrM5195, 0, i11, 2323);
                    break;
            }
        }
    }

    @Override // y0.p
    public final float P() {
        return 1.0f;
    }

    @Override // u8.j
    public final Object e(Object obj, c9.e eVar) {
        return C0465.m9049(eVar, obj, this);
    }

    @Override // u8.j
    public final u8.h f(u8.i iVar) {
        return C0493.m9570(this, iVar);
    }

    @Override // u8.j
    public final u8.j u(u8.i iVar) {
        return C0263.m5003(this, iVar);
    }
}
