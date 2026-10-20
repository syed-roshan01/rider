package x9;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.graphics.Path;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import androidx.lifecycle.p0;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.protobuf.t0;
import com.ride.accepter.R;
import e1.g0;
import e1.l0;
import e8.h1;
import e8.k1;
import e8.r0;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.ProtocolException;
import java.net.ProxySelector;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.net.ssl.SSLSocket;
import o7.i2;
import t1.z0;
import u.i0;

/* JADX INFO: loaded from: classes.dex */
public class v implements h1, q6.m, k1, j7.k, t0, r7.q, h6.c, t3.a, y3.d, r1.l, z0, l0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static v f16468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static v f16469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static v f16470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Field f16471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f16472f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16473a;

    public /* synthetic */ v(int i10) {
        this.f16473a = i10;
    }

    public static boolean A(String str) {
        return (l9.i.K0("Connection", str) || l9.i.K0("Keep-Alive", str) || l9.i.K0("Proxy-Authenticate", str) || l9.i.K0("Proxy-Authorization", str) || l9.i.K0("TE", str) || l9.i.K0("Trailers", str) || l9.i.K0("Transfer-Encoding", str) || l9.i.K0("Upgrade", str)) ? false : true;
    }

    public static int D(int i10, int i11, int i12) throws IOException {
        if ((i11 & 8) != 0) {
            i10--;
        }
        if (i12 <= i10) {
            return i10 - i12;
        }
        throw new IOException(l.q.i("PROTOCOL_ERROR padding ", i12, " > remaining length ", i10));
    }

    public static ca.h F(String str) throws ProtocolException {
        int i10;
        String strSubstring;
        d7.a.m(str, "statusLine");
        boolean zH1 = l9.i.h1(str, "HTTP/1.", false);
        x xVar = x.HTTP_1_0;
        if (zH1) {
            i10 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                xVar = x.HTTP_1_1;
            }
        } else {
            if (!l9.i.h1(str, "ICY ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i10 = 4;
        }
        int i11 = i10 + 3;
        if (str.length() < i11) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            String strSubstring2 = str.substring(i10, i11);
            d7.a.l(strSubstring2, "this as java.lang.String\u2026ing(startIndex, endIndex)");
            int i12 = Integer.parseInt(strSubstring2);
            if (str.length() <= i11) {
                strSubstring = "";
            } else {
                if (str.charAt(i11) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i10 + 4);
                d7.a.l(strSubstring, "this as java.lang.String).substring(startIndex)");
            }
            return new ca.h(xVar, i12, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public static final b0 g(b0 b0Var) {
        int i10 = z9.a.f17336a;
        if ((b0Var != null ? b0Var.f16350n : null) == null) {
            return b0Var;
        }
        a0 a0VarE = b0Var.e();
        a0VarE.f16336g = null;
        return a0VarE.a();
    }

    public static b4.f l(b4.g gVar) {
        d7.a.m(gVar, "owner");
        return new b4.f(gVar);
    }

    public static Typeface m(String str, f2.l lVar, int i10) {
        if (f2.j.a(i10, 0) && d7.a.d(lVar, f2.l.f6115c) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), lVar.f6122a, f2.j.a(i10, 1));
    }

    public static Typeface n(String str, f2.l lVar, int i10) {
        if (f2.j.a(i10, 0) && d7.a.d(lVar, f2.l.f6115c) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iB = o1.s.B(lVar, i10);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iB) : Typeface.create(str, iB);
    }

    public static p0 o(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new p0();
            }
            HashMap map = new HashMap();
            for (String str : bundle2.keySet()) {
                d7.a.l(str, "key");
                map.put(str, bundle2.get(str));
            }
            return new p0(map);
        }
        ClassLoader classLoader = p0.class.getClassLoader();
        d7.a.j(classLoader);
        bundle.setClassLoader(classLoader);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state".toString());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = parcelableArrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = parcelableArrayList.get(i10);
            d7.a.k(obj, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put((String) obj, parcelableArrayList2.get(i10));
        }
        return new p0(linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void p(Activity activity, androidx.lifecycle.p pVar) {
        d7.a.m(activity, "activity");
        d7.a.m(pVar, "event");
        if (activity instanceof androidx.lifecycle.w) {
            androidx.lifecycle.r lifecycle = ((androidx.lifecycle.w) activity).getLifecycle();
            if (lifecycle instanceof androidx.lifecycle.y) {
                ((androidx.lifecycle.y) lifecycle).f(pVar);
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static e0 q(String str) {
        d7.a.m(str, "javaName");
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return e0.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return e0.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return e0.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return e0.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return e0.SSL_3_0;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    public static x r(String str) throws IOException {
        x xVar = x.HTTP_1_0;
        if (!d7.a.d(str, "http/1.0")) {
            xVar = x.HTTP_1_1;
            if (!d7.a.d(str, "http/1.1")) {
                xVar = x.H2_PRIOR_KNOWLEDGE;
                if (!d7.a.d(str, "h2_prior_knowledge")) {
                    xVar = x.HTTP_2;
                    if (!d7.a.d(str, "h2")) {
                        xVar = x.SPDY_3;
                        if (!d7.a.d(str, "spdy/3.1")) {
                            xVar = x.QUIC;
                            if (!d7.a.d(str, "quic")) {
                                throw new IOException("Unexpected protocol: ".concat(str));
                            }
                        }
                    }
                }
            }
        }
        return xVar;
    }

    public static Path w(float f10, float f11, float f12, float f13) {
        Path path = new Path();
        path.moveTo(f10, f11);
        path.lineTo(f12, f13);
        return path;
    }

    public static boolean x(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        int iMin;
        Object obj = i3.l.f7968j;
        if (editable == null || inputConnection == null || i10 < 0 || i11 < 0) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) {
            return false;
        }
        if (z10) {
            int iMax = Math.max(i10, 0);
            int length = editable.length();
            if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                loop0: while (true) {
                    boolean z11 = false;
                    while (true) {
                        if (iMax == 0) {
                            break loop0;
                        }
                        selectionStart--;
                        if (selectionStart < 0) {
                            if (!z11) {
                                selectionStart = 0;
                                break loop0;
                            }
                            break;
                        }
                        char cCharAt = editable.charAt(selectionStart);
                        if (z11) {
                            if (Character.isHighSurrogate(cCharAt)) {
                                iMax--;
                            }
                        } else if (!Character.isSurrogate(cCharAt)) {
                            iMax--;
                        } else if (!Character.isHighSurrogate(cCharAt)) {
                            z11 = true;
                        }
                        selectionStart = -1;
                        break;
                    }
                }
            }
            selectionStart = -1;
            break;
            int iMax2 = Math.max(i11, 0);
            iMin = editable.length();
            if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                loop2: while (true) {
                    boolean z12 = false;
                    while (true) {
                        if (iMax2 != 0) {
                            if (selectionEnd >= iMin) {
                                if (!z12) {
                                    break loop2;
                                }
                                break loop2;
                            }
                            char cCharAt2 = editable.charAt(selectionEnd);
                            if (z12) {
                                if (Character.isLowSurrogate(cCharAt2)) {
                                    iMax2--;
                                    selectionEnd++;
                                }
                            } else if (!Character.isSurrogate(cCharAt2)) {
                                iMax2--;
                                selectionEnd++;
                            } else if (!Character.isLowSurrogate(cCharAt2)) {
                                selectionEnd++;
                                z12 = true;
                            }
                            iMin = -1;
                            break loop2;
                        }
                        iMin = selectionEnd;
                        break loop2;
                    }
                }
            }
            iMin = -1;
            break loop2;
            if (selectionStart == -1 || iMin == -1) {
                return false;
            }
        } else {
            selectionStart = Math.max(selectionStart - i10, 0);
            iMin = Math.min(selectionEnd + i11, editable.length());
        }
        i3.e0[] e0VarArr = (i3.e0[]) editable.getSpans(selectionStart, iMin, i3.e0.class);
        if (e0VarArr == null || e0VarArr.length <= 0) {
            return false;
        }
        for (i3.e0 e0Var : e0VarArr) {
            int spanStart = editable.getSpanStart(e0Var);
            int spanEnd = editable.getSpanEnd(e0Var);
            selectionStart = Math.min(spanStart, selectionStart);
            iMin = Math.max(spanEnd, iMin);
        }
        int iMax3 = Math.max(selectionStart, 0);
        int iMin2 = Math.min(iMin, editable.length());
        inputConnection.beginBatchEdit();
        editable.delete(iMax3, iMin2);
        inputConnection.endBatchEdit();
        return true;
    }

    public static void y(Activity activity) {
        d7.a.m(activity, "activity");
        if (Build.VERSION.SDK_INT >= 29) {
            m0.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new m0());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new n0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public boolean B(Spannable spannable) {
        return false;
    }

    public boolean C() {
        switch (this.f16473a) {
            case 24:
                return fa.a.f6389e;
            case FirestoreIndexValueWriter.INDEX_TYPE_STRING /* 25 */:
                return fa.c.f6394f;
            case 26:
                return fa.d.f6398e;
            default:
                return fa.k.f6414e;
        }
    }

    public InputConnection E(InputConnection inputConnection, EditorInfo editorInfo) {
        return inputConnection;
    }

    public CharSequence G(Preference preference) {
        switch (this.f16473a) {
            case Code.UNAVAILABLE /* 14 */:
                EditTextPreference editTextPreference = (EditTextPreference) preference;
                editTextPreference.getClass();
                if (TextUtils.isEmpty(null)) {
                    return editTextPreference.f2217a.getString(R.string.not_set);
                }
                return null;
            default:
                ListPreference listPreference = (ListPreference) preference;
                listPreference.getClass();
                if (TextUtils.isEmpty(null)) {
                    return listPreference.f2217a.getString(R.string.not_set);
                }
                return null;
        }
    }

    public void H(boolean z10) {
    }

    public void I(boolean z10) {
    }

    public void J(View view, int i10) {
        if (!f16472f) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f16471e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f16472f = true;
        }
        Field field = f16471e;
        if (field != null) {
            try {
                f16471e.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public TransformationMethod K(TransformationMethod transformationMethod) {
        return transformationMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e8.k1
    public byte[] a(Serializable serializable) {
        switch (this.f16473a) {
            case 0:
                return (byte[]) serializable;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // e8.k1
    public Object b(byte[] bArr) {
        switch (this.f16473a) {
            case 0:
                return bArr;
            default:
                if (bArr.length < 3) {
                    throw new NumberFormatException("Malformed status code ".concat(new String(bArr, r0.f5355a)));
                }
                return Integer.valueOf((bArr[2] - 48) + ((bArr[1] - 48) * 10) + ((bArr[0] - 48) * 100));
        }
    }

    @Override // h6.c
    public int c(Context context, String str) {
        return this.f16473a;
    }

    @Override // e1.l0
    public g0 d(long j10, m2.l lVar, m2.b bVar) {
        switch (this.f16473a) {
            case 0:
                float fJ = bVar.J(i0.f14800a);
                return new e1.b0(new d1.d(0.0f, -fJ, d1.f.d(j10), d1.f.b(j10) + fJ));
            default:
                float fJ2 = bVar.J(i0.f14800a);
                return new e1.b0(new d1.d(-fJ2, 0.0f, d1.f.d(j10) + fJ2, d1.f.b(j10)));
        }
    }

    @Override // r7.q
    public Object e() {
        switch (this.f16473a) {
            case 27:
                return new TreeSet();
            case 28:
                return new LinkedHashSet();
            default:
                return new ArrayDeque();
        }
    }

    @Override // h6.c
    public int f(Context context, String str, boolean z10) {
        return 0;
    }

    @Override // q6.m
    public Object get() {
        switch (this.f16473a) {
            case 0:
                return new q6.l();
            default:
                return ProxySelector.getDefault();
        }
    }

    public fa.m h() {
        switch (this.f16473a) {
            case 24:
                if (C()) {
                    return new fa.a();
                }
                return null;
            case FirestoreIndexValueWriter.INDEX_TYPE_STRING /* 25 */:
                if (C()) {
                    return new fa.c();
                }
                return null;
            default:
                String property = System.getProperty("java.specification.version", "unknown");
                try {
                    d7.a.l(property, "jvmVersion");
                    if (Integer.parseInt(property) >= 9) {
                        return null;
                    }
                } catch (NumberFormatException unused) {
                }
                try {
                    Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                    Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                    Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                    Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                    Method method = cls.getMethod("put", SSLSocket.class, cls2);
                    Method method2 = cls.getMethod("get", SSLSocket.class);
                    Method method3 = cls.getMethod("remove", SSLSocket.class);
                    d7.a.l(method, "putMethod");
                    d7.a.l(method2, "getMethod");
                    d7.a.l(method3, "removeMethod");
                    d7.a.l(cls3, "clientProviderClass");
                    d7.a.l(cls4, "serverProviderClass");
                    return new fa.i(method, method2, method3, cls3, cls4);
                } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                    return null;
                }
        }
    }

    @Override // y3.d
    public void i() {
        switch (this.f16473a) {
            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    public long j(long j10, long j11) {
        switch (this.f16473a) {
            case 0:
                float fMax = Math.max(d1.f.d(j11) / d1.f.d(j10), d1.f.b(j11) / d1.f.b(j10));
                return androidx.compose.ui.layout.a.a(fMax, fMax);
            case 1:
            case 2:
            default:
                if (d1.f.d(j10) <= d1.f.d(j11) && d1.f.b(j10) <= d1.f.b(j11)) {
                    return androidx.compose.ui.layout.a.a(1.0f, 1.0f);
                }
                float fMin = Math.min(d1.f.d(j11) / d1.f.d(j10), d1.f.b(j11) / d1.f.b(j10));
                return androidx.compose.ui.layout.a.a(fMin, fMin);
            case 3:
                float fD = d1.f.d(j11) / d1.f.d(j10);
                return androidx.compose.ui.layout.a.a(fD, fD);
            case 4:
                float fMin2 = Math.min(d1.f.d(j11) / d1.f.d(j10), d1.f.b(j11) / d1.f.b(j10));
                return androidx.compose.ui.layout.a.a(fMin2, fMin2);
        }
    }

    @Override // y3.d
    public void k(int i10, Object obj) {
        String str;
        switch (this.f16473a) {
            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                break;
            default:
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
                break;
        }
    }

    public InputFilter[] s(InputFilter[] inputFilterArr) {
        return inputFilterArr;
    }

    public Object t(String str, Provider provider) {
        switch (this.f16473a) {
            case 9:
                return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
            case 10:
                return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
            case 11:
                return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
            case 12:
                return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
            case 13:
                return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
            case Code.UNAVAILABLE /* 14 */:
                return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
            default:
                return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
        }
    }

    public KeyListener u(KeyListener keyListener) {
        return keyListener;
    }

    public Logger v() {
        switch (this.f16473a) {
            case 7:
                return aa.f.f1352j;
            default:
                return ea.u.f5528f;
        }
    }

    public boolean z() {
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i10, int i11) {
        this(0);
        this.f16473a = i10;
        switch (i10) {
            case 1:
                this(1);
                break;
            case 2:
                this(2);
                break;
            case 3:
                this(3);
                break;
            case 4:
                this(4);
                break;
            case 5:
                this(5);
                break;
            case 6:
                this(6);
                break;
            case 7:
                this(7);
                break;
            case 8:
                this(8);
                break;
            case 9:
                this(9);
                break;
            case 10:
                this(10);
                break;
            case 11:
                this(11);
                break;
            case 12:
                this(12);
                break;
            case 13:
                this(13);
                break;
            case Code.UNAVAILABLE /* 14 */:
                this(14);
                break;
            case 15:
                this(15);
                break;
            case Code.UNAUTHENTICATED /* 16 */:
                this(16);
                break;
            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                this(17);
                break;
            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                this(18);
                break;
            case 19:
                this(19);
                break;
            case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
                this(20);
                break;
            case 21:
                this(21);
                break;
            case 22:
                this(22);
                break;
            case 23:
                this(23);
                break;
            case 24:
                this(24);
                break;
            case FirestoreIndexValueWriter.INDEX_TYPE_STRING /* 25 */:
                this(25);
                break;
            case 26:
                this(26);
                break;
            case 27:
                this(27);
                break;
            case 28:
                this(28);
                break;
            case 29:
                this(29);
                break;
            default:
                break;
        }
    }

    public /* synthetic */ v(int i10, Object obj) {
        this.f16473a = i10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(Object obj) {
        this(4);
        this.f16473a = 4;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v() {
        this(0);
        this.f16473a = 0;
    }
}
