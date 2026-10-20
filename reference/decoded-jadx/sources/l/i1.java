package l;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: classes.dex */
public final class i1 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10777b;

    public /* synthetic */ i1(Object obj, int i10) {
        this.f10776a = i10;
        this.f10777b = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
        t1 t1Var;
        int i11 = this.f10776a;
        Object obj = this.f10777b;
        switch (i11) {
            case 0:
                if (i10 != -1 && (t1Var = ((o1) obj).f10868c) != null) {
                    t1Var.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) obj).m(i10);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
