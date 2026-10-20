package w5;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends i {
    private static final e zza;
    private static final com.google.android.gms.common.api.a zzb;
    private static final f zzc;

    static {
        e eVar = new e();
        zza = eVar;
        b bVar = new b(0);
        zzb = bVar;
        zzc = new f("SmsRetriever.API", bVar, eVar);
    }

    public a(Context context) {
        super(context, null, zzc, null, h.f3156c);
    }

    public a(Activity activity) {
        super(activity, activity, zzc, null, h.f3156c);
    }
}
