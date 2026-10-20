package com.ride.accepter.overlay;

import android.app.Service;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PixelFormat;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

/**
 * Two working controls drawn over the app's decorative service switch:
 *
 *   TOP  - ENGINE  : auto-accept service on/off
 *   BELOW- DETECT  : detect-only mode (logs what it would accept, taps nothing)
 *
 * The shipped Compose switch has an empty onValueChange lambda so it can never
 * drive anything; these supply real buttons in the same place. Visible only
 * while this app is in the foreground. Tap = toggle, long-press = hide.
 */
public class ToggleOverlayService extends Service {

    private static final String TAG = "RideToggle";
    private static final String ENGINE = "com.auto.accept.service.RideAcceptorService";
    private static final String MY_PKG = "com.ride.accepter";

    private WindowManager windowManager;
    private Handler handler;

    private TextView engineBtn;
    private TextView detectBtn;
    private boolean attached = false;
    private boolean hidden = false;
    private boolean engineOn = false;
    private boolean detectOn = true;   // safe default: log, don't tap

    @Override
    public void onCreate() {
        super.onCreate();
        windowManager = (WindowManager) getSystemService(WINDOW_SERVICE);
        handler = new Handler(Looper.getMainLooper());

        engineBtn = makeButton(0);
        detectBtn = makeButton(1);

        handler.post(poller);
        Log.d(TAG, "toggle service started");
    }

    /** Which column of controls: 0 = engine (top), 1 = detect (below). */
    private TextView makeButton(final int which) {
        TextView tv = new TextView(this);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(11f);
        tv.setTextColor(Color.WHITE);
        tv.setOnTouchListener(new View.OnTouchListener() {
            private long downAt = 0;

            @Override
            public boolean onTouch(View v, MotionEvent e) {
                if (e.getAction() == MotionEvent.ACTION_DOWN) {
                    downAt = System.currentTimeMillis();
                    return true;
                }
                if (e.getAction() == MotionEvent.ACTION_UP) {
                    if (System.currentTimeMillis() - downAt > 600) {
                        hidden = true;
                        show(false);
                        Log.d(TAG, "buttons hidden (long-press)");
                    } else if (which == 0) {
                        engineOn = !engineOn;
                        call("setServiceEnabled", boolean.class, engineOn);
                    } else {
                        detectOn = !detectOn;
                        call("setDetectOnly", boolean.class, detectOn);
                    }
                    paint();
                    return true;
                }
                return true;
            }
        });
        return tv;
    }

    private final Runnable poller = new Runnable() {
        @Override
        public void run() {
            show(!hidden && MY_PKG.equals(currentForeground()));
            handler.postDelayed(this, 500);
        }
    };

    private String currentForeground() {
        try {
            Object r = Class.forName(ENGINE).getField("foregroundPackage").get(null);
            return r == null ? null : r.toString();
        } catch (Throwable t) {
            return null;
        }
    }

    private void call(String name, Class<?> sig, boolean value) {
        try {
            Class.forName(ENGINE).getMethod(name, sig).invoke(null, value);
        } catch (Throwable t) {
            Log.d(TAG, name + " failed: " + t);
        }
    }

    private void show(boolean visible) {
        if (visible && !attached) {
            try {
                windowManager.addView(engineBtn, layout(0));
                windowManager.addView(detectBtn, layout(1));
                attached = true;
            } catch (Throwable ignored) {}
        } else if (!visible && attached) {
            try { windowManager.removeView(engineBtn); } catch (Throwable ignored) {}
            try { windowManager.removeView(detectBtn); } catch (Throwable ignored) {}
            attached = false;
        }
        if (attached) paint();
    }

    /** 0 = over the switch [859,662][996,788]; 1 = directly below it. */
    private WindowManager.LayoutParams layout(int which) {
        float d = getResources().getDisplayMetrics().density;
        int type = (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
                ? WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY
                : WindowManager.LayoutParams.TYPE_PHONE;
        WindowManager.LayoutParams p = new WindowManager.LayoutParams(
                Math.round(50f * d), Math.round(30f * d), type,
                WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE
                        | WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL,
                PixelFormat.TRANSLUCENT);
        p.gravity = Gravity.TOP | Gravity.START;
        p.x = Math.round(312f * d);
        p.y = Math.round((which == 0 ? 245f : 278f) * d);
        return p;
    }

    private void paint() {
        engineBtn.setText(engineOn ? "ENGINE" : "engine");
        engineBtn.setBackgroundColor(engineOn ? 0xCC2E7D32 : 0xCC616161);
        detectBtn.setText(detectOn ? "DETECT" : "detect");
        detectBtn.setBackgroundColor(detectOn ? 0xCC1565C0 : 0xCC616161);
    }

    @Override
    public void onDestroy() {
        if (handler != null) handler.removeCallbacksAndMessages(null);
        show(false);
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
