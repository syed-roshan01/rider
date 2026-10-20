package b6;

import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.internal.base.zad;
import com.google.android.gms.tasks.Task;
import z5.d;

/* JADX INFO: loaded from: classes.dex */
public final class b extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f2732a = new f("ClientTelemetry.API", new w5.b(1), new e());

    public final Task b(t tVar) {
        s sVarA = com.google.android.gms.common.api.internal.t.a();
        sVarA.f3245d = new d[]{zad.zaa};
        sVarA.f3242a = false;
        sVarA.f3244c = new k.f(tVar, 25);
        return doBestEffortWrite(sVarA.a());
    }
}
