package c5;

import android.content.Context;
import com.auto.accept.ui.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class d implements c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f2977a;

    public d(MainActivity mainActivity) {
        this.f2977a = mainActivity;
    }

    @Override // c.b
    public final void a(Context context) {
        e eVar = this.f2977a;
        if (eVar.f2981d) {
            return;
        }
        eVar.f2981d = true;
        x xVar = (x) eVar.generatedComponent();
        xVar.getClass();
    }
}
