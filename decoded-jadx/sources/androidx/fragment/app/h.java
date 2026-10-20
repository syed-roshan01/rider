package androidx.fragment.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzcv;
import com.google.android.gms.internal.measurement.zzoi;
import com.google.android.gms.internal.measurement.zzpy;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.firebase.messaging.Constants;
import k6.g5;
import k6.g6;
import k6.i6;
import k6.s6;
import k6.u7;
import k6.y5;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1925a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1930f;

    public /* synthetic */ h(y5.b bVar, Intent intent, Context context, boolean z10, BroadcastReceiver.PendingResult pendingResult) {
        this.f1927c = bVar;
        this.f1928d = intent;
        this.f1929e = context;
        this.f1926b = z10;
        this.f1930f = pendingResult;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00f1 A[Catch: RuntimeException -> 0x0039, TryCatch #0 {RuntimeException -> 0x0039, blocks: (B:5:0x0020, B:7:0x002b, B:13:0x003d, B:15:0x0043, B:19:0x0052, B:49:0x00cd, B:51:0x00d7, B:56:0x00eb, B:58:0x00f1, B:63:0x0105, B:65:0x010b, B:68:0x0118, B:70:0x011e, B:71:0x0133, B:73:0x013e, B:76:0x0146, B:80:0x0164, B:83:0x0179, B:82:0x016d, B:84:0x017d, B:86:0x0183, B:88:0x0189, B:90:0x018f, B:92:0x0197, B:94:0x019f, B:96:0x01a7, B:98:0x01ad, B:99:0x01b2, B:23:0x0066, B:26:0x006e, B:28:0x0076, B:30:0x007c, B:32:0x0082, B:34:0x0088, B:36:0x0090, B:38:0x0098, B:41:0x00a2, B:43:0x00aa, B:44:0x00b4, B:46:0x00c2), top: B:112:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0100  */
    /* JADX WARN: Code duplicated, block: B:61:0x0102  */
    /* JADX WARN: Code duplicated, block: B:65:0x010b A[Catch: RuntimeException -> 0x0039, TryCatch #0 {RuntimeException -> 0x0039, blocks: (B:5:0x0020, B:7:0x002b, B:13:0x003d, B:15:0x0043, B:19:0x0052, B:49:0x00cd, B:51:0x00d7, B:56:0x00eb, B:58:0x00f1, B:63:0x0105, B:65:0x010b, B:68:0x0118, B:70:0x011e, B:71:0x0133, B:73:0x013e, B:76:0x0146, B:80:0x0164, B:83:0x0179, B:82:0x016d, B:84:0x017d, B:86:0x0183, B:88:0x0189, B:90:0x018f, B:92:0x0197, B:94:0x019f, B:96:0x01a7, B:98:0x01ad, B:99:0x01b2, B:23:0x0066, B:26:0x006e, B:28:0x0076, B:30:0x007c, B:32:0x0082, B:34:0x0088, B:36:0x0090, B:38:0x0098, B:41:0x00a2, B:43:0x00aa, B:44:0x00b4, B:46:0x00c2), top: B:112:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0116 A[ADDED_TO_REGION] */
    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundleU;
        CharSequence charSequence;
        String str;
        Bundle bundleU2;
        int i10 = this.f1925a;
        boolean z10 = this.f1926b;
        Object obj = this.f1930f;
        Object obj2 = this.f1929e;
        Object obj3 = this.f1928d;
        Object obj4 = this.f1927c;
        switch (i10) {
            case 0:
                d0 d0Var = ((s1) obj4).f2025c;
                d0 d0Var2 = ((s1) obj3).f2025c;
                m1 m1Var = h1.f1933a;
                if (!z10) {
                    d0Var.getEnterTransitionCallback();
                } else {
                    d0Var2.getEnterTransitionCallback();
                }
                break;
            case 1:
                ((y5.b) obj4).zza((Intent) obj3, (Context) obj2, z10, (BroadcastReceiver.PendingResult) obj);
                break;
            case 2:
                s6 s6VarM = ((AppMeasurementDynamiteService) obj).f3409a.m();
                boolean z11 = this.f1926b;
                s6VarM.l();
                s6VarM.s();
                s6VarM.v(new g6(s6VarM, (String) obj3, (String) obj2, s6VarM.H(false), z11, (zzcv) obj4));
                break;
            default:
                Uri uri = (Uri) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                y5 y5Var = ((i6) obj).f10111a;
                y5Var.l();
                try {
                    u7 u7VarK = y5Var.k();
                    boolean z12 = zzpy.zza() && y5Var.h().v(null, k6.x.f10516w0);
                    boolean z13 = zzoi.zza() && y5Var.h().v(null, k6.x.P0);
                    if (TextUtils.isEmpty(str3)) {
                        bundleU = null;
                    } else if (str3.contains("gclid") || ((z13 && str3.contains("gbraid")) || str3.contains("utm_campaign") || str3.contains("utm_source") || str3.contains("utm_medium") || str3.contains("utm_id") || str3.contains("dclid") || str3.contains("srsltid") || (z12 && str3.contains("sfmc_id")))) {
                        bundleU = u7VarK.u(Uri.parse("https://google.com/search?".concat(str3)), z12, z13);
                        if (bundleU != null) {
                            bundleU.putString("_cis", "referrer");
                        }
                    } else {
                        u7VarK.zzj().f9971m.b("Activity created with data 'referrer' without required params");
                        bundleU = null;
                    }
                    g5 g5Var = y5Var.f10579n;
                    if (z10) {
                        u7 u7VarK2 = y5Var.k();
                        if (zzpy.zza()) {
                            str = "Activity created with data 'referrer' without required params";
                            boolean z14 = y5Var.h().v(null, k6.x.f10516w0);
                            if (zzoi.zza()) {
                                charSequence = "utm_medium";
                                boolean z15 = y5Var.h().v(null, k6.x.P0);
                                bundleU2 = u7VarK2.u(uri, z14, z15);
                                if (bundleU2 != null) {
                                    bundleU2.putString("_cis", "intent");
                                    if (!bundleU2.containsKey("gclid") && bundleU != null && bundleU.containsKey("gclid")) {
                                        bundleU2.putString("_cer", String.format("gclid=%s", bundleU.getString("gclid")));
                                    }
                                    y5Var.S(str2, Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, bundleU2);
                                    g5Var.a(str2, bundleU2);
                                }
                            } else {
                                charSequence = "utm_medium";
                            }
                            bundleU2 = u7VarK2.u(uri, z14, z15);
                            if (bundleU2 != null) {
                                bundleU2.putString("_cis", "intent");
                                if (!bundleU2.containsKey("gclid")) {
                                    bundleU2.putString("_cer", String.format("gclid=%s", bundleU.getString("gclid")));
                                }
                                y5Var.S(str2, Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, bundleU2);
                                g5Var.a(str2, bundleU2);
                            }
                        } else {
                            str = "Activity created with data 'referrer' without required params";
                        }
                        if (zzoi.zza()) {
                            charSequence = "utm_medium";
                            if (y5Var.h().v(null, k6.x.P0)) {
                            }
                            bundleU2 = u7VarK2.u(uri, z14, z15);
                            if (bundleU2 != null) {
                                bundleU2.putString("_cis", "intent");
                                if (!bundleU2.containsKey("gclid")) {
                                    bundleU2.putString("_cer", String.format("gclid=%s", bundleU.getString("gclid")));
                                }
                                y5Var.S(str2, Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, bundleU2);
                                g5Var.a(str2, bundleU2);
                            }
                        } else {
                            charSequence = "utm_medium";
                        }
                        bundleU2 = u7VarK2.u(uri, z14, z15);
                        if (bundleU2 != null) {
                            bundleU2.putString("_cis", "intent");
                            if (!bundleU2.containsKey("gclid")) {
                                bundleU2.putString("_cer", String.format("gclid=%s", bundleU.getString("gclid")));
                            }
                            y5Var.S(str2, Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, bundleU2);
                            g5Var.a(str2, bundleU2);
                        }
                    } else {
                        charSequence = "utm_medium";
                        str = "Activity created with data 'referrer' without required params";
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        y5Var.zzj().f9971m.c("Activity created with referrer", str3);
                        if (y5Var.h().v(null, k6.x.f10487h0)) {
                            if (bundleU != null) {
                                y5Var.S(str2, Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, bundleU);
                                g5Var.a(str2, bundleU);
                            } else {
                                y5Var.zzj().f9971m.c("Referrer does not contain valid parameters", str3);
                            }
                            y5Var.G("auto", "_ldl", null, true);
                        } else if (!str3.contains("gclid") || (!str3.contains("utm_campaign") && !str3.contains("utm_source") && !str3.contains(charSequence) && !str3.contains("utm_term") && !str3.contains("utm_content"))) {
                            y5Var.zzj().f9971m.b(str);
                        } else if (!TextUtils.isEmpty(str3)) {
                            y5Var.G("auto", "_ldl", str3, true);
                        }
                    }
                } catch (RuntimeException e4) {
                    y5Var.zzj().f9964f.c("Throwable caught in handleReferrerForOnActivityCreated", e4);
                }
                break;
        }
    }

    public h(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcv zzcvVar, String str, String str2, boolean z10) {
        this.f1930f = appMeasurementDynamiteService;
        this.f1927c = zzcvVar;
        this.f1928d = str;
        this.f1929e = str2;
        this.f1926b = z10;
    }

    public h(i6 i6Var, boolean z10, Uri uri, String str, String str2) {
        this.f1930f = i6Var;
        this.f1926b = z10;
        this.f1927c = uri;
        this.f1928d = str;
        this.f1929e = str2;
    }

    public h(n nVar, s1 s1Var, s1 s1Var2, boolean z10, q.f fVar) {
        this.f1930f = nVar;
        this.f1927c = s1Var;
        this.f1928d = s1Var2;
        this.f1926b = z10;
        this.f1929e = fVar;
    }
}
