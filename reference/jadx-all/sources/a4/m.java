package a4;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f1157e = new ThreadLocal();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t1.p f1158f = new t1.p(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f1159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f1160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f1161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f1162d;

    public final void a(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow() && this.f1160b == 0) {
            this.f1160b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        k kVar = recyclerView.f2251e0;
        kVar.f1139a = i10;
        kVar.f1140b = i11;
    }

    public final void b(long j10) {
        l lVar;
        RecyclerView recyclerView;
        l lVar2;
        ArrayList arrayList = this.f1159a;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView2 = (RecyclerView) arrayList.get(i11);
            if (recyclerView2.getWindowVisibility() == 0) {
                k kVar = recyclerView2.f2251e0;
                kVar.f1141c = 0;
                int[] iArr = kVar.f1142d;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                i10 += kVar.f1141c;
            }
        }
        ArrayList arrayList2 = this.f1162d;
        arrayList2.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i13);
            if (recyclerView3.getWindowVisibility() == 0) {
                k kVar2 = recyclerView3.f2251e0;
                int iAbs = Math.abs(kVar2.f1140b) + Math.abs(kVar2.f1139a);
                for (int i14 = 0; i14 < kVar2.f1141c * 2; i14 += 2) {
                    if (i12 >= arrayList2.size()) {
                        lVar2 = new l();
                        arrayList2.add(lVar2);
                    } else {
                        lVar2 = (l) arrayList2.get(i12);
                    }
                    int[] iArr2 = kVar2.f1142d;
                    int i15 = iArr2[i14 + 1];
                    lVar2.f1145a = i15 <= iAbs;
                    lVar2.f1146b = iAbs;
                    lVar2.f1147c = i15;
                    lVar2.f1148d = recyclerView3;
                    lVar2.f1149e = iArr2[i14];
                    i12++;
                }
            }
        }
        Collections.sort(arrayList2, f1158f);
        if (arrayList2.size() <= 0 || (recyclerView = (lVar = (l) arrayList2.get(0)).f1148d) == null) {
            return;
        }
        int i16 = lVar.f1149e;
        if (recyclerView.f2248d.e() > 0) {
            RecyclerView.j(recyclerView.f2248d.d(0));
            throw null;
        }
        l0 l0Var = recyclerView.f2242a;
        try {
            recyclerView.n();
            l0Var.b(i16);
            throw null;
        } catch (Throwable th) {
            recyclerView.o(false);
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i10 = x2.q.f16301a;
            x2.p.a("RV Prefetch");
            ArrayList arrayList = this.f1159a;
            if (arrayList.isEmpty()) {
                this.f1160b = 0L;
                return;
            }
            int size = arrayList.size();
            long jMax = 0;
            for (int i11 = 0; i11 < size; i11++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i11);
                if (recyclerView.getWindowVisibility() == 0) {
                    jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                this.f1160b = 0L;
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f1161c);
                this.f1160b = 0L;
            }
        } finally {
            this.f1160b = 0L;
            int i12 = x2.q.f16301a;
            x2.p.b();
        }
    }
}
