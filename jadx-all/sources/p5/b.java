package p5;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import b0.l0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Transaction;
import com.google.firebase.firestore.util.Function;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient;
import com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;
import i3.a0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import l.r;
import l5.i;
import l5.j;
import o5.g;
import q5.h;
import r5.k;
import r5.m;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements s5.b, k, Function, Continuation, OnSuccessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12774d;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i10) {
        this.f12771a = i10;
        this.f12774d = obj;
        this.f12773c = obj2;
        this.f12772b = obj3;
    }

    @Override // r5.k
    public final Object apply(Object obj) {
        long jInsert;
        o5.c cVar;
        o5.c cVar2 = o5.c.CACHE_FULL;
        int i10 = this.f12771a;
        int i11 = 5;
        int i12 = 4;
        int i13 = 3;
        int i14 = 2;
        int i15 = 1;
        Object obj2 = this.f12772b;
        Object obj3 = this.f12773c;
        Object obj4 = this.f12774d;
        switch (i10) {
            case 1:
                m mVar = (m) obj4;
                i iVar = (i) obj2;
                j jVar = (j) obj3;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                i5.c cVar3 = m.f13502f;
                long jSimpleQueryForLong = mVar.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * mVar.a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                r5.a aVar = mVar.f13506d;
                if (jSimpleQueryForLong >= aVar.f13475a) {
                    mVar.e(new h(iVar.f11342a, 1L, cVar2));
                    return -1L;
                }
                Long lB = m.b(sQLiteDatabase, jVar);
                if (lB != null) {
                    jInsert = lB.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", jVar.f11348a);
                    contentValues.put("priority", Integer.valueOf(u5.a.a(jVar.f11350c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = jVar.f11349b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                byte[] bArr2 = iVar.f11344c.f11358b;
                int length = bArr2.length;
                int i16 = aVar.f13479e;
                boolean z10 = length <= i16;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", iVar.f11342a);
                contentValues2.put("timestamp_ms", Long.valueOf(iVar.f11345d));
                contentValues2.put("uptime_ms", Long.valueOf(iVar.f11346e));
                contentValues2.put("payload_encoding", iVar.f11344c.f11357a.f8065a);
                contentValues2.put("code", iVar.f11343b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z10));
                contentValues2.put("payload", z10 ? bArr2 : new byte[0]);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z10) {
                    int iCeil = (int) Math.ceil(((double) bArr2.length) / ((double) i16));
                    for (int i17 = 1; i17 <= iCeil; i17++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i17 - 1) * i16, Math.min(i17 * i16, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i17));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(iVar.f11347f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put(FirebaseAnalytics.Param.VALUE, (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            case 2:
                m mVar2 = (m) obj4;
                SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) obj;
                i5.c cVar4 = m.f13502f;
                mVar2.getClass();
                sQLiteDatabase2.compileStatement((String) obj3).execute();
                m.q(sQLiteDatabase2.rawQuery((String) obj2, null), new r5.h(mVar2, i14));
                sQLiteDatabase2.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                return null;
            case 3:
                m mVar3 = (m) obj4;
                List list = (List) obj2;
                j jVar2 = (j) obj3;
                Cursor cursor = (Cursor) obj;
                i5.c cVar5 = m.f13502f;
                mVar3.getClass();
                while (cursor.moveToNext()) {
                    long j10 = cursor.getLong(0);
                    int i18 = cursor.getInt(7) != 0 ? i15 : 0;
                    r rVar = new r(i15);
                    rVar.f10915g = new HashMap();
                    String string = cursor.getString(i15);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    rVar.f10910b = string;
                    rVar.f10913e = Long.valueOf(cursor.getLong(2));
                    rVar.f10914f = Long.valueOf(cursor.getLong(3));
                    if (i18 != 0) {
                        String string2 = cursor.getString(4);
                        rVar.i(new l5.m(string2 == null ? m.f13502f : new i5.c(string2), cursor.getBlob(5)));
                    } else {
                        String string3 = cursor.getString(4);
                        rVar.i(new l5.m(string3 == null ? m.f13502f : new i5.c(string3), (byte[]) m.q(mVar3.a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num"), new l0(21))));
                    }
                    if (!cursor.isNull(6)) {
                        rVar.f10911c = Integer.valueOf(cursor.getInt(6));
                    }
                    list.add(new r5.b(j10, jVar2, rVar.c()));
                    i15 = 1;
                }
                return null;
            case 4:
                m mVar4 = (m) obj4;
                Map map = (Map) obj3;
                a0 a0Var = (a0) obj2;
                Cursor cursor2 = (Cursor) obj;
                i5.c cVar6 = m.f13502f;
                mVar4.getClass();
                while (cursor2.moveToNext()) {
                    String string4 = cursor2.getString(0);
                    int i19 = cursor2.getInt(1);
                    o5.c cVar7 = o5.c.REASON_UNKNOWN;
                    if (i19 != 0) {
                        if (i19 == 1) {
                            cVar7 = o5.c.MESSAGE_TOO_OLD;
                        } else if (i19 == 2) {
                            cVar = cVar2;
                        } else if (i19 == i13) {
                            cVar7 = o5.c.PAYLOAD_TOO_BIG;
                        } else if (i19 == i12) {
                            cVar7 = o5.c.MAX_RETRIES_REACHED;
                        } else if (i19 == i11) {
                            cVar7 = o5.c.INVALID_PAYLOD;
                        } else if (i19 == 6) {
                            cVar7 = o5.c.SERVER_ERROR;
                        } else {
                            y3.e.Z("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i19));
                        }
                        cVar = cVar7;
                    } else {
                        cVar = cVar7;
                    }
                    long j11 = cursor2.getLong(2);
                    if (!map.containsKey(string4)) {
                        map.put(string4, new ArrayList());
                    }
                    ((List) map.get(string4)).add(new o5.d(j11, cVar));
                    i11 = 5;
                    i12 = 4;
                    i13 = 3;
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    int i20 = o5.e.f12539c;
                    new ArrayList();
                    ((List) a0Var.f7942b).add(new o5.e((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                }
                long jA = ((t5.c) mVar4.f13504b).a();
                SQLiteDatabase sQLiteDatabaseA = mVar4.a();
                sQLiteDatabaseA.beginTransaction();
                try {
                    g gVar = (g) m.q(sQLiteDatabaseA.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new r5.j(jA, i15));
                    sQLiteDatabaseA.setTransactionSuccessful();
                    sQLiteDatabaseA.endTransaction();
                    a0Var.f7941a = gVar;
                    a0Var.f7943c = new o5.b(new o5.f(mVar4.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * mVar4.a().compileStatement("PRAGMA page_count").simpleQueryForLong(), r5.a.f13474f.f13475a));
                    a0Var.f7944d = (String) mVar4.f13507e.get();
                    return new o5.a((g) a0Var.f7941a, Collections.unmodifiableList((List) a0Var.f7942b), (o5.b) a0Var.f7943c, (String) a0Var.f7944d);
                } catch (Throwable th) {
                    sQLiteDatabaseA.endTransaction();
                    throw th;
                }
            default:
                return ((FirebaseFirestore) obj4).lambda$runTransaction$1((Executor) obj3, (Transaction.Function) obj2, (com.google.firebase.firestore.core.Transaction) obj);
        }
    }

    @Override // s5.b
    public final Object b() {
        c cVar = (c) this.f12774d;
        j jVar = (j) this.f12773c;
        i iVar = (i) this.f12772b;
        m mVar = (m) cVar.f12779d;
        mVar.getClass();
        Object[] objArr = {jVar.f11350c, iVar.f11342a, jVar.f11348a};
        String strConcat = "TRuntime.".concat("SQLiteEventStore");
        if (Log.isLoggable(strConcat, 3)) {
            Log.d(strConcat, String.format("Storing event with priority=%s, name=%s for destination %s", objArr));
        }
        ((Long) mVar.e(new b(mVar, (Object) iVar, jVar, 1))).longValue();
        ((q5.c) cVar.f12776a).a(jVar, 1, false);
        return null;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        ((RolloutsStateSubscriptionsHandler) this.f12774d).lambda$registerRolloutsStateSubscriber$1((Task) this.f12773c, (RolloutsStateSubscriber) this.f12772b, (ConfigContainer) obj);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        int i10 = this.f12771a;
        Object obj = this.f12772b;
        Object obj2 = this.f12773c;
        Object obj3 = this.f12774d;
        switch (i10) {
            case 6:
                return ((FirebaseRemoteConfig) obj3).lambda$activate$2((Task) obj2, (Task) obj, task);
            default:
                return ((ConfigRealtimeHttpClient) obj3).lambda$createRealtimeConnection$0((Task) obj2, (Task) obj, task);
        }
    }

    public /* synthetic */ b(m mVar, Object obj, j jVar, int i10) {
        this.f12771a = i10;
        this.f12774d = mVar;
        this.f12772b = obj;
        this.f12773c = jVar;
    }
}
