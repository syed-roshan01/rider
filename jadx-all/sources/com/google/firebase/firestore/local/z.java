package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SQLiteMutationQueue f3840b;

    public /* synthetic */ z(SQLiteMutationQueue sQLiteMutationQueue, int i10) {
        this.f3839a = i10;
        this.f3840b = sQLiteMutationQueue;
    }

    @Override // com.google.firebase.firestore.util.Consumer
    public final void accept(Object obj) {
        int i10 = this.f3839a;
        SQLiteMutationQueue sQLiteMutationQueue = this.f3840b;
        Cursor cursor = (Cursor) obj;
        switch (i10) {
            case 0:
                sQLiteMutationQueue.lambda$loadNextBatchIdAcrossAllUsers$2(cursor);
                break;
            default:
                sQLiteMutationQueue.lambda$start$0(cursor);
                break;
        }
    }
}
