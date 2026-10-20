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
import o7.w1;
import o7.x1;
import o7.y1;
import o7.z1;

/* JADX INFO: loaded from: classes.dex */
public final class Target extends l0 implements TargetOrBuilder {
    private static final Target DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 6;
    public static final int LAST_LIMBO_FREE_SNAPSHOT_VERSION_FIELD_NUMBER = 7;
    public static final int LAST_LISTEN_SEQUENCE_NUMBER_FIELD_NUMBER = 4;
    private static volatile b2 PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 5;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 3;
    public static final int SNAPSHOT_VERSION_FIELD_NUMBER = 2;
    public static final int TARGET_ID_FIELD_NUMBER = 1;
    private q2 lastLimboFreeSnapshotVersion_;
    private long lastListenSequenceNumber_;
    private q2 snapshotVersion_;
    private int targetId_;
    private Object targetType_;
    private int targetTypeCase_ = 0;
    private n resumeToken_ = n.f4181b;

    /* JADX INFO: renamed from: com.google.firebase.firestore.proto.Target$1, reason: invalid class name */
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

    public static final class Builder extends g0 implements TargetOrBuilder {
        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        public Builder clearDocuments() {
            copyOnWrite();
            ((Target) this.instance).clearDocuments();
            return this;
        }

        public Builder clearLastLimboFreeSnapshotVersion() {
            copyOnWrite();
            ((Target) this.instance).clearLastLimboFreeSnapshotVersion();
            return this;
        }

        public Builder clearLastListenSequenceNumber() {
            copyOnWrite();
            ((Target) this.instance).clearLastListenSequenceNumber();
            return this;
        }

        public Builder clearQuery() {
            copyOnWrite();
            ((Target) this.instance).clearQuery();
            return this;
        }

        public Builder clearResumeToken() {
            copyOnWrite();
            ((Target) this.instance).clearResumeToken();
            return this;
        }

        public Builder clearSnapshotVersion() {
            copyOnWrite();
            ((Target) this.instance).clearSnapshotVersion();
            return this;
        }

        public Builder clearTargetId() {
            copyOnWrite();
            ((Target) this.instance).clearTargetId();
            return this;
        }

        public Builder clearTargetType() {
            copyOnWrite();
            ((Target) this.instance).clearTargetType();
            return this;
        }

        @Override // com.google.firebase.firestore.proto.TargetOrBuilder
        public x1 getDocuments() {
            return ((Target) this.instance).getDocuments();
        }

        @Override // com.google.firebase.firestore.proto.TargetOrBuilder
        public q2 getLastLimboFreeSnapshotVersion() {
            return ((Target) this.instance).getLastLimboFreeSnapshotVersion();
        }

        @Override // com.google.firebase.firestore.proto.TargetOrBuilder
        public long getLastListenSequenceNumber() {
            return ((Target) this.instance).getLastListenSequenceNumber();
        }

        @Override // com.google.firebase.firestore.proto.TargetOrBuilder
        public z1 getQuery() {
            return ((Target) this.instance).getQuery();
        }

        @Override // com.google.firebase.firestore.proto.TargetOrBuilder
        public n getResumeToken() {
            return ((Target) this.instance).getResumeToken();
        }

        @Override // com.google.firebase.firestore.proto.TargetOrBuilder
        public q2 getSnapshotVersion() {
            return ((Target) this.instance).getSnapshotVersion();
        }

        @Override // com.google.firebase.firestore.proto.TargetOrBuilder
        public int getTargetId() {
            return ((Target) this.instance).getTargetId();
        }

        @Override // com.google.firebase.firestore.proto.TargetOrBuilder
        public TargetTypeCase getTargetTypeCase() {
            return ((Target) this.instance).getTargetTypeCase();
        }

        @Override // com.google.firebase.firestore.proto.TargetOrBuilder
        public boolean hasDocuments() {
            return ((Target) this.instance).hasDocuments();
        }

        @Override // com.google.firebase.firestore.proto.TargetOrBuilder
        public boolean hasLastLimboFreeSnapshotVersion() {
            return ((Target) this.instance).hasLastLimboFreeSnapshotVersion();
        }

        @Override // com.google.firebase.firestore.proto.TargetOrBuilder
        public boolean hasQuery() {
            return ((Target) this.instance).hasQuery();
        }

        @Override // com.google.firebase.firestore.proto.TargetOrBuilder
        public boolean hasSnapshotVersion() {
            return ((Target) this.instance).hasSnapshotVersion();
        }

        public Builder mergeDocuments(x1 x1Var) {
            copyOnWrite();
            ((Target) this.instance).mergeDocuments(x1Var);
            return this;
        }

        public Builder mergeLastLimboFreeSnapshotVersion(q2 q2Var) {
            copyOnWrite();
            ((Target) this.instance).mergeLastLimboFreeSnapshotVersion(q2Var);
            return this;
        }

        public Builder mergeQuery(z1 z1Var) {
            copyOnWrite();
            ((Target) this.instance).mergeQuery(z1Var);
            return this;
        }

        public Builder mergeSnapshotVersion(q2 q2Var) {
            copyOnWrite();
            ((Target) this.instance).mergeSnapshotVersion(q2Var);
            return this;
        }

