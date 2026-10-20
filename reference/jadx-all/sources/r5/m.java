package r5;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import b0.l0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class m implements d, s5.c, c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i5.c f13502f = new i5.c("proto");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f13503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t5.a f13504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t5.a f13505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f13506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p8.a f13507e;

    public m(t5.a aVar, t5.a aVar2, a aVar3, p pVar, p8.a aVar4) {
        this.f13503a = pVar;
        this.f13504b = aVar;
        this.f13505c = aVar2;
        this.f13506d = aVar3;
        this.f13507e = aVar4;
    }

    public static Long b(SQLiteDatabase sQLiteDatabase, l5.j jVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(jVar.f11348a, String.valueOf(u5.a.a(jVar.f11350c))));
        byte[] bArr = jVar.f11349b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) q(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new l0(20));
    }

    public static String p(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((b) it.next()).f13480a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object q(Cursor cursor, k kVar) {
        try {
            return kVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase a() {
        Object objApply;
        p pVar = this.f13503a;
        Objects.requireNonNull(pVar);
        l0 l0Var = new l0(14);
        t5.c cVar = (t5.c) this.f13505c;
        long jA = cVar.a();
        while (true) {
            try {
                objApply = pVar.getWritableDatabase();
                break;
            } catch (SQLiteDatabaseLockedException e4) {
                if (cVar.a() >= ((long) this.f13506d.f13477c) + jA) {
                    objApply = l0Var.apply(e4);
                    break;
                }
                SystemClock.sleep(50L);
            }
        }
        return (SQLiteDatabase) objApply;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f13503a.close();
    }

    public final Object e(k kVar) {
        SQLiteDatabase sQLiteDatabaseA = a();
        sQLiteDatabaseA.beginTransaction();
        try {
            Object objApply = kVar.apply(sQLiteDatabaseA);
            sQLiteDatabaseA.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseA.endTransaction();
        }
    }

    public final ArrayList f(SQLiteDatabase sQLiteDatabase, l5.j jVar, int i10) {
        ArrayList arrayList = new ArrayList();
        Long lB = b(sQLiteDatabase, jVar);
        if (lB == null) {
            return arrayList;
        }
        q(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lB.toString()}, null, null, null, String.valueOf(i10)), new p5.b(this, (Object) arrayList, jVar, 3));
        return arrayList;
    }

    public final Object g(s5.b bVar) {
        SQLiteDatabase sQLiteDatabaseA = a();
        l0 l0Var = new l0(16);
        t5.c cVar = (t5.c) this.f13505c;
        long jA = cVar.a();
        while (true) {
            try {
                sQLiteDatabaseA.beginTransaction();
                break;
            } catch (SQLiteDatabaseLockedException e4) {
                if (cVar.a() >= ((long) this.f13506d.f13477c) + jA) {
                    l0Var.apply(e4);
                    break;
                }
                SystemClock.sleep(50L);
            }
        }
        try {
            Object objB = bVar.b();
            sQLiteDatabaseA.setTransactionSuccessful();
            return objB;
        } finally {
            sQLiteDatabaseA.endTransaction();
        }
    }
}
