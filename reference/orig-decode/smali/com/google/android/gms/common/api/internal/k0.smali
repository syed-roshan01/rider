.class public final Lcom/google/android/gms/common/api/internal/k0;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final a:Lcom/google/android/gms/common/api/internal/f;

.field public final b:I

.field public final c:Lcom/google/android/gms/common/api/internal/a;

.field public final d:J

.field public final e:J


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/internal/f;ILcom/google/android/gms/common/api/internal/a;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/k0;->a:Lcom/google/android/gms/common/api/internal/f;

    iput p2, p0, Lcom/google/android/gms/common/api/internal/k0;->b:I

    iput-object p3, p0, Lcom/google/android/gms/common/api/internal/k0;->c:Lcom/google/android/gms/common/api/internal/a;

    iput-wide p4, p0, Lcom/google/android/gms/common/api/internal/k0;->d:J

    iput-wide p6, p0, Lcom/google/android/gms/common/api/internal/k0;->e:J

    return-void
.end method

.method public static a(Lcom/google/android/gms/common/api/internal/d0;Lcom/google/android/gms/common/internal/f;I)Lcom/google/android/gms/common/internal/i;
    .locals 5

    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/f;->getTelemetryConfiguration()Lcom/google/android/gms/common/internal/i;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_6

    iget-boolean v1, p1, Lcom/google/android/gms/common/internal/i;->b:Z

    if-eqz v1, :cond_6

    const/4 v1, 0x0

    iget-object v2, p1, Lcom/google/android/gms/common/internal/i;->d:[I

    if-nez v2, :cond_2

    iget-object v2, p1, Lcom/google/android/gms/common/internal/i;->f:[I

    if-nez v2, :cond_0

    goto :goto_2

    :cond_0
    array-length v3, v2

    :goto_0
    if-ge v1, v3, :cond_3

    aget v4, v2, v1

    if-ne v4, p2, :cond_1

    goto :goto_3

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    array-length v3, v2

    :goto_1
    if-ge v1, v3, :cond_6

    aget v4, v2, v1

    if-ne v4, p2, :cond_5

    :cond_3
    :goto_2
    iget p0, p0, Lcom/google/android/gms/common/api/internal/d0;->l:I

    iget p2, p1, Lcom/google/android/gms/common/internal/i;->e:I

    if-ge p0, p2, :cond_4

    return-object p1

    :cond_4
    return-object v0

    :cond_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_6
    :goto_3
    return-object v0
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 30

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/k0;->a:Lcom/google/android/gms/common/api/internal/f;

    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/f;->b()Z

    move-result v2

    if-nez v2, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/google/android/gms/common/internal/q;->a()Lcom/google/android/gms/common/internal/q;

    move-result-object v2

    iget-object v2, v2, Lcom/google/android/gms/common/internal/q;->a:Lcom/google/android/gms/common/internal/r;

    if-eqz v2, :cond_2

    iget-boolean v3, v2, Lcom/google/android/gms/common/internal/r;->b:Z

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    :goto_0
    iget-object v3, v1, Lcom/google/android/gms/common/api/internal/f;->j:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v4, v0, Lcom/google/android/gms/common/api/internal/k0;->c:Lcom/google/android/gms/common/api/internal/a;

    invoke-virtual {v3, v4}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/common/api/internal/d0;

    if-eqz v3, :cond_e

    iget-object v4, v3, Lcom/google/android/gms/common/api/internal/d0;->b:Lcom/google/android/gms/common/api/d;

    instance-of v5, v4, Lcom/google/android/gms/common/internal/f;

    if-nez v5, :cond_3

    goto/16 :goto_9

    :cond_3
    check-cast v4, Lcom/google/android/gms/common/internal/f;

    iget-wide v5, v0, Lcom/google/android/gms/common/api/internal/k0;->d:J

    const-wide/16 v7, 0x0

    cmp-long v9, v5, v7

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-lez v9, :cond_4

    move v12, v10

    goto :goto_1

    :cond_4
    move v12, v11

    :goto_1
    invoke-virtual {v4}, Lcom/google/android/gms/common/internal/f;->getGCoreServiceId()I

    move-result v23

    const/16 v13, 0x64

    if-eqz v2, :cond_8

    iget-boolean v14, v2, Lcom/google/android/gms/common/internal/r;->c:Z

    and-int/2addr v12, v14

    invoke-virtual {v4}, Lcom/google/android/gms/common/internal/f;->hasConnectionInfo()Z

    move-result v14

    iget v15, v2, Lcom/google/android/gms/common/internal/r;->d:I

    iget v7, v2, Lcom/google/android/gms/common/internal/r;->a:I

    if-eqz v14, :cond_7

    invoke-virtual {v4}, Lcom/google/android/gms/common/internal/f;->isConnecting()Z

    move-result v8

    if-nez v8, :cond_7

    iget v2, v0, Lcom/google/android/gms/common/api/internal/k0;->b:I

    invoke-static {v3, v4, v2}, Lcom/google/android/gms/common/api/internal/k0;->a(Lcom/google/android/gms/common/api/internal/d0;Lcom/google/android/gms/common/internal/f;I)Lcom/google/android/gms/common/internal/i;

    move-result-object v2

    if-nez v2, :cond_5

    return-void

    :cond_5
    iget-boolean v3, v2, Lcom/google/android/gms/common/internal/i;->c:Z

    if-eqz v3, :cond_6

    if-lez v9, :cond_6

    goto :goto_2

    :cond_6
    move v10, v11

    :goto_2
    iget v2, v2, Lcom/google/android/gms/common/internal/i;->e:I

    move/from16 v29, v2

    move/from16 v26, v7

    move v12, v10

    :goto_3
    move v2, v15

    goto :goto_4

    :cond_7
    iget v2, v2, Lcom/google/android/gms/common/internal/r;->e:I

    move/from16 v29, v2

    move/from16 v26, v7

    goto :goto_3

    :cond_8
    const/16 v15, 0x1388

    move/from16 v26, v11

    move/from16 v29, v13

    goto :goto_3

    :goto_4
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v3

    const/4 v4, -0x1

    if-eqz v3, :cond_9

    move v3, v11

    move v15, v3

    goto :goto_7

    :cond_9
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/tasks/Task;->isCanceled()Z

    move-result v3

    if-eqz v3, :cond_a

    move v3, v4

    move v15, v13

    goto :goto_7

    :cond_a
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object v3

    instance-of v7, v3, Lcom/google/android/gms/common/api/g;

    if-eqz v7, :cond_c

    check-cast v3, Lcom/google/android/gms/common/api/g;

    invoke-virtual {v3}, Lcom/google/android/gms/common/api/g;->getStatus()Lcom/google/android/gms/common/api/Status;

    move-result-object v3

    iget v11, v3, Lcom/google/android/gms/common/api/Status;->b:I

    iget-object v3, v3, Lcom/google/android/gms/common/api/Status;->e:Lz5/b;

    if-nez v3, :cond_b

    goto :goto_6

    :cond_b
    iget v3, v3, Lz5/b;->b:I

    :goto_5
    move v15, v11

    goto :goto_7

    :cond_c
    const/16 v11, 0x65

    :goto_6
    move v3, v4

    goto :goto_5

    :goto_7
    if-eqz v12, :cond_d

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v9

    iget-wide v11, v0, Lcom/google/android/gms/common/api/internal/k0;->e:J

    sub-long/2addr v9, v11

    long-to-int v4, v9

    move/from16 v24, v4

    move-wide/from16 v17, v5

    move-wide/from16 v19, v7

    goto :goto_8

    :cond_d
    move/from16 v24, v4

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    :goto_8
    new-instance v25, Lcom/google/android/gms/common/internal/p;

    iget v14, v0, Lcom/google/android/gms/common/api/internal/k0;->b:I

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v13, v25

    move/from16 v16, v3

    invoke-direct/range {v13 .. v24}, Lcom/google/android/gms/common/internal/p;-><init>(IIIJJLjava/lang/String;Ljava/lang/String;II)V

    int-to-long v2, v2

    iget-object v1, v1, Lcom/google/android/gms/common/api/internal/f;->n:Lcom/google/android/gms/internal/base/zaq;

    new-instance v4, Lcom/google/android/gms/common/api/internal/l0;

    move-object/from16 v24, v4

    move-wide/from16 v27, v2

    invoke-direct/range {v24 .. v29}, Lcom/google/android/gms/common/api/internal/l0;-><init>(Lcom/google/android/gms/common/internal/p;IJI)V

    const/16 v2, 0x12

    invoke-virtual {v1, v2, v4}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    :cond_e
    :goto_9
    return-void
.end method
