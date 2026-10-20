package q2;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.ride.accepter.R;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f13090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IconCompat f13091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f13092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f13093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13094e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CharSequence f13095f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PendingIntent f13096g;

    public p(String str, PendingIntent pendingIntent) {
        IconCompat iconCompatA = IconCompat.a(R.drawable.common_full_open_on_phone);
        Bundle bundle = new Bundle();
        this.f13093d = true;
        this.f13091b = iconCompatA;
        if (iconCompatA.c() == 2) {
            this.f13094e = iconCompatA.b();
        }
        this.f13095f = x.b(str);
        this.f13096g = pendingIntent;
        this.f13090a = bundle;
        this.f13092c = true;
        this.f13093d = true;
    }
}
