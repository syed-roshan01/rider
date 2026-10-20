.class public final Lg0/j;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lg0/k;


# direct methods
.method public synthetic constructor <init>(Lg0/k;I)V
    .locals 0

    iput p2, p0, Lg0/j;->a:I

    iput-object p1, p0, Lg0/j;->b:Lg0/k;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 33

    move-object/from16 v0, p0

    const/4 v1, 0x0

    iget v2, v0, Lg0/j;->a:I

    const/4 v3, 0x0

    iget-object v4, v0, Lg0/j;->b:Lg0/k;

    packed-switch v2, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v4}, Lg0/k;->I0()Lg0/i;

    move-result-object v2

    if-nez v2, :cond_0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_1

    :cond_0
    invoke-virtual {v4}, Lg0/k;->I0()Lg0/i;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    iput-boolean v1, v2, Lg0/i;->c:Z

    :goto_0
    invoke-static {v4}, Lt1/g;->u(Lt1/r1;)V

    invoke-static {v4}, Lt1/g;->t(Lt1/b0;)V

    invoke-static {v4}, Lt1/g;->s(Lt1/s;)V

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :goto_1
    return-object v1

    :pswitch_0
    move-object/from16 v2, p1

    check-cast v2, La2/e;

    iget-object v6, v2, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v4}, Lg0/k;->I0()Lg0/i;

    move-result-object v2

    if-eqz v2, :cond_3

    iget-object v5, v2, Lg0/i;->b:Ljava/lang/String;

    invoke-static {v6, v5}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_2

    :cond_2
    iput-object v6, v2, Lg0/i;->b:Ljava/lang/String;

    iget-object v2, v2, Lg0/i;->d:Lg0/e;

    if-eqz v2, :cond_4

    iget-object v5, v4, Lg0/k;->v:La2/c0;

    iget-object v7, v4, Lg0/k;->w:Lf2/d;

    iget v8, v4, Lg0/k;->x:I

    iget-boolean v9, v4, Lg0/k;->y:Z

    iget v10, v4, Lg0/k;->z:I

    iget v11, v4, Lg0/k;->A:I

    iput-object v6, v2, Lg0/e;->a:Ljava/lang/String;

    iput-object v5, v2, Lg0/e;->b:La2/c0;

    iput-object v7, v2, Lg0/e;->c:Lf2/d;

    iput v8, v2, Lg0/e;->d:I

    iput-boolean v9, v2, Lg0/e;->e:Z

    iput v10, v2, Lg0/e;->f:I

    iput v11, v2, Lg0/e;->g:I

    iput-object v3, v2, Lg0/e;->j:La2/a;

    iput-object v3, v2, Lg0/e;->n:La2/o;

    iput-object v3, v2, Lg0/e;->o:Lm2/l;

    const/4 v3, -0x1

    iput v3, v2, Lg0/e;->q:I

    iput v3, v2, Lg0/e;->r:I

    invoke-static {v1, v1}, Ll2/l;->d(II)J

    move-result-wide v5

    iput-wide v5, v2, Lg0/e;->p:J

    invoke-static {v1, v1}, Lo1/s;->e(II)J

    move-result-wide v5

    iput-wide v5, v2, Lg0/e;->l:J

    iput-boolean v1, v2, Lg0/e;->k:Z

    sget-object v3, Lq8/l;->a:Lq8/l;

    goto :goto_2

    :cond_3
    new-instance v1, Lg0/i;

    iget-object v2, v4, Lg0/k;->u:Ljava/lang/String;

    invoke-direct {v1, v2, v6}, Lg0/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Lg0/e;

    iget-object v7, v4, Lg0/k;->v:La2/c0;

    iget-object v8, v4, Lg0/k;->w:Lf2/d;

    iget v9, v4, Lg0/k;->x:I

    iget-boolean v10, v4, Lg0/k;->y:Z

    iget v11, v4, Lg0/k;->z:I

    iget v12, v4, Lg0/k;->A:I

    move-object v5, v2

    invoke-direct/range {v5 .. v12}, Lg0/e;-><init>(Ljava/lang/String;La2/c0;Lf2/d;IZII)V

    invoke-virtual {v4}, Lg0/k;->G0()Lg0/e;

    move-result-object v3

    iget-object v3, v3, Lg0/e;->i:Lm2/b;

    invoke-virtual {v2, v3}, Lg0/e;->c(Lm2/b;)V

    iput-object v2, v1, Lg0/i;->d:Lg0/e;

    iget-object v2, v4, Lg0/k;->E:Lm0/n1;

    invoke-virtual {v2, v1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    :cond_4
    :goto_2
    invoke-static {v4}, Lt1/g;->u(Lt1/r1;)V

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v1

    :pswitch_1
    move-object/from16 v2, p1

    check-cast v2, Ljava/util/List;

    invoke-virtual {v4}, Lg0/k;->G0()Lg0/e;

    move-result-object v5

    iget-object v4, v4, Lg0/k;->v:La2/c0;

    sget-wide v8, Le1/r;->g:J

    const-wide/16 v10, 0x0

    const/16 v19, 0x0

    const/16 v18, 0x0

    const/16 v17, 0x0

    const-wide/16 v12, 0x0

    const/16 v20, 0x0

    const/4 v6, 0x0

    const-wide/16 v14, 0x0

    const v7, 0xfffffe

    move-object/from16 v16, v4

    invoke-static/range {v6 .. v20}, La2/c0;->e(IIJJJJLa2/c0;Lf2/e;Lf2/j;Lf2/l;Ll2/j;)La2/c0;

    move-result-object v4

    iget-object v6, v5, Lg0/e;->o:Lm2/l;

    if-nez v6, :cond_5

    :goto_3
    move-object v9, v3

    goto/16 :goto_4

    :cond_5
    iget-object v7, v5, Lg0/e;->i:Lm2/b;

    if-nez v7, :cond_6

    goto :goto_3

    :cond_6
    new-instance v8, La2/e;

    iget-object v9, v5, Lg0/e;->a:Ljava/lang/String;

    const/4 v10, 0x6

    invoke-direct {v8, v9, v3, v10}, La2/e;-><init>(Ljava/lang/String;Ljava/util/ArrayList;I)V

    iget-object v9, v5, Lg0/e;->j:La2/a;

    if-nez v9, :cond_7

    goto :goto_3

    :cond_7
    iget-object v9, v5, Lg0/e;->n:La2/o;

    if-nez v9, :cond_8

    goto :goto_3

    :cond_8
    iget-wide v10, v5, Lg0/e;->p:J

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0xa

    invoke-static/range {v10 .. v16}, Lm2/a;->b(JIIIII)J

    move-result-wide v19

    new-instance v9, La2/a0;

    new-instance v10, La2/z;

    sget-object v11, Lr8/r;->a:Lr8/r;

    iget v12, v5, Lg0/e;->f:I

    iget-boolean v13, v5, Lg0/e;->e:Z

    iget v14, v5, Lg0/e;->d:I

    iget-object v15, v5, Lg0/e;->c:Lf2/d;

    move-object/from16 v21, v10

    move-object/from16 v22, v8

    move-object/from16 v23, v4

    move-object/from16 v24, v11

    move/from16 v25, v12

    move/from16 v26, v13

    move/from16 v27, v14

    move-object/from16 v28, v7

    move-object/from16 v29, v6

    move-object/from16 v30, v15

    move-wide/from16 v31, v19

    invoke-direct/range {v21 .. v32}, La2/z;-><init>(La2/e;La2/c0;Ljava/util/List;IZILm2/b;Lm2/l;Lf2/d;J)V

    new-instance v6, La2/i;

    new-instance v18, La2/k;

    move-object/from16 v21, v18

    move-object/from16 v25, v7

    move-object/from16 v26, v15

    invoke-direct/range {v21 .. v26}, La2/k;-><init>(La2/e;La2/c0;Ljava/util/List;Lm2/b;Lf2/d;)V

    iget v4, v5, Lg0/e;->f:I

    iget v7, v5, Lg0/e;->d:I

    const/4 v8, 0x2

    invoke-static {v7, v8}, Lh6/g;->T(II)Z

    move-result v22

    move-object/from16 v17, v6

    move/from16 v21, v4

    invoke-direct/range {v17 .. v22}, La2/i;-><init>(La2/k;JIZ)V

    iget-wide v4, v5, Lg0/e;->l:J

    invoke-direct {v9, v10, v6, v4, v5}, La2/a0;-><init>(La2/z;La2/i;J)V

    :goto_4
    if-eqz v9, :cond_9

    invoke-interface {v2, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object v3, v9

    :cond_9
    if-eqz v3, :cond_a

    const/4 v1, 0x1

    :cond_a
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
