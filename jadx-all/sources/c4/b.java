package c4;

import android.content.Context;
import android.content.SharedPreferences;
import j7.f;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import q.g;
import t.k;
import v6.j;
import v6.q;
import w6.h;

/* JADX INFO: loaded from: classes.dex */
public final class b implements SharedPreferences {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f2949a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v6.a f2952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v6.c f2953e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2951c = "encrypted_app_data";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f2950b = new CopyOnWriteArrayList();

    public b(SharedPreferences sharedPreferences, v6.a aVar, v6.c cVar) {
        this.f2949a = sharedPreferences;
        this.f2952d = aVar;
        this.f2953e = cVar;
    }

    public static b a(Context context, d dVar) {
        j jVarG;
        j jVarG2;
        String str = dVar.f2957a;
        int i10 = b7.a.f2734a;
        q.h(b7.c.f2739b);
        if (!a7.b.f1325b.get()) {
            q.f(new h(9), true);
        }
        w6.a.a();
        Context applicationContext = context.getApplicationContext();
        c7.a aVar = new c7.a();
        aVar.f3031f = v6.b.a("AES256_SIV");
        if (applicationContext == null) {
            throw new IllegalArgumentException("need an Android context");
        }
        aVar.f3026a = applicationContext;
        aVar.f3027b = "__androidx_security_crypto_encrypted_prefs_key_keyset__";
        aVar.f3028c = "encrypted_app_data";
        String strX = l.q.x("android-keystore://", str);
        if (!strX.startsWith("android-keystore://")) {
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }
        aVar.f3029d = strX;
        c7.b bVarA = aVar.a();
        synchronized (bVarA) {
            jVarG = bVarA.f3034a.g();
        }
        c7.a aVar2 = new c7.a();
        aVar2.f3031f = v6.b.a("AES256_GCM");
        aVar2.f3026a = applicationContext;
        aVar2.f3027b = "__androidx_security_crypto_encrypted_prefs_value_keyset__";
        aVar2.f3028c = "encrypted_app_data";
        String strX2 = l.q.x("android-keystore://", str);
        if (!strX2.startsWith("android-keystore://")) {
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }
        aVar2.f3029d = strX2;
        c7.b bVarA2 = aVar2.a();
        synchronized (bVarA2) {
            jVarG2 = bVarA2.f3034a.g();
        }
        v6.c cVar = (v6.c) jVarG.b(v6.c.class);
        return new b(applicationContext.getSharedPreferences("encrypted_app_data", 0), (v6.a) jVarG2.b(v6.a.class), cVar);
    }

    public static boolean d(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    public final String b(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            try {
                return new String(f.b(this.f2953e.a(str.getBytes(StandardCharsets.UTF_8), this.f2951c.getBytes())), "US-ASCII");
            } catch (UnsupportedEncodingException e4) {
                throw new AssertionError(e4);
            }
        } catch (GeneralSecurityException e10) {
            throw new SecurityException("Could not encrypt key. " + e10.getMessage(), e10);
        }
    }

    public final Object c(String str) {
        int i10;
        if (d(str)) {
            throw new SecurityException(l.q.j(str, " is a reserved key for the encryption keyset."));
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String strB = b(str);
            String string = this.f2949a.getString(strB, null);
            if (string == null) {
                return null;
            }
            byte[] bArrA = f.a(string);
            v6.a aVar = this.f2952d;
            Charset charset = StandardCharsets.UTF_8;
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(aVar.b(bArrA, strB.getBytes(charset)));
            byteBufferWrap.position(0);
            int i11 = byteBufferWrap.getInt();
            if (i11 == 0) {
                i10 = 1;
            } else if (i11 == 1) {
                i10 = 2;
            } else if (i11 == 2) {
                i10 = 3;
            } else if (i11 == 3) {
                i10 = 4;
            } else if (i11 != 4) {
                i10 = i11 != 5 ? 0 : 6;
            } else {
                i10 = 5;
            }
            if (i10 == 0) {
                throw new SecurityException("Unknown type ID for encrypted pref value: " + i11);
            }
            int iE = k.e(i10);
            if (iE == 0) {
                int i12 = byteBufferWrap.getInt();
                ByteBuffer byteBufferSlice = byteBufferWrap.slice();
                byteBufferWrap.limit(i12);
                String string2 = charset.decode(byteBufferSlice).toString();
                if (string2.equals("__NULL__")) {
                    return null;
                }
                return string2;
            }
            if (iE != 1) {
                if (iE == 2) {
                    return Integer.valueOf(byteBufferWrap.getInt());
                }
                if (iE == 3) {
                    return Long.valueOf(byteBufferWrap.getLong());
                }
                if (iE == 4) {
                    return Float.valueOf(byteBufferWrap.getFloat());
                }
                if (iE == 5) {
                    return Boolean.valueOf(byteBufferWrap.get() != 0);
                }
                throw new SecurityException("Unhandled type for encrypted pref value: ".concat(a7.a.A(i10)));
            }
            g gVar = new g(0);
            while (byteBufferWrap.hasRemaining()) {
                int i13 = byteBufferWrap.getInt();
                ByteBuffer byteBufferSlice2 = byteBufferWrap.slice();
                byteBufferSlice2.limit(i13);
                byteBufferWrap.position(byteBufferWrap.position() + i13);
                gVar.add(StandardCharsets.UTF_8.decode(byteBufferSlice2).toString());
            }
            if (gVar.f12992c == 1 && "__NULL__".equals(gVar.f12991b[0])) {
                return null;
            }
            return gVar;
        } catch (GeneralSecurityException e4) {
            throw new SecurityException("Could not decrypt value. " + e4.getMessage(), e4);
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        if (d(str)) {
            throw new SecurityException(l.q.j(str, " is a reserved key for the encryption keyset."));
        }
        return this.f2949a.contains(b(str));
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new a(this, this.f2949a.edit());
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : this.f2949a.getAll().entrySet()) {
            if (!d(entry.getKey())) {
                try {
                    String str = new String(this.f2953e.b(f.a(entry.getKey()), this.f2951c.getBytes()), StandardCharsets.UTF_8);
                    if (str.equals("__NULL__")) {
                        str = null;
                    }
                    map.put(str, c(str));
                } catch (GeneralSecurityException e4) {
                    throw new SecurityException("Could not decrypt key. " + e4.getMessage(), e4);
                }
            }
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z10) {
        Object objC = c(str);
        return objC instanceof Boolean ? ((Boolean) objC).booleanValue() : z10;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f10) {
        Object objC = c(str);
        return objC instanceof Float ? ((Float) objC).floatValue() : f10;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i10) {
        Object objC = c(str);
        return objC instanceof Integer ? ((Integer) objC).intValue() : i10;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j10) {
        Object objC = c(str);
        return objC instanceof Long ? ((Long) objC).longValue() : j10;
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        Object objC = c(str);
        return objC instanceof String ? (String) objC : str2;
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        Object objC = c(str);
        Set gVar = objC instanceof Set ? (Set) objC : new g();
        return gVar.size() > 0 ? gVar : set;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f2950b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f2950b.remove(onSharedPreferenceChangeListener);
    }
}
