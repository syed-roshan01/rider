package t1;

import android.graphics.Rect;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class p implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14522a;

    public /* synthetic */ p(int i10) {
        this.f14522a = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        if (d7.a.o(r5, r6) < 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        if (r8 < r9) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d0, code lost:
    
        if (r0 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00dc, code lost:
    
        if (r0 != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return -1;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        switch (this.f14522a) {
            case 0:
                androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) obj;
                androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) obj2;
                int iO = d7.a.o(aVar.f1745q, aVar2.f1745q);
                return iO != 0 ? iO : d7.a.o(aVar.hashCode(), aVar2.hashCode());
            case 1:
                return d7.t.J(Integer.valueOf(((a2.d) obj).f915b), Integer.valueOf(((a2.d) obj2).f915b));
            case 2:
                a4.l lVar = (a4.l) obj;
                a4.l lVar2 = (a4.l) obj2;
                RecyclerView recyclerView = lVar.f1148d;
                if ((recyclerView == null) == (lVar2.f1148d == null)) {
                    boolean z10 = lVar.f1145a;
                    if (z10 == lVar2.f1145a) {
                        int i10 = lVar2.f1146b - lVar.f1146b;
                        if (i10 != 0) {
                            return i10;
                        }
                        int i11 = lVar.f1147c - lVar2.f1147c;
                        if (i11 != 0) {
                            return i11;
                        }
                        return 0;
                    }
                }
                break;
            case 3:
                return d7.t.J((Integer) ((q8.f) obj).f13226b, (Integer) ((q8.f) obj2).f13226b);
            case 4:
                Rect rect = new Rect();
                ((AccessibilityNodeInfo) obj).getBoundsInScreen(rect);
                Integer numValueOf = Integer.valueOf(rect.centerY());
                Rect rect2 = new Rect();
                ((AccessibilityNodeInfo) obj2).getBoundsInScreen(rect2);
                return d7.t.J(numValueOf, Integer.valueOf(rect2.centerY()));
            case 5:
                return d7.t.J((Integer) ((q8.f) obj).f13226b, (Integer) ((q8.f) obj2).f13226b);
            case 6:
                return d7.t.J((Integer) ((q8.f) obj).f13226b, (Integer) ((q8.f) obj2).f13226b);
            case 7:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 8:
                String str = (String) obj;
                String str2 = (String) obj2;
                d7.a.m(str, "a");
                d7.a.m(str2, "b");
                int iMin = Math.min(str.length(), str2.length());
                for (int i12 = 4; i12 < iMin; i12++) {
                    char cCharAt = str.charAt(i12);
                    char cCharAt2 = str2.charAt(i12);
                    if (cCharAt != cCharAt2) {
                    }
                    break;
                }
                int length = str.length();
                int length2 = str2.length();
                if (length == length2) {
                    return 0;
                }
                break;
            default:
                return d7.t.J(((ka.g) obj).f10669a, ((ka.g) obj2).f10669a);
        }
    }
}
