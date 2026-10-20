package a4;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f1206a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1207b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1208c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f1210e;

    public w0(StaggeredGridLayoutManager staggeredGridLayoutManager, int i10) {
        this.f1210e = staggeredGridLayoutManager;
        this.f1209d = i10;
    }

    public final void a() {
        View view = (View) a7.a.k(this.f1206a, 1);
        t0 t0Var = (t0) view.getLayoutParams();
        this.f1208c = this.f1210e.f2277j.b(view);
        t0Var.getClass();
    }

    public final void b() {
        this.f1206a.clear();
        this.f1207b = Integer.MIN_VALUE;
        this.f1208c = Integer.MIN_VALUE;
    }

    public final int c(int i10) {
        int i11 = this.f1208c;
        if (i11 != Integer.MIN_VALUE) {
            return i11;
        }
        if (this.f1206a.size() == 0) {
            return i10;
        }
        a();
        return this.f1208c;
    }

    public final int d(int i10) {
        int i11 = this.f1207b;
        if (i11 != Integer.MIN_VALUE) {
            return i11;
        }
        if (this.f1206a.size() == 0) {
            return i10;
        }
        View view = (View) this.f1206a.get(0);
        t0 t0Var = (t0) view.getLayoutParams();
        this.f1207b = this.f1210e.f2277j.c(view);
        t0Var.getClass();
        return this.f1207b;
    }
}
