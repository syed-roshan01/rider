package b3;

import android.animation.ValueAnimator;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.measurement.zzcv;
import e8.c2;
import g8.g5;
import g8.l3;
import g8.y2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;
import k6.f5;
import k6.n6;
import k6.s6;
import k6.u7;
import k6.x7;
import k6.y3;
import k6.y5;

/* JADX INFO: loaded from: classes.dex */
public final class a1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2601e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2602f;

    public /* synthetic */ a1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f2597a = i10;
        this.f2602f = obj;
        this.f2598b = obj2;
        this.f2599c = obj3;
        this.f2600d = obj4;
        this.f2601e = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c2 c2Var;
        switch (this.f2597a) {
            case 0:
                c1.g((View) this.f2598b);
                ((ValueAnimator) this.f2601e).start();
                return;
            case 1:
                s6 s6VarM = ((f5) ((y5) this.f2602f).f6226a).m();
                AtomicReference atomicReference = (AtomicReference) this.f2598b;
                String str = (String) this.f2600d;
                String str2 = (String) this.f2601e;
                s6VarM.l();
                s6VarM.s();
                s6VarM.v(new n6(s6VarM, atomicReference, str, str2, s6VarM.H(false)));
                return;
            case 2:
                Object obj = this.f2600d;
                Object obj2 = this.f2599c;
                Object obj3 = this.f2598b;
                Object obj4 = this.f2601e;
                Object obj5 = this.f2602f;
                ArrayList arrayList = new ArrayList();
                try {
                    try {
                        y3 y3Var = ((s6) obj5).f10358d;
                        if (y3Var == null) {
                            ((s6) obj5).zzj().f9964f.d("Failed to get conditional properties; not connected to service", (String) obj3, (String) obj2);
                            s6 s6Var = (s6) obj5;
                            zzcv zzcvVar = (zzcv) obj4;
                            s6Var.k().H(zzcvVar, arrayList);
                            obj4 = zzcvVar;
                            obj5 = s6Var;
                        } else {
                            f6.a.x((x7) obj);
                            arrayList = u7.e0(y3Var.m((String) obj3, (String) obj2, (x7) obj));
                            ((s6) obj5).F();
                            s6 s6Var2 = (s6) obj5;
                            zzcv zzcvVar2 = (zzcv) obj4;
                            s6Var2.k().H(zzcvVar2, arrayList);
                            obj4 = zzcvVar2;
                            obj5 = s6Var2;
                        }
                        return;
                    } catch (RemoteException e4) {
                        ((s6) obj5).zzj().f9964f.e("Failed to get conditional properties; remote exception", (String) obj3, (String) obj2, e4);
                        ((s6) obj5).k().H((zzcv) obj4, arrayList);
                        return;
                    }
                } catch (Throwable th) {
                    ((s6) obj5).k().H((zzcv) obj4, arrayList);
                    throw th;
                }
            default:
                for (g5 g5Var : (Collection) this.f2598b) {
                    if (g5Var != ((g5) this.f2599c)) {
                        g5Var.f6817a.i(y2.G);
                    }
                }
                Future future = (Future) this.f2600d;
                if (future != null) {
                    future.cancel(false);
                }
                Future future2 = (Future) this.f2601e;
                if (future2 != null) {
                    future2.cancel(false);
                }
                y2 y2Var = (y2) this.f2602f;
                i3.a0 a0Var = ((l3) y2Var.D.f17260a).E;
                synchronized (a0Var.f7941a) {
                    try {
                        ((Collection) a0Var.f7942b).remove(y2Var);
                        if (((Collection) a0Var.f7942b).isEmpty()) {
                            c2Var = (c2) a0Var.f7943c;
                            a0Var.f7942b = new HashSet();
                        } else {
                            c2Var = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                if (c2Var != null) {
                    ((l3) a0Var.f7944d).D.f(c2Var);
                    return;
                }
                return;
        }
    }

    public a1(y5 y5Var, AtomicReference atomicReference, String str, String str2) {
        this.f2597a = 1;
        this.f2602f = y5Var;
        this.f2598b = atomicReference;
        this.f2599c = null;
        this.f2600d = str;
        this.f2601e = str2;
    }
}
