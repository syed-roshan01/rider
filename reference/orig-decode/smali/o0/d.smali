.class public final Lo0/d;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Set;
.implements Le9/a;


# instance fields
.field public a:I

.field public b:[Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x10

    new-array v0, v0, [Ljava/lang/Object;

    iput-object v0, p0, Lo0/d;->b:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 7

    iget v0, p0, Lo0/d;->a:I

    iget-object v1, p0, Lo0/d;->b:[Ljava/lang/Object;

    const/4 v2, 0x0

    if-lez v0, :cond_0

    invoke-virtual {p0, p1}, Lo0/d;->i(Ljava/lang/Object;)I

    move-result v3

    if-ltz v3, :cond_1

    return v2

    :cond_0
    const/4 v3, -0x1

    :cond_1
    const/4 v4, 0x1

    add-int/2addr v3, v4

    neg-int v3, v3

    array-length v5, v1

    if-ne v0, v5, :cond_2

    array-length v5, v1

    mul-int/lit8 v5, v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    add-int/lit8 v6, v3, 0x1

    invoke-static {v6, v3, v0, v1, v5}, Lb9/b;->H(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    const/4 v0, 0x6

    invoke-static {v1, v5, v2, v3, v0}, Lb9/b;->L([Ljava/lang/Object;[Ljava/lang/Object;III)V

    iput-object v5, p0, Lo0/d;->b:[Ljava/lang/Object;

    goto :goto_0

    :cond_2
    add-int/lit8 v2, v3, 0x1

    invoke-static {v2, v3, v0, v1, v1}, Lb9/b;->H(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    :goto_0
    iget-object v0, p0, Lo0/d;->b:[Ljava/lang/Object;

    aput-object p1, v0, v3

    iget p1, p0, Lo0/d;->a:I

    add-int/2addr p1, v4

    iput p1, p0, Lo0/d;->a:I

    return v4
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 1

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Operation is not supported for read-only collection"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final clear()V
    .locals 1

    iget-object v0, p0, Lo0/d;->b:[Ljava/lang/Object;

    invoke-static {v0}, Lb9/b;->Q([Ljava/lang/Object;)V

    const/4 v0, 0x0

    iput v0, p0, Lo0/d;->a:I

    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0, p1}, Lo0/d;->i(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method public final containsAll(Ljava/util/Collection;)Z
    .locals 2

    check-cast p1, Ljava/lang/Iterable;

    instance-of v0, p1, Ljava/util/Collection;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo0/d;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v1, 0x0

    :cond_2
    :goto_0
    return v1
.end method

.method public final e(Lo0/d;)V
    .locals 14

    invoke-virtual {p1}, Lo0/d;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lo0/d;->b:[Ljava/lang/Object;

    iget-object v1, p1, Lo0/d;->b:[Ljava/lang/Object;

    iget v2, p0, Lo0/d;->a:I

    iget p1, p1, Lo0/d;->a:I

    add-int v3, v2, p1

    array-length v4, v0

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-ge v4, v3, :cond_1

    move v4, v5

    goto :goto_0

    :cond_1
    move v4, v6

    :goto_0
    if-eqz v2, :cond_3

    add-int/lit8 v7, v2, -0x1

    aget-object v7, v0, v7

    invoke-static {v7}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v7

    aget-object v8, v1, v6

    invoke-static {v8}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v8

    if-ge v7, v8, :cond_2

    goto :goto_1

    :cond_2
    move v7, v6

    goto :goto_2

    :cond_3
    :goto_1
    move v7, v5

    :goto_2
    if-nez v4, :cond_4

    if-eqz v7, :cond_4

    invoke-static {v2, v6, p1, v1, v0}, Lb9/b;->H(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    iget v0, p0, Lo0/d;->a:I

    add-int/2addr v0, p1

    iput v0, p0, Lo0/d;->a:I

    goto :goto_6

    :cond_4
    if-eqz v4, :cond_6

    if-le v2, p1, :cond_5

    mul-int/lit8 v4, v2, 0x2

    goto :goto_3

    :cond_5
    mul-int/lit8 v4, p1, 0x2

    :goto_3
    new-array v4, v4, [Ljava/lang/Object;

    goto :goto_4

    :cond_6
    move-object v4, v0

    :goto_4
    sub-int/2addr v2, v5

    sub-int/2addr p1, v5

    add-int/lit8 v7, v3, -0x1

    :goto_5
    if-gez v2, :cond_9

    if-ltz p1, :cond_7

    goto :goto_7

    :cond_7
    if-ltz v7, :cond_8

    add-int/lit8 p1, v7, 0x1

    invoke-static {v6, p1, v3, v4, v4}, Lb9/b;->H(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    :cond_8
    add-int/2addr v7, v5

    sub-int p1, v3, v7

    invoke-static {p1, v3, v4}, Lb9/b;->O(II[Ljava/lang/Object;)V

    iput-object v4, p0, Lo0/d;->b:[Ljava/lang/Object;

    iput p1, p0, Lo0/d;->a:I

    :goto_6
    return-void

    :cond_9
    :goto_7
    if-gez v2, :cond_a

    add-int/lit8 v8, p1, -0x1

    aget-object p1, v1, p1

    goto :goto_a

    :cond_a
    if-gez p1, :cond_b

    add-int/lit8 v8, v2, -0x1

    aget-object v2, v0, v2

    move v13, v8

    move v8, p1

    move-object p1, v2

    move v2, v13

    goto :goto_a

    :cond_b
    aget-object v8, v0, v2

    aget-object v9, v1, p1

    invoke-static {v8}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v10

    invoke-static {v9}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v11

    if-le v10, v11, :cond_c

    add-int/lit8 v2, v2, -0x1

    :goto_8
    move-object v13, v8

    move v8, p1

    move-object p1, v13

    goto :goto_a

    :cond_c
    if-ge v10, v11, :cond_e

    :cond_d
    add-int/lit8 p1, p1, -0x1

    move v8, p1

    move-object p1, v9

    goto :goto_a

    :cond_e
    if-ne v8, v9, :cond_f

    add-int/lit8 v2, v2, -0x1

    add-int/lit8 p1, p1, -0x1

    goto :goto_8

    :cond_f
    add-int/lit8 v8, v2, -0x1

    :goto_9
    if-ltz v8, :cond_d

    add-int/lit8 v10, v8, -0x1

    aget-object v8, v0, v8

    invoke-static {v8}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v12

    if-ne v12, v11, :cond_d

    if-ne v9, v8, :cond_10

    add-int/lit8 p1, p1, -0x1

    goto :goto_5

    :cond_10
    move v8, v10

    goto :goto_9

    :goto_a
    add-int/lit8 v9, v7, -0x1

    aput-object p1, v4, v7

    move p1, v8

    move v7, v9

    goto :goto_5
.end method

.method public final i(Ljava/lang/Object;)I
    .locals 7

    iget v0, p0, Lo0/d;->a:I

    add-int/lit8 v0, v0, -0x1

    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    iget-object v2, p0, Lo0/d;->b:[Ljava/lang/Object;

    const/4 v3, 0x0

    :goto_0
    if-gt v3, v0, :cond_9

    add-int v4, v3, v0

    ushr-int/lit8 v4, v4, 0x1

    aget-object v5, v2, v4

    invoke-static {v5}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v6

    if-ge v6, v1, :cond_0

    add-int/lit8 v3, v4, 0x1

    goto :goto_0

    :cond_0
    if-le v6, v1, :cond_1

    add-int/lit8 v0, v4, -0x1

    goto :goto_0

    :cond_1
    if-ne v5, p1, :cond_2

    return v4

    :cond_2
    iget-object v0, p0, Lo0/d;->b:[Ljava/lang/Object;

    iget v2, p0, Lo0/d;->a:I

    add-int/lit8 v3, v4, -0x1

    :goto_1
    const/4 v5, -0x1

    if-ge v5, v3, :cond_5

    aget-object v5, v0, v3

    if-ne v5, p1, :cond_3

    goto :goto_4

    :cond_3
    invoke-static {v5}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v5

    if-eq v5, v1, :cond_4

    goto :goto_2

    :cond_4
    add-int/lit8 v3, v3, -0x1

    goto :goto_1

    :cond_5
    :goto_2
    add-int/lit8 v4, v4, 0x1

    move v3, v4

    :goto_3
    if-ge v3, v2, :cond_8

    aget-object v4, v0, v3

    if-ne v4, p1, :cond_6

    goto :goto_4

    :cond_6
    invoke-static {v4}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v4

    if-eq v4, v1, :cond_7

    add-int/lit8 v3, v3, 0x1

    neg-int v3, v3

    goto :goto_4

    :cond_7
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_8
    add-int/lit8 v2, v2, 0x1

    neg-int v3, v2

    :goto_4
    return v3

    :cond_9
    add-int/lit8 v3, v3, 0x1

    neg-int p1, v3

    return p1
.end method

.method public final isEmpty()Z
    .locals 1

    iget v0, p0, Lo0/d;->a:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    new-instance v0, Lo0/b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo0/b;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method

.method public final k()Z
    .locals 1

    iget v0, p0, Lo0/d;->a:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0, p1}, Lo0/d;->i(Ljava/lang/Object;)I

    move-result p1

    iget-object v1, p0, Lo0/d;->b:[Ljava/lang/Object;

    iget v2, p0, Lo0/d;->a:I

    if-ltz p1, :cond_2

    add-int/lit8 v0, v2, -0x1

    if-ge p1, v0, :cond_1

    add-int/lit8 v3, p1, 0x1

    invoke-static {p1, v3, v2, v1, v1}, Lb9/b;->H(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    :cond_1
    const/4 p1, 0x0

    aput-object p1, v1, v0

    iget p1, p0, Lo0/d;->a:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lo0/d;->a:I

    const/4 p1, 0x1

    return p1

    :cond_2
    return v0
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 1

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Operation is not supported for read-only collection"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 1

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Operation is not supported for read-only collection"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lo0/d;->a:I

    return v0
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {p0}, Ld9/i;->v(Ljava/util/Collection;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-static {p0, p1}, Ld9/i;->w(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    const/4 v1, 0x0

    const-string v2, "["

    const-string v3, "]"

    sget-object v4, Lo0/c;->a:Lo0/c;

    const/16 v5, 0x19

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lr8/p;->K0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc9/c;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
