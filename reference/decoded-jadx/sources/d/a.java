package d;

import a4.r;
import a4.v0;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.d1;
import androidx.fragment.app.u0;
import androidx.fragment.app.z0;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.a0;
import com.google.android.gms.common.internal.m0;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.internal.z;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.remoteconfig.internal.Code;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import m0.k1;
import m0.l1;
import m0.m1;
import o7.i2;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4292a;

    public /* synthetic */ a(int i10) {
        this.f4292a = i10;
    }

    public static void a(com.google.android.gms.common.internal.j jVar, Parcel parcel, int i10) {
        int iY0 = y3.e.Y0(20293, parcel);
        int i11 = jVar.f3318a;
        y3.e.f1(parcel, 1, 4);
        parcel.writeInt(i11);
        y3.e.f1(parcel, 2, 4);
        parcel.writeInt(jVar.f3319b);
        y3.e.f1(parcel, 3, 4);
        parcel.writeInt(jVar.f3320c);
        y3.e.T0(parcel, 4, jVar.f3321d);
        y3.e.M0(parcel, 5, jVar.f3322e);
        y3.e.V0(parcel, 6, jVar.f3323f, i10);
        y3.e.K0(parcel, 7, jVar.f3324n);
        y3.e.R0(parcel, 8, jVar.f3325o, i10);
        y3.e.V0(parcel, 10, jVar.f3326p, i10);
        y3.e.V0(parcel, 11, jVar.f3327q, i10);
        y3.e.f1(parcel, 12, 4);
        parcel.writeInt(jVar.f3328r ? 1 : 0);
        y3.e.f1(parcel, 13, 4);
        parcel.writeInt(jVar.f3329s);
        boolean z10 = jVar.f3330t;
        y3.e.f1(parcel, 14, 4);
        parcel.writeInt(z10 ? 1 : 0);
        y3.e.T0(parcel, 15, jVar.f3331u);
        y3.e.d1(iY0, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Intent intent = null;
        Bundle bundleS = null;
        Account account = null;
        ArrayList arrayListY = null;
        String strV = null;
        int iS0 = 0;
        switch (this.f4292a) {
            case 0:
                return new b(parcel);
            case 1:
                d7.a.m(parcel, "inParcel");
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                d7.a.j(parcelable);
                return new k((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 2:
                return new a0.c(parcel.readInt());
            case 3:
                return new k1(parcel.readFloat());
            case 4:
                return new l1(parcel.readInt());
            case 5:
                return new m1(parcel.readLong());
            case 6:
                e3.j jVar = new e3.j(parcel);
                jVar.f5118a = parcel.readInt();
                return jVar;
            case 7:
                return new androidx.fragment.app.b(parcel);
            case 8:
                return new androidx.fragment.app.c(parcel);
            case 9:
                u0 u0Var = new u0();
                u0Var.f2039a = parcel.readString();
                u0Var.f2040b = parcel.readInt();
                return u0Var;
            case 10:
                z0 z0Var = new z0();
                z0Var.f2102e = null;
                z0Var.f2103f = new ArrayList();
                z0Var.f2104n = new ArrayList();
                z0Var.f2098a = parcel.createStringArrayList();
                z0Var.f2099b = parcel.createStringArrayList();
                z0Var.f2100c = (androidx.fragment.app.b[]) parcel.createTypedArray(androidx.fragment.app.b.CREATOR);
                z0Var.f2101d = parcel.readInt();
                z0Var.f2102e = parcel.readString();
                z0Var.f2103f = parcel.createStringArrayList();
                z0Var.f2104n = parcel.createTypedArrayList(androidx.fragment.app.c.CREATOR);
                z0Var.f2105o = parcel.createTypedArrayList(u0.CREATOR);
                return z0Var;
            case 11:
                return new d1(parcel);
            case 12:
                r rVar = new r();
                rVar.f1183a = parcel.readInt();
                rVar.f1184b = parcel.readInt();
                rVar.f1185c = parcel.readInt() == 1;
                return rVar;
            case 13:
                a4.u0 u0Var2 = new a4.u0();
                u0Var2.f1191a = parcel.readInt();
                u0Var2.f1192b = parcel.readInt();
                u0Var2.f1194d = parcel.readInt() == 1;
                int i10 = parcel.readInt();
                if (i10 > 0) {
                    int[] iArr = new int[i10];
                    u0Var2.f1193c = iArr;
                    parcel.readIntArray(iArr);
                }
                return u0Var2;
            case Code.UNAVAILABLE /* 14 */:
                v0 v0Var = new v0();
                v0Var.f1195a = parcel.readInt();
                v0Var.f1196b = parcel.readInt();
                int i11 = parcel.readInt();
                v0Var.f1197c = i11;
                if (i11 > 0) {
                    int[] iArr2 = new int[i11];
                    v0Var.f1198d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i12 = parcel.readInt();
                v0Var.f1199e = i12;
                if (i12 > 0) {
                    int[] iArr3 = new int[i12];
                    v0Var.f1200f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                v0Var.f1202o = parcel.readInt() == 1;
                v0Var.f1203p = parcel.readInt() == 1;
                v0Var.f1204q = parcel.readInt() == 1;
                v0Var.f1201n = parcel.readArrayList(a4.u0.class.getClassLoader());
                return v0Var;
            case 15:
                return new ParcelImpl(parcel);
            case Code.UNAUTHENTICATED /* 16 */:
                String string = parcel.readString();
                d7.a.j(string);
                int i13 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i13);
                while (iS0 < i13) {
                    String string2 = parcel.readString();
                    d7.a.j(string2);
                    String string3 = parcel.readString();
                    d7.a.j(string3);
                    linkedHashMap.put(string2, string3);
                    iS0++;
                }
                return new q4.c(string, linkedHashMap);
            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                int iI0 = y3.e.I0(parcel);
                long jT0 = 0;
                String strV2 = null;
                String strV3 = null;
                String strV4 = null;
                String strV5 = null;
                Uri uri = null;
                String strV6 = null;
                String strV7 = null;
                ArrayList arrayListY2 = null;
                String strV8 = null;
                String strV9 = null;
                int iS1 = 0;
                while (parcel.dataPosition() < iI0) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 1:
                            iS1 = y3.e.s0(i14, parcel);
                            break;
                        case 2:
                            strV2 = y3.e.V(i14, parcel);
                            break;
                        case 3:
                            strV3 = y3.e.V(i14, parcel);
                            break;
                        case 4:
                            strV4 = y3.e.V(i14, parcel);
                            break;
                        case 5:
                            strV5 = y3.e.V(i14, parcel);
                            break;
                        case 6:
                            uri = (Uri) y3.e.U(parcel, i14, Uri.CREATOR);
                            break;
                        case 7:
                            strV6 = y3.e.V(i14, parcel);
                            break;
                        case '\b':
                            jT0 = y3.e.t0(i14, parcel);
                            break;
                        case '\t':
                            strV7 = y3.e.V(i14, parcel);
                            break;
                        case '\n':
                            arrayListY2 = y3.e.Y(parcel, i14, Scope.CREATOR);
                            break;
                        case 11:
                            strV8 = y3.e.V(i14, parcel);
                            break;
                        case '\f':
                            strV9 = y3.e.V(i14, parcel);
                            break;
                        default:
                            y3.e.E0(i14, parcel);
                            break;
                    }
                }
                y3.e.e0(iI0, parcel);
                return new GoogleSignInAccount(iS1, strV2, strV3, strV4, strV5, uri, strV6, jT0, strV7, arrayListY2, strV8, strV9);
            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                int iI1 = y3.e.I0(parcel);
                while (parcel.dataPosition() < iI1) {
                    int i15 = parcel.readInt();
                    if (((char) i15) != 1) {
                        y3.e.E0(i15, parcel);
                    } else {
                        intent = (Intent) y3.e.U(parcel, i15, Intent.CREATOR);
                    }
                }
                y3.e.e0(iI1, parcel);
                return new y5.a(intent);
            case 19:
                return new y5.h(parcel.readStrongBinder());
            case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
                int iI2 = y3.e.I0(parcel);
                while (parcel.dataPosition() < iI2) {
                    int i16 = parcel.readInt();
                    char c10 = (char) i16;
                    if (c10 == 1) {
                        iS0 = y3.e.s0(i16, parcel);
                    } else if (c10 != 2) {
                        y3.e.E0(i16, parcel);
                    } else {
                        strV = y3.e.V(i16, parcel);
                    }
                }
                y3.e.e0(iI2, parcel);
                return new Scope(iS0, strV);
            case 21:
                int iI3 = y3.e.I0(parcel);
                String strV10 = null;
                PendingIntent pendingIntent = null;
                z5.b bVar = null;
                int iS2 = 0;
                int iS3 = 0;
                while (parcel.dataPosition() < iI3) {
                    int i17 = parcel.readInt();
                    char c11 = (char) i17;
                    if (c11 == 1) {
                        iS3 = y3.e.s0(i17, parcel);
                    } else if (c11 == 2) {
                        strV10 = y3.e.V(i17, parcel);
                    } else if (c11 == 3) {
                        pendingIntent = (PendingIntent) y3.e.U(parcel, i17, PendingIntent.CREATOR);
                    } else if (c11 == 4) {
                        bVar = (z5.b) y3.e.U(parcel, i17, z5.b.CREATOR);
                    } else if (c11 != '\u03e8') {
                        y3.e.E0(i17, parcel);
                    } else {
                        iS2 = y3.e.s0(i17, parcel);
                    }
                }
                y3.e.e0(iI3, parcel);
                return new Status(iS2, iS3, strV10, pendingIntent, bVar);
            case 22:
                int iI4 = y3.e.I0(parcel);
                while (parcel.dataPosition() < iI4) {
                    int i18 = parcel.readInt();
                    char c12 = (char) i18;
                    if (c12 == 1) {
                        iS0 = y3.e.s0(i18, parcel);
                    } else if (c12 != 2) {
                        y3.e.E0(i18, parcel);
                    } else {
                        arrayListY = y3.e.Y(parcel, i18, p.CREATOR);
                    }
                }
                y3.e.e0(iI4, parcel);
                return new t(iS0, arrayListY);
            case 23:
                int iI5 = y3.e.I0(parcel);
                long jT1 = 0;
                long jT2 = 0;
                int iS4 = -1;
                String strV11 = null;
                String strV12 = null;
                int iS5 = 0;
                int iS6 = 0;
                int iS7 = 0;
                int iS8 = 0;
                while (parcel.dataPosition() < iI5) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case 1:
                            iS5 = y3.e.s0(i19, parcel);
                            break;
                        case 2:
                            iS6 = y3.e.s0(i19, parcel);
                            break;
                        case 3:
                            iS7 = y3.e.s0(i19, parcel);
                            break;
                        case 4:
                            jT1 = y3.e.t0(i19, parcel);
                            break;
                        case 5:
                            jT2 = y3.e.t0(i19, parcel);
                            break;
                        case 6:
                            strV11 = y3.e.V(i19, parcel);
                            break;
                        case 7:
                            strV12 = y3.e.V(i19, parcel);
                            break;
                        case '\b':
                            iS8 = y3.e.s0(i19, parcel);
                            break;
                        case '\t':
                            iS4 = y3.e.s0(i19, parcel);
                            break;
                        default:
                            y3.e.E0(i19, parcel);
                            break;
                    }
                }
                y3.e.e0(iI5, parcel);
                return new p(iS5, iS6, iS7, jT1, jT2, strV11, strV12, iS8, iS4);
            case 24:
                int iI6 = y3.e.I0(parcel);
                GoogleSignInAccount googleSignInAccount = null;
                int iS9 = 0;
                while (parcel.dataPosition() < iI6) {
                    int i20 = parcel.readInt();
                    char c13 = (char) i20;
                    if (c13 == 1) {
                        iS0 = y3.e.s0(i20, parcel);
                    } else if (c13 == 2) {
                        account = (Account) y3.e.U(parcel, i20, Account.CREATOR);
                    } else if (c13 == 3) {
                        iS9 = y3.e.s0(i20, parcel);
                    } else if (c13 != 4) {
                        y3.e.E0(i20, parcel);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) y3.e.U(parcel, i20, GoogleSignInAccount.CREATOR);
                    }
                }
                y3.e.e0(iI6, parcel);
                return new z(iS0, account, iS9, googleSignInAccount);
            case FirestoreIndexValueWriter.INDEX_TYPE_STRING /* 25 */:
                int iI7 = y3.e.I0(parcel);
                IBinder iBinderR0 = null;
                z5.b bVar2 = null;
                int iS10 = 0;
                boolean zP0 = false;
                boolean zP1 = false;
                while (parcel.dataPosition() < iI7) {
                    int i21 = parcel.readInt();
                    char c14 = (char) i21;
                    if (c14 == 1) {
                        iS10 = y3.e.s0(i21, parcel);
                    } else if (c14 == 2) {
                        iBinderR0 = y3.e.r0(i21, parcel);
                    } else if (c14 == 3) {
                        bVar2 = (z5.b) y3.e.U(parcel, i21, z5.b.CREATOR);
                    } else if (c14 == 4) {
                        zP0 = y3.e.p0(i21, parcel);
                    } else if (c14 != 5) {
                        y3.e.E0(i21, parcel);
                    } else {
                        zP1 = y3.e.p0(i21, parcel);
                    }
                }
                y3.e.e0(iI7, parcel);
                return new a0(iS10, iBinderR0, bVar2, zP0, zP1);
            case 26:
                int iI8 = y3.e.I0(parcel);
                int iS11 = 0;
                boolean zP2 = false;
                boolean zP3 = false;
                int iS12 = 0;
                int iS13 = 0;
                while (parcel.dataPosition() < iI8) {
                    int i22 = parcel.readInt();
                    char c15 = (char) i22;
                    if (c15 == 1) {
                        iS11 = y3.e.s0(i22, parcel);
                    } else if (c15 == 2) {
                        zP2 = y3.e.p0(i22, parcel);
                    } else if (c15 == 3) {
                        zP3 = y3.e.p0(i22, parcel);
                    } else if (c15 == 4) {
                        iS12 = y3.e.s0(i22, parcel);
                    } else if (c15 != 5) {
                        y3.e.E0(i22, parcel);
                    } else {
                        iS13 = y3.e.s0(i22, parcel);
                    }
                }
                y3.e.e0(iI8, parcel);
                return new com.google.android.gms.common.internal.r(iS11, zP2, zP3, iS12, iS13);
            case 27:
                int iI9 = y3.e.I0(parcel);
                z5.d[] dVarArr = null;
                com.google.android.gms.common.internal.i iVar = null;
                while (parcel.dataPosition() < iI9) {
                    int i23 = parcel.readInt();
                    char c16 = (char) i23;
                    if (c16 == 1) {
                        bundleS = y3.e.S(i23, parcel);
                    } else if (c16 == 2) {
                        dVarArr = (z5.d[]) y3.e.X(parcel, i23, z5.d.CREATOR);
                    } else if (c16 == 3) {
                        iS0 = y3.e.s0(i23, parcel);
                    } else if (c16 != 4) {
                        y3.e.E0(i23, parcel);
                    } else {
                        iVar = (com.google.android.gms.common.internal.i) y3.e.U(parcel, i23, com.google.android.gms.common.internal.i.CREATOR);
                    }
                }
                y3.e.e0(iI9, parcel);
                m0 m0Var = new m0();
                m0Var.f3340a = bundleS;
                m0Var.f3341b = dVarArr;
                m0Var.f3342c = iS0;
                m0Var.f3343d = iVar;
                return m0Var;
            case 28:
                int iI10 = y3.e.I0(parcel);
                com.google.android.gms.common.internal.r rVar2 = null;
                int[] iArr4 = null;
                int[] iArr5 = null;
                boolean zP4 = false;
                boolean zP5 = false;
                int iS14 = 0;
                while (parcel.dataPosition() < iI10) {
                    int i24 = parcel.readInt();
                    switch ((char) i24) {
                        case 1:
                            rVar2 = (com.google.android.gms.common.internal.r) y3.e.U(parcel, i24, com.google.android.gms.common.internal.r.CREATOR);
                            break;
                        case 2:
                            zP4 = y3.e.p0(i24, parcel);
                            break;
                        case 3:
                            zP5 = y3.e.p0(i24, parcel);
                            break;
                        case 4:
                            int iZ0 = y3.e.z0(i24, parcel);
                            int iDataPosition = parcel.dataPosition();
                            if (iZ0 != 0) {
                                int[] iArrCreateIntArray = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition + iZ0);
                                iArr4 = iArrCreateIntArray;
                            } else {
                                iArr4 = null;
                            }
                            break;
                        case 5:
                            iS14 = y3.e.s0(i24, parcel);
                            break;
                        case 6:
                            int iZ1 = y3.e.z0(i24, parcel);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iZ1 != 0) {
                                int[] iArrCreateIntArray2 = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition2 + iZ1);
                                iArr5 = iArrCreateIntArray2;
                            } else {
                                iArr5 = null;
                            }
                            break;
                        default:
                            y3.e.E0(i24, parcel);
                            break;
                    }
                }
                y3.e.e0(iI10, parcel);
                return new com.google.android.gms.common.internal.i(rVar2, zP4, zP5, iArr4, iS14, iArr5);
            default:
                int iI11 = y3.e.I0(parcel);
                Scope[] scopeArr = com.google.android.gms.common.internal.j.f3316v;
                Bundle bundle = new Bundle();
                z5.d[] dVarArr2 = com.google.android.gms.common.internal.j.f3317w;
                z5.d[] dVarArr3 = dVarArr2;
                String strV13 = null;
                IBinder iBinderR1 = null;
                Account account2 = null;
                String strV14 = null;
                int iS15 = 0;
                int iS16 = 0;
                int iS17 = 0;
                boolean zP6 = false;
                int iS18 = 0;
                boolean zP7 = false;
                while (parcel.dataPosition() < iI11) {
                    int i25 = parcel.readInt();
                    switch ((char) i25) {
                        case 1:
                            iS15 = y3.e.s0(i25, parcel);
                            break;
                        case 2:
                            iS16 = y3.e.s0(i25, parcel);
                            break;
                        case 3:
                            iS17 = y3.e.s0(i25, parcel);
                            break;
                        case 4:
                            strV13 = y3.e.V(i25, parcel);
                            break;
                        case 5:
                            iBinderR1 = y3.e.r0(i25, parcel);
                            break;
                        case 6:
                            scopeArr = (Scope[]) y3.e.X(parcel, i25, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = y3.e.S(i25, parcel);
                            break;
                        case '\b':
                            account2 = (Account) y3.e.U(parcel, i25, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            y3.e.E0(i25, parcel);
                            break;
                        case '\n':
                            dVarArr2 = (z5.d[]) y3.e.X(parcel, i25, z5.d.CREATOR);
                            break;
                        case 11:
                            dVarArr3 = (z5.d[]) y3.e.X(parcel, i25, z5.d.CREATOR);
                            break;
                        case '\f':
                            zP6 = y3.e.p0(i25, parcel);
                            break;
                        case '\r':
                            iS18 = y3.e.s0(i25, parcel);
                            break;
                        case Code.UNAVAILABLE /* 14 */:
                            zP7 = y3.e.p0(i25, parcel);
                            break;
                        case 15:
                            strV14 = y3.e.V(i25, parcel);
                            break;
                    }
                }
                y3.e.e0(iI11, parcel);
                return new com.google.android.gms.common.internal.j(iS15, iS16, iS17, strV13, iBinderR1, scopeArr, bundle, account2, dVarArr2, dVarArr3, zP6, iS18, zP7, strV14);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f4292a) {
            case 0:
                return new b[i10];
            case 1:
                return new k[i10];
            case 2:
                return new a0.c[i10];
            case 3:
                return new k1[i10];
            case 4:
                return new l1[i10];
            case 5:
                return new m1[i10];
            case 6:
                return new e3.j[i10];
            case 7:
                return new androidx.fragment.app.b[i10];
            case 8:
                return new androidx.fragment.app.c[i10];
            case 9:
                return new u0[i10];
            case 10:
                return new z0[i10];
            case 11:
                return new d1[i10];
            case 12:
                return new r[i10];
            case 13:
                return new a4.u0[i10];
            case Code.UNAVAILABLE /* 14 */:
                return new v0[i10];
            case 15:
                return new ParcelImpl[i10];
            case Code.UNAUTHENTICATED /* 16 */:
                return new q4.c[i10];
            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return new GoogleSignInAccount[i10];
            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return new y5.a[i10];
            case 19:
                return new y5.h[i10];
            case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
                return new Scope[i10];
            case 21:
                return new Status[i10];
            case 22:
                return new t[i10];
            case 23:
                return new p[i10];
            case 24:
                return new z[i10];
            case FirestoreIndexValueWriter.INDEX_TYPE_STRING /* 25 */:
                return new a0[i10];
            case 26:
                return new com.google.android.gms.common.internal.r[i10];
            case 27:
                return new m0[i10];
            case 28:
                return new com.google.android.gms.common.internal.i[i10];
            default:
                return new com.google.android.gms.common.internal.j[i10];
        }
    }
}
