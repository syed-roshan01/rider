package com.google.protobuf;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class o2 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparable f4195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f4196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k2 f4197c;

    public o2(k2 k2Var, Comparable comparable, Object obj) {
        this.f4197c = k2Var;
        this.f4195a = comparable;
        this.f4196b = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f4195a.compareTo(((o2) obj).f4195a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Comparable comparable = this.f4195a;
        if (comparable != null ? comparable.equals(key) : key == null) {
            Object obj2 = this.f4196b;
            Object value = entry.getValue();
            if (obj2 == null) {
                if (value == null) {
                    return true;
                }
            } else if (obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4195a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f4196b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f4195a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f4196b;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i10 = k2.f4168n;
        this.f4197c.b();
        Object obj2 = this.f4196b;
        this.f4196b = obj;
        return obj2;
    }

    public final String toString() {
        return this.f4195a + "=" + this.f4196b;
    }
}
