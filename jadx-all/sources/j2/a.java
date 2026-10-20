package j2;

import android.os.LocaleList;
import android.text.style.LocaleSpan;
import h2.c;
import h2.d;
import h2.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f8334a = new a();

    public final Object a(d dVar) {
        ArrayList arrayList = new ArrayList(f9.a.y0(dVar));
        Iterator it = dVar.f7539a.iterator();
        while (it.hasNext()) {
            e eVar = ((c) it.next()).f7538a;
            d7.a.k(eVar, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
            arrayList.add(((h2.a) eVar).f7534a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public final void b(i2.e eVar, d dVar) {
        ArrayList arrayList = new ArrayList(f9.a.y0(dVar));
        Iterator it = dVar.f7539a.iterator();
        while (it.hasNext()) {
            e eVar2 = ((c) it.next()).f7538a;
            d7.a.k(eVar2, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
            arrayList.add(((h2.a) eVar2).f7534a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        eVar.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
