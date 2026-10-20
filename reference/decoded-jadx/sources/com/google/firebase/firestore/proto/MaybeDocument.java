package com.google.firebase.firestore.proto;

import com.google.protobuf.b2;
import com.google.protobuf.g0;
import com.google.protobuf.h0;
import com.google.protobuf.k0;
import com.google.protobuf.l0;
import com.google.protobuf.n;
import com.google.protobuf.z;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o7.q;
import o7.s;

/* JADX INFO: loaded from: classes.dex */
public final class MaybeDocument extends l0 implements MaybeDocumentOrBuilder {
    private static final MaybeDocument DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 2;
    public static final int HAS_COMMITTED_MUTATIONS_FIELD_NUMBER = 4;
    public static final int NO_DOCUMENT_FIELD_NUMBER = 1;
    private static volatile b2 PARSER = null;
    public static final int UNKNOWN_DOCUMENT_FIELD_NUMBER = 3;
    private int documentTypeCase_ = 0;
    private Object documentType_;
    private boolean hasCommittedMutations_;

    /* JADX INFO: renamed from: com.google.firebase.firestore.proto.MaybeDocument$1, reason: invalid class name */
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

    public static final class Builder extends g0 implements MaybeDocumentOrBuilder {
        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        public Builder clearDocument() {
            copyOnWrite();
            ((MaybeDocument) this.instance).clearDocument();
            return this;
        }

        public Builder clearDocumentType() {
            copyOnWrite();
            ((MaybeDocument) this.instance).clearDocumentType();
            return this;
        }

        public Builder clearHasCommittedMutations() {
            copyOnWrite();
            ((MaybeDocument) this.instance).clearHasCommittedMutations();
            return this;
        }

        public Builder clearNoDocument() {
            copyOnWrite();
            ((MaybeDocument) this.instance).clearNoDocument();
            return this;
        }

        public Builder clearUnknownDocument() {
            copyOnWrite();
            ((MaybeDocument) this.instance).clearUnknownDocument();
            return this;
        }

        @Override // com.google.firebase.firestore.proto.MaybeDocumentOrBuilder
        public s getDocument() {
            return ((MaybeDocument) this.instance).getDocument();
        }

        @Override // com.google.firebase.firestore.proto.MaybeDocumentOrBuilder
        public DocumentTypeCase getDocumentTypeCase() {
            return ((MaybeDocument) this.instance).getDocumentTypeCase();
        }

        @Override // com.google.firebase.firestore.proto.MaybeDocumentOrBuilder
        public boolean getHasCommittedMutations() {
            return ((MaybeDocument) this.instance).getHasCommittedMutations();
        }

        @Override // com.google.firebase.firestore.proto.MaybeDocumentOrBuilder
        public NoDocument getNoDocument() {
            return ((MaybeDocument) this.instance).getNoDocument();
        }

        @Override // com.google.firebase.firestore.proto.MaybeDocumentOrBuilder
        public UnknownDocument getUnknownDocument() {
            return ((MaybeDocument) this.instance).getUnknownDocument();
        }

        @Override // com.google.firebase.firestore.proto.MaybeDocumentOrBuilder
        public boolean hasDocument() {
            return ((MaybeDocument) this.instance).hasDocument();
        }

        @Override // com.google.firebase.firestore.proto.MaybeDocumentOrBuilder
        public boolean hasNoDocument() {
            return ((MaybeDocument) this.instance).hasNoDocument();
        }

        @Override // com.google.firebase.firestore.proto.MaybeDocumentOrBuilder
        public boolean hasUnknownDocument() {
            return ((MaybeDocument) this.instance).hasUnknownDocument();
        }

        public Builder mergeDocument(s sVar) {
            copyOnWrite();
            ((MaybeDocument) this.instance).mergeDocument(sVar);
            return this;
        }

        public Builder mergeNoDocument(NoDocument noDocument) {
            copyOnWrite();
            ((MaybeDocument) this.instance).mergeNoDocument(noDocument);
            return this;
        }

        public Builder mergeUnknownDocument(UnknownDocument unknownDocument) {
            copyOnWrite();
            ((MaybeDocument) this.instance).mergeUnknownDocument(unknownDocument);
            return this;
        }

        public Builder setDocument(s sVar) {
            copyOnWrite();
            ((MaybeDocument) this.instance).setDocument(sVar);
            return this;
        }

