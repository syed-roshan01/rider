package b9;

import com.google.firebase.analytics.FirebaseAnalytics;
import d7.t;
import i9.g;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import l9.i;
import r8.k;
import r8.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends d7.a {
    public static List E(Object[] objArr) {
        d7.a.m(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        d7.a.l(listAsList, "asList(...)");
        return listAsList;
    }

    public static boolean F(Object obj, Object[] objArr) {
        d7.a.m(objArr, "<this>");
        return T(obj, objArr) >= 0;
    }

    public static void G(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        d7.a.m(iArr, "<this>");
        d7.a.m(iArr2, FirebaseAnalytics.Param.DESTINATION);
        System.arraycopy(iArr, i11, iArr2, i10, i12 - i11);
    }

    public static void H(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        d7.a.m(objArr, "<this>");
        d7.a.m(objArr2, FirebaseAnalytics.Param.DESTINATION);
        System.arraycopy(objArr, i11, objArr2, i10, i12 - i11);
    }

    public static void I(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        d7.a.m(bArr, "<this>");
        d7.a.m(bArr2, FirebaseAnalytics.Param.DESTINATION);
        System.arraycopy(bArr, i11, bArr2, i10, i12 - i11);
    }

    public static void J(char[] cArr, char[] cArr2, int i10, int i11, int i12) {
        d7.a.m(cArr, "<this>");
        d7.a.m(cArr2, FirebaseAnalytics.Param.DESTINATION);
        System.arraycopy(cArr, i11, cArr2, i10, i12 - i11);
    }

    public static /* synthetic */ void K(int[] iArr, int[] iArr2, int i10, int i11) {
        if ((i11 & 8) != 0) {
            i10 = iArr.length;
        }
        G(0, 0, i10, iArr, iArr2);
    }

    public static /* synthetic */ void L(Object[] objArr, Object[] objArr2, int i10, int i11, int i12) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = objArr.length;
        }
        H(0, i10, i11, objArr, objArr2);
    }

    public static byte[] M(byte[] bArr, int i10, int i11) {
        d7.a.m(bArr, "<this>");
        d7.a.p(i11, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        d7.a.l(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static Object[] N(int i10, int i11, Object[] objArr) {
        d7.a.m(objArr, "<this>");
        d7.a.p(i11, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i10, i11);
        d7.a.l(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public static void O(int i10, int i11, Object[] objArr) {
        d7.a.m(objArr, "<this>");
        Arrays.fill(objArr, i10, i11, (Object) null);
    }

    public static void P(long[] jArr) {
        int length = jArr.length;
        d7.a.m(jArr, "<this>");
        Arrays.fill(jArr, 0, length, -9187201950435737472L);
    }

    public static void Q(Object[] objArr) {
        int length = objArr.length;
        d7.a.m(objArr, "<this>");
        Arrays.fill(objArr, 0, length, (Object) null);
    }

    public static ArrayList R(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static g S(int[] iArr) {
        return new g(0, iArr.length - 1, 1);
    }

    public static int T(Object obj, Object[] objArr) {
        d7.a.m(objArr, "<this>");
        int i10 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i10 < length) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i10 < length2) {
            if (d7.a.d(obj, objArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x0071, please report this as an issue */
    public static File U(File file) {
        int length;
        String string;
        File file2;
        int iO0;
        File file3 = new File("image_cache");
        String path = file3.getPath();
        d7.a.l(path, "getPath(...)");
        char c10 = File.separatorChar;
        int iO1 = i.O0(path, c10, 0, false, 4);
        if (iO1 == 0) {
            if (path.length() <= 1 || path.charAt(1) != c10 || (iO0 = i.O0(path, c10, 2, false, 4)) < 0) {
                return file3;
            }
            int iO2 = i.O0(path, c10, iO0 + 1, false, 4);
            length = iO2 >= 0 ? iO2 + 1 : path.length();
        } else {
            if (iO1 <= 0 || path.charAt(iO1 - 1) != ':') {
                if (iO1 == -1 && i.J0(path, ':')) {
                    length = path.length();
                }
                string = file.toString();
                d7.a.l(string, "toString(...)");
                if (string.length() == 0 && !i.J0(string, c10)) {
                    file2 = new File(string + c10 + file3);
                } else {
                    file2 = new File(string + file3);
                }
                return file2;
            }
            length = iO1 + 1;
        }
        if (length > 0) {
            return file3;
        }
        string = file.toString();
        d7.a.l(string, "toString(...)");
        if (string.length() == 0) {
            file2 = new File(string + file3);
        } else {
            file2 = new File(string + c10 + file3);
        }
        return file2;
    }

    public static char V(char[] cArr) {
        d7.a.m(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static List W(long[] jArr) {
        d7.a.m(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            return r.f13661a;
        }
        if (length == 1) {
            return t.d0(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j10 : jArr) {
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    public static List X(Object[] objArr) {
        d7.a.m(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? new ArrayList(new k(objArr, false)) : t.d0(objArr[0]);
        }
        return r.f13661a;
    }

    public static ArrayList Y(int[] iArr) {
        d7.a.m(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }
}
