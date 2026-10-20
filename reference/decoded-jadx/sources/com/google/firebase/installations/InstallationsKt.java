package com.google.firebase.installations;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;

/* JADX INFO: loaded from: classes.dex */
public final class InstallationsKt {
    public static final FirebaseInstallations getInstallations(Firebase firebase) {
        d7.a.m(firebase, "<this>");
        FirebaseInstallations firebaseInstallations = FirebaseInstallations.getInstance();
        d7.a.l(firebaseInstallations, "getInstance()");
        return firebaseInstallations;
    }

    public static final FirebaseInstallations installations(Firebase firebase, FirebaseApp firebaseApp) {
        d7.a.m(firebase, "<this>");
        d7.a.m(firebaseApp, "app");
        FirebaseInstallations firebaseInstallations = FirebaseInstallations.getInstance(firebaseApp);
        d7.a.l(firebaseInstallations, "getInstance(app)");
        return firebaseInstallations;
    }
}
