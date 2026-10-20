package a4;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f1076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o8.c f1077b = new o8.c(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f1078c = new ArrayList();

    public c(w wVar) {
        this.f1076a = wVar;
    }

    public final View a(int i10) {
        return this.f1076a.f1205a.getChildAt(c(i10));
    }

    public final int b() {
        return this.f1076a.f1205a.getChildCount() - this.f1078c.size();
    }

    public final int c(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int childCount = this.f1076a.f1205a.getChildCount();
        int i11 = i10;
        while (i11 < childCount) {
            o8.c cVar = this.f1077b;
            int iA = i10 - (i11 - cVar.a(i11));
            if (iA == 0) {
                while (cVar.c(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += iA;
        }
        return -1;
    }

    public final View d(int i10) {
        return this.f1076a.f1205a.getChildAt(i10);
    }

    public final int e() {
        return this.f1076a.f1205a.getChildCount();
    }

    public final String toString() {
        return this.f1077b.toString() + ", hidden list:" + this.f1078c.size();
    }
}
