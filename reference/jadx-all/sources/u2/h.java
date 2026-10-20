package u2;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class h extends g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Class f15407o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Constructor f15408p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Method f15409q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Method f15410r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Method f15411s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Method f15412t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Method f15413u;

    public h() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method methodW;
        Method methodX;
        Method method2;
        Method methodY;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            methodW = W(cls);
            methodX = X(cls);
            method2 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            methodY = Y(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e4) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e4.getClass().getName()), e4);
            cls = null;
            method = null;
            constructor = null;
            methodW = null;
            methodX = null;
            method2 = null;
            methodY = null;
        }
        this.f15407o = cls;
        this.f15408p = constructor;
        this.f15409q = methodW;
        this.f15410r = methodX;
        this.f15411s = method2;
        this.f15412t = method;
        this.f15413u = methodY;
    }

    public static Method W(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public static Method X(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public final void Q(Object obj) {
        try {
            this.f15412t.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean R(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f15409q.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface S(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f15407o, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f15413u.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean T(Object obj) {
        try {
            return ((Boolean) this.f15411s.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean U() {
        Method method = this.f15409q;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    public final Object V() {
        try {
            return this.f15408p.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method Y(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // u2.g, k.f
    public final Typeface q(Context context, t2.f fVar, Resources resources, int i10) {
        if (!U()) {
            return super.q(context, fVar, resources, i10);
        }
        Object objV = V();
        if (objV == null) {
            return null;
        }
        for (t2.g gVar : fVar.f14605a) {
            if (!R(context, objV, gVar.f14606a, gVar.f14610e, gVar.f14607b, gVar.f14608c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(gVar.f14609d))) {
                Q(objV);
                return null;
            }
        }
        if (T(objV)) {
            return S(objV);
        }
        return null;
    }

    @Override // k.f
    public final Typeface r(Context context, y2.h[] hVarArr, int i10) {
        Typeface typefaceS;
        if (hVarArr.length < 1) {
            return null;
        }
        if (!U()) {
            y2.h hVarX = x(i10, hVarArr);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(hVarX.f16865a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(hVarX.f16867c).setItalic(hVarX.f16868d).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } catch (Throwable th) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap map = new HashMap();
        for (y2.h hVar : hVarArr) {
            if (hVar.f16869e == 0) {
                Uri uri = hVar.f16865a;
                if (!map.containsKey(uri)) {
                    map.put(uri, i1.b.v(context, uri));
                }
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Object objV = V();
        if (objV == null) {
            return null;
        }
        int length = hVarArr.length;
        int i11 = 0;
        boolean z10 = false;
        while (i11 < length) {
            y2.h hVar2 = hVarArr[i11];
            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(hVar2.f16865a);
            if (byteBuffer != null) {
                try {
                    if (!((Boolean) this.f15410r.invoke(objV, byteBuffer, Integer.valueOf(hVar2.f16866b), null, Integer.valueOf(hVar2.f16867c), Integer.valueOf(hVar2.f16868d ? 1 : 0))).booleanValue()) {
                        Q(objV);
                        return null;
                    }
                    z10 = true;
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            }
            i11++;
            z10 = z10;
        }
        if (!z10) {
            Q(objV);
            return null;
        }
        if (T(objV) && (typefaceS = S(objV)) != null) {
            return Typeface.create(typefaceS, i10);
        }
        return null;
    }

    @Override // k.f
    public final Typeface t(Context context, Resources resources, int i10, String str, int i11) {
        if (!U()) {
            return super.t(context, resources, i10, str, i11);
        }
        Object objV = V();
        if (objV == null) {
            return null;
        }
        if (!R(context, objV, str, 0, -1, -1, null)) {
            Q(objV);
            return null;
        }
        if (T(objV)) {
            return S(objV);
        }
        return null;
    }
}
