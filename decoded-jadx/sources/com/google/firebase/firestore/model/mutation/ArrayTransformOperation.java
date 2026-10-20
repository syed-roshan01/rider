package com.google.firebase.firestore.model.mutation;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.model.Values;
import java.util.Collections;
import java.util.List;
import o7.d;
import o7.e;
import o7.g2;
import o7.i2;

/* JADX INFO: loaded from: classes.dex */
public abstract class ArrayTransformOperation implements TransformOperation {
    private final List<i2> elements;

    public static class Remove extends ArrayTransformOperation {
        public Remove(List<i2> list) {
            super(list);
        }

        @Override // com.google.firebase.firestore.model.mutation.ArrayTransformOperation
        public i2 apply(i2 i2Var) {
            d dVarCoercedFieldValuesArray = ArrayTransformOperation.coercedFieldValuesArray(i2Var);
            for (i2 i2Var2 : getElements()) {
                int i10 = 0;
                while (i10 < dVarCoercedFieldValuesArray.f()) {
                    if (Values.equals(dVarCoercedFieldValuesArray.e(i10), i2Var2)) {
                        dVarCoercedFieldValuesArray.g(i10);
                    } else {
                        i10++;
                    }
                }
            }
            g2 g2VarC = i2.C();
            g2VarC.d(dVarCoercedFieldValuesArray);
            return (i2) g2VarC.m3997build();
        }
    }

    public static class Union extends ArrayTransformOperation {
        public Union(List<i2> list) {
            super(list);
        }

        @Override // com.google.firebase.firestore.model.mutation.ArrayTransformOperation
        public i2 apply(i2 i2Var) {
            d dVarCoercedFieldValuesArray = ArrayTransformOperation.coercedFieldValuesArray(i2Var);
            for (i2 i2Var2 : getElements()) {
                if (!Values.contains(dVarCoercedFieldValuesArray, i2Var2)) {
                    dVarCoercedFieldValuesArray.d(i2Var2);
                }
            }
            g2 g2VarC = i2.C();
            g2VarC.d(dVarCoercedFieldValuesArray);
            return (i2) g2VarC.m3997build();
        }
    }

    public ArrayTransformOperation(List<i2> list) {
        this.elements = Collections.unmodifiableList(list);
    }

    public static d coercedFieldValuesArray(i2 i2Var) {
        return Values.isArray(i2Var) ? (d) i2Var.q().m4005toBuilder() : e.l();
    }

    public abstract i2 apply(i2 i2Var);

    @Override // com.google.firebase.firestore.model.mutation.TransformOperation
    public i2 applyToLocalView(i2 i2Var, Timestamp timestamp) {
        return apply(i2Var);
    }

    @Override // com.google.firebase.firestore.model.mutation.TransformOperation
    public i2 applyToRemoteDocument(i2 i2Var, i2 i2Var2) {
        return apply(i2Var);
    }

    @Override // com.google.firebase.firestore.model.mutation.TransformOperation
    public i2 computeBaseValue(i2 i2Var) {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.elements.equals(((ArrayTransformOperation) obj).elements);
    }

    public List<i2> getElements() {
        return this.elements;
    }

    public int hashCode() {
        return this.elements.hashCode() + (getClass().hashCode() * 31);
    }
}
