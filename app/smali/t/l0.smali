.class public final Lt/l0;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lt/l0;->a:I

    iput-object p1, p0, Lt/l0;->b:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Boolean;
    .locals 12

    iget v0, p0, Lt/l0;->a:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    iget-object v4, p0, Lt/l0;->b:Ljava/lang/Object;

    sparse-switch v0, :sswitch_data_0

    check-cast v4, Lh0/m;

    invoke-interface {v4}, Lh0/m;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Ld9/i;->u(J)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :sswitch_0
    check-cast v4, Lg0/k;

    iget-object v0, v4, Lg0/k;->E:Lm0/n1;

    invoke-virtual {v0, v2}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    invoke-static {v4}, Lt1/g;->u(Lt1/r1;)V

    invoke-static {v4}, Lt1/g;->t(Lt1/b0;)V

    invoke-static {v4}, Lt1/g;->s(Lt1/s;)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :sswitch_1
    check-cast v4, Lg0/h;

    iget-object v0, v4, Lg0/h;->H:Lm0/n1;

    invoke-virtual {v0, v2}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    invoke-static {v4}, Lt1/g;->u(Lt1/r1;)V

    invoke-static {v4}, Lt1/g;->t(Lt1/b0;)V

    invoke-static {v4}, Lt1/g;->s(Lt1/s;)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :sswitch_2
    check-cast v4, Lv/u1;

    iget-object v0, v4, Lv/u1;->w:Lv/l2;

    iget-object v2, v0, Lv/l2;->a:Lv/f2;

    invoke-interface {v2}, Lv/f2;->b()Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, v0, Lv/l2;->g:Lm0/n1;

    invoke-virtual {v2}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v0, v0, Lv/l2;->c:Lu/b2;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lu/b2;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    move v1, v3

    :cond_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :sswitch_3
    check-cast v4, Lv/j;

    iget-object v0, v4, Lv/j;->z:Lc9/a;

    invoke-interface {v0}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    return-object v0

    :sswitch_4
    check-cast v4, Lu/t0;

    iget-object v0, v4, Ly0/n;->a:Ly0/n;

    move-object v5, v2

    :goto_0
    sget-object v6, Lc1/g;->e:Lc1/g;

    const/4 v7, 0x7

    const/16 v8, 0x10

    if-eqz v0, :cond_a

    instance-of v9, v0, Lc1/p;

    if-eqz v9, :cond_3

    check-cast v0, Lc1/p;

    invoke-virtual {v0}, Lc1/p;->G0()Lc1/i;

    move-result-object v1

    iget-boolean v1, v1, Lc1/i;->a:Z

    if-eqz v1, :cond_2

    :goto_1
    invoke-static {v0}, Landroidx/compose/ui/focus/a;->C(Lc1/p;)Z

    move-result v0

    :goto_2
    move v1, v0

    goto/16 :goto_a

    :cond_2
    invoke-static {v0, v7, v6}, Landroidx/compose/ui/focus/a;->h(Lc1/p;ILc9/c;)Z

    move-result v0

    goto :goto_2

    :cond_3
    iget v6, v0, Ly0/n;->c:I

    and-int/lit16 v6, v6, 0x400

    if-eqz v6, :cond_9

    instance-of v6, v0, Lt1/o;

    if-eqz v6, :cond_9

    move-object v6, v0

    check-cast v6, Lt1/o;

    iget-object v6, v6, Lt1/o;->v:Ly0/n;

    move v7, v1

    :goto_3
    if-eqz v6, :cond_8

    iget v9, v6, Ly0/n;->c:I

    and-int/lit16 v9, v9, 0x400

    if-eqz v9, :cond_7

    add-int/lit8 v7, v7, 0x1

    if-ne v7, v3, :cond_4

    move-object v0, v6

    goto :goto_4

    :cond_4
    if-nez v5, :cond_5

    new-instance v5, Lo0/i;

    new-array v9, v8, [Ly0/n;

    invoke-direct {v5, v9}, Lo0/i;-><init>([Ljava/lang/Object;)V

    :cond_5
    if-eqz v0, :cond_6

    invoke-virtual {v5, v0}, Lo0/i;->c(Ljava/lang/Object;)V

    move-object v0, v2

    :cond_6
    invoke-virtual {v5, v6}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_7
    :goto_4
    iget-object v6, v6, Ly0/n;->f:Ly0/n;

    goto :goto_3

    :cond_8
    if-ne v7, v3, :cond_9

    goto :goto_0

    :cond_9
    invoke-static {v5}, Lt1/g;->f(Lo0/i;)Ly0/n;

    move-result-object v0

    goto :goto_0

    :cond_a
    iget-object v0, v4, Ly0/n;->a:Ly0/n;

    iget-boolean v4, v0, Ly0/n;->t:Z

    if-eqz v4, :cond_17

    new-instance v4, Lo0/i;

    new-array v5, v8, [Ly0/n;

    invoke-direct {v4, v5}, Lo0/i;-><init>([Ljava/lang/Object;)V

    iget-object v5, v0, Ly0/n;->f:Ly0/n;

    if-nez v5, :cond_b

    invoke-static {v4, v0}, Lt1/g;->b(Lo0/i;Ly0/n;)V

    goto :goto_5

    :cond_b
    invoke-virtual {v4, v5}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_c
    :goto_5
    invoke-virtual {v4}, Lo0/i;->l()Z

    move-result v0

    if-eqz v0, :cond_16

    iget v0, v4, Lo0/i;->c:I

    sub-int/2addr v0, v3

    invoke-virtual {v4, v0}, Lo0/i;->n(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly0/n;

    iget v5, v0, Ly0/n;->d:I

    and-int/lit16 v5, v5, 0x400

    if-nez v5, :cond_d

    invoke-static {v4, v0}, Lt1/g;->b(Lo0/i;Ly0/n;)V

    goto :goto_5

    :cond_d
    :goto_6
    if-eqz v0, :cond_c

    iget v5, v0, Ly0/n;->c:I

    and-int/lit16 v5, v5, 0x400

    if-eqz v5, :cond_15

    move-object v5, v2

    :goto_7
    if-eqz v0, :cond_c

    instance-of v9, v0, Lc1/p;

    if-eqz v9, :cond_e

    check-cast v0, Lc1/p;

    invoke-virtual {v0}, Lc1/p;->G0()Lc1/i;

    move-result-object v1

    iget-boolean v1, v1, Lc1/i;->a:Z

    if-eqz v1, :cond_2

    goto/16 :goto_1

    :cond_e
    iget v9, v0, Ly0/n;->c:I

    and-int/lit16 v9, v9, 0x400

    if-eqz v9, :cond_14

    instance-of v9, v0, Lt1/o;

    if-eqz v9, :cond_14

    move-object v9, v0

    check-cast v9, Lt1/o;

    iget-object v9, v9, Lt1/o;->v:Ly0/n;

    move v10, v1

    :goto_8
    if-eqz v9, :cond_13

    iget v11, v9, Ly0/n;->c:I

    and-int/lit16 v11, v11, 0x400

    if-eqz v11, :cond_12

    add-int/lit8 v10, v10, 0x1

    if-ne v10, v3, :cond_f

    move-object v0, v9

    goto :goto_9

    :cond_f
    if-nez v5, :cond_10

    new-instance v5, Lo0/i;

    new-array v11, v8, [Ly0/n;

    invoke-direct {v5, v11}, Lo0/i;-><init>([Ljava/lang/Object;)V

    :cond_10
    if-eqz v0, :cond_11

    invoke-virtual {v5, v0}, Lo0/i;->c(Ljava/lang/Object;)V

    move-object v0, v2

    :cond_11
    invoke-virtual {v5, v9}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_12
    :goto_9
    iget-object v9, v9, Ly0/n;->f:Ly0/n;

    goto :goto_8

    :cond_13
    if-ne v10, v3, :cond_14

    goto :goto_7

    :cond_14
    invoke-static {v5}, Lt1/g;->f(Lo0/i;)Ly0/n;

    move-result-object v0

    goto :goto_7

    :cond_15
    iget-object v0, v0, Ly0/n;->f:Ly0/n;

    goto :goto_6

    :cond_16
    :goto_a
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_17
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "visitChildren called on an unattached node"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_5
    check-cast v4, Lu/e;

    sget-object v0, Landroidx/compose/foundation/gestures/a;->c:Ls1/i;

    invoke-interface {v4, v0}, Ls1/f;->g(Ls1/i;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_19

    sget v0, Lu/h0;->b:I

    sget-object v0, Lu1/y0;->f:Lm0/m3;

    invoke-static {v4, v0}, Lt1/g;->p(Lt1/m;Lm0/u1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    :goto_b
    if-eqz v0, :cond_1a

    instance-of v2, v0, Landroid/view/ViewGroup;

    if-eqz v2, :cond_1a

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->shouldDelayChildPressedState()Z

    move-result v2

    if-eqz v2, :cond_18

    goto :goto_c

    :cond_18
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    goto :goto_b

    :cond_19
    :goto_c
    move v1, v3

    :cond_1a
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_5
        0x2 -> :sswitch_4
        0x3 -> :sswitch_3
        0x5 -> :sswitch_2
        0xb -> :sswitch_1
        0xc -> :sswitch_0
    .end sparse-switch
.end method

.method public final invoke()Ljava/lang/Object;
    .locals 8

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Lt/l0;->a:I

    iget-object v2, p0, Lt/l0;->b:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    .line 269
    :pswitch_0
    invoke-virtual {p0}, Lt/l0;->invoke()V

    return-object v0

    .line 270
    :pswitch_1
    invoke-virtual {p0}, Lt/l0;->invoke()V

    return-object v0

    .line 271
    :pswitch_2
    invoke-virtual {p0}, Lt/l0;->invoke()V

    return-object v0

    .line 272
    :pswitch_3
    invoke-virtual {p0}, Lt/l0;->invoke()V

    return-object v0

    .line 273
    :pswitch_4
    invoke-virtual {p0}, Lt/l0;->invoke()V

    return-object v0

    .line 274
    :pswitch_5
    invoke-virtual {p0}, Lt/l0;->invoke()V

    return-object v0

    .line 275
    :pswitch_6
    invoke-virtual {p0}, Lt/l0;->invoke()V

    return-object v0

    :pswitch_7
    packed-switch v1, :pswitch_data_1

    check-cast v2, Ln1/g;

    .line 276
    invoke-virtual {v2}, Ln1/g;->G0()Lm9/d0;

    move-result-object v0

    goto :goto_0

    :pswitch_8
    check-cast v2, Ln1/d;

    .line 277
    iget-object v0, v2, Ln1/d;->c:Lm9/d0;

    :goto_0
    return-object v0

    :pswitch_9
    packed-switch v1, :pswitch_data_2

    check-cast v2, Ln1/g;

    .line 278
    invoke-virtual {v2}, Ln1/g;->G0()Lm9/d0;

    move-result-object v0

    goto :goto_1

    :pswitch_a
    check-cast v2, Ln1/d;

    .line 279
    iget-object v0, v2, Ln1/d;->c:Lm9/d0;

    :goto_1
    return-object v0

    .line 280
    :pswitch_b
    invoke-virtual {p0}, Lt/l0;->invoke()V

    return-object v0

    .line 281
    :pswitch_c
    invoke-virtual {p0}, Lt/l0;->invoke()V

    return-object v0

    .line 282
    :pswitch_d
    invoke-virtual {p0}, Lt/l0;->invoke()V

    return-object v0

    .line 283
    :pswitch_e
    invoke-virtual {p0}, Lt/l0;->invoke()V

    return-object v0

    .line 284
    :pswitch_f
    invoke-virtual {p0}, Lt/l0;->invoke()V

    return-object v0

    .line 285
    :pswitch_10
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    check-cast v2, Lm0/q1;

    .line 286
    iget-object v1, v2, Lm0/q1;->a:Ljava/util/List;

    .line 287
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v3, 0x0

    :goto_2
    if-ge v3, v1, :cond_2

    .line 288
    iget-object v4, v2, Lm0/q1;->a:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lm0/w0;

    .line 289
    iget-object v5, v4, Lm0/w0;->b:Ljava/lang/Object;

    .line 290
    iget v6, v4, Lm0/w0;->a:I

    if-eqz v5, :cond_0

    new-instance v5, Lm0/v0;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    iget-object v7, v4, Lm0/w0;->b:Ljava/lang/Object;

    invoke-direct {v5, v6, v7}, Lm0/v0;-><init>(Ljava/lang/Integer;Ljava/lang/Object;)V

    goto :goto_3

    :cond_0
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    .line 291
    :goto_3
    invoke-virtual {v0, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_1

    .line 292
    new-instance v6, Ljava/util/LinkedHashSet;

    invoke-direct {v6}, Ljava/util/LinkedHashSet;-><init>()V

    .line 293
    invoke-virtual {v0, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 294
    :cond_1
    check-cast v6, Ljava/util/LinkedHashSet;

    .line 295
    invoke-virtual {v6, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_2
    return-object v0

    .line 296
    :pswitch_11
    invoke-virtual {p0}, Lt/l0;->invoke()V

    return-object v0

    .line 297
    :pswitch_12
    invoke-virtual {p0}, Lt/l0;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 298
    :pswitch_13
    invoke-virtual {p0}, Lt/l0;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 299
    :pswitch_14
    invoke-virtual {p0}, Lt/l0;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 300
    :pswitch_15
    new-instance v0, Lf0/a2;

    check-cast v2, Lv/h1;

    const/4 v1, 0x0

    .line 301
    invoke-direct {v0, v2, v1}, Lf0/a2;-><init>(Lv/h1;F)V

    return-object v0

    :pswitch_16
    check-cast v2, Lf0/c2;

    .line 302
    invoke-virtual {v2}, Lf0/c2;->d()Lf0/d2;

    move-result-object v0

    return-object v0

    .line 303
    :pswitch_17
    new-instance v0, La0/o0;

    check-cast v2, Lv0/l;

    sget-object v1, Lr8/s;->a:Lr8/s;

    invoke-direct {v0, v2, v1}, La0/o0;-><init>(Lv0/l;Ljava/util/Map;)V

    return-object v0

    .line 304
    :pswitch_18
    invoke-virtual {p0}, Lt/l0;->invoke()V

    return-object v0

    .line 305
    :pswitch_19
    invoke-virtual {p0}, Lt/l0;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 306
    :pswitch_1a
    invoke-virtual {p0}, Lt/l0;->invoke()V

    return-object v0

    .line 307
    :pswitch_1b
    invoke-virtual {p0}, Lt/l0;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 308
    :pswitch_1c
    invoke-virtual {p0}, Lt/l0;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 309
    :pswitch_1d
    invoke-virtual {p0}, Lt/l0;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_1e
    check-cast v2, Lm9/d0;

    .line 310
    invoke-interface {v2}, Lm9/d0;->q()Lu8/j;

    move-result-object v0

    invoke-static {v0}, Lt/e;->o(Lu8/j;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_0
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_9
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x15
        :pswitch_8
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x15
        :pswitch_a
    .end packed-switch
.end method

.method public final invoke()V
    .locals 23

    move-object/from16 v1, p0

    iget v0, v1, Lt/l0;->a:I

    const/4 v2, 0x2

    const/4 v3, 0x3

    const/4 v4, 0x0

    const/4 v5, 0x1

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    iget-object v0, v1, Lt/l0;->b:Ljava/lang/Object;

    check-cast v0, Lc9/c;

    .line 1
    sget-object v2, Lt1/c1;->I:Le1/i0;

    .line 2
    invoke-interface {v0, v2}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :pswitch_1
    iget-object v0, v1, Lt/l0;->b:Ljava/lang/Object;

    check-cast v0, Lt1/c1;

    .line 3
    iget-object v0, v0, Lt1/c1;->r:Lt1/c1;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Lt1/c1;->P0()V

    :cond_0
    return-void

    :pswitch_2
    iget-object v0, v1, Lt/l0;->b:Ljava/lang/Object;

    check-cast v0, Lt1/n0;

    .line 5
    invoke-virtual {v0}, Lt1/n0;->a()Lt1/c1;

    move-result-object v2

    .line 6
    iget-wide v3, v0, Lt1/n0;->q:J

    .line 7
    invoke-interface {v2, v3, v4}, Lr1/i0;->f(J)Lr1/x0;

    return-void

    :pswitch_3
    iget-object v0, v1, Lt/l0;->b:Ljava/lang/Object;

    check-cast v0, Lt1/l0;

    .line 8
    iget-object v5, v0, Lt1/l0;->L:Lt1/n0;

    .line 9
    iput v4, v5, Lt1/n0;->k:I

    .line 10
    iget-object v5, v5, Lt1/n0;->a:Landroidx/compose/ui/node/a;

    invoke-virtual {v5}, Landroidx/compose/ui/node/a;->t()Lo0/i;

    move-result-object v5

    .line 11
    iget v6, v5, Lo0/i;->c:I

    const v7, 0x7fffffff

    if-lez v6, :cond_3

    .line 12
    iget-object v5, v5, Lo0/i;->a:[Ljava/lang/Object;

    move v8, v4

    .line 13
    :cond_1
    aget-object v9, v5, v8

    check-cast v9, Landroidx/compose/ui/node/a;

    .line 14
    iget-object v9, v9, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    .line 15
    iget-object v9, v9, Lt1/n0;->o:Lt1/l0;

    .line 16
    iget v10, v9, Lt1/l0;->o:I

    iput v10, v9, Lt1/l0;->n:I

    .line 17
    iput v7, v9, Lt1/l0;->o:I

    .line 18
    iput-boolean v4, v9, Lt1/l0;->z:Z

    .line 19
    iget v10, v9, Lt1/l0;->r:I

    if-ne v10, v2, :cond_2

    .line 20
    iput v3, v9, Lt1/l0;->r:I

    :cond_2
    add-int/lit8 v8, v8, 0x1

    if-lt v8, v6, :cond_1

    :cond_3
    sget-object v2, Lt1/f;->f:Lt1/f;

    .line 21
    invoke-virtual {v0, v2}, Lt1/l0;->k(Lc9/c;)V

    .line 22
    invoke-virtual {v0}, Lt1/l0;->l()Lt1/x;

    move-result-object v2

    invoke-virtual {v2}, Lt1/c1;->s0()Lr1/k0;

    move-result-object v2

    invoke-interface {v2}, Lr1/k0;->e()V

    .line 23
    iget-object v2, v0, Lt1/l0;->L:Lt1/n0;

    .line 24
    iget-object v2, v2, Lt1/n0;->a:Landroidx/compose/ui/node/a;

    .line 25
    invoke-virtual {v2}, Landroidx/compose/ui/node/a;->t()Lo0/i;

    move-result-object v3

    .line 26
    iget v5, v3, Lo0/i;->c:I

    if-lez v5, :cond_6

    .line 27
    iget-object v3, v3, Lo0/i;->a:[Ljava/lang/Object;

    .line 28
    :cond_4
    aget-object v6, v3, v4

    check-cast v6, Landroidx/compose/ui/node/a;

    .line 29
    iget-object v8, v6, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    .line 30
    iget-object v8, v8, Lt1/n0;->o:Lt1/l0;

    .line 31
    iget v8, v8, Lt1/l0;->n:I

    invoke-virtual {v6}, Landroidx/compose/ui/node/a;->r()I

    move-result v9

    if-eq v8, v9, :cond_5

    .line 32
    invoke-virtual {v2}, Landroidx/compose/ui/node/a;->J()V

    .line 33
    invoke-virtual {v2}, Landroidx/compose/ui/node/a;->x()V

    .line 34
    invoke-virtual {v6}, Landroidx/compose/ui/node/a;->r()I

    move-result v8

    if-ne v8, v7, :cond_5

    .line 35
    iget-object v6, v6, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object v6, v6, Lt1/n0;->o:Lt1/l0;

    .line 36
    invoke-virtual {v6}, Lt1/l0;->r0()V

    :cond_5
    add-int/lit8 v4, v4, 0x1

    if-lt v4, v5, :cond_4

    :cond_6
    sget-object v2, Lt1/f;->n:Lt1/f;

    .line 37
    invoke-virtual {v0, v2}, Lt1/l0;->k(Lc9/c;)V

    return-void

    :pswitch_4
    iget-object v0, v1, Lt/l0;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/node/a;

    .line 38
    iget-object v0, v0, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    .line 39
    iget-object v2, v0, Lt1/n0;->o:Lt1/l0;

    .line 40
    iput-boolean v5, v2, Lt1/l0;->C:Z

    .line 41
    iget-object v0, v0, Lt1/n0;->p:Lt1/k0;

    if-eqz v0, :cond_7

    .line 42
    iput-boolean v5, v0, Lt1/k0;->y:Z

    :cond_7
    return-void

    :pswitch_5
    iget-object v0, v1, Lt/l0;->b:Ljava/lang/Object;

    check-cast v0, Ls1/e;

    .line 43
    iput-boolean v4, v0, Ls1/e;->f:Z

    .line 44
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 45
    iget-object v3, v0, Ls1/e;->d:Lo0/i;

    iget v5, v3, Lo0/i;->c:I

    .line 46
    iget-object v6, v0, Ls1/e;->e:Lo0/i;

    if-lez v5, :cond_a

    .line 47
    iget-object v7, v3, Lo0/i;->a:[Ljava/lang/Object;

    move v8, v4

    .line 48
    :cond_8
    aget-object v9, v7, v8

    check-cast v9, Landroidx/compose/ui/node/a;

    .line 49
    iget-object v10, v6, Lo0/i;->a:[Ljava/lang/Object;

    .line 50
    aget-object v10, v10, v8

    .line 51
    check-cast v10, Ls1/c;

    .line 52
    iget-object v9, v9, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    .line 53
    iget-object v9, v9, Lt1/x0;->e:Ly0/n;

    .line 54
    iget-boolean v11, v9, Ly0/n;->t:Z

    if-eqz v11, :cond_9

    .line 55
    invoke-static {v9, v10, v2}, Ls1/e;->b(Ly0/n;Ls1/c;Ljava/util/HashSet;)V

    :cond_9
    add-int/lit8 v8, v8, 0x1

    if-lt v8, v5, :cond_8

    .line 56
    :cond_a
    invoke-virtual {v3}, Lo0/i;->g()V

    .line 57
    invoke-virtual {v6}, Lo0/i;->g()V

    .line 58
    iget-object v3, v0, Ls1/e;->b:Lo0/i;

    iget v5, v3, Lo0/i;->c:I

    .line 59
    iget-object v0, v0, Ls1/e;->c:Lo0/i;

    if-lez v5, :cond_d

    .line 60
    iget-object v6, v3, Lo0/i;->a:[Ljava/lang/Object;

    .line 61
    :cond_b
    aget-object v7, v6, v4

    check-cast v7, Lt1/d;

    .line 62
    iget-object v8, v0, Lo0/i;->a:[Ljava/lang/Object;

    .line 63
    aget-object v8, v8, v4

    .line 64
    check-cast v8, Ls1/c;

    .line 65
    iget-boolean v9, v7, Ly0/n;->t:Z

    if-eqz v9, :cond_c

    .line 66
    invoke-static {v7, v8, v2}, Ls1/e;->b(Ly0/n;Ls1/c;Ljava/util/HashSet;)V

    :cond_c
    add-int/lit8 v4, v4, 0x1

    if-lt v4, v5, :cond_b

    .line 67
    :cond_d
    invoke-virtual {v3}, Lo0/i;->g()V

    .line 68
    invoke-virtual {v0}, Lo0/i;->g()V

    .line 69
    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lt1/d;

    .line 70
    invoke-virtual {v2}, Lt1/d;->I0()V

    goto :goto_0

    :cond_e
    return-void

    :pswitch_6
    iget-object v0, v1, Lt/l0;->b:Ljava/lang/Object;

    check-cast v0, Lr1/h1;

    .line 71
    invoke-virtual {v0}, Lr1/h1;->a()Lr1/f0;

    move-result-object v0

    .line 72
    iget-object v2, v0, Lr1/f0;->a:Landroidx/compose/ui/node/a;

    invoke-virtual {v2}, Landroidx/compose/ui/node/a;->o()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    .line 73
    iget v7, v0, Lr1/f0;->u:I

    if-eq v7, v6, :cond_10

    .line 74
    iget-object v0, v0, Lr1/f0;->f:Ljava/util/HashMap;

    .line 75
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    .line 76
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lr1/x;

    .line 77
    iput-boolean v5, v6, Lr1/x;->d:Z

    goto :goto_1

    .line 78
    :cond_f
    iget-object v0, v2, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    .line 79
    iget-boolean v0, v0, Lt1/n0;->d:Z

    if-nez v0, :cond_10

    .line 80
    invoke-static {v2, v4, v3}, Landroidx/compose/ui/node/a;->Q(Landroidx/compose/ui/node/a;ZI)V

    :cond_10
    return-void

    :pswitch_7
    iget-object v0, v1, Lt/l0;->b:Ljava/lang/Object;

    check-cast v0, Li1/j0;

    .line 81
    iget v2, v0, Li1/j0;->s:I

    .line 82
    iget-object v3, v0, Li1/j0;->p:Lm0/l1;

    .line 83
    invoke-virtual {v3}, Lm0/u2;->d()I

    move-result v3

    if-ne v2, v3, :cond_11

    .line 84
    iget-object v2, v0, Li1/j0;->p:Lm0/l1;

    .line 85
    invoke-virtual {v2}, Lm0/u2;->d()I

    move-result v2

    add-int/2addr v2, v5

    .line 86
    iget-object v0, v0, Li1/j0;->p:Lm0/l1;

    .line 87
    invoke-virtual {v0, v2}, Lm0/u2;->f(I)V

    :cond_11
    return-void

    :pswitch_8
    iget-object v0, v1, Lt/l0;->b:Ljava/lang/Object;

    check-cast v0, Lc1/p;

    .line 88
    invoke-virtual {v0}, Lc1/p;->G0()Lc1/i;

    return-void

    :pswitch_9
    iget-object v0, v1, Lt/l0;->b:Ljava/lang/Object;

    check-cast v0, Lc1/d;

    .line 89
    iget-object v2, v0, Lc1/d;->d:Ljava/util/LinkedHashSet;

    .line 90
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_12
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const-string v6, "visitChildren called on an unattached node"

    const/16 v8, 0x10

    if-eqz v3, :cond_27

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc1/j;

    check-cast v3, Ly0/n;

    .line 91
    iget-object v9, v3, Ly0/n;->a:Ly0/n;

    .line 92
    iget-boolean v10, v9, Ly0/n;->t:Z

    if-eqz v10, :cond_12

    const/4 v10, 0x0

    :goto_2
    if-eqz v9, :cond_1a

    .line 93
    instance-of v11, v9, Lc1/p;

    if-eqz v11, :cond_13

    .line 94
    check-cast v9, Lc1/p;

    .line 95
    iget-object v11, v0, Lc1/d;->b:Ljava/util/LinkedHashSet;

    .line 96
    invoke-interface {v11, v9}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 97
    :cond_13
    iget v11, v9, Ly0/n;->c:I

    and-int/lit16 v11, v11, 0x400

    if-eqz v11, :cond_19

    .line 98
    instance-of v11, v9, Lt1/o;

    if-eqz v11, :cond_19

    .line 99
    move-object v11, v9

    check-cast v11, Lt1/o;

    .line 100
    iget-object v11, v11, Lt1/o;->v:Ly0/n;

    move v12, v4

    :goto_3
    if-eqz v11, :cond_18

    .line 101
    iget v13, v11, Ly0/n;->c:I

    and-int/lit16 v13, v13, 0x400

    if-eqz v13, :cond_17

    add-int/lit8 v12, v12, 0x1

    if-ne v12, v5, :cond_14

    move-object v9, v11

    goto :goto_4

    :cond_14
    if-nez v10, :cond_15

    .line 102
    new-instance v10, Lo0/i;

    new-array v13, v8, [Ly0/n;

    invoke-direct {v10, v13}, Lo0/i;-><init>([Ljava/lang/Object;)V

    :cond_15
    if-eqz v9, :cond_16

    .line 103
    invoke-virtual {v10, v9}, Lo0/i;->c(Ljava/lang/Object;)V

    const/4 v9, 0x0

    .line 104
    :cond_16
    invoke-virtual {v10, v11}, Lo0/i;->c(Ljava/lang/Object;)V

    .line 105
    :cond_17
    :goto_4
    iget-object v11, v11, Ly0/n;->f:Ly0/n;

    goto :goto_3

    :cond_18
    if-ne v12, v5, :cond_19

    goto :goto_2

    .line 106
    :cond_19
    :goto_5
    invoke-static {v10}, Lt1/g;->f(Lo0/i;)Ly0/n;

    move-result-object v9

    goto :goto_2

    .line 107
    :cond_1a
    iget-object v3, v3, Ly0/n;->a:Ly0/n;

    .line 108
    iget-boolean v9, v3, Ly0/n;->t:Z

    if-eqz v9, :cond_26

    .line 109
    new-instance v6, Lo0/i;

    new-array v9, v8, [Ly0/n;

    invoke-direct {v6, v9}, Lo0/i;-><init>([Ljava/lang/Object;)V

    .line 110
    iget-object v9, v3, Ly0/n;->f:Ly0/n;

    if-nez v9, :cond_1b

    .line 111
    invoke-static {v6, v3}, Lt1/g;->b(Lo0/i;Ly0/n;)V

    goto :goto_6

    .line 112
    :cond_1b
    invoke-virtual {v6, v9}, Lo0/i;->c(Ljava/lang/Object;)V

    .line 113
    :cond_1c
    :goto_6
    invoke-virtual {v6}, Lo0/i;->l()Z

    move-result v3

    if-eqz v3, :cond_12

    iget v3, v6, Lo0/i;->c:I

    sub-int/2addr v3, v5

    .line 114
    invoke-virtual {v6, v3}, Lo0/i;->n(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly0/n;

    .line 115
    iget v9, v3, Ly0/n;->d:I

    and-int/lit16 v9, v9, 0x400

    if-nez v9, :cond_1d

    .line 116
    invoke-static {v6, v3}, Lt1/g;->b(Lo0/i;Ly0/n;)V

    goto :goto_6

    :cond_1d
    :goto_7
    if-eqz v3, :cond_1c

    .line 117
    iget v9, v3, Ly0/n;->c:I

    and-int/lit16 v9, v9, 0x400

    if-eqz v9, :cond_25

    const/4 v9, 0x0

    :goto_8
    if-eqz v3, :cond_1c

    .line 118
    instance-of v10, v3, Lc1/p;

    if-eqz v10, :cond_1e

    .line 119
    check-cast v3, Lc1/p;

    .line 120
    iget-object v10, v0, Lc1/d;->b:Ljava/util/LinkedHashSet;

    .line 121
    invoke-interface {v10, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_b

    .line 122
    :cond_1e
    iget v10, v3, Ly0/n;->c:I

    and-int/lit16 v10, v10, 0x400

    if-eqz v10, :cond_24

    .line 123
    instance-of v10, v3, Lt1/o;

    if-eqz v10, :cond_24

    .line 124
    move-object v10, v3

    check-cast v10, Lt1/o;

    .line 125
    iget-object v10, v10, Lt1/o;->v:Ly0/n;

    move v11, v4

    :goto_9
    if-eqz v10, :cond_23

    .line 126
    iget v12, v10, Ly0/n;->c:I

    and-int/lit16 v12, v12, 0x400

    if-eqz v12, :cond_22

    add-int/lit8 v11, v11, 0x1

    if-ne v11, v5, :cond_1f

    move-object v3, v10

    goto :goto_a

    :cond_1f
    if-nez v9, :cond_20

    .line 127
    new-instance v9, Lo0/i;

    new-array v12, v8, [Ly0/n;

    invoke-direct {v9, v12}, Lo0/i;-><init>([Ljava/lang/Object;)V

    :cond_20
    if-eqz v3, :cond_21

    .line 128
    invoke-virtual {v9, v3}, Lo0/i;->c(Ljava/lang/Object;)V

    const/4 v3, 0x0

    .line 129
    :cond_21
    invoke-virtual {v9, v10}, Lo0/i;->c(Ljava/lang/Object;)V

    .line 130
    :cond_22
    :goto_a
    iget-object v10, v10, Ly0/n;->f:Ly0/n;

    goto :goto_9

    :cond_23
    if-ne v11, v5, :cond_24

    goto :goto_8

    .line 131
    :cond_24
    :goto_b
    invoke-static {v9}, Lt1/g;->f(Lo0/i;)Ly0/n;

    move-result-object v3

    goto :goto_8

    .line 132
    :cond_25
    iget-object v3, v3, Ly0/n;->f:Ly0/n;

    goto :goto_7

    .line 133
    :cond_26
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 134
    :cond_27
    iget-object v2, v0, Lc1/d;->d:Ljava/util/LinkedHashSet;

    .line 135
    invoke-interface {v2}, Ljava/util/Set;->clear()V

    .line 136
    new-instance v2, Ljava/util/LinkedHashSet;

    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 137
    iget-object v3, v0, Lc1/d;->c:Ljava/util/LinkedHashSet;

    .line 138
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_48

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lc1/c;

    move-object v10, v9

    check-cast v10, Ly0/n;

    .line 139
    iget-object v11, v10, Ly0/n;->a:Ly0/n;

    .line 140
    iget-boolean v12, v11, Ly0/n;->t:Z

    sget-object v13, Lc1/o;->c:Lc1/o;

    if-nez v12, :cond_28

    .line 141
    invoke-interface {v9, v13}, Lc1/c;->a0(Lc1/o;)V

    move v11, v8

    goto/16 :goto_1b

    :cond_28
    move/from16 v16, v4

    move v15, v5

    const/4 v12, 0x0

    const/4 v14, 0x0

    :goto_d
    if-eqz v11, :cond_32

    .line 142
    instance-of v7, v11, Lc1/p;

    if-eqz v7, :cond_2b

    .line 143
    check-cast v11, Lc1/p;

    if-eqz v12, :cond_29

    move/from16 v16, v5

    .line 144
    :cond_29
    iget-object v7, v0, Lc1/d;->b:Ljava/util/LinkedHashSet;

    .line 145
    invoke-interface {v7, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2a

    .line 146
    invoke-interface {v2, v11}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move v15, v4

    :cond_2a
    move-object v12, v11

    goto :goto_11

    .line 147
    :cond_2b
    iget v7, v11, Ly0/n;->c:I

    and-int/lit16 v7, v7, 0x400

    if-eqz v7, :cond_31

    .line 148
    instance-of v7, v11, Lt1/o;

    if-eqz v7, :cond_31

    .line 149
    move-object v7, v11

    check-cast v7, Lt1/o;

    .line 150
    iget-object v7, v7, Lt1/o;->v:Ly0/n;

    :goto_e
    if-eqz v7, :cond_30

    .line 151
    iget v8, v7, Ly0/n;->c:I

    and-int/lit16 v8, v8, 0x400

    if-eqz v8, :cond_2f

    add-int/lit8 v4, v4, 0x1

    if-ne v4, v5, :cond_2c

    move-object v11, v7

    goto :goto_f

    :cond_2c
    if-nez v14, :cond_2d

    .line 152
    new-instance v14, Lo0/i;

    const/16 v8, 0x10

    new-array v5, v8, [Ly0/n;

    invoke-direct {v14, v5}, Lo0/i;-><init>([Ljava/lang/Object;)V

    :cond_2d
    if-eqz v11, :cond_2e

    .line 153
    invoke-virtual {v14, v11}, Lo0/i;->c(Ljava/lang/Object;)V

    const/4 v11, 0x0

    .line 154
    :cond_2e
    invoke-virtual {v14, v7}, Lo0/i;->c(Ljava/lang/Object;)V

    .line 155
    :cond_2f
    :goto_f
    iget-object v7, v7, Ly0/n;->f:Ly0/n;

    const/4 v5, 0x1

    const/16 v8, 0x10

    goto :goto_e

    :cond_30
    if-ne v4, v5, :cond_31

    const/4 v4, 0x0

    :goto_10
    const/16 v8, 0x10

    goto :goto_d

    .line 156
    :cond_31
    :goto_11
    invoke-static {v14}, Lt1/g;->f(Lo0/i;)Ly0/n;

    move-result-object v11

    const/4 v4, 0x0

    const/4 v5, 0x1

    goto :goto_10

    .line 157
    :cond_32
    iget-object v4, v10, Ly0/n;->a:Ly0/n;

    .line 158
    iget-boolean v5, v4, Ly0/n;->t:Z

    if-eqz v5, :cond_47

    .line 159
    new-instance v5, Lo0/i;

    const/16 v7, 0x10

    new-array v8, v7, [Ly0/n;

    invoke-direct {v5, v8}, Lo0/i;-><init>([Ljava/lang/Object;)V

    .line 160
    iget-object v7, v4, Ly0/n;->f:Ly0/n;

    if-nez v7, :cond_33

    .line 161
    invoke-static {v5, v4}, Lt1/g;->b(Lo0/i;Ly0/n;)V

    goto :goto_12

    .line 162
    :cond_33
    invoke-virtual {v5, v7}, Lo0/i;->c(Ljava/lang/Object;)V

    .line 163
    :cond_34
    :goto_12
    invoke-virtual {v5}, Lo0/i;->l()Z

    move-result v4

    if-eqz v4, :cond_42

    iget v4, v5, Lo0/i;->c:I

    const/4 v7, 0x1

    sub-int/2addr v4, v7

    .line 164
    invoke-virtual {v5, v4}, Lo0/i;->n(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly0/n;

    .line 165
    iget v7, v4, Ly0/n;->d:I

    and-int/lit16 v7, v7, 0x400

    if-nez v7, :cond_36

    .line 166
    invoke-static {v5, v4}, Lt1/g;->b(Lo0/i;Ly0/n;)V

    :cond_35
    const/16 v11, 0x10

    goto :goto_12

    :cond_36
    :goto_13
    if-eqz v4, :cond_35

    .line 167
    iget v7, v4, Ly0/n;->c:I

    and-int/lit16 v7, v7, 0x400

    if-eqz v7, :cond_41

    const/4 v7, 0x0

    :goto_14
    if-eqz v4, :cond_34

    .line 168
    instance-of v8, v4, Lc1/p;

    if-eqz v8, :cond_3a

    .line 169
    check-cast v4, Lc1/p;

    if-eqz v12, :cond_37

    const/16 v16, 0x1

    .line 170
    :cond_37
    iget-object v8, v0, Lc1/d;->b:Ljava/util/LinkedHashSet;

    .line 171
    invoke-interface {v8, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_38

    .line 172
    invoke-interface {v2, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const/4 v15, 0x0

    :cond_38
    move-object v12, v4

    :cond_39
    const/16 v11, 0x10

    goto :goto_18

    .line 173
    :cond_3a
    iget v8, v4, Ly0/n;->c:I

    and-int/lit16 v8, v8, 0x400

    if-eqz v8, :cond_39

    .line 174
    instance-of v8, v4, Lt1/o;

    if-eqz v8, :cond_39

    .line 175
    move-object v8, v4

    check-cast v8, Lt1/o;

    .line 176
    iget-object v8, v8, Lt1/o;->v:Ly0/n;

    const/4 v10, 0x0

    :goto_15
    if-eqz v8, :cond_3f

    .line 177
    iget v11, v8, Ly0/n;->c:I

    and-int/lit16 v11, v11, 0x400

    if-eqz v11, :cond_3b

    add-int/lit8 v10, v10, 0x1

    const/4 v11, 0x1

    if-ne v10, v11, :cond_3c

    move-object v4, v8

    :cond_3b
    const/16 v11, 0x10

    goto :goto_17

    :cond_3c
    if-nez v7, :cond_3d

    .line 178
    new-instance v7, Lo0/i;

    const/16 v11, 0x10

    new-array v14, v11, [Ly0/n;

    invoke-direct {v7, v14}, Lo0/i;-><init>([Ljava/lang/Object;)V

    goto :goto_16

    :cond_3d
    const/16 v11, 0x10

    :goto_16
    if-eqz v4, :cond_3e

    .line 179
    invoke-virtual {v7, v4}, Lo0/i;->c(Ljava/lang/Object;)V

    const/4 v4, 0x0

    .line 180
    :cond_3e
    invoke-virtual {v7, v8}, Lo0/i;->c(Ljava/lang/Object;)V

    .line 181
    :goto_17
    iget-object v8, v8, Ly0/n;->f:Ly0/n;

    goto :goto_15

    :cond_3f
    const/4 v8, 0x1

    const/16 v11, 0x10

    if-ne v10, v8, :cond_40

    goto :goto_14

    .line 182
    :cond_40
    :goto_18
    invoke-static {v7}, Lt1/g;->f(Lo0/i;)Ly0/n;

    move-result-object v4

    goto :goto_14

    :cond_41
    const/16 v11, 0x10

    .line 183
    iget-object v4, v4, Ly0/n;->f:Ly0/n;

    goto :goto_13

    :cond_42
    const/16 v11, 0x10

    if-eqz v15, :cond_46

    if-eqz v16, :cond_43

    .line 184
    invoke-static {v9}, Landroidx/compose/ui/focus/a;->o(Lc1/c;)Lc1/o;

    move-result-object v4

    goto :goto_1a

    :cond_43
    if-eqz v12, :cond_45

    .line 185
    invoke-virtual {v12}, Lc1/p;->H0()Lc1/o;

    move-result-object v4

    if-nez v4, :cond_44

    goto :goto_19

    :cond_44
    move-object v13, v4

    :cond_45
    :goto_19
    move-object v4, v13

    .line 186
    :goto_1a
    invoke-interface {v9, v4}, Lc1/c;->a0(Lc1/o;)V

    :cond_46
    :goto_1b
    move v8, v11

    const/4 v4, 0x0

    const/4 v5, 0x1

    goto/16 :goto_c

    .line 187
    :cond_47
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 188
    :cond_48
    iget-object v3, v0, Lc1/d;->c:Ljava/util/LinkedHashSet;

    .line 189
    invoke-interface {v3}, Ljava/util/Set;->clear()V

    .line 190
    iget-object v3, v0, Lc1/d;->b:Ljava/util/LinkedHashSet;

    .line 191
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_49
    :goto_1c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lc1/p;

    .line 192
    iget-boolean v5, v4, Ly0/n;->t:Z

    if-eqz v5, :cond_49

    .line 193
    invoke-virtual {v4}, Lc1/p;->H0()Lc1/o;

    move-result-object v5

    .line 194
    invoke-virtual {v4}, Lc1/p;->I0()V

    .line 195
    invoke-virtual {v4}, Lc1/p;->H0()Lc1/o;

    move-result-object v6

    if-ne v5, v6, :cond_4a

    .line 196
    invoke-interface {v2, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_49

    .line 197
    :cond_4a
    invoke-static {v4}, Landroidx/compose/ui/focus/a;->B(Lc1/p;)V

    goto :goto_1c

    .line 198
    :cond_4b
    iget-object v3, v0, Lc1/d;->b:Ljava/util/LinkedHashSet;

    .line 199
    invoke-interface {v3}, Ljava/util/Set;->clear()V

    .line 200
    invoke-interface {v2}, Ljava/util/Set;->clear()V

    .line 201
    iget-object v2, v0, Lc1/d;->d:Ljava/util/LinkedHashSet;

    .line 202
    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_4e

    .line 203
    iget-object v2, v0, Lc1/d;->c:Ljava/util/LinkedHashSet;

    .line 204
    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_4d

    .line 205
    iget-object v0, v0, Lc1/d;->b:Ljava/util/LinkedHashSet;

    .line 206
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4c

    return-void

    :cond_4c
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Unprocessed FocusTarget nodes"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 207
    :cond_4d
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Unprocessed FocusEvent nodes"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 208
    :cond_4e
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Unprocessed FocusProperties nodes"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_1d
    :pswitch_a
    iget-object v0, v1, Lt/l0;->b:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lw0/a0;

    .line 209
    iget-object v4, v3, Lw0/a0;->f:Lo0/i;

    .line 210
    monitor-enter v4

    .line 211
    :try_start_0
    iget-boolean v0, v3, Lw0/a0;->c:Z

    if-nez v0, :cond_56

    const/4 v0, 0x1

    .line 212
    iput-boolean v0, v3, Lw0/a0;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 213
    :try_start_1
    iget-object v0, v3, Lw0/a0;->f:Lo0/i;

    .line 214
    iget v5, v0, Lo0/i;->c:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    if-lez v5, :cond_54

    .line 215
    :try_start_2
    iget-object v0, v0, Lo0/i;->a:[Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    const/4 v6, 0x0

    .line 216
    :goto_1e
    :try_start_3
    aget-object v7, v0, v6

    check-cast v7, Lw0/z;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 217
    :try_start_4
    iget-object v8, v7, Lw0/z;->g:Lq/t;

    .line 218
    iget-object v9, v8, Lq/x;->b:[Ljava/lang/Object;

    .line 219
    iget-object v10, v8, Lq/x;->a:[J

    .line 220
    array-length v11, v10

    sub-int/2addr v11, v2

    if-ltz v11, :cond_52

    const/4 v12, 0x0

    .line 221
    :goto_1f
    aget-wide v13, v10, v12
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    move-object/from16 v16, v3

    not-long v2, v13

    const/16 v17, 0x7

    shl-long v2, v2, v17

    and-long/2addr v2, v13

    const-wide v19, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v2, v2, v19

    cmp-long v2, v2, v19

    if-eqz v2, :cond_51

    sub-int v2, v12, v11

    not-int v2, v2

    ushr-int/lit8 v2, v2, 0x1f

    const/16 v3, 0x8

    rsub-int/lit8 v2, v2, 0x8

    const/4 v15, 0x0

    :goto_20
    if-ge v15, v2, :cond_50

    const-wide/16 v19, 0xff

    and-long v19, v13, v19

    const-wide/16 v21, 0x80

    cmp-long v18, v19, v21

    if-gez v18, :cond_4f

    shl-int/lit8 v18, v12, 0x3

    add-int v18, v18, v15

    .line 222
    :try_start_5
    aget-object v3, v9, v18

    move-object/from16 v18, v0

    iget-object v0, v7, Lw0/z;->a:Lc9/c;

    invoke-interface {v0, v3}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x8

    goto :goto_21

    :cond_4f
    move-object/from16 v18, v0

    move v0, v3

    :goto_21
    shr-long/2addr v13, v0

    add-int/lit8 v15, v15, 0x1

    move v3, v0

    move-object/from16 v0, v18

    goto :goto_20

    :cond_50
    move-object/from16 v18, v0

    move v0, v3

    if-ne v2, v0, :cond_53

    goto :goto_22

    :cond_51
    move-object/from16 v18, v0

    :goto_22
    if-eq v12, v11, :cond_53

    add-int/lit8 v12, v12, 0x1

    move-object/from16 v3, v16

    move-object/from16 v0, v18

    const/4 v2, 0x2

    goto :goto_1f

    :cond_52
    move-object/from16 v18, v0

    move-object/from16 v16, v3

    .line 223
    :cond_53
    invoke-virtual {v8}, Lq/t;->d()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    add-int/lit8 v6, v6, 0x1

    move-object/from16 v3, v16

    if-lt v6, v5, :cond_55

    :cond_54
    const/4 v2, 0x0

    goto :goto_25

    :cond_55
    move-object/from16 v0, v18

    const/4 v2, 0x2

    goto :goto_1e

    :catchall_0
    move-exception v0

    goto :goto_23

    :catchall_1
    move-exception v0

    move-object/from16 v16, v3

    :goto_23
    move-object/from16 v3, v16

    :goto_24
    const/4 v2, 0x0

    goto :goto_26

    :catchall_2
    move-exception v0

    move-object/from16 v16, v3

    goto :goto_24

    .line 224
    :goto_25
    :try_start_6
    iput-boolean v2, v3, Lw0/a0;->c:Z

    goto :goto_27

    :catchall_3
    move-exception v0

    goto :goto_24

    :goto_26
    iput-boolean v2, v3, Lw0/a0;->c:Z

    .line 225
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    :catchall_4
    move-exception v0

    goto :goto_28

    .line 226
    :cond_56
    :goto_27
    monitor-exit v4

    iget-object v0, v1, Lt/l0;->b:Ljava/lang/Object;

    check-cast v0, Lw0/a0;

    .line 227
    invoke-static {v0}, Lw0/a0;->a(Lw0/a0;)Z

    move-result v0

    if-nez v0, :cond_57

    return-void

    :cond_57
    const/4 v2, 0x2

    goto/16 :goto_1d

    .line 228
    :goto_28
    monitor-exit v4

    throw v0

    :pswitch_b
    iget-object v0, v1, Lt/l0;->b:Ljava/lang/Object;

    check-cast v0, Lm0/g2;

    .line 229
    iget-object v2, v0, Lm0/g2;->b:Ljava/lang/Object;

    .line 230
    monitor-enter v2

    .line 231
    :try_start_7
    invoke-virtual {v0}, Lm0/g2;->u()Lm9/k;

    move-result-object v3

    .line 232
    iget-object v4, v0, Lm0/g2;->r:Lp9/q0;

    .line 233
    invoke-virtual {v4}, Lp9/q0;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lm0/a2;

    sget-object v5, Lm0/a2;->b:Lm0/a2;

    invoke-virtual {v4, v5}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v4
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    if-lez v4, :cond_59

    .line 234
    monitor-exit v2

    if-eqz v3, :cond_58

    sget-object v0, Lq8/l;->a:Lq8/l;

    .line 235
    invoke-interface {v3, v0}, Lu8/e;->resumeWith(Ljava/lang/Object;)V

    :cond_58
    return-void

    :cond_59
    :try_start_8
    const-string v3, "Recomposer shutdown; frame clock awaiter will never resume"

    .line 236
    iget-object v0, v0, Lm0/g2;->d:Ljava/lang/Throwable;

    .line 237
    invoke-static {v3, v0}, Ld7/a;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object v0

    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    :catchall_5
    move-exception v0

    .line 238
    monitor-exit v2

    throw v0

    :pswitch_c
    iget-object v0, v1, Lt/l0;->b:Ljava/lang/Object;

    check-cast v0, Lj0/a;

    .line 239
    iget-object v2, v0, Lj0/a;->p:Lm0/n1;

    .line 240
    invoke-virtual {v2}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    const/4 v3, 0x1

    xor-int/2addr v2, v3

    .line 241
    iget-object v0, v0, Lj0/a;->p:Lm0/n1;

    .line 242
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    .line 243
    invoke-virtual {v0, v2}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    return-void

    :pswitch_d
    iget-object v0, v1, Lt/l0;->b:Ljava/lang/Object;

    check-cast v0, Lv/e2;

    .line 244
    sget-object v2, Lu1/s1;->e:Lm0/m3;

    .line 245
    invoke-static {v0, v2}, Lt1/g;->p(Lt1/m;Lm0/u1;)Ljava/lang/Object;

    return-void

    :pswitch_e
    iget-object v0, v1, Lt/l0;->b:Ljava/lang/Object;

    check-cast v0, Lv/s;

    .line 246
    iget-object v2, v0, Lv/s;->y:Lv/l;

    .line 247
    :goto_29
    iget-object v3, v2, Lv/l;->a:Lo0/i;

    .line 248
    invoke-virtual {v3}, Lo0/i;->l()Z

    move-result v3

    if-eqz v3, :cond_5c

    .line 249
    iget-object v3, v2, Lv/l;->a:Lo0/i;

    invoke-virtual {v3}, Lo0/i;->k()Z

    move-result v4

    if-nez v4, :cond_5b

    .line 250
    iget v4, v3, Lo0/i;->c:I

    const/4 v5, 0x1

    sub-int/2addr v4, v5

    .line 251
    iget-object v5, v3, Lo0/i;->a:[Ljava/lang/Object;

    .line 252
    aget-object v4, v5, v4

    .line 253
    check-cast v4, Lv/p;

    .line 254
    iget-object v4, v4, Lv/p;->a:Lc9/a;

    .line 255
    invoke-interface {v4}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ld1/d;

    if-nez v4, :cond_5a

    goto :goto_2a

    .line 256
    :cond_5a
    iget-wide v5, v0, Lv/s;->D:J

    invoke-virtual {v0, v5, v6, v4}, Lv/s;->I0(JLd1/d;)Z

    move-result v4

    if-eqz v4, :cond_5c

    .line 257
    :goto_2a
    iget v4, v3, Lo0/i;->c:I

    const/4 v5, 0x1

    sub-int/2addr v4, v5

    .line 258
    invoke-virtual {v3, v4}, Lo0/i;->n(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lv/p;

    .line 259
    iget-object v3, v3, Lv/p;->b:Lm9/k;

    sget-object v4, Lq8/l;->a:Lq8/l;

    .line 260
    invoke-interface {v3, v4}, Lu8/e;->resumeWith(Ljava/lang/Object;)V

    goto :goto_29

    .line 261
    :cond_5b
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v2, "MutableVector is empty."

    invoke-direct {v0, v2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 262
    :cond_5c
    iget-boolean v2, v0, Lv/s;->C:Z

    if-eqz v2, :cond_5d

    .line 263
    invoke-virtual {v0}, Lv/s;->H0()Ld1/d;

    move-result-object v2

    if-eqz v2, :cond_5d

    .line 264
    iget-wide v3, v0, Lv/s;->D:J

    invoke-virtual {v0, v3, v4, v2}, Lv/s;->I0(JLd1/d;)Z

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_5d

    const/4 v2, 0x0

    .line 265
    iput-boolean v2, v0, Lv/s;->C:Z

    .line 266
    :cond_5d
    iget-object v2, v0, Lv/s;->F:Lv/m3;

    .line 267
    invoke-static {v0}, Lv/s;->G0(Lv/s;)F

    move-result v0

    .line 268
    iput v0, v2, Lv/m3;->e:F

    return-void

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_e
        :pswitch_0
        :pswitch_d
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_c
        :pswitch_0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_0
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
