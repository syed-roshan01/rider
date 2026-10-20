package b5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import com.auto.accept.service.OverlayService;

/* JADX INFO: loaded from: classes.dex */
public final class e extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OverlayService f2717a;

    public e(OverlayService overlayService) {
        this.f2717a = overlayService;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (action != null) {
            int iHashCode = action.hashCode();
            OverlayService overlayService = this.f2717a;
            if (iHashCode != -481570369) {
                if (iHashCode == 1741226000 && action.equals("com.auto.accept.SERVICE_STATUS")) {
                    OverlayService.access$updateStatusDisplay(overlayService, intent.getBooleanExtra("is_active", false));
                    return;
                }
                return;
            }
            if (action.equals("com.auto.accept.FARE_DETECTED")) {
                int intExtra = intent.getIntExtra("fare_amount", 0);
                boolean booleanExtra = intent.getBooleanExtra("accepted", false);
                TextView textViewM1485 = OverlayService.m1485(overlayService);
                if (textViewM1485 != null) {
                    textViewM1485.setText("\u20b9" + intExtra);
                }
                TextView textViewM1486 = OverlayService.m1485(overlayService);
                if (textViewM1486 != null) {
                    textViewM1486.setTextColor(booleanExtra ? -11751600 : -43230);
                }
            }
        }
    }
}
