package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.BackgroundQueue;
import com.google.firebase.firestore.util.Consumer;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SQLiteDocumentOverlayCache f3811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BackgroundQueue f3812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Map f3813d;

    public /* synthetic */ q(SQLiteDocumentOverlayCache sQLiteDocumentOverlayCache, BackgroundQueue backgroundQueue, Map map, int i10) {
        this.f3810a = i10;
        this.f3811b = sQLiteDocumentOverlayCache;
        this.f3812c = backgroundQueue;
        this.f3813d = map;
    }

    @Override // com.google.firebase.firestore.util.Consumer
    public final void accept(Object obj) {
        int i10 = this.f3810a;
        BackgroundQueue backgroundQueue = this.f3812c;
        SQLiteDocumentOverlayCache sQLiteDocumentOverlayCache = this.f3811b;
        Map map = this.f3813d;
        Cursor cursor = (Cursor) obj;
        switch (i10) {
            case 0:
                sQLiteDocumentOverlayCache.lambda$processSingleCollection$1(backgroundQueue, map, cursor);
                break;
            case 1:
                sQLiteDocumentOverlayCache.lambda$getOverlays$2(backgroundQueue, map, cursor);
                break;
            default:
                sQLiteDocumentOverlayCache.lambda$getOverlays$4(backgroundQueue, map, cursor);
                break;
        }
    }
}
