package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements SuccessContinuation, Continuation, OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3896b;

    public /* synthetic */ f(Object obj, int i10) {
        this.f3895a = i10;
        this.f3896b = obj;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        int i10 = this.f3895a;
        Object obj = this.f3896b;
        switch (i10) {
            case 0:
                WakeLockHolder.completeWakefulIntent((Intent) obj);
                break;
            case 1:
                ((WithinAppServiceConnection.BindRequest) obj).finish();
                break;
            default:
                ((ScheduledFuture) obj).cancel(false);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        int i10 = this.f3895a;
        String str = (String) this.f3896b;
        TopicsSubscriber topicsSubscriber = (TopicsSubscriber) obj;
        switch (i10) {
            case 0:
                return FirebaseMessaging.lambda$unsubscribeFromTopic$8(str, topicsSubscriber);
            default:
                return FirebaseMessaging.lambda$subscribeToTopic$7(str, topicsSubscriber);
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((GmsRpc) this.f3896b).lambda$extractResponseWhenComplete$0(task);
    }
}
