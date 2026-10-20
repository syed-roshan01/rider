package com.google.gson.internal.sql;

import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import p7.a0;
import p7.b0;
import p7.n;
import p7.q;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b0 f4046b = new b0() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter$1
        @Override // p7.b0
        public final a0 a(n nVar, u7.a aVar) {
            if (aVar.f15425a == Time.class) {
                return new b();
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f4047a = new SimpleDateFormat("hh:mm:ss a");

    @Override // p7.a0
    public final Object b(v7.a aVar) throws IOException {
        Time time;
        if (aVar.k0() == 9) {
            aVar.g0();
            return null;
        }
        String strI0 = aVar.i0();
        try {
            synchronized (this) {
                try {
                    time = new Time(this.f4047a.parse(strI0).getTime());
                } catch (Throwable th) {
                    throw th;
                }
            }
            return time;
        } catch (ParseException e4) {
            StringBuilder sbR = a7.a.r("Failed parsing '", strI0, "' as SQL Time; at path ");
            sbR.append(aVar.u(true));
            throw new q(sbR.toString(), e4);
        }
    }

    @Override // p7.a0
    public final void c(v7.b bVar, Object obj) throws IOException {
        String str;
        Time time = (Time) obj;
        if (time == null) {
            bVar.M();
            return;
        }
        synchronized (this) {
            str = this.f4047a.format((Date) time);
        }
        bVar.e0(str);
    }
}
