package w8;

import u8.j;

/* JADX INFO: loaded from: classes.dex */
public final class b implements u8.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f16256a = new b();

    @Override // u8.e
    public final j getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // u8.e
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
