package com.google.firebase.firestore.model;

import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Util;
import com.google.protobuf.n;
import com.google.protobuf.p2;
import com.google.protobuf.q2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import l.q;
import o7.e;
import o7.f;
import o7.g2;
import o7.h2;
import o7.i0;
import o7.i2;
import o7.k0;
import x7.a;
import x7.b;

/* JADX INFO: loaded from: classes.dex */
public class Values {
    public static final i2 MAX_VALUE;
    private static final i2 MAX_VALUE_TYPE;
    public static final i2 MIN_VALUE;
    public static final i2 NAN_VALUE;
    public static final i2 NULL_VALUE;
    public static final int TYPE_ORDER_ARRAY = 9;
    public static final int TYPE_ORDER_BLOB = 6;
    public static final int TYPE_ORDER_BOOLEAN = 1;
    public static final int TYPE_ORDER_GEOPOINT = 8;
    public static final int TYPE_ORDER_MAP = 10;
    public static final int TYPE_ORDER_MAX_VALUE = Integer.MAX_VALUE;
    public static final int TYPE_ORDER_NULL = 0;
    public static final int TYPE_ORDER_NUMBER = 2;
    public static final int TYPE_ORDER_REFERENCE = 7;
    public static final int TYPE_ORDER_SERVER_TIMESTAMP = 4;
    public static final int TYPE_ORDER_STRING = 5;
    public static final int TYPE_ORDER_TIMESTAMP = 3;

