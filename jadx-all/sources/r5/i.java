package r5;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Listener;
import i3.a0;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements k, Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f13494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Serializable f13495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13497d;

    public /* synthetic */ i(Object obj, AtomicBoolean atomicBoolean, TaskCompletionSource taskCompletionSource, Object obj2) {
        this.f13494a = obj;
        this.f13495b = atomicBoolean;
        this.f13496c = taskCompletionSource;
        this.f13497d = obj2;
    }

    @Override // r5.k
    public final Object apply(Object obj) {
        m mVar = (m) this.f13494a;
        String str = (String) this.f13495b;
        Map map = (Map) this.f13496c;
        a0 a0Var = (a0) this.f13497d;
        mVar.getClass();
        return (o5.a) m.q(((SQLiteDatabase) obj).rawQuery(str, new String[0]), new p5.b(mVar, map, a0Var, 4));
    }

    @Override // com.google.firebase.firestore.util.Listener
    public final void onValue(Object obj) {
        ((FirestoreClient) this.f13494a).lambda$new$2((AtomicBoolean) this.f13495b, (TaskCompletionSource) this.f13496c, (AsyncQueue) this.f13497d, (User) obj);
    }
}
