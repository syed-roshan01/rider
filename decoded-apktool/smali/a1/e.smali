.class public final La1/e;
.super Ly0/n;

# interfaces
.implements Lt1/u1;
.implements La1/c;


# instance fields
.field public u:La1/c;

.field public v:La1/c;


# virtual methods
.method public final A0()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, La1/e;->v:La1/c;

    iput-object v0, p0, La1/e;->u:La1/c;

    return-void
.end method

.method public final G0(La1/a;)Z
    .locals 4

    iget-boolean v0, p0, Ly0/n;->t:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, La1/e;->v:La1/c;

    if-nez v0, :cond_3

    sget-object v0, Lu1/s;->p:Lu1/s;

    invoke-virtual {v0, p1}, Lu1/s;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La1/c;

    iput-object v0, p0, La1/e;->v:La1/c;

    new-instance v0, Ld9/q;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v2, Lb/g;

    const/16 v3, 0x11

    invoke-direct {v2, v0, p1, p0, v3}, Lb/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {p0, v2}, Lt1/g;->C(Lt1/u1;Lc9/c;)V

    iget-boolean p1, v0, Ld9/q;->a:Z

    if-nez p1, :cond_1

    iget-object p1, p0, La1/e;->v:La1/c;

    if-eqz p1, :cond_2

    :cond_1
    const/4 v1, 0x1

    :cond_2
    return v1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "DragAndDropTarget self reference must be null at the start of a drag and drop session"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final H0(La1/a;)Z
    .locals 1

    iget-object v0, p0, La1/e;->u:La1/c;

    if-nez v0, :cond_1

    iget-object v0, p0, La1/e;->v:La1/c;

    if-eqz v0, :cond_0

    check-cast v0, La1/e;

    invoke-virtual {v0, p1}, La1/e;->H0(La1/a;)Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    check-cast v0, La1/e;

    invoke-virtual {v0, p1}, La1/e;->H0(La1/a;)Z

    move-result p1

    :goto_0
    return p1
.end method

.method public final I0(La1/a;)V
    .locals 2

    iget-object v0, p0, Ly0/n;->a:Ly0/n;

    iget-boolean v0, v0, Ly0/n;->t:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lq/w;

    const/16 v1, 0x1c

    invoke-direct {v0, p1, v1}, Lq/w;-><init>(Ljava/lang/Object;I)V

    invoke-static {p0, v0}, Lt1/g;->C(Lt1/u1;Lc9/c;)V

    iget-object v0, p0, La1/e;->v:La1/c;

    if-eqz v0, :cond_1

    check-cast v0, La1/e;

    invoke-virtual {v0, p1}, La1/e;->I0(La1/a;)V

    :cond_1
    const/4 p1, 0x0

    iput-object p1, p0, La1/e;->v:La1/c;

    iput-object p1, p0, La1/e;->u:La1/c;

    return-void
.end method

