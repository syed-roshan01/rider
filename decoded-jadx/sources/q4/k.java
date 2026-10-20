package q4;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import r8.p;

/* JADX INFO: loaded from: classes.dex */
public final class k implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f13149b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13150c;

    @Override // q4.m
    public final synchronized d a(c cVar) {
        try {
            ArrayList arrayList = (ArrayList) this.f13149b.get(cVar);
            d dVar = null;
            if (arrayList == null) {
                return null;
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                j jVar = (j) arrayList.get(i10);
                Bitmap bitmap = (Bitmap) jVar.f13146b.get();
                d dVar2 = bitmap != null ? new d(bitmap, jVar.f13147c) : null;
                if (dVar2 != null) {
                    dVar = dVar2;
                    break;
                }
            }
            int i11 = this.f13150c;
            this.f13150c = i11 + 1;
            if (i11 >= 10) {
                d();
            }
            return dVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // q4.m
    public final synchronized void b(int i10) {
        if (i10 >= 10 && i10 != 20) {
            d();
        }
    }

    @Override // q4.m
    public final synchronized void c(c cVar, Bitmap bitmap, Map map, int i10) {
        try {
            LinkedHashMap linkedHashMap = this.f13149b;
            Object arrayList = linkedHashMap.get(cVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(cVar, arrayList);
            }
            ArrayList arrayList2 = (ArrayList) arrayList;
            int iIdentityHashCode = System.identityHashCode(bitmap);
            j jVar = new j(iIdentityHashCode, new WeakReference(bitmap), map, i10);
            int size = arrayList2.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    arrayList2.add(jVar);
                    break;
                }
                j jVar2 = (j) arrayList2.get(i11);
                if (i10 >= jVar2.f13148d) {
                    if (jVar2.f13145a != iIdentityHashCode || jVar2.f13146b.get() != bitmap) {
                        arrayList2.add(i11, jVar);
                        break;
                    } else {
                        arrayList2.set(i11, jVar);
                        break;
                    }
                }
                i11++;
            }
            int i12 = this.f13150c;
            this.f13150c = i12 + 1;
            if (i12 >= 10) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void d() {
        WeakReference weakReference;
        this.f13150c = 0;
        Iterator it = this.f13149b.values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                j jVar = (j) p.H0(arrayList);
                if (((jVar == null || (weakReference = jVar.f13146b) == null) ? null : (Bitmap) weakReference.get()) == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    int i12 = i11 - i10;
                    if (((j) arrayList.get(i12)).f13146b.get() == null) {
                        arrayList.remove(i12);
                        i10++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }
}
