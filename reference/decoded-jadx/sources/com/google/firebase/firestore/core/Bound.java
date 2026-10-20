package com.google.firebase.firestore.core;

import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import java.util.List;
import o7.i2;

/* JADX INFO: loaded from: classes.dex */
public final class Bound {
    private final boolean inclusive;
    private final List<i2> position;

    public Bound(List<i2> list, boolean z10) {
        this.position = list;
        this.inclusive = z10;
    }

    private int compareToDocument(List<OrderBy> list, Document document) {
        int iCompare;
        Assert.hardAssert(this.position.size() <= list.size(), "Bound has more components than query's orderBy", new Object[0]);
        int i10 = 0;
        for (int i11 = 0; i11 < this.position.size(); i11++) {
            OrderBy orderBy = list.get(i11);
            i2 i2Var = this.position.get(i11);
            if (orderBy.field.equals(FieldPath.KEY_PATH)) {
                Assert.hardAssert(Values.isReferenceValue(i2Var), "Bound has a non-key value where the key path is being used %s", i2Var);
                iCompare = DocumentKey.fromName(i2Var.y()).compareTo(document.getKey());
            } else {
                i2 field = document.getField(orderBy.getField());
                Assert.hardAssert(field != null, "Field should exist since document matched the orderBy already.", new Object[0]);
                iCompare = Values.compare(i2Var, field);
            }
            if (orderBy.getDirection().equals(OrderBy.Direction.DESCENDING)) {
                iCompare *= -1;
            }
            i10 = iCompare;
            if (i10 != 0) {
                break;
            }
        }
        return i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Bound.class != obj.getClass()) {
            return false;
        }
        Bound bound = (Bound) obj;
        return this.inclusive == bound.inclusive && this.position.equals(bound.position);
    }

    public List<i2> getPosition() {
        return this.position;
    }

    public int hashCode() {
        return this.position.hashCode() + ((this.inclusive ? 1 : 0) * 31);
    }

    public boolean isInclusive() {
        return this.inclusive;
    }

    public String positionString() {
        StringBuilder sb = new StringBuilder();
        boolean z10 = true;
        for (i2 i2Var : this.position) {
            if (!z10) {
                sb.append(",");
            }
            sb.append(Values.canonicalId(i2Var));
            z10 = false;
        }
        return sb.toString();
    }

    public boolean sortsAfterDocument(List<OrderBy> list, Document document) {
        int iCompareToDocument = compareToDocument(list, document);
        if (this.inclusive) {
            if (iCompareToDocument < 0) {
                return false;
            }
        } else if (iCompareToDocument <= 0) {
            return false;
        }
        return true;
    }

    public boolean sortsBeforeDocument(List<OrderBy> list, Document document) {
        int iCompareToDocument = compareToDocument(list, document);
        if (this.inclusive) {
            if (iCompareToDocument > 0) {
                return false;
            }
        } else if (iCompareToDocument >= 0) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Bound(inclusive=");
        sb.append(this.inclusive);
        sb.append(", position=");
        for (int i10 = 0; i10 < this.position.size(); i10++) {
            if (i10 > 0) {
                sb.append(" and ");
            }
            sb.append(Values.canonicalId(this.position.get(i10)));
        }
        sb.append(")");
        return sb.toString();
    }
}
