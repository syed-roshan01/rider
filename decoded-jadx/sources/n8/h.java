package n8;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class h extends r6.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f12273a = new HashMap();

    public final double b() {
        HashMap map = this.f12273a;
        if (map.isEmpty()) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        Iterator it = map.values().iterator();
        int i10 = 0;
        int i11 = 0;
        while (it.hasNext()) {
            i11++;
            if (((g) it.next()).e()) {
                i10++;
            }
        }
        return (((double) i10) / ((double) i11)) * 100.0d;
    }
}
