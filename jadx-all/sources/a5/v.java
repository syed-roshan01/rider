package a5;

import androidx.annotation.C0019;
import c3.C0062;
import com.google.firebase.remoteconfig.internal.Code;
import h0.C0300;
import h5.C0309;
import m4.C0354;
import n7.C0364;

/* JADX INFO: loaded from: classes.dex */
public final class v extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f1313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f1314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1315c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(z zVar, u8.e eVar) {
        super(eVar);
        this.f1314b = zVar;
        int iM1186 = C0062.m1186();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1186 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.valueOf(C0354.m6915("mTG")));
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
        this.f1313a = obj;
        int iM5955 = C0309.m5955(this);
        this.f1315c = (iM5955 & Integer.MIN_VALUE) | (iM5955 ^ Integer.MIN_VALUE);
        Object objM7131 = C0364.m7131(C0019.m374(this), null, null, this);
        v8.a aVarM5766 = C0300.m5766();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (objM7131 == aVarM5766) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return objM7131;
                case 239:
                    return new q8.h(objM7131);
                default:
                    continue;
            }
            i10 = 1678;
        }
    }
}
