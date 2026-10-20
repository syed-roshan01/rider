package com.google.firebase.firestore.proto;

import com.google.protobuf.b2;
import com.google.protobuf.g0;
import com.google.protobuf.h0;
import com.google.protobuf.k0;
import com.google.protobuf.l0;
import com.google.protobuf.n;
import com.google.protobuf.s;
import com.google.protobuf.z;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class MutationQueue extends l0 implements MutationQueueOrBuilder {
    private static final MutationQueue DEFAULT_INSTANCE;
    public static final int LAST_ACKNOWLEDGED_BATCH_ID_FIELD_NUMBER = 1;
    public static final int LAST_STREAM_TOKEN_FIELD_NUMBER = 2;
    private static volatile b2 PARSER;
    private int lastAcknowledgedBatchId_;
    private n lastStreamToken_ = n.f4181b;

    /* JADX INFO: renamed from: com.google.firebase.firestore.proto.MutationQueue$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[k0.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends g0 implements MutationQueueOrBuilder {
        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        public Builder clearLastAcknowledgedBatchId() {
            copyOnWrite();
            ((MutationQueue) this.instance).clearLastAcknowledgedBatchId();
            return this;
        }

        public Builder clearLastStreamToken() {
            copyOnWrite();
            ((MutationQueue) this.instance).clearLastStreamToken();
            return this;
        }

        @Override // com.google.firebase.firestore.proto.MutationQueueOrBuilder
        public int getLastAcknowledgedBatchId() {
            return ((MutationQueue) this.instance).getLastAcknowledgedBatchId();
        }

        @Override // com.google.firebase.firestore.proto.MutationQueueOrBuilder
        public n getLastStreamToken() {
            return ((MutationQueue) this.instance).getLastStreamToken();
        }

        public Builder setLastAcknowledgedBatchId(int i10) {
            copyOnWrite();
            ((MutationQueue) this.instance).setLastAcknowledgedBatchId(i10);
            return this;
        }

        public Builder setLastStreamToken(n nVar) {
            copyOnWrite();
            ((MutationQueue) this.instance).setLastStreamToken(nVar);
            return this;
        }

        private Builder() {
            super(MutationQueue.DEFAULT_INSTANCE);
        }
    }

    static {
        MutationQueue mutationQueue = new MutationQueue();
        DEFAULT_INSTANCE = mutationQueue;
        l0.registerDefaultInstance(MutationQueue.class, mutationQueue);
    }

    private MutationQueue() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastAcknowledgedBatchId() {
        this.lastAcknowledgedBatchId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastStreamToken() {
        this.lastStreamToken_ = getDefaultInstance().getLastStreamToken();
    }

    public static MutationQueue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationQueue parseDelimitedFrom(InputStream inputStream) {
        return (MutationQueue) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationQueue parseFrom(ByteBuffer byteBuffer) {
        return (MutationQueue) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static b2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastAcknowledgedBatchId(int i10) {
        this.lastAcknowledgedBatchId_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastStreamToken(n nVar) {
        nVar.getClass();
        this.lastStreamToken_ = nVar;
    }

    @Override // com.google.protobuf.l0
    public final Object dynamicMethod(k0 k0Var, Object obj, Object obj2) {
        AnonymousClass1 anonymousClass1 = null;
        switch (k0Var.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\n", new Object[]{"lastAcknowledgedBatchId_", "lastStreamToken_"});
            case 3:
                return new MutationQueue();
            case 4:
                return new Builder(anonymousClass1);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (MutationQueue.class) {
                        try {
                            h0Var = PARSER;
                            if (h0Var == null) {
                                h0Var = new h0(DEFAULT_INSTANCE);
                                PARSER = h0Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return h0Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.firebase.firestore.proto.MutationQueueOrBuilder
    public int getLastAcknowledgedBatchId() {
        return this.lastAcknowledgedBatchId_;
    }

    @Override // com.google.firebase.firestore.proto.MutationQueueOrBuilder
    public n getLastStreamToken() {
        return this.lastStreamToken_;
    }

    public static Builder newBuilder(MutationQueue mutationQueue) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(mutationQueue);
    }

    public static MutationQueue parseDelimitedFrom(InputStream inputStream, z zVar) {
        return (MutationQueue) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, zVar);
    }

    public static MutationQueue parseFrom(ByteBuffer byteBuffer, z zVar) {
        return (MutationQueue) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, zVar);
    }

    public static MutationQueue parseFrom(n nVar) {
        return (MutationQueue) l0.parseFrom(DEFAULT_INSTANCE, nVar);
    }

    public static MutationQueue parseFrom(n nVar, z zVar) {
        return (MutationQueue) l0.parseFrom(DEFAULT_INSTANCE, nVar, zVar);
    }

    public static MutationQueue parseFrom(byte[] bArr) {
        return (MutationQueue) l0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationQueue parseFrom(byte[] bArr, z zVar) {
        return (MutationQueue) l0.parseFrom(DEFAULT_INSTANCE, bArr, zVar);
    }

    public static MutationQueue parseFrom(InputStream inputStream) {
        return (MutationQueue) l0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationQueue parseFrom(InputStream inputStream, z zVar) {
        return (MutationQueue) l0.parseFrom(DEFAULT_INSTANCE, inputStream, zVar);
    }

    public static MutationQueue parseFrom(s sVar) {
        return (MutationQueue) l0.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static MutationQueue parseFrom(s sVar, z zVar) {
        return (MutationQueue) l0.parseFrom(DEFAULT_INSTANCE, sVar, zVar);
    }
}
