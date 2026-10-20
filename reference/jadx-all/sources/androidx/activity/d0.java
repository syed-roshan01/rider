package androidx.activity;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c9.c f1372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c9.c f1373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c9.a f1374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c9.a f1375d;

    public d0(c9.c cVar, c9.c cVar2, c9.a aVar, c9.a aVar2) {
        this.f1372a = cVar;
        this.f1373b = cVar2;
        this.f1374c = aVar;
        this.f1375d = aVar2;
    }

    public final void onBackCancelled() {
        this.f1375d.invoke();
    }

    public final void onBackInvoked() {
        this.f1374c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        d7.a.m(backEvent, "backEvent");
        this.f1373b.invoke(new b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        d7.a.m(backEvent, "backEvent");
        this.f1372a.invoke(new b(backEvent));
    }
}
