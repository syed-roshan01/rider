package com.google.firebase.ktx;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import d7.a;
import java.lang.annotation.Annotation;
import m9.z;

/* JADX INFO: loaded from: classes.dex */
public final class FirebaseKt {

    /* JADX INFO: renamed from: com.google.firebase.ktx.FirebaseKt$coroutineDispatcher$1, reason: invalid class name */
    public static final class AnonymousClass1<T> implements ComponentFactory {
        public static final AnonymousClass1<T> INSTANCE = new AnonymousClass1<>();

        @Override // com.google.firebase.components.ComponentFactory
        public final z create(ComponentContainer componentContainer) {
            a.C();
            throw null;
        }
    }

    public static final FirebaseApp app(Firebase firebase, String str) {
        a.m(firebase, "<this>");
        a.m(str, "name");
        FirebaseApp firebaseApp = FirebaseApp.getInstance(str);
        a.l(firebaseApp, "getInstance(name)");
        return firebaseApp;
    }

    private static final <T extends Annotation> Component<z> coroutineDispatcher() {
        a.C();
        throw null;
    }

    public static final FirebaseApp getApp(Firebase firebase) {
        a.m(firebase, "<this>");
        FirebaseApp firebaseApp = FirebaseApp.getInstance();
        a.l(firebaseApp, "getInstance()");
        return firebaseApp;
    }

    public static final FirebaseOptions getOptions(Firebase firebase) {
        a.m(firebase, "<this>");
        FirebaseOptions options = getApp(Firebase.INSTANCE).getOptions();
        a.l(options, "Firebase.app.options");
        return options;
    }

    public static final FirebaseApp initialize(Firebase firebase, Context context) {
        a.m(firebase, "<this>");
        a.m(context, "context");
        return FirebaseApp.initializeApp(context);
    }

    public static final FirebaseApp initialize(Firebase firebase, Context context, FirebaseOptions firebaseOptions) {
        a.m(firebase, "<this>");
        a.m(context, "context");
        a.m(firebaseOptions, "options");
        FirebaseApp firebaseAppInitializeApp = FirebaseApp.initializeApp(context, firebaseOptions);
        a.l(firebaseAppInitializeApp, "initializeApp(context, options)");
        return firebaseAppInitializeApp;
    }

    public static final FirebaseApp initialize(Firebase firebase, Context context, FirebaseOptions firebaseOptions, String str) {
        a.m(firebase, "<this>");
        a.m(context, "context");
        a.m(firebaseOptions, "options");
        a.m(str, "name");
        FirebaseApp firebaseAppInitializeApp = FirebaseApp.initializeApp(context, firebaseOptions, str);
        a.l(firebaseAppInitializeApp, "initializeApp(context, options, name)");
        return firebaseAppInitializeApp;
    }
}
