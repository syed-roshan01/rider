package l;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import g8.m4;
import g8.v3;
import g8.x3;
import g8.x5;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import k6.w4;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class z2 implements x2.f, ActivityComponentBuilder, g8.r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f10983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f10984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f10985d;

    public z2(int i10) {
        this.f10982a = i10;
        if (i10 == 9) {
            this.f10983b = r6.i.a();
            return;
        }
        if (i10 == 14) {
            this.f10983b = null;
            this.f10984c = null;
            this.f10985d = e7.c.f5157e;
        } else if (i10 == 16) {
            this.f10983b = new ArrayList();
            this.f10984c = g7.a.f6624b;
            this.f10985d = null;
        } else if (i10 == 19) {
            this.f10984c = e8.c.f5206b;
        } else {
            if (i10 != 20) {
                return;
            }
            this.f10983b = Collections.emptyList();
            this.f10984c = e8.c.f5206b;
        }
    }

    public static z2 I(Context context, AttributeSet attributeSet, int[] iArr, int i10) {
        return new z2(0, context, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
    }

    public static s4.e o(s4.j jVar, Throwable th) {
        Drawable drawableB;
        if (th instanceof s4.m) {
            drawableB = w4.d.b(jVar, jVar.K, jVar.J, jVar.M.f13945l);
            if (drawableB == null) {
                drawableB = w4.d.b(jVar, jVar.I, jVar.H, jVar.M.f13944k);
            }
        } else {
            drawableB = w4.d.b(jVar, jVar.I, jVar.H, jVar.M.f13944k);
        }
        return new s4.e(drawableB, jVar, th);
    }

    public static Method y(Class cls, String str, Class[] clsArr) {
        if (cls == null) {
            return null;
        }
        try {
            if ((cls.getModifiers() & 1) == 0) {
                return y(cls.getSuperclass(), str, clsArr);
            }
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    public final int A(b8.c cVar) {
        int i10 = 0;
        for (c8.e eVar : (List) this.f10983b) {
            b8.b bVar = eVar.f3053a;
            int iA = bVar.a(cVar);
            int iA2 = iA + 4;
            int iOrdinal = bVar.ordinal();
            int i11 = eVar.f3056d;
            if (iOrdinal == 1) {
                int i12 = ((i11 / 3) * 10) + iA2;
                int i13 = i11 % 3;
                iA2 = i12 + (i13 != 1 ? i13 == 2 ? 7 : 0 : 4);
            } else if (iOrdinal == 2) {
                iA2 = ((i11 / 2) * 11) + iA2 + (i11 % 2 != 1 ? 0 : 6);
            } else if (iOrdinal == 4) {
                iA2 += eVar.a() * 8;
            } else if (iOrdinal == 5) {
                iA2 = iA + 12;
            } else if (iOrdinal == 6) {
                iA2 += i11 * 13;
            }
            i10 += iA2;
        }
        return i10;
    }

    public final String B(int i10) {
        return ((TypedArray) this.f10984c).getString(i10);
    }

    public final CharSequence C(int i10) {
        return ((TypedArray) this.f10984c).getText(i10);
    }

    public final boolean D(int i10) {
        return ((TypedArray) this.f10984c).hasValue(i10);
    }

    public final Object E(Object obj, Object... objArr) {
        Method methodW = w(obj.getClass());
        if (methodW == null) {
            throw new AssertionError("Method " + ((String) this.f10984c) + " not supported for object " + obj);
        }
        try {
            return methodW.invoke(obj, objArr);
        } catch (IllegalAccessException e4) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + methodW);
            assertionError.initCause(e4);
            throw assertionError;
        }
    }

    public final void F(Object obj, Object... objArr) {
        try {
            Method methodW = w(obj.getClass());
            if (methodW == null) {
                return;
            }
            try {
                methodW.invoke(obj, objArr);
            } catch (IllegalAccessException unused) {
            }
        } catch (InvocationTargetException e4) {
            Throwable targetException = e4.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public final Object G(Object obj, Object... objArr) {
        try {
            return E(obj, objArr);
        } catch (InvocationTargetException e4) {
            Throwable targetException = e4.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public final boolean H() {
        if (((m0.l3) this.f10983b).getValue() == this.f10985d) {
            Object obj = this.f10984c;
            if (((z2) obj) == null || !((z2) obj).H()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    /* JADX WARN: Code duplicated, block: B:6:0x0018  */
    public final s4.n J(s4.j jVar, t4.f fVar) {
        Bitmap.Config config;
        Bitmap.Config config2;
        Bitmap.Config config3;
        if (jVar.f14006l.isEmpty()) {
            config = jVar.f14001g;
            config2 = Bitmap.Config.HARDWARE;
            if (config == config2) {
            }
            config3 = jVar.f14001g;
        } else {
            if (b9.b.F(jVar.f14001g, w4.e.f16163a)) {
                config = jVar.f14001g;
                config2 = Bitmap.Config.HARDWARE;
                if (config == config2 || ((config != config2 || jVar.f14011q) && ((w4.i) this.f10985d).b(fVar))) {
                    config3 = jVar.f14001g;
                } else {
                    config3 = Bitmap.Config.ARGB_8888;
                }
            } else {
                config3 = Bitmap.Config.ARGB_8888;
            }
        }
        Bitmap.Config config4 = config3;
        s4.b bVar = ((w4.l) this.f10984c).f16188d ? jVar.f14016v : s4.b.DISABLED;
        f6.a aVar = fVar.f14658a;
        t4.b bVar2 = t4.b.f14648z;
        return new s4.n(jVar.f13995a, config4, jVar.f14002h, fVar, (d7.a.d(aVar, bVar2) || d7.a.d(fVar.f14659b, bVar2)) ? t4.e.f14655b : jVar.C, w4.d.a(jVar), jVar.f14012r && jVar.f14006l.isEmpty() && config4 != Bitmap.Config.ALPHA_8, jVar.f14013s, jVar.f14000f, jVar.f14008n, jVar.f14009o, jVar.D, jVar.f14014t, jVar.f14015u, bVar);
    }

    public final void K() {
        ((TypedArray) this.f10984c).recycle();
    }

    public final void L(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f10983b = str;
    }

    public final void M(int i10) {
        if (i10 != 16 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i10 * 8)));
        }
        this.f10983b = Integer.valueOf(i10);
    }

    public final void N(i5.d dVar) {
        if (dVar == null) {
            throw new NullPointerException("Null priority");
        }
        this.f10985d = dVar;
    }

    public final void O(int i10) {
        if (i10 < 10 || 16 < i10) {
            throw new GeneralSecurityException(q.g("Invalid tag size for AesCmacParameters: ", i10));
        }
        this.f10984c = Integer.valueOf(i10);
    }

    @Override // g8.r0
    public final void a(int i10) {
        ((v3) this.f10983b).a(new r7.h(this, new com.google.android.gms.common.api.internal.c0(this, i10, 1), 0));
    }

    @Override // dagger.hilt.android.internal.builders.ActivityComponentBuilder
    public final ActivityComponentBuilder activity(Activity activity) {
        activity.getClass();
        this.f10985d = activity;
        return this;
    }

    @Override // g8.r0
    public final void b(int i10) {
        ((x3) this.f10985d).f7219b = i10;
    }

    @Override // dagger.hilt.android.internal.builders.ActivityComponentBuilder
    public final ActivityComponent build() {
        z6.a.g(Activity.class, (Activity) this.f10985d);
        return new y4.h((y4.n) this.f10983b, (y4.j) this.f10984c);
    }

    @Override // x2.f
    public final void c() {
        ((Animator) this.f10983b).end();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + ((androidx.fragment.app.s1) this.f10984c) + " has been canceled.");
        }
    }

    @Override // g8.r0, java.lang.AutoCloseable
    public final void close() {
        ((x3) this.f10985d).f7236z = true;
        ((v3) this.f10983b).a(new r7.h(this, new g8.h(this, 1), 0));
    }

    public final e7.a d() throws GeneralSecurityException {
        w4 w4Var;
        e7.d dVar = (e7.d) this.f10983b;
        if (dVar == null || (w4Var = (w4) this.f10984c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (dVar.f5159b != w4Var.i()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        Object obj = this.f10983b;
        e7.c cVar = e7.c.f5157e;
        if (((e7.d) obj).f5161d != cVar && ((Integer) this.f10985d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (((e7.d) obj).f5161d == cVar && ((Integer) this.f10985d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        return new e7.a((e7.d) this.f10983b, x());
    }

    @Override // g8.r0
    public final void e(m4 m4Var) {
        ((v3) this.f10983b).a(new g8.i(this, new g8.x1(1, this, m4Var), new g8.g(m4Var)));
    }

    @Override // g8.r0
    public final void f() {
        int i10 = 0;
        ((v3) this.f10983b).a(new r7.h(this, new g8.h(this, i10), i10));
    }

    @Override // g8.r0
    public final void g(e8.s sVar) {
        ((x3) this.f10985d).g(sVar);
    }

    public final e7.d h() {
        Integer num = (Integer) this.f10983b;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (((Integer) this.f10984c) == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (((e7.c) this.f10985d) != null) {
            return new e7.d(num.intValue(), ((Integer) this.f10984c).intValue(), (e7.c) this.f10985d);
        }
        throw new GeneralSecurityException("variant not set");
    }

    public final e7.i i() throws GeneralSecurityException {
        w4 w4Var;
        e7.m mVar = (e7.m) this.f10983b;
        if (mVar == null || (w4Var = (w4) this.f10984c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (mVar.f5181b != w4Var.i()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        Object obj = this.f10983b;
        e7.l lVar = e7.l.f5179e;
        if (((e7.m) obj).f5183d != lVar && ((Integer) this.f10985d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (((e7.m) obj).f5183d == lVar && ((Integer) this.f10985d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        return new e7.i((e7.m) this.f10983b, x());
    }

    public final l5.j j() {
        String strConcat = ((String) this.f10983b) == null ? " backendName" : "";
        if (((i5.d) this.f10985d) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new l5.j((String) this.f10983b, (byte[]) this.f10984c, (i5.d) this.f10985d);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    public final q5.b k() {
        String strJ = ((Long) this.f10983b) == null ? " delta" : "";
        if (((Long) this.f10984c) == null) {
            strJ = strJ.concat(" maxAllowedDelay");
        }
        if (((Set) this.f10985d) == null) {
            strJ = q.j(strJ, " flags");
        }
        if (strJ.isEmpty()) {
            return new q5.b(((Long) this.f10983b).longValue(), ((Long) this.f10984c).longValue(), (Set) this.f10985d);
        }
        throw new IllegalStateException("Missing required properties:".concat(strJ));
    }

    public final w6.i l() throws GeneralSecurityException {
        w4 w4Var;
        w6.k kVar = (w6.k) this.f10983b;
        if (kVar == null || (w4Var = (w4) this.f10984c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (kVar.f16214b != w4Var.i()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        Object obj = this.f10983b;
        w6.j jVar = w6.j.f16212d;
        if (((w6.k) obj).f16217e != jVar && ((Integer) this.f10985d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (((w6.k) obj).f16217e == jVar && ((Integer) this.f10985d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        x();
        return new w6.i();
    }

    public final w6.m m() throws GeneralSecurityException {
        w4 w4Var;
        w6.o oVar = (w6.o) this.f10983b;
        if (oVar == null || (w4Var = (w4) this.f10984c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (oVar.f16226b != w4Var.i()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        Object obj = this.f10983b;
        w6.n nVar = w6.n.f16224d;
        if (((w6.o) obj).f16229e != nVar && ((Integer) this.f10985d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (((w6.o) obj).f16229e == nVar && ((Integer) this.f10985d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        x();
        return new w6.m();
    }

    public final w6.q n() throws GeneralSecurityException {
        w4 w4Var;
        w6.s sVar = (w6.s) this.f10983b;
        if (sVar == null || (w4Var = (w4) this.f10984c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (sVar.f16238b != w4Var.i()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        Object obj = this.f10983b;
        w6.r rVar = w6.r.f16236d;
        if (((w6.s) obj).f16239c != rVar && ((Integer) this.f10985d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (((w6.s) obj).f16239c == rVar && ((Integer) this.f10985d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        x();
        return new w6.q();
    }

    public final boolean p(int i10, boolean z10) {
        return ((TypedArray) this.f10984c).getBoolean(i10, z10);
    }

    public final ColorStateList q(int i10) {
        int resourceId;
        ColorStateList colorStateList;
        return (!((TypedArray) this.f10984c).hasValue(i10) || (resourceId = ((TypedArray) this.f10984c).getResourceId(i10, 0)) == 0 || (colorStateList = r2.k.getColorStateList((Context) this.f10983b, resourceId)) == null) ? ((TypedArray) this.f10984c).getColorStateList(i10) : colorStateList;
    }

    public final int r(int i10, int i11) {
        return ((TypedArray) this.f10984c).getDimensionPixelOffset(i10, i11);
    }

    public final int s(int i10, int i11) {
        return ((TypedArray) this.f10984c).getDimensionPixelSize(i10, i11);
    }

    public final Drawable t(int i10) {
        int resourceId;
        return (!((TypedArray) this.f10984c).hasValue(i10) || (resourceId = ((TypedArray) this.f10984c).getResourceId(i10, 0)) == 0) ? ((TypedArray) this.f10984c).getDrawable(i10) : o7.d0.C((Context) this.f10983b, resourceId);
    }

    public final String toString() {
        switch (this.f10982a) {
            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                StringBuilder sb = new StringBuilder();
                c8.e eVar = null;
                for (c8.e eVar2 : (List) this.f10983b) {
                    if (eVar != null) {
                        sb.append(",");
                    }
                    sb.append(eVar2.toString());
                    eVar = eVar2;
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public final Typeface u(int i10, int i11, a0 a0Var) {
        int resourceId = ((TypedArray) this.f10984c).getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f10985d) == null) {
            this.f10985d = new TypedValue();
        }
        Context context = (Context) this.f10983b;
        TypedValue typedValue = (TypedValue) this.f10985d;
        ThreadLocal threadLocal = t2.n.f14622a;
        if (context.isRestricted()) {
            return null;
        }
        Resources resources = context.getResources();
        resources.getValue(resourceId, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        if (!string.startsWith("res/")) {
            a0Var.a(-3);
            return null;
        }
        int i12 = typedValue.assetCookie;
        q.n nVar = u2.f.f15401b;
        Typeface typeface = (Typeface) nVar.get(u2.f.b(resources, resourceId, string, i12, i11));
        if (typeface != null) {
            a0Var.b(typeface);
            return typeface;
        }
        try {
            if (string.toLowerCase().endsWith(".xml")) {
                t2.e eVarC = i1.b.C(resources.getXml(resourceId), resources);
                if (eVarC != null) {
                    return u2.f.a(context, eVarC, resources, resourceId, string, typedValue.assetCookie, i11, a0Var, true);
                }
                Log.e("ResourcesCompat", "Failed to find font-family tag");
                a0Var.a(-3);
                return null;
            }
            int i13 = typedValue.assetCookie;
            Typeface typefaceT = u2.f.f15400a.t(context, resources, resourceId, string, i11);
            if (typefaceT != null) {
                nVar.put(u2.f.b(resources, resourceId, string, i13, i11), typefaceT);
            }
            if (typefaceT != null) {
                a0Var.b(typefaceT);
            } else {
                a0Var.a(-3);
            }
            return typefaceT;
        } catch (IOException e4) {
            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e4);
            a0Var.a(-3);
            return null;
        } catch (XmlPullParserException e10) {
            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e10);
            a0Var.a(-3);
            return null;
        }
    }

    public final int v(int i10, int i11) {
        return ((TypedArray) this.f10984c).getInt(i10, i11);
    }

    public final Method w(Class cls) {
        Class cls2;
        String str = (String) this.f10984c;
        if (str == null) {
            return null;
        }
        Method methodY = y(cls, str, (Class[]) this.f10985d);
        if (methodY == null || (cls2 = (Class) this.f10983b) == null || cls2.isAssignableFrom(methodY.getReturnType())) {
            return methodY;
        }
        return null;
    }

    public final k7.a x() {
        switch (this.f10982a) {
            case 10:
                w6.j jVar = ((w6.k) this.f10983b).f16217e;
                if (jVar == w6.j.f16212d) {
                    return k7.a.a(new byte[0]);
                }
                if (jVar == w6.j.f16211c) {
                    return k7.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f10985d).intValue()).array());
                }
                if (jVar == w6.j.f16210b) {
                    return k7.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f10985d).intValue()).array());
                }
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + ((w6.k) this.f10983b).f16217e);
            case 11:
                w6.n nVar = ((w6.o) this.f10983b).f16229e;
                if (nVar == w6.n.f16224d) {
                    return k7.a.a(new byte[0]);
                }
                if (nVar == w6.n.f16223c) {
                    return k7.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f10985d).intValue()).array());
                }
                if (nVar == w6.n.f16222b) {
                    return k7.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f10985d).intValue()).array());
                }
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + ((w6.o) this.f10983b).f16229e);
            case 12:
                w6.r rVar = ((w6.s) this.f10983b).f16239c;
                if (rVar == w6.r.f16236d) {
                    return k7.a.a(new byte[0]);
                }
                if (rVar == w6.r.f16235c) {
                    return k7.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f10985d).intValue()).array());
                }
                if (rVar == w6.r.f16234b) {
                    return k7.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f10985d).intValue()).array());
                }
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + ((w6.s) this.f10983b).f16239c);
            case 13:
                e7.c cVar = ((e7.d) this.f10983b).f5161d;
                if (cVar == e7.c.f5157e) {
                    return k7.a.a(new byte[0]);
                }
                if (cVar == e7.c.f5156d || cVar == e7.c.f5155c) {
                    return k7.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f10985d).intValue()).array());
                }
                if (cVar == e7.c.f5154b) {
                    return k7.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f10985d).intValue()).array());
                }
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + ((e7.d) this.f10983b).f5161d);
            default:
                e7.l lVar = ((e7.m) this.f10983b).f5183d;
                if (lVar == e7.l.f5179e) {
                    return k7.a.a(new byte[0]);
                }
                if (lVar == e7.l.f5178d || lVar == e7.l.f5177c) {
                    return k7.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f10985d).intValue()).array());
                }
                if (lVar == e7.l.f5176b) {
                    return k7.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f10985d).intValue()).array());
                }
                throw new IllegalStateException("Unknown HmacParameters.Variant: " + ((e7.m) this.f10983b).f5183d);
        }
    }

    public final int z(int i10, int i11) {
        return ((TypedArray) this.f10984c).getResourceId(i10, i11);
    }

    public /* synthetic */ z2(int i10, int i11) {
        this.f10982a = i10;
        this.f10983b = null;
        this.f10984c = null;
        this.f10985d = null;
    }

    public /* synthetic */ z2(int i10, Object obj, Object obj2) {
        this.f10982a = i10;
        this.f10983b = obj;
        this.f10984c = obj2;
    }

    public /* synthetic */ z2(Object obj, Object obj2, Object obj3, int i10) {
        this.f10982a = i10;
        this.f10983b = obj;
        this.f10984c = obj2;
        this.f10985d = obj3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z2(y4.n nVar, y4.j jVar) {
        this(4, nVar, jVar);
        this.f10982a = 4;
    }

    public z2(i4.i iVar, w4.l lVar) {
        Object kVar;
        this.f10982a = 3;
        this.f10983b = iVar;
        this.f10984c = lVar;
        int i10 = Build.VERSION.SDK_INT;
        if (w4.a.f16156a) {
            kVar = new m0.c0(false);
        } else if (i10 != 26 && i10 != 27) {
            kVar = new m0.c0(true);
        } else {
            kVar = new w4.k();
        }
        this.f10985d = kVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z2(e8.c2 c2Var, Object obj) {
        this(c2Var, obj, 0);
        this.f10982a = 18;
    }

    public z2(g8.v1 v1Var, g8.v1 v1Var2, x3 x3Var) {
        this.f10982a = 21;
        x5 x5Var = new x5(v1Var);
        this.f10983b = x5Var;
        g8.k kVar = new g8.k(x5Var, v1Var2);
        this.f10984c = kVar;
        x3Var.f7218a = kVar;
        this.f10985d = x3Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z2(Object obj) {
        this(10, 0);
        this.f10982a = 10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z2(q qVar) {
        this(11, 0);
        this.f10982a = 11;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z2(v2 v2Var) {
        this(12, 0);
        this.f10982a = 12;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z2(w2 w2Var) {
        this(15, 0);
        this.f10982a = 15;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z2(x2 x2Var) {
        this(13, 0);
        this.f10982a = 13;
    }

    public z2(e8.c2 c2Var, Object obj, int i10) {
        this.f10982a = 18;
        y3.e.J(c2Var, "status");
        this.f10983b = c2Var;
        this.f10984c = obj;
        this.f10985d = null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z2(y2 y2Var) {
        this(14);
        this.f10982a = 14;
    }

    public z2(f2.w wVar, z2 z2Var) {
        this.f10982a = 1;
        this.f10983b = wVar;
        this.f10984c = z2Var;
        this.f10985d = ((f2.v) wVar).f6134a;
    }

    public z2(androidx.fragment.app.n nVar, Animator animator, androidx.fragment.app.s1 s1Var) {
        this.f10982a = 2;
        this.f10985d = nVar;
        this.f10983b = animator;
        this.f10984c = s1Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z2() {
        this(8);
        this.f10982a = 8;
    }

    public z2(l4.e eVar, b8.c cVar, c8.d dVar) {
        b8.b bVar;
        int i10;
        Object obj;
        int i11;
        this.f10982a = 17;
        this.f10985d = eVar;
        this.f10983b = new ArrayList();
        c8.d dVar2 = dVar;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            bVar = b8.b.ECI;
            i10 = 1;
            if (dVar2 == null) {
                break;
            }
            int i14 = i12 + dVar2.f3050d;
            b8.b bVar2 = dVar2.f3047a;
            b8.b bVar3 = b8.b.BYTE;
            int i15 = dVar2.f3049c;
            c8.d dVar3 = dVar2.f3051e;
            boolean z10 = (bVar2 == bVar3 && dVar3 == null && i15 != 0) || !(dVar3 == null || i15 == dVar3.f3049c);
            i10 = z10 ? 1 : i13;
            if (dVar3 == null || dVar3.f3047a != bVar2 || z10) {
                ((List) this.f10983b).add(0, new c8.e(this, bVar2, dVar2.f3048b, i15, i14));
                i11 = 0;
            } else {
                i11 = i14;
            }
            if (z10) {
                ((List) this.f10983b).add(0, new c8.e(this, bVar, dVar2.f3048b, dVar2.f3049c, 0));
            }
            i13 = i10;
            i12 = i11;
            dVar2 = dVar3;
        }
        if (eVar.f11280a) {
            c8.e eVar2 = (c8.e) ((List) this.f10983b).get(0);
            if (eVar2 != null && eVar2.f3053a != bVar && i13 != 0) {
                ((List) this.f10983b).add(0, new c8.e(this, bVar, 0, 0, 0));
            }
            ((List) this.f10983b).add(((c8.e) ((List) this.f10983b).get(0)).f3053a == bVar ? 1 : 0, new c8.e(this, b8.b.FNC1_FIRST_POSITION, 0, 0, 0));
        }
        int i16 = cVar.f2753a;
        int i17 = 26;
        int iE = t.k.e(i16 <= 9 ? 1 : i16 <= 26 ? 2 : 3);
        if (iE == 0) {
            i17 = 9;
        } else if (iE != 1) {
            i10 = 27;
            i17 = 40;
        } else {
            i10 = 10;
        }
        int iA = A(cVar);
        while (true) {
            obj = eVar.f11283d;
            if (i16 >= i17 || c8.b.c(iA, b8.c.b(i16), (b8.a) obj)) {
                break;
            } else {
                i16++;
            }
        }
        while (i16 > i10 && c8.b.c(iA, b8.c.b(i16 - 1), (b8.a) obj)) {
            i16--;
        }
        this.f10984c = b8.c.b(i16);
    }
}
