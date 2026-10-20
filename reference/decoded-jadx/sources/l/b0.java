package l;

import android.content.Intent;
import android.graphics.Typeface;
import android.widget.TextView;
import k6.d4;
import k6.e7;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10694a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f10698e;

    public /* synthetic */ b0(j.a aVar, int i10, d4 d4Var, Intent intent) {
        this.f10696c = aVar;
        this.f10695b = i10;
        this.f10697d = d4Var;
        this.f10698e = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10694a) {
            case 0:
                ((TextView) this.f10696c).setTypeface((Typeface) this.f10697d, this.f10695b);
                break;
            default:
                j.a aVar = (j.a) this.f10696c;
                int i10 = this.f10695b;
                d4 d4Var = (d4) this.f10697d;
                Intent intent = (Intent) this.f10698e;
                if (((e7) aVar.f8194a).zza(i10)) {
                    d4Var.f9972n.c("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i10));
                    aVar.f().f9972n.b("Completed wakeful intent.");
                    ((e7) aVar.f8194a).a(intent);
                }
                break;
        }
    }

    public b0(g0 g0Var, TextView textView, Typeface typeface, int i10) {
        this.f10698e = g0Var;
        this.f10696c = textView;
        this.f10697d = typeface;
        this.f10695b = i10;
    }
}
