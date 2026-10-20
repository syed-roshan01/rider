package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class x0 {
    private final Map<String, Object> mBagOfTags = new HashMap();
    private final Set<Closeable> mCloseables = new LinkedHashSet();
    private volatile boolean mCleared = false;

    public static void a(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e4) {
                throw new RuntimeException(e4);
            }
        }
    }

    public void addCloseable(Closeable closeable) {
        if (this.mCleared) {
            a(closeable);
            return;
        }
        Set<Closeable> set = this.mCloseables;
        if (set != null) {
            synchronized (set) {
                this.mCloseables.add(closeable);
            }
        }
    }

    public final void clear() {
        this.mCleared = true;
        Map<String, Object> map = this.mBagOfTags;
        if (map != null) {
            synchronized (map) {
                try {
                    Iterator<Object> it = this.mBagOfTags.values().iterator();
                    while (it.hasNext()) {
                        a(it.next());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        Set<Closeable> set = this.mCloseables;
        if (set != null) {
            synchronized (set) {
                try {
                    Iterator<Closeable> it2 = this.mCloseables.iterator();
                    while (it2.hasNext()) {
                        a(it2.next());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.mCloseables.clear();
        }
        onCleared();
    }

    public <T> T getTag(String str) {
        T t10;
        Map<String, Object> map = this.mBagOfTags;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t10 = (T) this.mBagOfTags.get(str);
        }
        return t10;
    }

    public void onCleared() {
    }

    public <T> T setTagIfAbsent(String str, T t10) {
        Object obj;
        synchronized (this.mBagOfTags) {
            try {
                obj = this.mBagOfTags.get(str);
                if (obj == null) {
                    this.mBagOfTags.put(str, t10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != null) {
            t10 = (T) obj;
        }
        if (this.mCleared) {
            a(t10);
        }
        return t10;
    }
}
