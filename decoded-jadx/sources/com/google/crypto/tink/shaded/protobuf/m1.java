package com.google.crypto.tink.shaded.protobuf;

import com.google.protobuf.k2;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class m1 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f3586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f3587e;

    public /* synthetic */ m1(AbstractMap abstractMap, int i10) {
        this.f3583a = i10;
        this.f3587e = abstractMap;
        this.f3584b = -1;
    }

    public final Iterator a() {
        int i10 = this.f3583a;
        AbstractMap abstractMap = this.f3587e;
        switch (i10) {
            case 0:
                if (this.f3586d != null) {
                    return this.f3586d;
                }
                ((l1) abstractMap).getClass();
                throw null;
            default:
                if (this.f3586d == null) {
                    this.f3586d = ((k2) abstractMap).f4171c.entrySet().iterator();
                }
                return this.f3586d;
        }
    }

    public final Map.Entry b() {
        int i10 = this.f3583a;
        AbstractMap abstractMap = this.f3587e;
        switch (i10) {
            case 0:
                this.f3585c = true;
                this.f3584b++;
                ((l1) abstractMap).getClass();
                throw null;
            default:
                this.f3585c = true;
                int i11 = this.f3584b + 1;
                this.f3584b = i11;
                k2 k2Var = (k2) abstractMap;
                return i11 < k2Var.f4170b.size() ? (Map.Entry) k2Var.f4170b.get(this.f3584b) : (Map.Entry) a().next();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f3583a;
        AbstractMap abstractMap = this.f3587e;
        switch (i10) {
            case 0:
                ((l1) abstractMap).getClass();
                throw null;
            default:
                k2 k2Var = (k2) abstractMap;
                return this.f3584b + 1 < k2Var.f4170b.size() || (!k2Var.f4171c.isEmpty() && a().hasNext());
        }
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        switch (this.f3583a) {
            case 0:
                break;
        }
        return b();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i10 = this.f3583a;
        AbstractMap abstractMap = this.f3587e;
        switch (i10) {
            case 0:
                if (!this.f3585c) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f3585c = false;
                l1 l1Var = (l1) abstractMap;
                int i11 = l1.f3575a;
                l1Var.a();
                l1Var.getClass();
                throw null;
            default:
                if (!this.f3585c) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f3585c = false;
                k2 k2Var = (k2) abstractMap;
                int i12 = k2.f4168n;
                k2Var.b();
                if (this.f3584b >= k2Var.f4170b.size()) {
                    a().remove();
                    return;
                }
                int i13 = this.f3584b;
                this.f3584b = i13 - 1;
                k2Var.o(i13);
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1(l1 l1Var) {
        this(l1Var, 0);
        this.f3583a = 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1(k2 k2Var) {
        this(k2Var, 1);
        this.f3583a = 1;
    }
}
