package n6;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.internal.o0;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.internal.k;
import com.google.android.gms.common.internal.z;
import com.google.android.gms.internal.base.zac;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class a extends k implements m6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.common.internal.h f12233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f12234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f12235d;

    public a(Context context, Looper looper, com.google.android.gms.common.internal.h hVar, Bundle bundle, j jVar, com.google.android.gms.common.api.k kVar) {
        super(context, looper, 44, hVar, jVar, kVar);
        this.f12232a = true;
        this.f12233b = hVar;
        this.f12234c = bundle;
        this.f12235d = hVar.f3306g;
    }

    @Override // m6.c
    public final void a(d dVar) {
        GoogleSignInAccount googleSignInAccountE;
        if (dVar == null) {
            throw new NullPointerException("Expecting a valid ISignInCallbacks");
        }
        int i10 = 2;
        try {
            Account account = this.f12233b.f3300a;
            if (account == null) {
                account = new Account(com.google.android.gms.common.internal.f.DEFAULT_ACCOUNT, "com.google");
            }
            if (com.google.android.gms.common.internal.f.DEFAULT_ACCOUNT.equals(account.name)) {
                x5.a aVarA = x5.a.a(getContext());
                String strB = aVarA.b("defaultGoogleSignInAccount");
                if (!TextUtils.isEmpty(strB)) {
                    StringBuilder sb = new StringBuilder(20 + String.valueOf(strB).length());
                    sb.append("googleSignInAccount:");
                    sb.append(strB);
                    String strB2 = aVarA.b(sb.toString());
                    if (strB2 != null) {
                        try {
                            googleSignInAccountE = GoogleSignInAccount.e(strB2);
                        } catch (JSONException unused) {
                            googleSignInAccountE = null;
                        }
                    }
                }
                googleSignInAccountE = null;
            } else {
                googleSignInAccountE = null;
            }
            Integer num = this.f12235d;
            f6.a.x(num);
            z zVar = new z(2, account, num.intValue(), googleSignInAccountE);
            e eVar = (e) getService();
            g gVar = new g(1, zVar);
            Parcel parcelZaa = eVar.zaa();
            zac.zac(parcelZaa, gVar);
            zac.zad(parcelZaa, dVar);
            eVar.zac(12, parcelZaa);
        } catch (RemoteException e4) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                o0 o0Var = (o0) dVar;
                o0Var.f3233b.post(new v0(i10, o0Var, new h(1, new z5.b(8, null), null)));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e4);
            }
        }
    }

    @Override // m6.c
    public final void b() {
        connect(new k.f(this, 24));
    }

    @Override // com.google.android.gms.common.internal.f
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof e ? (e) iInterfaceQueryLocalInterface : new e(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.common.internal.f
    public final Bundle getGetServiceRequestExtraArgs() {
        com.google.android.gms.common.internal.h hVar = this.f12233b;
        boolean zEquals = getContext().getPackageName().equals(hVar.f3303d);
        Bundle bundle = this.f12234c;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", hVar.f3303d);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.f, com.google.android.gms.common.api.d
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.f, com.google.android.gms.common.api.d
    public final boolean requiresSignIn() {
        return this.f12232a;
    }
}