        public Builder setDocuments(x1 x1Var) {
            copyOnWrite();
            ((Target) this.instance).setDocuments(x1Var);
            return this;
        }

        public Builder setLastLimboFreeSnapshotVersion(q2 q2Var) {
            copyOnWrite();
            ((Target) this.instance).setLastLimboFreeSnapshotVersion(q2Var);
            return this;
        }

        public Builder setLastListenSequenceNumber(long j10) {
            copyOnWrite();
            ((Target) this.instance).setLastListenSequenceNumber(j10);
            return this;
        }

        public Builder setQuery(z1 z1Var) {
            copyOnWrite();
            ((Target) this.instance).setQuery(z1Var);
            return this;
        }

        public Builder setResumeToken(n nVar) {
            copyOnWrite();
            ((Target) this.instance).setResumeToken(nVar);
            return this;
        }

        public Builder setSnapshotVersion(q2 q2Var) {
            copyOnWrite();
            ((Target) this.instance).setSnapshotVersion(q2Var);
            return this;
        }

        public Builder setTargetId(int i10) {
            copyOnWrite();
            ((Target) this.instance).setTargetId(i10);
            return this;
        }

        private Builder() {
            super(Target.DEFAULT_INSTANCE);
        }

        public Builder setDocuments(w1 w1Var) {
            copyOnWrite();
            ((Target) this.instance).setDocuments((x1) w1Var.m3997build());
            return this;
        }

        public Builder setLastLimboFreeSnapshotVersion(p2 p2Var) {
            copyOnWrite();
            ((Target) this.instance).setLastLimboFreeSnapshotVersion((q2) p2Var.m3997build());
            return this;
        }

        public Builder setQuery(y1 y1Var) {
            copyOnWrite();
            ((Target) this.instance).setQuery((z1) y1Var.m3997build());
            return this;
        }

        public Builder setSnapshotVersion(p2 p2Var) {
            copyOnWrite();
            ((Target) this.instance).setSnapshotVersion((q2) p2Var.m3997build());
            return this;
        }
    }

    public enum TargetTypeCase {
        QUERY(5),
        DOCUMENTS(6),
        TARGETTYPE_NOT_SET(0);

        private final int value;

        TargetTypeCase(int i10) {
            this.value = i10;
        }

        public static TargetTypeCase forNumber(int i10) {
            if (i10 == 0) {
                return TARGETTYPE_NOT_SET;
            }
            if (i10 == 5) {
                return QUERY;
            }
            if (i10 != 6) {
                return null;
            }
            return DOCUMENTS;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static TargetTypeCase valueOf(int i10) {
            return forNumber(i10);
        }
    }

    static {
        Target target = new Target();
        DEFAULT_INSTANCE = target;
        l0.registerDefaultInstance(Target.class, target);
    }

