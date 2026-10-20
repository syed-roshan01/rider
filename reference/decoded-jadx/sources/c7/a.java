package c7;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import com.google.crypto.tink.shaded.protobuf.h0;
import com.google.crypto.tink.shaded.protobuf.k;
import com.google.crypto.tink.shaded.protobuf.l;
import com.google.crypto.tink.shaded.protobuf.t;
import i7.b1;
import i7.f1;
import i7.h1;
import i7.i1;
import i7.m1;
import i7.p0;
import i7.q0;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import k6.w4;
import v6.h;
import v6.j;
import v6.s;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f3026a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f3027b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f3028c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f3029d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f3030e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h f3031f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public w4 f3032g;

    public static byte[] c(Context context, String str, String str2) throws CharConversionException {
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        Context applicationContext = context.getApplicationContext();
        try {
            String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
            if (string == null) {
                return null;
            }
            return d7.a.s(string);
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", str));
        }
    }

    public static w4 d(byte[] bArr) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            return new w4((f1) j.a(i1.E(byteArrayInputStream, t.a())).f15918a.w(), 6);
        } finally {
            byteArrayInputStream.close();
        }
    }

    public final synchronized b a() {
        b bVar;
        try {
            if (this.f3027b == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            synchronized (b.f3033b) {
                try {
                    byte[] bArrC = c(this.f3026a, this.f3027b, this.f3028c);
                    if (bArrC == null) {
                        if (this.f3029d != null) {
                            this.f3030e = f();
                        }
                        this.f3032g = b();
                    } else if (this.f3029d != null) {
                        this.f3032g = e(bArrC);
                    } else {
                        this.f3032g = d(bArrC);
                    }
                    bVar = new b(this);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return bVar;
    }

    public final w4 b() throws GeneralSecurityException, IOException {
        if (this.f3031f == null) {
            throw new GeneralSecurityException("cannot read or generate keyset");
        }
        w4 w4Var = new w4(i1.D(), 6);
        h hVar = this.f3031f;
        synchronized (w4Var) {
            w4Var.b(hVar.f15916a);
        }
        int iB = s.a(w4Var.g().f15918a).z().B();
        synchronized (w4Var) {
            for (int i10 = 0; i10 < ((i1) ((f1) w4Var.f10455b).f3641b).A(); i10++) {
                try {
                    h1 h1VarZ = ((i1) ((f1) w4Var.f10455b).f3641b).z(i10);
                    if (h1VarZ.C() == iB) {
                        if (!h1VarZ.E().equals(b1.ENABLED)) {
                            throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + iB);
                        }
                        f1 f1Var = (f1) w4Var.f10455b;
                        f1Var.d();
                        i1.x((i1) f1Var.f3641b, iB);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            throw new GeneralSecurityException("key not found: " + iB);
        }
        Context context = this.f3026a;
        String str = this.f3027b;
        String str2 = this.f3028c;
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        Context applicationContext = context.getApplicationContext();
        SharedPreferences.Editor editorEdit = str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext).edit() : applicationContext.getSharedPreferences(str2, 0).edit();
        if (this.f3030e != null) {
            j jVarG = w4Var.g();
            c cVar = this.f3030e;
            byte[] bArr = new byte[0];
            i1 i1Var = jVarG.f15918a;
            byte[] bArrA = cVar.a(i1Var.d(), bArr);
            try {
                if (!i1.F(cVar.b(bArrA, bArr), t.a()).equals(i1Var)) {
                    throw new GeneralSecurityException("cannot encrypt keyset");
                }
                p0 p0VarA = q0.A();
                k kVarI = l.i(bArrA, 0, bArrA.length);
                p0VarA.d();
                q0.x((q0) p0VarA.f3641b, kVarI);
                m1 m1VarA = s.a(i1Var);
                p0VarA.d();
                q0.y((q0) p0VarA.f3641b, m1VarA);
                if (!editorEdit.putString(str, d7.a.t(((q0) p0VarA.a()).d())).commit()) {
                    throw new IOException("Failed to write to SharedPreferences");
                }
            } catch (h0 unused) {
                throw new GeneralSecurityException("invalid keyset, corrupted key material");
            }
        } else if (!editorEdit.putString(str, d7.a.t(w4Var.g().f15918a.d())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
        return w4Var;
    }

    public final w4 e(byte[] bArr) {
        try {
            this.f3030e = new d().c(this.f3029d);
            try {
                return new w4((f1) j.c(new w4(new ByteArrayInputStream(bArr), 4), this.f3030e).f15918a.w(), 6);
            } catch (IOException | GeneralSecurityException e4) {
                try {
                    return d(bArr);
                } catch (IOException unused) {
                    throw e4;
                }
            }
        } catch (GeneralSecurityException | ProviderException e10) {
            try {
                w4 w4VarD = d(bArr);
                Object obj = b.f3033b;
                Log.w("b", "cannot use Android Keystore, it'll be disabled", e10);
                return w4VarD;
            } catch (IOException unused2) {
                throw e10;
            }
        }
    }

    public final c f() throws KeyStoreException {
        Object obj = b.f3033b;
        d dVar = new d();
        try {
            boolean zA = d.a(this.f3029d);
            try {
                return dVar.c(this.f3029d);
            } catch (GeneralSecurityException | ProviderException e4) {
                if (!zA) {
                    throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.f3029d), e4);
                }
                Object obj2 = b.f3033b;
                Log.w("b", "cannot use Android Keystore, it'll be disabled", e4);
                return null;
            }
        } catch (GeneralSecurityException | ProviderException e10) {
            Object obj3 = b.f3033b;
            Log.w("b", "cannot use Android Keystore, it'll be disabled", e10);
            return null;
        }
    }
}
