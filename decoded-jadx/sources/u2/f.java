package u2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import l.a0;
import l.p;
import l.t;
import q.n;
import q.z;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k.f f15400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f15401b;

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f15400a = new j(10);
        } else if (i10 >= 28) {
            f15400a = new i();
        } else {
            f15400a = new h();
        }
        f15401b = new n(16);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    public static Typeface a(Context context, t2.e eVar, Resources resources, int i10, String str, int i11, int i12, a0 a0Var, boolean z10) {
        Typeface typefaceQ;
        Typeface typefaceCreate;
        Typeface typeface;
        if (eVar instanceof t2.h) {
            t2.h hVar = (t2.h) eVar;
            String str2 = hVar.f14615d;
            typefaceQ = null;
            int i13 = 0;
            if (str2 == null || str2.isEmpty()) {
                typefaceCreate = null;
            } else {
                typefaceCreate = Typeface.create(str2, 0);
                Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                    typefaceCreate = null;
                }
            }
            if (typefaceCreate != null) {
                if (a0Var != null) {
                    a0Var.b(typefaceCreate);
                }
                return typefaceCreate;
            }
            int i14 = 1;
            boolean z11 = !z10 ? a0Var != null : hVar.f14614c != 0;
            int i15 = z10 ? hVar.f14613b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            k.f fVar = new k.f(a0Var);
            p pVar = hVar.f14612a;
            t tVar = new t(7, fVar, handler);
            if (z11) {
                n nVar = y2.g.f16861a;
                String str3 = ((String) pVar.f10893g) + "-" + i12;
                typeface = (Typeface) y2.g.f16861a.get(str3);
                if (typeface != null) {
                    ((Handler) tVar.f10929c).post(new y2.a(tVar, (k.f) tVar.f10928b, typeface, i13));
                    typefaceQ = typeface;
                } else if (i15 == -1) {
                    y2.f fVarA = y2.g.a(str3, context, pVar, i12);
                    tVar.g(fVarA);
                    typefaceQ = fVarA.f16859a;
                } else {
                    try {
                        try {
                            try {
                                y2.f fVar2 = (y2.f) y2.g.f16862b.submit(new y2.d(str3, context, pVar, i12, 0)).get(i15, TimeUnit.MILLISECONDS);
                                tVar.g(fVar2);
                                typefaceQ = fVar2.f16859a;
                            } catch (InterruptedException e4) {
                                throw e4;
                            }
                        } catch (ExecutionException e10) {
                            throw new RuntimeException(e10);
                        } catch (TimeoutException unused) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused2) {
                        ((Handler) tVar.f10929c).post(new androidx.activity.h(tVar, (k.f) tVar.f10928b, -3));
                    }
                }
            } else {
                n nVar2 = y2.g.f16861a;
                String str4 = ((String) pVar.f10893g) + "-" + i12;
                typeface = (Typeface) y2.g.f16861a.get(str4);
                if (typeface != null) {
                    ((Handler) tVar.f10929c).post(new y2.a(tVar, (k.f) tVar.f10928b, typeface, i13));
                    typefaceQ = typeface;
                } else {
                    y2.e eVar2 = new y2.e(tVar, i13);
                    synchronized (y2.g.f16863c) {
                        try {
                            z zVar = y2.g.f16864d;
                            ArrayList arrayList = (ArrayList) zVar.get(str4);
                            if (arrayList != null) {
                                arrayList.add(eVar2);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(eVar2);
                                zVar.put(str4, arrayList2);
                                y2.g.f16862b.execute(new y2.a(Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler(), new y2.d(str4, context, pVar, i12, 1), new y2.e(str4, i14), 2));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        } else {
            typefaceQ = f15400a.q(context, (t2.f) eVar, resources, i12);
            if (a0Var != null) {
                if (typefaceQ != null) {
                    a0Var.b(typefaceQ);
                } else {
                    a0Var.a(-3);
                }
            }
        }
        if (typefaceQ != null) {
            f15401b.put(b(resources, i10, str, i11, i12), typefaceQ);
        }
        return typefaceQ;
    }

    public static String b(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }
}
