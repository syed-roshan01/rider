.class public final Lg0/g;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lg0/h;


# direct methods
.method public synthetic constructor <init>(Lg0/h;I)V
    .locals 0

    iput p2, p0, Lg0/g;->a:I

    iput-object p1, p0, Lg0/g;->b:Lg0/h;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v0, p0

    iget v1, v0, Lg0/g;->a:I

    const/4 v2, 0x0

    iget-object v3, v0, Lg0/g;->b:Lg0/h;

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v3}, Lg0/h;->J0()Lg0/f;

    move-result-object v2

    if-nez v2, :cond_0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_1

    :cond_0
    invoke-virtual {v3}, Lg0/h;->J0()Lg0/f;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    iput-boolean v1, v2, Lg0/f;->c:Z

    :goto_0
    invoke-static {v3}, Lt1/g;->u(Lt1/r1;)V

    invoke-static {v3}, Lt1/g;->t(Lt1/b0;)V

    invoke-static {v3}, Lt1/g;->s(Lt1/s;)V

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :goto_1
    return-object v1

    :pswitch_0
    move-object/from16 v5, p1

    check-cast v5, La2/e;

    invoke-virtual {v3}, Lg0/h;->J0()Lg0/f;

    move-result-object v1

    if-eqz v1, :cond_3

    iget-object v4, v1, Lg0/f;->b:La2/e;

    invoke-static {v5, v4}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_2

    :cond_2
    iput-object v5, v1, Lg0/f;->b:La2/e;

    iget-object v1, v1, Lg0/f;->d:Lg0/d;

    if-eqz v1, :cond_4

    iget-object v4, v3, Lg0/h;->v:La2/c0;

    iget-object v6, v3, Lg0/h;->w:Lf2/d;

    iget v7, v3, Lg0/h;->y:I

    iget-boolean v8, v3, Lg0/h;->z:Z

    iget v9, v3, Lg0/h;->A:I

    iget v10, v3, Lg0/h;->B:I

    iget-object v11, v3, Lg0/h;->C:Ljava/util/List;

    iput-object v5, v1, Lg0/d;->a:La2/e;

    iput-object v4, v1, Lg0/d;->b:La2/c0;

    iput-object v6, v1, Lg0/d;->c:Lf2/d;

    iput v7, v1, Lg0/d;->d:I

    iput-boolean v8, v1, Lg0/d;->e:Z

    iput v9, v1, Lg0/d;->f:I

    iput v10, v1, Lg0/d;->g:I

    iput-object v11, v1, Lg0/d;->h:Ljava/util/List;

    iput-object v2, v1, Lg0/d;->l:La2/k;

    iput-object v2, v1, Lg0/d;->n:La2/a0;

    const/4 v2, -0x1

    iput v2, v1, Lg0/d;->p:I

    iput v2, v1, Lg0/d;->o:I

    sget-object v2, Lq8/l;->a:Lq8/l;

    goto :goto_2

    :cond_3
    new-instance v1, Lg0/f;

    iget-object v2, v3, Lg0/h;->u:La2/e;

    invoke-direct {v1, v2, v5}, Lg0/f;-><init>(La2/e;La2/e;)V

    new-instance v2, Lg0/d;

    iget-object v6, v3, Lg0/h;->v:La2/c0;

    iget-object v7, v3, Lg0/h;->w:Lf2/d;

    iget v8, v3, Lg0/h;->y:I

    iget-boolean v9, v3, Lg0/h;->z:Z

    iget v10, v3, Lg0/h;->A:I

    iget v11, v3, Lg0/h;->B:I

    iget-object v12, v3, Lg0/h;->C:Ljava/util/List;

    move-object v4, v2

    invoke-direct/range {v4 .. v12}, Lg0/d;-><init>(La2/e;La2/c0;Lf2/d;IZIILjava/util/List;)V

    invoke-virtual {v3}, Lg0/h;->H0()Lg0/d;

    move-result-object v4

    iget-object v4, v4, Lg0/d;->k:Lm2/b;

    invoke-virtual {v2, v4}, Lg0/d;->c(Lm2/b;)V

    iput-object v2, v1, Lg0/f;->d:Lg0/d;

    iget-object v2, v3, Lg0/h;->H:Lm0/n1;

    invoke-virtual {v2, v1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    :cond_4
    :goto_2
    invoke-static {v3}, Lt1/g;->u(Lt1/r1;)V

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v1

    :pswitch_1
    move-object/from16 v1, p1

    check-cast v1, Ljava/util/List;

    invoke-virtual {v3}, Lg0/h;->H0()Lg0/d;

    move-result-object v4

    iget-object v4, v4, Lg0/d;->n:La2/a0;

    if-eqz v4, :cond_5

    new-instance v2, La2/z;

    iget-object v5, v4, La2/a0;->a:La2/z;

    iget-object v6, v5, La2/z;->a:La2/e;

    iget-object v3, v3, Lg0/h;->v:La2/c0;

    sget-wide v9, Le1/r;->g:J

    const-wide/16 v11, 0x0

    const/16 v20, 0x0

    const/16 v19, 0x0

    const/16 v18, 0x0

    const-wide/16 v13, 0x0

    const/16 v21, 0x0

    const/4 v7, 0x0

    const-wide/16 v15, 0x0

    const v8, 0xfffffe

    move-object/from16 v17, v3

    invoke-static/range {v7 .. v21}, La2/c0;->e(IIJJJJLa2/c0;Lf2/e;Lf2/j;Lf2/l;Ll2/j;)La2/c0;

    move-result-object v7

    iget-object v8, v5, La2/z;->c:Ljava/util/List;

    iget v9, v5, La2/z;->d:I

    iget-boolean v10, v5, La2/z;->e:Z

    iget v11, v5, La2/z;->f:I

    iget-object v12, v5, La2/z;->g:Lm2/b;

    iget-object v13, v5, La2/z;->h:Lm2/l;

    iget-object v14, v5, La2/z;->i:Lf2/d;

    move-object/from16 p1, v1

    iget-wide v0, v5, La2/z;->j:J

    move-object v5, v2

    move-wide v15, v0

    invoke-direct/range {v5 .. v16}, La2/z;-><init>(La2/e;La2/c0;Ljava/util/List;IZILm2/b;Lm2/l;Lf2/d;J)V

    new-instance v0, La2/a0;

    iget-object v1, v4, La2/a0;->b:La2/i;

    iget-wide v3, v4, La2/a0;->c:J

    invoke-direct {v0, v2, v1, v3, v4}, La2/a0;-><init>(La2/z;La2/i;J)V

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object v2, v0

    :cond_5
    if-eqz v2, :cond_6

    const/4 v0, 0x1

    goto :goto_3

    :cond_6
    const/4 v0, 0x0

    :goto_3
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
