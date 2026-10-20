package l;

import android.database.DataSetObserver;

/* JADX INFO: loaded from: classes.dex */
public final class l1 extends DataSetObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10822b;

    public /* synthetic */ l1(Object obj, int i10) {
        this.f10821a = i10;
        this.f10822b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        int i10 = this.f10821a;
        Object obj = this.f10822b;
        switch (i10) {
            case 0:
                o1 o1Var = (o1) obj;
                if (o1Var.C.isShowing()) {
                    o1Var.e();
                }
                break;
            default:
                f3.a aVar = (f3.a) obj;
                aVar.f6136a = true;
                aVar.notifyDataSetChanged();
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        int i10 = this.f10821a;
        Object obj = this.f10822b;
        switch (i10) {
            case 0:
                ((o1) obj).dismiss();
                break;
            default:
                f3.a aVar = (f3.a) obj;
                aVar.f6136a = false;
                aVar.notifyDataSetInvalidated();
                break;
        }
    }
}
