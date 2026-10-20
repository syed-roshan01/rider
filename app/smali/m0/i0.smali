.class public final Lm0/i0;
.super Lw0/i0;


# static fields
.field public static final h:Ljava/lang/Object;


# instance fields
.field public c:I

.field public d:I

.field public e:Lq/r;

.field public f:Ljava/lang/Object;

.field public g:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lm0/i0;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lw0/i0;-><init>()V

    sget-object v0, Lq/u;->a:Lq/r;

    const-string v1, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>"

    invoke-static {v0, v1}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lm0/i0;->e:Lq/r;

    sget-object v0, Lm0/i0;->h:Ljava/lang/Object;

    iput-object v0, p0, Lm0/i0;->f:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Lw0/i0;)V
    .locals 1

    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>"

    invoke-static {p1, v0}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lm0/i0;

    iget-object v0, p1, Lm0/i0;->e:Lq/r;

    iput-object v0, p0, Lm0/i0;->e:Lq/r;

    iget-object v0, p1, Lm0/i0;->f:Ljava/lang/Object;

    iput-object v0, p0, Lm0/i0;->f:Ljava/lang/Object;

    iget p1, p1, Lm0/i0;->g:I

    iput p1, p0, Lm0/i0;->g:I

    return-void
.end method

.method public final b()Lw0/i0;
    .locals 1

    new-instance v0, Lm0/i0;

    invoke-direct {v0}, Lm0/i0;-><init>()V

    return-object v0
.end method

.method public final c(Lm0/k0;Lw0/i;)Z
    .locals 6

    sget-object v0, Lw0/p;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lm0/i0;->c:I

    invoke-virtual {p2}, Lw0/i;->d()I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ne v1, v2, :cond_1

    iget v1, p0, Lm0/i0;->d:I

    invoke-virtual {p2}, Lw0/i;->h()I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    move v1, v4

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_1
    :goto_0
    move v1, v3

    :goto_1
    monitor-exit v0

    iget-object v2, p0, Lm0/i0;->f:Ljava/lang/Object;

    sget-object v5, Lm0/i0;->h:Ljava/lang/Object;

    if-eq v2, v5, :cond_2

    if-eqz v1, :cond_3

    iget v2, p0, Lm0/i0;->g:I

    invoke-virtual {p0, p1, p2}, Lm0/i0;->d(Lm0/k0;Lw0/i;)I

    move-result p1

    if-ne v2, p1, :cond_2

    goto :goto_2

    :cond_2
    move v3, v4

    :cond_3
    :goto_2
    if-eqz v3, :cond_4

    if-eqz v1, :cond_4

    monitor-enter v0

    :try_start_1
    invoke-virtual {p2}, Lw0/i;->d()I

    move-result p1

    iput p1, p0, Lm0/i0;->c:I

    invoke-virtual {p2}, Lw0/i;->h()I

    move-result p1

    iput p1, p0, Lm0/i0;->d:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit v0

    goto :goto_3

    :catchall_1
    move-exception p1

    monitor-exit v0

    throw p1

    :cond_4
    :goto_3
    return v3

    :goto_4
    monitor-exit v0

    throw p1
.end method

