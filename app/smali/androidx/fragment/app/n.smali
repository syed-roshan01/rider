.class public final Landroidx/fragment/app/n;
.super Landroidx/fragment/app/t1;


# direct methods
.method public static j(Landroidx/fragment/app/s1;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/s1;->c:Landroidx/fragment/app/d0;

    iget-object v0, v0, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    iget p0, p0, Landroidx/fragment/app/s1;->a:I

    invoke-static {p0, v0}, La7/a;->a(ILandroid/view/View;)V

    return-void
.end method

.method public static k(Ljava/util/ArrayList;Landroid/view/View;)V
    .locals 4

    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Landroid/view/ViewGroup;

    invoke-static {v0}, Lb3/t0;->b(Landroid/view/ViewGroup;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_3

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v3

    if-nez v3, :cond_1

    invoke-static {p0, v2}, Landroidx/fragment/app/n;->k(Ljava/util/ArrayList;Landroid/view/View;)V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    :goto_1
    return-void
.end method

.method public static l(Lq/f;Landroid/view/View;)V
    .locals 4

    sget-object v0, Lb3/q0;->a:Ljava/lang/reflect/Field;

    invoke-static {p1}, Lb3/h0;->k(Landroid/view/View;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0, p1}, Lq/z;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    check-cast p1, Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v3

    if-nez v3, :cond_1

    invoke-static {p0, v2}, Landroidx/fragment/app/n;->l(Lq/f;Landroid/view/View;)V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static m(Lq/f;Ljava/util/Collection;)V
    .locals 2

    invoke-virtual {p0}, Lq/f;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    sget-object v1, Lb3/q0;->a:Ljava/lang/reflect/Field;

    invoke-static {v0}, Lb3/h0;->k(Landroid/view/View;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public final b(Ljava/util/ArrayList;Z)V
    .locals 41

    move-object/from16 v6, p0

    move/from16 v7, p2

    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v9, 0x0

    const/4 v10, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v11, 0x2

    const/4 v12, 0x3

    const/4 v13, 0x1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/s1;

    iget-object v2, v1, Landroidx/fragment/app/s1;->c:Landroidx/fragment/app/d0;

    iget-object v2, v2, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    invoke-static {v2}, La7/a;->d(Landroid/view/View;)I

    move-result v2

    iget v3, v1, Landroidx/fragment/app/s1;->a:I

    invoke-static {v3}, Lt/k;->e(I)I

    move-result v3

    if-eqz v3, :cond_2

    if-eq v3, v13, :cond_1

    if-eq v3, v11, :cond_2

    if-eq v3, v12, :cond_2

    goto :goto_0

    :cond_1
    if-eq v2, v11, :cond_0

    move-object v10, v1

    goto :goto_0

    :cond_2
    if-ne v2, v11, :cond_0

    if-nez v9, :cond_0

    move-object v9, v1

    goto :goto_0

    :cond_3
    const-string v14, "FragmentManager"

    invoke-static {v14, v11}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    const-string v15, " to "

    if-eqz v0, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Executing operations from "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v14, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Ljava/util/ArrayList;

    move-object/from16 v0, p1

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/s1;

    new-instance v8, Lx2/g;

    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v1}, Landroidx/fragment/app/s1;->d()V

    iget-object v13, v1, Landroidx/fragment/app/s1;->e:Ljava/util/HashSet;

    invoke-virtual {v13, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v11, Landroidx/fragment/app/k;

    invoke-direct {v11, v1, v8}, Landroidx/fragment/app/l;-><init>(Landroidx/fragment/app/s1;Lx2/g;)V

    iput-boolean v2, v11, Landroidx/fragment/app/k;->d:Z

    iput-boolean v7, v11, Landroidx/fragment/app/k;->c:Z

    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v8, Lx2/g;

    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v1}, Landroidx/fragment/app/s1;->d()V

    invoke-virtual {v13, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v11, Landroidx/fragment/app/m;

    if-eqz v7, :cond_5

    if-ne v1, v9, :cond_6

    :goto_2
    const/4 v2, 0x1

    goto :goto_3

    :cond_5
    if-ne v1, v10, :cond_6

    goto :goto_2

    :cond_6
    :goto_3
    invoke-direct {v11, v1, v8, v7, v2}, Landroidx/fragment/app/m;-><init>(Landroidx/fragment/app/s1;Lx2/g;ZZ)V

    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Ly2/a;

    invoke-direct {v2, v6, v3, v1, v12}, Ly2/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iget-object v1, v1, Landroidx/fragment/app/s1;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v11, 0x2

    const/4 v13, 0x1

    goto :goto_1

    :cond_7
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v11, 0x0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/m;

    invoke-virtual {v1}, Landroidx/fragment/app/l;->b()Z

    move-result v13

    if-eqz v13, :cond_8

    goto :goto_4

    :cond_8
    iget-object v13, v1, Landroidx/fragment/app/m;->c:Ljava/lang/Object;

    invoke-virtual {v1, v13}, Landroidx/fragment/app/m;->c(Ljava/lang/Object;)Landroidx/fragment/app/o1;

    move-result-object v12

    iget-object v2, v1, Landroidx/fragment/app/m;->e:Ljava/lang/Object;

    move-object/from16 v18, v0

    invoke-virtual {v1, v2}, Landroidx/fragment/app/m;->c(Ljava/lang/Object;)Landroidx/fragment/app/o1;

    move-result-object v0

    move-object/from16 v19, v3

    const-string v3, " returned Transition "

    move-object/from16 v20, v5

    const-string v5, "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "

    iget-object v1, v1, Landroidx/fragment/app/l;->a:Landroidx/fragment/app/s1;

    if-eqz v12, :cond_a

    if-eqz v0, :cond_a

    if-ne v12, v0, :cond_9

    goto :goto_5

    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, v1, Landroidx/fragment/app/s1;->c:Landroidx/fragment/app/d0;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " which uses a different Transition  type than its shared element transition "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    :goto_5
    if-eqz v12, :cond_b

    goto :goto_6

    :cond_b
    move-object v12, v0

    :goto_6
    if-nez v11, :cond_c

    move-object v11, v12

    goto :goto_7

    :cond_c
    if-eqz v12, :cond_e

    if-ne v11, v12, :cond_d

    goto :goto_7

    :cond_d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, v1, Landroidx/fragment/app/s1;->c:Landroidx/fragment/app/d0;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " which uses a different Transition  type than other Fragments."

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    :goto_7
    move-object/from16 v0, v18

    move-object/from16 v3, v19

    move-object/from16 v5, v20

    const/4 v2, 0x0

    const/4 v12, 0x3

    goto/16 :goto_4

    :cond_f
    move-object/from16 v19, v3

    move-object/from16 v20, v5

    iget-object v12, v6, Landroidx/fragment/app/t1;->a:Landroid/view/ViewGroup;

    if-nez v11, :cond_11

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/m;

    iget-object v2, v1, Landroidx/fragment/app/l;->a:Landroidx/fragment/app/s1;

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v8, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Landroidx/fragment/app/l;->a()V

    goto :goto_8

    :cond_10
    move-object v4, v8

    move-object/from16 v39, v9

    move-object/from16 v38, v10

    move-object/from16 v32, v15

    move-object/from16 v36, v19

    move-object/from16 v28, v20

    const/4 v0, 0x0

    move-object v15, v14

    goto/16 :goto_25

    :cond_11
    new-instance v13, Landroid/view/View;

    invoke-virtual {v12}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v13, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v5, Landroid/graphics/Rect;

    invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Lq/f;

    const/4 v0, 0x0

    invoke-direct {v1, v0}, Lq/z;-><init>(I)V

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v24

    const/4 v0, 0x0

    const/16 v18, 0x0

    const/16 v25, 0x0

    :goto_9
    invoke-interface/range {v24 .. v24}, Ljava/util/Iterator;->hasNext()Z

    move-result v21

    if-eqz v21, :cond_1f

    invoke-interface/range {v24 .. v24}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v21

    move-object/from16 v22, v4

    move-object/from16 v4, v21

    check-cast v4, Landroidx/fragment/app/m;

    iget-object v4, v4, Landroidx/fragment/app/m;->e:Ljava/lang/Object;

    if-eqz v4, :cond_1e

    if-eqz v9, :cond_1e

    if-eqz v10, :cond_1e

    invoke-virtual {v11, v4}, Landroidx/fragment/app/o1;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v11, v0}, Landroidx/fragment/app/o1;->r(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iget-object v0, v10, Landroidx/fragment/app/s1;->c:Landroidx/fragment/app/d0;

    move-object/from16 v32, v15

    invoke-virtual {v0}, Landroidx/fragment/app/d0;->getSharedElementSourceNames()Ljava/util/ArrayList;

    move-result-object v15

    move-object/from16 v21, v4

    iget-object v4, v9, Landroidx/fragment/app/s1;->c:Landroidx/fragment/app/d0;

    move-object/from16 v23, v5

    invoke-virtual {v4}, Landroidx/fragment/app/d0;->getSharedElementSourceNames()Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v4}, Landroidx/fragment/app/d0;->getSharedElementTargetNames()Ljava/util/ArrayList;

    move-result-object v6

    move-object/from16 v33, v8

    move-object/from16 v26, v13

    const/4 v8, 0x0

    :goto_a
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v13

    if-ge v8, v13, :cond_13

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    invoke-virtual {v15, v13}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v13

    move-object/from16 v27, v6

    const/4 v6, -0x1

    if-eq v13, v6, :cond_12

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v15, v13, v6}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_12
    add-int/lit8 v8, v8, 0x1

    move-object/from16 v6, v27

    goto :goto_a

    :cond_13
    invoke-virtual {v0}, Landroidx/fragment/app/d0;->getSharedElementTargetNames()Ljava/util/ArrayList;

    move-result-object v6

    if-nez v7, :cond_14

    invoke-virtual {v4}, Landroidx/fragment/app/d0;->getExitTransitionCallback()Lq2/r0;

    invoke-virtual {v0}, Landroidx/fragment/app/d0;->getEnterTransitionCallback()Lq2/r0;

    goto :goto_b

    :cond_14
    invoke-virtual {v4}, Landroidx/fragment/app/d0;->getEnterTransitionCallback()Lq2/r0;

    invoke-virtual {v0}, Landroidx/fragment/app/d0;->getExitTransitionCallback()Lq2/r0;

    :goto_b
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/4 v8, 0x0

    :goto_c
    if-ge v8, v5, :cond_15

    invoke-virtual {v15, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v27

    move/from16 v28, v5

    move-object/from16 v5, v27

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v1, v13, v5}, Lq/z;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v8, v8, 0x1

    move/from16 v5, v28

    goto :goto_c

    :cond_15
    const/4 v5, 0x2

    invoke-static {v14, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v8

    if-eqz v8, :cond_17

    const-string v5, ">>> entering view names <<<"

    invoke-static {v14, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_d
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    const-string v13, "Name: "

    if-eqz v8, :cond_16

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    move-object/from16 v27, v5

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v14, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    move-object/from16 v5, v27

    goto :goto_d

    :cond_16
    const-string v5, ">>> exiting view names <<<"

    invoke-static {v14, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v15}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_e
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_17

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    move-object/from16 v27, v5

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v14, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    move-object/from16 v5, v27

    goto :goto_e

    :cond_17
    new-instance v8, Lq/f;

    const/4 v5, 0x0

    invoke-direct {v8, v5}, Lq/z;-><init>(I)V

    iget-object v13, v4, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    invoke-static {v8, v13}, Landroidx/fragment/app/n;->l(Lq/f;Landroid/view/View;)V

    invoke-virtual {v8, v15}, Lq/f;->m(Ljava/util/Collection;)Z

    invoke-virtual {v8}, Lq/f;->keySet()Ljava/util/Set;

    move-result-object v13

    invoke-virtual {v1, v13}, Lq/f;->m(Ljava/util/Collection;)Z

    new-instance v13, Lq/f;

    invoke-direct {v13, v5}, Lq/z;-><init>(I)V

    iget-object v5, v0, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    invoke-static {v13, v5}, Landroidx/fragment/app/n;->l(Lq/f;Landroid/view/View;)V

    invoke-virtual {v13, v6}, Lq/f;->m(Ljava/util/Collection;)Z

    invoke-virtual {v1}, Lq/f;->values()Ljava/util/Collection;

    move-result-object v5

    invoke-virtual {v13, v5}, Lq/f;->m(Ljava/util/Collection;)Z

    sget-object v5, Landroidx/fragment/app/h1;->a:Landroidx/fragment/app/m1;

    iget v5, v1, Lq/z;->c:I

    const/16 v17, 0x1

    add-int/lit8 v5, v5, -0x1

    :goto_f
    if-ltz v5, :cond_19

    invoke-virtual {v1, v5}, Lq/z;->j(I)Ljava/lang/Object;

    move-result-object v27

    move-object/from16 v34, v14

    move-object/from16 v14, v27

    check-cast v14, Ljava/lang/String;

    invoke-virtual {v13, v14}, Lq/f;->containsKey(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_18

    invoke-virtual {v1, v5}, Lq/z;->h(I)Ljava/lang/Object;

    :cond_18
    add-int/lit8 v5, v5, -0x1

    move-object/from16 v14, v34

    goto :goto_f

    :cond_19
    move-object/from16 v34, v14

    invoke-virtual {v1}, Lq/f;->keySet()Ljava/util/Set;

    move-result-object v5

    invoke-static {v8, v5}, Landroidx/fragment/app/n;->m(Lq/f;Ljava/util/Collection;)V

    invoke-virtual {v1}, Lq/f;->values()Ljava/util/Collection;

    move-result-object v5

    invoke-static {v13, v5}, Landroidx/fragment/app/n;->m(Lq/f;Ljava/util/Collection;)V

    invoke-virtual {v1}, Lq/z;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_1a

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    move-object/from16 v37, v1

    move-object v7, v3

    move-object v8, v9

    move-object v5, v10

    move-object/from16 v36, v19

    move-object/from16 v28, v20

    move-object/from16 v27, v22

    move-object/from16 v9, v23

    move-object/from16 v4, v33

    const/4 v0, 0x0

    move-object v3, v2

    move-object/from16 v2, v26

    goto/16 :goto_13

    :cond_1a
    if-eqz v7, :cond_1b

    invoke-virtual {v4}, Landroidx/fragment/app/d0;->getEnterTransitionCallback()Lq2/r0;

    goto :goto_10

    :cond_1b
    invoke-virtual {v0}, Landroidx/fragment/app/d0;->getEnterTransitionCallback()Lq2/r0;

    :goto_10
    new-instance v14, Landroidx/fragment/app/h;

    move-object/from16 v5, v18

    move-object v0, v14

    move-object v4, v1

    move-object/from16 v1, p0

    move-object/from16 v35, v2

    const/4 v7, 0x0

    move-object v2, v10

    move-object v7, v3

    move-object/from16 v36, v19

    move-object v3, v9

    move-object/from16 v37, v4

    move-object/from16 v38, v10

    move-object/from16 v10, v21

    move-object/from16 v27, v22

    move/from16 v4, p2

    move-object/from16 v40, v5

    move-object/from16 v39, v9

    move-object/from16 v28, v20

    move-object/from16 v9, v23

    move-object v5, v13

    invoke-direct/range {v0 .. v5}, Landroidx/fragment/app/h;-><init>(Landroidx/fragment/app/n;Landroidx/fragment/app/s1;Landroidx/fragment/app/s1;ZLq/f;)V

    invoke-static {v12, v14}, Lb3/u;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    invoke-virtual {v8}, Lq/f;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v15}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1c

    const/4 v0, 0x0

    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v8, v1}, Lq/f;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    invoke-virtual {v11, v1, v10}, Landroidx/fragment/app/o1;->m(Landroid/view/View;Ljava/lang/Object;)V

    goto :goto_11

    :cond_1c
    const/4 v0, 0x0

    move-object/from16 v1, v40

    :goto_11
    invoke-virtual {v13}, Lq/f;->values()Ljava/util/Collection;

    move-result-object v2

    move-object/from16 v3, v35

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1d

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v13, v2}, Lq/f;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_1d

    new-instance v2, Landroidx/fragment/app/i;

    invoke-direct {v2, v11, v0, v9}, Landroidx/fragment/app/i;-><init>(Landroidx/fragment/app/o1;Landroid/view/View;Landroid/graphics/Rect;)V

    invoke-static {v12, v2}, Lb3/u;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    move-object/from16 v2, v26

    const/16 v25, 0x1

    goto :goto_12

    :cond_1d
    move-object/from16 v2, v26

    :goto_12
    invoke-virtual {v11, v10, v2, v7}, Landroidx/fragment/app/o1;->p(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v18, v11

    move-object/from16 v19, v10

    move-object/from16 v22, v10

    move-object/from16 v23, v3

    invoke-virtual/range {v18 .. v23}, Landroidx/fragment/app/o1;->l(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    move-object/from16 v4, v33

    move-object/from16 v8, v39

    invoke-virtual {v4, v8, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v5, v38

    invoke-virtual {v4, v5, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v18, v1

    move-object v0, v10

    goto :goto_13

    :cond_1e
    move-object/from16 v37, v1

    move-object v7, v3

    move-object v4, v8

    move-object v8, v9

    move-object/from16 v34, v14

    move-object/from16 v32, v15

    move-object/from16 v40, v18

    move-object/from16 v36, v19

    move-object/from16 v28, v20

    move-object/from16 v27, v22

    move-object v3, v2

    move-object v9, v5

    move-object v5, v10

    move-object v2, v13

    move-object/from16 v18, v40

    :goto_13
    move-object/from16 v6, p0

    move-object v13, v2

    move-object v2, v3

    move-object v10, v5

    move-object v3, v7

    move-object v5, v9

    move-object/from16 v20, v28

    move-object/from16 v15, v32

    move-object/from16 v14, v34

    move-object/from16 v19, v36

    move-object/from16 v1, v37

    move/from16 v7, p2

    move-object v9, v8

    move-object v8, v4

    move-object/from16 v4, v27

    goto/16 :goto_9

    :cond_1f
    move-object/from16 v37, v1

    move-object v7, v3

    move-object/from16 v27, v4

    move-object v4, v8

    move-object v8, v9

    move-object/from16 v34, v14

    move-object/from16 v32, v15

    move-object/from16 v40, v18

    move-object/from16 v36, v19

    move-object/from16 v28, v20

    move-object v3, v2

    move-object v9, v5

    move-object v5, v10

    move-object v2, v13

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {v27 .. v27}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    const/4 v10, 0x0

    const/4 v13, 0x0

    :goto_14
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_2c

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroidx/fragment/app/m;

    invoke-virtual {v14}, Landroidx/fragment/app/l;->b()Z

    move-result v15

    move-object/from16 p2, v6

    iget-object v6, v14, Landroidx/fragment/app/l;->a:Landroidx/fragment/app/s1;

    if-eqz v15, :cond_20

    sget-object v15, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v4, v6, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v14}, Landroidx/fragment/app/l;->a()V

    move-object/from16 v6, p2

    goto :goto_14

    :cond_20
    iget-object v15, v14, Landroidx/fragment/app/m;->c:Ljava/lang/Object;

    invoke-virtual {v11, v15}, Landroidx/fragment/app/o1;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    if-eqz v0, :cond_22

    if-eq v6, v8, :cond_21

    if-ne v6, v5, :cond_22

    :cond_21
    const/16 v18, 0x1

    goto :goto_15

    :cond_22
    const/16 v18, 0x0

    :goto_15
    if-nez v15, :cond_24

    if-nez v18, :cond_23

    sget-object v15, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v4, v6, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v14}, Landroidx/fragment/app/l;->a()V

    :cond_23
    move-object/from16 v26, v0

    move-object/from16 v18, v2

    move-object/from16 v38, v5

    move-object/from16 v29, v7

    move-object/from16 v0, v40

    move-object/from16 v2, p0

    goto/16 :goto_19

    :cond_24
    move-object/from16 v38, v5

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v26, v0

    iget-object v0, v6, Landroidx/fragment/app/s1;->c:Landroidx/fragment/app/d0;

    iget-object v0, v0, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    invoke-static {v5, v0}, Landroidx/fragment/app/n;->k(Ljava/util/ArrayList;Landroid/view/View;)V

    if-eqz v18, :cond_26

    if-ne v6, v8, :cond_25

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    goto :goto_16

    :cond_25
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    :cond_26
    :goto_16
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_27

    invoke-virtual {v11, v2, v15}, Landroidx/fragment/app/o1;->a(Landroid/view/View;Ljava/lang/Object;)V

    move-object/from16 v18, v2

    move-object/from16 v29, v7

    move-object/from16 v2, p0

    goto :goto_17

    :cond_27
    invoke-virtual {v11, v15, v5}, Landroidx/fragment/app/o1;->b(Ljava/lang/Object;Ljava/util/ArrayList;)V

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v18, v11

    move-object/from16 v19, v15

    move-object/from16 v20, v15

    move-object/from16 v21, v5

    invoke-virtual/range {v18 .. v23}, Landroidx/fragment/app/o1;->l(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V

    iget v0, v6, Landroidx/fragment/app/s1;->a:I

    move-object/from16 v18, v2

    const/4 v2, 0x3

    if-ne v0, v2, :cond_28

    move-object/from16 v0, v36

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v0, v6, Landroidx/fragment/app/s1;->c:Landroidx/fragment/app/d0;

    move-object/from16 v29, v7

    iget-object v7, v0, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v0, v0, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    invoke-virtual {v11, v15, v0, v2}, Landroidx/fragment/app/o1;->k(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V

    new-instance v0, Landroidx/fragment/app/j;

    const/4 v7, 0x0

    move-object/from16 v2, p0

    invoke-direct {v0, v7, v2, v5}, Landroidx/fragment/app/j;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v12, v0}, Lb3/u;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    goto :goto_17

    :cond_28
    move-object/from16 v2, p0

    move-object/from16 v29, v7

    :goto_17
    iget v0, v6, Landroidx/fragment/app/s1;->a:I

    const/4 v7, 0x2

    if-ne v0, v7, :cond_2a

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    if-eqz v25, :cond_29

    invoke-virtual {v11, v15, v9}, Landroidx/fragment/app/o1;->n(Ljava/lang/Object;Landroid/graphics/Rect;)V

    :cond_29
    move-object/from16 v0, v40

    goto :goto_18

    :cond_2a
    move-object/from16 v0, v40

    invoke-virtual {v11, v0, v15}, Landroidx/fragment/app/o1;->m(Landroid/view/View;Ljava/lang/Object;)V

    :goto_18
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v4, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v5, v14, Landroidx/fragment/app/m;->d:Z

    if-eqz v5, :cond_2b

    invoke-virtual {v11, v10, v15}, Landroidx/fragment/app/o1;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v10, v5

    goto :goto_19

    :cond_2b
    invoke-virtual {v11, v13, v15}, Landroidx/fragment/app/o1;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v13, v5

    :goto_19
    move-object/from16 v6, p2

    move-object/from16 v40, v0

    move-object/from16 v2, v18

    move-object/from16 v0, v26

    move-object/from16 v7, v29

    move-object/from16 v5, v38

    goto/16 :goto_14

    :cond_2c
    move-object/from16 v2, p0

    move-object/from16 v38, v5

    move-object/from16 v29, v7

    move-object v5, v0

    invoke-virtual {v11, v10, v13, v5}, Landroidx/fragment/app/o1;->i(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2d

    move-object/from16 v39, v8

    move-object/from16 v15, v34

    :goto_1a
    const/4 v0, 0x0

    goto/16 :goto_25

    :cond_2d
    invoke-virtual/range {v27 .. v27}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1b
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const/4 v9, 0x4

    if-eqz v7, :cond_35

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/fragment/app/m;

    invoke-virtual {v7}, Landroidx/fragment/app/l;->b()Z

    move-result v10

    if-eqz v10, :cond_2e

    goto :goto_1b

    :cond_2e
    iget-object v10, v7, Landroidx/fragment/app/l;->a:Landroidx/fragment/app/s1;

    move-object/from16 v13, v38

    if-eqz v5, :cond_30

    if-eq v10, v8, :cond_2f

    if-ne v10, v13, :cond_30

    :cond_2f
    const/4 v14, 0x1

    goto :goto_1c

    :cond_30
    const/4 v14, 0x0

    :goto_1c
    iget-object v15, v7, Landroidx/fragment/app/m;->c:Ljava/lang/Object;

    if-nez v15, :cond_32

    if-eqz v14, :cond_31

    goto :goto_1d

    :cond_31
    move-object/from16 v15, v34

    goto :goto_1e

    :cond_32
    :goto_1d
    sget-object v14, Lb3/q0;->a:Ljava/lang/reflect/Field;

    invoke-static {v12}, Lb3/e0;->c(Landroid/view/View;)Z

    move-result v14

    if-nez v14, :cond_34

    move-object/from16 v15, v34

    const/4 v14, 0x2

    invoke-static {v15, v14}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v9

    if-eqz v9, :cond_33

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v14, "SpecialEffectsController: Container "

    invoke-direct {v9, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v14, " has not been laid out. Completing operation "

    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v15, v9}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_33
    invoke-virtual {v7}, Landroidx/fragment/app/l;->a()V

    goto :goto_1e

    :cond_34
    move-object/from16 v15, v34

    iget-object v14, v10, Landroidx/fragment/app/s1;->c:Landroidx/fragment/app/d0;

    new-instance v14, Ly2/a;

    invoke-direct {v14, v2, v7, v10, v9}, Ly2/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iget-object v7, v7, Landroidx/fragment/app/l;->b:Lx2/g;

    invoke-virtual {v11, v0, v7, v14}, Landroidx/fragment/app/o1;->o(Ljava/lang/Object;Lx2/g;Ly2/a;)V

    :goto_1e
    move-object/from16 v38, v13

    move-object/from16 v34, v15

    goto :goto_1b

    :cond_35
    move-object/from16 v15, v34

    move-object/from16 v13, v38

    sget-object v6, Lb3/q0;->a:Ljava/lang/reflect/Field;

    invoke-static {v12}, Lb3/e0;->c(Landroid/view/View;)Z

    move-result v6

    if-nez v6, :cond_36

    move-object/from16 v39, v8

    move-object/from16 v38, v13

    goto/16 :goto_1a

    :cond_36
    invoke-static {v1, v9}, Landroidx/fragment/app/h1;->a(Ljava/util/ArrayList;I)V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v7

    const/4 v9, 0x0

    :goto_1f
    if-ge v9, v7, :cond_37

    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/view/View;

    sget-object v14, Lb3/q0;->a:Ljava/lang/reflect/Field;

    invoke-static {v10}, Lb3/h0;->k(Landroid/view/View;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v6, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v14, 0x0

    invoke-static {v10, v14}, Lb3/h0;->v(Landroid/view/View;Ljava/lang/String;)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_1f

    :cond_37
    const/4 v9, 0x2

    invoke-static {v15, v9}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v7

    if-eqz v7, :cond_39

    const-string v7, ">>>>> Beginning transition <<<<<"

    invoke-static {v15, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    const-string v7, ">>>>> SharedElementFirstOutViews <<<<<"

    invoke-static {v15, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual/range {v29 .. v29}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_20
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    const-string v10, " Name: "

    const-string v14, "View: "

    if-eqz v9, :cond_38

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/view/View;

    move-object/from16 p2, v7

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v9}, Lb3/h0;->k(Landroid/view/View;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v15, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    move-object/from16 v7, p2

    goto :goto_20

    :cond_38
    const-string v7, ">>>>> SharedElementLastInViews <<<<<"

    invoke-static {v15, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_21
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_39

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/view/View;

    move-object/from16 p2, v7

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v9}, Lb3/h0;->k(Landroid/view/View;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v15, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    move-object/from16 v7, p2

    goto :goto_21

    :cond_39
    invoke-virtual {v11, v12, v0}, Landroidx/fragment/app/o1;->c(Landroid/view/ViewGroup;Ljava/lang/Object;)V

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    const/4 v9, 0x0

    :goto_22
    if-ge v9, v0, :cond_3d

    move-object/from16 v10, v29

    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroid/view/View;

    sget-object v18, Lb3/q0;->a:Ljava/lang/reflect/Field;

    move-object/from16 v38, v13

    invoke-static {v14}, Lb3/h0;->k(Landroid/view/View;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-nez v13, :cond_3a

    move-object/from16 v39, v8

    goto :goto_24

    :cond_3a
    move-object/from16 v39, v8

    const/4 v8, 0x0

    invoke-static {v14, v8}, Lb3/h0;->v(Landroid/view/View;Ljava/lang/String;)V

    move-object/from16 v14, v37

    invoke-virtual {v14, v13}, Lq/f;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v8, v16

    check-cast v8, Ljava/lang/String;

    move-object/from16 v37, v14

    const/4 v14, 0x0

    :goto_23
    if-ge v14, v0, :cond_3c

    invoke-virtual {v6, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v8, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3b

    invoke-virtual {v3, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    invoke-static {v2, v13}, Lb3/h0;->v(Landroid/view/View;Ljava/lang/String;)V

    goto :goto_24

    :cond_3b
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v2, p0

    goto :goto_23

    :cond_3c
    :goto_24
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v2, p0

    move-object/from16 v29, v10

    move-object/from16 v13, v38

    move-object/from16 v8, v39

    goto :goto_22

    :cond_3d
    move-object/from16 v39, v8

    move-object/from16 v38, v13

    move-object/from16 v10, v29

    new-instance v2, Landroidx/fragment/app/n1;

    const/16 v25, 0x0

    move-object/from16 v18, v2

    move-object/from16 v19, v11

    move/from16 v20, v0

    move-object/from16 v21, v3

    move-object/from16 v22, v6

    move-object/from16 v23, v10

    move-object/from16 v24, v7

    invoke-direct/range {v18 .. v25}, Landroidx/fragment/app/n1;-><init>(Ljava/lang/Object;ILjava/io/Serializable;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v12, v2}, Lb3/u;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    invoke-static {v1, v0}, Landroidx/fragment/app/h1;->a(Ljava/util/ArrayList;I)V

    invoke-virtual {v11, v5, v10, v3}, Landroidx/fragment/app/o1;->q(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    :goto_25
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v4, v1}, Ljava/util/HashMap;->containsValue(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v12}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {v28 .. v28}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move v6, v0

    :goto_26
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const-string v8, " has started."

    if-eqz v7, :cond_46

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/fragment/app/k;

    invoke-virtual {v7}, Landroidx/fragment/app/l;->b()Z

    move-result v9

    if-eqz v9, :cond_3e

    invoke-virtual {v7}, Landroidx/fragment/app/l;->a()V

    goto :goto_26

    :cond_3e
    invoke-virtual {v7, v2}, Landroidx/fragment/app/k;->c(Landroid/content/Context;)Landroidx/fragment/app/h0;

    move-result-object v9

    if-nez v9, :cond_3f

    invoke-virtual {v7}, Landroidx/fragment/app/l;->a()V

    goto :goto_26

    :cond_3f
    iget-object v9, v9, Landroidx/fragment/app/h0;->b:Landroid/animation/Animator;

    if-nez v9, :cond_40

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_26

    :cond_40
    iget-object v10, v7, Landroidx/fragment/app/l;->a:Landroidx/fragment/app/s1;

    iget-object v11, v10, Landroidx/fragment/app/s1;->c:Landroidx/fragment/app/d0;

    sget-object v13, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v4, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_42

    const/4 v13, 0x2

    invoke-static {v15, v13}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v8

    if-eqz v8, :cond_41

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "Ignoring Animator set on "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v9, " as this Fragment was involved in a Transition."

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v15, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_41
    invoke-virtual {v7}, Landroidx/fragment/app/l;->a()V

    goto :goto_26

    :cond_42
    iget v6, v10, Landroidx/fragment/app/s1;->a:I

    const/4 v13, 0x3

    if-ne v6, v13, :cond_43

    const/16 v29, 0x1

    goto :goto_27

    :cond_43
    move/from16 v29, v0

    :goto_27
    move-object/from16 v14, v36

    if-eqz v29, :cond_44

    invoke-virtual {v14, v10}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_44
    iget-object v6, v11, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    invoke-virtual {v12, v6}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    new-instance v11, Landroidx/fragment/app/d;

    move-object/from16 v26, v11

    move-object/from16 v27, v12

    move-object/from16 v28, v6

    move-object/from16 v30, v10

    move-object/from16 v31, v7

    invoke-direct/range {v26 .. v31}, Landroidx/fragment/app/d;-><init>(Landroid/view/ViewGroup;Landroid/view/View;ZLandroidx/fragment/app/s1;Landroidx/fragment/app/k;)V

    invoke-virtual {v9, v11}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {v9, v6}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    invoke-virtual {v9}, Landroid/animation/Animator;->start()V

    const/4 v6, 0x2

    invoke-static {v15, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v11

    if-eqz v11, :cond_45

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v11, "Animator from operation "

    invoke-direct {v6, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v15, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_45
    new-instance v6, Ll/z2;

    move-object/from16 v11, p0

    invoke-direct {v6, v11, v9, v10}, Ll/z2;-><init>(Landroidx/fragment/app/n;Landroid/animation/Animator;Landroidx/fragment/app/s1;)V

    iget-object v7, v7, Landroidx/fragment/app/l;->b:Lx2/g;

    invoke-virtual {v7, v6}, Lx2/g;->b(Lx2/f;)V

    move-object/from16 v36, v14

    const/4 v6, 0x1

    goto/16 :goto_26

    :cond_46
    move-object/from16 v11, p0

    move-object/from16 v14, v36

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_28
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/k;

    iget-object v4, v3, Landroidx/fragment/app/l;->a:Landroidx/fragment/app/s1;

    iget-object v5, v4, Landroidx/fragment/app/s1;->c:Landroidx/fragment/app/d0;

    const-string v7, "Ignoring Animation set on "

    if-eqz v1, :cond_48

    const/4 v9, 0x2

    invoke-static {v15, v9}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v4

    if-eqz v4, :cond_47

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " as Animations cannot run alongside Transitions."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v15, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_47
    invoke-virtual {v3}, Landroidx/fragment/app/l;->a()V

    goto :goto_28

    :cond_48
    if-eqz v6, :cond_4a

    const/4 v9, 0x2

    invoke-static {v15, v9}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v4

    if-eqz v4, :cond_49

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " as Animations cannot run alongside Animators."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v15, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_49
    invoke-virtual {v3}, Landroidx/fragment/app/l;->a()V

    goto :goto_28

    :cond_4a
    iget-object v5, v5, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    invoke-virtual {v3, v2}, Landroidx/fragment/app/k;->c(Landroid/content/Context;)Landroidx/fragment/app/h0;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v7, v7, Landroidx/fragment/app/h0;->a:Landroid/view/animation/Animation;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v9, v4, Landroidx/fragment/app/s1;->a:I

    const/4 v10, 0x1

    if-eq v9, v10, :cond_4b

    invoke-virtual {v5, v7}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    invoke-virtual {v3}, Landroidx/fragment/app/l;->a()V

    goto :goto_29

    :cond_4b
    invoke-virtual {v12, v5}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    new-instance v9, Landroidx/fragment/app/i0;

    invoke-direct {v9, v7, v12, v5}, Landroidx/fragment/app/i0;-><init>(Landroid/view/animation/Animation;Landroid/view/ViewGroup;Landroid/view/View;)V

    new-instance v7, Landroidx/fragment/app/f;

    invoke-direct {v7, v5, v12, v3, v4}, Landroidx/fragment/app/f;-><init>(Landroid/view/View;Landroid/view/ViewGroup;Landroidx/fragment/app/k;Landroidx/fragment/app/s1;)V

    invoke-virtual {v9, v7}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    invoke-virtual {v5, v9}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    const/4 v7, 0x2

    invoke-static {v15, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v9

    if-eqz v9, :cond_4c

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v9, "Animation from operation "

    invoke-direct {v7, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v15, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4c
    :goto_29
    new-instance v7, Landroidx/fragment/app/g;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    iput-object v11, v7, Landroidx/fragment/app/g;->e:Ljava/lang/Object;

    iput-object v5, v7, Landroidx/fragment/app/g;->a:Ljava/lang/Object;

    iput-object v12, v7, Landroidx/fragment/app/g;->b:Ljava/lang/Object;

    iput-object v3, v7, Landroidx/fragment/app/g;->c:Ljava/lang/Object;

    iput-object v4, v7, Landroidx/fragment/app/g;->d:Ljava/lang/Object;

    iget-object v3, v3, Landroidx/fragment/app/l;->b:Lx2/g;

    invoke-virtual {v3, v7}, Lx2/g;->b(Lx2/f;)V

    goto/16 :goto_28

    :cond_4d
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/s1;

    invoke-static {v1}, Landroidx/fragment/app/n;->j(Landroidx/fragment/app/s1;)V

    goto :goto_2a

    :cond_4e
    invoke-virtual {v14}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x2

    invoke-static {v15, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_4f

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Completed executing operations from "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v8, v39

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v32

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v8, v38

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v15, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4f
    return-void
.end method
