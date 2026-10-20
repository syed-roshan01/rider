package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.model.mutation.MutationResult;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Preconditions;
import com.google.protobuf.n;
import com.google.protobuf.z;
import e8.m1;
import e8.o1;
import e8.p1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o7.d0;
import o7.n2;
import o7.p2;
import o7.q2;

/* JADX INFO: loaded from: classes.dex */
public class WriteStream extends AbstractStream<p2, q2, Callback> {
    public static final n EMPTY_STREAM_TOKEN = n.f4181b;
    protected boolean handshakeComplete;
    private n lastStreamToken;
    private final RemoteSerializer serializer;

    public interface Callback extends Stream.StreamCallback {
        void onHandshakeComplete();

        void onWriteResponse(SnapshotVersion snapshotVersion, List<MutationResult> list);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public WriteStream(FirestoreChannel firestoreChannel, AsyncQueue asyncQueue, RemoteSerializer remoteSerializer, Callback callback) {
        p1 p1VarA = d0.f12575d;
        if (p1VarA == null) {
            synchronized (d0.class) {
                try {
                    p1VarA = d0.f12575d;
                    if (p1VarA == null) {
                        m1 m1VarB = p1.b();
                        m1VarB.f5315c = o1.f5330c;
                        m1VarB.f5316d = p1.a("google.firestore.v1.Firestore", "Write");
                        m1VarB.f5317e = true;
                        p2 p2VarI = p2.i();
                        z zVar = l8.c.f11392a;
                        m1VarB.f5313a = new l8.b(p2VarI);
                        m1VarB.f5314b = new l8.b(q2.h());
                        p1VarA = m1VarB.a();
                        d0.f12575d = p1VarA;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        super(firestoreChannel, p1VarA, asyncQueue, AsyncQueue.TimerId.WRITE_STREAM_CONNECTION_BACKOFF, AsyncQueue.TimerId.WRITE_STREAM_IDLE, AsyncQueue.TimerId.HEALTH_CHECK_TIMEOUT, callback);
        this.handshakeComplete = false;
        this.lastStreamToken = EMPTY_STREAM_TOKEN;
        this.serializer = remoteSerializer;
    }

    public n getLastStreamToken() {
        return this.lastStreamToken;
    }

    @Override // com.google.firebase.firestore.remote.AbstractStream, com.google.firebase.firestore.remote.Stream
    public /* bridge */ /* synthetic */ void inhibitBackoff() {
        super.inhibitBackoff();
    }

    public boolean isHandshakeComplete() {
        return this.handshakeComplete;
    }

    @Override // com.google.firebase.firestore.remote.AbstractStream, com.google.firebase.firestore.remote.Stream
    public /* bridge */ /* synthetic */ boolean isOpen() {
        return super.isOpen();
    }

    @Override // com.google.firebase.firestore.remote.AbstractStream, com.google.firebase.firestore.remote.Stream
    public /* bridge */ /* synthetic */ boolean isStarted() {
        return super.isStarted();
    }

    public void setLastStreamToken(n nVar) {
        this.lastStreamToken = (n) Preconditions.checkNotNull(nVar);
    }

    @Override // com.google.firebase.firestore.remote.AbstractStream, com.google.firebase.firestore.remote.Stream
    public void start() {
        this.handshakeComplete = false;
        super.start();
    }

    @Override // com.google.firebase.firestore.remote.AbstractStream, com.google.firebase.firestore.remote.Stream
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @Override // com.google.firebase.firestore.remote.AbstractStream
    public void tearDown() {
        if (this.handshakeComplete) {
            writeMutations(Collections.emptyList());
        }
    }

    public void writeHandshake() {
        Assert.hardAssert(isOpen(), "Writing handshake requires an opened stream", new Object[0]);
        Assert.hardAssert(!this.handshakeComplete, "Handshake already completed", new Object[0]);
        n2 n2VarJ = p2.j();
        n2VarJ.d(this.serializer.databaseName());
        writeRequest((p2) n2VarJ.m3997build());
    }

    public void writeMutations(List<Mutation> list) {
        Assert.hardAssert(isOpen(), "Writing mutations requires an opened stream", new Object[0]);
        Assert.hardAssert(this.handshakeComplete, "Handshake must be complete before writing mutations", new Object[0]);
        n2 n2VarJ = p2.j();
        Iterator<Mutation> it = list.iterator();
        while (it.hasNext()) {
            n2VarJ.c(this.serializer.encodeMutation(it.next()));
        }
        n2VarJ.e(this.lastStreamToken);
        writeRequest((p2) n2VarJ.m3997build());
    }

    @Override // com.google.firebase.firestore.remote.AbstractStream
    public void onNext(q2 q2Var) {
        this.lastStreamToken = q2Var.i();
        if (!this.handshakeComplete) {
            this.handshakeComplete = true;
            ((Callback) this.listener).onHandshakeComplete();
            return;
        }
        this.backoff.reset();
        SnapshotVersion snapshotVersionDecodeVersion = this.serializer.decodeVersion(q2Var.g());
        int iK = q2Var.k();
        ArrayList arrayList = new ArrayList(iK);
        for (int i10 = 0; i10 < iK; i10++) {
            arrayList.add(this.serializer.decodeMutationResult(q2Var.j(i10), snapshotVersionDecodeVersion));
        }
        ((Callback) this.listener).onWriteResponse(snapshotVersionDecodeVersion, arrayList);
    }
}
