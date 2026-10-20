package r5;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f13499b;

    public /* synthetic */ j(long j10, int i10) {
        this.f13498a = i10;
        this.f13499b = j10;
    }

    @Override // r5.k
    public final Object apply(Object obj) {
        int i10 = this.f13498a;
        long j10 = this.f13499b;
        switch (i10) {
            case 0:
                return (o5.g) m.q(((SQLiteDatabase) obj).rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new j(j10, 1));
            default:
                Cursor cursor = (Cursor) obj;
                cursor.moveToNext();
                return new o5.g(cursor.getLong(0), j10);
        }
    }
}
