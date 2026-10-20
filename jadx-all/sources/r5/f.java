package r5;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13486a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f13487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13488c;

    public /* synthetic */ f(long j10, l5.j jVar) {
        this.f13487b = j10;
        this.f13488c = jVar;
    }

    @Override // r5.k
    public final Object apply(Object obj) {
        int i10 = this.f13486a;
        long j10 = this.f13487b;
        Object obj2 = this.f13488c;
        switch (i10) {
            case 0:
                m mVar = (m) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                mVar.getClass();
                String[] strArr = {String.valueOf(j10)};
                m.q(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new h(mVar, 1));
                return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
            default:
                l5.j jVar = (l5.j) obj2;
                SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) obj;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(j10));
                String str = jVar.f11348a;
                i5.d dVar = jVar.f11350c;
                if (sQLiteDatabase2.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(u5.a.a(dVar))}) < 1) {
                    contentValues.put("backend_name", jVar.f11348a);
                    contentValues.put("priority", Integer.valueOf(u5.a.a(dVar)));
                    sQLiteDatabase2.insert("transport_contexts", null, contentValues);
                }
                return null;
        }
    }

    public /* synthetic */ f(m mVar, long j10) {
        this.f13488c = mVar;
        this.f13487b = j10;
    }
}
