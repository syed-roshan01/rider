package ja;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f8517a = new b0(new byte[0], 0, 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f8518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f8519c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f8518b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i10 = 0; i10 < iHighestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference();
        }
        f8519c = atomicReferenceArr;
    }

    public static final void a(b0 b0Var) {
        if (b0Var.f8512f != null || b0Var.f8513g != null) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (b0Var.f8510d) {
            return;
        }
        AtomicReference atomicReference = f8519c[(int) (Thread.currentThread().getId() & (((long) f8518b) - 1))];
        b0 b0Var2 = f8517a;
        b0 b0Var3 = (b0) atomicReference.getAndSet(b0Var2);
        if (b0Var3 == b0Var2) {
            return;
        }
        int i10 = b0Var3 != null ? b0Var3.f8509c : 0;
        if (i10 >= 65536) {
            atomicReference.set(b0Var3);
            return;
        }
        b0Var.f8512f = b0Var3;
        b0Var.f8508b = 0;
        b0Var.f8509c = i10 + 8192;
        atomicReference.set(b0Var);
    }

    public static final b0 b() {
        AtomicReference atomicReference = f8519c[(int) (Thread.currentThread().getId() & (((long) f8518b) - 1))];
        b0 b0Var = f8517a;
        b0 b0Var2 = (b0) atomicReference.getAndSet(b0Var);
        if (b0Var2 == b0Var) {
            return new b0();
        }
        if (b0Var2 == null) {
            atomicReference.set(null);
            return new b0();
        }
        atomicReference.set(b0Var2.f8512f);
        b0Var2.f8512f = null;
        b0Var2.f8509c = 0;
        return b0Var2;
    }
}
