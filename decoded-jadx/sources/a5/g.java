package a5;

import com.google.firebase.firestore.auth.C0146;
import com.google.firebase.firestore.core.C0153;
import com.google.firebase.remoteconfig.internal.Code;
import f.C0270;
import h0.C0299;
import r.C0392;
import y6.C0476;

/* JADX INFO: loaded from: classes.dex */
public final class g extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f1256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f1257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1258c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, u8.e eVar) {
        super(eVar);
        this.f1257b = jVar;
        int iM5170 = C0270.m5170();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5170 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.parseInt(C0476.m9295("joO0hVkV7H0dXMMgR5fgA")));
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
        this.f1256a = obj;
        int iM7692 = C0392.m7692(this);
        this.f1258c = (iM7692 & Integer.MIN_VALUE) | (iM7692 ^ Integer.MIN_VALUE);
        Object objM2781 = C0146.m2781(C0153.m2946(this), null, null, this);
        v8.a aVarM5766 = C0299.m5766();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (objM2781 == aVarM5766) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return objM2781;
                case 239:
                    return new q8.h(objM2781);
                default:
                    continue;
            }
            i10 = 1678;
        }
    }
}
