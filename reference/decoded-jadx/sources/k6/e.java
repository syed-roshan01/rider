package k6;

import a8.C0009;
import aa.C0011;
import android.os.C0013;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.C0044;
import androidx.versionedparcelable.C0048;
import com.google.android.gms.common.C0087;
import com.google.android.gms.internal.tasks.C0103;
import com.google.firebase.abt.C0112;
import com.google.firebase.analytics.ktxtesting.C0122;
import com.google.firebase.annotations.C0128;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.measurement.C0181;
import com.google.firebase.measurement.C0182;
import com.google.firebase.messaging.C0191;
import com.google.firebase.provider.C0194;
import com.google.firebase.remoteconfig.internal.Code;
import d9.C0222;
import dagger.hilt.android.components.C0229;
import dagger.hilt.internal.aggregatedroot.codegen.C0245;
import e0.C0256;
import f.C0270;
import h0.C0299;
import h5.C0307;
import h6.C0309;
import h7.C0311;
import i4.C0317;
import i5.C0318;
import j2.C0323;
import j3.C0325;
import q7.C0390;
import u1.C0432;
import v0.C0440;
import w5.C0463;
import y.C0475;
import z.C0481;
import z1.C0483;

/* JADX INFO: loaded from: classes.dex */
public final class e extends a6.a {
    public static final Parcelable.Creator<e> CREATOR = new z5.n(C0299.f447 ^ 612);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f9987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f9988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t7 f9989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f9990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9991e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f9992f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final v f9993n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f9994o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public v f9995p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f9996q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final v f9997r;

