.class public final Lm0/e2;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:Lm0/g2;

.field public final synthetic b:Lo0/d;

.field public final synthetic c:Lo0/d;

.field public final synthetic d:Ljava/util/List;

.field public final synthetic e:Ljava/util/List;

.field public final synthetic f:Ljava/util/Set;

.field public final synthetic n:Ljava/util/List;

.field public final synthetic o:Ljava/util/Set;


# direct methods
.method public constructor <init>(Lm0/g2;Lo0/d;Lo0/d;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Ljava/util/List;Ljava/util/Set;)V
    .locals 0

    iput-object p1, p0, Lm0/e2;->a:Lm0/g2;

    iput-object p2, p0, Lm0/e2;->b:Lo0/d;

    iput-object p3, p0, Lm0/e2;->c:Lo0/d;

    iput-object p4, p0, Lm0/e2;->d:Ljava/util/List;

    iput-object p5, p0, Lm0/e2;->e:Ljava/util/List;

    iput-object p6, p0, Lm0/e2;->f:Ljava/util/Set;

    iput-object p7, p0, Lm0/e2;->n:Ljava/util/List;

    iput-object p8, p0, Lm0/e2;->o:Ljava/util/Set;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    iget-object v0, v1, Lm0/e2;->a:Lm0/g2;

    iget-object v4, v0, Lm0/g2;->b:Ljava/lang/Object;

    monitor-enter v4

    :try_start_0
    invoke-virtual {v0}, Lm0/g2;->v()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_9

    monitor-exit v4

    if-eqz v0, :cond_0

    const-string v0, "Recomposer:animation"

    iget-object v4, v1, Lm0/e2;->a:Lm0/g2;

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_1
    iget-object v0, v4, Lm0/g2;->a:Lm0/g;

    invoke-virtual {v0, v2, v3}, Lm0/g;->c(J)V

    invoke-static {}, Lk0/y0;->g()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0

    :cond_0
    :goto_0
    const-string v0, "Recomposer:recompose"

    iget-object v2, v1, Lm0/e2;->a:Lm0/g2;

    iget-object v8, v1, Lm0/e2;->b:Lo0/d;

    iget-object v9, v1, Lm0/e2;->c:Lo0/d;

    iget-object v10, v1, Lm0/e2;->d:Ljava/util/List;

    iget-object v4, v1, Lm0/e2;->e:Ljava/util/List;

    iget-object v11, v1, Lm0/e2;->f:Ljava/util/Set;

    iget-object v12, v1, Lm0/e2;->n:Ljava/util/List;

    iget-object v13, v1, Lm0/e2;->o:Ljava/util/Set;

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_2
    invoke-static {v2}, Lm0/g2;->r(Lm0/g2;)Z

    iget-object v3, v2, Lm0/g2;->b:Ljava/lang/Object;

    monitor-enter v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    :try_start_3
    iget-object v0, v2, Lm0/g2;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/4 v6, 0x0

    move v7, v6

    :goto_1
    if-ge v7, v5, :cond_1

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lm0/e0;

    move-object v15, v10

    check-cast v15, Ljava/util/Collection;

    invoke-interface {v15, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :catchall_1
    move-exception v0

    goto/16 :goto_1d

    :cond_1
    iget-object v0, v2, Lm0/g2;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    monitor-exit v3

    invoke-virtual {v8}, Lo0/d;->clear()V

    invoke-virtual {v9}, Lo0/d;->clear()V

    :goto_2
    move-object v0, v10

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v3, 0x1

    xor-int/2addr v0, v3

    if-nez v0, :cond_a

    move-object v0, v4

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/2addr v0, v3

    if-eqz v0, :cond_2

    goto/16 :goto_11

    :cond_2
    move-object v0, v12

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    xor-int/2addr v0, v3

    const/4 v5, 0x6

    if-eqz v0, :cond_5

    :try_start_5
    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v0

    move v7, v6

    :goto_3
    if-ge v7, v0, :cond_3

    invoke-interface {v12, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lm0/e0;

    invoke-interface {v13, v14}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :catchall_2
    move-exception v0

    goto :goto_7

    :catch_0
    move-exception v0

    goto :goto_5

    :cond_3
    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v0

    move v7, v6

    :goto_4
    if-ge v7, v0, :cond_4

    invoke-interface {v12, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lm0/e0;

    check-cast v14, Lm0/x;

    invoke-virtual {v14}, Lm0/x;->i()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    :cond_4
    :try_start_6
    invoke-interface {v12}, Ljava/util/List;->clear()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    goto :goto_8

    :catchall_3
    move-exception v0

    goto/16 :goto_1e

    :goto_5
    :try_start_7
    invoke-static {v2, v0, v6, v5}, Lm0/g2;->C(Lm0/g2;Ljava/lang/Exception;ZI)V

    move-object v3, v10

    move-object v5, v12

    move-object v6, v11

    move-object v7, v13

    invoke-static/range {v3 .. v9}, Lm0/f2;->h(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;Lo0/d;Lo0/d;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :try_start_8
    invoke-interface {v12}, Ljava/util/List;->clear()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    :goto_6
    invoke-static {}, Landroid/os/Trace;->endSection()V

    goto/16 :goto_1b

    :goto_7
    :try_start_9
    invoke-interface {v12}, Ljava/util/List;->clear()V

    throw v0

    :cond_5
    :goto_8
    move-object v0, v11

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    xor-int/2addr v0, v3

    if-eqz v0, :cond_7

    :try_start_a
    move-object v0, v13

    check-cast v0, Ljava/util/Collection;

    move-object v7, v11

    check-cast v7, Ljava/lang/Iterable;

    invoke-static {v7, v0}, Lr8/n;->A0(Ljava/lang/Iterable;Ljava/util/Collection;)V

    move-object v0, v11

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lm0/e0;

    check-cast v7, Lm0/x;

    invoke-virtual {v7}, Lm0/x;->k()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_1
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    goto :goto_9

    :catchall_4
    move-exception v0

    goto :goto_b

    :catch_1
    move-exception v0

    goto :goto_a

    :cond_6
    :try_start_b
    invoke-interface {v11}, Ljava/util/Set;->clear()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    goto :goto_c

    :goto_a
    :try_start_c
    invoke-static {v2, v0, v6, v5}, Lm0/g2;->C(Lm0/g2;Ljava/lang/Exception;ZI)V

    move-object v3, v10

    move-object v5, v12

    move-object v6, v11

    move-object v7, v13

    invoke-static/range {v3 .. v9}, Lm0/f2;->h(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;Lo0/d;Lo0/d;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    :try_start_d
    invoke-interface {v11}, Ljava/util/Set;->clear()V

    goto :goto_6

    :goto_b
    invoke-interface {v11}, Ljava/util/Set;->clear()V

    throw v0

    :cond_7
    :goto_c
    move-object v0, v13

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    xor-int/2addr v0, v3

    if-eqz v0, :cond_9

    :try_start_e
    move-object v0, v13

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm0/e0;

    check-cast v3, Lm0/x;

    invoke-virtual {v3}, Lm0/x;->l()V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_2
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    goto :goto_d

    :catchall_5
    move-exception v0

    goto :goto_f

    :catch_2
    move-exception v0

    goto :goto_e

    :cond_8
    :try_start_f
    invoke-interface {v13}, Ljava/util/Set;->clear()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_3

    goto :goto_10

    :goto_e
    :try_start_10
    invoke-static {v2, v0, v6, v5}, Lm0/g2;->C(Lm0/g2;Ljava/lang/Exception;ZI)V

    move-object v3, v10

    move-object v5, v12

    move-object v6, v11

    move-object v7, v13

    invoke-static/range {v3 .. v9}, Lm0/f2;->h(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;Lo0/d;Lo0/d;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_5

    :try_start_11
    invoke-interface {v13}, Ljava/util/Set;->clear()V

    goto/16 :goto_6

    :goto_f
    invoke-interface {v13}, Ljava/util/Set;->clear()V

    throw v0

    :cond_9
    :goto_10
    iget-object v3, v2, Lm0/g2;->b:Ljava/lang/Object;

    monitor-enter v3
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_3

    :try_start_12
    invoke-virtual {v2}, Lm0/g2;->u()Lm9/k;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_6

    :try_start_13
    monitor-exit v3

    invoke-static {}, Lw0/p;->i()Lw0/i;

    move-result-object v0

    invoke-virtual {v0}, Lw0/i;->m()V

    invoke-virtual {v9}, Lo0/d;->clear()V

    invoke-virtual {v8}, Lo0/d;->clear()V

    const/4 v0, 0x0

    iput-object v0, v2, Lm0/g2;->n:Ljava/util/Set;

    goto/16 :goto_6

    :catchall_6
    move-exception v0

    move-object v2, v0

    monitor-exit v3

    throw v2
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_3

    :cond_a
    :goto_11
    :try_start_14
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v0

    move v7, v6

    :goto_12
    if-ge v7, v0, :cond_c

    invoke-interface {v10, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lm0/e0;

    invoke-virtual {v9, v14}, Lo0/d;->add(Ljava/lang/Object;)Z

    invoke-static {v2, v14, v8}, Lm0/g2;->q(Lm0/g2;Lm0/e0;Lo0/d;)Lm0/e0;

    move-result-object v14

    if-eqz v14, :cond_b

    move-object v15, v12

    check-cast v15, Ljava/util/Collection;

    invoke-interface {v15, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_3
    .catchall {:try_start_14 .. :try_end_14} :catchall_7

    goto :goto_13

    :catchall_7
    move-exception v0

    goto/16 :goto_1c

    :catch_3
    move-exception v0

    const/4 v5, 0x2

    goto/16 :goto_1a

    :cond_b
    :goto_13
    add-int/lit8 v7, v7, 0x1

    goto :goto_12

    :cond_c
    :try_start_15
    invoke-interface {v10}, Ljava/util/List;->clear()V

    invoke-virtual {v8}, Lo0/d;->k()Z

    move-result v0

    if-eqz v0, :cond_f

    iget-object v7, v2, Lm0/g2;->b:Ljava/lang/Object;

    monitor-enter v7
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_3

    :try_start_16
    invoke-virtual {v2}, Lm0/g2;->x()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v14

    move v15, v6

    :goto_14
    if-ge v15, v14, :cond_e

    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v6, v16

    check-cast v6, Lm0/e0;

    invoke-virtual {v9, v6}, Lo0/d;->contains(Ljava/lang/Object;)Z

    move-result v16

    if-nez v16, :cond_d

    check-cast v6, Lm0/x;

    invoke-virtual {v6, v8}, Lm0/x;->w(Lo0/d;)Z

    move-result v16

    if-eqz v16, :cond_d

    move-object v5, v10

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_8

    goto :goto_15

    :catchall_8
    move-exception v0

    goto :goto_16

    :cond_d
    :goto_15
    add-int/lit8 v15, v15, 0x1

    const/4 v6, 0x0

    goto :goto_14

    :cond_e
    :try_start_17
    monitor-exit v7

    goto :goto_17

    :goto_16
    monitor-exit v7

    throw v0

    :cond_f
    :goto_17
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    move-result v0
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_3

    if-eqz v0, :cond_10

    :try_start_18
    invoke-static {v4, v2}, Lm0/f2;->i(Ljava/util/List;Lm0/g2;)V

    :goto_18
    move-object v0, v4

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/2addr v0, v3

    if-eqz v0, :cond_10

    move-object v0, v11

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {v2, v4, v8}, Lm0/g2;->A(Ljava/util/List;Lo0/d;)Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-static {v5, v0}, Lr8/n;->A0(Ljava/lang/Iterable;Ljava/util/Collection;)V

    invoke-static {v4, v2}, Lm0/f2;->i(Ljava/util/List;Lm0/g2;)V
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_4
    .catchall {:try_start_18 .. :try_end_18} :catchall_3

    goto :goto_18

    :catch_4
    move-exception v0

    const/4 v5, 0x2

    goto :goto_19

    :cond_10
    const/4 v6, 0x0

    goto/16 :goto_2

    :goto_19
    :try_start_19
    invoke-static {v2, v0, v3, v5}, Lm0/g2;->C(Lm0/g2;Ljava/lang/Exception;ZI)V

    move-object v3, v10

    move-object v5, v12

    move-object v6, v11

    move-object v7, v13

    invoke-static/range {v3 .. v9}, Lm0/f2;->h(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;Lo0/d;Lo0/d;)V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_3

    goto/16 :goto_6

    :goto_1a
    :try_start_1a
    invoke-static {v2, v0, v3, v5}, Lm0/g2;->C(Lm0/g2;Ljava/lang/Exception;ZI)V

    move-object v3, v10

    move-object v5, v12

    move-object v6, v11

    move-object v7, v13

    invoke-static/range {v3 .. v9}, Lm0/f2;->h(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;Lo0/d;Lo0/d;)V
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_7

    :try_start_1b
    invoke-interface {v10}, Ljava/util/List;->clear()V
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_3

    goto/16 :goto_6

    :goto_1b
    sget-object v0, Lq8/l;->a:Lq8/l;

    return-object v0

    :goto_1c
    :try_start_1c
    invoke-interface {v10}, Ljava/util/List;->clear()V

    throw v0

    :goto_1d
    monitor-exit v3

    throw v0
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_3

    :goto_1e
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0

    :catchall_9
    move-exception v0

    move-object v2, v0

    monitor-exit v4

    throw v2
.end method
