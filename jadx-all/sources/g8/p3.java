package g8;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class p3 extends n1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ReferenceQueue f7034c = new ReferenceQueue();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f7035d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f7036e = Logger.getLogger(p3.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o3 f7037b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(l3 l3Var) {
        super(l3Var);
        ReferenceQueue referenceQueue = f7034c;
        ConcurrentHashMap concurrentHashMap = f7035d;
        this.f7037b = new o3(this, l3Var, referenceQueue, concurrentHashMap);
    }

    @Override // e8.c1
    public final e8.c1 w() {
        o3 o3Var = this.f7037b;
        if (!o3Var.f7022e.getAndSet(true)) {
            o3Var.clear();
        }
        return this.f6979a.w();
    }

    @Override // e8.c1
    public final e8.c1 x() {
        o3 o3Var = this.f7037b;
        if (!o3Var.f7022e.getAndSet(true)) {
            o3Var.clear();
        }
        return this.f6979a.x();
    }
}
