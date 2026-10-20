package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import g6.a;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzcw extends zzbu implements zzcu {
    public zzcw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void beginAdUnitExposure(String str, long j10) {
        Parcel parcelA_ = a_();
        parcelA_.writeString(str);
        parcelA_.writeLong(j10);
        zzb(23, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelA_ = a_();
        parcelA_.writeString(str);
        parcelA_.writeString(str2);
        zzbw.zza(parcelA_, bundle);
        zzb(9, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void clearMeasurementEnabled(long j10) {
        Parcel parcelA_ = a_();
        parcelA_.writeLong(j10);
        zzb(43, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void endAdUnitExposure(String str, long j10) {
        Parcel parcelA_ = a_();
        parcelA_.writeString(str);
        parcelA_.writeLong(j10);
        zzb(24, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void generateEventId(zzcv zzcvVar) {
        Parcel parcelA_ = a_();
        zzbw.zza(parcelA_, zzcvVar);
        zzb(22, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void getAppInstanceId(zzcv zzcvVar) {
        Parcel parcelA_ = a_();
        zzbw.zza(parcelA_, zzcvVar);
        zzb(20, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void getCachedAppInstanceId(zzcv zzcvVar) {
        Parcel parcelA_ = a_();
        zzbw.zza(parcelA_, zzcvVar);
        zzb(19, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void getConditionalUserProperties(String str, String str2, zzcv zzcvVar) {
        Parcel parcelA_ = a_();
        parcelA_.writeString(str);
        parcelA_.writeString(str2);
        zzbw.zza(parcelA_, zzcvVar);
        zzb(10, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void getCurrentScreenClass(zzcv zzcvVar) {
        Parcel parcelA_ = a_();
        zzbw.zza(parcelA_, zzcvVar);
        zzb(17, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void getCurrentScreenName(zzcv zzcvVar) {
        Parcel parcelA_ = a_();
        zzbw.zza(parcelA_, zzcvVar);
        zzb(16, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void getGmpAppId(zzcv zzcvVar) {
        Parcel parcelA_ = a_();
        zzbw.zza(parcelA_, zzcvVar);
        zzb(21, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void getMaxUserProperties(String str, zzcv zzcvVar) {
        Parcel parcelA_ = a_();
        parcelA_.writeString(str);
        zzbw.zza(parcelA_, zzcvVar);
        zzb(6, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void getSessionId(zzcv zzcvVar) {
        Parcel parcelA_ = a_();
        zzbw.zza(parcelA_, zzcvVar);
        zzb(46, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void getTestFlag(zzcv zzcvVar, int i10) {
        Parcel parcelA_ = a_();
        zzbw.zza(parcelA_, zzcvVar);
        parcelA_.writeInt(i10);
        zzb(38, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void getUserProperties(String str, String str2, boolean z10, zzcv zzcvVar) {
        Parcel parcelA_ = a_();
        parcelA_.writeString(str);
        parcelA_.writeString(str2);
        zzbw.zza(parcelA_, z10);
        zzbw.zza(parcelA_, zzcvVar);
        zzb(5, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void initForTests(Map map) {
        Parcel parcelA_ = a_();
        parcelA_.writeMap(map);
        zzb(37, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void initialize(a aVar, zzdd zzddVar, long j10) {
        Parcel parcelA_ = a_();
        zzbw.zza(parcelA_, aVar);
        zzbw.zza(parcelA_, zzddVar);
        parcelA_.writeLong(j10);
        zzb(1, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void isDataCollectionEnabled(zzcv zzcvVar) {
        Parcel parcelA_ = a_();
        zzbw.zza(parcelA_, zzcvVar);
        zzb(40, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        Parcel parcelA_ = a_();
        parcelA_.writeString(str);
        parcelA_.writeString(str2);
        zzbw.zza(parcelA_, bundle);
        zzbw.zza(parcelA_, z10);
        zzbw.zza(parcelA_, z11);
        parcelA_.writeLong(j10);
        zzb(2, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void logEventAndBundle(String str, String str2, Bundle bundle, zzcv zzcvVar, long j10) {
        Parcel parcelA_ = a_();
        parcelA_.writeString(str);
        parcelA_.writeString(str2);
        zzbw.zza(parcelA_, bundle);
        zzbw.zza(parcelA_, zzcvVar);
        parcelA_.writeLong(j10);
        zzb(3, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void logHealthData(int i10, String str, a aVar, a aVar2, a aVar3) {
        Parcel parcelA_ = a_();
        parcelA_.writeInt(i10);
        parcelA_.writeString(str);
        zzbw.zza(parcelA_, aVar);
        zzbw.zza(parcelA_, aVar2);
        zzbw.zza(parcelA_, aVar3);
        zzb(33, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void onActivityCreated(a aVar, Bundle bundle, long j10) {
        Parcel parcelA_ = a_();
        zzbw.zza(parcelA_, aVar);
        zzbw.zza(parcelA_, bundle);
        parcelA_.writeLong(j10);
        zzb(27, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void onActivityDestroyed(a aVar, long j10) {
        Parcel parcelA_ = a_();
        zzbw.zza(parcelA_, aVar);
        parcelA_.writeLong(j10);
        zzb(28, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void onActivityPaused(a aVar, long j10) {
        Parcel parcelA_ = a_();
        zzbw.zza(parcelA_, aVar);
        parcelA_.writeLong(j10);
        zzb(29, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void onActivityResumed(a aVar, long j10) {
        Parcel parcelA_ = a_();
        zzbw.zza(parcelA_, aVar);
        parcelA_.writeLong(j10);
        zzb(30, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void onActivitySaveInstanceState(a aVar, zzcv zzcvVar, long j10) {
        Parcel parcelA_ = a_();
        zzbw.zza(parcelA_, aVar);
        zzbw.zza(parcelA_, zzcvVar);
        parcelA_.writeLong(j10);
        zzb(31, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void onActivityStarted(a aVar, long j10) {
        Parcel parcelA_ = a_();
        zzbw.zza(parcelA_, aVar);
        parcelA_.writeLong(j10);
        zzb(25, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void onActivityStopped(a aVar, long j10) {
        Parcel parcelA_ = a_();
        zzbw.zza(parcelA_, aVar);
        parcelA_.writeLong(j10);
        zzb(26, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void performAction(Bundle bundle, zzcv zzcvVar, long j10) {
        Parcel parcelA_ = a_();
        zzbw.zza(parcelA_, bundle);
        zzbw.zza(parcelA_, zzcvVar);
        parcelA_.writeLong(j10);
        zzb(32, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void registerOnMeasurementEventListener(zzda zzdaVar) {
        Parcel parcelA_ = a_();
        zzbw.zza(parcelA_, zzdaVar);
        zzb(35, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void resetAnalyticsData(long j10) {
        Parcel parcelA_ = a_();
        parcelA_.writeLong(j10);
        zzb(12, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setConditionalUserProperty(Bundle bundle, long j10) {
        Parcel parcelA_ = a_();
        zzbw.zza(parcelA_, bundle);
        parcelA_.writeLong(j10);
        zzb(8, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setConsent(Bundle bundle, long j10) {
        Parcel parcelA_ = a_();
        zzbw.zza(parcelA_, bundle);
        parcelA_.writeLong(j10);
        zzb(44, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setConsentThirdParty(Bundle bundle, long j10) {
        Parcel parcelA_ = a_();
        zzbw.zza(parcelA_, bundle);
        parcelA_.writeLong(j10);
        zzb(45, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setCurrentScreen(a aVar, String str, String str2, long j10) {
        Parcel parcelA_ = a_();
        zzbw.zza(parcelA_, aVar);
        parcelA_.writeString(str);
        parcelA_.writeString(str2);
        parcelA_.writeLong(j10);
        zzb(15, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setDataCollectionEnabled(boolean z10) {
        Parcel parcelA_ = a_();
        zzbw.zza(parcelA_, z10);
        zzb(39, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setDefaultEventParameters(Bundle bundle) {
        Parcel parcelA_ = a_();
        zzbw.zza(parcelA_, bundle);
        zzb(42, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setEventInterceptor(zzda zzdaVar) {
        Parcel parcelA_ = a_();
        zzbw.zza(parcelA_, zzdaVar);
        zzb(34, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setInstanceIdProvider(zzdb zzdbVar) {
        Parcel parcelA_ = a_();
        zzbw.zza(parcelA_, zzdbVar);
        zzb(18, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setMeasurementEnabled(boolean z10, long j10) {
        Parcel parcelA_ = a_();
        zzbw.zza(parcelA_, z10);
        parcelA_.writeLong(j10);
        zzb(11, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setMinimumSessionDuration(long j10) {
        Parcel parcelA_ = a_();
        parcelA_.writeLong(j10);
        zzb(13, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setSessionTimeoutDuration(long j10) {
        Parcel parcelA_ = a_();
        parcelA_.writeLong(j10);
        zzb(14, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setUserId(String str, long j10) {
        Parcel parcelA_ = a_();
        parcelA_.writeString(str);
        parcelA_.writeLong(j10);
        zzb(7, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setUserProperty(String str, String str2, a aVar, boolean z10, long j10) {
        Parcel parcelA_ = a_();
        parcelA_.writeString(str);
        parcelA_.writeString(str2);
        zzbw.zza(parcelA_, aVar);
        zzbw.zza(parcelA_, z10);
        parcelA_.writeLong(j10);
        zzb(4, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void unregisterOnMeasurementEventListener(zzda zzdaVar) {
        Parcel parcelA_ = a_();
        zzbw.zza(parcelA_, zzdaVar);
        zzb(36, parcelA_);
    }
}
