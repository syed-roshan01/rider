package z;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0.u f17074b;

    public /* synthetic */ i(a0.u uVar, int i10) {
        this.f17073a = i10;
        this.f17074b = uVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10 = this.f17073a;
        a0.u uVar = this.f17074b;
        switch (i10) {
            case 0:
                return d7.t.J(Integer.valueOf(uVar.b(((x) obj).f17170j)), Integer.valueOf(uVar.b(((x) obj2).f17170j)));
            case 1:
                return d7.t.J(Integer.valueOf(uVar.b(((x) obj).f17170j)), Integer.valueOf(uVar.b(((x) obj2).f17170j)));
            case 2:
                return d7.t.J(Integer.valueOf(uVar.b(((x) obj2).f17170j)), Integer.valueOf(uVar.b(((x) obj).f17170j)));
            default:
                return d7.t.J(Integer.valueOf(uVar.b(((x) obj2).f17170j)), Integer.valueOf(uVar.b(((x) obj).f17170j)));
        }
    }
}
