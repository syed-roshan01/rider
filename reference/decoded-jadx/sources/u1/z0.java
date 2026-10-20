package u1;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import com.google.firebase.firestore.ListenerRegistration;
import com.google.firebase.remoteconfig.internal.Code;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URL;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z0 extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15389b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(Object obj, int i10) {
        super(0);
        this.f15388a = i10;
        this.f15389b = obj;
    }

    public final List a() throws IllegalAccessException, IOException, InvocationTargetException {
        int iT0;
        q8.f fVar;
        q8.f fVar2;
        int i10 = this.f15388a;
        Object obj = this.f15389b;
        switch (i10) {
            case 15:
                x9.o oVar = ((ba.k) obj).f2812e;
                d7.a.j(oVar);
                List<Certificate> listA = oVar.a();
                ArrayList arrayList = new ArrayList(f9.a.y0(listA));
                for (Certificate certificate : listA) {
                    d7.a.k(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            default:
                ka.f fVar3 = (ka.f) obj;
                ClassLoader classLoader = fVar3.f10666b;
                Enumeration<URL> resources = classLoader.getResources("");
                d7.a.l(resources, "getResources(...)");
                ArrayList list = Collections.list(resources);
                d7.a.l(list, "list(this)");
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    ja.m mVar = fVar3.f10667c;
                    if (!zHasNext) {
                        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
                        d7.a.l(resources2, "getResources(...)");
                        ArrayList<URL> list2 = Collections.list(resources2);
                        d7.a.l(list2, "list(this)");
                        ArrayList arrayList3 = new ArrayList();
                        for (URL url : list2) {
                            d7.a.j(url);
                            String string = url.toString();
                            d7.a.l(string, "toString(...)");
                            if (l9.i.h1(string, "jar:file:", false) && (iT0 = l9.i.T0(string, "!", 6)) != -1) {
                                String str = ja.x.f8577b;
                                String strSubstring = string.substring(4, iT0);
                                d7.a.l(strSubstring, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                                ja.x xVarJ = fa.l.j(new File(URI.create(strSubstring)));
                                d7.a.m(mVar, "fileSystem");
                                ja.s sVarJ = mVar.j(xVarJ);
                                try {
                                    long jB = sVarJ.b() - ((long) 22);
                                    long j10 = 0;
                                    if (jB < 0) {
                                        throw new IOException("not a zip: size=" + sVarJ.b());
                                    }
                                    long jMax = Math.max(jB - 65536, 0L);
                                    while (true) {
                                        ja.a0 a0VarC = r9.a.c(sVarJ.e(jB));
                                        try {
                                            if (a0VarC.y() == 101010256) {
                                                int iB = a0VarC.b() & 65535;
                                                int iB2 = a0VarC.b() & 65535;
                                                long jB2 = a0VarC.b() & 65535;
                                                long j11 = jB;
                                                if (jB2 != (a0VarC.b() & 65535) || iB != 0 || iB2 != 0) {
                                                    throw new IOException("unsupported zip: spanned");
                                                }
                                                a0VarC.l(4L);
                                                long jY = ((long) a0VarC.y()) & 4294967295L;
                                                int iB3 = a0VarC.b() & 65535;
                                                ka.d dVar = new ka.d(jB2, jY, iB3);
                                                a0VarC.e(iB3);
                                                a0VarC.close();
                                                long j12 = j11 - ((long) 20);
                                                if (j12 > 0) {
                                                    ja.a0 a0VarC2 = r9.a.c(sVarJ.e(j12));
                                                    try {
                                                        if (a0VarC2.y() == 117853008) {
                                                            int iY = a0VarC2.y();
                                                            long J = a0VarC2.J();
                                                            if (a0VarC2.y() != 1 || iY != 0) {
                                                                throw new IOException("unsupported zip: spanned");
                                                            }
                                                            ja.a0 a0VarC3 = r9.a.c(sVarJ.e(J));
                                                            try {
                                                                int iY2 = a0VarC3.y();
                                                                if (iY2 != 101075792) {
                                                                    throw new IOException("bad zip: expected " + r9.a.f(101075792) + " but was " + r9.a.f(iY2));
                                                                }
                                                                a0VarC3.l(12L);
                                                                int iY3 = a0VarC3.y();
                                                                int iY4 = a0VarC3.y();
                                                                long J2 = a0VarC3.J();
                                                                if (J2 != a0VarC3.J() || iY3 != 0 || iY4 != 0) {
                                                                    throw new IOException("unsupported zip: spanned");
                                                                }
                                                                a0VarC3.l(8L);
                                                                ka.d dVar2 = new ka.d(J2, a0VarC3.J(), iB3);
                                                                h6.g.e(a0VarC3, null);
                                                                dVar = dVar2;
                                                            } catch (Throwable th) {
                                                                try {
                                                                    throw th;
                                                                } catch (Throwable th2) {
                                                                    h6.g.e(a0VarC3, th);
                                                                    throw th2;
                                                                }
                                                            }
                                                        }
                                                        h6.g.e(a0VarC2, null);
                                                    } catch (Throwable th3) {
                                                        try {
                                                            throw th3;
                                                        } catch (Throwable th4) {
                                                            h6.g.e(a0VarC2, th3);
                                                            throw th4;
                                                        }
                                                    }
                                                }
                                                long j13 = dVar.f10661b;
                                                ArrayList arrayList4 = new ArrayList();
                                                ja.a0 a0VarC4 = r9.a.c(sVarJ.e(j13));
                                                try {
                                                    long j14 = dVar.f10660a;
                                                    for (long j15 = 0; j15 < j14; j15++) {
                                                        ka.g gVarH = r9.a.h(a0VarC4);
                                                        if (gVarH.f10675g >= j13) {
                                                            throw new IOException("bad zip: local file header offset >= central directory offset");
                                                        }
                                                        ja.x xVar = ka.f.f10665e;
                                                        if (Boolean.valueOf(fa.l.b(gVarH.f10669a)).booleanValue()) {
                                                            arrayList4.add(gVarH);
                                                        }
                                                    }
                                                    h6.g.e(a0VarC4, null);
                                                    ja.j0 j0Var = new ja.j0(xVarJ, mVar, r9.a.d(arrayList4));
                                                    h6.g.e(sVarJ, null);
                                                    fVar = new q8.f(j0Var, ka.f.f10665e);
                                                } catch (Throwable th5) {
                                                    try {
                                                        throw th5;
                                                    } catch (Throwable th6) {
                                                        h6.g.e(a0VarC4, th5);
                                                        throw th6;
                                                    }
                                                }
                                                try {
                                                    throw th;
                                                } catch (Throwable th7) {
                                                    h6.g.e(sVarJ, th);
                                                    throw th7;
                                                }
                                            }
                                            long j16 = jB;
                                            long j17 = j10;
                                            a0VarC.close();
                                            jB = j16 - 1;
                                            if (jB < jMax) {
                                                throw new IOException("not a zip: end of central directory signature not found");
                                            }
                                            j10 = j17;
                                        } catch (Throwable th8) {
                                            a0VarC.close();
                                            throw th8;
                                        }
                                    }
                                } catch (Throwable th9) {
                                    throw th9;
                                }
                            } else {
                                fVar = null;
                            }
                            if (fVar != null) {
                                arrayList3.add(fVar);
                            }
                        }
                        return r8.p.P0(arrayList3, arrayList2);
                    }
                    URL url2 = (URL) it.next();
                    d7.a.j(url2);
                    if (d7.a.d(url2.getProtocol(), "file")) {
                        String str2 = ja.x.f8577b;
                        fVar2 = new q8.f(mVar, fa.l.j(new File(url2.toURI())));
                    } else {
                        fVar2 = null;
                    }
                    if (fVar2 != null) {
                        arrayList2.add(fVar2);
                    }
                }
                break;
        }
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m8440invoke() {
        int i10 = this.f15388a;
        Object obj = this.f15389b;
        switch (i10) {
            case 0:
                ((a1) obj).f15022b = null;
                break;
            case 10:
                ((ListenerRegistration) obj).remove();
                break;
            default:
                View view = (View) obj;
                Context context = view.getContext();
                d7.a.k(context, "null cannot be cast to non-null type android.app.Activity");
                Window window = ((Activity) context).getWindow();
                long j10 = e5.a.f5131g;
                window.setStatusBarColor(androidx.compose.ui.graphics.a.s(j10));
                window.setNavigationBarColor(androidx.compose.ui.graphics.a.s(j10));
                new k.f(view, 11);
                (Build.VERSION.SDK_INT >= 30 ? new b3.y1(window) : new b3.x1(window)).i(false);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00e2  */
    @Override // c9.a
    public final Object invoke() throws Exception {
        k4.i iVar;
        int i10;
        int i11;
        int iMin;
        double dMax;
        Bitmap bitmapCreateBitmap;
        int iE;
        int iE2;
        int i12;
        q8.l lVar = q8.l.f13235a;
        int i13 = this.f15388a;
        boolean z10 = true;
        int i14 = 1;
        int i15 = 2;
        Object obj = this.f15389b;
        switch (i13) {
            case 0:
                m8440invoke();
                return lVar;
            case 1:
                a2.a aVar = (a2.a) obj;
                return new c2.a(aVar.f886a.f7921g.getTextLocale(), aVar.f889d.f2578d.getText());
            case 2:
                return new b2.g(((b2.v) obj).f2578d);
            case 3:
                Object systemService = ((g2.q) obj).f6589a.getContext().getSystemService("input_method");
                d7.a.k(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager) systemService;
            case 4:
                return new BaseInputConnection(((g2.e0) obj).f6544a, false);
            case 5:
                k2.b bVar = (k2.b) obj;
                if (((d1.f) bVar.f9715c.getValue()).f4347a == d1.f.f4345c) {
                    return null;
                }
                m0.n1 n1Var = bVar.f9715c;
                if (d1.f.e(((d1.f) n1Var.getValue()).f4347a)) {
                    return null;
                }
                return bVar.f9713a.b(((d1.f) n1Var.getValue()).f4347a);
            case 6:
                o2.r rVar = (o2.r) obj;
                return Boolean.valueOf((rVar.getParentLayoutCoordinates() == null || rVar.m7214getPopupContentSizebOM6tXw() == null) ? false : true);
            case 7:
                androidx.lifecycle.g1 g1Var = (androidx.lifecycle.g1) obj;
                d7.a.m(g1Var, "<this>");
                return (androidx.lifecycle.u0) new androidx.lifecycle.e1(g1Var, new androidx.lifecycle.r0()).b(androidx.lifecycle.u0.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
            case 8:
                return (s4.j) ((j4.l) obj).f8369z.getValue();
            case 9:
                k4.e eVar = (k4.e) obj;
                BitmapFactory.Options options = new BitmapFactory.Options();
                k4.o oVar = eVar.f9750a;
                k4.b bVar2 = new k4.b(oVar.b());
                ja.a0 a0VarC = r9.a.c(bVar2);
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(new ja.f(r9.a.c(new ja.y(a0VarC)), z10 ? 1 : 0), null, options);
                Exception exc = bVar2.f9742b;
                if (exc == null) {
                    options.inJustDecodeBounds = false;
                    Paint paint = k4.l.f9768a;
                    String str = options.outMimeType;
                    LinkedHashSet linkedHashSet = k4.m.f9769a;
                    int iOrdinal = eVar.f9753d.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            if (iOrdinal != 2) {
                                throw new androidx.fragment.app.a0();
                            }
                        } else if (str == null || !k4.m.f9769a.contains(str)) {
                            iVar = k4.i.f9761c;
                        }
                        l3.g gVar = new l3.g(new k4.j(new ja.f(r9.a.c(new ja.y(a0VarC)), z10 ? 1 : 0)));
                        l3.c cVarC = gVar.c("Orientation");
                        if (cVarC == null) {
                            iE = 1;
                        } else {
                            try {
                                iE = cVarC.e(gVar.f11267f);
                            } catch (NumberFormatException unused) {
                                iE = 1;
                            }
                        }
                        boolean z11 = iE == 2 || iE == 7 || iE == 4 || iE == 5;
                        l3.c cVarC2 = gVar.c("Orientation");
                        if (cVarC2 == null) {
                            iE2 = 1;
                        } else {
                            try {
                                iE2 = cVarC2.e(gVar.f11267f);
                            } catch (NumberFormatException unused2) {
                                iE2 = 1;
                            }
                        }
                        switch (iE2) {
                            case 3:
                            case 4:
                                i12 = 180;
                                break;
                            case 5:
                            case 8:
                                i12 = 270;
                                break;
                            case 6:
                            case 7:
                                i12 = 90;
                                break;
                            default:
                                i12 = 0;
                                break;
                        }
                        iVar = new k4.i(i12, z11);
                        break;
                    } else {
                        iVar = k4.i.f9761c;
                    }
                    Exception exc2 = bVar2.f9742b;
                    if (exc2 == null) {
                        options.inMutable = false;
                        s4.n nVar = eVar.f9751b;
                        ColorSpace colorSpace = nVar.f14024c;
                        if (colorSpace != null) {
                            options.inPreferredColorSpace = colorSpace;
                        }
                        options.inPremultiplied = nVar.f14029h;
                        int i16 = iVar.f9763b;
                        Bitmap.Config config = nVar.f14023b;
                        boolean z12 = iVar.f9762a;
                        if ((z12 || i16 > 0) && (config == null || config == Bitmap.Config.HARDWARE)) {
                            config = Bitmap.Config.ARGB_8888;
                        }
                        if (nVar.f14028g && config == Bitmap.Config.ARGB_8888 && d7.a.d(options.outMimeType, "image/jpeg")) {
                            config = Bitmap.Config.RGB_565;
                        }
                        Bitmap.Config config2 = options.outConfig;
                        Bitmap.Config config3 = Bitmap.Config.RGBA_F16;
                        if (config2 == config3 && config != Bitmap.Config.HARDWARE) {
                            config = config3;
                        }
                        options.inPreferredConfig = config;
                        o7.d0 d0VarA = oVar.a();
                        boolean z13 = d0VarA instanceof k4.q;
                        Context context = nVar.f14022a;
                        t4.f fVar = nVar.f14025d;
                        if (z13 && d7.a.d(fVar, t4.f.f14657c)) {
                            options.inSampleSize = 1;
                            options.inScaled = true;
                            options.inDensity = ((k4.q) d0VarA).f9778x;
                            options.inTargetDensity = context.getResources().getDisplayMetrics().densityDpi;
                            i14 = 1;
                            i16 = i16;
                            z12 = z12;
                            context = context;
                        } else {
                            int i17 = options.outWidth;
                            if (i17 <= 0 || (i10 = options.outHeight) <= 0) {
                                options.inSampleSize = z10;
                                options.inScaled = false;
                            } else {
                                int i18 = (i16 == 90 || i16 == 270) ? i10 : i17;
                                if (i16 != 90 && i16 != 270) {
                                    i17 = i10;
                                }
                                t4.f fVar2 = t4.f.f14657c;
                                boolean zD = d7.a.d(fVar, fVar2);
                                t4.e eVar2 = nVar.f14026e;
                                int iE3 = zD ? i18 : w4.e.e(fVar.f14658a, eVar2);
                                int iE4 = d7.a.d(fVar, fVar2) ? i17 : w4.e.e(fVar.f14659b, eVar2);
                                int iHighestOneBit = Integer.highestOneBit(i18 / iE3);
                                int iHighestOneBit2 = Integer.highestOneBit(i17 / iE4);
                                int iOrdinal2 = eVar2.ordinal();
                                if (iOrdinal2 != 0) {
                                    i11 = 1;
                                    if (iOrdinal2 == 1) {
                                        iMin = Math.max(iHighestOneBit, iHighestOneBit2);
                                    } else {
                                        throw new androidx.fragment.app.a0();
                                    }
                                } else {
                                    i11 = 1;
                                    iMin = Math.min(iHighestOneBit, iHighestOneBit2);
                                }
                                if (iMin < i11) {
                                    iMin = 1;
                                }
                                options.inSampleSize = iMin;
                                i16 = i16;
                                double d10 = iMin;
                                double d11 = ((double) i18) / d10;
                                double d12 = ((double) i17) / d10;
                                double d13 = iE3;
                                z12 = z12;
                                context = context;
                                double d14 = d13 / d11;
                                double d15 = ((double) iE4) / d12;
                                int iOrdinal3 = eVar2.ordinal();
                                if (iOrdinal3 == 0) {
                                    dMax = Math.max(d14, d15);
                                } else if (iOrdinal3 == 1) {
                                    dMax = Math.min(d14, d15);
                                } else {
                                    throw new androidx.fragment.app.a0();
                                }
                                if (nVar.f14027f && dMax > 1.0d) {
                                    dMax = 1.0d;
                                }
                                boolean z14 = !(dMax == 1.0d);
                                options.inScaled = z14;
                                if (z14) {
                                    if (dMax > 1.0d) {
                                        options.inDensity = d7.t.o0(((double) Integer.MAX_VALUE) / dMax);
                                        options.inTargetDensity = Integer.MAX_VALUE;
                                    } else {
                                        options.inDensity = Integer.MAX_VALUE;
                                        options.inTargetDensity = d7.t.o0(((double) Integer.MAX_VALUE) * dMax);
                                    }
                                }
                                i14 = 1;
                            }
                        }
                        try {
                            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new ja.f(a0VarC, i14), null, options);
                            h6.g.e(a0VarC, null);
                            Exception exc3 = bVar2.f9742b;
                            if (exc3 != null) {
                                throw exc3;
                            }
                            if (bitmapDecodeStream != null) {
                                bitmapDecodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
                                if (z12 || i16 > 0) {
                                    Matrix matrix = new Matrix();
                                    float width = bitmapDecodeStream.getWidth() / 2.0f;
                                    float height = bitmapDecodeStream.getHeight() / 2.0f;
                                    if (z12) {
                                        matrix.postScale(-1.0f, 1.0f, width, height);
                                    }
                                    if (i16 > 0) {
                                        matrix.postRotate(i16, width, height);
                                    }
                                    RectF rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                                    matrix.mapRect(rectF);
                                    float f10 = rectF.left;
                                    if (f10 != 0.0f || rectF.top != 0.0f) {
                                        matrix.postTranslate(-f10, -rectF.top);
                                    }
                                    if (i16 != 90 && i16 != 270) {
                                        int width2 = bitmapDecodeStream.getWidth();
                                        int height2 = bitmapDecodeStream.getHeight();
                                        Bitmap.Config config4 = bitmapDecodeStream.getConfig();
                                        if (config4 == null) {
                                            config4 = Bitmap.Config.ARGB_8888;
                                        }
                                        bitmapCreateBitmap = Bitmap.createBitmap(width2, height2, config4);
                                    } else {
                                        int height3 = bitmapDecodeStream.getHeight();
                                        int width3 = bitmapDecodeStream.getWidth();
                                        Bitmap.Config config5 = bitmapDecodeStream.getConfig();
                                        if (config5 == null) {
                                            config5 = Bitmap.Config.ARGB_8888;
                                        }
                                        bitmapCreateBitmap = Bitmap.createBitmap(height3, width3, config5);
                                    }
                                    new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, k4.l.f9768a);
                                    bitmapDecodeStream.recycle();
                                    bitmapDecodeStream = bitmapCreateBitmap;
                                }
                                BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), bitmapDecodeStream);
                                boolean z15 = true;
                                if (options.inSampleSize <= 1 && !options.inScaled) {
                                    z15 = false;
                                }
                                return new k4.g(bitmapDrawable, z15);
                            }
                            throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.".toString());
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                h6.g.e(a0VarC, th);
                                throw th2;
                            }
                        }
                    }
                    throw exc2;
                }
                throw exc;
            case 10:
                m8440invoke();
                return lVar;
            case 11:
                return Float.valueOf(((m0.s2) ((m0.d1) obj)).d());
            case 12:
                m8440invoke();
                return lVar;
            case 13:
                return new h.b((h5.a) obj, i15);
            case Code.UNAVAILABLE /* 14 */:
                return obj;
            case 15:
                return a();
            default:
                return a();
        }
    }
}
