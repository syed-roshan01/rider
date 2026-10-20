package h6;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import com.google.android.gms.internal.common.zzc;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import u1.c1;
import x9.v;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Boolean f7566d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f7567e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f7568f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f7569g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Boolean f7570h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static j f7574l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static k f7575m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7576a;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ThreadLocal f7571i = new ThreadLocal();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c1 f7572j = new c1(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final l4.d f7573k = new l4.d(24);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l4.d f7564b = new l4.d(28);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l4.d f7565c = new l4.d(29);

    public e(Context context) {
        f6.a.x(context);
        this.f7576a = context;
    }

    public static int a(Context context, String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (y3.e.g0(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e4) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e4.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x020f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0213  */
    /* JADX WARN: Code duplicated, block: B:105:0x021e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0225 A[Catch: all -> 0x0139, b -> 0x013b, RemoteException -> 0x013e, TRY_ENTER, TryCatch #8 {RemoteException -> 0x013e, b -> 0x013b, all -> 0x0139, blocks: (B:30:0x00bf, B:36:0x00cb, B:38:0x00d1, B:39:0x00ec, B:43:0x00f2, B:45:0x00fa, B:47:0x00fe, B:48:0x010c, B:55:0x011a, B:57:0x0120, B:66:0x0156, B:68:0x015e, B:70:0x0167, B:71:0x016e, B:65:0x0141, B:74:0x0171, B:75:0x0172, B:76:0x0179, B:77:0x017a, B:78:0x0181, B:81:0x0184, B:82:0x0185, B:84:0x01a4, B:86:0x01b7, B:88:0x01bf, B:95:0x01fc, B:97:0x0202, B:108:0x0225, B:109:0x022c, B:89:0x01d0, B:90:0x01d7, B:93:0x01db, B:94:0x01ec, B:110:0x022d, B:111:0x0234, B:112:0x0235, B:113:0x023c, B:119:0x0248), top: B:170:0x00bf }] */
    /* JADX WARN: Code duplicated, block: B:110:0x022d A[Catch: all -> 0x0139, b -> 0x013b, RemoteException -> 0x013e, TryCatch #8 {RemoteException -> 0x013e, b -> 0x013b, all -> 0x0139, blocks: (B:30:0x00bf, B:36:0x00cb, B:38:0x00d1, B:39:0x00ec, B:43:0x00f2, B:45:0x00fa, B:47:0x00fe, B:48:0x010c, B:55:0x011a, B:57:0x0120, B:66:0x0156, B:68:0x015e, B:70:0x0167, B:71:0x016e, B:65:0x0141, B:74:0x0171, B:75:0x0172, B:76:0x0179, B:77:0x017a, B:78:0x0181, B:81:0x0184, B:82:0x0185, B:84:0x01a4, B:86:0x01b7, B:88:0x01bf, B:95:0x01fc, B:97:0x0202, B:108:0x0225, B:109:0x022c, B:89:0x01d0, B:90:0x01d7, B:93:0x01db, B:94:0x01ec, B:110:0x022d, B:111:0x0234, B:112:0x0235, B:113:0x023c, B:119:0x0248), top: B:170:0x00bf }] */
    /* JADX WARN: Code duplicated, block: B:112:0x0235 A[Catch: all -> 0x0139, b -> 0x013b, RemoteException -> 0x013e, TryCatch #8 {RemoteException -> 0x013e, b -> 0x013b, all -> 0x0139, blocks: (B:30:0x00bf, B:36:0x00cb, B:38:0x00d1, B:39:0x00ec, B:43:0x00f2, B:45:0x00fa, B:47:0x00fe, B:48:0x010c, B:55:0x011a, B:57:0x0120, B:66:0x0156, B:68:0x015e, B:70:0x0167, B:71:0x016e, B:65:0x0141, B:74:0x0171, B:75:0x0172, B:76:0x0179, B:77:0x017a, B:78:0x0181, B:81:0x0184, B:82:0x0185, B:84:0x01a4, B:86:0x01b7, B:88:0x01bf, B:95:0x01fc, B:97:0x0202, B:108:0x0225, B:109:0x022c, B:89:0x01d0, B:90:0x01d7, B:93:0x01db, B:94:0x01ec, B:110:0x022d, B:111:0x0234, B:112:0x0235, B:113:0x023c, B:119:0x0248), top: B:170:0x00bf }] */
    /* JADX WARN: Code duplicated, block: B:116:0x023f A[Catch: all -> 0x023d, TRY_ENTER, TryCatch #7 {, blocks: (B:31:0x00c0, B:33:0x00c6, B:34:0x00c8, B:116:0x023f, B:117:0x0246), top: B:167:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x02d7 A[Catch: all -> 0x007b, TryCatch #5 {all -> 0x007b, blocks: (B:3:0x002c, B:7:0x0075, B:14:0x0083, B:17:0x0089, B:28:0x00bb, B:120:0x0249, B:125:0x0256, B:126:0x025d, B:124:0x024f, B:129:0x0260, B:130:0x0261, B:131:0x0268, B:148:0x02d7, B:149:0x02ea, B:132:0x0269, B:134:0x0287, B:136:0x0299, B:146:0x02cf, B:147:0x02d6, B:150:0x02eb, B:151:0x0317), top: B:165:0x002c, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:161:0x00ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x00bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0089 A[Catch: all -> 0x007b, TRY_LEAVE, TryCatch #5 {all -> 0x007b, blocks: (B:3:0x002c, B:7:0x0075, B:14:0x0083, B:17:0x0089, B:28:0x00bb, B:120:0x0249, B:125:0x0256, B:126:0x025d, B:124:0x024f, B:129:0x0260, B:130:0x0261, B:131:0x0268, B:148:0x02d7, B:149:0x02ea, B:132:0x0269, B:134:0x0287, B:136:0x0299, B:146:0x02cf, B:147:0x02d6, B:150:0x02eb, B:151:0x0317), top: B:165:0x002c, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:21:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x00c6 A[Catch: all -> 0x023d, TryCatch #7 {, blocks: (B:31:0x00c0, B:33:0x00c6, B:34:0x00c8, B:116:0x023f, B:117:0x0246), top: B:167:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00cb A[Catch: all -> 0x0139, b -> 0x013b, RemoteException -> 0x013e, TRY_ENTER, TryCatch #8 {RemoteException -> 0x013e, b -> 0x013b, all -> 0x0139, blocks: (B:30:0x00bf, B:36:0x00cb, B:38:0x00d1, B:39:0x00ec, B:43:0x00f2, B:45:0x00fa, B:47:0x00fe, B:48:0x010c, B:55:0x011a, B:57:0x0120, B:66:0x0156, B:68:0x015e, B:70:0x0167, B:71:0x016e, B:65:0x0141, B:74:0x0171, B:75:0x0172, B:76:0x0179, B:77:0x017a, B:78:0x0181, B:81:0x0184, B:82:0x0185, B:84:0x01a4, B:86:0x01b7, B:88:0x01bf, B:95:0x01fc, B:97:0x0202, B:108:0x0225, B:109:0x022c, B:89:0x01d0, B:90:0x01d7, B:93:0x01db, B:94:0x01ec, B:110:0x022d, B:111:0x0234, B:112:0x0235, B:113:0x023c, B:119:0x0248), top: B:170:0x00bf }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00d1 A[Catch: all -> 0x0139, b -> 0x013b, RemoteException -> 0x013e, TryCatch #8 {RemoteException -> 0x013e, b -> 0x013b, all -> 0x0139, blocks: (B:30:0x00bf, B:36:0x00cb, B:38:0x00d1, B:39:0x00ec, B:43:0x00f2, B:45:0x00fa, B:47:0x00fe, B:48:0x010c, B:55:0x011a, B:57:0x0120, B:66:0x0156, B:68:0x015e, B:70:0x0167, B:71:0x016e, B:65:0x0141, B:74:0x0171, B:75:0x0172, B:76:0x0179, B:77:0x017a, B:78:0x0181, B:81:0x0184, B:82:0x0185, B:84:0x01a4, B:86:0x01b7, B:88:0x01bf, B:95:0x01fc, B:97:0x0202, B:108:0x0225, B:109:0x022c, B:89:0x01d0, B:90:0x01d7, B:93:0x01db, B:94:0x01ec, B:110:0x022d, B:111:0x0234, B:112:0x0235, B:113:0x023c, B:119:0x0248), top: B:170:0x00bf }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00f2 A[Catch: all -> 0x0139, b -> 0x013b, RemoteException -> 0x013e, TRY_ENTER, TryCatch #8 {RemoteException -> 0x013e, b -> 0x013b, all -> 0x0139, blocks: (B:30:0x00bf, B:36:0x00cb, B:38:0x00d1, B:39:0x00ec, B:43:0x00f2, B:45:0x00fa, B:47:0x00fe, B:48:0x010c, B:55:0x011a, B:57:0x0120, B:66:0x0156, B:68:0x015e, B:70:0x0167, B:71:0x016e, B:65:0x0141, B:74:0x0171, B:75:0x0172, B:76:0x0179, B:77:0x017a, B:78:0x0181, B:81:0x0184, B:82:0x0185, B:84:0x01a4, B:86:0x01b7, B:88:0x01bf, B:95:0x01fc, B:97:0x0202, B:108:0x0225, B:109:0x022c, B:89:0x01d0, B:90:0x01d7, B:93:0x01db, B:94:0x01ec, B:110:0x022d, B:111:0x0234, B:112:0x0235, B:113:0x023c, B:119:0x0248), top: B:170:0x00bf }] */
    /* JADX WARN: Code duplicated, block: B:77:0x017a A[Catch: all -> 0x0139, b -> 0x013b, RemoteException -> 0x013e, TryCatch #8 {RemoteException -> 0x013e, b -> 0x013b, all -> 0x0139, blocks: (B:30:0x00bf, B:36:0x00cb, B:38:0x00d1, B:39:0x00ec, B:43:0x00f2, B:45:0x00fa, B:47:0x00fe, B:48:0x010c, B:55:0x011a, B:57:0x0120, B:66:0x0156, B:68:0x015e, B:70:0x0167, B:71:0x016e, B:65:0x0141, B:74:0x0171, B:75:0x0172, B:76:0x0179, B:77:0x017a, B:78:0x0181, B:81:0x0184, B:82:0x0185, B:84:0x01a4, B:86:0x01b7, B:88:0x01bf, B:95:0x01fc, B:97:0x0202, B:108:0x0225, B:109:0x022c, B:89:0x01d0, B:90:0x01d7, B:93:0x01db, B:94:0x01ec, B:110:0x022d, B:111:0x0234, B:112:0x0235, B:113:0x023c, B:119:0x0248), top: B:170:0x00bf }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0185 A[Catch: all -> 0x0139, b -> 0x013b, RemoteException -> 0x013e, TryCatch #8 {RemoteException -> 0x013e, b -> 0x013b, all -> 0x0139, blocks: (B:30:0x00bf, B:36:0x00cb, B:38:0x00d1, B:39:0x00ec, B:43:0x00f2, B:45:0x00fa, B:47:0x00fe, B:48:0x010c, B:55:0x011a, B:57:0x0120, B:66:0x0156, B:68:0x015e, B:70:0x0167, B:71:0x016e, B:65:0x0141, B:74:0x0171, B:75:0x0172, B:76:0x0179, B:77:0x017a, B:78:0x0181, B:81:0x0184, B:82:0x0185, B:84:0x01a4, B:86:0x01b7, B:88:0x01bf, B:95:0x01fc, B:97:0x0202, B:108:0x0225, B:109:0x022c, B:89:0x01d0, B:90:0x01d7, B:93:0x01db, B:94:0x01ec, B:110:0x022d, B:111:0x0234, B:112:0x0235, B:113:0x023c, B:119:0x0248), top: B:170:0x00bf }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01a4 A[Catch: all -> 0x0139, b -> 0x013b, RemoteException -> 0x013e, TryCatch #8 {RemoteException -> 0x013e, b -> 0x013b, all -> 0x0139, blocks: (B:30:0x00bf, B:36:0x00cb, B:38:0x00d1, B:39:0x00ec, B:43:0x00f2, B:45:0x00fa, B:47:0x00fe, B:48:0x010c, B:55:0x011a, B:57:0x0120, B:66:0x0156, B:68:0x015e, B:70:0x0167, B:71:0x016e, B:65:0x0141, B:74:0x0171, B:75:0x0172, B:76:0x0179, B:77:0x017a, B:78:0x0181, B:81:0x0184, B:82:0x0185, B:84:0x01a4, B:86:0x01b7, B:88:0x01bf, B:95:0x01fc, B:97:0x0202, B:108:0x0225, B:109:0x022c, B:89:0x01d0, B:90:0x01d7, B:93:0x01db, B:94:0x01ec, B:110:0x022d, B:111:0x0234, B:112:0x0235, B:113:0x023c, B:119:0x0248), top: B:170:0x00bf }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01b7 A[Catch: all -> 0x0139, b -> 0x013b, RemoteException -> 0x013e, TryCatch #8 {RemoteException -> 0x013e, b -> 0x013b, all -> 0x0139, blocks: (B:30:0x00bf, B:36:0x00cb, B:38:0x00d1, B:39:0x00ec, B:43:0x00f2, B:45:0x00fa, B:47:0x00fe, B:48:0x010c, B:55:0x011a, B:57:0x0120, B:66:0x0156, B:68:0x015e, B:70:0x0167, B:71:0x016e, B:65:0x0141, B:74:0x0171, B:75:0x0172, B:76:0x0179, B:77:0x017a, B:78:0x0181, B:81:0x0184, B:82:0x0185, B:84:0x01a4, B:86:0x01b7, B:88:0x01bf, B:95:0x01fc, B:97:0x0202, B:108:0x0225, B:109:0x022c, B:89:0x01d0, B:90:0x01d7, B:93:0x01db, B:94:0x01ec, B:110:0x022d, B:111:0x0234, B:112:0x0235, B:113:0x023c, B:119:0x0248), top: B:170:0x00bf }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01bf A[Catch: all -> 0x0139, b -> 0x013b, RemoteException -> 0x013e, TryCatch #8 {RemoteException -> 0x013e, b -> 0x013b, all -> 0x0139, blocks: (B:30:0x00bf, B:36:0x00cb, B:38:0x00d1, B:39:0x00ec, B:43:0x00f2, B:45:0x00fa, B:47:0x00fe, B:48:0x010c, B:55:0x011a, B:57:0x0120, B:66:0x0156, B:68:0x015e, B:70:0x0167, B:71:0x016e, B:65:0x0141, B:74:0x0171, B:75:0x0172, B:76:0x0179, B:77:0x017a, B:78:0x0181, B:81:0x0184, B:82:0x0185, B:84:0x01a4, B:86:0x01b7, B:88:0x01bf, B:95:0x01fc, B:97:0x0202, B:108:0x0225, B:109:0x022c, B:89:0x01d0, B:90:0x01d7, B:93:0x01db, B:94:0x01ec, B:110:0x022d, B:111:0x0234, B:112:0x0235, B:113:0x023c, B:119:0x0248), top: B:170:0x00bf }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01d0 A[Catch: all -> 0x0139, b -> 0x013b, RemoteException -> 0x013e, TryCatch #8 {RemoteException -> 0x013e, b -> 0x013b, all -> 0x0139, blocks: (B:30:0x00bf, B:36:0x00cb, B:38:0x00d1, B:39:0x00ec, B:43:0x00f2, B:45:0x00fa, B:47:0x00fe, B:48:0x010c, B:55:0x011a, B:57:0x0120, B:66:0x0156, B:68:0x015e, B:70:0x0167, B:71:0x016e, B:65:0x0141, B:74:0x0171, B:75:0x0172, B:76:0x0179, B:77:0x017a, B:78:0x0181, B:81:0x0184, B:82:0x0185, B:84:0x01a4, B:86:0x01b7, B:88:0x01bf, B:95:0x01fc, B:97:0x0202, B:108:0x0225, B:109:0x022c, B:89:0x01d0, B:90:0x01d7, B:93:0x01db, B:94:0x01ec, B:110:0x022d, B:111:0x0234, B:112:0x0235, B:113:0x023c, B:119:0x0248), top: B:170:0x00bf }] */
    /* JADX WARN: Code duplicated, block: B:91:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:93:0x01db A[Catch: all -> 0x0139, b -> 0x013b, RemoteException -> 0x013e, TryCatch #8 {RemoteException -> 0x013e, b -> 0x013b, all -> 0x0139, blocks: (B:30:0x00bf, B:36:0x00cb, B:38:0x00d1, B:39:0x00ec, B:43:0x00f2, B:45:0x00fa, B:47:0x00fe, B:48:0x010c, B:55:0x011a, B:57:0x0120, B:66:0x0156, B:68:0x015e, B:70:0x0167, B:71:0x016e, B:65:0x0141, B:74:0x0171, B:75:0x0172, B:76:0x0179, B:77:0x017a, B:78:0x0181, B:81:0x0184, B:82:0x0185, B:84:0x01a4, B:86:0x01b7, B:88:0x01bf, B:95:0x01fc, B:97:0x0202, B:108:0x0225, B:109:0x022c, B:89:0x01d0, B:90:0x01d7, B:93:0x01db, B:94:0x01ec, B:110:0x022d, B:111:0x0234, B:112:0x0235, B:113:0x023c, B:119:0x0248), top: B:170:0x00bf }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01ec A[Catch: all -> 0x0139, b -> 0x013b, RemoteException -> 0x013e, TryCatch #8 {RemoteException -> 0x013e, b -> 0x013b, all -> 0x0139, blocks: (B:30:0x00bf, B:36:0x00cb, B:38:0x00d1, B:39:0x00ec, B:43:0x00f2, B:45:0x00fa, B:47:0x00fe, B:48:0x010c, B:55:0x011a, B:57:0x0120, B:66:0x0156, B:68:0x015e, B:70:0x0167, B:71:0x016e, B:65:0x0141, B:74:0x0171, B:75:0x0172, B:76:0x0179, B:77:0x017a, B:78:0x0181, B:81:0x0184, B:82:0x0185, B:84:0x01a4, B:86:0x01b7, B:88:0x01bf, B:95:0x01fc, B:97:0x0202, B:108:0x0225, B:109:0x022c, B:89:0x01d0, B:90:0x01d7, B:93:0x01db, B:94:0x01ec, B:110:0x022d, B:111:0x0234, B:112:0x0235, B:113:0x023c, B:119:0x0248), top: B:170:0x00bf }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0202 A[Catch: all -> 0x0139, b -> 0x013b, RemoteException -> 0x013e, TRY_LEAVE, TryCatch #8 {RemoteException -> 0x013e, b -> 0x013b, all -> 0x0139, blocks: (B:30:0x00bf, B:36:0x00cb, B:38:0x00d1, B:39:0x00ec, B:43:0x00f2, B:45:0x00fa, B:47:0x00fe, B:48:0x010c, B:55:0x011a, B:57:0x0120, B:66:0x0156, B:68:0x015e, B:70:0x0167, B:71:0x016e, B:65:0x0141, B:74:0x0171, B:75:0x0172, B:76:0x0179, B:77:0x017a, B:78:0x0181, B:81:0x0184, B:82:0x0185, B:84:0x01a4, B:86:0x01b7, B:88:0x01bf, B:95:0x01fc, B:97:0x0202, B:108:0x0225, B:109:0x022c, B:89:0x01d0, B:90:0x01d7, B:93:0x01db, B:94:0x01ec, B:110:0x022d, B:111:0x0234, B:112:0x0235, B:113:0x023c, B:119:0x0248), top: B:170:0x00bf }] */
    /* JADX WARN: Instruction removed from duplicated block: B:148:0x02d7, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:38:0x00d1, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:82:0x0185, please report this as an issue */
    public static e c(Context context, l4.d dVar, String str) {
        int i10;
        Boolean bool;
        j jVarH;
        int i11;
        g6.a aVarA;
        Object objB;
        e eVar;
        i iVar;
        Cursor cursor;
        k kVar;
        i iVar2;
        Boolean boolValueOf;
        g6.a aVarA2;
        Cursor cursor2;
        ThreadLocal threadLocal = f7571i;
        i iVar3 = (i) threadLocal.get();
        i iVar4 = new i();
        threadLocal.set(iVar4);
        c1 c1Var = f7572j;
        long jLongValue = ((Long) c1Var.get()).longValue();
        try {
            c1Var.set(Long.valueOf(SystemClock.elapsedRealtime()));
            d dVarD = dVar.d(context, str, f7573k);
            Log.i("DynamiteModule", "Considering local module " + str + ":" + dVarD.f7561a + " and remote module " + str + ":" + dVarD.f7562b);
            int i12 = dVarD.f7563c;
            if (i12 != 0) {
                if (i12 != -1) {
                    if (i12 == 1 || dVarD.f7562b != 0) {
                        if (i12 == -1) {
                            Log.i("DynamiteModule", "Selected local version of ".concat(str));
                            e eVar2 = new e(context.getApplicationContext());
                            if (jLongValue == 0) {
                                c1Var.remove();
                            } else {
                                c1Var.set(Long.valueOf(jLongValue));
                            }
                            cursor2 = iVar4.f7598a;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            threadLocal.set(iVar3);
                            return eVar2;
                        }
                        if (i12 == 1) {
                            throw new b("VersionPolicy returned invalid code:" + i12);
                        }
                        try {
                            i10 = dVarD.f7562b;
                            try {
                                synchronized (e.class) {
                                    if (g(context)) {
                                        throw new b("Remote loading disabled");
                                    }
                                    bool = f7566d;
                                }
                                if (bool != null) {
                                    throw new b("Failed to determine which loading route to use.");
                                }
                                if (bool.booleanValue()) {
                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i10);
                                    synchronized (e.class) {
                                        kVar = f7575m;
                                    }
                                    if (kVar != null) {
                                        throw new b("DynamiteLoaderV2 was not cached.");
                                    }
                                    iVar2 = (i) threadLocal.get();
                                    if (iVar2 != null || iVar2.f7598a == null) {
                                        throw new b("No result cursor");
                                    }
                                    Context applicationContext = context.getApplicationContext();
                                    Cursor cursor3 = iVar2.f7598a;
                                    new g6.b(null);
                                    synchronized (e.class) {
                                        boolValueOf = Boolean.valueOf(f7569g >= 2);
                                    }
                                    if (boolValueOf.booleanValue()) {
                                        Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                        aVarA2 = kVar.b(new g6.b(applicationContext), str, i10, new g6.b(cursor3));
                                    } else {
                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                        aVarA2 = kVar.a(new g6.b(applicationContext), str, i10, new g6.b(cursor3));
                                    }
                                    Context context2 = (Context) g6.b.b(aVarA2);
                                    if (context2 == null) {
                                        throw new b("Failed to get module context");
                                    }
                                    eVar = new e(context2);
                                } else {
                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i10);
                                    jVarH = h(context);
                                    if (jVarH != null) {
                                        throw new b("Failed to create IDynamiteLoader.");
                                    }
                                    Parcel parcelZzB = jVarH.zzB(6, jVarH.zza());
                                    i11 = parcelZzB.readInt();
                                    parcelZzB.recycle();
                                    if (i11 >= 3) {
                                        iVar = (i) threadLocal.get();
                                        if (iVar != null) {
                                            throw new b("No cached result cursor holder");
                                        }
                                        aVarA = jVarH.b(new g6.b(context), str, i10, new g6.b(iVar.f7598a));
                                    } else if (i11 == 2) {
                                        Log.w("DynamiteModule", "IDynamite loader version = 2");
                                        aVarA = jVarH.j(new g6.b(context), str, i10);
                                    } else {
                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                        aVarA = jVarH.a(new g6.b(context), str, i10);
                                    }
                                    objB = g6.b.b(aVarA);
                                    if (objB != null) {
                                        throw new b("Failed to load remote module.");
                                    }
                                    eVar = new e((Context) objB);
                                }
                                if (jLongValue == 0) {
                                    c1Var.remove();
                                } else {
                                    c1Var.set(Long.valueOf(jLongValue));
                                }
                                cursor = iVar4.f7598a;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                threadLocal.set(iVar3);
                                return eVar;
                            } catch (RemoteException e4) {
                                throw new b("Failed to load remote module.", e4);
                            } catch (b e10) {
                                throw e10;
                            } catch (Throwable th) {
                                try {
                                    f6.a.x(context);
                                } catch (Exception e11) {
                                    Log.e("CrashUtils", "Error adding exception to DropBox!", e11);
                                }
                                throw new b("Failed to load remote module.", th);
                            }
                        } catch (b e12) {
                            Log.w("DynamiteModule", "Failed to load remote module: " + e12.getMessage());
                            int i13 = dVarD.f7561a;
                            if (i13 != 0) {
                                v vVar = new v();
                                vVar.f16473a = i13;
                                if (dVar.d(context, str, vVar).f7563c == -1) {
                                    Log.i("DynamiteModule", "Selected local version of ".concat(str));
                                    e eVar3 = new e(context.getApplicationContext());
                                    if (jLongValue == 0) {
                                        f7572j.remove();
                                    } else {
                                        f7572j.set(Long.valueOf(jLongValue));
                                    }
                                    Cursor cursor4 = iVar4.f7598a;
                                    if (cursor4 != null) {
                                        cursor4.close();
                                    }
                                    f7571i.set(iVar3);
                                    return eVar3;
                                }
                            }
                            throw new b("Remote load failed. No local fallback found.", e12);
                        }
                    }
                } else if (dVarD.f7561a != 0) {
                    i12 = -1;
                    if (i12 == 1) {
                    }
                    if (i12 == -1) {
                        Log.i("DynamiteModule", "Selected local version of ".concat(str));
                        e eVar4 = new e(context.getApplicationContext());
                        if (jLongValue == 0) {
                            c1Var.remove();
                        } else {
                            c1Var.set(Long.valueOf(jLongValue));
                        }
                        cursor2 = iVar4.f7598a;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        threadLocal.set(iVar3);
                        return eVar4;
                    }
                    if (i12 == 1) {
                        throw new b("VersionPolicy returned invalid code:" + i12);
                    }
                    i10 = dVarD.f7562b;
                    synchronized (e.class) {
                        if (g(context)) {
                            throw new b("Remote loading disabled");
                        }
                        bool = f7566d;
                        if (bool != null) {
                            throw new b("Failed to determine which loading route to use.");
                        }
                        if (bool.booleanValue()) {
                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i10);
                            synchronized (e.class) {
                                kVar = f7575m;
                                if (kVar != null) {
                                    throw new b("DynamiteLoaderV2 was not cached.");
                                }
                                iVar2 = (i) threadLocal.get();
                                if (iVar2 != null) {
                                }
                                throw new b("No result cursor");
                            }
                        }
                        Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i10);
                        jVarH = h(context);
                        if (jVarH != null) {
                            throw new b("Failed to create IDynamiteLoader.");
                        }
                        Parcel parcelZzB2 = jVarH.zzB(6, jVarH.zza());
                        i11 = parcelZzB2.readInt();
                        parcelZzB2.recycle();
                        if (i11 >= 3) {
                            iVar = (i) threadLocal.get();
                            if (iVar != null) {
                                throw new b("No cached result cursor holder");
                            }
                            aVarA = jVarH.b(new g6.b(context), str, i10, new g6.b(iVar.f7598a));
                        } else if (i11 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                            aVarA = jVarH.j(new g6.b(context), str, i10);
                        } else {
                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                            aVarA = jVarH.a(new g6.b(context), str, i10);
                        }
                        objB = g6.b.b(aVarA);
                        if (objB != null) {
                            throw new b("Failed to load remote module.");
                        }
                        eVar = new e((Context) objB);
                        if (jLongValue == 0) {
                            c1Var.remove();
                        } else {
                            c1Var.set(Long.valueOf(jLongValue));
                        }
                        cursor = iVar4.f7598a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(iVar3);
                        return eVar;
                    }
                }
            }
            throw new b("No acceptable module " + str + " found. Local version is " + dVarD.f7561a + " and remote version is " + dVarD.f7562b + ".");
        } catch (Throwable th2) {
            if (jLongValue == 0) {
                f7572j.remove();
            } else {
                f7572j.set(Long.valueOf(jLongValue));
            }
            Cursor cursor5 = iVar4.f7598a;
            if (cursor5 != null) {
                cursor5.close();
            }
            f7571i.set(iVar3);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00af A[Catch: all -> 0x0036, TryCatch #9 {all -> 0x0036, blocks: (B:9:0x0026, B:11:0x0032, B:52:0x00b8, B:16:0x003b, B:18:0x0042, B:20:0x0048, B:25:0x004e, B:27:0x0052, B:31:0x005c, B:33:0x0064, B:36:0x006b, B:43:0x0097, B:44:0x009f, B:39:0x0072, B:41:0x0078, B:42:0x0089, B:47:0x00a2, B:50:0x00a5, B:51:0x00af, B:17:0x003e), top: B:143:0x0026, inners: #11 }] */
    public static int d(Context context, String str, boolean z10) {
        Throwable th;
        RemoteException e4;
        int i10;
        i iVar;
        Cursor cursor;
        try {
            synchronized (e.class) {
                Boolean bool = f7566d;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        f(classLoader);
                                    } catch (b unused) {
                                    }
                                    bool = Boolean.TRUE;
                                } else {
                                    if (!g(context)) {
                                        return 0;
                                    }
                                    if (f7568f) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        Boolean bool2 = Boolean.TRUE;
                                        if (bool2.equals(null)) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        } else {
                                            try {
                                                int iE = e(context, str, z10, true);
                                                String str2 = f7567e;
                                                if (str2 != null && !str2.isEmpty()) {
                                                    ClassLoader classLoaderC0 = g.C0();
                                                    if (classLoaderC0 == null) {
                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                            a.b();
                                                            String str3 = f7567e;
                                                            f6.a.x(str3);
                                                            classLoaderC0 = a.a(str3, ClassLoader.getSystemClassLoader());
                                                        } else {
                                                            String str4 = f7567e;
                                                            f6.a.x(str4);
                                                            classLoaderC0 = new h(str4, ClassLoader.getSystemClassLoader());
                                                        }
                                                    }
                                                    f(classLoaderC0);
                                                    declaredField.set(null, classLoaderC0);
                                                    f7566d = bool2;
                                                    return iE;
                                                }
                                                return iE;
                                            } catch (b unused2) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    }
                                }
                                f7566d = bool;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e10) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e10.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return e(context, str, z10, false);
                    } catch (b e11) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e11.getMessage());
                        return 0;
                    }
                }
                j jVarH = h(context);
                try {
                    if (jVarH == null) {
                        return 0;
                    }
                    try {
                        Parcel parcelZzB = jVarH.zzB(6, jVarH.zza());
                        int i11 = parcelZzB.readInt();
                        parcelZzB.recycle();
                        if (i11 >= 3) {
                            ThreadLocal threadLocal = f7571i;
                            i iVar2 = (i) threadLocal.get();
                            if (iVar2 != null && (cursor = iVar2.f7598a) != null) {
                                return cursor.getInt(0);
                            }
                            Cursor cursor3 = (Cursor) g6.b.b(jVarH.t(new g6.b(context), str, z10, ((Long) f7572j.get()).longValue()));
                            if (cursor3 != null) {
                                try {
                                    if (cursor3.moveToFirst()) {
                                        i10 = cursor3.getInt(0);
                                        if (i10 <= 0 || (iVar = (i) threadLocal.get()) == null || iVar.f7598a != null) {
                                            cursor2 = cursor3;
                                        } else {
                                            iVar.f7598a = cursor3;
                                        }
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                    }
                                } catch (RemoteException e12) {
                                    e4 = e12;
                                    cursor2 = cursor3;
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e4.getMessage());
                                    if (cursor2 == null) {
                                        return 0;
                                    }
                                    cursor2.close();
                                    return 0;
                                } catch (Throwable th3) {
                                    th = th3;
                                    cursor2 = cursor3;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    throw th;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            if (cursor3 == null) {
                                return 0;
                            }
                            cursor3.close();
                            return 0;
                        }
                        if (i11 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            g6.b bVar = new g6.b(context);
                            Parcel parcelZza = jVarH.zza();
                            zzc.zzf(parcelZza, bVar);
                            parcelZza.writeString(str);
                            zzc.zzc(parcelZza, z10);
                            Parcel parcelZzB2 = jVarH.zzB(5, parcelZza);
                            i10 = parcelZzB2.readInt();
                            parcelZzB2.recycle();
                        } else {
                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            g6.b bVar2 = new g6.b(context);
                            Parcel parcelZza2 = jVarH.zza();
                            zzc.zzf(parcelZza2, bVar2);
                            parcelZza2.writeString(str);
                            zzc.zzc(parcelZza2, z10);
                            Parcel parcelZzB3 = jVarH.zzB(3, parcelZza2);
                            i10 = parcelZzB3.readInt();
                            parcelZzB3.recycle();
                        }
                        return i10;
                    } catch (RemoteException e13) {
                        e4 = e13;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            try {
                f6.a.x(context);
            } catch (Exception e14) {
                Log.e("CrashUtils", "Error adding exception to DropBox!", e14);
            }
            throw th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0097 A[PHI: r11
  0x0097: PHI (r11v8 boolean) = (r11v7 boolean), (r11v12 boolean), (r11v12 boolean) binds: [B:11:0x0055, B:29:0x008e, B:31:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    public static int e(Context context, String str, boolean z10, boolean z11) throws Throwable {
        Cursor cursor = null;
        try {
            try {
                boolean z12 = true;
                Cursor cursorQuery = context.getContentResolver().query(new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority("com.google.android.gms.chimera").path(true != z10 ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(((Long) f7572j.get()).longValue())).build(), null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            boolean z13 = false;
                            int i10 = cursorQuery.getInt(0);
                            if (i10 > 0) {
                                synchronized (e.class) {
                                    try {
                                        f7567e = cursorQuery.getString(2);
                                        int columnIndex = cursorQuery.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            f7569g = cursorQuery.getInt(columnIndex);
                                        }
                                        int columnIndex2 = cursorQuery.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            if (cursorQuery.getInt(columnIndex2) == 0) {
                                                z12 = false;
                                            }
                                            f7568f = z12;
                                            z13 = z12;
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                i iVar = (i) f7571i.get();
                                if (iVar == null || iVar.f7598a != null) {
                                    cursor = cursorQuery;
                                } else {
                                    iVar.f7598a = cursorQuery;
                                }
                            } else {
                                cursor = cursorQuery;
                            }
                            if (z11 && z13) {
                                throw new b("forcing fallback to container DynamiteLoader impl");
                            }
                            if (cursor != null) {
                                cursor.close();
                            }
                            return i10;
                            if (e instanceof b) {
                                throw e;
                            }
                            throw new b("V2 version check failed", e);
                        }
                    } catch (Exception e4) {
                        e = e4;
                    } catch (Throwable th2) {
                        cursor = cursorQuery;
                        th = th2;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new b("Failed to connect to dynamite module ContentResolver.");
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static void f(ClassLoader classLoader) throws b {
        k kVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                kVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                kVar = iInterfaceQueryLocalInterface instanceof k ? (k) iInterfaceQueryLocalInterface : new k(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
            }
            f7575m = kVar;
        } catch (ClassNotFoundException e4) {
            e = e4;
            throw new b("Failed to instantiate dynamite loader", e);
        } catch (IllegalAccessException e10) {
            e = e10;
            throw new b("Failed to instantiate dynamite loader", e);
        } catch (InstantiationException e11) {
            e = e11;
            throw new b("Failed to instantiate dynamite loader", e);
        } catch (NoSuchMethodException e12) {
            e = e12;
            throw new b("Failed to instantiate dynamite loader", e);
        } catch (InvocationTargetException e13) {
            e = e13;
            throw new b("Failed to instantiate dynamite loader", e);
        }
    }

    public static boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f7570h)) {
            return true;
        }
        boolean zBooleanValue = false;
        if (f7570h == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (z5.f.f17253b.c(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                zBooleanValue = true;
            }
            Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
            f7570h = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
            if (zBooleanValue && providerInfoResolveContentProvider != null && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f7568f = true;
            }
        }
        if (!zBooleanValue) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return zBooleanValue;
    }

    public static j h(Context context) {
        j jVar;
        synchronized (e.class) {
            j jVar2 = f7574l;
            if (jVar2 != null) {
                return jVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    jVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    jVar = iInterfaceQueryLocalInterface instanceof j ? (j) iInterfaceQueryLocalInterface : new j(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
                }
                if (jVar != null) {
                    f7574l = jVar;
                    return jVar;
                }
            } catch (Exception e4) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e4.getMessage());
            }
            return null;
        }
    }

    public final IBinder b(String str) throws b {
        try {
            return (IBinder) this.f7576a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e4) {
            throw new b("Failed to instantiate module class: ".concat(str), e4);
        }
    }
}
