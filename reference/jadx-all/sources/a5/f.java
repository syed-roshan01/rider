package a5;

import com.google.android.gms.common.api.internal.C0083;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.android.components.C0229;
import h0.C0300;
import t8.C0427;
import x4.C0469;
import z0.C0483;

/* JADX INFO: loaded from: classes.dex */
public final class f extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f1250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f1251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1252c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, u8.e eVar) {
        super(eVar);
        this.f1251b = jVar;
        int iM4402 = C0229.m4402();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4402 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.valueOf(C0083.m1792("rlA8L6Ru3VXbvSDKjqpom39TaNnf")));
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
        this.f1250a = obj;
        int iM9393 = C0483.m9393(this);
        this.f1252c = (iM9393 & Integer.MIN_VALUE) | (iM9393 ^ Integer.MIN_VALUE);
        Object objM9112 = C0469.m9112(C0427.m8359(this), null, null, this);
        v8.a aVarM5766 = C0300.m5766();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (objM9112 == aVarM5766) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return objM9112;
                case 239:
                    return new q8.h(objM9112);
                default:
                    continue;
            }
            i10 = 1678;
        }
    }
}
