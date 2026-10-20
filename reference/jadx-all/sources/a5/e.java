package a5;

import a.C0001;
import com.google.firebase.remoteconfig.internal.Code;
import h0.C0300;
import n9.C0367;
import s.C0408;
import t0.C0419;
import u.C0429;

/* JADX INFO: loaded from: classes.dex */
public final class e extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f1247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f1248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1249c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, u8.e eVar) {
        super(eVar);
        this.f1248b = jVar;
        int iM8409 = C0429.m8409();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8409 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.decode(C0001.m38("jmwVmKtaa6HJmi4sUSNbF")));
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
        this.f1247a = obj;
        int iM7191 = C0367.m7191(this);
        this.f1249c = (iM7191 & Integer.MIN_VALUE) | (iM7191 ^ Integer.MIN_VALUE);
        Object objM7994 = C0408.m7994(C0419.m8226(this), null, this);
        v8.a aVarM5766 = C0300.m5766();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (objM7994 == aVarM5766) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return objM7994;
                case 239:
                    return new q8.h(objM7994);
                default:
                    continue;
            }
            i10 = 1678;
        }
    }
}
