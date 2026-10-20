package e8;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f5318d = Logger.getLogger(n0.class.getName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n0 f5319e = new n0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentSkipListMap f5320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f5321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f5322c;

    public n0() {
        new ConcurrentSkipListMap();
        this.f5320a = new ConcurrentSkipListMap();
        this.f5321b = new ConcurrentHashMap();
        this.f5322c = new ConcurrentHashMap();
        new ConcurrentHashMap();
    }
}
