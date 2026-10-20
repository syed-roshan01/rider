package k9;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class b implements i, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f10630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10631b;

    public b(i iVar, int i10) {
        d7.a.m(iVar, "sequence");
        this.f10630a = iVar;
        this.f10631b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // k9.c
    public final i a(int i10) {
        int i11 = this.f10631b + i10;
        return i11 < 0 ? new b(this, i10) : new b(this.f10630a, i11);
    }

    @Override // k9.i
    public final Iterator iterator() {
        return new o0.b(this);
    }
}
