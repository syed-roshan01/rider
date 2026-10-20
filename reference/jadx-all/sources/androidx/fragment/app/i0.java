package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends AnimationSet implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f1938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f1939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1942e;

    public i0(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f1942e = true;
        this.f1938a = viewGroup;
        this.f1939b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j10, Transformation transformation) {
        this.f1942e = true;
        if (this.f1940c) {
            return !this.f1941d;
        }
        if (!super.getTransformation(j10, transformation)) {
            this.f1940c = true;
            b3.u.a(this.f1938a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = this.f1940c;
        ViewGroup viewGroup = this.f1938a;
        if (z10 || !this.f1942e) {
            viewGroup.endViewTransition(this.f1939b);
            this.f1941d = true;
        } else {
            this.f1942e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j10, Transformation transformation, float f10) {
        this.f1942e = true;
        if (this.f1940c) {
            return !this.f1941d;
        }
        if (!super.getTransformation(j10, transformation, f10)) {
            this.f1940c = true;
            b3.u.a(this.f1938a, this);
        }
        return true;
    }
}