    public e(String str, String str2, t7 t7Var, long j10, boolean z10, String str3, v vVar, long j11, v vVar2, long j12, v vVar3) {
        this.f9987a = str;
        this.f9988b = str2;
        this.f9989c = t7Var;
        this.f9990d = j10;
        this.f9991e = z10;
        this.f9992f = str3;
        this.f9993n = vVar;
        this.f9994o = j11;
        this.f9995p = vVar2;
        this.f9996q = j12;
        this.f9997r = vVar3;
        int iM6259 = C0323.m6259();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6259 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.decode(C0009.m190("hbEBbzS7BPz8PeX0tkMCRkX")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public e(e eVar) {
        C0270.m5173(eVar);
        this.f9987a = C0475.m9253(eVar);
        this.f9988b = C0013.m266(eVar);
        this.f9989c = C0325.m6291(eVar);
        this.f9990d = C0194.m3723(eVar);
        this.f9991e = C0440.m8588(eVar);
        this.f9992f = C0122.m2358(eVar);
        this.f9993n = C0390.m7647(eVar);
        this.f9994o = C0309.m5980(eVar);
        this.f9995p = C0011.m224(eVar);
        this.f9996q = C0112.m2158(eVar);
        this.f9997r = C0087.m1862(eVar);
        int iM6144 = C0317.m6144();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6144 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.decode(C0222.m4278("ZdqOw3xMn0GOFn74iiXov0lJd2E2H")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM1863 = 0;
        int i11 = 0;
        int i12 = 0;
        String strM9253 = null;
        t7 t7VarM6291 = null;
        long jM5980 = 0;
        int i13 = 0;
        int i14 = 0;
        boolean zM8588 = false;
        v vVarM7647 = null;
        String str = "\u06e8\u06e0\u06e5";
        while (true) {
            switch (C0124.m2383(str)) {
                case 56540:
                    C0229.m4414(parcel, i13, i14);
                    jM5980 = C0112.m2158(this);
                    str = "\u06e8\u06e1\u06e8";
                    break;
                case 1746812:
                    zM8588 = C0440.m8588(this);
                    i11 = C0256.f336;
                    str = "\u06e0\u06e8\u06e4";
                    break;
                case 1747687:
                    i11 = C0245.f325;
                    i12 = i11 ^ 290;
                    str = "\u06e7\u06e5\u06e6";
                    break;
                case 1747840:
                    C0307.m5948(parcel, i11, vVarM7647, i10);
                    C0318.m6160(iM1863, parcel);
                    str = "\u06e6\u06e2\u06e3";
                    break;
                case 1747932:
                    i13 = i11 ^ (-850);
                    C0229.m4414(parcel, i13, i12);
                    str = "\u06e7\u06df\u06e7";
                    break;
                case 1748888:
                    i12 = i11 ^ (-172);
                    strM9253 = C0013.m266(this);
                    str = "\u06e2\u06e8\u06e2";
                    break;
                case 1748891:
                    C0229.m4414(parcel, i11, i14);
                    C0044.m853(parcel, jM5980);
                    str = "\u06e5\u06e5\u06df";
                    break;
                case 1749703:
                    i13 = i11 ^ (-455);
                    strM9253 = C0122.m2358(this);
                    str = "\u06e8\u06e4\u06e4";
                    break;
                case 1749729:
                    i11 = C0483.f757;
                    i13 = i11 ^ (-778);
                    str = "\u06e8\u06e6\u06e8";
                    break;
                case 1749852:
                    C0048.m942(parcel, i12, strM9253);
                    t7VarM6291 = C0325.m6291(this);
                    str = "\u06e0\u06e0\u06e7";
                    break;
                case 1750571:
                    iM1863 = C0087.m1863(i11, parcel);
                    i11 = C0463.f734;
                    str = "\u06e4\u06e0\u06e5";
                    break;
                case 1750632:
                    C0229.m4414(parcel, i13, i14);
                    C0044.m853(parcel, jM5980);
                    str = "\u06df\u06e3\u06e0";
                    break;
                case 1750633:
                    C0048.m942(parcel, i12, strM9253);
                    i11 = C0128.f154;
                    str = "\u06e1\u06e8\u06df";
                    break;
                case 1751529:
                    i12 = i11 ^ 289;
                    strM9253 = C0475.m9253(this);
                    str = "\u06e3\u06e2\u06e8";
                    break;
                case 1751776:
                    i11 = C0181.f205;
                    i13 = i11 ^ (-900);
                    str = "\u06e7\u06e3";
                    break;
                case 1752516:
                    i11 = i12 ^ 736;
                    vVarM7647 = C0087.m1862(this);
                    str = "\u06e0\u06e5\u06e5";
                    break;
                case 1752639:
                    i13 = C0011.f31;
                    i12 = i13 ^ 366;
                    str = "\u06e6\u06e5\u06e8";
                    break;
                case 1753511:
                    return;
                case 1753609:
                    vVarM7647 = C0011.m224(this);
                    C0307.m5948(parcel, i12, vVarM7647, i10);
                    str = "\u06e4\u06e8\u06e4";
                    break;
                case 1754383:
                    C0103.m2015(parcel, zM8588 ? 1 : 0);
                    i11 = C0191.f215;
                    str = "\u06e2\u06e3\u06e8";
                    break;
                case 1754534:
                    C0307.m5948(parcel, i14, vVarM7647, i10);
                    jM5980 = C0309.m5980(this);
                    str = "\u06e4\u06e8\u06df";
                    break;
                case 1754568:
                    C0307.m5948(parcel, i12, t7VarM6291, i10);
                    jM5980 = C0194.m3723(this);
                    str = "\u06e2\u06e4\u06e3";
                    break;
                case 1755373:
                    iM1863 = C0481.f755;
                    i11 = iM1863 ^ (-19822);
                    str = "\u06e3\u06e0\u06e8";
                    break;
                case 1755407:
                    C0044.m853(parcel, jM5980);
                    i12 = C0311.f459;
                    str = "\u06e5\u06e1\u06e0";
                    break;
                case 1755496:
                    C0048.m942(parcel, i13, strM9253);
                    vVarM7647 = C0390.m7647(this);
                    str = "\u06e7\u06e4\u06e3";
                    break;
                case 1755562:
                    i11 = C0182.f206;
                    i14 = i11 ^ 263;
                    str = "\u06e3\u06e2\u06e7";
                    break;
                default:
                    i12 = C0432.f703;
                    i11 = i12 ^ 516;
                    str = "\u06e1\u06e8\u06e2";
                    break;
            }
        }
    }
}
