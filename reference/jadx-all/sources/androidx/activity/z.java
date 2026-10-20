package androidx.activity;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class z extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f1432b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(i0 i0Var, int i10) {
        super(1);
        this.f1431a = i10;
        this.f1432b = i0Var;
    }

    public final void a(b bVar) {
        int i10 = this.f1431a;
        Object obj = null;
        i0 i0Var = this.f1432b;
        switch (i10) {
            case 0:
                d7.a.m(bVar, "backEvent");
                r8.l lVar = i0Var.f1395b;
                ListIterator listIterator = lVar.listIterator(lVar.e());
                while (listIterator.hasPrevious()) {
                    Object objPrevious = listIterator.previous();
                    if (((y) objPrevious).f1428a) {
                        obj = objPrevious;
                        i0Var.f1396c = (y) obj;
                        break;
                    }
                }
                i0Var.f1396c = (y) obj;
                break;
            default:
                d7.a.m(bVar, "backEvent");
                if (i0Var.f1396c == null) {
                    r8.l lVar2 = i0Var.f1395b;
                    ListIterator listIterator2 = lVar2.listIterator(lVar2.e());
                    while (listIterator2.hasPrevious()) {
                        Object objPrevious2 = listIterator2.previous();
                        if (((y) objPrevious2).f1428a) {
                            obj = objPrevious2;
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // c9.c
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        q8.l lVar = q8.l.f13235a;
        switch (this.f1431a) {
            case 0:
                a((b) obj);
                break;
            default:
                a((b) obj);
                break;
        }
        return lVar;
    }
}
