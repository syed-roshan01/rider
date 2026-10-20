package w0;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends f0 implements Iterator, e9.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f16057f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(x xVar, Iterator it, int i10) {
        super(xVar, it);
        this.f16057f = i10;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f16057f) {
            case 0:
                a();
                if (this.f16061d != null) {
                    return new d0(this);
                }
                throw new IllegalStateException();
            case 1:
                Map.Entry entry = this.f16062e;
                if (entry == null) {
                    throw new IllegalStateException();
                }
                a();
                return entry.getKey();
            default:
                Map.Entry entry2 = this.f16062e;
                if (entry2 == null) {
                    throw new IllegalStateException();
                }
                a();
                return entry2.getValue();
        }
    }
}
