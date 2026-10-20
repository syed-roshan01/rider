.class public final Lm0/f2;
.super Lw8/i;

# interfaces
.implements Lc9/f;


# instance fields
.field public a:Ljava/util/List;

.field public b:Ljava/util/List;

.field public c:Ljava/util/List;

.field public d:Ljava/util/Set;

.field public e:Ljava/util/Set;

.field public f:Lo0/d;

.field public n:Lo0/d;

.field public o:I

.field public synthetic p:Lm0/a1;

.field public final synthetic q:Lm0/g2;


# direct methods
.method public constructor <init>(Lm0/g2;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lm0/f2;->q:Lm0/g2;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method

.method public static final h(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;Lo0/d;Lo0/d;)V
    .locals 0

    invoke-interface {p0}, Ljava/util/List;->clear()V

    invoke-interface {p1}, Ljava/util/List;->clear()V

    invoke-interface {p2}, Ljava/util/List;->clear()V

    invoke-interface {p3}, Ljava/util/Set;->clear()V

    invoke-interface {p4}, Ljava/util/Set;->clear()V

    invoke-virtual {p5}, Lo0/d;->clear()V

    invoke-virtual {p6}, Lo0/d;->clear()V

    return-void
.end method

.method public static final i(Ljava/util/List;Lm0/g2;)V
    .locals 6

    invoke-interface {p0}, Ljava/util/List;->clear()V

    iget-object v0, p1, Lm0/g2;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p1, Lm0/g2;->j:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lm0/c1;

    move-object v5, p0

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    iget-object p0, p1, Lm0/g2;->j:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p0
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lm9/d0;

    check-cast p2, Lm0/a1;

    check-cast p3, Lu8/e;

    new-instance p1, Lm0/f2;

    iget-object v0, p0, Lm0/f2;->q:Lm0/g2;

    invoke-direct {p1, v0, p3}, Lm0/f2;-><init>(Lm0/g2;Lu8/e;)V

    iput-object p2, p1, Lm0/f2;->p:Lm0/a1;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lm0/f2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v1, p0

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v2, v1, Lm0/f2;->o:I

    const/4 v3, 0x1

    const/4 v4, 0x2

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    if-ne v2, v4, :cond_0

    iget-object v2, v1, Lm0/f2;->n:Lo0/d;

    iget-object v5, v1, Lm0/f2;->f:Lo0/d;

    iget-object v6, v1, Lm0/f2;->e:Ljava/util/Set;

    check-cast v6, Ljava/util/Set;

    iget-object v7, v1, Lm0/f2;->d:Ljava/util/Set;

    check-cast v7, Ljava/util/Set;

    iget-object v8, v1, Lm0/f2;->c:Ljava/util/List;

    check-cast v8, Ljava/util/List;

    iget-object v9, v1, Lm0/f2;->b:Ljava/util/List;

    check-cast v9, Ljava/util/List;

    iget-object v10, v1, Lm0/f2;->a:Ljava/util/List;

    check-cast v10, Ljava/util/List;

    iget-object v11, v1, Lm0/f2;->p:Lm0/a1;

    invoke-static/range {p1 .. p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    move-object v12, v1

    move-object v14, v10

    move-object v10, v5

    move v5, v4

    move-object/from16 v19, v11

    move-object v11, v2

    move-object/from16 v2, v19

    move-object/from16 v20, v9

    move-object v9, v6

    move-object/from16 v6, v20

    move-object/from16 v21, v8

    move-object v8, v7

    move-object/from16 v7, v21

    goto/16 :goto_4

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v2, v1, Lm0/f2;->n:Lo0/d;

    iget-object v5, v1, Lm0/f2;->f:Lo0/d;

    iget-object v6, v1, Lm0/f2;->e:Ljava/util/Set;

    check-cast v6, Ljava/util/Set;

    iget-object v7, v1, Lm0/f2;->d:Ljava/util/Set;

    check-cast v7, Ljava/util/Set;

    iget-object v8, v1, Lm0/f2;->c:Ljava/util/List;

    check-cast v8, Ljava/util/List;

    iget-object v9, v1, Lm0/f2;->b:Ljava/util/List;

    check-cast v9, Ljava/util/List;

    iget-object v10, v1, Lm0/f2;->a:Ljava/util/List;

    check-cast v10, Ljava/util/List;

    iget-object v11, v1, Lm0/f2;->p:Lm0/a1;

    invoke-static/range {p1 .. p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    move-object v12, v2

    move-object v13, v5

    move-object/from16 v18, v6

    move-object/from16 v17, v7

    move-object/from16 v16, v8

    move-object v15, v9

    move-object v14, v10

    move-object v2, v11

    move-object v11, v1

    goto/16 :goto_3

    :cond_2
    invoke-static/range {p1 .. p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object v2, v1, Lm0/f2;->p:Lm0/a1;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    new-instance v8, Ljava/util/LinkedHashSet;

    invoke-direct {v8}, Ljava/util/LinkedHashSet;-><init>()V

    new-instance v9, Ljava/util/LinkedHashSet;

    invoke-direct {v9}, Ljava/util/LinkedHashSet;-><init>()V

    new-instance v10, Lo0/d;

    invoke-direct {v10}, Lo0/d;-><init>()V

    new-instance v11, Lo0/d;

    invoke-direct {v11}, Lo0/d;-><init>()V

    move-object v12, v1

    :goto_0
    iget-object v13, v12, Lm0/f2;->q:Lm0/g2;

    iget-object v13, v13, Lm0/g2;->b:Ljava/lang/Object;

    monitor-enter v13

    monitor-exit v13

    iget-object v13, v12, Lm0/f2;->q:Lm0/g2;

    iput-object v2, v12, Lm0/f2;->p:Lm0/a1;

    move-object v14, v5

    check-cast v14, Ljava/util/List;

    iput-object v14, v12, Lm0/f2;->a:Ljava/util/List;

    move-object v14, v6

    check-cast v14, Ljava/util/List;

    iput-object v14, v12, Lm0/f2;->b:Ljava/util/List;

    move-object v14, v7

    check-cast v14, Ljava/util/List;

    iput-object v14, v12, Lm0/f2;->c:Ljava/util/List;

    move-object v14, v8

    check-cast v14, Ljava/util/Set;

    iput-object v14, v12, Lm0/f2;->d:Ljava/util/Set;

    move-object v14, v9

    check-cast v14, Ljava/util/Set;

    iput-object v14, v12, Lm0/f2;->e:Ljava/util/Set;

    iput-object v10, v12, Lm0/f2;->f:Lo0/d;

    iput-object v11, v12, Lm0/f2;->n:Lo0/d;

    iput v3, v12, Lm0/f2;->o:I

    invoke-virtual {v13}, Lm0/g2;->w()Z

    move-result v14

    if-nez v14, :cond_6

    new-instance v14, Lm9/l;

    invoke-static {v12}, Ld7/t;->b0(Lu8/e;)Lu8/e;

    move-result-object v15

    invoke-direct {v14, v3, v15}, Lm9/l;-><init>(ILu8/e;)V

    invoke-virtual {v14}, Lm9/l;->t()V

    iget-object v15, v13, Lm0/g2;->b:Ljava/lang/Object;

    monitor-enter v15

    :try_start_0
    invoke-virtual {v13}, Lm0/g2;->w()Z

    move-result v16

    if-eqz v16, :cond_3

    move-object v13, v14

    goto :goto_1

    :cond_3
    iput-object v14, v13, Lm0/g2;->o:Lm9/k;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v13, 0x0

    :goto_1
    monitor-exit v15

    if-eqz v13, :cond_4

    sget-object v15, Lq8/l;->a:Lq8/l;

    invoke-virtual {v13, v15}, Lm9/l;->resumeWith(Ljava/lang/Object;)V

    :cond_4
    invoke-virtual {v14}, Lm9/l;->s()Ljava/lang/Object;

    move-result-object v13

    sget-object v14, Lv8/a;->a:Lv8/a;

    if-ne v13, v14, :cond_5

    goto :goto_2

    :cond_5
    sget-object v13, Lq8/l;->a:Lq8/l;

    goto :goto_2

    :catchall_0
    move-exception v0

    monitor-exit v15

    throw v0

    :cond_6
    sget-object v13, Lq8/l;->a:Lq8/l;

    :goto_2
    if-ne v13, v0, :cond_7

    return-object v0

    :cond_7
    move-object v14, v5

    move-object v15, v6

    move-object/from16 v16, v7

    move-object/from16 v17, v8

    move-object/from16 v18, v9

    move-object v13, v10

    move-object/from16 v19, v12

    move-object v12, v11

    move-object/from16 v11, v19

    :goto_3
    iget-object v5, v11, Lm0/f2;->q:Lm0/g2;

    invoke-static {v5}, Lm0/g2;->r(Lm0/g2;)Z

    move-result v5

    if-eqz v5, :cond_d

    new-instance v10, Lm0/e2;

    iget-object v6, v11, Lm0/f2;->q:Lm0/g2;

    move-object v5, v10

    move-object v7, v13

    move-object v8, v12

    move-object v9, v14

    move-object v3, v10

    move-object v10, v15

    move-object v4, v11

    move-object/from16 v11, v17

    move-object v1, v12

    move-object/from16 v12, v16

    move-object/from16 p1, v0

    move-object v0, v13

    move-object/from16 v13, v18

    invoke-direct/range {v5 .. v13}, Lm0/e2;-><init>(Lm0/g2;Lo0/d;Lo0/d;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Ljava/util/List;Ljava/util/Set;)V

    iput-object v2, v4, Lm0/f2;->p:Lm0/a1;

    move-object v5, v14

    check-cast v5, Ljava/util/List;

    iput-object v5, v4, Lm0/f2;->a:Ljava/util/List;

    move-object v5, v15

    check-cast v5, Ljava/util/List;

    iput-object v5, v4, Lm0/f2;->b:Ljava/util/List;

    move-object/from16 v5, v16

    check-cast v5, Ljava/util/List;

    iput-object v5, v4, Lm0/f2;->c:Ljava/util/List;

    move-object/from16 v5, v17

    check-cast v5, Ljava/util/Set;

    iput-object v5, v4, Lm0/f2;->d:Ljava/util/Set;

    move-object/from16 v5, v18

    check-cast v5, Ljava/util/Set;

    iput-object v5, v4, Lm0/f2;->e:Ljava/util/Set;

    iput-object v0, v4, Lm0/f2;->f:Lo0/d;

    iput-object v1, v4, Lm0/f2;->n:Lo0/d;

    const/4 v5, 0x2

    iput v5, v4, Lm0/f2;->o:I

    invoke-interface {v2, v3, v4}, Lm0/a1;->T(Lc9/c;Lu8/e;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v6, p1

    if-ne v3, v6, :cond_8

    return-object v6

    :cond_8
    move-object v10, v0

    move-object v11, v1

    move-object v12, v4

    move-object v0, v6

    move-object v6, v15

    move-object/from16 v7, v16

    move-object/from16 v8, v17

    move-object/from16 v9, v18

    :goto_4
    iget-object v1, v12, Lm0/f2;->q:Lm0/g2;

    iget-object v3, v1, Lm0/g2;->b:Ljava/lang/Object;

    monitor-enter v3

    :try_start_1
    iget-object v4, v1, Lm0/g2;->k:Ljava/util/LinkedHashMap;

    invoke-interface {v4}, Ljava/util/Map;->isEmpty()Z

    move-result v4

    const/4 v13, 0x1

    xor-int/2addr v4, v13

    if-eqz v4, :cond_b

    iget-object v4, v1, Lm0/g2;->k:Ljava/util/LinkedHashMap;

    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    const-string v5, "<this>"

    invoke-static {v4, v5}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_9

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v13, v16

    check-cast v13, Ljava/lang/Iterable;

    invoke-static {v13, v5}, Lr8/n;->A0(Ljava/lang/Iterable;Ljava/util/Collection;)V

    const/4 v13, 0x1

    goto :goto_5

    :cond_9
    iget-object v4, v1, Lm0/g2;->k:Ljava/util/LinkedHashMap;

    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->clear()V

    new-instance v4, Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v13

    invoke-direct {v4, v13}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v13

    const/4 v15, 0x0

    :goto_6
    if-ge v15, v13, :cond_a

    invoke-virtual {v5, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v17, v0

    move-object/from16 v0, v16

    check-cast v0, Lm0/c1;

    move-object/from16 v16, v2

    iget-object v2, v1, Lm0/g2;->l:Ljava/util/LinkedHashMap;

    invoke-virtual {v2, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v18, v5

    new-instance v5, Lq8/f;

    invoke-direct {v5, v0, v2}, Lq8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v15, v15, 0x1

    move-object/from16 v2, v16

    move-object/from16 v0, v17

    move-object/from16 v5, v18

    goto :goto_6

    :catchall_1
    move-exception v0

    goto :goto_9

    :cond_a
    move-object/from16 v17, v0

    move-object/from16 v16, v2

    iget-object v0, v1, Lm0/g2;->l:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    goto :goto_7

    :cond_b
    move-object/from16 v17, v0

    move-object/from16 v16, v2

    sget-object v4, Lr8/r;->a:Lr8/r;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :goto_7
    monitor-exit v3

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    const/4 v15, 0x0

    :goto_8
    if-ge v15, v0, :cond_c

    invoke-interface {v4, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lq8/f;

    iget-object v2, v1, Lq8/f;->a:Ljava/lang/Object;

    check-cast v2, Lm0/c1;

    iget-object v1, v1, Lq8/f;->b:Ljava/lang/Object;

    check-cast v1, Lm0/b1;

    add-int/lit8 v15, v15, 0x1

    goto :goto_8

    :cond_c
    move-object/from16 v1, p0

    move-object v5, v14

    move-object/from16 v2, v16

    move-object/from16 v0, v17

    const/4 v3, 0x1

    const/4 v4, 0x2

    goto/16 :goto_0

    :goto_9
    monitor-exit v3

    throw v0

    :cond_d
    move-object v6, v0

    move-object v4, v11

    move-object v1, v12

    move-object v0, v13

    move-object v10, v0

    move-object v11, v1

    move-object v12, v4

    move-object v0, v6

    move-object v5, v14

    move-object v6, v15

    move-object/from16 v7, v16

    move-object/from16 v8, v17

    move-object/from16 v9, v18

    const/4 v4, 0x2

    move-object/from16 v1, p0

    goto/16 :goto_0
.end method
