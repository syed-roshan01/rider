package com.google.firebase.firestore.proto;

import com.google.protobuf.b2;
import com.google.protobuf.g0;
import com.google.protobuf.h0;
import com.google.protobuf.k0;
import com.google.protobuf.l0;
import com.google.protobuf.n;
import com.google.protobuf.p2;
import com.google.protobuf.q2;
import com.google.protobuf.s;
import com.google.protobuf.z;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class TargetGlobal extends l0 implements TargetGlobalOrBuilder {
    private static final TargetGlobal DEFAULT_INSTANCE;
    public static final int HIGHEST_LISTEN_SEQUENCE_NUMBER_FIELD_NUMBER = 2;
    public static final int HIGHEST_TARGET_ID_FIELD_NUMBER = 1;
    public static final int LAST_REMOTE_SNAPSHOT_VERSION_FIELD_NUMBER = 3;
    private static volatile b2 PARSER = null;
    public static final int TARGET_COUNT_FIELD_NUMBER = 4;
    private long highestListenSequenceNumber_;
    private int highestTargetId_;
    private q2 lastRemoteSnapshotVersion_;
    private int targetCount_;

    /* JADX INFO: renamed from: com.google.firebase.firestore.proto.TargetGlobal$1, reason: invalid class name */
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

    public static final class Builder extends g0 implements TargetGlobalOrBuilder {
        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        public Builder clearHighestListenSequenceNumber() {
            copyOnWrite();
            ((TargetGlobal) this.instance).clearHighestListenSequenceNumber();
            return this;
        }

        public Builder clearHighestTargetId() {
            copyOnWrite();
            ((TargetGlobal) this.instance).clearHighestTargetId();
            return this;
        }

        public Builder clearLastRemoteSnapshotVersion() {
            copyOnWrite();
            ((TargetGlobal) this.instance).clearLastRemoteSnapshotVersion();
            return this;
        }

        public Builder clearTargetCount() {
            copyOnWrite();
            ((TargetGlobal) this.instance).clearTargetCount();
            return this;
        }

        @Override // com.google.firebase.firestore.proto.TargetGlobalOrBuilder
        public long getHighestListenSequenceNumber() {
            return ((TargetGlobal) this.instance).getHighestListenSequenceNumber();
        }

        @Override // com.google.firebase.firestore.proto.TargetGlobalOrBuilder
        public int getHighestTargetId() {
            return ((TargetGlobal) this.instance).getHighestTargetId();
        }

        @Override // com.google.firebase.firestore.proto.TargetGlobalOrBuilder
        public q2 getLastRemoteSnapshotVersion() {
            return ((TargetGlobal) this.instance).getLastRemoteSnapshotVersion();
        }

        @Override // com.google.firebase.firestore.proto.TargetGlobalOrBuilder
        public int getTargetCount() {
            return ((TargetGlobal) this.instance).getTargetCount();
        }

        @Override // com.google.firebase.firestore.proto.TargetGlobalOrBuilder
        public boolean hasLastRemoteSnapshotVersion() {
            return ((TargetGlobal) this.instance).hasLastRemoteSnapshotVersion();
        }

        public Builder mergeLastRemoteSnapshotVersion(q2 q2Var) {
            copyOnWrite();
            ((TargetGlobal) this.instance).mergeLastRemoteSnapshotVersion(q2Var);
            return this;
        }

        public Builder setHighestListenSequenceNumber(long j10) {
            copyOnWrite();
            ((TargetGlobal) this.instance).setHighestListenSequenceNumber(j10);
            return this;
        }

        public Builder setHighestTargetId(int i10) {
            copyOnWrite();
            ((TargetGlobal) this.instance).setHighestTargetId(i10);
            return this;
        }

        public Builder setLastRemoteSnapshotVersion(q2 q2Var) {
            copyOnWrite();
            ((TargetGlobal) this.instance).setLastRemoteSnapshotVersion(q2Var);
            return this;
        }

        public Builder setTargetCount(int i10) {
            copyOnWrite();
            ((TargetGlobal) this.instance).setTargetCount(i10);
            return this;
        }

        private Builder() {
            super(TargetGlobal.DEFAULT_INSTANCE);
        }

        public Builder setLastRemoteSnapshotVersion(p2 p2Var) {
            copyOnWrite();
            ((TargetGlobal) this.instance).setLastRemoteSnapshotVersion((q2) p2Var.m3997build());
            return this;
        }
    }

    static {
        TargetGlobal targetGlobal = new TargetGlobal();
        DEFAULT_INSTANCE = targetGlobal;
        l0.registerDefaultInstance(TargetGlobal.class, targetGlobal);
    }

    private TargetGlobal() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHighestListenSequenceNumber() {
        this.highestListenSequenceNumber_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHighestTargetId() {
        this.highestTargetId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastRemoteSnapshotVersion() {
        this.lastRemoteSnapshotVersion_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTargetCount() {
        this.targetCount_ = 0;
    }

    public static TargetGlobal getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLastRemoteSnapshotVersion(q2 q2Var) {
        q2Var.getClass();
        q2 q2Var2 = this.lastRemoteSnapshotVersion_;
        if (q2Var2 == null || q2Var2 == q2.h()) {
            this.lastRemoteSnapshotVersion_ = q2Var;
        } else {
            this.lastRemoteSnapshotVersion_ = (q2) ((p2) q2.l(this.lastRemoteSnapshotVersion_).mergeFrom((l0) q2Var)).buildPartial();
        }
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static TargetGlobal parseDelimitedFrom(InputStream inputStream) {
        return (TargetGlobal) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TargetGlobal parseFrom(ByteBuffer byteBuffer) {
        return (TargetGlobal) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static b2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHighestListenSequenceNumber(long j10) {
        this.highestListenSequenceNumber_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHighestTargetId(int i10) {
        this.highestTargetId_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastRemoteSnapshotVersion(q2 q2Var) {
        q2Var.getClass();
        this.lastRemoteSnapshotVersion_ = q2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargetCount(int i10) {
        this.targetCount_ = i10;
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
                return l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\t\u0004\u0004", new Object[]{"highestTargetId_", "highestListenSequenceNumber_", "lastRemoteSnapshotVersion_", "targetCount_"});
            case 3:
                return new TargetGlobal();
            case 4:
                return new Builder(anonymousClass1);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (TargetGlobal.class) {
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

    @Override // com.google.firebase.firestore.proto.TargetGlobalOrBuilder
    public long getHighestListenSequenceNumber() {
        return this.highestListenSequenceNumber_;
    }

    @Override // com.google.firebase.firestore.proto.TargetGlobalOrBuilder
    public int getHighestTargetId() {
        return this.highestTargetId_;
    }

    @Override // com.google.firebase.firestore.proto.TargetGlobalOrBuilder
    public q2 getLastRemoteSnapshotVersion() {
        q2 q2Var = this.lastRemoteSnapshotVersion_;
        return q2Var == null ? q2.h() : q2Var;
    }

    @Override // com.google.firebase.firestore.proto.TargetGlobalOrBuilder
    public int getTargetCount() {
        return this.targetCount_;
    }

    @Override // com.google.firebase.firestore.proto.TargetGlobalOrBuilder
    public boolean hasLastRemoteSnapshotVersion() {
        return this.lastRemoteSnapshotVersion_ != null;
    }

    public static Builder newBuilder(TargetGlobal targetGlobal) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(targetGlobal);
    }

    public static TargetGlobal parseDelimitedFrom(InputStream inputStream, z zVar) {
        return (TargetGlobal) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, zVar);
    }

    public static TargetGlobal parseFrom(ByteBuffer byteBuffer, z zVar) {
        return (TargetGlobal) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, zVar);
    }

    public static TargetGlobal parseFrom(n nVar) {
        return (TargetGlobal) l0.parseFrom(DEFAULT_INSTANCE, nVar);
    }

    public static TargetGlobal parseFrom(n nVar, z zVar) {
        return (TargetGlobal) l0.parseFrom(DEFAULT_INSTANCE, nVar, zVar);
    }

    public static TargetGlobal parseFrom(byte[] bArr) {
        return (TargetGlobal) l0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TargetGlobal parseFrom(byte[] bArr, z zVar) {
        return (TargetGlobal) l0.parseFrom(DEFAULT_INSTANCE, bArr, zVar);
    }

    public static TargetGlobal parseFrom(InputStream inputStream) {
        return (TargetGlobal) l0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TargetGlobal parseFrom(InputStream inputStream, z zVar) {
        return (TargetGlobal) l0.parseFrom(DEFAULT_INSTANCE, inputStream, zVar);
    }

    public static TargetGlobal parseFrom(s sVar) {
        return (TargetGlobal) l0.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static TargetGlobal parseFrom(s sVar, z zVar) {
        return (TargetGlobal) l0.parseFrom(DEFAULT_INSTANCE, sVar, zVar);
    }
}
