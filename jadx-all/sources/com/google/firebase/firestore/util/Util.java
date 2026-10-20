package com.google.firebase.firestore.util;

import android.os.Handler;
import android.os.Looper;
import b0.l0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FieldPath;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.protobuf.n;
import e8.c2;
import e8.d2;
import e8.e2;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.SortedSet;
import m0.r;

/* JADX INFO: loaded from: classes.dex */
public class Util {
    private static final String AUTO_ID_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final int AUTO_ID_LENGTH = 20;
    private static final Random rand = new SecureRandom();
    private static final Continuation<Void, Void> VOID_ERROR_TRANSFORMER = new l0(2);

    private static <T> T advanceIterator(Iterator<T> it) {
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static String autoId() {
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < 20; i10++) {
            sb.append(AUTO_ID_ALPHABET.charAt(rand.nextInt(62)));
        }
        return sb.toString();
    }

    public static List<Object> collectUpdateArguments(int i10, Object obj, Object obj2, Object... objArr) {
        if (objArr.length % 2 == 1) {
            throw new IllegalArgumentException("Missing value in call to update().  There must be an even number of arguments that alternate between field names and values");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        arrayList.add(obj2);
        Collections.addAll(arrayList, objArr);
        for (int i11 = 0; i11 < arrayList.size(); i11 += 2) {
            Object obj3 = arrayList.get(i11);
            if (!(obj3 instanceof String) && !(obj3 instanceof FieldPath)) {
                throw new IllegalArgumentException("Excepted field name at argument position " + (i11 + i10 + 1) + " but got " + obj3 + " in call to update.  The arguments to update should alternate between field names and values");
            }
        }
        return arrayList;
    }

    public static <T extends Comparable<T>> Comparator<T> comparator() {
        return new r(10);
    }

    public static int compareBooleans(boolean z10, boolean z11) {
        if (z10 == z11) {
            return 0;
        }
        return z10 ? 1 : -1;
    }

    public static int compareByteArrays(byte[] bArr, byte[] bArr2) {
        int iMin = Math.min(bArr.length, bArr2.length);
        for (int i10 = 0; i10 < iMin; i10++) {
            int i11 = bArr[i10] & 255;
            int i12 = bArr2[i10] & 255;
            if (i11 < i12) {
                return -1;
            }
            if (i11 > i12) {
                return 1;
            }
        }
        return compareIntegers(bArr.length, bArr2.length);
    }

    public static int compareByteStrings(n nVar, n nVar2) {
        int iMin = Math.min(nVar.size(), nVar2.size());
        for (int i10 = 0; i10 < iMin; i10++) {
            int i11 = nVar.i(i10) & 255;
            int i12 = nVar2.i(i10) & 255;
            if (i11 < i12) {
                return -1;
            }
            if (i11 > i12) {
                return 1;
            }
        }
        return compareIntegers(nVar.size(), nVar2.size());
    }

    public static int compareDoubles(double d10, double d11) {
        return y3.e.h0(d10, d11);
    }

    public static int compareIntegers(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 > i11 ? 1 : 0;
    }

    public static int compareLongs(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 > j11 ? 1 : 0;
    }

    public static int compareMixed(double d10, long j10) {
        int i10 = -1;
        if (Double.isNaN(d10) || d10 < -9.223372036854776E18d) {
            return -1;
        }
        if (d10 >= 9.223372036854776E18d) {
            return 1;
        }
        long j11 = (long) d10;
        if (j11 >= j10) {
            i10 = j11 > j10 ? 1 : 0;
        }
        return i10 != 0 ? i10 : y3.e.h0(d10, j10);
    }

    private static Exception convertStatusException(Exception exc) {
        if (exc instanceof d2) {
            return exceptionFromStatus(((d2) exc).f5232a);
        }
        return exc instanceof e2 ? exceptionFromStatus(((e2) exc).f5238a) : exc;
    }

    public static Exception convertThrowableToException(Throwable th) {
        return th instanceof Exception ? convertStatusException((Exception) th) : new Exception(th);
    }

    public static void crashMainThread(RuntimeException runtimeException) {
        new Handler(Looper.getMainLooper()).post(new a(runtimeException, 2));
    }

    public static <T> void diffCollections(Collection<T> collection, Collection<T> collection2, Comparator<T> comparator, Consumer<T> consumer, Consumer<T> consumer2) {
        ArrayList arrayList = new ArrayList(collection);
        Collections.sort(arrayList, comparator);
        ArrayList arrayList2 = new ArrayList(collection2);
        Collections.sort(arrayList2, comparator);
        diffCollections(arrayList.iterator(), arrayList2.iterator(), comparator, consumer, consumer2);
    }

    public static FirebaseFirestoreException exceptionFromStatus(c2 c2Var) {
        c2Var.getClass();
        d2 d2Var = new d2(c2Var);
        return new FirebaseFirestoreException(d2Var.getMessage(), FirebaseFirestoreException.Code.fromValue(c2Var.f5227a.f5425a), d2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> Map<K, V> firstNEntries(Map<K, V> map, int i10, final Comparator<V> comparator) {
        if (map.size() <= i10) {
            return map;
        }
        ArrayList arrayList = new ArrayList(map.entrySet());
        Collections.sort(arrayList, new Comparator() { // from class: com.google.firebase.firestore.util.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Util.lambda$firstNEntries$4(comparator, (Map.Entry) obj, (Map.Entry) obj2);
            }
        });
        HashMap map2 = new HashMap();
        for (int i11 = 0; i11 < i10; i11++) {
            map2.put(((Map.Entry) arrayList.get(i11)).getKey(), ((Map.Entry) arrayList.get(i11)).getValue());
        }
        return map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$crashMainThread$1(RuntimeException runtimeException) {
        throw runtimeException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$firstNEntries$4(Comparator comparator, Map.Entry entry, Map.Entry entry2) {
        return comparator.compare(entry.getValue(), entry2.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$static$0(Task task) throws Exception {
        if (task.isSuccessful()) {
            return (Void) task.getResult();
        }
        Exception excConvertStatusException = convertStatusException(task.getException());
        if (excConvertStatusException instanceof FirebaseFirestoreException) {
            throw excConvertStatusException;
        }
        throw new FirebaseFirestoreException(excConvertStatusException.getMessage(), FirebaseFirestoreException.Code.UNKNOWN, excConvertStatusException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Iterator lambda$values$3(Iterable iterable) {
        final Iterator it = iterable.iterator();
        return new Iterator() { // from class: com.google.firebase.firestore.util.Util.1
            @Override // java.util.Iterator
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                return ((Map.Entry) it.next()).getValue();
            }
        };
    }

    public static StringBuilder repeatSequence(CharSequence charSequence, int i10, CharSequence charSequence2) {
        StringBuilder sb = new StringBuilder();
        if (i10 != 0) {
            sb.append(charSequence);
            for (int i11 = 1; i11 < i10; i11++) {
                sb.append(charSequence2);
                sb.append(charSequence);
            }
        }
        return sb;
    }

    public static String toDebugString(n nVar) {
        int size = nVar.size();
        StringBuilder sb = new StringBuilder(size * 2);
        for (int i10 = 0; i10 < size; i10++) {
            byte bI = nVar.i(i10);
            sb.append(Character.forDigit((bI & 255) >>> 4, 16));
            sb.append(Character.forDigit(bI & 15, 16));
        }
        return sb.toString();
    }

    public static String typeName(Object obj) {
        return obj == null ? "null" : obj.getClass().getName();
    }

    public static <K, V> Iterable<V> values(final Iterable<Map.Entry<K, V>> iterable) {
        return new Iterable() { // from class: com.google.firebase.firestore.util.e
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return Util.lambda$values$3(iterable);
            }
        };
    }

    public static Continuation<Void, Void> voidErrorTransformer() {
        return VOID_ERROR_TRANSFORMER;
    }

    public static <T extends Comparable<T>> void diffCollections(SortedSet<T> sortedSet, SortedSet<T> sortedSet2, Consumer<T> consumer, Consumer<T> consumer2) {
        diffCollections(sortedSet.iterator(), sortedSet2.iterator(), sortedSet.comparator() != null ? sortedSet.comparator() : new r(11), consumer, consumer2);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0023  */
    private static <T> void diffCollections(Iterator<T> it, Iterator<T> it2, Comparator<? super T> comparator, Consumer<T> consumer, Consumer<T> consumer2) {
        T t10 = (Object) advanceIterator(it);
        T t11 = (Object) advanceIterator(it2);
        while (true) {
            if (t10 == null && t11 == null) {
                return;
            }
            boolean z10 = false;
            boolean z11 = true;
            if (t10 != null && t11 != null) {
                int iCompare = comparator.compare(t10, t11);
                if (iCompare >= 0) {
                    if (iCompare > 0) {
                        z11 = false;
                        z10 = true;
                    } else {
                        z11 = false;
                    }
                }
            } else if (t10 == null) {
                z11 = false;
                z10 = true;
            }
            if (z10) {
                consumer.accept(t11);
                t11 = (Object) advanceIterator(it2);
            } else if (z11) {
                consumer2.accept(t10);
                t10 = (Object) advanceIterator(it);
            } else {
                t10 = (Object) advanceIterator(it);
                t11 = (Object) advanceIterator(it2);
            }
        }
    }
}