    private Target() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDocuments() {
        if (this.targetTypeCase_ == 6) {
            this.targetTypeCase_ = 0;
            this.targetType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastLimboFreeSnapshotVersion() {
        this.lastLimboFreeSnapshotVersion_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastListenSequenceNumber() {
        this.lastListenSequenceNumber_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuery() {
        if (this.targetTypeCase_ == 5) {
            this.targetTypeCase_ = 0;
            this.targetType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResumeToken() {
        this.resumeToken_ = getDefaultInstance().getResumeToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSnapshotVersion() {
        this.snapshotVersion_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTargetId() {
        this.targetId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTargetType() {
        this.targetTypeCase_ = 0;
        this.targetType_ = null;
    }

    public static Target getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDocuments(x1 x1Var) {
        x1Var.getClass();
        if (this.targetTypeCase_ != 6 || this.targetType_ == x1.g()) {
            this.targetType_ = x1Var;
        } else {
            this.targetType_ = ((w1) x1.k((x1) this.targetType_).mergeFrom((l0) x1Var)).buildPartial();
        }
        this.targetTypeCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLastLimboFreeSnapshotVersion(q2 q2Var) {
        q2Var.getClass();
        q2 q2Var2 = this.lastLimboFreeSnapshotVersion_;
        if (q2Var2 == null || q2Var2 == q2.h()) {
            this.lastLimboFreeSnapshotVersion_ = q2Var;
        } else {
            this.lastLimboFreeSnapshotVersion_ = (q2) ((p2) q2.l(this.lastLimboFreeSnapshotVersion_).mergeFrom((l0) q2Var)).buildPartial();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeQuery(z1 z1Var) {
        z1Var.getClass();
        if (this.targetTypeCase_ != 5 || this.targetType_ == z1.h()) {
            this.targetType_ = z1Var;
        } else {
            this.targetType_ = ((y1) z1.l((z1) this.targetType_).mergeFrom((l0) z1Var)).buildPartial();
        }
        this.targetTypeCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSnapshotVersion(q2 q2Var) {
        q2Var.getClass();
        q2 q2Var2 = this.snapshotVersion_;
        if (q2Var2 == null || q2Var2 == q2.h()) {
            this.snapshotVersion_ = q2Var;
        } else {
            this.snapshotVersion_ = (q2) ((p2) q2.l(this.snapshotVersion_).mergeFrom((l0) q2Var)).buildPartial();
        }
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Target parseDelimitedFrom(InputStream inputStream) {
        return (Target) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Target parseFrom(ByteBuffer byteBuffer) {
        return (Target) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static b2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocuments(x1 x1Var) {
        x1Var.getClass();
        this.targetType_ = x1Var;
        this.targetTypeCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastLimboFreeSnapshotVersion(q2 q2Var) {
        q2Var.getClass();
        this.lastLimboFreeSnapshotVersion_ = q2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastListenSequenceNumber(long j10) {
        this.lastListenSequenceNumber_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuery(z1 z1Var) {
        z1Var.getClass();
        this.targetType_ = z1Var;
        this.targetTypeCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResumeToken(n nVar) {
        nVar.getClass();
        this.resumeToken_ = nVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSnapshotVersion(q2 q2Var) {
        q2Var.getClass();
        this.snapshotVersion_ = q2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargetId(int i10) {
        this.targetId_ = i10;
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
                return l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002\t\u0003\n\u0004\u0002\u0005<\u0000\u0006<\u0000\u0007\t", new Object[]{"targetType_", "targetTypeCase_", "targetId_", "snapshotVersion_", "resumeToken_", "lastListenSequenceNumber_", z1.class, x1.class, "lastLimboFreeSnapshotVersion_"});
            case 3:
                return new Target();
            case 4:
                return new Builder(anonymousClass1);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (Target.class) {
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

    @Override // com.google.firebase.firestore.proto.TargetOrBuilder
    public x1 getDocuments() {
        return this.targetTypeCase_ == 6 ? (x1) this.targetType_ : x1.g();
    }

    @Override // com.google.firebase.firestore.proto.TargetOrBuilder
    public q2 getLastLimboFreeSnapshotVersion() {
        q2 q2Var = this.lastLimboFreeSnapshotVersion_;
        return q2Var == null ? q2.h() : q2Var;
    }

    @Override // com.google.firebase.firestore.proto.TargetOrBuilder
    public long getLastListenSequenceNumber() {
        return this.lastListenSequenceNumber_;
    }

    @Override // com.google.firebase.firestore.proto.TargetOrBuilder
    public z1 getQuery() {
        return this.targetTypeCase_ == 5 ? (z1) this.targetType_ : z1.h();
    }

    @Override // com.google.firebase.firestore.proto.TargetOrBuilder
    public n getResumeToken() {
        return this.resumeToken_;
    }

    @Override // com.google.firebase.firestore.proto.TargetOrBuilder
    public q2 getSnapshotVersion() {
        q2 q2Var = this.snapshotVersion_;
        return q2Var == null ? q2.h() : q2Var;
    }

    @Override // com.google.firebase.firestore.proto.TargetOrBuilder
    public int getTargetId() {
        return this.targetId_;
    }

    @Override // com.google.firebase.firestore.proto.TargetOrBuilder
    public TargetTypeCase getTargetTypeCase() {
        return TargetTypeCase.forNumber(this.targetTypeCase_);
    }

    @Override // com.google.firebase.firestore.proto.TargetOrBuilder
    public boolean hasDocuments() {
        return this.targetTypeCase_ == 6;
    }

    @Override // com.google.firebase.firestore.proto.TargetOrBuilder
    public boolean hasLastLimboFreeSnapshotVersion() {
        return this.lastLimboFreeSnapshotVersion_ != null;
    }

    @Override // com.google.firebase.firestore.proto.TargetOrBuilder
    public boolean hasQuery() {
        return this.targetTypeCase_ == 5;
    }

    @Override // com.google.firebase.firestore.proto.TargetOrBuilder
    public boolean hasSnapshotVersion() {
        return this.snapshotVersion_ != null;
    }

    public static Builder newBuilder(Target target) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(target);
    }

    public static Target parseDelimitedFrom(InputStream inputStream, z zVar) {
        return (Target) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, zVar);
    }

    public static Target parseFrom(ByteBuffer byteBuffer, z zVar) {
        return (Target) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, zVar);
    }

    public static Target parseFrom(n nVar) {
        return (Target) l0.parseFrom(DEFAULT_INSTANCE, nVar);
    }

    public static Target parseFrom(n nVar, z zVar) {
        return (Target) l0.parseFrom(DEFAULT_INSTANCE, nVar, zVar);
    }

    public static Target parseFrom(byte[] bArr) {
        return (Target) l0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Target parseFrom(byte[] bArr, z zVar) {
        return (Target) l0.parseFrom(DEFAULT_INSTANCE, bArr, zVar);
    }

    public static Target parseFrom(InputStream inputStream) {
        return (Target) l0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Target parseFrom(InputStream inputStream, z zVar) {
        return (Target) l0.parseFrom(DEFAULT_INSTANCE, inputStream, zVar);
    }

    public static Target parseFrom(s sVar) {
        return (Target) l0.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static Target parseFrom(s sVar, z zVar) {
        return (Target) l0.parseFrom(DEFAULT_INSTANCE, sVar, zVar);
    }
}
