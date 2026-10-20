package o2;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;
import android.widget.Toast;
import com.auto.accept.data.model.CouponData;
import com.auto.accept.ui.viewmodel.MainViewModel;
import d5.p1;
import java.io.File;
import m0.d1;
import m0.f1;
import m0.g1;
import m0.l3;
import m0.s2;
import m0.w2;

/* JADX INFO: loaded from: classes.dex */
public final class f extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f12470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f12471f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, String str, g1 g1Var, d1 d1Var, f1 f1Var) {
        super(0);
        this.f12466a = 1;
        this.f12468c = context;
        this.f12467b = str;
        this.f12469d = g1Var;
        this.f12470e = d1Var;
        this.f12471f = f1Var;
    }

    @Override // c9.a
    public final /* bridge */ /* synthetic */ Object invoke() {
        q8.l lVar = q8.l.f13235a;
        switch (this.f12466a) {
            case 0:
                m7213invoke();
                break;
            case 1:
                m7213invoke();
                break;
            default:
                m7213invoke();
                break;
        }
        return lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        super(0);
        this.f12466a = i10;
        this.f12468c = obj;
        this.f12469d = obj2;
        this.f12470e = obj3;
        this.f12467b = obj4;
        this.f12471f = obj5;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m7213invoke() {
        long jEnqueue;
        int i10 = this.f12466a;
        Object obj = this.f12469d;
        Object obj2 = this.f12471f;
        Object obj3 = this.f12467b;
        Object obj4 = this.f12468c;
        Object obj5 = this.f12470e;
        switch (i10) {
            case 0:
                ((r) obj4).i((c9.a) obj, (u) obj5, (String) obj3, (m2.l) obj2);
                break;
            case 1:
                g1 g1Var = (g1) obj;
                if (!((Boolean) g1Var.getValue()).booleanValue()) {
                    g1Var.setValue(Boolean.TRUE);
                    ((s2) ((d1) obj5)).f(0.0f);
                    f1 f1Var = (f1) obj2;
                    Context context = (Context) obj4;
                    String str = (String) obj3;
                    try {
                        File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);
                        if (externalFilesDir == null) {
                            externalFilesDir = context.getFilesDir();
                        }
                        File file = new File(externalFilesDir, "updates");
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        File file2 = new File(file, "AutoAccept-update.apk");
                        if (file2.exists()) {
                            file2.delete();
                        }
                        DownloadManager.Request allowedOverRoaming = new DownloadManager.Request(Uri.parse(str)).setTitle("Ride Accepter Update").setDescription("Downloading latest version...").setNotificationVisibility(1).setDestinationUri(Uri.fromFile(file2)).setAllowedOverMetered(true).setAllowedOverRoaming(true);
                        Object systemService = context.getSystemService("download");
                        d7.a.k(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
                        jEnqueue = ((DownloadManager) systemService).enqueue(allowedOverRoaming);
                    } catch (Exception e4) {
                        Log.e("ForceUpdateScreen", "Download error: " + e4.getMessage());
                        Toast.makeText(context, "Download failed: " + e4.getMessage(), 1).show();
                        jEnqueue = -1;
                    }
                    ((w2) f1Var).f(jEnqueue);
                }
                break;
            default:
                p1 p1Var = (p1) obj4;
                ((g1) obj5).setValue(p1Var.f4719a);
                if (((CouponData) ((l3) obj3).getValue()) != null) {
                    g1 g1Var2 = (g1) obj2;
                    if (!l9.i.R0((String) g1Var2.getValue())) {
                        ((MainViewModel) obj).u(l9.i.o1((String) g1Var2.getValue()).toString(), p1Var.f4719a);
                    }
                }
                break;
        }
    }
}
