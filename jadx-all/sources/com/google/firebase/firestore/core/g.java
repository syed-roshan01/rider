package com.google.firebase.firestore.core;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransactionRunner f3721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3722c;

    public /* synthetic */ g(TransactionRunner transactionRunner, Object obj, int i10) {
        this.f3720a = i10;
        this.f3721b = transactionRunner;
        this.f3722c = obj;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        int i10 = this.f3720a;
        TransactionRunner transactionRunner = this.f3721b;
        Object obj = this.f3722c;
        switch (i10) {
            case 0:
                transactionRunner.lambda$runWithBackoff$1((Transaction) obj, task);
                break;
            default:
                transactionRunner.lambda$runWithBackoff$0((Task) obj, task);
                break;
        }
    }
}
