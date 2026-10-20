package s3;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IntentFilter f13916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BroadcastReceiver f13917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13919d;

    public b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.f13916a = intentFilter;
        this.f13917b = broadcastReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("Receiver{");
        sb.append(this.f13917b);
        sb.append(" filter=");
        sb.append(this.f13916a);
        if (this.f13919d) {
            sb.append(" DEAD");
        }
        sb.append("}");
        return sb.toString();
    }
}
