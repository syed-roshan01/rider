package com.google.firebase.firestore.remote;

import android.content.Context;
import b0.l0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.BuildConfig;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.auth.CredentialsProvider;
import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.core.DatabaseInfo;
import com.google.firebase.firestore.model.DatabaseId;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Util;
import e8.c2;
import e8.g1;
import e8.i0;
import e8.i1;
import e8.k;
import e8.l1;
import e8.p1;
import java.util.BitSet;
import x9.v;

/* JADX INFO: loaded from: classes.dex */
public class FirestoreChannel {
    private static final i1 RESOURCE_PREFIX_HEADER;
    private static final i1 X_GOOG_API_CLIENT_HEADER;
    private static final i1 X_GOOG_REQUEST_PARAMS_HEADER;
    private static volatile String clientLanguage;
    private final CredentialsProvider<String> appCheckProvider;
    private final AsyncQueue asyncQueue;
    private final CredentialsProvider<User> authProvider;
    private final GrpcCallProvider callProvider;
    private final GrpcMetadataProvider metadataProvider;
    private final String resourcePrefixValue;

    public static abstract class StreamingListener<T> {
        public void onClose(c2 c2Var) {
        }

        public void onMessage(T t10) {
        }
    }

    static {
        v vVar = l1.f5303d;
        BitSet bitSet = i1.f5283d;
        X_GOOG_API_CLIENT_HEADER = new g1("x-goog-api-client", vVar);
        RESOURCE_PREFIX_HEADER = new g1("google-cloud-resource-prefix", vVar);
        X_GOOG_REQUEST_PARAMS_HEADER = new g1("x-goog-request-params", vVar);
        clientLanguage = "gl-java/";
    }

