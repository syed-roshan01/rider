package com.google.firebase.firestore.model;

import com.google.firebase.Timestamp;
import com.google.protobuf.p2;
import com.google.protobuf.q2;
import o7.g2;
import o7.i0;
import o7.i2;
import o7.k0;

/* JADX INFO: loaded from: classes.dex */
public final class ServerTimestamps {
    private static final String LOCAL_WRITE_TIME_KEY = "__local_write_time__";
    private static final String PREVIOUS_VALUE_KEY = "__previous_value__";
    private static final String SERVER_TIMESTAMP_SENTINEL = "server_timestamp";
    private static final String TYPE_KEY = "__type__";

    private ServerTimestamps() {
    }

    public static q2 getLocalWriteTime(i2 i2Var) {
        return i2Var.x().k(LOCAL_WRITE_TIME_KEY).A();
    }

    public static i2 getPreviousValue(i2 i2Var) {
        i2 i2VarJ = i2Var.x().j(PREVIOUS_VALUE_KEY);
        return isServerTimestamp(i2VarJ) ? getPreviousValue(i2VarJ) : i2VarJ;
    }

    public static boolean isServerTimestamp(i2 i2Var) {
        i2 i2VarJ = i2Var == null ? null : i2Var.x().j(TYPE_KEY);
        return i2VarJ != null && SERVER_TIMESTAMP_SENTINEL.equals(i2VarJ.z());
    }

    public static i2 valueOf(Timestamp timestamp, i2 i2Var) {
        g2 g2VarC = i2.C();
        g2VarC.o(SERVER_TIMESTAMP_SENTINEL);
        i2 i2Var2 = (i2) g2VarC.m3997build();
        g2 g2VarC2 = i2.C();
        p2 p2VarK = q2.k();
        p2VarK.d(timestamp.getSeconds());
        p2VarK.c(timestamp.getNanoseconds());
        g2VarC2.p(p2VarK);
        i2 i2Var3 = (i2) g2VarC2.m3997build();
        i0 i0VarL = k0.l();
        i0VarL.e(i2Var2, TYPE_KEY);
        i0VarL.e(i2Var3, LOCAL_WRITE_TIME_KEY);
        if (isServerTimestamp(i2Var)) {
            i2Var = getPreviousValue(i2Var);
        }
        if (i2Var != null) {
            i0VarL.e(i2Var, PREVIOUS_VALUE_KEY);
        }
        g2 g2VarC3 = i2.C();
        g2VarC3.k(i0VarL);
        return (i2) g2VarC3.m3997build();
    }
}
