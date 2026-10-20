package com.google.firebase.firestore.remote;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.AggregateField;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.auth.CredentialsProvider;
import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.core.DatabaseInfo;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.model.mutation.MutationResult;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Util;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.protobuf.z;
import e8.c2;
import e8.m1;
import e8.o1;
import e8.p1;
import e8.z1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLHandshakeException;
import o7.d0;
import o7.i2;
import o7.l;
import o7.m;
import o7.n;
import o7.n0;
import o7.o0;
import o7.p0;
import o7.y0;

/* JADX INFO: loaded from: classes.dex */
public class Datastore {
    static final String SSL_DEPENDENCY_ERROR_MESSAGE = "The Cloud Firestore client failed to establish a secure connection. This is likely a problem with your app, rather than with Cloud Firestore itself. See https://bit.ly/2XFpdma for instructions on how to enable TLS on Android 4.x devices.";
    static final Set<String> WHITE_LISTED_HEADERS = new HashSet(Arrays.asList("date", "x-google-backends", "x-google-netmon-label", "x-google-service", "x-google-gfe-request-trace"));
    private final FirestoreChannel channel;
    private final DatabaseInfo databaseInfo;
    private final RemoteSerializer serializer;
    private final AsyncQueue workerQueue;

    /* JADX INFO: renamed from: com.google.firebase.firestore.remote.Datastore$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$google$firebase$firestore$FirebaseFirestoreException$Code;

        static {
            int[] iArr = new int[FirebaseFirestoreException.Code.values().length];
            $SwitchMap$com$google$firebase$firestore$FirebaseFirestoreException$Code = iArr;
            try {
                iArr[FirebaseFirestoreException.Code.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$FirebaseFirestoreException$Code[FirebaseFirestoreException.Code.CANCELLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$FirebaseFirestoreException$Code[FirebaseFirestoreException.Code.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$FirebaseFirestoreException$Code[FirebaseFirestoreException.Code.DEADLINE_EXCEEDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$FirebaseFirestoreException$Code[FirebaseFirestoreException.Code.RESOURCE_EXHAUSTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$FirebaseFirestoreException$Code[FirebaseFirestoreException.Code.INTERNAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$FirebaseFirestoreException$Code[FirebaseFirestoreException.Code.UNAVAILABLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$FirebaseFirestoreException$Code[FirebaseFirestoreException.Code.UNAUTHENTICATED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$FirebaseFirestoreException$Code[FirebaseFirestoreException.Code.INVALID_ARGUMENT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$FirebaseFirestoreException$Code[FirebaseFirestoreException.Code.NOT_FOUND.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$FirebaseFirestoreException$Code[FirebaseFirestoreException.Code.ALREADY_EXISTS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$FirebaseFirestoreException$Code[FirebaseFirestoreException.Code.PERMISSION_DENIED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$FirebaseFirestoreException$Code[FirebaseFirestoreException.Code.FAILED_PRECONDITION.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$FirebaseFirestoreException$Code[FirebaseFirestoreException.Code.ABORTED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$FirebaseFirestoreException$Code[FirebaseFirestoreException.Code.OUT_OF_RANGE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$FirebaseFirestoreException$Code[FirebaseFirestoreException.Code.UNIMPLEMENTED.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$FirebaseFirestoreException$Code[FirebaseFirestoreException.Code.DATA_LOSS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public Datastore(DatabaseInfo databaseInfo, AsyncQueue asyncQueue, CredentialsProvider<User> credentialsProvider, CredentialsProvider<String> credentialsProvider2, Context context, GrpcMetadataProvider grpcMetadataProvider) {
        this.databaseInfo = databaseInfo;
        this.workerQueue = asyncQueue;
        this.serializer = new RemoteSerializer(databaseInfo.getDatabaseId());
        this.channel = initializeChannel(databaseInfo, asyncQueue, credentialsProvider, credentialsProvider2, context, grpcMetadataProvider);
    }

    public static boolean isMissingSslCiphers(c2 c2Var) {
        z1 z1Var = c2Var.f5227a;
        Throwable th = c2Var.f5229c;
        if (!(th instanceof SSLHandshakeException)) {
            return false;
        }
        th.getMessage().contains("no ciphers available");
        return false;
    }

    public static boolean isPermanentError(FirebaseFirestoreException.Code code) {
        switch (AnonymousClass2.$SwitchMap$com$google$firebase$firestore$FirebaseFirestoreException$Code[code.ordinal()]) {
            case 1:
                throw new IllegalArgumentException("Treated status OK as error");
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return false;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case Code.UNAVAILABLE /* 14 */:
            case 15:
            case Code.UNAUTHENTICATED /* 16 */:
            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return true;
            default:
                throw new IllegalArgumentException("Unknown gRPC status code: " + code);
        }
    }

    public static boolean isPermanentWriteError(c2 c2Var) {
        return isPermanentError(c2Var) && !c2Var.f5227a.equals(z1.ABORTED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$commit$0(Task task) throws Exception {
        if (!task.isSuccessful()) {
            if ((task.getException() instanceof FirebaseFirestoreException) && ((FirebaseFirestoreException) task.getException()).getCode() == FirebaseFirestoreException.Code.UNAUTHENTICATED) {
                this.channel.invalidateToken();
            }
            throw task.getException();
        }
        n nVar = (n) task.getResult();
        SnapshotVersion snapshotVersionDecodeVersion = this.serializer.decodeVersion(nVar.g());
        int iJ = nVar.j();
        ArrayList arrayList = new ArrayList(iJ);
        for (int i10 = 0; i10 < iJ; i10++) {
            arrayList.add(this.serializer.decodeMutationResult(nVar.i(i10), snapshotVersionDecodeVersion));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Map lambda$runAggregateQuery$1(HashMap map, Task task) throws Exception {
        if (!task.isSuccessful()) {
            if ((task.getException() instanceof FirebaseFirestoreException) && ((FirebaseFirestoreException) task.getException()).getCode() == FirebaseFirestoreException.Code.UNAUTHENTICATED) {
                this.channel.invalidateToken();
            }
            throw task.getException();
        }
        HashMap map2 = new HashMap();
        for (Map.Entry entry : ((p0) task.getResult()).h().g().entrySet()) {
            Assert.hardAssert(map.containsKey(entry.getKey()), "%s not present in aliasMap", entry.getKey());
            map2.put((String) map.get(entry.getKey()), (i2) entry.getValue());
        }
        return map2;
    }

    public Task<List<MutationResult>> commit(List<Mutation> list) {
        l lVarI = m.i();
        lVarI.d(this.serializer.databaseName());
        Iterator<Mutation> it = list.iterator();
        while (it.hasNext()) {
            lVarI.c(this.serializer.encodeMutation(it.next()));
        }
        FirestoreChannel firestoreChannel = this.channel;
        p1 p1VarA = d0.f12573b;
        if (p1VarA == null) {
            synchronized (d0.class) {
                try {
                    p1VarA = d0.f12573b;
                    if (p1VarA == null) {
                        m1 m1VarB = p1.b();
                        m1VarB.f5315c = o1.f5328a;
                        m1VarB.f5316d = p1.a("google.firestore.v1.Firestore", "Commit");
                        m1VarB.f5317e = true;
                        m mVarH = m.h();
                        z zVar = l8.c.f11392a;
                        m1VarB.f5313a = new l8.b(mVarH);
                        m1VarB.f5314b = new l8.b(n.h());
                        p1VarA = m1VarB.a();
                        d0.f12573b = p1VarA;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return firestoreChannel.runRpc(p1VarA, (m) lVarI.m3997build()).continueWith(this.workerQueue.getExecutor(), new h(this));
    }

    public WatchStream createWatchStream(WatchStream.Callback callback) {
        return new WatchStream(this.channel, this.workerQueue, this.serializer, callback);
    }

    public WriteStream createWriteStream(WriteStream.Callback callback) {
        return new WriteStream(this.channel, this.workerQueue, this.serializer, callback);
    }

    public DatabaseInfo getDatabaseInfo() {
        return this.databaseInfo;
    }

    public AsyncQueue getWorkerQueue() {
        return this.workerQueue;
    }

    public FirestoreChannel initializeChannel(DatabaseInfo databaseInfo, AsyncQueue asyncQueue, CredentialsProvider<User> credentialsProvider, CredentialsProvider<String> credentialsProvider2, Context context, GrpcMetadataProvider grpcMetadataProvider) {
        return new FirestoreChannel(asyncQueue, context, credentialsProvider, credentialsProvider2, databaseInfo, grpcMetadataProvider);
    }

    public Task<List<MutableDocument>> lookup(final List<DocumentKey> list) {
        o7.g gVarI = o7.h.i();
        gVarI.d(this.serializer.databaseName());
        Iterator<DocumentKey> it = list.iterator();
        while (it.hasNext()) {
            gVarI.c(this.serializer.encodeKey(it.next()));
        }
        final ArrayList arrayList = new ArrayList();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FirestoreChannel firestoreChannel = this.channel;
        p1 p1VarA = d0.f12572a;
        if (p1VarA == null) {
            synchronized (d0.class) {
                try {
                    p1VarA = d0.f12572a;
                    if (p1VarA == null) {
                        m1 m1VarB = p1.b();
                        m1VarB.f5315c = o1.f5329b;
                        m1VarB.f5316d = p1.a("google.firestore.v1.Firestore", "BatchGetDocuments");
                        m1VarB.f5317e = true;
                        o7.h hVarH = o7.h.h();
                        z zVar = l8.c.f11392a;
                        m1VarB.f5313a = new l8.b(hVarH);
                        m1VarB.f5314b = new l8.b(o7.i.g());
                        p1VarA = m1VarB.a();
                        d0.f12572a = p1VarA;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        firestoreChannel.runStreamingResponseRpc(p1VarA, (o7.h) gVarI.m3997build(), new FirestoreChannel.StreamingListener<o7.i>() { // from class: com.google.firebase.firestore.remote.Datastore.1
            @Override // com.google.firebase.firestore.remote.FirestoreChannel.StreamingListener
            public void onClose(c2 c2Var) {
                if (c2Var.e()) {
                    taskCompletionSource.trySetResult(Collections.emptyList());
                    return;
                }
                FirebaseFirestoreException firebaseFirestoreExceptionExceptionFromStatus = Util.exceptionFromStatus(c2Var);
                if (firebaseFirestoreExceptionExceptionFromStatus.getCode() == FirebaseFirestoreException.Code.UNAUTHENTICATED) {
                    Datastore.this.channel.invalidateToken();
                }
                taskCompletionSource.trySetException(firebaseFirestoreExceptionExceptionFromStatus);
            }

            @Override // com.google.firebase.firestore.remote.FirestoreChannel.StreamingListener
            public void onMessage(o7.i iVar) {
                arrayList.add(iVar);
                if (arrayList.size() == list.size()) {
                    HashMap map = new HashMap();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        MutableDocument mutableDocumentDecodeMaybeDocument = Datastore.this.serializer.decodeMaybeDocument((o7.i) it2.next());
                        map.put(mutableDocumentDecodeMaybeDocument.getKey(), mutableDocumentDecodeMaybeDocument);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add((MutableDocument) map.get((DocumentKey) it3.next()));
                    }
                    taskCompletionSource.trySetResult(arrayList2);
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    public Task<Map<String, i2>> runAggregateQuery(Query query, List<AggregateField> list) {
        o7.z1 z1VarEncodeQueryTarget = this.serializer.encodeQueryTarget(query.toAggregateTarget());
        HashMap<String, String> map = new HashMap<>();
        y0 y0VarEncodeStructuredAggregationQuery = this.serializer.encodeStructuredAggregationQuery(z1VarEncodeQueryTarget, list, map);
        n0 n0VarI = o0.i();
        n0VarI.c(z1VarEncodeQueryTarget.i());
        n0VarI.d(y0VarEncodeStructuredAggregationQuery);
        FirestoreChannel firestoreChannel = this.channel;
        p1 p1VarA = d0.f12574c;
        if (p1VarA == null) {
            synchronized (d0.class) {
                try {
                    p1VarA = d0.f12574c;
                    if (p1VarA == null) {
                        m1 m1VarB = p1.b();
                        m1VarB.f5315c = o1.f5329b;
                        m1VarB.f5316d = p1.a("google.firestore.v1.Firestore", "RunAggregationQuery");
                        m1VarB.f5317e = true;
                        o0 o0VarH = o0.h();
                        z zVar = l8.c.f11392a;
                        m1VarB.f5313a = new l8.b(o0VarH);
                        m1VarB.f5314b = new l8.b(p0.g());
                        p1VarA = m1VarB.a();
                        d0.f12574c = p1VarA;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return firestoreChannel.runRpc(p1VarA, (o0) n0VarI.m3997build()).continueWith(this.workerQueue.getExecutor(), new d(0, this, map));
    }

    public void shutdown() {
        this.channel.shutdown();
    }

    public static boolean isPermanentError(c2 c2Var) {
        return isPermanentError(FirebaseFirestoreException.Code.fromValue(c2Var.f5227a.f5425a));
    }
}
