package p5;

import android.content.Context;
import b0.l0;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.FirebaseFirestoreSettings;
import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.core.Query;
import java.util.List;
import java.util.logging.Logger;
import l5.i;
import l5.j;
import m5.h;
import r5.m;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f12770e;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f12766a = i10;
        this.f12767b = obj;
        this.f12768c = obj2;
        this.f12769d = obj3;
        this.f12770e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f12766a;
        Object obj = this.f12770e;
        Object obj2 = this.f12769d;
        Object obj3 = this.f12768c;
        Object obj4 = this.f12767b;
        switch (i10) {
            case 0:
                c cVar = (c) obj4;
                j jVar = (j) obj3;
                l0 l0Var = (l0) obj2;
                i iVar = (i) obj;
                cVar.getClass();
                Logger logger = c.f12775f;
                try {
                    h hVarA = cVar.f12778c.a(jVar.f11348a);
                    int i11 = 0;
                    if (hVarA == null) {
                        String str = String.format("Transport backend '%s' is not registered", jVar.f11348a);
                        logger.warning(str);
                        new IllegalArgumentException(str);
                        l0Var.getClass();
                    } else {
                        ((m) cVar.f12780e).g(new b(cVar, jVar, ((j5.d) hVarA).a(iVar), i11));
                        l0Var.getClass();
                    }
                } catch (Exception e4) {
                    logger.warning("Error scheduling event " + e4.getMessage());
                    l0Var.getClass();
                    return;
                }
                break;
            case 1:
                ((FirestoreClient) obj4).lambda$runAggregateQuery$16((Query) obj3, (List) obj2, (TaskCompletionSource) obj);
                break;
            default:
                ((FirestoreClient) obj4).lambda$new$0((TaskCompletionSource) obj3, (Context) obj2, (FirebaseFirestoreSettings) obj);
                break;
        }
    }
}
