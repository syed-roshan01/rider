package com.google.firebase.firestore.core;

import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import java.util.Iterator;
import o7.i2;

/* JADX INFO: loaded from: classes.dex */
public class ArrayContainsAnyFilter extends FieldFilter {
    public ArrayContainsAnyFilter(FieldPath fieldPath, i2 i2Var) {
        super(fieldPath, FieldFilter.Operator.ARRAY_CONTAINS_ANY, i2Var);
        Assert.hardAssert(Values.isArray(i2Var), "ArrayContainsAnyFilter expects an ArrayValue", new Object[0]);
    }

    @Override // com.google.firebase.firestore.core.FieldFilter, com.google.firebase.firestore.core.Filter
    public boolean matches(Document document) {
        i2 field = document.getField(getField());
        if (!Values.isArray(field)) {
            return false;
        }
        Iterator it = field.q().a().iterator();
        while (it.hasNext()) {
            if (Values.contains(getValue().q(), (i2) it.next())) {
                return true;
            }
        }
        return false;
    }
}
