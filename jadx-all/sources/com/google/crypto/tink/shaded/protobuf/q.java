package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class q extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(int i10, String str, IndexOutOfBoundsException indexOutOfBoundsException) {
        super(l.q.x("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), indexOutOfBoundsException);
        if (i10 != 1) {
        } else {
            super(l.q.x("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), indexOutOfBoundsException);
        }
    }

    public /* synthetic */ q(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}
