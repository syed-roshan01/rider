package u1;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class m0 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Comparator f15161a;

    public m0(Comparator comparator) {
        this.f15161a = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iCompare = this.f15161a.compare(obj, obj2);
        if (iCompare != 0) {
            return iCompare;
        }
        return androidx.compose.ui.node.a.O.compare(((y1.o) obj).f16797c, ((y1.o) obj2).f16797c);
    }
}
