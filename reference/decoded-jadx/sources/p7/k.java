package p7;

import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.remoteconfig.internal.Code;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import o7.i2;
import u.k1;

/* JADX INFO: loaded from: classes.dex */
public final class k extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12830a;

    public k(int i10) {
        this.f12830a = i10;
    }

    public static p f(v7.a aVar, int i10) {
        if (i10 == 0) {
            throw null;
        }
        int i11 = i10 - 1;
        if (i11 == 5) {
            return new t(aVar.i0());
        }
        if (i11 == 6) {
            return new t(new r7.k(aVar.i0()));
        }
        if (i11 == 7) {
            return new t(Boolean.valueOf(aVar.Q()));
        }
        if (i11 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(k1.e(i10)));
        }
        aVar.g0();
        return r.f12844a;
    }

    public static void g(p pVar, v7.b bVar) throws IOException {
        if (pVar == null || (pVar instanceof r)) {
            bVar.M();
            return;
        }
        boolean z10 = pVar instanceof t;
        if (z10) {
            if (!z10) {
                throw new IllegalStateException("Not a JSON Primitive: " + pVar);
            }
            t tVar = (t) pVar;
            Serializable serializable = tVar.f12846a;
            if (serializable instanceof Number) {
                bVar.d0(tVar.e());
                return;
            } else if (serializable instanceof Boolean) {
                bVar.f0(serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(tVar.g()));
                return;
            } else {
                bVar.e0(tVar.g());
                return;
            }
        }
        boolean z11 = pVar instanceof o;
        if (z11) {
            bVar.b();
            if (!z11) {
                throw new IllegalStateException("Not a JSON Array: " + pVar);
            }
            Iterator it = ((o) pVar).f12843a.iterator();
            while (it.hasNext()) {
                g((p) it.next(), bVar);
            }
            bVar.g();
            return;
        }
        boolean z12 = pVar instanceof s;
        if (!z12) {
            throw new IllegalArgumentException("Couldn't write " + pVar.getClass());
        }
        bVar.e();
        if (!z12) {
            throw new IllegalStateException("Not a JSON Object: " + pVar);
        }
        Iterator it2 = ((r7.m) ((s) pVar).f12845a.entrySet()).iterator();
        while (((r7.n) it2).hasNext()) {
            Map.Entry entry = (Map.Entry) ((r7.l) it2).next();
            bVar.q((String) entry.getKey());
            g((p) entry.getValue(), bVar);
        }
        bVar.p();
    }

    @Override // p7.a0
    public final Object b(v7.a aVar) throws IOException {
        p oVar;
        p oVar2;
        switch (this.f12830a) {
            case 0:
                return e(aVar);
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.M()) {
                    try {
                        arrayList.add(Integer.valueOf(aVar.c0()));
                    } catch (NumberFormatException e4) {
                        throw new q(e4);
                    }
                }
                aVar.g();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i10 = 0; i10 < size; i10++) {
                    atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
                }
                return atomicIntegerArray;
            case 2:
                return e(aVar);
            case 3:
                return e(aVar);
            case 4:
                return e(aVar);
            case 5:
                if (aVar.k0() == 9) {
                    aVar.g0();
                    return null;
                }
                String strI0 = aVar.i0();
                if (strI0.length() == 1) {
                    return Character.valueOf(strI0.charAt(0));
                }
                StringBuilder sbR = a7.a.r("Expecting character, got: ", strI0, "; at ");
                sbR.append(aVar.u(true));
                throw new q(sbR.toString());
            case 6:
                int iK0 = aVar.k0();
                if (iK0 != 9) {
                    return iK0 == 8 ? Boolean.toString(aVar.Q()) : aVar.i0();
                }
                aVar.g0();
                return null;
            case 7:
                if (aVar.k0() == 9) {
                    aVar.g0();
                    return null;
                }
                String strI1 = aVar.i0();
                try {
                    return new BigDecimal(strI1);
                } catch (NumberFormatException e10) {
                    StringBuilder sbR2 = a7.a.r("Failed parsing '", strI1, "' as BigDecimal; at path ");
                    sbR2.append(aVar.u(true));
                    throw new q(sbR2.toString(), e10);
                }
            case 8:
                if (aVar.k0() == 9) {
                    aVar.g0();
                    return null;
                }
                String strI2 = aVar.i0();
                try {
                    return new BigInteger(strI2);
                } catch (NumberFormatException e11) {
                    StringBuilder sbR3 = a7.a.r("Failed parsing '", strI2, "' as BigInteger; at path ");
                    sbR3.append(aVar.u(true));
                    throw new q(sbR3.toString(), e11);
                }
            case 9:
                if (aVar.k0() != 9) {
                    return new r7.k(aVar.i0());
                }
                aVar.g0();
                return null;
            case 10:
                if (aVar.k0() != 9) {
                    return new StringBuilder(aVar.i0());
                }
                aVar.g0();
                return null;
            case 11:
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            case 12:
                if (aVar.k0() != 9) {
                    return new StringBuffer(aVar.i0());
                }
                aVar.g0();
                return null;
            case 13:
                if (aVar.k0() == 9) {
                    aVar.g0();
                    return null;
                }
                String strI3 = aVar.i0();
                if ("null".equals(strI3)) {
                    return null;
                }
                return new URL(strI3);
            case Code.UNAVAILABLE /* 14 */:
                if (aVar.k0() == 9) {
                    aVar.g0();
                    return null;
                }
                try {
                    String strI4 = aVar.i0();
                    if ("null".equals(strI4)) {
                        return null;
                    }
                    return new URI(strI4);
                } catch (URISyntaxException e12) {
                    throw new q(e12);
                }
            case 15:
                if (aVar.k0() != 9) {
                    return InetAddress.getByName(aVar.i0());
                }
                aVar.g0();
                return null;
            case Code.UNAUTHENTICATED /* 16 */:
                if (aVar.k0() == 9) {
                    aVar.g0();
                    return null;
                }
                String strI5 = aVar.i0();
                try {
                    return UUID.fromString(strI5);
                } catch (IllegalArgumentException e13) {
                    StringBuilder sbR4 = a7.a.r("Failed parsing '", strI5, "' as UUID; at path ");
                    sbR4.append(aVar.u(true));
                    throw new q(sbR4.toString(), e13);
                }
            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                String strI6 = aVar.i0();
                try {
                    return Currency.getInstance(strI6);
                } catch (IllegalArgumentException e14) {
                    StringBuilder sbR5 = a7.a.r("Failed parsing '", strI6, "' as Currency; at path ");
                    sbR5.append(aVar.u(true));
                    throw new q(sbR5.toString(), e14);
                }
            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                if (aVar.k0() == 9) {
                    aVar.g0();
                    return null;
                }
                aVar.b();
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                while (aVar.k0() != 4) {
                    String strE0 = aVar.e0();
                    int iC0 = aVar.c0();
                    if ("year".equals(strE0)) {
                        i11 = iC0;
                    } else if ("month".equals(strE0)) {
                        i12 = iC0;
                    } else if ("dayOfMonth".equals(strE0)) {
                        i13 = iC0;
                    } else if ("hourOfDay".equals(strE0)) {
                        i14 = iC0;
                    } else if ("minute".equals(strE0)) {
                        i15 = iC0;
                    } else if ("second".equals(strE0)) {
                        i16 = iC0;
                    }
                }
                aVar.p();
                return new GregorianCalendar(i11, i12, i13, i14, i15, i16);
            case 19:
                if (aVar.k0() == 9) {
                    aVar.g0();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(aVar.i0(), "_");
                String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                if (strNextToken2 == null && strNextToken3 == null) {
                    return new Locale(strNextToken);
                }
                return strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
            case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
                int iK1 = aVar.k0();
                if (iK1 == 0) {
                    throw null;
                }
                int i17 = iK1 - 1;
                if (i17 == 0) {
                    aVar.a();
                    oVar = new o();
                } else if (i17 != 2) {
                    oVar = null;
                } else {
                    aVar.b();
                    oVar = new s();
                }
                if (oVar == null) {
                    return f(aVar, iK1);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                while (true) {
                    if (aVar.M()) {
                        String strE1 = oVar instanceof s ? aVar.e0() : null;
                        int iK2 = aVar.k0();
                        if (iK2 == 0) {
                            throw null;
                        }
                        int i18 = iK2 - 1;
                        if (i18 == 0) {
                            aVar.a();
                            oVar2 = new o();
                        } else if (i18 != 2) {
                            oVar2 = null;
                        } else {
                            aVar.b();
                            oVar2 = new s();
                        }
                        boolean z10 = oVar2 != null;
                        if (oVar2 == null) {
                            oVar2 = f(aVar, iK2);
                        }
                        if (oVar instanceof o) {
                            ((o) oVar).f12843a.add(oVar2);
                        } else {
                            ((s) oVar).f12845a.put(strE1, oVar2);
                        }
                        if (z10) {
                            arrayDeque.addLast(oVar);
                            oVar = oVar2;
                        }
                    } else {
                        if (oVar instanceof o) {
                            aVar.g();
                        } else {
                            aVar.p();
                        }
                        if (arrayDeque.isEmpty()) {
                            return oVar;
                        }
                        oVar = (p) arrayDeque.removeLast();
                    }
                }
                break;
            case 21:
                BitSet bitSet = new BitSet();
                aVar.a();
                int iK3 = aVar.k0();
                int i19 = 0;
                while (iK3 != 2) {
                    int iE = t.k.e(iK3);
                    if (iE == 5 || iE == 6) {
                        int iC1 = aVar.c0();
                        if (iC1 != 0) {
                            if (iC1 != 1) {
                                StringBuilder sbQ = a7.a.q("Invalid bitset value ", iC1, ", expected 0 or 1; at path ");
                                sbQ.append(aVar.u(true));
                                throw new q(sbQ.toString());
                            }
                            bitSet.set(i19);
                        } else {
                            continue;
                        }
                    } else {
                        if (iE != 7) {
                            throw new q("Invalid bitset value type: " + k1.e(iK3) + "; at path " + aVar.u(false));
                        }
                        if (aVar.Q()) {
                            bitSet.set(i19);
                        }
                    }
                    i19++;
                    iK3 = aVar.k0();
                }
                aVar.g();
                return bitSet;
            case 22:
                return d(aVar);
            case 23:
                return d(aVar);
            case 24:
                return e(aVar);
            case FirestoreIndexValueWriter.INDEX_TYPE_STRING /* 25 */:
                return e(aVar);
            case 26:
                return e(aVar);
            case 27:
                try {
                    return new AtomicInteger(aVar.c0());
                } catch (NumberFormatException e15) {
                    throw new q(e15);
                }
            default:
                return new AtomicBoolean(aVar.Q());
        }
    }

    @Override // p7.a0
    public final void c(v7.b bVar, Object obj) {
        int i10 = this.f12830a;
        int i11 = 0;
        switch (i10) {
            case 0:
                h(bVar, (Number) obj);
                return;
            case 1:
                AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
                bVar.b();
                int length = atomicIntegerArray.length();
                while (i11 < length) {
                    bVar.T(atomicIntegerArray.get(i11));
                    i11++;
                }
                bVar.g();
                return;
            case 2:
                h(bVar, (Number) obj);
                return;
            case 3:
                h(bVar, (Number) obj);
                return;
            case 4:
                h(bVar, (Number) obj);
                return;
            case 5:
                Character ch = (Character) obj;
                bVar.e0(ch != null ? String.valueOf(ch) : null);
                return;
            case 6:
                bVar.e0((String) obj);
                return;
            case 7:
                bVar.d0((BigDecimal) obj);
                return;
            case 8:
                bVar.d0((BigInteger) obj);
                return;
            case 9:
                bVar.d0((r7.k) obj);
                return;
            case 10:
                StringBuilder sb = (StringBuilder) obj;
                bVar.e0(sb != null ? sb.toString() : null);
                return;
            case 11:
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?");
            case 12:
                StringBuffer stringBuffer = (StringBuffer) obj;
                bVar.e0(stringBuffer != null ? stringBuffer.toString() : null);
                return;
            case 13:
                URL url = (URL) obj;
                bVar.e0(url != null ? url.toExternalForm() : null);
                return;
            case Code.UNAVAILABLE /* 14 */:
                URI uri = (URI) obj;
                bVar.e0(uri != null ? uri.toASCIIString() : null);
                return;
            case 15:
                InetAddress inetAddress = (InetAddress) obj;
                bVar.e0(inetAddress != null ? inetAddress.getHostAddress() : null);
                return;
            case Code.UNAUTHENTICATED /* 16 */:
                UUID uuid = (UUID) obj;
                bVar.e0(uuid != null ? uuid.toString() : null);
                return;
            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                bVar.e0(((Currency) obj).getCurrencyCode());
                return;
            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                Calendar calendar = (Calendar) obj;
                if (calendar == null) {
                    bVar.M();
                    return;
                }
                bVar.e();
                bVar.q("year");
                bVar.T(calendar.get(1));
                bVar.q("month");
                bVar.T(calendar.get(2));
                bVar.q("dayOfMonth");
                bVar.T(calendar.get(5));
                bVar.q("hourOfDay");
                bVar.T(calendar.get(11));
                bVar.q("minute");
                bVar.T(calendar.get(12));
                bVar.q("second");
                bVar.T(calendar.get(13));
                bVar.p();
                return;
            case 19:
                Locale locale = (Locale) obj;
                bVar.e0(locale != null ? locale.toString() : null);
                return;
            case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
                g((p) obj, bVar);
                return;
            case 21:
                BitSet bitSet = (BitSet) obj;
                bVar.b();
                int length2 = bitSet.length();
                while (i11 < length2) {
                    bVar.T(bitSet.get(i11) ? 1L : 0L);
                    i11++;
                }
                bVar.g();
                return;
            case 22:
                Boolean bool = (Boolean) obj;
                switch (i10) {
                    case 22:
                        bVar.c0(bool);
                        return;
                    default:
                        bVar.e0(bool != null ? bool.toString() : "null");
                        return;
                }
            case 23:
                Boolean bool2 = (Boolean) obj;
                switch (i10) {
                    case 22:
                        bVar.c0(bool2);
                        return;
                    default:
                        bVar.e0(bool2 != null ? bool2.toString() : "null");
                        return;
                }
            case 24:
                h(bVar, (Number) obj);
                return;
            case FirestoreIndexValueWriter.INDEX_TYPE_STRING /* 25 */:
                h(bVar, (Number) obj);
                return;
            case 26:
                h(bVar, (Number) obj);
                return;
            case 27:
                bVar.T(((AtomicInteger) obj).get());
                return;
            default:
                bVar.f0(((AtomicBoolean) obj).get());
                return;
        }
    }

    public final Boolean d(v7.a aVar) throws IOException {
        switch (this.f12830a) {
            case 22:
                int iK0 = aVar.k0();
                if (iK0 != 9) {
                    return iK0 == 6 ? Boolean.valueOf(Boolean.parseBoolean(aVar.i0())) : Boolean.valueOf(aVar.Q());
                }
                aVar.g0();
                return null;
            default:
                if (aVar.k0() != 9) {
                    return Boolean.valueOf(aVar.i0());
                }
                aVar.g0();
                return null;
        }
    }

    public final Number e(v7.a aVar) throws IOException {
        switch (this.f12830a) {
            case 0:
                if (aVar.k0() != 9) {
                    return Long.valueOf(aVar.d0());
                }
                aVar.g0();
                return null;
            case 2:
                if (aVar.k0() == 9) {
                    aVar.g0();
                    return null;
                }
                try {
                    return Long.valueOf(aVar.d0());
                } catch (NumberFormatException e4) {
                    throw new q(e4);
                }
            case 3:
                if (aVar.k0() != 9) {
                    return Float.valueOf((float) aVar.T());
                }
                aVar.g0();
                return null;
            case 4:
                if (aVar.k0() != 9) {
                    return Double.valueOf(aVar.T());
                }
                aVar.g0();
                return null;
            case 24:
                if (aVar.k0() == 9) {
                    aVar.g0();
                    return null;
                }
                try {
                    int iC0 = aVar.c0();
                    if (iC0 <= 255 && iC0 >= -128) {
                        return Byte.valueOf((byte) iC0);
                    }
                    StringBuilder sbQ = a7.a.q("Lossy conversion from ", iC0, " to byte; at path ");
                    sbQ.append(aVar.u(true));
                    throw new q(sbQ.toString());
                } catch (NumberFormatException e10) {
                    throw new q(e10);
                }
            case FirestoreIndexValueWriter.INDEX_TYPE_STRING /* 25 */:
                if (aVar.k0() == 9) {
                    aVar.g0();
                    return null;
                }
                try {
                    int iC1 = aVar.c0();
                    if (iC1 <= 65535 && iC1 >= -32768) {
                        return Short.valueOf((short) iC1);
                    }
                    StringBuilder sbQ2 = a7.a.q("Lossy conversion from ", iC1, " to short; at path ");
                    sbQ2.append(aVar.u(true));
                    throw new q(sbQ2.toString());
                } catch (NumberFormatException e11) {
                    throw new q(e11);
                }
            default:
                if (aVar.k0() == 9) {
                    aVar.g0();
                    return null;
                }
                try {
                    return Integer.valueOf(aVar.c0());
                } catch (NumberFormatException e12) {
                    throw new q(e12);
                }
        }
    }

    public final void h(v7.b bVar, Number number) throws IOException {
        switch (this.f12830a) {
            case 0:
                if (number != null) {
                    bVar.e0(number.toString());
                } else {
                    bVar.M();
                }
                break;
            case 2:
                if (number != null) {
                    bVar.T(number.longValue());
                } else {
                    bVar.M();
                }
                break;
            case 3:
                if (number != null) {
                    if (!(number instanceof Float)) {
                        number = Float.valueOf(number.floatValue());
                    }
                    bVar.d0(number);
                } else {
                    bVar.M();
                }
                break;
            case 4:
                if (number != null) {
                    bVar.Q(number.doubleValue());
                } else {
                    bVar.M();
                }
                break;
            case 24:
                if (number != null) {
                    bVar.T(number.byteValue());
                } else {
                    bVar.M();
                }
                break;
            case FirestoreIndexValueWriter.INDEX_TYPE_STRING /* 25 */:
                if (number != null) {
                    bVar.T(number.shortValue());
                } else {
                    bVar.M();
                }
                break;
            default:
                if (number != null) {
                    bVar.T(number.intValue());
                } else {
                    bVar.M();
                }
                break;
        }
    }
}
