package y5;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.firebase.messaging.Constants;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import l.t;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f16967b;

    public /* synthetic */ i(k kVar, int i10) {
        this.f16966a = i10;
        this.f16967b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        int i10 = 2;
        switch (this.f16966a) {
            case 0:
                break;
            case 1:
                k kVar = this.f16967b;
                synchronized (kVar) {
                    if (kVar.f16970a == 1) {
                        kVar.a(1, "Timed out while binding");
                    }
                    break;
                }
                return;
            default:
                this.f16967b.a(2, "Service disconnected");
                return;
        }
        while (true) {
            k kVar2 = this.f16967b;
            synchronized (kVar2) {
                try {
                    if (kVar2.f16970a != 2) {
                        return;
                    }
                    if (kVar2.f16973d.isEmpty()) {
                        kVar2.c();
                        return;
                    }
                    m mVar = (m) kVar2.f16973d.poll();
                    kVar2.f16974e.put(mVar.f16977a, mVar);
                    ((ScheduledExecutorService) kVar2.f16975f.f16984c).schedule(new l.h(kVar2, mVar, i10), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(mVar)));
                    }
                    o oVar = kVar2.f16975f;
                    Messenger messenger = kVar2.f16971b;
                    int i11 = mVar.f16979c;
                    Context context = (Context) oVar.f16983b;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i11;
                    messageObtain.arg1 = mVar.f16977a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    switch (((l) mVar).f16976e) {
                        case 0:
                            z10 = true;
                            break;
                        default:
                            z10 = false;
                            break;
                    }
                    bundle.putBoolean("oneWay", z10);
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, mVar.f16980d);
                    messageObtain.setData(bundle);
                    try {
                        t tVar = kVar2.f16972c;
                        Messenger messenger2 = (Messenger) tVar.f10928b;
                        if (messenger2 != null) {
                            messenger2.send(messageObtain);
                        } else {
                            h hVar = (h) tVar.f10929c;
                            if (hVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = hVar.f16965a;
                            messenger3.getClass();
                            messenger3.send(messageObtain);
                        }
                    } catch (RemoteException e4) {
                        kVar2.a(2, e4.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
