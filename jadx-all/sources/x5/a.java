package x5;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ReentrantLock f16304c = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static a f16305d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f16306a = new ReentrantLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f16307b;

    public a(Context context) {
        this.f16307b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static a a(Context context) {
        f6.a.x(context);
        ReentrantLock reentrantLock = f16304c;
        reentrantLock.lock();
        try {
            if (f16305d == null) {
                f16305d = new a(context.getApplicationContext());
            }
            return f16305d;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final String b(String str) {
        ReentrantLock reentrantLock = this.f16306a;
        reentrantLock.lock();
        try {
            return this.f16307b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
