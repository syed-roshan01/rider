package ja;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class s implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f8571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReentrantLock f8573c = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RandomAccessFile f8574d;

    public s(RandomAccessFile randomAccessFile) {
        this.f8574d = randomAccessFile;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void close() {
        ReentrantLock reentrantLock = this.f8573c;
        reentrantLock.lock();
        try {
            if (this.f8571a) {
                reentrantLock.unlock();
                return;
            }
            this.f8571a = true;
            if (this.f8572b != 0) {
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            synchronized (this) {
                this.f8574d.close();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long b() {
        long length;
        ReentrantLock reentrantLock = this.f8573c;
        reentrantLock.lock();
        try {
            if (!(!this.f8571a)) {
                throw new IllegalStateException("closed".toString());
            }
            reentrantLock.unlock();
            synchronized (this) {
                length = this.f8574d.length();
            }
            return length;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final k e(long j10) {
        ReentrantLock reentrantLock = this.f8573c;
        reentrantLock.lock();
        try {
            if (!(!this.f8571a)) {
                throw new IllegalStateException("closed".toString());
            }
            this.f8572b++;
            reentrantLock.unlock();
            return new k(this, j10);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
