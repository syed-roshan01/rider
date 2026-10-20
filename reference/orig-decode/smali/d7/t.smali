.class public abstract Ld7/t;
.super Ljava/lang/Object;

# interfaces
.implements Ld7/u;


# direct methods
.method public static final A(II[I)V
    .locals 1

    if-ltz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lm0/s;->l(Z)V

    mul-int/lit8 p0, p0, 0x5

    add-int/lit8 p0, p0, 0x3

    aput p1, p2, p0

    return-void
.end method

.method public static final B(II[I)V
    .locals 2

    const/4 v0, 0x1

    if-ltz p1, :cond_0

    const v1, 0x3ffffff

    if-ge p1, v1, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lm0/s;->l(Z)V

    mul-int/lit8 p0, p0, 0x5

    add-int/2addr p0, v0

    aget v0, p2, p0

    const/high16 v1, -0x4000000

    and-int/2addr v0, v1

    or-int/2addr p1, v0

    aput p1, p2, p0

    return-void
.end method

.method public static C(Lk3/b;Z)I
    .locals 10

    if-eqz p1, :cond_0

    iget v0, p0, Lk3/b;->c:I

    goto :goto_0

    :cond_0
    iget v0, p0, Lk3/b;->b:I

    :goto_0
    if-eqz p1, :cond_1

    iget v1, p0, Lk3/b;->b:I

    goto :goto_1

    :cond_1
    iget v1, p0, Lk3/b;->c:I

    :goto_1
    iget-object p0, p0, Lk3/b;->d:Ljava/lang/Object;

    check-cast p0, [[B

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    :goto_2
    if-ge v3, v0, :cond_7

    const/4 v5, -0x1

    move v6, v2

    move v7, v6

    :goto_3
    const/4 v8, 0x5

    if-ge v6, v1, :cond_5

    if-eqz p1, :cond_2

    aget-object v9, p0, v3

    aget-byte v9, v9, v6

    goto :goto_4

    :cond_2
    aget-object v9, p0, v6

    aget-byte v9, v9, v3

    :goto_4
    if-ne v9, v5, :cond_3

    add-int/lit8 v7, v7, 0x1

    goto :goto_5

    :cond_3
    if-lt v7, v8, :cond_4

    add-int/lit8 v7, v7, -0x2

    add-int/2addr v4, v7

    :cond_4
    const/4 v5, 0x1

    move v7, v5

    move v5, v9

    :goto_5
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_5
    if-lt v7, v8, :cond_6

    add-int/lit8 v7, v7, -0x2

    add-int/2addr v7, v4

    move v4, v7

    :cond_6
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_7
    return v4
.end method

.method public static varargs D([Ljava/lang/Object;)Ljava/util/ArrayList;
    .locals 3

    array-length v0, p0

    if-nez v0, :cond_0

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    new-instance v1, Lr8/k;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lr8/k;-><init>([Ljava/lang/Object;Z)V

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method

.method public static final E(Lo9/r;Lc9/a;Lu8/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lo9/p;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lo9/p;

    iget v1, v0, Lo9/p;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lo9/p;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lo9/p;

    invoke-direct {v0, p2}, Lw8/c;-><init>(Lu8/e;)V

    :goto_0
    iget-object p2, v0, Lo9/p;->b:Ljava/lang/Object;

    sget-object v1, Lv8/a;->a:Lv8/a;

    iget v2, v0, Lo9/p;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lo9/p;->a:Lc9/a;

    :try_start_0
    invoke-static {p2}, Ld7/t;->v0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Ld7/t;->v0(Ljava/lang/Object;)V

    invoke-interface {v0}, Lu8/e;->getContext()Lu8/j;

    move-result-object p2

    sget-object v2, Lm9/a0;->b:Lm9/a0;

    invoke-interface {p2, v2}, Lu8/j;->f(Lu8/i;)Lu8/h;

    move-result-object p2

    if-ne p2, p0, :cond_4

    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, v0, Lo9/p;->a:Lc9/a;

    iput v3, v0, Lo9/p;->c:I

    new-instance p2, Lm9/l;

    invoke-static {v0}, Ld7/t;->b0(Lu8/e;)Lu8/e;

    move-result-object v0

    invoke-direct {p2, v3, v0}, Lm9/l;-><init>(ILu8/e;)V

    invoke-virtual {p2}, Lm9/l;->t()V

    new-instance v0, Lh1/b;

    const/16 v2, 0x11

    invoke-direct {v0, p2, v2}, Lh1/b;-><init>(Ljava/lang/Object;I)V

    check-cast p0, Lo9/q;

    invoke-virtual {p0, v0}, Lo9/q;->c(Lh1/b;)V

    invoke-virtual {p2}, Lm9/l;->s()Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    invoke-interface {p1}, Lc9/a;->invoke()Ljava/lang/Object;

    sget-object p0, Lq8/l;->a:Lq8/l;

    return-object p0

    :goto_2
    invoke-interface {p1}, Lc9/a;->invoke()Ljava/lang/Object;

    throw p0

    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "awaitClose() can only be invoked from the producer context"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static F(Ljava/util/ArrayList;Ljava/lang/Comparable;)I
    .locals 4

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const-string v1, "<this>"

    invoke-static {p0, v1}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    const-string v3, ")."

    if-ltz v0, :cond_4

    if-gt v0, v1, :cond_3

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-gt v2, v0, :cond_1

    add-int v1, v2, v0

    ushr-int/lit8 v1, v1, 0x1

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Comparable;

    invoke-static {v3, p1}, Ld7/t;->J(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result v3

    if-gez v3, :cond_0

    add-int/lit8 v2, v1, 0x1

    goto :goto_0

    :cond_0
    if-lez v3, :cond_2

    add-int/lit8 v0, v1, -0x1

    goto :goto_0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    neg-int v1, v2

    :cond_2
    return v1

    :cond_3
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v2, "toIndex ("

    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ") is greater than size ("

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "fromIndex ("

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ") is greater than toIndex ("

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final G(II)I
    .locals 0

    rem-int/lit8 p1, p1, 0xa

    mul-int/lit8 p1, p1, 0x3

    add-int/lit8 p1, p1, 0x1

    shl-int/2addr p0, p1

    return p0
.end method

.method public static H(Z)V
    .locals 0

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

.method public static final I(Lp9/z;Lm0/m;)Lm0/g1;
    .locals 6

    check-cast p1, Lm0/q;

    const v0, -0x55d2e28f

    invoke-virtual {p1, v0}, Lm0/q;->Z(I)V

    sget-object v0, Lu8/k;->a:Lu8/k;

    iget-object v1, p0, Lp9/z;->a:Lp9/o0;

    invoke-interface {v1}, Lp9/o0;->getValue()Ljava/lang/Object;

    move-result-object v1

    const v2, -0x24285d4a

    invoke-virtual {p1, v2}, Lm0/q;->Z(I)V

    new-instance v2, Lm0/f3;

    const/4 v3, 0x0

    invoke-direct {v2, v0, p0, v3}, Lm0/f3;-><init>(Lu8/j;Lp9/f;Lu8/e;)V

    const v4, -0x65844c3d

    invoke-virtual {p1, v4}, Lm0/q;->Z(I)V

    const v4, -0x1d58f75c

    invoke-virtual {p1, v4}, Lm0/q;->Z(I)V

    invoke-virtual {p1}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Lm0/l;->a:Lk0/y0;

    if-ne v4, v5, :cond_0

    sget-object v4, Lm0/o3;->a:Lm0/o3;

    invoke-static {v1, v4}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object v4

    invoke-virtual {p1, v4}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lm0/q;->t(Z)V

    check-cast v4, Lm0/g1;

    new-instance v5, Lm0/c3;

    invoke-direct {v5, v2, v4, v3}, Lm0/c3;-><init>(Lc9/e;Lm0/g1;Lu8/e;)V

    invoke-static {p0, v0, v5, p1}, Lm0/s;->c(Ljava/lang/Object;Ljava/lang/Object;Lc9/e;Lm0/m;)V

    invoke-virtual {p1, v1}, Lm0/q;->t(Z)V

    invoke-virtual {p1, v1}, Lm0/q;->t(Z)V

    invoke-virtual {p1, v1}, Lm0/q;->t(Z)V

    return-object v4
.end method

.method public static J(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    if-nez p0, :cond_1

    const/4 p0, -0x1

    return p0

    :cond_1
    if-nez p1, :cond_2

    const/4 p0, 0x1

    return p0

    :cond_2
    invoke-interface {p0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static final K(Lm0/m;ILd9/j;)Lu0/b;
    .locals 6

    const/4 v0, 0x1

    invoke-static {p1, v0}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v1

    check-cast p0, Lm0/q;

    invoke-virtual {p0, v1}, Lm0/q;->Z(I)V

    invoke-virtual {p0}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lm0/l;->a:Lk0/y0;

    const/4 v3, 0x0

    if-ne v1, v2, :cond_0

    new-instance v1, Lu0/b;

    invoke-direct {v1, p1, p2, v0}, Lu0/b;-><init>(ILd9/j;Z)V

    invoke-virtual {p0, v1}, Lm0/q;->l0(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    const-string p1, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl"

    invoke-static {v1, p1}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lu0/b;

    iget-object p1, v1, Lu0/b;->c:Ljava/lang/Object;

    invoke-static {p1, p2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    iget-object p1, v1, Lu0/b;->c:Ljava/lang/Object;

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    move v0, v3

    :goto_0
    iput-object p2, v1, Lu0/b;->c:Ljava/lang/Object;

    if-nez v0, :cond_6

    iget-boolean p1, v1, Lu0/b;->b:Z

    if-eqz p1, :cond_6

    iget-object p1, v1, Lu0/b;->d:Lm0/x1;

    const/4 p2, 0x0

    if-eqz p1, :cond_3

    iget-object v0, p1, Lm0/x1;->b:Lm0/y1;

    if-eqz v0, :cond_2

    invoke-interface {v0, p1, p2}, Lm0/y1;->c(Lm0/x1;Ljava/lang/Object;)I

    :cond_2
    iput-object p2, v1, Lu0/b;->d:Lm0/x1;

    :cond_3
    iget-object p1, v1, Lu0/b;->e:Ljava/util/ArrayList;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    move v2, v3

    :goto_1
    if-ge v2, v0, :cond_5

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lm0/w1;

    check-cast v4, Lm0/x1;

    iget-object v5, v4, Lm0/x1;->b:Lm0/y1;

    if-eqz v5, :cond_4

    invoke-interface {v5, v4, p2}, Lm0/y1;->c(Lm0/x1;Ljava/lang/Object;)I

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_5
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    :cond_6
    :goto_2
    invoke-virtual {p0, v3}, Lm0/q;->t(Z)V

    return-object v1
.end method

.method public static final L(I)I
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x2

    packed-switch p0, :pswitch_data_0

    const/4 v0, 0x3

    goto :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_0

    :pswitch_1
    const/4 v0, 0x0

    :goto_0
    :pswitch_2
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static M(Ljava/lang/Object;Lu8/e;Lc9/e;)Lu8/e;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p2, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completion"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lw8/a;

    if-eqz v0, :cond_0

    check-cast p2, Lw8/a;

    invoke-virtual {p2, p0, p1}, Lw8/a;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lu8/e;->getContext()Lu8/j;

    move-result-object v0

    sget-object v1, Lu8/k;->a:Lu8/k;

    if-ne v0, v1, :cond_1

    new-instance v0, Lv8/b;

    invoke-direct {v0, p0, p1, p2}, Lv8/b;-><init>(Ljava/lang/Object;Lu8/e;Lc9/e;)V

    move-object p0, v0

    goto :goto_0

    :cond_1
    new-instance v1, Lv8/c;

    invoke-direct {v1, p1, v0, p2, p0}, Lv8/c;-><init>(Lu8/e;Lu8/j;Lc9/e;Ljava/lang/Object;)V

    move-object p0, v1

    :goto_0
    return-object p0
.end method

.method public static final N(Ljava/lang/Throwable;)Lq8/g;
    .locals 1

    const-string v0, "exception"

    invoke-static {p0, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lq8/g;

    invoke-direct {v0, p0}, Lq8/g;-><init>(Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static final O(Lb1/d;F)Le1/y;
    .locals 22

    move-object/from16 v0, p0

    move/from16 v3, p1

    float-to-double v1, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v1

    double-to-float v1, v1

    float-to-int v1, v1

    mul-int/lit8 v1, v1, 0x2

    sget-object v2, Lf6/a;->e:Le1/y;

    sget-object v4, Lf6/a;->f:Le1/p;

    sget-object v5, Lf6/a;->g:Lg1/c;

    if-eqz v2, :cond_1

    if-eqz v4, :cond_1

    move-object v6, v2

    check-cast v6, Le1/f;

    iget-object v6, v6, Le1/f;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    if-gt v1, v7, :cond_1

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    if-le v1, v6, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-object v8, v2

    move-object v9, v4

    goto :goto_2

    :cond_1
    :goto_1
    const/4 v2, 0x1

    invoke-static {v1, v1, v2}, Landroidx/compose/ui/graphics/a;->e(III)Le1/f;

    move-result-object v2

    sput-object v2, Lf6/a;->e:Le1/y;

    sget-object v1, Le1/e;->a:Landroid/graphics/Canvas;

    new-instance v4, Le1/d;

    invoke-direct {v4}, Le1/d;-><init>()V

    new-instance v1, Landroid/graphics/Canvas;

    invoke-static {v2}, Landroidx/compose/ui/graphics/a;->i(Le1/y;)Landroid/graphics/Bitmap;

    move-result-object v6

    invoke-direct {v1, v6}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iput-object v1, v4, Le1/d;->a:Landroid/graphics/Canvas;

    sput-object v4, Lf6/a;->f:Le1/p;

    goto :goto_0

    :goto_2
    if-nez v5, :cond_2

    new-instance v1, Lg1/c;

    invoke-direct {v1}, Lg1/c;-><init>()V

    sput-object v1, Lf6/a;->g:Lg1/c;

    goto :goto_3

    :cond_2
    move-object v1, v5

    :goto_3
    iget-object v2, v0, Lb1/d;->a:Lb1/a;

    invoke-interface {v2}, Lb1/a;->getLayoutDirection()Lm2/l;

    move-result-object v2

    move-object v4, v8

    check-cast v4, Le1/f;

    iget-object v4, v4, Le1/f;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    int-to-float v5, v5

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    int-to-float v4, v4

    invoke-static {v5, v4}, Ld7/t;->j(FF)J

    move-result-wide v4

    iget-object v7, v1, Lg1/c;->a:Lg1/a;

    iget-object v6, v7, Lg1/a;->a:Lm2/b;

    iget-object v15, v7, Lg1/a;->b:Lm2/l;

    iget-object v13, v7, Lg1/a;->c:Le1/p;

    iget-wide v11, v7, Lg1/a;->d:J

    iput-object v0, v7, Lg1/a;->a:Lm2/b;

    iput-object v2, v7, Lg1/a;->b:Lm2/l;

    iput-object v9, v7, Lg1/a;->c:Le1/p;

    iput-wide v4, v7, Lg1/a;->d:J

    invoke-interface {v9}, Le1/p;->j()V

    sget-wide v4, Le1/r;->b:J

    const-wide/16 v16, 0x0

    invoke-interface {v1}, Lg1/g;->e()J

    move-result-wide v18

    const/16 v0, 0x3a

    move-object v10, v1

    move-wide/from16 v20, v11

    move-wide v11, v4

    move-object v4, v13

    move-wide/from16 v13, v16

    move-object v5, v15

    move-wide/from16 v15, v18

    move/from16 v17, v0

    invoke-static/range {v10 .. v17}, Lg1/g;->U(Lg1/g;JJJI)V

    const-wide v18, 0xff000000L

    invoke-static/range {v18 .. v19}, Landroidx/compose/ui/graphics/a;->c(J)J

    move-result-wide v11

    sget-wide v13, Ld1/c;->b:J

    invoke-static {v3, v3}, Ld7/t;->j(FF)J

    move-result-wide v15

    const/16 v17, 0x78

    move-object v10, v1

    invoke-static/range {v10 .. v17}, Lg1/g;->U(Lg1/g;JJJI)V

    invoke-static/range {v18 .. v19}, Landroidx/compose/ui/graphics/a;->c(J)J

    move-result-wide v10

    invoke-static {v3, v3}, Ld9/i;->f(FF)J

    move-result-wide v12

    const/4 v14, 0x0

    const/16 v15, 0x78

    move-object v0, v1

    move-wide v1, v10

    move/from16 v3, p1

    move-object v11, v4

    move-object v10, v5

    move-wide v4, v12

    move-object v12, v6

    move-object v6, v14

    move-object v13, v7

    move v7, v15

    invoke-static/range {v0 .. v7}, Lg1/g;->K(Lg1/g;JFJLg1/h;I)V

    invoke-interface {v9}, Le1/p;->h()V

    iput-object v12, v13, Lg1/a;->a:Lm2/b;

    iput-object v10, v13, Lg1/a;->b:Lm2/l;

    iput-object v11, v13, Lg1/a;->c:Le1/p;

    move-wide/from16 v0, v20

    iput-wide v0, v13, Lg1/a;->d:J

    return-object v8
.end method

.method public static final P(JLu8/e;)Ljava/lang/Object;
    .locals 4

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    sget-object v1, Lq8/l;->a:Lq8/l;

    if-gtz v0, :cond_0

    return-object v1

    :cond_0
    new-instance v0, Lm9/l;

    invoke-static {p2}, Ld7/t;->b0(Lu8/e;)Lu8/e;

    move-result-object p2

    const/4 v2, 0x1

    invoke-direct {v0, v2, p2}, Lm9/l;-><init>(ILu8/e;)V

    invoke-virtual {v0}, Lm9/l;->t()V

    const-wide v2, 0x7fffffffffffffffL

    cmp-long p2, p0, v2

    if-gez p2, :cond_1

    iget-object p2, v0, Lm9/l;->e:Lu8/j;

    invoke-static {p2}, Ld7/t;->W(Lu8/j;)Lm9/j0;

    move-result-object p2

    invoke-interface {p2, p0, p1, v0}, Lm9/j0;->M(JLm9/l;)V

    :cond_1
    invoke-virtual {v0}, Lm9/l;->s()Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lv8/a;->a:Lv8/a;

    if-ne p0, p1, :cond_2

    return-object p0

    :cond_2
    return-object v1
.end method

.method public static final Q()Lo0/i;
    .locals 3

    sget-object v0, Lm0/a3;->b:Lm0/h3;

    invoke-virtual {v0}, Lm0/h3;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo0/i;

    if-nez v1, :cond_0

    new-instance v1, Lo0/i;

    const/4 v2, 0x0

    new-array v2, v2, [Lm0/l0;

    invoke-direct {v1, v2}, Lo0/i;-><init>([Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lm0/h3;->b(Ljava/lang/Object;)V

    :cond_0
    return-object v1
.end method

.method public static final R(Lc9/a;)Lm0/j0;
    .locals 2

    sget-object v0, Lm0/a3;->a:Lm0/h3;

    new-instance v0, Lm0/j0;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lm0/j0;-><init>(Lm0/z2;Lc9/a;)V

    return-object v0
.end method

.method public static final S(Lm0/z2;Lc9/a;)Lm0/j0;
    .locals 1

    sget-object v0, Lm0/a3;->a:Lm0/h3;

    new-instance v0, Lm0/j0;

    invoke-direct {v0, p0, p1}, Lm0/j0;-><init>(Lm0/z2;Lc9/a;)V

    return-object v0
.end method

.method public static final T(ILjava/lang/String;)I
    .locals 4

    invoke-static {}, Li3/l;->c()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {}, Li3/l;->a()Li3/l;

    move-result-object v0

    invoke-virtual {v0}, Li3/l;->b()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_2

    iget-object v0, v0, Li3/l;->e:Li3/g;

    invoke-virtual {v0, p0, p1}, Li3/g;->O(ILjava/lang/CharSequence;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_1

    goto :goto_1

    :cond_1
    move-object v1, v0

    :cond_2
    :goto_1
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0

    :cond_3
    invoke-static {}, Ljava/text/BreakIterator;->getCharacterInstance()Ljava/text/BreakIterator;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/text/BreakIterator;->setText(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/text/BreakIterator;->following(I)I

    move-result p0

    return p0
.end method

.method public static final U(ILjava/lang/String;)I
    .locals 4

    invoke-static {}, Li3/l;->c()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {}, Li3/l;->a()Li3/l;

    move-result-object v0

    invoke-virtual {v0}, Li3/l;->b()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_2

    add-int/lit8 v2, p0, -0x1

    const/4 v3, 0x0

    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    iget-object v0, v0, Li3/l;->e:Li3/g;

    invoke-virtual {v0, v2, p1}, Li3/g;->P(ILjava/lang/CharSequence;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_1

    goto :goto_1

    :cond_1
    move-object v1, v0

    :cond_2
    :goto_1
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0

    :cond_3
    invoke-static {}, Ljava/text/BreakIterator;->getCharacterInstance()Ljava/text/BreakIterator;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/text/BreakIterator;->setText(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/text/BreakIterator;->preceding(I)I

    move-result p0

    return p0
.end method

.method public static final V(J)J
    .locals 2

    invoke-static {p0, p1}, Ld1/f;->d(J)F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    invoke-static {p0, p1}, Ld1/f;->b(J)F

    move-result p0

    div-float/2addr p0, v1

    invoke-static {v0, p0}, Ld9/i;->f(FF)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final W(Lu8/j;)Lm9/j0;
    .locals 1

    sget-object v0, Lu8/f;->a:Lu8/f;

    invoke-interface {p0, v0}, Lu8/j;->f(Lu8/i;)Lu8/h;

    move-result-object p0

    instance-of v0, p0, Lm9/j0;

    if-eqz v0, :cond_0

    check-cast p0, Lm9/j0;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    sget-object p0, Lm9/g0;->a:Lm9/j0;

    :cond_1
    return-object p0
.end method

.method public static final X(Lj9/b;)Ljava/lang/Class;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ld9/d;

    invoke-interface {p0}, Ld9/d;->a()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v1, "short"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    const-class p0, Ljava/lang/Short;

    goto/16 :goto_0

    :sswitch_1
    const-string v1, "float"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const-class p0, Ljava/lang/Float;

    goto :goto_0

    :sswitch_2
    const-string v1, "boolean"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const-class p0, Ljava/lang/Boolean;

    goto :goto_0

    :sswitch_3
    const-string v1, "void"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    const-class p0, Ljava/lang/Void;

    goto :goto_0

    :sswitch_4
    const-string v1, "long"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    const-class p0, Ljava/lang/Long;

    goto :goto_0

    :sswitch_5
    const-string v1, "char"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_0

    :cond_6
    const-class p0, Ljava/lang/Character;

    goto :goto_0

    :sswitch_6
    const-string v1, "byte"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_0

    :cond_7
    const-class p0, Ljava/lang/Byte;

    goto :goto_0

    :sswitch_7
    const-string v1, "int"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_0

    :cond_8
    const-class p0, Ljava/lang/Integer;

    goto :goto_0

    :sswitch_8
    const-string v1, "double"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_0

    :cond_9
    const-class p0, Ljava/lang/Double;

    :goto_0
    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x4f08842f -> :sswitch_8
        0x197ef -> :sswitch_7
        0x2e6108 -> :sswitch_6
        0x2e9356 -> :sswitch_5
        0x32c67c -> :sswitch_4
        0x375194 -> :sswitch_3
        0x3db6c28 -> :sswitch_2
        0x5d0225c -> :sswitch_1
        0x685847c -> :sswitch_0
    .end sparse-switch
.end method

.method public static Y(Ljava/util/List;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    return p0
.end method

.method public static final Z(III)I
    .locals 1

    if-lez p2, :cond_4

    if-lt p0, p1, :cond_0

    goto :goto_6

    :cond_0
    rem-int v0, p1, p2

    if-ltz v0, :cond_1

    goto :goto_0

    :cond_1
    add-int/2addr v0, p2

    :goto_0
    rem-int/2addr p0, p2

    if-ltz p0, :cond_2

    goto :goto_1

    :cond_2
    add-int/2addr p0, p2

    :goto_1
    sub-int/2addr v0, p0

    rem-int/2addr v0, p2

    if-ltz v0, :cond_3

    goto :goto_2

    :cond_3
    add-int/2addr v0, p2

    :goto_2
    sub-int/2addr p1, v0

    goto :goto_6

    :cond_4
    if-gez p2, :cond_9

    if-gt p0, p1, :cond_5

    goto :goto_6

    :cond_5
    neg-int p2, p2

    rem-int/2addr p0, p2

    if-ltz p0, :cond_6

    goto :goto_3

    :cond_6
    add-int/2addr p0, p2

    :goto_3
    rem-int v0, p1, p2

    if-ltz v0, :cond_7

    goto :goto_4

    :cond_7
    add-int/2addr v0, p2

    :goto_4
    sub-int/2addr p0, v0

    rem-int/2addr p0, p2

    if-ltz p0, :cond_8

    goto :goto_5

    :cond_8
    add-int/2addr p0, p2

    :goto_5
    add-int/2addr p1, p0

    :goto_6
    return p1

    :cond_9
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Step is zero."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final a(ZLc9/a;Lm0/m;II)V
    .locals 6

    check-cast p2, Lm0/q;

    const v0, -0x158b58d6

    invoke-virtual {p2, v0}, Lm0/q;->a0(I)Lm0/q;

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, p3, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, p3, 0xe

    if-nez v1, :cond_2

    invoke-virtual {p2, p0}, Lm0/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p3

    goto :goto_1

    :cond_2
    move v1, p3

    :goto_1
    and-int/lit8 v2, p4, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v2, p3, 0x70

    if-nez v2, :cond_5

    invoke-virtual {p2, p1}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x20

    goto :goto_2

    :cond_4
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_5
    :goto_3
    and-int/lit8 v1, v1, 0x5b

    const/16 v2, 0x12

    if-ne v1, v2, :cond_7

    invoke-virtual {p2}, Lm0/q;->G()Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {p2}, Lm0/q;->U()V

    goto/16 :goto_7

    :cond_7
    :goto_4
    if-eqz v0, :cond_8

    const/4 p0, 0x1

    :cond_8
    invoke-static {p1, p2}, Ld7/t;->m0(Ljava/lang/Object;Lm0/m;)Lm0/g1;

    move-result-object v0

    const v1, -0x384349

    invoke-virtual {p2, v1}, Lm0/q;->Z(I)V

    invoke-virtual {p2}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lm0/l;->a:Lk0/y0;

    if-ne v1, v2, :cond_9

    new-instance v1, Lb/h;

    invoke-direct {v1, p0, v0}, Lb/h;-><init>(ZLm0/g1;)V

    invoke-virtual {p2, v1}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_9
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lm0/q;->t(Z)V

    check-cast v1, Lb/h;

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const v4, -0x384098

    invoke-virtual {p2, v4}, Lm0/q;->Z(I)V

    invoke-virtual {p2, v1}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {p2, v3}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v3, v4

    invoke-virtual {p2}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_a

    if-ne v4, v2, :cond_b

    :cond_a
    new-instance v4, Lb/f;

    invoke-direct {v4, v0, v1, p0}, Lb/f;-><init>(ILjava/lang/Object;Z)V

    invoke-virtual {p2, v4}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_b
    invoke-virtual {p2, v0}, Lm0/q;->t(Z)V

    check-cast v4, Lc9/a;

    invoke-static {v4, p2}, Lm0/s;->d(Lc9/a;Lm0/m;)V

    sget-object v3, Lb/k;->a:Lm0/p0;

    const v3, -0x7b43639d

    invoke-virtual {p2, v3}, Lm0/q;->Z(I)V

    sget-object v3, Lb/k;->a:Lm0/p0;

    invoke-virtual {p2, v3}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/activity/k0;

    const v4, 0x64249efd

    invoke-virtual {p2, v4}, Lm0/q;->Z(I)V

    if-nez v3, :cond_c

    sget-object v3, Lu1/y0;->f:Lm0/m3;

    invoke-virtual {p2, v3}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    const-string v4, "<this>"

    invoke-static {v3, v4}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Landroidx/activity/l0;->c:Landroidx/activity/l0;

    invoke-static {v4, v3}, Lk9/l;->F0(Lc9/c;Ljava/lang/Object;)Lk9/i;

    move-result-object v3

    sget-object v4, Landroidx/activity/l0;->d:Landroidx/activity/l0;

    invoke-static {v3, v4}, Lk9/k;->H0(Lk9/i;Lc9/c;)Lk9/f;

    move-result-object v3

    invoke-static {v3}, Lk9/k;->G0(Lk9/f;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/activity/k0;

    :cond_c
    invoke-virtual {p2, v0}, Lm0/q;->t(Z)V

    if-nez v3, :cond_f

    sget-object v3, Lu1/y0;->b:Lm0/m3;

    invoke-virtual {p2, v3}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/Context;

    :goto_5
    instance-of v4, v3, Landroid/content/ContextWrapper;

    if-eqz v4, :cond_e

    instance-of v4, v3, Landroidx/activity/k0;

    if-eqz v4, :cond_d

    goto :goto_6

    :cond_d
    check-cast v3, Landroid/content/ContextWrapper;

    invoke-virtual {v3}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v3

    goto :goto_5

    :cond_e
    const/4 v3, 0x0

    :goto_6
    check-cast v3, Landroidx/activity/k0;

    :cond_f
    invoke-virtual {p2, v0}, Lm0/q;->t(Z)V

    if-eqz v3, :cond_13

    invoke-interface {v3}, Landroidx/activity/k0;->getOnBackPressedDispatcher()Landroidx/activity/i0;

    move-result-object v3

    sget-object v4, Lu1/y0;->d:Lm0/m3;

    invoke-virtual {p2, v4}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/lifecycle/w;

    new-instance v5, Lb/g;

    invoke-direct {v5, v3, v4, v1, v0}, Lb/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v1, 0x552e4d01

    invoke-virtual {p2, v1}, Lm0/q;->Z(I)V

    const v1, 0x1e7b2b64

    invoke-virtual {p2, v1}, Lm0/q;->Z(I)V

    invoke-virtual {p2, v4}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {p2, v3}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v1, v3

    invoke-virtual {p2}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_10

    if-ne v3, v2, :cond_11

    :cond_10
    new-instance v1, Lm0/m0;

    invoke-direct {v1, v5}, Lm0/m0;-><init>(Lc9/c;)V

    invoke-virtual {p2, v1}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_11
    invoke-virtual {p2, v0}, Lm0/q;->t(Z)V

    invoke-virtual {p2, v0}, Lm0/q;->t(Z)V

    :goto_7
    invoke-virtual {p2}, Lm0/q;->x()Lm0/x1;

    move-result-object p2

    if-nez p2, :cond_12

    goto :goto_8

    :cond_12
    new-instance v0, Ld5/h2;

    invoke-direct {v0, p0, p1, p3, p4}, Ld5/h2;-><init>(ZLc9/a;II)V

    iput-object v0, p2, Lm0/x1;->d:Lc9/e;

    :goto_8
    return-void

    :cond_13
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final a0(Lu8/j;Ljava/lang/Throwable;)V
    .locals 4

    sget-object v0, Lr9/f;->a:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm9/b0;

    :try_start_0
    invoke-interface {v1, p0, p1}, Lm9/b0;->p(Lu8/j;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    if-ne p1, v1, :cond_0

    move-object v2, p1

    goto :goto_1

    :cond_0
    new-instance v2, Ljava/lang/RuntimeException;

    const-string v3, "Exception while trying to handle coroutine exception"

    invoke-direct {v2, v3, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v2, p1}, Ld7/a;->c(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v3

    invoke-interface {v3, v1, v2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    :try_start_1
    new-instance v0, Lr9/g;

    invoke-direct {v0, p0}, Lr9/g;-><init>(Lu8/j;)V

    invoke-static {p1, v0}, Ld7/a;->c(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Thread;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final b(Lg2/a0;Lc9/c;Ly0/o;La2/c0;Lg2/l0;Lc9/c;Lx/m;Le1/n;ZIILg2/o;Lf0/a1;ZZLc9/f;Lm0/m;III)V
    .locals 59

    move-object/from16 v15, p0

    move-object/from16 v14, p1

    move/from16 v13, p17

    move/from16 v12, p18

    move/from16 v11, p19

    move-object/from16 v10, p16

    check-cast v10, Lm0/q;

    const v0, -0x3924b996

    invoke-virtual {v10, v0}, Lm0/q;->a0(I)Lm0/q;

    and-int/lit8 v0, v11, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v0, v13, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v0, v13, 0xe

    if-nez v0, :cond_2

    invoke-virtual {v10, v15}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v13

    goto :goto_1

    :cond_2
    move v0, v13

    :goto_1
    and-int/lit8 v3, v11, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v0, v0, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v3, v13, 0x70

    if-nez v3, :cond_5

    invoke-virtual {v10, v14}, Lm0/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x20

    goto :goto_2

    :cond_4
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v0, v3

    :cond_5
    :goto_3
    and-int/lit8 v3, v11, 0x4

    if-eqz v3, :cond_7

    or-int/lit16 v0, v0, 0x180

    :cond_6
    move-object/from16 v8, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v8, v13, 0x380

    if-nez v8, :cond_6

    move-object/from16 v8, p2

    invoke-virtual {v10, v8}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x100

    goto :goto_4

    :cond_8
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v0, v9

    :goto_5
    and-int/lit8 v9, v11, 0x8

    const/16 v16, 0x400

    const/16 v17, 0x800

    if-eqz v9, :cond_a

    or-int/lit16 v0, v0, 0xc00

    :cond_9
    move-object/from16 v2, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v2, v13, 0x1c00

    if-nez v2, :cond_9

    move-object/from16 v2, p3

    invoke-virtual {v10, v2}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_b

    move/from16 v18, v17

    goto :goto_6

    :cond_b
    move/from16 v18, v16

    :goto_6
    or-int v0, v0, v18

    :goto_7
    and-int/lit8 v18, v11, 0x10

    const v19, 0xe000

    const/16 v20, 0x4000

    const/16 v21, 0x2000

    if-eqz v18, :cond_c

    or-int/lit16 v0, v0, 0x6000

    move-object/from16 v5, p4

    goto :goto_9

    :cond_c
    and-int v22, v13, v19

    move-object/from16 v5, p4

    if-nez v22, :cond_e

    invoke-virtual {v10, v5}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_d

    move/from16 v23, v20

    goto :goto_8

    :cond_d
    move/from16 v23, v21

    :goto_8
    or-int v0, v0, v23

    :cond_e
    :goto_9
    and-int/lit8 v23, v11, 0x20

    const/high16 v24, 0x30000

    if-eqz v23, :cond_f

    or-int v0, v0, v24

    move-object/from16 v6, p5

    goto :goto_b

    :cond_f
    const/high16 v25, 0x70000

    and-int v25, v13, v25

    move-object/from16 v6, p5

    if-nez v25, :cond_11

    invoke-virtual {v10, v6}, Lm0/q;->i(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_10

    const/high16 v26, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v26, 0x10000

    :goto_a
    or-int v0, v0, v26

    :cond_11
    :goto_b
    and-int/lit8 v26, v11, 0x40

    if-eqz v26, :cond_12

    const/high16 v27, 0x180000

    or-int v0, v0, v27

    move-object/from16 v7, p6

    goto :goto_d

    :cond_12
    const/high16 v27, 0x380000

    and-int v27, v13, v27

    move-object/from16 v7, p6

    if-nez v27, :cond_14

    invoke-virtual {v10, v7}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_13

    const/high16 v28, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v28, 0x80000

    :goto_c
    or-int v0, v0, v28

    :cond_14
    :goto_d
    and-int/lit16 v4, v11, 0x80

    if-eqz v4, :cond_15

    const/high16 v29, 0xc00000

    or-int v0, v0, v29

    move-object/from16 v1, p7

    goto :goto_f

    :cond_15
    const/high16 v29, 0x1c00000

    and-int v29, v13, v29

    move-object/from16 v1, p7

    if-nez v29, :cond_17

    invoke-virtual {v10, v1}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_16

    const/high16 v30, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v30, 0x400000

    :goto_e
    or-int v0, v0, v30

    :cond_17
    :goto_f
    and-int/lit16 v1, v11, 0x100

    if-eqz v1, :cond_18

    const/high16 v30, 0x6000000

    or-int v0, v0, v30

    move/from16 v2, p8

    goto :goto_11

    :cond_18
    const/high16 v30, 0xe000000

    and-int v30, v13, v30

    move/from16 v2, p8

    if-nez v30, :cond_1a

    invoke-virtual {v10, v2}, Lm0/q;->h(Z)Z

    move-result v30

    if-eqz v30, :cond_19

    const/high16 v30, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v30, 0x2000000

    :goto_10
    or-int v0, v0, v30

    :cond_1a
    :goto_11
    and-int/lit16 v2, v11, 0x200

    if-eqz v2, :cond_1b

    const/high16 v30, 0x30000000

    or-int v0, v0, v30

    move/from16 v5, p9

    goto :goto_13

    :cond_1b
    const/high16 v30, 0x70000000

    and-int v30, v13, v30

    move/from16 v5, p9

    if-nez v30, :cond_1d

    invoke-virtual {v10, v5}, Lm0/q;->e(I)Z

    move-result v30

    if-eqz v30, :cond_1c

    const/high16 v30, 0x20000000

    goto :goto_12

    :cond_1c
    const/high16 v30, 0x10000000

    :goto_12
    or-int v0, v0, v30

    :cond_1d
    :goto_13
    and-int/lit16 v5, v11, 0x400

    if-eqz v5, :cond_1e

    or-int/lit8 v30, v12, 0x6

    move/from16 v6, p10

    goto :goto_15

    :cond_1e
    and-int/lit8 v30, v12, 0xe

    move/from16 v6, p10

    if-nez v30, :cond_20

    invoke-virtual {v10, v6}, Lm0/q;->e(I)Z

    move-result v30

    if-eqz v30, :cond_1f

    const/16 v30, 0x4

    goto :goto_14

    :cond_1f
    const/16 v30, 0x2

    :goto_14
    or-int v30, v12, v30

    goto :goto_15

    :cond_20
    move/from16 v30, v12

    :goto_15
    and-int/lit8 v31, v12, 0x70

    if-nez v31, :cond_23

    and-int/lit16 v6, v11, 0x800

    if-nez v6, :cond_21

    move-object/from16 v6, p11

    invoke-virtual {v10, v6}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v31

    if-eqz v31, :cond_22

    const/16 v22, 0x20

    goto :goto_16

    :cond_21
    move-object/from16 v6, p11

    :cond_22
    const/16 v22, 0x10

    :goto_16
    or-int v30, v30, v22

    :goto_17
    move/from16 v6, v30

    goto :goto_18

    :cond_23
    move-object/from16 v6, p11

    goto :goto_17

    :goto_18
    and-int/lit16 v7, v11, 0x1000

    if-eqz v7, :cond_25

    or-int/lit16 v6, v6, 0x180

    :cond_24
    move-object/from16 v8, p12

    goto :goto_1a

    :cond_25
    and-int/lit16 v8, v12, 0x380

    if-nez v8, :cond_24

    move-object/from16 v8, p12

    invoke-virtual {v10, v8}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_26

    const/16 v25, 0x100

    goto :goto_19

    :cond_26
    const/16 v25, 0x80

    :goto_19
    or-int v6, v6, v25

    :goto_1a
    and-int/lit16 v8, v11, 0x2000

    if-eqz v8, :cond_28

    or-int/lit16 v6, v6, 0xc00

    :cond_27
    move/from16 v14, p13

    goto :goto_1b

    :cond_28
    and-int/lit16 v14, v12, 0x1c00

    if-nez v14, :cond_27

    move/from16 v14, p13

    invoke-virtual {v10, v14}, Lm0/q;->h(Z)Z

    move-result v22

    if-eqz v22, :cond_29

    move/from16 v16, v17

    :cond_29
    or-int v6, v6, v16

    :goto_1b
    and-int/lit16 v14, v11, 0x4000

    if-eqz v14, :cond_2a

    or-int/lit16 v6, v6, 0x6000

    move/from16 v15, p14

    goto :goto_1d

    :cond_2a
    and-int v16, v12, v19

    move/from16 v15, p14

    if-nez v16, :cond_2c

    invoke-virtual {v10, v15}, Lm0/q;->h(Z)Z

    move-result v16

    if-eqz v16, :cond_2b

    goto :goto_1c

    :cond_2b
    move/from16 v20, v21

    :goto_1c
    or-int v6, v6, v20

    :cond_2c
    :goto_1d
    const v16, 0x8000

    and-int v16, v11, v16

    if-eqz v16, :cond_2d

    or-int v6, v6, v24

    move-object/from16 v12, p15

    goto :goto_1f

    :cond_2d
    const/high16 v17, 0x70000

    and-int v17, v12, v17

    move-object/from16 v12, p15

    if-nez v17, :cond_2f

    invoke-virtual {v10, v12}, Lm0/q;->i(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_2e

    const/high16 v17, 0x20000

    goto :goto_1e

    :cond_2e
    const/high16 v17, 0x10000

    :goto_1e
    or-int v6, v6, v17

    :cond_2f
    :goto_1f
    const v17, 0x5b6db6db

    and-int v0, v0, v17

    const v12, 0x12492492

    if-ne v0, v12, :cond_31

    const v0, 0x5b6db

    and-int/2addr v0, v6

    const v6, 0x12492

    if-ne v0, v6, :cond_31

    invoke-virtual {v10}, Lm0/q;->G()Z

    move-result v0

    if-nez v0, :cond_30

    goto :goto_20

    :cond_30
    invoke-virtual {v10}, Lm0/q;->U()V

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v14, p13

    move-object/from16 v16, p15

    move-object v1, v10

    move/from16 v10, p9

    goto/16 :goto_4c

    :cond_31
    :goto_20
    invoke-virtual {v10}, Lm0/q;->W()V

    and-int/lit8 v0, v13, 0x1

    const/4 v6, 0x0

    if-eqz v0, :cond_33

    invoke-virtual {v10}, Lm0/q;->E()Z

    move-result v0

    if-eqz v0, :cond_32

    goto :goto_21

    :cond_32
    invoke-virtual {v10}, Lm0/q;->U()V

    move-object/from16 v14, p3

    move-object/from16 v13, p4

    move-object/from16 v20, p5

    move-object/from16 v12, p6

    move-object/from16 v21, p7

    move/from16 v9, p8

    move/from16 v8, p9

    move/from16 v22, p10

    move-object/from16 v7, p11

    move-object/from16 v5, p12

    move/from16 v4, p13

    move-object/from16 v24, p15

    move/from16 v23, v15

    move-object/from16 v15, p2

    goto/16 :goto_2e

    :cond_33
    :goto_21
    if-eqz v3, :cond_34

    sget-object v0, Ly0/l;->b:Ly0/l;

    goto :goto_22

    :cond_34
    move-object/from16 v0, p2

    :goto_22
    if-eqz v9, :cond_35

    sget-object v3, La2/c0;->d:La2/c0;

    goto :goto_23

    :cond_35
    move-object/from16 v3, p3

    :goto_23
    if-eqz v18, :cond_36

    sget-object v9, Lg2/k0;->a:Lg2/j0;

    goto :goto_24

    :cond_36
    move-object/from16 v9, p4

    :goto_24
    if-eqz v23, :cond_37

    sget-object v17, Lf0/m;->a:Lf0/m;

    goto :goto_25

    :cond_37
    move-object/from16 v17, p5

    :goto_25
    if-eqz v26, :cond_38

    const/16 v18, 0x0

    goto :goto_26

    :cond_38
    move-object/from16 v18, p6

    :goto_26
    if-eqz v4, :cond_39

    new-instance v4, Le1/n0;

    sget-wide v12, Le1/r;->g:J

    invoke-direct {v4, v12, v13}, Le1/n0;-><init>(J)V

    goto :goto_27

    :cond_39
    move-object/from16 v4, p7

    :goto_27
    if-eqz v1, :cond_3a

    const/4 v1, 0x1

    goto :goto_28

    :cond_3a
    move/from16 v1, p8

    :goto_28
    if-eqz v2, :cond_3b

    const v2, 0x7fffffff

    goto :goto_29

    :cond_3b
    move/from16 v2, p9

    :goto_29
    if-eqz v5, :cond_3c

    const/4 v5, 0x1

    goto :goto_2a

    :cond_3c
    move/from16 v5, p10

    :goto_2a
    and-int/lit16 v12, v11, 0x800

    if-eqz v12, :cond_3d

    sget-object v12, Lg2/o;->f:Lg2/o;

    goto :goto_2b

    :cond_3d
    move-object/from16 v12, p11

    :goto_2b
    if-eqz v7, :cond_3e

    sget-object v7, Lf0/a1;->g:Lf0/a1;

    goto :goto_2c

    :cond_3e
    move-object/from16 v7, p12

    :goto_2c
    if-eqz v8, :cond_3f

    const/4 v8, 0x1

    goto :goto_2d

    :cond_3f
    move/from16 v8, p13

    :goto_2d
    if-eqz v14, :cond_40

    move v15, v6

    :cond_40
    if-eqz v16, :cond_41

    sget-object v13, Lf0/l;->a:Lu0/b;

    move-object v14, v3

    move-object/from16 v21, v4

    move/from16 v22, v5

    move-object v5, v7

    move v4, v8

    move-object v7, v12

    move-object/from16 v24, v13

    move/from16 v23, v15

    move-object/from16 v20, v17

    move-object/from16 v12, v18

    move-object v15, v0

    move v8, v2

    move-object v13, v9

    move v9, v1

    goto :goto_2e

    :cond_41
    move-object/from16 v24, p15

    move-object v14, v3

    move-object/from16 v21, v4

    move/from16 v22, v5

    move-object v5, v7

    move v4, v8

    move-object v13, v9

    move-object v7, v12

    move/from16 v23, v15

    move-object/from16 v20, v17

    move-object/from16 v12, v18

    move-object v15, v0

    move v9, v1

    move v8, v2

    :goto_2e
    invoke-virtual {v10}, Lm0/q;->u()V

    const v0, -0x1d58f75c

    invoke-virtual {v10, v0}, Lm0/q;->Z(I)V

    invoke-virtual {v10}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lm0/l;->a:Lk0/y0;

    if-ne v1, v2, :cond_42

    new-instance v1, Lc1/k;

    invoke-direct {v1}, Lc1/k;-><init>()V

    invoke-virtual {v10, v1}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_42
    invoke-virtual {v10, v6}, Lm0/q;->t(Z)V

    check-cast v1, Lc1/k;

    sget-object v3, Lu1/s1;->l:Lm0/m3;

    invoke-virtual {v10, v3}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg2/b0;

    sget-object v0, Lu1/s1;->e:Lm0/m3;

    invoke-virtual {v10, v0}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm2/b;

    sget-object v6, Lu1/s1;->h:Lm0/m3;

    invoke-virtual {v10, v6}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lf2/d;

    sget-object v11, Lh0/c1;->a:Lm0/p0;

    invoke-virtual {v10, v11}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lh0/b1;

    move-object/from16 v17, v12

    iget-wide v11, v11, Lh0/b1;->b:J

    move-object/from16 v18, v15

    sget-object v15, Lu1/s1;->f:Lm0/m3;

    invoke-virtual {v10, v15}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lc1/e;

    move/from16 p13, v4

    sget-object v4, Lu1/s1;->q:Lm0/m3;

    invoke-virtual {v10, v4}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lu1/g3;

    move-object/from16 p14, v4

    sget-object v4, Lu1/s1;->m:Lm0/m3;

    invoke-virtual {v10, v4}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lu1/t2;

    move-object/from16 p15, v3

    const/4 v3, 0x1

    if-ne v8, v3, :cond_43

    if-nez v9, :cond_43

    iget-boolean v3, v7, Lg2/o;->a:Z

    if-eqz v3, :cond_43

    sget-object v3, Lv/h1;->b:Lv/h1;

    :goto_2f
    move/from16 v25, v8

    goto :goto_30

    :cond_43
    sget-object v3, Lv/h1;->a:Lv/h1;

    goto :goto_2f

    :goto_30
    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v26, v7

    sget-object v7, Lf0/a2;->f:La/a;

    iget v7, v7, La/a;->a:I

    sparse-switch v7, :sswitch_data_0

    sget-object v7, Lf0/a2;->g:Lv0/p;

    :goto_31
    move-object/from16 v27, v1

    goto :goto_32

    :sswitch_0
    sget-object v7, Lb0/k0;->G:Lv0/p;

    goto :goto_31

    :sswitch_1
    sget-object v7, Lz/g0;->A:Lv0/p;

    goto :goto_31

    :goto_32
    const v1, -0x1044509f

    invoke-virtual {v10, v1}, Lm0/q;->Z(I)V

    invoke-virtual {v10, v3}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v1

    move-object/from16 v30, v15

    invoke-virtual {v10}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v15

    if-nez v1, :cond_44

    if-ne v15, v2, :cond_45

    :cond_44
    new-instance v15, Lt/l0;

    const/16 v1, 0xa

    invoke-direct {v15, v3, v1}, Lt/l0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v10, v15}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_45
    check-cast v15, Lc9/a;

    const/4 v1, 0x0

    invoke-virtual {v10, v1}, Lm0/q;->t(Z)V

    const/4 v1, 0x4

    invoke-static {v8, v7, v15, v10, v1}, Lx3/c;->d([Ljava/lang/Object;Lv0/p;Lc9/a;Lm0/m;I)Ljava/lang/Object;

    move-result-object v3

    move-object v7, v3

    check-cast v7, Lf0/a2;

    const v1, 0x1e7b2b64

    invoke-virtual {v10, v1}, Lm0/q;->Z(I)V

    move-object/from16 v15, p0

    invoke-virtual {v10, v15}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v10, v13}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v1, v3

    invoke-virtual {v10}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_47

    if-ne v3, v2, :cond_46

    goto :goto_34

    :cond_46
    move-object/from16 v31, v7

    move-wide/from16 v32, v11

    :goto_33
    const/4 v1, 0x0

    goto/16 :goto_36

    :cond_47
    :goto_34
    iget-object v1, v15, Lg2/a0;->a:La2/e;

    invoke-static {v13, v1}, Lf0/g2;->a(Lg2/l0;La2/e;)Lg2/i0;

    move-result-object v1

    iget-object v3, v15, Lg2/a0;->c:La2/b0;

    if-eqz v3, :cond_48

    sget v8, La2/b0;->c:I

    move-object/from16 v31, v7

    iget-wide v7, v3, La2/b0;->a:J

    move-wide/from16 v32, v11

    const/16 v3, 0x20

    shr-long v11, v7, v3

    long-to-int v3, v11

    iget-object v11, v1, Lg2/i0;->b:Lg2/s;

    invoke-interface {v11, v3}, Lg2/s;->b(I)I

    move-result v3

    const-wide v11, 0xffffffffL

    and-long/2addr v7, v11

    long-to-int v7, v7

    iget-object v8, v1, Lg2/i0;->b:Lg2/s;

    invoke-interface {v8, v7}, Lg2/s;->b(I)I

    move-result v7

    invoke-static {v3, v7}, Ljava/lang/Math;->min(II)I

    move-result v11

    invoke-static {v3, v7}, Ljava/lang/Math;->max(II)I

    move-result v3

    new-instance v7, La2/c;

    iget-object v1, v1, Lg2/i0;->a:La2/e;

    invoke-direct {v7, v1}, La2/c;-><init>(La2/e;)V

    new-instance v1, La2/x;

    move-object/from16 v34, v1

    const-wide/16 v35, 0x0

    const-wide/16 v37, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const-wide/16 v44, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const-wide/16 v49, 0x0

    sget-object v51, Ll2/j;->c:Ll2/j;

    const/16 v52, 0x0

    const v53, 0xefff

    invoke-direct/range {v34 .. v53}, La2/x;-><init>(JJLf2/l;Lf2/j;Lf2/k;Lf2/e;Ljava/lang/String;JLl2/a;Ll2/p;Lh2/d;JLl2/j;Le1/k0;I)V

    invoke-virtual {v7, v1, v11, v3}, La2/c;->a(La2/x;II)V

    invoke-virtual {v7}, La2/c;->c()La2/e;

    move-result-object v1

    new-instance v3, Lg2/i0;

    invoke-direct {v3, v1, v8}, Lg2/i0;-><init>(La2/e;Lg2/s;)V

    goto :goto_35

    :cond_48
    move-object/from16 v31, v7

    move-wide/from16 v32, v11

    move-object v3, v1

    :goto_35
    invoke-virtual {v10, v3}, Lm0/q;->l0(Ljava/lang/Object;)V

    goto :goto_33

    :goto_36
    invoke-virtual {v10, v1}, Lm0/q;->t(Z)V

    move-object v1, v3

    check-cast v1, Lg2/i0;

    iget-object v3, v1, Lg2/i0;->a:La2/e;

    iget-object v12, v1, Lg2/i0;->b:Lg2/s;

    invoke-virtual {v10}, Lm0/q;->D()Lm0/x1;

    move-result-object v7

    if-eqz v7, :cond_67

    iget v8, v7, Lm0/x1;->a:I

    const/4 v11, 0x1

    or-int/2addr v8, v11

    iput v8, v7, Lm0/x1;->a:I

    const v8, 0x44faf204

    invoke-virtual {v10, v8}, Lm0/q;->Z(I)V

    invoke-virtual {v10, v4}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v10}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v11

    if-nez v8, :cond_4a

    if-ne v11, v2, :cond_49

    goto :goto_38

    :cond_49
    :goto_37
    const/4 v4, 0x0

    goto :goto_39

    :cond_4a
    :goto_38
    new-instance v11, Lf0/c2;

    new-instance v8, Lf0/j1;

    const v28, 0x7fffffff

    const/16 v34, 0x1

    const/16 v35, 0x1

    sget-object v36, Lr8/r;->a:Lr8/r;

    move-object/from16 p2, v8

    move-object/from16 p3, v3

    move-object/from16 p4, v14

    move/from16 p5, v28

    move/from16 p6, v34

    move/from16 p7, v9

    move/from16 p8, v35

    move-object/from16 p9, v0

    move-object/from16 p10, v6

    move-object/from16 p11, v36

    invoke-direct/range {p2 .. p11}, Lf0/j1;-><init>(La2/e;La2/c0;IIZILm2/b;Lf2/d;Ljava/util/List;)V

    invoke-direct {v11, v8, v7, v4}, Lf0/c2;-><init>(Lf0/j1;Lm0/x1;Lu1/t2;)V

    invoke-virtual {v10, v11}, Lm0/q;->l0(Ljava/lang/Object;)V

    goto :goto_37

    :goto_39
    invoke-virtual {v10, v4}, Lm0/q;->t(Z)V

    move-object v4, v11

    check-cast v4, Lf0/c2;

    iget-object v7, v15, Lg2/a0;->a:La2/e;

    move-object/from16 v11, p1

    iput-object v11, v4, Lf0/c2;->s:Lc9/c;

    iget-object v8, v4, Lf0/c2;->v:Le1/g;

    move-object/from16 v28, v12

    move-wide/from16 v11, v32

    invoke-virtual {v8, v11, v12}, Le1/g;->e(J)V

    iget-object v8, v4, Lf0/c2;->r:Lf0/z0;

    iput-object v5, v8, Lf0/z0;->b:Lf0/a1;

    move-object/from16 v11, v30

    iput-object v11, v8, Lf0/z0;->c:Lc1/e;

    iput-object v7, v4, Lf0/c2;->j:La2/e;

    iget-object v7, v4, Lf0/c2;->a:Lf0/j1;

    sget-object v8, Lr8/r;->a:Lr8/r;

    iget-object v12, v7, Lf0/j1;->a:La2/e;

    invoke-static {v12, v3}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_4b

    iget-object v12, v7, Lf0/j1;->b:La2/c0;

    invoke-static {v12, v14}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_4b

    iget-boolean v12, v7, Lf0/j1;->e:Z

    if-ne v12, v9, :cond_4b

    iget v12, v7, Lf0/j1;->f:I

    move-object/from16 v30, v5

    const/4 v5, 0x1

    invoke-static {v12, v5}, Lh6/g;->T(II)Z

    move-result v12

    if-eqz v12, :cond_4c

    iget v5, v7, Lf0/j1;->c:I

    const v12, 0x7fffffff

    if-ne v5, v12, :cond_4c

    iget v5, v7, Lf0/j1;->d:I

    const/4 v12, 0x1

    if-ne v5, v12, :cond_4c

    iget-object v5, v7, Lf0/j1;->g:Lm2/b;

    invoke-static {v5, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4c

    iget-object v5, v7, Lf0/j1;->i:Ljava/util/List;

    invoke-static {v5, v8}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4c

    iget-object v5, v7, Lf0/j1;->h:Lf2/d;

    if-eq v5, v6, :cond_4d

    goto :goto_3a

    :cond_4b
    move-object/from16 v30, v5

    :cond_4c
    :goto_3a
    new-instance v7, Lf0/j1;

    move-object/from16 p2, v7

    move-object/from16 p3, v3

    move-object/from16 p4, v14

    const v3, 0x7fffffff

    move/from16 p5, v3

    const/4 v3, 0x1

    move/from16 p6, v3

    move/from16 p7, v9

    const/4 v3, 0x1

    move/from16 p8, v3

    move-object/from16 p9, v0

    move-object/from16 p10, v6

    move-object/from16 p11, v8

    invoke-direct/range {p2 .. p11}, Lf0/j1;-><init>(La2/e;La2/c0;IIZILm2/b;Lf2/d;Ljava/util/List;)V

    :cond_4d
    iget-object v3, v4, Lf0/c2;->a:Lf0/j1;

    if-eq v3, v7, :cond_4e

    const/4 v3, 0x1

    iput-boolean v3, v4, Lf0/c2;->p:Z

    :cond_4e
    iput-object v7, v4, Lf0/c2;->a:Lf0/j1;

    iget-object v3, v4, Lf0/c2;->e:Lg2/h0;

    iget-object v5, v4, Lf0/c2;->d:Lg2/j;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v6, v5, Lg2/j;->b:Lg2/k;

    invoke-virtual {v6}, Lg2/k;->c()La2/b0;

    move-result-object v6

    iget-object v7, v15, Lg2/a0;->c:La2/b0;

    invoke-static {v7, v6}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    const/4 v7, 0x1

    xor-int/2addr v6, v7

    iget-object v7, v5, Lg2/j;->a:Lg2/a0;

    iget-object v7, v7, Lg2/a0;->a:La2/e;

    iget-object v8, v15, Lg2/a0;->a:La2/e;

    invoke-static {v7, v8}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    move-object/from16 v32, v11

    iget-wide v11, v15, Lg2/a0;->b:J

    if-nez v7, :cond_4f

    new-instance v7, Lg2/k;

    invoke-direct {v7, v8, v11, v12}, Lg2/k;-><init>(La2/e;J)V

    iput-object v7, v5, Lg2/j;->b:Lg2/k;

    const/4 v7, 0x1

    :goto_3b
    const/4 v8, 0x0

    goto :goto_3c

    :cond_4f
    iget-object v7, v5, Lg2/j;->a:Lg2/a0;

    iget-wide v7, v7, Lg2/a0;->b:J

    invoke-static {v7, v8, v11, v12}, La2/b0;->a(JJ)Z

    move-result v7

    if-nez v7, :cond_50

    iget-object v7, v5, Lg2/j;->b:Lg2/k;

    invoke-static {v11, v12}, La2/b0;->e(J)I

    move-result v8

    invoke-static {v11, v12}, La2/b0;->d(J)I

    move-result v11

    invoke-virtual {v7, v8, v11}, Lg2/k;->f(II)V

    const/4 v7, 0x0

    const/4 v8, 0x1

    goto :goto_3c

    :cond_50
    const/4 v7, 0x0

    goto :goto_3b

    :goto_3c
    iget-object v11, v15, Lg2/a0;->c:La2/b0;

    if-nez v11, :cond_52

    iget-object v11, v5, Lg2/j;->b:Lg2/k;

    const/4 v12, -0x1

    iput v12, v11, Lg2/k;->d:I

    iput v12, v11, Lg2/k;->e:I

    :cond_51
    move-object/from16 v33, v0

    move/from16 v34, v9

    goto :goto_3d

    :cond_52
    iget-wide v11, v11, La2/b0;->a:J

    invoke-static {v11, v12}, La2/b0;->b(J)Z

    move-result v33

    if-nez v33, :cond_51

    move-object/from16 v33, v0

    iget-object v0, v5, Lg2/j;->b:Lg2/k;

    move/from16 v34, v9

    invoke-static {v11, v12}, La2/b0;->e(J)I

    move-result v9

    invoke-static {v11, v12}, La2/b0;->d(J)I

    move-result v11

    invoke-virtual {v0, v9, v11}, Lg2/k;->e(II)V

    :goto_3d
    if-nez v7, :cond_54

    if-nez v8, :cond_53

    if-eqz v6, :cond_53

    goto :goto_3e

    :cond_53
    move-object v0, v15

    goto :goto_3f

    :cond_54
    :goto_3e
    iget-object v0, v5, Lg2/j;->b:Lg2/k;

    const/4 v6, -0x1

    iput v6, v0, Lg2/k;->d:I

    iput v6, v0, Lg2/k;->e:I

    const-wide/16 v6, 0x0

    const/4 v0, 0x3

    const/4 v8, 0x0

    invoke-static {v15, v8, v6, v7, v0}, Lg2/a0;->a(Lg2/a0;La2/e;JI)Lg2/a0;

    move-result-object v0

    :goto_3f
    iget-object v6, v5, Lg2/j;->a:Lg2/a0;

    iput-object v0, v5, Lg2/j;->a:Lg2/a0;

    if-eqz v3, :cond_55

    invoke-virtual {v3, v6, v0}, Lg2/h0;->a(Lg2/a0;Lg2/a0;)V

    :cond_55
    const v0, -0x1d58f75c

    invoke-virtual {v10, v0}, Lm0/q;->Z(I)V

    invoke-virtual {v10}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_56

    new-instance v0, Lf0/e2;

    invoke-direct {v0}, Lf0/e2;-><init>()V

    invoke-virtual {v10, v0}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_56
    const/4 v3, 0x0

    invoke-virtual {v10, v3}, Lm0/q;->t(Z)V

    check-cast v0, Lf0/e2;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    iget-boolean v3, v0, Lf0/e2;->f:Z

    if-nez v3, :cond_59

    iget-object v3, v0, Lf0/e2;->e:Ljava/lang/Long;

    if-eqz v3, :cond_57

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    goto :goto_40

    :cond_57
    const-wide/16 v7, 0x0

    :goto_40
    const/16 v3, 0x1388

    int-to-long v11, v3

    add-long/2addr v7, v11

    cmp-long v3, v5, v7

    if-lez v3, :cond_58

    goto :goto_42

    :cond_58
    :goto_41
    const v3, -0x1d58f75c

    goto :goto_43

    :cond_59
    :goto_42
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iput-object v3, v0, Lf0/e2;->e:Ljava/lang/Long;

    invoke-virtual {v0, v15}, Lf0/e2;->a(Lg2/a0;)V

    goto :goto_41

    :goto_43
    invoke-virtual {v10, v3}, Lm0/q;->Z(I)V

    invoke-virtual {v10}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_5a

    new-instance v3, Lh0/v0;

    invoke-direct {v3, v0}, Lh0/v0;-><init>(Lf0/e2;)V

    invoke-virtual {v10, v3}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_5a
    const/4 v5, 0x0

    invoke-virtual {v10, v5}, Lm0/q;->t(Z)V

    move-object v12, v3

    check-cast v12, Lh0/v0;

    move-object/from16 v11, v28

    iput-object v11, v12, Lh0/v0;->b:Lg2/s;

    iput-object v13, v12, Lh0/v0;->f:Lg2/l0;

    iget-object v3, v4, Lf0/c2;->t:Lf0/v;

    iput-object v3, v12, Lh0/v0;->c:Lc9/c;

    iput-object v4, v12, Lh0/v0;->d:Lf0/c2;

    iget-object v3, v12, Lh0/v0;->e:Lm0/n1;

    invoke-virtual {v3, v15}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    sget-object v3, Lu1/s1;->d:Lm0/m3;

    invoke-virtual {v10, v3}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lu1/p1;

    iput-object v3, v12, Lh0/v0;->g:Lu1/p1;

    sget-object v3, Lu1/s1;->n:Lm0/m3;

    invoke-virtual {v10, v3}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lu1/u2;

    iput-object v3, v12, Lh0/v0;->h:Lu1/u2;

    sget-object v3, Lu1/s1;->i:Lm0/m3;

    invoke-virtual {v10, v3}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lk1/a;

    iput-object v3, v12, Lh0/v0;->i:Lk1/a;

    move-object/from16 v3, v27

    iput-object v3, v12, Lh0/v0;->j:Lc1/k;

    xor-int/lit8 v5, v23, 0x1

    iget-object v6, v12, Lh0/v0;->k:Lm0/n1;

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-virtual {v6, v7}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    const v6, 0x2e20b340

    invoke-virtual {v10, v6}, Lm0/q;->Z(I)V

    const v6, -0x1d58f75c

    invoke-virtual {v10, v6}, Lm0/q;->Z(I)V

    invoke-virtual {v10}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v2, :cond_5b

    invoke-static {v10}, Lm0/s;->h(Lm0/m;)Lr9/e;

    move-result-object v6

    new-instance v7, Lm0/d0;

    invoke-direct {v7, v6}, Lm0/d0;-><init>(Lr9/e;)V

    invoke-virtual {v10, v7}, Lm0/q;->l0(Ljava/lang/Object;)V

    move-object v6, v7

    :cond_5b
    const/4 v7, 0x0

    invoke-virtual {v10, v7}, Lm0/q;->t(Z)V

    check-cast v6, Lm0/d0;

    iget-object v6, v6, Lm0/d0;->a:Lm9/d0;

    const v8, -0x1d58f75c

    invoke-static {v10, v7, v8}, Ll/q;->f(Lm0/q;ZI)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v2, :cond_5c

    new-instance v8, Lc0/f;

    invoke-direct {v8}, Lc0/f;-><init>()V

    invoke-virtual {v10, v8}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_5c
    invoke-virtual {v10, v7}, Lm0/q;->t(Z)V

    move-object/from16 v27, v8

    check-cast v27, Lc0/f;

    sget-object v2, Ly0/l;->b:Ly0/l;

    new-instance v7, Lf0/x;

    move-object/from16 p2, v7

    move-object/from16 p3, v4

    move-object/from16 p4, p15

    move/from16 p5, p13

    move/from16 p6, v23

    move-object/from16 p7, p0

    move-object/from16 p8, v26

    move-object/from16 p9, v11

    move-object/from16 p10, v12

    move-object/from16 p11, v6

    move-object/from16 p12, v27

    invoke-direct/range {p2 .. p12}, Lf0/x;-><init>(Lf0/c2;Lg2/b0;ZZLg2/a0;Lg2/o;Lg2/s;Lh0/v0;Lm9/d0;Lc0/f;)V

    invoke-static {v3}, Landroidx/compose/ui/focus/a;->j(Lc1/k;)Ly0/o;

    move-result-object v6

    invoke-static {v6, v7}, Landroidx/compose/ui/focus/a;->u(Ly0/o;Lf0/x;)Ly0/o;

    move-result-object v6

    move/from16 v8, p13

    move-object/from16 v9, v17

    invoke-static {v9, v6, v8}, Landroidx/compose/foundation/b;->a(Lx/m;Ly0/o;Z)Ly0/o;

    move-result-object v6

    const v7, -0x347582c

    invoke-virtual {v10, v7}, Lm0/q;->Z(I)V

    if-eqz p15, :cond_5e

    if-eqz v8, :cond_5d

    if-nez v23, :cond_5d

    const/4 v7, 0x1

    goto :goto_44

    :cond_5d
    const/4 v7, 0x0

    :goto_44
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-static {v7, v10}, Ld7/t;->m0(Ljava/lang/Object;Lm0/m;)Lm0/g1;

    move-result-object v7

    move-object/from16 p13, v14

    sget-object v14, Lq8/l;->a:Lq8/l;

    move-object/from16 v17, v6

    new-instance v6, Lf0/o;

    const/16 v28, 0x0

    move-object/from16 p2, v6

    move-object/from16 p3, v4

    move-object/from16 p4, v7

    move-object/from16 p5, p15

    move-object/from16 p6, v12

    move-object/from16 p7, v26

    move-object/from16 p8, v11

    move-object/from16 p9, v28

    invoke-direct/range {p2 .. p9}, Lf0/o;-><init>(Lf0/c2;Lm0/l3;Lg2/b0;Lh0/v0;Lg2/o;Lg2/s;Lu8/e;)V

    invoke-static {v14, v6, v10}, Lm0/s;->b(Ljava/lang/Object;Lc9/e;Lm0/m;)V

    :goto_45
    const/4 v6, 0x0

    goto :goto_46

    :cond_5e
    move-object/from16 v17, v6

    move-object/from16 p13, v14

    goto :goto_45

    :goto_46
    invoke-virtual {v10, v6}, Lm0/q;->t(Z)V

    new-instance v6, Lf0/v;

    const/4 v7, 0x1

    invoke-direct {v6, v4, v7}, Lf0/v;-><init>(Lf0/c2;I)V

    const v7, 0x845fed

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    new-instance v14, Lh0/b0;

    move-object/from16 v28, v0

    const/4 v0, 0x0

    invoke-direct {v14, v6, v0}, Lh0/b0;-><init>(Lc9/c;Lu8/e;)V

    invoke-static {v2, v7, v14}, Lo1/c0;->a(Ly0/o;Ljava/lang/Object;Lc9/e;)Ly0/o;

    move-result-object v0

    new-instance v6, Lf0/y;

    move-object/from16 p2, v6

    move-object/from16 p3, v4

    move-object/from16 p4, v3

    move/from16 p5, v23

    move-object/from16 p6, v12

    move-object/from16 p7, v11

    invoke-direct/range {p2 .. p7}, Lf0/y;-><init>(Lf0/c2;Lc1/k;ZLh0/v0;Lg2/s;)V

    if-eqz v8, :cond_5f

    new-instance v7, Lu/l1;

    const/4 v14, 0x1

    invoke-direct {v7, v14, v6, v9}, Lu/l1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v7}, Lm9/e0;->v(Ly0/o;Lc9/f;)Ly0/o;

    move-result-object v0

    :cond_5f
    new-instance v6, Lh0/y;

    iget-object v7, v12, Lh0/v0;->u:Lh0/u0;

    iget-object v14, v12, Lh0/v0;->t:Lh0/s0;

    move-object/from16 v35, v9

    const/4 v9, 0x0

    invoke-direct {v6, v7, v14, v9}, Lh0/y;-><init>(Lh0/l;Lf0/k1;Lu8/e;)V

    new-instance v9, Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;

    move/from16 p16, v5

    const/4 v5, 0x4

    invoke-direct {v9, v7, v14, v6, v5}, Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lc9/e;I)V

    invoke-interface {v0, v9}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object v0

    new-instance v5, Landroidx/compose/ui/input/pointer/PointerHoverIconModifierElement;

    const/4 v6, 0x0

    invoke-direct {v5, v6}, Landroidx/compose/ui/input/pointer/PointerHoverIconModifierElement;-><init>(Z)V

    invoke-interface {v0, v5}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object v0

    new-instance v5, Lb/g;

    const/16 v6, 0xc

    invoke-direct {v5, v4, v15, v11, v6}, Lb/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v2, v5}, Landroidx/compose/ui/draw/a;->d(Ly0/o;Lc9/c;)Ly0/o;

    move-result-object v14

    new-instance v5, Lu/y;

    const/4 v6, 0x3

    move-object/from16 p2, v5

    move-object/from16 p3, v4

    move/from16 p4, v8

    move-object/from16 p5, p14

    move-object/from16 p6, v12

    move-object/from16 p7, p0

    move-object/from16 p8, v11

    move/from16 p9, v6

    invoke-direct/range {p2 .. p9}, Lu/y;-><init>(Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v2, v5}, Landroidx/compose/ui/layout/a;->j(Ly0/o;Lc9/c;)Ly0/o;

    move-result-object v29

    instance-of v5, v13, Lg2/u;

    new-instance v6, Lf0/e0;

    move-object/from16 p2, v6

    move-object/from16 p3, v1

    move-object/from16 p4, p0

    move/from16 p5, v8

    move/from16 p6, v5

    move-object/from16 p7, v26

    move/from16 p8, v23

    move-object/from16 p9, v4

    move-object/from16 p10, v11

    move-object/from16 p11, v12

    move-object/from16 p12, v3

    invoke-direct/range {p2 .. p12}, Lf0/e0;-><init>(Lg2/i0;Lg2/a0;ZZLg2/o;ZLf0/c2;Lg2/s;Lh0/v0;Lc1/k;)V

    const/4 v1, 0x1

    invoke-static {v2, v1, v6}, Ly1/l;->a(Ly0/o;ZLc9/c;)Ly0/o;

    move-result-object v3

    if-eqz v8, :cond_60

    if-nez v23, :cond_60

    const/4 v1, 0x1

    goto :goto_47

    :cond_60
    const/4 v1, 0x0

    :goto_47
    sget-object v5, Lf0/n1;->a:Lt/j0;

    if-eqz v1, :cond_61

    new-instance v1, Ls/k;

    const/4 v5, 0x2

    move-object/from16 p2, v1

    move-object/from16 p3, v21

    move-object/from16 p4, v4

    move-object/from16 p5, p0

    move-object/from16 p6, v11

    move/from16 p7, v5

    invoke-direct/range {p2 .. p7}, Ls/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v2, v1}, Lm9/e0;->v(Ly0/o;Lc9/f;)Ly0/o;

    move-result-object v1

    move-object v9, v1

    goto :goto_48

    :cond_61
    move-object v9, v2

    :goto_48
    new-instance v1, Lf0/p;

    const/4 v5, 0x0

    invoke-direct {v1, v12, v5}, Lf0/p;-><init>(Lh0/v0;I)V

    invoke-static {v12, v1, v10}, Lm0/s;->a(Ljava/lang/Object;Lc9/c;Lm0/m;)V

    new-instance v1, Lt/a;

    const/4 v5, 0x3

    move-object/from16 p2, v1

    move-object/from16 p3, p15

    move-object/from16 p4, v4

    move-object/from16 p5, p0

    move-object/from16 p6, v26

    move/from16 p7, v5

    invoke-direct/range {p2 .. p7}, Lt/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object/from16 v7, v26

    invoke-static {v7, v1, v10}, Lm0/s;->a(Ljava/lang/Object;Lc9/c;Lm0/m;)V

    iget-object v1, v4, Lf0/c2;->t:Lf0/v;

    move/from16 v6, v25

    const/4 v5, 0x1

    if-ne v6, v5, :cond_62

    move/from16 v19, v5

    goto :goto_49

    :cond_62
    const/16 v19, 0x0

    :goto_49
    iget v5, v7, Lg2/o;->e:I

    move-object/from16 v26, v7

    new-instance v7, Lf0/r1;

    move-object/from16 p2, v7

    move-object/from16 p3, v4

    move-object/from16 p4, v12

    move-object/from16 p5, p0

    move/from16 p6, p16

    move/from16 p7, v19

    move-object/from16 p8, v11

    move-object/from16 p9, v28

    move-object/from16 p10, v1

    move/from16 p11, v5

    invoke-direct/range {p2 .. p11}, Lf0/r1;-><init>(Lf0/c2;Lh0/v0;Lg2/a0;ZZLg2/s;Lf0/e2;Lf0/v;I)V

    invoke-static {v2, v7}, Lm9/e0;->v(Ly0/o;Lc9/f;)Ly0/o;

    move-result-object v1

    move-object/from16 v5, v17

    move-object/from16 v7, v18

    invoke-interface {v7, v5}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object v5

    move-object/from16 v18, v7

    new-instance v7, Lu/s;

    move-object/from16 p16, v10

    const/16 v10, 0xa

    move-object/from16 v28, v11

    move-object/from16 v11, v32

    invoke-direct {v7, v10, v11, v4}, Lu/s;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v5, v7}, Landroidx/compose/ui/input/key/a;->d(Ly0/o;Lu/s;)Ly0/o;

    move-result-object v5

    new-instance v7, Lu/s;

    const/16 v10, 0x9

    invoke-direct {v7, v10, v4, v12}, Lu/s;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v5, v7}, Landroidx/compose/ui/input/key/a;->d(Ly0/o;Lu/s;)Ly0/o;

    move-result-object v5

    invoke-interface {v5, v1}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object v1

    new-instance v5, Lf0/y1;

    move-object/from16 v7, v31

    move-object/from16 v10, v35

    invoke-direct {v5, v7, v8, v10}, Lf0/y1;-><init>(Lf0/a2;ZLx/m;)V

    invoke-static {v1, v5}, Lm9/e0;->v(Ly0/o;Lc9/f;)Ly0/o;

    move-result-object v1

    invoke-interface {v1, v0}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object v0

    invoke-interface {v0, v3}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object v0

    new-instance v1, Lf0/v;

    const/4 v3, 0x0

    invoke-direct {v1, v4, v3}, Lf0/v;-><init>(Lf0/c2;I)V

    invoke-static {v0, v1}, Landroidx/compose/ui/layout/a;->j(Ly0/o;Lc9/c;)Ly0/o;

    move-result-object v11

    if-eqz v8, :cond_63

    invoke-virtual {v4}, Lf0/c2;->b()Z

    move-result v0

    if-eqz v0, :cond_63

    iget-object v0, v4, Lf0/c2;->q:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_63

    const/16 v25, 0x1

    goto :goto_4a

    :cond_63
    move/from16 v25, v3

    :goto_4a
    if-eqz v25, :cond_65

    invoke-static {}, Lu/r1;->a()Z

    move-result v0

    if-nez v0, :cond_64

    goto :goto_4b

    :cond_64
    new-instance v0, Ls/h;

    const/4 v1, 0x6

    invoke-direct {v0, v12, v1}, Ls/h;-><init>(Ljava/lang/Object;I)V

    invoke-static {v2, v0}, Lm9/e0;->v(Ly0/o;Lc9/f;)Ly0/o;

    move-result-object v2

    :cond_65
    :goto_4b
    move-object/from16 v16, v2

    new-instance v5, Lf0/u;

    move-object/from16 v19, v33

    move-object v0, v5

    move-object/from16 v1, v24

    move-object v2, v4

    move-object/from16 v3, p13

    move/from16 v31, v8

    move/from16 v4, v22

    move-object v8, v5

    move v5, v6

    move/from16 v17, v6

    move-object v6, v7

    move-object/from16 v7, p0

    move-object/from16 v54, v8

    move/from16 v32, v17

    move-object v8, v13

    move-object/from16 v17, v10

    move/from16 v33, v34

    move-object/from16 v55, p16

    move-object v10, v14

    move-object/from16 v56, v11

    move-object/from16 v14, v28

    move-object/from16 v11, v29

    move-object/from16 p2, v12

    move-object/from16 v29, v14

    move-object/from16 v28, v17

    move-object/from16 v12, v16

    move-object/from16 v34, v13

    move-object/from16 v13, v27

    move-object/from16 v27, p13

    move-object/from16 v14, p2

    move-object/from16 v35, v18

    move/from16 v15, v25

    move/from16 v16, v23

    move-object/from16 v17, v20

    move-object/from16 v18, v29

    invoke-direct/range {v0 .. v19}, Lf0/u;-><init>(Lc9/f;Lf0/c2;La2/c0;IILf0/a2;Lg2/a0;Lg2/l0;Ly0/o;Ly0/o;Ly0/o;Ly0/o;Lc0/f;Lh0/v0;ZZLc9/c;Lg2/s;Lm2/b;)V

    const v0, -0x164ff220

    move-object/from16 v2, v54

    move-object/from16 v1, v55

    invoke-static {v1, v0, v2}, Ld7/t;->K(Lm0/m;ILd9/j;)Lu0/b;

    move-result-object v0

    const/16 v2, 0x1c0

    move-object/from16 v3, p2

    move-object/from16 v4, v56

    invoke-static {v4, v3, v0, v1, v2}, Ld7/t;->c(Ly0/o;Lh0/v0;Lc9/e;Lm0/m;I)V

    move-object/from16 v6, v20

    move-object/from16 v8, v21

    move/from16 v11, v22

    move/from16 v15, v23

    move-object/from16 v16, v24

    move-object/from16 v12, v26

    move-object/from16 v4, v27

    move-object/from16 v7, v28

    move-object/from16 v13, v30

    move/from16 v14, v31

    move/from16 v10, v32

    move/from16 v9, v33

    move-object/from16 v5, v34

    move-object/from16 v3, v35

    :goto_4c
    invoke-virtual {v1}, Lm0/q;->x()Lm0/x1;

    move-result-object v2

    if-eqz v2, :cond_66

    new-instance v1, Lf0/h;

    move-object v0, v1

    move-object/from16 v57, v1

    move-object/from16 v1, p0

    move-object/from16 v58, v2

    move-object/from16 v2, p1

    move/from16 v17, p17

    move/from16 v18, p18

    move/from16 v19, p19

    invoke-direct/range {v0 .. v19}, Lf0/h;-><init>(Lg2/a0;Lc9/c;Ly0/o;La2/c0;Lg2/l0;Lc9/c;Lx/m;Le1/n;ZIILg2/o;Lf0/a1;ZZLc9/f;III)V

    move-object/from16 v1, v57

    move-object/from16 v0, v58

    iput-object v1, v0, Lm0/x1;->d:Lc9/e;

    :cond_66
    return-void

    :cond_67
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "no recompose scope found"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_data_0
    .sparse-switch
        0xc -> :sswitch_1
        0x13 -> :sswitch_0
    .end sparse-switch
.end method

.method public static b0(Lu8/e;)Lu8/e;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lw8/c;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lw8/c;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lw8/c;->intercepted()Lu8/e;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move-object p0, v0

    :cond_2
    :goto_1
    return-object p0
.end method

.method public static final c(Ly0/o;Lh0/v0;Lc9/e;Lm0/m;I)V
    .locals 8

    check-cast p3, Lm0/q;

    const v0, -0x1399887

    invoke-virtual {p3, v0}, Lm0/q;->a0(I)Lm0/q;

    and-int/lit8 v0, p4, 0xe

    or-int/lit16 v0, v0, 0x180

    const v1, 0x2bb5b5d7

    invoke-virtual {p3, v1}, Lm0/q;->Z(I)V

    sget-object v1, Ly0/a;->a:Ly0/g;

    const/4 v2, 0x1

    invoke-static {v1, v2, p3}, Ly/p;->c(Ly0/g;ZLm0/m;)Lr1/j0;

    move-result-object v1

    shl-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0x70

    const v3, -0x4ee9b9da

    invoke-virtual {p3, v3}, Lm0/q;->Z(I)V

    iget v3, p3, Lm0/q;->P:I

    invoke-virtual {p3}, Lm0/q;->p()Lm0/r1;

    move-result-object v4

    sget-object v5, Lt1/l;->k:Lt1/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lt1/k;->b:Lt1/j;

    invoke-static {p0}, Landroidx/compose/ui/layout/a;->i(Ly0/o;)Lu0/b;

    move-result-object v6

    shl-int/lit8 v0, v0, 0x9

    and-int/lit16 v0, v0, 0x1c00

    or-int/lit8 v0, v0, 0x6

    iget-object v7, p3, Lm0/q;->a:Lm0/d;

    instance-of v7, v7, Lm0/d;

    if-eqz v7, :cond_4

    invoke-virtual {p3}, Lm0/q;->c0()V

    iget-boolean v7, p3, Lm0/q;->O:Z

    if-eqz v7, :cond_0

    invoke-virtual {p3, v5}, Lm0/q;->o(Lc9/a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p3}, Lm0/q;->o0()V

    :goto_0
    sget-object v5, Lt1/k;->e:Lt1/i;

    invoke-static {p3, v1, v5}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    sget-object v1, Lt1/k;->d:Lt1/i;

    invoke-static {p3, v4, v1}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    sget-object v1, Lt1/k;->f:Lt1/i;

    iget-boolean v4, p3, Lm0/q;->O:Z

    if-nez v4, :cond_1

    invoke-virtual {p3}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    :cond_1
    invoke-static {v3, p3, v3, v1}, Ll/q;->r(ILm0/q;ILt1/i;)V

    :cond_2
    new-instance v1, Lm0/l2;

    invoke-direct {v1, p3}, Lm0/l2;-><init>(Lm0/m;)V

    shr-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0x70

    const v3, 0x7ab4aae9

    invoke-static {v0, v6, v1, p3, v3}, Ll/q;->s(ILu0/b;Lm0/l2;Lm0/q;I)V

    shr-int/lit8 v0, p4, 0x3

    and-int/lit8 v0, v0, 0x70

    or-int/lit8 v0, v0, 0x8

    const v1, -0x7658948d

    invoke-virtual {p3, v1}, Lm0/q;->Z(I)V

    shr-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0xe

    const/4 v1, 0x0

    invoke-static {v0, p2, p3, v1, v1}, Ll/q;->q(ILc9/e;Lm0/q;ZZ)V

    invoke-virtual {p3, v2}, Lm0/q;->t(Z)V

    invoke-virtual {p3, v1}, Lm0/q;->t(Z)V

    invoke-virtual {p3, v1}, Lm0/q;->t(Z)V

    invoke-virtual {p3}, Lm0/q;->x()Lm0/x1;

    move-result-object p3

    if-eqz p3, :cond_3

    new-instance v6, La0/g0;

    const/4 v2, 0x2

    move-object v0, v6

    move v1, p4

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, La0/g0;-><init>(IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v6, p3, Lm0/x1;->d:Lc9/e;

    :cond_3
    return-void

    :cond_4
    invoke-static {}, Lm9/e0;->C()V

    const/4 p0, 0x0

    throw p0
.end method

.method public static final c0(Lh0/v0;Z)Z
    .locals 4

    iget-object v0, p0, Lh0/v0;->d:Lf0/c2;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lf0/c2;->c()Lr1/s;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lh0/l0;->a(Lr1/s;)Ld1/d;

    move-result-object v0

    invoke-virtual {p0, p1}, Lh0/v0;->j(Z)J

    move-result-wide p0

    invoke-static {p0, p1}, Ld1/c;->d(J)F

    move-result v2

    iget v3, v0, Ld1/d;->a:F

    cmpg-float v3, v3, v2

    if-gtz v3, :cond_0

    iget v3, v0, Ld1/d;->c:F

    cmpg-float v2, v2, v3

    if-gtz v2, :cond_0

    invoke-static {p0, p1}, Ld1/c;->e(J)F

    move-result p0

    iget p1, v0, Ld1/d;->b:F

    cmpg-float p1, p1, p0

    if-gtz p1, :cond_0

    iget p1, v0, Ld1/d;->d:F

    cmpg-float p0, p0, p1

    if-gtz p0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public static final d(Ly0/o;FJLm0/m;II)V
    .locals 10

    move v5, p5

    move-object v0, p4

    check-cast v0, Lm0/q;

    const v1, 0x5d216d69

    invoke-virtual {v0, v1}, Lm0/q;->a0(I)Lm0/q;

    and-int/lit8 v1, p6, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, v5, 0x6

    move v3, v2

    move-object v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v5, 0x6

    if-nez v2, :cond_2

    move-object v2, p0

    invoke-virtual {v0, p0}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v5

    goto :goto_1

    :cond_2
    move-object v2, p0

    move v3, v5

    :goto_1
    and-int/lit8 v4, p6, 0x2

    if-eqz v4, :cond_4

    or-int/lit8 v3, v3, 0x30

    :cond_3
    move v6, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v6, v5, 0x30

    if-nez v6, :cond_3

    move v6, p1

    invoke-virtual {v0, p1}, Lm0/q;->d(F)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x20

    goto :goto_2

    :cond_5
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v3, v7

    :goto_3
    and-int/lit16 v7, v5, 0x180

    if-nez v7, :cond_8

    and-int/lit8 v7, p6, 0x4

    if-nez v7, :cond_6

    move-wide v7, p2

    invoke-virtual {v0, p2, p3}, Lm0/q;->f(J)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_4

    :cond_6
    move-wide v7, p2

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v3, v9

    goto :goto_5

    :cond_8
    move-wide v7, p2

    :goto_5
    and-int/lit16 v3, v3, 0x93

    const/16 v9, 0x92

    if-ne v3, v9, :cond_a

    invoke-virtual {v0}, Lm0/q;->G()Z

    move-result v3

    if-nez v3, :cond_9

    goto :goto_7

    :cond_9
    invoke-virtual {v0}, Lm0/q;->U()V

    move-object v1, v2

    move v2, v6

    :goto_6
    move-wide v3, v7

    goto/16 :goto_d

    :cond_a
    :goto_7
    invoke-virtual {v0}, Lm0/q;->W()V

    and-int/lit8 v3, v5, 0x1

    const/4 v9, 0x0

    if-eqz v3, :cond_c

    invoke-virtual {v0}, Lm0/q;->E()Z

    move-result v3

    if-eqz v3, :cond_b

    goto :goto_8

    :cond_b
    invoke-virtual {v0}, Lm0/q;->U()V

    move-object v1, v2

    move v2, v6

    goto :goto_b

    :cond_c
    :goto_8
    if-eqz v1, :cond_d

    sget-object v1, Ly0/l;->b:Ly0/l;

    goto :goto_9

    :cond_d
    move-object v1, v2

    :goto_9
    if-eqz v4, :cond_e

    sget v2, Lk0/u0;->a:F

    goto :goto_a

    :cond_e
    move v2, v6

    :goto_a
    and-int/lit8 v3, p6, 0x4

    if-eqz v3, :cond_f

    sget v3, Lk0/u0;->a:F

    const v3, 0x49df631

    invoke-virtual {v0, v3}, Lm0/q;->Z(I)V

    sget v3, Ll0/e;->a:F

    const/16 v3, 0x19

    invoke-static {v3, v0}, Lk0/k0;->d(ILm0/m;)J

    move-result-wide v3

    invoke-virtual {v0, v9}, Lm0/q;->t(Z)V

    move-wide v7, v3

    :cond_f
    :goto_b
    invoke-virtual {v0}, Lm0/q;->u()V

    const v3, 0x497d210a

    invoke-virtual {v0, v3}, Lm0/q;->Z(I)V

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lm2/e;->a(FF)Z

    move-result v3

    if-eqz v3, :cond_10

    sget-object v3, Lu1/s1;->e:Lm0/m3;

    invoke-virtual {v0, v3}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm2/b;

    invoke-interface {v3}, Lm2/b;->c()F

    move-result v3

    const/high16 v4, 0x3f800000    # 1.0f

    div-float/2addr v4, v3

    goto :goto_c

    :cond_10
    move v4, v2

    :goto_c
    invoke-virtual {v0, v9}, Lm0/q;->t(Z)V

    sget-object v3, Landroidx/compose/foundation/layout/c;->a:Landroidx/compose/foundation/layout/FillElement;

    invoke-interface {v1, v3}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object v3

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/c;->c(Ly0/o;F)Ly0/o;

    move-result-object v3

    sget-object v4, Le1/g0;->a:Le1/f0;

    invoke-static {v3, v7, v8, v4}, Landroidx/compose/foundation/a;->e(Ly0/o;JLe1/l0;)Ly0/o;

    move-result-object v3

    invoke-static {v3, v0, v9}, Ly/p;->a(Ly0/o;Lm0/m;I)V

    goto :goto_6

    :goto_d
    invoke-virtual {v0}, Lm0/q;->x()Lm0/x1;

    move-result-object v8

    if-eqz v8, :cond_11

    new-instance v9, Lk0/v0;

    const/4 v7, 0x0

    move-object v0, v9

    move v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lk0/v0;-><init>(Ly0/o;FJIII)V

    iput-object v9, v8, Lm0/x1;->d:Lc9/e;

    :cond_11
    return-void
.end method

.method public static d0(Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const-string v0, "singletonList(...)"

    invoke-static {p0, v0}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final e(Lh0/m;Lh0/k;Lc9/e;Lm0/m;I)V
    .locals 7

    check-cast p3, Lm0/q;

    const v0, 0x14908e21

    invoke-virtual {p3, v0}, Lm0/q;->a0(I)Lm0/q;

    and-int/lit8 v0, p4, 0xe

    if-nez v0, :cond_1

    invoke-virtual {p3, p0}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p4

    goto :goto_1

    :cond_1
    move v0, p4

    :goto_1
    and-int/lit8 v1, p4, 0x70

    if-nez v1, :cond_3

    invoke-virtual {p3, p1}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit16 v1, p4, 0x380

    if-nez v1, :cond_5

    invoke-virtual {p3, p2}, Lm0/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v1, 0x100

    goto :goto_3

    :cond_4
    const/16 v1, 0x80

    :goto_3
    or-int/2addr v0, v1

    :cond_5
    and-int/lit16 v1, v0, 0x2db

    const/16 v2, 0x92

    if-ne v1, v2, :cond_7

    invoke-virtual {p3}, Lm0/q;->G()Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {p3}, Lm0/q;->U()V

    goto :goto_5

    :cond_7
    :goto_4
    shl-int/lit8 v0, v0, 0x3

    const v1, 0x1e7b2b64

    invoke-virtual {p3, v1}, Lm0/q;->Z(I)V

    invoke-virtual {p3, p1}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {p3, p0}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {p3}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_8

    sget-object v1, Lm0/l;->a:Lk0/y0;

    if-ne v2, v1, :cond_9

    :cond_8
    new-instance v2, Lh0/j;

    invoke-direct {v2, p1, p0}, Lh0/j;-><init>(Lh0/k;Lh0/m;)V

    invoke-virtual {p3, v2}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_9
    const/4 v1, 0x0

    invoke-virtual {p3, v1}, Lm0/q;->t(Z)V

    move-object v1, v2

    check-cast v1, Lh0/j;

    const/4 v2, 0x0

    new-instance v3, Lo2/u;

    const/4 v4, 0x1

    const/16 v5, 0xf

    invoke-direct {v3, v4, v5}, Lo2/u;-><init>(ZI)V

    and-int/lit16 v0, v0, 0x1c00

    or-int/lit16 v5, v0, 0x180

    const/4 v6, 0x2

    move-object v0, v1

    move-object v1, v2

    move-object v2, v3

    move-object v3, p2

    move-object v4, p3

    invoke-static/range {v0 .. v6}, Lo2/j;->a(Lo2/t;Lc9/a;Lo2/u;Lc9/e;Lm0/m;II)V

    :goto_5
    invoke-virtual {p3}, Lm0/q;->x()Lm0/x1;

    move-result-object p3

    if-eqz p3, :cond_a

    new-instance v6, La0/g0;

    const/4 v2, 0x3

    move-object v0, v6

    move v1, p4

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, La0/g0;-><init>(IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v6, p3, Lm0/x1;->d:Lc9/e;

    :cond_a
    return-void
.end method

.method public static varargs e0([Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    const-string v0, "elements"

    invoke-static {p0, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p0

    if-lez v0, :cond_0

    invoke-static {p0}, Lb9/b;->E([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    goto :goto_0

    :cond_0
    sget-object p0, Lr8/r;->a:Lr8/r;

    :goto_0
    return-object p0
.end method

.method public static final f(Ly0/o;FJLm0/m;II)V
    .locals 13

    move/from16 v5, p5

    move-object/from16 v0, p4

    check-cast v0, Lm0/q;

    const v1, 0x47a9d25

    invoke-virtual {v0, v1}, Lm0/q;->a0(I)Lm0/q;

    and-int/lit8 v1, p6, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, v5, 0x6

    move v3, v2

    move-object v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v5, 0x6

    if-nez v2, :cond_2

    move-object v2, p0

    invoke-virtual {v0, p0}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v5

    goto :goto_1

    :cond_2
    move-object v2, p0

    move v3, v5

    :goto_1
    and-int/lit8 v4, p6, 0x2

    const/16 v6, 0x20

    if-eqz v4, :cond_4

    or-int/lit8 v3, v3, 0x30

    :cond_3
    move v7, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v7, v5, 0x30

    if-nez v7, :cond_3

    move v7, p1

    invoke-virtual {v0, p1}, Lm0/q;->d(F)Z

    move-result v8

    if-eqz v8, :cond_5

    move v8, v6

    goto :goto_2

    :cond_5
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v3, v8

    :goto_3
    and-int/lit16 v8, v5, 0x180

    const/16 v9, 0x100

    if-nez v8, :cond_7

    and-int/lit8 v8, p6, 0x4

    move-wide v10, p2

    if-nez v8, :cond_6

    invoke-virtual {v0, v10, v11}, Lm0/q;->f(J)Z

    move-result v8

    if-eqz v8, :cond_6

    move v8, v9

    goto :goto_4

    :cond_6
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v3, v8

    goto :goto_5

    :cond_7
    move-wide v10, p2

    :goto_5
    and-int/lit16 v8, v3, 0x93

    const/16 v12, 0x92

    if-ne v8, v12, :cond_9

    invoke-virtual {v0}, Lm0/q;->G()Z

    move-result v8

    if-nez v8, :cond_8

    goto :goto_7

    :cond_8
    invoke-virtual {v0}, Lm0/q;->U()V

    move-object v1, v2

    move v2, v7

    :goto_6
    move-wide v3, v10

    goto/16 :goto_e

    :cond_9
    :goto_7
    invoke-virtual {v0}, Lm0/q;->W()V

    and-int/lit8 v8, v5, 0x1

    const/4 v12, 0x0

    if-eqz v8, :cond_c

    invoke-virtual {v0}, Lm0/q;->E()Z

    move-result v8

    if-eqz v8, :cond_a

    goto :goto_8

    :cond_a
    invoke-virtual {v0}, Lm0/q;->U()V

    and-int/lit8 v1, p6, 0x4

    if-eqz v1, :cond_b

    and-int/lit16 v3, v3, -0x381

    :cond_b
    move-object v1, v2

    move v2, v7

    goto :goto_b

    :cond_c
    :goto_8
    if-eqz v1, :cond_d

    sget-object v1, Ly0/l;->b:Ly0/l;

    goto :goto_9

    :cond_d
    move-object v1, v2

    :goto_9
    if-eqz v4, :cond_e

    sget v2, Lk0/u0;->a:F

    goto :goto_a

    :cond_e
    move v2, v7

    :goto_a
    and-int/lit8 v4, p6, 0x4

    if-eqz v4, :cond_f

    sget v4, Lk0/u0;->a:F

    const v4, 0x49df631

    invoke-virtual {v0, v4}, Lm0/q;->Z(I)V

    sget v4, Ll0/e;->a:F

    const/16 v4, 0x19

    invoke-static {v4, v0}, Lk0/k0;->d(ILm0/m;)J

    move-result-wide v7

    invoke-virtual {v0, v12}, Lm0/q;->t(Z)V

    and-int/lit16 v3, v3, -0x381

    move-wide v10, v7

    :cond_f
    :goto_b
    invoke-virtual {v0}, Lm0/q;->u()V

    sget-object v4, Landroidx/compose/foundation/layout/c;->a:Landroidx/compose/foundation/layout/FillElement;

    invoke-interface {v1, v4}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object v4

    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/c;->c(Ly0/o;F)Ly0/o;

    move-result-object v4

    const v7, 0x3820a7b8

    invoke-virtual {v0, v7}, Lm0/q;->Z(I)V

    and-int/lit8 v7, v3, 0x70

    const/4 v8, 0x1

    if-ne v7, v6, :cond_10

    move v6, v8

    goto :goto_c

    :cond_10
    move v6, v12

    :goto_c
    and-int/lit16 v7, v3, 0x380

    xor-int/lit16 v7, v7, 0x180

    if-le v7, v9, :cond_11

    invoke-virtual {v0, v10, v11}, Lm0/q;->f(J)Z

    move-result v7

    if-nez v7, :cond_13

    :cond_11
    and-int/lit16 v3, v3, 0x180

    if-ne v3, v9, :cond_12

    goto :goto_d

    :cond_12
    move v8, v12

    :cond_13
    :goto_d
    or-int v3, v6, v8

    invoke-virtual {v0}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v6

    if-nez v3, :cond_14

    sget-object v3, Lm0/l;->a:Lk0/y0;

    if-ne v6, v3, :cond_15

    :cond_14
    new-instance v6, Lk0/w0;

    invoke-direct {v6, v2, v10, v11}, Lk0/w0;-><init>(FJ)V

    invoke-virtual {v0, v6}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_15
    check-cast v6, Lc9/c;

    invoke-virtual {v0, v12}, Lm0/q;->t(Z)V

    invoke-static {v4, v6, v0, v12}, Landroidx/compose/foundation/a;->b(Ly0/o;Lc9/c;Lm0/m;I)V

    goto/16 :goto_6

    :goto_e
    invoke-virtual {v0}, Lm0/q;->x()Lm0/x1;

    move-result-object v8

    if-eqz v8, :cond_16

    new-instance v9, Lk0/v0;

    const/4 v7, 0x1

    move-object v0, v9

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lk0/v0;-><init>(Ly0/o;FJIII)V

    iput-object v9, v8, Lm0/x1;->d:Lc9/e;

    :cond_16
    return-void
.end method

.method public static varargs f0([Ljava/lang/Object;)Ljava/util/ArrayList;
    .locals 3

    const-string v0, "elements"

    invoke-static {p0, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p0

    if-nez v0, :cond_0

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    new-instance v1, Lr8/k;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lr8/k;-><init>([Ljava/lang/Object;Z)V

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method

.method public static final g(Ly0/o;Lb0/h0;Ly/t0;ZLv/h1;Lw/h;ZIFLb0/j;Ln1/a;Lc9/c;Ly0/b;Ly0/c;Lc9/g;Lm0/m;III)V
    .locals 23

    move-object/from16 v12, p1

    move-object/from16 v13, p4

    move-object/from16 v14, p5

    move/from16 v15, p18

    move-object/from16 v11, p15

    check-cast v11, Lm0/q;

    const v0, -0x11fabc8f

    invoke-virtual {v11, v0}, Lm0/q;->a0(I)Lm0/q;

    and-int/lit16 v0, v15, 0x80

    const/4 v10, 0x0

    if-eqz v0, :cond_0

    move v9, v10

    goto :goto_0

    :cond_0
    move/from16 v9, p7

    :goto_0
    and-int/lit16 v0, v15, 0x100

    if-eqz v0, :cond_1

    int-to-float v0, v10

    move v8, v0

    goto :goto_1

    :cond_1
    move/from16 v8, p8

    :goto_1
    if-ltz v9, :cond_18

    invoke-static {v11}, Lv/t0;->d(Lm0/m;)Lu/b2;

    move-result-object v16

    const v0, 0x4eaf133e

    invoke-virtual {v11, v0}, Lm0/q;->Z(I)V

    invoke-virtual {v11, v12}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v11}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v1

    sget-object v7, Lm0/l;->a:Lk0/y0;

    const/4 v6, 0x1

    if-nez v0, :cond_2

    if-ne v1, v7, :cond_3

    :cond_2
    new-instance v1, Lb0/c;

    invoke-direct {v1, v6, v12}, Lb0/c;-><init>(ILb0/h0;)V

    invoke-virtual {v11, v1}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_3
    check-cast v1, Lc9/a;

    invoke-virtual {v11, v10}, Lm0/q;->t(Z)V

    const v0, -0x51cec4ba

    invoke-virtual {v11, v0}, Lm0/q;->Z(I)V

    move-object/from16 v5, p14

    invoke-static {v5, v11}, Ld7/t;->m0(Ljava/lang/Object;Lm0/m;)Lm0/g1;

    move-result-object v0

    move-object/from16 v4, p11

    invoke-static {v4, v11}, Ld7/t;->m0(Ljava/lang/Object;Lm0/m;)Lm0/g1;

    move-result-object v2

    filled-new-array {v12, v0, v2, v1}, [Ljava/lang/Object;

    move-result-object v3

    const v10, -0x21de6e89

    invoke-virtual {v11, v10}, Lm0/q;->Z(I)V

    const/4 v10, 0x0

    const/16 v17, 0x0

    :goto_2
    const/4 v6, 0x4

    if-ge v10, v6, :cond_4

    aget-object v6, v3, v10

    invoke-virtual {v11, v6}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v6

    or-int v17, v17, v6

    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    :cond_4
    invoke-virtual {v11}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v3

    if-nez v17, :cond_6

    if-ne v3, v7, :cond_5

    goto :goto_3

    :cond_5
    const/4 v0, 0x0

    const/4 v10, 0x1

    goto :goto_4

    :cond_6
    :goto_3
    sget-object v3, Lm0/h2;->a:Lm0/h2;

    new-instance v6, Lz/p;

    const/4 v10, 0x1

    invoke-direct {v6, v0, v2, v1, v10}, Lz/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v3, v6}, Ld7/t;->S(Lm0/z2;Lc9/a;)Lm0/j0;

    move-result-object v0

    new-instance v1, Lu/r0;

    invoke-direct {v1, v10, v0, v12}, Lu/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3, v1}, Ld7/t;->S(Lm0/z2;Lc9/a;)Lm0/j0;

    move-result-object v0

    new-instance v3, Lz/n;

    invoke-direct {v3, v0, v10}, Lz/n;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v11, v3}, Lm0/q;->l0(Ljava/lang/Object;)V

    const/4 v0, 0x0

    :goto_4
    invoke-virtual {v11, v0}, Lm0/q;->t(Z)V

    move-object/from16 v17, v3

    check-cast v17, Lj9/e;

    invoke-virtual {v11, v0}, Lm0/q;->t(Z)V

    sget-object v18, Lb0/o0;->d:Lb0/l0;

    const v0, 0x4eaf1568    # 1.4687078E9f

    invoke-virtual {v11, v0}, Lm0/q;->Z(I)V

    invoke-virtual {v11, v12}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v11}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_8

    if-ne v1, v7, :cond_7

    goto :goto_5

    :cond_7
    const/4 v6, 0x0

    goto :goto_6

    :cond_8
    :goto_5
    new-instance v1, Lb0/c;

    const/4 v6, 0x0

    invoke-direct {v1, v6, v12}, Lb0/c;-><init>(ILb0/h0;)V

    invoke-virtual {v11, v1}, Lm0/q;->l0(Ljava/lang/Object;)V

    :goto_6
    move-object/from16 v19, v1

    check-cast v19, Lc9/a;

    invoke-virtual {v11, v6}, Lm0/q;->t(Z)V

    const v0, -0x604e05ba

    invoke-virtual {v11, v0}, Lm0/q;->Z(I)V

    invoke-static/range {p3 .. p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    new-instance v3, Lm2/e;

    invoke-direct {v3, v8}, Lm2/e;-><init>(F)V

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v20, v3

    move-object/from16 v3, p4

    move-object/from16 v4, p12

    move-object/from16 v5, p13

    move v15, v10

    move v10, v6

    move-object/from16 v6, v20

    move-object v15, v7

    move-object/from16 v7, p9

    move/from16 v20, v8

    move-object/from16 v8, v18

    move/from16 p15, v9

    move-object/from16 v9, v19

    filled-new-array/range {v0 .. v9}, [Ljava/lang/Object;

    move-result-object v0

    const v1, -0x21de6e89

    invoke-virtual {v11, v1}, Lm0/q;->Z(I)V

    move v1, v10

    move v2, v1

    :goto_7
    const/16 v3, 0xa

    if-ge v1, v3, :cond_9

    aget-object v3, v0, v1

    invoke-virtual {v11, v3}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    :cond_9
    invoke-virtual {v11}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v0

    if-nez v2, :cond_b

    if-ne v0, v15, :cond_a

    goto :goto_8

    :cond_a
    move v1, v10

    move-object/from16 v18, v15

    move-object v15, v11

    goto :goto_9

    :cond_b
    :goto_8
    new-instance v9, Lb0/w;

    move-object v0, v9

    move-object/from16 v1, p4

    move-object/from16 v2, p2

    move/from16 v3, p3

    move-object/from16 v4, p1

    move/from16 v5, v20

    move-object/from16 v6, p9

    move-object/from16 v7, v17

    move-object/from16 v8, v19

    move-object v13, v9

    move-object/from16 v9, p13

    move-object/from16 v18, v15

    move v15, v10

    move-object/from16 v10, p12

    move-object v15, v11

    move/from16 v11, p15

    invoke-direct/range {v0 .. v11}, Lb0/w;-><init>(Lv/h1;Ly/t0;ZLb0/h0;FLb0/j;Lj9/e;Lc9/a;Ly0/c;Ly0/b;I)V

    invoke-virtual {v15, v13}, Lm0/q;->l0(Ljava/lang/Object;)V

    move-object v0, v13

    const/4 v1, 0x0

    :goto_9
    invoke-virtual {v15, v1}, Lm0/q;->t(Z)V

    move-object v9, v0

    check-cast v9, Lc9/e;

    invoke-virtual {v15, v1}, Lm0/q;->t(Z)V

    const v7, 0x1e7b2b64

    invoke-virtual {v15, v7}, Lm0/q;->Z(I)V

    invoke-virtual {v15, v14}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v15, v12}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-virtual {v15}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v8, v18

    if-nez v0, :cond_d

    if-ne v1, v8, :cond_c

    goto :goto_b

    :cond_c
    :goto_a
    const/4 v0, 0x0

    goto :goto_c

    :cond_d
    :goto_b
    new-instance v1, Lb0/q0;

    invoke-direct {v1, v14, v12}, Lb0/q0;-><init>(Lw/h;Lb0/h0;)V

    invoke-virtual {v15, v1}, Lm0/q;->l0(Ljava/lang/Object;)V

    goto :goto_a

    :goto_c
    invoke-virtual {v15, v0}, Lm0/q;->t(Z)V

    move-object v10, v1

    check-cast v10, Lb0/q0;

    sget-object v11, Lv/h1;->a:Lv/h1;

    move-object/from16 v13, p4

    if-ne v13, v11, :cond_e

    const/4 v0, 0x1

    goto :goto_d

    :cond_e
    const/4 v0, 0x0

    :goto_d
    const v1, 0x14fe4cc3

    invoke-virtual {v15, v1}, Lm0/q;->Z(I)V

    invoke-static/range {p3 .. p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const v3, 0x607fb4c4

    invoke-virtual {v15, v3}, Lm0/q;->Z(I)V

    invoke-virtual {v15, v12}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v15, v1}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v1, v3

    invoke-virtual {v15, v2}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v15}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_10

    if-ne v2, v8, :cond_f

    goto :goto_f

    :cond_f
    :goto_e
    const/4 v0, 0x0

    goto :goto_10

    :cond_10
    :goto_f
    new-instance v2, Lz/d;

    const/4 v1, 0x1

    invoke-direct {v2, v12, v0, v1}, Lz/d;-><init>(Lv/f2;ZI)V

    invoke-virtual {v15, v2}, Lm0/q;->l0(Ljava/lang/Object;)V

    goto :goto_e

    :goto_10
    invoke-virtual {v15, v0}, Lm0/q;->t(Z)V

    check-cast v2, La0/h0;

    invoke-virtual {v15, v0}, Lm0/q;->t(Z)V

    const v0, 0x44faf204

    invoke-virtual {v15, v0}, Lm0/q;->Z(I)V

    invoke-virtual {v15, v12}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v15}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_12

    if-ne v1, v8, :cond_11

    goto :goto_12

    :cond_11
    :goto_11
    const/4 v0, 0x0

    goto :goto_13

    :cond_12
    :goto_12
    new-instance v1, Lb0/l;

    invoke-direct {v1, v12}, Lb0/l;-><init>(Lb0/h0;)V

    invoke-virtual {v15, v1}, Lm0/q;->l0(Ljava/lang/Object;)V

    goto :goto_11

    :goto_13
    invoke-virtual {v15, v0}, Lm0/q;->t(Z)V

    move-object/from16 v18, v1

    check-cast v18, Lb0/l;

    iget-object v0, v12, Lb0/h0;->y:Lz/b0;

    move-object/from16 v6, p0

    invoke-interface {v6, v0}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object v0

    iget-object v1, v12, Lb0/h0;->w:La0/b;

    invoke-interface {v0, v1}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object v0

    move-object/from16 v1, v17

    move-object/from16 v3, p4

    move/from16 v4, p6

    move/from16 v5, p3

    move-object v6, v15

    invoke-static/range {v0 .. v6}, Lf6/a;->b0(Ly0/o;Lj9/e;La0/h0;Lv/h1;ZZLm0/m;)Ly0/o;

    move-result-object v0

    if-ne v13, v11, :cond_13

    sget-object v1, Lu/i0;->c:Ly0/o;

    goto :goto_14

    :cond_13
    sget-object v1, Lu/i0;->b:Ly0/o;

    :goto_14
    invoke-interface {v0, v1}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object v0

    const v1, 0x16440bee

    invoke-virtual {v15, v1}, Lm0/q;->Z(I)V

    invoke-static/range {p15 .. p15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v15, v7}, Lm0/q;->Z(I)V

    invoke-virtual {v15, v12}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v15, v1}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v1, v2

    invoke-virtual {v15}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_15

    if-ne v2, v8, :cond_14

    goto :goto_16

    :cond_14
    move/from16 v8, p15

    :goto_15
    const/4 v1, 0x0

    goto :goto_17

    :cond_15
    :goto_16
    new-instance v2, Lb0/k;

    move/from16 v8, p15

    invoke-direct {v2, v8, v12}, Lb0/k;-><init>(ILb0/h0;)V

    invoke-virtual {v15, v2}, Lm0/q;->l0(Ljava/lang/Object;)V

    goto :goto_15

    :goto_17
    invoke-virtual {v15, v1}, Lm0/q;->t(Z)V

    check-cast v2, Lb0/k;

    invoke-virtual {v15, v1}, Lm0/q;->t(Z)V

    iget-object v3, v12, Lb0/h0;->v:La0/j;

    sget-object v7, Lu1/s1;->k:Lm0/m3;

    invoke-virtual {v15, v7}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lm2/l;

    move-object v1, v2

    move-object v2, v3

    move/from16 v3, p3

    move-object/from16 v5, p4

    move/from16 v6, p6

    move/from16 p15, v8

    move-object v8, v7

    move-object v7, v15

    invoke-static/range {v0 .. v7}, Lf6/a;->a0(Ly0/o;La0/n;La0/j;ZLm2/l;Lv/h1;ZLm0/m;)Ly0/o;

    move-result-object v0

    invoke-interface/range {v16 .. v16}, Lu/b2;->c()Ly0/o;

    move-result-object v1

    invoke-interface {v0, v1}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object v0

    invoke-virtual {v15, v8}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm2/l;

    xor-int/lit8 v2, p3, 0x1

    sget-object v3, Lm2/l;->b:Lm2/l;

    if-ne v1, v3, :cond_16

    if-eq v13, v11, :cond_16

    move/from16 v5, p3

    goto :goto_18

    :cond_16
    move v5, v2

    :goto_18
    iget-object v7, v12, Lb0/h0;->r:Lx/m;

    move-object/from16 v1, p1

    move-object/from16 v2, p4

    move-object/from16 v3, v16

    move/from16 v4, p6

    move-object v6, v10

    move/from16 v10, p15

    move-object/from16 v8, v18

    invoke-static/range {v0 .. v8}, Landroidx/compose/foundation/gestures/a;->b(Ly0/o;Lv/f2;Lv/h1;Lu/b2;ZZLv/y0;Lx/m;Lv/o;)Ly0/o;

    move-result-object v0

    sget-object v1, Ly0/l;->b:Ly0/l;

    new-instance v2, Lb0/f;

    const/4 v3, 0x0

    invoke-direct {v2, v12, v3}, Lb0/f;-><init>(Lb0/h0;Lu8/e;)V

    invoke-static {v1, v12, v2}, Lo1/c0;->a(Ly0/o;Ljava/lang/Object;Lc9/e;)Ly0/o;

    move-result-object v1

    invoke-interface {v0, v1}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object v0

    move-object/from16 v11, p10

    invoke-static {v0, v11}, Landroidx/compose/ui/input/nestedscroll/a;->a(Ly0/o;Ln1/a;)Ly0/o;

    move-result-object v1

    iget-object v2, v12, Lb0/h0;->u:La0/d0;

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v0, v17

    move-object v3, v9

    move-object v4, v15

    invoke-static/range {v0 .. v6}, Lf6/a;->f(Lc9/a;Ly0/o;La0/d0;Lc9/e;Lm0/m;II)V

    invoke-virtual {v15}, Lm0/q;->x()Lm0/x1;

    move-result-object v15

    if-eqz v15, :cond_17

    new-instance v9, Lb0/b;

    move-object v0, v9

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move v8, v10

    move-object v14, v9

    move/from16 v9, v20

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v21, v14

    move-object/from16 v14, p13

    move-object/from16 v22, v15

    move-object/from16 v15, p14

    move/from16 v16, p16

    move/from16 v17, p17

    move/from16 v18, p18

    invoke-direct/range {v0 .. v18}, Lb0/b;-><init>(Ly0/o;Lb0/h0;Ly/t0;ZLv/h1;Lw/h;ZIFLb0/j;Ln1/a;Lc9/c;Ly0/b;Ly0/c;Lc9/g;III)V

    move-object/from16 v1, v21

    move-object/from16 v0, v22

    iput-object v1, v0, Lm0/x1;->d:Lc9/e;

    :cond_17
    return-void

    :cond_18
    move v10, v9

    const-string v0, "beyondBoundsPageCount should be greater than or equal to 0, you selected "

    invoke-static {v0, v10}, Ll/q;->g(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static final g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;
    .locals 1

    sget v0, Lm0/b;->b:I

    new-instance v0, Lm0/n1;

    invoke-direct {v0, p0, p1}, Lm0/y2;-><init>(Ljava/lang/Object;Lm0/z2;)V

    return-object v0
.end method

.method public static final h(Lh0/m;ZLl2/h;ZLy0/o;Lm0/m;I)V
    .locals 9

    check-cast p5, Lm0/q;

    const v0, -0x255e9317

    invoke-virtual {p5, v0}, Lm0/q;->a0(I)Lm0/q;

    and-int/lit8 v0, p6, 0xe

    if-nez v0, :cond_1

    invoke-virtual {p5, p0}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p6

    goto :goto_1

    :cond_1
    move v0, p6

    :goto_1
    and-int/lit8 v1, p6, 0x70

    if-nez v1, :cond_3

    invoke-virtual {p5, p1}, Lm0/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit16 v1, p6, 0x380

    if-nez v1, :cond_5

    invoke-virtual {p5, p2}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v1, 0x100

    goto :goto_3

    :cond_4
    const/16 v1, 0x80

    :goto_3
    or-int/2addr v0, v1

    :cond_5
    and-int/lit16 v1, p6, 0x1c00

    if-nez v1, :cond_7

    invoke-virtual {p5, p3}, Lm0/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_6

    const/16 v1, 0x800

    goto :goto_4

    :cond_6
    const/16 v1, 0x400

    :goto_4
    or-int/2addr v0, v1

    :cond_7
    const v1, 0xe000

    and-int/2addr v1, p6

    if-nez v1, :cond_9

    invoke-virtual {p5, p4}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    const/16 v1, 0x4000

    goto :goto_5

    :cond_8
    const/16 v1, 0x2000

    :goto_5
    or-int/2addr v0, v1

    :cond_9
    const v1, 0xb6db

    and-int/2addr v1, v0

    const/16 v2, 0x2492

    if-ne v1, v2, :cond_b

    invoke-virtual {p5}, Lm0/q;->G()Z

    move-result v1

    if-nez v1, :cond_a

    goto :goto_6

    :cond_a
    invoke-virtual {p5}, Lm0/q;->U()V

    goto :goto_a

    :cond_b
    :goto_6
    const/4 v1, 0x0

    sget-object v2, Ll2/h;->b:Ll2/h;

    sget-object v3, Ll2/h;->a:Ll2/h;

    const/4 v4, 0x1

    if-eqz p1, :cond_f

    if-ne p2, v3, :cond_c

    if-eqz p3, :cond_d

    :cond_c
    if-ne p2, v2, :cond_e

    if-eqz p3, :cond_e

    :cond_d
    move v1, v4

    :cond_e
    :goto_7
    move v5, v1

    goto :goto_8

    :cond_f
    if-ne p2, v3, :cond_10

    if-eqz p3, :cond_e

    :cond_10
    if-ne p2, v2, :cond_11

    if-eqz p3, :cond_11

    goto :goto_7

    :cond_11
    move v5, v4

    :goto_8
    if-eqz v5, :cond_12

    sget-object v1, Lh0/k;->b:Lh0/k;

    goto :goto_9

    :cond_12
    sget-object v1, Lh0/k;->a:Lh0/k;

    :goto_9
    sget-object v2, Lu1/s1;->p:Lm0/m3;

    invoke-virtual {p5, v2}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lu1/y2;

    new-instance v8, Lh0/c;

    move-object v2, v8

    move-object v4, p4

    move-object v6, p0

    move v7, p1

    invoke-direct/range {v2 .. v7}, Lh0/c;-><init>(Lu1/y2;Ly0/o;ZLh0/m;Z)V

    const v2, 0x6f5bff20

    invoke-static {p5, v2, v8}, Ld7/t;->K(Lm0/m;ILd9/j;)Lu0/b;

    move-result-object v2

    and-int/lit8 v0, v0, 0xe

    or-int/lit16 v0, v0, 0x180

    invoke-static {p0, v1, v2, p5, v0}, Ld7/t;->e(Lh0/m;Lh0/k;Lc9/e;Lm0/m;I)V

    :goto_a
    invoke-virtual {p5}, Lm0/q;->x()Lm0/x1;

    move-result-object p5

    if-eqz p5, :cond_13

    new-instance v7, Lh0/d;

    move-object v0, v7

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move v6, p6

    invoke-direct/range {v0 .. v6}, Lh0/d;-><init>(Lh0/m;ZLl2/h;ZLy0/o;I)V

    iput-object v7, p5, Lm0/x1;->d:Lc9/e;

    :cond_13
    return-void
.end method

.method public static synthetic h0(Ljava/lang/Object;)Lm0/n1;
    .locals 1

    sget-object v0, Lm0/o3;->a:Lm0/o3;

    invoke-static {p0, v0}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p0

    return-object p0
.end method

.method public static final i(Ly0/o;Lc9/a;ZLm0/m;I)V
    .locals 2

    check-cast p3, Lm0/q;

    const v0, 0x7ddd909a

    invoke-virtual {p3, v0}, Lm0/q;->a0(I)Lm0/q;

    and-int/lit8 v0, p4, 0xe

    if-nez v0, :cond_1

    invoke-virtual {p3, p0}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p4

    goto :goto_1

    :cond_1
    move v0, p4

    :goto_1
    and-int/lit8 v1, p4, 0x70

    if-nez v1, :cond_3

    invoke-virtual {p3, p1}, Lm0/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit16 v1, p4, 0x380

    if-nez v1, :cond_5

    invoke-virtual {p3, p2}, Lm0/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v1, 0x100

    goto :goto_3

    :cond_4
    const/16 v1, 0x80

    :goto_3
    or-int/2addr v0, v1

    :cond_5
    and-int/lit16 v0, v0, 0x2db

    const/16 v1, 0x92

    if-ne v0, v1, :cond_7

    invoke-virtual {p3}, Lm0/q;->G()Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {p3}, Lm0/q;->U()V

    goto :goto_5

    :cond_7
    :goto_4
    sget v0, Lh0/d0;->a:F

    sget v1, Lh0/d0;->b:F

    invoke-static {p0, v0, v1}, Landroidx/compose/foundation/layout/c;->i(Ly0/o;FF)Ly0/o;

    move-result-object v0

    new-instance v1, Lh0/g;

    invoke-direct {v1, p1, p2}, Lh0/g;-><init>(Lc9/a;Z)V

    invoke-static {v0, v1}, Lm9/e0;->v(Ly0/o;Lc9/f;)Ly0/o;

    move-result-object v0

    invoke-static {v0, p3}, Landroidx/compose/foundation/layout/a;->c(Ly0/o;Lm0/m;)V

    :goto_5
    invoke-virtual {p3}, Lm0/q;->x()Lm0/x1;

    move-result-object p3

    if-eqz p3, :cond_8

    new-instance v0, Lh0/e;

    invoke-direct {v0, p0, p1, p2, p4}, Lh0/e;-><init>(Ly0/o;Lc9/a;ZI)V

    iput-object v0, p3, Lm0/x1;->d:Lc9/e;

    :cond_8
    return-void
.end method

.method public static final i0(Lf0/c2;Lg2/a0;Lg2/s;)V
    .locals 9

    invoke-static {}, Lk0/y0;->c()Lw0/i;

    move-result-object v0

    :try_start_0
    invoke-virtual {v0}, Lw0/i;->j()Lw0/i;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {p0}, Lf0/c2;->d()Lf0/d2;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v2, :cond_0

    :try_start_2
    invoke-static {v1}, Lw0/i;->p(Lw0/i;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-virtual {v0}, Lw0/i;->c()V

    return-void

    :cond_0
    :try_start_3
    iget-object v6, p0, Lf0/c2;->e:Lg2/h0;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-nez v6, :cond_1

    :try_start_4
    invoke-static {v1}, Lw0/i;->p(Lw0/i;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    invoke-virtual {v0}, Lw0/i;->c()V

    return-void

    :cond_1
    :try_start_5
    invoke-virtual {p0}, Lf0/c2;->c()Lr1/s;

    move-result-object v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-nez v5, :cond_2

    :try_start_6
    invoke-static {v1}, Lw0/i;->p(Lw0/i;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    invoke-virtual {v0}, Lw0/i;->c()V

    return-void

    :cond_2
    :try_start_7
    iget-object v3, p0, Lf0/c2;->a:Lf0/j1;

    iget-object v4, v2, Lf0/d2;->a:La2/a0;

    invoke-virtual {p0}, Lf0/c2;->b()Z

    move-result v7

    move-object v2, p1

    move-object v8, p2

    invoke-static/range {v2 .. v8}, La/a;->b(Lg2/a0;Lf0/j1;La2/a0;Lr1/s;Lg2/h0;ZLg2/s;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :try_start_8
    invoke-static {v1}, Lw0/i;->p(Lw0/i;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    invoke-virtual {v0}, Lw0/i;->c()V

    return-void

    :catchall_0
    move-exception p0

    :try_start_9
    invoke-static {v1}, Lw0/i;->p(Lw0/i;)V

    throw p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    :catchall_1
    move-exception p0

    invoke-virtual {v0}, Lw0/i;->c()V

    throw p0
.end method

.method public static final j(FF)J
    .locals 4

    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long v0, p0

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long p0, p0

    const/16 v2, 0x20

    shl-long/2addr v0, v2

    const-wide v2, 0xffffffffL

    and-long/2addr p0, v2

    or-long/2addr p0, v0

    sget v0, Ld1/f;->d:I

    return-wide p0
.end method

.method public static final j0(Ljava/util/List;)Ljava/util/List;
    .locals 2

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ld7/t;->d0(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    goto :goto_0

    :cond_1
    sget-object p0, Lr8/r;->a:Lr8/r;

    :goto_0
    return-object p0
.end method

.method public static k()Lm9/y1;
    .locals 2

    new-instance v0, Lm9/y1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lm9/i1;-><init>(Lm9/f1;)V

    return-object v0
.end method

.method public static final k0(Lm0/r1;Lm0/u1;)Ljava/lang/Object;
    .locals 1

    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>"

    invoke-static {p1, v0}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lm0/l3;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_0

    :cond_1
    iget-object p0, p1, Lm0/z;->a:Lm0/z0;

    iget-object p0, p0, Lm0/z0;->a:Lq8/i;

    invoke-virtual {p0}, Lq8/i;->getValue()Ljava/lang/Object;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static final l(Lh0/v0;Lm0/m;I)V
    .locals 10

    check-cast p1, Lm0/q;

    const v0, -0x5597ad88

    invoke-virtual {p1, v0}, Lm0/q;->a0(I)Lm0/q;

    iget-object v0, p0, Lh0/v0;->d:Lf0/c2;

    if-eqz v0, :cond_6

    iget-object v0, v0, Lf0/c2;->o:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lh0/v0;->d:Lf0/c2;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v0, Lf0/c2;->a:Lf0/j1;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lf0/j1;->a:La2/e;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_6

    iget-object v0, v0, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_6

    const v0, 0x44faf204

    invoke-virtual {p1, v0}, Lm0/q;->Z(I)V

    invoke-virtual {p1, p0}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {p1}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lm0/l;->a:Lk0/y0;

    const/4 v5, 0x0

    if-nez v0, :cond_1

    if-ne v3, v4, :cond_2

    :cond_1
    new-instance v3, Lh0/s0;

    invoke-direct {v3, p0, v5}, Lh0/s0;-><init>(Lh0/v0;I)V

    invoke-virtual {p1, v3}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_2
    invoke-virtual {p1, v5}, Lm0/q;->t(Z)V

    check-cast v3, Lf0/k1;

    sget-object v0, Lu1/s1;->e:Lm0/m3;

    invoke-virtual {p1, v0}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm2/b;

    iget-object v6, p0, Lh0/v0;->b:Lg2/s;

    invoke-virtual {p0}, Lh0/v0;->k()Lg2/a0;

    move-result-object v7

    iget-wide v7, v7, Lg2/a0;->b:J

    sget v9, La2/b0;->c:I

    const/16 v9, 0x20

    shr-long/2addr v7, v9

    long-to-int v7, v7

    invoke-interface {v6, v7}, Lg2/s;->b(I)I

    move-result v6

    iget-object v7, p0, Lh0/v0;->d:Lf0/c2;

    if-eqz v7, :cond_3

    invoke-virtual {v7}, Lf0/c2;->d()Lf0/d2;

    move-result-object v7

    goto :goto_1

    :cond_3
    move-object v7, v2

    :goto_1
    invoke-static {v7}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v7, v7, Lf0/d2;->a:La2/a0;

    iget-object v8, v7, La2/a0;->a:La2/z;

    iget-object v8, v8, La2/z;->a:La2/e;

    iget-object v8, v8, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    invoke-static {v6, v5, v8}, Lz6/a;->r(III)I

    move-result v6

    invoke-virtual {v7, v6}, La2/a0;->c(I)Ld1/d;

    move-result-object v6

    sget v7, Lf0/n1;->b:F

    invoke-interface {v0, v7}, Lm2/b;->v(F)F

    move-result v0

    const/4 v7, 0x2

    int-to-float v7, v7

    div-float/2addr v0, v7

    iget v7, v6, Ld1/d;->a:F

    add-float/2addr v0, v7

    iget v6, v6, Ld1/d;->d:F

    invoke-static {v0, v6}, Ld9/i;->f(FF)J

    move-result-wide v6

    sget-object v0, Ly0/l;->b:Ly0/l;

    new-instance v8, Lf0/j0;

    invoke-direct {v8, v3, p0, v2}, Lf0/j0;-><init>(Lf0/k1;Lh0/v0;Lu8/e;)V

    invoke-static {v0, v3, v8}, Lo1/c0;->a(Ly0/o;Ljava/lang/Object;Lc9/e;)Ly0/o;

    move-result-object v0

    const v2, -0x1043be8c

    invoke-virtual {p1, v2}, Lm0/q;->Z(I)V

    invoke-virtual {p1, v6, v7}, Lm0/q;->f(J)Z

    move-result v2

    invoke-virtual {p1}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_4

    if-ne v3, v4, :cond_5

    :cond_4
    new-instance v3, Lf0/d;

    invoke-direct {v3, v6, v7, v1}, Lf0/d;-><init>(JI)V

    invoke-virtual {p1, v3}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_5
    check-cast v3, Lc9/c;

    invoke-virtual {p1, v5}, Lm0/q;->t(Z)V

    invoke-static {v0, v5, v3}, Ly1/l;->a(Ly0/o;ZLc9/c;)Ly0/o;

    move-result-object v2

    const/4 v3, 0x0

    const/16 v5, 0x180

    move-wide v0, v6

    move-object v4, p1

    invoke-static/range {v0 .. v5}, Lf0/f;->a(JLy0/o;Lc9/e;Lm0/m;I)V

    :cond_6
    invoke-virtual {p1}, Lm0/q;->x()Lm0/x1;

    move-result-object p1

    if-eqz p1, :cond_7

    new-instance v0, Lt/o0;

    const/4 v1, 0x3

    invoke-direct {v0, p0, p2, v1}, Lt/o0;-><init>(Ljava/lang/Object;II)V

    iput-object v0, p1, Lm0/x1;->d:Lc9/e;

    :cond_7
    return-void
.end method

.method public static final l0(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p0, Lm9/u;

    if-eqz v0, :cond_0

    check-cast p0, Lm9/u;

    iget-object p0, p0, Lm9/u;->a:Ljava/lang/Throwable;

    invoke-static {p0}, Ld7/t;->N(Ljava/lang/Throwable;)Lq8/g;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static final m(ZLl2/h;Lh0/v0;Lm0/m;I)V
    .locals 7

    check-cast p3, Lm0/q;

    const v0, -0x50245748

    invoke-virtual {p3, v0}, Lm0/q;->a0(I)Lm0/q;

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const v1, 0x1e7b2b64

    invoke-virtual {p3, v1}, Lm0/q;->Z(I)V

    invoke-virtual {p3, v0}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {p3, p2}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-virtual {p3}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_0

    sget-object v0, Lm0/l;->a:Lk0/y0;

    if-ne v1, v0, :cond_1

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lh0/t0;

    invoke-direct {v1, p2, p0}, Lh0/t0;-><init>(Lh0/v0;Z)V

    invoke-virtual {p3, v1}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Lm0/q;->t(Z)V

    check-cast v1, Lf0/k1;

    new-instance v0, Lh0/w0;

    invoke-direct {v0, p2, p0}, Lh0/w0;-><init>(Lh0/v0;Z)V

    invoke-virtual {p2}, Lh0/v0;->k()Lg2/a0;

    move-result-object v2

    iget-wide v2, v2, Lg2/a0;->b:J

    invoke-static {v2, v3}, La2/b0;->f(J)Z

    move-result v3

    sget-object v2, Ly0/l;->b:Ly0/l;

    new-instance v4, Lh0/x0;

    const/4 v5, 0x0

    invoke-direct {v4, v1, v5}, Lh0/x0;-><init>(Lf0/k1;Lu8/e;)V

    invoke-static {v2, v1, v4}, Lo1/c0;->a(Ly0/o;Ljava/lang/Object;Lc9/e;)Ly0/o;

    move-result-object v4

    shl-int/lit8 v1, p4, 0x3

    and-int/lit8 v2, v1, 0x70

    and-int/lit16 v1, v1, 0x380

    or-int v6, v2, v1

    move v1, p0

    move-object v2, p1

    move-object v5, p3

    invoke-static/range {v0 .. v6}, Ld7/t;->h(Lh0/m;ZLl2/h;ZLy0/o;Lm0/m;I)V

    invoke-virtual {p3}, Lm0/q;->x()Lm0/x1;

    move-result-object p3

    if-eqz p3, :cond_2

    new-instance v0, Lh0/e;

    invoke-direct {v0, p0, p1, p2, p4}, Lh0/e;-><init>(ZLl2/h;Lh0/v0;I)V

    iput-object v0, p3, Lm0/x1;->d:Lc9/e;

    :cond_2
    return-void
.end method

.method public static final m0(Ljava/lang/Object;Lm0/m;)Lm0/g1;
    .locals 2

    check-cast p1, Lm0/q;

    const v0, -0x3f14ae72

    invoke-virtual {p1, v0}, Lm0/q;->Z(I)V

    const v0, -0x1d58f75c

    invoke-virtual {p1, v0}, Lm0/q;->Z(I)V

    invoke-virtual {p1}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lm0/l;->a:Lk0/y0;

    if-ne v0, v1, :cond_0

    sget-object v0, Lm0/o3;->a:Lm0/o3;

    invoke-static {p0, v0}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object v0

    invoke-virtual {p1, v0}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lm0/q;->t(Z)V

    check-cast v0, Lm0/g1;

    invoke-interface {v0, p0}, Lm0/g1;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p1, v1}, Lm0/q;->t(Z)V

    return-object v0
.end method

.method public static final n(Lh0/v0;ZLm0/m;I)V
    .locals 9

    check-cast p2, Lm0/q;

    const v0, 0x25552d88

    invoke-virtual {p2, v0}, Lm0/q;->a0(I)Lm0/q;

    const/4 v0, 0x0

    if-eqz p1, :cond_7

    iget-object v1, p0, Lh0/v0;->d:Lf0/c2;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lf0/c2;->d()Lf0/d2;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v1, v1, Lf0/d2;->a:La2/a0;

    if-eqz v1, :cond_1

    iget-object v4, p0, Lh0/v0;->d:Lf0/c2;

    if-eqz v4, :cond_0

    iget-boolean v4, v4, Lf0/c2;->p:Z

    goto :goto_0

    :cond_0
    move v4, v3

    :goto_0
    xor-int/2addr v4, v3

    if-eqz v4, :cond_1

    move-object v2, v1

    :cond_1
    if-nez v2, :cond_2

    goto/16 :goto_1

    :cond_2
    invoke-virtual {p0}, Lh0/v0;->k()Lg2/a0;

    move-result-object v1

    iget-wide v4, v1, Lg2/a0;->b:J

    invoke-static {v4, v5}, La2/b0;->b(J)Z

    move-result v1

    if-nez v1, :cond_4

    iget-object v1, p0, Lh0/v0;->b:Lg2/s;

    invoke-virtual {p0}, Lh0/v0;->k()Lg2/a0;

    move-result-object v4

    iget-wide v4, v4, Lg2/a0;->b:J

    const/16 v6, 0x20

    shr-long/2addr v4, v6

    long-to-int v4, v4

    invoke-interface {v1, v4}, Lg2/s;->b(I)I

    move-result v1

    iget-object v4, p0, Lh0/v0;->b:Lg2/s;

    invoke-virtual {p0}, Lh0/v0;->k()Lg2/a0;

    move-result-object v5

    iget-wide v5, v5, Lg2/a0;->b:J

    const-wide v7, 0xffffffffL

    and-long/2addr v5, v7

    long-to-int v5, v5

    invoke-interface {v4, v5}, Lg2/s;->b(I)I

    move-result v4

    invoke-virtual {v2, v1}, La2/a0;->a(I)Ll2/h;

    move-result-object v1

    sub-int/2addr v4, v3

    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-virtual {v2, v4}, La2/a0;->a(I)Ll2/h;

    move-result-object v2

    const v4, -0x1db4c74c

    invoke-virtual {p2, v4}, Lm0/q;->Z(I)V

    iget-object v4, p0, Lh0/v0;->d:Lf0/c2;

    const/16 v5, 0x206

    if-eqz v4, :cond_3

    iget-object v4, v4, Lf0/c2;->m:Lm0/n1;

    invoke-virtual {v4}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-ne v4, v3, :cond_3

    invoke-static {v3, v1, p0, p2, v5}, Ld7/t;->m(ZLl2/h;Lh0/v0;Lm0/m;I)V

    :cond_3
    invoke-virtual {p2, v0}, Lm0/q;->t(Z)V

    iget-object v1, p0, Lh0/v0;->d:Lf0/c2;

    if-eqz v1, :cond_4

    iget-object v1, v1, Lf0/c2;->n:Lm0/n1;

    invoke-virtual {v1}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-ne v1, v3, :cond_4

    invoke-static {v0, v2, p0, p2, v5}, Ld7/t;->m(ZLl2/h;Lh0/v0;Lm0/m;I)V

    :cond_4
    iget-object v1, p0, Lh0/v0;->d:Lf0/c2;

    if-eqz v1, :cond_8

    iget-object v2, p0, Lh0/v0;->r:Lg2/a0;

    iget-object v2, v2, Lg2/a0;->a:La2/e;

    iget-object v2, v2, La2/e;->a:Ljava/lang/String;

    invoke-virtual {p0}, Lh0/v0;->k()Lg2/a0;

    move-result-object v4

    iget-object v4, v4, Lg2/a0;->a:La2/e;

    iget-object v4, v4, La2/e;->a:Ljava/lang/String;

    invoke-static {v2, v4}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    xor-int/2addr v2, v3

    iget-object v3, v1, Lf0/c2;->l:Lm0/n1;

    if-eqz v2, :cond_5

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v3, v2}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    :cond_5
    invoke-virtual {v1}, Lf0/c2;->b()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-virtual {v3}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {p0}, Lh0/v0;->o()V

    goto :goto_1

    :cond_6
    invoke-virtual {p0}, Lh0/v0;->l()V

    goto :goto_1

    :cond_7
    invoke-virtual {p0}, Lh0/v0;->l()V

    :cond_8
    :goto_1
    invoke-virtual {p2}, Lm0/q;->x()Lm0/x1;

    move-result-object p2

    if-eqz p2, :cond_9

    new-instance v1, Lf0/f0;

    invoke-direct {v1, p0, p1, p3, v0}, Lf0/f0;-><init>(Ljava/lang/Object;ZII)V

    iput-object v1, p2, Lm0/x1;->d:Lc9/e;

    :cond_9
    return-void
.end method

.method public static final n0(Lm0/w1;Lm0/x1;)Z
    .locals 2

    if-eqz p0, :cond_1

    instance-of v0, p0, Lm0/x1;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lm0/x1;

    invoke-virtual {v0}, Lm0/x1;->a()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {p0, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    iget-object p0, v0, Lm0/x1;->c:Lm0/c;

    iget-object p1, p1, Lm0/x1;->c:Lm0/c;

    invoke-static {p0, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static final o(ILjava/util/List;)V
    .locals 3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-ltz p0, :cond_0

    if-ge p0, p1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Index "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " is out of bounds. The list has "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " elements."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static o0(D)I
    .locals 2

    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_2

    const-wide v0, 0x41dfffffffc00000L    # 2.147483647E9

    cmpl-double v0, p0, v0

    if-lez v0, :cond_0

    const p0, 0x7fffffff

    goto :goto_0

    :cond_0
    const-wide/high16 v0, -0x3e20000000000000L    # -2.147483648E9

    cmpg-double v0, p0, v0

    if-gez v0, :cond_1

    const/high16 p0, -0x80000000

    goto :goto_0

    :cond_1
    invoke-static {p0, p1}, Ljava/lang/Math;->round(D)J

    move-result-wide p0

    long-to-int p0, p0

    :goto_0
    return p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Cannot round NaN value."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final p(IILjava/util/List;)V
    .locals 2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    if-gt p0, p1, :cond_2

    if-ltz p0, :cond_1

    if-gt p1, p2, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "toIndex ("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ") is more than than the list size ("

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string p2, "fromIndex ("

    const-string v0, ") is less than 0."

    invoke-static {p2, p0, v0}, Ll/q;->h(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Indices are out of order. fromIndex ("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ") is greater than toIndex ("

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ")."

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public static p0(F)I
    .locals 1

    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    move-result p0

    return p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot round NaN value."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final q([II)Z
    .locals 1

    mul-int/lit8 p1, p1, 0x5

    const/4 v0, 0x1

    add-int/2addr p1, v0

    aget p0, p0, p1

    const/high16 p1, 0x4000000

    and-int/2addr p0, p1

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static final q0(Ljava/util/ArrayList;II)I
    .locals 4

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    :goto_0
    if-gt v1, v0, :cond_3

    add-int v2, v1, v0

    ushr-int/lit8 v2, v2, 0x1

    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm0/c;

    iget v3, v3, Lm0/c;->a:I

    if-gez v3, :cond_0

    add-int/2addr v3, p2

    :cond_0
    invoke-static {v3, p1}, Ld7/a;->o(II)I

    move-result v3

    if-gez v3, :cond_1

    add-int/lit8 v1, v2, 0x1

    goto :goto_0

    :cond_1
    if-lez v3, :cond_2

    add-int/lit8 v0, v2, -0x1

    goto :goto_0

    :cond_2
    return v2

    :cond_3
    add-int/lit8 v1, v1, 0x1

    neg-int p0, v1

    return p0
.end method

.method public static final r(Lf0/c2;)V
    .locals 6

    iget-object v0, p0, Lf0/c2;->e:Lg2/h0;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v2, p0, Lf0/c2;->d:Lg2/j;

    iget-object v2, v2, Lg2/j;->a:Lg2/a0;

    const-wide/16 v3, 0x0

    const/4 v5, 0x3

    invoke-static {v2, v1, v3, v4, v5}, Lg2/a0;->a(Lg2/a0;La2/e;JI)Lg2/a0;

    move-result-object v2

    iget-object v3, p0, Lf0/c2;->t:Lf0/v;

    invoke-virtual {v3, v2}, Lf0/v;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v0, Lg2/h0;->a:Lg2/b0;

    iget-object v3, v2, Lg2/b0;->b:Ljava/util/concurrent/atomic/AtomicReference;

    :cond_0
    invoke-virtual {v3, v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v0, v2, Lg2/b0;->a:Lg2/v;

    check-cast v0, Lg2/e0;

    const/4 v2, 0x0

    iput-boolean v2, v0, Lg2/e0;->d:Z

    sget-object v2, Lg2/d;->f:Lg2/d;

    iput-object v2, v0, Lg2/e0;->e:Lc9/c;

    sget-object v2, Lg2/d;->n:Lg2/d;

    iput-object v2, v0, Lg2/e0;->f:Lc9/c;

    iput-object v1, v0, Lg2/e0;->k:Landroid/graphics/Rect;

    sget-object v2, Lg2/c0;->b:Lg2/c0;

    invoke-virtual {v0, v2}, Lg2/e0;->a(Lg2/c0;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v4

    if-eq v4, v0, :cond_0

    :cond_2
    :goto_0
    iput-object v1, p0, Lf0/c2;->e:Lg2/h0;

    return-void
.end method

.method public static final r0(Ly0/o;ZLx/m;Lu/i1;ZLy1/g;Lc9/a;)Ly0/o;
    .locals 7

    sget-object v0, Ly0/l;->b:Ly0/l;

    const/16 v6, 0x8

    move-object v1, p2

    move-object v2, p3

    move v3, p4

    move-object v4, p5

    move-object v5, p6

    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/a;->j(Ly0/o;Lx/m;Lu/i1;ZLy1/g;Lc9/a;I)Ly0/o;

    move-result-object p2

    new-instance p3, Ld0/b;

    invoke-direct {p3, p1}, Ld0/b;-><init>(Z)V

    const/4 p1, 0x0

    invoke-static {p2, p1, p3}, Ly1/l;->a(Ly0/o;ZLc9/c;)Ly0/o;

    move-result-object p1

    invoke-static {p0, p1}, Lu1/x1;->q(Ly0/o;Ly0/o;)Ly0/o;

    move-result-object p0

    return-object p0
.end method

.method public static final s([II)I
    .locals 0

    mul-int/lit8 p1, p1, 0x5

    add-int/lit8 p1, p1, 0x3

    aget p0, p0, p1

    return p0
.end method

.method public static final s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V
    .locals 1

    check-cast p0, Lm0/q;

    iget-boolean v0, p0, Lm0/q;->O:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-virtual {p0, p1}, Lm0/q;->l0(Ljava/lang/Object;)V

    invoke-virtual {p0, p1, p2}, Lm0/q;->c(Ljava/lang/Object;Lc9/e;)V

    :cond_1
    return-void
.end method

.method public static final t([II)Z
    .locals 1

    mul-int/lit8 p1, p1, 0x5

    const/4 v0, 0x1

    add-int/2addr p1, v0

    aget p0, p0, p1

    const/high16 p1, 0x10000000

    and-int/2addr p0, p1

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static final t0(Lc9/a;)La4/c0;
    .locals 2

    new-instance v0, Lm0/g3;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lm0/g3;-><init>(Lc9/a;Lu8/e;)V

    new-instance p0, La4/c0;

    invoke-direct {p0, v0}, La4/c0;-><init>(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static final u([II)Z
    .locals 1

    mul-int/lit8 p1, p1, 0x5

    const/4 v0, 0x1

    add-int/2addr p1, v0

    aget p0, p0, p1

    const/high16 p1, 0x20000000

    and-int/2addr p0, p1

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static u0()V
    .locals 2

    new-instance v0, Ljava/lang/ArithmeticException;

    const-string v1, "Index overflow has happened."

    invoke-direct {v0, v1}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final v([II)Z
    .locals 1

    mul-int/lit8 p1, p1, 0x5

    const/4 v0, 0x1

    add-int/2addr p1, v0

    aget p0, p0, p1

    const/high16 p1, 0x40000000    # 2.0f

    and-int/2addr p0, p1

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static final v0(Ljava/lang/Object;)V
    .locals 1

    instance-of v0, p0, Lq8/g;

    if-nez v0, :cond_0

    return-void

    :cond_0
    check-cast p0, Lq8/g;

    iget-object p0, p0, Lq8/g;->a:Ljava/lang/Throwable;

    throw p0
.end method

.method public static final w(Ljava/util/ArrayList;II)I
    .locals 0

    invoke-static {p0, p1, p2}, Ld7/t;->q0(Ljava/util/ArrayList;II)I

    move-result p0

    if-ltz p0, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 p0, p0, 0x1

    neg-int p0, p0

    :goto_0
    return p0
.end method

.method public static final w0(F)Ljava/lang/String;
    .locals 5

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    const/high16 v1, 0x41200000    # 10.0f

    float-to-double v1, v1

    int-to-double v3, v0

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float/2addr p0, v1

    float-to-int v2, p0

    int-to-float v3, v2

    sub-float/2addr p0, v3

    const/high16 v3, 0x3f000000    # 0.5f

    cmpl-float p0, p0, v3

    if-ltz p0, :cond_0

    add-int/lit8 v2, v2, 0x1

    :cond_0
    int-to-float p0, v2

    div-float/2addr p0, v1

    if-lez v0, :cond_1

    invoke-static {p0}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_1
    float-to-int p0, p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static final x([II)I
    .locals 0

    mul-int/lit8 p1, p1, 0x5

    add-int/lit8 p1, p1, 0x1

    aget p0, p0, p1

    const p1, 0x3ffffff

    and-int/2addr p0, p1

    return p0
.end method

.method public static final x0([Lm0/v1;Lm0/r1;Lm0/r1;)Lu0/e;
    .locals 6

    sget-object v0, Lu0/e;->d:Lu0/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lu0/d;

    invoke-direct {v1, v0}, Lr0/f;-><init>(Lr0/d;)V

    iput-object v0, v1, Lu0/d;->n:Lu0/e;

    array-length v0, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    aget-object v3, p0, v2

    iget-object v4, v3, Lm0/v1;->a:Lm0/z;

    const-string v5, "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>"

    invoke-static {v4, v5}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Lm0/u1;

    iget-boolean v5, v3, Lm0/v1;->c:Z

    if-nez v5, :cond_0

    invoke-interface {p1, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    :cond_0
    invoke-interface {p2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lm0/l3;

    iget-object v3, v3, Lm0/v1;->b:Ljava/lang/Object;

    invoke-virtual {v4, v5, v3}, Lm0/z;->a(Lm0/l3;Ljava/lang/Object;)Lm0/l3;

    move-result-object v3

    invoke-virtual {v1, v4, v3}, Lr0/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Lu0/d;->c()Lu0/e;

    move-result-object p0

    return-object p0
.end method

.method public static final y([II)I
    .locals 0

    mul-int/lit8 p1, p1, 0x5

    add-int/lit8 p1, p1, 0x2

    aget p0, p0, p1

    return p0
.end method

.method public static final z([II)I
    .locals 1

    mul-int/lit8 p1, p1, 0x5

    add-int/lit8 v0, p1, 0x4

    aget v0, p0, v0

    add-int/lit8 p1, p1, 0x1

    aget p0, p0, p1

    shr-int/lit8 p0, p0, 0x1c

    invoke-static {p0}, Ld7/t;->L(I)I

    move-result p0

    add-int/2addr p0, v0

    return p0
.end method
