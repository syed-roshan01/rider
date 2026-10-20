package com.google.gson.internal.bind;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import p7.a0;
import p7.b0;
import p7.q;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b0 f3975b = new b0() { // from class: com.google.gson.internal.bind.DateTypeAdapter$1
        @Override // p7.b0
        public final a0 a(p7.n nVar, u7.a aVar) {
            if (aVar.f15425a == Date.class) {
                return new b();
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f3976a;

    public b() {
        ArrayList arrayList = new ArrayList();
        this.f3976a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (r7.j.f13613a >= 9) {
            arrayList.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", locale));
        }
    }

    @Override // p7.a0
    public final Object b(v7.a aVar) throws IOException {
        Date dateB;
        if (aVar.k0() == 9) {
            aVar.g0();
            return null;
        }
        String strI0 = aVar.i0();
        synchronized (this.f3976a) {
            try {
                Iterator it = this.f3976a.iterator();
                while (it.hasNext()) {
                    try {
                        dateB = ((DateFormat) it.next()).parse(strI0);
                    } catch (ParseException unused) {
                    }
                }
                try {
                    dateB = s7.a.b(strI0, new ParsePosition(0));
                } catch (ParseException e4) {
                    StringBuilder sbR = a7.a.r("Failed parsing '", strI0, "' as Date; at path ");
                    sbR.append(aVar.u(true));
                    throw new q(sbR.toString(), e4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return dateB;
    }

    @Override // p7.a0
    public final void c(v7.b bVar, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            bVar.M();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f3976a.get(0);
        synchronized (this.f3976a) {
            str = dateFormat.format(date);
        }
        bVar.e0(str);
    }
}
