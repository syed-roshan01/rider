package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements y0 {
    protected int memoizedHashCode;

    public abstract int a(j1 j1Var);

    public final String b(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public abstract z c();

    public final byte[] d() {
        try {
            int iA = ((b0) this).a(null);
            byte[] bArr = new byte[iA];
            p pVar = new p(bArr, iA);
            e(pVar);
            if (iA - pVar.C == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e4) {
            throw new RuntimeException(b("byte array"), e4);
        }
    }

    public abstract void e(p pVar);
}
