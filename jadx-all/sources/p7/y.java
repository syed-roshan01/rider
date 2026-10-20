package p7;

import java.io.IOException;
import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public abstract class y implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f12847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v f12848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ y[] f12849c;

    static {
        u uVar = new u();
        f12847a = uVar;
        v vVar = new v();
        f12848b = vVar;
        f12849c = new y[]{uVar, vVar, new y() { // from class: p7.w
            @Override // p7.z
            public final Number a(v7.a aVar) throws IOException {
                String strI0 = aVar.i0();
                try {
                    return Long.valueOf(Long.parseLong(strI0));
                } catch (NumberFormatException unused) {
                    try {
                        Double dValueOf = Double.valueOf(strI0);
                        if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                            if (!aVar.f15938b) {
                                throw new v7.c("JSON forbids NaN and infinities: " + dValueOf + "; at path " + aVar.u(true));
                            }
                        }
                        return dValueOf;
                    } catch (NumberFormatException e4) {
                        StringBuilder sbR = a7.a.r("Cannot parse ", strI0, "; at path ");
                        sbR.append(aVar.u(true));
                        throw new androidx.fragment.app.a0(sbR.toString(), e4);
                    }
                }
            }
        }, new y() { // from class: p7.x
            @Override // p7.z
            public final Number a(v7.a aVar) throws IOException {
                String strI0 = aVar.i0();
                try {
                    return new BigDecimal(strI0);
                } catch (NumberFormatException e4) {
                    StringBuilder sbR = a7.a.r("Cannot parse ", strI0, "; at path ");
                    sbR.append(aVar.u(true));
                    throw new androidx.fragment.app.a0(sbR.toString(), e4);
                }
            }
        }};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f12849c.clone();
    }
}
