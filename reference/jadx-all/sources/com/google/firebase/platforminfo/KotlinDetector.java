package com.google.firebase.platforminfo;

import q8.b;

/* JADX INFO: loaded from: classes.dex */
public final class KotlinDetector {
    private KotlinDetector() {
    }

    public static String detectVersion() {
        try {
            return b.f13222b.toString();
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }
}
