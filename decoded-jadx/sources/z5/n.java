package z5;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a0;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.remoteconfig.internal.Code;
import java.util.ArrayList;
import k6.i7;
import k6.t7;
import k6.x7;
import moe.shizuku.api.BinderContainer;
import o7.i2;

/* JADX INFO: loaded from: classes.dex */
public final class n implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17267a;

    public /* synthetic */ n(int i10) {
        this.f17267a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        long jT0 = 0;
        int iS0 = 0;
        int iS1 = 0;
        int iS2 = 0;
        int iS3 = 0;
        int iS4 = 0;
        boolean zP0 = false;
        boolean zP1 = false;
        int iS5 = 0;
        PendingIntent pendingIntent = null;
        w9.c cVar = null;
        b bVar = null;
        com.google.android.gms.common.internal.z zVar = null;
        ArrayList arrayListW = null;
        Intent intent = null;
        String strV = null;
        Bundle bundleS = null;
        Bundle bundleS2 = null;
        String strV2 = null;
        String strV3 = null;
        String strV4 = null;
        switch (this.f17267a) {
            case 0:
                int iI0 = y3.e.I0(parcel);
                int iS6 = 0;
                String strV5 = null;
                while (parcel.dataPosition() < iI0) {
                    int i10 = parcel.readInt();
                    char c10 = (char) i10;
                    if (c10 == 1) {
                        iS0 = y3.e.s0(i10, parcel);
                    } else if (c10 == 2) {
                        iS6 = y3.e.s0(i10, parcel);
                    } else if (c10 == 3) {
                        pendingIntent = (PendingIntent) y3.e.U(parcel, i10, PendingIntent.CREATOR);
                    } else if (c10 != 4) {
                        y3.e.E0(i10, parcel);
                    } else {
                        strV5 = y3.e.V(i10, parcel);
                    }
                }
                y3.e.e0(iI0, parcel);
                return new b(iS0, iS6, pendingIntent, strV5);
            case 1:
                int iI1 = y3.e.I0(parcel);
                long jT1 = -1;
                while (parcel.dataPosition() < iI1) {
                    int i11 = parcel.readInt();
                    char c11 = (char) i11;
                    if (c11 == 1) {
                        strV4 = y3.e.V(i11, parcel);
                    } else if (c11 == 2) {
                        iS5 = y3.e.s0(i11, parcel);
                    } else if (c11 != 3) {
                        y3.e.E0(i11, parcel);
                    } else {
                        jT1 = y3.e.t0(i11, parcel);
                    }
                }
                y3.e.e0(iI1, parcel);
                return new d(strV4, jT1, iS5);
            case 2:
                int iI2 = y3.e.I0(parcel);
                boolean zP2 = false;
                boolean zP3 = false;
                boolean zP4 = false;
                String strV6 = null;
                IBinder iBinderR0 = null;
                while (parcel.dataPosition() < iI2) {
                    int i12 = parcel.readInt();
                    char c12 = (char) i12;
                    if (c12 == 1) {
                        strV6 = y3.e.V(i12, parcel);
                    } else if (c12 == 2) {
                        zP2 = y3.e.p0(i12, parcel);
                    } else if (c12 == 3) {
                        zP3 = y3.e.p0(i12, parcel);
                    } else if (c12 == 4) {
                        iBinderR0 = y3.e.r0(i12, parcel);
                    } else if (c12 != 5) {
                        y3.e.E0(i12, parcel);
                    } else {
                        zP4 = y3.e.p0(i12, parcel);
                    }
                }
                y3.e.e0(iI2, parcel);
                return new v(strV6, zP2, zP3, iBinderR0, zP4);
            case 3:
                int iI3 = y3.e.I0(parcel);
                int iS7 = 0;
                int iS8 = 0;
                while (parcel.dataPosition() < iI3) {
                    int i13 = parcel.readInt();
                    char c13 = (char) i13;
                    if (c13 == 1) {
                        zP1 = y3.e.p0(i13, parcel);
                    } else if (c13 == 2) {
                        strV3 = y3.e.V(i13, parcel);
                    } else if (c13 == 3) {
                        iS7 = y3.e.s0(i13, parcel);
                    } else if (c13 != 4) {
                        y3.e.E0(i13, parcel);
                    } else {
                        iS8 = y3.e.s0(i13, parcel);
                    }
                }
                y3.e.e0(iI3, parcel);
                return new w(iS7, iS8, strV3, zP1);
            case 4:
                int iI4 = y3.e.I0(parcel);
                boolean zP5 = false;
                IBinder iBinderR1 = null;
                while (parcel.dataPosition() < iI4) {
                    int i14 = parcel.readInt();
                    char c14 = (char) i14;
                    if (c14 == 1) {
                        strV2 = y3.e.V(i14, parcel);
                    } else if (c14 == 2) {
                        iBinderR1 = y3.e.r0(i14, parcel);
                    } else if (c14 == 3) {
                        zP0 = y3.e.p0(i14, parcel);
                    } else if (c14 != 4) {
                        y3.e.E0(i14, parcel);
                    } else {
                        zP5 = y3.e.p0(i14, parcel);
                    }
                }
                y3.e.e0(iI4, parcel);
                return new x(strV2, iBinderR1, zP0, zP5);
            case 5:
                int iI5 = y3.e.I0(parcel);
                long jT2 = 0;
                long jT3 = 0;
                long jT4 = 0;
                boolean zP6 = false;
                String strV7 = null;
                String strV8 = null;
                t7 t7Var = null;
                String strV9 = null;
                k6.v vVar = null;
                k6.v vVar2 = null;
                k6.v vVar3 = null;
                while (parcel.dataPosition() < iI5) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 2:
                            strV7 = y3.e.V(i15, parcel);
                            break;
                        case 3:
                            strV8 = y3.e.V(i15, parcel);
                            break;
                        case 4:
                            t7Var = (t7) y3.e.U(parcel, i15, t7.CREATOR);
                            break;
                        case 5:
                            jT2 = y3.e.t0(i15, parcel);
                            break;
                        case 6:
                            zP6 = y3.e.p0(i15, parcel);
                            break;
                        case 7:
                            strV9 = y3.e.V(i15, parcel);
                            break;
                        case '\b':
                            vVar = (k6.v) y3.e.U(parcel, i15, k6.v.CREATOR);
                            break;
                        case '\t':
                            jT3 = y3.e.t0(i15, parcel);
                            break;
                        case '\n':
                            vVar2 = (k6.v) y3.e.U(parcel, i15, k6.v.CREATOR);
                            break;
                        case 11:
                            jT4 = y3.e.t0(i15, parcel);
                            break;
                        case '\f':
                            vVar3 = (k6.v) y3.e.U(parcel, i15, k6.v.CREATOR);
                            break;
                        default:
                            y3.e.E0(i15, parcel);
                            break;
                    }
                }
                y3.e.e0(iI5, parcel);
                return new k6.e(strV7, strV8, t7Var, jT2, zP6, strV9, vVar, jT3, vVar2, jT4, vVar3);
            case 6:
                int iI6 = y3.e.I0(parcel);
                while (parcel.dataPosition() < iI6) {
                    int i16 = parcel.readInt();
                    if (((char) i16) != 1) {
                        y3.e.E0(i16, parcel);
                    } else {
                        bundleS2 = y3.e.S(i16, parcel);
                    }
                }
                y3.e.e0(iI6, parcel);
                return new k6.j(bundleS2);
            case 7:
                int iI7 = y3.e.I0(parcel);
                while (parcel.dataPosition() < iI7) {
                    int i17 = parcel.readInt();
                    if (((char) i17) != 2) {
                        y3.e.E0(i17, parcel);
                    } else {
                        bundleS = y3.e.S(i17, parcel);
                    }
                }
                y3.e.e0(iI7, parcel);
                return new k6.s(bundleS);
            case 8:
                int iI8 = y3.e.I0(parcel);
                long jT5 = 0;
                String strV10 = null;
                k6.s sVar = null;
                String strV11 = null;
                while (parcel.dataPosition() < iI8) {
                    int i18 = parcel.readInt();
                    char c15 = (char) i18;
                    if (c15 == 2) {
                        strV10 = y3.e.V(i18, parcel);
                    } else if (c15 == 3) {
                        sVar = (k6.s) y3.e.U(parcel, i18, k6.s.CREATOR);
                    } else if (c15 == 4) {
                        strV11 = y3.e.V(i18, parcel);
                    } else if (c15 != 5) {
                        y3.e.E0(i18, parcel);
                    } else {
                        jT5 = y3.e.t0(i18, parcel);
                    }
                }
                y3.e.e0(iI8, parcel);
                return new k6.v(strV10, sVar, strV11, jT5);
            case 9:
                int iI9 = y3.e.I0(parcel);
                while (parcel.dataPosition() < iI9) {
                    int i19 = parcel.readInt();
                    char c16 = (char) i19;
                    if (c16 == 1) {
                        strV = y3.e.V(i19, parcel);
                    } else if (c16 == 2) {
                        jT0 = y3.e.t0(i19, parcel);
                    } else if (c16 != 3) {
                        y3.e.E0(i19, parcel);
                    } else {
                        iS4 = y3.e.s0(i19, parcel);
                    }
                }
                y3.e.e0(iI9, parcel);
                return new i7(strV, jT0, iS4);
            case 10:
                int iI10 = y3.e.I0(parcel);
                long jT6 = 0;
                int iS9 = 0;
                String strV12 = null;
                Long lU0 = null;
                Float fValueOf = null;
                String strV13 = null;
                String strV14 = null;
                Double dValueOf = null;
                while (parcel.dataPosition() < iI10) {
                    int i20 = parcel.readInt();
                    switch ((char) i20) {
                        case 1:
                            iS9 = y3.e.s0(i20, parcel);
                            break;
                        case 2:
                            strV12 = y3.e.V(i20, parcel);
                            break;
                        case 3:
                            jT6 = y3.e.t0(i20, parcel);
                            break;
                        case 4:
                            lU0 = y3.e.u0(i20, parcel);
                            break;
                        case 5:
                            int iZ0 = y3.e.z0(i20, parcel);
                            if (iZ0 != 0) {
                                y3.e.c1(parcel, iZ0, 4);
                                fValueOf = Float.valueOf(parcel.readFloat());
                            } else {
                                fValueOf = null;
                            }
                            break;
                        case 6:
                            strV13 = y3.e.V(i20, parcel);
                            break;
                        case 7:
                            strV14 = y3.e.V(i20, parcel);
                            break;
                        case '\b':
                            int iZ1 = y3.e.z0(i20, parcel);
                            if (iZ1 != 0) {
                                y3.e.c1(parcel, iZ1, 8);
                                dValueOf = Double.valueOf(parcel.readDouble());
                            } else {
                                dValueOf = null;
                            }
                            break;
                        default:
                            y3.e.E0(i20, parcel);
                            break;
                    }
                }
                y3.e.e0(iI10, parcel);
                return new t7(iS9, strV12, jT6, lU0, fValueOf, strV13, strV14, dValueOf);
            case 11:
                int iI11 = y3.e.I0(parcel);
                String strV15 = "";
                String strV16 = strV15;
                String strV17 = strV16;
                long jT7 = 0;
                long jT8 = 0;
                long jT9 = 0;
                long jT10 = 0;
                long jT11 = 0;
                long jT12 = 0;
                long jT13 = 0;
                long jT14 = -2147483648L;
                boolean zP7 = true;
                boolean zP8 = true;
                boolean zP9 = false;
                int iS10 = 0;
                boolean zP10 = false;
                boolean zP11 = false;
                int iS11 = 0;
                String strV18 = null;
                String strV19 = null;
                String strV20 = null;
                String strV21 = null;
                String strV22 = null;
                String strV23 = null;
                String strV24 = null;
                Boolean boolValueOf = null;
                ArrayList arrayListW2 = null;
                String strV25 = null;
                String strV26 = null;
                int iS12 = 100;
                while (parcel.dataPosition() < iI11) {
                    int i21 = parcel.readInt();
                    switch ((char) i21) {
                        case 2:
                            strV18 = y3.e.V(i21, parcel);
                            break;
                        case 3:
                            strV19 = y3.e.V(i21, parcel);
                            break;
                        case 4:
                            strV20 = y3.e.V(i21, parcel);
                            break;
                        case 5:
                            strV21 = y3.e.V(i21, parcel);
                            break;
                        case 6:
                            jT7 = y3.e.t0(i21, parcel);
                            break;
                        case 7:
                            jT8 = y3.e.t0(i21, parcel);
                            break;
                        case '\b':
                            strV22 = y3.e.V(i21, parcel);
                            break;
                        case '\t':
                            zP7 = y3.e.p0(i21, parcel);
                            break;
                        case '\n':
                            zP9 = y3.e.p0(i21, parcel);
                            break;
                        case 11:
                            jT14 = y3.e.t0(i21, parcel);
                            break;
                        case '\f':
                            strV23 = y3.e.V(i21, parcel);
                            break;
                        case '\r':
                            jT9 = y3.e.t0(i21, parcel);
                            break;
                        case Code.UNAVAILABLE /* 14 */:
                            jT10 = y3.e.t0(i21, parcel);
                            break;
                        case 15:
                            iS10 = y3.e.s0(i21, parcel);
                            break;
                        case Code.UNAUTHENTICATED /* 16 */:
                            zP8 = y3.e.p0(i21, parcel);
                            break;
                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
                        case '!':
                        default:
                            y3.e.E0(i21, parcel);
                            break;
                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            zP10 = y3.e.p0(i21, parcel);
                            break;
                        case 19:
                            strV24 = y3.e.V(i21, parcel);
                            break;
                        case 21:
                            int iZ2 = y3.e.z0(i21, parcel);
                            if (iZ2 != 0) {
                                y3.e.c1(parcel, iZ2, 4);
                                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                            } else {
                                boolValueOf = null;
                            }
                            break;
                        case 22:
                            jT11 = y3.e.t0(i21, parcel);
                            break;
                        case 23:
                            arrayListW2 = y3.e.W(i21, parcel);
                            break;
                        case 24:
                            strV25 = y3.e.V(i21, parcel);
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_STRING /* 25 */:
                            strV15 = y3.e.V(i21, parcel);
                            break;
                        case 26:
                            strV16 = y3.e.V(i21, parcel);
                            break;
                        case 27:
                            strV26 = y3.e.V(i21, parcel);
                            break;
                        case 28:
                            zP11 = y3.e.p0(i21, parcel);
                            break;
                        case 29:
                            jT12 = y3.e.t0(i21, parcel);
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                            iS12 = y3.e.s0(i21, parcel);
                            break;
                        case 31:
                            strV17 = y3.e.V(i21, parcel);
                            break;
                        case ' ':
                            iS11 = y3.e.s0(i21, parcel);
                            break;
                        case '\"':
                            jT13 = y3.e.t0(i21, parcel);
                            break;
                    }
                }
                y3.e.e0(iI11, parcel);
                return new x7(strV18, strV19, strV20, strV21, jT7, jT8, strV22, zP7, zP9, jT14, strV23, jT9, jT10, iS10, zP8, zP10, strV24, boolValueOf, jT11, arrayListW2, strV25, strV15, strV16, strV26, zP11, jT12, iS12, strV17, iS11, jT13);
            case 12:
                int iI12 = y3.e.I0(parcel);
                int iS13 = 0;
                while (parcel.dataPosition() < iI12) {
                    int i22 = parcel.readInt();
                    char c17 = (char) i22;
                    if (c17 == 1) {
                        iS3 = y3.e.s0(i22, parcel);
                    } else if (c17 == 2) {
                        iS13 = y3.e.s0(i22, parcel);
                    } else if (c17 != 3) {
                        y3.e.E0(i22, parcel);
                    } else {
                        intent = (Intent) y3.e.U(parcel, i22, Intent.CREATOR);
                    }
                }
                y3.e.e0(iI12, parcel);
                return new n6.b(iS3, iS13, intent);
            case 13:
                int iI13 = y3.e.I0(parcel);
                String strV27 = null;
                while (parcel.dataPosition() < iI13) {
                    int i23 = parcel.readInt();
                    char c18 = (char) i23;
                    if (c18 == 1) {
                        arrayListW = y3.e.W(i23, parcel);
                    } else if (c18 != 2) {
                        y3.e.E0(i23, parcel);
                    } else {
                        strV27 = y3.e.V(i23, parcel);
                    }
                }
                y3.e.e0(iI13, parcel);
                return new n6.f(strV27, arrayListW);
            case Code.UNAVAILABLE /* 14 */:
                int iI14 = y3.e.I0(parcel);
                while (parcel.dataPosition() < iI14) {
                    int i24 = parcel.readInt();
                    char c19 = (char) i24;
                    if (c19 == 1) {
                        iS2 = y3.e.s0(i24, parcel);
                    } else if (c19 != 2) {
                        y3.e.E0(i24, parcel);
                    } else {
                        zVar = (com.google.android.gms.common.internal.z) y3.e.U(parcel, i24, com.google.android.gms.common.internal.z.CREATOR);
                    }
                }
                y3.e.e0(iI14, parcel);
                return new n6.g(iS2, zVar);
            case 15:
                int iI15 = y3.e.I0(parcel);
                a0 a0Var = null;
                while (parcel.dataPosition() < iI15) {
                    int i25 = parcel.readInt();
                    char c20 = (char) i25;
                    if (c20 == 1) {
                        iS1 = y3.e.s0(i25, parcel);
                    } else if (c20 == 2) {
                        bVar = (b) y3.e.U(parcel, i25, b.CREATOR);
                    } else if (c20 != 3) {
                        y3.e.E0(i25, parcel);
                    } else {
                        a0Var = (a0) y3.e.U(parcel, i25, a0.CREATOR);
                    }
                }
                y3.e.e0(iI15, parcel);
                return new n6.h(iS1, bVar, a0Var);
            case Code.UNAUTHENTICATED /* 16 */:
                BinderContainer binderContainer = new BinderContainer();
                binderContainer.f12026a = parcel.readStrongBinder();
                return binderContainer;
            default:
                la.i iVar = new la.i();
                IBinder strongBinder = parcel.readStrongBinder();
                int i26 = w9.b.f16261a;
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("moe.shizuku.server.IRemoteProcess");
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof w9.c)) {
                        w9.a aVar = new w9.a();
                        aVar.f16260a = strongBinder;
                        cVar = aVar;
                    } else {
                        cVar = (w9.c) iInterfaceQueryLocalInterface;
                    }
                }
                iVar.f11428a = cVar;
                return iVar;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f17267a) {
            case 0:
                return new b[i10];
            case 1:
                return new d[i10];
            case 2:
                return new v[i10];
            case 3:
                return new w[i10];
            case 4:
                return new x[i10];
            case 5:
                return new k6.e[i10];
            case 6:
                return new k6.j[i10];
            case 7:
                return new k6.s[i10];
            case 8:
                return new k6.v[i10];
            case 9:
                return new i7[i10];
            case 10:
                return new t7[i10];
            case 11:
                return new x7[i10];
            case 12:
                return new n6.b[i10];
            case 13:
                return new n6.f[i10];
            case Code.UNAVAILABLE /* 14 */:
                return new n6.g[i10];
            case 15:
                return new n6.h[i10];
            case Code.UNAUTHENTICATED /* 16 */:
                return new BinderContainer[i10];
            default:
                return new la.i[i10];
        }
    }
}
