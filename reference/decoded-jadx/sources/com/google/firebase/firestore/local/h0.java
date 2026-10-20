package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h0 implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SQLiteSchema f3783b;

    public /* synthetic */ h0(SQLiteSchema sQLiteSchema, int i10) {
        this.f3782a = i10;
        this.f3783b = sQLiteSchema;
    }

    @Override // com.google.firebase.firestore.util.Consumer
    public final void accept(Object obj) {
        int i10 = this.f3782a;
        SQLiteSchema sQLiteSchema = this.f3783b;
        Cursor cursor = (Cursor) obj;
        switch (i10) {
            case 0:
                sQLiteSchema.lambda$rewriteCanonicalIds$13(cursor);
                break;
            case 1:
                sQLiteSchema.lambda$removeAcknowledgedMutations$2(cursor);
                break;
            default:
                sQLiteSchema.lambda$dropLastLimboFreeSnapshotVersion$6(cursor);
                break;
        }
    }
}
