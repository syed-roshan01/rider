package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Function;
import com.google.firebase.firestore.util.Supplier;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 implements Function, Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3753b;

    public /* synthetic */ c0(Object obj, int i10) {
        this.f3753b = obj;
        this.f3752a = i10;
    }

    @Override // com.google.firebase.firestore.util.Function
    public final Object apply(Object obj) {
        return ((SQLiteMutationQueue) this.f3753b).lambda$lookupMutationBatch$3(this.f3752a, (Cursor) obj);
    }

    @Override // com.google.firebase.firestore.util.Supplier
    public final Object get() {
        return ((LocalStore) this.f3753b).lambda$rejectBatch$4(this.f3752a);
    }
}
