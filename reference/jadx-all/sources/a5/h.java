package a5;

import com.google.firebase.remoteconfig.internal.Code;
import ea.C0269;
import g8.C0294;
import h.C0298;
import h0.C0300;
import h4.C0306;
import u3.C0435;

/* JADX INFO: loaded from: classes.dex */
public final class h extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f1261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f1262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1263c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, u8.e eVar) {
        super(eVar);
        this.f1262b = jVar;
        int iM8498 = C0435.m8498();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8498 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(C0298.m5717("al"));
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
        this.f1261a = obj;
        int iM5902 = C0306.m5902(this);
        this.f1263c = (iM5902 & Integer.MIN_VALUE) | (iM5902 ^ Integer.MIN_VALUE);
        Object objM5130 = C0269.m5130(C0294.m5642(this), null, this);
        v8.a aVarM5766 = C0300.m5766();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (objM5130 == aVarM5766) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return objM5130;
                case 239:
                    return new q8.h(objM5130);
                default:
                    continue;
            }
            i10 = 1678;
        }
    }
}
