package a5;

import com.google.firebase.emulators.C0141;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.internal.C0254;
import h0.C0300;
import p8.C0381;
import rikka.shizuku.C0407;
import s8.C0418;

/* JADX INFO: loaded from: classes.dex */
public final class q extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z f1294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f1296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1297d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(z zVar, u8.e eVar) {
        super(eVar);
        this.f1296c = zVar;
        int iM7467 = C0381.m7467();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7467 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.parseLong(C0141.m2708("wxqK13PN1sEszpRmJy9i2vfY4gIR")));
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
        this.f1295b = obj;
        int iM4840 = C0254.m4840(this);
        this.f1297d = (iM4840 & Integer.MIN_VALUE) | (iM4840 ^ Integer.MIN_VALUE);
        Object objM7969 = C0407.m7969(C0418.m8205(this), null, false, this);
        v8.a aVarM5766 = C0300.m5766();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (objM7969 == aVarM5766) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return objM7969;
                case 239:
                    return new q8.h(objM7969);
                default:
                    continue;
            }
            i10 = 1678;
        }
    }
}
