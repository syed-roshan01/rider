.class public final Lq0/f;
.super Lr8/g;

# interfaces
.implements Ljava/util/Collection;
.implements Le9/b;


# instance fields
.field public a:Lp0/d;

.field public b:[Ljava/lang/Object;

.field public c:[Ljava/lang/Object;

.field public d:I

.field public e:Lt0/b;

.field public f:[Ljava/lang/Object;

.field public n:[Ljava/lang/Object;

.field public o:I


# direct methods
.method public constructor <init>(Lp0/d;[Ljava/lang/Object;[Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Lr8/g;-><init>()V

    iput-object p1, p0, Lq0/f;->a:Lp0/d;

    iput-object p2, p0, Lq0/f;->b:[Ljava/lang/Object;

    iput-object p3, p0, Lq0/f;->c:[Ljava/lang/Object;

    iput p4, p0, Lq0/f;->d:I

    new-instance p4, Lt0/b;

    invoke-direct {p4}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Lq0/f;->e:Lt0/b;

    iput-object p2, p0, Lq0/f;->f:[Ljava/lang/Object;

    iput-object p3, p0, Lq0/f;->n:[Ljava/lang/Object;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    iput p1, p0, Lq0/f;->o:I

    return-void
.end method

.method public static n([Ljava/lang/Object;ILjava/util/Iterator;)V
    .locals 2

    :goto_0
    const/16 v0, 0x20

    if-ge p1, v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    add-int/lit8 v0, p1, 0x1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    aput-object v1, p0, p1

    move p1, v0

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final A(II[Ljava/lang/Object;)V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-nez p2, :cond_1

    iput-object v1, p0, Lq0/f;->f:[Ljava/lang/Object;

    if-nez p3, :cond_0

    new-array p3, v0, [Ljava/lang/Object;

    :cond_0
    iput-object p3, p0, Lq0/f;->n:[Ljava/lang/Object;

    iput p1, p0, Lq0/f;->o:I

    iput p2, p0, Lq0/f;->d:I

    return-void

    :cond_1
    new-instance v2, Le/a;

    invoke-direct {v2, v1}, Le/a;-><init>(Ljava/lang/Object;)V

    invoke-static {p3}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-virtual {p0, p3, p2, p1, v2}, Lq0/f;->z([Ljava/lang/Object;IILe/a;)[Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v1, v2, Le/a;->a:Ljava/lang/Object;

    const-string v2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"

    invoke-static {v1, v2}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, [Ljava/lang/Object;

    iput-object v1, p0, Lq0/f;->n:[Ljava/lang/Object;

    iput p1, p0, Lq0/f;->o:I

    const/4 p1, 0x1

    aget-object p1, p3, p1

    if-nez p1, :cond_2

    aget-object p1, p3, v0

    check-cast p1, [Ljava/lang/Object;

    iput-object p1, p0, Lq0/f;->f:[Ljava/lang/Object;

    add-int/lit8 p2, p2, -0x5

    iput p2, p0, Lq0/f;->d:I

    goto :goto_0

    :cond_2
    iput-object p3, p0, Lq0/f;->f:[Ljava/lang/Object;

    iput p2, p0, Lq0/f;->d:I

    :goto_0
    return-void
.end method

.method public final B([Ljava/lang/Object;IILjava/util/Iterator;)[Ljava/lang/Object;
    .locals 2

    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    if-ltz p3, :cond_2

    if-nez p3, :cond_0

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Object;

    return-object p1

    :cond_0
    invoke-virtual {p0, p1}, Lq0/f;->u([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, p3}, Ld9/i;->q(II)I

    move-result v0

    aget-object v1, p1, v0

    check-cast v1, [Ljava/lang/Object;

    add-int/lit8 p3, p3, -0x5

    invoke-virtual {p0, v1, p2, p3, p4}, Lq0/f;->B([Ljava/lang/Object;IILjava/util/Iterator;)[Ljava/lang/Object;

    move-result-object p2

    aput-object p2, p1, v0

    :goto_0
    add-int/lit8 v0, v0, 0x1

    const/16 p2, 0x20

    if-ge v0, p2, :cond_1

    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    aget-object p2, p1, v0

    check-cast p2, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p0, p2, v1, p3, p4}, Lq0/f;->B([Ljava/lang/Object;IILjava/util/Iterator;)[Ljava/lang/Object;

    move-result-object p2

    aput-object p2, p1, v0

    goto :goto_0

    :cond_1
    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "negative shift"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "invalid buffersIterator"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final C([Ljava/lang/Object;I[[Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 4

    new-instance v0, Lo0/b;

    invoke-direct {v0, p3}, Lo0/b;-><init>([Ljava/lang/Object;)V

    shr-int/lit8 p3, p2, 0x5

    iget v1, p0, Lq0/f;->d:I

    const/4 v2, 0x1

    shl-int v3, v2, v1

    if-ge p3, v3, :cond_0

    invoke-virtual {p0, p1, p2, v1, v0}, Lq0/f;->B([Ljava/lang/Object;IILjava/util/Iterator;)[Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lq0/f;->u([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    :goto_0
    invoke-virtual {v0}, Lo0/b;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    iget p2, p0, Lq0/f;->d:I

    add-int/lit8 p2, p2, 0x5

    iput p2, p0, Lq0/f;->d:I

    invoke-virtual {p0, p1}, Lq0/f;->x(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    iget p2, p0, Lq0/f;->d:I

    shl-int p3, v2, p2

    invoke-virtual {p0, p1, p3, p2, v0}, Lq0/f;->B([Ljava/lang/Object;IILjava/util/Iterator;)[Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-object p1
.end method

.method public final D([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)V
    .locals 5

    iget v0, p0, Lq0/f;->o:I

    shr-int/lit8 v1, v0, 0x5

    iget v2, p0, Lq0/f;->d:I

    const/4 v3, 0x1

    shl-int v4, v3, v2

    if-le v1, v4, :cond_0

    invoke-virtual {p0, p1}, Lq0/f;->x(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    iget v0, p0, Lq0/f;->d:I

    add-int/lit8 v0, v0, 0x5

    invoke-virtual {p0, v0, p1, p2}, Lq0/f;->E(I[Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lq0/f;->f:[Ljava/lang/Object;

    iput-object p3, p0, Lq0/f;->n:[Ljava/lang/Object;

    iget p1, p0, Lq0/f;->d:I

    add-int/lit8 p1, p1, 0x5

    iput p1, p0, Lq0/f;->d:I

    iget p1, p0, Lq0/f;->o:I

    add-int/2addr p1, v3

    iput p1, p0, Lq0/f;->o:I

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    iput-object p2, p0, Lq0/f;->f:[Ljava/lang/Object;

    iput-object p3, p0, Lq0/f;->n:[Ljava/lang/Object;

    add-int/2addr v0, v3

    iput v0, p0, Lq0/f;->o:I

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v2, p1, p2}, Lq0/f;->E(I[Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lq0/f;->f:[Ljava/lang/Object;

    iput-object p3, p0, Lq0/f;->n:[Ljava/lang/Object;

    iget p1, p0, Lq0/f;->o:I

    add-int/2addr p1, v3

    iput p1, p0, Lq0/f;->o:I

    :goto_0
    return-void
.end method

.method public final E(I[Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0}, Lq0/f;->e()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {v0, p1}, Ld9/i;->q(II)I

    move-result v0

    invoke-virtual {p0, p2}, Lq0/f;->u([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    const/4 v1, 0x5

    if-ne p1, v1, :cond_0

    aput-object p3, p2, v0

    goto :goto_0

    :cond_0
    aget-object v2, p2, v0

    check-cast v2, [Ljava/lang/Object;

    sub-int/2addr p1, v1

    invoke-virtual {p0, p1, v2, p3}, Lq0/f;->E(I[Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    aput-object p1, p2, v0

    :goto_0
    return-object p2
.end method

.method public final F(Lq0/b;[Ljava/lang/Object;IILe/a;Ljava/util/ArrayList;Ljava/util/ArrayList;)I
    .locals 6

    invoke-virtual {p0, p2}, Lq0/f;->s([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p6, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object v0, p5, Le/a;->a:Ljava/lang/Object;

    const-string v1, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"

    invoke-static {v0, v1}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    move-object v3, v0

    move v2, v1

    :goto_0
    if-ge v2, p3, :cond_4

    aget-object v4, p2, v2

    invoke-virtual {p1, v4}, Lq0/b;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-nez v5, :cond_3

    const/16 v5, 0x20

    if-ne p4, v5, :cond_2

    invoke-interface {p6}, Ljava/util/Collection;->isEmpty()Z

    move-result p4

    xor-int/lit8 p4, p4, 0x1

    if-eqz p4, :cond_1

    invoke-virtual {p6}, Ljava/util/ArrayList;->size()I

    move-result p4

    add-int/lit8 p4, p4, -0x1

    invoke-virtual {p6, p4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, [Ljava/lang/Object;

    :goto_1
    move-object v3, p4

    goto :goto_2

    :cond_1
    invoke-virtual {p0}, Lq0/f;->w()[Ljava/lang/Object;

    move-result-object p4

    goto :goto_1

    :goto_2
    move p4, v1

    :cond_2
    add-int/lit8 v5, p4, 0x1

    aput-object v4, v3, p4

    move p4, v5

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    iput-object v3, p5, Le/a;->a:Ljava/lang/Object;

    if-eq v0, v3, :cond_5

    invoke-virtual {p7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    return p4
.end method

.method public final G(Lq0/b;[Ljava/lang/Object;ILe/a;)I
    .locals 6

    const/4 v0, 0x0

    move-object v2, p2

    move v3, p3

    move v1, v0

    :goto_0
    if-ge v0, p3, :cond_2

    aget-object v4, p2, v0

    invoke-virtual {p1, v4}, Lq0/b;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_0

    if-nez v1, :cond_1

    invoke-virtual {p0, p2}, Lq0/f;->u([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    const/4 v1, 0x1

    move v3, v0

    goto :goto_1

    :cond_0
    if-eqz v1, :cond_1

    add-int/lit8 v5, v3, 0x1

    aput-object v4, v2, v3

    move v3, v5

    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    iput-object v2, p4, Le/a;->a:Ljava/lang/Object;

    return v3
.end method

.method public final H(Lq0/b;ILe/a;)I
    .locals 1

    iget-object v0, p0, Lq0/f;->n:[Ljava/lang/Object;

    invoke-virtual {p0, p1, v0, p2, p3}, Lq0/f;->G(Lq0/b;[Ljava/lang/Object;ILe/a;)I

    move-result p1

    if-ne p1, p2, :cond_0

    return p2

    :cond_0
    iget-object p3, p3, Le/a;->a:Ljava/lang/Object;

    const-string v0, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"

    invoke-static {p3, v0}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, [Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-static {p3, p1, p2, v0}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    iput-object p3, p0, Lq0/f;->n:[Ljava/lang/Object;

    iget p3, p0, Lq0/f;->o:I

    sub-int/2addr p2, p1

    sub-int/2addr p3, p2

    iput p3, p0, Lq0/f;->o:I

    return p1
.end method

.method public final I(Lq0/b;)Z
    .locals 18

    move-object/from16 v8, p0

    move-object/from16 v9, p1

    invoke-virtual/range {p0 .. p0}, Lq0/f;->O()I

    move-result v10

    new-instance v11, Le/a;

    const/4 v12, 0x0

    invoke-direct {v11, v12}, Le/a;-><init>(Ljava/lang/Object;)V

    iget-object v0, v8, Lq0/f;->f:[Ljava/lang/Object;

    const/4 v13, 0x1

    const/4 v14, 0x0

    if-nez v0, :cond_0

    invoke-virtual {v8, v9, v10, v11}, Lq0/f;->H(Lq0/b;ILe/a;)I

    move-result v0

    if-eq v0, v10, :cond_8

    :goto_0
    move v14, v13

    goto/16 :goto_6

    :cond_0
    invoke-virtual {v8, v14}, Lq0/f;->t(I)Lq0/a;

    move-result-object v15

    const/16 v7, 0x20

    move v0, v7

    :goto_1
    if-ne v0, v7, :cond_1

    invoke-virtual {v15}, Lq0/a;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v15}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    invoke-virtual {v8, v9, v0, v7, v11}, Lq0/f;->G(Lq0/b;[Ljava/lang/Object;ILe/a;)I

    move-result v0

    goto :goto_1

    :cond_1
    if-ne v0, v7, :cond_3

    invoke-virtual {v8, v9, v10, v11}, Lq0/f;->H(Lq0/b;ILe/a;)I

    move-result v0

    if-nez v0, :cond_2

    iget-object v1, v8, Lq0/f;->f:[Ljava/lang/Object;

    iget v2, v8, Lq0/f;->o:I

    iget v3, v8, Lq0/f;->d:I

    invoke-virtual {v8, v2, v3, v1}, Lq0/f;->A(II[Ljava/lang/Object;)V

    :cond_2
    if-eq v0, v10, :cond_8

    goto :goto_0

    :cond_3
    iget v1, v15, Lq0/a;->a:I

    sub-int/2addr v1, v13

    shl-int/lit8 v6, v1, 0x5

    new-instance v16, Ljava/util/ArrayList;

    invoke-direct/range {v16 .. v16}, Ljava/util/ArrayList;-><init>()V

    new-instance v17, Ljava/util/ArrayList;

    invoke-direct/range {v17 .. v17}, Ljava/util/ArrayList;-><init>()V

    move v4, v0

    :goto_2
    invoke-virtual {v15}, Lq0/a;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v15}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, [Ljava/lang/Object;

    const/16 v3, 0x20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v5, v11

    move v13, v6

    move-object/from16 v6, v17

    move v14, v7

    move-object/from16 v7, v16

    invoke-virtual/range {v0 .. v7}, Lq0/f;->F(Lq0/b;[Ljava/lang/Object;IILe/a;Ljava/util/ArrayList;Ljava/util/ArrayList;)I

    move-result v4

    move v6, v13

    move v7, v14

    const/4 v13, 0x1

    const/4 v14, 0x0

    goto :goto_2

    :cond_4
    move v13, v6

    move v14, v7

    iget-object v2, v8, Lq0/f;->n:[Ljava/lang/Object;

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v3, v10

    move-object v5, v11

    move-object/from16 v6, v17

    move-object/from16 v7, v16

    invoke-virtual/range {v0 .. v7}, Lq0/f;->F(Lq0/b;[Ljava/lang/Object;IILe/a;Ljava/util/ArrayList;Ljava/util/ArrayList;)I

    move-result v0

    iget-object v1, v11, Le/a;->a:Ljava/lang/Object;

    const-string v2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"

    invoke-static {v1, v2}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, [Ljava/lang/Object;

    invoke-static {v1, v0, v14, v12}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    invoke-virtual/range {v16 .. v16}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_5

    iget-object v3, v8, Lq0/f;->f:[Ljava/lang/Object;

    invoke-static {v3}, Ld7/a;->j(Ljava/lang/Object;)V

    goto :goto_3

    :cond_5
    iget-object v3, v8, Lq0/f;->f:[Ljava/lang/Object;

    iget v4, v8, Lq0/f;->d:I

    invoke-virtual/range {v16 .. v16}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    invoke-virtual {v8, v3, v13, v4, v5}, Lq0/f;->B([Ljava/lang/Object;IILjava/util/Iterator;)[Ljava/lang/Object;

    move-result-object v3

    :goto_3
    invoke-virtual/range {v16 .. v16}, Ljava/util/ArrayList;->size()I

    move-result v4

    shl-int/lit8 v4, v4, 0x5

    add-int v6, v13, v4

    and-int/lit8 v4, v6, 0x1f

    if-nez v4, :cond_a

    if-nez v6, :cond_6

    const/4 v4, 0x0

    iput v4, v8, Lq0/f;->d:I

    goto :goto_5

    :cond_6
    const/4 v4, 0x0

    add-int/lit8 v5, v6, -0x1

    :goto_4
    iget v7, v8, Lq0/f;->d:I

    shr-int v9, v5, v7

    if-nez v9, :cond_7

    add-int/lit8 v7, v7, -0x5

    iput v7, v8, Lq0/f;->d:I

    aget-object v3, v3, v4

    invoke-static {v3, v2}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, [Ljava/lang/Object;

    goto :goto_4

    :cond_7
    invoke-virtual {v8, v5, v7, v3}, Lq0/f;->y(II[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v12

    :goto_5
    iput-object v12, v8, Lq0/f;->f:[Ljava/lang/Object;

    iput-object v1, v8, Lq0/f;->n:[Ljava/lang/Object;

    add-int/2addr v6, v0

    iput v6, v8, Lq0/f;->o:I

    const/4 v14, 0x1

    :cond_8
    :goto_6
    if-eqz v14, :cond_9

    iget v0, v8, Ljava/util/AbstractList;->modCount:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, v8, Ljava/util/AbstractList;->modCount:I

    :cond_9
    return v14

    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid size"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final J([Ljava/lang/Object;IILe/a;)[Ljava/lang/Object;
    .locals 6

    invoke-static {p3, p2}, Ld9/i;->q(II)I

    move-result v0

    const/16 v1, 0x1f

    if-nez p2, :cond_0

    aget-object p2, p1, v0

    invoke-virtual {p0, p1}, Lq0/f;->u([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p3

    add-int/lit8 v2, v0, 0x1

    const/16 v3, 0x20

    invoke-static {v0, v2, v3, p1, p3}, Lb9/b;->H(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    iget-object p1, p4, Le/a;->a:Ljava/lang/Object;

    aput-object p1, p3, v1

    iput-object p2, p4, Le/a;->a:Ljava/lang/Object;

    return-object p3

    :cond_0
    aget-object v2, p1, v1

    if-nez v2, :cond_1

    invoke-virtual {p0}, Lq0/f;->L()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-static {v1, p2}, Ld9/i;->q(II)I

    move-result v1

    :cond_1
    invoke-virtual {p0, p1}, Lq0/f;->u([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    add-int/lit8 p2, p2, -0x5

    add-int/lit8 v2, v0, 0x1

    const-string v3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"

    if-gt v2, v1, :cond_2

    :goto_0
    aget-object v4, p1, v1

    invoke-static {v4, v3}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-virtual {p0, v4, p2, v5, p4}, Lq0/f;->J([Ljava/lang/Object;IILe/a;)[Ljava/lang/Object;

    move-result-object v4

    aput-object v4, p1, v1

    if-eq v1, v2, :cond_2

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_2
    aget-object v1, p1, v0

    invoke-static {v1, v3}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, [Ljava/lang/Object;

    invoke-virtual {p0, v1, p2, p3, p4}, Lq0/f;->J([Ljava/lang/Object;IILe/a;)[Ljava/lang/Object;

    move-result-object p2

    aput-object p2, p1, v0

    return-object p1
.end method

.method public final K([Ljava/lang/Object;III)Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lq0/f;->o:I

    sub-int/2addr v0, p2

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object p4, p0, Lq0/f;->n:[Ljava/lang/Object;

    const/4 v0, 0x0

    aget-object p4, p4, v0

    invoke-virtual {p0, p2, p3, p1}, Lq0/f;->A(II[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lq0/f;->n:[Ljava/lang/Object;

    aget-object v3, v2, p4

    invoke-virtual {p0, v2}, Lq0/f;->u([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v5, p4, 0x1

    invoke-static {p4, v5, v0, v2, v4}, Lb9/b;->H(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    add-int/lit8 p4, v0, -0x1

    const/4 v2, 0x0

    aput-object v2, v4, p4

    iput-object p1, p0, Lq0/f;->f:[Ljava/lang/Object;

    iput-object v4, p0, Lq0/f;->n:[Ljava/lang/Object;

    add-int/2addr p2, v0

    sub-int/2addr p2, v1

    iput p2, p0, Lq0/f;->o:I

    iput p3, p0, Lq0/f;->d:I

    move-object p4, v3

    :goto_0
    return-object p4
.end method

.method public final L()I
    .locals 2

    iget v0, p0, Lq0/f;->o:I

    const/16 v1, 0x20

    if-gt v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    add-int/lit8 v0, v0, -0x1

    and-int/lit8 v0, v0, -0x20

    return v0
.end method

.method public final M([Ljava/lang/Object;IILjava/lang/Object;Le/a;)[Ljava/lang/Object;
    .locals 9

    invoke-static {p3, p2}, Ld9/i;->q(II)I

    move-result v0

    invoke-virtual {p0, p1}, Lq0/f;->u([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    if-nez p2, :cond_1

    if-eq v1, p1, :cond_0

    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    :cond_0
    aget-object p1, v1, v0

    iput-object p1, p5, Le/a;->a:Ljava/lang/Object;

    aput-object p4, v1, v0

    return-object v1

    :cond_1
    aget-object p1, v1, v0

    const-string v2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"

    invoke-static {p1, v2}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, p1

    check-cast v4, [Ljava/lang/Object;

    add-int/lit8 v5, p2, -0x5

    move-object v3, p0

    move v6, p3

    move-object v7, p4

    move-object v8, p5

    invoke-virtual/range {v3 .. v8}, Lq0/f;->M([Ljava/lang/Object;IILjava/lang/Object;Le/a;)[Ljava/lang/Object;

    move-result-object p1

    aput-object p1, v1, v0

    return-object v1
.end method

.method public final N(Ljava/util/Collection;I[Ljava/lang/Object;I[[Ljava/lang/Object;I[Ljava/lang/Object;)V
    .locals 5

    const/4 v0, 0x1

    if-lt p6, v0, :cond_3

    invoke-virtual {p0, p3}, Lq0/f;->u([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p3

    const/4 v1, 0x0

    aput-object p3, p5, v1

    and-int/lit8 v2, p2, 0x1f

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v3

    add-int/2addr v3, p2

    sub-int/2addr v3, v0

    and-int/lit8 p2, v3, 0x1f

    sub-int v3, p4, v2

    add-int/2addr v3, p2

    const/16 v4, 0x20

    if-ge v3, v4, :cond_0

    add-int/2addr p2, v0

    invoke-static {p2, v2, p4, p3, p7}, Lb9/b;->H(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, -0x1f

    if-ne p6, v0, :cond_1

    move-object v4, p3

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lq0/f;->w()[Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 p6, p6, -0x1

    aput-object v4, p5, p6

    :goto_0
    sub-int v3, p4, v3

    invoke-static {v1, v3, p4, p3, p7}, Lb9/b;->H(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    add-int/2addr p2, v0

    invoke-static {p2, v2, v3, p3, v4}, Lb9/b;->H(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    move-object p7, v4

    :goto_1
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-static {p3, v2, p1}, Lq0/f;->n([Ljava/lang/Object;ILjava/util/Iterator;)V

    :goto_2
    if-ge v0, p6, :cond_2

    invoke-virtual {p0}, Lq0/f;->w()[Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2, v1, p1}, Lq0/f;->n([Ljava/lang/Object;ILjava/util/Iterator;)V

    aput-object p2, p5, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    invoke-static {p7, v1, p1}, Lq0/f;->n([Ljava/lang/Object;ILjava/util/Iterator;)V

    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "requires at least one nullBuffer"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final O()I
    .locals 2

    iget v0, p0, Lq0/f;->o:I

    const/16 v1, 0x20

    if-gt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 v1, v0, -0x1

    and-int/lit8 v1, v1, -0x20

    sub-int/2addr v0, v1

    :goto_0
    return v0
.end method

.method public final add(ILjava/lang/Object;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lq0/f;->e()I

    move-result v0

    .line 2
    invoke-static {p1, v0}, Lz6/a;->k(II)V

    .line 3
    invoke-virtual {p0}, Lq0/f;->e()I

    move-result v0

    if-ne p1, v0, :cond_0

    .line 4
    invoke-virtual {p0, p2}, Lq0/f;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ljava/util/AbstractList;->modCount:I

    .line 5
    invoke-virtual {p0}, Lq0/f;->L()I

    move-result v0

    if-lt p1, v0, :cond_1

    iget-object v1, p0, Lq0/f;->f:[Ljava/lang/Object;

    sub-int/2addr p1, v0

    .line 6
    invoke-virtual {p0, p2, v1, p1}, Lq0/f;->r(Ljava/lang/Object;[Ljava/lang/Object;I)V

    return-void

    .line 7
    :cond_1
    new-instance v0, Le/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le/a;-><init>(Ljava/lang/Object;)V

    iget-object v3, p0, Lq0/f;->f:[Ljava/lang/Object;

    .line 8
    invoke-static {v3}, Ld7/a;->j(Ljava/lang/Object;)V

    iget v4, p0, Lq0/f;->d:I

    move-object v2, p0

    move v5, p1

    move-object v6, p2

    move-object v7, v0

    invoke-virtual/range {v2 .. v7}, Lq0/f;->q([Ljava/lang/Object;IILjava/lang/Object;Le/a;)[Ljava/lang/Object;

    move-result-object p1

    iget-object p2, v0, Le/a;->a:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 9
    invoke-virtual {p0, p2, p1, v0}, Lq0/f;->r(Ljava/lang/Object;[Ljava/lang/Object;I)V

    return-void
.end method

.method public final add(Ljava/lang/Object;)Z
    .locals 3

    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Ljava/util/AbstractList;->modCount:I

    .line 10
    invoke-virtual {p0}, Lq0/f;->O()I

    move-result v0

    const/16 v2, 0x20

    if-ge v0, v2, :cond_0

    iget-object v2, p0, Lq0/f;->n:[Ljava/lang/Object;

    .line 11
    invoke-virtual {p0, v2}, Lq0/f;->u([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    .line 12
    aput-object p1, v2, v0

    iput-object v2, p0, Lq0/f;->n:[Ljava/lang/Object;

    .line 13
    invoke-virtual {p0}, Lq0/f;->e()I

    move-result p1

    add-int/2addr p1, v1

    iput p1, p0, Lq0/f;->o:I

    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p0, p1}, Lq0/f;->x(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lq0/f;->f:[Ljava/lang/Object;

    iget-object v2, p0, Lq0/f;->n:[Ljava/lang/Object;

    .line 15
    invoke-virtual {p0, v0, v2, p1}, Lq0/f;->D([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)V

    :goto_0
    return v1
.end method

.method public final addAll(ILjava/util/Collection;)Z
    .locals 14

    move-object v8, p0

    move v2, p1

    iget v0, v8, Lq0/f;->o:I

    .line 14
    invoke-static {p1, v0}, Lz6/a;->k(II)V

    iget v0, v8, Lq0/f;->o:I

    if-ne v2, v0, :cond_0

    move-object/from16 v9, p2

    .line 15
    invoke-virtual {p0, v9}, Lq0/f;->addAll(Ljava/util/Collection;)Z

    move-result v0

    return v0

    :cond_0
    move-object/from16 v9, p2

    .line 16
    invoke-interface/range {p2 .. p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    iget v0, v8, Ljava/util/AbstractList;->modCount:I

    const/4 v10, 0x1

    add-int/2addr v0, v10

    iput v0, v8, Ljava/util/AbstractList;->modCount:I

    shr-int/lit8 v0, v2, 0x5

    shl-int/lit8 v11, v0, 0x5

    iget v0, v8, Lq0/f;->o:I

    sub-int/2addr v0, v11

    .line 17
    invoke-interface/range {p2 .. p2}, Ljava/util/Collection;->size()I

    move-result v3

    add-int/2addr v3, v0

    sub-int/2addr v3, v10

    const/16 v0, 0x20

    div-int/lit8 v6, v3, 0x20

    if-nez v6, :cond_2

    and-int/lit8 v0, v2, 0x1f

    .line 18
    invoke-interface/range {p2 .. p2}, Ljava/util/Collection;->size()I

    move-result v1

    add-int/2addr v1, v2

    sub-int/2addr v1, v10

    and-int/lit8 v1, v1, 0x1f

    iget-object v2, v8, Lq0/f;->n:[Ljava/lang/Object;

    .line 19
    invoke-virtual {p0, v2}, Lq0/f;->u([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    add-int/2addr v1, v10

    invoke-virtual {p0}, Lq0/f;->O()I

    move-result v4

    invoke-static {v1, v0, v4, v2, v3}, Lb9/b;->H(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 20
    invoke-interface/range {p2 .. p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-static {v3, v0, v1}, Lq0/f;->n([Ljava/lang/Object;ILjava/util/Iterator;)V

    iput-object v3, v8, Lq0/f;->n:[Ljava/lang/Object;

    iget v0, v8, Lq0/f;->o:I

    .line 21
    invoke-interface/range {p2 .. p2}, Ljava/util/Collection;->size()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, v8, Lq0/f;->o:I

    return v10

    .line 22
    :cond_2
    new-array v12, v6, [[Ljava/lang/Object;

    .line 23
    invoke-virtual {p0}, Lq0/f;->O()I

    move-result v4

    iget v3, v8, Lq0/f;->o:I

    .line 24
    invoke-interface/range {p2 .. p2}, Ljava/util/Collection;->size()I

    move-result v5

    add-int/2addr v5, v3

    if-gt v5, v0, :cond_3

    goto :goto_0

    :cond_3
    add-int/lit8 v3, v5, -0x1

    and-int/lit8 v3, v3, -0x20

    sub-int/2addr v5, v3

    .line 25
    :goto_0
    invoke-virtual {p0}, Lq0/f;->L()I

    move-result v3

    if-lt v2, v3, :cond_4

    .line 26
    invoke-virtual {p0}, Lq0/f;->w()[Ljava/lang/Object;

    move-result-object v13

    iget-object v3, v8, Lq0/f;->n:[Ljava/lang/Object;

    move-object v0, p0

    move-object/from16 v1, p2

    move v2, p1

    move-object v5, v12

    move-object v7, v13

    .line 27
    invoke-virtual/range {v0 .. v7}, Lq0/f;->N(Ljava/util/Collection;I[Ljava/lang/Object;I[[Ljava/lang/Object;I[Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    if-le v5, v4, :cond_5

    sub-int v3, v5, v4

    iget-object v0, v8, Lq0/f;->n:[Ljava/lang/Object;

    .line 28
    invoke-virtual {p0, v3, v0}, Lq0/f;->v(I[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v13

    move-object v0, p0

    move-object/from16 v1, p2

    move v2, p1

    move-object v4, v12

    move v5, v6

    move-object v6, v13

    .line 29
    invoke-virtual/range {v0 .. v6}, Lq0/f;->p(Ljava/util/Collection;II[[Ljava/lang/Object;I[Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    iget-object v3, v8, Lq0/f;->n:[Ljava/lang/Object;

    .line 30
    invoke-virtual {p0}, Lq0/f;->w()[Ljava/lang/Object;

    move-result-object v13

    sub-int v5, v4, v5

    invoke-static {v1, v5, v4, v3, v13}, Lb9/b;->H(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    rsub-int/lit8 v3, v5, 0x20

    iget-object v0, v8, Lq0/f;->n:[Ljava/lang/Object;

    .line 31
    invoke-virtual {p0, v3, v0}, Lq0/f;->v(I[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v5, v6, -0x1

    .line 32
    aput-object v7, v12, v5

    move-object v0, p0

    move-object/from16 v1, p2

    move v2, p1

    move-object v4, v12

    move-object v6, v7

    .line 33
    invoke-virtual/range {v0 .. v6}, Lq0/f;->p(Ljava/util/Collection;II[[Ljava/lang/Object;I[Ljava/lang/Object;)V

    :goto_1
    iget-object v0, v8, Lq0/f;->f:[Ljava/lang/Object;

    .line 34
    invoke-virtual {p0, v0, v11, v12}, Lq0/f;->C([Ljava/lang/Object;I[[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v8, Lq0/f;->f:[Ljava/lang/Object;

    iput-object v13, v8, Lq0/f;->n:[Ljava/lang/Object;

    iget v0, v8, Lq0/f;->o:I

    .line 35
    invoke-interface/range {p2 .. p2}, Ljava/util/Collection;->size()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, v8, Lq0/f;->o:I

    return v10
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 7

    .line 1
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    const/4 v2, 0x1

    add-int/2addr v0, v2

    iput v0, p0, Ljava/util/AbstractList;->modCount:I

    .line 2
    invoke-virtual {p0}, Lq0/f;->O()I

    move-result v0

    .line 3
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    rsub-int/lit8 v4, v0, 0x20

    .line 4
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v5

    if-lt v4, v5, :cond_1

    iget-object v1, p0, Lq0/f;->n:[Ljava/lang/Object;

    .line 5
    invoke-virtual {p0, v1}, Lq0/f;->u([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v0, v3}, Lq0/f;->n([Ljava/lang/Object;ILjava/util/Iterator;)V

    iput-object v1, p0, Lq0/f;->n:[Ljava/lang/Object;

    iget v0, p0, Lq0/f;->o:I

    .line 6
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result p1

    add-int/2addr p1, v0

    iput p1, p0, Lq0/f;->o:I

    goto :goto_1

    .line 7
    :cond_1
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v4

    add-int/2addr v4, v0

    sub-int/2addr v4, v2

    div-int/lit8 v4, v4, 0x20

    .line 8
    new-array v5, v4, [[Ljava/lang/Object;

    iget-object v6, p0, Lq0/f;->n:[Ljava/lang/Object;

    .line 9
    invoke-virtual {p0, v6}, Lq0/f;->u([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6, v0, v3}, Lq0/f;->n([Ljava/lang/Object;ILjava/util/Iterator;)V

    aput-object v6, v5, v1

    move v0, v2

    :goto_0
    if-ge v0, v4, :cond_2

    .line 10
    invoke-virtual {p0}, Lq0/f;->w()[Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6, v1, v3}, Lq0/f;->n([Ljava/lang/Object;ILjava/util/Iterator;)V

    aput-object v6, v5, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lq0/f;->f:[Ljava/lang/Object;

    .line 11
    invoke-virtual {p0}, Lq0/f;->L()I

    move-result v4

    invoke-virtual {p0, v0, v4, v5}, Lq0/f;->C([Ljava/lang/Object;I[[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lq0/f;->f:[Ljava/lang/Object;

    .line 12
    invoke-virtual {p0}, Lq0/f;->w()[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1, v3}, Lq0/f;->n([Ljava/lang/Object;ILjava/util/Iterator;)V

    iput-object v0, p0, Lq0/f;->n:[Ljava/lang/Object;

    iget v0, p0, Lq0/f;->o:I

    .line 13
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result p1

    add-int/2addr p1, v0

    iput p1, p0, Lq0/f;->o:I

    :goto_1
    return v2
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lq0/f;->o:I

    return v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0}, Lq0/f;->e()I

    move-result v0

    invoke-static {p1, v0}, Lz6/a;->h(II)V

    invoke-virtual {p0}, Lq0/f;->L()I

    move-result v0

    if-gt v0, p1, :cond_0

    iget-object v0, p0, Lq0/f;->n:[Ljava/lang/Object;

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lq0/f;->f:[Ljava/lang/Object;

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    iget v1, p0, Lq0/f;->d:I

    :goto_0
    if-lez v1, :cond_1

    invoke-static {p1, v1}, Ld9/i;->q(II)I

    move-result v2

    aget-object v0, v0, v2

    const-string v2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"

    invoke-static {v0, v2}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, [Ljava/lang/Object;

    add-int/lit8 v1, v1, -0x5

    goto :goto_0

    :cond_1
    :goto_1
    and-int/lit8 p1, p1, 0x1f

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final i(I)Ljava/lang/Object;
    .locals 5

    invoke-virtual {p0}, Lq0/f;->e()I

    move-result v0

    invoke-static {p1, v0}, Lz6/a;->h(II)V

    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ljava/util/AbstractList;->modCount:I

    invoke-virtual {p0}, Lq0/f;->L()I

    move-result v0

    if-lt p1, v0, :cond_0

    iget-object v1, p0, Lq0/f;->f:[Ljava/lang/Object;

    iget v2, p0, Lq0/f;->d:I

    sub-int/2addr p1, v0

    invoke-virtual {p0, v1, v0, v2, p1}, Lq0/f;->K([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v1, Le/a;

    iget-object v2, p0, Lq0/f;->n:[Ljava/lang/Object;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    invoke-direct {v1, v2}, Le/a;-><init>(Ljava/lang/Object;)V

    iget-object v2, p0, Lq0/f;->f:[Ljava/lang/Object;

    invoke-static {v2}, Ld7/a;->j(Ljava/lang/Object;)V

    iget v4, p0, Lq0/f;->d:I

    invoke-virtual {p0, v2, v4, p1, v1}, Lq0/f;->J([Ljava/lang/Object;IILe/a;)[Ljava/lang/Object;

    move-result-object p1

    iget v2, p0, Lq0/f;->d:I

    invoke-virtual {p0, p1, v0, v2, v3}, Lq0/f;->K([Ljava/lang/Object;III)Ljava/lang/Object;

    iget-object p1, v1, Le/a;->a:Ljava/lang/Object;

    return-object p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lq0/f;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    return-object v0
.end method

.method public final k()Lp0/d;
    .locals 5

    iget-object v0, p0, Lq0/f;->f:[Ljava/lang/Object;

    iget-object v1, p0, Lq0/f;->b:[Ljava/lang/Object;

    if-ne v0, v1, :cond_0

    iget-object v1, p0, Lq0/f;->n:[Ljava/lang/Object;

    iget-object v2, p0, Lq0/f;->c:[Ljava/lang/Object;

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lq0/f;->a:Lp0/d;

    goto :goto_0

    :cond_0
    new-instance v1, Lt0/b;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lq0/f;->e:Lt0/b;

    iput-object v0, p0, Lq0/f;->b:[Ljava/lang/Object;

    iget-object v1, p0, Lq0/f;->n:[Ljava/lang/Object;

    iput-object v1, p0, Lq0/f;->c:[Ljava/lang/Object;

    if-nez v0, :cond_2

    array-length v0, v1

    if-nez v0, :cond_1

    sget-object v0, Lq0/j;->b:Lq0/j;

    goto :goto_0

    :cond_1
    new-instance v0, Lq0/j;

    iget-object v1, p0, Lq0/f;->n:[Ljava/lang/Object;

    invoke-virtual {p0}, Lq0/f;->e()I

    move-result v2

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    const-string v2, "copyOf(this, newSize)"

    invoke-static {v1, v2}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lq0/j;-><init>([Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    new-instance v1, Lq0/e;

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v2, p0, Lq0/f;->n:[Ljava/lang/Object;

    invoke-virtual {p0}, Lq0/f;->e()I

    move-result v3

    iget v4, p0, Lq0/f;->d:I

    invoke-direct {v1, v3, v4, v0, v2}, Lq0/e;-><init>(II[Ljava/lang/Object;[Ljava/lang/Object;)V

    move-object v0, v1

    :goto_0
    iput-object v0, p0, Lq0/f;->a:Lp0/d;

    return-object v0
.end method

.method public final listIterator()Ljava/util/ListIterator;
    .locals 1

    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, v0}, Lq0/f;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    return-object v0
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lq0/f;->e()I

    move-result v0

    .line 2
    invoke-static {p1, v0}, Lz6/a;->k(II)V

    .line 3
    new-instance v0, Lq0/h;

    invoke-direct {v0, p0, p1}, Lq0/h;-><init>(Lq0/f;I)V

    return-object v0
.end method

.method public final o()I
    .locals 1

    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    return v0
.end method

.method public final p(Ljava/util/Collection;II[[Ljava/lang/Object;I[Ljava/lang/Object;)V
    .locals 9

    iget-object v0, p0, Lq0/f;->f:[Ljava/lang/Object;

    if-eqz v0, :cond_2

    shr-int/lit8 v0, p2, 0x5

    invoke-virtual {p0}, Lq0/f;->L()I

    move-result v1

    shr-int/lit8 v1, v1, 0x5

    invoke-virtual {p0, v1}, Lq0/f;->t(I)Lq0/a;

    move-result-object v1

    move v3, p5

    move-object v2, p6

    :goto_0
    iget v4, v1, Lq0/a;->a:I

    add-int/lit8 v4, v4, -0x1

    if-eq v4, v0, :cond_0

    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [Ljava/lang/Object;

    rsub-int/lit8 v5, p3, 0x20

    const/4 v6, 0x0

    const/16 v7, 0x20

    invoke-static {v6, v5, v7, v4, v2}, Lb9/b;->H(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    invoke-virtual {p0, p3, v4}, Lq0/f;->v(I[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v3, v3, -0x1

    aput-object v2, p4, v3

    goto :goto_0

    :cond_0
    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object p3

    move-object v4, p3

    check-cast v4, [Ljava/lang/Object;

    invoke-virtual {p0}, Lq0/f;->L()I

    move-result p3

    shr-int/lit8 p3, p3, 0x5

    add-int/lit8 p3, p3, -0x1

    sub-int/2addr p3, v0

    sub-int v7, p5, p3

    if-ge v7, p5, :cond_1

    aget-object p6, p4, v7

    invoke-static {p6}, Ld7/a;->j(Ljava/lang/Object;)V

    :cond_1
    move-object v8, p6

    const/16 v5, 0x20

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v6, p4

    invoke-virtual/range {v1 .. v8}, Lq0/f;->N(Ljava/util/Collection;I[Ljava/lang/Object;I[[Ljava/lang/Object;I[Ljava/lang/Object;)V

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "root is null"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final q([Ljava/lang/Object;IILjava/lang/Object;Le/a;)[Ljava/lang/Object;
    .locals 7

    invoke-static {p3, p2}, Ld9/i;->q(II)I

    move-result v0

    if-nez p2, :cond_0

    const/16 p2, 0x1f

    aget-object p3, p1, p2

    iput-object p3, p5, Le/a;->a:Ljava/lang/Object;

    invoke-virtual {p0, p1}, Lq0/f;->u([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p3

    add-int/lit8 p5, v0, 0x1

    invoke-static {p5, v0, p2, p1, p3}, Lb9/b;->H(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    aput-object p4, p3, v0

    return-object p3

    :cond_0
    invoke-virtual {p0, p1}, Lq0/f;->u([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    add-int/lit8 p2, p2, -0x5

    aget-object v1, p1, v0

    const-string v2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"

    invoke-static {v1, v2}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v1

    check-cast v2, [Ljava/lang/Object;

    move-object v1, p0

    move v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, Lq0/f;->q([Ljava/lang/Object;IILjava/lang/Object;Le/a;)[Ljava/lang/Object;

    move-result-object p3

    aput-object p3, p1, v0

    :goto_0
    add-int/lit8 v0, v0, 0x1

    const/16 p3, 0x20

    if-ge v0, p3, :cond_1

    aget-object p3, p1, v0

    if-eqz p3, :cond_1

    move-object v2, p3

    check-cast v2, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p5, Le/a;->a:Ljava/lang/Object;

    move-object v1, p0

    move v3, p2

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, Lq0/f;->q([Ljava/lang/Object;IILjava/lang/Object;Le/a;)[Ljava/lang/Object;

    move-result-object p3

    aput-object p3, p1, v0

    goto :goto_0

    :cond_1
    return-object p1
.end method

.method public final r(Ljava/lang/Object;[Ljava/lang/Object;I)V
    .locals 5

    invoke-virtual {p0}, Lq0/f;->O()I

    move-result v0

    iget-object v1, p0, Lq0/f;->n:[Ljava/lang/Object;

    invoke-virtual {p0, v1}, Lq0/f;->u([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    const/16 v2, 0x20

    if-ge v0, v2, :cond_0

    iget-object v2, p0, Lq0/f;->n:[Ljava/lang/Object;

    add-int/lit8 v3, p3, 0x1

    invoke-static {v3, p3, v0, v2, v1}, Lb9/b;->H(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    aput-object p1, v1, p3

    iput-object p2, p0, Lq0/f;->f:[Ljava/lang/Object;

    iput-object v1, p0, Lq0/f;->n:[Ljava/lang/Object;

    iget p1, p0, Lq0/f;->o:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lq0/f;->o:I

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lq0/f;->n:[Ljava/lang/Object;

    const/16 v2, 0x1f

    aget-object v3, v0, v2

    add-int/lit8 v4, p3, 0x1

    invoke-static {v4, p3, v2, v0, v1}, Lb9/b;->H(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    aput-object p1, v1, p3

    invoke-virtual {p0, v3}, Lq0/f;->x(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p2, v1, p1}, Lq0/f;->D([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 2

    new-instance v0, Lq0/b;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Lq0/b;-><init>(ILjava/util/Collection;)V

    invoke-virtual {p0, v0}, Lq0/f;->I(Lq0/b;)Z

    move-result p1

    return p1
.end method

.method public final s([Ljava/lang/Object;)Z
    .locals 2

    array-length v0, p1

    const/16 v1, 0x21

    if-ne v0, v1, :cond_0

    const/16 v0, 0x20

    aget-object p1, p1, v0

    iget-object v0, p0, Lq0/f;->e:Lt0/b;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-virtual {p0}, Lq0/f;->e()I

    move-result v0

    invoke-static {p1, v0}, Lz6/a;->h(II)V

    invoke-virtual {p0}, Lq0/f;->L()I

    move-result v0

    if-gt v0, p1, :cond_1

    iget-object v0, p0, Lq0/f;->n:[Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lq0/f;->u([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lq0/f;->n:[Ljava/lang/Object;

    if-eq v0, v1, :cond_0

    iget v1, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ljava/util/AbstractList;->modCount:I

    :cond_0
    and-int/lit8 p1, p1, 0x1f

    aget-object v1, v0, p1

    aput-object p2, v0, p1

    iput-object v0, p0, Lq0/f;->n:[Ljava/lang/Object;

    return-object v1

    :cond_1
    new-instance v0, Le/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le/a;-><init>(Ljava/lang/Object;)V

    iget-object v3, p0, Lq0/f;->f:[Ljava/lang/Object;

    invoke-static {v3}, Ld7/a;->j(Ljava/lang/Object;)V

    iget v4, p0, Lq0/f;->d:I

    move-object v2, p0

    move v5, p1

    move-object v6, p2

    move-object v7, v0

    invoke-virtual/range {v2 .. v7}, Lq0/f;->M([Ljava/lang/Object;IILjava/lang/Object;Le/a;)[Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lq0/f;->f:[Ljava/lang/Object;

    iget-object p1, v0, Le/a;->a:Ljava/lang/Object;

    return-object p1
.end method

.method public final t(I)Lq0/a;
    .locals 4

    iget-object v0, p0, Lq0/f;->f:[Ljava/lang/Object;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lq0/f;->L()I

    move-result v1

    shr-int/lit8 v1, v1, 0x5

    invoke-static {p1, v1}, Lz6/a;->k(II)V

    iget v2, p0, Lq0/f;->d:I

    if-nez v2, :cond_0

    new-instance v1, Lq0/i;

    invoke-direct {v1, v0, p1}, Lq0/i;-><init>(Ljava/lang/Object;I)V

    return-object v1

    :cond_0
    div-int/lit8 v2, v2, 0x5

    new-instance v3, Lq0/k;

    invoke-direct {v3, v0, p1, v1, v2}, Lq0/k;-><init>([Ljava/lang/Object;III)V

    return-object v3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Invalid root"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final u([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 4

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lq0/f;->w()[Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0, p1}, Lq0/f;->s([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p1

    :cond_1
    invoke-virtual {p0}, Lq0/f;->w()[Ljava/lang/Object;

    move-result-object v0

    array-length v1, p1

    const/16 v2, 0x20

    if-le v1, v2, :cond_2

    move v1, v2

    :cond_2
    const/4 v2, 0x6

    const/4 v3, 0x0

    invoke-static {p1, v0, v3, v1, v2}, Lb9/b;->L([Ljava/lang/Object;[Ljava/lang/Object;III)V

    return-object v0
.end method

.method public final v(I[Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0, p2}, Lq0/f;->s([Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    rsub-int/lit8 v0, p1, 0x20

    invoke-static {p1, v1, v0, p2, p2}, Lb9/b;->H(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    return-object p2

    :cond_0
    invoke-virtual {p0}, Lq0/f;->w()[Ljava/lang/Object;

    move-result-object v0

    rsub-int/lit8 v2, p1, 0x20

    invoke-static {p1, v1, v2, p2, v0}, Lb9/b;->H(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    return-object v0
.end method

.method public final w()[Ljava/lang/Object;
    .locals 3

    const/16 v0, 0x21

    new-array v0, v0, [Ljava/lang/Object;

    const/16 v1, 0x20

    iget-object v2, p0, Lq0/f;->e:Lt0/b;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public final x(Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 2

    const/16 v0, 0x21

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/16 p1, 0x20

    iget-object v1, p0, Lq0/f;->e:Lt0/b;

    aput-object v1, v0, p1

    return-object v0
.end method

.method public final y(II[Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 3

    if-ltz p2, :cond_4

    if-nez p2, :cond_0

    return-object p3

    :cond_0
    invoke-static {p1, p2}, Ld9/i;->q(II)I

    move-result v0

    aget-object v1, p3, v0

    const-string v2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"

    invoke-static {v1, v2}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, [Ljava/lang/Object;

    add-int/lit8 p2, p2, -0x5

    invoke-virtual {p0, p1, p2, v1}, Lq0/f;->y(II[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    const/16 p2, 0x1f

    if-ge v0, p2, :cond_2

    add-int/lit8 p2, v0, 0x1

    aget-object v1, p3, p2

    if-eqz v1, :cond_2

    invoke-virtual {p0, p3}, Lq0/f;->s([Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x20

    const/4 v2, 0x0

    invoke-static {p3, p2, v1, v2}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    :cond_1
    invoke-virtual {p0}, Lq0/f;->w()[Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v2, v2, p2, p3, v1}, Lb9/b;->H(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    move-object p3, v1

    :cond_2
    aget-object p2, p3, v0

    if-eq p1, p2, :cond_3

    invoke-virtual {p0, p3}, Lq0/f;->u([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p3

    aput-object p1, p3, v0

    :cond_3
    return-object p3

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "shift should be positive"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final z([Ljava/lang/Object;IILe/a;)[Ljava/lang/Object;
    .locals 5

    add-int/lit8 v0, p3, -0x1

    invoke-static {v0, p2}, Ld9/i;->q(II)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x5

    if-ne p2, v2, :cond_0

    aget-object p2, p1, v0

    iput-object p2, p4, Le/a;->a:Ljava/lang/Object;

    move-object p2, v1

    goto :goto_0

    :cond_0
    aget-object v3, p1, v0

    const-string v4, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"

    invoke-static {v3, v4}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, [Ljava/lang/Object;

    sub-int/2addr p2, v2

    invoke-virtual {p0, v3, p2, p3, p4}, Lq0/f;->z([Ljava/lang/Object;IILe/a;)[Ljava/lang/Object;

    move-result-object p2

    :goto_0
    if-nez p2, :cond_1

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    invoke-virtual {p0, p1}, Lq0/f;->u([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    aput-object p2, p1, v0

    return-object p1
.end method
