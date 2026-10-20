package com.google.firebase.firestore.proto;

import com.google.protobuf.b2;
import com.google.protobuf.c;
import com.google.protobuf.d;
import com.google.protobuf.g0;
import com.google.protobuf.h0;
import com.google.protobuf.k0;
import com.google.protobuf.l0;
import com.google.protobuf.n;
import com.google.protobuf.p2;
import com.google.protobuf.q2;
import com.google.protobuf.s;
import com.google.protobuf.x0;
import com.google.protobuf.z;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import o7.j2;
import o7.l2;
import o7.m2;

/* JADX INFO: loaded from: classes.dex */
public final class WriteBatch extends l0 implements WriteBatchOrBuilder {
    public static final int BASE_WRITES_FIELD_NUMBER = 4;
    public static final int BATCH_ID_FIELD_NUMBER = 1;
    private static final WriteBatch DEFAULT_INSTANCE;
    public static final int LOCAL_WRITE_TIME_FIELD_NUMBER = 3;
    private static volatile b2 PARSER = null;
    public static final int WRITES_FIELD_NUMBER = 2;
    private int batchId_;
    private q2 localWriteTime_;
    private x0 writes_ = l0.emptyProtobufList();
    private x0 baseWrites_ = l0.emptyProtobufList();

    /* JADX INFO: renamed from: com.google.firebase.firestore.proto.WriteBatch$1, reason: invalid class name */
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

    public static final class Builder extends g0 implements WriteBatchOrBuilder {
        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        public Builder addAllBaseWrites(Iterable<? extends l2> iterable) {
            copyOnWrite();
            ((WriteBatch) this.instance).addAllBaseWrites(iterable);
            return this;
        }

        public Builder addAllWrites(Iterable<? extends l2> iterable) {
            copyOnWrite();
            ((WriteBatch) this.instance).addAllWrites(iterable);
            return this;
        }

        public Builder addBaseWrites(l2 l2Var) {
            copyOnWrite();
            ((WriteBatch) this.instance).addBaseWrites(l2Var);
            return this;
        }

        public Builder addWrites(l2 l2Var) {
            copyOnWrite();
            ((WriteBatch) this.instance).addWrites(l2Var);
            return this;
        }

        public Builder clearBaseWrites() {
            copyOnWrite();
            ((WriteBatch) this.instance).clearBaseWrites();
            return this;
        }

        public Builder clearBatchId() {
            copyOnWrite();
            ((WriteBatch) this.instance).clearBatchId();
            return this;
        }

        public Builder clearLocalWriteTime() {
            copyOnWrite();
            ((WriteBatch) this.instance).clearLocalWriteTime();
            return this;
        }

        public Builder clearWrites() {
            copyOnWrite();
            ((WriteBatch) this.instance).clearWrites();
            return this;
        }

        @Override // com.google.firebase.firestore.proto.WriteBatchOrBuilder
        public l2 getBaseWrites(int i10) {
            return ((WriteBatch) this.instance).getBaseWrites(i10);
        }

        @Override // com.google.firebase.firestore.proto.WriteBatchOrBuilder
        public int getBaseWritesCount() {
            return ((WriteBatch) this.instance).getBaseWritesCount();
        }

        @Override // com.google.firebase.firestore.proto.WriteBatchOrBuilder
        public List<l2> getBaseWritesList() {
            return Collections.unmodifiableList(((WriteBatch) this.instance).getBaseWritesList());
        }

        @Override // com.google.firebase.firestore.proto.WriteBatchOrBuilder
        public int getBatchId() {
            return ((WriteBatch) this.instance).getBatchId();
        }

        @Override // com.google.firebase.firestore.proto.WriteBatchOrBuilder
        public q2 getLocalWriteTime() {
            return ((WriteBatch) this.instance).getLocalWriteTime();
        }

        @Override // com.google.firebase.firestore.proto.WriteBatchOrBuilder
        public l2 getWrites(int i10) {
            return ((WriteBatch) this.instance).getWrites(i10);
        }

        @Override // com.google.firebase.firestore.proto.WriteBatchOrBuilder
        public int getWritesCount() {
            return ((WriteBatch) this.instance).getWritesCount();
        }

        @Override // com.google.firebase.firestore.proto.WriteBatchOrBuilder
        public List<l2> getWritesList() {
            return Collections.unmodifiableList(((WriteBatch) this.instance).getWritesList());
        }

        @Override // com.google.firebase.firestore.proto.WriteBatchOrBuilder
        public boolean hasLocalWriteTime() {
            return ((WriteBatch) this.instance).hasLocalWriteTime();
        }

        public Builder mergeLocalWriteTime(q2 q2Var) {
            copyOnWrite();
            ((WriteBatch) this.instance).mergeLocalWriteTime(q2Var);
            return this;
        }

        public Builder removeBaseWrites(int i10) {
            copyOnWrite();
            ((WriteBatch) this.instance).removeBaseWrites(i10);
            return this;
        }

