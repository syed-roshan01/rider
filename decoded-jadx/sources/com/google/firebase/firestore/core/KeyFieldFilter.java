package com.google.firebase.firestore.core;

import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import o7.i2;

/* JADX INFO: loaded from: classes.dex */
public class KeyFieldFilter extends FieldFilter {
    private final DocumentKey key;

    public KeyFieldFilter(FieldPath fieldPath, FieldFilter.Operator operator, i2 i2Var) {
        super(fieldPath, operator, i2Var);
        Assert.hardAssert(Values.isReferenceValue(i2Var), "KeyFieldFilter expects a ReferenceValue", new Object[0]);
        this.key = DocumentKey.fromName(getValue().y());
    }

    @Override // com.google.firebase.firestore.core.FieldFilter, com.google.firebase.firestore.core.Filter
    public boolean matches(Document document) {
        return matchesComparison(document.getKey().compareTo(this.key));
    }
}
