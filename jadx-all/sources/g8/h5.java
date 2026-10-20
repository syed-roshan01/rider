package g8;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class h5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicInteger f6837d;

    public h5(float f10, float f11) {
        AtomicInteger atomicInteger = new AtomicInteger();
        this.f6837d = atomicInteger;
        this.f6836c = (int) (f11 * 1000.0f);
        int i10 = (int) (f10 * 1000.0f);
        this.f6834a = i10;
        this.f6835b = i10 / 2;
        atomicInteger.set(i10);
    }

    public final boolean a() {
        AtomicInteger atomicInteger;
        int i10;
        int i11;
        do {
            atomicInteger = this.f6837d;
            i10 = atomicInteger.get();
            if (i10 == 0) {
                return false;
            }
            i11 = i10 - 1000;
        } while (!atomicInteger.compareAndSet(i10, Math.max(i11, 0)));
        return i11 > this.f6835b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5)) {
            return false;
        }
        h5 h5Var = (h5) obj;
        return this.f6834a == h5Var.f6834a && this.f6836c == h5Var.f6836c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6834a), Integer.valueOf(this.f6836c)});
    }
}
