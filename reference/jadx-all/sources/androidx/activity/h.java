package androidx.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f1391d;

    public /* synthetic */ h(i iVar, int i10, Object obj, int i11) {
        this.f1388a = i11;
        this.f1390c = iVar;
        this.f1389b = i10;
        this.f1391d = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        d.c cVar;
        int i10 = this.f1388a;
        int i11 = 0;
        Object obj = this.f1390c;
        int i12 = this.f1389b;
        Object obj2 = this.f1391d;
        switch (i10) {
            case 0:
                i iVar = (i) obj;
                Object obj3 = ((e.a) obj2).f4980a;
                String str = (String) iVar.f4307a.get(Integer.valueOf(i12));
                if (str != null) {
                    d.g gVar = (d.g) iVar.f4311e.get(str);
                    if (gVar == null || (cVar = gVar.f4303a) == null) {
                        iVar.f4313g.remove(str);
                        iVar.f4312f.put(str, obj3);
                    } else if (iVar.f4310d.remove(str)) {
                        cVar.a(obj3);
                    }
                    break;
                }
                break;
            case 1:
                ((i) obj).a(i12, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj2));
                break;
            case 2:
                String[] strArr = (String[]) obj2;
                int[] iArr = new int[strArr.length];
                Activity activity = (Activity) obj;
                PackageManager packageManager = activity.getPackageManager();
                String packageName = activity.getPackageName();
                int length = strArr.length;
                while (i11 < length) {
                    iArr[i11] = packageManager.checkPermission(strArr[i11], packageName);
                    i11++;
                }
                ((q2.f) activity).onRequestPermissionsResult(i12, strArr, iArr);
                break;
            case 3:
                Object obj4 = ((k.f) obj2).f8599b;
                break;
            default:
                List list = (List) obj2;
                int size = list.size();
                if (i12 == 1) {
                    while (i11 < size) {
                        ((i3.j) list.get(i11)).b();
                        i11++;
                    }
                } else {
                    while (i11 < size) {
                        ((i3.j) list.get(i11)).a();
                        i11++;
                    }
                }
                break;
        }
    }

    public h(l.t tVar, k.f fVar, int i10) {
        this.f1388a = 3;
        this.f1390c = tVar;
        this.f1391d = fVar;
        this.f1389b = i10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h(i3.j jVar, int i10) {
        this.f1388a = 4;
        i3.j[] jVarArr = new i3.j[1];
        if (jVar != null) {
            jVarArr[0] = jVar;
            this(Arrays.asList(jVarArr), i10, (Throwable) null);
            return;
        }
        throw new NullPointerException("initCallback cannot be null");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(int i10, ArrayList arrayList) {
        this(arrayList, i10, (Throwable) null);
        this.f1388a = 4;
    }

    public h(List list, int i10, Throwable th) {
        this.f1388a = 4;
        if (list != null) {
            this.f1391d = new ArrayList(list);
            this.f1389b = i10;
            this.f1390c = th;
            return;
        }
        throw new NullPointerException("initCallbacks cannot be null");
    }
}
