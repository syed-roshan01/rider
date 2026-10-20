package x2;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static LocaleList a(Configuration configuration) {
        return configuration.getLocales();
    }

    public static void b(Configuration configuration, m mVar) {
        configuration.setLocales((LocaleList) mVar.f16299a.a());
    }
}
