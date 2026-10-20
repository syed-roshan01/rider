package s3;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import l.t;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f13915a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, Looper looper) {
        super(looper);
        this.f13915a = cVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int size;
        t[] tVarArr;
        if (message.what != 1) {
            super.handleMessage(message);
            return;
        }
        c cVar = this.f13915a;
        while (true) {
            synchronized (cVar.f13923b) {
                try {
                    size = cVar.f13925d.size();
                    if (size <= 0) {
                        return;
                    }
                    tVarArr = new t[size];
                    cVar.f13925d.toArray(tVarArr);
                    cVar.f13925d.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (int i10 = 0; i10 < size; i10++) {
                t tVar = tVarArr[i10];
                int size2 = ((ArrayList) tVar.f10929c).size();
                for (int i11 = 0; i11 < size2; i11++) {
                    b bVar = (b) ((ArrayList) tVar.f10929c).get(i11);
                    if (!bVar.f13919d) {
                        bVar.f13917b.onReceive(cVar.f13922a, (Intent) tVar.f10928b);
                    }
                }
            }
        }
    }
}
