.class public final Ln4/i;
.super Ljava/lang/Object;

# interfaces
.implements Ln4/j;


# instance fields
.field public final a:Li4/i;

.field public final b:Ll/z2;

.field public final c:Lq4/e;


# direct methods
.method public constructor <init>(Li4/i;Ll/z2;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln4/i;->a:Li4/i;

    iput-object p2, p0, Ln4/i;->b:Ll/z2;

    new-instance v0, Lq4/e;

    invoke-direct {v0, p1, p2}, Lq4/e;-><init>(Li4/i;Ll/z2;)V

    iput-object v0, p0, Ln4/i;->c:Lq4/e;

    return-void
.end method

.method public static final a(Ln4/i;Lm4/n;Li4/c;Ls4/j;Ljava/lang/Object;Ls4/n;Li4/e;Lu8/e;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p7

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v1, v0, Ln4/b;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ln4/b;

    iget v2, v1, Ln4/b;->r:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Ln4/b;->r:I

    move-object/from16 v2, p0

    goto :goto_0

    :cond_0
    new-instance v1, Ln4/b;

    move-object/from16 v2, p0

    invoke-direct {v1, v2, v0}, Ln4/b;-><init>(Ln4/i;Lu8/e;)V

    :goto_0
    iget-object v0, v1, Ln4/b;->p:Ljava/lang/Object;

    sget-object v3, Lv8/a;->a:Lv8/a;

    iget v4, v1, Ln4/b;->r:I

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v6, :cond_1

    iget v2, v1, Ln4/b;->o:I

    iget-object v4, v1, Ln4/b;->n:Li4/e;

    iget-object v7, v1, Ln4/b;->f:Ls4/n;

    iget-object v8, v1, Ln4/b;->e:Ljava/lang/Object;

    iget-object v9, v1, Ln4/b;->d:Ls4/j;

    iget-object v10, v1, Ln4/b;->c:Li4/c;

    iget-object v11, v1, Ln4/b;->b:Lm4/n;

    iget-object v12, v1, Ln4/b;->a:Ln4/i;

    invoke-static {v0}, Ld7/t;->v0(Ljava/lang/Object;)V

    move-object/from16 v16, v10

    move-object v10, v1

    move-object/from16 v1, v16

    move-object/from16 v17, v9

    move v9, v2

    move-object v2, v12

    move-object v12, v3

    move-object/from16 v3, v17

    move-object/from16 v18, v8

    move-object v8, v4

    move-object/from16 v4, v18

    goto/16 :goto_3

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Ld7/t;->v0(Ljava/lang/Object;)V

    const/4 v0, 0x0

    move-object/from16 v4, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move v9, v0

    move-object v10, v1

    move-object v11, v3

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v3, p3

    :goto_1
    iget-object v12, v2, Ln4/i;->a:Li4/i;

    iget-object v12, v1, Li4/c;->e:Ljava/util/List;

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v13

    if-ge v9, v13, :cond_3

    invoke-interface {v12, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lk4/c;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v13, Lk4/e;

    iget-object v14, v0, Lm4/n;->a:Lk4/o;

    iget-object v15, v12, Lk4/c;->b:Lu9/i;

    iget-object v12, v12, Lk4/c;->a:Lk4/k;

    invoke-direct {v13, v14, v7, v15, v12}, Lk4/e;-><init>(Lk4/o;Ls4/n;Lu9/i;Lk4/k;)V

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    new-instance v12, Lq8/f;

    invoke-direct {v12, v13, v9}, Lq8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    move-object v12, v5

    :goto_2
    if-eqz v12, :cond_8

    iget-object v9, v12, Lq8/f;->a:Ljava/lang/Object;

    check-cast v9, Lk4/h;

    iget-object v12, v12, Lq8/f;->b:Ljava/lang/Object;

    check-cast v12, Ljava/lang/Number;

    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    move-result v12

    add-int/2addr v12, v6

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v2, v10, Ln4/b;->a:Ln4/i;

    iput-object v0, v10, Ln4/b;->b:Lm4/n;

    iput-object v1, v10, Ln4/b;->c:Li4/c;

    iput-object v3, v10, Ln4/b;->d:Ls4/j;

    iput-object v4, v10, Ln4/b;->e:Ljava/lang/Object;

    iput-object v7, v10, Ln4/b;->f:Ls4/n;

    iput-object v8, v10, Ln4/b;->n:Li4/e;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput v12, v10, Ln4/b;->o:I

    iput v6, v10, Ln4/b;->r:I

    check-cast v9, Lk4/e;

    invoke-virtual {v9, v10}, Lk4/e;->a(Lu8/e;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v11, :cond_4

    goto :goto_5

    :cond_4
    move-object/from16 v16, v11

    move-object v11, v0

    move-object v0, v9

    move v9, v12

    move-object/from16 v12, v16

    :goto_3
    check-cast v0, Lk4/g;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v0, :cond_7

    new-instance v1, Ln4/a;

    iget-object v2, v11, Lm4/n;->c:Lk4/f;

    iget-object v3, v11, Lm4/n;->a:Lk4/o;

    instance-of v4, v3, Lk4/n;

    if-eqz v4, :cond_5

    check-cast v3, Lk4/n;

    goto :goto_4

    :cond_5
    move-object v3, v5

    :goto_4
    if-eqz v3, :cond_6

    iget-object v5, v3, Lk4/n;->c:Ljava/lang/String;

    :cond_6
    iget-object v3, v0, Lk4/g;->a:Landroid/graphics/drawable/Drawable;

    iget-boolean v0, v0, Lk4/g;->b:Z

    invoke-direct {v1, v3, v0, v2, v5}, Ln4/a;-><init>(Landroid/graphics/drawable/Drawable;ZLk4/f;Ljava/lang/String;)V

    move-object v11, v1

    :goto_5
    return-object v11

    :cond_7
    move-object v0, v11

    move-object v11, v12

    goto/16 :goto_1

    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unable to create a decoder that supports: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static final b(Ln4/i;Ls4/j;Ljava/lang/Object;Ls4/n;Li4/e;Lu8/e;)Ljava/lang/Object;
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v8, p1

    move-object/from16 v1, p5

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v2, v1, Ln4/c;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Ln4/c;

    iget v3, v2, Ln4/c;->r:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Ln4/c;->r:I

    :goto_0
    move-object v9, v2

    goto :goto_1

    :cond_0
    new-instance v2, Ln4/c;

    invoke-direct {v2, v0, v1}, Ln4/c;-><init>(Ln4/i;Lu8/e;)V

    goto :goto_0

    :goto_1
    iget-object v1, v9, Ln4/c;->p:Ljava/lang/Object;

    sget-object v10, Lv8/a;->a:Lv8/a;

    iget v2, v9, Ln4/c;->r:I

    const/4 v11, 0x3

    const/4 v12, 0x2

    const/4 v3, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v3, :cond_3

    if-eq v2, v12, :cond_2

    if-ne v2, v11, :cond_1

    invoke-static {v1}, Ld7/t;->v0(Ljava/lang/Object;)V

    const/4 v3, 0x0

    goto/16 :goto_9

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v2, v9, Ln4/c;->e:Ld9/u;

    iget-object v0, v9, Ln4/c;->d:Ljava/lang/Object;

    check-cast v0, Ld9/u;

    iget-object v3, v9, Ln4/c;->c:Ljava/lang/Object;

    check-cast v3, Li4/e;

    iget-object v4, v9, Ln4/c;->b:Ls4/j;

    iget-object v5, v9, Ln4/c;->a:Ln4/i;

    :try_start_0
    invoke-static {v1}, Ld7/t;->v0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_5

    :catchall_0
    move-exception v0

    :goto_2
    const/4 v3, 0x0

    goto/16 :goto_e

    :cond_3
    iget-object v0, v9, Ln4/c;->o:Ld9/u;

    iget-object v2, v9, Ln4/c;->n:Ld9/u;

    iget-object v3, v9, Ln4/c;->f:Ld9/u;

    iget-object v4, v9, Ln4/c;->e:Ld9/u;

    iget-object v5, v9, Ln4/c;->d:Ljava/lang/Object;

    check-cast v5, Li4/e;

    iget-object v6, v9, Ln4/c;->c:Ljava/lang/Object;

    iget-object v7, v9, Ln4/c;->b:Ls4/j;

    iget-object v8, v9, Ln4/c;->a:Ln4/i;

    :try_start_1
    invoke-static {v1}, Ld7/t;->v0(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v13, v0

    move-object/from16 v21, v3

    move-object v14, v4

    move-object v12, v5

    move-object/from16 v23, v6

    move-object v0, v8

    goto/16 :goto_4

    :cond_4
    invoke-static {v1}, Ld7/t;->v0(Ljava/lang/Object;)V

    new-instance v14, Ld9/u;

    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    move-object/from16 v1, p3

    iput-object v1, v14, Ld9/u;->a:Ljava/lang/Object;

    new-instance v15, Ld9/u;

    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    iget-object v1, v0, Ln4/i;->a:Li4/i;

    check-cast v1, Li4/o;

    iget-object v1, v1, Li4/o;->d:Li4/c;

    iput-object v1, v15, Ld9/u;->a:Ljava/lang/Object;

    new-instance v7, Ld9/u;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    :try_start_2
    iget-object v1, v0, Ln4/i;->b:Ll/z2;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_6

    :try_start_3
    iget-object v2, v14, Ld9/u;->a:Ljava/lang/Object;

    check-cast v2, Ls4/n;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_5

    :try_start_4
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v2, Ls4/n;->b:Landroid/graphics/Bitmap$Config;

    sget-object v4, Landroid/graphics/Bitmap$Config;->HARDWARE:Landroid/graphics/Bitmap$Config;

    if-ne v2, v4, :cond_6

    iget-object v1, v1, Ll/z2;->d:Ljava/lang/Object;

    check-cast v1, Lw4/i;

    invoke-interface {v1}, Lw4/i;->a()Z

    move-result v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_7

    if-eqz v1, :cond_5

    goto :goto_3

    :cond_5
    :try_start_5
    iget-object v1, v14, Ld9/u;->a:Ljava/lang/Object;

    check-cast v1, Ls4/n;

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v1, v2}, Ls4/n;->a(Ls4/n;Landroid/graphics/Bitmap$Config;)Ls4/n;

    move-result-object v1

    iput-object v1, v14, Ld9/u;->a:Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object v2, v7

    goto :goto_2

    :cond_6
    :goto_3
    :try_start_6
    iget-object v1, v8, Ls4/j;->j:Lq8/f;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    iget-object v2, v8, Ls4/j;->k:Lk4/c;

    if-nez v1, :cond_7

    if-eqz v2, :cond_a

    :cond_7
    :try_start_7
    iget-object v1, v15, Ld9/u;->a:Ljava/lang/Object;

    check-cast v1, Li4/c;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    :try_start_8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v4, v1, Li4/c;->a:Ljava/util/List;

    check-cast v4, Ljava/util/Collection;

    invoke-static {v4}, Lr8/p;->Y0(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v4

    iget-object v5, v1, Li4/c;->b:Ljava/util/List;

    check-cast v5, Ljava/util/Collection;

    invoke-static {v5}, Lr8/p;->Y0(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v5

    iget-object v6, v1, Li4/c;->c:Ljava/util/List;

    check-cast v6, Ljava/util/Collection;

    invoke-static {v6}, Lr8/p;->Y0(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v6

    iget-object v11, v1, Li4/c;->d:Ljava/util/List;

    check-cast v11, Ljava/util/Collection;

    invoke-static {v11}, Lr8/p;->Y0(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v11

    iget-object v1, v1, Li4/c;->e:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-static {v1}, Lr8/p;->Y0(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v1

    iget-object v12, v8, Ls4/j;->j:Lq8/f;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    const/4 v13, 0x0

    if-eqz v12, :cond_8

    :try_start_9
    invoke-virtual {v11, v13, v12}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    :cond_8
    if-eqz v2, :cond_9

    invoke-virtual {v1, v13, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    :cond_9
    :try_start_a
    new-instance v2, Li4/c;

    invoke-static {v4}, Ly3/e;->F0(Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object v19

    invoke-static {v5}, Ly3/e;->F0(Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object v20

    invoke-static {v6}, Ly3/e;->F0(Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object v21

    invoke-static {v11}, Ly3/e;->F0(Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object v22

    invoke-static {v1}, Ly3/e;->F0(Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object v23

    move-object/from16 v18, v2

    invoke-direct/range {v18 .. v23}, Li4/c;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    :try_start_b
    iput-object v2, v15, Ld9/u;->a:Ljava/lang/Object;

    :cond_a
    iget-object v1, v15, Ld9/u;->a:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Li4/c;

    iget-object v1, v14, Ld9/u;->a:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Ls4/n;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    :try_start_c
    iput-object v0, v9, Ln4/c;->a:Ln4/i;

    iput-object v8, v9, Ln4/c;->b:Ls4/j;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    move-object/from16 v11, p2

    :try_start_d
    iput-object v11, v9, Ln4/c;->c:Ljava/lang/Object;

    move-object/from16 v12, p4

    iput-object v12, v9, Ln4/c;->d:Ljava/lang/Object;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    :try_start_e
    iput-object v14, v9, Ln4/c;->e:Ld9/u;

    iput-object v15, v9, Ln4/c;->f:Ld9/u;

    iput-object v7, v9, Ln4/c;->n:Ld9/u;

    iput-object v7, v9, Ln4/c;->o:Ld9/u;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    :try_start_f
    iput v3, v9, Ln4/c;->r:I
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v6, p4

    move-object v13, v7

    move-object v7, v9

    :try_start_10
    invoke-virtual/range {v1 .. v7}, Ln4/i;->c(Li4/c;Ls4/j;Ljava/lang/Object;Ls4/n;Li4/e;Lu8/e;)Ljava/lang/Object;

    move-result-object v1
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_4

    if-ne v1, v10, :cond_b

    goto/16 :goto_b

    :cond_b
    move-object v7, v8

    move-object/from16 v23, v11

    move-object v2, v13

    move-object/from16 v21, v15

    :goto_4
    :try_start_11
    iput-object v1, v13, Ld9/u;->a:Ljava/lang/Object;

    iget-object v1, v2, Ld9/u;->a:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Lm4/e;

    instance-of v4, v3, Lm4/n;

    if-eqz v4, :cond_d

    iget-object v1, v7, Ls4/j;->y:Lm9/z;

    new-instance v3, Ln4/d;

    const/16 v26, 0x0

    move-object/from16 v18, v3

    move-object/from16 v19, v0

    move-object/from16 v20, v2

    move-object/from16 v22, v7

    move-object/from16 v24, v14

    move-object/from16 v25, v12

    invoke-direct/range {v18 .. v26}, Ln4/d;-><init>(Ln4/i;Ld9/u;Ld9/u;Ls4/j;Ljava/lang/Object;Ld9/u;Li4/e;Lu8/e;)V

    iput-object v0, v9, Ln4/c;->a:Ln4/i;

    iput-object v7, v9, Ln4/c;->b:Ls4/j;

    iput-object v12, v9, Ln4/c;->c:Ljava/lang/Object;

    iput-object v14, v9, Ln4/c;->d:Ljava/lang/Object;

    iput-object v2, v9, Ln4/c;->e:Ld9/u;

    const/4 v4, 0x0

    iput-object v4, v9, Ln4/c;->f:Ld9/u;

    iput-object v4, v9, Ln4/c;->n:Ld9/u;

    iput-object v4, v9, Ln4/c;->o:Ld9/u;

    const/4 v4, 0x2

    iput v4, v9, Ln4/c;->r:I

    invoke-static {v1, v3, v9}, Lz6/a;->u0(Lu8/j;Lc9/e;Lu8/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v10, :cond_c

    goto/16 :goto_b

    :cond_c
    move-object v5, v0

    move-object v4, v7

    move-object v3, v12

    move-object v0, v14

    :goto_5
    check-cast v1, Ln4/a;

    move-object v14, v0

    move-object/from16 v20, v3

    move-object v7, v4

    move-object/from16 v16, v5

    goto :goto_6

    :cond_d
    instance-of v3, v3, Lm4/d;

    if-eqz v3, :cond_15

    new-instance v3, Ln4/a;

    move-object v4, v1

    check-cast v4, Lm4/d;

    iget-object v4, v4, Lm4/d;->a:Landroid/graphics/drawable/Drawable;

    move-object v5, v1

    check-cast v5, Lm4/d;

    iget-boolean v5, v5, Lm4/d;->b:Z

    check-cast v1, Lm4/d;

    iget-object v1, v1, Lm4/d;->c:Lk4/f;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    const/4 v6, 0x0

    :try_start_12
    invoke-direct {v3, v4, v5, v1, v6}, Ln4/a;-><init>(Landroid/graphics/drawable/Drawable;ZLk4/f;Ljava/lang/String;)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_2

    move-object/from16 v16, v0

    move-object v1, v3

    move-object/from16 v20, v12

    :goto_6
    iget-object v0, v2, Ld9/u;->a:Ljava/lang/Object;

    instance-of v2, v0, Lm4/n;

    if-eqz v2, :cond_e

    move-object v4, v0

    check-cast v4, Lm4/n;

    goto :goto_7

    :cond_e
    const/4 v4, 0x0

    :goto_7
    if-eqz v4, :cond_f

    iget-object v0, v4, Lm4/n;->a:Lk4/o;

    if-eqz v0, :cond_f

    invoke-static {v0}, Lw4/e;->a(Ljava/io/Closeable;)V

    :cond_f
    iget-object v0, v14, Ld9/u;->a:Ljava/lang/Object;

    move-object/from16 v18, v0

    check-cast v18, Ls4/n;

    const/4 v3, 0x0

    iput-object v3, v9, Ln4/c;->a:Ln4/i;

    iput-object v3, v9, Ln4/c;->b:Ls4/j;

    iput-object v3, v9, Ln4/c;->c:Ljava/lang/Object;

    iput-object v3, v9, Ln4/c;->d:Ljava/lang/Object;

    iput-object v3, v9, Ln4/c;->e:Ld9/u;

    iput-object v3, v9, Ln4/c;->f:Ld9/u;

    iput-object v3, v9, Ln4/c;->n:Ld9/u;

    iput-object v3, v9, Ln4/c;->o:Ld9/u;

    const/4 v0, 0x3

    iput v0, v9, Ln4/c;->r:I

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v7, Ls4/j;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_10

    goto :goto_8

    :cond_10
    iget-object v2, v1, Ln4/a;->a:Landroid/graphics/drawable/Drawable;

    instance-of v2, v2, Landroid/graphics/drawable/BitmapDrawable;

    if-nez v2, :cond_11

    iget-boolean v2, v7, Ls4/j;->p:Z

    if-nez v2, :cond_11

    goto :goto_8

    :cond_11
    new-instance v2, Ln4/h;

    const/16 v22, 0x0

    move-object v15, v2

    move-object/from16 v17, v1

    move-object/from16 v19, v0

    move-object/from16 v21, v7

    invoke-direct/range {v15 .. v22}, Ln4/h;-><init>(Ln4/i;Ln4/a;Ls4/n;Ljava/util/List;Li4/e;Ls4/j;Lu8/e;)V

    iget-object v0, v7, Ls4/j;->z:Lm9/z;

    invoke-static {v0, v2, v9}, Lz6/a;->u0(Lu8/j;Lc9/e;Lu8/e;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    :goto_8
    if-ne v1, v10, :cond_12

    goto :goto_b

    :cond_12
    :goto_9
    move-object v10, v1

    check-cast v10, Ln4/a;

    iget-object v0, v10, Ln4/a;->a:Landroid/graphics/drawable/Drawable;

    instance-of v1, v0, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v1, :cond_13

    move-object v13, v0

    check-cast v13, Landroid/graphics/drawable/BitmapDrawable;

    goto :goto_a

    :cond_13
    move-object v13, v3

    :goto_a
    if-eqz v13, :cond_14

    invoke-virtual {v13}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_14

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->prepareToDraw()V

    :cond_14
    :goto_b
    return-object v10

    :catchall_2
    move-exception v0

    move-object v3, v6

    goto :goto_e

    :cond_15
    const/4 v3, 0x0

    :try_start_13
    new-instance v0, Landroidx/fragment/app/a0;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_3

    :catchall_3
    move-exception v0

    goto :goto_e

    :catchall_4
    move-exception v0

    :goto_c
    const/4 v3, 0x0

    move-object v2, v13

    goto :goto_e

    :catchall_5
    move-exception v0

    move-object v13, v7

    goto :goto_c

    :catchall_6
    move-exception v0

    :goto_d
    move-object v13, v7

    goto :goto_c

    :catchall_7
    move-exception v0

    goto :goto_d

    :goto_e
    iget-object v1, v2, Ld9/u;->a:Ljava/lang/Object;

    instance-of v2, v1, Lm4/n;

    if-eqz v2, :cond_16

    move-object v13, v1

    check-cast v13, Lm4/n;

    goto :goto_f

    :cond_16
    move-object v13, v3

    :goto_f
    if-eqz v13, :cond_17

    iget-object v1, v13, Lm4/n;->a:Lk4/o;

    if-eqz v1, :cond_17

    invoke-static {v1}, Lw4/e;->a(Ljava/io/Closeable;)V

    :cond_17
    throw v0
.end method


# virtual methods
.method public final c(Li4/c;Ls4/j;Ljava/lang/Object;Ls4/n;Li4/e;Lu8/e;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p6

    instance-of v1, v0, Ln4/e;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ln4/e;

    iget v2, v1, Ln4/e;->q:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Ln4/e;->q:I

    move-object/from16 v2, p0

    goto :goto_0

    :cond_0
    new-instance v1, Ln4/e;

    move-object/from16 v2, p0

    invoke-direct {v1, v2, v0}, Ln4/e;-><init>(Ln4/i;Lu8/e;)V

    :goto_0
    iget-object v0, v1, Ln4/e;->o:Ljava/lang/Object;

    sget-object v3, Lv8/a;->a:Lv8/a;

    iget v4, v1, Ln4/e;->q:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget v4, v1, Ln4/e;->n:I

    iget-object v7, v1, Ln4/e;->f:Li4/e;

    iget-object v8, v1, Ln4/e;->e:Ls4/n;

    iget-object v9, v1, Ln4/e;->d:Ljava/lang/Object;

    iget-object v10, v1, Ln4/e;->c:Ls4/j;

    iget-object v11, v1, Ln4/e;->b:Li4/c;

    iget-object v12, v1, Ln4/e;->a:Ln4/i;

    invoke-static {v0}, Ld7/t;->v0(Ljava/lang/Object;)V

    move v6, v4

    move-object v4, v8

    move v8, v5

    move-object/from16 v16, v9

    move-object v9, v1

    move-object v1, v10

    move-object v10, v3

    move-object/from16 v3, v16

    goto/16 :goto_4

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Ld7/t;->v0(Ljava/lang/Object;)V

    const/4 v0, 0x0

    move-object/from16 v4, p4

    move-object/from16 v7, p5

    move v8, v0

    move-object v9, v1

    move-object v12, v2

    move-object v10, v3

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v3, p3

    :goto_1
    iget-object v11, v12, Ln4/i;->a:Li4/i;

    iget-object v13, v0, Li4/c;->d:Ljava/util/List;

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v14

    :goto_2
    if-ge v8, v14, :cond_4

    invoke-interface {v13, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lq8/f;

    iget-object v6, v15, Lq8/f;->a:Ljava/lang/Object;

    check-cast v6, Lm4/f;

    iget-object v15, v15, Lq8/f;->b:Ljava/lang/Object;

    check-cast v15, Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v15, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_3

    const-string v5, "null cannot be cast to non-null type coil.fetch.Fetcher.Factory<kotlin.Any>"

    invoke-static {v6, v5}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v6, v3, v4, v11}, Lm4/f;->a(Ljava/lang/Object;Ls4/n;Li4/i;)Lm4/g;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    new-instance v8, Lq8/f;

    invoke-direct {v8, v5, v6}, Lq8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    add-int/lit8 v8, v8, 0x1

    const/4 v5, 0x1

    goto :goto_2

    :cond_4
    const/4 v8, 0x0

    :goto_3
    if-eqz v8, :cond_9

    iget-object v5, v8, Lq8/f;->a:Ljava/lang/Object;

    check-cast v5, Lm4/g;

    iget-object v6, v8, Lq8/f;->b:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    const/4 v8, 0x1

    add-int/2addr v6, v8

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v12, v9, Ln4/e;->a:Ln4/i;

    iput-object v0, v9, Ln4/e;->b:Li4/c;

    iput-object v1, v9, Ln4/e;->c:Ls4/j;

    iput-object v3, v9, Ln4/e;->d:Ljava/lang/Object;

    iput-object v4, v9, Ln4/e;->e:Ls4/n;

    iput-object v7, v9, Ln4/e;->f:Li4/e;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput v6, v9, Ln4/e;->n:I

    iput v8, v9, Ln4/e;->q:I

    invoke-interface {v5, v9}, Lm4/g;->a(Lu8/e;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v10, :cond_5

    return-object v10

    :cond_5
    move-object v11, v0

    move-object v0, v5

    :goto_4
    move-object v5, v0

    check-cast v5, Lm4/e;

    :try_start_0
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v5, :cond_6

    return-object v5

    :cond_6
    move v5, v8

    move-object v0, v11

    move v8, v6

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object v1, v0

    instance-of v0, v5, Lm4/n;

    if-eqz v0, :cond_7

    move-object v6, v5

    check-cast v6, Lm4/n;

    goto :goto_5

    :cond_7
    const/4 v6, 0x0

    :goto_5
    if-eqz v6, :cond_8

    iget-object v0, v6, Lm4/n;->a:Lk4/o;

    if-eqz v0, :cond_8

    invoke-static {v0}, Lw4/e;->a(Ljava/io/Closeable;)V

    :cond_8
    throw v1

    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unable to create a fetcher that supports: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final d(Ln4/l;Lu8/e;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v10, p0

    move-object/from16 v11, p1

    move-object/from16 v0, p2

    iget-object v1, v10, Ln4/i;->c:Lq4/e;

    instance-of v2, v0, Ln4/f;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Ln4/f;

    iget v3, v2, Ln4/f;->e:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Ln4/f;->e:I

    :goto_0
    move-object v0, v2

    goto :goto_1

    :cond_0
    new-instance v2, Ln4/f;

    invoke-direct {v2, v10, v0}, Ln4/f;-><init>(Ln4/i;Lu8/e;)V

    goto :goto_0

    :goto_1
    iget-object v2, v0, Ln4/f;->c:Ljava/lang/Object;

    sget-object v12, Lv8/a;->a:Lv8/a;

    iget v3, v0, Ln4/f;->e:I

    const/4 v13, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v13, :cond_1

    iget-object v1, v0, Ln4/f;->b:Ln4/l;

    iget-object v3, v0, Ln4/f;->a:Ln4/i;

    :try_start_0
    invoke-static {v2}, Ld7/t;->v0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v0

    move-object v11, v1

    goto :goto_4

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v2}, Ld7/t;->v0(Ljava/lang/Object;)V

    :try_start_1
    iget-object v3, v11, Ln4/l;->d:Ls4/j;

    iget-object v2, v3, Ls4/j;->b:Ljava/lang/Object;

    iget-object v4, v11, Ln4/l;->e:Lt4/f;

    sget-object v5, Lw4/e;->a:[Landroid/graphics/Bitmap$Config;

    iget-object v6, v11, Ln4/l;->f:Li4/e;

    iget-object v5, v10, Ln4/i;->b:Ll/z2;

    invoke-virtual {v5, v3, v4}, Ll/z2;->J(Ls4/j;Lt4/f;)Ls4/n;

    move-result-object v5

    iget-object v7, v5, Ls4/n;->e:Lt4/e;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v8, v10, Ln4/i;->a:Li4/i;

    check-cast v8, Li4/o;

    iget-object v8, v8, Li4/o;->d:Li4/c;

    invoke-virtual {v8, v2, v5}, Li4/c;->a(Ljava/lang/Object;Ls4/n;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v1, v3, v8, v5, v6}, Lq4/e;->b(Ls4/j;Ljava/lang/Object;Ls4/n;Li4/e;)Lq4/c;

    move-result-object v9

    if-eqz v9, :cond_3

    invoke-virtual {v1, v3, v9, v4, v7}, Lq4/e;->a(Ls4/j;Lq4/c;Lt4/f;Lt4/e;)Lq4/d;

    move-result-object v1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object v3, v10

    goto :goto_4

    :cond_3
    const/4 v1, 0x0

    :goto_2
    if-eqz v1, :cond_4

    invoke-static {v11, v3, v9, v1}, Lq4/e;->c(Ln4/l;Ls4/j;Lq4/c;Lq4/d;)Ls4/q;

    move-result-object v0

    return-object v0

    :cond_4
    iget-object v14, v3, Ls4/j;->x:Lm9/z;

    new-instance v15, Ln4/g;

    const/16 v16, 0x0

    move-object v1, v15

    move-object/from16 v2, p0

    move-object v4, v8

    move-object v7, v9

    move-object/from16 v8, p1

    move-object/from16 v9, v16

    invoke-direct/range {v1 .. v9}, Ln4/g;-><init>(Ln4/i;Ls4/j;Ljava/lang/Object;Ls4/n;Li4/e;Lq4/c;Ln4/l;Lu8/e;)V

    iput-object v10, v0, Ln4/f;->a:Ln4/i;

    iput-object v11, v0, Ln4/f;->b:Ln4/l;

    iput v13, v0, Ln4/f;->e:I

    invoke-static {v14, v15, v0}, Lz6/a;->u0(Lu8/j;Lc9/e;Lu8/e;)Ljava/lang/Object;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v2, v12, :cond_5

    return-object v12

    :cond_5
    :goto_3
    return-object v2

    :goto_4
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    if-nez v1, :cond_6

    iget-object v1, v3, Ln4/i;->b:Ll/z2;

    iget-object v2, v11, Ln4/l;->d:Ls4/j;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v0}, Ll/z2;->o(Ls4/j;Ljava/lang/Throwable;)Ls4/e;

    move-result-object v0

    return-object v0

    :cond_6
    throw v0
.end method
