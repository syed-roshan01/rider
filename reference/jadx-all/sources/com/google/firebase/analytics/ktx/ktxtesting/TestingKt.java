package com.google.firebase.analytics.ktx.ktxtesting;

import c9.a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.analytics.ktx.AnalyticsKt;

/* JADX INFO: loaded from: classes.dex */
public final class TestingKt {
    public static final void withAnalyticsForTest(FirebaseAnalytics firebaseAnalytics, a aVar) {
        d7.a.m(firebaseAnalytics, "analytics");
        d7.a.m(aVar, "block");
        synchronized (AnalyticsKt.getLOCK()) {
            FirebaseAnalytics analytics = AnalyticsKt.getANALYTICS();
            AnalyticsKt.setANALYTICS(firebaseAnalytics);
            try {
                aVar.invoke();
                AnalyticsKt.setANALYTICS(analytics);
            } catch (Throwable th) {
                AnalyticsKt.setANALYTICS(analytics);
                throw th;
            }
        }
    }
}
