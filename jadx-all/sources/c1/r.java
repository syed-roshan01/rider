package c1;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f2917a = new r();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        p pVar = (p) obj;
        p pVar2 = (p) obj2;
        if (pVar == null) {
            throw new IllegalArgumentException("compare requires non-null focus targets".toString());
        }
        if (pVar2 == null) {
            throw new IllegalArgumentException("compare requires non-null focus targets".toString());
        }
        int i10 = 0;
        if (!androidx.compose.ui.focus.a.t(pVar) || !androidx.compose.ui.focus.a.t(pVar2)) {
            if (androidx.compose.ui.focus.a.t(pVar)) {
                return -1;
            }
            return androidx.compose.ui.focus.a.t(pVar2) ? 1 : 0;
        }
        androidx.compose.ui.node.a aVarY = t1.g.y(pVar);
        androidx.compose.ui.node.a aVarY2 = t1.g.y(pVar2);
        if (d7.a.d(aVarY, aVarY2)) {
            return 0;
        }
        Object[] objArrCopyOf = new androidx.compose.ui.node.a[16];
        int i11 = 0;
        while (aVarY != null) {
            int i12 = i11 + 1;
            if (objArrCopyOf.length < i12) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, Math.max(i12, objArrCopyOf.length * 2));
                d7.a.l(objArrCopyOf, "copyOf(this, newSize)");
            }
            if (i11 != 0) {
                b9.b.H(0 + 1, 0, i11, objArrCopyOf, objArrCopyOf);
            }
            objArrCopyOf[0] = aVarY;
            i11++;
            aVarY = aVarY.q();
        }
        Object[] objArrCopyOf2 = new androidx.compose.ui.node.a[16];
        int i13 = 0;
        while (aVarY2 != null) {
            int i14 = i13 + 1;
            if (objArrCopyOf2.length < i14) {
                objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, Math.max(i14, objArrCopyOf2.length * 2));
                d7.a.l(objArrCopyOf2, "copyOf(this, newSize)");
            }
            if (i13 != 0) {
                b9.b.H(0 + 1, 0, i13, objArrCopyOf2, objArrCopyOf2);
            }
            objArrCopyOf2[0] = aVarY2;
            i13++;
            aVarY2 = aVarY2.q();
        }
        int iMin = Math.min(i11 - 1, i13 - 1);
        if (iMin >= 0) {
            while (d7.a.d(objArrCopyOf[i10], objArrCopyOf2[i10])) {
                if (i10 != iMin) {
                    i10++;
                }
            }
            return d7.a.o(((androidx.compose.ui.node.a) objArrCopyOf[i10]).r(), ((androidx.compose.ui.node.a) objArrCopyOf2[i10]).r());
        }
        throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.".toString());
    }
}
