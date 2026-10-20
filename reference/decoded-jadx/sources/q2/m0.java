package q2;

import android.app.NotificationManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class m0 {
    public static boolean a(NotificationManager notificationManager) {
        return notificationManager.areNotificationsEnabled();
    }

    public static int b(NotificationManager notificationManager) {
        return notificationManager.getImportance();
    }
}
