package a4;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f1150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f1151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f1152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k0 f1155f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1156g;

    public l0(RecyclerView recyclerView) {
        this.f1156g = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f1150a = arrayList;
        this.f1151b = new ArrayList();
        this.f1152c = Collections.unmodifiableList(arrayList);
        this.f1153d = 2;
        this.f1154e = 2;
    }

    public final int a(int i10) {
        RecyclerView recyclerView = this.f1156g;
        if (i10 >= 0 && i10 < recyclerView.f2253f0.a()) {
            return !recyclerView.f2253f0.f1169d ? i10 : recyclerView.f2246c.a(i10, 0);
        }
        StringBuilder sbQ = a7.a.q("invalid position ", i10, ". State item count is ");
        sbQ.append(recyclerView.f2253f0.a());
        sbQ.append(recyclerView.h());
        throw new IndexOutOfBoundsException(sbQ.toString());
    }

    public final void b(int i10) {
        RecyclerView recyclerView = this.f1156g;
        if (i10 < 0 || i10 >= recyclerView.f2253f0.a()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i10 + "(" + i10 + "). Item count:" + recyclerView.f2253f0.a() + recyclerView.h());
        }
        o0 o0Var = recyclerView.f2253f0;
        boolean z10 = o0Var.f1169d;
        ArrayList arrayList = this.f1150a;
        if (arrayList.size() > 0) {
            a7.a.w(arrayList.get(0));
            throw null;
        }
        c cVar = recyclerView.f2248d;
        ArrayList arrayList2 = cVar.f1078c;
        if (arrayList2.size() > 0) {
            View view = (View) arrayList2.get(0);
            cVar.f1076a.getClass();
            RecyclerView.j(view);
            throw null;
        }
        ArrayList arrayList3 = this.f1151b;
        if (arrayList3.size() > 0) {
            a7.a.w(arrayList3.get(0));
            throw null;
        }
        int iA = recyclerView.f2246c.a(i10, 0);
        if (iA >= 0) {
            throw null;
        }
        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i10 + "(offset:" + iA + ").state:" + o0Var.a() + recyclerView.h());
    }

    public final void c() {
        e0 e0Var = this.f1156g.f2264p;
        this.f1154e = this.f1153d;
        ArrayList arrayList = this.f1151b;
        int size = arrayList.size() - 1;
        if (size < 0 || arrayList.size() <= this.f1154e) {
            return;
        }
        a7.a.w(arrayList.get(size));
        int[] iArr = RecyclerView.f2238p0;
        throw null;
    }
}
