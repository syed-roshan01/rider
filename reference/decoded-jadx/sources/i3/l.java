package i3;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f7968j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile l f7969k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f7970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q.g f7971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f7972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f7973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f7974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f7975f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l2.l f7976g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f7977h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e f7978i;

    public l(y yVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f7970a = reentrantReadWriteLock;
        this.f7972c = 3;
        this.f7975f = yVar.f7965a;
        int i10 = yVar.f7966b;
        this.f7977h = i10;
        this.f7978i = yVar.f7967c;
        this.f7973d = new Handler(Looper.getMainLooper());
        this.f7971b = new q.g(0);
        this.f7976g = new l2.l();
        g gVar = new g(this, 15);
        this.f7974e = gVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i10 == 0) {
            try {
                this.f7972c = 0;
            } catch (Throwable th) {
                this.f7970a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            gVar.Q();
        }
    }

    public static l a() {
        l lVar;
        synchronized (f7968j) {
            try {
                lVar = f7969k;
                if (!(lVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return lVar;
    }

    public static boolean c() {
        return f7969k != null;
    }

    public final int b() {
        this.f7970a.readLock().lock();
        try {
            return this.f7972c;
        } finally {
            this.f7970a.readLock().unlock();
        }
    }

    public final void d() {
        if (!(this.f7977h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f7970a.writeLock().lock();
        try {
            if (this.f7972c == 0) {
                this.f7970a.writeLock().unlock();
                return;
            }
            this.f7972c = 0;
            this.f7970a.writeLock().unlock();
            this.f7974e.Q();
        } catch (Throwable th) {
            this.f7970a.writeLock().unlock();
            throw th;
        }
    }

    public final void e(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f7970a.writeLock().lock();
        try {
            this.f7972c = 2;
            arrayList.addAll(this.f7971b);
            this.f7971b.clear();
            this.f7970a.writeLock().unlock();
            this.f7973d.post(new androidx.activity.h(arrayList, this.f7972c, th));
        } catch (Throwable th2) {
            this.f7970a.writeLock().unlock();
            throw th2;
        }
    }

    public final void f() {
        ArrayList arrayList = new ArrayList();
        this.f7970a.writeLock().lock();
        try {
            this.f7972c = 1;
            arrayList.addAll(this.f7971b);
            this.f7971b.clear();
            this.f7970a.writeLock().unlock();
            this.f7973d.post(new androidx.activity.h(this.f7972c, arrayList));
        } catch (Throwable th) {
            this.f7970a.writeLock().unlock();
            throw th;
        }
    }

    public final CharSequence g(int i10, int i11, CharSequence charSequence) {
        if (!(b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        if (!(i10 <= i11)) {
            throw new IllegalArgumentException("start should be <= than end");
        }
        if (charSequence == null) {
            return null;
        }
        if (!(i10 <= charSequence.length())) {
            throw new IllegalArgumentException("start should be < than charSequence length");
        }
        if (i11 <= charSequence.length()) {
            return (charSequence.length() == 0 || i10 == i11) ? charSequence : this.f7974e.R(charSequence, i10, i11, false);
        }
        throw new IllegalArgumentException("end should be < than charSequence length");
    }

    public final void h(j jVar) {
        if (jVar == null) {
            throw new NullPointerException("initCallback cannot be null");
        }
        this.f7970a.writeLock().lock();
        try {
            if (this.f7972c == 1 || this.f7972c == 2) {
                this.f7973d.post(new androidx.activity.h(jVar, this.f7972c));
            } else {
                this.f7971b.add(jVar);
            }
        } finally {
            this.f7970a.writeLock().unlock();
        }
    }
}
