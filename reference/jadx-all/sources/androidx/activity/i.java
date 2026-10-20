package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class i extends d.i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p f1393h;

    public i(p pVar) {
        this.f1393h = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d.i
    public final void b(int i10, e.b bVar, Object obj) {
        Bundle bundle;
        p pVar = this.f1393h;
        e.a aVarB = bVar.b(pVar, obj);
        int i11 = 0;
        if (aVarB != null) {
            new Handler(Looper.getMainLooper()).post(new h(this, i10, aVarB, i11));
            return;
        }
        Intent intentA = bVar.a(pVar, obj);
        if (intentA.getExtras() != null && intentA.getExtras().getClassLoader() == null) {
            intentA.setExtrasClassLoader(pVar.getClassLoader());
        }
        if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if (!"androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentA.getAction())) {
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentA.getAction())) {
                int i12 = q2.h.f13081a;
                q2.a.b(pVar, intentA, i10, bundle);
                return;
            }
            d.k kVar = (d.k) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                IntentSender intentSender = kVar.f4314a;
                Intent intent = kVar.f4315b;
                int i13 = kVar.f4316c;
                int i14 = kVar.f4317d;
                int i15 = q2.h.f13081a;
                q2.a.c(pVar, intentSender, i10, intent, i13, i14, 0, bundle);
                return;
            } catch (IntentSender.SendIntentException e4) {
                new Handler(Looper.getMainLooper()).post(new h(this, i10, e4, 1));
                return;
            }
        }
        String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        if (stringArrayExtra == null) {
            stringArrayExtra = new String[0];
        }
        int i16 = q2.h.f13081a;
        HashSet hashSet = new HashSet();
        for (int i17 = 0; i17 < stringArrayExtra.length; i17++) {
            if (TextUtils.isEmpty(stringArrayExtra[i17])) {
                throw new IllegalArgumentException(a7.a.p(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i17], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i17));
            }
        }
        int size = hashSet.size();
        String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
        if (size > 0) {
            if (size == stringArrayExtra.length) {
                return;
            }
            int i18 = 0;
            while (i11 < stringArrayExtra.length) {
                if (!hashSet.contains(Integer.valueOf(i11))) {
                    strArr[i18] = stringArrayExtra[i11];
                    i18++;
                }
                i11++;
            }
        }
        if (pVar instanceof q2.g) {
            ((q2.g) pVar).validateRequestPermissionsRequestCode(i10);
        }
        q2.c.b(pVar, stringArrayExtra, i10);
    }
}
