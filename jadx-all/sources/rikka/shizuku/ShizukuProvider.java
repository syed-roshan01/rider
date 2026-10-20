package rikka.shizuku;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import la.g;
import la.j;
import moe.shizuku.api.BinderContainer;
import z6.a;

/* JADX INFO: loaded from: classes.dex */
public class ShizukuProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.multiprocess) {
            throw new IllegalStateException("android:multiprocess must be false");
        }
        if (!providerInfo.exported) {
            throw new IllegalStateException("android:exported must be true");
        }
    }

    @Override // android.content.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        IBinder iBinder;
        if (a.f17316q) {
            Log.w("ShizukuProvider", "Provider called when Sui is available. Are you using Shizuku and Sui at the same time?");
            return new Bundle();
        }
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(BinderContainer.class.getClassLoader());
        Bundle bundle2 = new Bundle();
        str.getClass();
        if (str.equals("sendBinder")) {
            if (g.f()) {
                Log.d("ShizukuProvider", "sendBinder is called when already a living binder");
            } else {
                BinderContainer binderContainer = (BinderContainer) bundle.getParcelable("moe.shizuku.privileged.api.intent.extra.BINDER");
                if (binderContainer != null && (iBinder = binderContainer.f12026a) != null) {
                    Log.d("ShizukuProvider", "binder received");
                    g.e(iBinder, getContext().getPackageName());
                }
            }
        } else if (str.equals("getBinder")) {
            IBinder iBinder2 = g.f11416a;
            if (iBinder2 == null || !iBinder2.pingBinder()) {
                return null;
            }
            BinderContainer binderContainer2 = new BinderContainer();
            binderContainer2.f12026a = iBinder2;
            bundle2.putParcelable("moe.shizuku.privileged.api.intent.extra.BINDER", binderContainer2);
        }
        return bundle2;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        if (!a.f17316q) {
            String packageName = getContext().getPackageName();
            HashMap map = j.f11431a;
            IBinder iBinder = (IBinder) map.get("activity");
            IBinder iBinder2 = null;
            if (iBinder == null) {
                try {
                    iBinder = (IBinder) j.f11432b.invoke(null, "activity");
                } catch (IllegalAccessException | InvocationTargetException e4) {
                    Log.w("SystemServiceHelper", Log.getStackTraceString(e4));
                }
                map.put("activity", iBinder);
            }
            boolean z10 = false;
            if (iBinder != null) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.app.IActivityManager");
                    parcelObtain.writeInt(2);
                    iBinder.transact(1599296841, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    IBinder strongBinder = parcelObtain2.readStrongBinder();
                    if (strongBinder != null) {
                        parcelObtain.recycle();
                        parcelObtain2.recycle();
                        iBinder2 = strongBinder;
                    } else {
                        parcelObtain.recycle();
                        parcelObtain2.recycle();
                    }
                } catch (Throwable th) {
                    try {
                        th.printStackTrace();
                    } catch (Throwable th2) {
                        parcelObtain.recycle();
                        parcelObtain2.recycle();
                        throw th2;
                    }
                }
            }
            if (iBinder2 != null) {
                g.e(iBinder2, packageName);
                a.f17316q = true;
                z10 = true;
            } else {
                a.f17316q = false;
            }
            Log.d("ShizukuProvider", "Initialize Sui: " + z10);
        }
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
