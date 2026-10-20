package l;

import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: classes.dex */
public final class c3 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f10717a;

    public /* synthetic */ c3(Object obj) {
        this.f10717a = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        e3 e3Var = ((Toolbar) this.f10717a).R;
        k.m mVar = e3Var == null ? null : e3Var.f10732b;
        if (mVar != null) {
            mVar.collapseActionView();
        }
    }
}
