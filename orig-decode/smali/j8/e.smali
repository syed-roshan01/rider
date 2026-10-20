.class public final Lj8/e;
.super Ljava/lang/Object;


# instance fields
.field public final synthetic a:I

.field public final b:Z

.field public final c:Lja/g;

.field public d:I

.field public e:Z

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:[Ljava/lang/Object;


# direct methods
.method public constructor <init>(IILja/g;Z)V
    .locals 4

    iput p2, p0, Lj8/e;->a:I

    const/4 v0, 0x1

    const/4 v1, 0x7

    const/16 v2, 0x8

    const v3, 0x7fffffff

    if-eq p2, v0, :cond_0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput v3, p0, Lj8/e;->d:I

    new-array p2, v2, [Lj8/c;

    iput-object p2, p0, Lj8/e;->j:[Ljava/lang/Object;

    iput v1, p0, Lj8/e;->h:I

    iput p1, p0, Lj8/e;->f:I

    iput-boolean p4, p0, Lj8/e;->b:Z

    iput-object p3, p0, Lj8/e;->c:Lja/g;

    return-void

    .line 4
    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p4, p0, Lj8/e;->b:Z

    iput-object p3, p0, Lj8/e;->c:Lja/g;

    iput v3, p0, Lj8/e;->d:I

    iput p1, p0, Lj8/e;->f:I

    new-array p1, v2, [Lea/c;

    iput-object p1, p0, Lj8/e;->j:[Ljava/lang/Object;

    iput v1, p0, Lj8/e;->g:I

    return-void
.end method

.method public constructor <init>(Lja/g;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lj8/e;->a:I

    const/16 v1, 0x1000

    .line 2
    invoke-direct {p0, v1, v0, p1, v0}, Lj8/e;-><init>(IILja/g;Z)V

    return-void
.end method

.method public synthetic constructor <init>(Lja/g;I)V
    .locals 1

    const/4 p2, 0x1

    iput p2, p0, Lj8/e;->a:I

    const/16 v0, 0x1000

    .line 1
    invoke-direct {p0, v0, p2, p1, p2}, Lj8/e;-><init>(IILja/g;Z)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget v0, p0, Lj8/e;->a:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lj8/e;->j:[Ljava/lang/Object;

    check-cast v0, [Lea/c;

    invoke-static {v0}, Lb9/b;->Q([Ljava/lang/Object;)V

    iget-object v0, p0, Lj8/e;->j:[Ljava/lang/Object;

    check-cast v0, [Lea/c;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lj8/e;->g:I

    iput v1, p0, Lj8/e;->h:I

    iput v1, p0, Lj8/e;->i:I

    return-void

    :pswitch_0
    iget-object v0, p0, Lj8/e;->j:[Ljava/lang/Object;

    check-cast v0, [Lj8/c;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, p0, Lj8/e;->j:[Ljava/lang/Object;

    check-cast v0, [Lj8/c;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lj8/e;->h:I

    iput v1, p0, Lj8/e;->g:I

    iput v1, p0, Lj8/e;->i:I

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(I)V
    .locals 4

    iget v0, p0, Lj8/e;->a:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    if-lez p1, :cond_1

    iget-object v0, p0, Lj8/e;->j:[Ljava/lang/Object;

    check-cast v0, [Lea/c;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    iget v2, p0, Lj8/e;->g:I

    if-lt v0, v2, :cond_0

    if-lez p1, :cond_0

    iget-object v2, p0, Lj8/e;->j:[Ljava/lang/Object;

    check-cast v2, [Lea/c;

    aget-object v2, v2, v0

    invoke-static {v2}, Ld7/a;->j(Ljava/lang/Object;)V

    iget v2, v2, Lea/c;->c:I

    sub-int/2addr p1, v2

    iget v2, p0, Lj8/e;->i:I

    iget-object v3, p0, Lj8/e;->j:[Ljava/lang/Object;

    check-cast v3, [Lea/c;

    aget-object v3, v3, v0

    invoke-static {v3}, Ld7/a;->j(Ljava/lang/Object;)V

    iget v3, v3, Lea/c;->c:I

    sub-int/2addr v2, v3

    iput v2, p0, Lj8/e;->i:I

    iget v2, p0, Lj8/e;->h:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Lj8/e;->h:I

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lj8/e;->j:[Ljava/lang/Object;

    check-cast p1, [Lea/c;

    add-int/lit8 v2, v2, 0x1

    add-int v0, v2, v1

    iget v3, p0, Lj8/e;->h:I

    invoke-static {p1, v2, p1, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object p1, p0, Lj8/e;->j:[Ljava/lang/Object;

    check-cast p1, [Lea/c;

    iget v0, p0, Lj8/e;->g:I

    add-int/lit8 v0, v0, 0x1

    add-int v2, v0, v1

    const/4 v3, 0x0

    invoke-static {p1, v0, v2, v3}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    iget p1, p0, Lj8/e;->g:I

    add-int/2addr p1, v1

    iput p1, p0, Lj8/e;->g:I

    :cond_1
    return-void

    :pswitch_0
    if-lez p1, :cond_3

    iget-object v0, p0, Lj8/e;->j:[Ljava/lang/Object;

    check-cast v0, [Lj8/c;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    :goto_1
    iget v2, p0, Lj8/e;->h:I

    if-lt v0, v2, :cond_2

    if-lez p1, :cond_2

    iget-object v2, p0, Lj8/e;->j:[Ljava/lang/Object;

    check-cast v2, [Lj8/c;

    aget-object v2, v2, v0

    iget v2, v2, Lj8/c;->c:I

    sub-int/2addr p1, v2

    iget v3, p0, Lj8/e;->i:I

    sub-int/2addr v3, v2

    iput v3, p0, Lj8/e;->i:I

    iget v2, p0, Lj8/e;->g:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Lj8/e;->g:I

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lj8/e;->j:[Ljava/lang/Object;

    check-cast p1, [Lj8/c;

    add-int/lit8 v2, v2, 0x1

    add-int v0, v2, v1

    iget v3, p0, Lj8/e;->g:I

    invoke-static {p1, v2, p1, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lj8/e;->h:I

    add-int/2addr p1, v1

    iput p1, p0, Lj8/e;->h:I

    :cond_3
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Lea/c;)V
    .locals 6

    iget v0, p0, Lj8/e;->f:I

    iget v1, p1, Lea/c;->c:I

    if-le v1, v0, :cond_0

    invoke-virtual {p0}, Lj8/e;->a()V

    return-void

    :cond_0
    iget v2, p0, Lj8/e;->i:I

    add-int/2addr v2, v1

    sub-int/2addr v2, v0

    invoke-virtual {p0, v2}, Lj8/e;->b(I)V

    iget v0, p0, Lj8/e;->h:I

    add-int/lit8 v0, v0, 0x1

    iget-object v2, p0, Lj8/e;->j:[Ljava/lang/Object;

    check-cast v2, [Lea/c;

    array-length v3, v2

    if-le v0, v3, :cond_1

    array-length v0, v2

    mul-int/lit8 v0, v0, 0x2

    new-array v0, v0, [Lea/c;

    array-length v3, v2

    array-length v4, v2

    const/4 v5, 0x0

    invoke-static {v2, v5, v0, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v2, p0, Lj8/e;->j:[Ljava/lang/Object;

    check-cast v2, [Lea/c;

    array-length v2, v2

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Lj8/e;->g:I

    iput-object v0, p0, Lj8/e;->j:[Ljava/lang/Object;

    :cond_1
    iget v0, p0, Lj8/e;->g:I

    add-int/lit8 v2, v0, -0x1

    iput v2, p0, Lj8/e;->g:I

    iget-object v2, p0, Lj8/e;->j:[Ljava/lang/Object;

    check-cast v2, [Lea/c;

    aput-object p1, v2, v0

    iget p1, p0, Lj8/e;->h:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lj8/e;->h:I

    iget p1, p0, Lj8/e;->i:I

    add-int/2addr p1, v1

    iput p1, p0, Lj8/e;->i:I

    return-void
.end method

.method public final d(Lj8/c;)V
    .locals 6

    iget v0, p0, Lj8/e;->f:I

    iget v1, p1, Lj8/c;->c:I

    if-le v1, v0, :cond_0

    invoke-virtual {p0}, Lj8/e;->a()V

    return-void

    :cond_0
    iget v2, p0, Lj8/e;->i:I

    add-int/2addr v2, v1

    sub-int/2addr v2, v0

    invoke-virtual {p0, v2}, Lj8/e;->b(I)V

    iget v0, p0, Lj8/e;->g:I

    add-int/lit8 v0, v0, 0x1

    iget-object v2, p0, Lj8/e;->j:[Ljava/lang/Object;

    check-cast v2, [Lj8/c;

    array-length v3, v2

    if-le v0, v3, :cond_1

    array-length v0, v2

    mul-int/lit8 v0, v0, 0x2

    new-array v0, v0, [Lj8/c;

    array-length v3, v2

    array-length v4, v2

    const/4 v5, 0x0

    invoke-static {v2, v5, v0, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v2, p0, Lj8/e;->j:[Ljava/lang/Object;

    check-cast v2, [Lj8/c;

    array-length v2, v2

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Lj8/e;->h:I

    iput-object v0, p0, Lj8/e;->j:[Ljava/lang/Object;

    :cond_1
    iget v0, p0, Lj8/e;->h:I

    add-int/lit8 v2, v0, -0x1

    iput v2, p0, Lj8/e;->h:I

    iget-object v2, p0, Lj8/e;->j:[Ljava/lang/Object;

    check-cast v2, [Lj8/c;

    aput-object p1, v2, v0

    iget p1, p0, Lj8/e;->g:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lj8/e;->g:I

    iget p1, p0, Lj8/e;->i:I

    add-int/2addr p1, v1

    iput p1, p0, Lj8/e;->i:I

    return-void
.end method

.method public final e(Lja/j;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, Lj8/e;->a:I

    const/16 v3, 0x80

    const/4 v4, 0x3

    const/16 v5, 0xff

    const/4 v8, 0x0

    const/16 v9, 0x7f

    iget-object v10, v0, Lj8/e;->c:Lja/g;

    const/16 v11, 0x8

    packed-switch v2, :pswitch_data_0

    const-string v2, "data"

    invoke-static {v1, v2}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v2, v0, Lj8/e;->b:Z

    if-eqz v2, :cond_4

    sget-object v2, Lea/a0;->a:[I

    invoke-virtual/range {p1 .. p1}, Lja/j;->d()I

    move-result v2

    move v12, v8

    const-wide/16 v13, 0x0

    :goto_0
    if-ge v12, v2, :cond_0

    invoke-virtual {v1, v12}, Lja/j;->i(I)B

    move-result v15

    sget-object v16, Ly9/b;->a:[B

    and-int/2addr v15, v5

    sget-object v16, Lea/a0;->b:[B

    aget-byte v15, v16, v15

    int-to-long v6, v15

    add-long/2addr v13, v6

    add-int/lit8 v12, v12, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x7

    int-to-long v6, v2

    add-long/2addr v13, v6

    shr-long v6, v13, v4

    long-to-int v2, v6

    invoke-virtual/range {p1 .. p1}, Lja/j;->d()I

    move-result v4

    if-ge v2, v4, :cond_4

    new-instance v2, Lja/g;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    sget-object v4, Lea/a0;->a:[I

    invoke-virtual/range {p1 .. p1}, Lja/j;->d()I

    move-result v4

    move v12, v8

    const-wide/16 v6, 0x0

    :goto_1
    if-ge v8, v4, :cond_2

    invoke-virtual {v1, v8}, Lja/j;->i(I)B

    move-result v13

    sget-object v14, Ly9/b;->a:[B

    and-int/2addr v13, v5

    sget-object v14, Lea/a0;->a:[I

    aget v14, v14, v13

    sget-object v15, Lea/a0;->b:[B

    aget-byte v13, v15, v13

    shl-long/2addr v6, v13

    int-to-long v14, v14

    or-long/2addr v6, v14

    add-int/2addr v12, v13

    :goto_2
    if-lt v12, v11, :cond_1

    add-int/lit8 v12, v12, -0x8

    shr-long v13, v6, v12

    long-to-int v13, v13

    invoke-virtual {v2, v13}, Lja/g;->h0(I)V

    goto :goto_2

    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_2
    if-lez v12, :cond_3

    rsub-int/lit8 v1, v12, 0x8

    shl-long v4, v6, v1

    const-wide/16 v6, 0xff

    ushr-long/2addr v6, v12

    or-long/2addr v4, v6

    long-to-int v1, v4

    invoke-virtual {v2, v1}, Lja/g;->h0(I)V

    :cond_3
    iget-wide v4, v2, Lja/g;->b:J

    invoke-virtual {v2, v4, v5}, Lja/g;->i(J)Lja/j;

    move-result-object v1

    invoke-virtual {v1}, Lja/j;->d()I

    move-result v2

    invoke-virtual {v0, v2, v9, v3}, Lj8/e;->g(III)V

    invoke-virtual {v10, v1}, Lja/g;->e0(Lja/j;)V

    goto :goto_3

    :cond_4
    invoke-virtual/range {p1 .. p1}, Lja/j;->d()I

    move-result v2

    invoke-virtual {v0, v2, v9, v8}, Lj8/e;->g(III)V

    invoke-virtual {v10, v1}, Lja/g;->e0(Lja/j;)V

    :goto_3
    return-void

    :pswitch_0
    iget-boolean v2, v0, Lj8/e;->b:Z

    if-eqz v2, :cond_9

    sget-object v2, Lj8/l;->d:Lj8/l;

    invoke-virtual/range {p1 .. p1}, Lja/j;->s()[B

    move-result-object v6

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move v2, v8

    const-wide/16 v12, 0x0

    :goto_4
    array-length v7, v6

    if-ge v2, v7, :cond_5

    aget-byte v7, v6, v2

    and-int/2addr v7, v5

    sget-object v14, Lj8/l;->c:[B

    aget-byte v7, v14, v7

    int-to-long v14, v7

    add-long/2addr v12, v14

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_5
    const-wide/16 v6, 0x7

    add-long/2addr v12, v6

    shr-long v6, v12, v4

    long-to-int v2, v6

    invoke-virtual/range {p1 .. p1}, Lja/j;->d()I

    move-result v4

    if-ge v2, v4, :cond_9

    new-instance v2, Lja/g;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    sget-object v4, Lj8/l;->d:Lj8/l;

    invoke-virtual/range {p1 .. p1}, Lja/j;->s()[B

    move-result-object v1

    new-instance v6, Lg8/z3;

    const/4 v7, 0x1

    invoke-direct {v6, v2, v7}, Lg8/z3;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move v4, v8

    const-wide/16 v16, 0x0

    :goto_5
    array-length v7, v1

    if-ge v8, v7, :cond_7

    aget-byte v7, v1, v8

    and-int/2addr v7, v5

    sget-object v12, Lj8/l;->b:[I

    aget v12, v12, v7

    sget-object v13, Lj8/l;->c:[B

    aget-byte v7, v13, v7

    shl-long v13, v16, v7

    move-object/from16 v18, v10

    int-to-long v9, v12

    or-long v16, v13, v9

    add-int/2addr v4, v7

    :goto_6
    if-lt v4, v11, :cond_6

    add-int/lit8 v4, v4, -0x8

    shr-long v9, v16, v4

    long-to-int v7, v9

    invoke-virtual {v6, v7}, Lg8/z3;->write(I)V

    goto :goto_6

    :cond_6
    add-int/lit8 v8, v8, 0x1

    move-object/from16 v10, v18

    const/16 v9, 0x7f

    goto :goto_5

    :cond_7
    move-object/from16 v18, v10

    if-lez v4, :cond_8

    rsub-int/lit8 v1, v4, 0x8

    shl-long v7, v16, v1

    ushr-int v1, v5, v4

    int-to-long v4, v1

    or-long/2addr v4, v7

    long-to-int v1, v4

    invoke-virtual {v6, v1}, Lg8/z3;->write(I)V

    :cond_8
    iget-wide v4, v2, Lja/g;->b:J

    invoke-virtual {v2, v4, v5}, Lja/g;->i(J)Lja/j;

    move-result-object v1

    invoke-virtual {v1}, Lja/j;->d()I

    move-result v2

    const/16 v4, 0x7f

    invoke-virtual {v0, v2, v4, v3}, Lj8/e;->g(III)V

    move-object/from16 v2, v18

    invoke-virtual {v2, v1}, Lja/g;->e0(Lja/j;)V

    goto :goto_7

    :cond_9
    move v4, v9

    move-object v2, v10

    invoke-virtual/range {p1 .. p1}, Lja/j;->d()I

    move-result v3

    invoke-virtual {v0, v3, v4, v8}, Lj8/e;->g(III)V

    invoke-virtual {v2, v1}, Lja/g;->e0(Lja/j;)V

    :goto_7
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final f(Ljava/util/List;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, Lj8/e;->a:I

    iget-object v5, v0, Lj8/e;->c:Lja/g;

    const/16 v7, 0x80

    const/16 v8, 0x7f

    const/4 v9, -0x1

    const v10, 0x7fffffff

    const/16 v11, 0x1f

    const/16 v12, 0x20

    const/4 v13, 0x0

    const/4 v14, 0x2

    packed-switch v2, :pswitch_data_0

    const-string v2, "headerBlock"

    invoke-static {v1, v2}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v2, v0, Lj8/e;->e:Z

    if-eqz v2, :cond_1

    iget v2, v0, Lj8/e;->d:I

    iget v15, v0, Lj8/e;->f:I

    if-ge v2, v15, :cond_0

    invoke-virtual {v0, v2, v11, v12}, Lj8/e;->g(III)V

    :cond_0
    iput-boolean v13, v0, Lj8/e;->e:Z

    iput v10, v0, Lj8/e;->d:I

    iget v2, v0, Lj8/e;->f:I

    invoke-virtual {v0, v2, v11, v12}, Lj8/e;->g(III)V

    :cond_1
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v2

    move v10, v13

    :goto_0
    if-ge v10, v2, :cond_b

    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lea/c;

    iget-object v12, v11, Lea/c;->a:Lja/j;

    invoke-virtual {v12}, Lja/j;->r()Lja/j;

    move-result-object v12

    sget-object v15, Lea/d;->b:Ljava/util/Map;

    invoke-interface {v15, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/Integer;

    iget-object v3, v11, Lea/c;->b:Lja/j;

    if-eqz v15, :cond_4

    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    move-result v15

    add-int/lit8 v4, v15, 0x1

    if-gt v14, v4, :cond_3

    const/16 v14, 0x8

    if-ge v4, v14, :cond_3

    sget-object v14, Lea/d;->a:[Lea/c;

    aget-object v13, v14, v15

    iget-object v13, v13, Lea/c;->b:Lja/j;

    invoke-static {v13, v3}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_2

    :goto_1
    move v13, v4

    goto :goto_2

    :cond_2
    aget-object v13, v14, v4

    iget-object v13, v13, Lea/c;->b:Lja/j;

    invoke-static {v13, v3}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_3

    add-int/lit8 v15, v15, 0x2

    move v13, v4

    move v4, v15

    goto :goto_2

    :cond_3
    move v13, v4

    move v4, v9

    goto :goto_2

    :cond_4
    move v4, v9

    goto :goto_1

    :goto_2
    if-ne v4, v9, :cond_7

    iget v14, v0, Lj8/e;->g:I

    add-int/lit8 v14, v14, 0x1

    iget-object v15, v0, Lj8/e;->j:[Ljava/lang/Object;

    check-cast v15, [Lea/c;

    array-length v15, v15

    :goto_3
    if-ge v14, v15, :cond_7

    iget-object v6, v0, Lj8/e;->j:[Ljava/lang/Object;

    check-cast v6, [Lea/c;

    aget-object v6, v6, v14

    invoke-static {v6}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v6, v6, Lea/c;->a:Lja/j;

    invoke-static {v6, v12}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    iget-object v6, v0, Lj8/e;->j:[Ljava/lang/Object;

    check-cast v6, [Lea/c;

    aget-object v6, v6, v14

    invoke-static {v6}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v6, v6, Lea/c;->b:Lja/j;

    invoke-static {v6, v3}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    iget v4, v0, Lj8/e;->g:I

    sub-int/2addr v14, v4

    sget-object v4, Lea/d;->a:[Lea/c;

    array-length v4, v4

    add-int/2addr v4, v14

    goto :goto_4

    :cond_5
    if-ne v13, v9, :cond_6

    iget v6, v0, Lj8/e;->g:I

    sub-int v6, v14, v6

    sget-object v13, Lea/d;->a:[Lea/c;

    array-length v13, v13

    add-int/2addr v6, v13

    move v13, v6

    :cond_6
    add-int/lit8 v14, v14, 0x1

    goto :goto_3

    :cond_7
    :goto_4
    if-eq v4, v9, :cond_8

    invoke-virtual {v0, v4, v8, v7}, Lj8/e;->g(III)V

    goto :goto_5

    :cond_8
    if-ne v13, v9, :cond_9

    const/16 v4, 0x40

    invoke-virtual {v5, v4}, Lja/g;->h0(I)V

    invoke-virtual {v0, v12}, Lj8/e;->e(Lja/j;)V

    invoke-virtual {v0, v3}, Lj8/e;->e(Lja/j;)V

    invoke-virtual {v0, v11}, Lj8/e;->c(Lea/c;)V

    goto :goto_5

    :cond_9
    sget-object v4, Lea/c;->d:Lja/j;

    invoke-virtual {v12, v4}, Lja/j;->o(Lja/j;)Z

    move-result v4

    if-eqz v4, :cond_a

    sget-object v4, Lea/c;->i:Lja/j;

    invoke-static {v4, v12}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_a

    const/16 v4, 0xf

    const/4 v6, 0x0

    invoke-virtual {v0, v13, v4, v6}, Lj8/e;->g(III)V

    invoke-virtual {v0, v3}, Lj8/e;->e(Lja/j;)V

    goto :goto_5

    :cond_a
    const/16 v4, 0x3f

    const/16 v6, 0x40

    invoke-virtual {v0, v13, v4, v6}, Lj8/e;->g(III)V

    invoke-virtual {v0, v3}, Lj8/e;->e(Lja/j;)V

    invoke-virtual {v0, v11}, Lj8/e;->c(Lea/c;)V

    :goto_5
    add-int/lit8 v10, v10, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x2

    goto/16 :goto_0

    :cond_b
    return-void

    :pswitch_0
    iget-boolean v2, v0, Lj8/e;->e:Z

    if-eqz v2, :cond_d

    iget v2, v0, Lj8/e;->d:I

    iget v3, v0, Lj8/e;->f:I

    if-ge v2, v3, :cond_c

    invoke-virtual {v0, v2, v11, v12}, Lj8/e;->g(III)V

    :cond_c
    const/4 v2, 0x0

    iput-boolean v2, v0, Lj8/e;->e:Z

    iput v10, v0, Lj8/e;->d:I

    iget v2, v0, Lj8/e;->f:I

    invoke-virtual {v0, v2, v11, v12}, Lj8/e;->g(III)V

    :cond_d
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v6, 0x0

    :goto_6
    if-ge v6, v2, :cond_17

    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj8/c;

    iget-object v4, v3, Lj8/c;->a:Lja/j;

    invoke-virtual {v4}, Lja/j;->r()Lja/j;

    move-result-object v4

    sget-object v10, Lj8/f;->c:Ljava/util/Map;

    invoke-interface {v10, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Integer;

    iget-object v11, v3, Lj8/c;->b:Lja/j;

    if-eqz v10, :cond_10

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    add-int/lit8 v12, v10, 0x1

    const/4 v13, 0x2

    if-lt v12, v13, :cond_f

    const/4 v14, 0x7

    if-gt v12, v14, :cond_f

    sget-object v14, Lj8/f;->b:[Lj8/c;

    aget-object v15, v14, v10

    iget-object v15, v15, Lj8/c;->b:Lja/j;

    invoke-virtual {v15, v11}, Lja/j;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_e

    move v10, v12

    goto :goto_7

    :cond_e
    aget-object v14, v14, v12

    iget-object v14, v14, Lj8/c;->b:Lja/j;

    invoke-virtual {v14, v11}, Lja/j;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_f

    add-int/lit8 v10, v10, 0x2

    move/from16 v16, v12

    move v12, v10

    move/from16 v10, v16

    goto :goto_7

    :cond_f
    move v10, v12

    move v12, v9

    goto :goto_7

    :cond_10
    const/4 v13, 0x2

    move v10, v9

    move v12, v10

    :goto_7
    if-ne v12, v9, :cond_13

    iget v14, v0, Lj8/e;->h:I

    add-int/lit8 v14, v14, 0x1

    :goto_8
    iget-object v15, v0, Lj8/e;->j:[Ljava/lang/Object;

    check-cast v15, [Lj8/c;

    array-length v13, v15

    if-ge v14, v13, :cond_13

    aget-object v13, v15, v14

    iget-object v13, v13, Lj8/c;->a:Lja/j;

    invoke-virtual {v13, v4}, Lja/j;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_12

    iget-object v13, v0, Lj8/e;->j:[Ljava/lang/Object;

    check-cast v13, [Lj8/c;

    aget-object v13, v13, v14

    iget-object v13, v13, Lj8/c;->b:Lja/j;

    invoke-virtual {v13, v11}, Lja/j;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_11

    iget v12, v0, Lj8/e;->h:I

    sub-int/2addr v14, v12

    sget-object v12, Lj8/f;->b:[Lj8/c;

    array-length v12, v12

    add-int/2addr v12, v14

    goto :goto_9

    :cond_11
    if-ne v10, v9, :cond_12

    iget v10, v0, Lj8/e;->h:I

    sub-int v10, v14, v10

    sget-object v13, Lj8/f;->b:[Lj8/c;

    array-length v13, v13

    add-int/2addr v10, v13

    :cond_12
    add-int/lit8 v14, v14, 0x1

    const/4 v13, 0x2

    goto :goto_8

    :cond_13
    :goto_9
    if-eq v12, v9, :cond_14

    invoke-virtual {v0, v12, v8, v7}, Lj8/e;->g(III)V

    :goto_a
    const/16 v4, 0xf

    const/4 v12, 0x0

    :goto_b
    const/16 v13, 0x3f

    const/16 v14, 0x40

    goto :goto_c

    :cond_14
    if-ne v10, v9, :cond_15

    const/16 v12, 0x40

    invoke-virtual {v5, v12}, Lja/g;->h0(I)V

    invoke-virtual {v0, v4}, Lj8/e;->e(Lja/j;)V

    invoke-virtual {v0, v11}, Lj8/e;->e(Lja/j;)V

    invoke-virtual {v0, v3}, Lj8/e;->d(Lj8/c;)V

    goto :goto_a

    :cond_15
    sget-object v12, Lj8/f;->a:Lja/j;

    invoke-virtual {v4, v12}, Lja/j;->o(Lja/j;)Z

    move-result v12

    if-eqz v12, :cond_16

    sget-object v12, Lj8/c;->h:Lja/j;

    invoke-virtual {v12, v4}, Lja/j;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_16

    const/16 v4, 0xf

    const/4 v12, 0x0

    invoke-virtual {v0, v10, v4, v12}, Lj8/e;->g(III)V

    invoke-virtual {v0, v11}, Lj8/e;->e(Lja/j;)V

    goto :goto_b

    :cond_16
    const/16 v4, 0xf

    const/4 v12, 0x0

    const/16 v13, 0x3f

    const/16 v14, 0x40

    invoke-virtual {v0, v10, v13, v14}, Lj8/e;->g(III)V

    invoke-virtual {v0, v11}, Lj8/e;->e(Lja/j;)V

    invoke-virtual {v0, v3}, Lj8/e;->d(Lj8/c;)V

    :goto_c
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_6

    :cond_17
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final g(III)V
    .locals 3

    iget v0, p0, Lj8/e;->a:I

    const/16 v1, 0x80

    iget-object v2, p0, Lj8/e;->c:Lja/g;

    packed-switch v0, :pswitch_data_0

    if-ge p1, p2, :cond_0

    or-int/2addr p1, p3

    invoke-virtual {v2, p1}, Lja/g;->h0(I)V

    goto :goto_1

    :cond_0
    or-int/2addr p3, p2

    invoke-virtual {v2, p3}, Lja/g;->h0(I)V

    sub-int/2addr p1, p2

    :goto_0
    if-lt p1, v1, :cond_1

    and-int/lit8 p2, p1, 0x7f

    or-int/2addr p2, v1

    invoke-virtual {v2, p2}, Lja/g;->h0(I)V

    ushr-int/lit8 p1, p1, 0x7

    goto :goto_0

    :cond_1
    invoke-virtual {v2, p1}, Lja/g;->h0(I)V

    :goto_1
    return-void

    :pswitch_0
    if-ge p1, p2, :cond_2

    or-int/2addr p1, p3

    invoke-virtual {v2, p1}, Lja/g;->h0(I)V

    goto :goto_3

    :cond_2
    or-int/2addr p3, p2

    invoke-virtual {v2, p3}, Lja/g;->h0(I)V

    sub-int/2addr p1, p2

    :goto_2
    if-lt p1, v1, :cond_3

    and-int/lit8 p2, p1, 0x7f

    or-int/2addr p2, v1

    invoke-virtual {v2, p2}, Lja/g;->h0(I)V

    ushr-int/lit8 p1, p1, 0x7

    goto :goto_2

    :cond_3
    invoke-virtual {v2, p1}, Lja/g;->h0(I)V

    :goto_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
