package a4;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class u implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1190a;

    public /* synthetic */ u(RecyclerView recyclerView) {
        this.f1190a = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a0 a0Var = this.f1190a.L;
        if (a0Var != null) {
            e eVar = (e) a0Var;
            ArrayList arrayList = eVar.f1088e;
            boolean z10 = !arrayList.isEmpty();
            ArrayList arrayList2 = eVar.f1090g;
            boolean z11 = !arrayList2.isEmpty();
            ArrayList arrayList3 = eVar.f1091h;
            boolean z12 = !arrayList3.isEmpty();
            ArrayList arrayList4 = eVar.f1089f;
            boolean z13 = !arrayList4.isEmpty();
            if (z10 || z11 || z13 || z12) {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    a7.a.w(it.next());
                    throw null;
                }
                arrayList.clear();
                if (z11) {
                    ArrayList arrayList5 = new ArrayList();
                    arrayList5.addAll(arrayList2);
                    eVar.f1093j.add(arrayList5);
                    arrayList2.clear();
                    d dVar = new d(eVar, arrayList5, 0);
                    if (z10) {
                        a7.a.w(arrayList5.get(0));
                        throw null;
                    }
                    dVar.run();
                }
                if (z12) {
                    ArrayList arrayList6 = new ArrayList();
                    arrayList6.addAll(arrayList3);
                    eVar.f1094k.add(arrayList6);
                    arrayList3.clear();
                    d dVar2 = new d(eVar, arrayList6, 1);
                    if (z10) {
                        a7.a.w(arrayList6.get(0));
                        throw null;
                    }
                    dVar2.run();
                }
                if (z13) {
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.addAll(arrayList4);
                    eVar.f1092i.add(arrayList7);
                    arrayList4.clear();
                    d dVar3 = new d(eVar, arrayList7, 2);
                    if (!z10 && !z11 && !z12) {
                        dVar3.run();
                    } else {
                        Math.max(z11 ? eVar.f1068c : 0L, z12 ? eVar.f1069d : 0L);
                        a7.a.w(arrayList7.get(0));
                        throw null;
                    }
                }
            }
        }
    }
}
