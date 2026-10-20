package y5;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.cloudmessaging.zzf;
import com.google.firebase.messaging.Constants;
import java.util.regex.Matcher;
import q.z;

/* JADX INFO: loaded from: classes.dex */
public final class f extends zzf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f16964a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(c cVar, Looper looper) {
        super(looper);
        this.f16964a = cVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        String str;
        c cVar = this.f16964a;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new g());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof h) {
                        cVar.f16958g = (h) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        cVar.f16957f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                int i10 = 0;
                if (!(action == "com.google.android.c2dm.intent.REGISTRATION" || (action != null && action.equals("com.google.android.c2dm.intent.REGISTRATION")))) {
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Unexpected response action: ".concat(String.valueOf(action)));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = c.f16951j.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            Log.d("Rpc", "Unexpected response string: ".concat(stringExtra));
                            return;
                        }
                        return;
                    }
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    if (strGroup != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", strGroup2);
                        cVar.b(strGroup, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                if (stringExtra2 == null) {
                    Log.w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras())));
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Received InstanceID error ".concat(stringExtra2));
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (cVar.f16952a) {
                        while (true) {
                            try {
                                z zVar = cVar.f16952a;
                                if (i10 < zVar.f13045c) {
                                    cVar.b((String) zVar.f(i10), intent2.getExtras());
                                    i10++;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return;
                }
                String[] strArrSplit = stringExtra2.split("\\|");
                if (strArrSplit.length <= 2 || ((str = strArrSplit[1]) != "ID" && (str == null || !str.equals("ID")))) {
                    Log.w("Rpc", "Unexpected structured response ".concat(stringExtra2));
                    return;
                }
                String str2 = strArrSplit[2];
                String strSubstring = strArrSplit[3];
                if (strSubstring.startsWith(":")) {
                    strSubstring = strSubstring.substring(1);
                }
                cVar.b(str2, intent2.putExtra(Constants.IPC_BUNDLE_KEY_SEND_ERROR, strSubstring).getExtras());
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }
}
