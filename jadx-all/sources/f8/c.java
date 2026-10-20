package f8;

import android.content.Context;
import android.util.Log;
import e8.c1;
import e8.d1;
import e8.e1;
import e8.h0;
import h8.j;

/* JADX INFO: loaded from: classes.dex */
public final class c extends h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d1 f6386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f6387b;

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    static {
        try {
            try {
                if (((e1) j.class.asSubclass(e1.class).getConstructor(new Class[0]).newInstance(new Object[0])).b()) {
                    return;
                }
                Log.w("AndroidChannelBuilder", "OkHttpChannelProvider.isAvailable() returned false");
            } catch (Exception e4) {
                Log.w("AndroidChannelBuilder", "Failed to construct OkHttpChannelProvider", e4);
            }
        } catch (ClassCastException e10) {
            Log.w("AndroidChannelBuilder", "Couldn't cast OkHttpChannelProvider to ManagedChannelProvider", e10);
        }
    }

    public c(d1 d1Var) {
        this.f6386a = d1Var;
    }

    @Override // e8.d1
    public final c1 a() {
        return new b(this.f6386a.a(), this.f6387b);
    }
}
