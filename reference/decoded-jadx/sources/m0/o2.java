package m0;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class o2 implements Iterable, e9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n2 f11618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11620c;

    public o2(int i10, int i11, n2 n2Var) {
        this.f11618a = n2Var;
        this.f11619b = i10;
        this.f11620c = i11;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i10;
        ArrayList arrayList;
        int iQ0;
        n2 n2Var = this.f11618a;
        if (n2Var.f11602n != this.f11620c) {
            throw new ConcurrentModificationException();
        }
        HashMap map = n2Var.f11604p;
        c cVar = null;
        int i11 = this.f11619b;
        if (map != null) {
            if (!(!n2Var.f11601f)) {
                s.g("use active SlotWriter to crate an anchor for location instead".toString());
                throw null;
            }
            if (i11 >= 0 && i11 < (i10 = n2Var.f11597b) && (iQ0 = d7.t.q0((arrayList = n2Var.f11603o), i11, i10)) >= 0) {
                cVar = (c) arrayList.get(iQ0);
            }
            if (cVar != null) {
            }
        }
        return new r0(i11 + 1, d7.t.s(n2Var.f11596a, i11) + i11, n2Var);
    }
}
