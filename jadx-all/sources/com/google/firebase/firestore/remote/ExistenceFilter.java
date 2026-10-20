package com.google.firebase.firestore.remote;

import o7.k;

/* JADX INFO: loaded from: classes.dex */
public final class ExistenceFilter {
    private final int count;
    private k unchangedNames;

    public ExistenceFilter(int i10) {
        this.count = i10;
    }

    public int getCount() {
        return this.count;
    }

    public k getUnchangedNames() {
        return this.unchangedNames;
    }

    public String toString() {
        return "ExistenceFilter{count=" + this.count + ", unchangedNames=" + this.unchangedNames + '}';
    }

    public ExistenceFilter(int i10, k kVar) {
        this.count = i10;
        this.unchangedNames = kVar;
    }
}
