package h;

import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import b3.b0;
import b3.q0;
import com.google.android.gms.internal.measurement.zzpm;
import com.google.android.gms.tasks.TaskCompletionSource;
import e3.e;
import e3.f;
import h8.n;
import java.io.IOException;
import java.lang.reflect.Field;
import k6.d4;
import k6.d7;
import k6.e5;
import k6.f5;
import k6.g7;
import k6.h7;
import k6.u7;
import k6.x;
import k6.y5;
import l.b1;
import l.k;
import l.t;
import u1.w;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7336b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f7335a = i10;
        this.f7336b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k kVar;
        int i10 = 3;
        switch (this.f7335a) {
            case 0:
                c cVar = (c) this.f7336b;
                cVar.a(true);
                cVar.invalidateSelf();
                return;
            case 1:
                b1 b1Var = (b1) this.f7336b;
                b1Var.f10710s = null;
                b1Var.drawableStateChanged();
                return;
            case 2:
                ActionMenuView actionMenuView = ((Toolbar) this.f7336b).f1560a;
                if (actionMenuView == null || (kVar = actionMenuView.f1505z) == null) {
                    return;
                }
                kVar.k();
                return;
            case 3:
                w wVar = (w) this.f7336b;
                wVar.removeCallbacks(this);
                MotionEvent motionEvent = wVar.f15342r0;
                if (motionEvent != null) {
                    boolean z10 = motionEvent.getToolType(0) == 3;
                    int actionMasked = motionEvent.getActionMasked();
                    if (z10) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    wVar.C(motionEvent, (actionMasked == 7 || actionMasked == 9) ? 7 : 2, wVar.f15344s0, false);
                    return;
                }
                return;
            case 4:
                e eVar = (e) this.f7336b;
                if (eVar.f5115v) {
                    if (eVar.f5113t) {
                        eVar.f5113t = false;
                        e3.a aVar = eVar.f5101a;
                        aVar.getClass();
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f5095e = jCurrentAnimationTimeMillis;
                        aVar.f5097g = -1L;
                        aVar.f5096f = jCurrentAnimationTimeMillis;
                        aVar.f5098h = 0.5f;
                    }
                    e3.a aVar2 = eVar.f5101a;
                    if ((aVar2.f5097g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar2.f5097g + ((long) aVar2.f5099i)) || !eVar.f()) {
                        eVar.f5115v = false;
                        return;
                    }
                    if (eVar.f5114u) {
                        eVar.f5114u = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        eVar.f5103c.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (aVar2.f5096f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = aVar2.a(jCurrentAnimationTimeMillis2);
                    long j10 = jCurrentAnimationTimeMillis2 - aVar2.f5096f;
                    aVar2.f5096f = jCurrentAnimationTimeMillis2;
                    f.b(eVar.f5117x, (int) (j10 * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * aVar2.f5094d));
                    View view = eVar.f5103c;
                    Field field = q0.f2670a;
                    b0.m(view, this);
                    return;
                }
                return;
            case 5:
            case 6:
            default:
                ((n) this.f7336b).getClass();
                n nVar = (n) this.f7336b;
                nVar.f7686o.execute(nVar.f7691t);
                synchronized (((n) this.f7336b).f7682k) {
                    Object obj = this.f7336b;
                    ((n) obj).D = Integer.MAX_VALUE;
                    ((n) obj).t();
                    break;
                }
                ((n) this.f7336b).getClass();
                return;
            case 7:
                if (((TaskCompletionSource) this.f7336b).trySetException(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 8:
                g7 g7Var = (g7) this.f7336b;
                t tVar = g7Var.f10073c;
                long j11 = g7Var.f10071a;
                ((d7) tVar.f10929c).l();
                ((d7) tVar.f10929c).zzj().f9971m.b("Application going to the background");
                ((d7) tVar.f10929c).j().f10185r.a(true);
                d7 d7Var = (d7) tVar.f10929c;
                d7Var.l();
                d7Var.f9981d = true;
                if (!((d7) tVar.f10929c).h().z()) {
                    h7 h7Var = ((d7) tVar.f10929c).f9983f;
                    long j12 = g7Var.f10072b;
                    h7Var.f10092c.a();
                    ((d7) tVar.f10929c).f9983f.a(false, false, j12);
                }
                if (zzpm.zza() && ((d7) tVar.f10929c).h().v(null, x.B0)) {
                    ((d7) tVar.f10929c).zzj().f9970l.c("Application backgrounded at: timestamp_millis", Long.valueOf(j11));
                    return;
                } else {
                    ((d7) tVar.f10929c).o().C("auto", "_ab", new Bundle(), j11);
                    return;
                }
            case 9:
                f5 f5Var = (f5) this.f7336b;
                u7 u7Var = f5Var.f10035l;
                f5.c(u7Var);
                u7Var.l();
                if (u7Var.p0() == 1) {
                    y5 y5Var = f5Var.f10039p;
                    f5.b(y5Var);
                    new Thread(new e5(y5Var, i10)).start();
                    return;
                } else {
                    d4 d4Var = f5Var.f10032i;
                    f5.d(d4Var);
                    d4Var.f9967i.b("registerTrigger called but app not eligible");
                    return;
                }
            case 10:
                o6.a aVar3 = (o6.a) this.f7336b;
                synchronized (aVar3.f12549a) {
                    try {
                        if (aVar3.b()) {
                            Log.e("WakeLock", String.valueOf(aVar3.f12558j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                            aVar3.d();
                            if (aVar3.b()) {
                                aVar3.f12551c = 1;
                                aVar3.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 11:
                Object obj2 = this.f7336b;
                try {
                    if (((h8.c) obj2).f7611p != null && ((h8.c) obj2).f7604b.f8534b > 0) {
                        ((h8.c) obj2).f7611p.b0(((h8.c) obj2).f7604b, ((h8.c) obj2).f7604b.f8534b);
                    }
                } catch (IOException e4) {
                    ((n) ((h8.c) obj2).f7606d).p(e4);
                }
                h8.c cVar2 = (h8.c) obj2;
                cVar2.f7604b.getClass();
                try {
                    if (((h8.c) obj2).f7611p != null) {
                        ((h8.c) obj2).f7611p.close();
                    }
                } catch (IOException e10) {
                    ((n) cVar2.f7606d).p(e10);
                }
                try {
                    if (((h8.c) obj2).f7612q != null) {
                        ((h8.c) obj2).f7612q.close();
                        return;
                    }
                    return;
                } catch (IOException e11) {
                    ((n) cVar2.f7606d).p(e11);
                    return;
                }
        }
    }
}
