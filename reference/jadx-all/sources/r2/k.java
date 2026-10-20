package r2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.Display;
import android.view.WindowManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import l.q;
import o1.s;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import q2.m0;
import q2.n0;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    private static final String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    private static final String TAG = "ContextCompat";
    private static final Object sLock = new Object();
    private static final Object sSync = new Object();
    private static TypedValue sTempValue;

    public static int checkSelfPermission(Context context, String str) {
        if (str == null) {
            throw new NullPointerException("permission must be non-null");
        }
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return m0.a(new n0(context).f13088a) ? 0 : -1;
    }

    public static Context createDeviceProtectedStorageContext(Context context) {
        return f.a(context);
    }

    public static String getAttributionTag(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return i.a(context);
        }
        return null;
    }

    public static File getCodeCacheDir(Context context) {
        return d.a(context);
    }

    public static int getColor(Context context, int i10) {
        return e.a(context, i10);
    }

    public static ColorStateList getColorStateList(Context context, int i10) {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        t2.k kVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        t2.l lVar = new t2.l(resources, theme);
        synchronized (t2.n.f14624c) {
            try {
                SparseArray sparseArray = (SparseArray) t2.n.f14623b.get(lVar);
                colorStateListA = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (kVar = (t2.k) sparseArray.get(i10)) == null) {
                    colorStateList = null;
                } else {
                    if (kVar.f14617b.equals(resources.getConfiguration())) {
                        if (theme != null || kVar.f14618c != 0) {
                            if (theme == null || kVar.f14618c != theme.hashCode()) {
                            }
                        }
                        colorStateList = kVar.f14616a;
                    }
                    sparseArray.remove(i10);
                    colorStateList = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = t2.n.f14622a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i10, typedValue, true);
        int i11 = typedValue.type;
        if (i11 < 28 || i11 > 31) {
            try {
                colorStateListA = t2.c.a(resources, resources.getXml(i10), theme);
            } catch (Exception e4) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e4);
            }
        }
        if (colorStateListA == null) {
            return t2.j.b(resources, i10, theme);
        }
        synchronized (t2.n.f14624c) {
            try {
                WeakHashMap weakHashMap = t2.n.f14623b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(lVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(lVar, sparseArray2);
                }
                sparseArray2.append(i10, new t2.k(colorStateListA, lVar.f14619a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return colorStateListA;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0068 A[EXC_TOP_SPLITTER, PHI: r1
  0x0068: PHI (r1v7 java.lang.String) = (r1v1 java.lang.String), (r1v9 java.lang.String) binds: [B:35:0x0076, B:29:0x0066] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public static Context getContextForLanguage(Context context) {
        String attributeValue;
        x2.m mVar;
        if (Build.VERSION.SDK_INT >= 33) {
            Object systemService = context.getSystemService("locale");
            mVar = systemService != null ? new x2.m(new x2.o(q2.n.a(systemService))) : x2.m.f16298b;
        } else {
            synchronized (q2.i.f13082a) {
                attributeValue = "";
                try {
                    FileInputStream fileInputStreamOpenFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    try {
                        try {
                            XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                            xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, "UTF-8");
                            int depth = xmlPullParserNewPullParser.getDepth();
                            while (true) {
                                int next = xmlPullParserNewPullParser.next();
                                if (next == 1 || (next == 3 && xmlPullParserNewPullParser.getDepth() <= depth)) {
                                    break;
                                }
                                if (next != 3 && next != 4 && xmlPullParserNewPullParser.getName().equals("locales")) {
                                    attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "application_locales");
                                    break;
                                }
                            }
                            if (fileInputStreamOpenFileInput != null) {
                                try {
                                    fileInputStreamOpenFileInput.close();
                                } catch (IOException unused) {
                                }
                            }
                        } catch (IOException | XmlPullParserException unused2) {
                            Log.w("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                            if (fileInputStreamOpenFileInput != null) {
                                fileInputStreamOpenFileInput.close();
                            }
                        }
                        if (attributeValue.isEmpty()) {
                            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                        }
                    } catch (Throwable th) {
                        if (fileInputStreamOpenFileInput != null) {
                            try {
                                fileInputStreamOpenFileInput.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                } catch (FileNotFoundException unused4) {
                }
            }
            x2.m mVar2 = x2.m.f16298b;
            if (attributeValue.isEmpty()) {
                mVar = x2.m.f16298b;
            } else {
                String[] strArrSplit = attributeValue.split(",", -1);
                int length = strArrSplit.length;
                Locale[] localeArr = new Locale[length];
                for (int i10 = 0; i10 < length; i10++) {
                    localeArr[i10] = x2.k.a(strArrSplit[i10]);
                }
                mVar = new x2.m(new x2.o(x2.l.a(localeArr)));
            }
        }
        if (Build.VERSION.SDK_INT > 32 || ((x2.o) mVar.f16299a).f16300a.isEmpty()) {
            return context;
        }
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        x2.h.b(configuration, mVar);
        return b.a(context, configuration);
    }

    public static File getDataDir(Context context) {
        return f.b(context);
    }

    public static Display getDisplayOrDefault(Context context) {
        return Build.VERSION.SDK_INT >= 30 ? i.b(context) : ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public static Drawable getDrawable(Context context, int i10) {
        return d.b(context, i10);
    }

    public static File[] getExternalCacheDirs(Context context) {
        return c.a(context);
    }

    public static File[] getExternalFilesDirs(Context context, String str) {
        return c.b(context, str);
    }

    public static Executor getMainExecutor(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? h.a(context) : new x2.j(new Handler(context.getMainLooper()));
    }

    public static File getNoBackupFilesDir(Context context) {
        return d.c(context);
    }

    public static File[] getObbDirs(Context context) {
        return c.c(context);
    }

    public static String getString(Context context, int i10) {
        return getContextForLanguage(context).getString(i10);
    }

    public static <T> T getSystemService(Context context, Class<T> cls) {
        return (T) e.b(context, cls);
    }

    public static String getSystemServiceName(Context context, Class<?> cls) {
        return e.c(context, cls);
    }

    public static boolean isDeviceProtectedStorage(Context context) {
        return f.c(context);
    }

    public static String obtainAndCheckReceiverPermission(Context context) {
        String str = context.getPackageName() + DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX;
        if (s.m(context, str) == 0) {
            return str;
        }
        throw new RuntimeException(q.k("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i10) {
        return registerReceiver(context, broadcastReceiver, intentFilter, null, null, i10);
    }

    public static boolean startActivities(Context context, Intent[] intentArr) {
        return startActivities(context, intentArr, null);
    }

    public static void startActivity(Context context, Intent intent, Bundle bundle) {
        a.b(context, intent, bundle);
    }

    public static void startForegroundService(Context context, Intent intent) {
        g.b(context, intent);
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i10) {
        int i11 = i10 & 1;
        if (i11 != 0 && (i10 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i11 != 0) {
            i10 |= 2;
        }
        int i12 = i10;
        int i13 = i12 & 2;
        if (i13 == 0 && (i12 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i13 == 0 || (i12 & 4) == 0) {
            return Build.VERSION.SDK_INT >= 33 ? j.a(context, broadcastReceiver, intentFilter, str, handler, i12) : g.a(context, broadcastReceiver, intentFilter, str, handler, i12);
        }
        throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
    }

    public static boolean startActivities(Context context, Intent[] intentArr, Bundle bundle) {
        a.a(context, intentArr, bundle);
        return true;
    }
}
