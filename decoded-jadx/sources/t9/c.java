package t9;

import java.util.concurrent.Executor;
import m9.x0;
import m9.z;
import r9.v;

/* JADX INFO: loaded from: classes.dex */
public final class c extends x0 implements Executor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f14690c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z f14691d;

    static {
        k kVar = k.f14706c;
        int i10 = v.f13730a;
        if (64 >= i10) {
            i10 = 64;
        }
        f14691d = kVar.e0(r9.a.r("kotlinx.coroutines.io.parallelism", i10, 0, 0, 12));
    }

    @Override // m9.z
    public final void c0(u8.j jVar, Runnable runnable) {
        f14691d.c0(jVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // m9.z
    public final z e0(int i10) {
        return k.f14706c.e0(1);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c0(u8.k.f15438a, runnable);
    }

    @Override // m9.z
    public final String toString() {
        return "Dispatchers.IO";
    }
}
