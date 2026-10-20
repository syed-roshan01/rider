.class public final Li4/o;
.super Ljava/lang/Object;

# interfaces
.implements Li4/i;


# instance fields
.field public final a:Ls4/c;

.field public final b:Lq8/c;

.field public final c:Ll/z2;

.field public final d:Li4/c;

.field public final e:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ls4/c;Lq8/i;Lq8/i;Lq8/i;Li4/c;Lw4/j;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p7

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v3, p2

    iput-object v3, v0, Li4/o;->a:Ls4/c;

    move-object/from16 v3, p3

    iput-object v3, v0, Li4/o;->b:Lq8/c;

    invoke-static {}, Ld7/t;->k()Lm9/y1;

    move-result-object v3

    sget-object v4, Lm9/m0;->a:Lt9/d;

    sget-object v4, Lr9/o;->a:Lm9/s1;

    check-cast v4, Ln9/d;

    iget-object v4, v4, Ln9/d;->f:Ln9/d;

    invoke-virtual {v3, v4}, Lm9/p1;->O(Lu8/j;)Lu8/j;

    move-result-object v3

    new-instance v4, Li4/n;

    invoke-direct {v4, v0}, Li4/n;-><init>(Li4/o;)V

    invoke-interface {v3, v4}, Lu8/j;->O(Lu8/j;)Lu8/j;

    move-result-object v3

    invoke-static {v3}, Ld7/a;->b(Lu8/j;)Lr9/e;

    new-instance v3, Lw4/l;

    iget-boolean v4, v2, Lw4/j;->b:Z

    invoke-direct {v3, v0, v1, v4}, Lw4/l;-><init>(Li4/o;Landroid/content/Context;Z)V

    new-instance v4, Ll/z2;

    invoke-direct {v4, v0, v3}, Ll/z2;-><init>(Li4/i;Lw4/l;)V

    iput-object v4, v0, Li4/o;->c:Ll/z2;

    new-instance v5, Li4/b;

    move-object/from16 v6, p6

    invoke-direct {v5, v6}, Li4/b;-><init>(Li4/c;)V

    new-instance v6, Lp4/a;

    const/4 v7, 0x2

    invoke-direct {v6, v7}, Lp4/a;-><init>(I)V

    const-class v8, Lx9/s;

    invoke-virtual {v5, v6, v8}, Li4/b;->b(Lp4/a;Ljava/lang/Class;)V

    new-instance v6, Lp4/a;

    const/4 v8, 0x5

    invoke-direct {v6, v8}, Lp4/a;-><init>(I)V

    const-class v9, Ljava/lang/String;

    invoke-virtual {v5, v6, v9}, Li4/b;->b(Lp4/a;Ljava/lang/Class;)V

    new-instance v6, Lp4/a;

    const/4 v9, 0x1

    invoke-direct {v6, v9}, Lp4/a;-><init>(I)V

    const-class v10, Landroid/net/Uri;

    invoke-virtual {v5, v6, v10}, Li4/b;->b(Lp4/a;Ljava/lang/Class;)V

    new-instance v6, Lp4/a;

    const/4 v11, 0x4

    invoke-direct {v6, v11}, Lp4/a;-><init>(I)V

    invoke-virtual {v5, v6, v10}, Li4/b;->b(Lp4/a;Ljava/lang/Class;)V

    new-instance v6, Lp4/a;

    const/4 v12, 0x3

    invoke-direct {v6, v12}, Lp4/a;-><init>(I)V

    const-class v13, Ljava/lang/Integer;

    invoke-virtual {v5, v6, v13}, Li4/b;->b(Lp4/a;Ljava/lang/Class;)V

    new-instance v6, Lp4/a;

    const/4 v13, 0x0

    invoke-direct {v6, v13}, Lp4/a;-><init>(I)V

    const-class v14, [B

    invoke-virtual {v5, v6, v14}, Li4/b;->b(Lp4/a;Ljava/lang/Class;)V

    new-instance v6, Lo4/c;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    iget-object v14, v5, Li4/b;->c:Ljava/util/ArrayList;

    new-instance v15, Lq8/f;

    invoke-direct {v15, v6, v10}, Lq8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v6, Lo4/a;

    iget-boolean v15, v2, Lw4/j;->a:Z

    invoke-direct {v6, v15}, Lo4/a;-><init>(Z)V

    new-instance v15, Lq8/f;

    const-class v7, Ljava/io/File;

    invoke-direct {v15, v6, v7}, Lq8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v6, Lm4/i;

    iget-boolean v15, v2, Lw4/j;->c:Z

    move-object/from16 v9, p4

    move-object/from16 v11, p5

    invoke-direct {v6, v11, v9, v15}, Lm4/i;-><init>(Lq8/i;Lq8/i;Z)V

    invoke-virtual {v5, v6, v10}, Li4/b;->a(Lm4/f;Ljava/lang/Class;)V

    new-instance v6, Lm4/a;

    invoke-direct {v6, v8}, Lm4/a;-><init>(I)V

    invoke-virtual {v5, v6, v7}, Li4/b;->a(Lm4/f;Ljava/lang/Class;)V

    new-instance v6, Lm4/a;

    invoke-direct {v6, v13}, Lm4/a;-><init>(I)V

    invoke-virtual {v5, v6, v10}, Li4/b;->a(Lm4/f;Ljava/lang/Class;)V

    new-instance v6, Lm4/a;

    invoke-direct {v6, v12}, Lm4/a;-><init>(I)V

    invoke-virtual {v5, v6, v10}, Li4/b;->a(Lm4/f;Ljava/lang/Class;)V

    new-instance v6, Lm4/a;

    const/4 v7, 0x6

    invoke-direct {v6, v7}, Lm4/a;-><init>(I)V

    invoke-virtual {v5, v6, v10}, Li4/b;->a(Lm4/f;Ljava/lang/Class;)V

    new-instance v6, Lm4/a;

    const/4 v7, 0x4

    invoke-direct {v6, v7}, Lm4/a;-><init>(I)V

    const-class v7, Landroid/graphics/drawable/Drawable;

    invoke-virtual {v5, v6, v7}, Li4/b;->a(Lm4/f;Ljava/lang/Class;)V

    new-instance v6, Lm4/a;

    const/4 v7, 0x1

    invoke-direct {v6, v7}, Lm4/a;-><init>(I)V

    const-class v7, Landroid/graphics/Bitmap;

    invoke-virtual {v5, v6, v7}, Li4/b;->a(Lm4/f;Ljava/lang/Class;)V

    new-instance v6, Lm4/a;

    const/4 v7, 0x2

    invoke-direct {v6, v7}, Lm4/a;-><init>(I)V

    const-class v7, Ljava/nio/ByteBuffer;

    invoke-virtual {v5, v6, v7}, Li4/b;->a(Lm4/f;Ljava/lang/Class;)V

    new-instance v6, Lk4/c;

    iget v7, v2, Lw4/j;->d:I

    iget-object v2, v2, Lw4/j;->e:Lk4/k;

    invoke-direct {v6, v7, v2}, Lk4/c;-><init>(ILk4/k;)V

    iget-object v2, v5, Li4/b;->e:Ljava/util/ArrayList;

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v6, Li4/c;

    iget-object v7, v5, Li4/b;->a:Ljava/util/ArrayList;

    invoke-static {v7}, Ly3/e;->F0(Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object v7

    iget-object v8, v5, Li4/b;->b:Ljava/util/ArrayList;

    invoke-static {v8}, Ly3/e;->F0(Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object v8

    invoke-static {v14}, Ly3/e;->F0(Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object v9

    iget-object v5, v5, Li4/b;->d:Ljava/util/ArrayList;

    invoke-static {v5}, Ly3/e;->F0(Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object v5

    invoke-static {v2}, Ly3/e;->F0(Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object v2

    move-object/from16 p2, v6

    move-object/from16 p3, v7

    move-object/from16 p4, v8

    move-object/from16 p5, v9

    move-object/from16 p6, v5

    move-object/from16 p7, v2

    invoke-direct/range {p2 .. p7}, Li4/c;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    iput-object v6, v0, Li4/o;->d:Li4/c;

    check-cast v7, Ljava/util/Collection;

    new-instance v2, Ln4/i;

    invoke-direct {v2, v0, v4}, Ln4/i;-><init>(Li4/i;Ll/z2;)V

    invoke-static {v7, v2}, Lr8/p;->Q0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v2

    iput-object v2, v0, Li4/o;->e:Ljava/util/ArrayList;

    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v2, v13}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    invoke-virtual {v1, v3}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    return-void
.end method

.method public static final a(Li4/o;Ls4/j;ILu8/e;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v1, p0

    move-object/from16 v0, p3

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v2, v0, Li4/l;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Li4/l;

    iget v3, v2, Li4/l;->o:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Li4/l;->o:I

    goto :goto_0

    :cond_0
    new-instance v2, Li4/l;

    invoke-direct {v2, v1, v0}, Li4/l;-><init>(Li4/o;Lu8/e;)V

    :goto_0
    iget-object v0, v2, Li4/l;->f:Ljava/lang/Object;

    sget-object v3, Lv8/a;->a:Lv8/a;

    iget v4, v2, Li4/l;->o:I

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v4, :cond_4

    if-eq v4, v7, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v1, v2, Li4/l;->d:Li4/e;

    iget-object v3, v2, Li4/l;->c:Ls4/j;

    iget-object v4, v2, Li4/l;->b:Ls4/p;

    iget-object v2, v2, Li4/l;->a:Li4/o;

    :try_start_0
    invoke-static {v0}, Ld7/t;->v0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v7, v4

    move-object v4, v1

    move-object v1, v2

    goto/16 :goto_9

    :catchall_0
    move-exception v0

    move-object v11, v1

    move-object v1, v2

    goto/16 :goto_f

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v1, v2, Li4/l;->e:Landroid/graphics/Bitmap;

    iget-object v4, v2, Li4/l;->d:Li4/e;

    iget-object v6, v2, Li4/l;->c:Ls4/j;

    iget-object v7, v2, Li4/l;->b:Ls4/p;

    iget-object v9, v2, Li4/l;->a:Li4/o;

    :try_start_1
    invoke-static {v0}, Ld7/t;->v0(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object/from16 v17, v1

    move-object v1, v9

    goto/16 :goto_8

    :catchall_1
    move-exception v0

    move-object v11, v4

    move-object v3, v6

    :goto_1
    move-object v4, v7

    move-object v1, v9

    goto/16 :goto_f

    :cond_3
    iget-object v1, v2, Li4/l;->d:Li4/e;

    iget-object v4, v2, Li4/l;->c:Ls4/j;

    iget-object v7, v2, Li4/l;->b:Ls4/p;

    iget-object v9, v2, Li4/l;->a:Li4/o;

    :try_start_2
    invoke-static {v0}, Ld7/t;->v0(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-object v11, v1

    move-object v1, v9

    goto :goto_2

    :catchall_2
    move-exception v0

    move-object v11, v1

    move-object v3, v4

    goto :goto_1

    :cond_4
    invoke-static {v0}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object v0, v1, Li4/o;->c:Ll/z2;

    invoke-interface {v2}, Lu8/e;->getContext()Lu8/j;

    move-result-object v4

    invoke-static {v4}, Lh6/g;->g0(Lu8/j;)Lm9/f1;

    move-result-object v4

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v0, p1

    iget-object v9, v0, Ls4/j;->A:Landroidx/lifecycle/r;

    new-instance v10, Ls4/a;

    invoke-direct {v10, v9, v4}, Ls4/a;-><init>(Landroidx/lifecycle/r;Lm9/f1;)V

    invoke-static/range {p1 .. p1}, Ls4/j;->a(Ls4/j;)Ls4/h;

    move-result-object v0

    iget-object v4, v1, Li4/o;->a:Ls4/c;

    iput-object v4, v0, Ls4/h;->b:Ls4/c;

    iput-object v8, v0, Ls4/h;->O:Lt4/e;

    invoke-virtual {v0}, Ls4/h;->a()Ls4/j;

    move-result-object v4

    sget-object v11, Li4/e;->a:Li4/d;

    :try_start_3
    iget-object v0, v4, Ls4/j;->b:Ljava/lang/Object;

    sget-object v12, Ls4/l;->a:Ls4/l;

    if-eq v0, v12, :cond_11

    invoke-virtual {v9, v10}, Landroidx/lifecycle/r;->a(Landroidx/lifecycle/v;)V

    if-nez p2, :cond_5

    iget-object v0, v4, Ls4/j;->A:Landroidx/lifecycle/r;

    iput-object v1, v2, Li4/l;->a:Li4/o;

    iput-object v10, v2, Li4/l;->b:Ls4/p;

    iput-object v4, v2, Li4/l;->c:Ls4/j;

    iput-object v11, v2, Li4/l;->d:Li4/e;

    iput v7, v2, Li4/l;->o:I

    invoke-static {v0, v2}, Lf6/a;->o(Landroidx/lifecycle/r;Lu8/e;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    if-ne v0, v3, :cond_5

    goto/16 :goto_10

    :catchall_3
    move-exception v0

    move-object v3, v4

    move-object v4, v10

    goto/16 :goto_f

    :cond_5
    move-object v7, v10

    :goto_2
    :try_start_4
    iget-object v0, v1, Li4/o;->b:Lq8/c;

    invoke-interface {v0}, Lq8/c;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq4/f;

    if-eqz v0, :cond_8

    iget-object v9, v4, Ls4/j;->E:Lq4/c;

    if-eqz v9, :cond_6

    iget-object v10, v0, Lq4/f;->a:Lq4/l;

    invoke-interface {v10, v9}, Lq4/l;->a(Lq4/c;)Lq4/d;

    move-result-object v10

    if-nez v10, :cond_7

    iget-object v0, v0, Lq4/f;->b:Lq4/m;

    invoke-interface {v0, v9}, Lq4/m;->a(Lq4/c;)Lq4/d;

    move-result-object v10

    goto :goto_5

    :goto_3
    move-object v3, v4

    :goto_4
    move-object v4, v7

    goto/16 :goto_f

    :cond_6
    move-object v10, v8

    :cond_7
    :goto_5
    if-eqz v10, :cond_8

    iget-object v0, v10, Lq4/d;->a:Landroid/graphics/Bitmap;

    goto :goto_6

    :cond_8
    move-object v0, v8

    :goto_6
    if-eqz v0, :cond_9

    iget-object v9, v4, Ls4/j;->a:Landroid/content/Context;

    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    new-instance v10, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v10, v9, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    goto :goto_7

    :catchall_4
    move-exception v0

    goto :goto_3

    :cond_9
    iget-object v9, v4, Ls4/j;->M:Ls4/c;

    iget-object v9, v9, Ls4/c;->j:Landroid/graphics/drawable/Drawable;

    iget-object v10, v4, Ls4/j;->G:Landroid/graphics/drawable/Drawable;

    iget-object v12, v4, Ls4/j;->F:Ljava/lang/Integer;

    invoke-static {v4, v10, v12, v9}, Lw4/d;->b(Ls4/j;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v10

    :goto_7
    iget-object v9, v4, Ls4/j;->c:Lu4/a;

    if-eqz v9, :cond_a

    invoke-interface {v9, v10}, Lu4/a;->a(Landroid/graphics/drawable/Drawable;)V

    :cond_a
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v9, v4, Ls4/j;->B:Lt4/g;

    iput-object v1, v2, Li4/l;->a:Li4/o;

    iput-object v7, v2, Li4/l;->b:Ls4/p;

    iput-object v4, v2, Li4/l;->c:Ls4/j;

    iput-object v11, v2, Li4/l;->d:Li4/e;

    iput-object v0, v2, Li4/l;->e:Landroid/graphics/Bitmap;

    iput v6, v2, Li4/l;->o:I

    invoke-interface {v9, v2}, Lt4/g;->c(Li4/l;)Ljava/lang/Object;

    move-result-object v6
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    if-ne v6, v3, :cond_b

    goto/16 :goto_10

    :cond_b
    move-object/from16 v17, v0

    move-object v0, v6

    move-object v6, v4

    move-object v4, v11

    :goto_8
    :try_start_5
    move-object v15, v0

    check-cast v15, Lt4/f;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v6, Ls4/j;->w:Lm9/z;

    new-instance v9, Li4/m;

    const/16 v18, 0x0

    move-object v12, v9

    move-object v13, v6

    move-object v14, v1

    move-object/from16 v16, v4

    invoke-direct/range {v12 .. v18}, Li4/m;-><init>(Ls4/j;Li4/o;Lt4/f;Li4/e;Landroid/graphics/Bitmap;Lu8/e;)V

    iput-object v1, v2, Li4/l;->a:Li4/o;

    iput-object v7, v2, Li4/l;->b:Ls4/p;

    iput-object v6, v2, Li4/l;->c:Ls4/j;

    iput-object v4, v2, Li4/l;->d:Li4/e;

    iput-object v8, v2, Li4/l;->e:Landroid/graphics/Bitmap;

    iput v5, v2, Li4/l;->o:I

    invoke-static {v0, v9, v2}, Lz6/a;->u0(Lu8/j;Lc9/e;Lu8/e;)Ljava/lang/Object;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    if-ne v0, v3, :cond_c

    goto/16 :goto_10

    :cond_c
    move-object v3, v6

    :goto_9
    :try_start_6
    check-cast v0, Ls4/k;

    instance-of v2, v0, Ls4/q;

    if-eqz v2, :cond_f

    move-object v2, v0

    check-cast v2, Ls4/q;

    iget-object v5, v3, Ls4/j;->c:Lu4/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v2, Ls4/q;->b:Ls4/j;

    instance-of v6, v5, Lj4/m;

    if-nez v6, :cond_d

    if-eqz v5, :cond_e

    :goto_a
    invoke-interface {v5}, Lu4/a;->d()V

    goto :goto_b

    :cond_d
    iget-object v6, v2, Ls4/j;->m:Lv4/b;

    move-object v8, v5

    check-cast v8, Lj4/m;

    check-cast v6, Lv4/a;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_a

    :cond_e
    :goto_b
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v2, Ls4/j;->d:Ls4/i;

    goto :goto_d

    :goto_c
    move-object v11, v4

    goto/16 :goto_4

    :catchall_5
    move-exception v0

    goto :goto_c

    :cond_f
    instance-of v2, v0, Ls4/e;

    if-eqz v2, :cond_10

    move-object v2, v0

    check-cast v2, Ls4/e;

    iget-object v5, v3, Ls4/j;->c:Lu4/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v5, v4}, Li4/o;->b(Ls4/e;Lu4/a;Li4/e;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    :cond_10
    :goto_d
    check-cast v7, Ls4/a;

    iget-object v1, v7, Ls4/a;->a:Landroidx/lifecycle/r;

    invoke-virtual {v1, v7}, Landroidx/lifecycle/r;->c(Landroidx/lifecycle/v;)V

    :goto_e
    move-object v3, v0

    goto :goto_10

    :catchall_6
    move-exception v0

    move-object v11, v4

    move-object v3, v6

    goto/16 :goto_4

    :cond_11
    :try_start_7
    new-instance v0, Ls4/m;

    const-string v2, "The request\'s data is null."

    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :goto_f
    :try_start_8
    instance-of v2, v0, Ljava/util/concurrent/CancellationException;

    if-nez v2, :cond_12

    iget-object v1, v1, Li4/o;->c:Ll/z2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, v0}, Ll/z2;->o(Ls4/j;Ljava/lang/Throwable;)Ls4/e;

    move-result-object v0

    iget-object v1, v3, Ls4/j;->c:Lu4/a;

    invoke-static {v0, v1, v11}, Li4/o;->b(Ls4/e;Lu4/a;Li4/e;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    check-cast v4, Ls4/a;

    iget-object v1, v4, Ls4/a;->a:Landroidx/lifecycle/r;

    invoke-virtual {v1, v4}, Landroidx/lifecycle/r;->c(Landroidx/lifecycle/v;)V

    goto :goto_e

    :goto_10
    return-object v3

    :cond_12
    :try_start_9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v3, Ls4/j;->d:Ls4/i;

    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    :catchall_7
    move-exception v0

    check-cast v4, Ls4/a;

    iget-object v1, v4, Ls4/a;->a:Landroidx/lifecycle/r;

    invoke-virtual {v1, v4}, Landroidx/lifecycle/r;->c(Landroidx/lifecycle/v;)V

    throw v0
.end method

.method public static b(Ls4/e;Lu4/a;Li4/e;)V
    .locals 2

    iget-object p0, p0, Ls4/e;->b:Ls4/j;

    instance-of v0, p1, Lj4/m;

    if-nez v0, :cond_0

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ls4/j;->m:Lv4/b;

    move-object v1, p1

    check-cast v1, Lj4/m;

    check-cast v0, Lv4/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_0
    invoke-interface {p1}, Lu4/a;->b()V

    :cond_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p0, p0, Ls4/j;->d:Ls4/i;

    return-void
.end method
