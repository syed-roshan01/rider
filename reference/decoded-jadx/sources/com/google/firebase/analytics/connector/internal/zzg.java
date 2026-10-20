package com.google.firebase.analytics.connector.internal;

import com.google.firebase.analytics.connector.AnalyticsConnector;
import j6.a;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zzg implements zza {
    private AnalyticsConnector.AnalyticsConnectorListener zza;
    private a zzb;
    private zzf zzc;

    public zzg(a aVar, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        this.zza = analyticsConnectorListener;
        this.zzb = aVar;
        zzf zzfVar = new zzf(this);
        this.zzc = zzfVar;
        this.zzb.f8391a.zza(zzfVar);
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final AnalyticsConnector.AnalyticsConnectorListener zza() {
        return this.zza;
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zzb() {
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zza(Set<String> set) {
    }
}
