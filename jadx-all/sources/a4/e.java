package a4;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class e extends a0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f1088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f1089f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f1090g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f1091h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f1092i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f1093j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f1094k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f1095l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f1096m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f1097n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f1098o;

    public static void c(ArrayList arrayList) {
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        a7.a.w(arrayList.get(size));
        throw null;
    }

    @Override // a4.a0
    public final void a() {
        ArrayList arrayList = this.f1090g;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            a7.a.w(arrayList.get(size));
            throw null;
        }
        ArrayList arrayList2 = this.f1088e;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            a7.a.w(arrayList2.get(size2));
            if (this.f1066a != null) {
                throw null;
            }
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f1089f;
        int size3 = arrayList3.size() - 1;
        if (size3 >= 0) {
            a7.a.w(arrayList3.get(size3));
            throw null;
        }
        ArrayList arrayList4 = this.f1091h;
        int size4 = arrayList4.size() - 1;
        if (size4 >= 0) {
            a7.a.w(arrayList4.get(size4));
            throw null;
        }
        arrayList4.clear();
        if (b()) {
            ArrayList arrayList5 = this.f1093j;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                int size6 = arrayList6.size() - 1;
                if (size6 >= 0) {
                    a7.a.w(arrayList6.get(size6));
                    throw null;
                }
            }
            ArrayList arrayList7 = this.f1092i;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                int size8 = arrayList8.size() - 1;
                if (size8 >= 0) {
                    a7.a.w(arrayList8.get(size8));
                    throw null;
                }
            }
            ArrayList arrayList9 = this.f1094k;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                int size10 = arrayList10.size() - 1;
                if (size10 >= 0) {
                    a7.a.w(arrayList10.get(size10));
                    throw null;
                }
            }
            c(this.f1097n);
            c(this.f1096m);
            c(this.f1095l);
            c(this.f1098o);
            ArrayList arrayList11 = this.f1067b;
            if (arrayList11.size() > 0) {
                a7.a.w(arrayList11.get(0));
                throw null;
            }
            arrayList11.clear();
        }
    }

    @Override // a4.a0
    public final boolean b() {
        return (this.f1089f.isEmpty() && this.f1091h.isEmpty() && this.f1090g.isEmpty() && this.f1088e.isEmpty() && this.f1096m.isEmpty() && this.f1097n.isEmpty() && this.f1095l.isEmpty() && this.f1098o.isEmpty() && this.f1093j.isEmpty() && this.f1092i.isEmpty() && this.f1094k.isEmpty()) ? false : true;
    }
}
