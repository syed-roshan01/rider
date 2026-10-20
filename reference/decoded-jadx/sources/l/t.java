package l;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.gms.internal.measurement.zzda;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.components.ServiceComponent;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k6.d4;
import k6.d7;
import k6.f5;
import k6.i4;
import k6.p7;
import k6.v5;
import k6.y5;

/* JADX INFO: loaded from: classes.dex */
public final class t implements x2.f, ActivityRetainedComponentBuilder, ServiceComponentBuilder, Continuation, v5, i4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f10928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f10929c;

    public /* synthetic */ t(int i10, Object obj, Object obj2) {
        this.f10927a = i10;
        this.f10928b = obj;
        this.f10929c = obj2;
    }

    @Override // k6.i4
    public final void a(String str, int i10, Throwable th, byte[] bArr, Map map) {
        ((p7) this.f10929c).q(true, i10, th, bArr);
    }

    public final void b(Object obj, String str) {
        ((List) this.f10928b).add(str + "=" + String.valueOf(obj));
    }

    @Override // dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder
    public final ActivityRetainedComponent build() {
        z6.a.g(SavedStateHandleHolder.class, (SavedStateHandleHolder) this.f10929c);
        return new y4.j((y4.n) this.f10928b);
    }

    @Override // x2.f
    public final void c() {
        ((f4.q) this.f10928b).d();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0049  */
    /* JADX WARN: Code duplicated, block: B:20:0x005c  */
    public final CctBackendFactory d(String str) {
        Bundle bundle;
        Map mapEmptyMap;
        Object obj;
        if (((Map) this.f10929c) == null) {
            Context context = (Context) this.f10928b;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                } else {
                    ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                    if (serviceInfo == null) {
                        Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    } else {
                        bundle = serviceInfo.metaData;
                    }
                    if (bundle == null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        mapEmptyMap = Collections.emptyMap();
                    } else {
                        HashMap map = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            obj = bundle.get(str2);
                            if (!(obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(",", -1)) {
                                    String strTrim = str3.trim();
                                    if (!strTrim.isEmpty()) {
                                        map.put(strTrim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        mapEmptyMap = map;
                    }
                    this.f10929c = mapEmptyMap;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            bundle = null;
            if (bundle == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                mapEmptyMap = Collections.emptyMap();
            } else {
                HashMap map2 = new HashMap();
                while (r7.hasNext()) {
                    obj = bundle.get(str2);
                    if (!(obj instanceof String)) {
                    }
                }
                mapEmptyMap = map2;
            }
            this.f10929c = mapEmptyMap;
        }
        String str4 = (String) ((Map) this.f10929c).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException e4) {
            Log.w("BackendRegistry", String.format("Class %s is not found.", str4), e4);
            return null;
        } catch (IllegalAccessException e10) {
            Log.w("BackendRegistry", String.format("Could not instantiate %s.", str4), e10);
            return null;
        } catch (InstantiationException e11) {
            Log.w("BackendRegistry", String.format("Could not instantiate %s.", str4), e11);
            return null;
        } catch (NoSuchMethodException e12) {
            Log.w("BackendRegistry", String.format("Could not instantiate %s", str4), e12);
            return null;
        } catch (InvocationTargetException e13) {
            Log.w("BackendRegistry", String.format("Could not instantiate %s", str4), e13);
            return null;
        }
    }

    public final void e(String str, String str2, Bundle bundle, long j10) {
        try {
            ((zzda) this.f10928b).zza(str, str2, bundle, j10);
        } catch (RemoteException e4) {
            f5 f5Var = ((AppMeasurementDynamiteService) this.f10929c).f3409a;
            if (f5Var != null) {
                d4 d4Var = f5Var.f10032i;
                f5.d(d4Var);
                d4Var.f9967i.c("Event interceptor threw exception", e4);
            }
        }
    }

    public final void f(Throwable th) {
        ((y5) this.f10929c).l();
        Object obj = this.f10929c;
        ((y5) obj).f10574i = false;
        ((y5) obj).P();
        ((y5) this.f10929c).zzj().f9964f.c("registerTriggerAsync failed with throwable", th);
    }

    public final void g(y2.f fVar) {
        int i10 = fVar.f16860b;
        if (i10 != 0) {
            ((Handler) this.f10929c).post(new androidx.activity.h(this, (k.f) this.f10928b, i10));
        } else {
            k.f fVar2 = (k.f) this.f10928b;
            ((Handler) this.f10929c).post(new y2.a(this, fVar2, fVar.f16859a, 0));
        }
    }

    public final int h(Context context, com.google.android.gms.common.api.d dVar) {
        f6.a.x(context);
        f6.a.x(dVar);
        int i10 = 0;
        if (!dVar.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = dVar.getMinApkVersion();
        int iC = ((SparseIntArray) this.f10928b).get(minApkVersion, -1);
        if (iC == -1) {
            int i11 = 0;
            while (true) {
                if (i11 >= ((SparseIntArray) this.f10928b).size()) {
                    i10 = -1;
                    break;
                }
                int iKeyAt = ((SparseIntArray) this.f10928b).keyAt(i11);
                if (iKeyAt > minApkVersion && ((SparseIntArray) this.f10928b).get(iKeyAt) == 0) {
                    break;
                }
                i11++;
            }
            iC = i10 == -1 ? ((z5.f) this.f10929c).c(context, minApkVersion) : i10;
            ((SparseIntArray) this.f10928b).put(minApkVersion, iC);
        }
        return iC;
    }

    @Override // dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder
    public final ActivityRetainedComponentBuilder savedStateHandleHolder(SavedStateHandleHolder savedStateHandleHolder) {
        savedStateHandleHolder.getClass();
        this.f10929c = savedStateHandleHolder;
        return this;
    }

    @Override // dagger.hilt.android.internal.builders.ServiceComponentBuilder
    public final ServiceComponentBuilder service(Service service) {
        service.getClass();
        this.f10929c = service;
        return this;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        Bundle bundle;
        y5.c cVar = (y5.c) this.f10928b;
        Bundle bundle2 = (Bundle) this.f10929c;
        cVar.getClass();
        return (task.isSuccessful() && (bundle = (Bundle) task.getResult()) != null && bundle.containsKey("google.messenger")) ? cVar.a(bundle2).onSuccessTask(y5.p.f16986a, y5.d.f16960b) : task;
    }

    public final String toString() {
        switch (this.f10927a) {
            case 8:
                return "Bounds{lower=" + ((u2.c) this.f10928b) + " upper=" + ((u2.c) this.f10929c) + "}";
            case 23:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.f10929c.getClass().getSimpleName());
                sb.append('{');
                int size = ((List) this.f10928b).size();
                for (int i10 = 0; i10 < size; i10++) {
                    sb.append((String) ((List) this.f10928b).get(i10));
                    if (i10 < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ t(Object obj, int i10) {
        this.f10927a = i10;
        this.f10928b = obj;
    }

    public /* synthetic */ t(Object obj, Object obj2, int i10) {
        this.f10927a = i10;
        this.f10929c = obj;
        this.f10928b = obj2;
    }

    @Override // dagger.hilt.android.internal.builders.ServiceComponentBuilder
    /* JADX INFO: renamed from: build, reason: collision with other method in class */
    public final ServiceComponent mo6654build() {
        z6.a.g(Service.class, (Service) this.f10929c);
        return new y4.l();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(y4.n nVar) {
        this((Object) nVar, 11);
        this.f10927a = 11;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(y4.n nVar, int i10) {
        this((Object) nVar, 12);
        this.f10927a = 12;
    }

    public t(IBinder iBinder) throws RemoteException {
        this.f10927a = 19;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (f6.a.o0(interfaceDescriptor, "android.os.IMessenger")) {
            this.f10928b = new Messenger(iBinder);
            this.f10929c = null;
        } else if (f6.a.o0(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.f10929c = new y5.h(iBinder);
            this.f10928b = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public /* synthetic */ t(Object obj) {
        this.f10927a = 23;
        f6.a.x(obj);
        this.f10929c = obj;
        this.f10928b = new ArrayList();
    }

    public t(d7 d7Var) {
        this.f10927a = 27;
        this.f10929c = d7Var;
    }

    public t() {
        z5.e eVar = z5.e.f17251d;
        this.f10927a = 24;
        this.f10928b = new SparseIntArray();
        this.f10929c = eVar;
    }

    public t(String str) {
        this.f10927a = 22;
        this.f10928b = "LibraryVersion";
        this.f10929c = (str == null || str.length() <= 0) ? null : str;
    }

    public t(TextView textView) {
        this.f10927a = 1;
        textView.getClass();
        this.f10928b = textView;
    }

    public t(EditText editText) {
        this.f10927a = 0;
        this.f10928b = editText;
        this.f10929c = new k3.b(editText);
    }

    public t(Context context) {
        this.f10927a = 16;
        this.f10929c = null;
        this.f10928b = context;
    }

    public t(ArrayList arrayList, ArrayList arrayList2) {
        this.f10927a = 6;
        int size = arrayList.size();
        this.f10928b = new int[size];
        this.f10929c = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            ((int[]) this.f10928b)[i10] = ((Integer) arrayList.get(i10)).intValue();
            ((float[]) this.f10929c)[i10] = ((Float) arrayList2.get(i10)).floatValue();
        }
    }

    public t(int i10, int i11) {
        this.f10927a = 6;
        this.f10928b = new int[]{i10, i11};
        this.f10929c = new float[]{0.0f, 1.0f};
    }

    public t(int i10, int i11, int i12) {
        this.f10927a = 6;
        this.f10928b = new int[]{i10, i11, i12};
        this.f10929c = new float[]{0.0f, 0.5f, 1.0f};
    }
}
