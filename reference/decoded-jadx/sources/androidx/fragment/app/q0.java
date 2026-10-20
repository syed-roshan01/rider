package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class q0 implements d.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f1997b;

    public /* synthetic */ q0(x0 x0Var, int i10) {
        this.f1996a = i10;
        this.f1997b = x0Var;
    }

    @Override // d.c
    public final void a(Object obj) {
        switch (this.f1996a) {
            case 0:
                Map map = (Map) obj;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
                }
                x0 x0Var = this.f1997b;
                u0 u0Var = (u0) x0Var.C.pollFirst();
                if (u0Var == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                } else {
                    String str = u0Var.f2039a;
                    d0 d0VarC = x0Var.f2050c.c(str);
                    if (d0VarC == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    } else {
                        d0VarC.onRequestPermissionsResult(u0Var.f2040b, strArr, iArr);
                    }
                }
                break;
            case 1:
            default:
                b((d.b) obj);
                break;
            case 2:
                b((d.b) obj);
                break;
        }
    }

    public final void b(d.b bVar) {
        int i10 = this.f1996a;
        x0 x0Var = this.f1997b;
        switch (i10) {
            case 2:
                u0 u0Var = (u0) x0Var.C.pollFirst();
                if (u0Var != null) {
                    String str = u0Var.f2039a;
                    d0 d0VarC = x0Var.f2050c.c(str);
                    if (d0VarC != null) {
                        d0VarC.onActivityResult(u0Var.f2040b, bVar.f4293a, bVar.f4294b);
                    } else {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                    }
                } else {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                }
                break;
            default:
                u0 u0Var2 = (u0) x0Var.C.pollFirst();
                if (u0Var2 != null) {
                    String str2 = u0Var2.f2039a;
                    d0 d0VarC2 = x0Var.f2050c.c(str2);
                    if (d0VarC2 != null) {
                        d0VarC2.onActivityResult(u0Var2.f2040b, bVar.f4293a, bVar.f4294b);
                    } else {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str2);
                    }
                } else {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                }
                break;
        }
    }
}
