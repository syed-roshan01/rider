.class public final Lm0/q2;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lm0/n2;

.field public b:[I

.field public c:[Ljava/lang/Object;

.field public d:Ljava/util/ArrayList;

.field public e:Ljava/util/HashMap;

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:I

.field public l:I

.field public m:I

.field public n:I

.field public final o:Lm0/t0;

.field public final p:Lm0/t0;

.field public final q:Lm0/t0;

.field public r:I

.field public s:I

.field public t:I

.field public u:Z

.field public v:Lm0/s1;


# direct methods
.method public constructor <init>(Lm0/n2;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/q2;->a:Lm0/n2;

    iget-object v0, p1, Lm0/n2;->a:[I

    iput-object v0, p0, Lm0/q2;->b:[I

    iget-object v1, p1, Lm0/n2;->c:[Ljava/lang/Object;

    iput-object v1, p0, Lm0/q2;->c:[Ljava/lang/Object;

    iget-object v2, p1, Lm0/n2;->o:Ljava/util/ArrayList;

    iput-object v2, p0, Lm0/q2;->d:Ljava/util/ArrayList;

    iget-object v2, p1, Lm0/n2;->p:Ljava/util/HashMap;

    iput-object v2, p0, Lm0/q2;->e:Ljava/util/HashMap;

    iget v2, p1, Lm0/n2;->b:I

    iput v2, p0, Lm0/q2;->f:I

    array-length v0, v0

    div-int/lit8 v0, v0, 0x5

    sub-int/2addr v0, v2

    iput v0, p0, Lm0/q2;->g:I

    iget p1, p1, Lm0/n2;->d:I

    iput p1, p0, Lm0/q2;->j:I

    array-length v0, v1

    sub-int/2addr v0, p1

    iput v0, p0, Lm0/q2;->k:I

    iput v2, p0, Lm0/q2;->l:I

    new-instance p1, Lm0/t0;

    invoke-direct {p1}, Lm0/t0;-><init>()V

    iput-object p1, p0, Lm0/q2;->o:Lm0/t0;

    new-instance p1, Lm0/t0;

    invoke-direct {p1}, Lm0/t0;-><init>()V

    iput-object p1, p0, Lm0/q2;->p:Lm0/t0;

    new-instance p1, Lm0/t0;

    invoke-direct {p1}, Lm0/t0;-><init>()V

    iput-object p1, p0, Lm0/q2;->q:Lm0/t0;

    iput v2, p0, Lm0/q2;->s:I

    const/4 p1, -0x1

    iput p1, p0, Lm0/q2;->t:I

    return-void
.end method

.method public static h(IIII)I
    .locals 0

    if-le p0, p1, :cond_0

    sub-int/2addr p3, p2

    sub-int/2addr p3, p0

    add-int/lit8 p3, p3, 0x1

    neg-int p0, p3

    :cond_0
    return p0
.end method

.method public static t(Lm0/q2;)V
    .locals 7

    iget v0, p0, Lm0/q2;->t:I

    invoke-virtual {p0, v0}, Lm0/q2;->o(I)I

    move-result v1

    iget-object v2, p0, Lm0/q2;->b:[I

    mul-int/lit8 v3, v1, 0x5

    add-int/lit8 v3, v3, 0x1

    aget v4, v2, v3

    const/high16 v5, 0x8000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    goto :goto_0

    :cond_0
    or-int/2addr v4, v5

    aput v4, v2, v3

    invoke-static {v2, v1}, Ld7/t;->q([II)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lm0/q2;->b:[I

    invoke-virtual {p0, v1, v0}, Lm0/q2;->y([II)I

    move-result v0

    invoke-virtual {p0, v0}, Lm0/q2;->N(I)V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final A()Z
    .locals 6

    iget v0, p0, Lm0/q2;->m:I

    if-nez v0, :cond_1

    iget v0, p0, Lm0/q2;->r:I

    iget v1, p0, Lm0/q2;->h:I

    invoke-virtual {p0}, Lm0/q2;->E()I

    move-result v2

    iget v3, p0, Lm0/q2;->t:I

    invoke-virtual {p0, v3}, Lm0/q2;->H(I)Lm0/s0;

    iget-object v3, p0, Lm0/q2;->v:Lm0/s1;

    if-eqz v3, :cond_0

    :goto_0
    iget-object v4, v3, Lm0/s1;->a:Ljava/util/List;

    move-object v5, v4

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    xor-int/lit8 v5, v5, 0x1

    if-eqz v5, :cond_0

    invoke-static {v4}, Lr8/p;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    if-lt v4, v0, :cond_0

    invoke-virtual {v3}, Lm0/s1;->b()I

    goto :goto_0

    :cond_0
    iget v3, p0, Lm0/q2;->r:I

    sub-int/2addr v3, v0

    invoke-virtual {p0, v0, v3}, Lm0/q2;->B(II)Z

    move-result v3

    iget v4, p0, Lm0/q2;->h:I

    sub-int/2addr v4, v1

    add-int/lit8 v5, v0, -0x1

    invoke-virtual {p0, v1, v4, v5}, Lm0/q2;->C(III)V

    iput v0, p0, Lm0/q2;->r:I

    iput v1, p0, Lm0/q2;->h:I

    iget v0, p0, Lm0/q2;->n:I

    sub-int/2addr v0, v2

    iput v0, p0, Lm0/q2;->n:I

    return v3

    :cond_1
    const-string v0, "Cannot remove group while inserting"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lm0/s;->g(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final B(II)Z
    .locals 9

    const/4 v0, 0x0

    if-lez p2, :cond_9

    iget-object v1, p0, Lm0/q2;->d:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Lm0/q2;->v(I)V

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    if-eqz v1, :cond_6

    iget-object v1, p0, Lm0/q2;->e:Ljava/util/HashMap;

    iget v3, p0, Lm0/q2;->g:I

    add-int v4, p1, p2

    invoke-virtual {p0}, Lm0/q2;->m()I

    move-result v5

    sub-int/2addr v5, v3

    iget-object v3, p0, Lm0/q2;->d:Ljava/util/ArrayList;

    invoke-static {v3, v4, v5}, Ld7/t;->w(Ljava/util/ArrayList;II)I

    move-result v3

    iget-object v5, p0, Lm0/q2;->d:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-lt v3, v5, :cond_0

    add-int/lit8 v3, v3, -0x1

    :cond_0
    add-int/lit8 v5, v3, 0x1

    move v6, v0

    :goto_0
    if-ltz v3, :cond_4

    iget-object v7, p0, Lm0/q2;->d:Ljava/util/ArrayList;

    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lm0/c;

    invoke-virtual {p0, v7}, Lm0/q2;->c(Lm0/c;)I

    move-result v8

    if-lt v8, p1, :cond_4

    if-ge v8, v4, :cond_3

    const/high16 v5, -0x80000000

    iput v5, v7, Lm0/c;->a:I

    if-eqz v1, :cond_1

    invoke-virtual {v1, v7}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lm0/s0;

    :cond_1
    if-nez v6, :cond_2

    add-int/lit8 v6, v3, 0x1

    :cond_2
    move v5, v3

    :cond_3
    add-int/lit8 v3, v3, -0x1

    goto :goto_0

    :cond_4
    if-ge v5, v6, :cond_5

    move v0, v2

    :cond_5
    if-eqz v0, :cond_6

    iget-object v1, p0, Lm0/q2;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, v5, v6}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->clear()V

    :cond_6
    iput p1, p0, Lm0/q2;->f:I

    iget v1, p0, Lm0/q2;->g:I

    add-int/2addr v1, p2

    iput v1, p0, Lm0/q2;->g:I

    iget v1, p0, Lm0/q2;->l:I

    if-le v1, p1, :cond_7

    sub-int/2addr v1, p2

    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lm0/q2;->l:I

    :cond_7
    iget p1, p0, Lm0/q2;->s:I

    iget v1, p0, Lm0/q2;->f:I

    if-lt p1, v1, :cond_8

    sub-int/2addr p1, p2

    iput p1, p0, Lm0/q2;->s:I

    :cond_8
    iget p1, p0, Lm0/q2;->t:I

    if-ltz p1, :cond_9

    iget-object p2, p0, Lm0/q2;->b:[I

    invoke-virtual {p0, p1}, Lm0/q2;->o(I)I

    move-result v1

    invoke-static {p2, v1}, Ld7/t;->q([II)Z

    move-result p2

    if-eqz p2, :cond_9

    invoke-virtual {p0, p1}, Lm0/q2;->N(I)V

    :cond_9
    return v0
.end method

.method public final C(III)V
    .locals 2

    if-lez p2, :cond_0

    iget v0, p0, Lm0/q2;->k:I

    add-int v1, p1, p2

    invoke-virtual {p0, v1, p3}, Lm0/q2;->w(II)V

    iput p1, p0, Lm0/q2;->j:I

    add-int/2addr v0, p2

    iput v0, p0, Lm0/q2;->k:I

    iget-object p3, p0, Lm0/q2;->c:[Ljava/lang/Object;

    invoke-static {p1, v1, p3}, Lb9/b;->O(II[Ljava/lang/Object;)V

    iget p3, p0, Lm0/q2;->i:I

    if-lt p3, p1, :cond_0

    sub-int/2addr p3, p2

    iput p3, p0, Lm0/q2;->i:I

    :cond_0
    return-void
.end method

.method public final D(Ljava/lang/Object;II)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0, p2}, Lm0/q2;->o(I)I

    move-result v0

    iget-object v1, p0, Lm0/q2;->b:[I

    invoke-virtual {p0, v1, v0}, Lm0/q2;->G([II)I

    move-result v0

    iget-object v1, p0, Lm0/q2;->b:[I

    add-int/lit8 v2, p2, 0x1

    invoke-virtual {p0, v2}, Lm0/q2;->o(I)I

    move-result v2

    invoke-virtual {p0, v1, v2}, Lm0/q2;->f([II)I

    move-result v1

    add-int v2, v0, p3

    if-lt v2, v0, :cond_0

    if-ge v2, v1, :cond_0

    invoke-virtual {p0, v2}, Lm0/q2;->g(I)I

    move-result p2

    iget-object p3, p0, Lm0/q2;->c:[Ljava/lang/Object;

    aget-object v0, p3, p2

    aput-object p1, p3, p2

    return-object v0

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Write to an invalid slot index "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " for group "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lm0/s;->g(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final E()I
    .locals 3

    iget v0, p0, Lm0/q2;->r:I

    invoke-virtual {p0, v0}, Lm0/q2;->o(I)I

    move-result v0

    iget v1, p0, Lm0/q2;->r:I

    iget-object v2, p0, Lm0/q2;->b:[I

    invoke-static {v2, v0}, Ld7/t;->s([II)I

    move-result v2

    add-int/2addr v2, v1

    iput v2, p0, Lm0/q2;->r:I

    iget-object v1, p0, Lm0/q2;->b:[I

    invoke-virtual {p0, v2}, Lm0/q2;->o(I)I

    move-result v2

    invoke-virtual {p0, v1, v2}, Lm0/q2;->f([II)I

    move-result v1

    iput v1, p0, Lm0/q2;->h:I

    iget-object v1, p0, Lm0/q2;->b:[I

    invoke-static {v1, v0}, Ld7/t;->v([II)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lm0/q2;->b:[I

    invoke-static {v1, v0}, Ld7/t;->x([II)I

    move-result v0

    :goto_0
    return v0
.end method

.method public final F()V
    .locals 2

    iget v0, p0, Lm0/q2;->s:I

    iput v0, p0, Lm0/q2;->r:I

    iget-object v1, p0, Lm0/q2;->b:[I

    invoke-virtual {p0, v0}, Lm0/q2;->o(I)I

    move-result v0

    invoke-virtual {p0, v1, v0}, Lm0/q2;->f([II)I

    move-result v0

    iput v0, p0, Lm0/q2;->h:I

    return-void
.end method

.method public final G([II)I
    .locals 1

    invoke-virtual {p0}, Lm0/q2;->m()I

    move-result v0

    if-lt p2, v0, :cond_0

    iget-object p1, p0, Lm0/q2;->c:[Ljava/lang/Object;

    array-length p1, p1

    iget p2, p0, Lm0/q2;->k:I

    sub-int/2addr p1, p2

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Ld7/t;->z([II)I

    move-result p1

    iget p2, p0, Lm0/q2;->k:I

    iget-object v0, p0, Lm0/q2;->c:[Ljava/lang/Object;

    array-length v0, v0

    if-gez p1, :cond_1

    sub-int/2addr v0, p2

    add-int/2addr v0, p1

    add-int/lit8 v0, v0, 0x1

    move p1, v0

    :cond_1
    :goto_0
    return p1
.end method

.method public final H(I)Lm0/s0;
    .locals 2

    iget-object v0, p0, Lm0/q2;->e:Ljava/util/HashMap;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lm0/q2;->K(I)Lm0/c;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Lm0/s0;

    :cond_0
    return-object v1
.end method

.method public final I()V
    .locals 2

    iget v0, p0, Lm0/q2;->m:I

    if-nez v0, :cond_0

    sget-object v0, Lm0/l;->a:Lk0/y0;

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v0, v1}, Lm0/q2;->J(ILjava/lang/Object;Ljava/lang/Object;Z)V

    return-void

    :cond_0
    const-string v0, "Key must be supplied when inserting"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lm0/s;->g(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final J(ILjava/lang/Object;Ljava/lang/Object;Z)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    iget v3, v0, Lm0/q2;->t:I

    iget v4, v0, Lm0/q2;->m:I

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-lez v4, :cond_0

    move v4, v6

    goto :goto_0

    :cond_0
    move v4, v5

    :goto_0
    iget-object v7, v0, Lm0/q2;->q:Lm0/t0;

    iget v8, v0, Lm0/q2;->n:I

    invoke-virtual {v7, v8}, Lm0/t0;->b(I)V

    sget-object v7, Lm0/l;->a:Lk0/y0;

    if-eqz v4, :cond_a

    invoke-virtual {v0, v6}, Lm0/q2;->r(I)V

    iget v4, v0, Lm0/q2;->r:I

    invoke-virtual {v0, v4}, Lm0/q2;->o(I)I

    move-result v8

    if-eq v1, v7, :cond_1

    move v9, v6

    goto :goto_1

    :cond_1
    move v9, v5

    :goto_1
    if-nez p4, :cond_2

    if-eq v2, v7, :cond_2

    goto :goto_2

    :cond_2
    move v6, v5

    :goto_2
    iget-object v7, v0, Lm0/q2;->b:[I

    iget v10, v0, Lm0/q2;->t:I

    iget v11, v0, Lm0/q2;->h:I

    if-eqz p4, :cond_3

    const/high16 v12, 0x40000000    # 2.0f

    goto :goto_3

    :cond_3
    move v12, v5

    :goto_3
    if-eqz v9, :cond_4

    const/high16 v13, 0x20000000

    goto :goto_4

    :cond_4
    move v13, v5

    :goto_4
    if-eqz v6, :cond_5

    const/high16 v14, 0x10000000

    goto :goto_5

    :cond_5
    move v14, v5

    :goto_5
    mul-int/lit8 v8, v8, 0x5

    aput p1, v7, v8

    add-int/lit8 v15, v8, 0x1

    or-int/2addr v12, v13

    or-int/2addr v12, v14

    aput v12, v7, v15

    add-int/lit8 v12, v8, 0x2

    aput v10, v7, v12

    add-int/lit8 v10, v8, 0x3

    aput v5, v7, v10

    add-int/lit8 v8, v8, 0x4

    aput v11, v7, v8

    iput v11, v0, Lm0/q2;->i:I

    add-int v7, p4, v9

    add-int/2addr v7, v6

    if-lez v7, :cond_9

    invoke-virtual {v0, v7, v4}, Lm0/q2;->s(II)V

    iget-object v7, v0, Lm0/q2;->c:[Ljava/lang/Object;

    iget v8, v0, Lm0/q2;->h:I

    if-eqz p4, :cond_6

    add-int/lit8 v10, v8, 0x1

    aput-object v2, v7, v8

    move v8, v10

    :cond_6
    if-eqz v9, :cond_7

    add-int/lit8 v9, v8, 0x1

    aput-object v1, v7, v8

    move v8, v9

    :cond_7
    if-eqz v6, :cond_8

    add-int/lit8 v1, v8, 0x1

    aput-object v2, v7, v8

    move v8, v1

    :cond_8
    iput v8, v0, Lm0/q2;->h:I

    :cond_9
    iput v5, v0, Lm0/q2;->n:I

    add-int/lit8 v1, v4, 0x1

    iput v4, v0, Lm0/q2;->t:I

    iput v1, v0, Lm0/q2;->r:I

    if-ltz v3, :cond_d

    invoke-virtual {v0, v3}, Lm0/q2;->H(I)Lm0/s0;

    goto :goto_7

    :cond_a
    iget-object v1, v0, Lm0/q2;->o:Lm0/t0;

    invoke-virtual {v1, v3}, Lm0/t0;->b(I)V

    invoke-virtual/range {p0 .. p0}, Lm0/q2;->m()I

    move-result v1

    iget v3, v0, Lm0/q2;->g:I

    sub-int/2addr v1, v3

    iget v3, v0, Lm0/q2;->s:I

    sub-int/2addr v1, v3

    iget-object v3, v0, Lm0/q2;->p:Lm0/t0;

    invoke-virtual {v3, v1}, Lm0/t0;->b(I)V

    iget v1, v0, Lm0/q2;->r:I

    invoke-virtual {v0, v1}, Lm0/q2;->o(I)I

    move-result v3

    invoke-static {v2, v7}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_c

    if-eqz p4, :cond_b

    iget v4, v0, Lm0/q2;->r:I

    invoke-virtual {v0, v4, v2}, Lm0/q2;->O(ILjava/lang/Object;)V

    goto :goto_6

    :cond_b
    invoke-virtual {v0, v2}, Lm0/q2;->M(Ljava/lang/Object;)V

    :cond_c
    :goto_6
    iget-object v2, v0, Lm0/q2;->b:[I

    invoke-virtual {v0, v2, v3}, Lm0/q2;->G([II)I

    move-result v2

    iput v2, v0, Lm0/q2;->h:I

    iget-object v2, v0, Lm0/q2;->b:[I

    iget v4, v0, Lm0/q2;->r:I

    add-int/2addr v4, v6

    invoke-virtual {v0, v4}, Lm0/q2;->o(I)I

    move-result v4

    invoke-virtual {v0, v2, v4}, Lm0/q2;->f([II)I

    move-result v2

    iput v2, v0, Lm0/q2;->i:I

    iget-object v2, v0, Lm0/q2;->b:[I

    invoke-static {v2, v3}, Ld7/t;->x([II)I

    move-result v2

    iput v2, v0, Lm0/q2;->n:I

    iput v1, v0, Lm0/q2;->t:I

    add-int/lit8 v2, v1, 0x1

    iput v2, v0, Lm0/q2;->r:I

    iget-object v2, v0, Lm0/q2;->b:[I

    invoke-static {v2, v3}, Ld7/t;->s([II)I

    move-result v2

    add-int/2addr v1, v2

    :cond_d
    :goto_7
    iput v1, v0, Lm0/q2;->s:I

    return-void
.end method

.method public final K(I)Lm0/c;
    .locals 3

    const/4 v0, 0x0

    if-ltz p1, :cond_0

    invoke-virtual {p0}, Lm0/q2;->n()I

    move-result v1

    if-ge p1, v1, :cond_0

    iget-object v1, p0, Lm0/q2;->d:Ljava/util/ArrayList;

    invoke-virtual {p0}, Lm0/q2;->n()I

    move-result v2

    invoke-static {v1, p1, v2}, Ld7/t;->q0(Ljava/util/ArrayList;II)I

    move-result p1

    if-ltz p1, :cond_0

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lm0/c;

    :cond_0
    return-object v0
.end method

.method public final L(Ljava/lang/Object;)V
    .locals 4

    iget v0, p0, Lm0/q2;->m:I

    const/4 v1, 0x1

    if-lez v0, :cond_0

    iget v0, p0, Lm0/q2;->t:I

    invoke-virtual {p0, v1, v0}, Lm0/q2;->s(II)V

    :cond_0
    iget-object v0, p0, Lm0/q2;->c:[Ljava/lang/Object;

    iget v2, p0, Lm0/q2;->h:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lm0/q2;->h:I

    invoke-virtual {p0, v2}, Lm0/q2;->g(I)I

    move-result v2

    aget-object v0, v0, v2

    iget v0, p0, Lm0/q2;->h:I

    iget v2, p0, Lm0/q2;->i:I

    if-gt v0, v2, :cond_1

    iget-object v2, p0, Lm0/q2;->c:[Ljava/lang/Object;

    sub-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lm0/q2;->g(I)I

    move-result v0

    aput-object p1, v2, v0

    return-void

    :cond_1
    const-string p1, "Writing to an invalid slot"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lm0/s;->g(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final M(Ljava/lang/Object;)V
    .locals 4

    iget v0, p0, Lm0/q2;->r:I

    invoke-virtual {p0, v0}, Lm0/q2;->o(I)I

    move-result v0

    iget-object v1, p0, Lm0/q2;->b:[I

    invoke-static {v1, v0}, Ld7/t;->t([II)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lm0/q2;->c:[Ljava/lang/Object;

    iget-object v2, p0, Lm0/q2;->b:[I

    invoke-virtual {p0, v2, v0}, Lm0/q2;->f([II)I

    move-result v3

    mul-int/lit8 v0, v0, 0x5

    add-int/lit8 v0, v0, 0x1

    aget v0, v2, v0

    shr-int/lit8 v0, v0, 0x1d

    invoke-static {v0}, Ld7/t;->L(I)I

    move-result v0

    add-int/2addr v0, v3

    invoke-virtual {p0, v0}, Lm0/q2;->g(I)I

    move-result v0

    aput-object p1, v1, v0

    return-void

    :cond_0
    const-string p1, "Updating the data of a group that was not created with a data slot"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lm0/s;->g(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final N(I)V
    .locals 1

    if-ltz p1, :cond_1

    iget-object v0, p0, Lm0/q2;->v:Lm0/s1;

    if-nez v0, :cond_0

    new-instance v0, Lm0/s1;

    invoke-direct {v0}, Lm0/s1;-><init>()V

    iput-object v0, p0, Lm0/q2;->v:Lm0/s1;

    :cond_0
    invoke-virtual {v0, p1}, Lm0/s1;->a(I)V

    :cond_1
    return-void
.end method

.method public final O(ILjava/lang/Object;)V
    .locals 3

    invoke-virtual {p0, p1}, Lm0/q2;->o(I)I

    move-result v0

    iget-object v1, p0, Lm0/q2;->b:[I

    array-length v2, v1

    if-ge v0, v2, :cond_0

    invoke-static {v1, v0}, Ld7/t;->v([II)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object p1, p0, Lm0/q2;->c:[Ljava/lang/Object;

    iget-object v1, p0, Lm0/q2;->b:[I

    invoke-virtual {p0, v1, v0}, Lm0/q2;->f([II)I

    move-result v0

    invoke-virtual {p0, v0}, Lm0/q2;->g(I)I

    move-result v0

    aput-object p2, p1, v0

    return-void

    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Updating the node of a group at "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " that was not created with as a node group"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lm0/s;->g(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final a(I)V
    .locals 2

    if-ltz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_4

    iget v0, p0, Lm0/q2;->m:I

    if-gtz v0, :cond_3

    if-nez p1, :cond_1

    return-void

    :cond_1
    iget v0, p0, Lm0/q2;->r:I

    add-int/2addr v0, p1

    iget p1, p0, Lm0/q2;->t:I

    if-lt v0, p1, :cond_2

    iget p1, p0, Lm0/q2;->s:I

    if-gt v0, p1, :cond_2

    iput v0, p0, Lm0/q2;->r:I

    iget-object p1, p0, Lm0/q2;->b:[I

    invoke-virtual {p0, v0}, Lm0/q2;->o(I)I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lm0/q2;->f([II)I

    move-result p1

    iput p1, p0, Lm0/q2;->h:I

    iput p1, p0, Lm0/q2;->i:I

    return-void

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Cannot seek outside the current group ("

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v0, p0, Lm0/q2;->t:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v0, 0x2d

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v0, p0, Lm0/q2;->s:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v0, 0x29

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lm0/s;->g(Ljava/lang/String;)V

    throw v1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot call seek() while inserting"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    const-string p1, "Cannot seek backwards"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lm0/s;->g(Ljava/lang/String;)V

    throw v1
.end method

.method public final b(I)Lm0/c;
    .locals 4

    iget-object v0, p0, Lm0/q2;->d:Ljava/util/ArrayList;

    invoke-virtual {p0}, Lm0/q2;->n()I

    move-result v1

    invoke-static {v0, p1, v1}, Ld7/t;->q0(Ljava/util/ArrayList;II)I

    move-result v1

    if-gez v1, :cond_1

    new-instance v2, Lm0/c;

    iget v3, p0, Lm0/q2;->f:I

    if-gt p1, v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lm0/q2;->n()I

    move-result v3

    sub-int/2addr v3, p1

    neg-int p1, v3

    :goto_0
    invoke-direct {v2, p1}, Lm0/c;-><init>(I)V

    add-int/lit8 v1, v1, 0x1

    neg-int p1, v1

    invoke-virtual {v0, p1, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Lm0/c;

    :goto_1
    return-object v2
.end method

.method public final c(Lm0/c;)I
    .locals 1

    iget p1, p1, Lm0/c;->a:I

    if-gez p1, :cond_0

    invoke-virtual {p0}, Lm0/q2;->n()I

    move-result v0

    add-int/2addr p1, v0

    :cond_0
    return p1
.end method

.method public final d()V
    .locals 2

    iget v0, p0, Lm0/q2;->m:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lm0/q2;->m:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lm0/q2;->m()I

    move-result v0

    iget v1, p0, Lm0/q2;->g:I

    sub-int/2addr v0, v1

    iget v1, p0, Lm0/q2;->s:I

    sub-int/2addr v0, v1

    iget-object v1, p0, Lm0/q2;->p:Lm0/t0;

    invoke-virtual {v1, v0}, Lm0/t0;->b(I)V

    :cond_0
    return-void
.end method

.method public final e()V
    .locals 8

    const/4 v0, 0x1

    iput-boolean v0, p0, Lm0/q2;->u:Z

    iget-object v0, p0, Lm0/q2;->o:Lm0/t0;

    iget v0, v0, Lm0/t0;->b:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lm0/q2;->n()I

    move-result v0

    invoke-virtual {p0, v0}, Lm0/q2;->v(I)V

    iget-object v0, p0, Lm0/q2;->c:[Ljava/lang/Object;

    array-length v0, v0

    iget v1, p0, Lm0/q2;->k:I

    sub-int/2addr v0, v1

    iget v1, p0, Lm0/q2;->f:I

    invoke-virtual {p0, v0, v1}, Lm0/q2;->w(II)V

    iget v0, p0, Lm0/q2;->j:I

    iget v1, p0, Lm0/q2;->k:I

    add-int/2addr v1, v0

    iget-object v2, p0, Lm0/q2;->c:[Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lb9/b;->O(II[Ljava/lang/Object;)V

    invoke-virtual {p0}, Lm0/q2;->z()V

    :cond_0
    iget-object v0, p0, Lm0/q2;->b:[I

    iget v1, p0, Lm0/q2;->f:I

    iget-object v2, p0, Lm0/q2;->c:[Ljava/lang/Object;

    iget v3, p0, Lm0/q2;->j:I

    iget-object v4, p0, Lm0/q2;->d:Ljava/util/ArrayList;

    iget-object v5, p0, Lm0/q2;->e:Ljava/util/HashMap;

    iget-object v6, p0, Lm0/q2;->a:Lm0/n2;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean v7, v6, Lm0/n2;->f:Z

    if-eqz v7, :cond_1

    const/4 v7, 0x0

    iput-boolean v7, v6, Lm0/n2;->f:Z

    iput-object v0, v6, Lm0/n2;->a:[I

    iput v1, v6, Lm0/n2;->b:I

    iput-object v2, v6, Lm0/n2;->c:[Ljava/lang/Object;

    iput v3, v6, Lm0/n2;->d:I

    iput-object v4, v6, Lm0/n2;->o:Ljava/util/ArrayList;

    iput-object v5, v6, Lm0/n2;->p:Ljava/util/HashMap;

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unexpected writer close()"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final f([II)I
    .locals 1

    invoke-virtual {p0}, Lm0/q2;->m()I

    move-result v0

    if-lt p2, v0, :cond_0

    iget-object p1, p0, Lm0/q2;->c:[Ljava/lang/Object;

    array-length p1, p1

    iget p2, p0, Lm0/q2;->k:I

    sub-int/2addr p1, p2

    goto :goto_0

    :cond_0
    mul-int/lit8 p2, p2, 0x5

    add-int/lit8 p2, p2, 0x4

    aget p1, p1, p2

    iget p2, p0, Lm0/q2;->k:I

    iget-object v0, p0, Lm0/q2;->c:[Ljava/lang/Object;

    array-length v0, v0

    if-gez p1, :cond_1

    sub-int/2addr v0, p2

    add-int/2addr v0, p1

    add-int/lit8 v0, v0, 0x1

    move p1, v0

    :cond_1
    :goto_0
    return p1
.end method

.method public final g(I)I
    .locals 1

    iget v0, p0, Lm0/q2;->j:I

    if-ge p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Lm0/q2;->k:I

    add-int/2addr p1, v0

    :goto_0
    return p1
.end method

.method public final i()V
    .locals 11

    iget v0, p0, Lm0/q2;->m:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-lez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iget v3, p0, Lm0/q2;->r:I

    iget v4, p0, Lm0/q2;->s:I

    iget v5, p0, Lm0/q2;->t:I

    invoke-virtual {p0, v5}, Lm0/q2;->o(I)I

    move-result v6

    iget v7, p0, Lm0/q2;->n:I

    sub-int v8, v3, v5

    iget-object v9, p0, Lm0/q2;->b:[I

    invoke-static {v9, v6}, Ld7/t;->v([II)Z

    move-result v9

    iget-object v10, p0, Lm0/q2;->q:Lm0/t0;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lm0/q2;->b:[I

    invoke-static {v6, v8, v0}, Ld7/t;->A(II[I)V

    iget-object v0, p0, Lm0/q2;->b:[I

    invoke-static {v6, v7, v0}, Ld7/t;->B(II[I)V

    invoke-virtual {v10}, Lm0/t0;->a()I

    move-result v0

    if-eqz v9, :cond_1

    goto :goto_1

    :cond_1
    move v1, v7

    :goto_1
    add-int/2addr v0, v1

    iput v0, p0, Lm0/q2;->n:I

    iget-object v0, p0, Lm0/q2;->b:[I

    invoke-virtual {p0, v0, v5}, Lm0/q2;->y([II)I

    move-result v0

    iput v0, p0, Lm0/q2;->t:I

    goto/16 :goto_5

    :cond_2
    if-ne v3, v4, :cond_c

    iget-object v0, p0, Lm0/q2;->b:[I

    invoke-static {v0, v6}, Ld7/t;->s([II)I

    move-result v0

    iget-object v1, p0, Lm0/q2;->b:[I

    invoke-static {v1, v6}, Ld7/t;->x([II)I

    move-result v1

    iget-object v3, p0, Lm0/q2;->b:[I

    invoke-static {v6, v8, v3}, Ld7/t;->A(II[I)V

    iget-object v3, p0, Lm0/q2;->b:[I

    invoke-static {v6, v7, v3}, Ld7/t;->B(II[I)V

    iget-object v3, p0, Lm0/q2;->o:Lm0/t0;

    invoke-virtual {v3}, Lm0/t0;->a()I

    move-result v3

    invoke-virtual {p0}, Lm0/q2;->m()I

    move-result v4

    iget v6, p0, Lm0/q2;->g:I

    sub-int/2addr v4, v6

    iget-object v6, p0, Lm0/q2;->p:Lm0/t0;

    invoke-virtual {v6}, Lm0/t0;->a()I

    move-result v6

    sub-int/2addr v4, v6

    iput v4, p0, Lm0/q2;->s:I

    iput v3, p0, Lm0/q2;->t:I

    iget-object v4, p0, Lm0/q2;->b:[I

    invoke-virtual {p0, v4, v5}, Lm0/q2;->y([II)I

    move-result v4

    invoke-virtual {v10}, Lm0/t0;->a()I

    move-result v5

    iput v5, p0, Lm0/q2;->n:I

    if-ne v4, v3, :cond_4

    if-eqz v9, :cond_3

    goto :goto_2

    :cond_3
    sub-int v2, v7, v1

    :goto_2
    add-int/2addr v5, v2

    iput v5, p0, Lm0/q2;->n:I

    goto :goto_5

    :cond_4
    sub-int/2addr v8, v0

    if-eqz v9, :cond_5

    move v7, v2

    goto :goto_3

    :cond_5
    sub-int/2addr v7, v1

    :goto_3
    if-nez v8, :cond_6

    if-eqz v7, :cond_b

    :cond_6
    :goto_4
    if-eqz v4, :cond_b

    if-eq v4, v3, :cond_b

    if-nez v7, :cond_7

    if-eqz v8, :cond_b

    :cond_7
    invoke-virtual {p0, v4}, Lm0/q2;->o(I)I

    move-result v0

    if-eqz v8, :cond_8

    iget-object v1, p0, Lm0/q2;->b:[I

    invoke-static {v1, v0}, Ld7/t;->s([II)I

    move-result v1

    add-int/2addr v1, v8

    iget-object v5, p0, Lm0/q2;->b:[I

    invoke-static {v0, v1, v5}, Ld7/t;->A(II[I)V

    :cond_8
    if-eqz v7, :cond_9

    iget-object v1, p0, Lm0/q2;->b:[I

    invoke-static {v1, v0}, Ld7/t;->x([II)I

    move-result v5

    add-int/2addr v5, v7

    invoke-static {v0, v5, v1}, Ld7/t;->B(II[I)V

    :cond_9
    iget-object v1, p0, Lm0/q2;->b:[I

    invoke-static {v1, v0}, Ld7/t;->v([II)Z

    move-result v0

    if-eqz v0, :cond_a

    move v7, v2

    :cond_a
    iget-object v0, p0, Lm0/q2;->b:[I

    invoke-virtual {p0, v0, v4}, Lm0/q2;->y([II)I

    move-result v4

    goto :goto_4

    :cond_b
    iget v0, p0, Lm0/q2;->n:I

    add-int/2addr v0, v7

    iput v0, p0, Lm0/q2;->n:I

    :goto_5
    return-void

    :cond_c
    const-string v0, "Expected to be at the end of a group"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lm0/s;->g(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final j()V
    .locals 2

    iget v0, p0, Lm0/q2;->m:I

    if-lez v0, :cond_2

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lm0/q2;->m:I

    if-nez v0, :cond_1

    iget-object v0, p0, Lm0/q2;->q:Lm0/t0;

    iget v0, v0, Lm0/t0;->b:I

    iget-object v1, p0, Lm0/q2;->o:Lm0/t0;

    iget v1, v1, Lm0/t0;->b:I

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lm0/q2;->m()I

    move-result v0

    iget v1, p0, Lm0/q2;->g:I

    sub-int/2addr v0, v1

    iget-object v1, p0, Lm0/q2;->p:Lm0/t0;

    invoke-virtual {v1}, Lm0/t0;->a()I

    move-result v1

    sub-int/2addr v0, v1

    iput v0, p0, Lm0/q2;->s:I

    goto :goto_0

    :cond_0
    const-string v0, "startGroup/endGroup mismatch while inserting"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lm0/s;->g(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0

    :cond_1
    :goto_0
    return-void

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unbalanced begin/end insert"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final k(I)V
    .locals 4

    iget v0, p0, Lm0/q2;->m:I

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_3

    iget v0, p0, Lm0/q2;->t:I

    if-eq v0, p1, :cond_2

    if-lt p1, v0, :cond_1

    iget v2, p0, Lm0/q2;->s:I

    if-ge p1, v2, :cond_1

    iget v0, p0, Lm0/q2;->r:I

    iget v1, p0, Lm0/q2;->h:I

    iget v2, p0, Lm0/q2;->i:I

    iput p1, p0, Lm0/q2;->r:I

    invoke-virtual {p0}, Lm0/q2;->I()V

    iput v0, p0, Lm0/q2;->r:I

    iput v1, p0, Lm0/q2;->h:I

    iput v2, p0, Lm0/q2;->i:I

    goto :goto_1

    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Started group at "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " must be a subgroup of the group at "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lm0/s;->g(Ljava/lang/String;)V

    throw v1

    :cond_2
    :goto_1
    return-void

    :cond_3
    const-string p1, "Cannot call ensureStarted() while inserting"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lm0/s;->g(Ljava/lang/String;)V

    throw v1
.end method

.method public final l(III)V
    .locals 2

    iget v0, p0, Lm0/q2;->f:I

    if-ge p1, v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lm0/q2;->n()I

    move-result v0

    sub-int/2addr v0, p1

    add-int/lit8 v0, v0, 0x2

    neg-int p1, v0

    :goto_0
    if-ge p3, p2, :cond_1

    iget-object v0, p0, Lm0/q2;->b:[I

    invoke-virtual {p0, p3}, Lm0/q2;->o(I)I

    move-result v1

    mul-int/lit8 v1, v1, 0x5

    add-int/lit8 v1, v1, 0x2

    aput p1, v0, v1

    iget-object v0, p0, Lm0/q2;->b:[I

    invoke-virtual {p0, p3}, Lm0/q2;->o(I)I

    move-result v1

    invoke-static {v0, v1}, Ld7/t;->s([II)I

    move-result v0

    add-int/2addr v0, p3

    add-int/lit8 v1, p3, 0x1

    invoke-virtual {p0, p3, v0, v1}, Lm0/q2;->l(III)V

    move p3, v0

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final m()I
    .locals 1

    iget-object v0, p0, Lm0/q2;->b:[I

    array-length v0, v0

    div-int/lit8 v0, v0, 0x5

    return v0
.end method

.method public final n()I
    .locals 2

    invoke-virtual {p0}, Lm0/q2;->m()I

    move-result v0

    iget v1, p0, Lm0/q2;->g:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public final o(I)I
    .locals 1

    iget v0, p0, Lm0/q2;->f:I

    if-ge p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Lm0/q2;->g:I

    add-int/2addr p1, v0

    :goto_0
    return p1
.end method

.method public final p(I)I
    .locals 1

    iget-object v0, p0, Lm0/q2;->b:[I

    invoke-virtual {p0, p1}, Lm0/q2;->o(I)I

    move-result p1

    invoke-static {v0, p1}, Ld7/t;->s([II)I

    move-result p1

    return p1
.end method

.method public final q(II)Z
    .locals 5

    iget v0, p0, Lm0/q2;->t:I

    const/4 v1, 0x0

    if-ne p2, v0, :cond_0

    iget v0, p0, Lm0/q2;->s:I

    goto :goto_4

    :cond_0
    iget-object v0, p0, Lm0/q2;->o:Lm0/t0;

    iget v2, v0, Lm0/t0;->b:I

    if-lez v2, :cond_1

    iget-object v3, v0, Lm0/t0;->a:[I

    add-int/lit8 v4, v2, -0x1

    aget v3, v3, v4

    goto :goto_0

    :cond_1
    move v3, v1

    :goto_0
    if-le p2, v3, :cond_2

    invoke-virtual {p0, p2}, Lm0/q2;->p(I)I

    move-result v0

    :goto_1
    add-int/2addr v0, p2

    goto :goto_4

    :cond_2
    move v3, v1

    :goto_2
    if-ge v3, v2, :cond_4

    iget-object v4, v0, Lm0/t0;->a:[I

    aget v4, v4, v3

    if-ne v4, p2, :cond_3

    goto :goto_3

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_4
    const/4 v3, -0x1

    :goto_3
    if-gez v3, :cond_5

    invoke-virtual {p0, p2}, Lm0/q2;->p(I)I

    move-result v0

    goto :goto_1

    :cond_5
    invoke-virtual {p0}, Lm0/q2;->m()I

    move-result v0

    iget v2, p0, Lm0/q2;->g:I

    sub-int/2addr v0, v2

    iget-object v2, p0, Lm0/q2;->p:Lm0/t0;

    iget-object v2, v2, Lm0/t0;->a:[I

    aget v2, v2, v3

    sub-int/2addr v0, v2

    :goto_4
    if-le p1, p2, :cond_6

    if-ge p1, v0, :cond_6

    const/4 v1, 0x1

    :cond_6
    return v1
.end method

.method public final r(I)V
    .locals 11

    if-lez p1, :cond_5

    iget v0, p0, Lm0/q2;->r:I

    invoke-virtual {p0, v0}, Lm0/q2;->v(I)V

    iget v1, p0, Lm0/q2;->f:I

    iget v2, p0, Lm0/q2;->g:I

    iget-object v3, p0, Lm0/q2;->b:[I

    array-length v4, v3

    div-int/lit8 v4, v4, 0x5

    sub-int v5, v4, v2

    const/4 v6, 0x0

    if-ge v2, p1, :cond_0

    mul-int/lit8 v7, v4, 0x2

    add-int v8, v5, p1

    invoke-static {v7, v8}, Ljava/lang/Math;->max(II)I

    move-result v7

    const/16 v8, 0x20

    invoke-static {v7, v8}, Ljava/lang/Math;->max(II)I

    move-result v7

    mul-int/lit8 v8, v7, 0x5

    new-array v8, v8, [I

    sub-int/2addr v7, v5

    add-int/2addr v2, v1

    add-int v9, v1, v7

    mul-int/lit8 v10, v1, 0x5

    invoke-static {v6, v6, v10, v3, v8}, Lb9/b;->G(III[I[I)V

    mul-int/lit8 v9, v9, 0x5

    mul-int/lit8 v2, v2, 0x5

    mul-int/lit8 v4, v4, 0x5

    invoke-static {v9, v2, v4, v3, v8}, Lb9/b;->G(III[I[I)V

    iput-object v8, p0, Lm0/q2;->b:[I

    move v2, v7

    :cond_0
    iget v3, p0, Lm0/q2;->s:I

    if-lt v3, v1, :cond_1

    add-int/2addr v3, p1

    iput v3, p0, Lm0/q2;->s:I

    :cond_1
    add-int v3, v1, p1

    iput v3, p0, Lm0/q2;->f:I

    sub-int/2addr v2, p1

    iput v2, p0, Lm0/q2;->g:I

    if-lez v5, :cond_2

    add-int/2addr v0, p1

    iget-object v2, p0, Lm0/q2;->b:[I

    invoke-virtual {p0, v0}, Lm0/q2;->o(I)I

    move-result v0

    invoke-virtual {p0, v2, v0}, Lm0/q2;->f([II)I

    move-result v0

    goto :goto_0

    :cond_2
    move v0, v6

    :goto_0
    iget v2, p0, Lm0/q2;->l:I

    if-ge v2, v1, :cond_3

    goto :goto_1

    :cond_3
    iget v6, p0, Lm0/q2;->j:I

    :goto_1
    iget v2, p0, Lm0/q2;->k:I

    iget-object v4, p0, Lm0/q2;->c:[Ljava/lang/Object;

    array-length v4, v4

    invoke-static {v0, v6, v2, v4}, Lm0/q2;->h(IIII)I

    move-result v0

    move v2, v1

    :goto_2
    if-ge v2, v3, :cond_4

    iget-object v4, p0, Lm0/q2;->b:[I

    mul-int/lit8 v5, v2, 0x5

    add-int/lit8 v5, v5, 0x4

    aput v0, v4, v5

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_4
    iget v0, p0, Lm0/q2;->l:I

    if-lt v0, v1, :cond_5

    add-int/2addr v0, p1

    iput v0, p0, Lm0/q2;->l:I

    :cond_5
    return-void
.end method

.method public final s(II)V
    .locals 9

    if-lez p1, :cond_3

    iget v0, p0, Lm0/q2;->h:I

    invoke-virtual {p0, v0, p2}, Lm0/q2;->w(II)V

    iget p2, p0, Lm0/q2;->j:I

    iget v0, p0, Lm0/q2;->k:I

    if-ge v0, p1, :cond_1

    iget-object v1, p0, Lm0/q2;->c:[Ljava/lang/Object;

    array-length v2, v1

    sub-int v3, v2, v0

    mul-int/lit8 v4, v2, 0x2

    add-int v5, v3, p1

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    const/16 v5, 0x20

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    new-array v5, v4, [Ljava/lang/Object;

    const/4 v6, 0x0

    move v7, v6

    :goto_0
    if-ge v7, v4, :cond_0

    const/4 v8, 0x0

    aput-object v8, v5, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_0
    sub-int/2addr v4, v3

    add-int/2addr v0, p2

    add-int v3, p2, v4

    invoke-static {v6, v6, p2, v1, v5}, Lb9/b;->H(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    invoke-static {v3, v0, v2, v1, v5}, Lb9/b;->H(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    iput-object v5, p0, Lm0/q2;->c:[Ljava/lang/Object;

    move v0, v4

    :cond_1
    iget v1, p0, Lm0/q2;->i:I

    if-lt v1, p2, :cond_2

    add-int/2addr v1, p1

    iput v1, p0, Lm0/q2;->i:I

    :cond_2
    add-int/2addr p2, p1

    iput p2, p0, Lm0/q2;->j:I

    sub-int/2addr v0, p1

    iput v0, p0, Lm0/q2;->k:I

    :cond_3
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SlotWriter(current = "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lm0/q2;->r:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " end="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lm0/q2;->s:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " size = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lm0/q2;->n()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " gap="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lm0/q2;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x2d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v1, p0, Lm0/q2;->f:I

    iget v2, p0, Lm0/q2;->g:I

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(Lm0/n2;I)V
    .locals 10

    const/4 v5, 0x0

    iget v0, p0, Lm0/q2;->m:I

    const/4 v1, 0x0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-static {v0}, Lm0/s;->l(Z)V

    if-nez p2, :cond_1

    iget v0, p0, Lm0/q2;->r:I

    if-nez v0, :cond_1

    iget-object v0, p0, Lm0/q2;->a:Lm0/n2;

    iget v0, v0, Lm0/n2;->b:I

    if-nez v0, :cond_1

    iget-object v0, p1, Lm0/n2;->a:[I

    invoke-static {v0, p2}, Ld7/t;->s([II)I

    move-result v0

    iget v2, p1, Lm0/n2;->b:I

    if-ne v0, v2, :cond_1

    iget-object p2, p0, Lm0/q2;->b:[I

    iget-object v0, p0, Lm0/q2;->c:[Ljava/lang/Object;

    iget-object v3, p0, Lm0/q2;->d:Ljava/util/ArrayList;

    iget-object v4, p0, Lm0/q2;->e:Ljava/util/HashMap;

    iget-object v5, p1, Lm0/n2;->a:[I

    iget-object v6, p1, Lm0/n2;->c:[Ljava/lang/Object;

    iget v7, p1, Lm0/n2;->d:I

    iget-object v8, p1, Lm0/n2;->p:Ljava/util/HashMap;

    iput-object v5, p0, Lm0/q2;->b:[I

    iput-object v6, p0, Lm0/q2;->c:[Ljava/lang/Object;

    iget-object v9, p1, Lm0/n2;->o:Ljava/util/ArrayList;

    iput-object v9, p0, Lm0/q2;->d:Ljava/util/ArrayList;

    iput v2, p0, Lm0/q2;->f:I

    array-length v5, v5

    div-int/lit8 v5, v5, 0x5

    sub-int/2addr v5, v2

    iput v5, p0, Lm0/q2;->g:I

    iput v7, p0, Lm0/q2;->j:I

    array-length v5, v6

    sub-int/2addr v5, v7

    iput v5, p0, Lm0/q2;->k:I

    iput v2, p0, Lm0/q2;->l:I

    iput-object v8, p0, Lm0/q2;->e:Ljava/util/HashMap;

    iput-object p2, p1, Lm0/n2;->a:[I

    iput v1, p1, Lm0/n2;->b:I

    iput-object v0, p1, Lm0/n2;->c:[Ljava/lang/Object;

    iput v1, p1, Lm0/n2;->d:I

    iput-object v3, p1, Lm0/n2;->o:Ljava/util/ArrayList;

    iput-object v4, p1, Lm0/n2;->p:Ljava/util/HashMap;

    return-void

    :cond_1
    invoke-virtual {p1}, Lm0/n2;->k()Lm0/q2;

    move-result-object p1

    const/4 v3, 0x1

    const/4 v4, 0x1

    move-object v0, p1

    move v1, p2

    move-object v2, p0

    :try_start_0
    invoke-static/range {v0 .. v5}, Lk0/y0;->d(Lm0/q2;ILm0/q2;ZZZ)Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1}, Lm0/q2;->e()V

    return-void

    :catchall_0
    move-exception p2

    invoke-virtual {p1}, Lm0/q2;->e()V

    throw p2
.end method

.method public final v(I)V
    .locals 8

    iget v0, p0, Lm0/q2;->g:I

    iget v1, p0, Lm0/q2;->f:I

    if-eq v1, p1, :cond_a

    iget-object v2, p0, Lm0/q2;->d:Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    const/4 v3, 0x1

    xor-int/2addr v2, v3

    if-eqz v2, :cond_1

    iget v2, p0, Lm0/q2;->g:I

    invoke-virtual {p0}, Lm0/q2;->m()I

    move-result v4

    sub-int/2addr v4, v2

    if-ge v1, p1, :cond_0

    iget-object v2, p0, Lm0/q2;->d:Ljava/util/ArrayList;

    invoke-static {v2, v1, v4}, Ld7/t;->w(Ljava/util/ArrayList;II)I

    move-result v2

    :goto_0
    iget-object v5, p0, Lm0/q2;->d:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v2, v5, :cond_1

    iget-object v5, p0, Lm0/q2;->d:Ljava/util/ArrayList;

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lm0/c;

    iget v6, v5, Lm0/c;->a:I

    if-gez v6, :cond_1

    add-int/2addr v6, v4

    if-ge v6, p1, :cond_1

    iput v6, v5, Lm0/c;->a:I

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lm0/q2;->d:Ljava/util/ArrayList;

    invoke-static {v2, p1, v4}, Ld7/t;->w(Ljava/util/ArrayList;II)I

    move-result v2

    :goto_1
    iget-object v5, p0, Lm0/q2;->d:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v2, v5, :cond_1

    iget-object v5, p0, Lm0/q2;->d:Ljava/util/ArrayList;

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lm0/c;

    iget v6, v5, Lm0/c;->a:I

    if-ltz v6, :cond_1

    sub-int v6, v4, v6

    neg-int v6, v6

    iput v6, v5, Lm0/c;->a:I

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    if-lez v0, :cond_3

    iget-object v2, p0, Lm0/q2;->b:[I

    mul-int/lit8 v4, p1, 0x5

    mul-int/lit8 v5, v0, 0x5

    mul-int/lit8 v6, v1, 0x5

    if-ge p1, v1, :cond_2

    add-int/2addr v5, v4

    invoke-static {v5, v4, v6, v2, v2}, Lb9/b;->G(III[I[I)V

    goto :goto_2

    :cond_2
    add-int v7, v6, v5

    add-int/2addr v4, v5

    invoke-static {v6, v7, v4, v2, v2}, Lb9/b;->G(III[I[I)V

    :cond_3
    :goto_2
    if-ge p1, v1, :cond_4

    add-int v1, p1, v0

    :cond_4
    invoke-virtual {p0}, Lm0/q2;->m()I

    move-result v2

    if-ge v1, v2, :cond_5

    goto :goto_3

    :cond_5
    const/4 v3, 0x0

    :goto_3
    invoke-static {v3}, Lm0/s;->l(Z)V

    :cond_6
    :goto_4
    if-ge v1, v2, :cond_a

    iget-object v3, p0, Lm0/q2;->b:[I

    invoke-static {v3, v1}, Ld7/t;->y([II)I

    move-result v3

    const/4 v4, -0x2

    if-le v3, v4, :cond_7

    move v5, v3

    goto :goto_5

    :cond_7
    invoke-virtual {p0}, Lm0/q2;->n()I

    move-result v5

    add-int/2addr v5, v3

    sub-int/2addr v5, v4

    :goto_5
    if-ge v5, p1, :cond_8

    goto :goto_6

    :cond_8
    invoke-virtual {p0}, Lm0/q2;->n()I

    move-result v6

    sub-int/2addr v6, v5

    sub-int/2addr v6, v4

    neg-int v5, v6

    :goto_6
    if-eq v5, v3, :cond_9

    iget-object v3, p0, Lm0/q2;->b:[I

    mul-int/lit8 v4, v1, 0x5

    add-int/lit8 v4, v4, 0x2

    aput v5, v3, v4

    :cond_9
    add-int/lit8 v1, v1, 0x1

    if-ne v1, p1, :cond_6

    add-int/2addr v1, v0

    goto :goto_4

    :cond_a
    iput p1, p0, Lm0/q2;->f:I

    return-void
.end method

.method public final w(II)V
    .locals 8

    iget v0, p0, Lm0/q2;->k:I

    iget v1, p0, Lm0/q2;->j:I

    iget v2, p0, Lm0/q2;->l:I

    if-eq v1, p1, :cond_1

    iget-object v3, p0, Lm0/q2;->c:[Ljava/lang/Object;

    if-ge p1, v1, :cond_0

    add-int v4, p1, v0

    invoke-static {v4, p1, v1, v3, v3}, Lb9/b;->H(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    add-int v4, v1, v0

    add-int v5, p1, v0

    invoke-static {v1, v4, v5, v3, v3}, Lb9/b;->H(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    :cond_1
    :goto_0
    add-int/lit8 p2, p2, 0x1

    invoke-virtual {p0}, Lm0/q2;->n()I

    move-result v1

    invoke-static {p2, v1}, Ljava/lang/Math;->min(II)I

    move-result p2

    if-eq v2, p2, :cond_8

    iget-object v1, p0, Lm0/q2;->c:[Ljava/lang/Object;

    array-length v1, v1

    sub-int/2addr v1, v0

    const/4 v0, 0x0

    if-ge p2, v2, :cond_4

    invoke-virtual {p0, p2}, Lm0/q2;->o(I)I

    move-result v3

    invoke-virtual {p0, v2}, Lm0/q2;->o(I)I

    move-result v2

    iget v4, p0, Lm0/q2;->f:I

    :cond_2
    :goto_1
    if-ge v3, v2, :cond_7

    iget-object v5, p0, Lm0/q2;->b:[I

    mul-int/lit8 v6, v3, 0x5

    add-int/lit8 v6, v6, 0x4

    aget v7, v5, v6

    if-ltz v7, :cond_3

    sub-int v7, v1, v7

    add-int/lit8 v7, v7, 0x1

    neg-int v7, v7

    aput v7, v5, v6

    add-int/lit8 v3, v3, 0x1

    if-ne v3, v4, :cond_2

    iget v5, p0, Lm0/q2;->g:I

    add-int/2addr v3, v5

    goto :goto_1

    :cond_3
    const-string p1, "Unexpected anchor value, expected a positive anchor"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lm0/s;->g(Ljava/lang/String;)V

    throw v0

    :cond_4
    invoke-virtual {p0, v2}, Lm0/q2;->o(I)I

    move-result v2

    invoke-virtual {p0, p2}, Lm0/q2;->o(I)I

    move-result v3

    :cond_5
    :goto_2
    if-ge v2, v3, :cond_7

    iget-object v4, p0, Lm0/q2;->b:[I

    mul-int/lit8 v5, v2, 0x5

    add-int/lit8 v5, v5, 0x4

    aget v6, v4, v5

    if-gez v6, :cond_6

    add-int/2addr v6, v1

    add-int/lit8 v6, v6, 0x1

    aput v6, v4, v5

    add-int/lit8 v2, v2, 0x1

    iget v4, p0, Lm0/q2;->f:I

    if-ne v2, v4, :cond_5

    iget v4, p0, Lm0/q2;->g:I

    add-int/2addr v2, v4

    goto :goto_2

    :cond_6
    const-string p1, "Unexpected anchor value, expected a negative anchor"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lm0/s;->g(Ljava/lang/String;)V

    throw v0

    :cond_7
    iput p2, p0, Lm0/q2;->l:I

    :cond_8
    iput p1, p0, Lm0/q2;->j:I

    return-void
.end method

.method public final x(I)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0, p1}, Lm0/q2;->o(I)I

    move-result p1

    iget-object v0, p0, Lm0/q2;->b:[I

    invoke-static {v0, p1}, Ld7/t;->v([II)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lm0/q2;->c:[Ljava/lang/Object;

    iget-object v1, p0, Lm0/q2;->b:[I

    invoke-virtual {p0, v1, p1}, Lm0/q2;->f([II)I

    move-result p1

    invoke-virtual {p0, p1}, Lm0/q2;->g(I)I

    move-result p1

    aget-object p1, v0, p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final y([II)I
    .locals 1

    invoke-virtual {p0, p2}, Lm0/q2;->o(I)I

    move-result p2

    mul-int/lit8 p2, p2, 0x5

    add-int/lit8 p2, p2, 0x2

    aget p1, p1, p2

    const/4 p2, -0x2

    if-le p1, p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lm0/q2;->n()I

    move-result v0

    add-int/2addr v0, p1

    add-int/lit8 p1, v0, 0x2

    :goto_0
    return p1
.end method

.method public final z()V
    .locals 8

    iget-object v0, p0, Lm0/q2;->v:Lm0/s1;

    if-eqz v0, :cond_4

    :cond_0
    :goto_0
    iget-object v1, v0, Lm0/s1;->a:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    if-eqz v1, :cond_4

    invoke-virtual {v0}, Lm0/s1;->b()I

    move-result v1

    invoke-virtual {p0, v1}, Lm0/q2;->o(I)I

    move-result v3

    add-int/lit8 v4, v1, 0x1

    invoke-virtual {p0, v1}, Lm0/q2;->p(I)I

    move-result v5

    add-int/2addr v5, v1

    :goto_1
    if-ge v4, v5, :cond_2

    iget-object v6, p0, Lm0/q2;->b:[I

    invoke-virtual {p0, v4}, Lm0/q2;->o(I)I

    move-result v7

    mul-int/lit8 v7, v7, 0x5

    add-int/2addr v7, v2

    aget v6, v6, v7

    const/high16 v7, 0xc000000

    and-int/2addr v6, v7

    if-eqz v6, :cond_1

    move v4, v2

    goto :goto_2

    :cond_1
    invoke-virtual {p0, v4}, Lm0/q2;->p(I)I

    move-result v6

    add-int/2addr v4, v6

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    :goto_2
    iget-object v5, p0, Lm0/q2;->b:[I

    invoke-static {v5, v3}, Ld7/t;->q([II)Z

    move-result v5

    if-eq v5, v4, :cond_0

    iget-object v5, p0, Lm0/q2;->b:[I

    mul-int/lit8 v3, v3, 0x5

    add-int/2addr v3, v2

    if-eqz v4, :cond_3

    aget v2, v5, v3

    const/high16 v4, 0x4000000

    or-int/2addr v2, v4

    aput v2, v5, v3

    goto :goto_3

    :cond_3
    aget v2, v5, v3

    const v4, -0x4000001

    and-int/2addr v2, v4

    aput v2, v5, v3

    :goto_3
    invoke-virtual {p0, v5, v1}, Lm0/q2;->y([II)I

    move-result v1

    if-ltz v1, :cond_0

    invoke-virtual {v0, v1}, Lm0/s1;->a(I)V

    goto :goto_0

    :cond_4
    return-void
.end method
