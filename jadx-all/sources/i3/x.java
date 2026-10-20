package i3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Handler;
import java.nio.MappedByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import u1.t3;

/* JADX INFO: loaded from: classes.dex */
public final class x implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l.p f8005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x9.v f8006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f8007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f8008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Executor f8009f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f8010g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h6.g f8011h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public t3 f8012i;

    public x(Context context, l.p pVar) {
        x9.v vVar = y.f8013d;
        this.f8007d = new Object();
        if (context == null) {
            throw new NullPointerException("Context cannot be null");
        }
        this.f8004a = context.getApplicationContext();
        this.f8005b = pVar;
        this.f8006c = vVar;
    }

    @Override // i3.k
    public final void a(h6.g gVar) {
        synchronized (this.f8007d) {
            this.f8011h = gVar;
        }
        c();
    }

    public final void b() {
        synchronized (this.f8007d) {
            try {
                this.f8011h = null;
                t3 t3Var = this.f8012i;
                if (t3Var != null) {
                    x9.v vVar = this.f8006c;
                    Context context = this.f8004a;
                    vVar.getClass();
                    context.getContentResolver().unregisterContentObserver(t3Var);
                    this.f8012i = null;
                }
                Handler handler = this.f8008e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f8008e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f8010g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f8009f = null;
                this.f8010g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.f8007d) {
            try {
                if (this.f8011h == null) {
                    return;
                }
                if (this.f8009f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f8010g = threadPoolExecutor;
                    this.f8009f = threadPoolExecutor;
                }
                final int i10 = 0;
                this.f8009f.execute(new Runnable(this) { // from class: i3.w

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ x f8003b;

                    {
                        this.f8003b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                x xVar = this.f8003b;
                                synchronized (xVar.f8007d) {
                                    try {
                                        if (xVar.f8011h == null) {
                                            return;
                                        }
                                        try {
                                            y2.h hVarD = xVar.d();
                                            int i11 = hVarD.f16869e;
                                            if (i11 == 2) {
                                                synchronized (xVar.f8007d) {
                                                }
                                            }
                                            if (i11 != 0) {
                                                throw new RuntimeException("fetchFonts result is not OK. (" + i11 + ")");
                                            }
                                            try {
                                                int i12 = x2.q.f16301a;
                                                x2.p.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                                x9.v vVar = xVar.f8006c;
                                                Context context = xVar.f8004a;
                                                vVar.getClass();
                                                Typeface typefaceR = u2.f.f15400a.r(context, new y2.h[]{hVarD}, 0);
                                                MappedByteBuffer mappedByteBufferV = i1.b.v(xVar.f8004a, hVarD.f16865a);
                                                if (mappedByteBufferV == null || typefaceR == null) {
                                                    throw new RuntimeException("Unable to open file.");
                                                }
                                                try {
                                                    x2.p.a("EmojiCompat.MetadataRepo.create");
                                                    a0 a0Var = new a0(typefaceR, o7.d0.g0(mappedByteBufferV));
                                                    x2.p.b();
                                                    x2.p.b();
                                                    synchronized (xVar.f8007d) {
                                                        try {
                                                            h6.g gVar = xVar.f8011h;
                                                            if (gVar != null) {
                                                                gVar.u0(a0Var);
                                                            }
                                                        } catch (Throwable th) {
                                                            throw th;
                                                        }
                                                        break;
                                                    }
                                                    xVar.b();
                                                    return;
                                                } catch (Throwable th2) {
                                                    int i13 = x2.q.f16301a;
                                                    x2.p.b();
                                                    throw th2;
                                                }
                                            } catch (Throwable th3) {
                                                int i14 = x2.q.f16301a;
                                                x2.p.b();
                                                throw th3;
                                            }
                                            break;
                                        } catch (Throwable th4) {
                                            synchronized (xVar.f8007d) {
                                                try {
                                                    h6.g gVar2 = xVar.f8011h;
                                                    if (gVar2 != null) {
                                                        gVar2.t0(th4);
                                                    }
                                                    xVar.b();
                                                    return;
                                                } catch (Throwable th5) {
                                                    throw th5;
                                                }
                                            }
                                        }
                                    } catch (Throwable th6) {
                                        throw th6;
                                    }
                                }
                            default:
                                this.f8003b.c();
                                return;
                        }
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final y2.h d() throws Throwable {
        try {
            x9.v vVar = this.f8006c;
            Context context = this.f8004a;
            l.p pVar = this.f8005b;
            vVar.getClass();
            a4.c0 c0VarA = y2.c.a(context, pVar);
            if (c0VarA.f1079a != 0) {
                throw new RuntimeException("fetchFonts failed (" + c0VarA.f1079a + ")");
            }
            y2.h[] hVarArr = (y2.h[]) c0VarA.f1080b;
            if (hVarArr == null || hVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return hVarArr[0];
        } catch (PackageManager.NameNotFoundException e4) {
            throw new RuntimeException("provider not found", e4);
        }
    }
}
