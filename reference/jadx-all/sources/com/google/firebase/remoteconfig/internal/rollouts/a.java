package com.google.firebase.remoteconfig.internal.rollouts;

import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RolloutsStateSubscriber f3943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RolloutsState f3944c;

    public /* synthetic */ a(RolloutsStateSubscriber rolloutsStateSubscriber, RolloutsState rolloutsState, int i10) {
        this.f3942a = i10;
        this.f3943b = rolloutsStateSubscriber;
        this.f3944c = rolloutsState;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f3942a;
        RolloutsState rolloutsState = this.f3944c;
        RolloutsStateSubscriber rolloutsStateSubscriber = this.f3943b;
        switch (i10) {
            case 0:
                rolloutsStateSubscriber.onRolloutsStateChanged(rolloutsState);
                break;
            default:
                rolloutsStateSubscriber.onRolloutsStateChanged(rolloutsState);
                break;
        }
    }
}
