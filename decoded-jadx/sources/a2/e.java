package a2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e implements CharSequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f921d;

    public e(String str, List list, List list2, List list3) {
        this.f918a = str;
        this.f919b = list;
        this.f920c = list2;
        this.f921d = list3;
        if (list2 != null) {
            List listR0 = r8.p.R0(list2, new t1.p(1));
            int size = listR0.size();
            int i10 = -1;
            int i11 = 0;
            while (i11 < size) {
                d dVar = (d) listR0.get(i11);
                if (dVar.f915b < i10) {
                    throw new IllegalArgumentException("ParagraphStyle should not overlap".toString());
                }
                int length = this.f918a.length();
                int i12 = dVar.f916c;
                if (i12 > length) {
                    throw new IllegalArgumentException(("ParagraphStyle range [" + dVar.f915b + ", " + i12 + ") is out of boundary").toString());
                }
                i11++;
                i10 = i12;
            }
        }
    }

    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final e subSequence(int i10, int i11) {
        if (i10 > i11) {
            throw new IllegalArgumentException(("start (" + i10 + ") should be less or equal to end (" + i11 + ')').toString());
        }
        String str = this.f918a;
        if (i10 == 0 && i11 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i10, i11);
        d7.a.l(strSubstring, "this as java.lang.String\u2026ing(startIndex, endIndex)");
        return new e(strSubstring, f.a(i10, i11, this.f919b), f.a(i10, i11, this.f920c), f.a(i10, i11, this.f921d));
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f918a.charAt(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return d7.a.d(this.f918a, eVar.f918a) && d7.a.d(this.f919b, eVar.f919b) && d7.a.d(this.f920c, eVar.f920c) && d7.a.d(this.f921d, eVar.f921d);
    }

    public final int hashCode() {
        int iHashCode = this.f918a.hashCode() * 31;
        List list = this.f919b;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        List list2 = this.f920c;
        int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List list3 = this.f921d;
        return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f918a.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f918a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e(String str, ArrayList arrayList, int i10) {
        int i11 = i10 & 2;
        r8.r rVar = r8.r.f13661a;
        Collection collection = i11 != 0 ? rVar : arrayList;
        rVar = (i10 & 4) == 0 ? null : rVar;
        Collection collection2 = collection;
        collection2 = collection2.isEmpty() ? null : collection2;
        rVar.isEmpty();
        this(str, (List) collection2, null, null);
    }
}
