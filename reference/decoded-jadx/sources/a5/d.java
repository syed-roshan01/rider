package a5;

import com.google.firebase.firebase_analytics.C0144;
import com.google.firebase.measurement_impl.C0185;
import com.google.firebase.remoteconfig.internal.Code;
import ea.C0267;
import h0.C0299;
import o1.C0367;
import q6.C0387;

/* JADX INFO: loaded from: classes.dex */
public final class d extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f1236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f1237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1238c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(j jVar, u8.e eVar) {
        super(eVar);
        this.f1237b = jVar;
        int iM2767 = C0144.m2767();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2767 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.parseLong(C0267.m5102("VAIq0NeIy7QQwjg8Xcf0d4jy1")));
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
        this.f1236a = obj;
        int iM3529 = C0185.m3529(this);
        this.f1238c = (iM3529 & Integer.MIN_VALUE) | (iM3529 ^ Integer.MIN_VALUE);
        Object objM7205 = C0367.m7205(C0387.m7592(this), null, this);
        v8.a aVarM5766 = C0299.m5766();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (objM7205 == aVarM5766) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return objM7205;
                case 239:
                    return new q8.h(objM7205);
                default:
                    continue;
            }
            i10 = 1678;
        }
    }
}
