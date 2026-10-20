package a5;

import androidx.core.app.C0040;
import com.google.android.gms.common.util.C0085;
import com.google.firebase.C0205;
import com.google.firebase.remoteconfig.internal.Code;
import d5.C0218;
import dagger.hilt.components.C0244;
import e2.C0260;
import h0.C0299;

/* JADX INFO: loaded from: classes.dex */
public final class k extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f1277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f1278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f1279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f1280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f1281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f1282f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final z f1283n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1284o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(z zVar, u8.e eVar) {
        super(eVar);
        this.f1283n = zVar;
        int iM4984 = C0260.m4984();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4984 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.valueOf(C0085.m1811("9ryELDjDkOOrYi1wtowIO")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        this.f1282f = obj;
        int iM3929 = C0205.m3929(this);
        this.f1284o = (iM3929 & Integer.MIN_VALUE) | (iM3929 ^ Integer.MIN_VALUE);
        Object objM4230 = C0218.m4230(C0040.m782(this), null, null, 516 ^ ((long) C0244.f324), null, this);
        v8.a aVarM5766 = C0299.m5766();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (objM4230 == aVarM5766) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return objM4230;
                case 239:
                    return new q8.h(objM4230);
                default:
                    continue;
            }
            i10 = 1678;
        }
    }
}
