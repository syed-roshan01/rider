package k9;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f10629a;

    public a(r8.o oVar) {
        this.f10629a = new AtomicReference(oVar);
    }

    @Override // k9.i
    public final Iterator iterator() {
        i iVar = (i) this.f10629a.getAndSet(null);
        if (iVar != null) {
            return iVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
