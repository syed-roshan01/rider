package com.google.firebase.auth.internal;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Parcelable;
import com.google.android.gms.internal.p001firebaseauthapi.zzags;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import f6.a;
import java.util.ArrayList;
import s3.b;
import s3.c;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzax {
    private static zzax zza;
    private boolean zzb = false;
    private BroadcastReceiver zzc;

    private zzax() {
    }

    private static AuthCredential zza(Intent intent) {
        a.x(intent);
        Parcelable.Creator<zzags> creator = zzags.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST");
        return com.google.firebase.auth.zzd.zza(((zzags) (byteArrayExtra == null ? null : e.c0(byteArrayExtra, creator))).zzc(true));
    }

    public static zzax zza() {
        if (zza == null) {
            zza = new zzax();
        }
        return zza;
    }

    public static /* synthetic */ void zza(zzax zzaxVar, Intent intent, TaskCompletionSource taskCompletionSource, Context context) {
        taskCompletionSource.setResult(intent.getStringExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN"));
        zza(context);
    }

    public static void zza(Context context) {
        zzax zzaxVar = zza;
        zzaxVar.zzb = false;
        if (zzaxVar.zzc != null) {
            c cVarA = c.a(context);
            BroadcastReceiver broadcastReceiver = zza.zzc;
            synchronized (cVarA.f13923b) {
                try {
                    ArrayList arrayList = (ArrayList) cVarA.f13923b.remove(broadcastReceiver);
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            b bVar = (b) arrayList.get(size);
                            bVar.f13919d = true;
                            for (int i10 = 0; i10 < bVar.f13916a.countActions(); i10++) {
                                String action = bVar.f13916a.getAction(i10);
                                ArrayList arrayList2 = (ArrayList) cVarA.f13924c.get(action);
                                if (arrayList2 != null) {
                                    for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                        b bVar2 = (b) arrayList2.get(size2);
                                        if (bVar2.f13917b == broadcastReceiver) {
                                            bVar2.f13919d = true;
                                            arrayList2.remove(size2);
                                        }
                                    }
                                    if (arrayList2.size() <= 0) {
                                        cVarA.f13924c.remove(action);
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        zza.zzc = null;
    }

    private final void zza(Activity activity, BroadcastReceiver broadcastReceiver) {
        this.zzc = broadcastReceiver;
        c cVarA = c.a(activity);
        IntentFilter intentFilter = new IntentFilter("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        synchronized (cVarA.f13923b) {
            try {
                b bVar = new b(broadcastReceiver, intentFilter);
                ArrayList arrayList = (ArrayList) cVarA.f13923b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    cVarA.f13923b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(bVar);
                for (int i10 = 0; i10 < intentFilter.countActions(); i10++) {
                    String action = intentFilter.getAction(i10);
                    ArrayList arrayList2 = (ArrayList) cVarA.f13924c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        cVarA.f13924c.put(action, arrayList2);
                    }
                    arrayList2.add(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zza(Activity activity, TaskCompletionSource<AuthResult> taskCompletionSource, FirebaseAuth firebaseAuth) {
        return zza(activity, taskCompletionSource, firebaseAuth, (FirebaseUser) null);
    }

    public final boolean zza(Activity activity, TaskCompletionSource<AuthResult> taskCompletionSource, FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        if (this.zzb) {
            return false;
        }
        zza(activity, new zzbc(this, activity, taskCompletionSource, firebaseAuth, firebaseUser));
        this.zzb = true;
        return true;
    }

    public final boolean zza(Activity activity, TaskCompletionSource<String> taskCompletionSource) {
        if (this.zzb) {
            return false;
        }
        zza(activity, new zzbe(this, activity, taskCompletionSource));
        this.zzb = true;
        return true;
    }
}
