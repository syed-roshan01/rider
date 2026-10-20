package k;

import androidx.appcompat.view.menu.ActionMenuItemView;
import l.e1;

/* JADX INFO: loaded from: classes.dex */
public final class a extends e1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ ActionMenuItemView f8588q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f8588q = actionMenuItemView;
    }

    @Override // l.e1
    public final n b() {
        l.f fVar;
        b bVar = this.f8588q.f1438t;
        if (bVar == null || (fVar = ((l.g) bVar).f10738a.f10819z) == null) {
            return null;
        }
        return fVar.a();
    }

    @Override // l.e1
    public final boolean c() {
        n nVarB;
        ActionMenuItemView actionMenuItemView = this.f8588q;
        k kVar = actionMenuItemView.f1436r;
        return kVar != null && kVar.a(actionMenuItemView.f1433o) && (nVarB = b()) != null && nVarB.k();
    }
}
