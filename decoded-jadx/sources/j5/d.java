package j5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import k5.u;
import k5.v;
import l.q;
import l.r;
import l5.i;
import m5.h;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
public final class d implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f8385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f8386c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t5.a f8388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t5.a f8389f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataEncoder f8384a = new JsonDataEncoderBuilder().configureWith(k5.h.f9819a).ignoreNullValues(true).build();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final URL f8387d = b(a.f8373c);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f8390g = 130000;

    public d(Context context, t5.a aVar, t5.a aVar2) {
        this.f8386c = context;
        this.f8385b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f8388e = aVar2;
        this.f8389f = aVar;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e4) {
            throw new IllegalArgumentException(q.x("Invalid url: ", str), e4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00af  */
    /* JADX WARN: Code duplicated, block: B:30:0x010a  */
    public final i a(i iVar) {
        int type;
        int subtype;
        Map map;
        NetworkInfo activeNetworkInfo = this.f8385b.getActiveNetworkInfo();
        r rVarC = iVar.c();
        int i10 = Build.VERSION.SDK_INT;
        Map map2 = (Map) rVarC.f10915g;
        if (map2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map2.put("sdk-version", String.valueOf(i10));
        rVarC.a("model", Build.MODEL);
        rVarC.a("hardware", Build.HARDWARE);
        rVarC.a("device", Build.DEVICE);
        rVarC.a("product", Build.PRODUCT);
        rVarC.a("os-uild", Build.ID);
        rVarC.a("manufacturer", Build.MANUFACTURER);
        rVarC.a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        Map map3 = (Map) rVarC.f10915g;
        if (map3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map3.put("tz-offset", String.valueOf(offset));
        int i11 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = v.f9856a;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        Map map4 = (Map) rVarC.f10915g;
        if (map4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = u.f9854a;
                subtype = 100;
            } else if (((u) u.f9854a.get(subtype)) == null) {
            }
            map = (Map) rVarC.f10915g;
            if (map != null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            map.put("mobile-subtype", String.valueOf(subtype));
            rVarC.a("country", Locale.getDefault().getCountry());
            rVarC.a("locale", Locale.getDefault().getLanguage());
            Context context = this.f8386c;
            rVarC.a("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
            try {
                i11 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e4) {
                e.d0("CctTransportBackend", "Unable to find version code for package", e4);
            }
            rVarC.a("application_build", Integer.toString(i11));
            return rVarC.c();
        }
        SparseArray sparseArray3 = u.f9854a;
        subtype = 0;
        map = (Map) rVarC.f10915g;
        if (map != null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put("mobile-subtype", String.valueOf(subtype));
        rVarC.a("country", Locale.getDefault().getCountry());
        rVarC.a("locale", Locale.getDefault().getLanguage());
        Context context2 = this.f8386c;
        rVarC.a("mcc_mnc", ((TelephonyManager) context2.getSystemService("phone")).getSimOperator());
        i11 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
        rVarC.a("application_build", Integer.toString(i11));
        return rVarC.c();
    }
}
