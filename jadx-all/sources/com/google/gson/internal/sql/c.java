package com.google.gson.internal.sql;

import java.sql.Timestamp;
import java.util.Date;
import p7.a0;
import p7.b0;
import p7.n;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b0 f4048b = new b0() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter$1
        @Override // p7.b0
        public final a0 a(n nVar, u7.a aVar) {
            if (aVar.f15425a != Timestamp.class) {
                return null;
            }
            nVar.getClass();
            return new c(nVar.c(new u7.a(Date.class)));
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f4049a;

    public c(a0 a0Var) {
        this.f4049a = a0Var;
    }

    @Override // p7.a0
    public final Object b(v7.a aVar) {
        Date date = (Date) this.f4049a.b(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // p7.a0
    public final void c(v7.b bVar, Object obj) {
        this.f4049a.c(bVar, (Timestamp) obj);
    }
}
