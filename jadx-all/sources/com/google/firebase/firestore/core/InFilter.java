package com.google.firebase.firestore.core;

import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import o7.i2;

/* JADX INFO: loaded from: classes.dex */
public class InFilter extends FieldFilter {
    public InFilter(FieldPath fieldPath, i2 i2Var) {
        super(fieldPath, FieldFilter.Operator.IN, i2Var);
        Assert.hardAssert(Values.isArray(i2Var), "InFilter expects an ArrayValue", new Object[0]);
    }

    @Override // com.google.firebase.firestore.core.FieldFilter, com.google.firebase.firestore.core.Filter
    public boolean matches(Document document) {
        i2 field = document.getField(getField());
        return field != null && Values.contains(getValue().q(), field);
    }
}
