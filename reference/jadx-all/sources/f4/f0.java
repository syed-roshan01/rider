package f4;

import android.view.View;
import android.view.ViewGroup;
import com.ride.accepter.R;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f6159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f6160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f6161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f6162d;

    public f0(h hVar, ViewGroup viewGroup, View view, View view2) {
        this.f6162d = hVar;
        this.f6159a = viewGroup;
        this.f6160b = view;
        this.f6161c = view2;
    }

    @Override // f4.r, f4.p
    public final void b() {
        this.f6159a.getOverlay().remove(this.f6160b);
    }

    @Override // f4.p
    public final void c(q qVar) {
        this.f6161c.setTag(R.id.save_overlay_view, null);
        this.f6159a.getOverlay().remove(this.f6160b);
        qVar.w(this);
    }

    @Override // f4.r, f4.p
    public final void d() {
        View view = this.f6160b;
        if (view.getParent() == null) {
            this.f6159a.getOverlay().add(view);
        } else {
            this.f6162d.d();
        }
    }
}
