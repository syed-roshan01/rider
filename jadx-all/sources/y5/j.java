package y5;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.internal.n0;
import com.google.android.gms.common.internal.o0;
import com.google.android.gms.common.internal.p0;
import com.google.firebase.messaging.Constants;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16968a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16969b;

    public /* synthetic */ j(p0 p0Var) {
        this.f16969b = p0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        ComponentName componentName = null;
        switch (this.f16968a) {
            case 0:
                int i10 = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    Log.d("MessengerIpcClient", "Received response to request: " + i10);
                }
                k kVar = (k) this.f16969b;
                synchronized (kVar) {
                    try {
                        m mVar = (m) kVar.f16974e.get(i10);
                        if (mVar != null) {
                            kVar.f16974e.remove(i10);
                            kVar.c();
                            Bundle data = message.getData();
                            if (!data.getBoolean("unsupported", false)) {
                                l lVar = (l) mVar;
                                switch (lVar.f16976e) {
                                    case 0:
                                        if (!data.getBoolean("ack", false)) {
                                            lVar.a(new n("Invalid response to one way request", null));
                                        } else {
                                            lVar.b(null);
                                        }
                                        break;
                                    default:
                                        Bundle bundle = data.getBundle(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                                        if (bundle == null) {
                                            bundle = Bundle.EMPTY;
                                        }
                                        lVar.b(bundle);
                                        break;
                                }
                            } else {
                                mVar.a(new n("Not supported by GmsCore", null));
                            }
                        } else {
                            Log.w("MessengerIpcClient", "Received response for unknown request: " + i10);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return true;
            default:
                int i11 = message.what;
                if (i11 == 0) {
                    synchronized (((p0) this.f16969b).f3368d) {
                        try {
                            n0 n0Var = (n0) message.obj;
                            o0 o0Var = (o0) ((p0) this.f16969b).f3368d.get(n0Var);
                            if (o0Var != null && o0Var.f3352a.isEmpty()) {
                                if (o0Var.f3354c) {
                                    o0Var.f3358n.f3370f.removeMessages(1, o0Var.f3356e);
                                    p0 p0Var = o0Var.f3358n;
                                    p0Var.f3371g.c(p0Var.f3369e, o0Var);
                                    o0Var.f3354c = false;
                                    o0Var.f3353b = 2;
                                }
                                ((p0) this.f16969b).f3368d.remove(n0Var);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                    return true;
                }
                if (i11 != 1) {
                    return false;
                }
                synchronized (((p0) this.f16969b).f3368d) {
                    try {
                        n0 n0Var2 = (n0) message.obj;
                        o0 o0Var2 = (o0) ((p0) this.f16969b).f3368d.get(n0Var2);
                        if (o0Var2 != null && o0Var2.f3353b == 3) {
                            Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(n0Var2)), new Exception());
                            ComponentName componentName2 = o0Var2.f3357f;
                            if (componentName2 == null) {
                                n0Var2.getClass();
                            } else {
                                componentName = componentName2;
                            }
                            if (componentName == null) {
                                String str = n0Var2.f3346b;
                                f6.a.x(str);
                                componentName = new ComponentName(str, "unknown");
                            }
                            o0Var2.onServiceDisconnected(componentName);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return true;
        }
    }

    public /* synthetic */ j(k kVar) {
        this.f16969b = kVar;
    }
}
