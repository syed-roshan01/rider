package b3;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public abstract class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Field f2624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Field f2625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Field f2626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f2627d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f2624a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f2625b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f2626c = declaredField3;
            declaredField3.setAccessible(true);
            f2627d = true;
        } catch (ReflectiveOperationException e4) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e4.getMessage(), e4);
        }
    }
}
