package z5;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import androidx.fragment.app.g0;
import androidx.fragment.app.x0;

/* JADX INFO: loaded from: classes.dex */
public final class e extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f17250c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f17251d = new e();

    public static AlertDialog e(Context context, int i10, com.google.android.gms.common.internal.y yVar, DialogInterface.OnCancelListener onCancelListener) {
        String string;
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(com.google.android.gms.common.internal.v.b(context, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = context.getResources();
        if (i10 == 1) {
            string = resources.getString(com.ride.accepter.R.string.common_google_play_services_install_button);
        } else if (i10 != 2) {
            string = i10 != 3 ? resources.getString(R.string.ok) : resources.getString(com.ride.accepter.R.string.common_google_play_services_enable_button);
        } else {
            string = resources.getString(com.ride.accepter.R.string.common_google_play_services_update_button);
        }
        if (string != null) {
            builder.setPositiveButton(string, yVar);
        }
        String strC = com.google.android.gms.common.internal.v.c(context, i10);
        if (strC != null) {
            builder.setTitle(strC);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i10)), new IllegalArgumentException());
        return builder.create();
    }

    public static void f(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof g0) {
                x0 supportFragmentManager = ((g0) activity).getSupportFragmentManager();
                l lVar = new l();
                if (alertDialog == null) {
                    throw new NullPointerException("Cannot display null dialog");
                }
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                lVar.f17262v = alertDialog;
                if (onCancelListener != null) {
                    lVar.f17263w = onCancelListener;
                }
                lVar.f2012s = false;
                lVar.f2013t = true;
                supportFragmentManager.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                aVar.f1846o = true;
                aVar.e(0, lVar, str);
                aVar.d(false);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        c cVar = new c();
        if (alertDialog == null) {
            throw new NullPointerException("Cannot display null dialog");
        }
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        cVar.f17244a = alertDialog;
        if (onCancelListener != null) {
            cVar.f17245b = onCancelListener;
        }
        cVar.show(fragmentManager, str);
    }

    @Override // z5.f
    public final Intent a(int i10, Context context, String str) {
        return super.a(i10, context, str);
    }

    @Override // z5.f
    public final int b(Context context) {
        return super.c(context, f.f17252a);
    }

    @Override // z5.f
    public final int c(Context context, int i10) {
        return super.c(context, i10);
    }

    public final void d(Activity activity, int i10, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogE = e(activity, i10, new com.google.android.gms.common.internal.w(activity, super.a(i10, activity, "d")), onCancelListener);
        if (alertDialogE == null) {
            return;
        }
        f(activity, alertDialogE, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    public final void g(Context context, int i10, PendingIntent pendingIntent) {
        int i11;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i10), null), new IllegalArgumentException());
        if (i10 == 18) {
            new m(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i10 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = i10 == 6 ? com.google.android.gms.common.internal.v.e(context, "common_google_play_services_resolution_required_title") : com.google.android.gms.common.internal.v.c(context, i10);
        if (strE == null) {
            strE = context.getResources().getString(com.ride.accepter.R.string.common_google_play_services_notification_ticker);
        }
        String strD = (i10 == 6 || i10 == 19) ? com.google.android.gms.common.internal.v.d(context, "common_google_play_services_resolution_required_text", com.google.android.gms.common.internal.v.a(context)) : com.google.android.gms.common.internal.v.b(context, i10);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        f6.a.x(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        q2.x xVar = new q2.x(context, null);
        xVar.f13114m = true;
        xVar.c(16, true);
        xVar.f13106e = q2.x.b(strE);
        q2.v vVar = new q2.v();
        vVar.f13101b = q2.x.b(strD);
        xVar.e(vVar);
        PackageManager packageManager = context.getPackageManager();
        if (y3.e.f16904k == null) {
            y3.e.f16904k = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (y3.e.f16904k.booleanValue()) {
            xVar.f13121t.icon = context.getApplicationInfo().icon;
            xVar.f13111j = 2;
            if (y3.e.m0(context)) {
                xVar.f13103b.add(new q2.p(resources.getString(com.ride.accepter.R.string.common_open_on_phone), pendingIntent));
            } else {
                xVar.f13108g = pendingIntent;
            }
        } else {
            xVar.f13121t.icon = R.drawable.stat_sys_warning;
            xVar.f13121t.tickerText = q2.x.b(resources.getString(com.ride.accepter.R.string.common_google_play_services_notification_ticker));
            xVar.f13121t.when = System.currentTimeMillis();
            xVar.f13108g = pendingIntent;
            xVar.f13107f = q2.x.b(strD);
        }
        synchronized (f17250c) {
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string = context.getResources().getString(com.ride.accepter.R.string.common_google_play_services_notification_channel_name);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
        } else if (!string.contentEquals(notificationChannel.getName())) {
            notificationChannel.setName(string);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        xVar.f13119r = "com.google.android.gms.availability";
        Notification notificationA = xVar.a();
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            j.f17255a.set(false);
            i11 = 10436;
        } else {
            i11 = 39789;
        }
        notificationManager.notify(i11, notificationA);
    }

    public final void h(Activity activity, com.google.android.gms.common.api.internal.j jVar, int i10, com.google.android.gms.common.api.internal.x xVar) {
        AlertDialog alertDialogE = e(activity, i10, new com.google.android.gms.common.internal.x(super.a(i10, activity, "d"), jVar), xVar);
        if (alertDialogE == null) {
            return;
        }
        f(activity, alertDialogE, "GooglePlayServicesErrorDialog", xVar);
    }
}
