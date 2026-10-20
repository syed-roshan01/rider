package androidx.fragment.app;

import android.animation.Animator;
import android.view.animation.Animation;

/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Animation f1931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Animator f1932b;

    public h0(Animation animation) {
        this.f1931a = animation;
        this.f1932b = null;
    }

    public h0(Animator animator) {
        this.f1931a = null;
        this.f1932b = animator;
    }
}
