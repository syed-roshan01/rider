package d5;

import aa.C0012;
import com.google.android.gms.measurement.internal.C0104;
import com.google.firebase.firestore.model.C0160;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.codegen.C0242;
import e1.C0260;
import j2.C0324;
import ja.C0331;
import m9.C0360;
import s7.C0415;

/* JADX INFO: loaded from: classes.dex */
public final class c1 extends d9.j implements c9.a {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f251short = {1900, 1896, 1892, 1890, 1888, 1834, 1839};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b.l f4437b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(b.l lVar, int i10) {
        super(0);
        this.f4436a = i10;
        this.f4437b = lVar;
        int iM7059 = C0360.m7059();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7059 >= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.decode(C0331.m6393("2oSh1vnj")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣ۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static short[] m4157() {
        int iM4959 = C0260.m4959();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4959 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f251short;
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

    @Override // c9.a
    public final Object invoke() {
        q8.l lVarM238 = C0012.m238();
        b.l lVarM3071 = C0160.m3071(this);
        String strM6250 = C0324.m6250(m4157(), 0, C0104.f130 ^ 788, 1797);
        int iM4625 = C0242.m4625(this);
        switch (iM4625) {
            case 0:
                switch (iM4625) {
                    case 0:
                        C0415.m8128(lVarM3071, strM6250);
                        return lVarM238;
                    default:
                        C0415.m8128(lVarM3071, strM6250);
                        int i10 = 1740;
                        while (true) {
                            i10 ^= 1757;
                            switch (i10) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i10 = 1771;
                                    break;
                                case 54:
                                    return lVarM238;
                            }
                        }
                        break;
                }
                break;
            default:
                switch (iM4625) {
                    case 0:
                        C0415.m8128(lVarM3071, strM6250);
                        return lVarM238;
                    default:
                        C0415.m8128(lVarM3071, strM6250);
                        int i11 = 1616;
                        while (true) {
                            i11 ^= 1633;
                            switch (i11) {
                                case Code.UNAVAILABLE /* 14 */:
                                    return lVarM238;
                                case 49:
                                    i11 = 1647;
                                    break;
                            }
                        }
                        break;
                }
                break;
        }
    }
}
