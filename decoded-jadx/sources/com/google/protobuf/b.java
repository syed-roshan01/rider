package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements s1 {
    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        addAll((Iterable) iterable, (List) collection);
    }

    public static r2 newUninitializedMessageException(t1 t1Var) {
        return new r2();
    }

    public final String b() {
        return "Reading " + getClass().getName() + " from a ByteString threw an IOException (should never happen).";
    }

    public abstract b internalMergeFrom(c cVar);

    public boolean mergeDelimitedFrom(InputStream inputStream, z zVar) throws IOException {
        int i10 = inputStream.read();
        if (i10 == -1) {
            return false;
        }
        m3994mergeFrom((InputStream) new a(inputStream, s.t(inputStream, i10)), zVar);
        return true;
    }

    /* JADX INFO: renamed from: mergeFrom */
    public abstract b m4002mergeFrom(s sVar, z zVar);

    /* JADX INFO: renamed from: mergeFrom */
    public abstract b m4003mergeFrom(byte[] bArr, int i10, int i11);

    /* JADX INFO: renamed from: mergeFrom */
    public abstract b m4004mergeFrom(byte[] bArr, int i10, int i11, z zVar);

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        Charset charset = y0.f4276a;
        iterable.getClass();
        if (iterable instanceof e1) {
            List listD = ((e1) iterable).d();
            e1 e1Var = (e1) list;
            int size = list.size();
            for (Object obj : listD) {
                if (obj == null) {
                    String str = "Element at index " + (e1Var.size() - size) + " is null.";
                    for (int size2 = e1Var.size() - 1; size2 >= size; size2--) {
                        e1Var.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof n) {
                    e1Var.j((n) obj);
                } else {
                    e1Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof c2) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size3 = list.size();
        for (T t10 : iterable) {
            if (t10 == null) {
                String str2 = "Element at index " + (list.size() - size3) + " is null.";
                for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                    list.remove(size4);
                }
                throw new NullPointerException(str2);
            }
            list.add(t10);
        }
    }

    public boolean mergeDelimitedFrom(InputStream inputStream) {
        return mergeDelimitedFrom(inputStream, z.a());
    }

    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public b m3991mergeFrom(s sVar) {
        return m4002mergeFrom(sVar, z.a());
    }

    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public b m3989mergeFrom(n nVar) throws a1 {
        try {
            s sVarV = nVar.v();
            m3991mergeFrom(sVarV);
            sVarV.a(0);
            return this;
        } catch (a1 e4) {
            throw e4;
        } catch (IOException e10) {
            throw new RuntimeException(b(), e10);
        }
    }

    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public b m3990mergeFrom(n nVar, z zVar) throws a1 {
        try {
            s sVarV = nVar.v();
            m4002mergeFrom(sVarV, zVar);
            sVarV.a(0);
            return this;
        } catch (a1 e4) {
            throw e4;
        } catch (IOException e10) {
            throw new RuntimeException(b(), e10);
        }
    }

    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public b m3995mergeFrom(byte[] bArr) {
        return m4003mergeFrom(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public b m3996mergeFrom(byte[] bArr, z zVar) {
        return m4004mergeFrom(bArr, 0, bArr.length, zVar);
    }

    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public b m3993mergeFrom(InputStream inputStream) {
        s sVarG = s.g(inputStream);
        m3991mergeFrom(sVarG);
        sVarG.a(0);
        return this;
    }

    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public b m3994mergeFrom(InputStream inputStream, z zVar) {
        s sVarG = s.g(inputStream);
        m4002mergeFrom(sVarG, zVar);
        sVarG.a(0);
        return this;
    }

    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public b m3992mergeFrom(t1 t1Var) {
        if (getDefaultInstanceForType().getClass().isInstance(t1Var)) {
            return internalMergeFrom((c) t1Var);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