    public FirestoreChannel(AsyncQueue asyncQueue, Context context, CredentialsProvider<User> credentialsProvider, CredentialsProvider<String> credentialsProvider2, DatabaseInfo databaseInfo, GrpcMetadataProvider grpcMetadataProvider) {
        this.asyncQueue = asyncQueue;
        this.metadataProvider = grpcMetadataProvider;
        this.authProvider = credentialsProvider;
        this.appCheckProvider = credentialsProvider2;
        this.callProvider = new GrpcCallProvider(asyncQueue, context, databaseInfo, new FirestoreCallCredentials(credentialsProvider, credentialsProvider2));
        DatabaseId databaseId = databaseInfo.getDatabaseId();
        this.resourcePrefixValue = String.format("projects/%s/databases/%s", databaseId.getProjectId(), databaseId.getDatabaseId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FirebaseFirestoreException exceptionFromStatus(c2 c2Var) {
        return Datastore.isMissingSslCiphers(c2Var) ? new FirebaseFirestoreException("The Cloud Firestore client failed to establish a secure connection. This is likely a problem with your app, rather than with Cloud Firestore itself. See https://bit.ly/2XFpdma for instructions on how to enable TLS on Android 4.x devices.", FirebaseFirestoreException.Code.fromValue(c2Var.f5227a.f5425a), c2Var.f5229c) : Util.exceptionFromStatus(c2Var);
    }

    private String getGoogApiClientValue() {
        return String.format("%s fire/%s grpc/", clientLanguage, BuildConfig.VERSION_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runBidiStreamingRpc$0(final k[] kVarArr, final IncomingStreamObserver incomingStreamObserver, Task task) {
        k kVar = (k) task.getResult();
        kVarArr[0] = kVar;
        kVar.start(new e8.j() { // from class: com.google.firebase.firestore.remote.FirestoreChannel.1
            @Override // e8.j
            public void onClose(c2 c2Var, l1 l1Var) {
                try {
                    incomingStreamObserver.onClose(c2Var);
                } catch (Throwable th) {
                    FirestoreChannel.this.asyncQueue.panic(th);
                }
            }

            @Override // e8.j
            public void onHeaders(l1 l1Var) {
                try {
                    incomingStreamObserver.onHeaders(l1Var);
                } catch (Throwable th) {
                    FirestoreChannel.this.asyncQueue.panic(th);
                }
            }

            @Override // e8.j
            public void onMessage(Object obj) {
                try {
                    incomingStreamObserver.onNext(obj);
                    kVarArr[0].request(1);
                } catch (Throwable th) {
                    FirestoreChannel.this.asyncQueue.panic(th);
                }
            }

            @Override // e8.j
            public void onReady() {
            }
        }, requestHeaders());
        incomingStreamObserver.onOpen();
        kVarArr[0].request(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runRpc$2(final TaskCompletionSource taskCompletionSource, Object obj, Task task) {
        k kVar = (k) task.getResult();
        kVar.start(new e8.j() { // from class: com.google.firebase.firestore.remote.FirestoreChannel.4
            @Override // e8.j
            public void onClose(c2 c2Var, l1 l1Var) {
                if (!c2Var.e()) {
                    taskCompletionSource.setException(FirestoreChannel.this.exceptionFromStatus(c2Var));
                } else {
                    if (taskCompletionSource.getTask().isComplete()) {
                        return;
                    }
                    taskCompletionSource.setException(new FirebaseFirestoreException("Received onClose with status OK, but no message.", FirebaseFirestoreException.Code.INTERNAL));
                }
            }

            @Override // e8.j
            public void onMessage(Object obj2) {
                taskCompletionSource.setResult(obj2);
            }
        }, requestHeaders());
        kVar.request(2);
        kVar.sendMessage(obj);
        kVar.halfClose();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runStreamingResponseRpc$1(final StreamingListener streamingListener, Object obj, Task task) {
        final k kVar = (k) task.getResult();
        kVar.start(new e8.j() { // from class: com.google.firebase.firestore.remote.FirestoreChannel.3
            @Override // e8.j
            public void onClose(c2 c2Var, l1 l1Var) {
                streamingListener.onClose(c2Var);
            }

            @Override // e8.j
            public void onMessage(Object obj2) {
                streamingListener.onMessage(obj2);
                kVar.request(1);
            }
        }, requestHeaders());
        kVar.request(1);
        kVar.sendMessage(obj);
        kVar.halfClose();
    }

    private l1 requestHeaders() {
        l1 l1Var = new l1();
        l1Var.f(X_GOOG_API_CLIENT_HEADER, getGoogApiClientValue());
        l1Var.f(RESOURCE_PREFIX_HEADER, this.resourcePrefixValue);
        l1Var.f(X_GOOG_REQUEST_PARAMS_HEADER, this.resourcePrefixValue);
        GrpcMetadataProvider grpcMetadataProvider = this.metadataProvider;
        if (grpcMetadataProvider != null) {
            grpcMetadataProvider.updateMetadata(l1Var);
        }
        return l1Var;
    }

    public static void setClientLanguage(String str) {
        clientLanguage = str;
    }

    public void invalidateToken() {
        this.authProvider.invalidateToken();
        this.appCheckProvider.invalidateToken();
    }

    public <ReqT, RespT> k runBidiStreamingRpc(p1 p1Var, IncomingStreamObserver<RespT> incomingStreamObserver) {
        final k[] kVarArr = {null};
        final Task<k> taskCreateClientCall = this.callProvider.createClientCall(p1Var);
        taskCreateClientCall.addOnCompleteListener(this.asyncQueue.getExecutor(), new e(this, kVarArr, incomingStreamObserver, 1));
        return new i0() { // from class: com.google.firebase.firestore.remote.FirestoreChannel.2
            @Override // e8.i0
            public k delegate() {
                Assert.hardAssert(kVarArr[0] != null, "ClientCall used before onOpen() callback", new Object[0]);
                return kVarArr[0];
            }

            @Override // e8.i0, e8.k
            public void halfClose() {
                if (kVarArr[0] == null) {
                    taskCreateClientCall.addOnSuccessListener(FirestoreChannel.this.asyncQueue.getExecutor(), new l0(1));
                } else {
                    super.halfClose();
                }
            }
        };
    }

    public <ReqT, RespT> Task<RespT> runRpc(p1 p1Var, ReqT reqt) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.callProvider.createClientCall(p1Var).addOnCompleteListener(this.asyncQueue.getExecutor(), new e(this, taskCompletionSource, reqt, 3));
        return taskCompletionSource.getTask();
    }

    public <ReqT, RespT> void runStreamingResponseRpc(p1 p1Var, ReqT reqt, StreamingListener<RespT> streamingListener) {
        this.callProvider.createClientCall(p1Var).addOnCompleteListener(this.asyncQueue.getExecutor(), new e(this, streamingListener, reqt, 2));
    }

    public void shutdown() {
        this.callProvider.shutdown();
    }
}
