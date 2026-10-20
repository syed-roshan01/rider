package a2;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Appendable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f906a = new StringBuilder(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f907b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f908c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f909d = new ArrayList();

    public c(e eVar) {
        new ArrayList();
        b(eVar);
    }

    public final void a(x xVar, int i10, int i11) {
        this.f907b.add(new b(xVar, i10, i11));
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof e) {
            b((e) charSequence);
        } else {
            this.f906a.append(charSequence);
        }
        return this;
    }

    public final void b(e eVar) {
        StringBuilder sb = this.f906a;
        int length = sb.length();
        sb.append(eVar.f918a);
        List list = eVar.f919b;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) list.get(i10);
                a((x) dVar.f914a, dVar.f915b + length, dVar.f916c + length);
            }
        }
        List list2 = eVar.f920c;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                d dVar2 = (d) list2.get(i11);
                this.f908c.add(new b((p) dVar2.f914a, dVar2.f915b + length, dVar2.f916c + length));
            }
        }
        List list3 = eVar.f921d;
        if (list3 != null) {
            int size3 = list3.size();
            for (int i12 = 0; i12 < size3; i12++) {
                d dVar3 = (d) list3.get(i12);
                this.f909d.add(new b(dVar3.f914a, dVar3.f915b + length, dVar3.f916c + length, dVar3.f917d));
            }
        }
    }

    public final e c() {
        StringBuilder sb = this.f906a;
        String string = sb.toString();
        ArrayList arrayList = this.f907b;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(((b) arrayList.get(i10)).a(sb.length()));
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = null;
        }
        ArrayList arrayList3 = this.f908c;
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        for (int i11 = 0; i11 < size2; i11++) {
            arrayList4.add(((b) arrayList3.get(i11)).a(sb.length()));
        }
        if (arrayList4.isEmpty()) {
            arrayList4 = null;
        }
        ArrayList arrayList5 = this.f909d;
        ArrayList arrayList6 = new ArrayList(arrayList5.size());
        int size3 = arrayList5.size();
        for (int i12 = 0; i12 < size3; i12++) {
            arrayList6.add(((b) arrayList5.get(i12)).a(sb.length()));
        }
        return new e(string, arrayList2, arrayList4, arrayList6.isEmpty() ? null : arrayList6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i10, int i11) {
        ?? arrayList;
        ?? arrayList2;
        boolean z10 = charSequence instanceof e;
        StringBuilder sb = this.f906a;
        if (z10) {
            e eVar = (e) charSequence;
            int length = sb.length();
            sb.append((CharSequence) eVar.f918a, i10, i11);
            List listB = f.b(eVar, i10, i11);
            if (listB != null) {
                int size = listB.size();
                for (int i12 = 0; i12 < size; i12++) {
                    d dVar = (d) listB.get(i12);
                    a((x) dVar.f914a, dVar.f915b + length, dVar.f916c + length);
                }
            }
            ?? r10 = 0;
            r10 = 0;
            String str = eVar.f918a;
            if (i10 == i11 || (arrayList = eVar.f920c) == 0) {
                arrayList = 0;
            } else if (i10 != 0 || i11 < str.length()) {
                ArrayList arrayList3 = new ArrayList(arrayList.size());
                int size2 = arrayList.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    Object obj = arrayList.get(i13);
                    d dVar2 = (d) obj;
                    if (f.c(i10, i11, dVar2.f915b, dVar2.f916c)) {
                        arrayList3.add(obj);
                    }
                }
                arrayList = new ArrayList(arrayList3.size());
                int size3 = arrayList3.size();
                for (int i14 = 0; i14 < size3; i14++) {
                    d dVar3 = (d) arrayList3.get(i14);
                    arrayList.add(new d(dVar3.f914a, z6.a.r(dVar3.f915b, i10, i11) - i10, z6.a.r(dVar3.f916c, i10, i11) - i10));
                }
            }
            if (arrayList != 0) {
                int size4 = arrayList.size();
                for (int i15 = 0; i15 < size4; i15++) {
                    d dVar4 = (d) arrayList.get(i15);
                    this.f908c.add(new b((p) dVar4.f914a, dVar4.f915b + length, dVar4.f916c + length));
                }
            }
            if (i10 != i11 && (arrayList2 = eVar.f921d) != 0) {
                if (i10 != 0 || i11 < str.length()) {
                    ArrayList arrayList4 = new ArrayList(arrayList2.size());
                    int size5 = arrayList2.size();
                    for (int i16 = 0; i16 < size5; i16++) {
                        Object obj2 = arrayList2.get(i16);
                        d dVar5 = (d) obj2;
                        if (f.c(i10, i11, dVar5.f915b, dVar5.f916c)) {
                            arrayList4.add(obj2);
                        }
                    }
                    arrayList2 = new ArrayList(arrayList4.size());
                    int size6 = arrayList4.size();
                    for (int i17 = 0; i17 < size6; i17++) {
                        d dVar6 = (d) arrayList4.get(i17);
                        arrayList2.add(new d(dVar6.f914a, z6.a.r(dVar6.f915b, i10, i11) - i10, z6.a.r(dVar6.f916c, i10, i11) - i10, dVar6.f917d));
                    }
                }
                r10 = arrayList2;
            }
            if (r10 != 0) {
                int size7 = r10.size();
                for (int i18 = 0; i18 < size7; i18++) {
                    d dVar7 = (d) r10.get(i18);
                    this.f909d.add(new b(dVar7.f914a, dVar7.f915b + length, dVar7.f916c + length, dVar7.f917d));
                }
            }
        } else {
            sb.append(charSequence, i10, i11);
        }
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c10) {
        this.f906a.append(c10);
        return this;
    }
}
