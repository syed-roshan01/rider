package r5;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f13493b;

    public /* synthetic */ h(m mVar, int i10) {
        this.f13492a = i10;
        this.f13493b = mVar;
    }

    @Override // r5.k
    public final Object apply(Object obj) {
        int i10 = this.f13492a;
        m mVar = this.f13493b;
        switch (i10) {
            case 0:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                mVar.getClass();
                sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
                sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + ((t5.c) mVar.f13504b).a()).execute();
                break;
            case 1:
                Cursor cursor = (Cursor) obj;
                mVar.getClass();
                while (cursor.moveToNext()) {
                    mVar.e(new q5.h(cursor.getString(1), cursor.getInt(0), o5.c.MESSAGE_TOO_OLD));
                }
                break;
            default:
                Cursor cursor2 = (Cursor) obj;
                mVar.getClass();
                while (cursor2.moveToNext()) {
                    mVar.e(new q5.h(cursor2.getString(1), cursor2.getInt(0), o5.c.MAX_RETRIES_REACHED));
                }
                break;
        }
        return null;
    }
}
