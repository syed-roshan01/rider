.class public final Ly/s;
.super Ljava/lang/Object;

# interfaces
.implements Lr1/j0;


# instance fields
.field public final a:Ly0/d;

.field public final b:Z


# direct methods
.method public constructor <init>(Ly0/g;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly/s;->a:Ly0/d;

    iput-boolean p2, p0, Ly/s;->b:Z

    return-void
.end method


# virtual methods
.method public final e(Lr1/l0;Ljava/util/List;J)Lr1/k0;
    .locals 18

    move-object/from16 v8, p1

    move-object/from16 v2, p2

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    sget-object v9, Lr8/s;->a:Lr8/s;

    if-eqz v0, :cond_0

    invoke-static/range {p3 .. p4}, Lm2/a;->k(J)I

    move-result v0

    invoke-static/range {p3 .. p4}, Lm2/a;->j(J)I

    move-result v1

    sget-object v2, Ly/n;->c:Ly/n;

    invoke-interface {v8, v0, v1, v9, v2}, Lr1/l0;->N(IILjava/util/Map;Lc9/c;)Lr1/k0;

    move-result-object v0

    return-object v0

    :cond_0
    move-object/from16 v10, p0

    iget-boolean v0, v10, Ly/s;->b:Z

    if-eqz v0, :cond_1

    move-wide/from16 v0, p3

    goto :goto_0

    :cond_1
    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0xa

    move-wide/from16 v11, p3

    invoke-static/range {v11 .. v17}, Lm2/a;->b(JIIIII)J

    move-result-wide v0

    :goto_0
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v3

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-ne v3, v5, :cond_5

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr1/i0;

    invoke-interface {v2}, Lr1/p;->a()Ljava/lang/Object;

    move-result-object v3

    instance-of v5, v3, Ly/l;

    if-eqz v5, :cond_2

    move-object v4, v3

    check-cast v4, Ly/l;

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    :goto_1
    if-eqz v4, :cond_4

    iget-boolean v3, v4, Ly/l;->v:Z

    if-nez v3, :cond_3

    goto :goto_2

    :cond_3
    invoke-static/range {p3 .. p4}, Lm2/a;->k(J)I

    move-result v0

    invoke-static/range {p3 .. p4}, Lm2/a;->j(J)I

    move-result v1

    invoke-static/range {p3 .. p4}, Lm2/a;->k(J)I

    move-result v3

    invoke-static/range {p3 .. p4}, Lm2/a;->j(J)I

    move-result v4

    invoke-static {v3, v4}, Ll2/l;->d(II)J

    move-result-wide v3

    invoke-interface {v2, v3, v4}, Lr1/i0;->f(J)Lr1/x0;

    move-result-object v3

    move v7, v0

    move v11, v1

    move-object v1, v3

    goto :goto_3

    :cond_4
    :goto_2
    invoke-interface {v2, v0, v1}, Lr1/i0;->f(J)Lr1/x0;

    move-result-object v0

    invoke-static/range {p3 .. p4}, Lm2/a;->k(J)I

    move-result v1

    iget v3, v0, Lr1/x0;->a:I

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static/range {p3 .. p4}, Lm2/a;->j(J)I

    move-result v3

    iget v4, v0, Lr1/x0;->b:I

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    move v7, v1

    move v11, v3

    move-object v1, v0

    :goto_3
    new-instance v12, Ly/q;

    move-object v0, v12

    move-object/from16 v3, p1

    move v4, v7

    move v5, v11

    move-object/from16 v6, p0

    invoke-direct/range {v0 .. v6}, Ly/q;-><init>(Lr1/x0;Lr1/i0;Lr1/l0;IILy/s;)V

    invoke-interface {v8, v7, v11, v9, v12}, Lr1/l0;->N(IILjava/util/Map;Lc9/c;)Lr1/k0;

    move-result-object v0

    return-object v0

    :cond_5
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v3

    new-array v3, v3, [Lr1/x0;

    new-instance v7, Ld9/s;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    invoke-static/range {p3 .. p4}, Lm2/a;->k(J)I

    move-result v11

    iput v11, v7, Ld9/s;->a:I

    new-instance v11, Ld9/s;

    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    invoke-static/range {p3 .. p4}, Lm2/a;->j(J)I

    move-result v12

    iput v12, v11, Ld9/s;->a:I

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v12

    move v13, v6

    move v14, v13

    :goto_4
    if-ge v13, v12, :cond_9

    invoke-interface {v2, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lr1/i0;

    invoke-interface {v15}, Lr1/p;->a()Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ly/l;

    if-eqz v5, :cond_6

    check-cast v4, Ly/l;

    goto :goto_5

    :cond_6
    const/4 v4, 0x0

    :goto_5
    if-eqz v4, :cond_8

    iget-boolean v4, v4, Ly/l;->v:Z

    if-nez v4, :cond_7

    goto :goto_6

    :cond_7
    const/4 v14, 0x1

    goto :goto_7

    :cond_8
    :goto_6
    invoke-interface {v15, v0, v1}, Lr1/i0;->f(J)Lr1/x0;

    move-result-object v4

    aput-object v4, v3, v13

    iget v5, v7, Ld9/s;->a:I

    iget v15, v4, Lr1/x0;->a:I

    invoke-static {v5, v15}, Ljava/lang/Math;->max(II)I

    move-result v5

    iput v5, v7, Ld9/s;->a:I

    iget v5, v11, Ld9/s;->a:I

    iget v4, v4, Lr1/x0;->b:I

    invoke-static {v5, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    iput v4, v11, Ld9/s;->a:I

    :goto_7
    add-int/lit8 v13, v13, 0x1

    const/4 v5, 0x1

    goto :goto_4

    :cond_9
    if-eqz v14, :cond_e

    iget v0, v7, Ld9/s;->a:I

    const v1, 0x7fffffff

    if-eq v0, v1, :cond_a

    move v4, v0

    goto :goto_8

    :cond_a
    move v4, v6

    :goto_8
    iget v5, v11, Ld9/s;->a:I

    if-eq v5, v1, :cond_b

    move v1, v5

    goto :goto_9

    :cond_b
    move v1, v6

    :goto_9
    invoke-static {v4, v0, v1, v5}, Lo1/s;->a(IIII)J

    move-result-wide v0

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v4

    :goto_a
    if-ge v6, v4, :cond_e

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lr1/i0;

    invoke-interface {v5}, Lr1/p;->a()Ljava/lang/Object;

    move-result-object v12

    instance-of v13, v12, Ly/l;

    if-eqz v13, :cond_c

    check-cast v12, Ly/l;

    goto :goto_b

    :cond_c
    const/4 v12, 0x0

    :goto_b
    if-eqz v12, :cond_d

    iget-boolean v12, v12, Ly/l;->v:Z

    if-eqz v12, :cond_d

    invoke-interface {v5, v0, v1}, Lr1/i0;->f(J)Lr1/x0;

    move-result-object v5

    aput-object v5, v3, v6

    :cond_d
    add-int/lit8 v6, v6, 0x1

    goto :goto_a

    :cond_e
    iget v12, v7, Ld9/s;->a:I

    iget v13, v11, Ld9/s;->a:I

    new-instance v14, Ly/r;

    const/4 v15, 0x0

    move-object v0, v14

    move-object v1, v3

    move-object/from16 v2, p2

    move-object/from16 v3, p1

    move-object v4, v7

    move-object v5, v11

    move-object/from16 v6, p0

    move v7, v15

    invoke-direct/range {v0 .. v7}, Ly/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-interface {v8, v12, v13, v9, v14}, Lr1/l0;->N(IILjava/util/Map;Lc9/c;)Lr1/k0;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ly/s;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ly/s;

    iget-object v1, p1, Ly/s;->a:Ly0/d;

    iget-object v3, p0, Ly/s;->a:Ly0/d;

    invoke-static {v3, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Ly/s;->b:Z

    iget-boolean p1, p1, Ly/s;->b:Z

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Ly/s;->a:Ly0/d;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Ly/s;->b:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "BoxMeasurePolicy(alignment="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ly/s;->a:Ly0/d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", propagateMinConstraints="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ly/s;->b:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
