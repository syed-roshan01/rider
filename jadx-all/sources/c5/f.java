package c5;

import android.widget.Toast;
import com.auto.accept.ui.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f2982a;

    public final void a(int i10) {
        int i11 = MainActivity.f3077n;
        MainActivity mainActivity = this.f2982a;
        d7.a.m(mainActivity, "this$0");
        if (i10 == 0) {
            Toast.makeText(mainActivity, "Shizuku Permission Granted ✓", 0).show();
        } else {
            Toast.makeText(mainActivity, "Shizuku Permission Denied ✗", 0).show();
        }
    }
}
