package com.google.android.gms.internal.p001firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.o;
import f6.a;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import l.t;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzact {
    private final int zza;

    private zzact(String str) {
        this.zza = zza(str);
    }

    private static int zza(String str) {
        try {
            List<String> listZza = zzac.zza("[.-]").zza((CharSequence) str);
            if (listZza.size() == 1) {
                return Integer.parseInt(str);
            }
            if (listZza.size() < 3) {
                return -1;
            }
            return (Integer.parseInt(listZza.get(1)) * 1000) + (Integer.parseInt(listZza.get(0)) * 1000000) + Integer.parseInt(listZza.get(2));
        } catch (IllegalArgumentException e4) {
            if (!Log.isLoggable("LibraryVersionContainer", 3)) {
                return -1;
            }
            Log.d("LibraryVersionContainer", String.format("Version code parsing failed for: %s with exception %s.", str, e4));
            return -1;
        }
    }

    public final String zzb() {
        return String.format("X%s", Integer.toString(this.zza));
    }

    public static zzact zza() throws Throwable {
        String str;
        String strConcat = "Failed to get app version for libraryName: firebase-auth";
        o oVar = o.f3350c;
        oVar.getClass();
        t tVar = o.f3349b;
        a.v("Please provide a valid libraryName", "firebase-auth");
        ConcurrentHashMap concurrentHashMap = oVar.f3351a;
        if (concurrentHashMap.containsKey("firebase-auth")) {
            str = (String) concurrentHashMap.get("firebase-auth");
        } else {
            Properties properties = new Properties();
            InputStream inputStream = null;
            property = null;
            String property = null;
            inputStream = null;
            try {
                try {
                    InputStream resourceAsStream = o.class.getResourceAsStream(String.format("/%s.properties", "firebase-auth"));
                    try {
                        if (resourceAsStream != null) {
                            properties.load(resourceAsStream);
                            property = properties.getProperty("version", null);
                            String strConcat2 = "firebase-auth version is " + property;
                            if (Log.isLoggable((String) tVar.f10928b, 2)) {
                                String str2 = (String) tVar.f10929c;
                                if (str2 != null) {
                                    strConcat2 = str2.concat(strConcat2);
                                }
                                Log.v("LibraryVersion", strConcat2);
                            }
                        } else if (Log.isLoggable((String) tVar.f10928b, 5)) {
                            String str3 = (String) tVar.f10929c;
                            Log.w("LibraryVersion", str3 == null ? "Failed to get app version for libraryName: firebase-auth" : str3.concat("Failed to get app version for libraryName: firebase-auth"));
                        }
                        if (resourceAsStream != null) {
                            e.O(resourceAsStream);
                        }
                    } catch (IOException e4) {
                        e = e4;
                        inputStream = resourceAsStream;
                        if (Log.isLoggable((String) tVar.f10928b, 6)) {
                            String str4 = (String) tVar.f10929c;
                            if (str4 != null) {
                                strConcat = str4.concat("Failed to get app version for libraryName: firebase-auth");
                            }
                            Log.e("LibraryVersion", strConcat, e);
                        }
                        if (inputStream != null) {
                            e.O(inputStream);
                        }
                        property = null;
                    } catch (Throwable th) {
                        th = th;
                        inputStream = resourceAsStream;
                        if (inputStream != null) {
                            e.O(inputStream);
                        }
                        throw th;
                    }
                } catch (IOException e10) {
                    e = e10;
                }
                if (property == null) {
                    if (Log.isLoggable((String) tVar.f10928b, 3)) {
                        String str5 = (String) tVar.f10929c;
                        Log.d("LibraryVersion", str5 != null ? str5.concat(".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used") : ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
                    }
                    str = "UNKNOWN";
                } else {
                    str = property;
                }
                concurrentHashMap.put("firebase-auth", str);
            } catch (Throwable th2) {
                th = th2;
            }
        }
        if (TextUtils.isEmpty(str) || str.equals("UNKNOWN")) {
            str = "-1";
        }
        return new zzact(str);
    }
}
