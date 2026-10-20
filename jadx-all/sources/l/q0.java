package l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final RectF f10894l = new RectF();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f10895m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10896a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10897b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f10898c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f10899d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f10900e = -1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f10901f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f10902g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextPaint f10903h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f10904i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f10905j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final n0 f10906k;

    static {
        new ConcurrentHashMap();
    }

    public q0(TextView textView) {
        this.f10904i = textView;
        this.f10905j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f10906k = new o0();
        } else {
            this.f10906k = new n0();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr2;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f10895m;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                declaredMethod.setAccessible(true);
                concurrentHashMap.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e4) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e4);
            return null;
        }
    }

    public static Object e(String str, Object obj, Object obj2) {
        try {
            return d(str).invoke(obj, new Object[0]);
        } catch (Exception e4) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e4);
            return obj2;
        }
    }

    public final void a() {
        if (this.f10896a != 0) {
            if (this.f10897b) {
                if (this.f10904i.getMeasuredHeight() <= 0 || this.f10904i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f10906k.b(this.f10904i) ? 1048576 : (this.f10904i.getMeasuredWidth() - this.f10904i.getTotalPaddingLeft()) - this.f10904i.getTotalPaddingRight();
                int height = (this.f10904i.getHeight() - this.f10904i.getCompoundPaddingBottom()) - this.f10904i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f10894l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fC = c(rectF);
                        if (fC != this.f10904i.getTextSize()) {
                            f(0, fC);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.f10897b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f10901f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i10 = length - 1;
        int i11 = 0;
        int i12 = 1;
        while (i12 <= i10) {
            int i13 = (i12 + i10) / 2;
            int i14 = this.f10901f[i13];
            TextView textView = this.f10904i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int iB = k0.b(textView);
            TextPaint textPaint = this.f10903h;
            if (textPaint == null) {
                this.f10903h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f10903h.set(textView.getPaint());
            this.f10903h.setTextSize(i14);
            StaticLayout staticLayoutA = m0.a(text, (Layout.Alignment) e("getLayoutAlignment", textView, Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), iB, this.f10904i, this.f10903h, this.f10906k);
            if ((iB == -1 || (staticLayoutA.getLineCount() <= iB && staticLayoutA.getLineEnd(staticLayoutA.getLineCount() - 1) == text.length())) && staticLayoutA.getHeight() <= rectF.bottom) {
                int i15 = i13 + 1;
                i11 = i12;
                i12 = i15;
            } else {
                i11 = i13 - 1;
                i10 = i11;
            }
        }
        return this.f10901f[i11];
    }

    public final void f(int i10, float f10) {
        Context context = this.f10905j;
        float fApplyDimension = TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f10904i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zA = l0.a(textView);
            if (textView.getLayout() != null) {
                this.f10897b = false;
                try {
                    Method methodD = d("nullLayouts");
                    if (methodD != null) {
                        methodD.invoke(textView, new Object[0]);
                    }
                } catch (Exception e4) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e4);
                }
                if (zA) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean g() {
        if (this.f10896a == 1) {
            if (!this.f10902g || this.f10901f.length == 0) {
                int iFloor = ((int) Math.floor((this.f10900e - this.f10899d) / this.f10898c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i10 = 0; i10 < iFloor; i10++) {
                    iArr[i10] = Math.round((i10 * this.f10898c) + this.f10899d);
                }
                this.f10901f = b(iArr);
            }
            this.f10897b = true;
        } else {
            this.f10897b = false;
        }
        return this.f10897b;
    }

    public final boolean h() {
        int[] iArr = this.f10901f;
        int length = iArr.length;
        boolean z10 = length > 0;
        this.f10902g = z10;
        if (z10) {
            this.f10896a = 1;
            this.f10899d = iArr[0];
            this.f10900e = iArr[length - 1];
            this.f10898c = -1.0f;
        }
        return z10;
    }

    public final void i(float f10, float f11, float f12) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        }
        if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        if (f12 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
        this.f10896a = 1;
        this.f10899d = f10;
        this.f10900e = f11;
        this.f10898c = f12;
        this.f10902g = false;
    }
}
