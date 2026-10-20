package l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.proto.AtProtobuf;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class q {
    public static /* synthetic */ String A(int i10) {
        if (i10 == 1) {
            return "FOUND";
        }
        if (i10 != 2) {
            return i10 != 3 ? "null" : "RESULT_NOT_SET";
        }
        return "MISSING";
    }

    public static /* synthetic */ String B(int i10) {
        if (i10 == 1) {
            return "Measuring";
        }
        if (i10 == 2) {
            return "LookaheadMeasuring";
        }
        if (i10 == 3) {
            return "LayingOut";
        }
        if (i10 != 4) {
            return i10 != 5 ? "null" : "Idle";
        }
        return "LookaheadLayingOut";
    }

    public static int a(float f10, int i10, int i11) {
        return (Float.hashCode(f10) + i10) * i11;
    }

    public static int b(long j10, int i10, int i11) {
        return (Long.hashCode(j10) + i10) * i11;
    }

    public static int c(boolean z10, int i10, int i11) {
        return (Boolean.hashCode(z10) + i10) * i11;
    }

    public static long d(y0.l lVar, float f10, m0.q qVar, int i10) {
        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(lVar, f10), qVar);
        return o1.s.N(i10);
    }

    public static FieldDescriptor e(int i10, FieldDescriptor.Builder builder) {
        return builder.withProperty(AtProtobuf.builder().tag(i10).build()).build();
    }

    public static Object f(m0.q qVar, boolean z10, int i10) {
        qVar.t(z10);
        qVar.Z(i10);
        return qVar.P();
    }

    public static String g(String str, int i10) {
        return str + i10;
    }

    public static String h(String str, int i10, String str2) {
        return str + i10 + str2;
    }

    public static String i(String str, int i10, String str2, int i11) {
        return str + i10 + str2 + i11;
    }

    public static String j(String str, String str2) {
        return str + str2;
    }

    public static String k(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String l(StringBuilder sb, float f10, char c10) {
        sb.append(f10);
        sb.append(c10);
        return sb.toString();
    }

    public static String m(StringBuilder sb, int i10, String str, String str2, String str3) {
        sb.append(i10);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static StringBuilder n(String str, String str2) {
        d7.a.l(str, str2);
        return new StringBuilder();
    }

    public static /* synthetic */ Iterator o() {
        try {
            return Arrays.asList(new n9.b()).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static void p(int i10, int i11, int i12, int i13, int i14) {
        androidx.compose.ui.input.key.a.a(i10);
        androidx.compose.ui.input.key.a.a(i11);
        androidx.compose.ui.input.key.a.a(i12);
        androidx.compose.ui.input.key.a.a(i13);
        androidx.compose.ui.input.key.a.a(i14);
    }

    public static void q(int i10, c9.e eVar, m0.q qVar, boolean z10, boolean z11) {
        eVar.invoke(qVar, Integer.valueOf(i10));
        qVar.t(z10);
        qVar.t(z11);
    }

    public static void r(int i10, m0.q qVar, int i11, t1.i iVar) {
        qVar.l0(Integer.valueOf(i10));
        qVar.c(Integer.valueOf(i11), iVar);
    }

    public static void s(int i10, u0.b bVar, m0.l2 l2Var, m0.q qVar, int i11) {
        bVar.e(l2Var, qVar, Integer.valueOf(i10));
        qVar.Z(i11);
    }

    public static void t(StringBuilder sb, int i10, String str, String str2, String str3) {
        sb.append(i10);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void u(m0.q qVar, u0.b bVar, m0.q qVar2, Integer num, int i10) {
        bVar.e(new m0.l2(qVar), qVar2, num);
        qVar.Z(i10);
    }

    public static void v(m0.q qVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        qVar.t(z10);
        qVar.t(z11);
        qVar.t(z12);
        qVar.t(z13);
    }

    public static /* synthetic */ void w(y0.m mVar) {
        throw new ClassCastException();
    }

    public static String x(String str, String str2) {
        return str + str2;
    }

    public static /* synthetic */ Iterator y() {
        try {
            return Arrays.asList(new n9.a()).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static /* synthetic */ String z(int i10) {
        if (i10 == 1) {
            return "OK";
        }
        if (i10 == 2) {
            return "TRANSIENT_ERROR";
        }
        if (i10 != 3) {
            return i10 != 4 ? "null" : "INVALID_PAYLOAD";
        }
        return "FATAL_ERROR";
    }
}