.method public final J0(La1/a;)V
    .locals 1

    iget-object v0, p0, La1/e;->v:La1/c;

    if-nez v0, :cond_0

    iget-object v0, p0, La1/e;->u:La1/c;

    if-eqz v0, :cond_1

    check-cast v0, La1/e;

    invoke-virtual {v0, p1}, La1/e;->J0(La1/a;)V

    goto :goto_0

    :cond_0
    check-cast v0, La1/e;

    invoke-virtual {v0, p1}, La1/e;->J0(La1/a;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final K0(La1/a;)V
    .locals 1

    iget-object v0, p0, La1/e;->v:La1/c;

    if-eqz v0, :cond_0

    check-cast v0, La1/e;

    invoke-virtual {v0, p1}, La1/e;->K0(La1/a;)V

    :cond_0
    iget-object v0, p0, La1/e;->u:La1/c;

    if-eqz v0, :cond_1

    check-cast v0, La1/e;

    invoke-virtual {v0, p1}, La1/e;->K0(La1/a;)V

    :cond_1
    const/4 p1, 0x0

    iput-object p1, p0, La1/e;->u:La1/c;

    return-void
.end method

.method public final L0(La1/a;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, La1/e;->u:La1/c;

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    iget-object v4, v1, La1/a;->a:Landroid/view/DragEvent;

    invoke-virtual {v4}, Landroid/view/DragEvent;->getX()F

    move-result v5

    invoke-virtual {v4}, Landroid/view/DragEvent;->getY()F

    move-result v4

    invoke-static {v5, v4}, Ld9/i;->f(FF)J

    move-result-wide v4

    invoke-static {v2, v4, v5}, Ld9/i;->i(La1/c;J)Z

    move-result v4

    if-ne v4, v3, :cond_0

    move-object v6, v2

    goto/16 :goto_a

    :cond_0
    iget-object v4, v0, Ly0/n;->a:Ly0/n;

    iget-boolean v5, v4, Ly0/n;->t:Z

    if-nez v5, :cond_1

    const/4 v6, 0x0

    goto/16 :goto_a

    :cond_1
    new-instance v7, Ld9/u;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    sget-object v8, La1/d;->a:La1/d;

    new-instance v9, Lb/g;

    const/16 v10, 0x12

    invoke-direct {v9, v7, v0, v1, v10}, Lb/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    if-eqz v5, :cond_17

    new-instance v5, Lo0/i;

    const/16 v10, 0x10

    new-array v11, v10, [Ly0/n;

    invoke-direct {v5, v11}, Lo0/i;-><init>([Ljava/lang/Object;)V

    iget-object v11, v4, Ly0/n;->f:Ly0/n;

    if-nez v11, :cond_2

    invoke-static {v5, v4}, Lt1/g;->b(Lo0/i;Ly0/n;)V

    goto :goto_0

    :cond_2
    invoke-virtual {v5, v11}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_3
    :goto_0
    invoke-virtual {v5}, Lo0/i;->l()Z

    move-result v4

    if-eqz v4, :cond_f

    iget v4, v5, Lo0/i;->c:I

    sub-int/2addr v4, v3

    invoke-virtual {v5, v4}, Lo0/i;->n(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly0/n;

    iget v11, v4, Ly0/n;->d:I

    const/high16 v12, 0x40000

    and-int/2addr v11, v12

    if-eqz v11, :cond_e

    move-object v11, v4

    :goto_1
    if-eqz v11, :cond_e

    iget v13, v11, Ly0/n;->c:I

    and-int/2addr v13, v12

    if-eqz v13, :cond_d

    move-object v13, v11

    const/4 v14, 0x0

    :goto_2
    if-eqz v13, :cond_d

    instance-of v15, v13, Lt1/u1;

    if-eqz v15, :cond_6

    check-cast v13, Lt1/u1;

    invoke-interface {v13}, Lt1/u1;->o()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v8, v15}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_4

    invoke-virtual {v9, v13}, Lb/g;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lt1/t1;

    goto :goto_3

    :cond_4
    sget-object v13, Lt1/t1;->a:Lt1/t1;

    :goto_3
    sget-object v15, Lt1/t1;->c:Lt1/t1;

    if-ne v13, v15, :cond_5

    goto :goto_9

    :cond_5
    sget-object v15, Lt1/t1;->b:Lt1/t1;

    if-eq v13, v15, :cond_3

    goto :goto_8

    :cond_6
    iget v15, v13, Ly0/n;->c:I

    and-int/2addr v15, v12

    if-eqz v15, :cond_c

    instance-of v15, v13, Lt1/o;

    if-eqz v15, :cond_c

    move-object v15, v13

    check-cast v15, Lt1/o;

    iget-object v15, v15, Lt1/o;->v:Ly0/n;

    const/16 v16, 0x0

    move/from16 v6, v16

    :goto_4
    if-eqz v15, :cond_b

    iget v10, v15, Ly0/n;->c:I

    and-int/2addr v10, v12

    if-eqz v10, :cond_7

    add-int/lit8 v6, v6, 0x1

    if-ne v6, v3, :cond_8

    move-object v13, v15

    :cond_7
    const/16 v10, 0x10

    goto :goto_6

    :cond_8
    if-nez v14, :cond_9

    new-instance v14, Lo0/i;

    const/16 v10, 0x10

    new-array v12, v10, [Ly0/n;

    invoke-direct {v14, v12}, Lo0/i;-><init>([Ljava/lang/Object;)V

    goto :goto_5

    :cond_9
    const/16 v10, 0x10

    :goto_5
    if-eqz v13, :cond_a

    invoke-virtual {v14, v13}, Lo0/i;->c(Ljava/lang/Object;)V

    const/4 v13, 0x0

    :cond_a
    invoke-virtual {v14, v15}, Lo0/i;->c(Ljava/lang/Object;)V

    :goto_6
    iget-object v15, v15, Ly0/n;->f:Ly0/n;

    const/high16 v12, 0x40000

    goto :goto_4

    :cond_b
    if-ne v6, v3, :cond_c

    :goto_7
    const/high16 v12, 0x40000

    goto :goto_2

    :cond_c
    :goto_8
    invoke-static {v14}, Lt1/g;->f(Lo0/i;)Ly0/n;

    move-result-object v13

    goto :goto_7

    :cond_d
    iget-object v11, v11, Ly0/n;->f:Ly0/n;

    const/high16 v12, 0x40000

    goto :goto_1

    :cond_e
    invoke-static {v5, v4}, Lt1/g;->b(Lo0/i;Ly0/n;)V

    goto/16 :goto_0

    :cond_f
    :goto_9
    iget-object v3, v7, Ld9/u;->a:Ljava/lang/Object;

    move-object v6, v3

    check-cast v6, La1/c;

    :goto_a
    if-eqz v6, :cond_11

    if-nez v2, :cond_11

    iget-object v2, v0, La1/e;->v:La1/c;

    if-eqz v2, :cond_10

    check-cast v2, La1/e;

    invoke-virtual {v2, v1}, La1/e;->K0(La1/a;)V

    :cond_10
    move-object v2, v6

    check-cast v2, La1/e;

    invoke-virtual {v2, v1}, La1/e;->J0(La1/a;)V

    invoke-virtual {v2, v1}, La1/e;->L0(La1/a;)V

    goto :goto_b

    :cond_11
    if-nez v6, :cond_12

    if-eqz v2, :cond_12

    check-cast v2, La1/e;

    invoke-virtual {v2, v1}, La1/e;->K0(La1/a;)V

    iget-object v2, v0, La1/e;->v:La1/c;

    if-eqz v2, :cond_16

    check-cast v2, La1/e;

    invoke-virtual {v2, v1}, La1/e;->J0(La1/a;)V

    invoke-virtual {v2, v1}, La1/e;->L0(La1/a;)V

    goto :goto_b

    :cond_12
    invoke-static {v6, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_14

    if-eqz v2, :cond_13

    check-cast v2, La1/e;

    invoke-virtual {v2, v1}, La1/e;->K0(La1/a;)V

    :cond_13
    if-eqz v6, :cond_16

    move-object v2, v6

    check-cast v2, La1/e;

    invoke-virtual {v2, v1}, La1/e;->J0(La1/a;)V

    invoke-virtual {v2, v1}, La1/e;->L0(La1/a;)V

    goto :goto_b

    :cond_14
    if-eqz v6, :cond_15

    move-object v2, v6

    check-cast v2, La1/e;

    invoke-virtual {v2, v1}, La1/e;->L0(La1/a;)V

    goto :goto_b

    :cond_15
    iget-object v2, v0, La1/e;->v:La1/c;

    if-eqz v2, :cond_16

    check-cast v2, La1/e;

    invoke-virtual {v2, v1}, La1/e;->L0(La1/a;)V

    :cond_16
    :goto_b
    iput-object v6, v0, La1/e;->u:La1/c;

    return-void

    :cond_17
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "visitSubtreeIf called on an unattached node"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final M0(La1/a;)V
    .locals 1

    iget-object v0, p0, La1/e;->v:La1/c;

    if-nez v0, :cond_0

    iget-object v0, p0, La1/e;->u:La1/c;

    if-eqz v0, :cond_1

    check-cast v0, La1/e;

    invoke-virtual {v0, p1}, La1/e;->M0(La1/a;)V

    goto :goto_0

    :cond_0
    check-cast v0, La1/e;

    invoke-virtual {v0, p1}, La1/e;->M0(La1/a;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final o()Ljava/lang/Object;
    .locals 1

    sget-object v0, La1/d;->a:La1/d;

    return-object v0
.end method
