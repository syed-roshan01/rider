package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.firebase.FirebaseApp;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.q;
import q.f;

/* JADX INFO: loaded from: classes.dex */
public final class zzaec {
    private static final Map<String, zzaeb> zza = new f();
    private static final Map<String, List<WeakReference<zzaee>>> zzb = new f();

    private static String zza(String str, int i10, boolean z10) {
        if (z10) {
            return "http://[" + str + "]:" + i10 + "/";
        }
        return "http://" + str + ":" + i10 + "/";
    }

    public static String zzb(String str) {
        zzaeb zzaebVar;
        Map<String, zzaeb> map = zza;
        synchronized (map) {
            zzaebVar = map.get(str);
        }
        return q.j(zzaebVar != null ? q.x("", zza(zzaebVar.zzb(), zzaebVar.zza(), zzaebVar.zzb().contains(":"))) : "https://", "www.googleapis.com/identitytoolkit/v3/relyingparty");
    }

    public static String zzc(String str) {
        zzaeb zzaebVar;
        Map<String, zzaeb> map = zza;
        synchronized (map) {
            zzaebVar = map.get(str);
        }
        return q.j(zzaebVar != null ? q.x("", zza(zzaebVar.zzb(), zzaebVar.zza(), zzaebVar.zzb().contains(":"))) : "https://", "identitytoolkit.googleapis.com/v2");
    }

    public static String zzd(String str) {
        zzaeb zzaebVar;
        Map<String, zzaeb> map = zza;
        synchronized (map) {
            zzaebVar = map.get(str);
        }
        return q.j(zzaebVar != null ? q.x("", zza(zzaebVar.zzb(), zzaebVar.zza(), zzaebVar.zzb().contains(":"))) : "https://", "securetoken.googleapis.com/v1");
    }

    public static String zza(String str) {
        zzaeb zzaebVar;
        Map<String, zzaeb> map = zza;
        synchronized (map) {
            zzaebVar = map.get(str);
        }
        if (zzaebVar != null) {
            return q.j(zza(zzaebVar.zzb(), zzaebVar.zza(), zzaebVar.zzb().contains(":")), "emulator/auth/handler");
        }
        throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
    }

    public static void zza(String str, zzaee zzaeeVar) {
        Map<String, List<WeakReference<zzaee>>> map = zzb;
        synchronized (map) {
            try {
                if (map.containsKey(str)) {
                    map.get(str).add(new WeakReference<>(zzaeeVar));
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new WeakReference(zzaeeVar));
                    map.put(str, arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void zza(FirebaseApp firebaseApp, String str, int i10) {
        String apiKey = firebaseApp.getOptions().getApiKey();
        Map<String, zzaeb> map = zza;
        synchronized (map) {
            map.put(apiKey, new zzaeb(str, i10));
        }
        Map<String, List<WeakReference<zzaee>>> map2 = zzb;
        synchronized (map2) {
            try {
                if (map2.containsKey(apiKey)) {
                    Iterator<WeakReference<zzaee>> it = map2.get(apiKey).iterator();
                    boolean z10 = false;
                    while (it.hasNext()) {
                        zzaee zzaeeVar = it.next().get();
                        if (zzaeeVar != null) {
                            zzaeeVar.zza();
                            z10 = true;
                        }
                    }
                    if (!z10) {
                        zza.remove(apiKey);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean zza(FirebaseApp firebaseApp) {
        return zza.containsKey(firebaseApp.getOptions().getApiKey());
    }
}
