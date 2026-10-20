package y2;

import a4.c0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l.p;
import q.n;
import q.z;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f16861a = new n(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f16862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f16863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z f16864d;

    static {
        j jVar = new j();
        jVar.f16871a = "fonts-androidx";
        jVar.f16872b = 10;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), jVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f16862b = threadPoolExecutor;
        f16863c = new Object();
        f16864d = new z(0);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c A[EDGE_INSN: B:10:0x001c->B:26:0x003e BREAK  A[LOOP:0: B:18:0x002d->B:24:0x003a]] */
    public static f a(String str, Context context, p pVar, int i10) {
        n nVar = f16861a;
        Typeface typeface = (Typeface) nVar.get(str);
        if (typeface != null) {
            return new f(typeface);
        }
        try {
            c0 c0VarA = c.a(context, pVar);
            int i11 = c0VarA.f1079a;
            int i12 = 1;
            if (i11 == 0) {
                h[] hVarArr = (h[]) c0VarA.f1080b;
                if (hVarArr != null && hVarArr.length != 0) {
                    int length = hVarArr.length;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= length) {
                            i12 = 0;
                            break;
                        }
                        int i14 = hVarArr[i13].f16869e;
                        if (i14 != 0) {
                            if (i14 >= 0) {
                                i12 = i14;
                                break;
                            }
                            i12 = -3;
                            break;
                        }
                        i13++;
                    }
                }
            } else {
                if (i11 != 1) {
                    i12 = -3;
                    break;
                }
                i12 = -2;
            }
            if (i12 != 0) {
                return new f(i12);
            }
            Typeface typefaceR = u2.f.f15400a.r(context, (h[]) c0VarA.f1080b, i10);
            if (typefaceR == null) {
                return new f(-3);
            }
            nVar.put(str, typefaceR);
            return new f(typefaceR);
        } catch (PackageManager.NameNotFoundException unused) {
            return new f(-1);
        }
    }
}
