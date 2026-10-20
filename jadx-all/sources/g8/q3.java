package g8;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class q3 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v6.d f7054g = new v6.d(8, "io.grpc.internal.ManagedChannelServiceConfig.MethodInfo", (Serializable) null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f7055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f7056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f7057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f7058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i5 f7059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u1 f7060f;

    public q3(Map map, boolean z10, int i10, int i11) {
        i5 i5Var;
        u1 u1Var;
        this.f7055a = m2.i("timeout", map);
        this.f7056b = m2.b("waitForReady", map);
        Integer numF = m2.f("maxResponseMessageBytes", map);
        this.f7057c = numF;
        if (numF != null) {
            y3.e.E(numF, "maxInboundMessageSize %s exceeds bounds", numF.intValue() >= 0);
        }
        Integer numF2 = m2.f("maxRequestMessageBytes", map);
        this.f7058d = numF2;
        if (numF2 != null) {
            y3.e.E(numF2, "maxOutboundMessageSize %s exceeds bounds", numF2.intValue() >= 0);
        }
        Map mapG = z10 ? m2.g("retryPolicy", map) : null;
        if (mapG == null) {
            i5Var = null;
        } else {
            Integer numF3 = m2.f("maxAttempts", mapG);
            y3.e.J(numF3, "maxAttempts cannot be empty");
            int iIntValue = numF3.intValue();
            y3.e.F("maxAttempts must be greater than 1: %s", iIntValue, iIntValue >= 2);
            int iMin = Math.min(iIntValue, i10);
            Long lI = m2.i("initialBackoff", mapG);
            y3.e.J(lI, "initialBackoff cannot be empty");
            long jLongValue = lI.longValue();
            y3.e.D(jLongValue, "initialBackoffNanos must be greater than 0: %s", jLongValue > 0);
            Long lI2 = m2.i("maxBackoff", mapG);
            y3.e.J(lI2, "maxBackoff cannot be empty");
            long jLongValue2 = lI2.longValue();
            y3.e.D(jLongValue2, "maxBackoff must be greater than 0: %s", jLongValue2 > 0);
            Double dE = m2.e("backoffMultiplier", mapG);
            y3.e.J(dE, "backoffMultiplier cannot be empty");
            double dDoubleValue = dE.doubleValue();
            y3.e.E(Double.valueOf(dDoubleValue), "backoffMultiplier must be greater than 0: %s", dDoubleValue > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            Long lI3 = m2.i("perAttemptRecvTimeout", mapG);
            y3.e.E(lI3, "perAttemptRecvTimeout cannot be negative: %s", lI3 == null || lI3.longValue() >= 0);
            Set setT = l.t("retryableStatusCodes", mapG);
            y3.e.J0("retryableStatusCodes", "%s is required in retry policy", setT != null);
            y3.e.J0("retryableStatusCodes", "%s must not contain OK", !setT.contains(e8.z1.OK));
            y3.e.G("retryableStatusCodes cannot be empty without perAttemptRecvTimeout", (lI3 == null && setT.isEmpty()) ? false : true);
            i5Var = new i5(iMin, jLongValue, jLongValue2, dDoubleValue, lI3, setT);
        }
        this.f7059e = i5Var;
        Map mapG2 = z10 ? m2.g("hedgingPolicy", map) : null;
        if (mapG2 == null) {
            u1Var = null;
        } else {
            Integer numF4 = m2.f("maxAttempts", mapG2);
            y3.e.J(numF4, "maxAttempts cannot be empty");
            int iIntValue2 = numF4.intValue();
            y3.e.F("maxAttempts must be greater than 1: %s", iIntValue2, iIntValue2 >= 2);
            int iMin2 = Math.min(iIntValue2, i11);
            Long lI4 = m2.i("hedgingDelay", mapG2);
            y3.e.J(lI4, "hedgingDelay cannot be empty");
            long jLongValue3 = lI4.longValue();
            y3.e.D(jLongValue3, "hedgingDelay must not be negative: %s", jLongValue3 >= 0);
            Set setT2 = l.t("nonFatalStatusCodes", mapG2);
            if (setT2 == null) {
                setT2 = Collections.unmodifiableSet(EnumSet.noneOf(e8.z1.class));
            } else {
                y3.e.J0("nonFatalStatusCodes", "%s must not contain OK", !setT2.contains(e8.z1.OK));
            }
            u1Var = new u1(iMin2, jLongValue3, setT2);
        }
        this.f7060f = u1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q3)) {
            return false;
        }
        q3 q3Var = (q3) obj;
        return y3.e.f0(this.f7055a, q3Var.f7055a) && y3.e.f0(this.f7056b, q3Var.f7056b) && y3.e.f0(this.f7057c, q3Var.f7057c) && y3.e.f0(this.f7058d, q3Var.f7058d) && y3.e.f0(this.f7059e, q3Var.f7059e) && y3.e.f0(this.f7060f, q3Var.f7060f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7055a, this.f7056b, this.f7057c, this.f7058d, this.f7059e, this.f7060f});
    }

    public final String toString() {
        q6.g gVarJ0 = f6.a.j0(this);
        gVarJ0.a(this.f7055a, "timeoutNanos");
        gVarJ0.a(this.f7056b, "waitForReady");
        gVarJ0.a(this.f7057c, "maxInboundMessageSize");
        gVarJ0.a(this.f7058d, "maxOutboundMessageSize");
        gVarJ0.a(this.f7059e, "retryPolicy");
        gVarJ0.a(this.f7060f, "hedgingPolicy");
        return gVarJ0.toString();
    }
}
