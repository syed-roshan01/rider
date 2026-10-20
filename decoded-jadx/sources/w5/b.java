package w5;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import b6.c;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.n;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.internal.p000authapiphone.zzv;

/* JADX INFO: loaded from: classes.dex */
public final class b extends com.google.android.gms.common.api.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16192a;

    public b(int i10) {
        this.f16192a = i10;
    }

    @Override // com.google.android.gms.common.api.a
    public final d buildClient(Context context, Looper looper, h hVar, Object obj, j jVar, k kVar) {
        switch (this.f16192a) {
            case 2:
                hVar.getClass();
                Integer num = hVar.f3306g;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", hVar.f3300a);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new n6.a(context, looper, hVar, bundle, jVar, kVar);
            case 3:
                a7.a.w(obj);
                throw null;
            default:
                return super.buildClient(context, looper, hVar, obj, jVar, kVar);
        }
    }

    @Override // com.google.android.gms.common.api.a
    public final d buildClient(Context context, Looper looper, h hVar, Object obj, e eVar, n nVar) {
        switch (this.f16192a) {
            case 0:
                a7.a.w(obj);
                return new zzv(context, looper, hVar, eVar, nVar);
            case 1:
                return new c(context, looper, hVar, (u) obj, eVar, nVar);
            default:
                throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }
}
