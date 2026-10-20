package b5;

import android.content.SharedPreferences;
import android.widget.TextView;
import com.auto.accept.service.OverlayService;
import o1.s;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OverlayService f2719b;

    public /* synthetic */ f(OverlayService overlayService, int i10) {
        this.f2718a = i10;
        this.f2719b = overlayService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f2718a;
        OverlayService overlayService = this.f2719b;
        switch (i10) {
            case 0:
                int i11 = r4.h.f13468c;
                d7.a.m(overlayService, "this$0");
                TextView textViewM1487 = OverlayService.m1487(overlayService);
                if (textViewM1487 != null) {
                    textViewM1487.setVisibility(8);
                    break;
                }
                break;
            default:
                int i12 = r4.h.f13468c;
                d7.a.m(overlayService, "this$0");
                TextView textViewM1488 = OverlayService.m1487(overlayService);
                if (textViewM1488 != null) {
                    textViewM1488.setText("⚠ No Internet");
                }
                TextView textViewM1489 = OverlayService.m1487(overlayService);
                if (textViewM1489 != null) {
                    textViewM1489.setVisibility(0);
                }
                SharedPreferences sharedPreferencesD = s.D(overlayService);
                if (sharedPreferencesD.getBoolean("service_enabled", false)) {
                    sharedPreferencesD.edit().putBoolean("service_enabled", false).apply();
                    OverlayService.access$updateStatusDisplay(overlayService, false);
                }
                break;
        }
    }
}
