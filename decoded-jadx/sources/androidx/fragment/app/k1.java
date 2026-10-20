package androidx.fragment.app;

import android.transition.Transition;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class k1 implements Transition.TransitionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f1957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1959c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1960d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1962f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m1 f1963g;

    public k1(m1 m1Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f1963g = m1Var;
        this.f1957a = obj;
        this.f1958b = arrayList;
        this.f1961e = obj2;
        this.f1962f = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        m1 m1Var = this.f1963g;
        Object obj = this.f1957a;
        if (obj != null) {
            m1Var.t(obj, this.f1958b, null);
        }
        Object obj2 = this.f1959c;
        if (obj2 != null) {
            m1Var.t(obj2, this.f1960d, null);
        }
        Object obj3 = this.f1961e;
        if (obj3 != null) {
            m1Var.t(obj3, this.f1962f, null);
        }
    }
}
