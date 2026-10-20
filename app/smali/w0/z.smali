.class public final Lw0/z;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lc9/c;

.field public b:Ljava/lang/Object;

.field public c:Lq/r;

.field public d:I

.field public final e:Lo0/j;

.field public final f:Lq/s;

.field public final g:Lq/t;

.field public final h:Lo0/i;

.field public final i:Lm0/p;

.field public j:I

.field public final k:Lo0/j;

.field public final l:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Lc9/c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw0/z;->a:Lc9/c;

    const/4 p1, -0x1

    iput p1, p0, Lw0/z;->d:I

    new-instance p1, Lo0/j;

    invoke-direct {p1}, Lo0/j;-><init>()V

    iput-object p1, p0, Lw0/z;->e:Lo0/j;

    new-instance p1, Lq/s;

    invoke-direct {p1}, Lq/s;-><init>()V

    iput-object p1, p0, Lw0/z;->f:Lq/s;

    new-instance p1, Lq/t;

    invoke-direct {p1}, Lq/t;-><init>()V

    iput-object p1, p0, Lw0/z;->g:Lq/t;

    new-instance p1, Lo0/i;

    const/16 v0, 0x10

    new-array v0, v0, [Lm0/k0;

    invoke-direct {p1, v0}, Lo0/i;-><init>([Ljava/lang/Object;)V

    iput-object p1, p0, Lw0/z;->h:Lo0/i;

    new-instance p1, Lm0/p;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Lm0/p;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lw0/z;->i:Lm0/p;

    new-instance p1, Lo0/j;

    invoke-direct {p1}, Lo0/j;-><init>()V

    iput-object p1, p0, Lw0/z;->k:Lo0/j;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lw0/z;->l:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lq/w;Lc9/a;)V
    .locals 20

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    iget-object v2, v1, Lw0/z;->b:Ljava/lang/Object;

    iget-object v3, v1, Lw0/z;->c:Lq/r;

    iget v4, v1, Lw0/z;->d:I

    iput-object v0, v1, Lw0/z;->b:Ljava/lang/Object;

    iget-object v5, v1, Lw0/z;->f:Lq/s;

    invoke-virtual {v5, v0}, Lq/s;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq/r;

    iput-object v0, v1, Lw0/z;->c:Lq/r;

    iget v0, v1, Lw0/z;->d:I

    const/4 v5, -0x1

    if-ne v0, v5, :cond_0

    invoke-static {}, Lw0/p;->i()Lw0/i;

    move-result-object v0

    invoke-virtual {v0}, Lw0/i;->d()I

    move-result v0

    iput v0, v1, Lw0/z;->d:I

    :cond_0
    iget-object v0, v1, Lw0/z;->i:Lm0/p;

    invoke-static {}, Ld7/t;->Q()Lo0/i;

    move-result-object v5

    const/4 v6, 0x1

    :try_start_0
    invoke-virtual {v5, v0}, Lo0/i;->c(Ljava/lang/Object;)V

    invoke-static/range {p2 .. p3}, Lk0/y0;->e(Lc9/c;Lc9/a;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget v0, v5, Lo0/i;->c:I

    sub-int/2addr v0, v6

    invoke-virtual {v5, v0}, Lo0/i;->n(I)Ljava/lang/Object;

    iget-object v0, v1, Lw0/z;->b:Ljava/lang/Object;

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    iget v5, v1, Lw0/z;->d:I

    iget-object v7, v1, Lw0/z;->c:Lq/r;

    if-eqz v7, :cond_7

    iget-object v8, v7, Lq/r;->a:[J

    array-length v9, v8

    add-int/lit8 v9, v9, -0x2

    if-ltz v9, :cond_7

    const/4 v11, 0x0

    :goto_0
    aget-wide v12, v8, v11

    not-long v14, v12

    const/16 v16, 0x7

    shl-long v14, v14, v16

    and-long/2addr v14, v12

    const-wide v16, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v14, v14, v16

    cmp-long v14, v14, v16

    if-eqz v14, :cond_6

    sub-int v14, v11, v9

    not-int v14, v14

    ushr-int/lit8 v14, v14, 0x1f

    const/16 v15, 0x8

    rsub-int/lit8 v14, v14, 0x8

    const/4 v10, 0x0

    :goto_1
    if-ge v10, v14, :cond_5

    const-wide/16 v16, 0xff

    and-long v16, v12, v16

    const-wide/16 v18, 0x80

    cmp-long v16, v16, v18

    if-gez v16, :cond_4

    shl-int/lit8 v16, v11, 0x3

    add-int v6, v16, v10

    iget-object v15, v7, Lq/r;->b:[Ljava/lang/Object;

    aget-object v15, v15, v6

    move-object/from16 v16, v8

    iget-object v8, v7, Lq/r;->c:[I

    aget v8, v8, v6

    if-eq v8, v5, :cond_1

    const/4 v8, 0x1

    goto :goto_2

    :cond_1
    const/4 v8, 0x0

    :goto_2
    if-eqz v8, :cond_2

    invoke-virtual {v1, v0, v15}, Lw0/z;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    if-eqz v8, :cond_3

    invoke-virtual {v7, v6}, Lq/r;->g(I)V

    :cond_3
    const/16 v6, 0x8

    goto :goto_3

    :cond_4
    move-object/from16 v16, v8

    move v6, v15

    :goto_3
    shr-long/2addr v12, v6

    add-int/lit8 v10, v10, 0x1

    move v15, v6

    move-object/from16 v8, v16

    const/4 v6, 0x1

    goto :goto_1

    :cond_5
    move-object/from16 v16, v8

    move v6, v15

    if-ne v14, v6, :cond_7

    goto :goto_4

    :cond_6
    move-object/from16 v16, v8

    :goto_4
    if-eq v11, v9, :cond_7

    add-int/lit8 v11, v11, 0x1

    move-object/from16 v8, v16

    const/4 v6, 0x1

    goto :goto_0

    :cond_7
    iput-object v2, v1, Lw0/z;->b:Ljava/lang/Object;

    iput-object v3, v1, Lw0/z;->c:Lq/r;

    iput v4, v1, Lw0/z;->d:I

    return-void

    :catchall_0
    move-exception v0

    iget v2, v5, Lo0/i;->c:I

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    invoke-virtual {v5, v2}, Lo0/i;->n(I)Ljava/lang/Object;

    throw v0
.end method

.method public final b(Ljava/util/Set;)Z
    .locals 38

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lw0/z;->l:Ljava/util/HashMap;

    instance-of v3, v1, Lo0/d;

    sget-object v4, Lm0/o3;->a:Lm0/o3;

    const-string v5, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>"

    iget-object v6, v0, Lw0/z;->h:Lo0/i;

    const/4 v12, 0x2

    const/16 v16, 0x1

    const/16 v17, 0x0

    iget-object v7, v0, Lw0/z;->k:Lo0/j;

    iget-object v8, v0, Lw0/z;->e:Lo0/j;

    iget-object v9, v0, Lw0/z;->g:Lq/t;

    if-eqz v3, :cond_1b

    check-cast v1, Lo0/d;

    iget-object v3, v1, Lo0/d;->b:[Ljava/lang/Object;

    iget v1, v1, Lo0/d;->a:I

    move/from16 v10, v17

    move/from16 v22, v10

    :goto_0
    if-ge v10, v1, :cond_1a

    aget-object v15, v3, v10

    const-string v13, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet"

    invoke-static {v15, v13}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v13, v15, Lw0/h0;

    if-eqz v13, :cond_0

    move-object v13, v15

    check-cast v13, Lw0/h0;

    invoke-virtual {v13, v12}, Lw0/h0;->b(I)Z

    move-result v13

    if-nez v13, :cond_0

    move/from16 v27, v1

    move-object/from16 p1, v3

    move-object/from16 v26, v4

    move-object/from16 v30, v5

    move-object/from16 v31, v7

    move/from16 v32, v10

    goto/16 :goto_10

    :cond_0
    iget-object v13, v7, Lo0/j;->a:Lq/s;

    invoke-virtual {v13, v15}, Lq/s;->b(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_13

    iget-object v13, v7, Lo0/j;->a:Lq/s;

    invoke-virtual {v13, v15}, Lq/s;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    if-eqz v13, :cond_13

    instance-of v14, v13, Lq/t;

    if-eqz v14, :cond_c

    check-cast v13, Lq/t;

    iget-object v14, v13, Lq/x;->b:[Ljava/lang/Object;

    iget-object v13, v13, Lq/x;->a:[J

    array-length v11, v13

    sub-int/2addr v11, v12

    if-ltz v11, :cond_13

    move-object/from16 p1, v3

    move-object/from16 v26, v4

    move/from16 v12, v17

    :goto_1
    aget-wide v3, v13, v12

    move/from16 v27, v1

    not-long v0, v3

    const/16 v25, 0x7

    shl-long v0, v0, v25

    and-long/2addr v0, v3

    const-wide v23, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v0, v0, v23

    cmp-long v0, v0, v23

    if-eqz v0, :cond_b

    sub-int v0, v12, v11

    not-int v0, v0

    ushr-int/lit8 v0, v0, 0x1f

    const/16 v1, 0x8

    rsub-int/lit8 v0, v0, 0x8

    move/from16 v1, v17

    :goto_2
    if-ge v1, v0, :cond_a

    const-wide/16 v20, 0xff

    and-long v28, v3, v20

    const-wide/16 v18, 0x80

    cmp-long v28, v28, v18

    if-gez v28, :cond_9

    shl-int/lit8 v28, v12, 0x3

    add-int v28, v28, v1

    aget-object v28, v14, v28

    move-object/from16 v29, v13

    move-object/from16 v13, v28

    check-cast v13, Lm0/k0;

    invoke-static {v13, v5}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v28, v14

    invoke-virtual {v2, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    move-object/from16 v30, v5

    move-object v5, v13

    check-cast v5, Lm0/j0;

    move-object/from16 v31, v7

    iget-object v7, v5, Lm0/j0;->c:Lm0/z2;

    if-nez v7, :cond_1

    move-object/from16 v7, v26

    :cond_1
    invoke-virtual {v5}, Lm0/j0;->f()Lm0/i0;

    move-result-object v5

    iget-object v5, v5, Lm0/i0;->f:Ljava/lang/Object;

    invoke-interface {v7, v5, v14}, Lm0/z2;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7

    iget-object v5, v8, Lo0/j;->a:Lq/s;

    invoke-virtual {v5, v13}, Lq/s;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_5

    instance-of v7, v5, Lq/t;

    if-eqz v7, :cond_6

    check-cast v5, Lq/t;

    iget-object v7, v5, Lq/x;->b:[Ljava/lang/Object;

    iget-object v5, v5, Lq/x;->a:[J

    array-length v13, v5

    const/4 v14, 0x2

    sub-int/2addr v13, v14

    if-ltz v13, :cond_5

    move/from16 v32, v10

    move/from16 v33, v11

    move/from16 v14, v17

    :goto_3
    aget-wide v10, v5, v14

    move/from16 v34, v0

    move/from16 v35, v1

    not-long v0, v10

    const/16 v25, 0x7

    shl-long v0, v0, v25

    and-long/2addr v0, v10

    const-wide v23, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v0, v0, v23

    cmp-long v0, v0, v23

    if-eqz v0, :cond_4

    sub-int v0, v14, v13

    not-int v0, v0

    ushr-int/lit8 v0, v0, 0x1f

    const/16 v1, 0x8

    rsub-int/lit8 v0, v0, 0x8

    move/from16 v1, v17

    :goto_4
    if-ge v1, v0, :cond_3

    const-wide/16 v20, 0xff

    and-long v36, v10, v20

    const-wide/16 v18, 0x80

    cmp-long v36, v36, v18

    if-gez v36, :cond_2

    shl-int/lit8 v22, v14, 0x3

    add-int v22, v22, v1

    move-object/from16 v36, v5

    aget-object v5, v7, v22

    invoke-virtual {v9, v5}, Lq/t;->c(Ljava/lang/Object;)V

    move/from16 v22, v16

    :goto_5
    const/16 v5, 0x8

    goto :goto_6

    :cond_2
    move-object/from16 v36, v5

    goto :goto_5

    :goto_6
    shr-long/2addr v10, v5

    add-int/lit8 v1, v1, 0x1

    move-object/from16 v5, v36

    goto :goto_4

    :cond_3
    move-object/from16 v36, v5

    const/16 v5, 0x8

    if-ne v0, v5, :cond_8

    goto :goto_7

    :cond_4
    move-object/from16 v36, v5

    :goto_7
    if-eq v14, v13, :cond_8

    add-int/lit8 v14, v14, 0x1

    move/from16 v0, v34

    move/from16 v1, v35

    move-object/from16 v5, v36

    goto :goto_3

    :cond_5
    move/from16 v34, v0

    move/from16 v35, v1

    move/from16 v32, v10

    move/from16 v33, v11

    goto :goto_8

    :cond_6
    move/from16 v34, v0

    move/from16 v35, v1

    move/from16 v32, v10

    move/from16 v33, v11

    invoke-virtual {v9, v5}, Lq/t;->c(Ljava/lang/Object;)V

    move/from16 v22, v16

    goto :goto_8

    :cond_7
    move/from16 v34, v0

    move/from16 v35, v1

    move/from16 v32, v10

    move/from16 v33, v11

    invoke-virtual {v6, v13}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_8
    :goto_8
    const/16 v0, 0x8

    goto :goto_9

    :cond_9
    move/from16 v34, v0

    move/from16 v35, v1

    move-object/from16 v30, v5

    move-object/from16 v31, v7

    move/from16 v32, v10

    move/from16 v33, v11

    move-object/from16 v29, v13

    move-object/from16 v28, v14

    goto :goto_8

    :goto_9
    shr-long/2addr v3, v0

    add-int/lit8 v1, v35, 0x1

    move-object/from16 v14, v28

    move-object/from16 v13, v29

    move-object/from16 v5, v30

    move-object/from16 v7, v31

    move/from16 v10, v32

    move/from16 v11, v33

    move/from16 v0, v34

    goto/16 :goto_2

    :cond_a
    move v1, v0

    move-object/from16 v30, v5

    move-object/from16 v31, v7

    move/from16 v32, v10

    move/from16 v33, v11

    move-object/from16 v29, v13

    move-object/from16 v28, v14

    const/16 v0, 0x8

    if-ne v1, v0, :cond_14

    move/from16 v11, v33

    goto :goto_a

    :cond_b
    move-object/from16 v30, v5

    move-object/from16 v31, v7

    move/from16 v32, v10

    move-object/from16 v29, v13

    move-object/from16 v28, v14

    :goto_a
    if-eq v12, v11, :cond_14

    add-int/lit8 v12, v12, 0x1

    move-object/from16 v0, p0

    move/from16 v1, v27

    move-object/from16 v14, v28

    move-object/from16 v13, v29

    move-object/from16 v5, v30

    move-object/from16 v7, v31

    move/from16 v10, v32

    goto/16 :goto_1

    :cond_c
    move/from16 v27, v1

    move-object/from16 p1, v3

    move-object/from16 v26, v4

    move-object/from16 v30, v5

    move-object/from16 v31, v7

    move/from16 v32, v10

    check-cast v13, Lm0/k0;

    invoke-virtual {v2, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v13

    check-cast v1, Lm0/j0;

    iget-object v3, v1, Lm0/j0;->c:Lm0/z2;

    if-nez v3, :cond_d

    move-object/from16 v3, v26

    :cond_d
    invoke-virtual {v1}, Lm0/j0;->f()Lm0/i0;

    move-result-object v1

    iget-object v1, v1, Lm0/i0;->f:Ljava/lang/Object;

    invoke-interface {v3, v1, v0}, Lm0/z2;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    iget-object v0, v8, Lo0/j;->a:Lq/s;

    invoke-virtual {v0, v13}, Lq/s;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_14

    instance-of v1, v0, Lq/t;

    if-eqz v1, :cond_11

    check-cast v0, Lq/t;

    iget-object v1, v0, Lq/x;->b:[Ljava/lang/Object;

    iget-object v0, v0, Lq/x;->a:[J

    array-length v3, v0

    const/4 v4, 0x2

    sub-int/2addr v3, v4

    if-ltz v3, :cond_14

    move/from16 v4, v17

    :goto_b
    aget-wide v10, v0, v4

    not-long v12, v10

    const/4 v5, 0x7

    shl-long/2addr v12, v5

    and-long/2addr v12, v10

    const-wide v23, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v12, v12, v23

    cmp-long v5, v12, v23

    if-eqz v5, :cond_10

    sub-int v5, v4, v3

    not-int v5, v5

    ushr-int/lit8 v5, v5, 0x1f

    const/16 v7, 0x8

    rsub-int/lit8 v5, v5, 0x8

    move/from16 v7, v17

    :goto_c
    if-ge v7, v5, :cond_f

    const-wide/16 v12, 0xff

    and-long v28, v10, v12

    const-wide/16 v12, 0x80

    cmp-long v14, v28, v12

    if-gez v14, :cond_e

    shl-int/lit8 v12, v4, 0x3

    add-int/2addr v12, v7

    aget-object v12, v1, v12

    invoke-virtual {v9, v12}, Lq/t;->c(Ljava/lang/Object;)V

    move/from16 v22, v16

    :cond_e
    const/16 v12, 0x8

    shr-long/2addr v10, v12

    add-int/lit8 v7, v7, 0x1

    goto :goto_c

    :cond_f
    const/16 v12, 0x8

    if-ne v5, v12, :cond_14

    :cond_10
    if-eq v4, v3, :cond_14

    add-int/lit8 v4, v4, 0x1

    goto :goto_b

    :cond_11
    invoke-virtual {v9, v0}, Lq/t;->c(Ljava/lang/Object;)V

    move/from16 v22, v16

    goto :goto_d

    :cond_12
    invoke-virtual {v6, v13}, Lo0/i;->c(Ljava/lang/Object;)V

    goto :goto_d

    :cond_13
    move/from16 v27, v1

    move-object/from16 p1, v3

    move-object/from16 v26, v4

    move-object/from16 v30, v5

    move-object/from16 v31, v7

    move/from16 v32, v10

    :cond_14
    :goto_d
    iget-object v0, v8, Lo0/j;->a:Lq/s;

    invoke-virtual {v0, v15}, Lq/s;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_19

    instance-of v1, v0, Lq/t;

    if-eqz v1, :cond_18

    check-cast v0, Lq/t;

    iget-object v1, v0, Lq/x;->b:[Ljava/lang/Object;

    iget-object v0, v0, Lq/x;->a:[J

    array-length v3, v0

    const/4 v4, 0x2

    sub-int/2addr v3, v4

    if-ltz v3, :cond_19

    move/from16 v4, v17

    :goto_e
    aget-wide v10, v0, v4

    not-long v12, v10

    const/4 v5, 0x7

    shl-long/2addr v12, v5

    and-long/2addr v12, v10

    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v12, v14

    cmp-long v5, v12, v14

    if-eqz v5, :cond_17

    sub-int v5, v4, v3

    not-int v5, v5

    ushr-int/lit8 v5, v5, 0x1f

    const/16 v7, 0x8

    rsub-int/lit8 v15, v5, 0x8

    move/from16 v5, v17

    :goto_f
    if-ge v5, v15, :cond_16

    const-wide/16 v12, 0xff

    and-long v28, v10, v12

    const-wide/16 v12, 0x80

    cmp-long v7, v28, v12

    if-gez v7, :cond_15

    shl-int/lit8 v7, v4, 0x3

    add-int/2addr v7, v5

    aget-object v7, v1, v7

    invoke-virtual {v9, v7}, Lq/t;->c(Ljava/lang/Object;)V

    move/from16 v22, v16

    :cond_15
    const/16 v7, 0x8

    shr-long/2addr v10, v7

    add-int/lit8 v5, v5, 0x1

    goto :goto_f

    :cond_16
    const/16 v7, 0x8

    if-ne v15, v7, :cond_19

    :cond_17
    if-eq v4, v3, :cond_19

    add-int/lit8 v4, v4, 0x1

    goto :goto_e

    :cond_18
    invoke-virtual {v9, v0}, Lq/t;->c(Ljava/lang/Object;)V

    move/from16 v22, v16

    :cond_19
    :goto_10
    add-int/lit8 v10, v32, 0x1

    const/4 v12, 0x2

    move-object/from16 v0, p0

    move-object/from16 v3, p1

    move-object/from16 v4, v26

    move/from16 v1, v27

    move-object/from16 v5, v30

    move-object/from16 v7, v31

    goto/16 :goto_0

    :cond_1a
    move-object v1, v8

    goto/16 :goto_23

    :cond_1b
    move-object/from16 v26, v4

    move-object/from16 v30, v5

    move-object/from16 v31, v7

    move-object v0, v1

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move/from16 v22, v17

    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, Lw0/h0;

    if-eqz v3, :cond_1c

    move-object v3, v1

    check-cast v3, Lw0/h0;

    const/4 v4, 0x2

    invoke-virtual {v3, v4}, Lw0/h0;->b(I)Z

    move-result v3

    if-nez v3, :cond_1c

    move-object/from16 p1, v0

    move-object v0, v2

    move-object v1, v8

    goto/16 :goto_22

    :cond_1c
    move-object/from16 v3, v31

    iget-object v4, v3, Lo0/j;->a:Lq/s;

    invoke-virtual {v4, v1}, Lq/s;->b(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_31

    iget-object v4, v3, Lo0/j;->a:Lq/s;

    invoke-virtual {v4, v1}, Lq/s;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_31

    instance-of v5, v4, Lq/t;

    if-eqz v5, :cond_2a

    check-cast v4, Lq/t;

    iget-object v5, v4, Lq/x;->b:[Ljava/lang/Object;

    iget-object v4, v4, Lq/x;->a:[J

    array-length v7, v4

    const/4 v10, 0x2

    sub-int/2addr v7, v10

    if-ltz v7, :cond_28

    move/from16 v10, v17

    :goto_12
    aget-wide v11, v4, v10

    not-long v13, v11

    const/4 v15, 0x7

    shl-long/2addr v13, v15

    and-long/2addr v13, v11

    const-wide v23, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v13, v13, v23

    cmp-long v13, v13, v23

    if-eqz v13, :cond_27

    sub-int v13, v10, v7

    not-int v13, v13

    ushr-int/lit8 v13, v13, 0x1f

    const/16 v14, 0x8

    rsub-int/lit8 v15, v13, 0x8

    move/from16 v13, v17

    :goto_13
    if-ge v13, v15, :cond_26

    const-wide/16 v20, 0xff

    and-long v27, v11, v20

    const-wide/16 v18, 0x80

    cmp-long v14, v27, v18

    if-gez v14, :cond_25

    shl-int/lit8 v14, v10, 0x3

    add-int/2addr v14, v13

    aget-object v14, v5, v14

    check-cast v14, Lm0/k0;

    move-object/from16 p1, v0

    move-object/from16 v0, v30

    invoke-static {v14, v0}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v14}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v31, v3

    move-object v3, v14

    check-cast v3, Lm0/j0;

    move-object/from16 v27, v4

    iget-object v4, v3, Lm0/j0;->c:Lm0/z2;

    if-nez v4, :cond_1d

    move-object/from16 v4, v26

    :cond_1d
    invoke-virtual {v3}, Lm0/j0;->f()Lm0/i0;

    move-result-object v3

    iget-object v3, v3, Lm0/i0;->f:Ljava/lang/Object;

    invoke-interface {v4, v3, v0}, Lm0/z2;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_23

    iget-object v0, v8, Lo0/j;->a:Lq/s;

    invoke-virtual {v0, v14}, Lq/s;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_21

    instance-of v3, v0, Lq/t;

    if-eqz v3, :cond_22

    check-cast v0, Lq/t;

    iget-object v3, v0, Lq/x;->b:[Ljava/lang/Object;

    iget-object v0, v0, Lq/x;->a:[J

    array-length v4, v0

    const/4 v14, 0x2

    sub-int/2addr v4, v14

    if-ltz v4, :cond_21

    move-object/from16 v29, v1

    move-object/from16 v28, v2

    move/from16 v14, v17

    :goto_14
    aget-wide v1, v0, v14

    move/from16 v33, v7

    move-object/from16 v32, v8

    not-long v7, v1

    const/16 v25, 0x7

    shl-long v7, v7, v25

    and-long/2addr v7, v1

    const-wide v23, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v7, v7, v23

    cmp-long v7, v7, v23

    if-eqz v7, :cond_20

    sub-int v7, v14, v4

    not-int v7, v7

    ushr-int/lit8 v7, v7, 0x1f

    const/16 v8, 0x8

    rsub-int/lit8 v7, v7, 0x8

    move/from16 v8, v17

    :goto_15
    if-ge v8, v7, :cond_1f

    const-wide/16 v20, 0xff

    and-long v34, v1, v20

    const-wide/16 v18, 0x80

    cmp-long v34, v34, v18

    if-gez v34, :cond_1e

    shl-int/lit8 v22, v14, 0x3

    add-int v22, v22, v8

    move-object/from16 v34, v0

    aget-object v0, v3, v22

    invoke-virtual {v9, v0}, Lq/t;->c(Ljava/lang/Object;)V

    move/from16 v22, v16

    :goto_16
    const/16 v0, 0x8

    goto :goto_17

    :cond_1e
    move-object/from16 v34, v0

    goto :goto_16

    :goto_17
    shr-long/2addr v1, v0

    add-int/lit8 v8, v8, 0x1

    move-object/from16 v0, v34

    goto :goto_15

    :cond_1f
    move-object/from16 v34, v0

    const/16 v0, 0x8

    if-ne v7, v0, :cond_24

    goto :goto_18

    :cond_20
    move-object/from16 v34, v0

    :goto_18
    if-eq v14, v4, :cond_24

    add-int/lit8 v14, v14, 0x1

    move-object/from16 v8, v32

    move/from16 v7, v33

    move-object/from16 v0, v34

    goto :goto_14

    :cond_21
    move-object/from16 v29, v1

    move-object/from16 v28, v2

    goto :goto_1a

    :cond_22
    move-object/from16 v29, v1

    move-object/from16 v28, v2

    move/from16 v33, v7

    move-object/from16 v32, v8

    invoke-virtual {v9, v0}, Lq/t;->c(Ljava/lang/Object;)V

    move/from16 v22, v16

    goto :goto_19

    :cond_23
    move-object/from16 v29, v1

    move-object/from16 v28, v2

    move/from16 v33, v7

    move-object/from16 v32, v8

    invoke-virtual {v6, v14}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_24
    :goto_19
    const/16 v0, 0x8

    goto :goto_1b

    :cond_25
    move-object/from16 p1, v0

    move-object/from16 v29, v1

    move-object/from16 v28, v2

    move-object/from16 v31, v3

    move-object/from16 v27, v4

    :goto_1a
    move/from16 v33, v7

    move-object/from16 v32, v8

    goto :goto_19

    :goto_1b
    shr-long/2addr v11, v0

    add-int/lit8 v13, v13, 0x1

    move-object/from16 v0, p1

    move-object/from16 v4, v27

    move-object/from16 v2, v28

    move-object/from16 v1, v29

    move-object/from16 v3, v31

    move-object/from16 v8, v32

    move/from16 v7, v33

    goto/16 :goto_13

    :cond_26
    move-object/from16 p1, v0

    move-object/from16 v29, v1

    move-object/from16 v28, v2

    move-object/from16 v31, v3

    move-object/from16 v27, v4

    move/from16 v33, v7

    move-object/from16 v32, v8

    const/16 v0, 0x8

    if-ne v15, v0, :cond_29

    move/from16 v7, v33

    goto :goto_1c

    :cond_27
    move-object/from16 p1, v0

    move-object/from16 v29, v1

    move-object/from16 v28, v2

    move-object/from16 v31, v3

    move-object/from16 v27, v4

    move-object/from16 v32, v8

    :goto_1c
    if-eq v10, v7, :cond_29

    add-int/lit8 v10, v10, 0x1

    move-object/from16 v0, p1

    move-object/from16 v4, v27

    move-object/from16 v2, v28

    move-object/from16 v1, v29

    move-object/from16 v3, v31

    move-object/from16 v8, v32

    goto/16 :goto_12

    :cond_28
    move-object/from16 p1, v0

    move-object/from16 v29, v1

    move-object/from16 v28, v2

    move-object/from16 v31, v3

    move-object/from16 v32, v8

    :cond_29
    move-object/from16 v0, v28

    move-object/from16 v1, v32

    goto/16 :goto_1f

    :cond_2a
    move-object/from16 p1, v0

    move-object/from16 v29, v1

    move-object/from16 v28, v2

    move-object/from16 v31, v3

    move-object/from16 v32, v8

    check-cast v4, Lm0/k0;

    move-object/from16 v0, v28

    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v4

    check-cast v2, Lm0/j0;

    iget-object v3, v2, Lm0/j0;->c:Lm0/z2;

    if-nez v3, :cond_2b

    move-object/from16 v3, v26

    :cond_2b
    invoke-virtual {v2}, Lm0/j0;->f()Lm0/i0;

    move-result-object v2

    iget-object v2, v2, Lm0/i0;->f:Ljava/lang/Object;

    invoke-interface {v3, v2, v1}, Lm0/z2;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_30

    move-object/from16 v1, v32

    iget-object v2, v1, Lo0/j;->a:Lq/s;

    invoke-virtual {v2, v4}, Lq/s;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_32

    instance-of v3, v2, Lq/t;

    if-eqz v3, :cond_2f

    check-cast v2, Lq/t;

    iget-object v3, v2, Lq/x;->b:[Ljava/lang/Object;

    iget-object v2, v2, Lq/x;->a:[J

    array-length v4, v2

    const/4 v5, 0x2

    sub-int/2addr v4, v5

    if-ltz v4, :cond_32

    move/from16 v5, v17

    :goto_1d
    aget-wide v7, v2, v5

    not-long v10, v7

    const/4 v12, 0x7

    shl-long/2addr v10, v12

    and-long/2addr v10, v7

    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v10, v12

    cmp-long v10, v10, v12

    if-eqz v10, :cond_2e

    sub-int v10, v5, v4

    not-int v10, v10

    ushr-int/lit8 v10, v10, 0x1f

    const/16 v11, 0x8

    rsub-int/lit8 v15, v10, 0x8

    move/from16 v10, v17

    :goto_1e
    if-ge v10, v15, :cond_2d

    const-wide/16 v11, 0xff

    and-long v13, v7, v11

    const-wide/16 v11, 0x80

    cmp-long v13, v13, v11

    if-gez v13, :cond_2c

    shl-int/lit8 v11, v5, 0x3

    add-int/2addr v11, v10

    aget-object v11, v3, v11

    invoke-virtual {v9, v11}, Lq/t;->c(Ljava/lang/Object;)V

    move/from16 v22, v16

    :cond_2c
    const/16 v11, 0x8

    shr-long/2addr v7, v11

    add-int/lit8 v10, v10, 0x1

    goto :goto_1e

    :cond_2d
    const/16 v11, 0x8

    if-ne v15, v11, :cond_32

    :cond_2e
    if-eq v5, v4, :cond_32

    add-int/lit8 v5, v5, 0x1

    goto :goto_1d

    :cond_2f
    invoke-virtual {v9, v2}, Lq/t;->c(Ljava/lang/Object;)V

    move/from16 v22, v16

    goto :goto_1f

    :cond_30
    move-object/from16 v1, v32

    invoke-virtual {v6, v4}, Lo0/i;->c(Ljava/lang/Object;)V

    goto :goto_1f

    :cond_31
    move-object/from16 p1, v0

    move-object/from16 v29, v1

    move-object v0, v2

    move-object/from16 v31, v3

    move-object v1, v8

    :cond_32
    :goto_1f
    iget-object v2, v1, Lo0/j;->a:Lq/s;

    move-object/from16 v3, v29

    invoke-virtual {v2, v3}, Lq/s;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_37

    instance-of v3, v2, Lq/t;

    if-eqz v3, :cond_36

    check-cast v2, Lq/t;

    iget-object v3, v2, Lq/x;->b:[Ljava/lang/Object;

    iget-object v2, v2, Lq/x;->a:[J

    array-length v4, v2

    const/4 v5, 0x2

    sub-int/2addr v4, v5

    if-ltz v4, :cond_37

    move/from16 v5, v17

    :goto_20
    aget-wide v7, v2, v5

    not-long v10, v7

    const/4 v12, 0x7

    shl-long/2addr v10, v12

    and-long/2addr v10, v7

    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v10, v12

    cmp-long v10, v10, v12

    if-eqz v10, :cond_35

    sub-int v10, v5, v4

    not-int v10, v10

    ushr-int/lit8 v10, v10, 0x1f

    const/16 v11, 0x8

    rsub-int/lit8 v15, v10, 0x8

    move/from16 v10, v17

    :goto_21
    if-ge v10, v15, :cond_34

    const-wide/16 v11, 0xff

    and-long v13, v7, v11

    const-wide/16 v11, 0x80

    cmp-long v13, v13, v11

    if-gez v13, :cond_33

    shl-int/lit8 v11, v5, 0x3

    add-int/2addr v11, v10

    aget-object v11, v3, v11

    invoke-virtual {v9, v11}, Lq/t;->c(Ljava/lang/Object;)V

    move/from16 v22, v16

    :cond_33
    const/16 v11, 0x8

    shr-long/2addr v7, v11

    add-int/lit8 v10, v10, 0x1

    goto :goto_21

    :cond_34
    const/16 v11, 0x8

    if-ne v15, v11, :cond_37

    :cond_35
    if-eq v5, v4, :cond_37

    add-int/lit8 v5, v5, 0x1

    goto :goto_20

    :cond_36
    invoke-virtual {v9, v2}, Lq/t;->c(Ljava/lang/Object;)V

    move/from16 v22, v16

    :cond_37
    :goto_22
    move-object v2, v0

    move-object v8, v1

    move-object/from16 v0, p1

    goto/16 :goto_11

    :goto_23
    invoke-virtual {v6}, Lo0/i;->l()Z

    move-result v0

    if-eqz v0, :cond_43

    iget v0, v6, Lo0/i;->c:I

    if-lez v0, :cond_42

    iget-object v2, v6, Lo0/i;->a:[Ljava/lang/Object;

    move/from16 v3, v17

    :goto_24
    aget-object v4, v2, v3

    check-cast v4, Lm0/k0;

    invoke-static {}, Lw0/p;->i()Lw0/i;

    move-result-object v5

    invoke-virtual {v5}, Lw0/i;->d()I

    move-result v5

    iget-object v7, v1, Lo0/j;->a:Lq/s;

    invoke-virtual {v7, v4}, Lq/s;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-eqz v7, :cond_3f

    instance-of v8, v7, Lq/t;

    move-object/from16 v9, p0

    iget-object v10, v9, Lw0/z;->f:Lq/s;

    if-eqz v8, :cond_3d

    check-cast v7, Lq/t;

    iget-object v8, v7, Lq/x;->b:[Ljava/lang/Object;

    iget-object v7, v7, Lq/x;->a:[J

    array-length v11, v7

    const/4 v12, 0x2

    sub-int/2addr v11, v12

    if-ltz v11, :cond_3c

    move/from16 v13, v17

    :goto_25
    aget-wide v14, v7, v13

    move/from16 p1, v13

    not-long v12, v14

    const/16 v16, 0x7

    shl-long v12, v12, v16

    and-long/2addr v12, v14

    const-wide v23, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v12, v12, v23

    cmp-long v12, v12, v23

    if-eqz v12, :cond_3b

    sub-int v13, p1, v11

    not-int v12, v13

    ushr-int/lit8 v12, v12, 0x1f

    const/16 v13, 0x8

    rsub-int/lit8 v12, v12, 0x8

    move/from16 v13, v17

    :goto_26
    if-ge v13, v12, :cond_3a

    const-wide/16 v20, 0xff

    and-long v26, v14, v20

    const-wide/16 v18, 0x80

    cmp-long v25, v26, v18

    if-gez v25, :cond_39

    shl-int/lit8 v25, p1, 0x3

    add-int v25, v25, v13

    move-object/from16 v32, v1

    aget-object v1, v8, v25

    invoke-virtual {v10, v1}, Lq/s;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v25

    check-cast v25, Lq/r;

    move-object/from16 v26, v2

    if-nez v25, :cond_38

    new-instance v2, Lq/r;

    invoke-direct {v2}, Lq/r;-><init>()V

    invoke-virtual {v10, v1, v2}, Lq/s;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_27

    :cond_38
    move-object/from16 v2, v25

    :goto_27
    invoke-virtual {v9, v4, v5, v1, v2}, Lw0/z;->c(Ljava/lang/Object;ILjava/lang/Object;Lq/r;)V

    :goto_28
    const/16 v1, 0x8

    goto :goto_29

    :cond_39
    move-object/from16 v32, v1

    move-object/from16 v26, v2

    goto :goto_28

    :goto_29
    shr-long/2addr v14, v1

    add-int/lit8 v13, v13, 0x1

    move-object/from16 v2, v26

    move-object/from16 v1, v32

    goto :goto_26

    :cond_3a
    move-object/from16 v32, v1

    move-object/from16 v26, v2

    const/16 v1, 0x8

    const-wide/16 v18, 0x80

    const-wide/16 v20, 0xff

    if-ne v12, v1, :cond_40

    :goto_2a
    move/from16 v2, p1

    goto :goto_2b

    :cond_3b
    move-object/from16 v32, v1

    move-object/from16 v26, v2

    const/16 v1, 0x8

    const-wide/16 v18, 0x80

    const-wide/16 v20, 0xff

    goto :goto_2a

    :goto_2b
    if-eq v2, v11, :cond_40

    add-int/lit8 v13, v2, 0x1

    move-object/from16 v2, v26

    move-object/from16 v1, v32

    const/4 v12, 0x2

    goto :goto_25

    :cond_3c
    move-object/from16 v32, v1

    move-object/from16 v26, v2

    const/16 v1, 0x8

    const/16 v16, 0x7

    const-wide/16 v18, 0x80

    const-wide/16 v20, 0xff

    const-wide v23, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    goto :goto_2c

    :cond_3d
    move-object/from16 v32, v1

    move-object/from16 v26, v2

    const/16 v1, 0x8

    const/16 v16, 0x7

    const-wide/16 v18, 0x80

    const-wide/16 v20, 0xff

    const-wide v23, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    invoke-virtual {v10, v7}, Lq/s;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq/r;

    if-nez v2, :cond_3e

    new-instance v2, Lq/r;

    invoke-direct {v2}, Lq/r;-><init>()V

    invoke-virtual {v10, v7, v2}, Lq/s;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_3e
    invoke-virtual {v9, v4, v5, v7, v2}, Lw0/z;->c(Ljava/lang/Object;ILjava/lang/Object;Lq/r;)V

    goto :goto_2c

    :cond_3f
    move-object/from16 v32, v1

    move-object/from16 v26, v2

    const/16 v1, 0x8

    const/16 v16, 0x7

    const-wide/16 v18, 0x80

    const-wide/16 v20, 0xff

    const-wide v23, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    move-object/from16 v9, p0

    :cond_40
    :goto_2c
    add-int/lit8 v3, v3, 0x1

    if-lt v3, v0, :cond_41

    goto :goto_2d

    :cond_41
    move-object/from16 v2, v26

    move-object/from16 v1, v32

    goto/16 :goto_24

    :cond_42
    move-object/from16 v9, p0

    :goto_2d
    invoke-virtual {v6}, Lo0/i;->g()V

    goto :goto_2e

    :cond_43
    move-object/from16 v9, p0

    :goto_2e
    return v22
.end method

.method public final c(Ljava/lang/Object;ILjava/lang/Object;Lq/r;)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p4

    iget v4, v0, Lw0/z;->j:I

    if-lez v4, :cond_0

    return-void

    :cond_0
    invoke-virtual {v3, v1}, Lq/r;->c(Ljava/lang/Object;)I

    move-result v4

    if-gez v4, :cond_1

    not-int v4, v4

    const/4 v6, -0x1

    goto :goto_0

    :cond_1
    iget-object v6, v3, Lq/r;->c:[I

    aget v6, v6, v4

    :goto_0
    iget-object v7, v3, Lq/r;->b:[Ljava/lang/Object;

    aput-object v1, v7, v4

    iget-object v3, v3, Lq/r;->c:[I

    aput v2, v3, v4

    instance-of v3, v1, Lm0/k0;

    const/4 v4, 0x2

    if-eqz v3, :cond_6

    if-eq v6, v2, :cond_6

    move-object v2, v1

    check-cast v2, Lm0/k0;

    check-cast v2, Lm0/j0;

    invoke-virtual {v2}, Lm0/j0;->f()Lm0/i0;

    move-result-object v2

    iget-object v3, v0, Lw0/z;->l:Ljava/util/HashMap;

    iget-object v7, v2, Lm0/i0;->f:Ljava/lang/Object;

    invoke-virtual {v3, v1, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v2, Lm0/i0;->e:Lq/r;

    iget-object v3, v0, Lw0/z;->k:Lo0/j;

    invoke-virtual {v3, v1}, Lo0/j;->c(Ljava/lang/Object;)V

    iget-object v7, v2, Lq/r;->b:[Ljava/lang/Object;

    iget-object v2, v2, Lq/r;->a:[J

    array-length v8, v2

    sub-int/2addr v8, v4

    if-ltz v8, :cond_6

    const/4 v10, 0x0

    :goto_1
    aget-wide v11, v2, v10

    not-long v13, v11

    const/4 v15, 0x7

    shl-long/2addr v13, v15

    and-long/2addr v13, v11

    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v13, v15

    cmp-long v13, v13, v15

    if-eqz v13, :cond_5

    sub-int v13, v10, v8

    not-int v13, v13

    ushr-int/lit8 v13, v13, 0x1f

    const/16 v14, 0x8

    rsub-int/lit8 v13, v13, 0x8

    const/4 v15, 0x0

    :goto_2
    if-ge v15, v13, :cond_4

    const-wide/16 v16, 0xff

    and-long v16, v11, v16

    const-wide/16 v18, 0x80

    cmp-long v16, v16, v18

    if-gez v16, :cond_3

    shl-int/lit8 v16, v10, 0x3

    add-int v16, v16, v15

    aget-object v16, v7, v16

    move-object/from16 v9, v16

    check-cast v9, Lw0/g0;

    instance-of v5, v9, Lw0/h0;

    if-eqz v5, :cond_2

    move-object v5, v9

    check-cast v5, Lw0/h0;

    invoke-virtual {v5, v4}, Lw0/h0;->c(I)V

    :cond_2
    invoke-virtual {v3, v9, v1}, Lo0/j;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_3
    shr-long/2addr v11, v14

    add-int/lit8 v15, v15, 0x1

    goto :goto_2

    :cond_4
    if-ne v13, v14, :cond_6

    :cond_5
    if-eq v10, v8, :cond_6

    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_6
    const/4 v2, -0x1

    if-ne v6, v2, :cond_8

    instance-of v2, v1, Lw0/h0;

    if-eqz v2, :cond_7

    move-object v2, v1

    check-cast v2, Lw0/h0;

    invoke-virtual {v2, v4}, Lw0/h0;->c(I)V

    :cond_7
    iget-object v2, v0, Lw0/z;->e:Lo0/j;

    move-object/from16 v3, p3

    invoke-virtual {v2, v1, v3}, Lo0/j;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_8
    return-void
.end method

.method public final d(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lw0/z;->e:Lo0/j;

    invoke-virtual {v0, p2, p1}, Lo0/j;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    instance-of p1, p2, Lm0/k0;

    if-eqz p1, :cond_0

    iget-object p1, v0, Lo0/j;->a:Lq/s;

    invoke-virtual {p1, p2}, Lq/s;->b(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lw0/z;->k:Lo0/j;

    invoke-virtual {p1, p2}, Lo0/j;->c(Ljava/lang/Object;)V

    iget-object p1, p0, Lw0/z;->l:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final e()V
    .locals 33

    move-object/from16 v0, p0

    sget-object v1, Lt1/f;->s:Lt1/f;

    iget-object v2, v0, Lw0/z;->f:Lq/s;

    iget-object v3, v2, Lq/s;->a:[J

    array-length v4, v3

    add-int/lit8 v4, v4, -0x2

    if-ltz v4, :cond_a

    const/4 v6, 0x0

    :goto_0
    aget-wide v7, v3, v6

    not-long v9, v7

    const/4 v11, 0x7

    shl-long/2addr v9, v11

    and-long/2addr v9, v7

    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v9, v12

    cmp-long v9, v9, v12

    if-eqz v9, :cond_9

    sub-int v9, v6, v4

    not-int v9, v9

    ushr-int/lit8 v9, v9, 0x1f

    const/16 v10, 0x8

    rsub-int/lit8 v9, v9, 0x8

    const/4 v14, 0x0

    :goto_1
    if-ge v14, v9, :cond_8

    const-wide/16 v15, 0xff

    and-long v17, v7, v15

    const-wide/16 v19, 0x80

    cmp-long v17, v17, v19

    if-gez v17, :cond_7

    shl-int/lit8 v17, v6, 0x3

    add-int v5, v17, v14

    iget-object v15, v2, Lq/s;->b:[Ljava/lang/Object;

    aget-object v15, v15, v5

    iget-object v10, v2, Lq/s;->c:[Ljava/lang/Object;

    aget-object v10, v10, v5

    check-cast v10, Lq/r;

    invoke-virtual {v1, v15}, Lt1/f;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Ljava/lang/Boolean;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v23

    if-eqz v23, :cond_4

    iget-object v12, v10, Lq/r;->b:[Ljava/lang/Object;

    iget-object v13, v10, Lq/r;->c:[I

    iget-object v10, v10, Lq/r;->a:[J

    array-length v11, v10

    add-int/lit8 v11, v11, -0x2

    move-object/from16 v26, v1

    move-object/from16 v27, v3

    move/from16 v28, v4

    if-ltz v11, :cond_3

    const/4 v1, 0x0

    :goto_2
    aget-wide v3, v10, v1

    move/from16 v29, v9

    move-object/from16 v30, v10

    not-long v9, v3

    const/16 v25, 0x7

    shl-long v9, v9, v25

    and-long/2addr v9, v3

    const-wide v23, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v9, v9, v23

    cmp-long v9, v9, v23

    if-eqz v9, :cond_2

    sub-int v9, v1, v11

    not-int v9, v9

    ushr-int/lit8 v9, v9, 0x1f

    const/16 v10, 0x8

    rsub-int/lit8 v9, v9, 0x8

    const/4 v10, 0x0

    :goto_3
    if-ge v10, v9, :cond_1

    const-wide/16 v21, 0xff

    and-long v31, v3, v21

    cmp-long v31, v31, v19

    if-gez v31, :cond_0

    shl-int/lit8 v31, v1, 0x3

    add-int v31, v31, v10

    move/from16 v32, v6

    aget-object v6, v12, v31

    aget v31, v13, v31

    invoke-virtual {v0, v15, v6}, Lw0/z;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_4
    const/16 v6, 0x8

    goto :goto_5

    :cond_0
    move/from16 v32, v6

    goto :goto_4

    :goto_5
    shr-long/2addr v3, v6

    add-int/lit8 v10, v10, 0x1

    move/from16 v6, v32

    goto :goto_3

    :cond_1
    move/from16 v32, v6

    const/16 v6, 0x8

    const-wide/16 v21, 0xff

    if-ne v9, v6, :cond_5

    goto :goto_6

    :cond_2
    move/from16 v32, v6

    const-wide/16 v21, 0xff

    :goto_6
    if-eq v1, v11, :cond_5

    add-int/lit8 v1, v1, 0x1

    move/from16 v9, v29

    move-object/from16 v10, v30

    move/from16 v6, v32

    goto :goto_2

    :cond_3
    move/from16 v32, v6

    move/from16 v29, v9

    const-wide v23, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    const/16 v25, 0x7

    goto :goto_7

    :cond_4
    move-object/from16 v26, v1

    move-object/from16 v27, v3

    move/from16 v28, v4

    move/from16 v32, v6

    move/from16 v29, v9

    move/from16 v25, v11

    move-wide/from16 v23, v12

    :cond_5
    :goto_7
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {v2, v5}, Lq/s;->j(I)Ljava/lang/Object;

    :cond_6
    const/16 v1, 0x8

    goto :goto_8

    :cond_7
    move-object/from16 v26, v1

    move-object/from16 v27, v3

    move/from16 v28, v4

    move/from16 v32, v6

    move/from16 v29, v9

    move/from16 v25, v11

    move-wide/from16 v23, v12

    move v1, v10

    :goto_8
    shr-long/2addr v7, v1

    add-int/lit8 v14, v14, 0x1

    move v10, v1

    move-wide/from16 v12, v23

    move/from16 v11, v25

    move-object/from16 v1, v26

    move-object/from16 v3, v27

    move/from16 v4, v28

    move/from16 v9, v29

    move/from16 v6, v32

    goto/16 :goto_1

    :cond_8
    move-object/from16 v26, v1

    move-object/from16 v27, v3

    move/from16 v28, v4

    move/from16 v32, v6

    move v1, v10

    move v10, v9

    if-ne v10, v1, :cond_a

    move/from16 v4, v28

    move/from16 v5, v32

    goto :goto_9

    :cond_9
    move-object/from16 v26, v1

    move-object/from16 v27, v3

    move v5, v6

    :goto_9
    if-eq v5, v4, :cond_a

    add-int/lit8 v6, v5, 0x1

    move-object/from16 v1, v26

    move-object/from16 v3, v27

    goto/16 :goto_0

    :cond_a
    return-void
.end method
