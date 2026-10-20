package a5;

import com.google.firebase.concurrent.C0136;
import com.google.firebase.ktx.C0180;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfiginterop.C0203;
import d7.C0221;
import h0.C0300;
import j6.C0329;

/* JADX INFO: loaded from: classes.dex */
public final class i extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f1268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f1269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1270c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, u8.e eVar) {
        super(eVar);
        this.f1269b = jVar;
        int iM3448 = C0180.m3448();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3448 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.parseInt(C0136.m2628("4eB5JdrlLR")));
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
        this.f1268a = obj;
        int iM6344 = C0329.m6344(this);
        this.f1270c = (iM6344 & Integer.MIN_VALUE) | (iM6344 ^ Integer.MIN_VALUE);
        Object objM4250 = C0221.m4250(C0203.m3891(this), null, this);
        v8.a aVarM5766 = C0300.m5766();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (objM4250 == aVarM5766) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return objM4250;
                case 239:
                    return new q8.h(objM4250);
                default:
                    continue;
            }
            i10 = 1678;
        }
    }
}
