package com.google.android.gms.common.internal;

import android.accounts.Account;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Account f3300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f3301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f3302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f3304e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m6.a f3305f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f3306g;

    public h(Account account, q.g gVar, String str, String str2) {
        m6.a aVar = m6.a.f11881a;
        this.f3300a = account;
        Set setEmptySet = gVar == null ? Collections.emptySet() : Collections.unmodifiableSet(gVar);
        this.f3301b = setEmptySet;
        Map mapEmptyMap = Collections.emptyMap();
        this.f3303d = str;
        this.f3304e = str2;
        this.f3305f = aVar;
        HashSet hashSet = new HashSet(setEmptySet);
        Iterator it = mapEmptyMap.values().iterator();
        if (it.hasNext()) {
            a7.a.w(it.next());
            throw null;
        }
        this.f3302c = Collections.unmodifiableSet(hashSet);
    }
}
