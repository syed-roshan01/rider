package com.google.firebase.database.collection;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ArraySortedMap<K, V> extends ImmutableSortedMap<K, V> {
    private final Comparator<K> comparator;
    private final K[] keys;
    private final V[] values;

    public ArraySortedMap(Comparator<K> comparator) {
        this.keys = (K[]) new Object[0];
        this.values = (V[]) new Object[0];
        this.comparator = comparator;
    }

    private static <T> T[] addToArray(T[] tArr, int i10, T t10) {
        int length = tArr.length + 1;
        T[] tArr2 = (T[]) new Object[length];
        System.arraycopy(tArr, 0, tArr2, 0, i10);
        tArr2[i10] = t10;
        System.arraycopy(tArr, i10, tArr2, i10 + 1, (length - i10) - 1);
        return tArr2;
    }

    public static <A, B, C> ArraySortedMap<A, C> buildFrom(List<A> list, Map<B, C> map, ImmutableSortedMap.Builder.KeyTranslator<A, B> keyTranslator, Comparator<A> comparator) {
        Collections.sort(list, comparator);
        int size = list.size();
        Object[] objArr = new Object[size];
        Object[] objArr2 = new Object[size];
        int i10 = 0;
        for (A a10 : list) {
            objArr[i10] = a10;
            objArr2[i10] = map.get(keyTranslator.translate(a10));
            i10++;
        }
        return new ArraySortedMap<>(comparator, objArr, objArr2);
    }

    private int findKey(K k10) {
        int i10 = 0;
        for (K k11 : this.keys) {
            if (this.comparator.compare(k10, k11) == 0) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    private int findKeyOrInsertPosition(K k10) {
        int i10 = 0;
        while (true) {
            K[] kArr = this.keys;
            if (i10 >= kArr.length || this.comparator.compare(kArr[i10], k10) >= 0) {
                break;
            }
            i10++;
        }
        return i10;
    }

    public static <K, V> ArraySortedMap<K, V> fromMap(Map<K, V> map, Comparator<K> comparator) {
        return buildFrom(new ArrayList(map.keySet()), map, ImmutableSortedMap.Builder.identityTranslator(), comparator);
    }

    private Iterator<Map.Entry<K, V>> iterator(int i10, boolean z10) {
        return new Iterator<Map.Entry<K, V>>(i10, z10) { // from class: com.google.firebase.database.collection.ArraySortedMap.1
            int currentPos;
            final /* synthetic */ int val$pos;
            final /* synthetic */ boolean val$reverse;

            {
                this.val$pos = i10;
                this.val$reverse = z10;
                this.currentPos = i10;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.val$reverse) {
                    if (this.currentPos < 0) {
                        return false;
                    }
                } else if (this.currentPos >= ArraySortedMap.this.keys.length) {
                    return false;
                }
                return true;
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Can't remove elements from ImmutableSortedMap");
            }

            @Override // java.util.Iterator
            public Map.Entry<K, V> next() {
                Object obj = ArraySortedMap.this.keys[this.currentPos];
                Object[] objArr = ArraySortedMap.this.values;
                int i11 = this.currentPos;
                Object obj2 = objArr[i11];
                this.currentPos = this.val$reverse ? i11 - 1 : i11 + 1;
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
        };
    }

    private static <T> T[] removeFromArray(T[] tArr, int i10) {
        int length = tArr.length - 1;
        T[] tArr2 = (T[]) new Object[length];
        System.arraycopy(tArr, 0, tArr2, 0, i10);
        System.arraycopy(tArr, i10 + 1, tArr2, i10, length - i10);
        return tArr2;
    }

    private static <T> T[] replaceInArray(T[] tArr, int i10, T t10) {
        int length = tArr.length;
        T[] tArr2 = (T[]) new Object[length];
        System.arraycopy(tArr, 0, tArr2, 0, length);
        tArr2[i10] = t10;
        return tArr2;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public boolean containsKey(K k10) {
        return findKey(k10) != -1;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public V get(K k10) {
        int iFindKey = findKey(k10);
        if (iFindKey != -1) {
            return this.values[iFindKey];
        }
        return null;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public Comparator<K> getComparator() {
        return this.comparator;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public K getMaxKey() {
        K[] kArr = this.keys;
        if (kArr.length > 0) {
            return kArr[kArr.length - 1];
        }
        return null;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public K getMinKey() {
        K[] kArr = this.keys;
        if (kArr.length > 0) {
            return kArr[0];
        }
        return null;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public K getPredecessorKey(K k10) {
        int iFindKey = findKey(k10);
        if (iFindKey == -1) {
            throw new IllegalArgumentException("Can't find predecessor of nonexistent key");
        }
        if (iFindKey > 0) {
            return this.keys[iFindKey - 1];
        }
        return null;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public K getSuccessorKey(K k10) {
        int iFindKey = findKey(k10);
        if (iFindKey == -1) {
            throw new IllegalArgumentException("Can't find successor of nonexistent key");
        }
        K[] kArr = this.keys;
        if (iFindKey < kArr.length - 1) {
            return kArr[iFindKey + 1];
        }
        return null;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public void inOrderTraversal(LLRBNode.NodeVisitor<K, V> nodeVisitor) {
        int i10 = 0;
        while (true) {
            K[] kArr = this.keys;
            if (i10 >= kArr.length) {
                return;
            }
            nodeVisitor.visitEntry(kArr[i10], this.values[i10]);
            i10++;
        }
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public int indexOf(K k10) {
        return findKey(k10);
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public ImmutableSortedMap<K, V> insert(K k10, V v10) {
        int iFindKey = findKey(k10);
        if (iFindKey != -1) {
            K[] kArr = this.keys;
            if (kArr[iFindKey] == k10 && this.values[iFindKey] == v10) {
                return this;
            }
            return new ArraySortedMap(this.comparator, replaceInArray(kArr, iFindKey, k10), replaceInArray(this.values, iFindKey, v10));
        }
        if (this.keys.length <= 25) {
            int iFindKeyOrInsertPosition = findKeyOrInsertPosition(k10);
            return new ArraySortedMap(this.comparator, addToArray(this.keys, iFindKeyOrInsertPosition, k10), addToArray(this.values, iFindKeyOrInsertPosition, v10));
        }
        HashMap map = new HashMap(this.keys.length + 1);
        int i10 = 0;
        while (true) {
            K[] kArr2 = this.keys;
            if (i10 >= kArr2.length) {
                map.put(k10, v10);
                return RBTreeSortedMap.fromMap(map, this.comparator);
            }
            map.put(kArr2[i10], this.values[i10]);
            i10++;
        }
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public boolean isEmpty() {
        return this.keys.length == 0;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public Iterator<Map.Entry<K, V>> iteratorFrom(K k10) {
        return iterator(findKeyOrInsertPosition(k10), false);
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public ImmutableSortedMap<K, V> remove(K k10) {
        int iFindKey = findKey(k10);
        if (iFindKey == -1) {
            return this;
        }
        return new ArraySortedMap(this.comparator, removeFromArray(this.keys, iFindKey), removeFromArray(this.values, iFindKey));
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public Iterator<Map.Entry<K, V>> reverseIterator() {
        return iterator(this.keys.length - 1, true);
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public Iterator<Map.Entry<K, V>> reverseIteratorFrom(K k10) {
        int iFindKeyOrInsertPosition = findKeyOrInsertPosition(k10);
        K[] kArr = this.keys;
        return (iFindKeyOrInsertPosition >= kArr.length || this.comparator.compare(kArr[iFindKeyOrInsertPosition], k10) != 0) ? iterator(iFindKeyOrInsertPosition - 1, true) : iterator(iFindKeyOrInsertPosition, true);
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public int size() {
        return this.keys.length;
    }

    private ArraySortedMap(Comparator<K> comparator, K[] kArr, V[] vArr) {
        this.keys = kArr;
        this.values = vArr;
        this.comparator = comparator;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return iterator(0, false);
    }
}
