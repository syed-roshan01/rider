package e;

import android.content.Intent;
import androidx.activity.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import q8.f;
import r2.k;
import r8.s;
import r8.v;

/* JADX INFO: loaded from: classes.dex */
public final class d extends b {
    @Override // e.b
    public final Intent a(p pVar, Object obj) {
        String[] strArr = (String[]) obj;
        d7.a.m(pVar, "context");
        d7.a.m(strArr, "input");
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
        d7.a.l(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return intentPutExtra;
    }

    @Override // e.b
    public final a b(p pVar, Object obj) {
        String[] strArr = (String[]) obj;
        d7.a.m(pVar, "context");
        d7.a.m(strArr, "input");
        if (strArr.length == 0) {
            return new a(s.f13662a);
        }
        for (String str : strArr) {
            if (k.checkSelfPermission(pVar, str) != 0) {
                return null;
            }
        }
        int iT = z6.a.T(strArr.length);
        if (iT < 16) {
            iT = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iT);
        for (String str2 : strArr) {
            linkedHashMap.put(str2, Boolean.TRUE);
        }
        return new a(linkedHashMap);
    }

    @Override // e.b
    public final Object c(Intent intent, int i10) {
        s sVar = s.f13662a;
        if (i10 != -1 || intent == null) {
            return sVar;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return sVar;
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i11 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i11 == 0));
        }
        ArrayList arrayListR = b9.b.R(stringArrayExtra);
        Iterator it = arrayListR.iterator();
        Iterator it2 = arrayList.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(f9.a.y0(arrayListR), f9.a.y0(arrayList)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList2.add(new f(it.next(), it2.next()));
        }
        return v.F0(arrayList2);
    }
}
