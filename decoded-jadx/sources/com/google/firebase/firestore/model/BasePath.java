package com.google.firebase.firestore.model;

import com.google.firebase.firestore.model.BasePath;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Util;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class BasePath<B extends BasePath<B>> implements Comparable<B> {
    final List<String> segments;

    public BasePath(List<String> list) {
        this.segments = list;
    }

    public B append(String str) {
        ArrayList arrayList = new ArrayList(this.segments);
        arrayList.add(str);
        return (B) createPathWithSegments(arrayList);
    }

    public abstract String canonicalString();

    public abstract B createPathWithSegments(List<String> list);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BasePath) && compareTo((BasePath) obj) == 0;
    }

    public String getFirstSegment() {
        return this.segments.get(0);
    }

    public String getLastSegment() {
        return this.segments.get(length() - 1);
    }

    public String getSegment(int i10) {
        return this.segments.get(i10);
    }

    public int hashCode() {
        return this.segments.hashCode() + ((getClass().hashCode() + 37) * 37);
    }

    public boolean isEmpty() {
        return length() == 0;
    }

    public boolean isImmediateParentOf(B b10) {
        if (length() + 1 != b10.length()) {
            return false;
        }
        for (int i10 = 0; i10 < length(); i10++) {
            if (!getSegment(i10).equals(b10.getSegment(i10))) {
                return false;
            }
        }
        return true;
    }

    public boolean isPrefixOf(B b10) {
        if (length() > b10.length()) {
            return false;
        }
        for (int i10 = 0; i10 < length(); i10++) {
            if (!getSegment(i10).equals(b10.getSegment(i10))) {
                return false;
            }
        }
        return true;
    }

    public B keepFirst(int i10) {
        return (B) createPathWithSegments(this.segments.subList(0, i10));
    }

    public int length() {
        return this.segments.size();
    }

    public B popFirst() {
        return (B) popFirst(1);
    }

    public B popLast() {
        return (B) createPathWithSegments(this.segments.subList(0, length() - 1));
    }

    public String toString() {
        return canonicalString();
    }

    @Override // java.lang.Comparable
    public int compareTo(B b10) {
        int length = length();
        int length2 = b10.length();
        for (int i10 = 0; i10 < length && i10 < length2; i10++) {
            int iCompareTo = getSegment(i10).compareTo(b10.getSegment(i10));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Util.compareIntegers(length, length2);
    }

    public B popFirst(int i10) {
        int length = length();
        Assert.hardAssert(length >= i10, "Can't call popFirst with count > length() (%d > %d)", Integer.valueOf(i10), Integer.valueOf(length));
        return (B) createPathWithSegments(this.segments.subList(i10, length));
    }

    public B append(B b10) {
        ArrayList arrayList = new ArrayList(this.segments);
        arrayList.addAll(b10.segments);
        return (B) createPathWithSegments(arrayList);
    }
}
