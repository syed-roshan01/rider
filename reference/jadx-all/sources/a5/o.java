package a5;

import a3.C0006;
import com.auto.accept.service.C0072;
import com.google.android.gms.tasks.C0106;
import com.google.firebase.remoteconfig.internal.Code;
import h0.C0300;
import h8.C0314;
import w4.C0461;

/* JADX INFO: loaded from: classes.dex */
public final class o extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f1290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f1291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1292c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(z zVar, u8.e eVar) {
        super(eVar);
        this.f1291b = zVar;
        int iM8972 = C0461.m8972();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8972 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.parseFloat(C0072.m1562("wn6ImWMMU1vAskMx17A")));
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
        this.f1290a = obj;
        int iM6074 = C0314.m6074(this);
        this.f1292c = (iM6074 & Integer.MIN_VALUE) | (iM6074 ^ Integer.MIN_VALUE);
        Object objM111 = C0006.m111(C0106.m2069(this), null, this);
        v8.a aVarM5766 = C0300.m5766();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (objM111 == aVarM5766) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return objM111;
                case 239:
                    return new q8.h(objM111);
                default:
                    continue;
            }
            i10 = 1678;
        }
    }
}
