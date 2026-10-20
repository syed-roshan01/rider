package a7;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.d0;
import com.google.android.gms.internal.p001firebaseauthapi.zzxr;
import com.google.android.recaptcha.internal.zzhh;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.protobuf.v;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import l.q;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ String A(int i10) {
        switch (i10) {
            case 1:
                return "STRING";
            case 2:
                return "STRING_SET";
            case 3:
                return "INT";
            case 4:
                return "LONG";
            case 5:
                return "FLOAT";
            case 6:
                return "BOOLEAN";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String B(int i10) {
        return i10 != 1 ? "null" : "AES256_GCM";
    }

    public static /* synthetic */ String C(int i10) {
        switch (i10) {
            case 1:
                return "HEADER";
            case 2:
                return "HEADER_EXTRA_LEN";
            case 3:
                return "HEADER_EXTRA";
            case 4:
                return "HEADER_NAME";
            case 5:
                return "HEADER_COMMENT";
            case 6:
                return "HEADER_CRC";
            case 7:
                return "INITIALIZE_INFLATER";
            case 8:
                return "INFLATING";
            case 9:
                return "INFLATER_NEEDS_INPUT";
            case 10:
                return "TRAILER";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String D(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? "null" : "BODY";
        }
        return "HEADER";
    }

    public static /* synthetic */ String E(int i10) {
        if (i10 == 1) {
            return "CROSSED";
        }
        if (i10 != 2) {
            return i10 != 3 ? "null" : "COLLAPSED";
        }
        return "NOT_CROSSED";
    }

    public static /* synthetic */ String F(int i10) {
        if (i10 == 1) {
            return "Left";
        }
        if (i10 != 2) {
            return i10 != 3 ? "null" : "Right";
        }
        return "Middle";
    }

    public static /* synthetic */ String G(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? "null" : "PLAINTEXT";
        }
        return "TLS";
    }

    public static /* synthetic */ String H(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? "null" : "OUTBOUND";
        }
        return "INBOUND";
    }

    public static final void a(int i10, View view) {
        if (i10 == 0) {
            throw null;
        }
        int i11 = i10 - 1;
        if (i11 == 0) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (i11 == 1) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            view.setVisibility(0);
            return;
        }
        if (i11 == 2) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (i11 != 3) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }

    public static /* synthetic */ boolean b(int i10) {
        return i10 != 1 ? f(i10) : e(i10);
    }

    public static int c(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == 4) {
            return 4;
        }
        if (i10 == 8) {
            return 3;
        }
        throw new IllegalArgumentException(q.g("Unknown visibility ", i10));
    }

    public static int d(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return c(view.getVisibility());
    }

    public static final boolean e(int i10) {
        return !b.f1325b.get();
    }

    public static final boolean f(int i10) {
        Boolean bool;
        if (b.f1325b.get()) {
            try {
                bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception unused) {
                b.f1324a.info("Conscrypt is not available or does not support checking for FIPS build.");
                bool = Boolean.FALSE;
            }
            if (!bool.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static int g(int i10, int i11, int i12) {
        return zzhh.zzy(i10) + i11 + i12;
    }

    public static int h(int i10, int i11, int i12, int i13) {
        return ((i10 * i11) / i12) + i13;
    }

    public static int i(String str, int i10, int i11) {
        return (str.hashCode() + i10) * i11;
    }

    public static zzxr j(Integer num, ByteBuffer byteBuffer) {
        return zzxr.zza(byteBuffer.putInt(num.intValue()).array());
    }

    public static Object k(ArrayList arrayList, int i10) {
        return arrayList.get(arrayList.size() - i10);
    }

    public static String l(String str, long j10) {
        return str + j10;
    }

    public static String m(String str, d0 d0Var, String str2) {
        return str + d0Var + str2;
    }

    public static String n(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String o(StringBuilder sb, int i10, char c10) {
        sb.append(i10);
        sb.append(c10);
        return sb.toString();
    }

    public static String p(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder q(String str, int i10, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i10);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder r(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static /* synthetic */ void s(Object obj) {
        throw new ClassCastException();
    }

    public static void t(String str, String str2, String str3) {
        Log.e(str3, str + str2);
    }

    public static int u(int i10, int i11, int i12) {
        return (Integer.hashCode(i10) + i11) * i12;
    }

    public static int v(int i10, int i11, int i12, int i13) {
        return p.K0(i10) + i11 + i12 + i13;
    }

    public static /* synthetic */ void w(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static int x(int i10, int i11, int i12, int i13) {
        return v.m0(i10) + i11 + i12 + i13;
    }

    public static /* synthetic */ String y(int i10) {
        if (i10 == 1) {
            return "NONE";
        }
        if (i10 != 2) {
            return i10 != 3 ? "null" : "REMOVING";
        }
        return "ADDING";
    }

    public static /* synthetic */ String z(int i10) {
        if (i10 == 1) {
            return "REMOVED";
        }
        if (i10 == 2) {
            return "VISIBLE";
        }
        if (i10 != 3) {
            return i10 != 4 ? "null" : "INVISIBLE";
        }
        return "GONE";
    }
}
