package k;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.profileinstaller.ProfileInstallReceiver;
import b3.i1;
import b3.j1;
import b3.k1;
import com.google.android.gms.internal.base.zac;
import com.google.android.gms.tasks.TaskCompletionSource;
import dagger.hilt.android.internal.managers.ComponentSupplier;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import i1.a0;
import i1.z;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import k6.r5;
import k6.s4;
import l.b3;
import l.h0;
import l.p1;
import o1.b0;
import o1.x;

/* JADX INFO: loaded from: classes.dex */
public class f implements p1, r, j, h0, y3.d, ComponentSupplier, com.google.android.gms.common.internal.d, com.google.android.gms.common.api.internal.q, com.google.android.gms.common.internal.b, com.google.android.gms.common.internal.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f8599b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f() {
        this(21);
        this.f8598a = 21;
    }

    public static f L(String str) {
        k6.i iVar;
        EnumMap enumMap = new EnumMap(r5.class);
        if (str.length() < r5.values().length || str.charAt(0) != '1') {
            return new f(28);
        }
        r5[] r5VarArrValues = r5.values();
        int length = r5VarArrValues.length;
        int i10 = 1;
        int i11 = 0;
        while (i11 < length) {
            r5 r5Var = r5VarArrValues[i11];
            int i12 = i10 + 1;
            char cCharAt = str.charAt(i10);
            k6.i[] iVarArrValues = k6.i.values();
            int length2 = iVarArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length2) {
                    iVar = k6.i.f10094b;
                    break;
                }
                iVar = iVarArrValues[i13];
                if (iVar.f10103a == cCharAt) {
                    break;
                }
                i13++;
            }
            enumMap.put(r5Var, iVar);
            i11++;
            i10 = i12;
        }
        return new f(enumMap);
    }

    public static Object w(Object[] objArr, int i10, x9.v vVar) {
        int i11;
        boolean z10;
        int i12 = (i10 & 1) == 0 ? 400 : 700;
        boolean z11 = (i10 & 2) != 0;
        Object obj = null;
        int i13 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int i14 = vVar.f16473a;
            switch (i14) {
                case 0:
                    i11 = ((y2.h) obj2).f16867c;
                    break;
                default:
                    i11 = ((t2.g) obj2).f14607b;
                    break;
            }
            int iAbs = Math.abs(i11 - i12) * 2;
            switch (i14) {
                case 0:
                    z10 = ((y2.h) obj2).f16868d;
                    break;
                default:
                    z10 = ((t2.g) obj2).f14608c;
                    break;
            }
            int i15 = iAbs + (z10 == z11 ? 0 : 1);
            if (obj == null || i13 > i15) {
                obj = obj2;
                i13 = i15;
            }
        }
        return obj;
    }

    public final void A(float f10) {
        ((ArrayList) this.f8599b).add(new i1.t(f10));
    }

    public final void B(float f10, float f11) {
        ((ArrayList) this.f8599b).add(new i1.m(f10, f11));
    }

    public final void C(float f10, float f11) {
        ((ArrayList) this.f8599b).add(new i1.u(f10, f11));
    }

    public final void D(float f10, float f11) {
        ((ArrayList) this.f8599b).add(new i1.n(f10, f11));
    }

    public final o1.f E(o1.w wVar, b0 b0Var) {
        boolean z10;
        long j10;
        long j11;
        f fVar;
        f fVar2 = this;
        List list = wVar.f12430a;
        q.l lVar = new q.l(list.size());
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            x xVar = (x) list.get(i10);
            o1.v vVar = (o1.v) ((q.l) fVar2.f8599b).c(xVar.f12432a);
            if (vVar == null) {
                j11 = xVar.f12433b;
                j10 = xVar.f12435d;
                z10 = false;
            } else {
                long jA = ((u1.w) b0Var).A(vVar.f12428b);
                long j12 = vVar.f12427a;
                z10 = vVar.f12429c;
                j10 = jA;
                j11 = j12;
            }
            long j13 = xVar.f12432a;
            List list2 = list;
            int i11 = size;
            lVar.f(new o1.u(j13, xVar.f12433b, xVar.f12435d, xVar.f12436e, xVar.f12437f, j11, j10, z10, xVar.f12438g, xVar.f12440i, xVar.f12441j, xVar.f12442k), j13);
            boolean z11 = xVar.f12436e;
            long j14 = xVar.f12432a;
            if (z11) {
                fVar = this;
                ((q.l) fVar.f8599b).f(new o1.v(xVar.f12433b, xVar.f12434c, z11), j14);
            } else {
                fVar = this;
                q.l lVar2 = (q.l) fVar.f8599b;
                int iB = r.a.b(lVar2.f13000b, lVar2.f13002d, j14);
                if (iB >= 0) {
                    Object[] objArr = lVar2.f13001c;
                    Object obj = objArr[iB];
                    Object obj2 = q.m.f13003a;
                    if (obj != obj2) {
                        objArr[iB] = obj2;
                        lVar2.f12999a = true;
                    }
                }
            }
            i10++;
            fVar2 = fVar;
            list = list2;
            size = i11;
        }
        return new o1.f(lVar, wVar);
    }

    public final long F() {
        return ((long) ((ByteBuffer) this.f8599b).getInt()) & 4294967295L;
    }

    public final void G(float f10, float f11, float f12, float f13) {
        ((ArrayList) this.f8599b).add(new i1.p(f10, f11, f12, f13));
    }

    public final void H(float f10, float f11, float f12, float f13) {
        ((ArrayList) this.f8599b).add(new i1.x(f10, f11, f12, f13));
    }

    public final void I(int i10) {
        Object obj = this.f8599b;
        ((ByteBuffer) obj).position(((ByteBuffer) obj).position() + i10);
    }

    public final void J(float f10) {
        ((ArrayList) this.f8599b).add(new a0(f10));
    }

    public final void K(float f10) {
        ((ArrayList) this.f8599b).add(new z(f10));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0017  */
    public final void M(r5 r5Var, int i10) {
        k6.i iVar = k6.i.f10094b;
        if (i10 == -20) {
            iVar = k6.i.f10099n;
        } else if (i10 == -10) {
            iVar = k6.i.f10097e;
        } else if (i10 == 0) {
            iVar = k6.i.f10099n;
        } else if (i10 == 30) {
            iVar = k6.i.f10098f;
        }
        ((EnumMap) this.f8599b).put(r5Var, iVar);
    }

    public final void N(r5 r5Var, k6.i iVar) {
        ((EnumMap) this.f8599b).put(r5Var, iVar);
    }

    @Override // com.google.android.gms.common.internal.b
    public final void a(int i10) {
        ((com.google.android.gms.common.api.internal.e) this.f8599b).a(i10);
    }

    @Override // com.google.android.gms.common.api.internal.q
    public final void accept(Object obj, Object obj2) {
        com.google.android.gms.common.internal.t tVar = (com.google.android.gms.common.internal.t) this.f8599b;
        b6.a aVar = (b6.a) ((b6.c) obj).getService();
        Parcel parcelZaa = aVar.zaa();
        zac.zac(parcelZaa, tVar);
        aVar.zad(1, parcelZaa);
        ((TaskCompletionSource) obj2).setResult(null);
    }

    @Override // com.google.android.gms.common.internal.c
    public final void b(z5.b bVar) {
        ((com.google.android.gms.common.api.internal.n) this.f8599b).b(bVar);
    }

    @Override // k.r
    public final void c(l lVar, boolean z10) {
        if (lVar instanceof w) {
            lVar.j().c(false);
        }
        r rVar = ((l.k) this.f8599b).f10805e;
        if (rVar != null) {
            rVar.c(lVar, z10);
        }
    }

    @Override // l.p1
    public final void d(l lVar, m mVar) {
        ((h) this.f8599b).f8608n.removeCallbacksAndMessages(null);
        int size = ((h) this.f8599b).f8610p.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (lVar == ((g) ((h) this.f8599b).f8610p.get(i10)).f8601b) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        int i11 = i10 + 1;
        ((h) this.f8599b).f8608n.postAtTime(new e(this, i11 < ((h) this.f8599b).f8610p.size() ? (g) ((h) this.f8599b).f8610p.get(i11) : null, mVar, lVar, 0), lVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // l.h0
    public void e(int i10) {
    }

    @Override // l.p1
    public final void f(l lVar, MenuItem menuItem) {
        ((h) this.f8599b).f8608n.removeCallbacksAndMessages(lVar);
    }

    @Override // k.j
    public final boolean g(MenuItem menuItem) {
        l.n nVar = ((ActionMenuView) this.f8599b).G;
        return nVar != null && ((b3) nVar).f10713a.N.a(menuItem);
    }

    @Override // dagger.hilt.android.internal.managers.ComponentSupplier
    public final Object get() {
        f fVar = new f();
        ApplicationContextModule applicationContextModule = new ApplicationContextModule((y4.r) this.f8599b);
        fVar.f8599b = applicationContextModule;
        return new y4.n(applicationContextModule);
    }

    @Override // k.r
    public final boolean h(l lVar) {
        Object obj = this.f8599b;
        if (lVar == ((l.k) obj).f10803c) {
            return false;
        }
        ((w) lVar).f8707w.getClass();
        ((l.k) obj).getClass();
        r rVar = ((l.k) this.f8599b).f10805e;
        if (rVar != null) {
            return rVar.h(lVar);
        }
        return false;
    }

    @Override // y3.d
    public final void i() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // com.google.android.gms.common.internal.d
    public final void j(z5.b bVar) {
        if (bVar.f17241b == 0) {
            com.google.android.gms.common.internal.f fVar = (com.google.android.gms.common.internal.f) this.f8599b;
            fVar.getRemoteService(null, fVar.getScopes());
        } else if (((com.google.android.gms.common.internal.f) this.f8599b).zzx != null) {
            ((com.google.android.gms.common.internal.f) this.f8599b).zzx.b(bVar);
        }
    }

    @Override // y3.d
    public final void k(int i10, Object obj) {
        String str;
        switch (i10) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i10 == 6 || i10 == 7 || i10 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f8599b).setResultCode(i10);
    }

    @Override // l.h0
    public void l(int i10) {
    }

    @Override // k.j
    public final void m(l lVar) {
        j jVar = ((ActionMenuView) this.f8599b).B;
        if (jVar != null) {
            jVar.m(lVar);
        }
    }

    @Override // com.google.android.gms.common.internal.b
    public final void n(Bundle bundle) {
        ((com.google.android.gms.common.api.internal.e) this.f8599b).j();
    }

    public final void o(float f10, float f11, boolean z10, float f12, float f13) {
        ((ArrayList) this.f8599b).add(new i1.r(f10, f11, 0.0f, false, z10, f12, f13));
    }

    public final void p() {
        ((ArrayList) this.f8599b).add(i1.j.f7840c);
    }

    public Typeface q(Context context, t2.f fVar, Resources resources, int i10) {
        long jLongValue;
        t2.g gVar = (t2.g) w(fVar.f14605a, i10, new x9.v(1));
        if (gVar == null) {
            return null;
        }
        int i11 = gVar.f14611f;
        String str = gVar.f14606a;
        Typeface typefaceT = u2.f.f15400a.t(context, resources, i11, str, i10);
        if (typefaceT != null) {
            u2.f.f15401b.put(u2.f.b(resources, i11, str, 0, i10), typefaceT);
        }
        if (typefaceT == null) {
            jLongValue = 0;
        } else {
            try {
                Field declaredField = Typeface.class.getDeclaredField("native_instance");
                declaredField.setAccessible(true);
                jLongValue = ((Number) declaredField.get(typefaceT)).longValue();
            } catch (IllegalAccessException e4) {
                Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e4);
                jLongValue = 0;
            } catch (NoSuchFieldException e10) {
                Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e10);
                jLongValue = 0;
            }
        }
        if (jLongValue != 0) {
            ((ConcurrentHashMap) this.f8599b).put(Long.valueOf(jLongValue), fVar);
        }
        return typefaceT;
    }

    public Typeface r(Context context, y2.h[] hVarArr, int i10) throws Throwable {
        InputStream inputStreamOpenInputStream;
        InputStream inputStream = null;
        if (hVarArr.length < 1) {
            return null;
        }
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(x(i10, hVarArr).f16865a);
            try {
                Typeface typefaceS = s(context, inputStreamOpenInputStream);
                i1.b.g(inputStreamOpenInputStream);
                return typefaceS;
            } catch (IOException unused) {
                i1.b.g(inputStreamOpenInputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream = inputStreamOpenInputStream;
                i1.b.g(inputStream);
                throw th;
            }
        } catch (IOException unused2) {
            inputStreamOpenInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public Typeface s(Context context, InputStream inputStream) {
        File fileS = i1.b.s(context);
        if (fileS == null) {
            return null;
        }
        try {
            if (i1.b.k(fileS, inputStream)) {
                return Typeface.createFromFile(fileS.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileS.delete();
        }
    }

    public Typeface t(Context context, Resources resources, int i10, String str, int i11) {
        File fileS = i1.b.s(context);
        if (fileS == null) {
            return null;
        }
        try {
            if (i1.b.j(fileS, resources, i10)) {
                return Typeface.createFromFile(fileS.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileS.delete();
        }
    }

    public final String toString() {
        switch (this.f8598a) {
            case 28:
                StringBuilder sb = new StringBuilder("1");
                for (r5 r5Var : r5.values()) {
                    k6.i iVar = (k6.i) ((EnumMap) this.f8599b).get(r5Var);
                    if (iVar == null) {
                        iVar = k6.i.f10094b;
                    }
                    sb.append(iVar.f10103a);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public final void u(float f10, float f11, float f12, float f13, float f14, float f15) {
        ((ArrayList) this.f8599b).add(new i1.k(f10, f11, f12, f13, f14, f15));
    }

    public final void v(float f10, float f11, float f12, float f13, float f14, float f15) {
        ((ArrayList) this.f8599b).add(new i1.s(f10, f11, f12, f13, f14, f15));
    }

    public y2.h x(int i10, y2.h[] hVarArr) {
        return (y2.h) w(hVarArr, i10, new x9.v(0));
    }

    public final e1.d y() {
        return (e1.d) this.f8599b;
    }

    public final void z(float f10) {
        ((ArrayList) this.f8599b).add(new i1.l(f10));
    }

    public /* synthetic */ f(Object obj, int i10) {
        this.f8598a = i10;
        this.f8599b = obj;
    }

    public f(l.a0 a0Var) {
        this.f8598a = 9;
        this.f8599b = a0Var;
    }

    public f(s4 s4Var) {
        this.f8598a = 29;
        f6.a.x(s4Var);
        this.f8599b = s4Var;
    }

    public f(EnumMap enumMap) {
        this.f8598a = 28;
        EnumMap enumMap2 = new EnumMap(r5.class);
        this.f8599b = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public f(int i10) {
        this.f8598a = i10;
        if (i10 == 7) {
            this.f8599b = new ArrayList(32);
            return;
        }
        Object obj = null;
        if (i10 == 8) {
            this.f8599b = new q.l(obj);
            return;
        }
        if (i10 == 10) {
            this.f8599b = new ConcurrentHashMap();
            return;
        }
        if (i10 == 12) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30) {
                this.f8599b = new k1();
                return;
            } else if (i11 >= 29) {
                this.f8599b = new j1();
                return;
            } else {
                this.f8599b = new i1();
                return;
            }
        }
        if (i10 != 21) {
            if (i10 == 23) {
                this.f8599b = null;
            } else if (i10 != 28) {
                this.f8599b = new e1.d();
            } else {
                this.f8599b = new EnumMap(r5.class);
            }
        }
    }

    public f(View view, int i10) {
        this.f8598a = i10;
        if (i10 == 20) {
            this.f8599b = view.getOverlay();
        } else {
            if (Build.VERSION.SDK_INT >= 30) {
                b3.x xVar = new b3.x(view);
                xVar.f2687b = view;
                this.f8599b = xVar;
                return;
            }
            this.f8599b = new b3.v(view);
        }
    }

    public f(TextView textView) {
        this.f8598a = 17;
        if (textView != null) {
            this.f8599b = new k3.h(textView);
            return;
        }
        throw new NullPointerException("textView cannot be null");
    }

    public f(ByteBuffer byteBuffer) {
        this.f8598a = 16;
        this.f8599b = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }
}
