package com.google.firebase.firestore.remote;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.AggregateField;
import com.google.firebase.firestore.core.Bound;
import com.google.firebase.firestore.core.CompositeFilter;
import com.google.firebase.firestore.core.FieldFilter;
import com.google.firebase.firestore.core.Filter;
import com.google.firebase.firestore.core.OrderBy;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.core.Target;
import com.google.firebase.firestore.local.QueryPurpose;
import com.google.firebase.firestore.local.TargetData;
import com.google.firebase.firestore.model.DatabaseId;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.ObjectValue;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.model.mutation.ArrayTransformOperation;
import com.google.firebase.firestore.model.mutation.DeleteMutation;
import com.google.firebase.firestore.model.mutation.FieldMask;
import com.google.firebase.firestore.model.mutation.FieldTransform;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.model.mutation.MutationResult;
import com.google.firebase.firestore.model.mutation.NumericIncrementTransformOperation;
import com.google.firebase.firestore.model.mutation.PatchMutation;
import com.google.firebase.firestore.model.mutation.Precondition;
import com.google.firebase.firestore.model.mutation.ServerTimestampOperation;
import com.google.firebase.firestore.model.mutation.SetMutation;
import com.google.firebase.firestore.model.mutation.TransformOperation;
import com.google.firebase.firestore.model.mutation.VerifyMutation;
import com.google.firebase.firestore.util.Assert;
import com.google.protobuf.n0;
import com.google.protobuf.p2;
import com.google.protobuf.q2;
import com.google.protobuf.v0;
import e8.c2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.q;
import o7.a0;
import o7.a1;
import o7.a2;
import o7.b1;
import o7.b2;
import o7.c0;
import o7.c1;
import o7.d1;
import o7.e1;
import o7.f1;
import o7.g1;
import o7.h0;
import o7.h1;
import o7.i1;
import o7.j1;
import o7.j2;
import o7.k1;
import o7.k2;
import o7.l0;
import o7.l1;
import o7.l2;
import o7.m0;
import o7.m1;
import o7.n1;
import o7.o;
import o7.o1;
import o7.p;
import o7.p1;
import o7.q0;
import o7.r0;
import o7.r1;
import o7.r2;
import o7.s;
import o7.s0;
import o7.s1;
import o7.t;
import o7.t0;
import o7.t1;
import o7.u;
import o7.u0;
import o7.u1;
import o7.v;
import o7.v1;
import o7.w;
import o7.w0;
import o7.w1;
import o7.x;
import o7.x0;
import o7.x1;
import o7.y;
import o7.y0;
import o7.y1;
import o7.z;
import o7.z0;
import o7.z1;
import t.k;

/* JADX INFO: loaded from: classes.dex */
public final class RemoteSerializer {
    private final DatabaseId databaseId;
    private final String databaseName;

    /* JADX INFO: renamed from: com.google.firebase.firestore.remote.RemoteSerializer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$firebase$firestore$core$CompositeFilter$Operator;
        static final /* synthetic */ int[] $SwitchMap$com$google$firebase$firestore$core$FieldFilter$Operator;
        static final /* synthetic */ int[] $SwitchMap$com$google$firebase$firestore$local$QueryPurpose;
        static final /* synthetic */ int[] $SwitchMap$com$google$firestore$v1$DocumentTransform$FieldTransform$TransformTypeCase;
        static final /* synthetic */ int[] $SwitchMap$com$google$firestore$v1$ListenResponse$ResponseTypeCase;
        static final /* synthetic */ int[] $SwitchMap$com$google$firestore$v1$Precondition$ConditionTypeCase;
        static final /* synthetic */ int[] $SwitchMap$com$google$firestore$v1$StructuredQuery$CompositeFilter$Operator;
        static final /* synthetic */ int[] $SwitchMap$com$google$firestore$v1$StructuredQuery$Direction;
        static final /* synthetic */ int[] $SwitchMap$com$google$firestore$v1$StructuredQuery$FieldFilter$Operator;
        static final /* synthetic */ int[] $SwitchMap$com$google$firestore$v1$StructuredQuery$Filter$FilterTypeCase;
        static final /* synthetic */ int[] $SwitchMap$com$google$firestore$v1$StructuredQuery$UnaryFilter$Operator;
        static final /* synthetic */ int[] $SwitchMap$com$google$firestore$v1$TargetChange$TargetChangeType;
        static final /* synthetic */ int[] $SwitchMap$com$google$firestore$v1$Write$OperationCase;