        public Builder setHasCommittedMutations(boolean z10) {
            copyOnWrite();
            ((MaybeDocument) this.instance).setHasCommittedMutations(z10);
            return this;
        }

        public Builder setNoDocument(NoDocument noDocument) {
            copyOnWrite();
            ((MaybeDocument) this.instance).setNoDocument(noDocument);
            return this;
        }

        public Builder setUnknownDocument(UnknownDocument unknownDocument) {
            copyOnWrite();
            ((MaybeDocument) this.instance).setUnknownDocument(unknownDocument);
            return this;
        }

        private Builder() {
            super(MaybeDocument.DEFAULT_INSTANCE);
        }

        public Builder setDocument(q qVar) {
            copyOnWrite();
            ((MaybeDocument) this.instance).setDocument((s) qVar.m3997build());
            return this;
        }

        public Builder setNoDocument(NoDocument.Builder builder) {
            copyOnWrite();
            ((MaybeDocument) this.instance).setNoDocument((NoDocument) builder.m3997build());
            return this;
        }

        public Builder setUnknownDocument(UnknownDocument.Builder builder) {
            copyOnWrite();
            ((MaybeDocument) this.instance).setUnknownDocument((UnknownDocument) builder.m3997build());
            return this;
        }
    }

    public enum DocumentTypeCase {
        NO_DOCUMENT(1),
        DOCUMENT(2),
        UNKNOWN_DOCUMENT(3),
        DOCUMENTTYPE_NOT_SET(0);

        private final int value;

        DocumentTypeCase(int i10) {
            this.value = i10;
        }

        public static DocumentTypeCase forNumber(int i10) {
            if (i10 == 0) {
                return DOCUMENTTYPE_NOT_SET;
            }
            if (i10 == 1) {
                return NO_DOCUMENT;
            }
            if (i10 == 2) {
                return DOCUMENT;
            }
            if (i10 != 3) {
                return null;
            }
            return UNKNOWN_DOCUMENT;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static DocumentTypeCase valueOf(int i10) {
            return forNumber(i10);
        }
    }

    static {
        MaybeDocument maybeDocument = new MaybeDocument();
        DEFAULT_INSTANCE = maybeDocument;
        l0.registerDefaultInstance(MaybeDocument.class, maybeDocument);
    }

