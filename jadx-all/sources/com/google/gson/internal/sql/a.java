package com.google.gson.internal.sql;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import p7.a0;
import p7.b0;
import p7.n;
import p7.q;

/* JADX INFO: loaded from: classes.dex */
public final class a extends a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b0 f4044b = new b0() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter$1
        @Override // p7.b0
        public final a0 a(n nVar, u7.a aVar) {
            if (aVar.f15425a == Date.class) {
                return new a();
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f4045a = new SimpleDateFormat("MMM d, yyyy");

    @Override // p7.a0
    public final Object b(v7.a aVar) throws IOException {
        java.util.Date date;
        if (aVar.k0() == 9) {
            aVar.g0();
            return null;
        }
        String strI0 = aVar.i0();
        try {
            synchronized (this) {
                date = this.f4045a.parse(strI0);
            }
            return new Date(date.getTime());
        } catch (ParseException e4) {
            StringBuilder sbR = a7.a.r("Failed parsing '", strI0, "' as SQL Date; at path ");
            sbR.append(aVar.u(true));
            throw new q(sbR.toString(), e4);
        }
    }

    @Override // p7.a0
    public final void c(v7.b bVar, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            bVar.M();
            return;
        }
        synchronized (this) {
            str = this.f4045a.format((java.util.Date) date);
        }
        bVar.e0(str);
    }
}
