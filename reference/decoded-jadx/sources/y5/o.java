package y5;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.cloudmessaging.zze;
import com.google.android.gms.tasks.Task;
import i3.v;
import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import l.q;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static o f16981e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f16983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f16984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f16985d;

    public o(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f16985d = new k(this);
        this.f16982a = 1;
        this.f16984c = scheduledExecutorService;
        this.f16983b = context.getApplicationContext();
    }

    public static synchronized o f(Context context) {
        try {
            if (f16981e == null) {
                zze.zza();
                f16981e = new o(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new m.c("MessengerIpcClient"))));
            }
        } catch (Throwable th) {
            throw th;
        }
        return f16981e;
    }

    public final void a(boolean z10, v vVar, ja.g gVar, boolean z11) {
        y3.e.J(gVar, "source");
        int iE = vVar.e();
        boolean zA = vVar.a();
        int i10 = (int) gVar.f8534b;
        if (zA || iE < i10) {
            if (!zA && iE > 0) {
                vVar.f(iE, gVar, false);
            }
            ((ja.g) vVar.f7998e).b0(gVar, (int) gVar.f8534b);
            vVar.f7997d = z10 | vVar.f7997d;
        } else {
            vVar.f(i10, gVar, z10);
        }
        if (z11) {
            b();
        }
    }

    public final void b() {
        try {
            ((j8.b) this.f16984c).flush();
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        }
    }

    public final boolean c(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(q.g("Invalid initial window size: ", i10));
        }
        int i11 = i10 - this.f16982a;
        this.f16982a = i10;
        for (v vVar : ((h8.n) ((h8.v) this.f16983b)).k()) {
            vVar.b(i11);
        }
        return i11 > 0;
    }

    public final void d(v vVar, int i10) {
        if (vVar == null) {
            ((v) this.f16985d).b(i10);
            e();
            return;
        }
        vVar.b(i10);
        x9.v vVar2 = new x9.v();
        vVar.g(vVar.e(), vVar2);
        if (vVar2.f16473a > 0) {
            b();
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final void e() {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f16983b
            h8.v r0 = (h8.v) r0
            h8.n r0 = (h8.n) r0
            i3.v[] r1 = r0.k()
            java.util.List r2 = java.util.Arrays.asList(r1)
            java.util.Collections.shuffle(r2)
            java.lang.Object r2 = r13.f16985d
            i3.v r2 = (i3.v) r2
            int r2 = r2.f7995b
            int r3 = r1.length
        L18:
            r4 = 0
            if (r3 <= 0) goto L71
            if (r2 <= 0) goto L71
            float r5 = (float) r2
            float r6 = (float) r3
            float r5 = r5 / r6
            double r5 = (double) r5
            double r5 = java.lang.Math.ceil(r5)
            int r5 = (int) r5
            r6 = r4
            r7 = r6
        L28:
            if (r7 >= r3) goto L6f
            if (r2 <= 0) goto L6f
            r8 = r1[r7]
            int r9 = r8.f7995b
            java.lang.Object r10 = r8.f7998e
            r11 = r10
            ja.g r11 = (ja.g) r11
            long r11 = r11.f8534b
            int r11 = (int) r11
            int r9 = java.lang.Math.min(r9, r11)
            int r9 = java.lang.Math.max(r4, r9)
            int r11 = r8.f7996c
            int r9 = r9 - r11
            int r9 = java.lang.Math.min(r9, r5)
            int r9 = java.lang.Math.min(r2, r9)
            if (r9 <= 0) goto L53
            int r11 = r8.f7996c
            int r11 = r11 + r9
            r8.f7996c = r11
            int r2 = r2 - r9
        L53:
            int r9 = r8.f7995b
            ja.g r10 = (ja.g) r10
            long r10 = r10.f8534b
            int r10 = (int) r10
            int r9 = java.lang.Math.min(r9, r10)
            int r9 = java.lang.Math.max(r4, r9)
            int r10 = r8.f7996c
            int r9 = r9 - r10
            if (r9 <= 0) goto L6c
            int r9 = r6 + 1
            r1[r6] = r8
            r6 = r9
        L6c:
            int r7 = r7 + 1
            goto L28
        L6f:
            r3 = r6
            goto L18
        L71:
            x9.v r1 = new x9.v
            r1.<init>()
            i3.v[] r0 = r0.k()
            int r2 = r0.length
            r3 = r4
        L7c:
            if (r3 >= r2) goto L8a
            r5 = r0[r3]
            int r6 = r5.f7996c
            r5.g(r6, r1)
            r5.f7996c = r4
            int r3 = r3 + 1
            goto L7c
        L8a:
            int r0 = r1.f16473a
            if (r0 <= 0) goto L91
            r13.b()
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.o.e():void");
    }

    public final synchronized Task g(l lVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(lVar.toString()));
            }
            if (!((k) this.f16985d).d(lVar)) {
                k kVar = new k(this);
                this.f16985d = kVar;
                kVar.d(lVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return lVar.f16978b.getTask();
    }

    public o(h8.v vVar, h8.e eVar) {
        y3.e.J(vVar, "transport");
        this.f16983b = vVar;
        this.f16984c = eVar;
        this.f16982a = 65535;
        this.f16985d = new v(this, 0, 65535, null);
    }

    public o(int i10, u8.j jVar, o9.a aVar, p9.f fVar) {
        this.f16983b = fVar;
        this.f16982a = i10;
        this.f16984c = aVar;
        this.f16985d = jVar;
    }
}
