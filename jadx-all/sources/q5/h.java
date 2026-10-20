package q5;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import b0.l0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import java.util.HashMap;
import java.util.Map;
import r5.m;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements s5.b, r5.k, Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f13175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13177c;

    public /* synthetic */ h(ConfigFetchHandler configFetchHandler, long j10, HashMap map) {
        this.f13176b = configFetchHandler;
        this.f13175a = j10;
        this.f13177c = map;
    }

    @Override // r5.k
    public final Object apply(Object obj) {
        String str = (String) this.f13176b;
        o5.c cVar = (o5.c) this.f13177c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        i5.c cVar2 = m.f13502f;
        boolean zBooleanValue = ((Boolean) m.q(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(cVar.f12536a)}), new l0(18))).booleanValue();
        long j10 = this.f13175a;
        int i10 = cVar.f12536a;
        if (zBooleanValue) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i10)});
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i10));
            contentValues.put("events_dropped_count", Long.valueOf(j10));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        }
        return null;
    }

    @Override // s5.b
    public final Object b() {
        i iVar = (i) this.f13176b;
        l5.j jVar = (l5.j) this.f13177c;
        long jA = ((t5.c) iVar.f13184g).a() + this.f13175a;
        m mVar = (m) iVar.f13180c;
        mVar.getClass();
        mVar.e(new r5.f(jA, jVar));
        return null;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        return ((ConfigFetchHandler) this.f13176b).lambda$fetch$0(this.f13175a, (Map) this.f13177c, task);
    }

    public /* synthetic */ h(Object obj, long j10, Object obj2) {
        this.f13176b = obj;
        this.f13177c = obj2;
        this.f13175a = j10;
    }
}
