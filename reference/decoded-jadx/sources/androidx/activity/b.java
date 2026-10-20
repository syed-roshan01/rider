package androidx.activity;

import android.window.BackEvent;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f1363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f1364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1366d;

    public b(BackEvent backEvent) {
        d7.a.m(backEvent, "backEvent");
        a aVar = a.f1360a;
        float fD = aVar.d(backEvent);
        float fE = aVar.e(backEvent);
        float fB = aVar.b(backEvent);
        int iC = aVar.c(backEvent);
        this.f1363a = fD;
        this.f1364b = fE;
        this.f1365c = fB;
        this.f1366d = iC;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
        sb.append(this.f1363a);
        sb.append(", touchY=");
        sb.append(this.f1364b);
        sb.append(", progress=");
        sb.append(this.f1365c);
        sb.append(", swipeEdge=");
        return a7.a.o(sb, this.f1366d, '}');
    }
}
