package e8;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i3.u f5234c = new i3.u(String.valueOf(','));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e0 f5235d = new e0(r.f5354a, false, new e0(new q(), true, new e0()));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f5236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f5237b;

    public e0(s sVar, boolean z10, e0 e0Var) {
        String strC = sVar.c();
        y3.e.G("Comma is currently not allowed in message encoding", !strC.contains(","));
        int size = e0Var.f5236a.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(e0Var.f5236a.containsKey(sVar.c()) ? size : size + 1);
        for (d0 d0Var : e0Var.f5236a.values()) {
            String strC2 = d0Var.f5230a.c();
            if (!strC2.equals(strC)) {
                linkedHashMap.put(strC2, new d0(d0Var.f5230a, d0Var.f5231b));
            }
        }
        linkedHashMap.put(strC, new d0(sVar, z10));
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        this.f5236a = mapUnmodifiableMap;
        HashSet hashSet = new HashSet(mapUnmodifiableMap.size());
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            if (((d0) entry.getValue()).f5231b) {
                hashSet.add((String) entry.getKey());
            }
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        i3.u uVar = f5234c;
        uVar.getClass();
        Iterator it = setUnmodifiableSet.iterator();
        StringBuilder sb = new StringBuilder();
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb.append((CharSequence) uVar.f7993b);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
            this.f5237b = sb.toString().getBytes(Charset.forName("US-ASCII"));
        } catch (IOException e4) {
            throw new AssertionError(e4);
        }
    }

    public e0() {
        this.f5236a = new LinkedHashMap(0);
        this.f5237b = new byte[0];
    }
}
