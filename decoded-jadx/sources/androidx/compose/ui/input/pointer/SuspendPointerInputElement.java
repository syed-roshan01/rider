package androidx.compose.ui.input.pointer;

import c9.e;
import d7.a;
import java.util.Arrays;
import o1.j0;
import t1.u0;
import y0.n;

/* JADX INFO: loaded from: classes.dex */
public final class SuspendPointerInputElement extends u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object[] f1729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f1730e;

    public SuspendPointerInputElement(Object obj, Object obj2, e eVar, int i10) {
        obj = (i10 & 1) != 0 ? null : obj;
        obj2 = (i10 & 2) != 0 ? null : obj2;
        this.f1727b = obj;
        this.f1728c = obj2;
        this.f1729d = null;
        this.f1730e = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        if (!a.d(this.f1727b, suspendPointerInputElement.f1727b) || !a.d(this.f1728c, suspendPointerInputElement.f1728c)) {
            return false;
        }
        Object[] objArr = this.f1729d;
        if (objArr != null) {
            Object[] objArr2 = suspendPointerInputElement.f1729d;
            if (objArr2 == null || !Arrays.equals(objArr, objArr2)) {
                return false;
            }
        } else if (suspendPointerInputElement.f1729d != null) {
            return false;
        }
        return true;
    }

    @Override // t1.u0
    public final int hashCode() {
        Object obj = this.f1727b;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f1728c;
        int iHashCode2 = (iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object[] objArr = this.f1729d;
        return iHashCode2 + (objArr != null ? Arrays.hashCode(objArr) : 0);
    }

    @Override // t1.u0
    public final n l() {
        return new j0(this.f1730e);
    }

    @Override // t1.u0
    public final void m(n nVar) {
        j0 j0Var = (j0) nVar;
        j0Var.I0();
        j0Var.f12391u = this.f1730e;
    }
}