        public Builder removeWrites(int i10) {
            copyOnWrite();
            ((WriteBatch) this.instance).removeWrites(i10);
            return this;
        }

        public Builder setBaseWrites(int i10, l2 l2Var) {
            copyOnWrite();
            ((WriteBatch) this.instance).setBaseWrites(i10, l2Var);
            return this;
        }

        public Builder setBatchId(int i10) {
            copyOnWrite();
            ((WriteBatch) this.instance).setBatchId(i10);
            return this;
        }

        public Builder setLocalWriteTime(q2 q2Var) {
            copyOnWrite();
            ((WriteBatch) this.instance).setLocalWriteTime(q2Var);
            return this;
        }

        public Builder setWrites(int i10, l2 l2Var) {
            copyOnWrite();
            ((WriteBatch) this.instance).setWrites(i10, l2Var);
            return this;
        }

        private Builder() {
            super(WriteBatch.DEFAULT_INSTANCE);
        }

        public Builder addBaseWrites(int i10, l2 l2Var) {
            copyOnWrite();
            ((WriteBatch) this.instance).addBaseWrites(i10, l2Var);
            return this;
        }

        public Builder addWrites(int i10, l2 l2Var) {
            copyOnWrite();
            ((WriteBatch) this.instance).addWrites(i10, l2Var);
            return this;
        }

        public Builder setBaseWrites(int i10, j2 j2Var) {
            copyOnWrite();
            ((WriteBatch) this.instance).setBaseWrites(i10, (l2) j2Var.m3997build());
            return this;
        }

        public Builder setLocalWriteTime(p2 p2Var) {
            copyOnWrite();
            ((WriteBatch) this.instance).setLocalWriteTime((q2) p2Var.m3997build());
            return this;
        }

        public Builder setWrites(int i10, j2 j2Var) {
            copyOnWrite();
            ((WriteBatch) this.instance).setWrites(i10, (l2) j2Var.m3997build());
            return this;
        }

        public Builder addBaseWrites(j2 j2Var) {
            copyOnWrite();
            ((WriteBatch) this.instance).addBaseWrites((l2) j2Var.m3997build());
            return this;
        }

        public Builder addWrites(j2 j2Var) {
            copyOnWrite();
            ((WriteBatch) this.instance).addWrites((l2) j2Var.m3997build());
            return this;
        }

        public Builder addBaseWrites(int i10, j2 j2Var) {
            copyOnWrite();
            ((WriteBatch) this.instance).addBaseWrites(i10, (l2) j2Var.m3997build());
            return this;
        }

        public Builder addWrites(int i10, j2 j2Var) {
            copyOnWrite();
            ((WriteBatch) this.instance).addWrites(i10, (l2) j2Var.m3997build());
            return this;
        }
    }

    static {
        WriteBatch writeBatch = new WriteBatch();
        DEFAULT_INSTANCE = writeBatch;
        l0.registerDefaultInstance(WriteBatch.class, writeBatch);
    }

