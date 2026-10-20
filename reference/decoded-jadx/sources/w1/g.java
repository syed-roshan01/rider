package w1;

import android.view.ViewStructure;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static void a(ViewStructure viewStructure, String str) {
        viewStructure.setClassName(str);
    }

    public static void b(ViewStructure viewStructure, CharSequence charSequence) {
        viewStructure.setContentDescription(charSequence);
    }

    public static void c(ViewStructure viewStructure, int i10, int i11, int i12, int i13, int i14, int i15) {
        viewStructure.setDimens(i10, i11, i12, i13, i14, i15);
    }

    public static void d(ViewStructure viewStructure, CharSequence charSequence) {
        viewStructure.setText(charSequence);
    }

    public static void e(ViewStructure viewStructure, float f10, int i10, int i11, int i12) {
        viewStructure.setTextStyle(f10, i10, i11, i12);
    }
}
