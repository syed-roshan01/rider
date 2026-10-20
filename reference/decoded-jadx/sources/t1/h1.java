package t1;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class h1 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h1 f14441a = new h1();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) obj;
        androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) obj2;
        int iO = d7.a.o(aVar2.f1745q, aVar.f1745q);
        return iO != 0 ? iO : d7.a.o(aVar.hashCode(), aVar2.hashCode());
    }
}
