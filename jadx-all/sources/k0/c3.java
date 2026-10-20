package k0;

import aa.C0012;
import androidx.core.app.C0040;
import b1.C0050;
import b4.C0052;
import com.google.firebase.analytics.ktx.ktxtesting.C0119;
import com.google.firebase.analytics.ktxtesting.C0121;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import d1.C0213;
import f.C0270;
import ia.C0323;
import m1.C0352;
import r2.C0396;
import t8.C0427;

/* JADX INFO: loaded from: classes.dex */
public final class c3 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1.x0 f8792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r1.x0 f8794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8796e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r1.x0 f8797f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f8798n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f8799o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(r1.x0 x0Var, int i10, r1.x0 x0Var2, int i11, int i12, r1.x0 x0Var3, int i13, int i14) {
        super(1);
        this.f8792a = x0Var;
        this.f8793b = i10;
        this.f8794c = x0Var2;
        this.f8795d = i11;
        this.f8796e = i12;
        this.f8797f = x0Var3;
        this.f8798n = i13;
        this.f8799o = i14;
        int iM7737 = C0396.m7737();
        int i15 = 1616;
        while (true) {
            i15 ^= 1633;
            switch (i15) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7737 <= 0) {
                        i15 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(C0121.m2341("PF03DKiMO0n6OKBQaM9"));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i15 = 1678;
        }
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        r1.w0 w0Var = (r1.w0) obj;
        C0050.m966(w0Var, C0323.m6235(this), 0, C0213.m4054(this));
        r1.x0 x0VarM2293 = C0119.m2293(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = x0VarM2293 != null ? 1709 : 1678;
                    break;
                case 204:
                    C0050.m966(w0Var, x0VarM2293, C0427.m8358(this), C0052.m1019(this));
                    break;
                case 239:
                    break;
                default:
                    break;
            }
        }
        r1.x0 x0VarM780 = C0040.m780(this);
        int i11 = 1740;
        while (true) {
            i11 ^= 1757;
            switch (i11) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (x0VarM780 != null) {
                        i11 = 1833;
                    }
                    break;
                case 54:
                    break;
                case 471:
                    break;
                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                    C0050.m966(w0Var, x0VarM780, C0270.m5143(this), C0352.m6897(this));
                    break;
                default:
                    continue;
            }
            i11 = 1802;
        }
        return C0012.m238();
    }
}
