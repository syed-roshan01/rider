package b5;

import android.os.IBinder;
import com.auto.accept.service.RideAcceptorService;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2721b;

    public /* synthetic */ g(Object obj, int i10) {
        this.f2720a = i10;
        this.f2721b = obj;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i10 = this.f2720a;
        Object obj2 = this.f2721b;
        switch (i10) {
            case 0:
                return RideAcceptorService.m1515((c9.c) obj2, obj);
            default:
                c5.f fVar = (c5.f) obj2;
                IBinder iBinder = la.g.f11416a;
                return ((la.f) obj).f11414a == fVar;
        }
    }
}