    /* JADX INFO: renamed from: com.google.firebase.firestore.model.Values$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$firestore$v1$Value$ValueTypeCase;

        static {
            int[] iArr = new int[h2.values().length];
            $SwitchMap$com$google$firestore$v1$Value$ValueTypeCase = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$Value$ValueTypeCase[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$Value$ValueTypeCase[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$Value$ValueTypeCase[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$Value$ValueTypeCase[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$Value$ValueTypeCase[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$Value$ValueTypeCase[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$Value$ValueTypeCase[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$Value$ValueTypeCase[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$Value$ValueTypeCase[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$Value$ValueTypeCase[10] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    static {
        g2 g2VarC = i2.C();
        g2VarC.h(Double.NaN);
        NAN_VALUE = (i2) g2VarC.m3997build();
        g2 g2VarC2 = i2.C();
        g2VarC2.m();
        i2 i2Var = (i2) g2VarC2.m3997build();
        NULL_VALUE = i2Var;
        MIN_VALUE = i2Var;
        g2 g2VarC3 = i2.C();
        g2VarC3.o("__max__");
        i2 i2Var2 = (i2) g2VarC3.m3997build();
        MAX_VALUE_TYPE = i2Var2;
        g2 g2VarC4 = i2.C();
        i0 i0VarL = k0.l();
        i0VarL.e(i2Var2, "__type__");
        g2VarC4.k(i0VarL);
        MAX_VALUE = (i2) g2VarC4.m3997build();
    }

    private static boolean arrayEquals(i2 i2Var, i2 i2Var2) {
        e eVarQ = i2Var.q();
        e eVarQ2 = i2Var2.q();
        if (eVarQ.k() != eVarQ2.k()) {
            return false;
        }
        for (int i10 = 0; i10 < eVarQ.k(); i10++) {
            if (!equals(eVarQ.j(i10), eVarQ2.j(i10))) {
                return false;
            }
        }
        return true;
    }

    public static String canonicalId(i2 i2Var) {
        StringBuilder sb = new StringBuilder();
        canonifyValue(sb, i2Var);
        return sb.toString();
    }

    private static void canonifyArray(StringBuilder sb, e eVar) {
        sb.append("[");
        for (int i10 = 0; i10 < eVar.k(); i10++) {
            canonifyValue(sb, eVar.j(i10));
            if (i10 != eVar.k() - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
    }

    private static void canonifyGeoPoint(StringBuilder sb, b bVar) {
        sb.append(String.format("geo(%s,%s)", Double.valueOf(bVar.i()), Double.valueOf(bVar.j())));
    }

    private static void canonifyObject(StringBuilder sb, k0 k0Var) {
        ArrayList<String> arrayList = new ArrayList(k0Var.i().keySet());
        Collections.sort(arrayList);
        sb.append("{");
        boolean z10 = true;
        for (String str : arrayList) {
            if (z10) {
                z10 = false;
            } else {
                sb.append(",");
            }
            sb.append(str);
            sb.append(":");
            canonifyValue(sb, k0Var.k(str));
        }
        sb.append("}");
    }

    private static void canonifyReference(StringBuilder sb, i2 i2Var) {
        Assert.hardAssert(isReferenceValue(i2Var), "Value should be a ReferenceValue", new Object[0]);
        sb.append(DocumentKey.fromName(i2Var.y()));
    }

    private static void canonifyTimestamp(StringBuilder sb, q2 q2Var) {
        sb.append(String.format("time(%s,%s)", Long.valueOf(q2Var.j()), Integer.valueOf(q2Var.i())));
    }

    private static void canonifyValue(StringBuilder sb, i2 i2Var) {
        switch (i2Var.B().ordinal()) {
            case 0:
                sb.append("null");
                return;
            case 1:
                sb.append(i2Var.r());
                return;
            case 2:
                sb.append(i2Var.w());
                return;
            case 3:
                sb.append(i2Var.u());
                return;
            case 4:
                canonifyTimestamp(sb, i2Var.A());
                return;
            case 5:
                sb.append(i2Var.z());
                return;
            case 6:
                sb.append(Util.toDebugString(i2Var.s()));
                return;
            case 7:
                canonifyReference(sb, i2Var);
                return;
            case 8:
                canonifyGeoPoint(sb, i2Var.v());
                return;
            case 9:
                canonifyArray(sb, i2Var.q());
                return;
            case 10:
                canonifyObject(sb, i2Var.x());
                return;
            default:
                throw Assert.fail("Invalid value type: " + i2Var.B(), new Object[0]);
        }
    }

    public static int compare(i2 i2Var, i2 i2Var2) {
        int iTypeOrder = typeOrder(i2Var);
        int iTypeOrder2 = typeOrder(i2Var2);
        if (iTypeOrder != iTypeOrder2) {
            return Util.compareIntegers(iTypeOrder, iTypeOrder2);
        }
        if (iTypeOrder != Integer.MAX_VALUE) {
            switch (iTypeOrder) {
                case 0:
                    break;
                case 1:
                    return Util.compareBooleans(i2Var.r(), i2Var2.r());
                case 2:
                    return compareNumbers(i2Var, i2Var2);
                case 3:
                    return compareTimestamps(i2Var.A(), i2Var2.A());
                case 4:
                    return compareTimestamps(ServerTimestamps.getLocalWriteTime(i2Var), ServerTimestamps.getLocalWriteTime(i2Var2));
                case 5:
                    return i2Var.z().compareTo(i2Var2.z());
                case 6:
                    return Util.compareByteStrings(i2Var.s(), i2Var2.s());
                case 7:
                    return compareReferences(i2Var.y(), i2Var2.y());
                case 8:
                    return compareGeoPoints(i2Var.v(), i2Var2.v());
                case 9:
                    return compareArrays(i2Var.q(), i2Var2.q());
                case 10:
                    return compareMaps(i2Var.x(), i2Var2.x());
                default:
                    throw Assert.fail(q.g("Invalid value type: ", iTypeOrder), new Object[0]);
            }
        }
        return 0;
    }

    private static int compareArrays(e eVar, e eVar2) {
        int iMin = Math.min(eVar.k(), eVar2.k());
        for (int i10 = 0; i10 < iMin; i10++) {
            int iCompare = compare(eVar.j(i10), eVar2.j(i10));
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return Util.compareIntegers(eVar.k(), eVar2.k());
    }

    private static int compareGeoPoints(b bVar, b bVar2) {
        int iCompareDoubles = Util.compareDoubles(bVar.i(), bVar2.i());
        return iCompareDoubles == 0 ? Util.compareDoubles(bVar.j(), bVar2.j()) : iCompareDoubles;
    }

    private static int compareMaps(k0 k0Var, k0 k0Var2) {
        Iterator it = new TreeMap(k0Var.i()).entrySet().iterator();
        Iterator it2 = new TreeMap(k0Var2.i()).entrySet().iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Map.Entry entry2 = (Map.Entry) it2.next();
            int iCompareTo = ((String) entry.getKey()).compareTo((String) entry2.getKey());
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            int iCompare = compare((i2) entry.getValue(), (i2) entry2.getValue());
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return Util.compareBooleans(it.hasNext(), it2.hasNext());
    }

    private static int compareNumbers(i2 i2Var, i2 i2Var2) {
        h2 h2VarB = i2Var.B();
        h2 h2Var = h2.f12625d;
        h2 h2Var2 = h2.f12624c;
        if (h2VarB == h2Var) {
            double dU = i2Var.u();
            if (i2Var2.B() == h2Var) {
                return Util.compareDoubles(dU, i2Var2.u());
            }
            if (i2Var2.B() == h2Var2) {
                return Util.compareMixed(dU, i2Var2.w());
            }
        } else if (i2Var.B() == h2Var2) {
            long jW = i2Var.w();
            if (i2Var2.B() == h2Var2) {
                return Util.compareLongs(jW, i2Var2.w());
            }
            if (i2Var2.B() == h2Var) {
                return Util.compareMixed(i2Var2.u(), jW) * (-1);
            }
        }
        throw Assert.fail("Unexpected values: %s vs %s", i2Var, i2Var2);
    }

    private static int compareReferences(String str, String str2) {
        String[] strArrSplit = str.split("/", -1);
        String[] strArrSplit2 = str2.split("/", -1);
        int iMin = Math.min(strArrSplit.length, strArrSplit2.length);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iCompareTo = strArrSplit[i10].compareTo(strArrSplit2[i10]);
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Util.compareIntegers(strArrSplit.length, strArrSplit2.length);
    }

    private static int compareTimestamps(q2 q2Var, q2 q2Var2) {
        int iCompareLongs = Util.compareLongs(q2Var.j(), q2Var2.j());
        return iCompareLongs != 0 ? iCompareLongs : Util.compareIntegers(q2Var.i(), q2Var2.i());
    }

    public static boolean contains(f fVar, i2 i2Var) {
        Iterator it = fVar.a().iterator();
        while (it.hasNext()) {
            if (equals((i2) it.next(), i2Var)) {
                return true;
            }
        }
        return false;
    }

    public static boolean equals(i2 i2Var, i2 i2Var2) {
        int iTypeOrder;
        if (i2Var == i2Var2) {
            return true;
        }
        if (i2Var == null || i2Var2 == null || (iTypeOrder = typeOrder(i2Var)) != typeOrder(i2Var2)) {
            return false;
        }
        if (iTypeOrder == 2) {
            return numberEquals(i2Var, i2Var2);
        }
        if (iTypeOrder == 4) {
            return ServerTimestamps.getLocalWriteTime(i2Var).equals(ServerTimestamps.getLocalWriteTime(i2Var2));
        }
        if (iTypeOrder == Integer.MAX_VALUE) {
            return true;
        }
        if (iTypeOrder != 9) {
            return iTypeOrder != 10 ? i2Var.equals(i2Var2) : objectEquals(i2Var, i2Var2);
        }
        return arrayEquals(i2Var, i2Var2);
    }

    public static i2 getLowerBound(h2 h2Var) {
        switch (h2Var.ordinal()) {
            case 0:
                return NULL_VALUE;
            case 1:
                g2 g2VarC = i2.C();
                g2VarC.f(false);
                return (i2) g2VarC.m3997build();
            case 2:
            case 3:
                g2 g2VarC2 = i2.C();
                g2VarC2.h(Double.NaN);
                return (i2) g2VarC2.m3997build();
            case 4:
                g2 g2VarC3 = i2.C();
                p2 p2VarK = q2.k();
                p2VarK.d(Long.MIN_VALUE);
                g2VarC3.p(p2VarK);
                return (i2) g2VarC3.m3997build();
            case 5:
                g2 g2VarC4 = i2.C();
                g2VarC4.o("");
                return (i2) g2VarC4.m3997build();
            case 6:
                g2 g2VarC5 = i2.C();
                g2VarC5.g(n.f4181b);
                return (i2) g2VarC5.m3997build();
            case 7:
                return refValue(DatabaseId.EMPTY, DocumentKey.empty());
            case 8:
                g2 g2VarC6 = i2.C();
                a aVarK = b.k();
                aVarK.c(-90.0d);
                aVarK.d(-180.0d);
                g2VarC6.i(aVarK);
                return (i2) g2VarC6.m3997build();
            case 9:
                g2 g2VarC7 = i2.C();
                g2VarC7.e(e.i());
                return (i2) g2VarC7.m3997build();
            case 10:
                g2 g2VarC8 = i2.C();
                g2VarC8.l(k0.g());
                return (i2) g2VarC8.m3997build();
            default:
                throw new IllegalArgumentException("Unknown value type: " + h2Var);
        }
    }

    public static i2 getUpperBound(h2 h2Var) {
        switch (h2Var.ordinal()) {
            case 0:
                return getLowerBound(h2.f12623b);
            case 1:
                return getLowerBound(h2.f12624c);
            case 2:
            case 3:
                return getLowerBound(h2.f12626e);
            case 4:
                return getLowerBound(h2.f12627f);
            case 5:
                return getLowerBound(h2.f12628n);
            case 6:
                return getLowerBound(h2.f12629o);
            case 7:
                return getLowerBound(h2.f12630p);
            case 8:
                return getLowerBound(h2.f12631q);
            case 9:
                return getLowerBound(h2.f12632r);
            case 10:
                return MAX_VALUE;
            default:
                throw new IllegalArgumentException("Unknown value type: " + h2Var);
        }
    }

    public static boolean isArray(i2 i2Var) {
        return i2Var != null && i2Var.B() == h2.f12631q;
    }

    public static boolean isDouble(i2 i2Var) {
        return i2Var != null && i2Var.B() == h2.f12625d;
    }

    public static boolean isInteger(i2 i2Var) {
        return i2Var != null && i2Var.B() == h2.f12624c;
    }

    public static boolean isMapValue(i2 i2Var) {
        return i2Var != null && i2Var.B() == h2.f12632r;
    }

    public static boolean isMaxValue(i2 i2Var) {
        return MAX_VALUE_TYPE.equals(i2Var.x().i().get("__type__"));
    }

    public static boolean isNanValue(i2 i2Var) {
        return i2Var != null && Double.isNaN(i2Var.u());
    }

    public static boolean isNullValue(i2 i2Var) {
        return i2Var != null && i2Var.B() == h2.f12622a;
    }

    public static boolean isNumber(i2 i2Var) {
        return isInteger(i2Var) || isDouble(i2Var);
    }

    public static boolean isReferenceValue(i2 i2Var) {
        return i2Var != null && i2Var.B() == h2.f12629o;
    }

    public static int lowerBoundCompare(i2 i2Var, boolean z10, i2 i2Var2, boolean z11) {
        int iCompare = compare(i2Var, i2Var2);
        if (iCompare != 0) {
            return iCompare;
        }
        if (!z10 || z11) {
            return (z10 || !z11) ? 0 : 1;
        }
        return -1;
    }

    private static boolean numberEquals(i2 i2Var, i2 i2Var2) {
        h2 h2VarB = i2Var.B();
        h2 h2Var = h2.f12624c;
        if (h2VarB == h2Var && i2Var2.B() == h2Var) {
            return i2Var.w() == i2Var2.w();
        }
        h2 h2VarB2 = i2Var.B();
        h2 h2Var2 = h2.f12625d;
        return h2VarB2 == h2Var2 && i2Var2.B() == h2Var2 && Double.doubleToLongBits(i2Var.u()) == Double.doubleToLongBits(i2Var2.u());
    }

    private static boolean objectEquals(i2 i2Var, i2 i2Var2) {
        k0 k0VarX = i2Var.x();
        k0 k0VarX2 = i2Var2.x();
        if (k0VarX.h() != k0VarX2.h()) {
            return false;
        }
        for (Map.Entry entry : k0VarX.i().entrySet()) {
            if (!equals((i2) entry.getValue(), (i2) k0VarX2.i().get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public static i2 refValue(DatabaseId databaseId, DocumentKey documentKey) {
        g2 g2VarC = i2.C();
        g2VarC.n(String.format("projects/%s/databases/%s/documents/%s", databaseId.getProjectId(), databaseId.getDatabaseId(), documentKey.toString()));
        return (i2) g2VarC.m3997build();
    }

    public static int typeOrder(i2 i2Var) {
        switch (i2Var.B().ordinal()) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                if (ServerTimestamps.isServerTimestamp(i2Var)) {
                    return 4;
                }
                return isMaxValue(i2Var) ? Integer.MAX_VALUE : 10;
            default:
                throw Assert.fail("Invalid value type: " + i2Var.B(), new Object[0]);
        }
    }

    public static int upperBoundCompare(i2 i2Var, boolean z10, i2 i2Var2, boolean z11) {
        int iCompare = compare(i2Var, i2Var2);
        if (iCompare != 0) {
            return iCompare;
        }
        if (!z10 || z11) {
            return (z10 || !z11) ? 0 : -1;
        }
        return 1;
    }
}
