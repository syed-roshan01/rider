package com.ride.accepter.overlay;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public class ToggleOverlayService extends Service {
    private static final String ENGINE = "com.auto.accept.service.RideAcceptorService";
    private static final String TAG = "RideToggle";
    private static boolean enabled = false;
    private TextView button;
    private WindowManager windowManager;

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.windowManager = (WindowManager) getSystemService("window");
        this.button = new TextView(this);
        this.button.setGravity(17);
        this.button.setTextSize(13.0f);
        this.button.setTextColor(-1);
        float f10 = getResources().getDisplayMetrics().density;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(Math.round(52.0f * f10), Math.round(46.0f * f10), 2038, 40, -3);
        layoutParams.gravity = 8388659;
        layoutParams.x = Math.round(310.0f * f10);
        layoutParams.y = Math.round(f10 * 240.0f);
        this.button.setOnTouchListener(new View.OnTouchListener() { // from class: com.ride.accepter.overlay.ToggleOverlayService.1
            private long downAt = 0;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    this.downAt = System.currentTimeMillis();
                    return true;
                }
                if (motionEvent.getAction() != 1) {
                    return true;
                }
                if (System.currentTimeMillis() - this.downAt <= 600) {
                    boolean unused = ToggleOverlayService.enabled = !ToggleOverlayService.enabled;
                    ToggleOverlayService.this.push();
                } else {
                    ToggleOverlayService.this.stopSelf();
                }
                return true;
            }
        });
        this.windowManager.addView(this.button, layoutParams);
        push();
        Log.d(TAG, "overlay toggle attached, enabled=" + enabled);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void push() {
        this.button.setText(enabled ? "ON" : "OFF");
        this.button.setBackgroundColor(enabled ? -869368526 : -866033311);
        try {
            Class.forName(ENGINE).getMethod("setServiceEnabled", Boolean.TYPE).invoke(null, Boolean.valueOf(enabled));
        } catch (Throwable th) {
            Log.d(TAG, "push failed: " + th);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        if (this.button != null) {
            try {
                this.windowManager.removeView(this.button);
            } catch (Exception e4) {
            }
            this.button = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }
}