.method public final d(Lm0/k0;Lw0/i;)I
    .locals 20

    sget-object v1, Lw0/p;->b:Ljava/lang/Object;

    monitor-enter v1

    move-object/from16 v2, p0

    :try_start_0
    iget-object v0, v2, Lm0/i0;->e:Lq/r;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v1

    iget v1, v0, Lq/r;->e:I

    const/4 v3, 0x7

    if-eqz v1, :cond_d

    invoke-static {}, Ld7/t;->Q()Lo0/i;

    move-result-object v1

    iget v4, v1, Lo0/i;->c:I

    const/4 v5, 0x1

    if-lez v4, :cond_1

    iget-object v7, v1, Lo0/i;->a:[Ljava/lang/Object;

    const/4 v8, 0x0

    :cond_0
    aget-object v9, v7, v8

    check-cast v9, Lm0/l0;

    check-cast v9, Lm0/p;

    invoke-virtual {v9}, Lm0/p;->b()V

    add-int/2addr v8, v5

    if-lt v8, v4, :cond_0

    :cond_1
    :try_start_1
    iget-object v4, v0, Lq/r;->b:[Ljava/lang/Object;

    iget-object v7, v0, Lq/r;->c:[I

    iget-object v0, v0, Lq/r;->a:[J

    array-length v8, v0

    add-int/lit8 v8, v8, -0x2

    if-ltz v8, :cond_a

    move v10, v3

    const/4 v9, 0x0

    :goto_0
    aget-wide v11, v0, v9

    not-long v13, v11

    shl-long/2addr v13, v3

    and-long/2addr v13, v11

    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v13, v15

    cmp-long v13, v13, v15

    if-eqz v13, :cond_9

    sub-int v13, v9, v8

    not-int v13, v13

    ushr-int/lit8 v13, v13, 0x1f

    const/16 v14, 0x8

    rsub-int/lit8 v13, v13, 0x8

    const/4 v15, 0x0

    :goto_1
    if-ge v15, v13, :cond_7

    const-wide/16 v16, 0xff

    and-long v16, v11, v16

    const-wide/16 v18, 0x80

    cmp-long v16, v16, v18

    if-gez v16, :cond_6

    shl-int/lit8 v16, v9, 0x3

    add-int v16, v16, v15

    aget-object v17, v4, v16

    aget v3, v7, v16

    move-object/from16 v14, v17

    check-cast v14, Lw0/g0;

    if-eq v3, v5, :cond_2

    move-object/from16 v6, p2

    const/4 v2, 0x0

    goto :goto_3

    :cond_2
    instance-of v3, v14, Lm0/j0;

    const/16 v17, 0x0

    if-eqz v3, :cond_4

    check-cast v14, Lm0/j0;

    iget-object v3, v14, Lm0/j0;->d:Lm0/i0;

    invoke-virtual/range {p2 .. p2}, Lw0/i;->d()I

    move-result v5

    invoke-virtual/range {p2 .. p2}, Lw0/i;->e()Lw0/n;

    move-result-object v6

    invoke-static {v3, v5, v6}, Lw0/p;->q(Lw0/i0;ILw0/n;)Lw0/i0;

    move-result-object v3

    if-eqz v3, :cond_3

    check-cast v3, Lm0/i0;

    iget-object v5, v14, Lm0/j0;->b:Lc9/a;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object/from16 v6, p2

    const/4 v2, 0x0

    :try_start_2
    invoke-virtual {v14, v3, v6, v2, v5}, Lm0/j0;->d(Lm0/i0;Lw0/i;ZLc9/a;)Lm0/i0;

    move-result-object v3

    goto :goto_2

    :cond_3
    const/4 v2, 0x0

    invoke-static {}, Lw0/p;->p()V

    throw v17

    :catchall_0
    move-exception v0

    const/4 v2, 0x0

    goto/16 :goto_7

    :cond_4
    move-object/from16 v6, p2

    const/4 v2, 0x0

    invoke-interface {v14}, Lw0/g0;->e()Lw0/i0;

    move-result-object v3

    invoke-virtual/range {p2 .. p2}, Lw0/i;->d()I

    move-result v5

    invoke-virtual/range {p2 .. p2}, Lw0/i;->e()Lw0/n;

    move-result-object v14

    invoke-static {v3, v5, v14}, Lw0/p;->q(Lw0/i0;ILw0/n;)Lw0/i0;

    move-result-object v3

    if-eqz v3, :cond_5

    :goto_2
    mul-int/lit8 v10, v10, 0x1f

    invoke-static {v3}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v10, v5

    mul-int/lit8 v10, v10, 0x1f

    iget v3, v3, Lw0/i0;->a:I

    add-int/2addr v10, v3

    :goto_3
    const/16 v3, 0x8

    goto :goto_4

    :cond_5
    invoke-static {}, Lw0/p;->p()V

    throw v17
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v0

    goto :goto_7

    :cond_6
    move-object/from16 v6, p2

    const/4 v2, 0x0

    move v3, v14

    :goto_4
    shr-long/2addr v11, v3

    add-int/lit8 v15, v15, 0x1

    move-object/from16 v2, p0

    move v14, v3

    const/4 v3, 0x7

    const/4 v5, 0x1

    goto/16 :goto_1

    :cond_7
    move-object/from16 v6, p2

    move v3, v14

    const/4 v2, 0x0

    if-ne v13, v3, :cond_8

    goto :goto_5

    :cond_8
    move v3, v10

    goto :goto_6

    :cond_9
    move-object/from16 v6, p2

    const/4 v2, 0x0

    :goto_5
    if-eq v9, v8, :cond_8

    add-int/lit8 v9, v9, 0x1

    move-object/from16 v2, p0

    const/4 v3, 0x7

    const/4 v5, 0x1

    goto/16 :goto_0

    :cond_a
    const/4 v2, 0x0

    const/4 v3, 0x7

    :goto_6
    iget v0, v1, Lo0/i;->c:I

    if-lez v0, :cond_e

    iget-object v1, v1, Lo0/i;->a:[Ljava/lang/Object;

    move v6, v2

    :cond_b
    aget-object v2, v1, v6

    check-cast v2, Lm0/l0;

    check-cast v2, Lm0/p;

    invoke-virtual {v2}, Lm0/p;->a()V

    const/4 v2, 0x1

    add-int/2addr v6, v2

    if-lt v6, v0, :cond_b

    goto :goto_9

    :goto_7
    iget v3, v1, Lo0/i;->c:I

    if-lez v3, :cond_c

    iget-object v1, v1, Lo0/i;->a:[Ljava/lang/Object;

    move v6, v2

    :goto_8
    aget-object v2, v1, v6

    check-cast v2, Lm0/l0;

    check-cast v2, Lm0/p;

    invoke-virtual {v2}, Lm0/p;->a()V

    const/4 v2, 0x1

    add-int/2addr v6, v2

    if-ge v6, v3, :cond_c

    goto :goto_8

    :cond_c
    throw v0

    :cond_d
    const/4 v3, 0x7

    :cond_e
    :goto_9
    return v3

    :catchall_2
    move-exception v0

    move-object v2, v0

    monitor-exit v1

    throw v2
.end method
