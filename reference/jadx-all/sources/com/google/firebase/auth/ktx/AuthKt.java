package com.google.firebase.auth.ktx;

import c9.c;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.OAuthProvider;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.ktx.Firebase;
import d7.a;

/* JADX INFO: loaded from: classes.dex */
public final class AuthKt {
    public static final ActionCodeSettings actionCodeSettings(c cVar) {
        a.m(cVar, "init");
        ActionCodeSettings.Builder builderNewBuilder = ActionCodeSettings.newBuilder();
        a.l(builderNewBuilder, "newBuilder(...)");
        cVar.invoke(builderNewBuilder);
        ActionCodeSettings actionCodeSettingsBuild = builderNewBuilder.build();
        a.l(actionCodeSettingsBuild, "build(...)");
        return actionCodeSettingsBuild;
    }

    public static final FirebaseAuth auth(Firebase firebase, FirebaseApp firebaseApp) {
        a.m(firebase, "<this>");
        a.m(firebaseApp, "app");
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(firebaseApp);
        a.l(firebaseAuth, "getInstance(...)");
        return firebaseAuth;
    }

    public static final FirebaseAuth getAuth(Firebase firebase) {
        a.m(firebase, "<this>");
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        a.l(firebaseAuth, "getInstance(...)");
        return firebaseAuth;
    }

    public static final AuthCredential oAuthCredential(String str, c cVar) {
        a.m(str, "providerId");
        a.m(cVar, "init");
        OAuthProvider.CredentialBuilder credentialBuilderNewCredentialBuilder = OAuthProvider.newCredentialBuilder(str);
        a.l(credentialBuilderNewCredentialBuilder, "newCredentialBuilder(...)");
        cVar.invoke(credentialBuilderNewCredentialBuilder);
        AuthCredential authCredentialBuild = credentialBuilderNewCredentialBuilder.build();
        a.l(authCredentialBuild, "build(...)");
        return authCredentialBuild;
    }

    public static final OAuthProvider oAuthProvider(String str, c cVar) {
        a.m(str, "providerId");
        a.m(cVar, "init");
        OAuthProvider.Builder builderNewBuilder = OAuthProvider.newBuilder(str);
        a.l(builderNewBuilder, "newBuilder(...)");
        cVar.invoke(builderNewBuilder);
        OAuthProvider oAuthProviderBuild = builderNewBuilder.build();
        a.l(oAuthProviderBuild, "build(...)");
        return oAuthProviderBuild;
    }

    public static final UserProfileChangeRequest userProfileChangeRequest(c cVar) {
        a.m(cVar, "init");
        UserProfileChangeRequest.Builder builder = new UserProfileChangeRequest.Builder();
        cVar.invoke(builder);
        UserProfileChangeRequest userProfileChangeRequestBuild = builder.build();
        a.l(userProfileChangeRequestBuild, "build(...)");
        return userProfileChangeRequestBuild;
    }

    public static final OAuthProvider oAuthProvider(String str, FirebaseAuth firebaseAuth, c cVar) {
        a.m(str, "providerId");
        a.m(firebaseAuth, "firebaseAuth");
        a.m(cVar, "init");
        OAuthProvider.Builder builderNewBuilder = OAuthProvider.newBuilder(str, firebaseAuth);
        a.l(builderNewBuilder, "newBuilder(...)");
        cVar.invoke(builderNewBuilder);
        OAuthProvider oAuthProviderBuild = builderNewBuilder.build();
        a.l(oAuthProviderBuild, "build(...)");
        return oAuthProviderBuild;
    }
}
