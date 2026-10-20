package com.google.android.gms.internal.measurement;

import a7.a;
import android.content.Context;
import android.net.Uri;
import q.f;

/* JADX INFO: loaded from: classes.dex */
public final class zzgk {
    private static final f zza = new f();

    public static synchronized Uri zza(String str) {
        Uri uri;
        f fVar = zza;
        uri = (Uri) fVar.get(str);
        if (uri == null) {
            uri = Uri.parse("content://com.google.android.gms.phenotype/" + Uri.encode(str));
            fVar.put(str, uri);
        }
        return uri;
    }

    public static String zza(Context context, String str) {
        if (!str.contains("#")) {
            return a.n(str, "#", context.getPackageName());
        }
        throw new IllegalArgumentException("The passed in package cannot already have a subpackage: ".concat(str));
    }
}
