package o7;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.material3.MinimumInteractiveModifier;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import k0.c5;
import m0.m3;
import m0.o3;
import m0.w2;

/* JADX INFO: loaded from: classes.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile e8.p1 f12572a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile e8.p1 f12573b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile e8.p1 f12574c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile e8.p1 f12575d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile e8.p1 f12576e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f12577f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Method f12578g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static i1.f f12579h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static i1.f f12580i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static i1.f f12581j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static i1.f f12582k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static i1.f f12583l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static i1.f f12584m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static i1.f f12585n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static i1.f f12586o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static i1.f f12587p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static i1.f f12588q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static i1.f f12589r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static i1.f f12590s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static i1.f f12591t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static i1.f f12592u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static i1.f f12593v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static i1.f f12594w;

    public static final i1.f A() {
        i1.f fVar = f12582k;
        if (fVar != null) {
            return fVar;
        }
        i1.e eVar = new i1.e("Filled.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = i1.h0.f7832a;
        e1.n0 n0Var = new e1.n0(e1.r.f5060b);
        k.f fVar2 = new k.f(7);
        fVar2.D(9.0f, 16.17f);
        fVar2.B(4.83f, 12.0f);
        fVar2.C(-1.42f, 1.41f);
        fVar2.B(9.0f, 19.0f);
        fVar2.B(21.0f, 7.0f);
        fVar2.C(-1.41f, -1.41f);
        fVar2.p();
        i1.e.a(eVar, (ArrayList) fVar2.f8599b, n0Var);
        i1.f fVarB = eVar.b();
        f12582k = fVarB;
        return fVarB;
    }

    public static final i1.f B() {
        i1.f fVar = f12584m;
        if (fVar != null) {
            return fVar;
        }
        i1.e eVar = new i1.e("Filled.Download", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = i1.h0.f7832a;
        e1.n0 n0Var = new e1.n0(e1.r.f5060b);
        k.f fVar2 = new k.f(7);
        fVar2.D(5.0f, 20.0f);
        fVar2.A(14.0f);
        fVar2.K(-2.0f);
        fVar2.z(5.0f);
        fVar2.J(20.0f);
        fVar2.p();
        fVar2.D(19.0f, 9.0f);
        fVar2.A(-4.0f);
        fVar2.J(3.0f);
        fVar2.z(9.0f);
        fVar2.K(6.0f);
        fVar2.z(5.0f);
        fVar2.C(7.0f, 7.0f);
        fVar2.B(19.0f, 9.0f);
        fVar2.p();
        i1.e.a(eVar, (ArrayList) fVar2.f8599b, n0Var);
        i1.f fVarB = eVar.b();
        f12584m = fVarB;
        return fVarB;
    }

    public static Drawable C(Context context, int i10) {
        return l.w1.c().e(context, i10);
    }

    public static Set D() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", new Class[0]).invoke(null, new Object[0]);
            if (objInvoke == null) {
                return Collections.emptySet();
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.emptySet();
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.emptySet();
        }
    }

    public static final i1.f E() {
        i1.f fVar = f12587p;
        if (fVar != null) {
            return fVar;
        }
        i1.e eVar = new i1.e("Filled.Layers", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = i1.h0.f7832a;
        e1.n0 n0Var = new e1.n0(e1.r.f5060b);
        k.f fVar2 = new k.f(7);
        fVar2.D(11.99f, 18.54f);
        fVar2.C(-7.37f, -5.73f);
        fVar2.B(3.0f, 14.07f);
        fVar2.C(9.0f, 7.0f);
        fVar2.C(9.0f, -7.0f);
        fVar2.C(-1.63f, -1.27f);
        fVar2.C(-7.38f, 5.74f);
        fVar2.p();
        fVar2.D(12.0f, 16.0f);
        fVar2.C(7.36f, -5.73f);
        fVar2.B(21.0f, 9.0f);
        fVar2.C(-9.0f, -7.0f);
        fVar2.C(-9.0f, 7.0f);
        fVar2.C(1.63f, 1.27f);
        fVar2.B(12.0f, 16.0f);
        fVar2.p();
        i1.e.a(eVar, (ArrayList) fVar2.f8599b, n0Var);
        i1.f fVarB = eVar.b();
        f12587p = fVarB;
        return fVarB;
    }

    public static final i1.f G() {
        i1.f fVar = f12593v;
        if (fVar != null) {
            return fVar;
        }
        i1.e eVar = new i1.e("Filled.Verified", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = i1.h0.f7832a;
        e1.n0 n0Var = new e1.n0(e1.r.f5060b);
        k.f fVar2 = new k.f(7);
        fVar2.D(23.0f, 12.0f);
        fVar2.C(-2.44f, -2.79f);
        fVar2.C(0.34f, -3.69f);
        fVar2.C(-3.61f, -0.82f);
        fVar2.B(15.4f, 1.5f);
        fVar2.B(12.0f, 2.96f);
        fVar2.B(8.6f, 1.5f);
        fVar2.B(6.71f, 4.69f);
        fVar2.B(3.1f, 5.5f);
        fVar2.B(3.44f, 9.2f);
        fVar2.B(1.0f, 12.0f);
        fVar2.C(2.44f, 2.79f);
        fVar2.C(-0.34f, 3.7f);
        fVar2.C(3.61f, 0.82f);
        fVar2.B(8.6f, 22.5f);
        fVar2.C(3.4f, -1.47f);
        fVar2.C(3.4f, 1.46f);
        fVar2.C(1.89f, -3.19f);
        fVar2.C(3.61f, -0.82f);
        fVar2.C(-0.34f, -3.69f);
        fVar2.B(23.0f, 12.0f);
        fVar2.p();
        fVar2.D(10.09f, 16.72f);
        fVar2.C(-3.8f, -3.81f);
        fVar2.C(1.48f, -1.48f);
        fVar2.C(2.32f, 2.33f);
        fVar2.C(5.85f, -5.87f);
        fVar2.C(1.48f, 1.48f);
        fVar2.B(10.09f, 16.72f);
        fVar2.p();
        i1.e.a(eVar, (ArrayList) fVar2.f8599b, n0Var);
        i1.f fVarB = eVar.b();
        f12593v = fVarB;
        return fVarB;
    }

    public static final i1.f H() {
        i1.f fVar = f12594w;
        if (fVar != null) {
            return fVar;
        }
        i1.e eVar = new i1.e("Filled.Warning", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = i1.h0.f7832a;
        e1.n0 n0Var = new e1.n0(e1.r.f5060b);
        k.f fVar2 = new k.f(7);
        fVar2.D(1.0f, 21.0f);
        fVar2.A(22.0f);
        fVar2.B(12.0f, 2.0f);
        fVar2.B(1.0f, 21.0f);
        fVar2.p();
        fVar2.D(13.0f, 18.0f);
        fVar2.A(-2.0f);
        fVar2.K(-2.0f);
        fVar2.A(2.0f);
        fVar2.K(2.0f);
        fVar2.p();
        fVar2.D(13.0f, 14.0f);
        fVar2.A(-2.0f);
        fVar2.K(-4.0f);
        fVar2.A(2.0f);
        fVar2.K(4.0f);
        fVar2.p();
        i1.e.a(eVar, (ArrayList) fVar2.f8599b, n0Var);
        i1.f fVarB = eVar.b();
        f12594w = fVarB;
        return fVarB;
    }

    public static final int M(q.g gVar, Object obj, int i10) {
        d7.a.m(gVar, "<this>");
        int i11 = gVar.f12992c;
        if (i11 == 0) {
            return -1;
        }
        try {
            int iA = r.a.a(gVar.f12992c, i10, gVar.f12990a);
            if (iA < 0 || d7.a.d(obj, gVar.f12991b[iA])) {
                return iA;
            }
            int i12 = iA + 1;
            while (i12 < i11 && gVar.f12990a[i12] == i10) {
                if (d7.a.d(obj, gVar.f12991b[i12])) {
                    return i12;
                }
                i12++;
            }
            for (int i13 = iA - 1; i13 >= 0 && gVar.f12990a[i13] == i10; i13--) {
                if (d7.a.d(obj, gVar.f12991b[i13])) {
                    return i13;
                }
            }
            return ~i12;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final void N(Context context, File file) throws IllegalAccessException, IOException, InvocationTargetException {
        PackageInstaller packageInstaller = context.getPackageManager().getPackageInstaller();
        d7.a.l(packageInstaller, "getPackageInstaller(...)");
        PackageInstaller.SessionParams sessionParams = new PackageInstaller.SessionParams(1);
        sessionParams.setSize(file.length());
        int iCreateSession = packageInstaller.createSession(sessionParams);
        PackageInstaller.Session sessionOpenSession = packageInstaller.openSession(iCreateSession);
        d7.a.l(sessionOpenSession, "openSession(...)");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            OutputStream outputStreamOpenWrite = sessionOpenSession.openWrite("AutoAccept-update.apk", 0L, file.length());
            try {
                d7.a.j(outputStreamOpenWrite);
                z6.a.v(fileInputStream, outputStreamOpenWrite);
                sessionOpenSession.fsync(outputStreamOpenWrite);
                h6.g.e(outputStreamOpenWrite, null);
                h6.g.e(fileInputStream, null);
                Intent intent = new Intent(context, context.getClass());
                intent.setAction("com.auto.accept.INSTALL_COMPLETE");
                sessionOpenSession.commit(PendingIntent.getActivity(context, iCreateSession, intent, 167772160).getIntentSender());
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    h6.g.e(outputStreamOpenWrite, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                h6.g.e(fileInputStream, th3);
                throw th4;
            }
        }
    }

    public static final float[] O(float[] fArr) {
        float f10 = fArr[0];
        float f11 = fArr[3];
        float f12 = fArr[6];
        float f13 = fArr[1];
        float f14 = fArr[4];
        float f15 = fArr[7];
        float f16 = fArr[2];
        float f17 = fArr[5];
        float f18 = fArr[8];
        float f19 = (f14 * f18) - (f15 * f17);
        float f20 = (f15 * f16) - (f13 * f18);
        float f21 = (f13 * f17) - (f14 * f16);
        float f22 = (f12 * f21) + (f11 * f20) + (f10 * f19);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f19 / f22;
        fArr2[1] = f20 / f22;
        fArr2[2] = f21 / f22;
        fArr2[3] = ((f12 * f17) - (f11 * f18)) / f22;
        fArr2[4] = ((f18 * f10) - (f12 * f16)) / f22;
        fArr2[5] = ((f16 * f11) - (f17 * f10)) / f22;
        fArr2[6] = ((f11 * f15) - (f12 * f14)) / f22;
        fArr2[7] = ((f12 * f13) - (f15 * f10)) / f22;
        fArr2[8] = ((f10 * f14) - (f11 * f13)) / f22;
        return fArr2;
    }

    public static boolean P() {
        try {
            return la.g.f() && la.g.c() == 0;
        } catch (Exception unused) {
            return false;
        }
    }

    public static long R(int i10, byte[] bArr) {
        return ((long) (((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16))) & 4294967295L;
    }

    public static q6.m S(q6.m mVar) {
        if ((mVar instanceof q6.o) || (mVar instanceof q6.n)) {
            return mVar;
        }
        if (mVar instanceof Serializable) {
            return new q6.n(mVar);
        }
        q6.o oVar = new q6.o();
        mVar.getClass();
        oVar.f13218a = mVar;
        return oVar;
    }

    public static final float[] T(float[] fArr, float[] fArr2) {
        float f10 = fArr[0] * fArr2[0];
        float f11 = fArr[3];
        float f12 = fArr2[1];
        float f13 = fArr[6];
        float f14 = fArr2[2];
        float f15 = f13 * f14;
        float f16 = fArr[1];
        float f17 = fArr2[0];
        float f18 = fArr[4];
        float f19 = f12 * f18;
        float f20 = fArr[7];
        float f21 = f20 * f14;
        float f22 = fArr[2] * f17;
        float f23 = fArr[5];
        float f24 = (fArr2[1] * f23) + f22;
        float f25 = fArr[8];
        float f26 = fArr[0];
        float f27 = fArr2[3] * f26;
        float f28 = fArr2[4];
        float f29 = (f11 * f28) + f27;
        float f30 = fArr2[5];
        float f31 = fArr[1];
        float f32 = fArr2[3];
        float f33 = f18 * f28;
        float f34 = fArr[2];
        float f35 = f23 * fArr2[4];
        float f36 = f26 * fArr2[6];
        float f37 = fArr[3];
        float f38 = fArr2[7];
        float f39 = (f37 * f38) + f36;
        float f40 = fArr2[8];
        float f41 = fArr2[6];
        return new float[]{f15 + (f11 * f12) + f10, f21 + f19 + (f16 * f17), (f14 * f25) + f24, (f13 * f30) + f29, (f20 * f30) + f33 + (f31 * f32), (f30 * f25) + f35 + (f32 * f34), (f13 * f40) + f39, (f20 * f40) + (fArr[4] * f38) + (f31 * f41), (f25 * f40) + (fArr[5] * fArr2[7]) + (f34 * f41)};
    }

    public static final float[] U(float[] fArr, float[] fArr2) {
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        return new float[]{fArr[0] * fArr2[0], fArr[1] * fArr2[1], fArr[2] * fArr2[2], fArr2[3] * f10, fArr2[4] * f11, fArr2[5] * f12, f10 * fArr2[6], f11 * fArr2[7], f12 * fArr2[8]};
    }

    public static final void V(float[] fArr, float[] fArr2) {
        float f10 = fArr2[0];
        float f11 = fArr2[1];
        float f12 = fArr2[2];
        fArr2[0] = (fArr[6] * f12) + (fArr[3] * f11) + (fArr[0] * f10);
        fArr2[1] = (fArr[7] * f12) + (fArr[4] * f11) + (fArr[1] * f10);
        fArr2[2] = (fArr[8] * f12) + (fArr[5] * f11) + (fArr[2] * f10);
    }

    public static final float W(float[] fArr, float f10, float f11, float f12) {
        return (fArr[6] * f12) + (fArr[3] * f11) + (fArr[0] * f10);
    }

    public static final float X(float[] fArr, float f10, float f11, float f12) {
        return (fArr[7] * f12) + (fArr[4] * f11) + (fArr[1] * f10);
    }

    public static final float Y(float[] fArr, float f10, float f11, float f12) {
        return (fArr[8] * f12) + (fArr[5] * f11) + (fArr[2] * f10);
    }

    public static final m0.l1 Z(int i10) {
        int i11 = m0.b.f11457b;
        return new m0.l1(i10);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:103:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:104:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:107:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:109:0x02df  */
    /* JADX WARN: Code duplicated, block: B:112:0x0359  */
    /* JADX WARN: Code duplicated, block: B:114:0x0360  */
    /* JADX WARN: Code duplicated, block: B:115:0x0364  */
    /* JADX WARN: Code duplicated, block: B:118:0x0371  */
    /* JADX WARN: Code duplicated, block: B:120:0x037f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0471  */
    /* JADX WARN: Code duplicated, block: B:125:0x0498  */
    /* JADX WARN: Code duplicated, block: B:128:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:130:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:136:0x0518  */
    /* JADX WARN: Code duplicated, block: B:139:0x057a  */
    /* JADX WARN: Code duplicated, block: B:142:0x059d  */
    /* JADX WARN: Code duplicated, block: B:145:0x0628  */
    /* JADX WARN: Code duplicated, block: B:148:0x063e  */
    /* JADX WARN: Code duplicated, block: B:149:0x068e  */
    /* JADX WARN: Code duplicated, block: B:152:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:156:0x06e0  */
    /* JADX WARN: Code duplicated, block: B:159:0x06ee  */
    /* JADX WARN: Code duplicated, block: B:163:0x0729  */
    /* JADX WARN: Code duplicated, block: B:165:0x073b  */
    /* JADX WARN: Code duplicated, block: B:167:0x0740  */
    /* JADX WARN: Code duplicated, block: B:169:0x0745  */
    /* JADX WARN: Code duplicated, block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:65:0x00be  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:81:0x0111  */
    /* JADX WARN: Code duplicated, block: B:84:0x0125  */
    /* JADX WARN: Code duplicated, block: B:87:0x013f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0245  */
    /* JADX WARN: Code duplicated, block: B:92:0x024c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0250  */
    /* JADX WARN: Code duplicated, block: B:96:0x0263  */
    /* JADX WARN: Code duplicated, block: B:98:0x0271  */
    public static final void a(String str, String str2, String str3, boolean z10, c9.a aVar, m0.m mVar, int i10, int i11) {
        int i12;
        String str4;
        int i13;
        boolean z11;
        int i14;
        int i15;
        c9.a aVar2;
        int i16;
        int i17;
        String str5;
        boolean z12;
        c9.a aVar3;
        Context context;
        Object objP;
        k0.y0 y0Var;
        o3 o3Var;
        m0.g1 g1Var;
        Object objF;
        m0.d1 d1Var;
        Object objF2;
        m0.g1 g1Var2;
        Object objF3;
        Object objF4;
        t.k0 k0VarF;
        y0.l lVar;
        y0.g gVar;
        r1.j0 j0VarC;
        int i18;
        m0.r1 r1VarP;
        t1.j jVar;
        u0.b bVarI;
        boolean z13;
        t1.i iVar;
        t1.i iVar2;
        t1.i iVar3;
        FillElement fillElement;
        float f10;
        r1.j0 j0VarA;
        int i19;
        m0.r1 r1VarP2;
        u0.b bVarI2;
        long j10;
        String str6;
        r1.j0 j0VarC2;
        int i20;
        m0.r1 r1VarP3;
        u0.b bVarI3;
        float f11;
        float f12;
        float f13;
        long j11;
        float f14;
        String str7;
        m0.g1 g1Var3;
        m0.d1 d1Var2;
        boolean z14;
        Context context2;
        m0.q qVar;
        boolean z15;
        y0.l lVar2;
        float f15;
        int i21;
        Context context3;
        y0.l lVar3;
        m0.q qVar2;
        long j12;
        boolean z16;
        boolean z17;
        float f16;
        boolean z18;
        c9.a aVar4;
        m0.x1 x1VarX;
        d7.a.m(str, "downloadUrl");
        d7.a.m(str2, "pageUrl");
        m0.q qVar3 = (m0.q) mVar;
        qVar3.a0(1839348844);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (qVar3.g(str) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= qVar3.g(str2) ? 32 : 16;
        }
        int i22 = i11 & 4;
        if (i22 == 0) {
            if ((i10 & 896) == 0) {
                str4 = str3;
                i12 |= qVar3.g(str4) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 7168) == 0) {
                    z11 = z10;
                    if (qVar3.h(z11)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 16;
                if (i15 != 0) {
                    if ((57344 & i10) == 0) {
                        aVar2 = aVar;
                        if (qVar3.i(aVar2)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    i17 = i12;
                    if ((i17 & 46811) == 9362 || !qVar3.G()) {
                        if (i22 != 0) {
                            str5 = "";
                        } else {
                            str5 = str4;
                        }
                        if (i13 != 0) {
                            z12 = false;
                        } else {
                            z12 = z11;
                        }
                        if (i15 != 0) {
                            aVar3 = d5.v.f4796a;
                        } else {
                            aVar3 = aVar2;
                        }
                        context = (Context) qVar3.m(u1.y0.f15377b);
                        qVar3.Z(-1449374496);
                        objP = qVar3.P();
                        y0Var = m0.l.f11578a;
                        o3Var = o3.f11621a;
                        if (objP == y0Var) {
                            objP = d7.t.g0(Boolean.FALSE, o3Var);
                            qVar3.l0(objP);
                        }
                        g1Var = (m0.g1) objP;
                        objF = l.q.f(qVar3, false, -1449374433);
                        if (objF == y0Var) {
                            objF = m9.e0.H(0.0f);
                            qVar3.l0(objF);
                        }
                        d1Var = (m0.d1) objF;
                        objF2 = l.q.f(qVar3, false, -1449374368);
                        if (objF2 == y0Var) {
                            objF2 = d7.t.g0(Boolean.FALSE, o3Var);
                            qVar3.l0(objF2);
                        }
                        g1Var2 = (m0.g1) objF2;
                        objF3 = l.q.f(qVar3, false, -1449374311);
                        if (objF3 == y0Var) {
                            int i23 = m0.b.f11457b;
                            objF3 = new m0.m1(-1L);
                            qVar3.l0(objF3);
                        }
                        m0.f1 f1Var = (m0.f1) objF3;
                        objF4 = l.q.f(qVar3, false, -1449374248);
                        if (objF4 == y0Var) {
                            objF4 = d7.t.g0(null, o3Var);
                            qVar3.l0(objF4);
                        }
                        m0.g1 g1Var4 = (m0.g1) objF4;
                        qVar3.t(false);
                        k0VarF = t.e.f(t.e.q("pulse", qVar3, 0), 1.0f, 1.15f, t.e.p(t.e.s(800, 0, t.c0.f14096b, 2), 2, 4), "pulseScale", qVar3, 29112, 0);
                        w2 w2Var = (w2) f1Var;
                        m0.s.a(Long.valueOf(w2Var.d()), new y.r(context, f1Var, g1Var, g1Var2, d1Var, g1Var4, 1), qVar3);
                        m0.s.c(Boolean.valueOf(((Boolean) g1Var.getValue()).booleanValue()), Long.valueOf(w2Var.d()), new d5.x(context, g1Var, f1Var, d1Var, g1Var2, g1Var4, null), qVar3);
                        lVar = y0.l.f16729b;
                        y0.o oVarD = androidx.compose.foundation.a.d(androidx.compose.foundation.layout.c.f1668b, a4.q.n(d7.t.e0(new e1.r(androidx.compose.ui.graphics.a.c(4278520344L)), new e1.r(androidx.compose.ui.graphics.a.c(4278851904L)), new e1.r(androidx.compose.ui.graphics.a.c(4279180085L)), new e1.r(androidx.compose.ui.graphics.a.c(4278520344L)))), null, 6);
                        gVar = y0.a.f16710c;
                        qVar3.Z(733328855);
                        j0VarC = y.p.c(gVar, false, qVar3);
                        qVar3.Z(-1323940314);
                        i18 = qVar3.P;
                        r1VarP = qVar3.p();
                        t1.l.f14477k.getClass();
                        jVar = t1.k.f14458b;
                        bVarI = androidx.compose.ui.layout.a.i(oVarD);
                        z13 = qVar3.f11630a instanceof m0.d;
                        if (!z13) {
                            m9.e0.C();
                            throw null;
                        }
                        qVar3.c0();
                        if (qVar3.O) {
                            qVar3.o(jVar);
                        } else {
                            qVar3.o0();
                        }
                        iVar = t1.k.f14461e;
                        d7.t.s0(qVar3, j0VarC, iVar);
                        iVar2 = t1.k.f14460d;
                        d7.t.s0(qVar3, r1VarP, iVar2);
                        iVar3 = t1.k.f14462f;
                        if (qVar3.O || !d7.a.d(qVar3.P(), Integer.valueOf(i18))) {
                            l.q.r(i18, qVar3, i18, iVar3);
                        }
                        l.q.s(0, bVarI, new m0.l2(qVar3), qVar3, 2058660585);
                        fillElement = androidx.compose.foundation.layout.c.f1667a;
                        f10 = 32;
                        y0.o oVarN = androidx.compose.foundation.layout.a.n(androidx.compose.foundation.a.n(fillElement, androidx.compose.foundation.a.l(qVar3)), f10, 0.0f, 2);
                        y0.e eVar = y0.a.f16716p;
                        qVar3.Z(-483455358);
                        j0VarA = y.u.a(y.k.f16607c, eVar, qVar3);
                        qVar3.Z(-1323940314);
                        i19 = qVar3.P;
                        r1VarP2 = qVar3.p();
                        bVarI2 = androidx.compose.ui.layout.a.i(oVarN);
                        if (!z13) {
                            m9.e0.C();
                            throw null;
                        }
                        qVar3.c0();
                        if (qVar3.O) {
                            qVar3.o(jVar);
                        } else {
                            qVar3.o0();
                        }
                        d7.t.s0(qVar3, j0VarA, iVar);
                        d7.t.s0(qVar3, r1VarP2, iVar2);
                        if (qVar3.O || !d7.a.d(qVar3.P(), Integer.valueOf(i19))) {
                            l.q.r(i19, qVar3, i19, iVar3);
                        }
                        l.q.s(0, bVarI2, new m0.l2(qVar3), qVar3, 2058660585);
                        y0.o oVarB = androidx.compose.ui.draw.a.b(androidx.compose.ui.draw.a.h(androidx.compose.foundation.layout.c.h(lVar, 100), ((Number) k0VarF.f14220d.getValue()).floatValue()), e0.f.f4988a);
                        j10 = e5.a.f5125a;
                        str6 = str5;
                        y0.o oVarD2 = androidx.compose.foundation.a.d(oVarB, a4.q.j(d7.t.e0(new e1.r(e1.r.b(j10, 0.3f)), new e1.r(e1.r.b(j10, 0.05f))), 0.0f, 14), null, 6);
                        qVar3.Z(733328855);
                        j0VarC2 = y.p.c(gVar, false, qVar3);
                        qVar3.Z(-1323940314);
                        i20 = qVar3.P;
                        r1VarP3 = qVar3.p();
                        bVarI3 = androidx.compose.ui.layout.a.i(oVarD2);
                        if (!z13) {
                            m9.e0.C();
                            throw null;
                        }
                        qVar3.c0();
                        if (qVar3.O) {
                            qVar3.o(jVar);
                        } else {
                            qVar3.o0();
                        }
                        d7.t.s0(qVar3, j0VarC2, iVar);
                        d7.t.s0(qVar3, r1VarP3, iVar2);
                        if (qVar3.O || !d7.a.d(qVar3.P(), Integer.valueOf(i20))) {
                            l.q.r(i20, qVar3, i20, iVar3);
                        }
                        bVarI3.e(new m0.l2(qVar3), qVar3, 0);
                        qVar3.Z(2058660585);
                        f11 = 48;
                        k0.e1.b(z6.a.K(), "Update", androidx.compose.foundation.layout.c.h(lVar, f11), j10, qVar3, 3504, 0);
                        l.q.v(qVar3, false, true, false, false);
                        c5.b("Update Required", null, e5.a.f5136l, l.q.d(lVar, f10, qVar3, 26), null, f2.l.f6118f, null, 0L, null, new l2.i(3), 0L, 0, false, 0, 0, null, null, qVar3, 200070, 0, 130514);
                        f12 = 12;
                        long jD = l.q.d(lVar, f12, qVar3, 14);
                        long j13 = e5.a.f5137m;
                        c5.b("A new version of Ride Accepter is available.\nPlease update to continue using the app.", null, j13, jD, null, null, null, 0L, null, new l2.i(3), o1.s.N(22), 0, false, 0, 0, null, null, qVar3, 3462, 6, 129522);
                        f13 = 8;
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f13), qVar3);
                        j11 = e5.a.f5132h;
                        f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d5.p.f4710a, qVar3, 196614, 24);
                        f14 = 16;
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f14), qVar3);
                        qVar3.Z(991122215);
                        if (str6.length() > 0) {
                            str7 = str6;
                            f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d7.t.K(qVar3, -1266085629, new d5.b(str7, 2)), qVar3, 196614, 24);
                        } else {
                            str7 = str6;
                        }
                        qVar3.t(false);
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, 24), qVar3);
                        qVar3.Z(991123350);
                        if (!((Boolean) g1Var.getValue()).booleanValue() || ((Boolean) g1Var2.getValue()).booleanValue()) {
                            g1Var3 = g1Var2;
                            d1Var2 = d1Var;
                            f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d7.t.K(qVar3, -1306056660, new u.l1(5, g1Var2, d1Var)), qVar3, 196614, 24);
                            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f14), qVar3);
                        } else {
                            g1Var3 = g1Var2;
                            d1Var2 = d1Var;
                        }
                        z14 = false;
                        qVar3.t(false);
                        qVar3.Z(991125275);
                        if (((Boolean) g1Var3.getValue()).booleanValue() || ((File) g1Var4.getValue()) == null) {
                            context2 = context;
                            qVar = qVar3;
                            z15 = true;
                            lVar2 = lVar;
                            f15 = f12;
                            i21 = 52;
                        } else {
                            y0.o oVarC = androidx.compose.foundation.layout.c.c(fillElement, 52);
                            y.u0 u0Var = k0.z.f9683a;
                            k0.y yVarA = k0.z.a(e5.a.f5139o, 0L, qVar3, 14);
                            lVar2 = lVar;
                            context2 = context;
                            z14 = false;
                            z15 = true;
                            i21 = 52;
                            m9.e0.d(new c5.p(context, g1Var4, 1), oVarC, false, e0.f.a(14), yVarA, null, null, null, null, d5.p.f4711b, qVar3, 805306416, 484);
                            f15 = f12;
                            qVar = qVar3;
                            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar2, f15), qVar);
                        }
                        qVar.t(z14);
                        qVar.Z(991126226);
                        if (!((Boolean) g1Var3.getValue()).booleanValue() || str.length() <= 0) {
                            context3 = context2;
                            lVar3 = lVar2;
                            qVar2 = qVar;
                            j12 = r43;
                            z16 = z14;
                        } else {
                            y0.o oVarC2 = androidx.compose.foundation.layout.c.c(fillElement, i21);
                            y.u0 u0Var2 = k0.z.f9683a;
                            context3 = context2;
                            y0.l lVar4 = lVar2;
                            z16 = false;
                            j12 = j10;
                            m0.q qVar4 = qVar;
                            m9.e0.d(new o2.f(context3, str, g1Var, d1Var2, f1Var), oVarC2, !((Boolean) g1Var.getValue()).booleanValue(), e0.f.a(14), k0.z.a(j10, e1.r.b(j10, 0.5f), qVar, 10), null, null, null, null, d7.t.K(qVar, 599527212, new s.h(g1Var, 8)), qVar4, 805306416, 480);
                            lVar3 = lVar4;
                            qVar2 = qVar4;
                            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar3, f15), qVar2);
                        }
                        qVar2.t(z16);
                        qVar2.Z(991128322);
                        if (str2.length() > 0) {
                            m9.e0.g(new u.r0(17, str2, context3), androidx.compose.foundation.layout.c.c(fillElement, f11), false, e0.f.a(14), null, null, new u.w(k0.z.f(qVar2).f14967a, a4.q.i(d7.t.e0(new e1.r(j12), new e1.r(e5.a.f5128d)))), null, null, d5.p.f4712c, qVar2, 805306416, 436);
                            z17 = false;
                        } else {
                            z17 = z16;
                        }
                        qVar2.t(z17);
                        qVar2.Z(991129516);
                        if (str.length() == 0 || str2.length() != 0) {
                            f16 = f13;
                        } else {
                            f16 = f13;
                            c5.b("Please contact the administrator for the update.", null, j13, l.q.d(lVar3, f16, qVar2, 13), null, null, null, 0L, null, new l2.i(3), 0L, 0, false, 0, 0, null, null, qVar2, 3462, 0, 130546);
                        }
                        qVar2.t(false);
                        qVar2.Z(-723979200);
                        if (z12) {
                            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar3, f16), qVar2);
                            m9.e0.j(aVar3, fillElement, false, null, null, null, null, null, null, d5.p.f4713d, qVar2, ((i17 >> 12) & 14) | 805306416, 508);
                        }
                        l.q.v(qVar2, false, false, true, false);
                        l.q.v(qVar2, false, false, true, false);
                        qVar2.t(false);
                        z18 = z12;
                        aVar4 = aVar3;
                    } else {
                        qVar3.U();
                        qVar2 = qVar3;
                        str7 = str4;
                        z18 = z11;
                        aVar4 = aVar2;
                    }
                    x1VarX = qVar2.x();
                    if (x1VarX != null) {
                        x1VarX.f11756d = new d5.y(str, str2, str7, z18, aVar4, i10, i11);
                    }
                }
                i12 |= 24576;
                aVar2 = aVar;
                i17 = i12;
                if ((i17 & 46811) == 9362) {
                    if (i22 != 0) {
                        str5 = "";
                    } else {
                        str5 = str4;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        aVar3 = d5.v.f4796a;
                    } else {
                        aVar3 = aVar2;
                    }
                    context = (Context) qVar3.m(u1.y0.f15377b);
                    qVar3.Z(-1449374496);
                    objP = qVar3.P();
                    y0Var = m0.l.f11578a;
                    o3Var = o3.f11621a;
                    if (objP == y0Var) {
                        objP = d7.t.g0(Boolean.FALSE, o3Var);
                        qVar3.l0(objP);
                    }
                    g1Var = (m0.g1) objP;
                    objF = l.q.f(qVar3, false, -1449374433);
                    if (objF == y0Var) {
                        objF = m9.e0.H(0.0f);
                        qVar3.l0(objF);
                    }
                    d1Var = (m0.d1) objF;
                    objF2 = l.q.f(qVar3, false, -1449374368);
                    if (objF2 == y0Var) {
                        objF2 = d7.t.g0(Boolean.FALSE, o3Var);
                        qVar3.l0(objF2);
                    }
                    g1Var2 = (m0.g1) objF2;
                    objF3 = l.q.f(qVar3, false, -1449374311);
                    if (objF3 == y0Var) {
                        int i24 = m0.b.f11457b;
                        objF3 = new m0.m1(-1L);
                        qVar3.l0(objF3);
                    }
                    m0.f1 f1Var2 = (m0.f1) objF3;
                    objF4 = l.q.f(qVar3, false, -1449374248);
                    if (objF4 == y0Var) {
                        objF4 = d7.t.g0(null, o3Var);
                        qVar3.l0(objF4);
                    }
                    m0.g1 g1Var5 = (m0.g1) objF4;
                    qVar3.t(false);
                    k0VarF = t.e.f(t.e.q("pulse", qVar3, 0), 1.0f, 1.15f, t.e.p(t.e.s(800, 0, t.c0.f14096b, 2), 2, 4), "pulseScale", qVar3, 29112, 0);
                    w2 w2Var2 = (w2) f1Var2;
                    m0.s.a(Long.valueOf(w2Var2.d()), new y.r(context, f1Var2, g1Var, g1Var2, d1Var, g1Var5, 1), qVar3);
                    m0.s.c(Boolean.valueOf(((Boolean) g1Var.getValue()).booleanValue()), Long.valueOf(w2Var2.d()), new d5.x(context, g1Var, f1Var2, d1Var, g1Var2, g1Var5, null), qVar3);
                    lVar = y0.l.f16729b;
                    y0.o oVarD3 = androidx.compose.foundation.a.d(androidx.compose.foundation.layout.c.f1668b, a4.q.n(d7.t.e0(new e1.r(androidx.compose.ui.graphics.a.c(4278520344L)), new e1.r(androidx.compose.ui.graphics.a.c(4278851904L)), new e1.r(androidx.compose.ui.graphics.a.c(4279180085L)), new e1.r(androidx.compose.ui.graphics.a.c(4278520344L)))), null, 6);
                    gVar = y0.a.f16710c;
                    qVar3.Z(733328855);
                    j0VarC = y.p.c(gVar, false, qVar3);
                    qVar3.Z(-1323940314);
                    i18 = qVar3.P;
                    r1VarP = qVar3.p();
                    t1.l.f14477k.getClass();
                    jVar = t1.k.f14458b;
                    bVarI = androidx.compose.ui.layout.a.i(oVarD3);
                    z13 = qVar3.f11630a instanceof m0.d;
                    if (!z13) {
                        m9.e0.C();
                        throw null;
                    }
                    qVar3.c0();
                    if (qVar3.O) {
                        qVar3.o(jVar);
                    } else {
                        qVar3.o0();
                    }
                    iVar = t1.k.f14461e;
                    d7.t.s0(qVar3, j0VarC, iVar);
                    iVar2 = t1.k.f14460d;
                    d7.t.s0(qVar3, r1VarP, iVar2);
                    iVar3 = t1.k.f14462f;
                    if (qVar3.O) {
                        l.q.r(i18, qVar3, i18, iVar3);
                    } else {
                        l.q.r(i18, qVar3, i18, iVar3);
                    }
                    l.q.s(0, bVarI, new m0.l2(qVar3), qVar3, 2058660585);
                    fillElement = androidx.compose.foundation.layout.c.f1667a;
                    f10 = 32;
                    y0.o oVarN2 = androidx.compose.foundation.layout.a.n(androidx.compose.foundation.a.n(fillElement, androidx.compose.foundation.a.l(qVar3)), f10, 0.0f, 2);
                    y0.e eVar2 = y0.a.f16716p;
                    qVar3.Z(-483455358);
                    j0VarA = y.u.a(y.k.f16607c, eVar2, qVar3);
                    qVar3.Z(-1323940314);
                    i19 = qVar3.P;
                    r1VarP2 = qVar3.p();
                    bVarI2 = androidx.compose.ui.layout.a.i(oVarN2);
                    if (!z13) {
                        m9.e0.C();
                        throw null;
                    }
                    qVar3.c0();
                    if (qVar3.O) {
                        qVar3.o(jVar);
                    } else {
                        qVar3.o0();
                    }
                    d7.t.s0(qVar3, j0VarA, iVar);
                    d7.t.s0(qVar3, r1VarP2, iVar2);
                    if (qVar3.O) {
                        l.q.r(i19, qVar3, i19, iVar3);
                    } else {
                        l.q.r(i19, qVar3, i19, iVar3);
                    }
                    l.q.s(0, bVarI2, new m0.l2(qVar3), qVar3, 2058660585);
                    y0.o oVarB2 = androidx.compose.ui.draw.a.b(androidx.compose.ui.draw.a.h(androidx.compose.foundation.layout.c.h(lVar, 100), ((Number) k0VarF.f14220d.getValue()).floatValue()), e0.f.f4988a);
                    j10 = e5.a.f5125a;
                    str6 = str5;
                    y0.o oVarD4 = androidx.compose.foundation.a.d(oVarB2, a4.q.j(d7.t.e0(new e1.r(e1.r.b(j10, 0.3f)), new e1.r(e1.r.b(j10, 0.05f))), 0.0f, 14), null, 6);
                    qVar3.Z(733328855);
                    j0VarC2 = y.p.c(gVar, false, qVar3);
                    qVar3.Z(-1323940314);
                    i20 = qVar3.P;
                    r1VarP3 = qVar3.p();
                    bVarI3 = androidx.compose.ui.layout.a.i(oVarD4);
                    if (!z13) {
                        m9.e0.C();
                        throw null;
                    }
                    qVar3.c0();
                    if (qVar3.O) {
                        qVar3.o(jVar);
                    } else {
                        qVar3.o0();
                    }
                    d7.t.s0(qVar3, j0VarC2, iVar);
                    d7.t.s0(qVar3, r1VarP3, iVar2);
                    if (qVar3.O) {
                        l.q.r(i20, qVar3, i20, iVar3);
                    } else {
                        l.q.r(i20, qVar3, i20, iVar3);
                    }
                    bVarI3.e(new m0.l2(qVar3), qVar3, 0);
                    qVar3.Z(2058660585);
                    f11 = 48;
                    k0.e1.b(z6.a.K(), "Update", androidx.compose.foundation.layout.c.h(lVar, f11), j10, qVar3, 3504, 0);
                    l.q.v(qVar3, false, true, false, false);
                    c5.b("Update Required", null, e5.a.f5136l, l.q.d(lVar, f10, qVar3, 26), null, f2.l.f6118f, null, 0L, null, new l2.i(3), 0L, 0, false, 0, 0, null, null, qVar3, 200070, 0, 130514);
                    f12 = 12;
                    long jD2 = l.q.d(lVar, f12, qVar3, 14);
                    long j14 = e5.a.f5137m;
                    c5.b("A new version of Ride Accepter is available.\nPlease update to continue using the app.", null, j14, jD2, null, null, null, 0L, null, new l2.i(3), o1.s.N(22), 0, false, 0, 0, null, null, qVar3, 3462, 6, 129522);
                    f13 = 8;
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f13), qVar3);
                    j11 = e5.a.f5132h;
                    f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d5.p.f4710a, qVar3, 196614, 24);
                    f14 = 16;
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f14), qVar3);
                    qVar3.Z(991122215);
                    if (str6.length() > 0) {
                        str7 = str6;
                        f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d7.t.K(qVar3, -1266085629, new d5.b(str7, 2)), qVar3, 196614, 24);
                    } else {
                        str7 = str6;
                    }
                    qVar3.t(false);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, 24), qVar3);
                    qVar3.Z(991123350);
                    if (((Boolean) g1Var.getValue()).booleanValue()) {
                        g1Var3 = g1Var2;
                        d1Var2 = d1Var;
                        f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d7.t.K(qVar3, -1306056660, new u.l1(5, g1Var2, d1Var)), qVar3, 196614, 24);
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f14), qVar3);
                    } else {
                        g1Var3 = g1Var2;
                        d1Var2 = d1Var;
                        f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d7.t.K(qVar3, -1306056660, new u.l1(5, g1Var2, d1Var)), qVar3, 196614, 24);
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f14), qVar3);
                    }
                    z14 = false;
                    qVar3.t(false);
                    qVar3.Z(991125275);
                    if (((Boolean) g1Var3.getValue()).booleanValue()) {
                        context2 = context;
                        qVar = qVar3;
                        z15 = true;
                        lVar2 = lVar;
                        f15 = f12;
                        i21 = 52;
                    } else {
                        context2 = context;
                        qVar = qVar3;
                        z15 = true;
                        lVar2 = lVar;
                        f15 = f12;
                        i21 = 52;
                    }
                    qVar.t(z14);
                    qVar.Z(991126226);
                    if (((Boolean) g1Var3.getValue()).booleanValue()) {
                        context3 = context2;
                        lVar3 = lVar2;
                        qVar2 = qVar;
                        j12 = r43;
                        z16 = z14;
                    } else {
                        context3 = context2;
                        lVar3 = lVar2;
                        qVar2 = qVar;
                        j12 = r43;
                        z16 = z14;
                    }
                    qVar2.t(z16);
                    qVar2.Z(991128322);
                    if (str2.length() > 0) {
                        m9.e0.g(new u.r0(17, str2, context3), androidx.compose.foundation.layout.c.c(fillElement, f11), false, e0.f.a(14), null, null, new u.w(k0.z.f(qVar2).f14967a, a4.q.i(d7.t.e0(new e1.r(j12), new e1.r(e5.a.f5128d)))), null, null, d5.p.f4712c, qVar2, 805306416, 436);
                        z17 = false;
                    } else {
                        z17 = z16;
                    }
                    qVar2.t(z17);
                    qVar2.Z(991129516);
                    if (str.length() == 0) {
                        f16 = f13;
                    } else {
                        f16 = f13;
                    }
                    qVar2.t(false);
                    qVar2.Z(-723979200);
                    if (z12) {
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar3, f16), qVar2);
                        m9.e0.j(aVar3, fillElement, false, null, null, null, null, null, null, d5.p.f4713d, qVar2, ((i17 >> 12) & 14) | 805306416, 508);
                    }
                    l.q.v(qVar2, false, false, true, false);
                    l.q.v(qVar2, false, false, true, false);
                    qVar2.t(false);
                    z18 = z12;
                    aVar4 = aVar3;
                } else {
                    if (i22 != 0) {
                        str5 = "";
                    } else {
                        str5 = str4;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        aVar3 = d5.v.f4796a;
                    } else {
                        aVar3 = aVar2;
                    }
                    context = (Context) qVar3.m(u1.y0.f15377b);
                    qVar3.Z(-1449374496);
                    objP = qVar3.P();
                    y0Var = m0.l.f11578a;
                    o3Var = o3.f11621a;
                    if (objP == y0Var) {
                        objP = d7.t.g0(Boolean.FALSE, o3Var);
                        qVar3.l0(objP);
                    }
                    g1Var = (m0.g1) objP;
                    objF = l.q.f(qVar3, false, -1449374433);
                    if (objF == y0Var) {
                        objF = m9.e0.H(0.0f);
                        qVar3.l0(objF);
                    }
                    d1Var = (m0.d1) objF;
                    objF2 = l.q.f(qVar3, false, -1449374368);
                    if (objF2 == y0Var) {
                        objF2 = d7.t.g0(Boolean.FALSE, o3Var);
                        qVar3.l0(objF2);
                    }
                    g1Var2 = (m0.g1) objF2;
                    objF3 = l.q.f(qVar3, false, -1449374311);
                    if (objF3 == y0Var) {
                        int i25 = m0.b.f11457b;
                        objF3 = new m0.m1(-1L);
                        qVar3.l0(objF3);
                    }
                    m0.f1 f1Var3 = (m0.f1) objF3;
                    objF4 = l.q.f(qVar3, false, -1449374248);
                    if (objF4 == y0Var) {
                        objF4 = d7.t.g0(null, o3Var);
                        qVar3.l0(objF4);
                    }
                    m0.g1 g1Var6 = (m0.g1) objF4;
                    qVar3.t(false);
                    k0VarF = t.e.f(t.e.q("pulse", qVar3, 0), 1.0f, 1.15f, t.e.p(t.e.s(800, 0, t.c0.f14096b, 2), 2, 4), "pulseScale", qVar3, 29112, 0);
                    w2 w2Var3 = (w2) f1Var3;
                    m0.s.a(Long.valueOf(w2Var3.d()), new y.r(context, f1Var3, g1Var, g1Var2, d1Var, g1Var6, 1), qVar3);
                    m0.s.c(Boolean.valueOf(((Boolean) g1Var.getValue()).booleanValue()), Long.valueOf(w2Var3.d()), new d5.x(context, g1Var, f1Var3, d1Var, g1Var2, g1Var6, null), qVar3);
                    lVar = y0.l.f16729b;
                    y0.o oVarD5 = androidx.compose.foundation.a.d(androidx.compose.foundation.layout.c.f1668b, a4.q.n(d7.t.e0(new e1.r(androidx.compose.ui.graphics.a.c(4278520344L)), new e1.r(androidx.compose.ui.graphics.a.c(4278851904L)), new e1.r(androidx.compose.ui.graphics.a.c(4279180085L)), new e1.r(androidx.compose.ui.graphics.a.c(4278520344L)))), null, 6);
                    gVar = y0.a.f16710c;
                    qVar3.Z(733328855);
                    j0VarC = y.p.c(gVar, false, qVar3);
                    qVar3.Z(-1323940314);
                    i18 = qVar3.P;
                    r1VarP = qVar3.p();
                    t1.l.f14477k.getClass();
                    jVar = t1.k.f14458b;
                    bVarI = androidx.compose.ui.layout.a.i(oVarD5);
                    z13 = qVar3.f11630a instanceof m0.d;
                    if (!z13) {
                        m9.e0.C();
                        throw null;
                    }
                    qVar3.c0();
                    if (qVar3.O) {
                        qVar3.o(jVar);
                    } else {
                        qVar3.o0();
                    }
                    iVar = t1.k.f14461e;
                    d7.t.s0(qVar3, j0VarC, iVar);
                    iVar2 = t1.k.f14460d;
                    d7.t.s0(qVar3, r1VarP, iVar2);
                    iVar3 = t1.k.f14462f;
                    if (qVar3.O) {
                        l.q.r(i18, qVar3, i18, iVar3);
                    } else {
                        l.q.r(i18, qVar3, i18, iVar3);
                    }
                    l.q.s(0, bVarI, new m0.l2(qVar3), qVar3, 2058660585);
                    fillElement = androidx.compose.foundation.layout.c.f1667a;
                    f10 = 32;
                    y0.o oVarN3 = androidx.compose.foundation.layout.a.n(androidx.compose.foundation.a.n(fillElement, androidx.compose.foundation.a.l(qVar3)), f10, 0.0f, 2);
                    y0.e eVar3 = y0.a.f16716p;
                    qVar3.Z(-483455358);
                    j0VarA = y.u.a(y.k.f16607c, eVar3, qVar3);
                    qVar3.Z(-1323940314);
                    i19 = qVar3.P;
                    r1VarP2 = qVar3.p();
                    bVarI2 = androidx.compose.ui.layout.a.i(oVarN3);
                    if (!z13) {
                        m9.e0.C();
                        throw null;
                    }
                    qVar3.c0();
                    if (qVar3.O) {
                        qVar3.o(jVar);
                    } else {
                        qVar3.o0();
                    }
                    d7.t.s0(qVar3, j0VarA, iVar);
                    d7.t.s0(qVar3, r1VarP2, iVar2);
                    if (qVar3.O) {
                        l.q.r(i19, qVar3, i19, iVar3);
                    } else {
                        l.q.r(i19, qVar3, i19, iVar3);
                    }
                    l.q.s(0, bVarI2, new m0.l2(qVar3), qVar3, 2058660585);
                    y0.o oVarB3 = androidx.compose.ui.draw.a.b(androidx.compose.ui.draw.a.h(androidx.compose.foundation.layout.c.h(lVar, 100), ((Number) k0VarF.f14220d.getValue()).floatValue()), e0.f.f4988a);
                    j10 = e5.a.f5125a;
                    str6 = str5;
                    y0.o oVarD6 = androidx.compose.foundation.a.d(oVarB3, a4.q.j(d7.t.e0(new e1.r(e1.r.b(j10, 0.3f)), new e1.r(e1.r.b(j10, 0.05f))), 0.0f, 14), null, 6);
                    qVar3.Z(733328855);
                    j0VarC2 = y.p.c(gVar, false, qVar3);
                    qVar3.Z(-1323940314);
                    i20 = qVar3.P;
                    r1VarP3 = qVar3.p();
                    bVarI3 = androidx.compose.ui.layout.a.i(oVarD6);
                    if (!z13) {
                        m9.e0.C();
                        throw null;
                    }
                    qVar3.c0();
                    if (qVar3.O) {
                        qVar3.o(jVar);
                    } else {
                        qVar3.o0();
                    }
                    d7.t.s0(qVar3, j0VarC2, iVar);
                    d7.t.s0(qVar3, r1VarP3, iVar2);
                    if (qVar3.O) {
                        l.q.r(i20, qVar3, i20, iVar3);
                    } else {
                        l.q.r(i20, qVar3, i20, iVar3);
                    }
                    bVarI3.e(new m0.l2(qVar3), qVar3, 0);
                    qVar3.Z(2058660585);
                    f11 = 48;
                    k0.e1.b(z6.a.K(), "Update", androidx.compose.foundation.layout.c.h(lVar, f11), j10, qVar3, 3504, 0);
                    l.q.v(qVar3, false, true, false, false);
                    c5.b("Update Required", null, e5.a.f5136l, l.q.d(lVar, f10, qVar3, 26), null, f2.l.f6118f, null, 0L, null, new l2.i(3), 0L, 0, false, 0, 0, null, null, qVar3, 200070, 0, 130514);
                    f12 = 12;
                    long jD3 = l.q.d(lVar, f12, qVar3, 14);
                    long j15 = e5.a.f5137m;
                    c5.b("A new version of Ride Accepter is available.\nPlease update to continue using the app.", null, j15, jD3, null, null, null, 0L, null, new l2.i(3), o1.s.N(22), 0, false, 0, 0, null, null, qVar3, 3462, 6, 129522);
                    f13 = 8;
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f13), qVar3);
                    j11 = e5.a.f5132h;
                    f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d5.p.f4710a, qVar3, 196614, 24);
                    f14 = 16;
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f14), qVar3);
                    qVar3.Z(991122215);
                    if (str6.length() > 0) {
                        str7 = str6;
                        f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d7.t.K(qVar3, -1266085629, new d5.b(str7, 2)), qVar3, 196614, 24);
                    } else {
                        str7 = str6;
                    }
                    qVar3.t(false);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, 24), qVar3);
                    qVar3.Z(991123350);
                    if (((Boolean) g1Var.getValue()).booleanValue()) {
                        g1Var3 = g1Var2;
                        d1Var2 = d1Var;
                        f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d7.t.K(qVar3, -1306056660, new u.l1(5, g1Var2, d1Var)), qVar3, 196614, 24);
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f14), qVar3);
                    } else {
                        g1Var3 = g1Var2;
                        d1Var2 = d1Var;
                        f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d7.t.K(qVar3, -1306056660, new u.l1(5, g1Var2, d1Var)), qVar3, 196614, 24);
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f14), qVar3);
                    }
                    z14 = false;
                    qVar3.t(false);
                    qVar3.Z(991125275);
                    if (((Boolean) g1Var3.getValue()).booleanValue()) {
                        context2 = context;
                        qVar = qVar3;
                        z15 = true;
                        lVar2 = lVar;
                        f15 = f12;
                        i21 = 52;
                    } else {
                        context2 = context;
                        qVar = qVar3;
                        z15 = true;
                        lVar2 = lVar;
                        f15 = f12;
                        i21 = 52;
                    }
                    qVar.t(z14);
                    qVar.Z(991126226);
                    if (((Boolean) g1Var3.getValue()).booleanValue()) {
                        context3 = context2;
                        lVar3 = lVar2;
                        qVar2 = qVar;
                        j12 = r43;
                        z16 = z14;
                    } else {
                        context3 = context2;
                        lVar3 = lVar2;
                        qVar2 = qVar;
                        j12 = r43;
                        z16 = z14;
                    }
                    qVar2.t(z16);
                    qVar2.Z(991128322);
                    if (str2.length() > 0) {
                        m9.e0.g(new u.r0(17, str2, context3), androidx.compose.foundation.layout.c.c(fillElement, f11), false, e0.f.a(14), null, null, new u.w(k0.z.f(qVar2).f14967a, a4.q.i(d7.t.e0(new e1.r(j12), new e1.r(e5.a.f5128d)))), null, null, d5.p.f4712c, qVar2, 805306416, 436);
                        z17 = false;
                    } else {
                        z17 = z16;
                    }
                    qVar2.t(z17);
                    qVar2.Z(991129516);
                    if (str.length() == 0) {
                        f16 = f13;
                    } else {
                        f16 = f13;
                    }
                    qVar2.t(false);
                    qVar2.Z(-723979200);
                    if (z12) {
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar3, f16), qVar2);
                        m9.e0.j(aVar3, fillElement, false, null, null, null, null, null, null, d5.p.f4713d, qVar2, ((i17 >> 12) & 14) | 805306416, 508);
                    }
                    l.q.v(qVar2, false, false, true, false);
                    l.q.v(qVar2, false, false, true, false);
                    qVar2.t(false);
                    z18 = z12;
                    aVar4 = aVar3;
                }
                x1VarX = qVar2.x();
                if (x1VarX != null) {
                    x1VarX.f11756d = new d5.y(str, str2, str7, z18, aVar4, i10, i11);
                }
            }
            i12 |= 3072;
            z11 = z10;
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((57344 & i10) == 0) {
                    aVar2 = aVar;
                    if (qVar3.i(aVar2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i12;
                if ((i17 & 46811) == 9362) {
                    if (i22 != 0) {
                        str5 = "";
                    } else {
                        str5 = str4;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        aVar3 = d5.v.f4796a;
                    } else {
                        aVar3 = aVar2;
                    }
                    context = (Context) qVar3.m(u1.y0.f15377b);
                    qVar3.Z(-1449374496);
                    objP = qVar3.P();
                    y0Var = m0.l.f11578a;
                    o3Var = o3.f11621a;
                    if (objP == y0Var) {
                        objP = d7.t.g0(Boolean.FALSE, o3Var);
                        qVar3.l0(objP);
                    }
                    g1Var = (m0.g1) objP;
                    objF = l.q.f(qVar3, false, -1449374433);
                    if (objF == y0Var) {
                        objF = m9.e0.H(0.0f);
                        qVar3.l0(objF);
                    }
                    d1Var = (m0.d1) objF;
                    objF2 = l.q.f(qVar3, false, -1449374368);
                    if (objF2 == y0Var) {
                        objF2 = d7.t.g0(Boolean.FALSE, o3Var);
                        qVar3.l0(objF2);
                    }
                    g1Var2 = (m0.g1) objF2;
                    objF3 = l.q.f(qVar3, false, -1449374311);
                    if (objF3 == y0Var) {
                        int i26 = m0.b.f11457b;
                        objF3 = new m0.m1(-1L);
                        qVar3.l0(objF3);
                    }
                    m0.f1 f1Var4 = (m0.f1) objF3;
                    objF4 = l.q.f(qVar3, false, -1449374248);
                    if (objF4 == y0Var) {
                        objF4 = d7.t.g0(null, o3Var);
                        qVar3.l0(objF4);
                    }
                    m0.g1 g1Var7 = (m0.g1) objF4;
                    qVar3.t(false);
                    k0VarF = t.e.f(t.e.q("pulse", qVar3, 0), 1.0f, 1.15f, t.e.p(t.e.s(800, 0, t.c0.f14096b, 2), 2, 4), "pulseScale", qVar3, 29112, 0);
                    w2 w2Var4 = (w2) f1Var4;
                    m0.s.a(Long.valueOf(w2Var4.d()), new y.r(context, f1Var4, g1Var, g1Var2, d1Var, g1Var7, 1), qVar3);
                    m0.s.c(Boolean.valueOf(((Boolean) g1Var.getValue()).booleanValue()), Long.valueOf(w2Var4.d()), new d5.x(context, g1Var, f1Var4, d1Var, g1Var2, g1Var7, null), qVar3);
                    lVar = y0.l.f16729b;
                    y0.o oVarD7 = androidx.compose.foundation.a.d(androidx.compose.foundation.layout.c.f1668b, a4.q.n(d7.t.e0(new e1.r(androidx.compose.ui.graphics.a.c(4278520344L)), new e1.r(androidx.compose.ui.graphics.a.c(4278851904L)), new e1.r(androidx.compose.ui.graphics.a.c(4279180085L)), new e1.r(androidx.compose.ui.graphics.a.c(4278520344L)))), null, 6);
                    gVar = y0.a.f16710c;
                    qVar3.Z(733328855);
                    j0VarC = y.p.c(gVar, false, qVar3);
                    qVar3.Z(-1323940314);
                    i18 = qVar3.P;
                    r1VarP = qVar3.p();
                    t1.l.f14477k.getClass();
                    jVar = t1.k.f14458b;
                    bVarI = androidx.compose.ui.layout.a.i(oVarD7);
                    z13 = qVar3.f11630a instanceof m0.d;
                    if (!z13) {
                        m9.e0.C();
                        throw null;
                    }
                    qVar3.c0();
                    if (qVar3.O) {
                        qVar3.o(jVar);
                    } else {
                        qVar3.o0();
                    }
                    iVar = t1.k.f14461e;
                    d7.t.s0(qVar3, j0VarC, iVar);
                    iVar2 = t1.k.f14460d;
                    d7.t.s0(qVar3, r1VarP, iVar2);
                    iVar3 = t1.k.f14462f;
                    if (qVar3.O) {
                        l.q.r(i18, qVar3, i18, iVar3);
                    } else {
                        l.q.r(i18, qVar3, i18, iVar3);
                    }
                    l.q.s(0, bVarI, new m0.l2(qVar3), qVar3, 2058660585);
                    fillElement = androidx.compose.foundation.layout.c.f1667a;
                    f10 = 32;
                    y0.o oVarN4 = androidx.compose.foundation.layout.a.n(androidx.compose.foundation.a.n(fillElement, androidx.compose.foundation.a.l(qVar3)), f10, 0.0f, 2);
                    y0.e eVar4 = y0.a.f16716p;
                    qVar3.Z(-483455358);
                    j0VarA = y.u.a(y.k.f16607c, eVar4, qVar3);
                    qVar3.Z(-1323940314);
                    i19 = qVar3.P;
                    r1VarP2 = qVar3.p();
                    bVarI2 = androidx.compose.ui.layout.a.i(oVarN4);
                    if (!z13) {
                        m9.e0.C();
                        throw null;
                    }
                    qVar3.c0();
                    if (qVar3.O) {
                        qVar3.o(jVar);
                    } else {
                        qVar3.o0();
                    }
                    d7.t.s0(qVar3, j0VarA, iVar);
                    d7.t.s0(qVar3, r1VarP2, iVar2);
                    if (qVar3.O) {
                        l.q.r(i19, qVar3, i19, iVar3);
                    } else {
                        l.q.r(i19, qVar3, i19, iVar3);
                    }
                    l.q.s(0, bVarI2, new m0.l2(qVar3), qVar3, 2058660585);
                    y0.o oVarB4 = androidx.compose.ui.draw.a.b(androidx.compose.ui.draw.a.h(androidx.compose.foundation.layout.c.h(lVar, 100), ((Number) k0VarF.f14220d.getValue()).floatValue()), e0.f.f4988a);
                    j10 = e5.a.f5125a;
                    str6 = str5;
                    y0.o oVarD8 = androidx.compose.foundation.a.d(oVarB4, a4.q.j(d7.t.e0(new e1.r(e1.r.b(j10, 0.3f)), new e1.r(e1.r.b(j10, 0.05f))), 0.0f, 14), null, 6);
                    qVar3.Z(733328855);
                    j0VarC2 = y.p.c(gVar, false, qVar3);
                    qVar3.Z(-1323940314);
                    i20 = qVar3.P;
                    r1VarP3 = qVar3.p();
                    bVarI3 = androidx.compose.ui.layout.a.i(oVarD8);
                    if (!z13) {
                        m9.e0.C();
                        throw null;
                    }
                    qVar3.c0();
                    if (qVar3.O) {
                        qVar3.o(jVar);
                    } else {
                        qVar3.o0();
                    }
                    d7.t.s0(qVar3, j0VarC2, iVar);
                    d7.t.s0(qVar3, r1VarP3, iVar2);
                    if (qVar3.O) {
                        l.q.r(i20, qVar3, i20, iVar3);
                    } else {
                        l.q.r(i20, qVar3, i20, iVar3);
                    }
                    bVarI3.e(new m0.l2(qVar3), qVar3, 0);
                    qVar3.Z(2058660585);
                    f11 = 48;
                    k0.e1.b(z6.a.K(), "Update", androidx.compose.foundation.layout.c.h(lVar, f11), j10, qVar3, 3504, 0);
                    l.q.v(qVar3, false, true, false, false);
                    c5.b("Update Required", null, e5.a.f5136l, l.q.d(lVar, f10, qVar3, 26), null, f2.l.f6118f, null, 0L, null, new l2.i(3), 0L, 0, false, 0, 0, null, null, qVar3, 200070, 0, 130514);
                    f12 = 12;
                    long jD4 = l.q.d(lVar, f12, qVar3, 14);
                    long j16 = e5.a.f5137m;
                    c5.b("A new version of Ride Accepter is available.\nPlease update to continue using the app.", null, j16, jD4, null, null, null, 0L, null, new l2.i(3), o1.s.N(22), 0, false, 0, 0, null, null, qVar3, 3462, 6, 129522);
                    f13 = 8;
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f13), qVar3);
                    j11 = e5.a.f5132h;
                    f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d5.p.f4710a, qVar3, 196614, 24);
                    f14 = 16;
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f14), qVar3);
                    qVar3.Z(991122215);
                    if (str6.length() > 0) {
                        str7 = str6;
                        f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d7.t.K(qVar3, -1266085629, new d5.b(str7, 2)), qVar3, 196614, 24);
                    } else {
                        str7 = str6;
                    }
                    qVar3.t(false);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, 24), qVar3);
                    qVar3.Z(991123350);
                    if (((Boolean) g1Var.getValue()).booleanValue()) {
                        g1Var3 = g1Var2;
                        d1Var2 = d1Var;
                        f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d7.t.K(qVar3, -1306056660, new u.l1(5, g1Var2, d1Var)), qVar3, 196614, 24);
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f14), qVar3);
                    } else {
                        g1Var3 = g1Var2;
                        d1Var2 = d1Var;
                        f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d7.t.K(qVar3, -1306056660, new u.l1(5, g1Var2, d1Var)), qVar3, 196614, 24);
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f14), qVar3);
                    }
                    z14 = false;
                    qVar3.t(false);
                    qVar3.Z(991125275);
                    if (((Boolean) g1Var3.getValue()).booleanValue()) {
                        context2 = context;
                        qVar = qVar3;
                        z15 = true;
                        lVar2 = lVar;
                        f15 = f12;
                        i21 = 52;
                    } else {
                        context2 = context;
                        qVar = qVar3;
                        z15 = true;
                        lVar2 = lVar;
                        f15 = f12;
                        i21 = 52;
                    }
                    qVar.t(z14);
                    qVar.Z(991126226);
                    if (((Boolean) g1Var3.getValue()).booleanValue()) {
                        context3 = context2;
                        lVar3 = lVar2;
                        qVar2 = qVar;
                        j12 = r43;
                        z16 = z14;
                    } else {
                        context3 = context2;
                        lVar3 = lVar2;
                        qVar2 = qVar;
                        j12 = r43;
                        z16 = z14;
                    }
                    qVar2.t(z16);
                    qVar2.Z(991128322);
                    if (str2.length() > 0) {
                        m9.e0.g(new u.r0(17, str2, context3), androidx.compose.foundation.layout.c.c(fillElement, f11), false, e0.f.a(14), null, null, new u.w(k0.z.f(qVar2).f14967a, a4.q.i(d7.t.e0(new e1.r(j12), new e1.r(e5.a.f5128d)))), null, null, d5.p.f4712c, qVar2, 805306416, 436);
                        z17 = false;
                    } else {
                        z17 = z16;
                    }
                    qVar2.t(z17);
                    qVar2.Z(991129516);
                    if (str.length() == 0) {
                        f16 = f13;
                    } else {
                        f16 = f13;
                    }
                    qVar2.t(false);
                    qVar2.Z(-723979200);
                    if (z12) {
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar3, f16), qVar2);
                        m9.e0.j(aVar3, fillElement, false, null, null, null, null, null, null, d5.p.f4713d, qVar2, ((i17 >> 12) & 14) | 805306416, 508);
                    }
                    l.q.v(qVar2, false, false, true, false);
                    l.q.v(qVar2, false, false, true, false);
                    qVar2.t(false);
                    z18 = z12;
                    aVar4 = aVar3;
                } else {
                    if (i22 != 0) {
                        str5 = "";
                    } else {
                        str5 = str4;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        aVar3 = d5.v.f4796a;
                    } else {
                        aVar3 = aVar2;
                    }
                    context = (Context) qVar3.m(u1.y0.f15377b);
                    qVar3.Z(-1449374496);
                    objP = qVar3.P();
                    y0Var = m0.l.f11578a;
                    o3Var = o3.f11621a;
                    if (objP == y0Var) {
                        objP = d7.t.g0(Boolean.FALSE, o3Var);
                        qVar3.l0(objP);
                    }
                    g1Var = (m0.g1) objP;
                    objF = l.q.f(qVar3, false, -1449374433);
                    if (objF == y0Var) {
                        objF = m9.e0.H(0.0f);
                        qVar3.l0(objF);
                    }
                    d1Var = (m0.d1) objF;
                    objF2 = l.q.f(qVar3, false, -1449374368);
                    if (objF2 == y0Var) {
                        objF2 = d7.t.g0(Boolean.FALSE, o3Var);
                        qVar3.l0(objF2);
                    }
                    g1Var2 = (m0.g1) objF2;
                    objF3 = l.q.f(qVar3, false, -1449374311);
                    if (objF3 == y0Var) {
                        int i27 = m0.b.f11457b;
                        objF3 = new m0.m1(-1L);
                        qVar3.l0(objF3);
                    }
                    m0.f1 f1Var5 = (m0.f1) objF3;
                    objF4 = l.q.f(qVar3, false, -1449374248);
                    if (objF4 == y0Var) {
                        objF4 = d7.t.g0(null, o3Var);
                        qVar3.l0(objF4);
                    }
                    m0.g1 g1Var8 = (m0.g1) objF4;
                    qVar3.t(false);
                    k0VarF = t.e.f(t.e.q("pulse", qVar3, 0), 1.0f, 1.15f, t.e.p(t.e.s(800, 0, t.c0.f14096b, 2), 2, 4), "pulseScale", qVar3, 29112, 0);
                    w2 w2Var5 = (w2) f1Var5;
                    m0.s.a(Long.valueOf(w2Var5.d()), new y.r(context, f1Var5, g1Var, g1Var2, d1Var, g1Var8, 1), qVar3);
                    m0.s.c(Boolean.valueOf(((Boolean) g1Var.getValue()).booleanValue()), Long.valueOf(w2Var5.d()), new d5.x(context, g1Var, f1Var5, d1Var, g1Var2, g1Var8, null), qVar3);
                    lVar = y0.l.f16729b;
                    y0.o oVarD9 = androidx.compose.foundation.a.d(androidx.compose.foundation.layout.c.f1668b, a4.q.n(d7.t.e0(new e1.r(androidx.compose.ui.graphics.a.c(4278520344L)), new e1.r(androidx.compose.ui.graphics.a.c(4278851904L)), new e1.r(androidx.compose.ui.graphics.a.c(4279180085L)), new e1.r(androidx.compose.ui.graphics.a.c(4278520344L)))), null, 6);
                    gVar = y0.a.f16710c;
                    qVar3.Z(733328855);
                    j0VarC = y.p.c(gVar, false, qVar3);
                    qVar3.Z(-1323940314);
                    i18 = qVar3.P;
                    r1VarP = qVar3.p();
                    t1.l.f14477k.getClass();
                    jVar = t1.k.f14458b;
                    bVarI = androidx.compose.ui.layout.a.i(oVarD9);
                    z13 = qVar3.f11630a instanceof m0.d;
                    if (!z13) {
                        m9.e0.C();
                        throw null;
                    }
                    qVar3.c0();
                    if (qVar3.O) {
                        qVar3.o(jVar);
                    } else {
                        qVar3.o0();
                    }
                    iVar = t1.k.f14461e;
                    d7.t.s0(qVar3, j0VarC, iVar);
                    iVar2 = t1.k.f14460d;
                    d7.t.s0(qVar3, r1VarP, iVar2);
                    iVar3 = t1.k.f14462f;
                    if (qVar3.O) {
                        l.q.r(i18, qVar3, i18, iVar3);
                    } else {
                        l.q.r(i18, qVar3, i18, iVar3);
                    }
                    l.q.s(0, bVarI, new m0.l2(qVar3), qVar3, 2058660585);
                    fillElement = androidx.compose.foundation.layout.c.f1667a;
                    f10 = 32;
                    y0.o oVarN5 = androidx.compose.foundation.layout.a.n(androidx.compose.foundation.a.n(fillElement, androidx.compose.foundation.a.l(qVar3)), f10, 0.0f, 2);
                    y0.e eVar5 = y0.a.f16716p;
                    qVar3.Z(-483455358);
                    j0VarA = y.u.a(y.k.f16607c, eVar5, qVar3);
                    qVar3.Z(-1323940314);
                    i19 = qVar3.P;
                    r1VarP2 = qVar3.p();
                    bVarI2 = androidx.compose.ui.layout.a.i(oVarN5);
                    if (!z13) {
                        m9.e0.C();
                        throw null;
                    }
                    qVar3.c0();
                    if (qVar3.O) {
                        qVar3.o(jVar);
                    } else {
                        qVar3.o0();
                    }
                    d7.t.s0(qVar3, j0VarA, iVar);
                    d7.t.s0(qVar3, r1VarP2, iVar2);
                    if (qVar3.O) {
                        l.q.r(i19, qVar3, i19, iVar3);
                    } else {
                        l.q.r(i19, qVar3, i19, iVar3);
                    }
                    l.q.s(0, bVarI2, new m0.l2(qVar3), qVar3, 2058660585);
                    y0.o oVarB5 = androidx.compose.ui.draw.a.b(androidx.compose.ui.draw.a.h(androidx.compose.foundation.layout.c.h(lVar, 100), ((Number) k0VarF.f14220d.getValue()).floatValue()), e0.f.f4988a);
                    j10 = e5.a.f5125a;
                    str6 = str5;
                    y0.o oVarD10 = androidx.compose.foundation.a.d(oVarB5, a4.q.j(d7.t.e0(new e1.r(e1.r.b(j10, 0.3f)), new e1.r(e1.r.b(j10, 0.05f))), 0.0f, 14), null, 6);
                    qVar3.Z(733328855);
                    j0VarC2 = y.p.c(gVar, false, qVar3);
                    qVar3.Z(-1323940314);
                    i20 = qVar3.P;
                    r1VarP3 = qVar3.p();
                    bVarI3 = androidx.compose.ui.layout.a.i(oVarD10);
                    if (!z13) {
                        m9.e0.C();
                        throw null;
                    }
                    qVar3.c0();
                    if (qVar3.O) {
                        qVar3.o(jVar);
                    } else {
                        qVar3.o0();
                    }
                    d7.t.s0(qVar3, j0VarC2, iVar);
                    d7.t.s0(qVar3, r1VarP3, iVar2);
                    if (qVar3.O) {
                        l.q.r(i20, qVar3, i20, iVar3);
                    } else {
                        l.q.r(i20, qVar3, i20, iVar3);
                    }
                    bVarI3.e(new m0.l2(qVar3), qVar3, 0);
                    qVar3.Z(2058660585);
                    f11 = 48;
                    k0.e1.b(z6.a.K(), "Update", androidx.compose.foundation.layout.c.h(lVar, f11), j10, qVar3, 3504, 0);
                    l.q.v(qVar3, false, true, false, false);
                    c5.b("Update Required", null, e5.a.f5136l, l.q.d(lVar, f10, qVar3, 26), null, f2.l.f6118f, null, 0L, null, new l2.i(3), 0L, 0, false, 0, 0, null, null, qVar3, 200070, 0, 130514);
                    f12 = 12;
                    long jD5 = l.q.d(lVar, f12, qVar3, 14);
                    long j17 = e5.a.f5137m;
                    c5.b("A new version of Ride Accepter is available.\nPlease update to continue using the app.", null, j17, jD5, null, null, null, 0L, null, new l2.i(3), o1.s.N(22), 0, false, 0, 0, null, null, qVar3, 3462, 6, 129522);
                    f13 = 8;
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f13), qVar3);
                    j11 = e5.a.f5132h;
                    f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d5.p.f4710a, qVar3, 196614, 24);
                    f14 = 16;
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f14), qVar3);
                    qVar3.Z(991122215);
                    if (str6.length() > 0) {
                        str7 = str6;
                        f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d7.t.K(qVar3, -1266085629, new d5.b(str7, 2)), qVar3, 196614, 24);
                    } else {
                        str7 = str6;
                    }
                    qVar3.t(false);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, 24), qVar3);
                    qVar3.Z(991123350);
                    if (((Boolean) g1Var.getValue()).booleanValue()) {
                        g1Var3 = g1Var2;
                        d1Var2 = d1Var;
                        f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d7.t.K(qVar3, -1306056660, new u.l1(5, g1Var2, d1Var)), qVar3, 196614, 24);
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f14), qVar3);
                    } else {
                        g1Var3 = g1Var2;
                        d1Var2 = d1Var;
                        f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d7.t.K(qVar3, -1306056660, new u.l1(5, g1Var2, d1Var)), qVar3, 196614, 24);
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f14), qVar3);
                    }
                    z14 = false;
                    qVar3.t(false);
                    qVar3.Z(991125275);
                    if (((Boolean) g1Var3.getValue()).booleanValue()) {
                        context2 = context;
                        qVar = qVar3;
                        z15 = true;
                        lVar2 = lVar;
                        f15 = f12;
                        i21 = 52;
                    } else {
                        context2 = context;
                        qVar = qVar3;
                        z15 = true;
                        lVar2 = lVar;
                        f15 = f12;
                        i21 = 52;
                    }
                    qVar.t(z14);
                    qVar.Z(991126226);
                    if (((Boolean) g1Var3.getValue()).booleanValue()) {
                        context3 = context2;
                        lVar3 = lVar2;
                        qVar2 = qVar;
                        j12 = r43;
                        z16 = z14;
                    } else {
                        context3 = context2;
                        lVar3 = lVar2;
                        qVar2 = qVar;
                        j12 = r43;
                        z16 = z14;
                    }
                    qVar2.t(z16);
                    qVar2.Z(991128322);
                    if (str2.length() > 0) {
                        m9.e0.g(new u.r0(17, str2, context3), androidx.compose.foundation.layout.c.c(fillElement, f11), false, e0.f.a(14), null, null, new u.w(k0.z.f(qVar2).f14967a, a4.q.i(d7.t.e0(new e1.r(j12), new e1.r(e5.a.f5128d)))), null, null, d5.p.f4712c, qVar2, 805306416, 436);
                        z17 = false;
                    } else {
                        z17 = z16;
                    }
                    qVar2.t(z17);
                    qVar2.Z(991129516);
                    if (str.length() == 0) {
                        f16 = f13;
                    } else {
                        f16 = f13;
                    }
                    qVar2.t(false);
                    qVar2.Z(-723979200);
                    if (z12) {
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar3, f16), qVar2);
                        m9.e0.j(aVar3, fillElement, false, null, null, null, null, null, null, d5.p.f4713d, qVar2, ((i17 >> 12) & 14) | 805306416, 508);
                    }
                    l.q.v(qVar2, false, false, true, false);
                    l.q.v(qVar2, false, false, true, false);
                    qVar2.t(false);
                    z18 = z12;
                    aVar4 = aVar3;
                }
                x1VarX = qVar2.x();
                if (x1VarX != null) {
                    x1VarX.f11756d = new d5.y(str, str2, str7, z18, aVar4, i10, i11);
                }
            }
            i12 |= 24576;
            aVar2 = aVar;
            i17 = i12;
            if ((i17 & 46811) == 9362) {
                if (i22 != 0) {
                    str5 = "";
                } else {
                    str5 = str4;
                }
                if (i13 != 0) {
                    z12 = false;
                } else {
                    z12 = z11;
                }
                if (i15 != 0) {
                    aVar3 = d5.v.f4796a;
                } else {
                    aVar3 = aVar2;
                }
                context = (Context) qVar3.m(u1.y0.f15377b);
                qVar3.Z(-1449374496);
                objP = qVar3.P();
                y0Var = m0.l.f11578a;
                o3Var = o3.f11621a;
                if (objP == y0Var) {
                    objP = d7.t.g0(Boolean.FALSE, o3Var);
                    qVar3.l0(objP);
                }
                g1Var = (m0.g1) objP;
                objF = l.q.f(qVar3, false, -1449374433);
                if (objF == y0Var) {
                    objF = m9.e0.H(0.0f);
                    qVar3.l0(objF);
                }
                d1Var = (m0.d1) objF;
                objF2 = l.q.f(qVar3, false, -1449374368);
                if (objF2 == y0Var) {
                    objF2 = d7.t.g0(Boolean.FALSE, o3Var);
                    qVar3.l0(objF2);
                }
                g1Var2 = (m0.g1) objF2;
                objF3 = l.q.f(qVar3, false, -1449374311);
                if (objF3 == y0Var) {
                    int i28 = m0.b.f11457b;
                    objF3 = new m0.m1(-1L);
                    qVar3.l0(objF3);
                }
                m0.f1 f1Var6 = (m0.f1) objF3;
                objF4 = l.q.f(qVar3, false, -1449374248);
                if (objF4 == y0Var) {
                    objF4 = d7.t.g0(null, o3Var);
                    qVar3.l0(objF4);
                }
                m0.g1 g1Var9 = (m0.g1) objF4;
                qVar3.t(false);
                k0VarF = t.e.f(t.e.q("pulse", qVar3, 0), 1.0f, 1.15f, t.e.p(t.e.s(800, 0, t.c0.f14096b, 2), 2, 4), "pulseScale", qVar3, 29112, 0);
                w2 w2Var6 = (w2) f1Var6;
                m0.s.a(Long.valueOf(w2Var6.d()), new y.r(context, f1Var6, g1Var, g1Var2, d1Var, g1Var9, 1), qVar3);
                m0.s.c(Boolean.valueOf(((Boolean) g1Var.getValue()).booleanValue()), Long.valueOf(w2Var6.d()), new d5.x(context, g1Var, f1Var6, d1Var, g1Var2, g1Var9, null), qVar3);
                lVar = y0.l.f16729b;
                y0.o oVarD11 = androidx.compose.foundation.a.d(androidx.compose.foundation.layout.c.f1668b, a4.q.n(d7.t.e0(new e1.r(androidx.compose.ui.graphics.a.c(4278520344L)), new e1.r(androidx.compose.ui.graphics.a.c(4278851904L)), new e1.r(androidx.compose.ui.graphics.a.c(4279180085L)), new e1.r(androidx.compose.ui.graphics.a.c(4278520344L)))), null, 6);
                gVar = y0.a.f16710c;
                qVar3.Z(733328855);
                j0VarC = y.p.c(gVar, false, qVar3);
                qVar3.Z(-1323940314);
                i18 = qVar3.P;
                r1VarP = qVar3.p();
                t1.l.f14477k.getClass();
                jVar = t1.k.f14458b;
                bVarI = androidx.compose.ui.layout.a.i(oVarD11);
                z13 = qVar3.f11630a instanceof m0.d;
                if (!z13) {
                    m9.e0.C();
                    throw null;
                }
                qVar3.c0();
                if (qVar3.O) {
                    qVar3.o(jVar);
                } else {
                    qVar3.o0();
                }
                iVar = t1.k.f14461e;
                d7.t.s0(qVar3, j0VarC, iVar);
                iVar2 = t1.k.f14460d;
                d7.t.s0(qVar3, r1VarP, iVar2);
                iVar3 = t1.k.f14462f;
                if (qVar3.O) {
                    l.q.r(i18, qVar3, i18, iVar3);
                } else {
                    l.q.r(i18, qVar3, i18, iVar3);
                }
                l.q.s(0, bVarI, new m0.l2(qVar3), qVar3, 2058660585);
                fillElement = androidx.compose.foundation.layout.c.f1667a;
                f10 = 32;
                y0.o oVarN6 = androidx.compose.foundation.layout.a.n(androidx.compose.foundation.a.n(fillElement, androidx.compose.foundation.a.l(qVar3)), f10, 0.0f, 2);
                y0.e eVar6 = y0.a.f16716p;
                qVar3.Z(-483455358);
                j0VarA = y.u.a(y.k.f16607c, eVar6, qVar3);
                qVar3.Z(-1323940314);
                i19 = qVar3.P;
                r1VarP2 = qVar3.p();
                bVarI2 = androidx.compose.ui.layout.a.i(oVarN6);
                if (!z13) {
                    m9.e0.C();
                    throw null;
                }
                qVar3.c0();
                if (qVar3.O) {
                    qVar3.o(jVar);
                } else {
                    qVar3.o0();
                }
                d7.t.s0(qVar3, j0VarA, iVar);
                d7.t.s0(qVar3, r1VarP2, iVar2);
                if (qVar3.O) {
                    l.q.r(i19, qVar3, i19, iVar3);
                } else {
                    l.q.r(i19, qVar3, i19, iVar3);
                }
                l.q.s(0, bVarI2, new m0.l2(qVar3), qVar3, 2058660585);
                y0.o oVarB6 = androidx.compose.ui.draw.a.b(androidx.compose.ui.draw.a.h(androidx.compose.foundation.layout.c.h(lVar, 100), ((Number) k0VarF.f14220d.getValue()).floatValue()), e0.f.f4988a);
                j10 = e5.a.f5125a;
                str6 = str5;
                y0.o oVarD12 = androidx.compose.foundation.a.d(oVarB6, a4.q.j(d7.t.e0(new e1.r(e1.r.b(j10, 0.3f)), new e1.r(e1.r.b(j10, 0.05f))), 0.0f, 14), null, 6);
                qVar3.Z(733328855);
                j0VarC2 = y.p.c(gVar, false, qVar3);
                qVar3.Z(-1323940314);
                i20 = qVar3.P;
                r1VarP3 = qVar3.p();
                bVarI3 = androidx.compose.ui.layout.a.i(oVarD12);
                if (!z13) {
                    m9.e0.C();
                    throw null;
                }
                qVar3.c0();
                if (qVar3.O) {
                    qVar3.o(jVar);
                } else {
                    qVar3.o0();
                }
                d7.t.s0(qVar3, j0VarC2, iVar);
                d7.t.s0(qVar3, r1VarP3, iVar2);
                if (qVar3.O) {
                    l.q.r(i20, qVar3, i20, iVar3);
                } else {
                    l.q.r(i20, qVar3, i20, iVar3);
                }
                bVarI3.e(new m0.l2(qVar3), qVar3, 0);
                qVar3.Z(2058660585);
                f11 = 48;
                k0.e1.b(z6.a.K(), "Update", androidx.compose.foundation.layout.c.h(lVar, f11), j10, qVar3, 3504, 0);
                l.q.v(qVar3, false, true, false, false);
                c5.b("Update Required", null, e5.a.f5136l, l.q.d(lVar, f10, qVar3, 26), null, f2.l.f6118f, null, 0L, null, new l2.i(3), 0L, 0, false, 0, 0, null, null, qVar3, 200070, 0, 130514);
                f12 = 12;
                long jD6 = l.q.d(lVar, f12, qVar3, 14);
                long j18 = e5.a.f5137m;
                c5.b("A new version of Ride Accepter is available.\nPlease update to continue using the app.", null, j18, jD6, null, null, null, 0L, null, new l2.i(3), o1.s.N(22), 0, false, 0, 0, null, null, qVar3, 3462, 6, 129522);
                f13 = 8;
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f13), qVar3);
                j11 = e5.a.f5132h;
                f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d5.p.f4710a, qVar3, 196614, 24);
                f14 = 16;
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f14), qVar3);
                qVar3.Z(991122215);
                if (str6.length() > 0) {
                    str7 = str6;
                    f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d7.t.K(qVar3, -1266085629, new d5.b(str7, 2)), qVar3, 196614, 24);
                } else {
                    str7 = str6;
                }
                qVar3.t(false);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, 24), qVar3);
                qVar3.Z(991123350);
                if (((Boolean) g1Var.getValue()).booleanValue()) {
                    g1Var3 = g1Var2;
                    d1Var2 = d1Var;
                    f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d7.t.K(qVar3, -1306056660, new u.l1(5, g1Var2, d1Var)), qVar3, 196614, 24);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f14), qVar3);
                } else {
                    g1Var3 = g1Var2;
                    d1Var2 = d1Var;
                    f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d7.t.K(qVar3, -1306056660, new u.l1(5, g1Var2, d1Var)), qVar3, 196614, 24);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f14), qVar3);
                }
                z14 = false;
                qVar3.t(false);
                qVar3.Z(991125275);
                if (((Boolean) g1Var3.getValue()).booleanValue()) {
                    context2 = context;
                    qVar = qVar3;
                    z15 = true;
                    lVar2 = lVar;
                    f15 = f12;
                    i21 = 52;
                } else {
                    context2 = context;
                    qVar = qVar3;
                    z15 = true;
                    lVar2 = lVar;
                    f15 = f12;
                    i21 = 52;
                }
                qVar.t(z14);
                qVar.Z(991126226);
                if (((Boolean) g1Var3.getValue()).booleanValue()) {
                    context3 = context2;
                    lVar3 = lVar2;
                    qVar2 = qVar;
                    j12 = r43;
                    z16 = z14;
                } else {
                    context3 = context2;
                    lVar3 = lVar2;
                    qVar2 = qVar;
                    j12 = r43;
                    z16 = z14;
                }
                qVar2.t(z16);
                qVar2.Z(991128322);
                if (str2.length() > 0) {
                    m9.e0.g(new u.r0(17, str2, context3), androidx.compose.foundation.layout.c.c(fillElement, f11), false, e0.f.a(14), null, null, new u.w(k0.z.f(qVar2).f14967a, a4.q.i(d7.t.e0(new e1.r(j12), new e1.r(e5.a.f5128d)))), null, null, d5.p.f4712c, qVar2, 805306416, 436);
                    z17 = false;
                } else {
                    z17 = z16;
                }
                qVar2.t(z17);
                qVar2.Z(991129516);
                if (str.length() == 0) {
                    f16 = f13;
                } else {
                    f16 = f13;
                }
                qVar2.t(false);
                qVar2.Z(-723979200);
                if (z12) {
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar3, f16), qVar2);
                    m9.e0.j(aVar3, fillElement, false, null, null, null, null, null, null, d5.p.f4713d, qVar2, ((i17 >> 12) & 14) | 805306416, 508);
                }
                l.q.v(qVar2, false, false, true, false);
                l.q.v(qVar2, false, false, true, false);
                qVar2.t(false);
                z18 = z12;
                aVar4 = aVar3;
            } else {
                if (i22 != 0) {
                    str5 = "";
                } else {
                    str5 = str4;
                }
                if (i13 != 0) {
                    z12 = false;
                } else {
                    z12 = z11;
                }
                if (i15 != 0) {
                    aVar3 = d5.v.f4796a;
                } else {
                    aVar3 = aVar2;
                }
                context = (Context) qVar3.m(u1.y0.f15377b);
                qVar3.Z(-1449374496);
                objP = qVar3.P();
                y0Var = m0.l.f11578a;
                o3Var = o3.f11621a;
                if (objP == y0Var) {
                    objP = d7.t.g0(Boolean.FALSE, o3Var);
                    qVar3.l0(objP);
                }
                g1Var = (m0.g1) objP;
                objF = l.q.f(qVar3, false, -1449374433);
                if (objF == y0Var) {
                    objF = m9.e0.H(0.0f);
                    qVar3.l0(objF);
                }
                d1Var = (m0.d1) objF;
                objF2 = l.q.f(qVar3, false, -1449374368);
                if (objF2 == y0Var) {
                    objF2 = d7.t.g0(Boolean.FALSE, o3Var);
                    qVar3.l0(objF2);
                }
                g1Var2 = (m0.g1) objF2;
                objF3 = l.q.f(qVar3, false, -1449374311);
                if (objF3 == y0Var) {
                    int i29 = m0.b.f11457b;
                    objF3 = new m0.m1(-1L);
                    qVar3.l0(objF3);
                }
                m0.f1 f1Var7 = (m0.f1) objF3;
                objF4 = l.q.f(qVar3, false, -1449374248);
                if (objF4 == y0Var) {
                    objF4 = d7.t.g0(null, o3Var);
                    qVar3.l0(objF4);
                }
                m0.g1 g1Var10 = (m0.g1) objF4;
                qVar3.t(false);
                k0VarF = t.e.f(t.e.q("pulse", qVar3, 0), 1.0f, 1.15f, t.e.p(t.e.s(800, 0, t.c0.f14096b, 2), 2, 4), "pulseScale", qVar3, 29112, 0);
                w2 w2Var7 = (w2) f1Var7;
                m0.s.a(Long.valueOf(w2Var7.d()), new y.r(context, f1Var7, g1Var, g1Var2, d1Var, g1Var10, 1), qVar3);
                m0.s.c(Boolean.valueOf(((Boolean) g1Var.getValue()).booleanValue()), Long.valueOf(w2Var7.d()), new d5.x(context, g1Var, f1Var7, d1Var, g1Var2, g1Var10, null), qVar3);
                lVar = y0.l.f16729b;
                y0.o oVarD13 = androidx.compose.foundation.a.d(androidx.compose.foundation.layout.c.f1668b, a4.q.n(d7.t.e0(new e1.r(androidx.compose.ui.graphics.a.c(4278520344L)), new e1.r(androidx.compose.ui.graphics.a.c(4278851904L)), new e1.r(androidx.compose.ui.graphics.a.c(4279180085L)), new e1.r(androidx.compose.ui.graphics.a.c(4278520344L)))), null, 6);
                gVar = y0.a.f16710c;
                qVar3.Z(733328855);
                j0VarC = y.p.c(gVar, false, qVar3);
                qVar3.Z(-1323940314);
                i18 = qVar3.P;
                r1VarP = qVar3.p();
                t1.l.f14477k.getClass();
                jVar = t1.k.f14458b;
                bVarI = androidx.compose.ui.layout.a.i(oVarD13);
                z13 = qVar3.f11630a instanceof m0.d;
                if (!z13) {
                    m9.e0.C();
                    throw null;
                }
                qVar3.c0();
                if (qVar3.O) {
                    qVar3.o(jVar);
                } else {
                    qVar3.o0();
                }
                iVar = t1.k.f14461e;
                d7.t.s0(qVar3, j0VarC, iVar);
                iVar2 = t1.k.f14460d;
                d7.t.s0(qVar3, r1VarP, iVar2);
                iVar3 = t1.k.f14462f;
                if (qVar3.O) {
                    l.q.r(i18, qVar3, i18, iVar3);
                } else {
                    l.q.r(i18, qVar3, i18, iVar3);
                }
                l.q.s(0, bVarI, new m0.l2(qVar3), qVar3, 2058660585);
                fillElement = androidx.compose.foundation.layout.c.f1667a;
                f10 = 32;
                y0.o oVarN7 = androidx.compose.foundation.layout.a.n(androidx.compose.foundation.a.n(fillElement, androidx.compose.foundation.a.l(qVar3)), f10, 0.0f, 2);
                y0.e eVar7 = y0.a.f16716p;
                qVar3.Z(-483455358);
                j0VarA = y.u.a(y.k.f16607c, eVar7, qVar3);
                qVar3.Z(-1323940314);
                i19 = qVar3.P;
                r1VarP2 = qVar3.p();
                bVarI2 = androidx.compose.ui.layout.a.i(oVarN7);
                if (!z13) {
                    m9.e0.C();
                    throw null;
                }
                qVar3.c0();
                if (qVar3.O) {
                    qVar3.o(jVar);
                } else {
                    qVar3.o0();
                }
                d7.t.s0(qVar3, j0VarA, iVar);
                d7.t.s0(qVar3, r1VarP2, iVar2);
                if (qVar3.O) {
                    l.q.r(i19, qVar3, i19, iVar3);
                } else {
                    l.q.r(i19, qVar3, i19, iVar3);
                }
                l.q.s(0, bVarI2, new m0.l2(qVar3), qVar3, 2058660585);
                y0.o oVarB7 = androidx.compose.ui.draw.a.b(androidx.compose.ui.draw.a.h(androidx.compose.foundation.layout.c.h(lVar, 100), ((Number) k0VarF.f14220d.getValue()).floatValue()), e0.f.f4988a);
                j10 = e5.a.f5125a;
                str6 = str5;
                y0.o oVarD14 = androidx.compose.foundation.a.d(oVarB7, a4.q.j(d7.t.e0(new e1.r(e1.r.b(j10, 0.3f)), new e1.r(e1.r.b(j10, 0.05f))), 0.0f, 14), null, 6);
                qVar3.Z(733328855);
                j0VarC2 = y.p.c(gVar, false, qVar3);
                qVar3.Z(-1323940314);
                i20 = qVar3.P;
                r1VarP3 = qVar3.p();
                bVarI3 = androidx.compose.ui.layout.a.i(oVarD14);
                if (!z13) {
                    m9.e0.C();
                    throw null;
                }
                qVar3.c0();
                if (qVar3.O) {
                    qVar3.o(jVar);
                } else {
                    qVar3.o0();
                }
                d7.t.s0(qVar3, j0VarC2, iVar);
                d7.t.s0(qVar3, r1VarP3, iVar2);
                if (qVar3.O) {
                    l.q.r(i20, qVar3, i20, iVar3);
                } else {
                    l.q.r(i20, qVar3, i20, iVar3);
                }
                bVarI3.e(new m0.l2(qVar3), qVar3, 0);
                qVar3.Z(2058660585);
                f11 = 48;
                k0.e1.b(z6.a.K(), "Update", androidx.compose.foundation.layout.c.h(lVar, f11), j10, qVar3, 3504, 0);
                l.q.v(qVar3, false, true, false, false);
                c5.b("Update Required", null, e5.a.f5136l, l.q.d(lVar, f10, qVar3, 26), null, f2.l.f6118f, null, 0L, null, new l2.i(3), 0L, 0, false, 0, 0, null, null, qVar3, 200070, 0, 130514);
                f12 = 12;
                long jD7 = l.q.d(lVar, f12, qVar3, 14);
                long j19 = e5.a.f5137m;
                c5.b("A new version of Ride Accepter is available.\nPlease update to continue using the app.", null, j19, jD7, null, null, null, 0L, null, new l2.i(3), o1.s.N(22), 0, false, 0, 0, null, null, qVar3, 3462, 6, 129522);
                f13 = 8;
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f13), qVar3);
                j11 = e5.a.f5132h;
                f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d5.p.f4710a, qVar3, 196614, 24);
                f14 = 16;
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f14), qVar3);
                qVar3.Z(991122215);
                if (str6.length() > 0) {
                    str7 = str6;
                    f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d7.t.K(qVar3, -1266085629, new d5.b(str7, 2)), qVar3, 196614, 24);
                } else {
                    str7 = str6;
                }
                qVar3.t(false);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, 24), qVar3);
                qVar3.Z(991123350);
                if (((Boolean) g1Var.getValue()).booleanValue()) {
                    g1Var3 = g1Var2;
                    d1Var2 = d1Var;
                    f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d7.t.K(qVar3, -1306056660, new u.l1(5, g1Var2, d1Var)), qVar3, 196614, 24);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f14), qVar3);
                } else {
                    g1Var3 = g1Var2;
                    d1Var2 = d1Var;
                    f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d7.t.K(qVar3, -1306056660, new u.l1(5, g1Var2, d1Var)), qVar3, 196614, 24);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f14), qVar3);
                }
                z14 = false;
                qVar3.t(false);
                qVar3.Z(991125275);
                if (((Boolean) g1Var3.getValue()).booleanValue()) {
                    context2 = context;
                    qVar = qVar3;
                    z15 = true;
                    lVar2 = lVar;
                    f15 = f12;
                    i21 = 52;
                } else {
                    context2 = context;
                    qVar = qVar3;
                    z15 = true;
                    lVar2 = lVar;
                    f15 = f12;
                    i21 = 52;
                }
                qVar.t(z14);
                qVar.Z(991126226);
                if (((Boolean) g1Var3.getValue()).booleanValue()) {
                    context3 = context2;
                    lVar3 = lVar2;
                    qVar2 = qVar;
                    j12 = r43;
                    z16 = z14;
                } else {
                    context3 = context2;
                    lVar3 = lVar2;
                    qVar2 = qVar;
                    j12 = r43;
                    z16 = z14;
                }
                qVar2.t(z16);
                qVar2.Z(991128322);
                if (str2.length() > 0) {
                    m9.e0.g(new u.r0(17, str2, context3), androidx.compose.foundation.layout.c.c(fillElement, f11), false, e0.f.a(14), null, null, new u.w(k0.z.f(qVar2).f14967a, a4.q.i(d7.t.e0(new e1.r(j12), new e1.r(e5.a.f5128d)))), null, null, d5.p.f4712c, qVar2, 805306416, 436);
                    z17 = false;
                } else {
                    z17 = z16;
                }
                qVar2.t(z17);
                qVar2.Z(991129516);
                if (str.length() == 0) {
                    f16 = f13;
                } else {
                    f16 = f13;
                }
                qVar2.t(false);
                qVar2.Z(-723979200);
                if (z12) {
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar3, f16), qVar2);
                    m9.e0.j(aVar3, fillElement, false, null, null, null, null, null, null, d5.p.f4713d, qVar2, ((i17 >> 12) & 14) | 805306416, 508);
                }
                l.q.v(qVar2, false, false, true, false);
                l.q.v(qVar2, false, false, true, false);
                qVar2.t(false);
                z18 = z12;
                aVar4 = aVar3;
            }
            x1VarX = qVar2.x();
            if (x1VarX != null) {
                x1VarX.f11756d = new d5.y(str, str2, str7, z18, aVar4, i10, i11);
            }
        }
        i12 |= 384;
        str4 = str3;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 7168) == 0) {
                z11 = z10;
                if (qVar3.h(z11)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((57344 & i10) == 0) {
                    aVar2 = aVar;
                    if (qVar3.i(aVar2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i12;
                if ((i17 & 46811) == 9362) {
                    if (i22 != 0) {
                        str5 = "";
                    } else {
                        str5 = str4;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        aVar3 = d5.v.f4796a;
                    } else {
                        aVar3 = aVar2;
                    }
                    context = (Context) qVar3.m(u1.y0.f15377b);
                    qVar3.Z(-1449374496);
                    objP = qVar3.P();
                    y0Var = m0.l.f11578a;
                    o3Var = o3.f11621a;
                    if (objP == y0Var) {
                        objP = d7.t.g0(Boolean.FALSE, o3Var);
                        qVar3.l0(objP);
                    }
                    g1Var = (m0.g1) objP;
                    objF = l.q.f(qVar3, false, -1449374433);
                    if (objF == y0Var) {
                        objF = m9.e0.H(0.0f);
                        qVar3.l0(objF);
                    }
                    d1Var = (m0.d1) objF;
                    objF2 = l.q.f(qVar3, false, -1449374368);
                    if (objF2 == y0Var) {
                        objF2 = d7.t.g0(Boolean.FALSE, o3Var);
                        qVar3.l0(objF2);
                    }
                    g1Var2 = (m0.g1) objF2;
                    objF3 = l.q.f(qVar3, false, -1449374311);
                    if (objF3 == y0Var) {
                        int i210 = m0.b.f11457b;
                        objF3 = new m0.m1(-1L);
                        qVar3.l0(objF3);
                    }
                    m0.f1 f1Var8 = (m0.f1) objF3;
                    objF4 = l.q.f(qVar3, false, -1449374248);
                    if (objF4 == y0Var) {
                        objF4 = d7.t.g0(null, o3Var);
                        qVar3.l0(objF4);
                    }
                    m0.g1 g1Var11 = (m0.g1) objF4;
                    qVar3.t(false);
                    k0VarF = t.e.f(t.e.q("pulse", qVar3, 0), 1.0f, 1.15f, t.e.p(t.e.s(800, 0, t.c0.f14096b, 2), 2, 4), "pulseScale", qVar3, 29112, 0);
                    w2 w2Var8 = (w2) f1Var8;
                    m0.s.a(Long.valueOf(w2Var8.d()), new y.r(context, f1Var8, g1Var, g1Var2, d1Var, g1Var11, 1), qVar3);
                    m0.s.c(Boolean.valueOf(((Boolean) g1Var.getValue()).booleanValue()), Long.valueOf(w2Var8.d()), new d5.x(context, g1Var, f1Var8, d1Var, g1Var2, g1Var11, null), qVar3);
                    lVar = y0.l.f16729b;
                    y0.o oVarD15 = androidx.compose.foundation.a.d(androidx.compose.foundation.layout.c.f1668b, a4.q.n(d7.t.e0(new e1.r(androidx.compose.ui.graphics.a.c(4278520344L)), new e1.r(androidx.compose.ui.graphics.a.c(4278851904L)), new e1.r(androidx.compose.ui.graphics.a.c(4279180085L)), new e1.r(androidx.compose.ui.graphics.a.c(4278520344L)))), null, 6);
                    gVar = y0.a.f16710c;
                    qVar3.Z(733328855);
                    j0VarC = y.p.c(gVar, false, qVar3);
                    qVar3.Z(-1323940314);
                    i18 = qVar3.P;
                    r1VarP = qVar3.p();
                    t1.l.f14477k.getClass();
                    jVar = t1.k.f14458b;
                    bVarI = androidx.compose.ui.layout.a.i(oVarD15);
                    z13 = qVar3.f11630a instanceof m0.d;
                    if (!z13) {
                        m9.e0.C();
                        throw null;
                    }
                    qVar3.c0();
                    if (qVar3.O) {
                        qVar3.o(jVar);
                    } else {
                        qVar3.o0();
                    }
                    iVar = t1.k.f14461e;
                    d7.t.s0(qVar3, j0VarC, iVar);
                    iVar2 = t1.k.f14460d;
                    d7.t.s0(qVar3, r1VarP, iVar2);
                    iVar3 = t1.k.f14462f;
                    if (qVar3.O) {
                        l.q.r(i18, qVar3, i18, iVar3);
                    } else {
                        l.q.r(i18, qVar3, i18, iVar3);
                    }
                    l.q.s(0, bVarI, new m0.l2(qVar3), qVar3, 2058660585);
                    fillElement = androidx.compose.foundation.layout.c.f1667a;
                    f10 = 32;
                    y0.o oVarN8 = androidx.compose.foundation.layout.a.n(androidx.compose.foundation.a.n(fillElement, androidx.compose.foundation.a.l(qVar3)), f10, 0.0f, 2);
                    y0.e eVar8 = y0.a.f16716p;
                    qVar3.Z(-483455358);
                    j0VarA = y.u.a(y.k.f16607c, eVar8, qVar3);
                    qVar3.Z(-1323940314);
                    i19 = qVar3.P;
                    r1VarP2 = qVar3.p();
                    bVarI2 = androidx.compose.ui.layout.a.i(oVarN8);
                    if (!z13) {
                        m9.e0.C();
                        throw null;
                    }
                    qVar3.c0();
                    if (qVar3.O) {
                        qVar3.o(jVar);
                    } else {
                        qVar3.o0();
                    }
                    d7.t.s0(qVar3, j0VarA, iVar);
                    d7.t.s0(qVar3, r1VarP2, iVar2);
                    if (qVar3.O) {
                        l.q.r(i19, qVar3, i19, iVar3);
                    } else {
                        l.q.r(i19, qVar3, i19, iVar3);
                    }
                    l.q.s(0, bVarI2, new m0.l2(qVar3), qVar3, 2058660585);
                    y0.o oVarB8 = androidx.compose.ui.draw.a.b(androidx.compose.ui.draw.a.h(androidx.compose.foundation.layout.c.h(lVar, 100), ((Number) k0VarF.f14220d.getValue()).floatValue()), e0.f.f4988a);
                    j10 = e5.a.f5125a;
                    str6 = str5;
                    y0.o oVarD16 = androidx.compose.foundation.a.d(oVarB8, a4.q.j(d7.t.e0(new e1.r(e1.r.b(j10, 0.3f)), new e1.r(e1.r.b(j10, 0.05f))), 0.0f, 14), null, 6);
                    qVar3.Z(733328855);
                    j0VarC2 = y.p.c(gVar, false, qVar3);
                    qVar3.Z(-1323940314);
                    i20 = qVar3.P;
                    r1VarP3 = qVar3.p();
                    bVarI3 = androidx.compose.ui.layout.a.i(oVarD16);
                    if (!z13) {
                        m9.e0.C();
                        throw null;
                    }
                    qVar3.c0();
                    if (qVar3.O) {
                        qVar3.o(jVar);
                    } else {
                        qVar3.o0();
                    }
                    d7.t.s0(qVar3, j0VarC2, iVar);
                    d7.t.s0(qVar3, r1VarP3, iVar2);
                    if (qVar3.O) {
                        l.q.r(i20, qVar3, i20, iVar3);
                    } else {
                        l.q.r(i20, qVar3, i20, iVar3);
                    }
                    bVarI3.e(new m0.l2(qVar3), qVar3, 0);
                    qVar3.Z(2058660585);
                    f11 = 48;
                    k0.e1.b(z6.a.K(), "Update", androidx.compose.foundation.layout.c.h(lVar, f11), j10, qVar3, 3504, 0);
                    l.q.v(qVar3, false, true, false, false);
                    c5.b("Update Required", null, e5.a.f5136l, l.q.d(lVar, f10, qVar3, 26), null, f2.l.f6118f, null, 0L, null, new l2.i(3), 0L, 0, false, 0, 0, null, null, qVar3, 200070, 0, 130514);
                    f12 = 12;
                    long jD8 = l.q.d(lVar, f12, qVar3, 14);
                    long j110 = e5.a.f5137m;
                    c5.b("A new version of Ride Accepter is available.\nPlease update to continue using the app.", null, j110, jD8, null, null, null, 0L, null, new l2.i(3), o1.s.N(22), 0, false, 0, 0, null, null, qVar3, 3462, 6, 129522);
                    f13 = 8;
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f13), qVar3);
                    j11 = e5.a.f5132h;
                    f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d5.p.f4710a, qVar3, 196614, 24);
                    f14 = 16;
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f14), qVar3);
                    qVar3.Z(991122215);
                    if (str6.length() > 0) {
                        str7 = str6;
                        f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d7.t.K(qVar3, -1266085629, new d5.b(str7, 2)), qVar3, 196614, 24);
                    } else {
                        str7 = str6;
                    }
                    qVar3.t(false);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, 24), qVar3);
                    qVar3.Z(991123350);
                    if (((Boolean) g1Var.getValue()).booleanValue()) {
                        g1Var3 = g1Var2;
                        d1Var2 = d1Var;
                        f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d7.t.K(qVar3, -1306056660, new u.l1(5, g1Var2, d1Var)), qVar3, 196614, 24);
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f14), qVar3);
                    } else {
                        g1Var3 = g1Var2;
                        d1Var2 = d1Var;
                        f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d7.t.K(qVar3, -1306056660, new u.l1(5, g1Var2, d1Var)), qVar3, 196614, 24);
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f14), qVar3);
                    }
                    z14 = false;
                    qVar3.t(false);
                    qVar3.Z(991125275);
                    if (((Boolean) g1Var3.getValue()).booleanValue()) {
                        context2 = context;
                        qVar = qVar3;
                        z15 = true;
                        lVar2 = lVar;
                        f15 = f12;
                        i21 = 52;
                    } else {
                        context2 = context;
                        qVar = qVar3;
                        z15 = true;
                        lVar2 = lVar;
                        f15 = f12;
                        i21 = 52;
                    }
                    qVar.t(z14);
                    qVar.Z(991126226);
                    if (((Boolean) g1Var3.getValue()).booleanValue()) {
                        context3 = context2;
                        lVar3 = lVar2;
                        qVar2 = qVar;
                        j12 = r43;
                        z16 = z14;
                    } else {
                        context3 = context2;
                        lVar3 = lVar2;
                        qVar2 = qVar;
                        j12 = r43;
                        z16 = z14;
                    }
                    qVar2.t(z16);
                    qVar2.Z(991128322);
                    if (str2.length() > 0) {
                        m9.e0.g(new u.r0(17, str2, context3), androidx.compose.foundation.layout.c.c(fillElement, f11), false, e0.f.a(14), null, null, new u.w(k0.z.f(qVar2).f14967a, a4.q.i(d7.t.e0(new e1.r(j12), new e1.r(e5.a.f5128d)))), null, null, d5.p.f4712c, qVar2, 805306416, 436);
                        z17 = false;
                    } else {
                        z17 = z16;
                    }
                    qVar2.t(z17);
                    qVar2.Z(991129516);
                    if (str.length() == 0) {
                        f16 = f13;
                    } else {
                        f16 = f13;
                    }
                    qVar2.t(false);
                    qVar2.Z(-723979200);
                    if (z12) {
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar3, f16), qVar2);
                        m9.e0.j(aVar3, fillElement, false, null, null, null, null, null, null, d5.p.f4713d, qVar2, ((i17 >> 12) & 14) | 805306416, 508);
                    }
                    l.q.v(qVar2, false, false, true, false);
                    l.q.v(qVar2, false, false, true, false);
                    qVar2.t(false);
                    z18 = z12;
                    aVar4 = aVar3;
                } else {
                    if (i22 != 0) {
                        str5 = "";
                    } else {
                        str5 = str4;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        aVar3 = d5.v.f4796a;
                    } else {
                        aVar3 = aVar2;
                    }
                    context = (Context) qVar3.m(u1.y0.f15377b);
                    qVar3.Z(-1449374496);
                    objP = qVar3.P();
                    y0Var = m0.l.f11578a;
                    o3Var = o3.f11621a;
                    if (objP == y0Var) {
                        objP = d7.t.g0(Boolean.FALSE, o3Var);
                        qVar3.l0(objP);
                    }
                    g1Var = (m0.g1) objP;
                    objF = l.q.f(qVar3, false, -1449374433);
                    if (objF == y0Var) {
                        objF = m9.e0.H(0.0f);
                        qVar3.l0(objF);
                    }
                    d1Var = (m0.d1) objF;
                    objF2 = l.q.f(qVar3, false, -1449374368);
                    if (objF2 == y0Var) {
                        objF2 = d7.t.g0(Boolean.FALSE, o3Var);
                        qVar3.l0(objF2);
                    }
                    g1Var2 = (m0.g1) objF2;
                    objF3 = l.q.f(qVar3, false, -1449374311);
                    if (objF3 == y0Var) {
                        int i211 = m0.b.f11457b;
                        objF3 = new m0.m1(-1L);
                        qVar3.l0(objF3);
                    }
                    m0.f1 f1Var9 = (m0.f1) objF3;
                    objF4 = l.q.f(qVar3, false, -1449374248);
                    if (objF4 == y0Var) {
                        objF4 = d7.t.g0(null, o3Var);
                        qVar3.l0(objF4);
                    }
                    m0.g1 g1Var12 = (m0.g1) objF4;
                    qVar3.t(false);
                    k0VarF = t.e.f(t.e.q("pulse", qVar3, 0), 1.0f, 1.15f, t.e.p(t.e.s(800, 0, t.c0.f14096b, 2), 2, 4), "pulseScale", qVar3, 29112, 0);
                    w2 w2Var9 = (w2) f1Var9;
                    m0.s.a(Long.valueOf(w2Var9.d()), new y.r(context, f1Var9, g1Var, g1Var2, d1Var, g1Var12, 1), qVar3);
                    m0.s.c(Boolean.valueOf(((Boolean) g1Var.getValue()).booleanValue()), Long.valueOf(w2Var9.d()), new d5.x(context, g1Var, f1Var9, d1Var, g1Var2, g1Var12, null), qVar3);
                    lVar = y0.l.f16729b;
                    y0.o oVarD17 = androidx.compose.foundation.a.d(androidx.compose.foundation.layout.c.f1668b, a4.q.n(d7.t.e0(new e1.r(androidx.compose.ui.graphics.a.c(4278520344L)), new e1.r(androidx.compose.ui.graphics.a.c(4278851904L)), new e1.r(androidx.compose.ui.graphics.a.c(4279180085L)), new e1.r(androidx.compose.ui.graphics.a.c(4278520344L)))), null, 6);
                    gVar = y0.a.f16710c;
                    qVar3.Z(733328855);
                    j0VarC = y.p.c(gVar, false, qVar3);
                    qVar3.Z(-1323940314);
                    i18 = qVar3.P;
                    r1VarP = qVar3.p();
                    t1.l.f14477k.getClass();
                    jVar = t1.k.f14458b;
                    bVarI = androidx.compose.ui.layout.a.i(oVarD17);
                    z13 = qVar3.f11630a instanceof m0.d;
                    if (!z13) {
                        m9.e0.C();
                        throw null;
                    }
                    qVar3.c0();
                    if (qVar3.O) {
                        qVar3.o(jVar);
                    } else {
                        qVar3.o0();
                    }
                    iVar = t1.k.f14461e;
                    d7.t.s0(qVar3, j0VarC, iVar);
                    iVar2 = t1.k.f14460d;
                    d7.t.s0(qVar3, r1VarP, iVar2);
                    iVar3 = t1.k.f14462f;
                    if (qVar3.O) {
                        l.q.r(i18, qVar3, i18, iVar3);
                    } else {
                        l.q.r(i18, qVar3, i18, iVar3);
                    }
                    l.q.s(0, bVarI, new m0.l2(qVar3), qVar3, 2058660585);
                    fillElement = androidx.compose.foundation.layout.c.f1667a;
                    f10 = 32;
                    y0.o oVarN9 = androidx.compose.foundation.layout.a.n(androidx.compose.foundation.a.n(fillElement, androidx.compose.foundation.a.l(qVar3)), f10, 0.0f, 2);
                    y0.e eVar9 = y0.a.f16716p;
                    qVar3.Z(-483455358);
                    j0VarA = y.u.a(y.k.f16607c, eVar9, qVar3);
                    qVar3.Z(-1323940314);
                    i19 = qVar3.P;
                    r1VarP2 = qVar3.p();
                    bVarI2 = androidx.compose.ui.layout.a.i(oVarN9);
                    if (!z13) {
                        m9.e0.C();
                        throw null;
                    }
                    qVar3.c0();
                    if (qVar3.O) {
                        qVar3.o(jVar);
                    } else {
                        qVar3.o0();
                    }
                    d7.t.s0(qVar3, j0VarA, iVar);
                    d7.t.s0(qVar3, r1VarP2, iVar2);
                    if (qVar3.O) {
                        l.q.r(i19, qVar3, i19, iVar3);
                    } else {
                        l.q.r(i19, qVar3, i19, iVar3);
                    }
                    l.q.s(0, bVarI2, new m0.l2(qVar3), qVar3, 2058660585);
                    y0.o oVarB9 = androidx.compose.ui.draw.a.b(androidx.compose.ui.draw.a.h(androidx.compose.foundation.layout.c.h(lVar, 100), ((Number) k0VarF.f14220d.getValue()).floatValue()), e0.f.f4988a);
                    j10 = e5.a.f5125a;
                    str6 = str5;
                    y0.o oVarD18 = androidx.compose.foundation.a.d(oVarB9, a4.q.j(d7.t.e0(new e1.r(e1.r.b(j10, 0.3f)), new e1.r(e1.r.b(j10, 0.05f))), 0.0f, 14), null, 6);
                    qVar3.Z(733328855);
                    j0VarC2 = y.p.c(gVar, false, qVar3);
                    qVar3.Z(-1323940314);
                    i20 = qVar3.P;
                    r1VarP3 = qVar3.p();
                    bVarI3 = androidx.compose.ui.layout.a.i(oVarD18);
                    if (!z13) {
                        m9.e0.C();
                        throw null;
                    }
                    qVar3.c0();
                    if (qVar3.O) {
                        qVar3.o(jVar);
                    } else {
                        qVar3.o0();
                    }
                    d7.t.s0(qVar3, j0VarC2, iVar);
                    d7.t.s0(qVar3, r1VarP3, iVar2);
                    if (qVar3.O) {
                        l.q.r(i20, qVar3, i20, iVar3);
                    } else {
                        l.q.r(i20, qVar3, i20, iVar3);
                    }
                    bVarI3.e(new m0.l2(qVar3), qVar3, 0);
                    qVar3.Z(2058660585);
                    f11 = 48;
                    k0.e1.b(z6.a.K(), "Update", androidx.compose.foundation.layout.c.h(lVar, f11), j10, qVar3, 3504, 0);
                    l.q.v(qVar3, false, true, false, false);
                    c5.b("Update Required", null, e5.a.f5136l, l.q.d(lVar, f10, qVar3, 26), null, f2.l.f6118f, null, 0L, null, new l2.i(3), 0L, 0, false, 0, 0, null, null, qVar3, 200070, 0, 130514);
                    f12 = 12;
                    long jD9 = l.q.d(lVar, f12, qVar3, 14);
                    long j111 = e5.a.f5137m;
                    c5.b("A new version of Ride Accepter is available.\nPlease update to continue using the app.", null, j111, jD9, null, null, null, 0L, null, new l2.i(3), o1.s.N(22), 0, false, 0, 0, null, null, qVar3, 3462, 6, 129522);
                    f13 = 8;
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f13), qVar3);
                    j11 = e5.a.f5132h;
                    f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d5.p.f4710a, qVar3, 196614, 24);
                    f14 = 16;
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f14), qVar3);
                    qVar3.Z(991122215);
                    if (str6.length() > 0) {
                        str7 = str6;
                        f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d7.t.K(qVar3, -1266085629, new d5.b(str7, 2)), qVar3, 196614, 24);
                    } else {
                        str7 = str6;
                    }
                    qVar3.t(false);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, 24), qVar3);
                    qVar3.Z(991123350);
                    if (((Boolean) g1Var.getValue()).booleanValue()) {
                        g1Var3 = g1Var2;
                        d1Var2 = d1Var;
                        f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d7.t.K(qVar3, -1306056660, new u.l1(5, g1Var2, d1Var)), qVar3, 196614, 24);
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f14), qVar3);
                    } else {
                        g1Var3 = g1Var2;
                        d1Var2 = d1Var;
                        f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d7.t.K(qVar3, -1306056660, new u.l1(5, g1Var2, d1Var)), qVar3, 196614, 24);
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f14), qVar3);
                    }
                    z14 = false;
                    qVar3.t(false);
                    qVar3.Z(991125275);
                    if (((Boolean) g1Var3.getValue()).booleanValue()) {
                        context2 = context;
                        qVar = qVar3;
                        z15 = true;
                        lVar2 = lVar;
                        f15 = f12;
                        i21 = 52;
                    } else {
                        context2 = context;
                        qVar = qVar3;
                        z15 = true;
                        lVar2 = lVar;
                        f15 = f12;
                        i21 = 52;
                    }
                    qVar.t(z14);
                    qVar.Z(991126226);
                    if (((Boolean) g1Var3.getValue()).booleanValue()) {
                        context3 = context2;
                        lVar3 = lVar2;
                        qVar2 = qVar;
                        j12 = r43;
                        z16 = z14;
                    } else {
                        context3 = context2;
                        lVar3 = lVar2;
                        qVar2 = qVar;
                        j12 = r43;
                        z16 = z14;
                    }
                    qVar2.t(z16);
                    qVar2.Z(991128322);
                    if (str2.length() > 0) {
                        m9.e0.g(new u.r0(17, str2, context3), androidx.compose.foundation.layout.c.c(fillElement, f11), false, e0.f.a(14), null, null, new u.w(k0.z.f(qVar2).f14967a, a4.q.i(d7.t.e0(new e1.r(j12), new e1.r(e5.a.f5128d)))), null, null, d5.p.f4712c, qVar2, 805306416, 436);
                        z17 = false;
                    } else {
                        z17 = z16;
                    }
                    qVar2.t(z17);
                    qVar2.Z(991129516);
                    if (str.length() == 0) {
                        f16 = f13;
                    } else {
                        f16 = f13;
                    }
                    qVar2.t(false);
                    qVar2.Z(-723979200);
                    if (z12) {
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar3, f16), qVar2);
                        m9.e0.j(aVar3, fillElement, false, null, null, null, null, null, null, d5.p.f4713d, qVar2, ((i17 >> 12) & 14) | 805306416, 508);
                    }
                    l.q.v(qVar2, false, false, true, false);
                    l.q.v(qVar2, false, false, true, false);
                    qVar2.t(false);
                    z18 = z12;
                    aVar4 = aVar3;
                }
                x1VarX = qVar2.x();
                if (x1VarX != null) {
                    x1VarX.f11756d = new d5.y(str, str2, str7, z18, aVar4, i10, i11);
                }
            }
            i12 |= 24576;
            aVar2 = aVar;
            i17 = i12;
            if ((i17 & 46811) == 9362) {
                if (i22 != 0) {
                    str5 = "";
                } else {
                    str5 = str4;
                }
                if (i13 != 0) {
                    z12 = false;
                } else {
                    z12 = z11;
                }
                if (i15 != 0) {
                    aVar3 = d5.v.f4796a;
                } else {
                    aVar3 = aVar2;
                }
                context = (Context) qVar3.m(u1.y0.f15377b);
                qVar3.Z(-1449374496);
                objP = qVar3.P();
                y0Var = m0.l.f11578a;
                o3Var = o3.f11621a;
                if (objP == y0Var) {
                    objP = d7.t.g0(Boolean.FALSE, o3Var);
                    qVar3.l0(objP);
                }
                g1Var = (m0.g1) objP;
                objF = l.q.f(qVar3, false, -1449374433);
                if (objF == y0Var) {
                    objF = m9.e0.H(0.0f);
                    qVar3.l0(objF);
                }
                d1Var = (m0.d1) objF;
                objF2 = l.q.f(qVar3, false, -1449374368);
                if (objF2 == y0Var) {
                    objF2 = d7.t.g0(Boolean.FALSE, o3Var);
                    qVar3.l0(objF2);
                }
                g1Var2 = (m0.g1) objF2;
                objF3 = l.q.f(qVar3, false, -1449374311);
                if (objF3 == y0Var) {
                    int i212 = m0.b.f11457b;
                    objF3 = new m0.m1(-1L);
                    qVar3.l0(objF3);
                }
                m0.f1 f1Var10 = (m0.f1) objF3;
                objF4 = l.q.f(qVar3, false, -1449374248);
                if (objF4 == y0Var) {
                    objF4 = d7.t.g0(null, o3Var);
                    qVar3.l0(objF4);
                }
                m0.g1 g1Var13 = (m0.g1) objF4;
                qVar3.t(false);
                k0VarF = t.e.f(t.e.q("pulse", qVar3, 0), 1.0f, 1.15f, t.e.p(t.e.s(800, 0, t.c0.f14096b, 2), 2, 4), "pulseScale", qVar3, 29112, 0);
                w2 w2Var10 = (w2) f1Var10;
                m0.s.a(Long.valueOf(w2Var10.d()), new y.r(context, f1Var10, g1Var, g1Var2, d1Var, g1Var13, 1), qVar3);
                m0.s.c(Boolean.valueOf(((Boolean) g1Var.getValue()).booleanValue()), Long.valueOf(w2Var10.d()), new d5.x(context, g1Var, f1Var10, d1Var, g1Var2, g1Var13, null), qVar3);
                lVar = y0.l.f16729b;
                y0.o oVarD19 = androidx.compose.foundation.a.d(androidx.compose.foundation.layout.c.f1668b, a4.q.n(d7.t.e0(new e1.r(androidx.compose.ui.graphics.a.c(4278520344L)), new e1.r(androidx.compose.ui.graphics.a.c(4278851904L)), new e1.r(androidx.compose.ui.graphics.a.c(4279180085L)), new e1.r(androidx.compose.ui.graphics.a.c(4278520344L)))), null, 6);
                gVar = y0.a.f16710c;
                qVar3.Z(733328855);
                j0VarC = y.p.c(gVar, false, qVar3);
                qVar3.Z(-1323940314);
                i18 = qVar3.P;
                r1VarP = qVar3.p();
                t1.l.f14477k.getClass();
                jVar = t1.k.f14458b;
                bVarI = androidx.compose.ui.layout.a.i(oVarD19);
                z13 = qVar3.f11630a instanceof m0.d;
                if (!z13) {
                    m9.e0.C();
                    throw null;
                }
                qVar3.c0();
                if (qVar3.O) {
                    qVar3.o(jVar);
                } else {
                    qVar3.o0();
                }
                iVar = t1.k.f14461e;
                d7.t.s0(qVar3, j0VarC, iVar);
                iVar2 = t1.k.f14460d;
                d7.t.s0(qVar3, r1VarP, iVar2);
                iVar3 = t1.k.f14462f;
                if (qVar3.O) {
                    l.q.r(i18, qVar3, i18, iVar3);
                } else {
                    l.q.r(i18, qVar3, i18, iVar3);
                }
                l.q.s(0, bVarI, new m0.l2(qVar3), qVar3, 2058660585);
                fillElement = androidx.compose.foundation.layout.c.f1667a;
                f10 = 32;
                y0.o oVarN10 = androidx.compose.foundation.layout.a.n(androidx.compose.foundation.a.n(fillElement, androidx.compose.foundation.a.l(qVar3)), f10, 0.0f, 2);
                y0.e eVar10 = y0.a.f16716p;
                qVar3.Z(-483455358);
                j0VarA = y.u.a(y.k.f16607c, eVar10, qVar3);
                qVar3.Z(-1323940314);
                i19 = qVar3.P;
                r1VarP2 = qVar3.p();
                bVarI2 = androidx.compose.ui.layout.a.i(oVarN10);
                if (!z13) {
                    m9.e0.C();
                    throw null;
                }
                qVar3.c0();
                if (qVar3.O) {
                    qVar3.o(jVar);
                } else {
                    qVar3.o0();
                }
                d7.t.s0(qVar3, j0VarA, iVar);
                d7.t.s0(qVar3, r1VarP2, iVar2);
                if (qVar3.O) {
                    l.q.r(i19, qVar3, i19, iVar3);
                } else {
                    l.q.r(i19, qVar3, i19, iVar3);
                }
                l.q.s(0, bVarI2, new m0.l2(qVar3), qVar3, 2058660585);
                y0.o oVarB10 = androidx.compose.ui.draw.a.b(androidx.compose.ui.draw.a.h(androidx.compose.foundation.layout.c.h(lVar, 100), ((Number) k0VarF.f14220d.getValue()).floatValue()), e0.f.f4988a);
                j10 = e5.a.f5125a;
                str6 = str5;
                y0.o oVarD110 = androidx.compose.foundation.a.d(oVarB10, a4.q.j(d7.t.e0(new e1.r(e1.r.b(j10, 0.3f)), new e1.r(e1.r.b(j10, 0.05f))), 0.0f, 14), null, 6);
                qVar3.Z(733328855);
                j0VarC2 = y.p.c(gVar, false, qVar3);
                qVar3.Z(-1323940314);
                i20 = qVar3.P;
                r1VarP3 = qVar3.p();
                bVarI3 = androidx.compose.ui.layout.a.i(oVarD110);
                if (!z13) {
                    m9.e0.C();
                    throw null;
                }
                qVar3.c0();
                if (qVar3.O) {
                    qVar3.o(jVar);
                } else {
                    qVar3.o0();
                }
                d7.t.s0(qVar3, j0VarC2, iVar);
                d7.t.s0(qVar3, r1VarP3, iVar2);
                if (qVar3.O) {
                    l.q.r(i20, qVar3, i20, iVar3);
                } else {
                    l.q.r(i20, qVar3, i20, iVar3);
                }
                bVarI3.e(new m0.l2(qVar3), qVar3, 0);
                qVar3.Z(2058660585);
                f11 = 48;
                k0.e1.b(z6.a.K(), "Update", androidx.compose.foundation.layout.c.h(lVar, f11), j10, qVar3, 3504, 0);
                l.q.v(qVar3, false, true, false, false);
                c5.b("Update Required", null, e5.a.f5136l, l.q.d(lVar, f10, qVar3, 26), null, f2.l.f6118f, null, 0L, null, new l2.i(3), 0L, 0, false, 0, 0, null, null, qVar3, 200070, 0, 130514);
                f12 = 12;
                long jD10 = l.q.d(lVar, f12, qVar3, 14);
                long j112 = e5.a.f5137m;
                c5.b("A new version of Ride Accepter is available.\nPlease update to continue using the app.", null, j112, jD10, null, null, null, 0L, null, new l2.i(3), o1.s.N(22), 0, false, 0, 0, null, null, qVar3, 3462, 6, 129522);
                f13 = 8;
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f13), qVar3);
                j11 = e5.a.f5132h;
                f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d5.p.f4710a, qVar3, 196614, 24);
                f14 = 16;
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f14), qVar3);
                qVar3.Z(991122215);
                if (str6.length() > 0) {
                    str7 = str6;
                    f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d7.t.K(qVar3, -1266085629, new d5.b(str7, 2)), qVar3, 196614, 24);
                } else {
                    str7 = str6;
                }
                qVar3.t(false);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, 24), qVar3);
                qVar3.Z(991123350);
                if (((Boolean) g1Var.getValue()).booleanValue()) {
                    g1Var3 = g1Var2;
                    d1Var2 = d1Var;
                    f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d7.t.K(qVar3, -1306056660, new u.l1(5, g1Var2, d1Var)), qVar3, 196614, 24);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f14), qVar3);
                } else {
                    g1Var3 = g1Var2;
                    d1Var2 = d1Var;
                    f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d7.t.K(qVar3, -1306056660, new u.l1(5, g1Var2, d1Var)), qVar3, 196614, 24);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f14), qVar3);
                }
                z14 = false;
                qVar3.t(false);
                qVar3.Z(991125275);
                if (((Boolean) g1Var3.getValue()).booleanValue()) {
                    context2 = context;
                    qVar = qVar3;
                    z15 = true;
                    lVar2 = lVar;
                    f15 = f12;
                    i21 = 52;
                } else {
                    context2 = context;
                    qVar = qVar3;
                    z15 = true;
                    lVar2 = lVar;
                    f15 = f12;
                    i21 = 52;
                }
                qVar.t(z14);
                qVar.Z(991126226);
                if (((Boolean) g1Var3.getValue()).booleanValue()) {
                    context3 = context2;
                    lVar3 = lVar2;
                    qVar2 = qVar;
                    j12 = r43;
                    z16 = z14;
                } else {
                    context3 = context2;
                    lVar3 = lVar2;
                    qVar2 = qVar;
                    j12 = r43;
                    z16 = z14;
                }
                qVar2.t(z16);
                qVar2.Z(991128322);
                if (str2.length() > 0) {
                    m9.e0.g(new u.r0(17, str2, context3), androidx.compose.foundation.layout.c.c(fillElement, f11), false, e0.f.a(14), null, null, new u.w(k0.z.f(qVar2).f14967a, a4.q.i(d7.t.e0(new e1.r(j12), new e1.r(e5.a.f5128d)))), null, null, d5.p.f4712c, qVar2, 805306416, 436);
                    z17 = false;
                } else {
                    z17 = z16;
                }
                qVar2.t(z17);
                qVar2.Z(991129516);
                if (str.length() == 0) {
                    f16 = f13;
                } else {
                    f16 = f13;
                }
                qVar2.t(false);
                qVar2.Z(-723979200);
                if (z12) {
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar3, f16), qVar2);
                    m9.e0.j(aVar3, fillElement, false, null, null, null, null, null, null, d5.p.f4713d, qVar2, ((i17 >> 12) & 14) | 805306416, 508);
                }
                l.q.v(qVar2, false, false, true, false);
                l.q.v(qVar2, false, false, true, false);
                qVar2.t(false);
                z18 = z12;
                aVar4 = aVar3;
            } else {
                if (i22 != 0) {
                    str5 = "";
                } else {
                    str5 = str4;
                }
                if (i13 != 0) {
                    z12 = false;
                } else {
                    z12 = z11;
                }
                if (i15 != 0) {
                    aVar3 = d5.v.f4796a;
                } else {
                    aVar3 = aVar2;
                }
                context = (Context) qVar3.m(u1.y0.f15377b);
                qVar3.Z(-1449374496);
                objP = qVar3.P();
                y0Var = m0.l.f11578a;
                o3Var = o3.f11621a;
                if (objP == y0Var) {
                    objP = d7.t.g0(Boolean.FALSE, o3Var);
                    qVar3.l0(objP);
                }
                g1Var = (m0.g1) objP;
                objF = l.q.f(qVar3, false, -1449374433);
                if (objF == y0Var) {
                    objF = m9.e0.H(0.0f);
                    qVar3.l0(objF);
                }
                d1Var = (m0.d1) objF;
                objF2 = l.q.f(qVar3, false, -1449374368);
                if (objF2 == y0Var) {
                    objF2 = d7.t.g0(Boolean.FALSE, o3Var);
                    qVar3.l0(objF2);
                }
                g1Var2 = (m0.g1) objF2;
                objF3 = l.q.f(qVar3, false, -1449374311);
                if (objF3 == y0Var) {
                    int i213 = m0.b.f11457b;
                    objF3 = new m0.m1(-1L);
                    qVar3.l0(objF3);
                }
                m0.f1 f1Var11 = (m0.f1) objF3;
                objF4 = l.q.f(qVar3, false, -1449374248);
                if (objF4 == y0Var) {
                    objF4 = d7.t.g0(null, o3Var);
                    qVar3.l0(objF4);
                }
                m0.g1 g1Var14 = (m0.g1) objF4;
                qVar3.t(false);
                k0VarF = t.e.f(t.e.q("pulse", qVar3, 0), 1.0f, 1.15f, t.e.p(t.e.s(800, 0, t.c0.f14096b, 2), 2, 4), "pulseScale", qVar3, 29112, 0);
                w2 w2Var11 = (w2) f1Var11;
                m0.s.a(Long.valueOf(w2Var11.d()), new y.r(context, f1Var11, g1Var, g1Var2, d1Var, g1Var14, 1), qVar3);
                m0.s.c(Boolean.valueOf(((Boolean) g1Var.getValue()).booleanValue()), Long.valueOf(w2Var11.d()), new d5.x(context, g1Var, f1Var11, d1Var, g1Var2, g1Var14, null), qVar3);
                lVar = y0.l.f16729b;
                y0.o oVarD111 = androidx.compose.foundation.a.d(androidx.compose.foundation.layout.c.f1668b, a4.q.n(d7.t.e0(new e1.r(androidx.compose.ui.graphics.a.c(4278520344L)), new e1.r(androidx.compose.ui.graphics.a.c(4278851904L)), new e1.r(androidx.compose.ui.graphics.a.c(4279180085L)), new e1.r(androidx.compose.ui.graphics.a.c(4278520344L)))), null, 6);
                gVar = y0.a.f16710c;
                qVar3.Z(733328855);
                j0VarC = y.p.c(gVar, false, qVar3);
                qVar3.Z(-1323940314);
                i18 = qVar3.P;
                r1VarP = qVar3.p();
                t1.l.f14477k.getClass();
                jVar = t1.k.f14458b;
                bVarI = androidx.compose.ui.layout.a.i(oVarD111);
                z13 = qVar3.f11630a instanceof m0.d;
                if (!z13) {
                    m9.e0.C();
                    throw null;
                }
                qVar3.c0();
                if (qVar3.O) {
                    qVar3.o(jVar);
                } else {
                    qVar3.o0();
                }
                iVar = t1.k.f14461e;
                d7.t.s0(qVar3, j0VarC, iVar);
                iVar2 = t1.k.f14460d;
                d7.t.s0(qVar3, r1VarP, iVar2);
                iVar3 = t1.k.f14462f;
                if (qVar3.O) {
                    l.q.r(i18, qVar3, i18, iVar3);
                } else {
                    l.q.r(i18, qVar3, i18, iVar3);
                }
                l.q.s(0, bVarI, new m0.l2(qVar3), qVar3, 2058660585);
                fillElement = androidx.compose.foundation.layout.c.f1667a;
                f10 = 32;
                y0.o oVarN11 = androidx.compose.foundation.layout.a.n(androidx.compose.foundation.a.n(fillElement, androidx.compose.foundation.a.l(qVar3)), f10, 0.0f, 2);
                y0.e eVar11 = y0.a.f16716p;
                qVar3.Z(-483455358);
                j0VarA = y.u.a(y.k.f16607c, eVar11, qVar3);
                qVar3.Z(-1323940314);
                i19 = qVar3.P;
                r1VarP2 = qVar3.p();
                bVarI2 = androidx.compose.ui.layout.a.i(oVarN11);
                if (!z13) {
                    m9.e0.C();
                    throw null;
                }
                qVar3.c0();
                if (qVar3.O) {
                    qVar3.o(jVar);
                } else {
                    qVar3.o0();
                }
                d7.t.s0(qVar3, j0VarA, iVar);
                d7.t.s0(qVar3, r1VarP2, iVar2);
                if (qVar3.O) {
                    l.q.r(i19, qVar3, i19, iVar3);
                } else {
                    l.q.r(i19, qVar3, i19, iVar3);
                }
                l.q.s(0, bVarI2, new m0.l2(qVar3), qVar3, 2058660585);
                y0.o oVarB11 = androidx.compose.ui.draw.a.b(androidx.compose.ui.draw.a.h(androidx.compose.foundation.layout.c.h(lVar, 100), ((Number) k0VarF.f14220d.getValue()).floatValue()), e0.f.f4988a);
                j10 = e5.a.f5125a;
                str6 = str5;
                y0.o oVarD112 = androidx.compose.foundation.a.d(oVarB11, a4.q.j(d7.t.e0(new e1.r(e1.r.b(j10, 0.3f)), new e1.r(e1.r.b(j10, 0.05f))), 0.0f, 14), null, 6);
                qVar3.Z(733328855);
                j0VarC2 = y.p.c(gVar, false, qVar3);
                qVar3.Z(-1323940314);
                i20 = qVar3.P;
                r1VarP3 = qVar3.p();
                bVarI3 = androidx.compose.ui.layout.a.i(oVarD112);
                if (!z13) {
                    m9.e0.C();
                    throw null;
                }
                qVar3.c0();
                if (qVar3.O) {
                    qVar3.o(jVar);
                } else {
                    qVar3.o0();
                }
                d7.t.s0(qVar3, j0VarC2, iVar);
                d7.t.s0(qVar3, r1VarP3, iVar2);
                if (qVar3.O) {
                    l.q.r(i20, qVar3, i20, iVar3);
                } else {
                    l.q.r(i20, qVar3, i20, iVar3);
                }
                bVarI3.e(new m0.l2(qVar3), qVar3, 0);
                qVar3.Z(2058660585);
                f11 = 48;
                k0.e1.b(z6.a.K(), "Update", androidx.compose.foundation.layout.c.h(lVar, f11), j10, qVar3, 3504, 0);
                l.q.v(qVar3, false, true, false, false);
                c5.b("Update Required", null, e5.a.f5136l, l.q.d(lVar, f10, qVar3, 26), null, f2.l.f6118f, null, 0L, null, new l2.i(3), 0L, 0, false, 0, 0, null, null, qVar3, 200070, 0, 130514);
                f12 = 12;
                long jD11 = l.q.d(lVar, f12, qVar3, 14);
                long j113 = e5.a.f5137m;
                c5.b("A new version of Ride Accepter is available.\nPlease update to continue using the app.", null, j113, jD11, null, null, null, 0L, null, new l2.i(3), o1.s.N(22), 0, false, 0, 0, null, null, qVar3, 3462, 6, 129522);
                f13 = 8;
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f13), qVar3);
                j11 = e5.a.f5132h;
                f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d5.p.f4710a, qVar3, 196614, 24);
                f14 = 16;
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f14), qVar3);
                qVar3.Z(991122215);
                if (str6.length() > 0) {
                    str7 = str6;
                    f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d7.t.K(qVar3, -1266085629, new d5.b(str7, 2)), qVar3, 196614, 24);
                } else {
                    str7 = str6;
                }
                qVar3.t(false);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, 24), qVar3);
                qVar3.Z(991123350);
                if (((Boolean) g1Var.getValue()).booleanValue()) {
                    g1Var3 = g1Var2;
                    d1Var2 = d1Var;
                    f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d7.t.K(qVar3, -1306056660, new u.l1(5, g1Var2, d1Var)), qVar3, 196614, 24);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f14), qVar3);
                } else {
                    g1Var3 = g1Var2;
                    d1Var2 = d1Var;
                    f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d7.t.K(qVar3, -1306056660, new u.l1(5, g1Var2, d1Var)), qVar3, 196614, 24);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f14), qVar3);
                }
                z14 = false;
                qVar3.t(false);
                qVar3.Z(991125275);
                if (((Boolean) g1Var3.getValue()).booleanValue()) {
                    context2 = context;
                    qVar = qVar3;
                    z15 = true;
                    lVar2 = lVar;
                    f15 = f12;
                    i21 = 52;
                } else {
                    context2 = context;
                    qVar = qVar3;
                    z15 = true;
                    lVar2 = lVar;
                    f15 = f12;
                    i21 = 52;
                }
                qVar.t(z14);
                qVar.Z(991126226);
                if (((Boolean) g1Var3.getValue()).booleanValue()) {
                    context3 = context2;
                    lVar3 = lVar2;
                    qVar2 = qVar;
                    j12 = r43;
                    z16 = z14;
                } else {
                    context3 = context2;
                    lVar3 = lVar2;
                    qVar2 = qVar;
                    j12 = r43;
                    z16 = z14;
                }
                qVar2.t(z16);
                qVar2.Z(991128322);
                if (str2.length() > 0) {
                    m9.e0.g(new u.r0(17, str2, context3), androidx.compose.foundation.layout.c.c(fillElement, f11), false, e0.f.a(14), null, null, new u.w(k0.z.f(qVar2).f14967a, a4.q.i(d7.t.e0(new e1.r(j12), new e1.r(e5.a.f5128d)))), null, null, d5.p.f4712c, qVar2, 805306416, 436);
                    z17 = false;
                } else {
                    z17 = z16;
                }
                qVar2.t(z17);
                qVar2.Z(991129516);
                if (str.length() == 0) {
                    f16 = f13;
                } else {
                    f16 = f13;
                }
                qVar2.t(false);
                qVar2.Z(-723979200);
                if (z12) {
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar3, f16), qVar2);
                    m9.e0.j(aVar3, fillElement, false, null, null, null, null, null, null, d5.p.f4713d, qVar2, ((i17 >> 12) & 14) | 805306416, 508);
                }
                l.q.v(qVar2, false, false, true, false);
                l.q.v(qVar2, false, false, true, false);
                qVar2.t(false);
                z18 = z12;
                aVar4 = aVar3;
            }
            x1VarX = qVar2.x();
            if (x1VarX != null) {
                x1VarX.f11756d = new d5.y(str, str2, str7, z18, aVar4, i10, i11);
            }
        }
        i12 |= 3072;
        z11 = z10;
        i15 = i11 & 16;
        if (i15 != 0) {
            if ((57344 & i10) == 0) {
                aVar2 = aVar;
                if (qVar3.i(aVar2)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            i17 = i12;
            if ((i17 & 46811) == 9362) {
                if (i22 != 0) {
                    str5 = "";
                } else {
                    str5 = str4;
                }
                if (i13 != 0) {
                    z12 = false;
                } else {
                    z12 = z11;
                }
                if (i15 != 0) {
                    aVar3 = d5.v.f4796a;
                } else {
                    aVar3 = aVar2;
                }
                context = (Context) qVar3.m(u1.y0.f15377b);
                qVar3.Z(-1449374496);
                objP = qVar3.P();
                y0Var = m0.l.f11578a;
                o3Var = o3.f11621a;
                if (objP == y0Var) {
                    objP = d7.t.g0(Boolean.FALSE, o3Var);
                    qVar3.l0(objP);
                }
                g1Var = (m0.g1) objP;
                objF = l.q.f(qVar3, false, -1449374433);
                if (objF == y0Var) {
                    objF = m9.e0.H(0.0f);
                    qVar3.l0(objF);
                }
                d1Var = (m0.d1) objF;
                objF2 = l.q.f(qVar3, false, -1449374368);
                if (objF2 == y0Var) {
                    objF2 = d7.t.g0(Boolean.FALSE, o3Var);
                    qVar3.l0(objF2);
                }
                g1Var2 = (m0.g1) objF2;
                objF3 = l.q.f(qVar3, false, -1449374311);
                if (objF3 == y0Var) {
                    int i214 = m0.b.f11457b;
                    objF3 = new m0.m1(-1L);
                    qVar3.l0(objF3);
                }
                m0.f1 f1Var12 = (m0.f1) objF3;
                objF4 = l.q.f(qVar3, false, -1449374248);
                if (objF4 == y0Var) {
                    objF4 = d7.t.g0(null, o3Var);
                    qVar3.l0(objF4);
                }
                m0.g1 g1Var15 = (m0.g1) objF4;
                qVar3.t(false);
                k0VarF = t.e.f(t.e.q("pulse", qVar3, 0), 1.0f, 1.15f, t.e.p(t.e.s(800, 0, t.c0.f14096b, 2), 2, 4), "pulseScale", qVar3, 29112, 0);
                w2 w2Var12 = (w2) f1Var12;
                m0.s.a(Long.valueOf(w2Var12.d()), new y.r(context, f1Var12, g1Var, g1Var2, d1Var, g1Var15, 1), qVar3);
                m0.s.c(Boolean.valueOf(((Boolean) g1Var.getValue()).booleanValue()), Long.valueOf(w2Var12.d()), new d5.x(context, g1Var, f1Var12, d1Var, g1Var2, g1Var15, null), qVar3);
                lVar = y0.l.f16729b;
                y0.o oVarD113 = androidx.compose.foundation.a.d(androidx.compose.foundation.layout.c.f1668b, a4.q.n(d7.t.e0(new e1.r(androidx.compose.ui.graphics.a.c(4278520344L)), new e1.r(androidx.compose.ui.graphics.a.c(4278851904L)), new e1.r(androidx.compose.ui.graphics.a.c(4279180085L)), new e1.r(androidx.compose.ui.graphics.a.c(4278520344L)))), null, 6);
                gVar = y0.a.f16710c;
                qVar3.Z(733328855);
                j0VarC = y.p.c(gVar, false, qVar3);
                qVar3.Z(-1323940314);
                i18 = qVar3.P;
                r1VarP = qVar3.p();
                t1.l.f14477k.getClass();
                jVar = t1.k.f14458b;
                bVarI = androidx.compose.ui.layout.a.i(oVarD113);
                z13 = qVar3.f11630a instanceof m0.d;
                if (!z13) {
                    m9.e0.C();
                    throw null;
                }
                qVar3.c0();
                if (qVar3.O) {
                    qVar3.o(jVar);
                } else {
                    qVar3.o0();
                }
                iVar = t1.k.f14461e;
                d7.t.s0(qVar3, j0VarC, iVar);
                iVar2 = t1.k.f14460d;
                d7.t.s0(qVar3, r1VarP, iVar2);
                iVar3 = t1.k.f14462f;
                if (qVar3.O) {
                    l.q.r(i18, qVar3, i18, iVar3);
                } else {
                    l.q.r(i18, qVar3, i18, iVar3);
                }
                l.q.s(0, bVarI, new m0.l2(qVar3), qVar3, 2058660585);
                fillElement = androidx.compose.foundation.layout.c.f1667a;
                f10 = 32;
                y0.o oVarN12 = androidx.compose.foundation.layout.a.n(androidx.compose.foundation.a.n(fillElement, androidx.compose.foundation.a.l(qVar3)), f10, 0.0f, 2);
                y0.e eVar12 = y0.a.f16716p;
                qVar3.Z(-483455358);
                j0VarA = y.u.a(y.k.f16607c, eVar12, qVar3);
                qVar3.Z(-1323940314);
                i19 = qVar3.P;
                r1VarP2 = qVar3.p();
                bVarI2 = androidx.compose.ui.layout.a.i(oVarN12);
                if (!z13) {
                    m9.e0.C();
                    throw null;
                }
                qVar3.c0();
                if (qVar3.O) {
                    qVar3.o(jVar);
                } else {
                    qVar3.o0();
                }
                d7.t.s0(qVar3, j0VarA, iVar);
                d7.t.s0(qVar3, r1VarP2, iVar2);
                if (qVar3.O) {
                    l.q.r(i19, qVar3, i19, iVar3);
                } else {
                    l.q.r(i19, qVar3, i19, iVar3);
                }
                l.q.s(0, bVarI2, new m0.l2(qVar3), qVar3, 2058660585);
                y0.o oVarB12 = androidx.compose.ui.draw.a.b(androidx.compose.ui.draw.a.h(androidx.compose.foundation.layout.c.h(lVar, 100), ((Number) k0VarF.f14220d.getValue()).floatValue()), e0.f.f4988a);
                j10 = e5.a.f5125a;
                str6 = str5;
                y0.o oVarD114 = androidx.compose.foundation.a.d(oVarB12, a4.q.j(d7.t.e0(new e1.r(e1.r.b(j10, 0.3f)), new e1.r(e1.r.b(j10, 0.05f))), 0.0f, 14), null, 6);
                qVar3.Z(733328855);
                j0VarC2 = y.p.c(gVar, false, qVar3);
                qVar3.Z(-1323940314);
                i20 = qVar3.P;
                r1VarP3 = qVar3.p();
                bVarI3 = androidx.compose.ui.layout.a.i(oVarD114);
                if (!z13) {
                    m9.e0.C();
                    throw null;
                }
                qVar3.c0();
                if (qVar3.O) {
                    qVar3.o(jVar);
                } else {
                    qVar3.o0();
                }
                d7.t.s0(qVar3, j0VarC2, iVar);
                d7.t.s0(qVar3, r1VarP3, iVar2);
                if (qVar3.O) {
                    l.q.r(i20, qVar3, i20, iVar3);
                } else {
                    l.q.r(i20, qVar3, i20, iVar3);
                }
                bVarI3.e(new m0.l2(qVar3), qVar3, 0);
                qVar3.Z(2058660585);
                f11 = 48;
                k0.e1.b(z6.a.K(), "Update", androidx.compose.foundation.layout.c.h(lVar, f11), j10, qVar3, 3504, 0);
                l.q.v(qVar3, false, true, false, false);
                c5.b("Update Required", null, e5.a.f5136l, l.q.d(lVar, f10, qVar3, 26), null, f2.l.f6118f, null, 0L, null, new l2.i(3), 0L, 0, false, 0, 0, null, null, qVar3, 200070, 0, 130514);
                f12 = 12;
                long jD12 = l.q.d(lVar, f12, qVar3, 14);
                long j114 = e5.a.f5137m;
                c5.b("A new version of Ride Accepter is available.\nPlease update to continue using the app.", null, j114, jD12, null, null, null, 0L, null, new l2.i(3), o1.s.N(22), 0, false, 0, 0, null, null, qVar3, 3462, 6, 129522);
                f13 = 8;
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f13), qVar3);
                j11 = e5.a.f5132h;
                f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d5.p.f4710a, qVar3, 196614, 24);
                f14 = 16;
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f14), qVar3);
                qVar3.Z(991122215);
                if (str6.length() > 0) {
                    str7 = str6;
                    f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d7.t.K(qVar3, -1266085629, new d5.b(str7, 2)), qVar3, 196614, 24);
                } else {
                    str7 = str6;
                }
                qVar3.t(false);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, 24), qVar3);
                qVar3.Z(991123350);
                if (((Boolean) g1Var.getValue()).booleanValue()) {
                    g1Var3 = g1Var2;
                    d1Var2 = d1Var;
                    f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d7.t.K(qVar3, -1306056660, new u.l1(5, g1Var2, d1Var)), qVar3, 196614, 24);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f14), qVar3);
                } else {
                    g1Var3 = g1Var2;
                    d1Var2 = d1Var;
                    f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d7.t.K(qVar3, -1306056660, new u.l1(5, g1Var2, d1Var)), qVar3, 196614, 24);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f14), qVar3);
                }
                z14 = false;
                qVar3.t(false);
                qVar3.Z(991125275);
                if (((Boolean) g1Var3.getValue()).booleanValue()) {
                    context2 = context;
                    qVar = qVar3;
                    z15 = true;
                    lVar2 = lVar;
                    f15 = f12;
                    i21 = 52;
                } else {
                    context2 = context;
                    qVar = qVar3;
                    z15 = true;
                    lVar2 = lVar;
                    f15 = f12;
                    i21 = 52;
                }
                qVar.t(z14);
                qVar.Z(991126226);
                if (((Boolean) g1Var3.getValue()).booleanValue()) {
                    context3 = context2;
                    lVar3 = lVar2;
                    qVar2 = qVar;
                    j12 = r43;
                    z16 = z14;
                } else {
                    context3 = context2;
                    lVar3 = lVar2;
                    qVar2 = qVar;
                    j12 = r43;
                    z16 = z14;
                }
                qVar2.t(z16);
                qVar2.Z(991128322);
                if (str2.length() > 0) {
                    m9.e0.g(new u.r0(17, str2, context3), androidx.compose.foundation.layout.c.c(fillElement, f11), false, e0.f.a(14), null, null, new u.w(k0.z.f(qVar2).f14967a, a4.q.i(d7.t.e0(new e1.r(j12), new e1.r(e5.a.f5128d)))), null, null, d5.p.f4712c, qVar2, 805306416, 436);
                    z17 = false;
                } else {
                    z17 = z16;
                }
                qVar2.t(z17);
                qVar2.Z(991129516);
                if (str.length() == 0) {
                    f16 = f13;
                } else {
                    f16 = f13;
                }
                qVar2.t(false);
                qVar2.Z(-723979200);
                if (z12) {
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar3, f16), qVar2);
                    m9.e0.j(aVar3, fillElement, false, null, null, null, null, null, null, d5.p.f4713d, qVar2, ((i17 >> 12) & 14) | 805306416, 508);
                }
                l.q.v(qVar2, false, false, true, false);
                l.q.v(qVar2, false, false, true, false);
                qVar2.t(false);
                z18 = z12;
                aVar4 = aVar3;
            } else {
                if (i22 != 0) {
                    str5 = "";
                } else {
                    str5 = str4;
                }
                if (i13 != 0) {
                    z12 = false;
                } else {
                    z12 = z11;
                }
                if (i15 != 0) {
                    aVar3 = d5.v.f4796a;
                } else {
                    aVar3 = aVar2;
                }
                context = (Context) qVar3.m(u1.y0.f15377b);
                qVar3.Z(-1449374496);
                objP = qVar3.P();
                y0Var = m0.l.f11578a;
                o3Var = o3.f11621a;
                if (objP == y0Var) {
                    objP = d7.t.g0(Boolean.FALSE, o3Var);
                    qVar3.l0(objP);
                }
                g1Var = (m0.g1) objP;
                objF = l.q.f(qVar3, false, -1449374433);
                if (objF == y0Var) {
                    objF = m9.e0.H(0.0f);
                    qVar3.l0(objF);
                }
                d1Var = (m0.d1) objF;
                objF2 = l.q.f(qVar3, false, -1449374368);
                if (objF2 == y0Var) {
                    objF2 = d7.t.g0(Boolean.FALSE, o3Var);
                    qVar3.l0(objF2);
                }
                g1Var2 = (m0.g1) objF2;
                objF3 = l.q.f(qVar3, false, -1449374311);
                if (objF3 == y0Var) {
                    int i215 = m0.b.f11457b;
                    objF3 = new m0.m1(-1L);
                    qVar3.l0(objF3);
                }
                m0.f1 f1Var13 = (m0.f1) objF3;
                objF4 = l.q.f(qVar3, false, -1449374248);
                if (objF4 == y0Var) {
                    objF4 = d7.t.g0(null, o3Var);
                    qVar3.l0(objF4);
                }
                m0.g1 g1Var16 = (m0.g1) objF4;
                qVar3.t(false);
                k0VarF = t.e.f(t.e.q("pulse", qVar3, 0), 1.0f, 1.15f, t.e.p(t.e.s(800, 0, t.c0.f14096b, 2), 2, 4), "pulseScale", qVar3, 29112, 0);
                w2 w2Var13 = (w2) f1Var13;
                m0.s.a(Long.valueOf(w2Var13.d()), new y.r(context, f1Var13, g1Var, g1Var2, d1Var, g1Var16, 1), qVar3);
                m0.s.c(Boolean.valueOf(((Boolean) g1Var.getValue()).booleanValue()), Long.valueOf(w2Var13.d()), new d5.x(context, g1Var, f1Var13, d1Var, g1Var2, g1Var16, null), qVar3);
                lVar = y0.l.f16729b;
                y0.o oVarD115 = androidx.compose.foundation.a.d(androidx.compose.foundation.layout.c.f1668b, a4.q.n(d7.t.e0(new e1.r(androidx.compose.ui.graphics.a.c(4278520344L)), new e1.r(androidx.compose.ui.graphics.a.c(4278851904L)), new e1.r(androidx.compose.ui.graphics.a.c(4279180085L)), new e1.r(androidx.compose.ui.graphics.a.c(4278520344L)))), null, 6);
                gVar = y0.a.f16710c;
                qVar3.Z(733328855);
                j0VarC = y.p.c(gVar, false, qVar3);
                qVar3.Z(-1323940314);
                i18 = qVar3.P;
                r1VarP = qVar3.p();
                t1.l.f14477k.getClass();
                jVar = t1.k.f14458b;
                bVarI = androidx.compose.ui.layout.a.i(oVarD115);
                z13 = qVar3.f11630a instanceof m0.d;
                if (!z13) {
                    m9.e0.C();
                    throw null;
                }
                qVar3.c0();
                if (qVar3.O) {
                    qVar3.o(jVar);
                } else {
                    qVar3.o0();
                }
                iVar = t1.k.f14461e;
                d7.t.s0(qVar3, j0VarC, iVar);
                iVar2 = t1.k.f14460d;
                d7.t.s0(qVar3, r1VarP, iVar2);
                iVar3 = t1.k.f14462f;
                if (qVar3.O) {
                    l.q.r(i18, qVar3, i18, iVar3);
                } else {
                    l.q.r(i18, qVar3, i18, iVar3);
                }
                l.q.s(0, bVarI, new m0.l2(qVar3), qVar3, 2058660585);
                fillElement = androidx.compose.foundation.layout.c.f1667a;
                f10 = 32;
                y0.o oVarN13 = androidx.compose.foundation.layout.a.n(androidx.compose.foundation.a.n(fillElement, androidx.compose.foundation.a.l(qVar3)), f10, 0.0f, 2);
                y0.e eVar13 = y0.a.f16716p;
                qVar3.Z(-483455358);
                j0VarA = y.u.a(y.k.f16607c, eVar13, qVar3);
                qVar3.Z(-1323940314);
                i19 = qVar3.P;
                r1VarP2 = qVar3.p();
                bVarI2 = androidx.compose.ui.layout.a.i(oVarN13);
                if (!z13) {
                    m9.e0.C();
                    throw null;
                }
                qVar3.c0();
                if (qVar3.O) {
                    qVar3.o(jVar);
                } else {
                    qVar3.o0();
                }
                d7.t.s0(qVar3, j0VarA, iVar);
                d7.t.s0(qVar3, r1VarP2, iVar2);
                if (qVar3.O) {
                    l.q.r(i19, qVar3, i19, iVar3);
                } else {
                    l.q.r(i19, qVar3, i19, iVar3);
                }
                l.q.s(0, bVarI2, new m0.l2(qVar3), qVar3, 2058660585);
                y0.o oVarB13 = androidx.compose.ui.draw.a.b(androidx.compose.ui.draw.a.h(androidx.compose.foundation.layout.c.h(lVar, 100), ((Number) k0VarF.f14220d.getValue()).floatValue()), e0.f.f4988a);
                j10 = e5.a.f5125a;
                str6 = str5;
                y0.o oVarD116 = androidx.compose.foundation.a.d(oVarB13, a4.q.j(d7.t.e0(new e1.r(e1.r.b(j10, 0.3f)), new e1.r(e1.r.b(j10, 0.05f))), 0.0f, 14), null, 6);
                qVar3.Z(733328855);
                j0VarC2 = y.p.c(gVar, false, qVar3);
                qVar3.Z(-1323940314);
                i20 = qVar3.P;
                r1VarP3 = qVar3.p();
                bVarI3 = androidx.compose.ui.layout.a.i(oVarD116);
                if (!z13) {
                    m9.e0.C();
                    throw null;
                }
                qVar3.c0();
                if (qVar3.O) {
                    qVar3.o(jVar);
                } else {
                    qVar3.o0();
                }
                d7.t.s0(qVar3, j0VarC2, iVar);
                d7.t.s0(qVar3, r1VarP3, iVar2);
                if (qVar3.O) {
                    l.q.r(i20, qVar3, i20, iVar3);
                } else {
                    l.q.r(i20, qVar3, i20, iVar3);
                }
                bVarI3.e(new m0.l2(qVar3), qVar3, 0);
                qVar3.Z(2058660585);
                f11 = 48;
                k0.e1.b(z6.a.K(), "Update", androidx.compose.foundation.layout.c.h(lVar, f11), j10, qVar3, 3504, 0);
                l.q.v(qVar3, false, true, false, false);
                c5.b("Update Required", null, e5.a.f5136l, l.q.d(lVar, f10, qVar3, 26), null, f2.l.f6118f, null, 0L, null, new l2.i(3), 0L, 0, false, 0, 0, null, null, qVar3, 200070, 0, 130514);
                f12 = 12;
                long jD13 = l.q.d(lVar, f12, qVar3, 14);
                long j115 = e5.a.f5137m;
                c5.b("A new version of Ride Accepter is available.\nPlease update to continue using the app.", null, j115, jD13, null, null, null, 0L, null, new l2.i(3), o1.s.N(22), 0, false, 0, 0, null, null, qVar3, 3462, 6, 129522);
                f13 = 8;
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f13), qVar3);
                j11 = e5.a.f5132h;
                f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d5.p.f4710a, qVar3, 196614, 24);
                f14 = 16;
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f14), qVar3);
                qVar3.Z(991122215);
                if (str6.length() > 0) {
                    str7 = str6;
                    f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d7.t.K(qVar3, -1266085629, new d5.b(str7, 2)), qVar3, 196614, 24);
                } else {
                    str7 = str6;
                }
                qVar3.t(false);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, 24), qVar3);
                qVar3.Z(991123350);
                if (((Boolean) g1Var.getValue()).booleanValue()) {
                    g1Var3 = g1Var2;
                    d1Var2 = d1Var;
                    f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d7.t.K(qVar3, -1306056660, new u.l1(5, g1Var2, d1Var)), qVar3, 196614, 24);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f14), qVar3);
                } else {
                    g1Var3 = g1Var2;
                    d1Var2 = d1Var;
                    f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d7.t.K(qVar3, -1306056660, new u.l1(5, g1Var2, d1Var)), qVar3, 196614, 24);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f14), qVar3);
                }
                z14 = false;
                qVar3.t(false);
                qVar3.Z(991125275);
                if (((Boolean) g1Var3.getValue()).booleanValue()) {
                    context2 = context;
                    qVar = qVar3;
                    z15 = true;
                    lVar2 = lVar;
                    f15 = f12;
                    i21 = 52;
                } else {
                    context2 = context;
                    qVar = qVar3;
                    z15 = true;
                    lVar2 = lVar;
                    f15 = f12;
                    i21 = 52;
                }
                qVar.t(z14);
                qVar.Z(991126226);
                if (((Boolean) g1Var3.getValue()).booleanValue()) {
                    context3 = context2;
                    lVar3 = lVar2;
                    qVar2 = qVar;
                    j12 = r43;
                    z16 = z14;
                } else {
                    context3 = context2;
                    lVar3 = lVar2;
                    qVar2 = qVar;
                    j12 = r43;
                    z16 = z14;
                }
                qVar2.t(z16);
                qVar2.Z(991128322);
                if (str2.length() > 0) {
                    m9.e0.g(new u.r0(17, str2, context3), androidx.compose.foundation.layout.c.c(fillElement, f11), false, e0.f.a(14), null, null, new u.w(k0.z.f(qVar2).f14967a, a4.q.i(d7.t.e0(new e1.r(j12), new e1.r(e5.a.f5128d)))), null, null, d5.p.f4712c, qVar2, 805306416, 436);
                    z17 = false;
                } else {
                    z17 = z16;
                }
                qVar2.t(z17);
                qVar2.Z(991129516);
                if (str.length() == 0) {
                    f16 = f13;
                } else {
                    f16 = f13;
                }
                qVar2.t(false);
                qVar2.Z(-723979200);
                if (z12) {
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar3, f16), qVar2);
                    m9.e0.j(aVar3, fillElement, false, null, null, null, null, null, null, d5.p.f4713d, qVar2, ((i17 >> 12) & 14) | 805306416, 508);
                }
                l.q.v(qVar2, false, false, true, false);
                l.q.v(qVar2, false, false, true, false);
                qVar2.t(false);
                z18 = z12;
                aVar4 = aVar3;
            }
            x1VarX = qVar2.x();
            if (x1VarX != null) {
                x1VarX.f11756d = new d5.y(str, str2, str7, z18, aVar4, i10, i11);
            }
        }
        i12 |= 24576;
        aVar2 = aVar;
        i17 = i12;
        if ((i17 & 46811) == 9362) {
            if (i22 != 0) {
                str5 = "";
            } else {
                str5 = str4;
            }
            if (i13 != 0) {
                z12 = false;
            } else {
                z12 = z11;
            }
            if (i15 != 0) {
                aVar3 = d5.v.f4796a;
            } else {
                aVar3 = aVar2;
            }
            context = (Context) qVar3.m(u1.y0.f15377b);
            qVar3.Z(-1449374496);
            objP = qVar3.P();
            y0Var = m0.l.f11578a;
            o3Var = o3.f11621a;
            if (objP == y0Var) {
                objP = d7.t.g0(Boolean.FALSE, o3Var);
                qVar3.l0(objP);
            }
            g1Var = (m0.g1) objP;
            objF = l.q.f(qVar3, false, -1449374433);
            if (objF == y0Var) {
                objF = m9.e0.H(0.0f);
                qVar3.l0(objF);
            }
            d1Var = (m0.d1) objF;
            objF2 = l.q.f(qVar3, false, -1449374368);
            if (objF2 == y0Var) {
                objF2 = d7.t.g0(Boolean.FALSE, o3Var);
                qVar3.l0(objF2);
            }
            g1Var2 = (m0.g1) objF2;
            objF3 = l.q.f(qVar3, false, -1449374311);
            if (objF3 == y0Var) {
                int i216 = m0.b.f11457b;
                objF3 = new m0.m1(-1L);
                qVar3.l0(objF3);
            }
            m0.f1 f1Var14 = (m0.f1) objF3;
            objF4 = l.q.f(qVar3, false, -1449374248);
            if (objF4 == y0Var) {
                objF4 = d7.t.g0(null, o3Var);
                qVar3.l0(objF4);
            }
            m0.g1 g1Var17 = (m0.g1) objF4;
            qVar3.t(false);
            k0VarF = t.e.f(t.e.q("pulse", qVar3, 0), 1.0f, 1.15f, t.e.p(t.e.s(800, 0, t.c0.f14096b, 2), 2, 4), "pulseScale", qVar3, 29112, 0);
            w2 w2Var14 = (w2) f1Var14;
            m0.s.a(Long.valueOf(w2Var14.d()), new y.r(context, f1Var14, g1Var, g1Var2, d1Var, g1Var17, 1), qVar3);
            m0.s.c(Boolean.valueOf(((Boolean) g1Var.getValue()).booleanValue()), Long.valueOf(w2Var14.d()), new d5.x(context, g1Var, f1Var14, d1Var, g1Var2, g1Var17, null), qVar3);
            lVar = y0.l.f16729b;
            y0.o oVarD117 = androidx.compose.foundation.a.d(androidx.compose.foundation.layout.c.f1668b, a4.q.n(d7.t.e0(new e1.r(androidx.compose.ui.graphics.a.c(4278520344L)), new e1.r(androidx.compose.ui.graphics.a.c(4278851904L)), new e1.r(androidx.compose.ui.graphics.a.c(4279180085L)), new e1.r(androidx.compose.ui.graphics.a.c(4278520344L)))), null, 6);
            gVar = y0.a.f16710c;
            qVar3.Z(733328855);
            j0VarC = y.p.c(gVar, false, qVar3);
            qVar3.Z(-1323940314);
            i18 = qVar3.P;
            r1VarP = qVar3.p();
            t1.l.f14477k.getClass();
            jVar = t1.k.f14458b;
            bVarI = androidx.compose.ui.layout.a.i(oVarD117);
            z13 = qVar3.f11630a instanceof m0.d;
            if (!z13) {
                m9.e0.C();
                throw null;
            }
            qVar3.c0();
            if (qVar3.O) {
                qVar3.o(jVar);
            } else {
                qVar3.o0();
            }
            iVar = t1.k.f14461e;
            d7.t.s0(qVar3, j0VarC, iVar);
            iVar2 = t1.k.f14460d;
            d7.t.s0(qVar3, r1VarP, iVar2);
            iVar3 = t1.k.f14462f;
            if (qVar3.O) {
                l.q.r(i18, qVar3, i18, iVar3);
            } else {
                l.q.r(i18, qVar3, i18, iVar3);
            }
            l.q.s(0, bVarI, new m0.l2(qVar3), qVar3, 2058660585);
            fillElement = androidx.compose.foundation.layout.c.f1667a;
            f10 = 32;
            y0.o oVarN14 = androidx.compose.foundation.layout.a.n(androidx.compose.foundation.a.n(fillElement, androidx.compose.foundation.a.l(qVar3)), f10, 0.0f, 2);
            y0.e eVar14 = y0.a.f16716p;
            qVar3.Z(-483455358);
            j0VarA = y.u.a(y.k.f16607c, eVar14, qVar3);
            qVar3.Z(-1323940314);
            i19 = qVar3.P;
            r1VarP2 = qVar3.p();
            bVarI2 = androidx.compose.ui.layout.a.i(oVarN14);
            if (!z13) {
                m9.e0.C();
                throw null;
            }
            qVar3.c0();
            if (qVar3.O) {
                qVar3.o(jVar);
            } else {
                qVar3.o0();
            }
            d7.t.s0(qVar3, j0VarA, iVar);
            d7.t.s0(qVar3, r1VarP2, iVar2);
            if (qVar3.O) {
                l.q.r(i19, qVar3, i19, iVar3);
            } else {
                l.q.r(i19, qVar3, i19, iVar3);
            }
            l.q.s(0, bVarI2, new m0.l2(qVar3), qVar3, 2058660585);
            y0.o oVarB14 = androidx.compose.ui.draw.a.b(androidx.compose.ui.draw.a.h(androidx.compose.foundation.layout.c.h(lVar, 100), ((Number) k0VarF.f14220d.getValue()).floatValue()), e0.f.f4988a);
            j10 = e5.a.f5125a;
            str6 = str5;
            y0.o oVarD118 = androidx.compose.foundation.a.d(oVarB14, a4.q.j(d7.t.e0(new e1.r(e1.r.b(j10, 0.3f)), new e1.r(e1.r.b(j10, 0.05f))), 0.0f, 14), null, 6);
            qVar3.Z(733328855);
            j0VarC2 = y.p.c(gVar, false, qVar3);
            qVar3.Z(-1323940314);
            i20 = qVar3.P;
            r1VarP3 = qVar3.p();
            bVarI3 = androidx.compose.ui.layout.a.i(oVarD118);
            if (!z13) {
                m9.e0.C();
                throw null;
            }
            qVar3.c0();
            if (qVar3.O) {
                qVar3.o(jVar);
            } else {
                qVar3.o0();
            }
            d7.t.s0(qVar3, j0VarC2, iVar);
            d7.t.s0(qVar3, r1VarP3, iVar2);
            if (qVar3.O) {
                l.q.r(i20, qVar3, i20, iVar3);
            } else {
                l.q.r(i20, qVar3, i20, iVar3);
            }
            bVarI3.e(new m0.l2(qVar3), qVar3, 0);
            qVar3.Z(2058660585);
            f11 = 48;
            k0.e1.b(z6.a.K(), "Update", androidx.compose.foundation.layout.c.h(lVar, f11), j10, qVar3, 3504, 0);
            l.q.v(qVar3, false, true, false, false);
            c5.b("Update Required", null, e5.a.f5136l, l.q.d(lVar, f10, qVar3, 26), null, f2.l.f6118f, null, 0L, null, new l2.i(3), 0L, 0, false, 0, 0, null, null, qVar3, 200070, 0, 130514);
            f12 = 12;
            long jD14 = l.q.d(lVar, f12, qVar3, 14);
            long j116 = e5.a.f5137m;
            c5.b("A new version of Ride Accepter is available.\nPlease update to continue using the app.", null, j116, jD14, null, null, null, 0L, null, new l2.i(3), o1.s.N(22), 0, false, 0, 0, null, null, qVar3, 3462, 6, 129522);
            f13 = 8;
            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f13), qVar3);
            j11 = e5.a.f5132h;
            f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d5.p.f4710a, qVar3, 196614, 24);
            f14 = 16;
            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f14), qVar3);
            qVar3.Z(991122215);
            if (str6.length() > 0) {
                str7 = str6;
                f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d7.t.K(qVar3, -1266085629, new d5.b(str7, 2)), qVar3, 196614, 24);
            } else {
                str7 = str6;
            }
            qVar3.t(false);
            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, 24), qVar3);
            qVar3.Z(991123350);
            if (((Boolean) g1Var.getValue()).booleanValue()) {
                g1Var3 = g1Var2;
                d1Var2 = d1Var;
                f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d7.t.K(qVar3, -1306056660, new u.l1(5, g1Var2, d1Var)), qVar3, 196614, 24);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f14), qVar3);
            } else {
                g1Var3 = g1Var2;
                d1Var2 = d1Var;
                f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d7.t.K(qVar3, -1306056660, new u.l1(5, g1Var2, d1Var)), qVar3, 196614, 24);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f14), qVar3);
            }
            z14 = false;
            qVar3.t(false);
            qVar3.Z(991125275);
            if (((Boolean) g1Var3.getValue()).booleanValue()) {
                context2 = context;
                qVar = qVar3;
                z15 = true;
                lVar2 = lVar;
                f15 = f12;
                i21 = 52;
            } else {
                context2 = context;
                qVar = qVar3;
                z15 = true;
                lVar2 = lVar;
                f15 = f12;
                i21 = 52;
            }
            qVar.t(z14);
            qVar.Z(991126226);
            if (((Boolean) g1Var3.getValue()).booleanValue()) {
                context3 = context2;
                lVar3 = lVar2;
                qVar2 = qVar;
                j12 = r43;
                z16 = z14;
            } else {
                context3 = context2;
                lVar3 = lVar2;
                qVar2 = qVar;
                j12 = r43;
                z16 = z14;
            }
            qVar2.t(z16);
            qVar2.Z(991128322);
            if (str2.length() > 0) {
                m9.e0.g(new u.r0(17, str2, context3), androidx.compose.foundation.layout.c.c(fillElement, f11), false, e0.f.a(14), null, null, new u.w(k0.z.f(qVar2).f14967a, a4.q.i(d7.t.e0(new e1.r(j12), new e1.r(e5.a.f5128d)))), null, null, d5.p.f4712c, qVar2, 805306416, 436);
                z17 = false;
            } else {
                z17 = z16;
            }
            qVar2.t(z17);
            qVar2.Z(991129516);
            if (str.length() == 0) {
                f16 = f13;
            } else {
                f16 = f13;
            }
            qVar2.t(false);
            qVar2.Z(-723979200);
            if (z12) {
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar3, f16), qVar2);
                m9.e0.j(aVar3, fillElement, false, null, null, null, null, null, null, d5.p.f4713d, qVar2, ((i17 >> 12) & 14) | 805306416, 508);
            }
            l.q.v(qVar2, false, false, true, false);
            l.q.v(qVar2, false, false, true, false);
            qVar2.t(false);
            z18 = z12;
            aVar4 = aVar3;
        } else {
            if (i22 != 0) {
                str5 = "";
            } else {
                str5 = str4;
            }
            if (i13 != 0) {
                z12 = false;
            } else {
                z12 = z11;
            }
            if (i15 != 0) {
                aVar3 = d5.v.f4796a;
            } else {
                aVar3 = aVar2;
            }
            context = (Context) qVar3.m(u1.y0.f15377b);
            qVar3.Z(-1449374496);
            objP = qVar3.P();
            y0Var = m0.l.f11578a;
            o3Var = o3.f11621a;
            if (objP == y0Var) {
                objP = d7.t.g0(Boolean.FALSE, o3Var);
                qVar3.l0(objP);
            }
            g1Var = (m0.g1) objP;
            objF = l.q.f(qVar3, false, -1449374433);
            if (objF == y0Var) {
                objF = m9.e0.H(0.0f);
                qVar3.l0(objF);
            }
            d1Var = (m0.d1) objF;
            objF2 = l.q.f(qVar3, false, -1449374368);
            if (objF2 == y0Var) {
                objF2 = d7.t.g0(Boolean.FALSE, o3Var);
                qVar3.l0(objF2);
            }
            g1Var2 = (m0.g1) objF2;
            objF3 = l.q.f(qVar3, false, -1449374311);
            if (objF3 == y0Var) {
                int i217 = m0.b.f11457b;
                objF3 = new m0.m1(-1L);
                qVar3.l0(objF3);
            }
            m0.f1 f1Var15 = (m0.f1) objF3;
            objF4 = l.q.f(qVar3, false, -1449374248);
            if (objF4 == y0Var) {
                objF4 = d7.t.g0(null, o3Var);
                qVar3.l0(objF4);
            }
            m0.g1 g1Var18 = (m0.g1) objF4;
            qVar3.t(false);
            k0VarF = t.e.f(t.e.q("pulse", qVar3, 0), 1.0f, 1.15f, t.e.p(t.e.s(800, 0, t.c0.f14096b, 2), 2, 4), "pulseScale", qVar3, 29112, 0);
            w2 w2Var15 = (w2) f1Var15;
            m0.s.a(Long.valueOf(w2Var15.d()), new y.r(context, f1Var15, g1Var, g1Var2, d1Var, g1Var18, 1), qVar3);
            m0.s.c(Boolean.valueOf(((Boolean) g1Var.getValue()).booleanValue()), Long.valueOf(w2Var15.d()), new d5.x(context, g1Var, f1Var15, d1Var, g1Var2, g1Var18, null), qVar3);
            lVar = y0.l.f16729b;
            y0.o oVarD119 = androidx.compose.foundation.a.d(androidx.compose.foundation.layout.c.f1668b, a4.q.n(d7.t.e0(new e1.r(androidx.compose.ui.graphics.a.c(4278520344L)), new e1.r(androidx.compose.ui.graphics.a.c(4278851904L)), new e1.r(androidx.compose.ui.graphics.a.c(4279180085L)), new e1.r(androidx.compose.ui.graphics.a.c(4278520344L)))), null, 6);
            gVar = y0.a.f16710c;
            qVar3.Z(733328855);
            j0VarC = y.p.c(gVar, false, qVar3);
            qVar3.Z(-1323940314);
            i18 = qVar3.P;
            r1VarP = qVar3.p();
            t1.l.f14477k.getClass();
            jVar = t1.k.f14458b;
            bVarI = androidx.compose.ui.layout.a.i(oVarD119);
            z13 = qVar3.f11630a instanceof m0.d;
            if (!z13) {
                m9.e0.C();
                throw null;
            }
            qVar3.c0();
            if (qVar3.O) {
                qVar3.o(jVar);
            } else {
                qVar3.o0();
            }
            iVar = t1.k.f14461e;
            d7.t.s0(qVar3, j0VarC, iVar);
            iVar2 = t1.k.f14460d;
            d7.t.s0(qVar3, r1VarP, iVar2);
            iVar3 = t1.k.f14462f;
            if (qVar3.O) {
                l.q.r(i18, qVar3, i18, iVar3);
            } else {
                l.q.r(i18, qVar3, i18, iVar3);
            }
            l.q.s(0, bVarI, new m0.l2(qVar3), qVar3, 2058660585);
            fillElement = androidx.compose.foundation.layout.c.f1667a;
            f10 = 32;
            y0.o oVarN15 = androidx.compose.foundation.layout.a.n(androidx.compose.foundation.a.n(fillElement, androidx.compose.foundation.a.l(qVar3)), f10, 0.0f, 2);
            y0.e eVar15 = y0.a.f16716p;
            qVar3.Z(-483455358);
            j0VarA = y.u.a(y.k.f16607c, eVar15, qVar3);
            qVar3.Z(-1323940314);
            i19 = qVar3.P;
            r1VarP2 = qVar3.p();
            bVarI2 = androidx.compose.ui.layout.a.i(oVarN15);
            if (!z13) {
                m9.e0.C();
                throw null;
            }
            qVar3.c0();
            if (qVar3.O) {
                qVar3.o(jVar);
            } else {
                qVar3.o0();
            }
            d7.t.s0(qVar3, j0VarA, iVar);
            d7.t.s0(qVar3, r1VarP2, iVar2);
            if (qVar3.O) {
                l.q.r(i19, qVar3, i19, iVar3);
            } else {
                l.q.r(i19, qVar3, i19, iVar3);
            }
            l.q.s(0, bVarI2, new m0.l2(qVar3), qVar3, 2058660585);
            y0.o oVarB15 = androidx.compose.ui.draw.a.b(androidx.compose.ui.draw.a.h(androidx.compose.foundation.layout.c.h(lVar, 100), ((Number) k0VarF.f14220d.getValue()).floatValue()), e0.f.f4988a);
            j10 = e5.a.f5125a;
            str6 = str5;
            y0.o oVarD1110 = androidx.compose.foundation.a.d(oVarB15, a4.q.j(d7.t.e0(new e1.r(e1.r.b(j10, 0.3f)), new e1.r(e1.r.b(j10, 0.05f))), 0.0f, 14), null, 6);
            qVar3.Z(733328855);
            j0VarC2 = y.p.c(gVar, false, qVar3);
            qVar3.Z(-1323940314);
            i20 = qVar3.P;
            r1VarP3 = qVar3.p();
            bVarI3 = androidx.compose.ui.layout.a.i(oVarD1110);
            if (!z13) {
                m9.e0.C();
                throw null;
            }
            qVar3.c0();
            if (qVar3.O) {
                qVar3.o(jVar);
            } else {
                qVar3.o0();
            }
            d7.t.s0(qVar3, j0VarC2, iVar);
            d7.t.s0(qVar3, r1VarP3, iVar2);
            if (qVar3.O) {
                l.q.r(i20, qVar3, i20, iVar3);
            } else {
                l.q.r(i20, qVar3, i20, iVar3);
            }
            bVarI3.e(new m0.l2(qVar3), qVar3, 0);
            qVar3.Z(2058660585);
            f11 = 48;
            k0.e1.b(z6.a.K(), "Update", androidx.compose.foundation.layout.c.h(lVar, f11), j10, qVar3, 3504, 0);
            l.q.v(qVar3, false, true, false, false);
            c5.b("Update Required", null, e5.a.f5136l, l.q.d(lVar, f10, qVar3, 26), null, f2.l.f6118f, null, 0L, null, new l2.i(3), 0L, 0, false, 0, 0, null, null, qVar3, 200070, 0, 130514);
            f12 = 12;
            long jD15 = l.q.d(lVar, f12, qVar3, 14);
            long j117 = e5.a.f5137m;
            c5.b("A new version of Ride Accepter is available.\nPlease update to continue using the app.", null, j117, jD15, null, null, null, 0L, null, new l2.i(3), o1.s.N(22), 0, false, 0, 0, null, null, qVar3, 3462, 6, 129522);
            f13 = 8;
            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f13), qVar3);
            j11 = e5.a.f5132h;
            f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d5.p.f4710a, qVar3, 196614, 24);
            f14 = 16;
            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f14), qVar3);
            qVar3.Z(991122215);
            if (str6.length() > 0) {
                str7 = str6;
                f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d7.t.K(qVar3, -1266085629, new d5.b(str7, 2)), qVar3, 196614, 24);
            } else {
                str7 = str6;
            }
            qVar3.t(false);
            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, 24), qVar3);
            qVar3.Z(991123350);
            if (((Boolean) g1Var.getValue()).booleanValue()) {
                g1Var3 = g1Var2;
                d1Var2 = d1Var;
                f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d7.t.K(qVar3, -1306056660, new u.l1(5, g1Var2, d1Var)), qVar3, 196614, 24);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f14), qVar3);
            } else {
                g1Var3 = g1Var2;
                d1Var2 = d1Var;
                f6.a.a(fillElement, e0.f.a(f12), k0.t0.d(j11, qVar3, 6), null, null, d7.t.K(qVar3, -1306056660, new u.l1(5, g1Var2, d1Var)), qVar3, 196614, 24);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f14), qVar3);
            }
            z14 = false;
            qVar3.t(false);
            qVar3.Z(991125275);
            if (((Boolean) g1Var3.getValue()).booleanValue()) {
                context2 = context;
                qVar = qVar3;
                z15 = true;
                lVar2 = lVar;
                f15 = f12;
                i21 = 52;
            } else {
                context2 = context;
                qVar = qVar3;
                z15 = true;
                lVar2 = lVar;
                f15 = f12;
                i21 = 52;
            }
            qVar.t(z14);
            qVar.Z(991126226);
            if (((Boolean) g1Var3.getValue()).booleanValue()) {
                context3 = context2;
                lVar3 = lVar2;
                qVar2 = qVar;
                j12 = r43;
                z16 = z14;
            } else {
                context3 = context2;
                lVar3 = lVar2;
                qVar2 = qVar;
                j12 = r43;
                z16 = z14;
            }
            qVar2.t(z16);
            qVar2.Z(991128322);
            if (str2.length() > 0) {
                m9.e0.g(new u.r0(17, str2, context3), androidx.compose.foundation.layout.c.c(fillElement, f11), false, e0.f.a(14), null, null, new u.w(k0.z.f(qVar2).f14967a, a4.q.i(d7.t.e0(new e1.r(j12), new e1.r(e5.a.f5128d)))), null, null, d5.p.f4712c, qVar2, 805306416, 436);
                z17 = false;
            } else {
                z17 = z16;
            }
            qVar2.t(z17);
            qVar2.Z(991129516);
            if (str.length() == 0) {
                f16 = f13;
            } else {
                f16 = f13;
            }
            qVar2.t(false);
            qVar2.Z(-723979200);
            if (z12) {
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar3, f16), qVar2);
                m9.e0.j(aVar3, fillElement, false, null, null, null, null, null, null, d5.p.f4713d, qVar2, ((i17 >> 12) & 14) | 805306416, 508);
            }
            l.q.v(qVar2, false, false, true, false);
            l.q.v(qVar2, false, false, true, false);
            qVar2.t(false);
            z18 = z12;
            aVar4 = aVar3;
        }
        x1VarX = qVar2.x();
        if (x1VarX != null) {
            x1VarX.f11756d = new d5.y(str, str2, str7, z18, aVar4, i10, i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x016a  */
    /* JADX WARN: Code duplicated, block: B:103:0x016d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0186  */
    /* JADX WARN: Code duplicated, block: B:108:0x018c  */
    /* JADX WARN: Code duplicated, block: B:110:0x019a  */
    /* JADX WARN: Code duplicated, block: B:112:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:115:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:116:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:119:0x0221  */
    /* JADX WARN: Code duplicated, block: B:121:0x0228  */
    /* JADX WARN: Code duplicated, block: B:122:0x022c  */
    /* JADX WARN: Code duplicated, block: B:125:0x023f  */
    /* JADX WARN: Code duplicated, block: B:127:0x024d  */
    /* JADX WARN: Code duplicated, block: B:130:0x025d  */
    /* JADX WARN: Code duplicated, block: B:131:0x0260  */
    /* JADX WARN: Code duplicated, block: B:135:0x0282  */
    /* JADX WARN: Code duplicated, block: B:137:0x0293  */
    /* JADX WARN: Code duplicated, block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:91:0x0111  */
    /* JADX WARN: Code duplicated, block: B:92:0x0130  */
    /* JADX WARN: Code duplicated, block: B:95:0x0147  */
    /* JADX WARN: Code duplicated, block: B:96:0x014e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0164  */
    /* JADX WARN: Type inference failed for: r5v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public static final void b(c9.a aVar, y0.o oVar, boolean z10, k0.b1 b1Var, x.m mVar, c9.e eVar, m0.m mVar2, int i10, int i11) {
        int i12;
        y0.o oVar2;
        int i13;
        boolean z11;
        int i14;
        k0.b1 b1Var2;
        int i15;
        x.m mVar3;
        int i16;
        int i17;
        y0.o oVar3;
        k0.b1 b1Var3;
        ?? r10;
        boolean z12;
        int i18;
        x.m mVar4;
        Object objP;
        k0.i0 i0Var;
        k0.b1 b1Var4;
        long j10;
        long j11;
        long jB;
        long j12;
        long j13;
        long j14;
        r1.j0 j0VarC;
        int i19;
        m0.r1 r1VarP;
        t1.j jVar;
        u0.b bVarI;
        t1.i iVar;
        long j15;
        x.m mVar5;
        boolean z13;
        y0.o oVar4;
        k0.b1 b1Var5;
        m0.x1 x1VarX;
        m0.q qVar = (m0.q) mVar2;
        qVar.a0(-1142896114);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (qVar.i(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i20 = i11 & 2;
        if (i20 == 0) {
            if ((i10 & 48) == 0) {
                oVar2 = oVar;
                i12 |= qVar.g(oVar2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 384) == 0) {
                    z11 = z10;
                    if (qVar.h(z11)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i10 & 3072) == 0) {
                    if ((i11 & 8) == 0) {
                        b1Var2 = b1Var;
                        int i21 = qVar.g(b1Var2) ? 2048 : 1024;
                        i12 |= i21;
                    } else {
                        b1Var2 = b1Var;
                    }
                    i12 |= i21;
                } else {
                    b1Var2 = b1Var;
                }
                i15 = i11 & 16;
                if (i15 != 0) {
                    if ((i10 & 24576) == 0) {
                        mVar3 = mVar;
                        if (qVar.g(mVar3)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    if ((i11 & 32) != 0) {
                        i12 |= 196608;
                    } else if ((i10 & 196608) == 0) {
                        if (qVar.i(eVar)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i12 |= i17;
                    }
                    if ((74899 & i12) == 74898 || !qVar.G()) {
                        qVar.W();
                        if ((i10 & 1) != 0 || qVar.E()) {
                            if (i20 != 0) {
                                oVar3 = y0.l.f16729b;
                            } else {
                                oVar3 = oVar2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                qVar.Z(-1519621781);
                                i0Var = (k0.i0) qVar.m(k0.k0.f9091a);
                                qVar.Z(1437915677);
                                b1Var4 = i0Var.P;
                                if (b1Var4 == null) {
                                    long j16 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                                    long j17 = e1.r.f5064f;
                                    b1Var4 = new k0.b1(j17, j16, j17, e1.r.b(j16, 0.38f));
                                    i0Var.P = b1Var4;
                                }
                                qVar.t(false);
                                j10 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                                j11 = b1Var4.f8729b;
                                if (e1.r.c(j11, j10)) {
                                    qVar.t(false);
                                    b1Var3 = b1Var4;
                                } else {
                                    jB = e1.r.b(j10, 0.38f);
                                    long j18 = b1Var4.f8728a;
                                    long j19 = b1Var4.f8730c;
                                    j12 = e1.r.f5065g;
                                    if (j10 == j12) {
                                        j10 = j11;
                                    }
                                    if (jB != j12) {
                                        j13 = jB;
                                    } else {
                                        j13 = b1Var4.f8731d;
                                    }
                                    b1Var3 = new k0.b1(j18, j10, j19, j13);
                                    qVar.t(false);
                                }
                                i12 &= -7169;
                            } else {
                                z11 = z11;
                                b1Var3 = b1Var2;
                            }
                            if (i15 != 0) {
                                qVar.Z(793644531);
                                objP = qVar.P();
                                if (objP == m0.l.f11578a) {
                                    objP = new x.m();
                                    qVar.l0(objP);
                                }
                                r10 = 0;
                                qVar.t(false);
                                i18 = i12;
                                mVar4 = (x.m) objP;
                                z12 = z11;
                            } else {
                                r10 = 0;
                                z12 = z11;
                                i18 = i12;
                                mVar4 = mVar3;
                            }
                        } else {
                            qVar.U();
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                            }
                            i18 = i12;
                            oVar3 = oVar2;
                            z12 = z11;
                            b1Var3 = b1Var2;
                            mVar4 = mVar3;
                            r10 = 0;
                        }
                        qVar.u();
                        m3 m3Var = k0.g1.f8940a;
                        y0.o oVarJ = oVar3.j(MinimumInteractiveModifier.f1691b);
                        float f10 = l0.i.f11065b;
                        y0.o oVarB = androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.c.h(oVarJ, f10), k0.r2.a(5, qVar));
                        if (z12) {
                            j14 = b1Var3.f8728a;
                        } else {
                            j14 = b1Var3.f8730c;
                        }
                        y0.o oVarJ2 = androidx.compose.foundation.a.j(androidx.compose.foundation.a.e(oVarB, j14, e1.g0.f5008a), mVar4, j0.v.a(false, f10 / 2, 0L, qVar, 54, 4), z12, new y1.g(r10), aVar, 8);
                        y0.g gVar = y0.a.f16710c;
                        qVar.Z(733328855);
                        j0VarC = y.p.c(gVar, r10, qVar);
                        qVar.Z(-1323940314);
                        i19 = qVar.P;
                        r1VarP = qVar.p();
                        t1.l.f14477k.getClass();
                        jVar = t1.k.f14458b;
                        bVarI = androidx.compose.ui.layout.a.i(oVarJ2);
                        if (!(qVar.f11630a instanceof m0.d)) {
                            m9.e0.C();
                            throw null;
                        }
                        qVar.c0();
                        if (qVar.O) {
                            qVar.o(jVar);
                        } else {
                            qVar.o0();
                        }
                        d7.t.s0(qVar, j0VarC, t1.k.f14461e);
                        d7.t.s0(qVar, r1VarP, t1.k.f14460d);
                        iVar = t1.k.f14462f;
                        if (qVar.O || !d7.a.d(qVar.P(), Integer.valueOf(i19))) {
                            l.q.r(i19, qVar, i19, iVar);
                        }
                        l.q.s(r10, bVarI, new m0.l2(qVar), qVar, 2058660585);
                        if (z12) {
                            j15 = b1Var3.f8729b;
                        } else {
                            j15 = b1Var3.f8731d;
                        }
                        f6.a.b(k0.s0.f9444a.b(new e1.r(j15)), eVar, qVar, (i18 >> 12) & 112);
                        l.q.v(qVar, r10, true, r10, r10);
                        mVar5 = mVar4;
                        z13 = z12;
                        oVar4 = oVar3;
                        b1Var5 = b1Var3;
                    } else {
                        qVar.U();
                        oVar4 = oVar2;
                        z13 = z11;
                        b1Var5 = b1Var2;
                        mVar5 = mVar3;
                    }
                    x1VarX = qVar.x();
                    if (x1VarX != null) {
                        x1VarX.f11756d = new k0.c1(aVar, oVar4, z13, b1Var5, mVar5, eVar, i10, i11);
                    }
                }
                i12 |= 24576;
                mVar3 = mVar;
                if ((i11 & 32) != 0) {
                    i12 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (qVar.i(eVar)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i12 |= i17;
                }
                if ((74899 & i12) == 74898) {
                    qVar.W();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            oVar3 = y0.l.f16729b;
                        } else {
                            oVar3 = oVar2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            qVar.Z(-1519621781);
                            i0Var = (k0.i0) qVar.m(k0.k0.f9091a);
                            qVar.Z(1437915677);
                            b1Var4 = i0Var.P;
                            if (b1Var4 == null) {
                                long j110 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                                long j111 = e1.r.f5064f;
                                b1Var4 = new k0.b1(j111, j110, j111, e1.r.b(j110, 0.38f));
                                i0Var.P = b1Var4;
                            }
                            qVar.t(false);
                            j10 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                            j11 = b1Var4.f8729b;
                            if (e1.r.c(j11, j10)) {
                                qVar.t(false);
                                b1Var3 = b1Var4;
                            } else {
                                jB = e1.r.b(j10, 0.38f);
                                long j112 = b1Var4.f8728a;
                                long j113 = b1Var4.f8730c;
                                j12 = e1.r.f5065g;
                                if (j10 == j12) {
                                    j10 = j11;
                                }
                                if (jB != j12) {
                                    j13 = jB;
                                } else {
                                    j13 = b1Var4.f8731d;
                                }
                                b1Var3 = new k0.b1(j112, j10, j113, j13);
                                qVar.t(false);
                            }
                            i12 &= -7169;
                        } else {
                            z11 = z11;
                            b1Var3 = b1Var2;
                        }
                        if (i15 != 0) {
                            qVar.Z(793644531);
                            objP = qVar.P();
                            if (objP == m0.l.f11578a) {
                                objP = new x.m();
                                qVar.l0(objP);
                            }
                            r10 = 0;
                            qVar.t(false);
                            i18 = i12;
                            mVar4 = (x.m) objP;
                            z12 = z11;
                        } else {
                            r10 = 0;
                            z12 = z11;
                            i18 = i12;
                            mVar4 = mVar3;
                        }
                    } else {
                        if (i20 != 0) {
                            oVar3 = y0.l.f16729b;
                        } else {
                            oVar3 = oVar2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            qVar.Z(-1519621781);
                            i0Var = (k0.i0) qVar.m(k0.k0.f9091a);
                            qVar.Z(1437915677);
                            b1Var4 = i0Var.P;
                            if (b1Var4 == null) {
                                long j114 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                                long j115 = e1.r.f5064f;
                                b1Var4 = new k0.b1(j115, j114, j115, e1.r.b(j114, 0.38f));
                                i0Var.P = b1Var4;
                            }
                            qVar.t(false);
                            j10 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                            j11 = b1Var4.f8729b;
                            if (e1.r.c(j11, j10)) {
                                qVar.t(false);
                                b1Var3 = b1Var4;
                            } else {
                                jB = e1.r.b(j10, 0.38f);
                                long j116 = b1Var4.f8728a;
                                long j117 = b1Var4.f8730c;
                                j12 = e1.r.f5065g;
                                if (j10 == j12) {
                                    j10 = j11;
                                }
                                if (jB != j12) {
                                    j13 = jB;
                                } else {
                                    j13 = b1Var4.f8731d;
                                }
                                b1Var3 = new k0.b1(j116, j10, j117, j13);
                                qVar.t(false);
                            }
                            i12 &= -7169;
                        } else {
                            z11 = z11;
                            b1Var3 = b1Var2;
                        }
                        if (i15 != 0) {
                            qVar.Z(793644531);
                            objP = qVar.P();
                            if (objP == m0.l.f11578a) {
                                objP = new x.m();
                                qVar.l0(objP);
                            }
                            r10 = 0;
                            qVar.t(false);
                            i18 = i12;
                            mVar4 = (x.m) objP;
                            z12 = z11;
                        } else {
                            r10 = 0;
                            z12 = z11;
                            i18 = i12;
                            mVar4 = mVar3;
                        }
                    }
                    qVar.u();
                    m3 m3Var2 = k0.g1.f8940a;
                    y0.o oVarJ3 = oVar3.j(MinimumInteractiveModifier.f1691b);
                    float f11 = l0.i.f11065b;
                    y0.o oVarB2 = androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.c.h(oVarJ3, f11), k0.r2.a(5, qVar));
                    if (z12) {
                        j14 = b1Var3.f8728a;
                    } else {
                        j14 = b1Var3.f8730c;
                    }
                    y0.o oVarJ4 = androidx.compose.foundation.a.j(androidx.compose.foundation.a.e(oVarB2, j14, e1.g0.f5008a), mVar4, j0.v.a(false, f11 / 2, 0L, qVar, 54, 4), z12, new y1.g(r10), aVar, 8);
                    y0.g gVar2 = y0.a.f16710c;
                    qVar.Z(733328855);
                    j0VarC = y.p.c(gVar2, r10, qVar);
                    qVar.Z(-1323940314);
                    i19 = qVar.P;
                    r1VarP = qVar.p();
                    t1.l.f14477k.getClass();
                    jVar = t1.k.f14458b;
                    bVarI = androidx.compose.ui.layout.a.i(oVarJ4);
                    if (!(qVar.f11630a instanceof m0.d)) {
                        m9.e0.C();
                        throw null;
                    }
                    qVar.c0();
                    if (qVar.O) {
                        qVar.o(jVar);
                    } else {
                        qVar.o0();
                    }
                    d7.t.s0(qVar, j0VarC, t1.k.f14461e);
                    d7.t.s0(qVar, r1VarP, t1.k.f14460d);
                    iVar = t1.k.f14462f;
                    if (qVar.O) {
                        l.q.r(i19, qVar, i19, iVar);
                    } else {
                        l.q.r(i19, qVar, i19, iVar);
                    }
                    l.q.s(r10, bVarI, new m0.l2(qVar), qVar, 2058660585);
                    if (z12) {
                        j15 = b1Var3.f8729b;
                    } else {
                        j15 = b1Var3.f8731d;
                    }
                    f6.a.b(k0.s0.f9444a.b(new e1.r(j15)), eVar, qVar, (i18 >> 12) & 112);
                    l.q.v(qVar, r10, true, r10, r10);
                    mVar5 = mVar4;
                    z13 = z12;
                    oVar4 = oVar3;
                    b1Var5 = b1Var3;
                } else {
                    qVar.W();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            oVar3 = y0.l.f16729b;
                        } else {
                            oVar3 = oVar2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            qVar.Z(-1519621781);
                            i0Var = (k0.i0) qVar.m(k0.k0.f9091a);
                            qVar.Z(1437915677);
                            b1Var4 = i0Var.P;
                            if (b1Var4 == null) {
                                long j118 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                                long j119 = e1.r.f5064f;
                                b1Var4 = new k0.b1(j119, j118, j119, e1.r.b(j118, 0.38f));
                                i0Var.P = b1Var4;
                            }
                            qVar.t(false);
                            j10 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                            j11 = b1Var4.f8729b;
                            if (e1.r.c(j11, j10)) {
                                qVar.t(false);
                                b1Var3 = b1Var4;
                            } else {
                                jB = e1.r.b(j10, 0.38f);
                                long j1110 = b1Var4.f8728a;
                                long j1111 = b1Var4.f8730c;
                                j12 = e1.r.f5065g;
                                if (j10 == j12) {
                                    j10 = j11;
                                }
                                if (jB != j12) {
                                    j13 = jB;
                                } else {
                                    j13 = b1Var4.f8731d;
                                }
                                b1Var3 = new k0.b1(j1110, j10, j1111, j13);
                                qVar.t(false);
                            }
                            i12 &= -7169;
                        } else {
                            z11 = z11;
                            b1Var3 = b1Var2;
                        }
                        if (i15 != 0) {
                            qVar.Z(793644531);
                            objP = qVar.P();
                            if (objP == m0.l.f11578a) {
                                objP = new x.m();
                                qVar.l0(objP);
                            }
                            r10 = 0;
                            qVar.t(false);
                            i18 = i12;
                            mVar4 = (x.m) objP;
                            z12 = z11;
                        } else {
                            r10 = 0;
                            z12 = z11;
                            i18 = i12;
                            mVar4 = mVar3;
                        }
                    } else {
                        if (i20 != 0) {
                            oVar3 = y0.l.f16729b;
                        } else {
                            oVar3 = oVar2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            qVar.Z(-1519621781);
                            i0Var = (k0.i0) qVar.m(k0.k0.f9091a);
                            qVar.Z(1437915677);
                            b1Var4 = i0Var.P;
                            if (b1Var4 == null) {
                                long j1112 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                                long j1113 = e1.r.f5064f;
                                b1Var4 = new k0.b1(j1113, j1112, j1113, e1.r.b(j1112, 0.38f));
                                i0Var.P = b1Var4;
                            }
                            qVar.t(false);
                            j10 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                            j11 = b1Var4.f8729b;
                            if (e1.r.c(j11, j10)) {
                                qVar.t(false);
                                b1Var3 = b1Var4;
                            } else {
                                jB = e1.r.b(j10, 0.38f);
                                long j1114 = b1Var4.f8728a;
                                long j1115 = b1Var4.f8730c;
                                j12 = e1.r.f5065g;
                                if (j10 == j12) {
                                    j10 = j11;
                                }
                                if (jB != j12) {
                                    j13 = jB;
                                } else {
                                    j13 = b1Var4.f8731d;
                                }
                                b1Var3 = new k0.b1(j1114, j10, j1115, j13);
                                qVar.t(false);
                            }
                            i12 &= -7169;
                        } else {
                            z11 = z11;
                            b1Var3 = b1Var2;
                        }
                        if (i15 != 0) {
                            qVar.Z(793644531);
                            objP = qVar.P();
                            if (objP == m0.l.f11578a) {
                                objP = new x.m();
                                qVar.l0(objP);
                            }
                            r10 = 0;
                            qVar.t(false);
                            i18 = i12;
                            mVar4 = (x.m) objP;
                            z12 = z11;
                        } else {
                            r10 = 0;
                            z12 = z11;
                            i18 = i12;
                            mVar4 = mVar3;
                        }
                    }
                    qVar.u();
                    m3 m3Var3 = k0.g1.f8940a;
                    y0.o oVarJ5 = oVar3.j(MinimumInteractiveModifier.f1691b);
                    float f12 = l0.i.f11065b;
                    y0.o oVarB3 = androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.c.h(oVarJ5, f12), k0.r2.a(5, qVar));
                    if (z12) {
                        j14 = b1Var3.f8728a;
                    } else {
                        j14 = b1Var3.f8730c;
                    }
                    y0.o oVarJ6 = androidx.compose.foundation.a.j(androidx.compose.foundation.a.e(oVarB3, j14, e1.g0.f5008a), mVar4, j0.v.a(false, f12 / 2, 0L, qVar, 54, 4), z12, new y1.g(r10), aVar, 8);
                    y0.g gVar3 = y0.a.f16710c;
                    qVar.Z(733328855);
                    j0VarC = y.p.c(gVar3, r10, qVar);
                    qVar.Z(-1323940314);
                    i19 = qVar.P;
                    r1VarP = qVar.p();
                    t1.l.f14477k.getClass();
                    jVar = t1.k.f14458b;
                    bVarI = androidx.compose.ui.layout.a.i(oVarJ6);
                    if (!(qVar.f11630a instanceof m0.d)) {
                        m9.e0.C();
                        throw null;
                    }
                    qVar.c0();
                    if (qVar.O) {
                        qVar.o(jVar);
                    } else {
                        qVar.o0();
                    }
                    d7.t.s0(qVar, j0VarC, t1.k.f14461e);
                    d7.t.s0(qVar, r1VarP, t1.k.f14460d);
                    iVar = t1.k.f14462f;
                    if (qVar.O) {
                        l.q.r(i19, qVar, i19, iVar);
                    } else {
                        l.q.r(i19, qVar, i19, iVar);
                    }
                    l.q.s(r10, bVarI, new m0.l2(qVar), qVar, 2058660585);
                    if (z12) {
                        j15 = b1Var3.f8729b;
                    } else {
                        j15 = b1Var3.f8731d;
                    }
                    f6.a.b(k0.s0.f9444a.b(new e1.r(j15)), eVar, qVar, (i18 >> 12) & 112);
                    l.q.v(qVar, r10, true, r10, r10);
                    mVar5 = mVar4;
                    z13 = z12;
                    oVar4 = oVar3;
                    b1Var5 = b1Var3;
                }
                x1VarX = qVar.x();
                if (x1VarX != null) {
                    x1VarX.f11756d = new k0.c1(aVar, oVar4, z13, b1Var5, mVar5, eVar, i10, i11);
                }
            }
            i12 |= 384;
            z11 = z10;
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    b1Var2 = b1Var;
                    if (qVar.g(b1Var2)) {
                    }
                    i12 |= i21;
                } else {
                    b1Var2 = b1Var;
                }
                i12 |= i21;
            } else {
                b1Var2 = b1Var;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    mVar3 = mVar;
                    if (qVar.g(mVar3)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((i11 & 32) != 0) {
                    i12 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (qVar.i(eVar)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i12 |= i17;
                }
                if ((74899 & i12) == 74898) {
                    qVar.W();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            oVar3 = y0.l.f16729b;
                        } else {
                            oVar3 = oVar2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            qVar.Z(-1519621781);
                            i0Var = (k0.i0) qVar.m(k0.k0.f9091a);
                            qVar.Z(1437915677);
                            b1Var4 = i0Var.P;
                            if (b1Var4 == null) {
                                long j1116 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                                long j1117 = e1.r.f5064f;
                                b1Var4 = new k0.b1(j1117, j1116, j1117, e1.r.b(j1116, 0.38f));
                                i0Var.P = b1Var4;
                            }
                            qVar.t(false);
                            j10 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                            j11 = b1Var4.f8729b;
                            if (e1.r.c(j11, j10)) {
                                qVar.t(false);
                                b1Var3 = b1Var4;
                            } else {
                                jB = e1.r.b(j10, 0.38f);
                                long j1118 = b1Var4.f8728a;
                                long j1119 = b1Var4.f8730c;
                                j12 = e1.r.f5065g;
                                if (j10 == j12) {
                                    j10 = j11;
                                }
                                if (jB != j12) {
                                    j13 = jB;
                                } else {
                                    j13 = b1Var4.f8731d;
                                }
                                b1Var3 = new k0.b1(j1118, j10, j1119, j13);
                                qVar.t(false);
                            }
                            i12 &= -7169;
                        } else {
                            z11 = z11;
                            b1Var3 = b1Var2;
                        }
                        if (i15 != 0) {
                            qVar.Z(793644531);
                            objP = qVar.P();
                            if (objP == m0.l.f11578a) {
                                objP = new x.m();
                                qVar.l0(objP);
                            }
                            r10 = 0;
                            qVar.t(false);
                            i18 = i12;
                            mVar4 = (x.m) objP;
                            z12 = z11;
                        } else {
                            r10 = 0;
                            z12 = z11;
                            i18 = i12;
                            mVar4 = mVar3;
                        }
                    } else {
                        if (i20 != 0) {
                            oVar3 = y0.l.f16729b;
                        } else {
                            oVar3 = oVar2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            qVar.Z(-1519621781);
                            i0Var = (k0.i0) qVar.m(k0.k0.f9091a);
                            qVar.Z(1437915677);
                            b1Var4 = i0Var.P;
                            if (b1Var4 == null) {
                                long j11110 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                                long j11111 = e1.r.f5064f;
                                b1Var4 = new k0.b1(j11111, j11110, j11111, e1.r.b(j11110, 0.38f));
                                i0Var.P = b1Var4;
                            }
                            qVar.t(false);
                            j10 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                            j11 = b1Var4.f8729b;
                            if (e1.r.c(j11, j10)) {
                                qVar.t(false);
                                b1Var3 = b1Var4;
                            } else {
                                jB = e1.r.b(j10, 0.38f);
                                long j11112 = b1Var4.f8728a;
                                long j11113 = b1Var4.f8730c;
                                j12 = e1.r.f5065g;
                                if (j10 == j12) {
                                    j10 = j11;
                                }
                                if (jB != j12) {
                                    j13 = jB;
                                } else {
                                    j13 = b1Var4.f8731d;
                                }
                                b1Var3 = new k0.b1(j11112, j10, j11113, j13);
                                qVar.t(false);
                            }
                            i12 &= -7169;
                        } else {
                            z11 = z11;
                            b1Var3 = b1Var2;
                        }
                        if (i15 != 0) {
                            qVar.Z(793644531);
                            objP = qVar.P();
                            if (objP == m0.l.f11578a) {
                                objP = new x.m();
                                qVar.l0(objP);
                            }
                            r10 = 0;
                            qVar.t(false);
                            i18 = i12;
                            mVar4 = (x.m) objP;
                            z12 = z11;
                        } else {
                            r10 = 0;
                            z12 = z11;
                            i18 = i12;
                            mVar4 = mVar3;
                        }
                    }
                    qVar.u();
                    m3 m3Var4 = k0.g1.f8940a;
                    y0.o oVarJ7 = oVar3.j(MinimumInteractiveModifier.f1691b);
                    float f13 = l0.i.f11065b;
                    y0.o oVarB4 = androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.c.h(oVarJ7, f13), k0.r2.a(5, qVar));
                    if (z12) {
                        j14 = b1Var3.f8728a;
                    } else {
                        j14 = b1Var3.f8730c;
                    }
                    y0.o oVarJ8 = androidx.compose.foundation.a.j(androidx.compose.foundation.a.e(oVarB4, j14, e1.g0.f5008a), mVar4, j0.v.a(false, f13 / 2, 0L, qVar, 54, 4), z12, new y1.g(r10), aVar, 8);
                    y0.g gVar4 = y0.a.f16710c;
                    qVar.Z(733328855);
                    j0VarC = y.p.c(gVar4, r10, qVar);
                    qVar.Z(-1323940314);
                    i19 = qVar.P;
                    r1VarP = qVar.p();
                    t1.l.f14477k.getClass();
                    jVar = t1.k.f14458b;
                    bVarI = androidx.compose.ui.layout.a.i(oVarJ8);
                    if (!(qVar.f11630a instanceof m0.d)) {
                        m9.e0.C();
                        throw null;
                    }
                    qVar.c0();
                    if (qVar.O) {
                        qVar.o(jVar);
                    } else {
                        qVar.o0();
                    }
                    d7.t.s0(qVar, j0VarC, t1.k.f14461e);
                    d7.t.s0(qVar, r1VarP, t1.k.f14460d);
                    iVar = t1.k.f14462f;
                    if (qVar.O) {
                        l.q.r(i19, qVar, i19, iVar);
                    } else {
                        l.q.r(i19, qVar, i19, iVar);
                    }
                    l.q.s(r10, bVarI, new m0.l2(qVar), qVar, 2058660585);
                    if (z12) {
                        j15 = b1Var3.f8729b;
                    } else {
                        j15 = b1Var3.f8731d;
                    }
                    f6.a.b(k0.s0.f9444a.b(new e1.r(j15)), eVar, qVar, (i18 >> 12) & 112);
                    l.q.v(qVar, r10, true, r10, r10);
                    mVar5 = mVar4;
                    z13 = z12;
                    oVar4 = oVar3;
                    b1Var5 = b1Var3;
                } else {
                    qVar.W();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            oVar3 = y0.l.f16729b;
                        } else {
                            oVar3 = oVar2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            qVar.Z(-1519621781);
                            i0Var = (k0.i0) qVar.m(k0.k0.f9091a);
                            qVar.Z(1437915677);
                            b1Var4 = i0Var.P;
                            if (b1Var4 == null) {
                                long j11114 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                                long j11115 = e1.r.f5064f;
                                b1Var4 = new k0.b1(j11115, j11114, j11115, e1.r.b(j11114, 0.38f));
                                i0Var.P = b1Var4;
                            }
                            qVar.t(false);
                            j10 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                            j11 = b1Var4.f8729b;
                            if (e1.r.c(j11, j10)) {
                                qVar.t(false);
                                b1Var3 = b1Var4;
                            } else {
                                jB = e1.r.b(j10, 0.38f);
                                long j11116 = b1Var4.f8728a;
                                long j11117 = b1Var4.f8730c;
                                j12 = e1.r.f5065g;
                                if (j10 == j12) {
                                    j10 = j11;
                                }
                                if (jB != j12) {
                                    j13 = jB;
                                } else {
                                    j13 = b1Var4.f8731d;
                                }
                                b1Var3 = new k0.b1(j11116, j10, j11117, j13);
                                qVar.t(false);
                            }
                            i12 &= -7169;
                        } else {
                            z11 = z11;
                            b1Var3 = b1Var2;
                        }
                        if (i15 != 0) {
                            qVar.Z(793644531);
                            objP = qVar.P();
                            if (objP == m0.l.f11578a) {
                                objP = new x.m();
                                qVar.l0(objP);
                            }
                            r10 = 0;
                            qVar.t(false);
                            i18 = i12;
                            mVar4 = (x.m) objP;
                            z12 = z11;
                        } else {
                            r10 = 0;
                            z12 = z11;
                            i18 = i12;
                            mVar4 = mVar3;
                        }
                    } else {
                        if (i20 != 0) {
                            oVar3 = y0.l.f16729b;
                        } else {
                            oVar3 = oVar2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            qVar.Z(-1519621781);
                            i0Var = (k0.i0) qVar.m(k0.k0.f9091a);
                            qVar.Z(1437915677);
                            b1Var4 = i0Var.P;
                            if (b1Var4 == null) {
                                long j11118 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                                long j11119 = e1.r.f5064f;
                                b1Var4 = new k0.b1(j11119, j11118, j11119, e1.r.b(j11118, 0.38f));
                                i0Var.P = b1Var4;
                            }
                            qVar.t(false);
                            j10 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                            j11 = b1Var4.f8729b;
                            if (e1.r.c(j11, j10)) {
                                qVar.t(false);
                                b1Var3 = b1Var4;
                            } else {
                                jB = e1.r.b(j10, 0.38f);
                                long j111110 = b1Var4.f8728a;
                                long j111111 = b1Var4.f8730c;
                                j12 = e1.r.f5065g;
                                if (j10 == j12) {
                                    j10 = j11;
                                }
                                if (jB != j12) {
                                    j13 = jB;
                                } else {
                                    j13 = b1Var4.f8731d;
                                }
                                b1Var3 = new k0.b1(j111110, j10, j111111, j13);
                                qVar.t(false);
                            }
                            i12 &= -7169;
                        } else {
                            z11 = z11;
                            b1Var3 = b1Var2;
                        }
                        if (i15 != 0) {
                            qVar.Z(793644531);
                            objP = qVar.P();
                            if (objP == m0.l.f11578a) {
                                objP = new x.m();
                                qVar.l0(objP);
                            }
                            r10 = 0;
                            qVar.t(false);
                            i18 = i12;
                            mVar4 = (x.m) objP;
                            z12 = z11;
                        } else {
                            r10 = 0;
                            z12 = z11;
                            i18 = i12;
                            mVar4 = mVar3;
                        }
                    }
                    qVar.u();
                    m3 m3Var5 = k0.g1.f8940a;
                    y0.o oVarJ9 = oVar3.j(MinimumInteractiveModifier.f1691b);
                    float f14 = l0.i.f11065b;
                    y0.o oVarB5 = androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.c.h(oVarJ9, f14), k0.r2.a(5, qVar));
                    if (z12) {
                        j14 = b1Var3.f8728a;
                    } else {
                        j14 = b1Var3.f8730c;
                    }
                    y0.o oVarJ10 = androidx.compose.foundation.a.j(androidx.compose.foundation.a.e(oVarB5, j14, e1.g0.f5008a), mVar4, j0.v.a(false, f14 / 2, 0L, qVar, 54, 4), z12, new y1.g(r10), aVar, 8);
                    y0.g gVar5 = y0.a.f16710c;
                    qVar.Z(733328855);
                    j0VarC = y.p.c(gVar5, r10, qVar);
                    qVar.Z(-1323940314);
                    i19 = qVar.P;
                    r1VarP = qVar.p();
                    t1.l.f14477k.getClass();
                    jVar = t1.k.f14458b;
                    bVarI = androidx.compose.ui.layout.a.i(oVarJ10);
                    if (!(qVar.f11630a instanceof m0.d)) {
                        m9.e0.C();
                        throw null;
                    }
                    qVar.c0();
                    if (qVar.O) {
                        qVar.o(jVar);
                    } else {
                        qVar.o0();
                    }
                    d7.t.s0(qVar, j0VarC, t1.k.f14461e);
                    d7.t.s0(qVar, r1VarP, t1.k.f14460d);
                    iVar = t1.k.f14462f;
                    if (qVar.O) {
                        l.q.r(i19, qVar, i19, iVar);
                    } else {
                        l.q.r(i19, qVar, i19, iVar);
                    }
                    l.q.s(r10, bVarI, new m0.l2(qVar), qVar, 2058660585);
                    if (z12) {
                        j15 = b1Var3.f8729b;
                    } else {
                        j15 = b1Var3.f8731d;
                    }
                    f6.a.b(k0.s0.f9444a.b(new e1.r(j15)), eVar, qVar, (i18 >> 12) & 112);
                    l.q.v(qVar, r10, true, r10, r10);
                    mVar5 = mVar4;
                    z13 = z12;
                    oVar4 = oVar3;
                    b1Var5 = b1Var3;
                }
                x1VarX = qVar.x();
                if (x1VarX != null) {
                    x1VarX.f11756d = new k0.c1(aVar, oVar4, z13, b1Var5, mVar5, eVar, i10, i11);
                }
            }
            i12 |= 24576;
            mVar3 = mVar;
            if ((i11 & 32) != 0) {
                i12 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (qVar.i(eVar)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i12 |= i17;
            }
            if ((74899 & i12) == 74898) {
                qVar.W();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        oVar3 = y0.l.f16729b;
                    } else {
                        oVar3 = oVar2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        qVar.Z(-1519621781);
                        i0Var = (k0.i0) qVar.m(k0.k0.f9091a);
                        qVar.Z(1437915677);
                        b1Var4 = i0Var.P;
                        if (b1Var4 == null) {
                            long j111112 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                            long j111113 = e1.r.f5064f;
                            b1Var4 = new k0.b1(j111113, j111112, j111113, e1.r.b(j111112, 0.38f));
                            i0Var.P = b1Var4;
                        }
                        qVar.t(false);
                        j10 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                        j11 = b1Var4.f8729b;
                        if (e1.r.c(j11, j10)) {
                            qVar.t(false);
                            b1Var3 = b1Var4;
                        } else {
                            jB = e1.r.b(j10, 0.38f);
                            long j111114 = b1Var4.f8728a;
                            long j111115 = b1Var4.f8730c;
                            j12 = e1.r.f5065g;
                            if (j10 == j12) {
                                j10 = j11;
                            }
                            if (jB != j12) {
                                j13 = jB;
                            } else {
                                j13 = b1Var4.f8731d;
                            }
                            b1Var3 = new k0.b1(j111114, j10, j111115, j13);
                            qVar.t(false);
                        }
                        i12 &= -7169;
                    } else {
                        z11 = z11;
                        b1Var3 = b1Var2;
                    }
                    if (i15 != 0) {
                        qVar.Z(793644531);
                        objP = qVar.P();
                        if (objP == m0.l.f11578a) {
                            objP = new x.m();
                            qVar.l0(objP);
                        }
                        r10 = 0;
                        qVar.t(false);
                        i18 = i12;
                        mVar4 = (x.m) objP;
                        z12 = z11;
                    } else {
                        r10 = 0;
                        z12 = z11;
                        i18 = i12;
                        mVar4 = mVar3;
                    }
                } else {
                    if (i20 != 0) {
                        oVar3 = y0.l.f16729b;
                    } else {
                        oVar3 = oVar2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        qVar.Z(-1519621781);
                        i0Var = (k0.i0) qVar.m(k0.k0.f9091a);
                        qVar.Z(1437915677);
                        b1Var4 = i0Var.P;
                        if (b1Var4 == null) {
                            long j111116 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                            long j111117 = e1.r.f5064f;
                            b1Var4 = new k0.b1(j111117, j111116, j111117, e1.r.b(j111116, 0.38f));
                            i0Var.P = b1Var4;
                        }
                        qVar.t(false);
                        j10 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                        j11 = b1Var4.f8729b;
                        if (e1.r.c(j11, j10)) {
                            qVar.t(false);
                            b1Var3 = b1Var4;
                        } else {
                            jB = e1.r.b(j10, 0.38f);
                            long j111118 = b1Var4.f8728a;
                            long j111119 = b1Var4.f8730c;
                            j12 = e1.r.f5065g;
                            if (j10 == j12) {
                                j10 = j11;
                            }
                            if (jB != j12) {
                                j13 = jB;
                            } else {
                                j13 = b1Var4.f8731d;
                            }
                            b1Var3 = new k0.b1(j111118, j10, j111119, j13);
                            qVar.t(false);
                        }
                        i12 &= -7169;
                    } else {
                        z11 = z11;
                        b1Var3 = b1Var2;
                    }
                    if (i15 != 0) {
                        qVar.Z(793644531);
                        objP = qVar.P();
                        if (objP == m0.l.f11578a) {
                            objP = new x.m();
                            qVar.l0(objP);
                        }
                        r10 = 0;
                        qVar.t(false);
                        i18 = i12;
                        mVar4 = (x.m) objP;
                        z12 = z11;
                    } else {
                        r10 = 0;
                        z12 = z11;
                        i18 = i12;
                        mVar4 = mVar3;
                    }
                }
                qVar.u();
                m3 m3Var6 = k0.g1.f8940a;
                y0.o oVarJ11 = oVar3.j(MinimumInteractiveModifier.f1691b);
                float f15 = l0.i.f11065b;
                y0.o oVarB6 = androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.c.h(oVarJ11, f15), k0.r2.a(5, qVar));
                if (z12) {
                    j14 = b1Var3.f8728a;
                } else {
                    j14 = b1Var3.f8730c;
                }
                y0.o oVarJ12 = androidx.compose.foundation.a.j(androidx.compose.foundation.a.e(oVarB6, j14, e1.g0.f5008a), mVar4, j0.v.a(false, f15 / 2, 0L, qVar, 54, 4), z12, new y1.g(r10), aVar, 8);
                y0.g gVar6 = y0.a.f16710c;
                qVar.Z(733328855);
                j0VarC = y.p.c(gVar6, r10, qVar);
                qVar.Z(-1323940314);
                i19 = qVar.P;
                r1VarP = qVar.p();
                t1.l.f14477k.getClass();
                jVar = t1.k.f14458b;
                bVarI = androidx.compose.ui.layout.a.i(oVarJ12);
                if (!(qVar.f11630a instanceof m0.d)) {
                    m9.e0.C();
                    throw null;
                }
                qVar.c0();
                if (qVar.O) {
                    qVar.o(jVar);
                } else {
                    qVar.o0();
                }
                d7.t.s0(qVar, j0VarC, t1.k.f14461e);
                d7.t.s0(qVar, r1VarP, t1.k.f14460d);
                iVar = t1.k.f14462f;
                if (qVar.O) {
                    l.q.r(i19, qVar, i19, iVar);
                } else {
                    l.q.r(i19, qVar, i19, iVar);
                }
                l.q.s(r10, bVarI, new m0.l2(qVar), qVar, 2058660585);
                if (z12) {
                    j15 = b1Var3.f8729b;
                } else {
                    j15 = b1Var3.f8731d;
                }
                f6.a.b(k0.s0.f9444a.b(new e1.r(j15)), eVar, qVar, (i18 >> 12) & 112);
                l.q.v(qVar, r10, true, r10, r10);
                mVar5 = mVar4;
                z13 = z12;
                oVar4 = oVar3;
                b1Var5 = b1Var3;
            } else {
                qVar.W();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        oVar3 = y0.l.f16729b;
                    } else {
                        oVar3 = oVar2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        qVar.Z(-1519621781);
                        i0Var = (k0.i0) qVar.m(k0.k0.f9091a);
                        qVar.Z(1437915677);
                        b1Var4 = i0Var.P;
                        if (b1Var4 == null) {
                            long j1111110 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                            long j1111111 = e1.r.f5064f;
                            b1Var4 = new k0.b1(j1111111, j1111110, j1111111, e1.r.b(j1111110, 0.38f));
                            i0Var.P = b1Var4;
                        }
                        qVar.t(false);
                        j10 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                        j11 = b1Var4.f8729b;
                        if (e1.r.c(j11, j10)) {
                            qVar.t(false);
                            b1Var3 = b1Var4;
                        } else {
                            jB = e1.r.b(j10, 0.38f);
                            long j1111112 = b1Var4.f8728a;
                            long j1111113 = b1Var4.f8730c;
                            j12 = e1.r.f5065g;
                            if (j10 == j12) {
                                j10 = j11;
                            }
                            if (jB != j12) {
                                j13 = jB;
                            } else {
                                j13 = b1Var4.f8731d;
                            }
                            b1Var3 = new k0.b1(j1111112, j10, j1111113, j13);
                            qVar.t(false);
                        }
                        i12 &= -7169;
                    } else {
                        z11 = z11;
                        b1Var3 = b1Var2;
                    }
                    if (i15 != 0) {
                        qVar.Z(793644531);
                        objP = qVar.P();
                        if (objP == m0.l.f11578a) {
                            objP = new x.m();
                            qVar.l0(objP);
                        }
                        r10 = 0;
                        qVar.t(false);
                        i18 = i12;
                        mVar4 = (x.m) objP;
                        z12 = z11;
                    } else {
                        r10 = 0;
                        z12 = z11;
                        i18 = i12;
                        mVar4 = mVar3;
                    }
                } else {
                    if (i20 != 0) {
                        oVar3 = y0.l.f16729b;
                    } else {
                        oVar3 = oVar2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        qVar.Z(-1519621781);
                        i0Var = (k0.i0) qVar.m(k0.k0.f9091a);
                        qVar.Z(1437915677);
                        b1Var4 = i0Var.P;
                        if (b1Var4 == null) {
                            long j1111114 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                            long j1111115 = e1.r.f5064f;
                            b1Var4 = new k0.b1(j1111115, j1111114, j1111115, e1.r.b(j1111114, 0.38f));
                            i0Var.P = b1Var4;
                        }
                        qVar.t(false);
                        j10 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                        j11 = b1Var4.f8729b;
                        if (e1.r.c(j11, j10)) {
                            qVar.t(false);
                            b1Var3 = b1Var4;
                        } else {
                            jB = e1.r.b(j10, 0.38f);
                            long j1111116 = b1Var4.f8728a;
                            long j1111117 = b1Var4.f8730c;
                            j12 = e1.r.f5065g;
                            if (j10 == j12) {
                                j10 = j11;
                            }
                            if (jB != j12) {
                                j13 = jB;
                            } else {
                                j13 = b1Var4.f8731d;
                            }
                            b1Var3 = new k0.b1(j1111116, j10, j1111117, j13);
                            qVar.t(false);
                        }
                        i12 &= -7169;
                    } else {
                        z11 = z11;
                        b1Var3 = b1Var2;
                    }
                    if (i15 != 0) {
                        qVar.Z(793644531);
                        objP = qVar.P();
                        if (objP == m0.l.f11578a) {
                            objP = new x.m();
                            qVar.l0(objP);
                        }
                        r10 = 0;
                        qVar.t(false);
                        i18 = i12;
                        mVar4 = (x.m) objP;
                        z12 = z11;
                    } else {
                        r10 = 0;
                        z12 = z11;
                        i18 = i12;
                        mVar4 = mVar3;
                    }
                }
                qVar.u();
                m3 m3Var7 = k0.g1.f8940a;
                y0.o oVarJ13 = oVar3.j(MinimumInteractiveModifier.f1691b);
                float f16 = l0.i.f11065b;
                y0.o oVarB7 = androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.c.h(oVarJ13, f16), k0.r2.a(5, qVar));
                if (z12) {
                    j14 = b1Var3.f8728a;
                } else {
                    j14 = b1Var3.f8730c;
                }
                y0.o oVarJ14 = androidx.compose.foundation.a.j(androidx.compose.foundation.a.e(oVarB7, j14, e1.g0.f5008a), mVar4, j0.v.a(false, f16 / 2, 0L, qVar, 54, 4), z12, new y1.g(r10), aVar, 8);
                y0.g gVar7 = y0.a.f16710c;
                qVar.Z(733328855);
                j0VarC = y.p.c(gVar7, r10, qVar);
                qVar.Z(-1323940314);
                i19 = qVar.P;
                r1VarP = qVar.p();
                t1.l.f14477k.getClass();
                jVar = t1.k.f14458b;
                bVarI = androidx.compose.ui.layout.a.i(oVarJ14);
                if (!(qVar.f11630a instanceof m0.d)) {
                    m9.e0.C();
                    throw null;
                }
                qVar.c0();
                if (qVar.O) {
                    qVar.o(jVar);
                } else {
                    qVar.o0();
                }
                d7.t.s0(qVar, j0VarC, t1.k.f14461e);
                d7.t.s0(qVar, r1VarP, t1.k.f14460d);
                iVar = t1.k.f14462f;
                if (qVar.O) {
                    l.q.r(i19, qVar, i19, iVar);
                } else {
                    l.q.r(i19, qVar, i19, iVar);
                }
                l.q.s(r10, bVarI, new m0.l2(qVar), qVar, 2058660585);
                if (z12) {
                    j15 = b1Var3.f8729b;
                } else {
                    j15 = b1Var3.f8731d;
                }
                f6.a.b(k0.s0.f9444a.b(new e1.r(j15)), eVar, qVar, (i18 >> 12) & 112);
                l.q.v(qVar, r10, true, r10, r10);
                mVar5 = mVar4;
                z13 = z12;
                oVar4 = oVar3;
                b1Var5 = b1Var3;
            }
            x1VarX = qVar.x();
            if (x1VarX != null) {
                x1VarX.f11756d = new k0.c1(aVar, oVar4, z13, b1Var5, mVar5, eVar, i10, i11);
            }
        }
        i12 |= 48;
        oVar2 = oVar;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 384) == 0) {
                z11 = z10;
                if (qVar.h(z11)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    b1Var2 = b1Var;
                    if (qVar.g(b1Var2)) {
                    }
                    i12 |= i21;
                } else {
                    b1Var2 = b1Var;
                }
                i12 |= i21;
            } else {
                b1Var2 = b1Var;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    mVar3 = mVar;
                    if (qVar.g(mVar3)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((i11 & 32) != 0) {
                    i12 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (qVar.i(eVar)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i12 |= i17;
                }
                if ((74899 & i12) == 74898) {
                    qVar.W();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            oVar3 = y0.l.f16729b;
                        } else {
                            oVar3 = oVar2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            qVar.Z(-1519621781);
                            i0Var = (k0.i0) qVar.m(k0.k0.f9091a);
                            qVar.Z(1437915677);
                            b1Var4 = i0Var.P;
                            if (b1Var4 == null) {
                                long j1111118 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                                long j1111119 = e1.r.f5064f;
                                b1Var4 = new k0.b1(j1111119, j1111118, j1111119, e1.r.b(j1111118, 0.38f));
                                i0Var.P = b1Var4;
                            }
                            qVar.t(false);
                            j10 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                            j11 = b1Var4.f8729b;
                            if (e1.r.c(j11, j10)) {
                                qVar.t(false);
                                b1Var3 = b1Var4;
                            } else {
                                jB = e1.r.b(j10, 0.38f);
                                long j11111110 = b1Var4.f8728a;
                                long j11111111 = b1Var4.f8730c;
                                j12 = e1.r.f5065g;
                                if (j10 == j12) {
                                    j10 = j11;
                                }
                                if (jB != j12) {
                                    j13 = jB;
                                } else {
                                    j13 = b1Var4.f8731d;
                                }
                                b1Var3 = new k0.b1(j11111110, j10, j11111111, j13);
                                qVar.t(false);
                            }
                            i12 &= -7169;
                        } else {
                            z11 = z11;
                            b1Var3 = b1Var2;
                        }
                        if (i15 != 0) {
                            qVar.Z(793644531);
                            objP = qVar.P();
                            if (objP == m0.l.f11578a) {
                                objP = new x.m();
                                qVar.l0(objP);
                            }
                            r10 = 0;
                            qVar.t(false);
                            i18 = i12;
                            mVar4 = (x.m) objP;
                            z12 = z11;
                        } else {
                            r10 = 0;
                            z12 = z11;
                            i18 = i12;
                            mVar4 = mVar3;
                        }
                    } else {
                        if (i20 != 0) {
                            oVar3 = y0.l.f16729b;
                        } else {
                            oVar3 = oVar2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            qVar.Z(-1519621781);
                            i0Var = (k0.i0) qVar.m(k0.k0.f9091a);
                            qVar.Z(1437915677);
                            b1Var4 = i0Var.P;
                            if (b1Var4 == null) {
                                long j11111112 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                                long j11111113 = e1.r.f5064f;
                                b1Var4 = new k0.b1(j11111113, j11111112, j11111113, e1.r.b(j11111112, 0.38f));
                                i0Var.P = b1Var4;
                            }
                            qVar.t(false);
                            j10 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                            j11 = b1Var4.f8729b;
                            if (e1.r.c(j11, j10)) {
                                qVar.t(false);
                                b1Var3 = b1Var4;
                            } else {
                                jB = e1.r.b(j10, 0.38f);
                                long j11111114 = b1Var4.f8728a;
                                long j11111115 = b1Var4.f8730c;
                                j12 = e1.r.f5065g;
                                if (j10 == j12) {
                                    j10 = j11;
                                }
                                if (jB != j12) {
                                    j13 = jB;
                                } else {
                                    j13 = b1Var4.f8731d;
                                }
                                b1Var3 = new k0.b1(j11111114, j10, j11111115, j13);
                                qVar.t(false);
                            }
                            i12 &= -7169;
                        } else {
                            z11 = z11;
                            b1Var3 = b1Var2;
                        }
                        if (i15 != 0) {
                            qVar.Z(793644531);
                            objP = qVar.P();
                            if (objP == m0.l.f11578a) {
                                objP = new x.m();
                                qVar.l0(objP);
                            }
                            r10 = 0;
                            qVar.t(false);
                            i18 = i12;
                            mVar4 = (x.m) objP;
                            z12 = z11;
                        } else {
                            r10 = 0;
                            z12 = z11;
                            i18 = i12;
                            mVar4 = mVar3;
                        }
                    }
                    qVar.u();
                    m3 m3Var8 = k0.g1.f8940a;
                    y0.o oVarJ15 = oVar3.j(MinimumInteractiveModifier.f1691b);
                    float f17 = l0.i.f11065b;
                    y0.o oVarB8 = androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.c.h(oVarJ15, f17), k0.r2.a(5, qVar));
                    if (z12) {
                        j14 = b1Var3.f8728a;
                    } else {
                        j14 = b1Var3.f8730c;
                    }
                    y0.o oVarJ16 = androidx.compose.foundation.a.j(androidx.compose.foundation.a.e(oVarB8, j14, e1.g0.f5008a), mVar4, j0.v.a(false, f17 / 2, 0L, qVar, 54, 4), z12, new y1.g(r10), aVar, 8);
                    y0.g gVar8 = y0.a.f16710c;
                    qVar.Z(733328855);
                    j0VarC = y.p.c(gVar8, r10, qVar);
                    qVar.Z(-1323940314);
                    i19 = qVar.P;
                    r1VarP = qVar.p();
                    t1.l.f14477k.getClass();
                    jVar = t1.k.f14458b;
                    bVarI = androidx.compose.ui.layout.a.i(oVarJ16);
                    if (!(qVar.f11630a instanceof m0.d)) {
                        m9.e0.C();
                        throw null;
                    }
                    qVar.c0();
                    if (qVar.O) {
                        qVar.o(jVar);
                    } else {
                        qVar.o0();
                    }
                    d7.t.s0(qVar, j0VarC, t1.k.f14461e);
                    d7.t.s0(qVar, r1VarP, t1.k.f14460d);
                    iVar = t1.k.f14462f;
                    if (qVar.O) {
                        l.q.r(i19, qVar, i19, iVar);
                    } else {
                        l.q.r(i19, qVar, i19, iVar);
                    }
                    l.q.s(r10, bVarI, new m0.l2(qVar), qVar, 2058660585);
                    if (z12) {
                        j15 = b1Var3.f8729b;
                    } else {
                        j15 = b1Var3.f8731d;
                    }
                    f6.a.b(k0.s0.f9444a.b(new e1.r(j15)), eVar, qVar, (i18 >> 12) & 112);
                    l.q.v(qVar, r10, true, r10, r10);
                    mVar5 = mVar4;
                    z13 = z12;
                    oVar4 = oVar3;
                    b1Var5 = b1Var3;
                } else {
                    qVar.W();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            oVar3 = y0.l.f16729b;
                        } else {
                            oVar3 = oVar2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            qVar.Z(-1519621781);
                            i0Var = (k0.i0) qVar.m(k0.k0.f9091a);
                            qVar.Z(1437915677);
                            b1Var4 = i0Var.P;
                            if (b1Var4 == null) {
                                long j11111116 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                                long j11111117 = e1.r.f5064f;
                                b1Var4 = new k0.b1(j11111117, j11111116, j11111117, e1.r.b(j11111116, 0.38f));
                                i0Var.P = b1Var4;
                            }
                            qVar.t(false);
                            j10 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                            j11 = b1Var4.f8729b;
                            if (e1.r.c(j11, j10)) {
                                qVar.t(false);
                                b1Var3 = b1Var4;
                            } else {
                                jB = e1.r.b(j10, 0.38f);
                                long j11111118 = b1Var4.f8728a;
                                long j11111119 = b1Var4.f8730c;
                                j12 = e1.r.f5065g;
                                if (j10 == j12) {
                                    j10 = j11;
                                }
                                if (jB != j12) {
                                    j13 = jB;
                                } else {
                                    j13 = b1Var4.f8731d;
                                }
                                b1Var3 = new k0.b1(j11111118, j10, j11111119, j13);
                                qVar.t(false);
                            }
                            i12 &= -7169;
                        } else {
                            z11 = z11;
                            b1Var3 = b1Var2;
                        }
                        if (i15 != 0) {
                            qVar.Z(793644531);
                            objP = qVar.P();
                            if (objP == m0.l.f11578a) {
                                objP = new x.m();
                                qVar.l0(objP);
                            }
                            r10 = 0;
                            qVar.t(false);
                            i18 = i12;
                            mVar4 = (x.m) objP;
                            z12 = z11;
                        } else {
                            r10 = 0;
                            z12 = z11;
                            i18 = i12;
                            mVar4 = mVar3;
                        }
                    } else {
                        if (i20 != 0) {
                            oVar3 = y0.l.f16729b;
                        } else {
                            oVar3 = oVar2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            qVar.Z(-1519621781);
                            i0Var = (k0.i0) qVar.m(k0.k0.f9091a);
                            qVar.Z(1437915677);
                            b1Var4 = i0Var.P;
                            if (b1Var4 == null) {
                                long j111111110 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                                long j111111111 = e1.r.f5064f;
                                b1Var4 = new k0.b1(j111111111, j111111110, j111111111, e1.r.b(j111111110, 0.38f));
                                i0Var.P = b1Var4;
                            }
                            qVar.t(false);
                            j10 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                            j11 = b1Var4.f8729b;
                            if (e1.r.c(j11, j10)) {
                                qVar.t(false);
                                b1Var3 = b1Var4;
                            } else {
                                jB = e1.r.b(j10, 0.38f);
                                long j111111112 = b1Var4.f8728a;
                                long j111111113 = b1Var4.f8730c;
                                j12 = e1.r.f5065g;
                                if (j10 == j12) {
                                    j10 = j11;
                                }
                                if (jB != j12) {
                                    j13 = jB;
                                } else {
                                    j13 = b1Var4.f8731d;
                                }
                                b1Var3 = new k0.b1(j111111112, j10, j111111113, j13);
                                qVar.t(false);
                            }
                            i12 &= -7169;
                        } else {
                            z11 = z11;
                            b1Var3 = b1Var2;
                        }
                        if (i15 != 0) {
                            qVar.Z(793644531);
                            objP = qVar.P();
                            if (objP == m0.l.f11578a) {
                                objP = new x.m();
                                qVar.l0(objP);
                            }
                            r10 = 0;
                            qVar.t(false);
                            i18 = i12;
                            mVar4 = (x.m) objP;
                            z12 = z11;
                        } else {
                            r10 = 0;
                            z12 = z11;
                            i18 = i12;
                            mVar4 = mVar3;
                        }
                    }
                    qVar.u();
                    m3 m3Var9 = k0.g1.f8940a;
                    y0.o oVarJ17 = oVar3.j(MinimumInteractiveModifier.f1691b);
                    float f18 = l0.i.f11065b;
                    y0.o oVarB9 = androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.c.h(oVarJ17, f18), k0.r2.a(5, qVar));
                    if (z12) {
                        j14 = b1Var3.f8728a;
                    } else {
                        j14 = b1Var3.f8730c;
                    }
                    y0.o oVarJ18 = androidx.compose.foundation.a.j(androidx.compose.foundation.a.e(oVarB9, j14, e1.g0.f5008a), mVar4, j0.v.a(false, f18 / 2, 0L, qVar, 54, 4), z12, new y1.g(r10), aVar, 8);
                    y0.g gVar9 = y0.a.f16710c;
                    qVar.Z(733328855);
                    j0VarC = y.p.c(gVar9, r10, qVar);
                    qVar.Z(-1323940314);
                    i19 = qVar.P;
                    r1VarP = qVar.p();
                    t1.l.f14477k.getClass();
                    jVar = t1.k.f14458b;
                    bVarI = androidx.compose.ui.layout.a.i(oVarJ18);
                    if (!(qVar.f11630a instanceof m0.d)) {
                        m9.e0.C();
                        throw null;
                    }
                    qVar.c0();
                    if (qVar.O) {
                        qVar.o(jVar);
                    } else {
                        qVar.o0();
                    }
                    d7.t.s0(qVar, j0VarC, t1.k.f14461e);
                    d7.t.s0(qVar, r1VarP, t1.k.f14460d);
                    iVar = t1.k.f14462f;
                    if (qVar.O) {
                        l.q.r(i19, qVar, i19, iVar);
                    } else {
                        l.q.r(i19, qVar, i19, iVar);
                    }
                    l.q.s(r10, bVarI, new m0.l2(qVar), qVar, 2058660585);
                    if (z12) {
                        j15 = b1Var3.f8729b;
                    } else {
                        j15 = b1Var3.f8731d;
                    }
                    f6.a.b(k0.s0.f9444a.b(new e1.r(j15)), eVar, qVar, (i18 >> 12) & 112);
                    l.q.v(qVar, r10, true, r10, r10);
                    mVar5 = mVar4;
                    z13 = z12;
                    oVar4 = oVar3;
                    b1Var5 = b1Var3;
                }
                x1VarX = qVar.x();
                if (x1VarX != null) {
                    x1VarX.f11756d = new k0.c1(aVar, oVar4, z13, b1Var5, mVar5, eVar, i10, i11);
                }
            }
            i12 |= 24576;
            mVar3 = mVar;
            if ((i11 & 32) != 0) {
                i12 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (qVar.i(eVar)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i12 |= i17;
            }
            if ((74899 & i12) == 74898) {
                qVar.W();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        oVar3 = y0.l.f16729b;
                    } else {
                        oVar3 = oVar2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        qVar.Z(-1519621781);
                        i0Var = (k0.i0) qVar.m(k0.k0.f9091a);
                        qVar.Z(1437915677);
                        b1Var4 = i0Var.P;
                        if (b1Var4 == null) {
                            long j111111114 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                            long j111111115 = e1.r.f5064f;
                            b1Var4 = new k0.b1(j111111115, j111111114, j111111115, e1.r.b(j111111114, 0.38f));
                            i0Var.P = b1Var4;
                        }
                        qVar.t(false);
                        j10 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                        j11 = b1Var4.f8729b;
                        if (e1.r.c(j11, j10)) {
                            qVar.t(false);
                            b1Var3 = b1Var4;
                        } else {
                            jB = e1.r.b(j10, 0.38f);
                            long j111111116 = b1Var4.f8728a;
                            long j111111117 = b1Var4.f8730c;
                            j12 = e1.r.f5065g;
                            if (j10 == j12) {
                                j10 = j11;
                            }
                            if (jB != j12) {
                                j13 = jB;
                            } else {
                                j13 = b1Var4.f8731d;
                            }
                            b1Var3 = new k0.b1(j111111116, j10, j111111117, j13);
                            qVar.t(false);
                        }
                        i12 &= -7169;
                    } else {
                        z11 = z11;
                        b1Var3 = b1Var2;
                    }
                    if (i15 != 0) {
                        qVar.Z(793644531);
                        objP = qVar.P();
                        if (objP == m0.l.f11578a) {
                            objP = new x.m();
                            qVar.l0(objP);
                        }
                        r10 = 0;
                        qVar.t(false);
                        i18 = i12;
                        mVar4 = (x.m) objP;
                        z12 = z11;
                    } else {
                        r10 = 0;
                        z12 = z11;
                        i18 = i12;
                        mVar4 = mVar3;
                    }
                } else {
                    if (i20 != 0) {
                        oVar3 = y0.l.f16729b;
                    } else {
                        oVar3 = oVar2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        qVar.Z(-1519621781);
                        i0Var = (k0.i0) qVar.m(k0.k0.f9091a);
                        qVar.Z(1437915677);
                        b1Var4 = i0Var.P;
                        if (b1Var4 == null) {
                            long j111111118 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                            long j111111119 = e1.r.f5064f;
                            b1Var4 = new k0.b1(j111111119, j111111118, j111111119, e1.r.b(j111111118, 0.38f));
                            i0Var.P = b1Var4;
                        }
                        qVar.t(false);
                        j10 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                        j11 = b1Var4.f8729b;
                        if (e1.r.c(j11, j10)) {
                            qVar.t(false);
                            b1Var3 = b1Var4;
                        } else {
                            jB = e1.r.b(j10, 0.38f);
                            long j1111111110 = b1Var4.f8728a;
                            long j1111111111 = b1Var4.f8730c;
                            j12 = e1.r.f5065g;
                            if (j10 == j12) {
                                j10 = j11;
                            }
                            if (jB != j12) {
                                j13 = jB;
                            } else {
                                j13 = b1Var4.f8731d;
                            }
                            b1Var3 = new k0.b1(j1111111110, j10, j1111111111, j13);
                            qVar.t(false);
                        }
                        i12 &= -7169;
                    } else {
                        z11 = z11;
                        b1Var3 = b1Var2;
                    }
                    if (i15 != 0) {
                        qVar.Z(793644531);
                        objP = qVar.P();
                        if (objP == m0.l.f11578a) {
                            objP = new x.m();
                            qVar.l0(objP);
                        }
                        r10 = 0;
                        qVar.t(false);
                        i18 = i12;
                        mVar4 = (x.m) objP;
                        z12 = z11;
                    } else {
                        r10 = 0;
                        z12 = z11;
                        i18 = i12;
                        mVar4 = mVar3;
                    }
                }
                qVar.u();
                m3 m3Var10 = k0.g1.f8940a;
                y0.o oVarJ19 = oVar3.j(MinimumInteractiveModifier.f1691b);
                float f19 = l0.i.f11065b;
                y0.o oVarB10 = androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.c.h(oVarJ19, f19), k0.r2.a(5, qVar));
                if (z12) {
                    j14 = b1Var3.f8728a;
                } else {
                    j14 = b1Var3.f8730c;
                }
                y0.o oVarJ110 = androidx.compose.foundation.a.j(androidx.compose.foundation.a.e(oVarB10, j14, e1.g0.f5008a), mVar4, j0.v.a(false, f19 / 2, 0L, qVar, 54, 4), z12, new y1.g(r10), aVar, 8);
                y0.g gVar10 = y0.a.f16710c;
                qVar.Z(733328855);
                j0VarC = y.p.c(gVar10, r10, qVar);
                qVar.Z(-1323940314);
                i19 = qVar.P;
                r1VarP = qVar.p();
                t1.l.f14477k.getClass();
                jVar = t1.k.f14458b;
                bVarI = androidx.compose.ui.layout.a.i(oVarJ110);
                if (!(qVar.f11630a instanceof m0.d)) {
                    m9.e0.C();
                    throw null;
                }
                qVar.c0();
                if (qVar.O) {
                    qVar.o(jVar);
                } else {
                    qVar.o0();
                }
                d7.t.s0(qVar, j0VarC, t1.k.f14461e);
                d7.t.s0(qVar, r1VarP, t1.k.f14460d);
                iVar = t1.k.f14462f;
                if (qVar.O) {
                    l.q.r(i19, qVar, i19, iVar);
                } else {
                    l.q.r(i19, qVar, i19, iVar);
                }
                l.q.s(r10, bVarI, new m0.l2(qVar), qVar, 2058660585);
                if (z12) {
                    j15 = b1Var3.f8729b;
                } else {
                    j15 = b1Var3.f8731d;
                }
                f6.a.b(k0.s0.f9444a.b(new e1.r(j15)), eVar, qVar, (i18 >> 12) & 112);
                l.q.v(qVar, r10, true, r10, r10);
                mVar5 = mVar4;
                z13 = z12;
                oVar4 = oVar3;
                b1Var5 = b1Var3;
            } else {
                qVar.W();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        oVar3 = y0.l.f16729b;
                    } else {
                        oVar3 = oVar2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        qVar.Z(-1519621781);
                        i0Var = (k0.i0) qVar.m(k0.k0.f9091a);
                        qVar.Z(1437915677);
                        b1Var4 = i0Var.P;
                        if (b1Var4 == null) {
                            long j1111111112 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                            long j1111111113 = e1.r.f5064f;
                            b1Var4 = new k0.b1(j1111111113, j1111111112, j1111111113, e1.r.b(j1111111112, 0.38f));
                            i0Var.P = b1Var4;
                        }
                        qVar.t(false);
                        j10 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                        j11 = b1Var4.f8729b;
                        if (e1.r.c(j11, j10)) {
                            qVar.t(false);
                            b1Var3 = b1Var4;
                        } else {
                            jB = e1.r.b(j10, 0.38f);
                            long j1111111114 = b1Var4.f8728a;
                            long j1111111115 = b1Var4.f8730c;
                            j12 = e1.r.f5065g;
                            if (j10 == j12) {
                                j10 = j11;
                            }
                            if (jB != j12) {
                                j13 = jB;
                            } else {
                                j13 = b1Var4.f8731d;
                            }
                            b1Var3 = new k0.b1(j1111111114, j10, j1111111115, j13);
                            qVar.t(false);
                        }
                        i12 &= -7169;
                    } else {
                        z11 = z11;
                        b1Var3 = b1Var2;
                    }
                    if (i15 != 0) {
                        qVar.Z(793644531);
                        objP = qVar.P();
                        if (objP == m0.l.f11578a) {
                            objP = new x.m();
                            qVar.l0(objP);
                        }
                        r10 = 0;
                        qVar.t(false);
                        i18 = i12;
                        mVar4 = (x.m) objP;
                        z12 = z11;
                    } else {
                        r10 = 0;
                        z12 = z11;
                        i18 = i12;
                        mVar4 = mVar3;
                    }
                } else {
                    if (i20 != 0) {
                        oVar3 = y0.l.f16729b;
                    } else {
                        oVar3 = oVar2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        qVar.Z(-1519621781);
                        i0Var = (k0.i0) qVar.m(k0.k0.f9091a);
                        qVar.Z(1437915677);
                        b1Var4 = i0Var.P;
                        if (b1Var4 == null) {
                            long j1111111116 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                            long j1111111117 = e1.r.f5064f;
                            b1Var4 = new k0.b1(j1111111117, j1111111116, j1111111117, e1.r.b(j1111111116, 0.38f));
                            i0Var.P = b1Var4;
                        }
                        qVar.t(false);
                        j10 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                        j11 = b1Var4.f8729b;
                        if (e1.r.c(j11, j10)) {
                            qVar.t(false);
                            b1Var3 = b1Var4;
                        } else {
                            jB = e1.r.b(j10, 0.38f);
                            long j1111111118 = b1Var4.f8728a;
                            long j1111111119 = b1Var4.f8730c;
                            j12 = e1.r.f5065g;
                            if (j10 == j12) {
                                j10 = j11;
                            }
                            if (jB != j12) {
                                j13 = jB;
                            } else {
                                j13 = b1Var4.f8731d;
                            }
                            b1Var3 = new k0.b1(j1111111118, j10, j1111111119, j13);
                            qVar.t(false);
                        }
                        i12 &= -7169;
                    } else {
                        z11 = z11;
                        b1Var3 = b1Var2;
                    }
                    if (i15 != 0) {
                        qVar.Z(793644531);
                        objP = qVar.P();
                        if (objP == m0.l.f11578a) {
                            objP = new x.m();
                            qVar.l0(objP);
                        }
                        r10 = 0;
                        qVar.t(false);
                        i18 = i12;
                        mVar4 = (x.m) objP;
                        z12 = z11;
                    } else {
                        r10 = 0;
                        z12 = z11;
                        i18 = i12;
                        mVar4 = mVar3;
                    }
                }
                qVar.u();
                m3 m3Var11 = k0.g1.f8940a;
                y0.o oVarJ111 = oVar3.j(MinimumInteractiveModifier.f1691b);
                float f110 = l0.i.f11065b;
                y0.o oVarB11 = androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.c.h(oVarJ111, f110), k0.r2.a(5, qVar));
                if (z12) {
                    j14 = b1Var3.f8728a;
                } else {
                    j14 = b1Var3.f8730c;
                }
                y0.o oVarJ112 = androidx.compose.foundation.a.j(androidx.compose.foundation.a.e(oVarB11, j14, e1.g0.f5008a), mVar4, j0.v.a(false, f110 / 2, 0L, qVar, 54, 4), z12, new y1.g(r10), aVar, 8);
                y0.g gVar11 = y0.a.f16710c;
                qVar.Z(733328855);
                j0VarC = y.p.c(gVar11, r10, qVar);
                qVar.Z(-1323940314);
                i19 = qVar.P;
                r1VarP = qVar.p();
                t1.l.f14477k.getClass();
                jVar = t1.k.f14458b;
                bVarI = androidx.compose.ui.layout.a.i(oVarJ112);
                if (!(qVar.f11630a instanceof m0.d)) {
                    m9.e0.C();
                    throw null;
                }
                qVar.c0();
                if (qVar.O) {
                    qVar.o(jVar);
                } else {
                    qVar.o0();
                }
                d7.t.s0(qVar, j0VarC, t1.k.f14461e);
                d7.t.s0(qVar, r1VarP, t1.k.f14460d);
                iVar = t1.k.f14462f;
                if (qVar.O) {
                    l.q.r(i19, qVar, i19, iVar);
                } else {
                    l.q.r(i19, qVar, i19, iVar);
                }
                l.q.s(r10, bVarI, new m0.l2(qVar), qVar, 2058660585);
                if (z12) {
                    j15 = b1Var3.f8729b;
                } else {
                    j15 = b1Var3.f8731d;
                }
                f6.a.b(k0.s0.f9444a.b(new e1.r(j15)), eVar, qVar, (i18 >> 12) & 112);
                l.q.v(qVar, r10, true, r10, r10);
                mVar5 = mVar4;
                z13 = z12;
                oVar4 = oVar3;
                b1Var5 = b1Var3;
            }
            x1VarX = qVar.x();
            if (x1VarX != null) {
                x1VarX.f11756d = new k0.c1(aVar, oVar4, z13, b1Var5, mVar5, eVar, i10, i11);
            }
        }
        i12 |= 384;
        z11 = z10;
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                b1Var2 = b1Var;
                if (qVar.g(b1Var2)) {
                }
                i12 |= i21;
            } else {
                b1Var2 = b1Var;
            }
            i12 |= i21;
        } else {
            b1Var2 = b1Var;
        }
        i15 = i11 & 16;
        if (i15 != 0) {
            if ((i10 & 24576) == 0) {
                mVar3 = mVar;
                if (qVar.g(mVar3)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            if ((i11 & 32) != 0) {
                i12 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (qVar.i(eVar)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i12 |= i17;
            }
            if ((74899 & i12) == 74898) {
                qVar.W();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        oVar3 = y0.l.f16729b;
                    } else {
                        oVar3 = oVar2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        qVar.Z(-1519621781);
                        i0Var = (k0.i0) qVar.m(k0.k0.f9091a);
                        qVar.Z(1437915677);
                        b1Var4 = i0Var.P;
                        if (b1Var4 == null) {
                            long j11111111110 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                            long j11111111111 = e1.r.f5064f;
                            b1Var4 = new k0.b1(j11111111111, j11111111110, j11111111111, e1.r.b(j11111111110, 0.38f));
                            i0Var.P = b1Var4;
                        }
                        qVar.t(false);
                        j10 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                        j11 = b1Var4.f8729b;
                        if (e1.r.c(j11, j10)) {
                            qVar.t(false);
                            b1Var3 = b1Var4;
                        } else {
                            jB = e1.r.b(j10, 0.38f);
                            long j11111111112 = b1Var4.f8728a;
                            long j11111111113 = b1Var4.f8730c;
                            j12 = e1.r.f5065g;
                            if (j10 == j12) {
                                j10 = j11;
                            }
                            if (jB != j12) {
                                j13 = jB;
                            } else {
                                j13 = b1Var4.f8731d;
                            }
                            b1Var3 = new k0.b1(j11111111112, j10, j11111111113, j13);
                            qVar.t(false);
                        }
                        i12 &= -7169;
                    } else {
                        z11 = z11;
                        b1Var3 = b1Var2;
                    }
                    if (i15 != 0) {
                        qVar.Z(793644531);
                        objP = qVar.P();
                        if (objP == m0.l.f11578a) {
                            objP = new x.m();
                            qVar.l0(objP);
                        }
                        r10 = 0;
                        qVar.t(false);
                        i18 = i12;
                        mVar4 = (x.m) objP;
                        z12 = z11;
                    } else {
                        r10 = 0;
                        z12 = z11;
                        i18 = i12;
                        mVar4 = mVar3;
                    }
                } else {
                    if (i20 != 0) {
                        oVar3 = y0.l.f16729b;
                    } else {
                        oVar3 = oVar2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        qVar.Z(-1519621781);
                        i0Var = (k0.i0) qVar.m(k0.k0.f9091a);
                        qVar.Z(1437915677);
                        b1Var4 = i0Var.P;
                        if (b1Var4 == null) {
                            long j11111111114 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                            long j11111111115 = e1.r.f5064f;
                            b1Var4 = new k0.b1(j11111111115, j11111111114, j11111111115, e1.r.b(j11111111114, 0.38f));
                            i0Var.P = b1Var4;
                        }
                        qVar.t(false);
                        j10 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                        j11 = b1Var4.f8729b;
                        if (e1.r.c(j11, j10)) {
                            qVar.t(false);
                            b1Var3 = b1Var4;
                        } else {
                            jB = e1.r.b(j10, 0.38f);
                            long j11111111116 = b1Var4.f8728a;
                            long j11111111117 = b1Var4.f8730c;
                            j12 = e1.r.f5065g;
                            if (j10 == j12) {
                                j10 = j11;
                            }
                            if (jB != j12) {
                                j13 = jB;
                            } else {
                                j13 = b1Var4.f8731d;
                            }
                            b1Var3 = new k0.b1(j11111111116, j10, j11111111117, j13);
                            qVar.t(false);
                        }
                        i12 &= -7169;
                    } else {
                        z11 = z11;
                        b1Var3 = b1Var2;
                    }
                    if (i15 != 0) {
                        qVar.Z(793644531);
                        objP = qVar.P();
                        if (objP == m0.l.f11578a) {
                            objP = new x.m();
                            qVar.l0(objP);
                        }
                        r10 = 0;
                        qVar.t(false);
                        i18 = i12;
                        mVar4 = (x.m) objP;
                        z12 = z11;
                    } else {
                        r10 = 0;
                        z12 = z11;
                        i18 = i12;
                        mVar4 = mVar3;
                    }
                }
                qVar.u();
                m3 m3Var12 = k0.g1.f8940a;
                y0.o oVarJ113 = oVar3.j(MinimumInteractiveModifier.f1691b);
                float f111 = l0.i.f11065b;
                y0.o oVarB12 = androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.c.h(oVarJ113, f111), k0.r2.a(5, qVar));
                if (z12) {
                    j14 = b1Var3.f8728a;
                } else {
                    j14 = b1Var3.f8730c;
                }
                y0.o oVarJ114 = androidx.compose.foundation.a.j(androidx.compose.foundation.a.e(oVarB12, j14, e1.g0.f5008a), mVar4, j0.v.a(false, f111 / 2, 0L, qVar, 54, 4), z12, new y1.g(r10), aVar, 8);
                y0.g gVar12 = y0.a.f16710c;
                qVar.Z(733328855);
                j0VarC = y.p.c(gVar12, r10, qVar);
                qVar.Z(-1323940314);
                i19 = qVar.P;
                r1VarP = qVar.p();
                t1.l.f14477k.getClass();
                jVar = t1.k.f14458b;
                bVarI = androidx.compose.ui.layout.a.i(oVarJ114);
                if (!(qVar.f11630a instanceof m0.d)) {
                    m9.e0.C();
                    throw null;
                }
                qVar.c0();
                if (qVar.O) {
                    qVar.o(jVar);
                } else {
                    qVar.o0();
                }
                d7.t.s0(qVar, j0VarC, t1.k.f14461e);
                d7.t.s0(qVar, r1VarP, t1.k.f14460d);
                iVar = t1.k.f14462f;
                if (qVar.O) {
                    l.q.r(i19, qVar, i19, iVar);
                } else {
                    l.q.r(i19, qVar, i19, iVar);
                }
                l.q.s(r10, bVarI, new m0.l2(qVar), qVar, 2058660585);
                if (z12) {
                    j15 = b1Var3.f8729b;
                } else {
                    j15 = b1Var3.f8731d;
                }
                f6.a.b(k0.s0.f9444a.b(new e1.r(j15)), eVar, qVar, (i18 >> 12) & 112);
                l.q.v(qVar, r10, true, r10, r10);
                mVar5 = mVar4;
                z13 = z12;
                oVar4 = oVar3;
                b1Var5 = b1Var3;
            } else {
                qVar.W();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        oVar3 = y0.l.f16729b;
                    } else {
                        oVar3 = oVar2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        qVar.Z(-1519621781);
                        i0Var = (k0.i0) qVar.m(k0.k0.f9091a);
                        qVar.Z(1437915677);
                        b1Var4 = i0Var.P;
                        if (b1Var4 == null) {
                            long j11111111118 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                            long j11111111119 = e1.r.f5064f;
                            b1Var4 = new k0.b1(j11111111119, j11111111118, j11111111119, e1.r.b(j11111111118, 0.38f));
                            i0Var.P = b1Var4;
                        }
                        qVar.t(false);
                        j10 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                        j11 = b1Var4.f8729b;
                        if (e1.r.c(j11, j10)) {
                            qVar.t(false);
                            b1Var3 = b1Var4;
                        } else {
                            jB = e1.r.b(j10, 0.38f);
                            long j111111111110 = b1Var4.f8728a;
                            long j111111111111 = b1Var4.f8730c;
                            j12 = e1.r.f5065g;
                            if (j10 == j12) {
                                j10 = j11;
                            }
                            if (jB != j12) {
                                j13 = jB;
                            } else {
                                j13 = b1Var4.f8731d;
                            }
                            b1Var3 = new k0.b1(j111111111110, j10, j111111111111, j13);
                            qVar.t(false);
                        }
                        i12 &= -7169;
                    } else {
                        z11 = z11;
                        b1Var3 = b1Var2;
                    }
                    if (i15 != 0) {
                        qVar.Z(793644531);
                        objP = qVar.P();
                        if (objP == m0.l.f11578a) {
                            objP = new x.m();
                            qVar.l0(objP);
                        }
                        r10 = 0;
                        qVar.t(false);
                        i18 = i12;
                        mVar4 = (x.m) objP;
                        z12 = z11;
                    } else {
                        r10 = 0;
                        z12 = z11;
                        i18 = i12;
                        mVar4 = mVar3;
                    }
                } else {
                    if (i20 != 0) {
                        oVar3 = y0.l.f16729b;
                    } else {
                        oVar3 = oVar2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        qVar.Z(-1519621781);
                        i0Var = (k0.i0) qVar.m(k0.k0.f9091a);
                        qVar.Z(1437915677);
                        b1Var4 = i0Var.P;
                        if (b1Var4 == null) {
                            long j111111111112 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                            long j111111111113 = e1.r.f5064f;
                            b1Var4 = new k0.b1(j111111111113, j111111111112, j111111111113, e1.r.b(j111111111112, 0.38f));
                            i0Var.P = b1Var4;
                        }
                        qVar.t(false);
                        j10 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                        j11 = b1Var4.f8729b;
                        if (e1.r.c(j11, j10)) {
                            qVar.t(false);
                            b1Var3 = b1Var4;
                        } else {
                            jB = e1.r.b(j10, 0.38f);
                            long j111111111114 = b1Var4.f8728a;
                            long j111111111115 = b1Var4.f8730c;
                            j12 = e1.r.f5065g;
                            if (j10 == j12) {
                                j10 = j11;
                            }
                            if (jB != j12) {
                                j13 = jB;
                            } else {
                                j13 = b1Var4.f8731d;
                            }
                            b1Var3 = new k0.b1(j111111111114, j10, j111111111115, j13);
                            qVar.t(false);
                        }
                        i12 &= -7169;
                    } else {
                        z11 = z11;
                        b1Var3 = b1Var2;
                    }
                    if (i15 != 0) {
                        qVar.Z(793644531);
                        objP = qVar.P();
                        if (objP == m0.l.f11578a) {
                            objP = new x.m();
                            qVar.l0(objP);
                        }
                        r10 = 0;
                        qVar.t(false);
                        i18 = i12;
                        mVar4 = (x.m) objP;
                        z12 = z11;
                    } else {
                        r10 = 0;
                        z12 = z11;
                        i18 = i12;
                        mVar4 = mVar3;
                    }
                }
                qVar.u();
                m3 m3Var13 = k0.g1.f8940a;
                y0.o oVarJ115 = oVar3.j(MinimumInteractiveModifier.f1691b);
                float f112 = l0.i.f11065b;
                y0.o oVarB13 = androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.c.h(oVarJ115, f112), k0.r2.a(5, qVar));
                if (z12) {
                    j14 = b1Var3.f8728a;
                } else {
                    j14 = b1Var3.f8730c;
                }
                y0.o oVarJ116 = androidx.compose.foundation.a.j(androidx.compose.foundation.a.e(oVarB13, j14, e1.g0.f5008a), mVar4, j0.v.a(false, f112 / 2, 0L, qVar, 54, 4), z12, new y1.g(r10), aVar, 8);
                y0.g gVar13 = y0.a.f16710c;
                qVar.Z(733328855);
                j0VarC = y.p.c(gVar13, r10, qVar);
                qVar.Z(-1323940314);
                i19 = qVar.P;
                r1VarP = qVar.p();
                t1.l.f14477k.getClass();
                jVar = t1.k.f14458b;
                bVarI = androidx.compose.ui.layout.a.i(oVarJ116);
                if (!(qVar.f11630a instanceof m0.d)) {
                    m9.e0.C();
                    throw null;
                }
                qVar.c0();
                if (qVar.O) {
                    qVar.o(jVar);
                } else {
                    qVar.o0();
                }
                d7.t.s0(qVar, j0VarC, t1.k.f14461e);
                d7.t.s0(qVar, r1VarP, t1.k.f14460d);
                iVar = t1.k.f14462f;
                if (qVar.O) {
                    l.q.r(i19, qVar, i19, iVar);
                } else {
                    l.q.r(i19, qVar, i19, iVar);
                }
                l.q.s(r10, bVarI, new m0.l2(qVar), qVar, 2058660585);
                if (z12) {
                    j15 = b1Var3.f8729b;
                } else {
                    j15 = b1Var3.f8731d;
                }
                f6.a.b(k0.s0.f9444a.b(new e1.r(j15)), eVar, qVar, (i18 >> 12) & 112);
                l.q.v(qVar, r10, true, r10, r10);
                mVar5 = mVar4;
                z13 = z12;
                oVar4 = oVar3;
                b1Var5 = b1Var3;
            }
            x1VarX = qVar.x();
            if (x1VarX != null) {
                x1VarX.f11756d = new k0.c1(aVar, oVar4, z13, b1Var5, mVar5, eVar, i10, i11);
            }
        }
        i12 |= 24576;
        mVar3 = mVar;
        if ((i11 & 32) != 0) {
            i12 |= 196608;
        } else if ((i10 & 196608) == 0) {
            if (qVar.i(eVar)) {
                i17 = 131072;
            } else {
                i17 = 65536;
            }
            i12 |= i17;
        }
        if ((74899 & i12) == 74898) {
            qVar.W();
            if ((i10 & 1) != 0) {
                if (i20 != 0) {
                    oVar3 = y0.l.f16729b;
                } else {
                    oVar3 = oVar2;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    qVar.Z(-1519621781);
                    i0Var = (k0.i0) qVar.m(k0.k0.f9091a);
                    qVar.Z(1437915677);
                    b1Var4 = i0Var.P;
                    if (b1Var4 == null) {
                        long j111111111116 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                        long j111111111117 = e1.r.f5064f;
                        b1Var4 = new k0.b1(j111111111117, j111111111116, j111111111117, e1.r.b(j111111111116, 0.38f));
                        i0Var.P = b1Var4;
                    }
                    qVar.t(false);
                    j10 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                    j11 = b1Var4.f8729b;
                    if (e1.r.c(j11, j10)) {
                        qVar.t(false);
                        b1Var3 = b1Var4;
                    } else {
                        jB = e1.r.b(j10, 0.38f);
                        long j111111111118 = b1Var4.f8728a;
                        long j111111111119 = b1Var4.f8730c;
                        j12 = e1.r.f5065g;
                        if (j10 == j12) {
                            j10 = j11;
                        }
                        if (jB != j12) {
                            j13 = jB;
                        } else {
                            j13 = b1Var4.f8731d;
                        }
                        b1Var3 = new k0.b1(j111111111118, j10, j111111111119, j13);
                        qVar.t(false);
                    }
                    i12 &= -7169;
                } else {
                    z11 = z11;
                    b1Var3 = b1Var2;
                }
                if (i15 != 0) {
                    qVar.Z(793644531);
                    objP = qVar.P();
                    if (objP == m0.l.f11578a) {
                        objP = new x.m();
                        qVar.l0(objP);
                    }
                    r10 = 0;
                    qVar.t(false);
                    i18 = i12;
                    mVar4 = (x.m) objP;
                    z12 = z11;
                } else {
                    r10 = 0;
                    z12 = z11;
                    i18 = i12;
                    mVar4 = mVar3;
                }
            } else {
                if (i20 != 0) {
                    oVar3 = y0.l.f16729b;
                } else {
                    oVar3 = oVar2;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    qVar.Z(-1519621781);
                    i0Var = (k0.i0) qVar.m(k0.k0.f9091a);
                    qVar.Z(1437915677);
                    b1Var4 = i0Var.P;
                    if (b1Var4 == null) {
                        long j1111111111110 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                        long j1111111111111 = e1.r.f5064f;
                        b1Var4 = new k0.b1(j1111111111111, j1111111111110, j1111111111111, e1.r.b(j1111111111110, 0.38f));
                        i0Var.P = b1Var4;
                    }
                    qVar.t(false);
                    j10 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                    j11 = b1Var4.f8729b;
                    if (e1.r.c(j11, j10)) {
                        qVar.t(false);
                        b1Var3 = b1Var4;
                    } else {
                        jB = e1.r.b(j10, 0.38f);
                        long j1111111111112 = b1Var4.f8728a;
                        long j1111111111113 = b1Var4.f8730c;
                        j12 = e1.r.f5065g;
                        if (j10 == j12) {
                            j10 = j11;
                        }
                        if (jB != j12) {
                            j13 = jB;
                        } else {
                            j13 = b1Var4.f8731d;
                        }
                        b1Var3 = new k0.b1(j1111111111112, j10, j1111111111113, j13);
                        qVar.t(false);
                    }
                    i12 &= -7169;
                } else {
                    z11 = z11;
                    b1Var3 = b1Var2;
                }
                if (i15 != 0) {
                    qVar.Z(793644531);
                    objP = qVar.P();
                    if (objP == m0.l.f11578a) {
                        objP = new x.m();
                        qVar.l0(objP);
                    }
                    r10 = 0;
                    qVar.t(false);
                    i18 = i12;
                    mVar4 = (x.m) objP;
                    z12 = z11;
                } else {
                    r10 = 0;
                    z12 = z11;
                    i18 = i12;
                    mVar4 = mVar3;
                }
            }
            qVar.u();
            m3 m3Var14 = k0.g1.f8940a;
            y0.o oVarJ117 = oVar3.j(MinimumInteractiveModifier.f1691b);
            float f113 = l0.i.f11065b;
            y0.o oVarB14 = androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.c.h(oVarJ117, f113), k0.r2.a(5, qVar));
            if (z12) {
                j14 = b1Var3.f8728a;
            } else {
                j14 = b1Var3.f8730c;
            }
            y0.o oVarJ118 = androidx.compose.foundation.a.j(androidx.compose.foundation.a.e(oVarB14, j14, e1.g0.f5008a), mVar4, j0.v.a(false, f113 / 2, 0L, qVar, 54, 4), z12, new y1.g(r10), aVar, 8);
            y0.g gVar14 = y0.a.f16710c;
            qVar.Z(733328855);
            j0VarC = y.p.c(gVar14, r10, qVar);
            qVar.Z(-1323940314);
            i19 = qVar.P;
            r1VarP = qVar.p();
            t1.l.f14477k.getClass();
            jVar = t1.k.f14458b;
            bVarI = androidx.compose.ui.layout.a.i(oVarJ118);
            if (!(qVar.f11630a instanceof m0.d)) {
                m9.e0.C();
                throw null;
            }
            qVar.c0();
            if (qVar.O) {
                qVar.o(jVar);
            } else {
                qVar.o0();
            }
            d7.t.s0(qVar, j0VarC, t1.k.f14461e);
            d7.t.s0(qVar, r1VarP, t1.k.f14460d);
            iVar = t1.k.f14462f;
            if (qVar.O) {
                l.q.r(i19, qVar, i19, iVar);
            } else {
                l.q.r(i19, qVar, i19, iVar);
            }
            l.q.s(r10, bVarI, new m0.l2(qVar), qVar, 2058660585);
            if (z12) {
                j15 = b1Var3.f8729b;
            } else {
                j15 = b1Var3.f8731d;
            }
            f6.a.b(k0.s0.f9444a.b(new e1.r(j15)), eVar, qVar, (i18 >> 12) & 112);
            l.q.v(qVar, r10, true, r10, r10);
            mVar5 = mVar4;
            z13 = z12;
            oVar4 = oVar3;
            b1Var5 = b1Var3;
        } else {
            qVar.W();
            if ((i10 & 1) != 0) {
                if (i20 != 0) {
                    oVar3 = y0.l.f16729b;
                } else {
                    oVar3 = oVar2;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    qVar.Z(-1519621781);
                    i0Var = (k0.i0) qVar.m(k0.k0.f9091a);
                    qVar.Z(1437915677);
                    b1Var4 = i0Var.P;
                    if (b1Var4 == null) {
                        long j1111111111114 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                        long j1111111111115 = e1.r.f5064f;
                        b1Var4 = new k0.b1(j1111111111115, j1111111111114, j1111111111115, e1.r.b(j1111111111114, 0.38f));
                        i0Var.P = b1Var4;
                    }
                    qVar.t(false);
                    j10 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                    j11 = b1Var4.f8729b;
                    if (e1.r.c(j11, j10)) {
                        qVar.t(false);
                        b1Var3 = b1Var4;
                    } else {
                        jB = e1.r.b(j10, 0.38f);
                        long j1111111111116 = b1Var4.f8728a;
                        long j1111111111117 = b1Var4.f8730c;
                        j12 = e1.r.f5065g;
                        if (j10 == j12) {
                            j10 = j11;
                        }
                        if (jB != j12) {
                            j13 = jB;
                        } else {
                            j13 = b1Var4.f8731d;
                        }
                        b1Var3 = new k0.b1(j1111111111116, j10, j1111111111117, j13);
                        qVar.t(false);
                    }
                    i12 &= -7169;
                } else {
                    z11 = z11;
                    b1Var3 = b1Var2;
                }
                if (i15 != 0) {
                    qVar.Z(793644531);
                    objP = qVar.P();
                    if (objP == m0.l.f11578a) {
                        objP = new x.m();
                        qVar.l0(objP);
                    }
                    r10 = 0;
                    qVar.t(false);
                    i18 = i12;
                    mVar4 = (x.m) objP;
                    z12 = z11;
                } else {
                    r10 = 0;
                    z12 = z11;
                    i18 = i12;
                    mVar4 = mVar3;
                }
            } else {
                if (i20 != 0) {
                    oVar3 = y0.l.f16729b;
                } else {
                    oVar3 = oVar2;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    qVar.Z(-1519621781);
                    i0Var = (k0.i0) qVar.m(k0.k0.f9091a);
                    qVar.Z(1437915677);
                    b1Var4 = i0Var.P;
                    if (b1Var4 == null) {
                        long j1111111111118 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                        long j1111111111119 = e1.r.f5064f;
                        b1Var4 = new k0.b1(j1111111111119, j1111111111118, j1111111111119, e1.r.b(j1111111111118, 0.38f));
                        i0Var.P = b1Var4;
                    }
                    qVar.t(false);
                    j10 = ((e1.r) qVar.m(k0.s0.f9444a)).f5067a;
                    j11 = b1Var4.f8729b;
                    if (e1.r.c(j11, j10)) {
                        qVar.t(false);
                        b1Var3 = b1Var4;
                    } else {
                        jB = e1.r.b(j10, 0.38f);
                        long j11111111111110 = b1Var4.f8728a;
                        long j11111111111111 = b1Var4.f8730c;
                        j12 = e1.r.f5065g;
                        if (j10 == j12) {
                            j10 = j11;
                        }
                        if (jB != j12) {
                            j13 = jB;
                        } else {
                            j13 = b1Var4.f8731d;
                        }
                        b1Var3 = new k0.b1(j11111111111110, j10, j11111111111111, j13);
                        qVar.t(false);
                    }
                    i12 &= -7169;
                } else {
                    z11 = z11;
                    b1Var3 = b1Var2;
                }
                if (i15 != 0) {
                    qVar.Z(793644531);
                    objP = qVar.P();
                    if (objP == m0.l.f11578a) {
                        objP = new x.m();
                        qVar.l0(objP);
                    }
                    r10 = 0;
                    qVar.t(false);
                    i18 = i12;
                    mVar4 = (x.m) objP;
                    z12 = z11;
                } else {
                    r10 = 0;
                    z12 = z11;
                    i18 = i12;
                    mVar4 = mVar3;
                }
            }
            qVar.u();
            m3 m3Var15 = k0.g1.f8940a;
            y0.o oVarJ119 = oVar3.j(MinimumInteractiveModifier.f1691b);
            float f114 = l0.i.f11065b;
            y0.o oVarB15 = androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.c.h(oVarJ119, f114), k0.r2.a(5, qVar));
            if (z12) {
                j14 = b1Var3.f8728a;
            } else {
                j14 = b1Var3.f8730c;
            }
            y0.o oVarJ1110 = androidx.compose.foundation.a.j(androidx.compose.foundation.a.e(oVarB15, j14, e1.g0.f5008a), mVar4, j0.v.a(false, f114 / 2, 0L, qVar, 54, 4), z12, new y1.g(r10), aVar, 8);
            y0.g gVar15 = y0.a.f16710c;
            qVar.Z(733328855);
            j0VarC = y.p.c(gVar15, r10, qVar);
            qVar.Z(-1323940314);
            i19 = qVar.P;
            r1VarP = qVar.p();
            t1.l.f14477k.getClass();
            jVar = t1.k.f14458b;
            bVarI = androidx.compose.ui.layout.a.i(oVarJ1110);
            if (!(qVar.f11630a instanceof m0.d)) {
                m9.e0.C();
                throw null;
            }
            qVar.c0();
            if (qVar.O) {
                qVar.o(jVar);
            } else {
                qVar.o0();
            }
            d7.t.s0(qVar, j0VarC, t1.k.f14461e);
            d7.t.s0(qVar, r1VarP, t1.k.f14460d);
            iVar = t1.k.f14462f;
            if (qVar.O) {
                l.q.r(i19, qVar, i19, iVar);
            } else {
                l.q.r(i19, qVar, i19, iVar);
            }
            l.q.s(r10, bVarI, new m0.l2(qVar), qVar, 2058660585);
            if (z12) {
                j15 = b1Var3.f8729b;
            } else {
                j15 = b1Var3.f8731d;
            }
            f6.a.b(k0.s0.f9444a.b(new e1.r(j15)), eVar, qVar, (i18 >> 12) & 112);
            l.q.v(qVar, r10, true, r10, r10);
            mVar5 = mVar4;
            z13 = z12;
            oVar4 = oVar3;
            b1Var5 = b1Var3;
        }
        x1VarX = qVar.x();
        if (x1VarX != null) {
            x1VarX.f11756d = new k0.c1(aVar, oVar4, z13, b1Var5, mVar5, eVar, i10, i11);
        }
    }

    public static Process b0(String[] strArr) {
        try {
            if (f12578g == null) {
                Method declaredMethod = la.g.class.getDeclaredMethod("d", String[].class, String[].class, String.class);
                declaredMethod.setAccessible(true);
                f12578g = declaredMethod;
            }
            Method method = f12578g;
            Object objInvoke = method != null ? method.invoke(null, strArr, null, null) : null;
            if (objInvoke instanceof Process) {
                return (Process) objInvoke;
            }
            return null;
        } catch (Exception e4) {
            a7.a.t("Shizuku reflection error: ", e4.getMessage(), "ShellTapExecutor");
            return null;
        }
    }

    public static final ArrayList c(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p6.k kVar = (p6.k) it.next();
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", kVar.f12815a);
            bundle.putLong("event_timestamp", kVar.f12816b);
            arrayList2.add(bundle);
        }
        return arrayList2;
    }

    public static final h0.p d(h0.q0 q0Var, h0.q qVar) {
        h0.n nVar = q0Var.f7449c;
        boolean z10 = nVar.b() == 1;
        return new h0.p(i(nVar, z10, true, qVar), i(nVar, z10, false, qVar), z10);
    }

    public static final int e(long j10) {
        int i10;
        if ((4294967295L & j10) == 0) {
            i10 = 32;
            j10 >>= 32;
        } else {
            i10 = 0;
        }
        if ((65535 & j10) == 0) {
            i10 += 16;
            j10 >>= 16;
        }
        if ((255 & j10) == 0) {
            i10 += 8;
            j10 >>= 8;
        }
        if ((15 & j10) == 0) {
            i10 += 4;
            j10 >>= 4;
        }
        if ((1 & j10) != 0) {
            return i10;
        }
        if ((2 & j10) != 0) {
            return i10 + 1;
        }
        if ((4 & j10) != 0) {
            return i10 + 2;
        }
        if ((j10 & 8) != 0) {
            return i10 + 3;
        }
        return -1;
    }

    public static final h0.o f(h0.q0 q0Var, h0.n nVar, h0.o oVar) {
        boolean z10 = q0Var.f7447a;
        int i10 = z10 ? nVar.f7427a : nVar.f7428b;
        nVar.getClass();
        q8.d[] dVarArr = q8.d.f13224a;
        q8.c cVarR = z6.a.R(new h0.u(nVar, i10));
        q8.c cVarR2 = z6.a.R(new h0.t(nVar, i10, z10 ? nVar.f7428b : nVar.f7427a, q0Var, cVarR));
        if (1 != oVar.f7434c) {
            return (h0.o) ((q8.m) cVarR2).getValue();
        }
        int i11 = nVar.f7429c;
        if (i10 == i11) {
            return oVar;
        }
        a2.a0 a0Var = nVar.f7430d;
        if (((Number) ((q8.m) cVarR).getValue()).intValue() != a0Var.f(i11)) {
            return (h0.o) ((q8.m) cVarR2).getValue();
        }
        int i12 = oVar.f7433b;
        long jN = a0Var.n(i12);
        if (i11 != -1) {
            if (i10 != i11) {
                if (!(z10 ^ (nVar.b() == 1))) {
                }
            }
            return nVar.a(i10);
        }
        int i13 = a2.b0.f904c;
        return (i12 == ((int) (jN >> 32)) || i12 == ((int) (jN & 4294967295L))) ? (h0.o) ((q8.m) cVarR2).getValue() : nVar.a(i10);
    }

    public static f1.d g(f1.d dVar) {
        f1.s sVar = f1.j.f6060b;
        f1.a aVar = f1.b.f6018b;
        if (!f1.c.a(dVar.f6026b, f1.c.f6020a)) {
            return dVar;
        }
        f1.q qVar = (f1.q) dVar;
        f1.s sVar2 = qVar.f6077d;
        if (p(sVar2, sVar)) {
            return dVar;
        }
        float[] fArrA = sVar.a();
        return new f1.q(qVar.f6025a, qVar.f6081h, sVar, T(n(aVar.f6019a, sVar2.a(), fArrA), qVar.f6082i), qVar.f6084k, qVar.f6087n, qVar.f6078e, qVar.f6079f, qVar.f6080g, -1);
    }

    public static j3.b g0(MappedByteBuffer mappedByteBuffer) throws IOException {
        long jF;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        k.f fVar = new k.f(byteBufferDuplicate);
        fVar.I(4);
        int i10 = ((ByteBuffer) fVar.f8599b).getShort() & 65535;
        if (i10 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        fVar.I(6);
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                jF = -1;
                break;
            }
            int i12 = ((ByteBuffer) fVar.f8599b).getInt();
            fVar.I(4);
            jF = fVar.F();
            fVar.I(4);
            if (1835365473 == i12) {
                break;
            }
            i11++;
        }
        if (jF != -1) {
            fVar.I((int) (jF - ((long) ((ByteBuffer) fVar.f8599b).position())));
            fVar.I(12);
            long jF2 = fVar.F();
            for (int i13 = 0; i13 < jF2; i13++) {
                int i14 = ((ByteBuffer) fVar.f8599b).getInt();
                long jF3 = fVar.F();
                fVar.F();
                if (1164798569 == i14 || 1701669481 == i14) {
                    byteBufferDuplicate.position((int) (jF3 + jF));
                    j3.b bVar = new j3.b();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    bVar.f8336b = byteBufferDuplicate;
                    bVar.f8335a = iPosition;
                    int i15 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    bVar.f8337c = i15;
                    bVar.f8338d = bVar.f8336b.getShort(i15);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final void h(q.g gVar, int i10) {
        d7.a.m(gVar, "<this>");
        gVar.f12990a = new int[i10];
        gVar.f12991b = new Object[i10];
    }

    public static final int h0(ja.j jVar, int i10) {
        d7.a.m(jVar, "<this>");
        return i10 == -1234567890 ? jVar.d() : i10;
    }

    public static final h0.o i(h0.n nVar, boolean z10, boolean z11, h0.q qVar) {
        long jG;
        long j10;
        int i10 = z11 ? nVar.f7427a : nVar.f7428b;
        nVar.getClass();
        int i11 = qVar.f7446a;
        a2.a0 a0Var = nVar.f7430d;
        switch (i11) {
            case 0:
                String str = a0Var.f893a.f1052a.f918a;
                jG = o1.s.g(f6.a.H(i10, str), f6.a.G(i10, str));
                break;
            default:
                jG = a0Var.n(i10);
                break;
        }
        if (z10 ^ z11) {
            int i12 = a2.b0.f904c;
            j10 = jG >> 32;
        } else {
            int i13 = a2.b0.f904c;
            j10 = 4294967295L & jG;
        }
        return nVar.a((int) j10);
    }

    public static final Object i0(r9.s sVar, r9.s sVar2, c9.e eVar) {
        Object uVar;
        Object objY;
        try {
            z6.a.f(2, eVar);
            uVar = eVar.invoke(sVar2, sVar);
        } catch (Throwable th) {
            uVar = new m9.u(th, false);
        }
        v8.a aVar = v8.a.f15963a;
        if (uVar == aVar || (objY = sVar.Y(uVar)) == m9.e0.f11928e) {
            return aVar;
        }
        if (objY instanceof m9.u) {
            throw ((m9.u) objY).f12005a;
        }
        return m9.e0.N(objY);
    }

    public static final boolean j(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        d7.a.m(bArr, "a");
        d7.a.m(bArr2, "b");
        for (int i13 = 0; i13 < i12; i13++) {
            if (bArr[i13 + i10] != bArr2[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    public static final int k(int[] iArr, int i10) {
        int length = iArr.length - 1;
        int i11 = 0;
        while (i11 <= length) {
            int i12 = (i11 + length) >>> 1;
            int i13 = iArr[i12];
            if (i10 > i13) {
                i11 = i12 + 1;
            } else {
                if (i10 >= i13) {
                    return i12;
                }
                length = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static void k0(ViewGroup viewGroup, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z10);
        } else if (f12577f) {
            try {
                viewGroup.suppressLayout(z10);
            } catch (NoSuchMethodError unused) {
                f12577f = false;
            }
        }
    }

    public static final h0.o l(h0.o oVar, h0.n nVar, int i10) {
        return new h0.o(nVar.f7430d.a(i10), i10, oVar.f7434c);
    }

    public static void l0(byte[] bArr, long j10, int i10) {
        int i11 = 0;
        while (i11 < 4) {
            bArr[i10 + i11] = (byte) (255 & j10);
            i11++;
            j10 >>= 8;
        }
    }

    public static final void m(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException("size=" + j10 + " offset=" + j11 + " byteCount=" + j12);
        }
    }

    public static final void m0(int i10, int i11) {
        if (i10 > 0 && i11 > 0) {
            if (i10 > i11) {
                throw new IllegalArgumentException(l.q.i("minLines ", i10, " must be less than or equal to maxLines ", i11).toString());
            }
            return;
        }
        throw new IllegalArgumentException(("both minLines " + i10 + " and maxLines " + i11 + " must be greater than zero").toString());
    }

    public static final float[] n(float[] fArr, float[] fArr2, float[] fArr3) {
        V(fArr, fArr2);
        V(fArr, fArr3);
        return T(O(fArr), U(new float[]{fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]}, fArr));
    }

    public static int n0(int i10) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i11 = 0; i11 < 6; i11++) {
            int i12 = iArr[i11];
            int i13 = i12 - 1;
            if (i12 == 0) {
                throw null;
            }
            if (i13 == i10) {
                return i12;
            }
        }
        return 1;
    }

    public static final m0.g1 o(x.l lVar, m0.m mVar, int i10) {
        m0.q qVar = (m0.q) mVar;
        qVar.Z(-1692965168);
        qVar.Z(-492369756);
        Object objP = qVar.P();
        k0.y0 y0Var = m0.l.f11578a;
        if (objP == y0Var) {
            objP = d7.t.g0(Boolean.FALSE, o3.f11621a);
            qVar.l0(objP);
        }
        qVar.t(false);
        m0.g1 g1Var = (m0.g1) objP;
        qVar.Z(1523189838);
        boolean zG = qVar.g(lVar) | qVar.g(g1Var);
        Object objP2 = qVar.P();
        if (zG || objP2 == y0Var) {
            objP2 = new x.q(lVar, g1Var, null);
            qVar.l0(objP2);
        }
        qVar.t(false);
        m0.s.b(lVar, (c9.e) objP2, qVar);
        qVar.t(false);
        return g1Var;
    }

    public static final boolean p(f1.s sVar, f1.s sVar2) {
        if (sVar == sVar2) {
            return true;
        }
        return Math.abs(sVar.f6098a - sVar2.f6098a) < 0.001f && Math.abs(sVar.f6099b - sVar2.f6099b) < 0.001f;
    }

    public static byte[] q(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        byte b10 = 0;
        long jR = R(0, bArr) & 67108863;
        long jR2 = (R(3, bArr) >> 2) & 67108611;
        long jR3 = (R(6, bArr) >> 4) & 67092735;
        long jR4 = (R(9, bArr) >> 6) & 66076671;
        long jR5 = (R(12, bArr) >> 8) & 1048575;
        long j10 = jR2 * 5;
        long j11 = jR3 * 5;
        long j12 = jR4 * 5;
        long j13 = jR5 * 5;
        int i10 = 17;
        byte[] bArr3 = new byte[17];
        long j14 = 0;
        int i11 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        while (i11 < bArr2.length) {
            int iMin = Math.min(16, bArr2.length - i11);
            System.arraycopy(bArr2, i11, bArr3, b10, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, i10, b10);
            }
            long jR6 = j18 + (R(b10, bArr3) & 67108863);
            long jR7 = j14 + ((R(3, bArr3) >> 2) & 67108863);
            long jR8 = j15 + ((R(6, bArr3) >> 4) & 67108863);
            long jR9 = j16 + ((R(9, bArr3) >> 6) & 67108863);
            long jR10 = j17 + (((R(12, bArr3) >> 8) & 67108863) | ((long) (bArr3[16] << 24)));
            long j19 = (jR10 * j10) + (jR9 * j11) + (jR8 * j12) + (jR7 * j13) + (jR6 * jR);
            long j20 = (jR10 * j11) + (jR9 * j12) + (jR8 * j13) + (jR7 * jR) + (jR6 * jR2);
            long j21 = (jR10 * j12) + (jR9 * j13) + (jR8 * jR) + (jR7 * jR2) + (jR6 * jR3);
            long j22 = (jR10 * j13) + (jR9 * jR) + (jR8 * jR2) + (jR7 * jR3) + (jR6 * jR4);
            long j23 = jR9 * jR2;
            long j24 = jR10 * jR;
            long j25 = j20 + (j19 >> 26);
            long j26 = j21 + (j25 >> 26);
            long j27 = j22 + (j26 >> 26);
            long j28 = j24 + j23 + (jR8 * jR3) + (jR7 * jR4) + (jR6 * jR5) + (j27 >> 26);
            long j29 = j28 >> 26;
            j17 = j28 & 67108863;
            long j30 = (j29 * 5) + (j19 & 67108863);
            long j31 = j30 & 67108863;
            j14 = (j25 & 67108863) + (j30 >> 26);
            i11 += 16;
            j15 = j26 & 67108863;
            j16 = j27 & 67108863;
            b10 = 0;
            i10 = 17;
            j18 = j31;
        }
        long j32 = j15 + (j14 >> 26);
        long j33 = j32 & 67108863;
        long j34 = j16 + (j32 >> 26);
        long j35 = j34 & 67108863;
        long j36 = j17 + (j34 >> 26);
        long j37 = j36 & 67108863;
        long j38 = ((j36 >> 26) * 5) + j18;
        long j39 = j38 >> 26;
        long j40 = j38 & 67108863;
        long j41 = (j14 & 67108863) + j39;
        long j42 = j40 + 5;
        long j43 = j42 & 67108863;
        long j44 = j41 + (j42 >> 26);
        long j45 = j33 + (j44 >> 26);
        long j46 = j35 + (j45 >> 26);
        long j47 = (j37 + (j46 >> 26)) - 67108864;
        long j48 = j47 >> 63;
        long j49 = ~j48;
        long j50 = (j41 & j48) | (j44 & 67108863 & j49);
        long j51 = (j33 & j48) | (j45 & 67108863 & j49);
        long j52 = (j35 & j48) | (j46 & 67108863 & j49);
        long j53 = ((j40 & j48) | (j43 & j49) | (j50 << 26)) & 4294967295L;
        long j54 = ((j50 >> 6) | (j51 << 20)) & 4294967295L;
        long j55 = ((j51 >> 12) | (j52 << 14)) & 4294967295L;
        long j56 = ((((j47 & j49) | (j37 & j48)) << 8) | (j52 >> 18)) & 4294967295L;
        long jR11 = R(16, bArr) + j53;
        long jR12 = R(20, bArr) + j54 + (jR11 >> 32);
        long jR13 = R(24, bArr) + j55 + (jR12 >> 32);
        long jR14 = (R(28, bArr) + j56 + (jR13 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        l0(bArr4, jR11 & 4294967295L, 0);
        l0(bArr4, jR12 & 4294967295L, 4);
        l0(bArr4, jR13 & 4294967295L, 8);
        l0(bArr4, jR14, 12);
        return bArr4;
    }

    public static i3.y r(Context context) {
        ProviderInfo providerInfo;
        l.p pVar;
        ApplicationInfo applicationInfo;
        l2.l dVar = Build.VERSION.SDK_INT >= 28 ? new i3.d() : new i3.c();
        PackageManager packageManager = context.getPackageManager();
        o1.s.l(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            pVar = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrF = dVar.f(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrF) {
                    arrayList.add(signature.toByteArray());
                }
                pVar = new l.p(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e4) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e4);
                pVar = null;
            }
        }
        if (pVar == null) {
            return null;
        }
        return new i3.y(new i3.x(context, pVar));
    }

    public static final i4.o s(Context context) {
        i4.h hVar = new i4.h(context);
        Context context2 = hVar.f8032a;
        s4.c cVar = hVar.f8033b;
        q8.i iVar = new q8.i(new i4.f(hVar, 0));
        q8.i iVar2 = new q8.i(new i4.f(hVar, 1));
        q8.i iVar3 = new q8.i(i4.g.f8031a);
        r8.r rVar = r8.r.f13661a;
        return new i4.o(context2, cVar, iVar, iVar2, iVar3, new i4.c(rVar, rVar, rVar, rVar, rVar), hVar.f8034c);
    }

    public static final boolean t(int i10, int i11) {
        return i10 == i11;
    }

    public static void u(int i10, int i11, int i12) {
        if (P() && P()) {
            String str = "input swipe " + i10 + " " + i11 + " " + i10 + " " + i11 + " " + i12;
            try {
                Process processB0 = b0(new String[]{"sh", "-c", str});
                if (processB0 == null) {
                    Log.e("ShellTapExecutor", "newShizukuProcess returned null for: " + str);
                    return;
                }
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processB0.getInputStream()));
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(processB0.getErrorStream()));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                    sb.append("\n");
                }
                while (bufferedReader2.readLine() != null) {
                }
                processB0.waitFor();
                sb.length();
            } catch (Exception e4) {
                Log.e("ShellTapExecutor", "Exception executing: " + str + " | " + e4.getMessage());
            }
        }
    }

    public static void v(int i10, int i11) {
        if (P()) {
            b0(new String[]{"input", "tap", String.valueOf(i10), String.valueOf(i11)});
        }
    }

    public static int w(int i10, int i11) {
        if (i11 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int iHighestOneBit = i10 + (i10 >> 1) + 1;
        if (iHighestOneBit < i11) {
            iHighestOneBit = Integer.highestOneBit(i11 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    public static final b0.g y(a0.w wVar, int i10, long j10, b0.t tVar, long j11, v.h1 h1Var, y0.b bVar, y0.c cVar, m2.l lVar, boolean z10, int i11) {
        return new b0.g(i10, i11, ((a0.x) wVar).a(i10, j10), j11, tVar.a(i10), h1Var, bVar, cVar, lVar, z10);
    }

    public abstract String[] F(Class cls);

    public void I(int i10) {
    }

    public void J(long j10, int i10) {
    }

    public void K(long j10) {
    }

    public void L(long j10) {
    }

    public abstract boolean Q(Class cls);

    public abstract g8.g1 a0(URI uri, e8.q1 q1Var);

    public void c0(int i10) {
    }

    public void d0(long j10, long j11, int i10) {
    }

    public void e0(long j10) {
    }

    public void f0(long j10) {
    }

    public void j0(e8.c2 c2Var) {
    }

    public abstract Method x(Class cls, Field field);

    public abstract Constructor z(Class cls);
}
