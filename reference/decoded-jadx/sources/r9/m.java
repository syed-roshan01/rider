package r9;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f13717e = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_next");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f13718f = AtomicLongFieldUpdater.newUpdater(m.class, "_state");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i3.u f13719g = new i3.u("REMOVE_FROZEN", 5);
    private volatile Object _next;
    private volatile long _state;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f13721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReferenceArray f13723d;

    public m(int i10, boolean z10) {
        this.f13720a = i10;
        this.f13721b = z10;
        int i11 = i10 - 1;
        this.f13722c = i11;
        this.f13723d = new AtomicReferenceArray(i10);
        if (i11 > 1073741823) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if ((i10 & i11) != 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f13718f;
            long j10 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j10) != 0) {
                return (j10 & 2305843009213693952L) != 0 ? 2 : 1;
            }
            int i10 = (int) (1073741823 & j10);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            int i12 = this.f13722c;
            if (((i11 + 2) & i12) == (i10 & i12)) {
                return 1;
            }
            boolean z10 = this.f13721b;
            AtomicReferenceArray atomicReferenceArray = this.f13723d;
            if (!z10 && atomicReferenceArray.get(i11 & i12) != null) {
                int i13 = this.f13720a;
                if (i13 < 1024 || ((i11 - i10) & 1073741823) > (i13 >> 1)) {
                    return 1;
                }
            } else if (f13718f.compareAndSet(this, j10, ((-1152921503533105153L) & j10) | (((long) ((i11 + 1) & 1073741823)) << 30))) {
                atomicReferenceArray.set(i11 & i12, obj);
                m mVarC = this;
                while ((atomicLongFieldUpdater.get(mVarC) & 1152921504606846976L) != 0) {
                    mVarC = mVarC.c();
                    AtomicReferenceArray atomicReferenceArray2 = mVarC.f13723d;
                    int i14 = mVarC.f13722c & i11;
                    Object obj2 = atomicReferenceArray2.get(i14);
                    if ((obj2 instanceof l) && ((l) obj2).f13716a == i11) {
                        atomicReferenceArray2.set(i14, obj);
                    } else {
                        mVarC = null;
                    }
                    if (mVarC == null) {
                        return 0;
                    }
                }
                return 0;
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j10;
        do {
            atomicLongFieldUpdater = f13718f;
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j10) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, 2305843009213693952L | j10));
        return true;
    }

    public final m c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j10;
        while (true) {
            atomicLongFieldUpdater = f13718f;
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 1152921504606846976L) != 0) {
                break;
            }
            long j11 = j10 | 1152921504606846976L;
            if (atomicLongFieldUpdater.compareAndSet(this, j10, j11)) {
                j10 = j11;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13717e;
            m mVar = (m) atomicReferenceFieldUpdater.get(this);
            if (mVar != null) {
                return mVar;
            }
            m mVar2 = new m(this.f13720a * 2, this.f13721b);
            int i10 = (int) (1073741823 & j10);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            while (true) {
                int i12 = this.f13722c;
                int i13 = i10 & i12;
                if (i13 == (i12 & i11)) {
                    break;
                }
                Object lVar = this.f13723d.get(i13);
                if (lVar == null) {
                    lVar = new l(i10);
                }
                mVar2.f13723d.set(mVar2.f13722c & i10, lVar);
                i10++;
            }
            atomicLongFieldUpdater.set(mVar2, (-1152921504606846977L) & j10);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, mVar2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f13718f;
            long j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 1152921504606846976L) != 0) {
                return f13719g;
            }
            int i10 = (int) (j10 & 1073741823);
            int i11 = this.f13722c;
            int i12 = i10 & i11;
            if ((((int) ((1152921503533105152L & j10) >> 30)) & i11) == i12) {
                return null;
            }
            AtomicReferenceArray atomicReferenceArray = this.f13723d;
            Object obj = atomicReferenceArray.get(i12);
            boolean z10 = this.f13721b;
            if (obj == null) {
                if (z10) {
                    return null;
                }
            } else {
                if (obj instanceof l) {
                    return null;
                }
                long j11 = (i10 + 1) & 1073741823;
                if (atomicLongFieldUpdater.compareAndSet(this, j10, (j10 & (-1073741824)) | j11)) {
                    atomicReferenceArray.set(i12, null);
                    return obj;
                }
                if (z10) {
                    m mVarC = this;
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f13718f;
                        long j12 = atomicLongFieldUpdater2.get(mVarC);
                        int i13 = (int) (j12 & 1073741823);
                        if ((j12 & 1152921504606846976L) != 0) {
                            mVarC = mVarC.c();
                        } else {
                            if (atomicLongFieldUpdater2.compareAndSet(mVarC, j12, (j12 & (-1073741824)) | j11)) {
                                mVarC.f13723d.set(mVarC.f13722c & i13, null);
                                mVarC = null;
                            } else {
                                continue;
                            }
                        }
                        if (mVarC == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
