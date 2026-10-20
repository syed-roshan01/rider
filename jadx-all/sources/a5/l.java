package a5;

import b3.C0051;
import com.google.firebase.firestore.auth.C0146;
import com.google.firebase.remoteconfig.internal.Code;
import h0.C0300;
import h7.C0313;
import m4.C0354;
import z0.C0483;

/* JADX INFO: loaded from: classes.dex */
public final class l extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f1285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f1287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1288d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(z zVar, u8.e eVar) {
        super(eVar);
        this.f1287c = zVar;
        int iM6940 = C0354.m6940();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6940 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.parseFloat(C0483.m9391("1q6WNWvYip8cMHx6q0QcN5")));
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
        this.f1286b = obj;
        int iM2783 = C0146.m2783(this);
        this.f1288d = (iM2783 & Integer.MIN_VALUE) | (iM2783 ^ Integer.MIN_VALUE);
        Object objM986 = C0051.m986(C0313.m6040(this), null, null, null, null, this);
        v8.a aVarM5766 = C0300.m5766();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (objM986 == aVarM5766) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return objM986;
                case 239:
                    return new q8.h(objM986);
                default:
                    continue;
            }
            i10 = 1678;
        }
    }
}
