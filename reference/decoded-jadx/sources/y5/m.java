package y5;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f16978b = new TaskCompletionSource();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f16980d;

    public m(int i10, int i11, Bundle bundle) {
        this.f16977a = i10;
        this.f16979c = i11;
        this.f16980d = bundle;
    }

    public final void a(n nVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + nVar.toString());
        }
        this.f16978b.setException(nVar);
    }

    public final void b(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(bundle));
        }
        this.f16978b.setResult(bundle);
    }

    public final String toString() {
        boolean z10;
        StringBuilder sb = new StringBuilder("Request { what=");
        sb.append(this.f16979c);
        sb.append(" id=");
        sb.append(this.f16977a);
        sb.append(" oneWay=");
        switch (((l) this).f16976e) {
            case 0:
                z10 = true;
                break;
            default:
                z10 = false;
                break;
        }
        sb.append(z10);
        sb.append("}");
        return sb.toString();
    }
}
