package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.local.TargetData;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.protobuf.n;
import com.google.protobuf.z;
import e8.m1;
import e8.o1;
import e8.p1;
import java.util.Map;
import o7.d0;
import o7.e0;
import o7.g0;
import o7.h0;

/* JADX INFO: loaded from: classes.dex */
public class WatchStream extends AbstractStream<g0, h0, Callback> {
    public static final n EMPTY_RESUME_TOKEN = n.f4181b;
    private final RemoteSerializer serializer;

    public interface Callback extends Stream.StreamCallback {
        void onWatchChange(SnapshotVersion snapshotVersion, WatchChange watchChange);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public WatchStream(FirestoreChannel firestoreChannel, AsyncQueue asyncQueue, RemoteSerializer remoteSerializer, Callback callback) {
        p1 p1VarA = d0.f12576e;
        if (p1VarA == null) {
            synchronized (d0.class) {
                try {
                    p1VarA = d0.f12576e;
                    if (p1VarA == null) {
                        m1 m1VarB = p1.b();
                        m1VarB.f5315c = o1.f5330c;
                        m1VarB.f5316d = p1.a("google.firestore.v1.Firestore", "Listen");
                        m1VarB.f5317e = true;
                        g0 g0VarJ = g0.j();
                        z zVar = l8.c.f11392a;
                        m1VarB.f5313a = new l8.b(g0VarJ);
                        m1VarB.f5314b = new l8.b(h0.g());
                        p1VarA = m1VarB.a();
                        d0.f12576e = p1VarA;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        super(firestoreChannel, p1VarA, asyncQueue, AsyncQueue.TimerId.LISTEN_STREAM_CONNECTION_BACKOFF, AsyncQueue.TimerId.LISTEN_STREAM_IDLE, AsyncQueue.TimerId.HEALTH_CHECK_TIMEOUT, callback);
        this.serializer = remoteSerializer;
    }

    @Override // com.google.firebase.firestore.remote.AbstractStream, com.google.firebase.firestore.remote.Stream
    public /* bridge */ /* synthetic */ void inhibitBackoff() {
        super.inhibitBackoff();
    }

    @Override // com.google.firebase.firestore.remote.AbstractStream, com.google.firebase.firestore.remote.Stream
    public /* bridge */ /* synthetic */ boolean isOpen() {
        return super.isOpen();
    }

    @Override // com.google.firebase.firestore.remote.AbstractStream, com.google.firebase.firestore.remote.Stream
    public /* bridge */ /* synthetic */ boolean isStarted() {
        return super.isStarted();
    }

    @Override // com.google.firebase.firestore.remote.AbstractStream, com.google.firebase.firestore.remote.Stream
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.google.firebase.firestore.remote.AbstractStream, com.google.firebase.firestore.remote.Stream
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    public void unwatchTarget(int i10) {
        Assert.hardAssert(isOpen(), "Unwatching targets requires an open stream", new Object[0]);
        e0 e0VarK = g0.k();
        e0VarK.e(this.serializer.databaseName());
        e0VarK.f(i10);
        writeRequest((g0) e0VarK.m3997build());
    }

    public void watchQuery(TargetData targetData) {
        Assert.hardAssert(isOpen(), "Watching queries requires an open stream", new Object[0]);
        e0 e0VarK = g0.k();
        e0VarK.e(this.serializer.databaseName());
        e0VarK.d(this.serializer.encodeTarget(targetData));
        Map<String, String> mapEncodeListenRequestLabels = this.serializer.encodeListenRequestLabels(targetData);
        if (mapEncodeListenRequestLabels != null) {
            e0VarK.c(mapEncodeListenRequestLabels);
        }
        writeRequest((g0) e0VarK.m3997build());
    }

    @Override // com.google.firebase.firestore.remote.AbstractStream
    public void onNext(h0 h0Var) {
        this.backoff.reset();
        WatchChange watchChangeDecodeWatchChange = this.serializer.decodeWatchChange(h0Var);
        ((Callback) this.listener).onWatchChange(this.serializer.decodeVersionFromListenResponse(h0Var), watchChangeDecodeWatchChange);
    }
}
