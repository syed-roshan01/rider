package e8;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class g1 extends i1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h1 f5262e;

    public g1(String str, x9.v vVar) {
        super(str, false, vVar);
        if (!(!str.endsWith("-bin"))) {
            throw new IllegalArgumentException(f6.a.c0("ASCII header is named %s.  Only binary headers may end with %s", str, "-bin"));
        }
        y3.e.J(vVar, "marshaller");
        this.f5262e = vVar;
    }

    @Override // e8.i1
    public final Object a(byte[] bArr) {
        Long lValueOf;
        String str = new String(bArr, q6.d.f13203a);
        switch (((x9.v) this.f5262e).f16473a) {
            case 0:
                return str;
            default:
                y3.e.G("empty timeout", str.length() > 0);
                y3.e.G("bad timeout format", str.length() <= 9);
                long j10 = Long.parseLong(str.substring(0, str.length() - 1));
                char cCharAt = str.charAt(str.length() - 1);
                if (cCharAt == 'H') {
                    lValueOf = Long.valueOf(TimeUnit.HOURS.toNanos(j10));
                } else if (cCharAt == 'M') {
                    lValueOf = Long.valueOf(TimeUnit.MINUTES.toNanos(j10));
                } else if (cCharAt == 'S') {
                    lValueOf = Long.valueOf(TimeUnit.SECONDS.toNanos(j10));
                } else if (cCharAt == 'u') {
                    lValueOf = Long.valueOf(TimeUnit.MICROSECONDS.toNanos(j10));
                } else if (cCharAt == 'm') {
                    lValueOf = Long.valueOf(TimeUnit.MILLISECONDS.toNanos(j10));
                } else {
                    if (cCharAt != 'n') {
                        throw new IllegalArgumentException(String.format("Invalid timeout unit: %s", Character.valueOf(cCharAt)));
                    }
                    lValueOf = Long.valueOf(j10);
                }
                return lValueOf;
        }
    }

    @Override // e8.i1
    public final byte[] b(Serializable serializable) {
        String str;
        switch (((x9.v) this.f5262e).f16473a) {
            case 0:
                str = (String) serializable;
                break;
            default:
                Long l10 = (Long) serializable;
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                if (l10.longValue() < 0) {
                    throw new IllegalArgumentException("Timeout too small");
                }
                if (l10.longValue() < 100000000) {
                    str = l10 + "n";
                } else if (l10.longValue() < 100000000000L) {
                    str = timeUnit.toMicros(l10.longValue()) + "u";
                } else if (l10.longValue() < 100000000000000L) {
                    str = timeUnit.toMillis(l10.longValue()) + "m";
                } else if (l10.longValue() >= 100000000000000000L) {
                    str = l10.longValue() >= 6000000000000000000L ? timeUnit.toHours(l10.longValue()) + "H" : timeUnit.toMinutes(l10.longValue()) + "M";
                } else {
                    str = timeUnit.toSeconds(l10.longValue()) + "S";
                }
                break;
                break;
        }
        y3.e.J(str, "null marshaller.toAsciiString()");
        return str.getBytes(q6.d.f13203a);
    }
}
