package r6;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class y extends z implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f13589a = new y();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
