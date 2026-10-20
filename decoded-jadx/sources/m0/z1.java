package m0;

import android.util.SparseIntArray;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f11771c;

    public z1(String str, boolean z10) {
        this.f11769a = 2;
        this.f11771c = str;
        this.f11770b = z10;
    }

    public static int a(int i10, int i11) {
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            i12++;
            if (i12 == i11) {
                i13++;
                i12 = 0;
            } else if (i12 > i11) {
                i13++;
                i12 = 1;
            }
        }
        return i12 + 1 > i11 ? i13 + 1 : i13;
    }

    public final void b() {
        ((SparseIntArray) this.f11771c).clear();
    }

    public final String toString() {
        switch (this.f11769a) {
            case 2:
                String str = (String) this.f11771c;
                boolean z10 = this.f11770b;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
                sb.append("{");
                sb.append(str);
                sb.append("}");
                sb.append(z10);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ z1(boolean z10, Serializable serializable, int i10) {
        this.f11769a = i10;
        this.f11770b = z10;
        this.f11771c = serializable;
    }

    public z1() {
        this.f11769a = 1;
        this.f11771c = new SparseIntArray();
        this.f11770b = false;
    }
}
