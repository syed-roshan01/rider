.class public final synthetic Landroidx/activity/d;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Landroidx/activity/d;->a:I

    iput-object p1, p0, Landroidx/activity/d;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 30

    move-object/from16 v0, p0

    iget v1, v0, Landroidx/activity/d;->a:I

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    packed-switch v1, :pswitch_data_0

    :pswitch_0
    iget-object v1, v0, Landroidx/activity/d;->b:Ljava/lang/Object;

    check-cast v1, Lg8/l5;

    iget-object v1, v1, Lg8/l5;->e:Lg8/m5;

    iget-object v2, v1, Lg8/m5;->b:Lg8/j5;

    new-instance v3, Lg8/t0;

    const/16 v4, 0xb

    invoke-direct {v3, v1, v4}, Lg8/t0;-><init>(Ljava/lang/Object;I)V

    check-cast v2, Lg8/t;

    invoke-virtual {v2, v3}, Lg8/t;->a(Lg8/t0;)V

    return-void

    :pswitch_1
    iget-object v1, v0, Landroidx/activity/d;->b:Ljava/lang/Object;

    check-cast v1, Lg8/t;

    iget-object v2, v1, Lg8/t;->e:Lv6/d;

    if-eqz v2, :cond_0

    iget-object v3, v2, Lv6/d;->b:Ljava/lang/Object;

    check-cast v3, Le8/g2;

    iget-boolean v5, v3, Le8/g2;->c:Z

    if-nez v5, :cond_0

    iget-boolean v3, v3, Le8/g2;->b:Z

    if-nez v3, :cond_0

    invoke-virtual {v2}, Lv6/d;->c()V

    :cond_0
    iput-object v4, v1, Lg8/t;->d:Lg8/i1;

    return-void

    :pswitch_2
    iget-object v1, v0, Landroidx/activity/d;->b:Ljava/lang/Object;

    check-cast v1, Lcom/google/firebase/installations/FirebaseInstallations;

    invoke-static {v1}, Lcom/google/firebase/installations/FirebaseInstallations;->b(Lcom/google/firebase/installations/FirebaseInstallations;)V

    return-void

    :pswitch_3
    iget-object v1, v0, Landroidx/activity/d;->b:Ljava/lang/Object;

    check-cast v1, Lcom/google/firebase/firestore/core/TransactionRunner;

    invoke-static {v1}, Lcom/google/firebase/firestore/core/TransactionRunner;->c(Lcom/google/firebase/firestore/core/TransactionRunner;)V

    return-void

    :pswitch_4
    iget-object v1, v0, Landroidx/activity/d;->b:Ljava/lang/Object;

    check-cast v1, Lq5/k;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lb/b;

    const/4 v3, 0x7

    invoke-direct {v2, v1, v3}, Lb/b;-><init>(Ljava/lang/Object;I)V

    iget-object v1, v1, Lq5/k;->d:Ls5/c;

    check-cast v1, Lr5/m;

    invoke-virtual {v1, v2}, Lr5/m;->g(Ls5/b;)Ljava/lang/Object;

    return-void

    :pswitch_5
    iget-object v1, v0, Landroidx/activity/d;->b:Ljava/lang/Object;

    check-cast v1, Landroid/media/ToneGenerator;

    invoke-static {v1}, Lcom/auto/accept/service/RideAcceptorService;->d(Landroid/media/ToneGenerator;)V

    return-void

    :pswitch_6
    iget-object v1, v0, Landroidx/activity/d;->b:Ljava/lang/Object;

    check-cast v1, Landroidx/lifecycle/k0;

    sget-object v2, Landroidx/lifecycle/k0;->p:Landroidx/lifecycle/k0;

    const-string v2, "this$0"

    invoke-static {v1, v2}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    iget v2, v1, Landroidx/lifecycle/k0;->b:I

    if-nez v2, :cond_1

    iput-boolean v5, v1, Landroidx/lifecycle/k0;->c:Z

    iget-object v2, v1, Landroidx/lifecycle/k0;->f:Landroidx/lifecycle/y;

    sget-object v3, Landroidx/lifecycle/p;->ON_PAUSE:Landroidx/lifecycle/p;

    invoke-virtual {v2, v3}, Landroidx/lifecycle/y;->f(Landroidx/lifecycle/p;)V

    :cond_1
    iget v2, v1, Landroidx/lifecycle/k0;->a:I

    if-nez v2, :cond_2

    iget-boolean v2, v1, Landroidx/lifecycle/k0;->c:Z

    if-eqz v2, :cond_2

    iget-object v2, v1, Landroidx/lifecycle/k0;->f:Landroidx/lifecycle/y;

    sget-object v3, Landroidx/lifecycle/p;->ON_STOP:Landroidx/lifecycle/p;

    invoke-virtual {v2, v3}, Landroidx/lifecycle/y;->f(Landroidx/lifecycle/p;)V

    iput-boolean v5, v1, Landroidx/lifecycle/k0;->d:Z

    :cond_2
    return-void

    :pswitch_7
    iget-object v1, v0, Landroidx/activity/d;->b:Ljava/lang/Object;

    check-cast v1, Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v4, "input_method"

    invoke-virtual {v2, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {v2, v1, v3}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    return-void

    :pswitch_8
    iget-object v1, v0, Landroidx/activity/d;->b:Ljava/lang/Object;

    check-cast v1, Lg2/e0;

    iput-object v4, v1, Lg2/e0;->n:Landroidx/activity/d;

    iget-object v6, v1, Lg2/e0;->m:Lo0/i;

    iget v7, v6, Lo0/i;->c:I

    if-lez v7, :cond_9

    iget-object v8, v6, Lo0/i;->a:[Ljava/lang/Object;

    move v10, v3

    move-object v9, v4

    :cond_3
    aget-object v11, v8, v10

    check-cast v11, Lg2/c0;

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v12

    if-eqz v12, :cond_7

    if-eq v12, v5, :cond_6

    if-eq v12, v2, :cond_4

    const/4 v13, 0x3

    if-eq v12, v13, :cond_4

    goto :goto_2

    :cond_4
    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v4, v12}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_8

    sget-object v9, Lg2/c0;->c:Lg2/c0;

    if-ne v11, v9, :cond_5

    move v9, v5

    goto :goto_0

    :cond_5
    move v9, v3

    :goto_0
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    goto :goto_2

    :cond_6
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_1
    move-object v9, v4

    goto :goto_2

    :cond_7
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_1

    :cond_8
    :goto_2
    add-int/lit8 v10, v10, 0x1

    if-lt v10, v7, :cond_3

    goto :goto_3

    :cond_9
    move-object v9, v4

    :goto_3
    invoke-virtual {v6}, Lo0/i;->g()V

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    iget-object v2, v1, Lg2/e0;->b:Lg2/p;

    check-cast v2, Lg2/q;

    iget-object v3, v2, Lg2/q;->b:Lq8/c;

    invoke-interface {v3}, Lq8/c;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/inputmethod/InputMethodManager;

    iget-object v2, v2, Lg2/q;->a:Landroid/view/View;

    invoke-virtual {v3, v2}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    :cond_a
    if-eqz v9, :cond_c

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    iget-object v3, v1, Lg2/e0;->b:Lg2/p;

    if-eqz v2, :cond_b

    check-cast v3, Lg2/q;

    iget-object v2, v3, Lg2/q;->c:Lk/f;

    iget-object v2, v2, Lk/f;->b:Ljava/lang/Object;

    check-cast v2, Ll2/l;

    invoke-virtual {v2}, Ll2/l;->j()V

    goto :goto_4

    :cond_b
    check-cast v3, Lg2/q;

    iget-object v2, v3, Lg2/q;->c:Lk/f;

    iget-object v2, v2, Lk/f;->b:Ljava/lang/Object;

    check-cast v2, Ll2/l;

    invoke-virtual {v2}, Ll2/l;->g()V

    :cond_c
    :goto_4
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v4, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    iget-object v1, v1, Lg2/e0;->b:Lg2/p;

    check-cast v1, Lg2/q;

    iget-object v2, v1, Lg2/q;->b:Lq8/c;

    invoke-interface {v2}, Lq8/c;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    iget-object v1, v1, Lg2/q;->a:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    :cond_d
    return-void

    :pswitch_9
    iget-object v1, v0, Landroidx/activity/d;->b:Ljava/lang/Object;

    check-cast v1, Lu1/p0;

    iget-object v6, v1, Lu1/p0;->d:Lu1/w;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v6}, Lt1/l1;->a(Lt1/l1;)V

    invoke-virtual {v1}, Lu1/p0;->x()Z

    move-result v6

    iget-object v13, v1, Lu1/p0;->d:Lu1/w;

    if-eqz v6, :cond_e

    invoke-virtual {v13}, Lu1/w;->getSemanticsOwner()Ly1/p;

    move-result-object v6

    invoke-virtual {v6}, Ly1/p;->a()Ly1/o;

    move-result-object v6

    iget-object v7, v1, Lu1/p0;->R:Lu1/g0;

    invoke-virtual {v1, v6, v7}, Lu1/p0;->F(Ly1/o;Lu1/g0;)V

    :cond_e
    sget-object v6, Lu1/r0;->a:Ld1/d;

    iget-object v6, v1, Lu1/p0;->F:Ll/t;

    if-nez v6, :cond_f

    goto :goto_5

    :cond_f
    invoke-virtual {v13}, Lu1/w;->getSemanticsOwner()Ly1/p;

    move-result-object v6

    invoke-virtual {v6}, Ly1/p;->a()Ly1/o;

    move-result-object v6

    iget-object v7, v1, Lu1/p0;->R:Lu1/g0;

    invoke-virtual {v1, v6, v7}, Lu1/p0;->G(Ly1/o;Lu1/g0;)V

    :goto_5
    invoke-virtual {v1}, Lu1/p0;->r()Ljava/util/Map;

    move-result-object v14

    new-instance v15, Ljava/util/ArrayList;

    iget-object v11, v1, Lu1/p0;->U:Ljava/util/ArrayList;

    invoke-direct {v15, v11}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v11}, Ljava/util/ArrayList;->clear()V

    invoke-interface {v14}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_6
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    iget-object v7, v1, Lu1/p0;->Q:Ljava/util/LinkedHashMap;

    if-eqz v6, :cond_5c

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v7, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lu1/g0;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v14, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lu1/s2;

    if-eqz v6, :cond_10

    iget-object v6, v6, Lu1/s2;->a:Ly1/o;

    goto :goto_7

    :cond_10
    move-object v6, v4

    :goto_7
    if-eqz v6, :cond_5b

    iget v4, v6, Ly1/o;->g:I

    iget-object v3, v6, Ly1/o;->d:Ly1/j;

    if-nez v7, :cond_15

    invoke-virtual {v3}, Ly1/j;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_11
    :goto_8
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_14

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    sget-object v8, Ly1/r;->u:Ly1/u;

    invoke-static {v7, v8}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_11

    iget-object v7, v3, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v7, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_12

    const/4 v7, 0x0

    :cond_12
    check-cast v7, Ljava/util/List;

    if-eqz v7, :cond_13

    invoke-static {v7}, Lr8/p;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, La2/e;

    goto :goto_9

    :cond_13
    const/4 v7, 0x0

    :goto_9
    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v4, v7}, Lu1/p0;->H(ILjava/lang/String;)V

    goto :goto_8

    :cond_14
    :goto_a
    const/4 v3, 0x0

    const/4 v4, 0x0

    goto :goto_6

    :cond_15
    invoke-virtual {v3}, Ly1/j;->iterator()Ljava/util/Iterator;

    move-result-object v17

    const/16 v18, 0x0

    :goto_b
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    iget-object v9, v7, Lu1/g0;->b:Ly1/j;

    if-eqz v19, :cond_57

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v19

    check-cast v19, Ljava/util/Map$Entry;

    invoke-interface/range {v19 .. v19}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    sget-object v2, Ly1/r;->o:Ly1/u;

    invoke-static {v5, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_16

    invoke-interface/range {v19 .. v19}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    sget-object v10, Ly1/r;->p:Ly1/u;

    invoke-static {v5, v10}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_18

    :cond_16
    invoke-static {v8, v15}, Lu1/r0;->b(ILjava/util/ArrayList;)Lu1/r2;

    move-result-object v5

    if-eqz v5, :cond_17

    const/4 v10, 0x0

    goto :goto_c

    :cond_17
    new-instance v5, Lu1/r2;

    invoke-direct {v5, v8, v11}, Lu1/r2;-><init>(ILjava/util/ArrayList;)V

    const/4 v10, 0x1

    :goto_c
    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-nez v10, :cond_1a

    :cond_18
    invoke-interface/range {v19 .. v19}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    invoke-interface/range {v19 .. v19}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ly1/u;

    invoke-static {v9, v10}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v10

    invoke-static {v5, v10}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1a

    :cond_19
    :goto_d
    move-object v0, v6

    move-object/from16 v20, v7

    move-object v6, v11

    move-object/from16 v23, v13

    move-object/from16 v24, v14

    move-object/from16 v25, v15

    :goto_e
    const/4 v5, 0x1

    const/16 v14, 0x20

    move v13, v8

    goto/16 :goto_2d

    :cond_1a
    invoke-interface/range {v19 .. v19}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly1/u;

    sget-object v10, Ly1/r;->u:Ly1/u;

    invoke-static {v5, v10}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_1e

    invoke-static {v9, v10}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-eqz v2, :cond_1b

    invoke-static {v2}, Lr8/p;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La2/e;

    goto :goto_f

    :cond_1b
    const/4 v2, 0x0

    :goto_f
    iget-object v5, v3, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v5, v10}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_1c

    const/4 v5, 0x0

    :cond_1c
    check-cast v5, Ljava/util/List;

    if-eqz v5, :cond_1d

    invoke-static {v5}, Lr8/p;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, La2/e;

    goto :goto_10

    :cond_1d
    const/4 v5, 0x0

    :goto_10
    invoke-static {v2, v5}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_19

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v4, v2}, Lu1/p0;->H(ILjava/lang/String;)V

    goto :goto_d

    :cond_1e
    move-object/from16 v22, v11

    sget-object v11, Ly1/r;->d:Ly1/u;

    invoke-static {v5, v11}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_20

    invoke-interface/range {v19 .. v19}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    const-string v5, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v2, v5}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/String;

    iget-object v5, v9, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v5, v11}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1f

    const/16 v5, 0x8

    invoke-virtual {v1, v8, v5, v2}, Lu1/p0;->L(IILjava/lang/String;)V

    :cond_1f
    :goto_11
    move-object v0, v6

    move-object/from16 v20, v7

    move-object/from16 v23, v13

    move-object/from16 v24, v14

    :goto_12
    move-object/from16 v25, v15

    :goto_13
    move-object/from16 v6, v22

    goto :goto_e

    :cond_20
    sget-object v11, Ly1/r;->b:Ly1/u;

    invoke-static {v5, v11}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    const/16 v23, 0x40

    if-eqz v11, :cond_21

    goto :goto_14

    :cond_21
    sget-object v11, Ly1/r;->B:Ly1/u;

    invoke-static {v5, v11}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_22

    :goto_14
    invoke-virtual {v1, v8}, Lu1/p0;->E(I)I

    move-result v2

    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/16 v9, 0x8

    const/16 v11, 0x800

    invoke-static {v1, v2, v11, v5, v9}, Lu1/p0;->K(Lu1/p0;IILjava/lang/Integer;I)V

    invoke-virtual {v1, v8}, Lu1/p0;->E(I)I

    move-result v2

    invoke-static {v1, v2, v11, v12, v9}, Lu1/p0;->K(Lu1/p0;IILjava/lang/Integer;I)V

    goto :goto_11

    :cond_22
    move-object/from16 v24, v14

    const/16 v14, 0x8

    sget-object v11, Ly1/r;->c:Ly1/u;

    invoke-static {v5, v11}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_23

    invoke-virtual {v1, v8}, Lu1/p0;->E(I)I

    move-result v2

    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/16 v9, 0x800

    invoke-static {v1, v2, v9, v5, v14}, Lu1/p0;->K(Lu1/p0;IILjava/lang/Integer;I)V

    invoke-virtual {v1, v8}, Lu1/p0;->E(I)I

    move-result v2

    invoke-static {v1, v2, v9, v12, v14}, Lu1/p0;->K(Lu1/p0;IILjava/lang/Integer;I)V

    move-object v0, v6

    move-object/from16 v20, v7

    move-object/from16 v23, v13

    goto :goto_12

    :cond_23
    sget-object v11, Ly1/r;->A:Ly1/u;

    invoke-static {v5, v11}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    move-object/from16 v25, v15

    iget-object v15, v6, Ly1/o;->c:Landroidx/compose/ui/node/a;

    const/4 v0, 0x4

    if-eqz v14, :cond_2b

    invoke-virtual {v6}, Ly1/o;->h()Ly1/j;

    move-result-object v2

    sget-object v5, Ly1/r;->s:Ly1/u;

    invoke-static {v2, v5}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly1/g;

    if-nez v2, :cond_25

    :cond_24
    const/16 v2, 0x800

    const/16 v5, 0x8

    goto/16 :goto_18

    :cond_25
    iget v2, v2, Ly1/g;->a:I

    invoke-static {v2, v0}, Ly1/g;->a(II)Z

    move-result v2

    if-eqz v2, :cond_24

    invoke-virtual {v6}, Ly1/o;->h()Ly1/j;

    move-result-object v2

    invoke-static {v2, v11}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v2

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v2, v5}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2a

    invoke-virtual {v1, v8}, Lu1/p0;->E(I)I

    move-result v2

    invoke-virtual {v1, v2, v0}, Lu1/p0;->m(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v0

    new-instance v2, Ly1/o;

    iget-object v5, v6, Ly1/o;->a:Ly0/n;

    const/4 v9, 0x1

    invoke-direct {v2, v5, v9, v15, v3}, Ly1/o;-><init>(Ly0/n;ZLandroidx/compose/ui/node/a;Ly1/j;)V

    invoke-virtual {v2}, Ly1/o;->h()Ly1/j;

    move-result-object v5

    sget-object v9, Ly1/r;->a:Ly1/u;

    invoke-static {v5, v9}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    if-eqz v5, :cond_26

    const-string v9, ","

    invoke-static {v5, v9}, Li1/b;->o(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_15

    :cond_26
    const/4 v5, 0x0

    :goto_15
    invoke-virtual {v2}, Ly1/o;->h()Ly1/j;

    move-result-object v2

    invoke-static {v2, v10}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-eqz v2, :cond_27

    const-string v9, ","

    invoke-static {v2, v9}, Li1/b;->o(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_16

    :cond_27
    const/4 v2, 0x0

    :goto_16
    if-eqz v5, :cond_28

    invoke-virtual {v0, v5}, Landroid/view/accessibility/AccessibilityRecord;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_28
    if-eqz v2, :cond_29

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_29
    invoke-virtual {v1, v0}, Lu1/p0;->I(Landroid/view/accessibility/AccessibilityEvent;)Z

    :goto_17
    move-object v0, v6

    move-object/from16 v20, v7

    move-object/from16 v23, v13

    goto/16 :goto_13

    :cond_2a
    invoke-virtual {v1, v8}, Lu1/p0;->E(I)I

    move-result v0

    const/16 v2, 0x800

    const/16 v5, 0x8

    invoke-static {v1, v0, v2, v12, v5}, Lu1/p0;->K(Lu1/p0;IILjava/lang/Integer;I)V

    goto :goto_17

    :goto_18
    invoke-virtual {v1, v8}, Lu1/p0;->E(I)I

    move-result v0

    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v1, v0, v2, v9, v5}, Lu1/p0;->K(Lu1/p0;IILjava/lang/Integer;I)V

    invoke-virtual {v1, v8}, Lu1/p0;->E(I)I

    move-result v0

    invoke-static {v1, v0, v2, v12, v5}, Lu1/p0;->K(Lu1/p0;IILjava/lang/Integer;I)V

    goto :goto_17

    :cond_2b
    sget-object v10, Ly1/r;->a:Ly1/u;

    invoke-static {v5, v10}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_2c

    invoke-virtual {v1, v8}, Lu1/p0;->E(I)I

    move-result v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface/range {v19 .. v19}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    const-string v9, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>"

    invoke-static {v5, v9}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Ljava/util/List;

    const/16 v9, 0x800

    invoke-virtual {v1, v2, v9, v0, v5}, Lu1/p0;->J(IILjava/lang/Integer;Ljava/util/List;)Z

    goto :goto_17

    :cond_2c
    sget-object v0, Ly1/r;->x:Ly1/u;

    invoke-static {v5, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    const-string v11, ""

    const-wide v26, 0xffffffffL

    if-eqz v10, :cond_3e

    sget-object v2, Ly1/i;->h:Ly1/u;

    iget-object v5, v3, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v5, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3d

    iget-object v2, v9, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v2, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_2d

    const/4 v2, 0x0

    :cond_2d
    check-cast v2, La2/e;

    if-eqz v2, :cond_2e

    goto :goto_19

    :cond_2e
    move-object v2, v11

    :goto_19
    iget-object v5, v3, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v5, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2f

    const/4 v0, 0x0

    :cond_2f
    check-cast v0, La2/e;

    if-eqz v0, :cond_30

    move-object v11, v0

    :cond_30
    invoke-static {v11}, Lu1/p0;->R(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v5

    invoke-interface {v11}, Ljava/lang/CharSequence;->length()I

    move-result v9

    if-le v5, v9, :cond_31

    move v10, v9

    goto :goto_1a

    :cond_31
    move v10, v5

    :goto_1a
    const/4 v14, 0x0

    :goto_1b
    if-ge v14, v10, :cond_33

    invoke-interface {v2, v14}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v15

    move-object/from16 v23, v13

    invoke-interface {v11, v14}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v13

    if-eq v15, v13, :cond_32

    goto :goto_1c

    :cond_32
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v13, v23

    goto :goto_1b

    :cond_33
    move-object/from16 v23, v13

    :goto_1c
    const/4 v13, 0x0

    :goto_1d
    sub-int v15, v10, v14

    if-ge v13, v15, :cond_35

    add-int/lit8 v15, v5, -0x1

    sub-int/2addr v15, v13

    invoke-interface {v2, v15}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v15

    add-int/lit8 v19, v9, -0x1

    move/from16 v21, v10

    sub-int v10, v19, v13

    invoke-interface {v11, v10}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v10

    if-eq v15, v10, :cond_34

    goto :goto_1e

    :cond_34
    add-int/lit8 v13, v13, 0x1

    move/from16 v10, v21

    goto :goto_1d

    :cond_35
    :goto_1e
    sub-int/2addr v5, v13

    sub-int/2addr v5, v14

    sub-int v10, v9, v13

    sub-int/2addr v10, v14

    iget-object v11, v7, Lu1/g0;->a:Ly1/o;

    iget-object v13, v11, Ly1/o;->d:Ly1/j;

    sget-object v15, Ly1/i;->h:Ly1/u;

    iget-object v13, v13, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v13, v15}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_36

    invoke-virtual {v11}, Ly1/o;->h()Ly1/j;

    move-result-object v13

    move-object/from16 v28, v7

    sget-object v7, Ly1/r;->C:Ly1/u;

    iget-object v13, v13, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v13, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_37

    invoke-virtual {v6}, Ly1/o;->h()Ly1/j;

    move-result-object v13

    iget-object v13, v13, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v13, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_37

    const/4 v13, 0x1

    goto :goto_1f

    :cond_36
    move-object/from16 v28, v7

    :cond_37
    const/4 v13, 0x0

    :goto_1f
    iget-object v7, v11, Ly1/o;->d:Ly1/j;

    iget-object v7, v7, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v7, v15}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_38

    invoke-virtual {v11}, Ly1/o;->h()Ly1/j;

    move-result-object v7

    sget-object v11, Ly1/r;->C:Ly1/u;

    iget-object v7, v7, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v7, v11}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_38

    invoke-virtual {v6}, Ly1/o;->h()Ly1/j;

    move-result-object v7

    iget-object v7, v7, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v7, v11}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_38

    const/4 v15, 0x1

    goto :goto_20

    :cond_38
    const/4 v15, 0x0

    :goto_20
    if-nez v13, :cond_39

    if-eqz v15, :cond_3a

    :cond_39
    const/16 v11, 0x10

    goto :goto_21

    :cond_3a
    invoke-virtual {v1, v8}, Lu1/p0;->E(I)I

    move-result v7

    const/16 v11, 0x10

    invoke-virtual {v1, v7, v11}, Lu1/p0;->m(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v7

    invoke-virtual {v7, v14}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    invoke-virtual {v7, v5}, Landroid/view/accessibility/AccessibilityRecord;->setRemovedCount(I)V

    invoke-virtual {v7, v10}, Landroid/view/accessibility/AccessibilityRecord;->setAddedCount(I)V

    invoke-virtual {v7, v2}, Landroid/view/accessibility/AccessibilityRecord;->setBeforeText(Ljava/lang/CharSequence;)V

    invoke-virtual {v7}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object v14, v6

    move v2, v8

    move-object/from16 v29, v22

    move-object/from16 v20, v28

    const/16 v5, 0x20

    goto :goto_22

    :goto_21
    invoke-virtual {v1, v8}, Lu1/p0;->E(I)I

    move-result v7

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    move-object v14, v6

    move-object v6, v1

    move-object/from16 v20, v28

    move v2, v8

    move-object v8, v12

    const/16 v5, 0x20

    move-object v9, v12

    move-object/from16 v29, v22

    move-object v11, v0

    invoke-virtual/range {v6 .. v11}, Lu1/p0;->n(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v7

    :goto_22
    const-string v0, "android.widget.EditText"

    invoke-virtual {v7, v0}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    invoke-virtual {v1, v7}, Lu1/p0;->I(Landroid/view/accessibility/AccessibilityEvent;)Z

    if-nez v13, :cond_3c

    if-eqz v15, :cond_3b

    goto :goto_25

    :cond_3b
    :goto_23
    move v13, v2

    move-object v0, v14

    move-object/from16 v6, v29

    move v14, v5

    :goto_24
    const/4 v5, 0x1

    goto/16 :goto_2d

    :cond_3c
    :goto_25
    sget-object v0, Ly1/r;->y:Ly1/u;

    invoke-virtual {v3, v0}, Ly1/j;->e(Ly1/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La2/b0;

    iget-wide v8, v0, La2/b0;->a:J

    shr-long v10, v8, v5

    long-to-int v0, v10

    invoke-virtual {v7, v0}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    and-long v8, v8, v26

    long-to-int v0, v8

    invoke-virtual {v7, v0}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    invoke-virtual {v1, v7}, Lu1/p0;->I(Landroid/view/accessibility/AccessibilityEvent;)Z

    goto :goto_23

    :cond_3d
    move-object v14, v6

    move-object/from16 v20, v7

    move v2, v8

    move-object/from16 v23, v13

    move-object/from16 v29, v22

    const/16 v5, 0x20

    invoke-virtual {v1, v2}, Lu1/p0;->E(I)I

    move-result v0

    const/4 v13, 0x2

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/16 v7, 0x800

    const/16 v8, 0x8

    invoke-static {v1, v0, v7, v6, v8}, Lu1/p0;->K(Lu1/p0;IILjava/lang/Integer;I)V

    goto :goto_23

    :cond_3e
    move-object v14, v6

    move-object/from16 v20, v7

    move-object/from16 v23, v13

    move-object/from16 v29, v22

    const/16 v10, 0x20

    const/4 v13, 0x2

    sget-object v6, Ly1/r;->y:Ly1/u;

    invoke-static {v5, v6}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_42

    iget-object v2, v3, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v2, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_3f

    const/4 v0, 0x0

    :cond_3f
    check-cast v0, La2/e;

    if-eqz v0, :cond_41

    iget-object v0, v0, La2/e;->a:Ljava/lang/String;

    if-nez v0, :cond_40

    goto :goto_26

    :cond_40
    move-object v11, v0

    :cond_41
    :goto_26
    invoke-virtual {v3, v6}, Ly1/j;->e(Ly1/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La2/b0;

    invoke-virtual {v1, v8}, Lu1/p0;->E(I)I

    move-result v7

    iget-wide v5, v0, La2/b0;->a:J

    move-object v0, v14

    shr-long v13, v5, v10

    long-to-int v2, v13

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    and-long v5, v5, v26

    long-to-int v5, v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v11}, Lu1/p0;->R(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v11

    move-object v6, v1

    move v13, v8

    move-object v8, v2

    move v14, v10

    move-object v10, v5

    invoke-virtual/range {v6 .. v11}, Lu1/p0;->n(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v2

    invoke-virtual {v1, v2}, Lu1/p0;->I(Landroid/view/accessibility/AccessibilityEvent;)Z

    invoke-virtual {v1, v4}, Lu1/p0;->M(I)V

    move-object/from16 v6, v29

    goto/16 :goto_24

    :cond_42
    move v13, v8

    move-object v0, v14

    move v14, v10

    invoke-static {v5, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_43

    goto :goto_27

    :cond_43
    sget-object v6, Ly1/r;->p:Ly1/u;

    invoke-static {v5, v6}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_47

    :goto_27
    invoke-virtual {v1, v15}, Lu1/p0;->A(Landroidx/compose/ui/node/a;)V

    move-object/from16 v6, v29

    invoke-static {v13, v6}, Lu1/r0;->b(ILjava/util/ArrayList;)Lu1/r2;

    move-result-object v5

    invoke-static {v5}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v7, v3, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v7, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_44

    const/4 v2, 0x0

    :cond_44
    check-cast v2, Ly1/h;

    iput-object v2, v5, Lu1/r2;->e:Ly1/h;

    sget-object v2, Ly1/r;->p:Ly1/u;

    iget-object v7, v3, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v7, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_45

    const/4 v2, 0x0

    :cond_45
    check-cast v2, Ly1/h;

    iput-object v2, v5, Lu1/r2;->f:Ly1/h;

    iget-object v2, v5, Lu1/r2;->b:Ljava/util/List;

    invoke-interface {v2, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_46

    goto/16 :goto_24

    :cond_46
    iget-object v2, v1, Lu1/p0;->d:Lu1/w;

    invoke-virtual {v2}, Lu1/w;->getSnapshotObserver()Lt1/n1;

    move-result-object v2

    new-instance v7, Lu/r0;

    const/16 v8, 0xf

    invoke-direct {v7, v8, v5, v1}, Lu/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object v8, v1, Lu1/p0;->V:Lu1/l0;

    invoke-virtual {v2, v5, v8, v7}, Lt1/n1;->a(Lt1/m1;Lc9/c;Lc9/a;)V

    goto/16 :goto_24

    :cond_47
    move-object/from16 v6, v29

    sget-object v2, Ly1/r;->k:Ly1/u;

    invoke-static {v5, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_49

    invoke-interface/range {v19 .. v19}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    const-string v5, "null cannot be cast to non-null type kotlin.Boolean"

    invoke-static {v2, v5}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_48

    invoke-virtual {v1, v4}, Lu1/p0;->E(I)I

    move-result v2

    const/16 v5, 0x8

    invoke-virtual {v1, v2, v5}, Lu1/p0;->m(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v2

    invoke-virtual {v1, v2}, Lu1/p0;->I(Landroid/view/accessibility/AccessibilityEvent;)Z

    goto :goto_28

    :cond_48
    const/16 v5, 0x8

    :goto_28
    invoke-virtual {v1, v4}, Lu1/p0;->E(I)I

    move-result v2

    const/16 v7, 0x800

    invoke-static {v1, v2, v7, v12, v5}, Lu1/p0;->K(Lu1/p0;IILjava/lang/Integer;I)V

    goto/16 :goto_24

    :cond_49
    sget-object v2, Ly1/i;->u:Ly1/u;

    invoke-static {v5, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_51

    invoke-virtual {v3, v2}, Ly1/j;->e(Ly1/u;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v9, v2}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-eqz v2, :cond_4e

    new-instance v7, Ljava/util/LinkedHashSet;

    invoke-direct {v7}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v8

    if-gtz v8, :cond_4d

    new-instance v5, Ljava/util/LinkedHashSet;

    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v8

    if-gtz v8, :cond_4c

    invoke-interface {v7, v5}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result v2

    if-eqz v2, :cond_4b

    invoke-interface {v5, v7}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result v2

    if-nez v2, :cond_4a

    goto :goto_29

    :cond_4a
    const/16 v18, 0x0

    goto :goto_2a

    :cond_4b
    :goto_29
    const/16 v18, 0x1

    :goto_2a
    move-object v11, v6

    move v8, v13

    move-object/from16 v7, v20

    move-object/from16 v13, v23

    move-object/from16 v14, v24

    move-object/from16 v15, v25

    const/4 v2, 0x2

    const/4 v5, 0x1

    :goto_2b
    move-object v6, v0

    move-object/from16 v0, p0

    goto/16 :goto_b

    :cond_4c
    const/4 v7, 0x0

    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La7/a;->w(Ljava/lang/Object;)V

    const/4 v0, 0x0

    throw v0

    :cond_4d
    const/4 v0, 0x0

    const/4 v7, 0x0

    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La7/a;->w(Ljava/lang/Object;)V

    throw v0

    :cond_4e
    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    const/4 v5, 0x1

    xor-int/2addr v2, v5

    if-eqz v2, :cond_50

    :cond_4f
    :goto_2c
    move/from16 v18, v5

    :cond_50
    :goto_2d
    move-object v11, v6

    move v8, v13

    move-object/from16 v7, v20

    move-object/from16 v13, v23

    move-object/from16 v14, v24

    move-object/from16 v15, v25

    const/4 v2, 0x2

    goto :goto_2b

    :cond_51
    const/4 v5, 0x1

    invoke-interface/range {v19 .. v19}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    instance-of v2, v2, Ly1/a;

    if-eqz v2, :cond_4f

    invoke-interface/range {v19 .. v19}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    const-string v7, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>"

    invoke-static {v2, v7}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ly1/a;

    invoke-interface/range {v19 .. v19}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ly1/u;

    invoke-static {v9, v7}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v7

    sget-object v8, Lu1/r0;->a:Ld1/d;

    if-ne v2, v7, :cond_52

    goto :goto_2f

    :cond_52
    instance-of v8, v7, Ly1/a;

    if-nez v8, :cond_53

    goto :goto_2e

    :cond_53
    check-cast v7, Ly1/a;

    iget-object v8, v7, Ly1/a;->a:Ljava/lang/String;

    iget-object v9, v2, Ly1/a;->a:Ljava/lang/String;

    invoke-static {v9, v8}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_54

    goto :goto_2e

    :cond_54
    iget-object v7, v7, Ly1/a;->b:Lq8/a;

    iget-object v2, v2, Ly1/a;->b:Lq8/a;

    if-nez v2, :cond_55

    if-eqz v7, :cond_55

    goto :goto_2e

    :cond_55
    if-eqz v2, :cond_56

    if-nez v7, :cond_56

    :goto_2e
    goto :goto_2c

    :cond_56
    :goto_2f
    const/16 v18, 0x0

    goto :goto_2d

    :cond_57
    move-object v0, v6

    move-object v6, v11

    move-object/from16 v23, v13

    move-object/from16 v24, v14

    move-object/from16 v25, v15

    move v13, v8

    if-nez v18, :cond_59

    sget-object v2, Lu1/r0;->a:Ld1/d;

    invoke-virtual {v9}, Ly1/j;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_58
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-virtual {v0}, Ly1/o;->h()Ly1/j;

    move-result-object v4

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly1/u;

    iget-object v4, v4, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v4, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_58

    goto :goto_30

    :cond_59
    if-eqz v18, :cond_5a

    :goto_30
    invoke-virtual {v1, v13}, Lu1/p0;->E(I)I

    move-result v0

    const/16 v2, 0x800

    const/16 v3, 0x8

    invoke-static {v1, v0, v2, v12, v3}, Lu1/p0;->K(Lu1/p0;IILjava/lang/Integer;I)V

    :cond_5a
    move-object/from16 v0, p0

    move-object v11, v6

    move-object/from16 v13, v23

    move-object/from16 v14, v24

    move-object/from16 v15, v25

    const/4 v2, 0x2

    goto/16 :goto_a

    :cond_5b
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "no value for specified key"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5c
    move-object/from16 v23, v13

    const/16 v14, 0x20

    new-instance v0, Lq/g;

    const/4 v2, 0x0

    invoke-direct {v0, v2}, Lq/g;-><init>(I)V

    iget-object v2, v1, Lu1/p0;->K:Lq/g;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Lq/b;

    invoke-direct {v3, v2}, Lq/b;-><init>(Lq/g;)V

    :cond_5d
    :goto_31
    invoke-virtual {v3}, Lq/h;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_62

    invoke-virtual {v3}, Lq/h;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-virtual {v1}, Lu1/p0;->r()Ljava/util/Map;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lu1/s2;

    if-eqz v5, :cond_5e

    iget-object v5, v5, Lu1/s2;->a:Ly1/o;

    goto :goto_32

    :cond_5e
    const/4 v5, 0x0

    :goto_32
    if-eqz v5, :cond_5f

    invoke-virtual {v5}, Ly1/o;->h()Ly1/j;

    move-result-object v5

    sget-object v6, Ly1/r;->d:Ly1/u;

    iget-object v5, v5, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v5, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5d

    :cond_5f
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v0, v5}, Lq/g;->add(Ljava/lang/Object;)Z

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v7, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lu1/g0;

    if-eqz v5, :cond_61

    iget-object v5, v5, Lu1/g0;->b:Ly1/j;

    if-eqz v5, :cond_61

    sget-object v6, Ly1/r;->d:Ly1/u;

    iget-object v5, v5, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v5, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_60

    const/4 v5, 0x0

    :cond_60
    check-cast v5, Ljava/lang/String;

    goto :goto_33

    :cond_61
    const/4 v5, 0x0

    :goto_33
    invoke-virtual {v1, v4, v14, v5}, Lu1/p0;->L(IILjava/lang/String;)V

    goto :goto_31

    :cond_62
    iget v3, v0, Lq/g;->c:I

    const/4 v4, 0x0

    :goto_34
    if-ge v4, v3, :cond_63

    iget-object v5, v0, Lq/g;->b:[Ljava/lang/Object;

    aget-object v5, v5, v4

    invoke-virtual {v2, v5}, Lq/g;->remove(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_34

    :cond_63
    invoke-virtual {v7}, Ljava/util/LinkedHashMap;->clear()V

    invoke-virtual {v1}, Lu1/p0;->r()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_35
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_65

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lu1/s2;

    iget-object v4, v4, Lu1/s2;->a:Ly1/o;

    invoke-virtual {v4}, Ly1/o;->h()Ly1/j;

    move-result-object v4

    sget-object v5, Ly1/r;->d:Ly1/u;

    iget-object v4, v4, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v4, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_64

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v4}, Lq/g;->add(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_64

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lu1/s2;

    iget-object v6, v6, Lu1/s2;->a:Ly1/o;

    iget-object v6, v6, Ly1/o;->d:Ly1/j;

    invoke-virtual {v6, v5}, Ly1/j;->e(Ly1/u;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    const/16 v6, 0x10

    invoke-virtual {v1, v4, v6, v5}, Lu1/p0;->L(IILjava/lang/String;)V

    goto :goto_36

    :cond_64
    const/16 v6, 0x10

    :goto_36
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    new-instance v5, Lu1/g0;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lu1/s2;

    iget-object v3, v3, Lu1/s2;->a:Ly1/o;

    invoke-virtual {v1}, Lu1/p0;->r()Ljava/util/Map;

    move-result-object v8

    invoke-direct {v5, v3, v8}, Lu1/g0;-><init>(Ly1/o;Ljava/util/Map;)V

    invoke-interface {v7, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_35

    :cond_65
    new-instance v0, Lu1/g0;

    invoke-virtual/range {v23 .. v23}, Lu1/w;->getSemanticsOwner()Ly1/p;

    move-result-object v2

    invoke-virtual {v2}, Ly1/p;->a()Ly1/o;

    move-result-object v2

    invoke-virtual {v1}, Lu1/p0;->r()Ljava/util/Map;

    move-result-object v3

    invoke-direct {v0, v2, v3}, Lu1/g0;-><init>(Ly1/o;Ljava/util/Map;)V

    iput-object v0, v1, Lu1/p0;->R:Lu1/g0;

    const/4 v0, 0x0

    iput-boolean v0, v1, Lu1/p0;->S:Z

    return-void

    :pswitch_a
    move-object v1, v0

    move v0, v3

    iget-object v2, v1, Landroidx/activity/d;->b:Ljava/lang/Object;

    check-cast v2, Lu1/w;

    iput-boolean v0, v2, Lu1/w;->x0:Z

    iget-object v0, v2, Lu1/w;->r0:Landroid/view/MotionEvent;

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v3

    const/16 v4, 0xa

    if-ne v3, v4, :cond_66

    invoke-virtual {v2, v0}, Lu1/w;->B(Landroid/view/MotionEvent;)I

    return-void

    :cond_66
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "The ACTION_HOVER_EXIT event was not cleared."

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_b
    move-object v1, v0

    iget-object v0, v1, Landroidx/activity/d;->b:Ljava/lang/Object;

    check-cast v0, Lj0/t;

    invoke-static {v0}, Lj0/t;->a(Lj0/t;)V

    return-void

    :pswitch_c
    move-object v1, v0

    iget-object v0, v1, Landroidx/activity/d;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/activity/r;

    invoke-static {v0}, Landroidx/activity/r;->a(Landroidx/activity/r;)V

    return-void

    :pswitch_d
    move-object v1, v0

    iget-object v0, v1, Landroidx/activity/d;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/activity/o;

    iget-object v2, v0, Landroidx/activity/o;->b:Ljava/lang/Runnable;

    if-eqz v2, :cond_67

    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    const/4 v2, 0x0

    iput-object v2, v0, Landroidx/activity/o;->b:Ljava/lang/Runnable;

    :cond_67
    return-void

    :pswitch_e
    move-object v1, v0

    iget-object v0, v1, Landroidx/activity/d;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/activity/p;

    invoke-virtual {v0}, Landroidx/activity/p;->invalidateMenu()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
