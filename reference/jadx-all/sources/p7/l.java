package p7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes.dex */
public final class l extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f12832b;

    public l(a0 a0Var, int i10) {
        this.f12831a = i10;
        this.f12832b = a0Var;
    }

    @Override // p7.a0
    public final Object b(v7.a aVar) {
        int i10 = this.f12831a;
        a0 a0Var = this.f12832b;
        switch (i10) {
            case 0:
                return new AtomicLong(((Number) a0Var.b(aVar)).longValue());
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.M()) {
                    arrayList.add(Long.valueOf(((Number) a0Var.b(aVar)).longValue()));
                }
                aVar.g();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i11 = 0; i11 < size; i11++) {
                    atomicLongArray.set(i11, ((Long) arrayList.get(i11)).longValue());
                }
                return atomicLongArray;
            default:
                if (aVar.k0() != 9) {
                    return a0Var.b(aVar);
                }
                aVar.g0();
                return null;
        }
    }

    @Override // p7.a0
    public final void c(v7.b bVar, Object obj) throws IOException {
        int i10 = this.f12831a;
        a0 a0Var = this.f12832b;
        switch (i10) {
            case 0:
                a0Var.c(bVar, Long.valueOf(((AtomicLong) obj).get()));
                break;
            case 1:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                bVar.b();
                int length = atomicLongArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    a0Var.c(bVar, Long.valueOf(atomicLongArray.get(i11)));
                }
                bVar.g();
                break;
            default:
                if (obj == null) {
                    bVar.M();
                } else {
                    a0Var.c(bVar, obj);
                }
                break;
        }
    }
}
