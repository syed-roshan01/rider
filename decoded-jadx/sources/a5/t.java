package a5;

import android.support.v4.app.C0014;
import ca.C0070;
import com.google.firebase.remoteconfig.internal.Code;
import ea.C0267;
import h0.C0299;
import i5.C0318;
import x4.C0468;

/* JADX INFO: loaded from: classes.dex */
public final class t extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f1304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f1305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1306c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(z zVar, u8.e eVar) {
        super(eVar);
        this.f1305b = zVar;
        int iM6163 = C0318.m6163();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6163 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.valueOf(C0070.m1362("GzpZCaw8qBmeIRw3L53Ng")));
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
        this.f1304a = obj;
        int iM267 = C0014.m267(this);
        this.f1306c = (iM267 & Integer.MIN_VALUE) | (iM267 ^ Integer.MIN_VALUE);
        Object objM9126 = C0468.m9126(C0267.m5104(this), null, null, null, 0, null, 0, this);
        v8.a aVarM5766 = C0299.m5766();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (objM9126 == aVarM5766) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return objM9126;
                case 239:
                    return new q8.h(objM9126);
                default:
                    continue;
            }
            i10 = 1678;
        }
    }
}
