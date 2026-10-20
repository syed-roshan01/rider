package q5;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Log;
import b0.l0;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import k5.o;
import k5.q;
import k5.u;
import k5.v;
import k5.w;
import k5.x;
import l.l3;
import l.r;
import l.z2;
import l5.p;
import r5.m;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m5.f f13179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r5.d f13180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f13181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f13182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s5.c f13183f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t5.a f13184g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t5.a f13185h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final r5.c f13186i;

    public i(Context context, m5.f fVar, r5.d dVar, l lVar, Executor executor, s5.c cVar, t5.a aVar, t5.a aVar2, r5.c cVar2) {
        this.f13178a = context;
        this.f13179b = fVar;
        this.f13180c = dVar;
        this.f13181d = lVar;
        this.f13182e = executor;
        this.f13183f = cVar;
        this.f13184g = aVar;
        this.f13185h = aVar2;
        this.f13186i = cVar2;
    }

    public final void a(final l5.j jVar, int i10) {
        SQLiteDatabase sQLiteDatabase;
        m5.h hVar;
        long j10;
        m mVar;
        m5.a aVar;
        String str;
        int i11;
        m5.a aVar2;
        int i12;
        Object objApply;
        String str2;
        Integer numValueOf;
        ArrayList arrayList;
        Iterator it;
        l3 l3Var;
        long jMax;
        final i iVar = this;
        final l5.j jVar2 = jVar;
        m5.h hVarA = iVar.f13179b.a(jVar2.f11348a);
        long j11 = 0;
        while (true) {
            final int i13 = 0;
            s5.b bVar = new s5.b(iVar) { // from class: q5.f

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i f13169b;

                {
                    this.f13169b = iVar;
                }

                @Override // s5.b
                public final Object b() {
                    int i14 = i13;
                    final l5.j jVar3 = jVar2;
                    i iVar2 = this.f13169b;
                    switch (i14) {
                        case 0:
                            final m mVar2 = (m) iVar2.f13180c;
                            mVar2.getClass();
                            final int i15 = 0;
                            return Boolean.valueOf(((Boolean) mVar2.e(new r5.k() { // from class: r5.g
                                /* JADX WARN: Code duplicated, block: B:17:0x005e  */
                                /* JADX WARN: Code duplicated, block: B:19:0x0071  */
                                /* JADX WARN: Code duplicated, block: B:24:0x00aa  */
                                /* JADX WARN: Code duplicated, block: B:30:0x00d9 A[LOOP:3: B:28:0x00d3->B:30:0x00d9, LOOP_END] */
                                /* JADX WARN: Code duplicated, block: B:44:0x0076 A[SYNTHETIC] */
                                /* JADX WARN: Code duplicated, block: B:46:0x00bd A[SYNTHETIC] */
                                /* JADX WARN: Code duplicated, block: B:48:0x00a4 A[SYNTHETIC] */
                                @Override // r5.k
                                public final Object apply(Object obj) {
                                    HashMap map;
                                    StringBuilder sb;
                                    ListIterator listIterator;
                                    b bVar2;
                                    r rVarC;
                                    int i16 = i15;
                                    l5.j jVar4 = jVar3;
                                    m mVar3 = mVar2;
                                    switch (i16) {
                                        case 0:
                                            mVar3.getClass();
                                            Long lB = m.b((SQLiteDatabase) obj, jVar4);
                                            return lB == null ? Boolean.FALSE : (Boolean) m.q(mVar3.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lB.toString()}), new l0(19));
                                        default:
                                            SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) obj;
                                            a aVar3 = mVar3.f13506d;
                                            ArrayList arrayListF = mVar3.f(sQLiteDatabase2, jVar4, aVar3.f13476b);
                                            for (i5.d dVar : i5.d.values()) {
                                                if (dVar != jVar4.f11350c) {
                                                    int size = aVar3.f13476b - arrayListF.size();
                                                    if (size <= 0) {
                                                        map = new HashMap();
                                                        sb = new StringBuilder("event_id IN (");
                                                        for (int i17 = 0; i17 < arrayListF.size(); i17++) {
                                                            sb.append(((b) arrayListF.get(i17)).f13480a);
                                                            if (i17 < arrayListF.size() - 1) {
                                                                sb.append(',');
                                                            }
                                                        }
                                                        sb.append(')');
                                                        m.q(sQLiteDatabase2.query("event_metadata", new String[]{"event_id", "name", FirebaseAnalytics.Param.VALUE}, sb.toString(), null, null, null, null), new b.b(map, 10));
                                                        listIterator = arrayListF.listIterator();
                                                        while (listIterator.hasNext()) {
                                                            bVar2 = (b) listIterator.next();
                                                            if (!map.containsKey(Long.valueOf(bVar2.f13480a))) {
                                                                rVarC = bVar2.f13482c.c();
                                                                long j12 = bVar2.f13480a;
                                                                for (l lVar : (Set) map.get(Long.valueOf(j12))) {
                                                                    rVarC.a(lVar.f13500a, lVar.f13501b);
                                                                }
                                                                listIterator.set(new b(j12, bVar2.f13481b, rVarC.c()));
                                                            }
                                                        }
                                                        return arrayListF;
                                                    }
                                                    z2 z2VarA = l5.j.a();
                                                    z2VarA.L(jVar4.f11348a);
                                                    z2VarA.N(dVar);
                                                    z2VarA.f10984c = jVar4.f11349b;
                                                    arrayListF.addAll(mVar3.f(sQLiteDatabase2, z2VarA.j(), size));
                                                }
                                            }
                                            map = new HashMap();
                                            sb = new StringBuilder("event_id IN (");
                                            while (i17 < arrayListF.size()) {
                                                sb.append(((b) arrayListF.get(i17)).f13480a);
                                                if (i17 < arrayListF.size() - 1) {
                                                    sb.append(',');
                                                }
                                            }
                                            sb.append(')');
                                            m.q(sQLiteDatabase2.query("event_metadata", new String[]{"event_id", "name", FirebaseAnalytics.Param.VALUE}, sb.toString(), null, null, null, null), new b.b(map, 10));
                                            listIterator = arrayListF.listIterator();
                                            while (listIterator.hasNext()) {
                                                bVar2 = (b) listIterator.next();
                                                if (!map.containsKey(Long.valueOf(bVar2.f13480a))) {
                                                    rVarC = bVar2.f13482c.c();
                                                    long j13 = bVar2.f13480a;
                                                    while (r6.hasNext()) {
                                                        rVarC.a(lVar.f13500a, lVar.f13501b);
                                                    }
                                                    listIterator.set(new b(j13, bVar2.f13481b, rVarC.c()));
                                                }
                                            }
                                            return arrayListF;
                                    }
                                }
                            })).booleanValue());
                        default:
                            final m mVar3 = (m) iVar2.f13180c;
                            mVar3.getClass();
                            final int i16 = 1;
                            return (Iterable) mVar3.e(new r5.k() { // from class: r5.g
                                /* JADX WARN: Code duplicated, block: B:17:0x005e  */
                                /* JADX WARN: Code duplicated, block: B:19:0x0071  */
                                /* JADX WARN: Code duplicated, block: B:24:0x00aa  */
                                /* JADX WARN: Code duplicated, block: B:30:0x00d9 A[LOOP:3: B:28:0x00d3->B:30:0x00d9, LOOP_END] */
                                /* JADX WARN: Code duplicated, block: B:44:0x0076 A[SYNTHETIC] */
                                /* JADX WARN: Code duplicated, block: B:46:0x00bd A[SYNTHETIC] */
                                /* JADX WARN: Code duplicated, block: B:48:0x00a4 A[SYNTHETIC] */
                                @Override // r5.k
                                public final Object apply(Object obj) {
                                    HashMap map;
                                    StringBuilder sb;
                                    ListIterator listIterator;
                                    b bVar2;
                                    r rVarC;
                                    int i17 = i16;
                                    l5.j jVar4 = jVar3;
                                    m mVar4 = mVar3;
                                    switch (i17) {
                                        case 0:
                                            mVar4.getClass();
                                            Long lB = m.b((SQLiteDatabase) obj, jVar4);
                                            return lB == null ? Boolean.FALSE : (Boolean) m.q(mVar4.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lB.toString()}), new l0(19));
                                        default:
                                            SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) obj;
                                            a aVar3 = mVar4.f13506d;
                                            ArrayList arrayListF = mVar4.f(sQLiteDatabase2, jVar4, aVar3.f13476b);
                                            for (i5.d dVar : i5.d.values()) {
                                                if (dVar != jVar4.f11350c) {
                                                    int size = aVar3.f13476b - arrayListF.size();
                                                    if (size <= 0) {
                                                        map = new HashMap();
                                                        sb = new StringBuilder("event_id IN (");
                                                        for (int i18 = 0; i18 < arrayListF.size(); i18++) {
                                                            sb.append(((b) arrayListF.get(i18)).f13480a);
                                                            if (i18 < arrayListF.size() - 1) {
                                                                sb.append(',');
                                                            }
                                                        }
                                                        sb.append(')');
                                                        m.q(sQLiteDatabase2.query("event_metadata", new String[]{"event_id", "name", FirebaseAnalytics.Param.VALUE}, sb.toString(), null, null, null, null), new b.b(map, 10));
                                                        listIterator = arrayListF.listIterator();
                                                        while (listIterator.hasNext()) {
                                                            bVar2 = (b) listIterator.next();
                                                            if (!map.containsKey(Long.valueOf(bVar2.f13480a))) {
                                                                rVarC = bVar2.f13482c.c();
                                                                long j13 = bVar2.f13480a;
                                                                for (l lVar : (Set) map.get(Long.valueOf(j13))) {
                                                                    rVarC.a(lVar.f13500a, lVar.f13501b);
                                                                }
                                                                listIterator.set(new b(j13, bVar2.f13481b, rVarC.c()));
                                                            }
                                                        }
                                                        return arrayListF;
                                                    }
                                                    z2 z2VarA = l5.j.a();
                                                    z2VarA.L(jVar4.f11348a);
                                                    z2VarA.N(dVar);
                                                    z2VarA.f10984c = jVar4.f11349b;
                                                    arrayListF.addAll(mVar4.f(sQLiteDatabase2, z2VarA.j(), size));
                                                }
                                            }
                                            map = new HashMap();
                                            sb = new StringBuilder("event_id IN (");
                                            while (i18 < arrayListF.size()) {
                                                sb.append(((b) arrayListF.get(i18)).f13480a);
                                                if (i18 < arrayListF.size() - 1) {
                                                    sb.append(',');
                                                }
                                            }
                                            sb.append(')');
                                            m.q(sQLiteDatabase2.query("event_metadata", new String[]{"event_id", "name", FirebaseAnalytics.Param.VALUE}, sb.toString(), null, null, null, null), new b.b(map, 10));
                                            listIterator = arrayListF.listIterator();
                                            while (listIterator.hasNext()) {
                                                bVar2 = (b) listIterator.next();
                                                if (!map.containsKey(Long.valueOf(bVar2.f13480a))) {
                                                    rVarC = bVar2.f13482c.c();
                                                    long j14 = bVar2.f13480a;
                                                    while (r6.hasNext()) {
                                                        rVarC.a(lVar.f13500a, lVar.f13501b);
                                                    }
                                                    listIterator.set(new b(j14, bVar2.f13481b, rVarC.c()));
                                                }
                                            }
                                            return arrayListF;
                                    }
                                }
                            });
                    }
                }
            };
            m mVar2 = (m) iVar.f13183f;
            boolean zBooleanValue = ((Boolean) mVar2.g(bVar)).booleanValue();
            t5.a aVar3 = iVar.f13184g;
            if (!zBooleanValue) {
                i iVar2 = iVar;
                long j12 = j11;
                l5.j jVar3 = jVar2;
                SQLiteDatabase sQLiteDatabaseA = mVar2.a();
                l0 l0Var = new l0(16);
                t5.c cVar = (t5.c) mVar2.f13505c;
                long jA = cVar.a();
                while (true) {
                    try {
                        sQLiteDatabaseA.beginTransaction();
                        sQLiteDatabase = sQLiteDatabaseA;
                        break;
                    } catch (SQLiteDatabaseLockedException e4) {
                        sQLiteDatabase = sQLiteDatabaseA;
                        if (cVar.a() >= ((long) mVar2.f13506d.f13477c) + jA) {
                            l0Var.apply(e4);
                            break;
                        } else {
                            SystemClock.sleep(50L);
                            sQLiteDatabaseA = sQLiteDatabase;
                        }
                    }
                }
                try {
                    long jA2 = ((t5.c) aVar3).a() + j12;
                    m mVar3 = (m) iVar2.f13180c;
                    mVar3.getClass();
                    mVar3.e(new r5.f(jA2, jVar3));
                    sQLiteDatabase.setTransactionSuccessful();
                    return;
                } finally {
                    sQLiteDatabase.endTransaction();
                }
            }
            final int i14 = 1;
            final Iterable iterable = (Iterable) mVar2.g(new s5.b(iVar) { // from class: q5.f

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i f13169b;

                {
                    this.f13169b = iVar;
                }

                @Override // s5.b
                public final Object b() {
                    int i15 = i14;
                    final l5.j jVar4 = jVar2;
                    i iVar3 = this.f13169b;
                    switch (i15) {
                        case 0:
                            final m mVar4 = (m) iVar3.f13180c;
                            mVar4.getClass();
                            final int i16 = 0;
                            return Boolean.valueOf(((Boolean) mVar4.e(new r5.k() { // from class: r5.g
                                /* JADX WARN: Code duplicated, block: B:17:0x005e  */
                                /* JADX WARN: Code duplicated, block: B:19:0x0071  */
                                /* JADX WARN: Code duplicated, block: B:24:0x00aa  */
                                /* JADX WARN: Code duplicated, block: B:30:0x00d9 A[LOOP:3: B:28:0x00d3->B:30:0x00d9, LOOP_END] */
                                /* JADX WARN: Code duplicated, block: B:44:0x0076 A[SYNTHETIC] */
                                /* JADX WARN: Code duplicated, block: B:46:0x00bd A[SYNTHETIC] */
                                /* JADX WARN: Code duplicated, block: B:48:0x00a4 A[SYNTHETIC] */
                                @Override // r5.k
                                public final Object apply(Object obj) {
                                    HashMap map;
                                    StringBuilder sb;
                                    ListIterator listIterator;
                                    b bVar2;
                                    r rVarC;
                                    int i17 = i16;
                                    l5.j jVar5 = jVar4;
                                    m mVar5 = mVar4;
                                    switch (i17) {
                                        case 0:
                                            mVar5.getClass();
                                            Long lB = m.b((SQLiteDatabase) obj, jVar5);
                                            return lB == null ? Boolean.FALSE : (Boolean) m.q(mVar5.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lB.toString()}), new l0(19));
                                        default:
                                            SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) obj;
                                            a aVar4 = mVar5.f13506d;
                                            ArrayList arrayListF = mVar5.f(sQLiteDatabase2, jVar5, aVar4.f13476b);
                                            for (i5.d dVar : i5.d.values()) {
                                                if (dVar != jVar5.f11350c) {
                                                    int size = aVar4.f13476b - arrayListF.size();
                                                    if (size <= 0) {
                                                        map = new HashMap();
                                                        sb = new StringBuilder("event_id IN (");
                                                        for (int i18 = 0; i18 < arrayListF.size(); i18++) {
                                                            sb.append(((b) arrayListF.get(i18)).f13480a);
                                                            if (i18 < arrayListF.size() - 1) {
                                                                sb.append(',');
                                                            }
                                                        }
                                                        sb.append(')');
                                                        m.q(sQLiteDatabase2.query("event_metadata", new String[]{"event_id", "name", FirebaseAnalytics.Param.VALUE}, sb.toString(), null, null, null, null), new b.b(map, 10));
                                                        listIterator = arrayListF.listIterator();
                                                        while (listIterator.hasNext()) {
                                                            bVar2 = (b) listIterator.next();
                                                            if (!map.containsKey(Long.valueOf(bVar2.f13480a))) {
                                                                rVarC = bVar2.f13482c.c();
                                                                long j14 = bVar2.f13480a;
                                                                for (l lVar : (Set) map.get(Long.valueOf(j14))) {
                                                                    rVarC.a(lVar.f13500a, lVar.f13501b);
                                                                }
                                                                listIterator.set(new b(j14, bVar2.f13481b, rVarC.c()));
                                                            }
                                                        }
                                                        return arrayListF;
                                                    }
                                                    z2 z2VarA = l5.j.a();
                                                    z2VarA.L(jVar5.f11348a);
                                                    z2VarA.N(dVar);
                                                    z2VarA.f10984c = jVar5.f11349b;
                                                    arrayListF.addAll(mVar5.f(sQLiteDatabase2, z2VarA.j(), size));
                                                }
                                            }
                                            map = new HashMap();
                                            sb = new StringBuilder("event_id IN (");
                                            while (i18 < arrayListF.size()) {
                                                sb.append(((b) arrayListF.get(i18)).f13480a);
                                                if (i18 < arrayListF.size() - 1) {
                                                    sb.append(',');
                                                }
                                            }
                                            sb.append(')');
                                            m.q(sQLiteDatabase2.query("event_metadata", new String[]{"event_id", "name", FirebaseAnalytics.Param.VALUE}, sb.toString(), null, null, null, null), new b.b(map, 10));
                                            listIterator = arrayListF.listIterator();
                                            while (listIterator.hasNext()) {
                                                bVar2 = (b) listIterator.next();
                                                if (!map.containsKey(Long.valueOf(bVar2.f13480a))) {
                                                    rVarC = bVar2.f13482c.c();
                                                    long j15 = bVar2.f13480a;
                                                    while (r6.hasNext()) {
                                                        rVarC.a(lVar.f13500a, lVar.f13501b);
                                                    }
                                                    listIterator.set(new b(j15, bVar2.f13481b, rVarC.c()));
                                                }
                                            }
                                            return arrayListF;
                                    }
                                }
                            })).booleanValue());
                        default:
                            final m mVar5 = (m) iVar3.f13180c;
                            mVar5.getClass();
                            final int i17 = 1;
                            return (Iterable) mVar5.e(new r5.k() { // from class: r5.g
                                /* JADX WARN: Code duplicated, block: B:17:0x005e  */
                                /* JADX WARN: Code duplicated, block: B:19:0x0071  */
                                /* JADX WARN: Code duplicated, block: B:24:0x00aa  */
                                /* JADX WARN: Code duplicated, block: B:30:0x00d9 A[LOOP:3: B:28:0x00d3->B:30:0x00d9, LOOP_END] */
                                /* JADX WARN: Code duplicated, block: B:44:0x0076 A[SYNTHETIC] */
                                /* JADX WARN: Code duplicated, block: B:46:0x00bd A[SYNTHETIC] */
                                /* JADX WARN: Code duplicated, block: B:48:0x00a4 A[SYNTHETIC] */
                                @Override // r5.k
                                public final Object apply(Object obj) {
                                    HashMap map;
                                    StringBuilder sb;
                                    ListIterator listIterator;
                                    b bVar2;
                                    r rVarC;
                                    int i18 = i17;
                                    l5.j jVar5 = jVar4;
                                    m mVar6 = mVar5;
                                    switch (i18) {
                                        case 0:
                                            mVar6.getClass();
                                            Long lB = m.b((SQLiteDatabase) obj, jVar5);
                                            return lB == null ? Boolean.FALSE : (Boolean) m.q(mVar6.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lB.toString()}), new l0(19));
                                        default:
                                            SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) obj;
                                            a aVar4 = mVar6.f13506d;
                                            ArrayList arrayListF = mVar6.f(sQLiteDatabase2, jVar5, aVar4.f13476b);
                                            for (i5.d dVar : i5.d.values()) {
                                                if (dVar != jVar5.f11350c) {
                                                    int size = aVar4.f13476b - arrayListF.size();
                                                    if (size <= 0) {
                                                        map = new HashMap();
                                                        sb = new StringBuilder("event_id IN (");
                                                        for (int i19 = 0; i19 < arrayListF.size(); i19++) {
                                                            sb.append(((b) arrayListF.get(i19)).f13480a);
                                                            if (i19 < arrayListF.size() - 1) {
                                                                sb.append(',');
                                                            }
                                                        }
                                                        sb.append(')');
                                                        m.q(sQLiteDatabase2.query("event_metadata", new String[]{"event_id", "name", FirebaseAnalytics.Param.VALUE}, sb.toString(), null, null, null, null), new b.b(map, 10));
                                                        listIterator = arrayListF.listIterator();
                                                        while (listIterator.hasNext()) {
                                                            bVar2 = (b) listIterator.next();
                                                            if (!map.containsKey(Long.valueOf(bVar2.f13480a))) {
                                                                rVarC = bVar2.f13482c.c();
                                                                long j15 = bVar2.f13480a;
                                                                for (l lVar : (Set) map.get(Long.valueOf(j15))) {
                                                                    rVarC.a(lVar.f13500a, lVar.f13501b);
                                                                }
                                                                listIterator.set(new b(j15, bVar2.f13481b, rVarC.c()));
                                                            }
                                                        }
                                                        return arrayListF;
                                                    }
                                                    z2 z2VarA = l5.j.a();
                                                    z2VarA.L(jVar5.f11348a);
                                                    z2VarA.N(dVar);
                                                    z2VarA.f10984c = jVar5.f11349b;
                                                    arrayListF.addAll(mVar6.f(sQLiteDatabase2, z2VarA.j(), size));
                                                }
                                            }
                                            map = new HashMap();
                                            sb = new StringBuilder("event_id IN (");
                                            while (i19 < arrayListF.size()) {
                                                sb.append(((b) arrayListF.get(i19)).f13480a);
                                                if (i19 < arrayListF.size() - 1) {
                                                    sb.append(',');
                                                }
                                            }
                                            sb.append(')');
                                            m.q(sQLiteDatabase2.query("event_metadata", new String[]{"event_id", "name", FirebaseAnalytics.Param.VALUE}, sb.toString(), null, null, null, null), new b.b(map, 10));
                                            listIterator = arrayListF.listIterator();
                                            while (listIterator.hasNext()) {
                                                bVar2 = (b) listIterator.next();
                                                if (!map.containsKey(Long.valueOf(bVar2.f13480a))) {
                                                    rVarC = bVar2.f13482c.c();
                                                    long j16 = bVar2.f13480a;
                                                    while (r6.hasNext()) {
                                                        rVarC.a(lVar.f13500a, lVar.f13501b);
                                                    }
                                                    listIterator.set(new b(j16, bVar2.f13481b, rVarC.c()));
                                                }
                                            }
                                            return arrayListF;
                                    }
                                }
                            });
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            byte[] bArr = jVar2.f11349b;
            if (hVarA == null) {
                y3.e.Z("Uploader", "Unknown backend for %s, deleting event batch for it...", jVar2);
                aVar2 = new m5.a(3, -1L);
                hVar = hVarA;
                j10 = j11;
                mVar = mVar2;
            } else {
                ArrayList<l5.i> arrayList2 = new ArrayList();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((r5.b) it2.next()).f13482c);
                }
                if (bArr != null) {
                    r5.c cVar2 = iVar.f13186i;
                    Objects.requireNonNull(cVar2);
                    o5.a aVar4 = (o5.a) mVar2.g(new b.b(cVar2, 6));
                    r rVar = new r(1);
                    rVar.f10915g = new HashMap();
                    rVar.f10913e = Long.valueOf(((t5.c) aVar3).a());
                    rVar.f10914f = Long.valueOf(((t5.c) iVar.f13185h).a());
                    rVar.f10910b = "GDT_CLIENT_METRICS";
                    i5.c cVar3 = new i5.c("proto");
                    aVar4.getClass();
                    rVar.i(new l5.m(cVar3, p.f11361a.encode(aVar4)));
                    arrayList2.add(((j5.d) hVarA).a(rVar.c()));
                }
                j5.d dVar = (j5.d) hVarA;
                HashMap map = new HashMap();
                for (l5.i iVar3 : arrayList2) {
                    String str3 = iVar3.f11342a;
                    if (map.containsKey(str3)) {
                        ((List) map.get(str3)).add(iVar3);
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(iVar3);
                        map.put(str3, arrayList3);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = map.entrySet().iterator();
                while (it3.hasNext()) {
                    Map.Entry entry = (Map.Entry) it3.next();
                    l5.i iVar4 = (l5.i) ((List) entry.getValue()).get(i13);
                    x xVar = x.f9858a;
                    Long lValueOf = Long.valueOf(((t5.c) dVar.f8389f).a());
                    m5.h hVar2 = hVarA;
                    Long lValueOf2 = Long.valueOf(((t5.c) dVar.f8388e).a());
                    Iterator it4 = it3;
                    k5.k kVar = new k5.k(q.f9852a, new k5.i(Integer.valueOf(iVar4.b("sdk-version")), iVar4.a("model"), iVar4.a("hardware"), iVar4.a("device"), iVar4.a("product"), iVar4.a("os-uild"), iVar4.a("manufacturer"), iVar4.a("fingerprint"), iVar4.a("locale"), iVar4.a("country"), iVar4.a("mcc_mnc"), iVar4.a("application_build")));
                    try {
                        numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                        while (true) {
                            if (it.hasNext()) {
                                l5.i iVar5 = (l5.i) it.next();
                                Iterator it5 = it;
                                l5.m mVar4 = iVar5.f11344c;
                                m mVar5 = mVar2;
                                i5.c cVar4 = mVar4.f11357a;
                                long j13 = j11;
                                boolean zEquals = cVar4.equals(new i5.c("proto"));
                                byte[] bArr2 = mVar4.f11358b;
                                if (zEquals) {
                                    l3Var = new l3(1);
                                    l3Var.f10832d = bArr2;
                                } else {
                                    if (cVar4.equals(new i5.c("json"))) {
                                        String str4 = new String(bArr2, Charset.forName("UTF-8"));
                                        l3 l3Var2 = new l3(1);
                                        l3Var2.f10833e = str4;
                                        l3Var = l3Var2;
                                    } else {
                                        String strConcat = "TRuntime.".concat("CctTransportBackend");
                                        if (Log.isLoggable(strConcat, 5)) {
                                            Log.w(strConcat, String.format("Received event of unsupported encoding %s. Skipping...", cVar4));
                                        }
                                    }
                                    it = it5;
                                    mVar2 = mVar5;
                                    j11 = j13;
                                }
                                l3Var.f10829a = Long.valueOf(iVar5.f11345d);
                                l3Var.f10831c = Long.valueOf(iVar5.f11346e);
                                String str5 = (String) iVar5.f11347f.get("tz-offset");
                                l3Var.f10834f = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                                l3Var.f10835g = new o((v) v.f9856a.get(iVar5.b("net-type")), (u) u.f9854a.get(iVar5.b("mobile-subtype")));
                                Integer num = iVar5.f11343b;
                                if (num != null) {
                                    l3Var.f10830b = num;
                                }
                                String strJ = ((Long) l3Var.f10829a) == null ? " eventTimeMs" : "";
                                if (((Long) l3Var.f10831c) == null) {
                                    strJ = strJ.concat(" eventUptimeMs");
                                }
                                if (((Long) l3Var.f10834f) == null) {
                                    strJ = l.q.j(strJ, " timezoneOffsetSeconds");
                                }
                                if (!strJ.isEmpty()) {
                                    throw new IllegalStateException("Missing required properties:".concat(strJ));
                                }
                                arrayList.add(new k5.l(((Long) l3Var.f10829a).longValue(), (Integer) l3Var.f10830b, ((Long) l3Var.f10831c).longValue(), (byte[]) l3Var.f10832d, (String) l3Var.f10833e, ((Long) l3Var.f10834f).longValue(), (w) l3Var.f10835g));
                                it = it5;
                                mVar2 = mVar5;
                                j11 = j13;
                            }
                        }
                    } catch (NumberFormatException unused) {
                        str2 = (String) entry.getKey();
                        numValueOf = null;
                    }
                    arrayList = new ArrayList();
                    it = ((List) entry.getValue()).iterator();
                    long j14 = j11;
                    m mVar6 = mVar2;
                    String strConcat2 = lValueOf == null ? " requestTimeMs" : "";
                    if (lValueOf2 == null) {
                        strConcat2 = strConcat2.concat(" requestUptimeMs");
                    }
                    if (!strConcat2.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(strConcat2));
                    }
                    arrayList4.add(new k5.m(lValueOf.longValue(), lValueOf2.longValue(), kVar, numValueOf, str2, arrayList, xVar));
                    hVarA = hVar2;
                    it3 = it4;
                    mVar2 = mVar6;
                    j11 = j14;
                    i13 = 0;
                }
                hVar = hVarA;
                j10 = j11;
                mVar = mVar2;
                k5.j jVar4 = new k5.j(arrayList4);
                URL urlB = dVar.f8387d;
                if (bArr != null) {
                    try {
                        j5.a aVarA = j5.a.a(bArr);
                        str = aVarA.f8377b;
                        if (str == null) {
                            str = null;
                        }
                        String str6 = aVarA.f8376a;
                        if (str6 != null) {
                            urlB = j5.d.b(str6);
                        }
                        i11 = 3;
                    } catch (IllegalArgumentException unused2) {
                        aVar = new m5.a(3, -1L);
                    }
                } else {
                    i11 = 3;
                    str = null;
                }
                try {
                    j5.b bVar2 = new j5.b(urlB, jVar4, str);
                    b.b bVar3 = new b.b(dVar, i11);
                    int i15 = 5;
                    do {
                        objApply = bVar3.apply(bVar2);
                        j5.c cVar5 = (j5.c) objApply;
                        URL url = cVar5.f8382b;
                        if (url != null) {
                            y3.e.Z("CctTransportBackend", "Following redirect to: %s", url);
                            bVar2 = new j5.b(cVar5.f8382b, bVar2.f8379b, bVar2.f8380c);
                        } else {
                            bVar2 = null;
                        }
                        if (bVar2 == null) {
                            break;
                        } else {
                            i15--;
                        }
                    } while (i15 >= 1);
                    j5.c cVar6 = (j5.c) objApply;
                    int i16 = cVar6.f8381a;
                    if (i16 == 200) {
                        aVar2 = new m5.a(1, cVar6.f8383c);
                    } else {
                        if (i16 >= 500 || i16 == 404) {
                            aVar = new m5.a(2, -1L);
                        } else if (i16 == 400) {
                            try {
                                aVar = new m5.a(4, -1L);
                            } catch (IOException e10) {
                                e = e10;
                                y3.e.d0("CctTransportBackend", "Could not make request to the backend", e);
                                i12 = 2;
                                aVar2 = new m5.a(2, -1L);
                            }
                        } else {
                            aVar = new m5.a(3, -1L);
                        }
                        aVar2 = aVar;
                    }
                } catch (IOException e11) {
                    e = e11;
                }
            }
            i12 = 2;
            int i17 = aVar2.f11863a;
            if (i17 == i12) {
                final long j15 = j10;
                mVar.g(new s5.b() { // from class: q5.g
                    @Override // s5.b
                    public final Object b() {
                        i iVar6 = this.f13171a;
                        m mVar7 = (m) iVar6.f13180c;
                        mVar7.getClass();
                        Iterable iterable2 = iterable;
                        if (iterable2.iterator().hasNext()) {
                            mVar7.e(new p5.b(mVar7, "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + m.p(iterable2), "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", 2));
                        }
                        mVar7.e(new r5.f(((t5.c) iVar6.f13184g).a() + j15, jVar));
                        return null;
                    }
                });
                ((c) this.f13181d).a(jVar, i10 + 1, true);
                return;
            }
            m mVar7 = mVar;
            mVar7.g(new v3.a(1, this, iterable));
            if (i17 == 1) {
                jMax = Math.max(j10, aVar2.f11864b);
                if (bArr != null) {
                    mVar7.g(new b.b(this, 5));
                }
            } else {
                long j16 = j10;
                if (i17 == 4) {
                    HashMap map2 = new HashMap();
                    Iterator it6 = iterable.iterator();
                    while (it6.hasNext()) {
                        String str7 = ((r5.b) it6.next()).f13482c.f11342a;
                        if (map2.containsKey(str7)) {
                            map2.put(str7, Integer.valueOf(((Integer) map2.get(str7)).intValue() + 1));
                        } else {
                            map2.put(str7, 1);
                        }
                    }
                    mVar7.g(new v3.a(2, this, map2));
                }
                jMax = j16;
            }
            iVar = this;
            jVar2 = jVar;
            j11 = jMax;
            hVarA = hVar;
        }
    }
}
