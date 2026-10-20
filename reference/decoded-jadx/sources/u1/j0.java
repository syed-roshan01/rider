package u1;

import android.os.Build;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f15118a = new j0();

    public static void a(p0 p0Var, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        y1.o oVar;
        c9.c cVar;
        int i10 = 0;
        while (i10 < longSparseArray.size()) {
            int i11 = i10 + 1;
            long jKeyAt = longSparseArray.keyAt(i10);
            ViewTranslationResponse viewTranslationResponseH = b2.s.h(longSparseArray.get(jKeyAt));
            if (viewTranslationResponseH != null && (value = viewTranslationResponseH.getValue("android:text")) != null && (text = value.getText()) != null) {
                int[] iArr = p0.X;
                s2 s2Var = (s2) p0Var.r().get(Integer.valueOf((int) jKeyAt));
                if (s2Var != null && (oVar = s2Var.f15289a) != null) {
                    y1.a aVar = (y1.a) o1.s.J(oVar.f16798d, y1.i.f16769i);
                    if (aVar != null && (cVar = (c9.c) aVar.f16746b) != null) {
                    }
                }
            }
            i10 = i11;
        }
    }

    public final void b(p0 p0Var, long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
        y1.o oVar;
        for (long j10 : jArr) {
            int[] iArr2 = p0.X;
            s2 s2Var = (s2) p0Var.r().get(Integer.valueOf((int) j10));
            if (s2Var != null && (oVar = s2Var.f15289a) != null) {
                b2.s.j();
                ViewTranslationRequest.Builder builderF = b2.s.f(p0Var.f15195d.getAutofillId(), oVar.f16801g);
                d1.d dVar = r0.f15247a;
                List list = (List) o1.s.J(oVar.f16798d, y1.r.f16836u);
                String strO = list != null ? i1.b.o(list, "\n") : null;
                if (strO != null) {
                    builderF.setValue("android:text", TranslationRequestValue.forText(new a2.e(strO, null, 6)));
                    consumer.accept(builderF.build());
                }
            }
        }
    }

    public final void c(p0 p0Var, LongSparseArray<ViewTranslationResponse> longSparseArray) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (d7.a.d(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            a(p0Var, longSparseArray);
        } else {
            p0Var.f15195d.post(new i0(0, p0Var, longSparseArray));
        }
    }
}
