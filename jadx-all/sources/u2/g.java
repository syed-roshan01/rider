package u2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends k.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Class f15402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Constructor f15403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Method f15404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Method f15405f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static boolean f15406n;

    public g() {
        super(10);
    }

    public static boolean O(int i10, Object obj, String str, boolean z10) {
        P();
        try {
            return ((Boolean) f15404e.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static void P() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f15406n) {
            return;
        }
        f15406n = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e4) {
            Log.e("TypefaceCompatApi21Impl", e4.getClass().getName(), e4);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f15403d = constructor;
        f15402c = cls;
        f15404e = method2;
        f15405f = method;
    }

    @Override // k.f
    public Typeface q(Context context, t2.f fVar, Resources resources, int i10) {
        P();
        try {
            Object objNewInstance = f15403d.newInstance(new Object[0]);
            for (t2.g gVar : fVar.f14605a) {
                File fileS = i1.b.s(context);
                if (fileS == null) {
                    return null;
                }
                try {
                    if (!i1.b.j(fileS, resources, gVar.f14611f)) {
                        return null;
                    }
                    if (!O(gVar.f14607b, objNewInstance, fileS.getPath(), gVar.f14608c)) {
                        return null;
                    }
                    fileS.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileS.delete();
                }
            }
            P();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) f15402c, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f15405f.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e4) {
                throw new RuntimeException(e4);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }
}
