package f4;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f6220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f6221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f6222c;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f6220a = true;
        f6221b = true;
        f6222c = i10 >= 28;
    }
}
