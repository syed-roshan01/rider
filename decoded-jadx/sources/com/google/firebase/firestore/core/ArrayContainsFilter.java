package com.google.firebase.firestore.core;

import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.Values;
import o7.i2;

/* JADX INFO: loaded from: classes.dex */
public class ArrayContainsFilter extends FieldFilter {
    public ArrayContainsFilter(FieldPath fieldPath, i2 i2Var) {
        super(fieldPath, FieldFilter.Operator.ARRAY_CONTAINS, i2Var);
    }

    @Override // com.google.firebase.firestore.core.FieldFilter, com.google.firebase.firestore.core.Filter
    public boolean matches(Document document) {
        i2 field = document.getField(getField());
        return Values.isArray(field) && Values.contains(field.q(), getValue());
    }
}
