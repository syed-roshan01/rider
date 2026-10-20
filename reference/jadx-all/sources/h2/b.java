package h2;

import a4.q;
import android.os.LocaleList;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LocaleList f7535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f7536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f7537c = new q();

    public final d a() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (this.f7537c) {
            d dVar = this.f7536b;
            if (dVar != null && localeList == this.f7535a) {
                return dVar;
            }
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(new c(new a(localeList.get(i10))));
            }
            d dVar2 = new d(arrayList);
            this.f7535a = localeList;
            this.f7536b = dVar2;
            return dVar2;
        }
    }
}
