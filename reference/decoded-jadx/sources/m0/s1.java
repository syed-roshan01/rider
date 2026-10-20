package m0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f11702a = new ArrayList();

    public final void a(int i10) {
        List list = this.f11702a;
        if ((!list.isEmpty()) && (((Number) list.get(0)).intValue() == i10 || ((Number) list.get(list.size() - 1)).intValue() == i10)) {
            return;
        }
        int size = list.size();
        list.add(Integer.valueOf(i10));
        while (size > 0) {
            int i11 = ((size + 1) >>> 1) - 1;
            int iIntValue = ((Number) list.get(i11)).intValue();
            if (i10 <= iIntValue) {
                break;
            }
            list.set(size, Integer.valueOf(iIntValue));
            size = i11;
        }
        list.set(size, Integer.valueOf(i10));
    }

    public final int b() {
        int iIntValue;
        List list = this.f11702a;
        if (list.size() <= 0) {
            s.g("Set is empty".toString());
            throw null;
        }
        int iIntValue2 = ((Number) list.get(0)).intValue();
        while ((!list.isEmpty()) && ((Number) list.get(0)).intValue() == iIntValue2) {
            list.set(0, r8.p.L0(list));
            list.remove(list.size() - 1);
            int size = list.size();
            int size2 = list.size() >>> 1;
            int i10 = 0;
            while (i10 < size2) {
                int iIntValue3 = ((Number) list.get(i10)).intValue();
                int i11 = (i10 + 1) * 2;
                int i12 = i11 - 1;
                int iIntValue4 = ((Number) list.get(i12)).intValue();
                if (i11 < size && (iIntValue = ((Number) list.get(i11)).intValue()) > iIntValue4) {
                    if (iIntValue <= iIntValue3) {
                        break;
                    }
                    list.set(i10, Integer.valueOf(iIntValue));
                    list.set(i11, Integer.valueOf(iIntValue3));
                    i10 = i11;
                } else {
                    if (iIntValue4 <= iIntValue3) {
                        break;
                    }
                    list.set(i10, Integer.valueOf(iIntValue4));
                    list.set(i12, Integer.valueOf(iIntValue3));
                    i10 = i12;
                }
            }
        }
        return iIntValue2;
    }
}
