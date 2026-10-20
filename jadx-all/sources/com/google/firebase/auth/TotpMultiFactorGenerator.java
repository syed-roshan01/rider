package com.google.firebase.auth;

import com.google.android.gms.tasks.Task;
import f6.a;

/* JADX INFO: loaded from: classes.dex */
public final class TotpMultiFactorGenerator {
    public static final String FACTOR_ID = "totp";

    private TotpMultiFactorGenerator() {
    }

    public static Task<TotpSecret> generateSecret(MultiFactorSession multiFactorSession) {
        a.x(multiFactorSession);
        com.google.firebase.auth.internal.zzam zzamVar = (com.google.firebase.auth.internal.zzam) multiFactorSession;
        return FirebaseAuth.getInstance(zzamVar.zza().zza()).zza(zzamVar);
    }

    public static TotpMultiFactorAssertion getAssertionForEnrollment(TotpSecret totpSecret, String str) {
        if (str == null) {
            throw new NullPointerException("null reference");
        }
        if (totpSecret != null) {
            return new TotpMultiFactorAssertion(str, totpSecret, null);
        }
        throw new NullPointerException("null reference");
    }

    public static TotpMultiFactorAssertion getAssertionForSignIn(String str, String str2) {
        if (str2 == null) {
            throw new NullPointerException("null reference");
        }
        if (str != null) {
            return new TotpMultiFactorAssertion(str2, null, str);
        }
        throw new NullPointerException("null reference");
    }
}
