package com.google.android.gms.internal.p001firebaseauthapi;

import java.lang.reflect.Type;
import l.q;

/* JADX INFO: loaded from: classes.dex */
public class zzaco {
    private static final String zza = "com.google.android.gms.internal.firebase-auth-api.zzaco";

    private zzaco() {
    }

    public static Object zza(String str, Type type) throws zzaah {
        if (type != String.class) {
            if (type == Void.class) {
                return null;
            }
            try {
                try {
                    return ((zzacq) ((Class) type).getConstructor(new Class[0]).newInstance(new Object[0])).zza(str);
                } catch (Exception e4) {
                    throw new zzaah(q.x("Json conversion failed! ", e4.getMessage()), e4);
                }
            } catch (Exception e10) {
                throw new zzaah("Instantiation of JsonResponse failed! ".concat(String.valueOf(type)), e10);
            }
        }
        try {
            zzaek zzaekVar = (zzaek) new zzaek().zza(str);
            if (zzaekVar.zzb()) {
                return zzaekVar.zza();
            }
            throw new zzaah("No error message: " + str);
        } catch (Exception e11) {
            throw new zzaah(q.x("Json conversion failed! ", e11.getMessage()), e11);
        }
    }
}
