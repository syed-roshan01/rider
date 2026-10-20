package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends f implements com.google.android.gms.common.api.d {
    private static volatile Executor zaa;
    private final h zab;
    private final Set<Scope> zac;
    private final Account zad;

    /* JADX WARN: Illegal instructions before constructor call */
    public k(Context context, Looper looper, int i10, h hVar, com.google.android.gms.common.api.internal.e eVar, com.google.android.gms.common.api.internal.n nVar) {
        p0 p0VarA = l.a(context);
        z5.e eVar2 = z5.e.f17251d;
        if (eVar == null) {
            throw new NullPointerException("null reference");
        }
        if (nVar == null) {
            throw new NullPointerException("null reference");
        }
        super(context, looper, p0VarA, eVar2, i10, new k.f(eVar, 26), new k.f(nVar, 27), hVar.f3304e);
        this.zab = hVar;
        this.zad = hVar.f3300a;
        Set<Scope> set = hVar.f3302c;
        Set<Scope> setValidateScopes = validateScopes(set);
        Iterator<Scope> it = setValidateScopes.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.zac = setValidateScopes;
    }

    @Override // com.google.android.gms.common.internal.f
    public final Account getAccount() {
        return this.zad;
    }

    @Override // com.google.android.gms.common.internal.f
    public final Executor getBindServiceExecutor() {
        return null;
    }

    public final h getClientSettings() {
        return this.zab;
    }

    public z5.d[] getRequiredFeatures() {
        return new z5.d[0];
    }

    @Override // com.google.android.gms.common.internal.f
    public final Set<Scope> getScopes() {
        return this.zac;
    }

    @Override // com.google.android.gms.common.api.d
    public Set<Scope> getScopesForConnectionlessNonSignIn() {
        return requiresSignIn() ? this.zac : Collections.emptySet();
    }

    public Set<Scope> validateScopes(Set<Scope> set) {
        return set;
    }
}
