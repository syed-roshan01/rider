package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.tasks.OnFailureListener;
import l.q;

/* JADX INFO: loaded from: classes.dex */
final class zzadv implements OnFailureListener {
    public zzadv(zzadt zzadtVar) {
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        zzadt.zza.b(q.x("SmsRetrieverClient failed to start: ", exc.getMessage()), new Object[0]);
    }
}
