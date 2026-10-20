package androidx.fragment.app;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import android.view.View;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;
import k6.d4;
import k6.f5;
import k6.i4;
import k6.l4;
import k6.o4;

/* JADX INFO: loaded from: classes.dex */
public final class n1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f1981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f1982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f1983f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f1984n;

    public /* synthetic */ n1(Object obj, int i10, Serializable serializable, Object obj2, Object obj3, Object obj4, int i11) {
        this.f1978a = i11;
        this.f1984n = obj;
        this.f1979b = i10;
        this.f1980c = serializable;
        this.f1981d = obj2;
        this.f1982e = obj3;
        this.f1983f = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1978a) {
            case 0:
                break;
            case 1:
                l4 l4Var = ((f5) ((d4) this.f1984n).f6226a).f10031h;
                f5.c(l4Var);
                if (!l4Var.f10258b) {
                    Log.println(6, ((d4) this.f1984n).A(), "Persisted config not initialized. Not logging error/warn");
                    return;
                }
                d4 d4Var = (d4) this.f1984n;
                if (d4Var.f9961c == 0) {
                    k6.f fVarH = d4Var.h();
                    if (fVarH.f10015d == null) {
                        synchronized (fVarH) {
                            try {
                                if (fVarH.f10015d == null) {
                                    ApplicationInfo applicationInfo = fVarH.zza().getApplicationInfo();
                                    String strB = e6.d.b();
                                    if (applicationInfo != null) {
                                        String str = applicationInfo.processName;
                                        fVarH.f10015d = Boolean.valueOf(str != null && str.equals(strB));
                                    }
                                    if (fVarH.f10015d == null) {
                                        fVarH.f10015d = Boolean.TRUE;
                                        fVarH.zzj().f9964f.b("My process not in the list of running processes");
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    if (fVarH.f10015d.booleanValue()) {
                        ((d4) this.f1984n).f9961c = 'C';
                    } else {
                        ((d4) this.f1984n).f9961c = 'c';
                    }
                    break;
                }
                d4 d4Var2 = (d4) this.f1984n;
                if (d4Var2.f9962d < 0) {
                    d4Var2.f9962d = 82001L;
                }
                char cCharAt = "01VDIWEA?".charAt(this.f1979b);
                d4 d4Var3 = (d4) this.f1984n;
                char c10 = d4Var3.f9961c;
                long j10 = d4Var3.f9962d;
                String strQ = d4.q(true, (String) this.f1980c, this.f1981d, this.f1982e, this.f1983f);
                StringBuilder sb = new StringBuilder("2");
                sb.append(cCharAt);
                sb.append(c10);
                sb.append(j10);
                String strP = a7.a.p(sb, ":", strQ);
                if (strP.length() > 1024) {
                    strP = ((String) this.f1980c).substring(0, 1024);
                }
                o4 o4Var = l4Var.f10171d;
                if (o4Var != null) {
                    l4 l4Var2 = o4Var.f10257e;
                    l4Var2.l();
                    if (o4Var.f10257e.s().getLong(o4Var.f10253a, 0L) == 0) {
                        o4Var.a();
                    }
                    if (strP == null) {
                        strP = "";
                    }
                    SharedPreferences sharedPreferencesS = l4Var2.s();
                    String str2 = o4Var.f10254b;
                    long j11 = sharedPreferencesS.getLong(str2, 0L);
                    String str3 = o4Var.f10255c;
                    if (j11 <= 0) {
                        SharedPreferences.Editor editorEdit = l4Var2.s().edit();
                        editorEdit.putString(str3, strP);
                        editorEdit.putLong(str2, 1L);
                        editorEdit.apply();
                        return;
                    }
                    long j12 = j11 + 1;
                    i = (l4Var2.k().x0().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j12 ? 1 : 0;
                    SharedPreferences.Editor editorEdit2 = l4Var2.s().edit();
                    if (i != 0) {
                        editorEdit2.putString(str3, strP);
                    }
                    editorEdit2.putLong(str2, j12);
                    editorEdit2.apply();
                    return;
                }
                return;
            default:
                ((i4) this.f1980c).a((String) this.f1983f, this.f1979b, (Throwable) this.f1981d, (byte[]) this.f1982e, (Map) this.f1984n);
                return;
        }
        for (int i10 = 0; i10 < this.f1979b; i10++) {
            View view = (View) ((ArrayList) this.f1980c).get(i10);
            String str4 = (String) ((ArrayList) this.f1981d).get(i10);
            Field field = b3.q0.f2670a;
            b3.h0.v(view, str4);
            b3.h0.v((View) ((ArrayList) this.f1982e).get(i10), (String) ((ArrayList) this.f1983f).get(i10));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n1(String str, i4 i4Var, int i10, IOException iOException, byte[] bArr, Map map) {
        this(str, i4Var, i10, iOException, bArr, map, 0);
        this.f1978a = 2;
    }

    public n1(String str, i4 i4Var, int i10, IOException iOException, byte[] bArr, Map map, int i11) {
        this.f1978a = 2;
        f6.a.x(i4Var);
        this.f1980c = i4Var;
        this.f1979b = i10;
        this.f1981d = iOException;
        this.f1982e = bArr;
        this.f1983f = str;
        this.f1984n = map;
    }
}