    private WriteBatch() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBaseWrites(Iterable<? extends l2> iterable) {
        ensureBaseWritesIsMutable();
        c.addAll((Iterable) iterable, (List) this.baseWrites_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllWrites(Iterable<? extends l2> iterable) {
        ensureWritesIsMutable();
        c.addAll((Iterable) iterable, (List) this.writes_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBaseWrites(l2 l2Var) {
        l2Var.getClass();
        ensureBaseWritesIsMutable();
        this.baseWrites_.add(l2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWrites(l2 l2Var) {
        l2Var.getClass();
        ensureWritesIsMutable();
        this.writes_.add(l2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBaseWrites() {
        this.baseWrites_ = l0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBatchId() {
        this.batchId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocalWriteTime() {
        this.localWriteTime_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWrites() {
        this.writes_ = l0.emptyProtobufList();
    }

    private void ensureBaseWritesIsMutable() {
        x0 x0Var = this.baseWrites_;
        if (((d) x0Var).f4087a) {
            return;
        }
        this.baseWrites_ = l0.mutableCopy(x0Var);
    }

    private void ensureWritesIsMutable() {
        x0 x0Var = this.writes_;
        if (((d) x0Var).f4087a) {
            return;
        }
        this.writes_ = l0.mutableCopy(x0Var);
    }

    public static WriteBatch getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLocalWriteTime(q2 q2Var) {
        q2Var.getClass();
        q2 q2Var2 = this.localWriteTime_;
        if (q2Var2 == null || q2Var2 == q2.h()) {
            this.localWriteTime_ = q2Var;
        } else {
            this.localWriteTime_ = (q2) ((p2) q2.l(this.localWriteTime_).mergeFrom((l0) q2Var)).buildPartial();
        }
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static WriteBatch parseDelimitedFrom(InputStream inputStream) {
        return (WriteBatch) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WriteBatch parseFrom(ByteBuffer byteBuffer) {
        return (WriteBatch) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static b2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeBaseWrites(int i10) {
        ensureBaseWritesIsMutable();
        this.baseWrites_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeWrites(int i10) {
        ensureWritesIsMutable();
        this.writes_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBaseWrites(int i10, l2 l2Var) {
        l2Var.getClass();
        ensureBaseWritesIsMutable();
        this.baseWrites_.set(i10, l2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBatchId(int i10) {
        this.batchId_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocalWriteTime(q2 q2Var) {
        q2Var.getClass();
        this.localWriteTime_ = q2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWrites(int i10, l2 l2Var) {
        l2Var.getClass();
        ensureWritesIsMutable();
        this.writes_.set(i10, l2Var);
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
                return l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u0004\u0002\u001b\u0003\t\u0004\u001b", new Object[]{"batchId_", "writes_", l2.class, "localWriteTime_", "baseWrites_", l2.class});
            case 3:
                return new WriteBatch();
            case 4:
                return new Builder(anonymousClass1);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (WriteBatch.class) {
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

    @Override // com.google.firebase.firestore.proto.WriteBatchOrBuilder
    public l2 getBaseWrites(int i10) {
        return (l2) this.baseWrites_.get(i10);
    }

    @Override // com.google.firebase.firestore.proto.WriteBatchOrBuilder
    public int getBaseWritesCount() {
        return this.baseWrites_.size();
    }

    @Override // com.google.firebase.firestore.proto.WriteBatchOrBuilder
    public List<l2> getBaseWritesList() {
        return this.baseWrites_;
    }

    public m2 getBaseWritesOrBuilder(int i10) {
        return (m2) this.baseWrites_.get(i10);
    }

    public List<? extends m2> getBaseWritesOrBuilderList() {
        return this.baseWrites_;
    }

    @Override // com.google.firebase.firestore.proto.WriteBatchOrBuilder
    public int getBatchId() {
        return this.batchId_;
    }

    @Override // com.google.firebase.firestore.proto.WriteBatchOrBuilder
    public q2 getLocalWriteTime() {
        q2 q2Var = this.localWriteTime_;
        return q2Var == null ? q2.h() : q2Var;
    }

    @Override // com.google.firebase.firestore.proto.WriteBatchOrBuilder
    public l2 getWrites(int i10) {
        return (l2) this.writes_.get(i10);
    }

    @Override // com.google.firebase.firestore.proto.WriteBatchOrBuilder
    public int getWritesCount() {
        return this.writes_.size();
    }

    @Override // com.google.firebase.firestore.proto.WriteBatchOrBuilder
    public List<l2> getWritesList() {
        return this.writes_;
    }

    public m2 getWritesOrBuilder(int i10) {
        return (m2) this.writes_.get(i10);
    }

    public List<? extends m2> getWritesOrBuilderList() {
        return this.writes_;
    }

    @Override // com.google.firebase.firestore.proto.WriteBatchOrBuilder
    public boolean hasLocalWriteTime() {
        return this.localWriteTime_ != null;
    }

    public static Builder newBuilder(WriteBatch writeBatch) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(writeBatch);
    }

    public static WriteBatch parseDelimitedFrom(InputStream inputStream, z zVar) {
        return (WriteBatch) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, zVar);
    }

    public static WriteBatch parseFrom(ByteBuffer byteBuffer, z zVar) {
        return (WriteBatch) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, zVar);
    }

    public static WriteBatch parseFrom(n nVar) {
        return (WriteBatch) l0.parseFrom(DEFAULT_INSTANCE, nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBaseWrites(int i10, l2 l2Var) {
        l2Var.getClass();
        ensureBaseWritesIsMutable();
        this.baseWrites_.add(i10, l2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWrites(int i10, l2 l2Var) {
        l2Var.getClass();
        ensureWritesIsMutable();
        this.writes_.add(i10, l2Var);
    }

    public static WriteBatch parseFrom(n nVar, z zVar) {
        return (WriteBatch) l0.parseFrom(DEFAULT_INSTANCE, nVar, zVar);
    }

    public static WriteBatch parseFrom(byte[] bArr) {
        return (WriteBatch) l0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WriteBatch parseFrom(byte[] bArr, z zVar) {
        return (WriteBatch) l0.parseFrom(DEFAULT_INSTANCE, bArr, zVar);
    }

    public static WriteBatch parseFrom(InputStream inputStream) {
        return (WriteBatch) l0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WriteBatch parseFrom(InputStream inputStream, z zVar) {
        return (WriteBatch) l0.parseFrom(DEFAULT_INSTANCE, inputStream, zVar);
    }

    public static WriteBatch parseFrom(s sVar) {
        return (WriteBatch) l0.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static WriteBatch parseFrom(s sVar, z zVar) {
        return (WriteBatch) l0.parseFrom(DEFAULT_INSTANCE, sVar, zVar);
    }
}
