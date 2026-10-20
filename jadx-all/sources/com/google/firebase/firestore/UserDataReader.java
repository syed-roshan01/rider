package com.google.firebase.firestore;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.core.UserData;
import com.google.firebase.firestore.model.DatabaseId;
import com.google.firebase.firestore.model.ObjectValue;
import com.google.firebase.firestore.model.mutation.ArrayTransformOperation;
import com.google.firebase.firestore.model.mutation.FieldMask;
import com.google.firebase.firestore.model.mutation.NumericIncrementTransformOperation;
import com.google.firebase.firestore.model.mutation.ServerTimestampOperation;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.CustomClassMapper;
import com.google.firebase.firestore.util.Preconditions;
import com.google.firebase.firestore.util.Util;
import com.google.protobuf.p2;
import com.google.protobuf.q2;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o7.g2;
import o7.h2;
import o7.i0;
import o7.i2;
import o7.k0;

/* JADX INFO: loaded from: classes.dex */
public final class UserDataReader {
    private final DatabaseId databaseId;

    public UserDataReader(DatabaseId databaseId) {
        this.databaseId = databaseId;
    }

    private ObjectValue convertAndParseDocumentData(Object obj, UserData.ParseContext parseContext) {
        if (obj.getClass().isArray()) {
            throw new IllegalArgumentException("Invalid data. Data must be a Map<String, Object> or a suitable POJO object, but it was an array");
        }
        i2 data = parseData(CustomClassMapper.convertToPlainJavaTypes(obj), parseContext);
        if (data.B() == h2.f12632r) {
            return new ObjectValue(data);
        }
        throw new IllegalArgumentException("Invalid data. Data must be a Map<String, Object> or a suitable POJO object, but it was of type: " + Util.typeName(obj));
    }