    private MaybeDocument() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDocument() {
        if (this.documentTypeCase_ == 2) {
            this.documentTypeCase_ = 0;
            this.documentType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDocumentType() {
        this.documentTypeCase_ = 0;
        this.documentType_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasCommittedMutations() {
        this.hasCommittedMutations_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNoDocument() {
        if (this.documentTypeCase_ == 1) {
            this.documentTypeCase_ = 0;
            this.documentType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnknownDocument() {
        if (this.documentTypeCase_ == 3) {
            this.documentTypeCase_ = 0;
            this.documentType_ = null;
        }
    }

    public static MaybeDocument getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDocument(s sVar) {
        sVar.getClass();
        if (this.documentTypeCase_ != 2 || this.documentType_ == s.i()) {
            this.documentType_ = sVar;
        } else {
            this.documentType_ = ((q) s.m((s) this.documentType_).mergeFrom((l0) sVar)).buildPartial();
        }
        this.documentTypeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNoDocument(NoDocument noDocument) {
        noDocument.getClass();
        if (this.documentTypeCase_ != 1 || this.documentType_ == NoDocument.getDefaultInstance()) {
            this.documentType_ = noDocument;
        } else {
            this.documentType_ = ((NoDocument.Builder) NoDocument.newBuilder((NoDocument) this.documentType_).mergeFrom((l0) noDocument)).buildPartial();
        }
        this.documentTypeCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUnknownDocument(UnknownDocument unknownDocument) {
        unknownDocument.getClass();
        if (this.documentTypeCase_ != 3 || this.documentType_ == UnknownDocument.getDefaultInstance()) {
            this.documentType_ = unknownDocument;
        } else {
            this.documentType_ = ((UnknownDocument.Builder) UnknownDocument.newBuilder((UnknownDocument) this.documentType_).mergeFrom((l0) unknownDocument)).buildPartial();
        }
        this.documentTypeCase_ = 3;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static MaybeDocument parseDelimitedFrom(InputStream inputStream) {
        return (MaybeDocument) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MaybeDocument parseFrom(ByteBuffer byteBuffer) {
        return (MaybeDocument) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static b2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocument(s sVar) {
        sVar.getClass();
        this.documentType_ = sVar;
        this.documentTypeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasCommittedMutations(boolean z10) {
        this.hasCommittedMutations_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNoDocument(NoDocument noDocument) {
        noDocument.getClass();
        this.documentType_ = noDocument;
        this.documentTypeCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnknownDocument(UnknownDocument unknownDocument) {
        unknownDocument.getClass();
        this.documentType_ = unknownDocument;
        this.documentTypeCase_ = 3;
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
                return l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004\u0007", new Object[]{"documentType_", "documentTypeCase_", NoDocument.class, s.class, UnknownDocument.class, "hasCommittedMutations_"});
            case 3:
                return new MaybeDocument();
            case 4:
                return new Builder(anonymousClass1);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (MaybeDocument.class) {
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

    @Override // com.google.firebase.firestore.proto.MaybeDocumentOrBuilder
    public s getDocument() {
        return this.documentTypeCase_ == 2 ? (s) this.documentType_ : s.i();
    }

    @Override // com.google.firebase.firestore.proto.MaybeDocumentOrBuilder
    public DocumentTypeCase getDocumentTypeCase() {
        return DocumentTypeCase.forNumber(this.documentTypeCase_);
    }

    @Override // com.google.firebase.firestore.proto.MaybeDocumentOrBuilder
    public boolean getHasCommittedMutations() {
        return this.hasCommittedMutations_;
    }

    @Override // com.google.firebase.firestore.proto.MaybeDocumentOrBuilder
    public NoDocument getNoDocument() {
        return this.documentTypeCase_ == 1 ? (NoDocument) this.documentType_ : NoDocument.getDefaultInstance();
    }

    @Override // com.google.firebase.firestore.proto.MaybeDocumentOrBuilder
    public UnknownDocument getUnknownDocument() {
        return this.documentTypeCase_ == 3 ? (UnknownDocument) this.documentType_ : UnknownDocument.getDefaultInstance();
    }

    @Override // com.google.firebase.firestore.proto.MaybeDocumentOrBuilder
    public boolean hasDocument() {
        return this.documentTypeCase_ == 2;
    }

    @Override // com.google.firebase.firestore.proto.MaybeDocumentOrBuilder
    public boolean hasNoDocument() {
        return this.documentTypeCase_ == 1;
    }

    @Override // com.google.firebase.firestore.proto.MaybeDocumentOrBuilder
    public boolean hasUnknownDocument() {
        return this.documentTypeCase_ == 3;
    }

    public static Builder newBuilder(MaybeDocument maybeDocument) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(maybeDocument);
    }

    public static MaybeDocument parseDelimitedFrom(InputStream inputStream, z zVar) {
        return (MaybeDocument) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, zVar);
    }

    public static MaybeDocument parseFrom(ByteBuffer byteBuffer, z zVar) {
        return (MaybeDocument) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, zVar);
    }

    public static MaybeDocument parseFrom(n nVar) {
        return (MaybeDocument) l0.parseFrom(DEFAULT_INSTANCE, nVar);
    }

    public static MaybeDocument parseFrom(n nVar, z zVar) {
        return (MaybeDocument) l0.parseFrom(DEFAULT_INSTANCE, nVar, zVar);
    }

    public static MaybeDocument parseFrom(byte[] bArr) {
        return (MaybeDocument) l0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MaybeDocument parseFrom(byte[] bArr, z zVar) {
        return (MaybeDocument) l0.parseFrom(DEFAULT_INSTANCE, bArr, zVar);
    }

    public static MaybeDocument parseFrom(InputStream inputStream) {
        return (MaybeDocument) l0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MaybeDocument parseFrom(InputStream inputStream, z zVar) {
        return (MaybeDocument) l0.parseFrom(DEFAULT_INSTANCE, inputStream, zVar);
    }

    public static MaybeDocument parseFrom(com.google.protobuf.s sVar) {
        return (MaybeDocument) l0.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static MaybeDocument parseFrom(com.google.protobuf.s sVar, z zVar) {
        return (MaybeDocument) l0.parseFrom(DEFAULT_INSTANCE, sVar, zVar);
    }
}
