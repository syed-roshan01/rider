package com.google.firebase.auth;

import a6.a;
import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseException;
import java.util.concurrent.TimeUnit;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
public class PhoneAuthProvider {
    public static final String PHONE_SIGN_IN_METHOD = "phone";
    public static final String PROVIDER_ID = "phone";
    private final FirebaseAuth zza;

    public static class ForceResendingToken extends a {
        public static final Parcelable.Creator<ForceResendingToken> CREATOR = new zze();

        public static ForceResendingToken zza() {
            return new ForceResendingToken();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            e.d1(e.Y0(20293, parcel), parcel);
        }
    }

    public static abstract class OnVerificationStateChangedCallbacks {
        private static final c6.a zza = new c6.a("PhoneAuthProvider", new String[0]);

        public void onCodeAutoRetrievalTimeOut(String str) {
            c6.a aVar = zza;
            Log.i(aVar.f3023a, aVar.c("Sms auto retrieval timed-out.", new Object[0]));
        }

        public void onCodeSent(String str, ForceResendingToken forceResendingToken) {
        }

        public abstract void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential);

        public abstract void onVerificationFailed(FirebaseException firebaseException);
    }

    private PhoneAuthProvider(FirebaseAuth firebaseAuth) {
        this.zza = firebaseAuth;
    }

    public static PhoneAuthCredential getCredential(String str, String str2) {
        return PhoneAuthCredential.zza(str, str2);
    }

    @Deprecated
    public static PhoneAuthProvider getInstance() {
        return new PhoneAuthProvider(FirebaseAuth.getInstance(FirebaseApp.getInstance()));
    }

    public static void verifyPhoneNumber(PhoneAuthOptions phoneAuthOptions) {
        f6.a.x(phoneAuthOptions);
        FirebaseAuth.zza(phoneAuthOptions);
    }

    @Deprecated
    public static PhoneAuthProvider getInstance(FirebaseAuth firebaseAuth) {
        return new PhoneAuthProvider(firebaseAuth);
    }

    @Deprecated
    public void verifyPhoneNumber(String str, long j10, TimeUnit timeUnit, Activity activity, OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks) {
        verifyPhoneNumber(PhoneAuthOptions.newBuilder(this.zza).setPhoneNumber(str).setTimeout(Long.valueOf(j10), timeUnit).setActivity(activity).setCallbacks(onVerificationStateChangedCallbacks).build());
    }

    @Deprecated
    public void verifyPhoneNumber(String str, long j10, TimeUnit timeUnit, Activity activity, OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, ForceResendingToken forceResendingToken) {
        PhoneAuthOptions.Builder callbacks = PhoneAuthOptions.newBuilder(this.zza).setPhoneNumber(str).setTimeout(Long.valueOf(j10), timeUnit).setActivity(activity).setCallbacks(onVerificationStateChangedCallbacks);
        if (forceResendingToken != null) {
            callbacks.setForceResendingToken(forceResendingToken);
        }
        verifyPhoneNumber(callbacks.build());
    }
}
