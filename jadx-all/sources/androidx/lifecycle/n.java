package androidx.lifecycle;

import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* JADX INFO: loaded from: classes.dex */
public final class n {
    public static p a(q qVar) {
        d7.a.m(qVar, RemoteConfigConstants.ResponseFieldKey.STATE);
        int iOrdinal = qVar.ordinal();
        if (iOrdinal == 2) {
            return p.ON_DESTROY;
        }
        if (iOrdinal == 3) {
            return p.ON_STOP;
        }
        if (iOrdinal != 4) {
            return null;
        }
        return p.ON_PAUSE;
    }

    public static p b(q qVar) {
        d7.a.m(qVar, RemoteConfigConstants.ResponseFieldKey.STATE);
        int iOrdinal = qVar.ordinal();
        if (iOrdinal == 1) {
            return p.ON_CREATE;
        }
        if (iOrdinal == 2) {
            return p.ON_START;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return p.ON_RESUME;
    }
}
