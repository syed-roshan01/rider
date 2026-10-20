package r8;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class w implements Iterator, e9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z f13664a = z.f13684b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f13665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x f13668e;

    public w(x xVar) {
        this.f13668e = xVar;
        this.f13666c = xVar.e();
        this.f13667d = xVar.f13671c;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean hasNext() {
        z zVar = this.f13664a;
        z zVar2 = z.f13686d;
        if (zVar == zVar2) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int iOrdinal = zVar.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 2) {
            this.f13664a = zVar2;
            int i10 = this.f13666c;
            if (i10 == 0) {
                this.f13664a = z.f13685c;
            } else {
                x xVar = this.f13668e;
                Object[] objArr = xVar.f13669a;
                int i11 = this.f13667d;
                this.f13665b = objArr[i11];
                this.f13664a = z.f13683a;
                this.f13667d = (i11 + 1) % xVar.f13670b;
                this.f13666c = i10 - 1;
            }
            if (this.f13664a == z.f13683a) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f13664a = z.f13684b;
        return this.f13665b;
    }

    public final void c() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        c();
        throw null;
    }
}