    private List<i2> parseArrayTransformElements(List<Object> list) {
        UserData.ParseAccumulator parseAccumulator = new UserData.ParseAccumulator(UserData.Source.Argument);
        ArrayList arrayList = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(convertAndParseFieldData(list.get(i10), parseAccumulator.rootContext().childContext(i10)));
        }
        return arrayList;
    }

    private i2 parseData(Object obj, UserData.ParseContext parseContext) {
        if (obj instanceof Map) {
            return parseMap((Map) obj, parseContext);
        }
        if (obj instanceof FieldValue) {
            parseSentinelFieldValue((FieldValue) obj, parseContext);
            return null;
        }
        if (parseContext.getPath() != null) {
            parseContext.addToFieldMask(parseContext.getPath());
        }
        if (!(obj instanceof List)) {
            return parseScalarValue(obj, parseContext);
        }
        if (!parseContext.isArrayElement() || parseContext.getDataSource() == UserData.Source.ArrayArgument) {
            return parseList((List) obj, parseContext);
        }
        throw parseContext.createError("Nested arrays are not supported");
    }

    private <T> i2 parseList(List<T> list, UserData.ParseContext parseContext) {
        o7.d dVarL = o7.e.l();
        Iterator<T> it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i2 data = parseData(it.next(), parseContext.childContext(i10));
            if (data == null) {
                g2 g2VarC = i2.C();
                g2VarC.m();
                data = (i2) g2VarC.m3997build();
            }
            dVarL.d(data);
            i10++;
        }
        g2 g2VarC2 = i2.C();
        g2VarC2.d(dVarL);
        return (i2) g2VarC2.m3997build();
    }

    private <K, V> i2 parseMap(Map<K, V> map, UserData.ParseContext parseContext) {
        if (map.isEmpty()) {
            if (parseContext.getPath() != null && !parseContext.getPath().isEmpty()) {
                parseContext.addToFieldMask(parseContext.getPath());
            }
            g2 g2VarC = i2.C();
            g2VarC.l(k0.g());
            return (i2) g2VarC.m3997build();
        }
        i0 i0VarL = k0.l();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (!(entry.getKey() instanceof String)) {
                throw parseContext.createError(String.format("Non-String Map key (%s) is not allowed", entry.getValue()));
            }
            String str = (String) entry.getKey();
            i2 data = parseData(entry.getValue(), parseContext.childContext(str));
            if (data != null) {
                i0VarL.e(data, str);
            }
        }
        g2 g2VarC2 = i2.C();
        g2VarC2.k(i0VarL);
        return (i2) g2VarC2.m3997build();
    }

    private i2 parseScalarValue(Object obj, UserData.ParseContext parseContext) {
        if (obj == null) {
            g2 g2VarC = i2.C();
            g2VarC.m();
            return (i2) g2VarC.m3997build();
        }
        if (obj instanceof Integer) {
            g2 g2VarC2 = i2.C();
            g2VarC2.j(((Integer) obj).intValue());
            return (i2) g2VarC2.m3997build();
        }
        if (obj instanceof Long) {
            g2 g2VarC3 = i2.C();
            g2VarC3.j(((Long) obj).longValue());
            return (i2) g2VarC3.m3997build();
        }
        if (obj instanceof Float) {
            g2 g2VarC4 = i2.C();
            g2VarC4.h(((Float) obj).doubleValue());
            return (i2) g2VarC4.m3997build();
        }
        if (obj instanceof Double) {
            g2 g2VarC5 = i2.C();
            g2VarC5.h(((Double) obj).doubleValue());
            return (i2) g2VarC5.m3997build();
        }
        if (obj instanceof Boolean) {
            g2 g2VarC6 = i2.C();
            g2VarC6.f(((Boolean) obj).booleanValue());
            return (i2) g2VarC6.m3997build();
        }
        if (obj instanceof String) {
            g2 g2VarC7 = i2.C();
            g2VarC7.o((String) obj);
            return (i2) g2VarC7.m3997build();
        }
        if (obj instanceof Date) {
            return parseTimestamp(new Timestamp((Date) obj));
        }
        if (obj instanceof Timestamp) {
            return parseTimestamp((Timestamp) obj);
        }
        if (obj instanceof GeoPoint) {
            GeoPoint geoPoint = (GeoPoint) obj;
            g2 g2VarC8 = i2.C();
            x7.a aVarK = x7.b.k();
            aVarK.c(geoPoint.getLatitude());
            aVarK.d(geoPoint.getLongitude());
            g2VarC8.i(aVarK);
            return (i2) g2VarC8.m3997build();
        }
        if (obj instanceof Blob) {
            g2 g2VarC9 = i2.C();
            g2VarC9.g(((Blob) obj).toByteString());
            return (i2) g2VarC9.m3997build();
        }
        if (!(obj instanceof DocumentReference)) {
            if (obj.getClass().isArray()) {
                throw parseContext.createError("Arrays are not supported; use a List instead");
            }
            throw parseContext.createError("Unsupported type: " + Util.typeName(obj));
        }
        DocumentReference documentReference = (DocumentReference) obj;
        if (documentReference.getFirestore() != null) {
            DatabaseId databaseId = documentReference.getFirestore().getDatabaseId();
            if (!databaseId.equals(this.databaseId)) {
                throw parseContext.createError(String.format("Document reference is for database %s/%s but should be for database %s/%s", databaseId.getProjectId(), databaseId.getDatabaseId(), this.databaseId.getProjectId(), this.databaseId.getDatabaseId()));
            }
        }
        g2 g2VarC10 = i2.C();
        g2VarC10.n(String.format("projects/%s/databases/%s/documents/%s", this.databaseId.getProjectId(), this.databaseId.getDatabaseId(), documentReference.getPath()));
        return (i2) g2VarC10.m3997build();
    }

    private void parseSentinelFieldValue(FieldValue fieldValue, UserData.ParseContext parseContext) {
        if (!parseContext.isWrite()) {
            throw parseContext.createError(String.format("%s() can only be used with set() and update()", fieldValue.getMethodName()));
        }
        if (parseContext.getPath() == null) {
            throw parseContext.createError(String.format("%s() is not currently supported inside arrays", fieldValue.getMethodName()));
        }
        if (fieldValue instanceof FieldValue.DeleteFieldValue) {
            if (parseContext.getDataSource() == UserData.Source.MergeSet) {
                parseContext.addToFieldMask(parseContext.getPath());
                return;
            } else {
                if (parseContext.getDataSource() != UserData.Source.Update) {
                    throw parseContext.createError("FieldValue.delete() can only be used with update() and set() with SetOptions.merge()");
                }
                Assert.hardAssert(parseContext.getPath().length() > 0, "FieldValue.delete() at the top level should have already been handled.", new Object[0]);
                throw parseContext.createError("FieldValue.delete() can only appear at the top level of your update data");
            }
        }
        if (fieldValue instanceof FieldValue.ServerTimestampFieldValue) {
            parseContext.addToFieldTransforms(parseContext.getPath(), ServerTimestampOperation.getInstance());
            return;
        }
        if (fieldValue instanceof FieldValue.ArrayUnionFieldValue) {
            parseContext.addToFieldTransforms(parseContext.getPath(), new ArrayTransformOperation.Union(parseArrayTransformElements(((FieldValue.ArrayUnionFieldValue) fieldValue).getElements())));
        } else if (fieldValue instanceof FieldValue.ArrayRemoveFieldValue) {
            parseContext.addToFieldTransforms(parseContext.getPath(), new ArrayTransformOperation.Remove(parseArrayTransformElements(((FieldValue.ArrayRemoveFieldValue) fieldValue).getElements())));
        } else {
            if (!(fieldValue instanceof FieldValue.NumericIncrementFieldValue)) {
                throw Assert.fail("Unknown FieldValue type: %s", Util.typeName(fieldValue));
            }
            parseContext.addToFieldTransforms(parseContext.getPath(), new NumericIncrementTransformOperation(parseQueryValue(((FieldValue.NumericIncrementFieldValue) fieldValue).getOperand())));
        }
    }

    private i2 parseTimestamp(Timestamp timestamp) {
        int nanoseconds = (timestamp.getNanoseconds() / 1000) * 1000;
        g2 g2VarC = i2.C();
        p2 p2VarK = q2.k();
        p2VarK.d(timestamp.getSeconds());
        p2VarK.c(nanoseconds);
        g2VarC.p(p2VarK);
        return (i2) g2VarC.m3997build();
    }

    public i2 convertAndParseFieldData(Object obj, UserData.ParseContext parseContext) {
        return parseData(CustomClassMapper.convertToPlainJavaTypes(obj), parseContext);
    }

    public UserData.ParsedSetData parseMergeData(Object obj, FieldMask fieldMask) {
        UserData.ParseAccumulator parseAccumulator = new UserData.ParseAccumulator(UserData.Source.MergeSet);
        ObjectValue objectValueConvertAndParseDocumentData = convertAndParseDocumentData(obj, parseAccumulator.rootContext());
        if (fieldMask == null) {
            return parseAccumulator.toMergeData(objectValueConvertAndParseDocumentData);
        }
        for (com.google.firebase.firestore.model.FieldPath fieldPath : fieldMask.getMask()) {
            if (!parseAccumulator.contains(fieldPath)) {
                throw new IllegalArgumentException("Field '" + fieldPath.toString() + "' is specified in your field mask but not in your input data.");
            }
        }
        return parseAccumulator.toMergeData(objectValueConvertAndParseDocumentData, fieldMask);
    }

    public i2 parseQueryValue(Object obj) {
        return parseQueryValue(obj, false);
    }

    public UserData.ParsedSetData parseSetData(Object obj) {
        UserData.ParseAccumulator parseAccumulator = new UserData.ParseAccumulator(UserData.Source.Set);
        return parseAccumulator.toSetData(convertAndParseDocumentData(obj, parseAccumulator.rootContext()));
    }

    public UserData.ParsedUpdateData parseUpdateData(Map<String, Object> map) {
        Preconditions.checkNotNull(map, "Provided update data must not be null.");
        UserData.ParseAccumulator parseAccumulator = new UserData.ParseAccumulator(UserData.Source.Update);
        UserData.ParseContext parseContextRootContext = parseAccumulator.rootContext();
        ObjectValue objectValue = new ObjectValue();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            com.google.firebase.firestore.model.FieldPath internalPath = FieldPath.fromDotSeparatedPath(entry.getKey()).getInternalPath();
            Object value = entry.getValue();
            if (value instanceof FieldValue.DeleteFieldValue) {
                parseContextRootContext.addToFieldMask(internalPath);
            } else {
                i2 i2VarConvertAndParseFieldData = convertAndParseFieldData(value, parseContextRootContext.childContext(internalPath));
                if (i2VarConvertAndParseFieldData != null) {
                    parseContextRootContext.addToFieldMask(internalPath);
                    objectValue.set(internalPath, i2VarConvertAndParseFieldData);
                }
            }
        }
        return parseAccumulator.toUpdateData(objectValue);
    }

    public i2 parseQueryValue(Object obj, boolean z10) {
        UserData.ParseAccumulator parseAccumulator = new UserData.ParseAccumulator(z10 ? UserData.Source.ArrayArgument : UserData.Source.Argument);
        i2 i2VarConvertAndParseFieldData = convertAndParseFieldData(obj, parseAccumulator.rootContext());
        Assert.hardAssert(i2VarConvertAndParseFieldData != null, "Parsed data should not be null.", new Object[0]);
        Assert.hardAssert(parseAccumulator.getFieldTransforms().isEmpty(), "Field transforms should have been disallowed.", new Object[0]);
        return i2VarConvertAndParseFieldData;
    }

    public UserData.ParsedUpdateData parseUpdateData(List<Object> list) {
        com.google.firebase.firestore.model.FieldPath internalPath;
        Assert.hardAssert(list.size() % 2 == 0, "Expected fieldAndValues to contain an even number of elements", new Object[0]);
        UserData.ParseAccumulator parseAccumulator = new UserData.ParseAccumulator(UserData.Source.Update);
        UserData.ParseContext parseContextRootContext = parseAccumulator.rootContext();
        ObjectValue objectValue = new ObjectValue();
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object next2 = it.next();
            boolean z10 = next instanceof String;
            Assert.hardAssert(z10 || (next instanceof FieldPath), "Expected argument to be String or FieldPath.", new Object[0]);
            if (z10) {
                internalPath = FieldPath.fromDotSeparatedPath((String) next).getInternalPath();
            } else {
                internalPath = ((FieldPath) next).getInternalPath();
            }
            if (next2 instanceof FieldValue.DeleteFieldValue) {
                parseContextRootContext.addToFieldMask(internalPath);
            } else {
                i2 i2VarConvertAndParseFieldData = convertAndParseFieldData(next2, parseContextRootContext.childContext(internalPath));
                if (i2VarConvertAndParseFieldData != null) {
                    parseContextRootContext.addToFieldMask(internalPath);
                    objectValue.set(internalPath, i2VarConvertAndParseFieldData);
                }
            }
        }
        return parseAccumulator.toUpdateData(objectValue);
    }
}
