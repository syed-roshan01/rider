package e8;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5371a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f5372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f5373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object[][] f5374d;

    public /* synthetic */ u0(List list, c cVar, Object[][] objArr, int i10) {
        this(list, cVar, objArr);
    }

    public final String toString() {
        switch (this.f5371a) {
            case 1:
                q6.g gVarJ0 = f6.a.j0(this);
                gVarJ0.a(this.f5372b, "addrs");
                gVarJ0.a(this.f5373c, "attrs");
                gVarJ0.a(Arrays.deepToString(this.f5374d), "customOptions");
                return gVarJ0.toString();
            default:
                return super.toString();
        }
    }

    public u0(List list, c cVar, Object[][] objArr) {
        y3.e.J(list, "addresses are not set");
        this.f5372b = list;
        y3.e.J(cVar, "attrs");
        this.f5373c = cVar;
        y3.e.J(objArr, "customOptions");
        this.f5374d = objArr;
    }
}
