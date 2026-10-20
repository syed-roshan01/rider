package com.google.firebase.firestore.remote;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApiNotAvailableException;
import com.google.firebase.firestore.auth.CredentialsProvider;
import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.util.Executors;
import com.google.firebase.firestore.util.Logger;
import com.google.firebase.internal.api.FirebaseNoSignedInUserException;
import e8.c2;
import e8.g1;
import e8.i1;
import e8.l1;
import java.util.BitSet;
import java.util.concurrent.Executor;
import x9.v;

/* JADX INFO: loaded from: classes.dex */
final class FirestoreCallCredentials extends e8.f {
    private static final i1 AUTHORIZATION_HEADER;
    private static final String LOG_TAG = "FirestoreCallCredentials";
    private static final i1 X_FIREBASE_APPCHECK;
    private final CredentialsProvider<String> appCheckProvider;
    private final CredentialsProvider<User> authProvider;

    static {
        v vVar = l1.f5303d;
        BitSet bitSet = i1.f5283d;
        AUTHORIZATION_HEADER = new g1("Authorization", vVar);
        X_FIREBASE_APPCHECK = new g1("x-firebase-appcheck", vVar);
    }

    public FirestoreCallCredentials(CredentialsProvider<User> credentialsProvider, CredentialsProvider<String> credentialsProvider2) {
        this.authProvider = credentialsProvider;
        this.appCheckProvider = credentialsProvider2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$applyRequestMetadata$0(Task task, e8.d dVar, Task task2, Task task3) {
        l1 l1Var = new l1();
        if (task.isSuccessful()) {
            String str = (String) task.getResult();
            Logger.debug(LOG_TAG, "Successfully fetched auth token.", new Object[0]);
            if (str != null) {
                l1Var.f(AUTHORIZATION_HEADER, "Bearer ".concat(str));
            }
        } else {
            Exception exception = task.getException();
            if (exception instanceof FirebaseApiNotAvailableException) {
                Logger.debug(LOG_TAG, "Firebase Auth API not available, not using authentication.", new Object[0]);
            } else {
                if (!(exception instanceof FirebaseNoSignedInUserException)) {
                    Logger.warn(LOG_TAG, "Failed to get auth token: %s.", exception);
                    dVar.b(c2.f5221j.f(exception));
                    return;
                }
                Logger.debug(LOG_TAG, "No user signed in, not using authentication.", new Object[0]);
            }
        }
        if (task2.isSuccessful()) {
            String str2 = (String) task2.getResult();
            if (str2 != null && !str2.isEmpty()) {
                Logger.debug(LOG_TAG, "Successfully fetched AppCheck token.", new Object[0]);
                l1Var.f(X_FIREBASE_APPCHECK, str2);
            }
        } else {
            Exception exception2 = task2.getException();
            if (!(exception2 instanceof FirebaseApiNotAvailableException)) {
                Logger.warn(LOG_TAG, "Failed to get AppCheck token: %s.", exception2);
                dVar.b(c2.f5221j.f(exception2));
                return;
            }
            Logger.debug(LOG_TAG, "Firebase AppCheck API not available.", new Object[0]);
        }
        dVar.a(l1Var);
    }

    @Override // e8.f
    public void applyRequestMetadata(e8.e eVar, Executor executor, e8.d dVar) {
        Task<String> token = this.authProvider.getToken();
        Task<String> token2 = this.appCheckProvider.getToken();
        Tasks.whenAll((Task<?>[]) new Task[]{token, token2}).addOnCompleteListener(Executors.DIRECT_EXECUTOR, new e(token, dVar, token2));
    }

    public void thisUsesUnstableApi() {
    }
}
