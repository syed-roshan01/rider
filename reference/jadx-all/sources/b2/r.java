package b2;

import android.text.Layout;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Layout.Alignment f2572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Layout.Alignment f2573b;

    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (d7.a.d(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (d7.a.d(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f2572a = alignment;
        f2573b = alignment2;
    }
}
