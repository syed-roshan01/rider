package a5;

import com.google.android.gms.common.api.internal.C0083;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.ktx.C0199;
import e2.C0260;
import f.C0270;
import h0.C0299;
import j2.C0323;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i0 f1264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f1266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1267d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(i0 i0Var, u8.e eVar) {
        super(eVar);
        this.f1266c = i0Var;
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
                    System.out.println(Long.parseLong(C0083.m1792("cSKZhoB68xTAebj8pL")));
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
        this.f1265b = obj;
        int iM3831 = C0199.m3831(this);
        this.f1267d = (iM3831 & Integer.MIN_VALUE) | (iM3831 ^ Integer.MIN_VALUE);
        Object objM6254 = C0323.m6254(C0270.m5165(this), this);
        v8.a aVarM5766 = C0299.m5766();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (objM6254 == aVarM5766) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return objM6254;
                case 239:
                    return new q8.h(objM6254);
                default:
                    continue;
            }
            i10 = 1678;
        }
    }
}
