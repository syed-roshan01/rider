package a4;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f1073a = new c0(30, 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f1074b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f1075c = new ArrayList();

    public b(w wVar) {
    }

    public final int a(int i10, int i11) {
        ArrayList arrayList = this.f1075c;
        int size = arrayList.size();
        while (i11 < size) {
            a aVar = (a) arrayList.get(i11);
            aVar.getClass();
            aVar.getClass();
            i11++;
        }
        return i10;
    }

    public final void b(a aVar) {
        aVar.f1065a = null;
        this.f1073a.o(aVar);
    }

    public final void c(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            b((a) arrayList.get(i10));
        }
        arrayList.clear();
    }
}
