package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import l.z2;
import l5.j;
import l5.u;
import q5.e;
import q5.i;
import u5.a;

/* JADX INFO: loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3130a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i10 = intent.getExtras().getInt("attemptNumber");
        u.b(context);
        z2 z2VarA = j.a();
        z2VarA.L(queryParameter);
        z2VarA.N(a.b(iIntValue));
        if (queryParameter2 != null) {
            z2VarA.f10984c = Base64.decode(queryParameter2, 0);
        }
        i iVar = u.a().f11373d;
        j jVarJ = z2VarA.j();
        b5.j jVar = new b5.j(5);
        iVar.getClass();
        iVar.f13182e.execute(new e(i10, 0, iVar, jVarJ, jVar));
    }
}
