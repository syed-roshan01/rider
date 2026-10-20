package e3;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import b3.b0;
import b3.q0;
import com.google.firebase.messaging.ServiceStarter;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class e implements View.OnTouchListener {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f5100y = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f5101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f5102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f5103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h.a f5104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f5105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f5106f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f5107n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f5108o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float[] f5109p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float[] f5110q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float[] f5111r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f5112s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f5113t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f5114u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f5115v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f5116w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ListView f5117x;

    public e(ListView listView) {
        a aVar = new a();
        aVar.f5095e = Long.MIN_VALUE;
        aVar.f5097g = -1L;
        aVar.f5096f = 0L;
        this.f5101a = aVar;
        this.f5102b = new AccelerateInterpolator();
        this.f5105e = new float[]{0.0f, 0.0f};
        this.f5106f = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f5109p = new float[]{0.0f, 0.0f};
        this.f5110q = new float[]{0.0f, 0.0f};
        this.f5111r = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f5103c = listView;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.f5111r;
        float f11 = ((int) ((1575.0f * f10) + 0.5f)) / 1000.0f;
        fArr[0] = f11;
        fArr[1] = f11;
        float[] fArr2 = this.f5110q;
        float f12 = ((int) ((f10 * 315.0f) + 0.5f)) / 1000.0f;
        fArr2[0] = f12;
        fArr2[1] = f12;
        this.f5107n = 1;
        float[] fArr3 = this.f5106f;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.f5105e;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.f5109p;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.f5108o = f5100y;
        aVar.f5091a = ServiceStarter.ERROR_UNKNOWN;
        aVar.f5092b = ServiceStarter.ERROR_UNKNOWN;
        this.f5117x = listView;
    }

    public static float b(float f10, float f11, float f12) {
        if (f10 > f12) {
            return f12;
        }
        return f10 < f11 ? f11 : f10;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:16:0x0051  */
    /* JADX WARN: Code duplicated, block: B:19:? A[RETURN, SYNTHETIC] */
    public final float a(float f10, float f11, float f12, int i10) {
        float fB;
        float interpolation;
        float fB2 = b(this.f5105e[i10] * f11, 0.0f, this.f5106f[i10]);
        float fC = c(f11 - f10, fB2) - c(f10, fB2);
        AccelerateInterpolator accelerateInterpolator = this.f5102b;
        if (fC >= 0.0f) {
            if (fC > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fC);
            } else {
                fB = 0.0f;
            }
            if (fB == 0.0f) {
                return 0.0f;
            }
            float f13 = this.f5109p[i10];
            float f14 = this.f5110q[i10];
            float f15 = this.f5111r[i10];
            float f16 = f13 * f12;
            return fB > 0.0f ? b(fB * f16, f14, f15) : -b((-fB) * f16, f14, f15);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fC);
        fB = b(interpolation, -1.0f, 1.0f);
        if (fB == 0.0f) {
            return 0.0f;
        }
        float f17 = this.f5109p[i10];
        float f18 = this.f5110q[i10];
        float f19 = this.f5111r[i10];
        float f110 = f17 * f12;
        if (fB > 0.0f) {
        }
    }

    public final float c(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f5107n;
        if (i10 != 0 && i10 != 1) {
            if (i10 == 2 && f10 < 0.0f) {
                return f10 / (-f11);
            }
            return 0.0f;
        }
        if (f10 >= f11) {
            return 0.0f;
        }
        if (f10 >= 0.0f) {
            return 1.0f - (f10 / f11);
        }
        return (this.f5115v && i10 == 1) ? 1.0f : 0.0f;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    public final boolean d(View view, MotionEvent motionEvent) {
        int i10;
        if (!this.f5116w) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                e();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    e();
                }
            }
            return false;
        }
        this.f5114u = true;
        this.f5112s = false;
        float x10 = motionEvent.getX();
        float width = view.getWidth();
        View view2 = this.f5103c;
        float fA = a(x10, width, view2.getWidth(), 0);
        float fA2 = a(motionEvent.getY(), view.getHeight(), view2.getHeight(), 1);
        a aVar = this.f5101a;
        aVar.f5093c = fA;
        aVar.f5094d = fA2;
        if (!this.f5115v && f()) {
            if (this.f5104d == null) {
                this.f5104d = new h.a(this, 4);
            }
            this.f5115v = true;
            this.f5113t = true;
            if (this.f5112s || (i10 = this.f5108o) <= 0) {
                this.f5104d.run();
            } else {
                h.a aVar2 = this.f5104d;
                long j10 = i10;
                Field field = q0.f2670a;
                b0.n(view2, aVar2, j10);
            }
            this.f5112s = true;
        }
        return false;
    }

    public final void e() {
        int i10 = 0;
        if (this.f5113t) {
            this.f5115v = false;
            return;
        }
        a aVar = this.f5101a;
        aVar.getClass();
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i11 = (int) (jCurrentAnimationTimeMillis - aVar.f5095e);
        int i12 = aVar.f5092b;
        if (i11 > i12) {
            i10 = i12;
        } else if (i11 >= 0) {
            i10 = i11;
        }
        aVar.f5099i = i10;
        aVar.f5098h = aVar.a(jCurrentAnimationTimeMillis);
        aVar.f5097g = jCurrentAnimationTimeMillis;
    }

    public final boolean f() {
        ListView listView;
        int count;
        a aVar = this.f5101a;
        float f10 = aVar.f5094d;
        int iAbs = (int) (f10 / Math.abs(f10));
        Math.abs(aVar.f5093c);
        if (iAbs == 0 || (count = (listView = this.f5117x).getCount()) == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i10 = firstVisiblePosition + childCount;
        if (iAbs > 0) {
            if (i10 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (iAbs >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final /* bridge */ /* synthetic */ boolean onTouch(View view, MotionEvent motionEvent) {
        d(view, motionEvent);
        return false;
    }
}
