package com.google.firebase;

import android.content.Context;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import java.lang.annotation.Annotation;
import m9.z;

/* JADX INFO: loaded from: classes.dex */
public final class FirebaseKt {

    /* JADX INFO: renamed from: com.google.firebase.FirebaseKt$coroutineDispatcher$1, reason: invalid class name */
    public static final class AnonymousClass1<T> implements ComponentFactory {
        public static final AnonymousClass1<T> INSTANCE = new AnonymousClass1<>();

        @Override // com.google.firebase.components.ComponentFactory
        public final z create(ComponentContainer componentContainer) {
            d7.a.C();
            throw null;
        }
    }

    public static final FirebaseApp app(Firebase firebase, String str) {
        d7.a.m(firebase, "<this>");
        d7.a.m(str, "name");
        FirebaseApp firebaseApp = FirebaseApp.getInstance(str);
        d7.a.l(firebaseApp, "getInstance(name)");
        return firebaseApp;
    }

    private static final <T extends Annotation> Component<z> coroutineDispatcher() {
        d7.a.C();
        throw null;
    }

    public static final FirebaseApp getApp(Firebase firebase) {
        d7.a.m(firebase, "<this>");
        FirebaseApp firebaseApp = FirebaseApp.getInstance();
        d7.a.l(firebaseApp, "getInstance()");
        return firebaseApp;
    }

    public static final FirebaseOptions getOptions(Firebase firebase) {
        d7.a.m(firebase, "<this>");
        FirebaseOptions options = getApp(Firebase.INSTANCE).getOptions();
        d7.a.l(options, "Firebase.app.options");
        return options;
    }

    public static final FirebaseApp initialize(Firebase firebase, Context context) {
        d7.a.m(firebase, "<this>");
        d7.a.m(context, "context");
        return FirebaseApp.initializeApp(context);
    }

    public static final FirebaseApp initialize(Firebase firebase, Context context, FirebaseOptions firebaseOptions) {
        d7.a.m(firebase, "<this>");
        d7.a.m(context, "context");
        d7.a.m(firebaseOptions, "options");
        FirebaseApp firebaseAppInitializeApp = FirebaseApp.initializeApp(context, firebaseOptions);
        d7.a.l(firebaseAppInitializeApp, "initializeApp(context, options)");
        return firebaseAppInitializeApp;
    }

    public static final FirebaseApp initialize(Firebase firebase, Context context, FirebaseOptions firebaseOptions, String str) {
        d7.a.m(firebase, "<this>");
        d7.a.m(context, "context");
        d7.a.m(firebaseOptions, "options");
        d7.a.m(str, "name");
        FirebaseApp firebaseAppInitializeApp = FirebaseApp.initializeApp(context, firebaseOptions, str);
        d7.a.l(firebaseAppInitializeApp, "initializeApp(context, options, name)");
        return firebaseAppInitializeApp;
    }
}
