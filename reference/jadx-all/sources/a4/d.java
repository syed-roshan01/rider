package a4;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f1083c;

    public /* synthetic */ d(e eVar, ArrayList arrayList, int i10) {
        this.f1081a = i10;
        this.f1083c = eVar;
        this.f1082b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f1081a;
        e eVar = this.f1083c;
        ArrayList arrayList = this.f1082b;
        switch (i10) {
            case 0:
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    a7.a.w(it.next());
                    throw null;
                }
                arrayList.clear();
                eVar.f1093j.remove(arrayList);
                return;
            case 1:
                Iterator it2 = arrayList.iterator();
                if (it2.hasNext()) {
                    a7.a.w(it2.next());
                    eVar.getClass();
                    throw null;
                }
                arrayList.clear();
                eVar.f1094k.remove(arrayList);
                return;
            default:
                Iterator it3 = arrayList.iterator();
                if (it3.hasNext()) {
                    a7.a.w(it3.next());
                    eVar.getClass();
                    throw null;
                }
                arrayList.clear();
                eVar.f1092i.remove(arrayList);
                return;
        }
    }
}
