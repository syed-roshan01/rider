package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zaq;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public final class k0 implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f3216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f3218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f3220e;

    public k0(f fVar, int i10, a aVar, long j10, long j11) {
        this.f3216a = fVar;
        this.f3217b = i10;
        this.f3218c = aVar;
        this.f3219d = j10;
        this.f3220e = j11;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x002d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x002e A[RETURN] */
    public static com.google.android.gms.common.internal.i a(d0 d0Var, com.google.android.gms.common.internal.f fVar, int i10) {
        com.google.android.gms.common.internal.i telemetryConfiguration = fVar.getTelemetryConfiguration();
        if (telemetryConfiguration != null && telemetryConfiguration.f3309b) {
            int i11 = 0;
            int[] iArr = telemetryConfiguration.f3311d;
            if (iArr == null) {
                int[] iArr2 = telemetryConfiguration.f3313f;
                if (iArr2 != null) {
                    int length = iArr2.length;
                    while (i11 < length) {
                        if (iArr2[i11] != i10) {
                            i11++;
                        }
                    }
                }
                if (d0Var.f3184l < telemetryConfiguration.f3312e) {
                    return telemetryConfiguration;
                }
                return null;
            }
            int length2 = iArr.length;
            while (i11 < length2) {
                if (iArr[i11] == i10) {
                    if (d0Var.f3184l < telemetryConfiguration.f3312e) {
                        return telemetryConfiguration;
                    }
                    return null;
                }
                i11++;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        d0 d0Var;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int iElapsedRealtime;
        long j10;
        long j11;
        f fVar = this.f3216a;
        if (fVar.b()) {
            com.google.android.gms.common.internal.r rVar = com.google.android.gms.common.internal.q.a().f3376a;
            if ((rVar == null || rVar.f3379b) && (d0Var = (d0) fVar.f3201j.get(this.f3218c)) != null) {
                Object obj = d0Var.f3174b;
                if (obj instanceof com.google.android.gms.common.internal.f) {
                    com.google.android.gms.common.internal.f fVar2 = (com.google.android.gms.common.internal.f) obj;
                    long j12 = this.f3219d;
                    boolean z10 = j12 > 0;
                    int gCoreServiceId = fVar2.getGCoreServiceId();
                    if (rVar != null) {
                        z10 &= rVar.f3380c;
                        boolean zHasConnectionInfo = fVar2.hasConnectionInfo();
                        i10 = rVar.f3381d;
                        int i16 = rVar.f3378a;
                        if (!zHasConnectionInfo || fVar2.isConnecting()) {
                            i12 = rVar.f3382e;
                            i11 = i16;
                        } else {
                            com.google.android.gms.common.internal.i iVarA = a(d0Var, fVar2, this.f3217b);
                            if (iVarA == null) {
                                return;
                            }
                            boolean z11 = iVarA.f3310c && j12 > 0;
                            i12 = iVarA.f3312e;
                            i11 = i16;
                            z10 = z11;
                        }
                    } else {
                        i10 = 5000;
                        i11 = 0;
                        i12 = 100;
                    }
                    int i17 = i10;
                    if (task.isSuccessful()) {
                        i14 = 0;
                        i15 = 0;
                    } else if (task.isCanceled()) {
                        i14 = -1;
                        i15 = 100;
                    } else {
                        Exception exception = task.getException();
                        if (exception instanceof com.google.android.gms.common.api.g) {
                            Status status = ((com.google.android.gms.common.api.g) exception).getStatus();
                            i13 = status.f3150b;
                            z5.b bVar = status.f3153e;
                            if (bVar != null) {
                                i14 = bVar.f17241b;
                            }
                            i15 = i13;
                        } else {
                            i13 = 101;
                        }
                        i14 = -1;
                        i15 = i13;
                    }
                    if (z10) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.f3220e);
                        j10 = j12;
                        j11 = jCurrentTimeMillis;
                    } else {
                        iElapsedRealtime = -1;
                        j10 = 0;
                        j11 = 0;
                    }
                    zaq zaqVar = fVar.f3205n;
                    zaqVar.sendMessage(zaqVar.obtainMessage(18, new l0(new com.google.android.gms.common.internal.p(this.f3217b, i15, i14, j10, j11, null, null, gCoreServiceId, iElapsedRealtime), i11, i17, i12)));
                }
            }
        }
    }
}
