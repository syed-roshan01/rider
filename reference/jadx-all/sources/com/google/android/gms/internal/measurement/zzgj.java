package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import q.z;
import q6.a;
import q6.h;
import q6.j;

/* JADX INFO: loaded from: classes.dex */
public final class zzgj {

    public static class zza {
        private static volatile h zza;

        private zza() {
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0034 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0018, B:18:0x0034, B:27:0x004e, B:13:0x0023, B:15:0x002b, B:20:0x0038, B:22:0x003e, B:25:0x0045, B:26:0x0049, B:28:0x0050), top: B:32:0x0003 }] */
        public static h zza(Context context) {
            h hVar;
            h hVarZza;
            synchronized (zza.class) {
                try {
                    hVar = zza;
                    if (hVar == null) {
                        new zzgj();
                        String str = Build.TYPE;
                        String str2 = Build.TAGS;
                        if (!str.equals("eng") && !str.equals("userdebug")) {
                            hVarZza = a.f13200a;
                        } else if (str2.contains("dev-keys") || str2.contains("test-keys")) {
                            if (zzfw.zza() && !context.isDeviceProtectedStorage()) {
                                context = context.createDeviceProtectedStorageContext();
                            }
                            hVarZza = zzgj.zza(context);
                        } else {
                            hVarZza = a.f13200a;
                        }
                        hVar = hVarZza;
                        zza = hVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return hVar;
        }
    }

    private static zzgh zza(Context context, File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                z zVar = new z();
                HashMap map = new HashMap();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        Log.w("HermeticFileOverrides", "Parsed " + String.valueOf(file) + " for Android package " + context.getPackageName());
                        zzgc zzgcVar = new zzgc(zVar);
                        bufferedReader.close();
                        return zzgcVar;
                    }
                    String[] strArrSplit = line.split(" ", 3);
                    if (strArrSplit.length != 3) {
                        Log.e("HermeticFileOverrides", "Invalid: " + line);
                    } else {
                        String strZza = zza(strArrSplit[0]);
                        String strDecode = Uri.decode(zza(strArrSplit[1]));
                        String strDecode2 = (String) map.get(strArrSplit[2]);
                        if (strDecode2 == null) {
                            String strZza2 = zza(strArrSplit[2]);
                            strDecode2 = Uri.decode(strZza2);
                            if (strDecode2.length() < 1024 || strDecode2 == strZza2) {
                                map.put(strZza2, strDecode2);
                            }
                        }
                        if (!zVar.containsKey(strZza)) {
                            zVar.put(strZza, new z());
                        }
                        ((z) zVar.get(strZza)).put(strDecode, strDecode2);
                    }
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    } catch (Exception unused) {
                    }
                }
                throw th;
            }
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        }
    }

    private static h zzb(Context context) {
        a aVar = a.f13200a;
        try {
            File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
            return file.exists() ? new j(file) : aVar;
        } catch (RuntimeException e4) {
            Log.e("HermeticFileOverrides", "no data dir", e4);
            return aVar;
        }
    }

    public static h zza(Context context) {
        h jVar;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            h hVarZzb = zzb(context);
            if (hVarZzb.b()) {
                zzgh zzghVarZza = zza(context, (File) hVarZzb.a());
                zzghVarZza.getClass();
                jVar = new j(zzghVarZza);
            } else {
                jVar = a.f13200a;
            }
            return jVar;
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    private static final String zza(String str) {
        return new String(str);
    }
}
