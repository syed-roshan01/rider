package ja;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class k implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f8547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f8548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8549c;

    public k(s sVar, long j10) {
        d7.a.m(sVar, "fileHandle");
        this.f8547a = sVar;
        this.f8548b = j10;
    }

    @Override // ja.g0
    public final long I(g gVar, long j10) {
        long j11;
        long j12;
        long j13;
        int i10;
        d7.a.m(gVar, "sink");
        int i11 = 1;
        if (!(!this.f8549c)) {
            throw new IllegalStateException("closed".toString());
        }
        s sVar = this.f8547a;
        long j14 = this.f8548b;
        sVar.getClass();
        if (j10 < 0) {
            throw new IllegalArgumentException(a7.a.l("byteCount < 0: ", j10).toString());
        }
        long j15 = j10 + j14;
        long j16 = j14;
        while (true) {
            if (j16 < j15) {
                b0 b0VarD0 = gVar.d0(i11);
                byte[] bArr = b0VarD0.f8507a;
                int i12 = b0VarD0.f8509c;
                j11 = j14;
                int iMin = (int) Math.min(j15 - j16, 8192 - i12);
                synchronized (sVar) {
                    d7.a.m(bArr, "array");
                    sVar.f8574d.seek(j16);
                    i10 = 0;
                    while (true) {
                        if (i10 < iMin) {
                            int i13 = sVar.f8574d.read(bArr, i12, iMin - i10);
                            if (i13 != -1) {
                                i10 += i13;
                            } else if (i10 == 0) {
                                i10 = -1;
                                break;
                            }
                        }
                        break;
                    }
                }
                if (i10 == -1) {
                    if (b0VarD0.f8508b == b0VarD0.f8509c) {
                        gVar.f8533a = b0VarD0.a();
                        c0.a(b0VarD0);
                    }
                    if (j11 == j16) {
                        j13 = -1;
                        j12 = -1;
                        break;
                    }
                } else {
                    b0VarD0.f8509c += i10;
                    long j17 = i10;
                    j16 += j17;
                    gVar.f8534b += j17;
                    j14 = j11;
                    i11 = 1;
                }
            } else {
                j11 = j14;
            }
            j12 = j16 - j11;
            j13 = -1;
            break;
        }
        if (j12 != j13) {
            this.f8548b += j12;
        }
        return j12;
    }

    @Override // ja.g0
    public final i0 c() {
        return i0.f8535d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f8549c) {
            return;
        }
        this.f8549c = true;
        s sVar = this.f8547a;
        ReentrantLock reentrantLock = sVar.f8573c;
        reentrantLock.lock();
        try {
            int i10 = sVar.f8572b - 1;
            sVar.f8572b = i10;
            if (i10 == 0 && sVar.f8571a) {
                reentrantLock.unlock();
                synchronized (sVar) {
                    sVar.f8574d.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
