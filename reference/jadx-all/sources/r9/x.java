package r9;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import m9.t0;
import m9.u0;

/* JADX INFO: loaded from: classes.dex */
public class x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f13735b = AtomicIntegerFieldUpdater.newUpdater(x.class, "_size");
    private volatile int _size;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t0[] f13736a;

    public final void a(t0 t0Var) {
        t0Var.e((u0) this);
        t0[] t0VarArr = this.f13736a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f13735b;
        if (t0VarArr == null) {
            t0VarArr = new t0[4];
            this.f13736a = t0VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= t0VarArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(t0VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            d7.a.l(objArrCopyOf, "copyOf(this, newSize)");
            t0VarArr = (t0[]) objArrCopyOf;
            this.f13736a = t0VarArr;
        }
        int i10 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i10 + 1);
        t0VarArr[i10] = t0Var;
        t0Var.f12003b = i10;
        c(i10);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    /* JADX WARN: Code duplicated, block: B:17:0x0063  */
    /* JADX WARN: Code duplicated, block: B:21:0x0075 A[LOOP:0: B:9:0x003a->B:21:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x007a A[EDGE_INSN: B:24:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x007a A[EDGE_INSN: B:25:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[SYNTHETIC] */
    public final t0 b(int i10) {
        int i11;
        int i12;
        Object[] objArr;
        int i13;
        Comparable comparable;
        Comparable comparable2;
        Comparable comparable3;
        Object obj;
        Object[] objArr2 = this.f13736a;
        d7.a.j(objArr2);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f13735b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i10 < atomicIntegerFieldUpdater.get(this)) {
            d(i10, atomicIntegerFieldUpdater.get(this));
            int i14 = (i10 - 1) / 2;
            if (i10 > 0) {
                t0 t0Var = objArr2[i10];
                d7.a.j(t0Var);
                Object obj2 = objArr2[i14];
                d7.a.j(obj2);
                if (t0Var.compareTo(obj2) < 0) {
                    d(i10, i14);
                    c(i14);
                } else {
                    while (true) {
                        i11 = i10 * 2;
                        i12 = i11 + 1;
                        if (i12 >= atomicIntegerFieldUpdater.get(this)) {
                            break;
                        }
                        objArr = this.f13736a;
                        d7.a.j(objArr);
                        i13 = i11 + 2;
                        if (i13 < atomicIntegerFieldUpdater.get(this)) {
                            comparable3 = objArr[i13];
                            d7.a.j(comparable3);
                            obj = objArr[i12];
                            d7.a.j(obj);
                            if (comparable3.compareTo(obj) >= 0) {
                                i13 = i12;
                            }
                        } else {
                            i13 = i12;
                        }
                        comparable = objArr[i10];
                        d7.a.j(comparable);
                        comparable2 = objArr[i13];
                        d7.a.j(comparable2);
                        if (comparable.compareTo(comparable2) <= 0) {
                            break;
                        }
                        d(i10, i13);
                        i10 = i13;
                    }
                }
            } else {
                while (true) {
                    i11 = i10 * 2;
                    i12 = i11 + 1;
                    if (i12 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                        break;
                    }
                    objArr = this.f13736a;
                    d7.a.j(objArr);
                    i13 = i11 + 2;
                    if (i13 < atomicIntegerFieldUpdater.get(this)) {
                        comparable3 = objArr[i13];
                        d7.a.j(comparable3);
                        obj = objArr[i12];
                        d7.a.j(obj);
                        if (comparable3.compareTo(obj) >= 0) {
                            i13 = i12;
                        }
                    } else {
                        i13 = i12;
                    }
                    comparable = objArr[i10];
                    d7.a.j(comparable);
                    comparable2 = objArr[i13];
                    d7.a.j(comparable2);
                    if (comparable.compareTo(comparable2) <= 0) {
                        break;
                        break;
                    }
                    d(i10, i13);
                    i10 = i13;
                }
            }
        }
        t0 t0Var2 = objArr2[atomicIntegerFieldUpdater.get(this)];
        d7.a.j(t0Var2);
        t0Var2.e(null);
        t0Var2.f12003b = -1;
        objArr2[atomicIntegerFieldUpdater.get(this)] = null;
        return t0Var2;
    }

    public final void c(int i10) {
        while (i10 > 0) {
            t0[] t0VarArr = this.f13736a;
            d7.a.j(t0VarArr);
            int i11 = (i10 - 1) / 2;
            t0 t0Var = t0VarArr[i11];
            d7.a.j(t0Var);
            t0 t0Var2 = t0VarArr[i10];
            d7.a.j(t0Var2);
            if (t0Var.compareTo(t0Var2) <= 0) {
                return;
            }
            d(i10, i11);
            i10 = i11;
        }
    }

    public final void d(int i10, int i11) {
        t0[] t0VarArr = this.f13736a;
        d7.a.j(t0VarArr);
        t0 t0Var = t0VarArr[i11];
        d7.a.j(t0Var);
        t0 t0Var2 = t0VarArr[i10];
        d7.a.j(t0Var2);
        t0VarArr[i10] = t0Var;
        t0VarArr[i11] = t0Var2;
        t0Var.f12003b = i10;
        t0Var2.f12003b = i11;
    }
}
