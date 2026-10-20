package la;

import android.util.Log;
import java.lang.reflect.Method;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f11431a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f11432b;

    static {
        new HashMap();
        try {
            f11432b = Class.forName("android.os.ServiceManager").getMethod("getService", String.class);
        } catch (ClassNotFoundException | NoSuchMethodException e4) {
            Log.w("SystemServiceHelper", Log.getStackTraceString(e4));
        }
    }
}
