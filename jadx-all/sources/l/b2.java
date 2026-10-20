package l;

import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: classes.dex */
public final class b2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f10712b;

    public /* synthetic */ b2(SearchView searchView, int i10) {
        this.f10711a = i10;
        this.f10712b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f10711a;
        SearchView searchView = this.f10712b;
        switch (i10) {
            case 0:
                searchView.q();
                break;
            default:
                f3.a aVar = searchView.V;
                if (aVar instanceof n2) {
                    aVar.b(null);
                }
                break;
        }
    }
}
