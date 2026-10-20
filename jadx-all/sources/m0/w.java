package m0;

import android.os.Trace;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f11720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f11721b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f11722c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f11723d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q.t f11724e;

    public w(HashSet hashSet) {
        this.f11720a = hashSet;
    }

    public final void a() {
        Set set = this.f11720a;
        if (!set.isEmpty()) {
            Trace.beginSection("Compose:abandons");
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    i2 i2Var = (i2) it.next();
                    it.remove();
                    i2Var.b();
                }
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
    }

    public final void b() {
        ArrayList arrayList = this.f11722c;
        boolean z10 = !arrayList.isEmpty();
        Set set = this.f11720a;
        if (z10) {
            Trace.beginSection("Compose:onForgotten");
            try {
                q.t tVar = this.f11724e;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (-1 >= size) {
                        break;
                    }
                    Object obj = arrayList.get(size);
                    z6.a.c(set).remove(obj);
                    if (obj instanceof i2) {
                        ((i2) obj).d();
                    }
                    if (obj instanceof j) {
                        if (tVar == null || !tVar.a(obj)) {
                            ((j) obj).c();
                        } else {
                            ((j) obj).b();
                        }
                    }
                }
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        ArrayList arrayList2 = this.f11721b;
        if (!arrayList2.isEmpty()) {
            Trace.beginSection("Compose:onRemembered");
            try {
                int size2 = arrayList2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    i2 i2Var = (i2) arrayList2.get(i10);
                    set.remove(i2Var);
                    i2Var.a();
                }
                Trace.endSection();
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
    }
}