        static {
            int[] iArr = new int[k.g(6).length];
            $SwitchMap$com$google$firestore$v1$ListenResponse$ResponseTypeCase = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$ListenResponse$ResponseTypeCase[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$ListenResponse$ResponseTypeCase[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$ListenResponse$ResponseTypeCase[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$ListenResponse$ResponseTypeCase[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$ListenResponse$ResponseTypeCase[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[b2.values().length];
            $SwitchMap$com$google$firestore$v1$TargetChange$TargetChangeType = iArr2;
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$TargetChange$TargetChangeType[1] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$TargetChange$TargetChangeType[2] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$TargetChange$TargetChangeType[3] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$TargetChange$TargetChangeType[4] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$TargetChange$TargetChangeType[5] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            int[] iArr3 = new int[f1.values().length];
            $SwitchMap$com$google$firestore$v1$StructuredQuery$Direction = iArr3;
            try {
                iArr3[1] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$StructuredQuery$Direction[2] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            int[] iArr4 = new int[h1.values().length];
            $SwitchMap$com$google$firestore$v1$StructuredQuery$FieldFilter$Operator = iArr4;
            try {
                iArr4[1] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$StructuredQuery$FieldFilter$Operator[2] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$StructuredQuery$FieldFilter$Operator[5] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$StructuredQuery$FieldFilter$Operator[6] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$StructuredQuery$FieldFilter$Operator[4] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$StructuredQuery$FieldFilter$Operator[3] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$StructuredQuery$FieldFilter$Operator[7] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$StructuredQuery$FieldFilter$Operator[8] = 8;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$StructuredQuery$FieldFilter$Operator[9] = 9;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$StructuredQuery$FieldFilter$Operator[10] = 10;
            } catch (NoSuchFieldError unused24) {
            }
            int[] iArr5 = new int[FieldFilter.Operator.values().length];
            $SwitchMap$com$google$firebase$firestore$core$FieldFilter$Operator = iArr5;
            try {
                iArr5[FieldFilter.Operator.LESS_THAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$core$FieldFilter$Operator[FieldFilter.Operator.LESS_THAN_OR_EQUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$core$FieldFilter$Operator[FieldFilter.Operator.EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$core$FieldFilter$Operator[FieldFilter.Operator.NOT_EQUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$core$FieldFilter$Operator[FieldFilter.Operator.GREATER_THAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$core$FieldFilter$Operator[FieldFilter.Operator.GREATER_THAN_OR_EQUAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$core$FieldFilter$Operator[FieldFilter.Operator.ARRAY_CONTAINS.ordinal()] = 7;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$core$FieldFilter$Operator[FieldFilter.Operator.IN.ordinal()] = 8;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$core$FieldFilter$Operator[FieldFilter.Operator.ARRAY_CONTAINS_ANY.ordinal()] = 9;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$core$FieldFilter$Operator[FieldFilter.Operator.NOT_IN.ordinal()] = 10;
            } catch (NoSuchFieldError unused34) {
            }
            int[] iArr6 = new int[s1.values().length];
            $SwitchMap$com$google$firestore$v1$StructuredQuery$UnaryFilter$Operator = iArr6;
            try {
                iArr6[1] = 1;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$StructuredQuery$UnaryFilter$Operator[2] = 2;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$StructuredQuery$UnaryFilter$Operator[3] = 3;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$StructuredQuery$UnaryFilter$Operator[4] = 4;
            } catch (NoSuchFieldError unused38) {
            }
            int[] iArr7 = new int[m1.values().length];
            $SwitchMap$com$google$firestore$v1$StructuredQuery$Filter$FilterTypeCase = iArr7;
            try {
                iArr7[0] = 1;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$StructuredQuery$Filter$FilterTypeCase[1] = 2;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$StructuredQuery$Filter$FilterTypeCase[2] = 3;
            } catch (NoSuchFieldError unused41) {
            }
            int[] iArr8 = new int[d1.values().length];
            $SwitchMap$com$google$firestore$v1$StructuredQuery$CompositeFilter$Operator = iArr8;
            try {
                iArr8[1] = 1;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$StructuredQuery$CompositeFilter$Operator[2] = 2;
            } catch (NoSuchFieldError unused43) {
            }
            int[] iArr9 = new int[CompositeFilter.Operator.values().length];
            $SwitchMap$com$google$firebase$firestore$core$CompositeFilter$Operator = iArr9;
            try {
                iArr9[CompositeFilter.Operator.AND.ordinal()] = 1;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$core$CompositeFilter$Operator[CompositeFilter.Operator.OR.ordinal()] = 2;
            } catch (NoSuchFieldError unused45) {
            }
            int[] iArr10 = new int[QueryPurpose.values().length];
            $SwitchMap$com$google$firebase$firestore$local$QueryPurpose = iArr10;
            try {
                iArr10[QueryPurpose.LISTEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$local$QueryPurpose[QueryPurpose.EXISTENCE_FILTER_MISMATCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$local$QueryPurpose[QueryPurpose.EXISTENCE_FILTER_MISMATCH_BLOOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$local$QueryPurpose[QueryPurpose.LIMBO_RESOLUTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused49) {
            }
            int[] iArr11 = new int[k.g(7).length];
            $SwitchMap$com$google$firestore$v1$DocumentTransform$FieldTransform$TransformTypeCase = iArr11;
            try {
                iArr11[0] = 1;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$DocumentTransform$FieldTransform$TransformTypeCase[4] = 2;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$DocumentTransform$FieldTransform$TransformTypeCase[5] = 3;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$DocumentTransform$FieldTransform$TransformTypeCase[1] = 4;
            } catch (NoSuchFieldError unused53) {
            }
            int[] iArr12 = new int[k.g(3).length];
            $SwitchMap$com$google$firestore$v1$Precondition$ConditionTypeCase = iArr12;
            try {
                iArr12[1] = 1;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$Precondition$ConditionTypeCase[0] = 2;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$Precondition$ConditionTypeCase[2] = 3;
            } catch (NoSuchFieldError unused56) {
            }
            int[] iArr13 = new int[k2.values().length];
            $SwitchMap$com$google$firestore$v1$Write$OperationCase = iArr13;
            try {
                iArr13[0] = 1;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$Write$OperationCase[1] = 2;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$Write$OperationCase[2] = 3;
            } catch (NoSuchFieldError unused59) {
            }
        }
    }

    public RemoteSerializer(DatabaseId databaseId) {
        this.databaseId = databaseId;
        this.databaseName = encodedDatabaseId(databaseId).canonicalString();
    }

    private FieldMask decodeDocumentMask(w wVar) {
        int i10 = wVar.i();
        HashSet hashSet = new HashSet(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            hashSet.add(FieldPath.fromServerFormat(wVar.h(i11)));
        }
        return FieldMask.fromSet(hashSet);
    }

    private FieldFilter.Operator decodeFieldFilterOperator(h1 h1Var) {
        switch (AnonymousClass1.$SwitchMap$com$google$firestore$v1$StructuredQuery$FieldFilter$Operator[h1Var.ordinal()]) {
            case 1:
                return FieldFilter.Operator.LESS_THAN;
            case 2:
                return FieldFilter.Operator.LESS_THAN_OR_EQUAL;
            case 3:
                return FieldFilter.Operator.EQUAL;
            case 4:
                return FieldFilter.Operator.NOT_EQUAL;
            case 5:
                return FieldFilter.Operator.GREATER_THAN_OR_EQUAL;
            case 6:
                return FieldFilter.Operator.GREATER_THAN;
            case 7:
                return FieldFilter.Operator.ARRAY_CONTAINS;
            case 8:
                return FieldFilter.Operator.IN;
            case 9:
                return FieldFilter.Operator.ARRAY_CONTAINS_ANY;
            case 10:
                return FieldFilter.Operator.NOT_IN;
            default:
                throw Assert.fail("Unhandled FieldFilter.operator %d", h1Var);
        }
    }

    private FieldTransform decodeFieldTransform(a0 a0Var) {
        int iE = k.e(a0Var.p());
        if (iE == 0) {
            Assert.hardAssert(a0Var.o() == z.REQUEST_TIME, "Unknown transform setToServerValue: %s", a0Var.o());
            return new FieldTransform(FieldPath.fromServerFormat(a0Var.l()), ServerTimestampOperation.getInstance());
        }
        if (iE == 1) {
            return new FieldTransform(FieldPath.fromServerFormat(a0Var.l()), new NumericIncrementTransformOperation(a0Var.m()));
        }
        if (iE == 4) {
            return new FieldTransform(FieldPath.fromServerFormat(a0Var.l()), new ArrayTransformOperation.Union(a0Var.k().a()));
        }
        if (iE == 5) {
            return new FieldTransform(FieldPath.fromServerFormat(a0Var.l()), new ArrayTransformOperation.Remove(a0Var.n().a()));
        }
        throw Assert.fail("Unknown FieldTransform proto: %s", a0Var);
    }

    private List<Filter> decodeFilters(n1 n1Var) {
        Filter filterDecodeFilter = decodeFilter(n1Var);
        if (filterDecodeFilter instanceof CompositeFilter) {
            CompositeFilter compositeFilter = (CompositeFilter) filterDecodeFilter;
            if (compositeFilter.isFlatConjunction()) {
                return compositeFilter.getFilters();
            }
        }
        return Collections.singletonList(filterDecodeFilter);
    }

    private MutableDocument decodeFoundDocument(o7.i iVar) {
        Assert.hardAssert(k.b(iVar.j(), 1), "Tried to deserialize a found document from a missing document.", new Object[0]);
        DocumentKey documentKeyDecodeKey = decodeKey(iVar.h().getName());
        ObjectValue objectValueFromMap = ObjectValue.fromMap(iVar.h().j());
        SnapshotVersion snapshotVersionDecodeVersion = decodeVersion(iVar.h().k());
        Assert.hardAssert(true ^ snapshotVersionDecodeVersion.equals(SnapshotVersion.NONE), "Got a document response with no snapshot version", new Object[0]);
        return MutableDocument.newFoundDocument(documentKeyDecodeKey, snapshotVersionDecodeVersion, objectValueFromMap);
    }

    private MutableDocument decodeMissingDocument(o7.i iVar) {
        Assert.hardAssert(k.b(iVar.j(), 2), "Tried to deserialize a missing document from a found document.", new Object[0]);
        DocumentKey documentKeyDecodeKey = decodeKey(iVar.i());
        SnapshotVersion snapshotVersionDecodeVersion = decodeVersion(iVar.getReadTime());
        Assert.hardAssert(!snapshotVersionDecodeVersion.equals(SnapshotVersion.NONE), "Got a no document response with no snapshot version", new Object[0]);
        return MutableDocument.newNoDocument(documentKeyDecodeKey, snapshotVersionDecodeVersion);
    }

    private OrderBy decodeOrderBy(p1 p1Var) {
        OrderBy.Direction direction;
        FieldPath fieldPathFromServerFormat = FieldPath.fromServerFormat(p1Var.i().h());
        int iOrdinal = p1Var.h().ordinal();
        if (iOrdinal == 1) {
            direction = OrderBy.Direction.ASCENDING;
        } else {
            if (iOrdinal != 2) {
                throw Assert.fail("Unrecognized direction %d", p1Var.h());
            }
            direction = OrderBy.Direction.DESCENDING;
        }
        return OrderBy.getInstance(direction, fieldPathFromServerFormat);
    }

    private Precondition decodePrecondition(m0 m0Var) {
        int iE = k.e(m0Var.h());
        if (iE == 0) {
            return Precondition.exists(m0Var.j());
        }
        if (iE == 1) {
            return Precondition.updateTime(decodeVersion(m0Var.k()));
        }
        if (iE == 2) {
            return Precondition.NONE;
        }
        throw Assert.fail("Unknown precondition", new Object[0]);
    }

    private ResourcePath decodeQueryPath(String str) {
        ResourcePath resourcePathDecodeResourceName = decodeResourceName(str);
        return resourcePathDecodeResourceName.length() == 4 ? ResourcePath.EMPTY : extractLocalPathFromResourceName(resourcePathDecodeResourceName);
    }

    private ResourcePath decodeResourceName(String str) {
        ResourcePath resourcePathFromString = ResourcePath.fromString(str);
        Assert.hardAssert(isValidResourceName(resourcePathFromString), "Tried to deserialize invalid key %s", resourcePathFromString);
        return resourcePathFromString;
    }

    private Filter decodeUnaryFilter(t1 t1Var) {
        FieldPath fieldPathFromServerFormat = FieldPath.fromServerFormat(t1Var.i().h());
        int iOrdinal = t1Var.j().ordinal();
        if (iOrdinal == 1) {
            return FieldFilter.create(fieldPathFromServerFormat, FieldFilter.Operator.EQUAL, Values.NAN_VALUE);
        }
        if (iOrdinal == 2) {
            return FieldFilter.create(fieldPathFromServerFormat, FieldFilter.Operator.EQUAL, Values.NULL_VALUE);
        }
        if (iOrdinal == 3) {
            return FieldFilter.create(fieldPathFromServerFormat, FieldFilter.Operator.NOT_EQUAL, Values.NAN_VALUE);
        }
        if (iOrdinal == 4) {
            return FieldFilter.create(fieldPathFromServerFormat, FieldFilter.Operator.NOT_EQUAL, Values.NULL_VALUE);
        }
        throw Assert.fail("Unrecognized UnaryFilter.operator %d", t1Var.j());
    }

    private w encodeDocumentMask(FieldMask fieldMask) {
        v vVarJ = w.j();
        Iterator<FieldPath> it = fieldMask.getMask().iterator();
        while (it.hasNext()) {
            vVarJ.c(it.next().canonicalString());
        }
        return (w) vVarJ.m3997build();
    }

    private h1 encodeFieldFilterOperator(FieldFilter.Operator operator) {
        switch (AnonymousClass1.$SwitchMap$com$google$firebase$firestore$core$FieldFilter$Operator[operator.ordinal()]) {
            case 1:
                return h1.LESS_THAN;
            case 2:
                return h1.LESS_THAN_OR_EQUAL;
            case 3:
                return h1.EQUAL;
            case 4:
                return h1.NOT_EQUAL;
            case 5:
                return h1.GREATER_THAN;
            case 6:
                return h1.GREATER_THAN_OR_EQUAL;
            case 7:
                return h1.ARRAY_CONTAINS;
            case 8:
                return h1.IN;
            case 9:
                return h1.ARRAY_CONTAINS_ANY;
            case 10:
                return h1.NOT_IN;
            default:
                throw Assert.fail("Unknown operator %d", operator);
        }
    }

    private k1 encodeFieldPath(FieldPath fieldPath) {
        j1 j1VarI = k1.i();
        j1VarI.c(fieldPath.canonicalString());
        return (k1) j1VarI.m3997build();
    }

    private a0 encodeFieldTransform(FieldTransform fieldTransform) {
        TransformOperation operation = fieldTransform.getOperation();
        if (operation instanceof ServerTimestampOperation) {
            y yVarQ = a0.q();
            yVarQ.d(fieldTransform.getFieldPath().canonicalString());
            yVarQ.g();
            return (a0) yVarQ.m3997build();
        }
        if (operation instanceof ArrayTransformOperation.Union) {
            y yVarQ2 = a0.q();
            yVarQ2.d(fieldTransform.getFieldPath().canonicalString());
            o7.d dVarL = o7.e.l();
            dVarL.c(((ArrayTransformOperation.Union) operation).getElements());
            yVarQ2.c(dVarL);
            return (a0) yVarQ2.m3997build();
        }
        if (operation instanceof ArrayTransformOperation.Remove) {
            y yVarQ3 = a0.q();
            yVarQ3.d(fieldTransform.getFieldPath().canonicalString());
            o7.d dVarL2 = o7.e.l();
            dVarL2.c(((ArrayTransformOperation.Remove) operation).getElements());
            yVarQ3.f(dVarL2);
            return (a0) yVarQ3.m3997build();
        }
        if (!(operation instanceof NumericIncrementTransformOperation)) {
            throw Assert.fail("Unknown transform: %s", operation);
        }
        y yVarQ4 = a0.q();
        yVarQ4.d(fieldTransform.getFieldPath().canonicalString());
        yVarQ4.e(((NumericIncrementTransformOperation) operation).getOperand());
        return (a0) yVarQ4.m3997build();
    }

    private n1 encodeFilters(List<Filter> list) {
        return encodeFilter(new CompositeFilter(list, CompositeFilter.Operator.AND));
    }

    private String encodeLabel(QueryPurpose queryPurpose) {
        int i10 = AnonymousClass1.$SwitchMap$com$google$firebase$firestore$local$QueryPurpose[queryPurpose.ordinal()];
        if (i10 == 1) {
            return null;
        }
        if (i10 == 2) {
            return "existence-filter-mismatch";
        }
        if (i10 == 3) {
            return "existence-filter-mismatch-bloom";
        }
        if (i10 == 4) {
            return "limbo-document";
        }
        throw Assert.fail("Unrecognized query purpose: %s", queryPurpose);
    }

    private p1 encodeOrderBy(OrderBy orderBy) {
        o1 o1VarJ = p1.j();
        if (orderBy.getDirection().equals(OrderBy.Direction.ASCENDING)) {
            o1VarJ.c(f1.ASCENDING);
        } else {
            o1VarJ.c(f1.DESCENDING);
        }
        o1VarJ.d(encodeFieldPath(orderBy.getField()));
        return (p1) o1VarJ.m3997build();
    }

    private m0 encodePrecondition(Precondition precondition) {
        Assert.hardAssert(!precondition.isNone(), "Can't serialize an empty precondition", new Object[0]);
        l0 l0VarL = m0.l();
        if (precondition.getUpdateTime() != null) {
            l0VarL.d(encodeVersion(precondition.getUpdateTime()));
            return (m0) l0VarL.m3997build();
        }
        if (precondition.getExists() == null) {
            throw Assert.fail("Unknown Precondition", new Object[0]);
        }
        l0VarL.c(precondition.getExists().booleanValue());
        return (m0) l0VarL.m3997build();
    }

    private String encodeQueryPath(ResourcePath resourcePath) {
        return encodeResourceName(this.databaseId, resourcePath);
    }

    private String encodeResourceName(DatabaseId databaseId, ResourcePath resourcePath) {
        return encodedDatabaseId(databaseId).append("documents").append(resourcePath).canonicalString();
    }

    private static ResourcePath encodedDatabaseId(DatabaseId databaseId) {
        return ResourcePath.fromSegments(Arrays.asList("projects", databaseId.getProjectId(), "databases", databaseId.getDatabaseId()));
    }

    private static ResourcePath extractLocalPathFromResourceName(ResourcePath resourcePath) {
        Assert.hardAssert(resourcePath.length() > 4 && resourcePath.getSegment(4).equals("documents"), "Tried to deserialize invalid key %s", resourcePath);
        return resourcePath.popFirst(5);
    }

    private c2 fromStatus(w7.a aVar) {
        return c2.c(aVar.g()).g(aVar.i());
    }

    private static boolean isValidResourceName(ResourcePath resourcePath) {
        return resourcePath.length() >= 4 && resourcePath.getSegment(0).equals("projects") && resourcePath.getSegment(2).equals("databases");
    }

    public String databaseName() {
        return this.databaseName;
    }

    public CompositeFilter decodeCompositeFilter(e1 e1Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = e1Var.i().iterator();
        while (it.hasNext()) {
            arrayList.add(decodeFilter((n1) it.next()));
        }
        return new CompositeFilter(arrayList, decodeCompositeFilterOperator(e1Var.j()));
    }

    public CompositeFilter.Operator decodeCompositeFilterOperator(d1 d1Var) {
        int i10 = AnonymousClass1.$SwitchMap$com$google$firestore$v1$StructuredQuery$CompositeFilter$Operator[d1Var.ordinal()];
        if (i10 == 1) {
            return CompositeFilter.Operator.AND;
        }
        if (i10 == 2) {
            return CompositeFilter.Operator.OR;
        }
        throw Assert.fail("Only AND and OR composite filter types are supported.", new Object[0]);
    }

    public Target decodeDocumentsTarget(x1 x1Var) {
        int i10 = x1Var.i();
        Assert.hardAssert(i10 == 1, "DocumentsTarget contained other than 1 document %d", Integer.valueOf(i10));
        return Query.atPath(decodeQueryPath(x1Var.h())).toTarget();
    }

    public FieldFilter decodeFieldFilter(i1 i1Var) {
        return FieldFilter.create(FieldPath.fromServerFormat(i1Var.j().h()), decodeFieldFilterOperator(i1Var.k()), i1Var.l());
    }

    public Filter decodeFilter(n1 n1Var) {
        int iOrdinal = n1Var.l().ordinal();
        if (iOrdinal == 0) {
            return decodeCompositeFilter(n1Var.i());
        }
        if (iOrdinal == 1) {
            return decodeFieldFilter(n1Var.k());
        }
        if (iOrdinal == 2) {
            return decodeUnaryFilter(n1Var.m());
        }
        throw Assert.fail("Unrecognized Filter.filterType %d", n1Var.l());
    }

    public DocumentKey decodeKey(String str) {
        ResourcePath resourcePathDecodeResourceName = decodeResourceName(str);
        Assert.hardAssert(resourcePathDecodeResourceName.getSegment(1).equals(this.databaseId.getProjectId()), "Tried to deserialize key from different project.", new Object[0]);
        Assert.hardAssert(resourcePathDecodeResourceName.getSegment(3).equals(this.databaseId.getDatabaseId()), "Tried to deserialize key from different database.", new Object[0]);
        return DocumentKey.fromPath(extractLocalPathFromResourceName(resourcePathDecodeResourceName));
    }

    public MutableDocument decodeMaybeDocument(o7.i iVar) {
        if (k.b(iVar.j(), 1)) {
            return decodeFoundDocument(iVar);
        }
        if (k.b(iVar.j(), 2)) {
            return decodeMissingDocument(iVar);
        }
        throw new IllegalArgumentException("Unknown result case: ".concat(q.A(iVar.j())));
    }

    public Mutation decodeMutation(l2 l2Var) {
        Precondition preconditionDecodePrecondition = l2Var.t() ? decodePrecondition(l2Var.l()) : Precondition.NONE;
        ArrayList arrayList = new ArrayList();
        Iterator it = l2Var.r().iterator();
        while (it.hasNext()) {
            arrayList.add(decodeFieldTransform((a0) it.next()));
        }
        int iOrdinal = l2Var.n().ordinal();
        if (iOrdinal == 0) {
            return l2Var.w() ? new PatchMutation(decodeKey(l2Var.p().getName()), ObjectValue.fromMap(l2Var.p().j()), decodeDocumentMask(l2Var.q()), preconditionDecodePrecondition, arrayList) : new SetMutation(decodeKey(l2Var.p().getName()), ObjectValue.fromMap(l2Var.p().j()), preconditionDecodePrecondition, arrayList);
        }
        if (iOrdinal == 1) {
            return new DeleteMutation(decodeKey(l2Var.m()), preconditionDecodePrecondition);
        }
        if (iOrdinal == 2) {
            return new VerifyMutation(decodeKey(l2Var.s()), preconditionDecodePrecondition);
        }
        throw Assert.fail("Unknown mutation operation: %d", l2Var.n());
    }

    public MutationResult decodeMutationResult(r2 r2Var, SnapshotVersion snapshotVersion) {
        SnapshotVersion snapshotVersionDecodeVersion = decodeVersion(r2Var.i());
        if (!SnapshotVersion.NONE.equals(snapshotVersionDecodeVersion)) {
            snapshotVersion = snapshotVersionDecodeVersion;
        }
        int iH = r2Var.h();
        ArrayList arrayList = new ArrayList(iH);
        for (int i10 = 0; i10 < iH; i10++) {
            arrayList.add(r2Var.g(i10));
        }
        return new MutationResult(snapshotVersion, arrayList);
    }

    public Target decodeQueryTarget(String str, u1 u1Var) {
        ResourcePath resourcePath;
        String strI;
        List listEmptyList;
        ResourcePath resourcePathDecodeQueryPath = decodeQueryPath(str);
        int iO = u1Var.o();
        if (iO <= 0) {
            resourcePath = resourcePathDecodeQueryPath;
            strI = null;
        } else {
            Assert.hardAssert(iO == 1, "StructuredQuery.from with more than one collection is not supported.", new Object[0]);
            b1 b1VarN = u1Var.n();
            if (b1VarN.h()) {
                resourcePath = resourcePathDecodeQueryPath;
                strI = b1VarN.i();
            } else {
                resourcePathDecodeQueryPath = resourcePathDecodeQueryPath.append(b1VarN.i());
                resourcePath = resourcePathDecodeQueryPath;
                strI = null;
            }
        }
        List<Filter> listDecodeFilters = u1Var.x() ? decodeFilters(u1Var.t()) : Collections.emptyList();
        int iR = u1Var.r();
        if (iR > 0) {
            ArrayList arrayList = new ArrayList(iR);
            for (int i10 = 0; i10 < iR; i10++) {
                arrayList.add(decodeOrderBy(u1Var.q(i10)));
            }
            listEmptyList = arrayList;
        } else {
            listEmptyList = Collections.emptyList();
        }
        return new Target(resourcePath, strI, listDecodeFilters, listEmptyList, u1Var.v() ? u1Var.p().h() : -1L, u1Var.w() ? new Bound(u1Var.s().a(), u1Var.s().h()) : null, u1Var.u() ? new Bound(u1Var.m().a(), !u1Var.m().h()) : null);
    }

    public Timestamp decodeTimestamp(q2 q2Var) {
        return new Timestamp(q2Var.j(), q2Var.i());
    }

    public SnapshotVersion decodeVersion(q2 q2Var) {
        return (q2Var.j() == 0 && q2Var.i() == 0) ? SnapshotVersion.NONE : new SnapshotVersion(decodeTimestamp(q2Var));
    }

    public SnapshotVersion decodeVersionFromListenResponse(h0 h0Var) {
        if (h0Var.l() == 1 && h0Var.m().j() == 0) {
            return decodeVersion(h0Var.m().getReadTime());
        }
        return SnapshotVersion.NONE;
    }

    public WatchChange decodeWatchChange(h0 h0Var) {
        WatchChange.WatchTargetChangeType watchTargetChangeType;
        WatchChange watchTargetChange;
        int iE = k.e(h0Var.l());
        c2 c2VarFromStatus = null;
        if (iE == 0) {
            o7.c2 c2VarM = h0Var.m();
            int iOrdinal = c2VarM.i().ordinal();
            if (iOrdinal == 0) {
                watchTargetChangeType = WatchChange.WatchTargetChangeType.NoChange;
            } else if (iOrdinal == 1) {
                watchTargetChangeType = WatchChange.WatchTargetChangeType.Added;
            } else if (iOrdinal == 2) {
                watchTargetChangeType = WatchChange.WatchTargetChangeType.Removed;
                c2VarFromStatus = fromStatus(c2VarM.g());
            } else if (iOrdinal == 3) {
                watchTargetChangeType = WatchChange.WatchTargetChangeType.Current;
            } else {
                if (iOrdinal != 4) {
                    throw new IllegalArgumentException("Unknown target change type");
                }
                watchTargetChangeType = WatchChange.WatchTargetChangeType.Reset;
            }
            watchTargetChange = new WatchChange.WatchTargetChange(watchTargetChangeType, c2VarM.k(), c2VarM.getResumeToken(), c2VarFromStatus);
        } else if (iE == 1) {
            t tVarH = h0Var.h();
            v0 v0VarI = tVarH.i();
            v0 v0VarH = tVarH.h();
            DocumentKey documentKeyDecodeKey = decodeKey(tVarH.getDocument().getName());
            SnapshotVersion snapshotVersionDecodeVersion = decodeVersion(tVarH.getDocument().k());
            Assert.hardAssert(!snapshotVersionDecodeVersion.equals(SnapshotVersion.NONE), "Got a document change without an update time", new Object[0]);
            MutableDocument mutableDocumentNewFoundDocument = MutableDocument.newFoundDocument(documentKeyDecodeKey, snapshotVersionDecodeVersion, ObjectValue.fromMap(tVarH.getDocument().j()));
            watchTargetChange = new WatchChange.DocumentChange(v0VarI, v0VarH, mutableDocumentNewFoundDocument.getKey(), mutableDocumentNewFoundDocument);
        } else {
            if (iE == 2) {
                u uVarI = h0Var.i();
                v0 v0VarI2 = uVarI.i();
                MutableDocument mutableDocumentNewNoDocument = MutableDocument.newNoDocument(decodeKey(uVarI.h()), decodeVersion(uVarI.getReadTime()));
                return new WatchChange.DocumentChange(Collections.emptyList(), v0VarI2, mutableDocumentNewNoDocument.getKey(), mutableDocumentNewNoDocument);
            }
            if (iE != 3) {
                if (iE != 4) {
                    throw new IllegalArgumentException("Unknown change type set");
                }
                c0 c0VarK = h0Var.k();
                return new WatchChange.ExistenceFilterWatchChange(c0VarK.getTargetId(), new ExistenceFilter(c0VarK.g(), c0VarK.i()));
            }
            x xVarJ = h0Var.j();
            watchTargetChange = new WatchChange.DocumentChange(Collections.emptyList(), xVarJ.i(), decodeKey(xVarJ.h()), null);
        }
        return watchTargetChange;
    }

    public n1 encodeCompositeFilter(CompositeFilter compositeFilter) {
        ArrayList arrayList = new ArrayList(compositeFilter.getFilters().size());
        Iterator<Filter> it = compositeFilter.getFilters().iterator();
        while (it.hasNext()) {
            arrayList.add(encodeFilter(it.next()));
        }
        if (arrayList.size() == 1) {
            return (n1) arrayList.get(0);
        }
        c1 c1VarK = e1.k();
        c1VarK.d(encodeCompositeFilterOperator(compositeFilter.getOperator()));
        c1VarK.c(arrayList);
        l1 l1VarN = n1.n();
        l1VarN.c(c1VarK);
        return (n1) l1VarN.m3997build();
    }

    public d1 encodeCompositeFilterOperator(CompositeFilter.Operator operator) {
        int i10 = AnonymousClass1.$SwitchMap$com$google$firebase$firestore$core$CompositeFilter$Operator[operator.ordinal()];
        if (i10 == 1) {
            return d1.AND;
        }
        if (i10 == 2) {
            return d1.OR;
        }
        throw Assert.fail("Unrecognized composite filter type.", new Object[0]);
    }

    public s encodeDocument(DocumentKey documentKey, ObjectValue objectValue) {
        o7.q qVarL = s.l();
        qVarL.d(encodeKey(documentKey));
        qVarL.c(objectValue.getFieldsMap());
        return (s) qVarL.m3997build();
    }

    public x1 encodeDocumentsTarget(Target target) {
        w1 w1VarJ = x1.j();
        w1VarJ.c(encodeQueryPath(target.getPath()));
        return (x1) w1VarJ.m3997build();
    }

    public n1 encodeFilter(Filter filter) {
        if (filter instanceof FieldFilter) {
            return encodeUnaryOrFieldFilter((FieldFilter) filter);
        }
        if (filter instanceof CompositeFilter) {
            return encodeCompositeFilter((CompositeFilter) filter);
        }
        throw Assert.fail("Unrecognized filter type %s", filter.toString());
    }

    public String encodeKey(DocumentKey documentKey) {
        return encodeResourceName(this.databaseId, documentKey.getPath());
    }

    public Map<String, String> encodeListenRequestLabels(TargetData targetData) {
        String strEncodeLabel = encodeLabel(targetData.getPurpose());
        if (strEncodeLabel == null) {
            return null;
        }
        HashMap map = new HashMap(1);
        map.put("goog-listen-tags", strEncodeLabel);
        return map;
    }

    public l2 encodeMutation(Mutation mutation) {
        j2 j2VarX = l2.x();
        if (mutation instanceof SetMutation) {
            j2VarX.f(encodeDocument(mutation.getKey(), ((SetMutation) mutation).getValue()));
        } else if (mutation instanceof PatchMutation) {
            j2VarX.f(encodeDocument(mutation.getKey(), ((PatchMutation) mutation).getValue()));
            j2VarX.g(encodeDocumentMask(mutation.getFieldMask()));
        } else if (mutation instanceof DeleteMutation) {
            j2VarX.e(encodeKey(mutation.getKey()));
        } else {
            if (!(mutation instanceof VerifyMutation)) {
                throw Assert.fail("unknown mutation type %s", mutation.getClass());
            }
            j2VarX.h(encodeKey(mutation.getKey()));
        }
        Iterator<FieldTransform> it = mutation.getFieldTransforms().iterator();
        while (it.hasNext()) {
            j2VarX.c(encodeFieldTransform(it.next()));
        }
        if (!mutation.getPrecondition().isNone()) {
            j2VarX.d(encodePrecondition(mutation.getPrecondition()));
        }
        return (l2) j2VarX.m3997build();
    }

    public z1 encodeQueryTarget(Target target) {
        y1 y1VarK = z1.k();
        z0 z0VarY = u1.y();
        ResourcePath path = target.getPath();
        if (target.getCollectionGroup() != null) {
            Assert.hardAssert(path.length() % 2 == 0, "Collection Group queries should be within a document path or root.", new Object[0]);
            y1VarK.c(encodeQueryPath(path));
            a1 a1VarJ = b1.j();
            a1VarJ.d(target.getCollectionGroup());
            a1VarJ.c();
            z0VarY.c(a1VarJ);
        } else {
            Assert.hardAssert(path.length() % 2 != 0, "Document queries with filters are not supported.", new Object[0]);
            y1VarK.c(encodeQueryPath(path.popLast()));
            a1 a1VarJ2 = b1.j();
            a1VarJ2.d(path.getLastSegment());
            z0VarY.c(a1VarJ2);
        }
        if (target.getFilters().size() > 0) {
            z0VarY.h(encodeFilters(target.getFilters()));
        }
        Iterator<OrderBy> it = target.getOrderBy().iterator();
        while (it.hasNext()) {
            z0VarY.d(encodeOrderBy(it.next()));
        }
        if (target.hasLimit()) {
            com.google.protobuf.m0 m0VarI = n0.i();
            m0VarI.c((int) target.getLimit());
            z0VarY.f(m0VarI);
        }
        if (target.getStartAt() != null) {
            o oVarJ = p.j();
            oVarJ.c(target.getStartAt().getPosition());
            oVarJ.d(target.getStartAt().isInclusive());
            z0VarY.g(oVarJ);
        }
        if (target.getEndAt() != null) {
            o oVarJ2 = p.j();
            oVarJ2.c(target.getEndAt().getPosition());
            oVarJ2.d(!target.getEndAt().isInclusive());
            z0VarY.e(oVarJ2);
        }
        y1VarK.d(z0VarY);
        return (z1) y1VarK.m3997build();
    }

    public y0 encodeStructuredAggregationQuery(z1 z1Var, List<AggregateField> list, HashMap<String, String> map) {
        x0 x0VarH = y0.h();
        x0VarH.d(z1Var.j());
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i10 = 1;
        for (AggregateField aggregateField : list) {
            if (!hashSet.contains(aggregateField.getAlias())) {
                hashSet.add(aggregateField.getAlias());
                StringBuilder sb = new StringBuilder("aggregate_");
                int i11 = i10 + 1;
                sb.append(i10);
                String string = sb.toString();
                map.put(string, aggregateField.getAlias());
                s0 s0VarJ = w0.j();
                j1 j1VarI = k1.i();
                j1VarI.c(aggregateField.getFieldPath());
                k1 k1Var = (k1) j1VarI.m3997build();
                if (aggregateField instanceof AggregateField.CountAggregateField) {
                    s0VarJ.e(t0.g());
                } else if (aggregateField instanceof AggregateField.SumAggregateField) {
                    u0 u0VarG = o7.v0.g();
                    u0VarG.c(k1Var);
                    s0VarJ.f((o7.v0) u0VarG.m3997build());
                } else {
                    if (!(aggregateField instanceof AggregateField.AverageAggregateField)) {
                        throw new RuntimeException("Unsupported aggregation");
                    }
                    q0 q0VarG = r0.g();
                    q0VarG.c(k1Var);
                    s0VarJ.d((r0) q0VarG.m3997build());
                }
                s0VarJ.c(string);
                arrayList.add((w0) s0VarJ.m3997build());
                i10 = i11;
            }
        }
        x0VarH.c(arrayList);
        return (y0) x0VarH.m3997build();
    }

    public a2 encodeTarget(TargetData targetData) {
        v1 v1VarL = a2.l();
        Target target = targetData.getTarget();
        if (target.isDocumentQuery()) {
            v1VarL.c(encodeDocumentsTarget(target));
        } else {
            v1VarL.e(encodeQueryTarget(target));
        }
        v1VarL.h(targetData.getTargetId());
        if (!targetData.getResumeToken().isEmpty() || targetData.getSnapshotVersion().compareTo(SnapshotVersion.NONE) <= 0) {
            v1VarL.g(targetData.getResumeToken());
        } else {
            v1VarL.f(encodeTimestamp(targetData.getSnapshotVersion().getTimestamp()));
        }
        if (targetData.getExpectedCount() != null && (!targetData.getResumeToken().isEmpty() || targetData.getSnapshotVersion().compareTo(SnapshotVersion.NONE) > 0)) {
            com.google.protobuf.m0 m0VarI = n0.i();
            m0VarI.c(targetData.getExpectedCount().intValue());
            v1VarL.d(m0VarI);
        }
        return (a2) v1VarL.m3997build();
    }

    public q2 encodeTimestamp(Timestamp timestamp) {
        p2 p2VarK = q2.k();
        p2VarK.d(timestamp.getSeconds());
        p2VarK.c(timestamp.getNanoseconds());
        return (q2) p2VarK.m3997build();
    }

    public n1 encodeUnaryOrFieldFilter(FieldFilter fieldFilter) {
        FieldFilter.Operator operator = fieldFilter.getOperator();
        FieldFilter.Operator operator2 = FieldFilter.Operator.EQUAL;
        if (operator == operator2 || fieldFilter.getOperator() == FieldFilter.Operator.NOT_EQUAL) {
            r1 r1VarK = t1.k();
            r1VarK.c(encodeFieldPath(fieldFilter.getField()));
            if (Values.isNanValue(fieldFilter.getValue())) {
                r1VarK.d(fieldFilter.getOperator() == operator2 ? s1.IS_NAN : s1.IS_NOT_NAN);
                l1 l1VarN = n1.n();
                l1VarN.e(r1VarK);
                return (n1) l1VarN.m3997build();
            }
            if (Values.isNullValue(fieldFilter.getValue())) {
                r1VarK.d(fieldFilter.getOperator() == operator2 ? s1.IS_NULL : s1.IS_NOT_NULL);
                l1 l1VarN2 = n1.n();
                l1VarN2.e(r1VarK);
                return (n1) l1VarN2.m3997build();
            }
        }
        g1 g1VarM = i1.m();
        g1VarM.c(encodeFieldPath(fieldFilter.getField()));
        g1VarM.d(encodeFieldFilterOperator(fieldFilter.getOperator()));
        g1VarM.e(fieldFilter.getValue());
        l1 l1VarN3 = n1.n();
        l1VarN3.d(g1VarM);
        return (n1) l1VarN3.m3997build();
    }

    public q2 encodeVersion(SnapshotVersion snapshotVersion) {
        return encodeTimestamp(snapshotVersion.getTimestamp());
    }

    public boolean isLocalResourceName(ResourcePath resourcePath) {
        return isValidResourceName(resourcePath) && resourcePath.getSegment(1).equals(this.databaseId.getProjectId()) && resourcePath.getSegment(3).equals(this.databaseId.getDatabaseId());
    }

    public Target decodeQueryTarget(z1 z1Var) {
        return decodeQueryTarget(z1Var.i(), z1Var.j());
    }
}
