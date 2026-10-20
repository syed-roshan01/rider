package q2;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Notification.Builder f13084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f13085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f13086d;

    public k0(x xVar) {
        int i10;
        ArrayList arrayList;
        int i11;
        new ArrayList();
        this.f13086d = new Bundle();
        this.f13085c = xVar;
        Context context = xVar.f13102a;
        this.f13083a = context;
        Notification.Builder builderA = g0.a(context, xVar.f13119r);
        this.f13084b = builderA;
        Notification notification = xVar.f13121t;
        int i12 = 0;
        builderA.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(xVar.f13106e).setContentText(xVar.f13107f).setContentInfo(null).setContentIntent(xVar.f13108g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(xVar.f13110i).setProgress(0, 0, false);
        IconCompat iconCompat = xVar.f13109h;
        e0.b(builderA, iconCompat == null ? null : v2.c.c(iconCompat, context));
        z.b(z.d(z.c(builderA, null), false), xVar.f13111j);
        for (p pVar : xVar.f13103b) {
            if (pVar.f13091b == null && (i11 = pVar.f13094e) != 0) {
                pVar.f13091b = IconCompat.a(i11);
            }
            IconCompat iconCompat2 = pVar.f13091b;
            Notification.Action.Builder builderA2 = e0.a(iconCompat2 != null ? v2.c.c(iconCompat2, null) : null, pVar.f13095f, pVar.f13096g);
            Bundle bundle = pVar.f13090a;
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            boolean z10 = pVar.f13092c;
            bundle2.putBoolean("android.support.allowGeneratedReplies", z10);
            int i13 = Build.VERSION.SDK_INT;
            f0.a(builderA2, z10);
            bundle2.putInt("android.support.action.semanticAction", 0);
            if (i13 >= 28) {
                h0.b(builderA2, 0);
            }
            if (i13 >= 29) {
                i0.c(builderA2, false);
            }
            if (i13 >= 31) {
                j0.a(builderA2, false);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", pVar.f13093d);
            c0.b(builderA2, bundle2);
            c0.a(this.f13084b, c0.d(builderA2));
        }
        Bundle bundle3 = xVar.f13116o;
        if (bundle3 != null) {
            this.f13086d.putAll(bundle3);
        }
        int i14 = Build.VERSION.SDK_INT;
        a0.a(this.f13084b, xVar.f13112k);
        c0.i(this.f13084b, xVar.f13114m);
        c0.g(this.f13084b, null);
        c0.j(this.f13084b, null);
        c0.h(this.f13084b, false);
        d0.b(this.f13084b, xVar.f13115n);
        d0.c(this.f13084b, xVar.f13117p);
        d0.f(this.f13084b, xVar.f13118q);
        d0.d(this.f13084b, null);
        d0.e(this.f13084b, notification.sound, notification.audioAttributes);
        ArrayList arrayList2 = xVar.f13104c;
        ArrayList arrayList3 = xVar.f13122u;
        if (i14 < 28) {
            if (arrayList2 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList2.size());
                Iterator it = arrayList2.iterator();
                if (it.hasNext()) {
                    a7.a.w(it.next());
                    throw null;
                }
            }
            if (arrayList != null) {
                if (arrayList3 == null) {
                    arrayList3 = arrayList;
                } else {
                    q.g gVar = new q.g(arrayList3.size() + arrayList.size());
                    gVar.addAll(arrayList);
                    gVar.addAll(arrayList3);
                    arrayList3 = new ArrayList(gVar);
                }
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                d0.a(this.f13084b, (String) it2.next());
            }
        }
        ArrayList arrayList4 = xVar.f13105d;
        if (arrayList4.size() > 0) {
            if (xVar.f13116o == null) {
                xVar.f13116o = new Bundle();
            }
            Bundle bundle4 = xVar.f13116o.getBundle("android.car.EXTENSIONS");
            bundle4 = bundle4 == null ? new Bundle() : bundle4;
            Bundle bundle5 = new Bundle(bundle4);
            Bundle bundle6 = new Bundle();
            int i15 = 0;
            while (i15 < arrayList4.size()) {
                String string = Integer.toString(i15);
                p pVar2 = (p) arrayList4.get(i15);
                Object obj = l0.f13087a;
                Bundle bundle7 = new Bundle();
                if (pVar2.f13091b == null && (i10 = pVar2.f13094e) != 0) {
                    pVar2.f13091b = IconCompat.a(i10);
                }
                IconCompat iconCompat3 = pVar2.f13091b;
                bundle7.putInt("icon", iconCompat3 != null ? iconCompat3.b() : i12);
                bundle7.putCharSequence("title", pVar2.f13095f);
                bundle7.putParcelable("actionIntent", pVar2.f13096g);
                Bundle bundle8 = pVar2.f13090a;
                Bundle bundle9 = bundle8 != null ? new Bundle(bundle8) : new Bundle();
                bundle9.putBoolean("android.support.allowGeneratedReplies", pVar2.f13092c);
                bundle7.putBundle("extras", bundle9);
                bundle7.putParcelableArray("remoteInputs", null);
                bundle7.putBoolean("showsUserInterface", pVar2.f13093d);
                bundle7.putInt("semanticAction", 0);
                bundle6.putBundle(string, bundle7);
                i15++;
                i12 = 0;
            }
            bundle4.putBundle("invisible_actions", bundle6);
            bundle5.putBundle("invisible_actions", bundle6);
            if (xVar.f13116o == null) {
                xVar.f13116o = new Bundle();
            }
            xVar.f13116o.putBundle("android.car.EXTENSIONS", bundle4);
            this.f13086d.putBundle("android.car.EXTENSIONS", bundle5);
        }
        int i16 = Build.VERSION.SDK_INT;
        b0.a(this.f13084b, xVar.f13116o);
        f0.e(this.f13084b, null);
        g0.b(this.f13084b, 0);
        g0.e(this.f13084b, null);
        g0.f(this.f13084b, null);
        g0.g(this.f13084b, 0L);
        g0.d(this.f13084b, 0);
        if (!TextUtils.isEmpty(xVar.f13119r)) {
            this.f13084b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        if (i16 >= 28) {
            Iterator it3 = arrayList2.iterator();
            if (it3.hasNext()) {
                a7.a.w(it3.next());
                throw null;
            }
        }
        if (i16 >= 29) {
            i0.a(this.f13084b, xVar.f13120s);
            i0.b(this.f13084b, null);
        }
    }
}
