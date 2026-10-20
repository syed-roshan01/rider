package q5;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import b0.l0;
import com.google.firebase.firestore.local.SQLiteDocumentOverlayCache;
import java.util.Map;
import java.util.Objects;
import r5.m;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13167e;

    public /* synthetic */ e(int i10, int i11, Object obj, Object obj2, Object obj3) {
        this.f13163a = i11;
        this.f13165c = obj;
        this.f13166d = obj2;
        this.f13164b = i10;
        this.f13167e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SQLiteDatabase sQLiteDatabase;
        int i10 = this.f13163a;
        int i11 = this.f13164b;
        Object obj = this.f13167e;
        Object obj2 = this.f13166d;
        Object obj3 = this.f13165c;
        switch (i10) {
            case 0:
                i iVar = (i) obj3;
                l5.j jVar = (l5.j) obj2;
                Runnable runnable = (Runnable) obj;
                l lVar = iVar.f13181d;
                s5.c cVar = iVar.f13183f;
                try {
                    try {
                        r5.d dVar = iVar.f13180c;
                        Objects.requireNonNull(dVar);
                        ((m) cVar).g(new b.b(dVar, 4));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) iVar.f13178a.getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            m mVar = (m) cVar;
                            SQLiteDatabase sQLiteDatabaseA = mVar.a();
                            l0 l0Var = new l0(16);
                            t5.c cVar2 = (t5.c) mVar.f13505c;
                            long jA = cVar2.a();
                            while (true) {
                                try {
                                    sQLiteDatabaseA.beginTransaction();
                                    sQLiteDatabase = sQLiteDatabaseA;
                                } catch (SQLiteDatabaseLockedException e4) {
                                    sQLiteDatabase = sQLiteDatabaseA;
                                    if (cVar2.a() >= ((long) mVar.f13506d.f13477c) + jA) {
                                        l0Var.apply(e4);
                                    } else {
                                        SystemClock.sleep(50L);
                                        sQLiteDatabaseA = sQLiteDatabase;
                                    }
                                }
                            }
                            try {
                                ((c) lVar).a(jVar, i11 + 1, false);
                                sQLiteDatabase.setTransactionSuccessful();
                                sQLiteDatabase.endTransaction();
                            } catch (Throwable th) {
                                sQLiteDatabase.endTransaction();
                                throw th;
                            }
                        } else {
                            iVar.a(jVar, i11);
                        }
                    } catch (s5.a unused) {
                        ((c) lVar).a(jVar, i11 + 1, false);
                    }
                    runnable.run();
                    return;
                } catch (Throwable th2) {
                    runnable.run();
                    throw th2;
                }
            default:
                ((SQLiteDocumentOverlayCache) obj3).lambda$processOverlaysInBackground$5((byte[]) obj2, i11, (Map) obj);
                return;
        }
    }
}
