package m0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f11659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f11662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f11663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q8.i f11664f;

    public q1(int i10, ArrayList arrayList) {
        this.f11659a = arrayList;
        this.f11660b = i10;
        if (i10 < 0) {
            throw new IllegalArgumentException("Invalid start index".toString());
        }
        this.f11662d = new ArrayList();
        HashMap map = new HashMap();
        int size = arrayList.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            w0 w0Var = (w0) this.f11659a.get(i12);
            Integer numValueOf = Integer.valueOf(w0Var.f11727c);
            int i13 = w0Var.f11728d;
            map.put(numValueOf, new q0(i12, i11, i13));
            i11 += i13;
        }
        this.f11663e = map;
        this.f11664f = new q8.i(new t.l0(this, 15));
    }

    public final int a(w0 w0Var) {
        q0 q0Var = (q0) this.f11663e.get(Integer.valueOf(w0Var.f11727c));
        if (q0Var != null) {
            return q0Var.f11657b;
        }
        return -1;
    }

    public final boolean b(int i10, int i11) {
        int i12;
        HashMap map = this.f11663e;
        q0 q0Var = (q0) map.get(Integer.valueOf(i10));
        if (q0Var == null) {
            return false;
        }
        int i13 = q0Var.f11657b;
        int i14 = i11 - q0Var.f11658c;
        q0Var.f11658c = i11;
        if (i14 == 0) {
            return true;
        }
        for (q0 q0Var2 : map.values()) {
            if (q0Var2.f11657b >= i13 && !d7.a.d(q0Var2, q0Var) && (i12 = q0Var2.f11657b + i14) >= 0) {
                q0Var2.f11657b = i12;
            }
        }
        return true;
    }
}
