package r6;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class w extends k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f13587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13588b;

    public w(Object obj) {
        this.f13588b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f13587a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f13587a) {
            throw new NoSuchElementException();
        }
        this.f13587a = true;
        return this.f13588b;
    }
}
