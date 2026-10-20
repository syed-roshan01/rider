package com.google.firebase.components;

import com.google.firebase.inject.Provider;

/* JADX INFO: loaded from: classes.dex */
public class Lazy<T> implements Provider<T> {
    private static final Object UNINITIALIZED = new Object();
    private volatile Object instance;
    private volatile Provider<T> provider;

    public Lazy(T t10) {
        this.instance = UNINITIALIZED;
        this.instance = t10;
    }

    @Override // com.google.firebase.inject.Provider
    public T get() {
        T t10 = (T) this.instance;
        Object obj = UNINITIALIZED;
        if (t10 == obj) {
            synchronized (this) {
                try {
                    t10 = (T) this.instance;
                    if (t10 == obj) {
                        t10 = this.provider.get();
                        this.instance = t10;
                        this.provider = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return t10;
    }

    public boolean isInitialized() {
        return this.instance != UNINITIALIZED;
    }

    public Lazy(Provider<T> provider) {
        this.instance = UNINITIALIZED;
        this.provider = provider;
    }
}
