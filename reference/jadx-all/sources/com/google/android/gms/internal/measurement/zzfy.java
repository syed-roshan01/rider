package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import q.f;

/* JADX INFO: loaded from: classes.dex */
public final class zzfy implements zzgb {
    private static final Map<Uri, zzfy> zza = new f();
    private static final String[] zzb = {"key", FirebaseAnalytics.Param.VALUE};
    private final ContentResolver zzc;
    private final Uri zzd;
    private final Runnable zze;
    private final ContentObserver zzf;
    private final Object zzg;
    private volatile Map<String, String> zzh;
    private final List<zzfz> zzi;

    private zzfy(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        zzga zzgaVar = new zzga(this, null);
        this.zzf = zzgaVar;
        this.zzg = new Object();
        this.zzi = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.zzc = contentResolver;
        this.zzd = uri;
        this.zze = runnable;
        contentResolver.registerContentObserver(uri, false, zzgaVar);
    }

    public static zzfy zza(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        zzfy zzfyVar;
        synchronized (zzfy.class) {
            Map<Uri, zzfy> map = zza;
            zzfyVar = map.get(uri);
            if (zzfyVar == null) {
                try {
                    zzfy zzfyVar2 = new zzfy(contentResolver, uri, runnable);
                    try {
                        map.put(uri, zzfyVar2);
                    } catch (SecurityException unused) {
                    }
                    zzfyVar = zzfyVar2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return zzfyVar;
    }

    public static synchronized void zzc() {
        try {
            for (zzfy zzfyVar : zza.values()) {
                zzfyVar.zzc.unregisterContentObserver(zzfyVar.zzf);
            }
            zza.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    private final Map<String, String> zze() {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return (Map) zzge.zza(new zzgd() { // from class: com.google.android.gms.internal.measurement.zzfx
                @Override // com.google.android.gms.internal.measurement.zzgd
                public final Object zza() {
                    return this.zza.zzb();
                }
            });
        } catch (SQLiteException | IllegalStateException | SecurityException unused) {
            Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
            return null;
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    public final Map zzb() {
        Cursor cursorQuery = this.zzc.query(this.zzd, zzb, null, null, null);
        if (cursorQuery == null) {
            return Collections.emptyMap();
        }
        try {
            int count = cursorQuery.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            Map fVar = count <= 256 ? new f(count) : new HashMap(count, 1.0f);
            while (cursorQuery.moveToNext()) {
                fVar.put(cursorQuery.getString(0), cursorQuery.getString(1));
            }
            return fVar;
        } finally {
            cursorQuery.close();
        }
    }

    public final void zzd() {
        synchronized (this.zzg) {
            this.zzh = null;
            this.zze.run();
        }
        synchronized (this) {
            try {
                Iterator<zzfz> it = this.zzi.iterator();
                while (it.hasNext()) {
                    it.next().zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgb
    public final /* synthetic */ Object zza(String str) {
        return zza().get(str);
    }

    public final Map<String, String> zza() {
        Map<String, String> mapZze = this.zzh;
        if (mapZze == null) {
            synchronized (this.zzg) {
                try {
                    mapZze = this.zzh;
                    if (mapZze == null) {
                        mapZze = zze();
                        this.zzh = mapZze;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return mapZze != null ? mapZze : Collections.emptyMap();
    }
}
