package com.google.firebase.firestore.proto;

import com.google.protobuf.b2;
import com.google.protobuf.c;
import com.google.protobuf.g0;
import com.google.protobuf.h0;
import com.google.protobuf.k0;
import com.google.protobuf.l0;
import com.google.protobuf.m;
import com.google.protobuf.n;
import com.google.protobuf.p2;
import com.google.protobuf.q2;
import com.google.protobuf.s;
import com.google.protobuf.y0;
import com.google.protobuf.z;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class UnknownDocument extends l0 implements UnknownDocumentOrBuilder {
    private static final UnknownDocument DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile b2 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 2;
    private String name_ = "";
    private q2 version_;

    /* JADX INFO: renamed from: com.google.firebase.firestore.proto.UnknownDocument$1, reason: invalid class name */
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

    public static final class Builder extends g0 implements UnknownDocumentOrBuilder {
        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        public Builder clearName() {
            copyOnWrite();
            ((UnknownDocument) this.instance).clearName();
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((UnknownDocument) this.instance).clearVersion();
            return this;
        }

        @Override // com.google.firebase.firestore.proto.UnknownDocumentOrBuilder
        public String getName() {
            return ((UnknownDocument) this.instance).getName();
        }

        @Override // com.google.firebase.firestore.proto.UnknownDocumentOrBuilder
        public n getNameBytes() {
            return ((UnknownDocument) this.instance).getNameBytes();
        }

        @Override // com.google.firebase.firestore.proto.UnknownDocumentOrBuilder
        public q2 getVersion() {
            return ((UnknownDocument) this.instance).getVersion();
        }

        @Override // com.google.firebase.firestore.proto.UnknownDocumentOrBuilder
        public boolean hasVersion() {
            return ((UnknownDocument) this.instance).hasVersion();
        }

        public Builder mergeVersion(q2 q2Var) {
            copyOnWrite();
            ((UnknownDocument) this.instance).mergeVersion(q2Var);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((UnknownDocument) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(n nVar) {
            copyOnWrite();
            ((UnknownDocument) this.instance).setNameBytes(nVar);
            return this;
        }

        public Builder setVersion(q2 q2Var) {
            copyOnWrite();
            ((UnknownDocument) this.instance).setVersion(q2Var);
            return this;
        }

        private Builder() {
            super(UnknownDocument.DEFAULT_INSTANCE);
        }

        public Builder setVersion(p2 p2Var) {
            copyOnWrite();
            ((UnknownDocument) this.instance).setVersion((q2) p2Var.m3997build());
            return this;
        }
    }

    static {
        UnknownDocument unknownDocument = new UnknownDocument();
        DEFAULT_INSTANCE = unknownDocument;
        l0.registerDefaultInstance(UnknownDocument.class, unknownDocument);
    }

    private UnknownDocument() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = null;
    }

    public static UnknownDocument getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVersion(q2 q2Var) {
        q2Var.getClass();
        q2 q2Var2 = this.version_;
        if (q2Var2 == null || q2Var2 == q2.h()) {
            this.version_ = q2Var;
        } else {
            this.version_ = (q2) ((p2) q2.l(this.version_).mergeFrom((l0) q2Var)).buildPartial();
        }
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static UnknownDocument parseDelimitedFrom(InputStream inputStream) {
        return (UnknownDocument) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UnknownDocument parseFrom(ByteBuffer byteBuffer) {
        return (UnknownDocument) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static b2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(n nVar) {
        c.checkByteStringIsUtf8(nVar);
        this.name_ = nVar.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(q2 q2Var) {
        q2Var.getClass();
        this.version_ = q2Var;
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
                return l0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"name_", "version_"});
            case 3:
                return new UnknownDocument();
            case 4:
                return new Builder(anonymousClass1);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                b2 h0Var = PARSER;
                if (h0Var == null) {
                    synchronized (UnknownDocument.class) {
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

    @Override // com.google.firebase.firestore.proto.UnknownDocumentOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.google.firebase.firestore.proto.UnknownDocumentOrBuilder
    public n getNameBytes() {
        String str = this.name_;
        m mVar = n.f4181b;
        return new m(str.getBytes(y0.f4276a));
    }

    @Override // com.google.firebase.firestore.proto.UnknownDocumentOrBuilder
    public q2 getVersion() {
        q2 q2Var = this.version_;
        return q2Var == null ? q2.h() : q2Var;
    }

    @Override // com.google.firebase.firestore.proto.UnknownDocumentOrBuilder
    public boolean hasVersion() {
        return this.version_ != null;
    }

    public static Builder newBuilder(UnknownDocument unknownDocument) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(unknownDocument);
    }

    public static UnknownDocument parseDelimitedFrom(InputStream inputStream, z zVar) {
        return (UnknownDocument) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, zVar);
    }

    public static UnknownDocument parseFrom(ByteBuffer byteBuffer, z zVar) {
        return (UnknownDocument) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, zVar);
    }

    public static UnknownDocument parseFrom(n nVar) {
        return (UnknownDocument) l0.parseFrom(DEFAULT_INSTANCE, nVar);
    }

    public static UnknownDocument parseFrom(n nVar, z zVar) {
        return (UnknownDocument) l0.parseFrom(DEFAULT_INSTANCE, nVar, zVar);
    }

    public static UnknownDocument parseFrom(byte[] bArr) {
        return (UnknownDocument) l0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UnknownDocument parseFrom(byte[] bArr, z zVar) {
        return (UnknownDocument) l0.parseFrom(DEFAULT_INSTANCE, bArr, zVar);
    }

    public static UnknownDocument parseFrom(InputStream inputStream) {
        return (UnknownDocument) l0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UnknownDocument parseFrom(InputStream inputStream, z zVar) {
        return (UnknownDocument) l0.parseFrom(DEFAULT_INSTANCE, inputStream, zVar);
    }

    public static UnknownDocument parseFrom(s sVar) {
        return (UnknownDocument) l0.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static UnknownDocument parseFrom(s sVar, z zVar) {
        return (UnknownDocument) l0.parseFrom(DEFAULT_INSTANCE, sVar, zVar);
    }
}
