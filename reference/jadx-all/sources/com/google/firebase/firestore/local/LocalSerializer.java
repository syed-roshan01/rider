package com.google.firebase.firestore.local;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.bundle.BundledQuery;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.FieldIndex;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.ObjectValue;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.model.mutation.MutationBatch;
import com.google.firebase.firestore.proto.MaybeDocument;
import com.google.firebase.firestore.proto.NoDocument;
import com.google.firebase.firestore.proto.Target;
import com.google.firebase.firestore.proto.UnknownDocument;
import com.google.firebase.firestore.proto.WriteBatch;
import com.google.firebase.firestore.remote.RemoteSerializer;
import com.google.firebase.firestore.util.Assert;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o7.j2;
import o7.l2;
import o7.z1;

/* JADX INFO: loaded from: classes.dex */
public final class LocalSerializer {
    private final RemoteSerializer rpcSerializer;

    /* JADX INFO: renamed from: com.google.firebase.firestore.local.LocalSerializer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$firebase$firestore$proto$MaybeDocument$DocumentTypeCase;
        static final /* synthetic */ int[] $SwitchMap$com$google$firebase$firestore$proto$Target$TargetTypeCase;

        static {
            int[] iArr = new int[Target.TargetTypeCase.values().length];
            $SwitchMap$com$google$firebase$firestore$proto$Target$TargetTypeCase = iArr;
            try {
                iArr[Target.TargetTypeCase.DOCUMENTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$proto$Target$TargetTypeCase[Target.TargetTypeCase.QUERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[MaybeDocument.DocumentTypeCase.values().length];
            $SwitchMap$com$google$firebase$firestore$proto$MaybeDocument$DocumentTypeCase = iArr2;
            try {
                iArr2[MaybeDocument.DocumentTypeCase.DOCUMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$proto$MaybeDocument$DocumentTypeCase[MaybeDocument.DocumentTypeCase.NO_DOCUMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$proto$MaybeDocument$DocumentTypeCase[MaybeDocument.DocumentTypeCase.UNKNOWN_DOCUMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public LocalSerializer(RemoteSerializer remoteSerializer) {
        this.rpcSerializer = remoteSerializer;
    }

    private MutableDocument decodeDocument(o7.s sVar, boolean z10) {
        MutableDocument mutableDocumentNewFoundDocument = MutableDocument.newFoundDocument(this.rpcSerializer.decodeKey(sVar.getName()), this.rpcSerializer.decodeVersion(sVar.k()), ObjectValue.fromMap(sVar.j()));
        return z10 ? mutableDocumentNewFoundDocument.setHasCommittedMutations() : mutableDocumentNewFoundDocument;
    }

    private MutableDocument decodeNoDocument(NoDocument noDocument, boolean z10) {
        MutableDocument mutableDocumentNewNoDocument = MutableDocument.newNoDocument(this.rpcSerializer.decodeKey(noDocument.getName()), this.rpcSerializer.decodeVersion(noDocument.getReadTime()));
        return z10 ? mutableDocumentNewNoDocument.setHasCommittedMutations() : mutableDocumentNewNoDocument;
    }

    private MutableDocument decodeUnknownDocument(UnknownDocument unknownDocument) {
        return MutableDocument.newUnknownDocument(this.rpcSerializer.decodeKey(unknownDocument.getName()), this.rpcSerializer.decodeVersion(unknownDocument.getVersion()));
    }

    private o7.s encodeDocument(Document document) {
        o7.q qVarL = o7.s.l();
        qVarL.d(this.rpcSerializer.encodeKey(document.getKey()));
        qVarL.c(document.getData().getFieldsMap());
        qVarL.e(this.rpcSerializer.encodeTimestamp(document.getVersion().getTimestamp()));
        return (o7.s) qVarL.m3997build();
    }

    private NoDocument encodeNoDocument(Document document) {
        NoDocument.Builder builderNewBuilder = NoDocument.newBuilder();
        builderNewBuilder.setName(this.rpcSerializer.encodeKey(document.getKey()));
        builderNewBuilder.setReadTime(this.rpcSerializer.encodeTimestamp(document.getVersion().getTimestamp()));
        return (NoDocument) builderNewBuilder.m3997build();
    }

    private UnknownDocument encodeUnknownDocument(Document document) {
        UnknownDocument.Builder builderNewBuilder = UnknownDocument.newBuilder();
        builderNewBuilder.setName(this.rpcSerializer.encodeKey(document.getKey()));
        builderNewBuilder.setVersion(this.rpcSerializer.encodeTimestamp(document.getVersion().getTimestamp()));
        return (UnknownDocument) builderNewBuilder.m3997build();
    }

    public BundledQuery decodeBundledQuery(n7.c cVar) {
        return new BundledQuery(this.rpcSerializer.decodeQueryTarget(cVar.j(), cVar.k()), cVar.i().equals(n7.b.FIRST) ? Query.LimitType.LIMIT_TO_FIRST : Query.LimitType.LIMIT_TO_LAST);
    }

    public List<FieldIndex.Segment> decodeFieldIndexSegments(m7.g gVar) {
        ArrayList arrayList = new ArrayList();
        for (m7.e eVar : gVar.h()) {
            arrayList.add(FieldIndex.Segment.create(FieldPath.fromServerFormat(eVar.i()), t.k.b(eVar.k(), 2) ? FieldIndex.Segment.Kind.CONTAINS : eVar.j().equals(m7.d.ASCENDING) ? FieldIndex.Segment.Kind.ASCENDING : FieldIndex.Segment.Kind.DESCENDING));
        }
        return arrayList;
    }

    public MutableDocument decodeMaybeDocument(MaybeDocument maybeDocument) {
        int i10 = AnonymousClass1.$SwitchMap$com$google$firebase$firestore$proto$MaybeDocument$DocumentTypeCase[maybeDocument.getDocumentTypeCase().ordinal()];
        if (i10 == 1) {
            return decodeDocument(maybeDocument.getDocument(), maybeDocument.getHasCommittedMutations());
        }
        if (i10 == 2) {
            return decodeNoDocument(maybeDocument.getNoDocument(), maybeDocument.getHasCommittedMutations());
        }
        if (i10 == 3) {
            return decodeUnknownDocument(maybeDocument.getUnknownDocument());
        }
        throw Assert.fail("Unknown MaybeDocument %s", maybeDocument);
    }

    public Mutation decodeMutation(l2 l2Var) {
        return this.rpcSerializer.decodeMutation(l2Var);
    }

    public MutationBatch decodeMutationBatch(WriteBatch writeBatch) {
        int batchId = writeBatch.getBatchId();
        Timestamp timestampDecodeTimestamp = this.rpcSerializer.decodeTimestamp(writeBatch.getLocalWriteTime());
        int baseWritesCount = writeBatch.getBaseWritesCount();
        ArrayList arrayList = new ArrayList(baseWritesCount);
        for (int i10 = 0; i10 < baseWritesCount; i10++) {
            arrayList.add(this.rpcSerializer.decodeMutation(writeBatch.getBaseWrites(i10)));
        }
        ArrayList arrayList2 = new ArrayList(writeBatch.getWritesCount());
        int i11 = 0;
        while (i11 < writeBatch.getWritesCount()) {
            l2 writes = writeBatch.getWrites(i11);
            int i12 = i11 + 1;
            if (i12 >= writeBatch.getWritesCount() || !writeBatch.getWrites(i12).u()) {
                arrayList2.add(this.rpcSerializer.decodeMutation(writes));
            } else {
                Assert.hardAssert(writeBatch.getWrites(i11).v(), "TransformMutation should be preceded by a patch or set mutation", new Object[0]);
                j2 j2VarY = l2.y(writes);
                Iterator it = writeBatch.getWrites(i12).o().h().iterator();
                while (it.hasNext()) {
                    j2VarY.c((o7.a0) it.next());
                }
                arrayList2.add(this.rpcSerializer.decodeMutation((l2) j2VarY.m3997build()));
                i11 = i12;
            }
            i11++;
        }
        return new MutationBatch(batchId, timestampDecodeTimestamp, arrayList, arrayList2);
    }

    public TargetData decodeTargetData(Target target) {
        com.google.firebase.firestore.core.Target targetDecodeDocumentsTarget;
        int targetId = target.getTargetId();
        SnapshotVersion snapshotVersionDecodeVersion = this.rpcSerializer.decodeVersion(target.getSnapshotVersion());
        SnapshotVersion snapshotVersionDecodeVersion2 = this.rpcSerializer.decodeVersion(target.getLastLimboFreeSnapshotVersion());
        com.google.protobuf.n resumeToken = target.getResumeToken();
        long lastListenSequenceNumber = target.getLastListenSequenceNumber();
        int i10 = AnonymousClass1.$SwitchMap$com$google$firebase$firestore$proto$Target$TargetTypeCase[target.getTargetTypeCase().ordinal()];
        if (i10 == 1) {
            targetDecodeDocumentsTarget = this.rpcSerializer.decodeDocumentsTarget(target.getDocuments());
        } else {
            if (i10 != 2) {
                throw Assert.fail("Unknown targetType %d", target.getTargetTypeCase());
            }
            targetDecodeDocumentsTarget = this.rpcSerializer.decodeQueryTarget(target.getQuery());
        }
        return new TargetData(targetDecodeDocumentsTarget, targetId, lastListenSequenceNumber, QueryPurpose.LISTEN, snapshotVersionDecodeVersion, snapshotVersionDecodeVersion2, resumeToken, null);
    }

    public n7.c encodeBundledQuery(BundledQuery bundledQuery) {
        z1 z1VarEncodeQueryTarget = this.rpcSerializer.encodeQueryTarget(bundledQuery.getTarget());
        n7.a aVarL = n7.c.l();
        aVarL.c(bundledQuery.getLimitType().equals(Query.LimitType.LIMIT_TO_FIRST) ? n7.b.FIRST : n7.b.LAST);
        aVarL.d(z1VarEncodeQueryTarget.i());
        aVarL.e(z1VarEncodeQueryTarget.j());
        return (n7.c) aVarL.m3997build();
    }

    public m7.g encodeFieldIndexSegments(List<FieldIndex.Segment> list) {
        m7.a aVarI = m7.g.i();
        aVarI.d();
        for (FieldIndex.Segment segment : list) {
            m7.c cVarL = m7.e.l();
            cVarL.d(segment.getFieldPath().canonicalString());
            if (segment.getKind() == FieldIndex.Segment.Kind.CONTAINS) {
                cVarL.c();
            } else if (segment.getKind() == FieldIndex.Segment.Kind.ASCENDING) {
                cVarL.e(m7.d.ASCENDING);
            } else {
                cVarL.e(m7.d.DESCENDING);
            }
            aVarI.c(cVarL);
        }
        return (m7.g) aVarI.m3997build();
    }

    public MaybeDocument encodeMaybeDocument(Document document) {
        MaybeDocument.Builder builderNewBuilder = MaybeDocument.newBuilder();
        if (document.isNoDocument()) {
            builderNewBuilder.setNoDocument(encodeNoDocument(document));
        } else if (document.isFoundDocument()) {
            builderNewBuilder.setDocument(encodeDocument(document));
        } else {
            if (!document.isUnknownDocument()) {
                throw Assert.fail("Cannot encode invalid document %s", document);
            }
            builderNewBuilder.setUnknownDocument(encodeUnknownDocument(document));
        }
        builderNewBuilder.setHasCommittedMutations(document.hasCommittedMutations());
        return (MaybeDocument) builderNewBuilder.m3997build();
    }

    public l2 encodeMutation(Mutation mutation) {
        return this.rpcSerializer.encodeMutation(mutation);
    }

    public WriteBatch encodeMutationBatch(MutationBatch mutationBatch) {
        WriteBatch.Builder builderNewBuilder = WriteBatch.newBuilder();
        builderNewBuilder.setBatchId(mutationBatch.getBatchId());
        builderNewBuilder.setLocalWriteTime(this.rpcSerializer.encodeTimestamp(mutationBatch.getLocalWriteTime()));
        Iterator<Mutation> it = mutationBatch.getBaseMutations().iterator();
        while (it.hasNext()) {
            builderNewBuilder.addBaseWrites(this.rpcSerializer.encodeMutation(it.next()));
        }
        Iterator<Mutation> it2 = mutationBatch.getMutations().iterator();
        while (it2.hasNext()) {
            builderNewBuilder.addWrites(this.rpcSerializer.encodeMutation(it2.next()));
        }
        return (WriteBatch) builderNewBuilder.m3997build();
    }

    public Target encodeTargetData(TargetData targetData) {
        QueryPurpose queryPurpose = QueryPurpose.LISTEN;
        Assert.hardAssert(queryPurpose.equals(targetData.getPurpose()), "Only queries with purpose %s may be stored, got %s", queryPurpose, targetData.getPurpose());
        Target.Builder builderNewBuilder = Target.newBuilder();
        builderNewBuilder.setTargetId(targetData.getTargetId()).setLastListenSequenceNumber(targetData.getSequenceNumber()).setLastLimboFreeSnapshotVersion(this.rpcSerializer.encodeVersion(targetData.getLastLimboFreeSnapshotVersion())).setSnapshotVersion(this.rpcSerializer.encodeVersion(targetData.getSnapshotVersion())).setResumeToken(targetData.getResumeToken());
        com.google.firebase.firestore.core.Target target = targetData.getTarget();
        if (target.isDocumentQuery()) {
            builderNewBuilder.setDocuments(this.rpcSerializer.encodeDocumentsTarget(target));
        } else {
            builderNewBuilder.setQuery(this.rpcSerializer.encodeQueryTarget(target));
        }
        return (Target) builderNewBuilder.m3997build();
    }
}
