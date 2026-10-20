package h5;

import android.os.Handler;
import android.os.Looper;
import d9.j;

/* JADX INFO: loaded from: classes.dex */
public final class b extends j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f7559a = new b(0);

    @Override // c9.a
    public final Object invoke() {
        return new Handler(Looper.getMainLooper());
    }
}
