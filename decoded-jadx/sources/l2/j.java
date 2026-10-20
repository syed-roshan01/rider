package l2;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f11211b = new j(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f11212c = new j(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f11213d = new j(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11214a;

    public j(int i10) {
        this.f11214a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            return this.f11214a == ((j) obj).f11214a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11214a;
    }

    public final String toString() {
        int i10 = this.f11214a;
        if (i10 == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i10 & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i10 & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + i1.b.o(arrayList, ", ") + ']';
    }
}
