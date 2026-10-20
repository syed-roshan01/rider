.class public final Lj8/d;
.super Ljava/lang/Object;


# instance fields
.field public final synthetic a:I

.field public b:I

.field public c:I

.field public final d:Ljava/util/ArrayList;

.field public final e:Lja/a0;

.field public f:I

.field public g:I

.field public h:I

.field public i:[Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lea/t;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lj8/d;->a:I

    const/16 v0, 0x1000

    .line 1
    invoke-direct {p0, p1, v0}, Lj8/d;-><init>(Lea/t;I)V

    return-void
.end method

.method public constructor <init>(Lea/t;I)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lj8/d;->a:I

    const/16 v0, 0x1000

    iput v0, p0, Lj8/d;->b:I

    iput p2, p0, Lj8/d;->c:I

    .line 3
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lj8/d;->d:Ljava/util/ArrayList;

    .line 4
    invoke-static {p1}, Lr9/a;->c(Lja/g0;)Lja/a0;

    move-result-object p1

    iput-object p1, p0, Lj8/d;->e:Lja/a0;

    const/16 p1, 0x8

    new-array p1, p1, [Lea/c;

    iput-object p1, p0, Lj8/d;->i:[Ljava/lang/Object;

    const/4 p1, 0x7

    iput p1, p0, Lj8/d;->f:I

    return-void
.end method

.method public constructor <init>(Lj8/g;)V
    .locals 2

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lj8/d;->a:I

    .line 7
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lj8/d;->d:Ljava/util/ArrayList;

    const/16 v1, 0x8

    new-array v1, v1, [Lj8/c;

    iput-object v1, p0, Lj8/d;->i:[Ljava/lang/Object;

    const/4 v1, 0x7

    iput v1, p0, Lj8/d;->f:I

    iput v0, p0, Lj8/d;->g:I

    iput v0, p0, Lj8/d;->h:I

    const/16 v0, 0x1000

    iput v0, p0, Lj8/d;->b:I

    iput v0, p0, Lj8/d;->c:I

    .line 8
    invoke-static {p1}, Lr9/a;->c(Lja/g0;)Lja/a0;

    move-result-object p1

    iput-object p1, p0, Lj8/d;->e:Lja/a0;

    return-void
.end method

.method public constructor <init>(Lj8/g;I)V
    .locals 0

    const/4 p2, 0x0

    iput p2, p0, Lj8/d;->a:I

    .line 5
    invoke-direct {p0, p1}, Lj8/d;-><init>(Lj8/g;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget v0, p0, Lj8/d;->a:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lj8/d;->c:I

    iget v1, p0, Lj8/d;->h:I

    if-ge v0, v1, :cond_1

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lj8/d;->b()V

    goto :goto_0

    :cond_0
    sub-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lj8/d;->d(I)I

    :cond_1
    :goto_0
    return-void

    :pswitch_0
    iget v0, p0, Lj8/d;->c:I

    iget v1, p0, Lj8/d;->h:I

    if-ge v0, v1, :cond_3

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lj8/d;->b()V

    goto :goto_1

    :cond_2
    sub-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lj8/d;->d(I)I

    :cond_3
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b()V
    .locals 3

    iget v0, p0, Lj8/d;->a:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lj8/d;->i:[Ljava/lang/Object;

    check-cast v0, [Lea/c;

    invoke-static {v0}, Lb9/b;->Q([Ljava/lang/Object;)V

    iget-object v0, p0, Lj8/d;->i:[Ljava/lang/Object;

    check-cast v0, [Lea/c;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lj8/d;->f:I

    iput v1, p0, Lj8/d;->g:I

    iput v1, p0, Lj8/d;->h:I

    return-void

    :pswitch_0
    iget-object v0, p0, Lj8/d;->i:[Ljava/lang/Object;

    check-cast v0, [Lj8/c;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, p0, Lj8/d;->i:[Ljava/lang/Object;

    check-cast v0, [Lj8/c;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lj8/d;->f:I

    iput v1, p0, Lj8/d;->g:I

    iput v1, p0, Lj8/d;->h:I

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c(I)I
    .locals 1

    iget v0, p0, Lj8/d;->a:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lj8/d;->f:I

    add-int/lit8 v0, v0, 0x1

    add-int/2addr v0, p1

    return v0

    :pswitch_0
    iget v0, p0, Lj8/d;->f:I

    add-int/lit8 v0, v0, 0x1

    add-int/2addr v0, p1

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d(I)I
    .locals 4

    iget v0, p0, Lj8/d;->a:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    if-lez p1, :cond_1

    iget-object v0, p0, Lj8/d;->i:[Ljava/lang/Object;

    check-cast v0, [Lea/c;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    iget v2, p0, Lj8/d;->f:I

    if-lt v0, v2, :cond_0

    if-lez p1, :cond_0

    iget-object v2, p0, Lj8/d;->i:[Ljava/lang/Object;

    check-cast v2, [Lea/c;

    aget-object v2, v2, v0

    invoke-static {v2}, Ld7/a;->j(Ljava/lang/Object;)V

    iget v2, v2, Lea/c;->c:I

    sub-int/2addr p1, v2

    iget v3, p0, Lj8/d;->h:I

    sub-int/2addr v3, v2

    iput v3, p0, Lj8/d;->h:I

    iget v2, p0, Lj8/d;->g:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Lj8/d;->g:I

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lj8/d;->i:[Ljava/lang/Object;

    check-cast p1, [Lea/c;

    add-int/lit8 v2, v2, 0x1

    add-int v0, v2, v1

    iget v3, p0, Lj8/d;->g:I

    invoke-static {p1, v2, p1, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lj8/d;->f:I

    add-int/2addr p1, v1

    iput p1, p0, Lj8/d;->f:I

    :cond_1
    return v1

    :pswitch_0
    if-lez p1, :cond_3

    iget-object v0, p0, Lj8/d;->i:[Ljava/lang/Object;

    check-cast v0, [Lj8/c;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    :goto_1
    iget v2, p0, Lj8/d;->f:I

    if-lt v0, v2, :cond_2

    if-lez p1, :cond_2

    iget-object v2, p0, Lj8/d;->i:[Ljava/lang/Object;

    check-cast v2, [Lj8/c;

    aget-object v2, v2, v0

    iget v2, v2, Lj8/c;->c:I

    sub-int/2addr p1, v2

    iget v3, p0, Lj8/d;->h:I

    sub-int/2addr v3, v2

    iput v3, p0, Lj8/d;->h:I

    iget v2, p0, Lj8/d;->g:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Lj8/d;->g:I

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lj8/d;->i:[Ljava/lang/Object;

    check-cast p1, [Lj8/c;

    add-int/lit8 v2, v2, 0x1

    add-int v0, v2, v1

    iget v3, p0, Lj8/d;->g:I

    invoke-static {p1, v2, p1, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lj8/d;->f:I

    add-int/2addr p1, v1

    iput p1, p0, Lj8/d;->f:I

    :cond_3
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final e(I)Lja/j;
    .locals 4

    iget v0, p0, Lj8/d;->a:I

    const-string v1, "Header index too large "

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1}, Lj8/d;->h(I)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lea/d;->a:[Lea/c;

    aget-object p1, v0, p1

    iget-object p1, p1, Lea/c;->a:Lja/j;

    goto :goto_0

    :cond_0
    sget-object v0, Lea/d;->a:[Lea/c;

    array-length v0, v0

    sub-int v0, p1, v0

    invoke-virtual {p0, v0}, Lj8/d;->c(I)I

    move-result v0

    if-ltz v0, :cond_1

    iget-object v2, p0, Lj8/d;->i:[Ljava/lang/Object;

    check-cast v2, [Lea/c;

    array-length v3, v2

    if-ge v0, v3, :cond_1

    aget-object p1, v2, v0

    invoke-static {p1}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object p1, p1, Lea/c;->a:Lja/j;

    :goto_0
    return-object p1

    :cond_1
    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-virtual {p0, p1}, Lj8/d;->h(I)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lj8/f;->b:[Lj8/c;

    aget-object p1, v0, p1

    iget-object p1, p1, Lj8/c;->a:Lja/j;

    goto :goto_1

    :cond_2
    sget-object v0, Lj8/f;->b:[Lj8/c;

    array-length v0, v0

    sub-int v0, p1, v0

    invoke-virtual {p0, v0}, Lj8/d;->c(I)I

    move-result v0

    if-ltz v0, :cond_3

    iget-object v2, p0, Lj8/d;->i:[Ljava/lang/Object;

    check-cast v2, [Lj8/c;

    array-length v3, v2

    if-ge v0, v3, :cond_3

    aget-object p1, v2, v0

    iget-object p1, p1, Lj8/c;->a:Lja/j;

    :goto_1
    return-object p1

    :cond_3
    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final f(Lea/c;)V
    .locals 6

    iget-object v0, p0, Lj8/d;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget v0, p0, Lj8/d;->c:I

    iget v1, p1, Lea/c;->c:I

    if-le v1, v0, :cond_0

    invoke-virtual {p0}, Lj8/d;->b()V

    return-void

    :cond_0
    iget v2, p0, Lj8/d;->h:I

    add-int/2addr v2, v1

    sub-int/2addr v2, v0

    invoke-virtual {p0, v2}, Lj8/d;->d(I)I

    iget v0, p0, Lj8/d;->g:I

    add-int/lit8 v0, v0, 0x1

    iget-object v2, p0, Lj8/d;->i:[Ljava/lang/Object;

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

    iget-object v2, p0, Lj8/d;->i:[Ljava/lang/Object;

    check-cast v2, [Lea/c;

    array-length v2, v2

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Lj8/d;->f:I

    iput-object v0, p0, Lj8/d;->i:[Ljava/lang/Object;

    :cond_1
    iget v0, p0, Lj8/d;->f:I

    add-int/lit8 v2, v0, -0x1

    iput v2, p0, Lj8/d;->f:I

    iget-object v2, p0, Lj8/d;->i:[Ljava/lang/Object;

    check-cast v2, [Lea/c;

    aput-object p1, v2, v0

    iget p1, p0, Lj8/d;->g:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lj8/d;->g:I

    iget p1, p0, Lj8/d;->h:I

    add-int/2addr p1, v1

    iput p1, p0, Lj8/d;->h:I

    return-void
.end method

.method public final g(Lj8/c;)V
    .locals 6

    iget-object v0, p0, Lj8/d;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget v0, p0, Lj8/d;->c:I

    iget v1, p1, Lj8/c;->c:I

    if-le v1, v0, :cond_0

    invoke-virtual {p0}, Lj8/d;->b()V

    return-void

    :cond_0
    iget v2, p0, Lj8/d;->h:I

    add-int/2addr v2, v1

    sub-int/2addr v2, v0

    invoke-virtual {p0, v2}, Lj8/d;->d(I)I

    iget v0, p0, Lj8/d;->g:I

    add-int/lit8 v0, v0, 0x1

    iget-object v2, p0, Lj8/d;->i:[Ljava/lang/Object;

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

    iget-object v2, p0, Lj8/d;->i:[Ljava/lang/Object;

    check-cast v2, [Lj8/c;

    array-length v2, v2

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Lj8/d;->f:I

    iput-object v0, p0, Lj8/d;->i:[Ljava/lang/Object;

    :cond_1
    iget v0, p0, Lj8/d;->f:I

    add-int/lit8 v2, v0, -0x1

    iput v2, p0, Lj8/d;->f:I

    iget-object v2, p0, Lj8/d;->i:[Ljava/lang/Object;

    check-cast v2, [Lj8/c;

    aput-object p1, v2, v0

    iget p1, p0, Lj8/d;->g:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lj8/d;->g:I

    iget p1, p0, Lj8/d;->h:I

    add-int/2addr p1, v1

    iput p1, p0, Lj8/d;->h:I

    return-void
.end method

.method public final h(I)Z
    .locals 3

    iget v0, p0, Lj8/d;->a:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    packed-switch v0, :pswitch_data_0

    if-ltz p1, :cond_0

    sget-object v0, Lea/d;->a:[Lea/c;

    array-length v0, v0

    sub-int/2addr v0, v2

    if-gt p1, v0, :cond_0

    move v1, v2

    :cond_0
    return v1

    :pswitch_0
    if-ltz p1, :cond_1

    sget-object v0, Lj8/f;->b:[Lj8/c;

    array-length v0, v0

    sub-int/2addr v0, v2

    if-gt p1, v0, :cond_1

    move v1, v2

    :cond_1
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final i()I
    .locals 2

    iget v0, p0, Lj8/d;->a:I

    iget-object v1, p0, Lj8/d;->e:Lja/a0;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {v1}, Lja/a0;->readByte()B

    move-result v0

    sget-object v1, Ly9/b;->a:[B

    and-int/lit16 v0, v0, 0xff

    return v0

    :pswitch_0
    invoke-virtual {v1}, Lja/a0;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final j()Lja/j;
    .locals 13

    iget v0, p0, Lj8/d;->a:I

    iget-object v1, p0, Lj8/d;->e:Lja/a0;

    const/16 v2, 0x7f

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/16 v5, 0x80

    const/16 v6, 0x8

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Lj8/d;->i()I

    move-result v0

    and-int/lit16 v7, v0, 0x80

    if-ne v7, v5, :cond_0

    goto :goto_0

    :cond_0
    move v4, v3

    :goto_0
    invoke-virtual {p0, v0, v2}, Lj8/d;->m(II)I

    move-result v0

    int-to-long v7, v0

    if-eqz v4, :cond_6

    new-instance v0, Lja/g;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sget-object v2, Lea/a0;->a:[I

    const-string v2, "source"

    invoke-static {v1, v2}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lea/a0;->c:Lk3/b;

    const-wide/16 v4, 0x0

    move-wide v9, v4

    move-object v5, v2

    move v4, v3

    :goto_1
    cmp-long v11, v9, v7

    if-gez v11, :cond_3

    invoke-virtual {v1}, Lja/a0;->readByte()B

    move-result v11

    sget-object v12, Ly9/b;->a:[B

    and-int/lit16 v11, v11, 0xff

    shl-int/lit8 v3, v3, 0x8

    or-int/2addr v3, v11

    add-int/lit8 v4, v4, 0x8

    :goto_2
    if-lt v4, v6, :cond_2

    add-int/lit8 v11, v4, -0x8

    ushr-int v11, v3, v11

    and-int/lit16 v11, v11, 0xff

    iget-object v5, v5, Lk3/b;->d:Ljava/lang/Object;

    check-cast v5, [Lk3/b;

    invoke-static {v5}, Ld7/a;->j(Ljava/lang/Object;)V

    aget-object v5, v5, v11

    invoke-static {v5}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v11, v5, Lk3/b;->d:Ljava/lang/Object;

    check-cast v11, [Lk3/b;

    if-nez v11, :cond_1

    iget v11, v5, Lk3/b;->b:I

    invoke-virtual {v0, v11}, Lja/g;->h0(I)V

    iget v5, v5, Lk3/b;->c:I

    sub-int/2addr v4, v5

    move-object v5, v2

    goto :goto_2

    :cond_1
    add-int/lit8 v4, v4, -0x8

    goto :goto_2

    :cond_2
    const-wide/16 v11, 0x1

    add-long/2addr v9, v11

    goto :goto_1

    :cond_3
    :goto_3
    if-lez v4, :cond_5

    rsub-int/lit8 v1, v4, 0x8

    shl-int v1, v3, v1

    and-int/lit16 v1, v1, 0xff

    iget-object v5, v5, Lk3/b;->d:Ljava/lang/Object;

    check-cast v5, [Lk3/b;

    invoke-static {v5}, Ld7/a;->j(Ljava/lang/Object;)V

    aget-object v1, v5, v1

    invoke-static {v1}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v5, v1, Lk3/b;->d:Ljava/lang/Object;

    check-cast v5, [Lk3/b;

    if-nez v5, :cond_5

    iget v5, v1, Lk3/b;->c:I

    if-le v5, v4, :cond_4

    goto :goto_4

    :cond_4
    iget v5, v1, Lk3/b;->b:I

    invoke-virtual {v0, v5}, Lja/g;->h0(I)V

    iget v1, v1, Lk3/b;->c:I

    sub-int/2addr v4, v1

    move-object v5, v2

    goto :goto_3

    :cond_5
    :goto_4
    iget-wide v1, v0, Lja/g;->b:J

    invoke-virtual {v0, v1, v2}, Lja/g;->i(J)Lja/j;

    move-result-object v0

    goto :goto_5

    :cond_6
    invoke-virtual {v1, v7, v8}, Lja/a0;->i(J)Lja/j;

    move-result-object v0

    :goto_5
    return-object v0

    :pswitch_0
    invoke-virtual {p0}, Lj8/d;->i()I

    move-result v0

    and-int/lit16 v7, v0, 0x80

    if-ne v7, v5, :cond_7

    goto :goto_6

    :cond_7
    move v4, v3

    :goto_6
    invoke-virtual {p0, v0, v2}, Lj8/d;->m(II)I

    move-result v0

    if-eqz v4, :cond_d

    sget-object v2, Lj8/l;->d:Lj8/l;

    int-to-long v4, v0

    invoke-virtual {v1, v4, v5}, Lja/a0;->S(J)V

    iget-object v0, v1, Lja/a0;->b:Lja/g;

    invoke-virtual {v0, v4, v5}, Lja/g;->M(J)[B

    move-result-object v0

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iget-object v2, v2, Lj8/l;->a:Lk3/b;

    move-object v7, v2

    move v4, v3

    move v5, v4

    :goto_7
    array-length v8, v0

    if-ge v3, v8, :cond_a

    aget-byte v8, v0, v3

    and-int/lit16 v8, v8, 0xff

    shl-int/lit8 v4, v4, 0x8

    or-int/2addr v4, v8

    add-int/lit8 v5, v5, 0x8

    :goto_8
    if-lt v5, v6, :cond_9

    add-int/lit8 v8, v5, -0x8

    ushr-int v8, v4, v8

    and-int/lit16 v8, v8, 0xff

    iget-object v7, v7, Lk3/b;->d:Ljava/lang/Object;

    check-cast v7, [Lk3/b;

    aget-object v7, v7, v8

    iget-object v8, v7, Lk3/b;->d:Ljava/lang/Object;

    check-cast v8, [Lk3/b;

    if-nez v8, :cond_8

    iget v8, v7, Lk3/b;->b:I

    invoke-virtual {v1, v8}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget v7, v7, Lk3/b;->c:I

    sub-int/2addr v5, v7

    move-object v7, v2

    goto :goto_8

    :cond_8
    add-int/lit8 v5, v5, -0x8

    goto :goto_8

    :cond_9
    add-int/lit8 v3, v3, 0x1

    goto :goto_7

    :cond_a
    :goto_9
    if-lez v5, :cond_c

    rsub-int/lit8 v0, v5, 0x8

    shl-int v0, v4, v0

    and-int/lit16 v0, v0, 0xff

    iget-object v3, v7, Lk3/b;->d:Ljava/lang/Object;

    check-cast v3, [Lk3/b;

    aget-object v0, v3, v0

    iget-object v3, v0, Lk3/b;->d:Ljava/lang/Object;

    check-cast v3, [Lk3/b;

    if-nez v3, :cond_c

    iget v3, v0, Lk3/b;->c:I

    if-le v3, v5, :cond_b

    goto :goto_a

    :cond_b
    iget v3, v0, Lk3/b;->b:I

    invoke-virtual {v1, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget v0, v0, Lk3/b;->c:I

    sub-int/2addr v5, v0

    move-object v7, v2

    goto :goto_9

    :cond_c
    :goto_a
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    invoke-static {v0}, Lja/j;->l([B)Lja/j;

    move-result-object v0

    goto :goto_b

    :cond_d
    int-to-long v2, v0

    invoke-virtual {v1, v2, v3}, Lja/a0;->i(J)Lja/j;

    move-result-object v0

    :goto_b
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final k()V
    .locals 14

    iget v0, p0, Lj8/d;->a:I

    const-string v1, "index == 0"

    const/16 v2, 0xf

    const/16 v3, 0x10

    const-string v4, "Invalid dynamic table size update "

    const/16 v5, 0x1f

    const/16 v6, 0x3f

    const/16 v7, 0x7f

    iget-object v8, p0, Lj8/d;->e:Lja/a0;

    const/16 v9, 0x20

    const/16 v10, 0x40

    const/16 v11, 0x80

    packed-switch v0, :pswitch_data_0

    :goto_0
    invoke-virtual {v8}, Lja/a0;->B()Z

    move-result v0

    if-nez v0, :cond_8

    invoke-virtual {v8}, Lja/a0;->readByte()B

    move-result v0

    sget-object v12, Ly9/b;->a:[B

    and-int/lit16 v12, v0, 0xff

    if-eq v12, v11, :cond_7

    and-int/lit16 v13, v0, 0x80

    if-ne v13, v11, :cond_0

    invoke-virtual {p0, v12, v7}, Lj8/d;->m(II)I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Lj8/d;->l(I)V

    goto :goto_0

    :cond_0
    if-ne v12, v10, :cond_1

    invoke-virtual {p0}, Lj8/d;->o()V

    goto :goto_0

    :cond_1
    and-int/lit8 v13, v0, 0x40

    if-ne v13, v10, :cond_2

    invoke-virtual {p0, v12, v6}, Lj8/d;->m(II)I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Lj8/d;->n(I)V

    goto :goto_0

    :cond_2
    and-int/lit8 v0, v0, 0x20

    if-ne v0, v9, :cond_4

    invoke-virtual {p0, v12, v5}, Lj8/d;->m(II)I

    move-result v0

    iput v0, p0, Lj8/d;->c:I

    if-ltz v0, :cond_3

    iget v12, p0, Lj8/d;->b:I

    if-gt v0, v12, :cond_3

    invoke-virtual {p0}, Lj8/d;->a()V

    goto :goto_0

    :cond_3
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lj8/d;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    if-eq v12, v3, :cond_6

    if-nez v12, :cond_5

    goto :goto_1

    :cond_5
    invoke-virtual {p0, v12, v2}, Lj8/d;->m(II)I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Lj8/d;->p(I)V

    goto :goto_0

    :cond_6
    :goto_1
    invoke-virtual {p0}, Lj8/d;->q()V

    goto :goto_0

    :cond_7
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    return-void

    :goto_2
    :pswitch_0
    invoke-virtual {v8}, Lja/a0;->B()Z

    move-result v0

    if-nez v0, :cond_11

    invoke-virtual {v8}, Lja/a0;->readByte()B

    move-result v0

    and-int/lit16 v12, v0, 0xff

    if-eq v12, v11, :cond_10

    and-int/lit16 v13, v0, 0x80

    if-ne v13, v11, :cond_9

    invoke-virtual {p0, v12, v7}, Lj8/d;->m(II)I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Lj8/d;->l(I)V

    goto :goto_2

    :cond_9
    if-ne v12, v10, :cond_a

    invoke-virtual {p0}, Lj8/d;->o()V

    goto :goto_2

    :cond_a
    and-int/lit8 v13, v0, 0x40

    if-ne v13, v10, :cond_b

    invoke-virtual {p0, v12, v6}, Lj8/d;->m(II)I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Lj8/d;->n(I)V

    goto :goto_2

    :cond_b
    and-int/lit8 v0, v0, 0x20

    if-ne v0, v9, :cond_d

    invoke-virtual {p0, v12, v5}, Lj8/d;->m(II)I

    move-result v0

    iput v0, p0, Lj8/d;->c:I

    if-ltz v0, :cond_c

    iget v12, p0, Lj8/d;->b:I

    if-gt v0, v12, :cond_c

    invoke-virtual {p0}, Lj8/d;->a()V

    goto :goto_2

    :cond_c
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lj8/d;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    if-eq v12, v3, :cond_f

    if-nez v12, :cond_e

    goto :goto_3

    :cond_e
    invoke-virtual {p0, v12, v2}, Lj8/d;->m(II)I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Lj8/d;->p(I)V

    goto :goto_2

    :cond_f
    :goto_3
    invoke-virtual {p0}, Lj8/d;->q()V

    goto :goto_2

    :cond_10
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_11
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final l(I)V
    .locals 5

    iget-object v0, p0, Lj8/d;->d:Ljava/util/ArrayList;

    iget v1, p0, Lj8/d;->a:I

    const-string v2, "Header index too large "

    packed-switch v1, :pswitch_data_0

    invoke-virtual {p0, p1}, Lj8/d;->h(I)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lea/d;->a:[Lea/c;

    aget-object p1, v1, p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    sget-object v1, Lea/d;->a:[Lea/c;

    array-length v1, v1

    sub-int v1, p1, v1

    invoke-virtual {p0, v1}, Lj8/d;->c(I)I

    move-result v1

    if-ltz v1, :cond_1

    iget-object v3, p0, Lj8/d;->i:[Ljava/lang/Object;

    check-cast v3, [Lea/c;

    array-length v4, v3

    if-ge v1, v4, :cond_1

    aget-object p1, v3, v1

    invoke-static {p1}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    return-void

    :cond_1
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-virtual {p0, p1}, Lj8/d;->h(I)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v1, Lj8/f;->b:[Lj8/c;

    aget-object p1, v1, p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    sget-object v1, Lj8/f;->b:[Lj8/c;

    array-length v1, v1

    sub-int v1, p1, v1

    invoke-virtual {p0, v1}, Lj8/d;->c(I)I

    move-result v1

    if-ltz v1, :cond_3

    iget-object v3, p0, Lj8/d;->i:[Ljava/lang/Object;

    check-cast v3, [Lj8/c;

    array-length v4, v3

    add-int/lit8 v4, v4, -0x1

    if-gt v1, v4, :cond_3

    aget-object p1, v3, v1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    return-void

    :cond_3
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final m(II)I
    .locals 2

    iget v0, p0, Lj8/d;->a:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    and-int/2addr p1, p2

    if-ge p1, p2, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {p0}, Lj8/d;->i()I

    move-result p1

    and-int/lit16 v0, p1, 0x80

    if-eqz v0, :cond_1

    and-int/lit8 p1, p1, 0x7f

    shl-int/2addr p1, v1

    add-int/2addr p2, p1

    add-int/lit8 v1, v1, 0x7

    goto :goto_0

    :cond_1
    shl-int/2addr p1, v1

    add-int/2addr p1, p2

    :goto_1
    return p1

    :pswitch_0
    and-int/2addr p1, p2

    if-ge p1, p2, :cond_2

    goto :goto_3

    :cond_2
    :goto_2
    invoke-virtual {p0}, Lj8/d;->i()I

    move-result p1

    and-int/lit16 v0, p1, 0x80

    if-eqz v0, :cond_3

    and-int/lit8 p1, p1, 0x7f

    shl-int/2addr p1, v1

    add-int/2addr p2, p1

    add-int/lit8 v1, v1, 0x7

    goto :goto_2

    :cond_3
    shl-int/2addr p1, v1

    add-int/2addr p1, p2

    :goto_3
    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final n(I)V
    .locals 2

    iget v0, p0, Lj8/d;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1}, Lj8/d;->e(I)Lja/j;

    move-result-object p1

    invoke-virtual {p0}, Lj8/d;->j()Lja/j;

    move-result-object v0

    new-instance v1, Lea/c;

    invoke-direct {v1, p1, v0}, Lea/c;-><init>(Lja/j;Lja/j;)V

    invoke-virtual {p0, v1}, Lj8/d;->f(Lea/c;)V

    return-void

    :pswitch_0
    invoke-virtual {p0, p1}, Lj8/d;->e(I)Lja/j;

    move-result-object p1

    invoke-virtual {p0}, Lj8/d;->j()Lja/j;

    move-result-object v0

    new-instance v1, Lj8/c;

    invoke-direct {v1, p1, v0}, Lj8/c;-><init>(Lja/j;Lja/j;)V

    invoke-virtual {p0, v1}, Lj8/d;->g(Lj8/c;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final o()V
    .locals 3

    iget v0, p0, Lj8/d;->a:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lea/d;->a:[Lea/c;

    invoke-virtual {p0}, Lj8/d;->j()Lja/j;

    move-result-object v0

    invoke-static {v0}, Lea/d;->a(Lja/j;)V

    invoke-virtual {p0}, Lj8/d;->j()Lja/j;

    move-result-object v1

    new-instance v2, Lea/c;

    invoke-direct {v2, v0, v1}, Lea/c;-><init>(Lja/j;Lja/j;)V

    invoke-virtual {p0, v2}, Lj8/d;->f(Lea/c;)V

    return-void

    :pswitch_0
    invoke-virtual {p0}, Lj8/d;->j()Lja/j;

    move-result-object v0

    invoke-static {v0}, Lj8/f;->a(Lja/j;)V

    invoke-virtual {p0}, Lj8/d;->j()Lja/j;

    move-result-object v1

    new-instance v2, Lj8/c;

    invoke-direct {v2, v0, v1}, Lj8/c;-><init>(Lja/j;Lja/j;)V

    invoke-virtual {p0, v2}, Lj8/d;->g(Lj8/c;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final p(I)V
    .locals 3

    iget-object v0, p0, Lj8/d;->d:Ljava/util/ArrayList;

    iget v1, p0, Lj8/d;->a:I

    packed-switch v1, :pswitch_data_0

    invoke-virtual {p0, p1}, Lj8/d;->e(I)Lja/j;

    move-result-object p1

    invoke-virtual {p0}, Lj8/d;->j()Lja/j;

    move-result-object v1

    new-instance v2, Lea/c;

    invoke-direct {v2, p1, v1}, Lea/c;-><init>(Lja/j;Lja/j;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :pswitch_0
    invoke-virtual {p0, p1}, Lj8/d;->e(I)Lja/j;

    move-result-object p1

    invoke-virtual {p0}, Lj8/d;->j()Lja/j;

    move-result-object v1

    new-instance v2, Lj8/c;

    invoke-direct {v2, p1, v1}, Lj8/c;-><init>(Lja/j;Lja/j;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final q()V
    .locals 4

    iget-object v0, p0, Lj8/d;->d:Ljava/util/ArrayList;

    iget v1, p0, Lj8/d;->a:I

    packed-switch v1, :pswitch_data_0

    sget-object v1, Lea/d;->a:[Lea/c;

    invoke-virtual {p0}, Lj8/d;->j()Lja/j;

    move-result-object v1

    invoke-static {v1}, Lea/d;->a(Lja/j;)V

    invoke-virtual {p0}, Lj8/d;->j()Lja/j;

    move-result-object v2

    new-instance v3, Lea/c;

    invoke-direct {v3, v1, v2}, Lea/c;-><init>(Lja/j;Lja/j;)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :pswitch_0
    invoke-virtual {p0}, Lj8/d;->j()Lja/j;

    move-result-object v1

    invoke-static {v1}, Lj8/f;->a(Lja/j;)V

    invoke-virtual {p0}, Lj8/d;->j()Lja/j;

    move-result-object v2

    new-instance v3, Lj8/c;

    invoke-direct {v3, v1, v2}, Lj8/c;-><init>(Lja/j;Lja/j;)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
