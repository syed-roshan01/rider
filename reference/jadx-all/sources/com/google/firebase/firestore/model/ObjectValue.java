package com.google.firebase.firestore.model;

import com.google.firebase.firestore.model.mutation.FieldMask;
import com.google.firebase.firestore.util.Assert;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o7.g2;
import o7.h2;
import o7.i0;
import o7.i2;
import o7.k0;

/* JADX INFO: loaded from: classes.dex */
public final class ObjectValue implements Cloneable {
    private final Map<String, Object> overlayMap;
    private i2 partialValue;

    public ObjectValue(i2 i2Var) {
        this.overlayMap = new HashMap();
        Assert.hardAssert(i2Var.B() == h2.f12632r, "ObjectValues should be backed by a MapValue", new Object[0]);
        Assert.hardAssert(!ServerTimestamps.isServerTimestamp(i2Var), "ServerTimestamps should not be used as an ObjectValue", new Object[0]);
        this.partialValue = i2Var;
    }

    private k0 applyOverlay(FieldPath fieldPath, Map<String, Object> map) {
        i2 i2VarExtractNestedValue = extractNestedValue(this.partialValue, fieldPath);
        i0 i0VarL = Values.isMapValue(i2VarExtractNestedValue) ? (i0) i2VarExtractNestedValue.x().m4005toBuilder() : k0.l();
        boolean z10 = false;
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                k0 k0VarApplyOverlay = applyOverlay(fieldPath.append(key), (Map) value);
                if (k0VarApplyOverlay != null) {
                    g2 g2VarC = i2.C();
                    g2VarC.l(k0VarApplyOverlay);
                    i0VarL.e((i2) g2VarC.m3997build(), key);
                    z10 = true;
                }
            } else {
                if (value instanceof i2) {
                    i0VarL.e((i2) value, key);
                } else if (i0VarL.c(key)) {
                    Assert.hardAssert(value == null, "Expected entry to be a Map, a Value or null", new Object[0]);
                    i0VarL.f(key);
                }
                z10 = true;
            }
        }
        if (z10) {
            return (k0) i0VarL.m3997build();
        }
        return null;
    }

    private i2 buildProto() {
        synchronized (this.overlayMap) {
            try {
                k0 k0VarApplyOverlay = applyOverlay(FieldPath.EMPTY_PATH, this.overlayMap);
                if (k0VarApplyOverlay != null) {
                    g2 g2VarC = i2.C();
                    g2VarC.l(k0VarApplyOverlay);
                    this.partialValue = (i2) g2VarC.m3997build();
                    this.overlayMap.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.partialValue;
    }

    private FieldMask extractFieldMask(k0 k0Var) {
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : k0Var.i().entrySet()) {
            FieldPath fieldPathFromSingleSegment = FieldPath.fromSingleSegment((String) entry.getKey());
            if (Values.isMapValue((i2) entry.getValue())) {
                Set<FieldPath> mask = extractFieldMask(((i2) entry.getValue()).x()).getMask();
                if (mask.isEmpty()) {
                    hashSet.add(fieldPathFromSingleSegment);
                } else {
                    Iterator<FieldPath> it = mask.iterator();
                    while (it.hasNext()) {
                        hashSet.add(fieldPathFromSingleSegment.append(it.next()));
                    }
                }
            } else {
                hashSet.add(fieldPathFromSingleSegment);
            }
        }
        return FieldMask.fromSet(hashSet);
    }

    private i2 extractNestedValue(i2 i2Var, FieldPath fieldPath) {
        if (fieldPath.isEmpty()) {
            return i2Var;
        }
        for (int i10 = 0; i10 < fieldPath.length() - 1; i10++) {
            i2Var = i2Var.x().j(fieldPath.getSegment(i10));
            if (!Values.isMapValue(i2Var)) {
                return null;
            }
        }
        return i2Var.x().j(fieldPath.getLastSegment());
    }

    public static ObjectValue fromMap(Map<String, i2> map) {
        g2 g2VarC = i2.C();
        i0 i0VarL = k0.l();
        i0VarL.d(map);
        g2VarC.k(i0VarL);
        return new ObjectValue((i2) g2VarC.m3997build());
    }

    private void setOverlay(FieldPath fieldPath, i2 i2Var) {
        Map<String, Object> map;
        Map<String, Object> map2 = this.overlayMap;
        for (int i10 = 0; i10 < fieldPath.length() - 1; i10++) {
            String segment = fieldPath.getSegment(i10);
            Object obj = map2.get(segment);
            if (obj instanceof Map) {
                map = (Map) obj;
            } else {
                if (obj instanceof i2) {
                    i2 i2Var2 = (i2) obj;
                    if (i2Var2.B() == h2.f12632r) {
                        HashMap map3 = new HashMap(i2Var2.x().i());
                        map2.put(segment, map3);
                        map2 = map3;
                    }
                }
                map = new HashMap<>();
                map2.put(segment, map);
            }
            map2 = map;
        }
        map2.put(fieldPath.getLastSegment(), i2Var);
    }

    public void delete(FieldPath fieldPath) {
        Assert.hardAssert(!fieldPath.isEmpty(), "Cannot delete field for empty path on ObjectValue", new Object[0]);
        setOverlay(fieldPath, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ObjectValue) {
            return Values.equals(buildProto(), ((ObjectValue) obj).buildProto());
        }
        return false;
    }

    public i2 get(FieldPath fieldPath) {
        return extractNestedValue(buildProto(), fieldPath);
    }

    public FieldMask getFieldMask() {
        return extractFieldMask(buildProto().x());
    }

    public Map<String, i2> getFieldsMap() {
        return buildProto().x().i();
    }

    public int hashCode() {
        return buildProto().hashCode();
    }

    public void set(FieldPath fieldPath, i2 i2Var) {
        Assert.hardAssert(!fieldPath.isEmpty(), "Cannot set field for empty path on ObjectValue", new Object[0]);
        setOverlay(fieldPath, i2Var);
    }

    public void setAll(Map<FieldPath, i2> map) {
        for (Map.Entry<FieldPath, i2> entry : map.entrySet()) {
            FieldPath key = entry.getKey();
            if (entry.getValue() == null) {
                delete(key);
            } else {
                set(key, entry.getValue());
            }
        }
    }

    public String toString() {
        return "ObjectValue{internalValue=" + Values.canonicalId(buildProto()) + '}';
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public ObjectValue m3026clone() {
        return new ObjectValue(buildProto());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ObjectValue() {
        g2 g2VarC = i2.C();
        g2VarC.l(k0.g());
        this((i2) g2VarC.m3997build());
    }
}
