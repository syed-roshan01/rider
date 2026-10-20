.class public abstract Lu1/y0;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lm0/p0;

.field public static final b:Lm0/m3;

.field public static final c:Lm0/m3;

.field public static final d:Lm0/m3;

.field public static final e:Lm0/m3;

.field public static final f:Lm0/m3;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Lu1/q0;->d:Lu1/q0;

    sget-object v1, Lm0/o3;->a:Lm0/o3;

    new-instance v2, Lm0/p0;

    invoke-direct {v2, v1, v0}, Lm0/p0;-><init>(Lm0/z2;Lc9/a;)V

    sput-object v2, Lu1/y0;->a:Lm0/p0;

    sget-object v0, Lu1/q0;->e:Lu1/q0;

    new-instance v1, Lm0/m3;

    invoke-direct {v1, v0}, Lm0/z;-><init>(Lc9/a;)V

    sput-object v1, Lu1/y0;->b:Lm0/m3;

    sget-object v0, Lu1/q0;->f:Lu1/q0;

    new-instance v1, Lm0/m3;

    invoke-direct {v1, v0}, Lm0/z;-><init>(Lc9/a;)V

    sput-object v1, Lu1/y0;->c:Lm0/m3;

    sget-object v0, Lu1/q0;->n:Lu1/q0;

    new-instance v1, Lm0/m3;

    invoke-direct {v1, v0}, Lm0/z;-><init>(Lc9/a;)V

    sput-object v1, Lu1/y0;->d:Lm0/m3;

    sget-object v0, Lu1/q0;->o:Lu1/q0;

    new-instance v1, Lm0/m3;

    invoke-direct {v1, v0}, Lm0/z;-><init>(Lc9/a;)V

    sput-object v1, Lu1/y0;->e:Lm0/m3;

    sget-object v0, Lu1/q0;->p:Lu1/q0;

    new-instance v1, Lm0/m3;

    invoke-direct {v1, v0}, Lm0/z;-><init>(Lc9/a;)V

    sput-object v1, Lu1/y0;->f:Lm0/m3;

    return-void
.end method

.method public static final a(Lu1/w;Lc9/e;Lm0/m;I)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    check-cast v2, Lm0/q;

    const v3, 0x5342453c

    invoke-virtual {v2, v3}, Lm0/q;->a0(I)Lm0/q;

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const v4, -0x1d58f75c

    invoke-virtual {v2, v4}, Lm0/q;->Z(I)V

    invoke-virtual {v2}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v5

    sget-object v6, Lm0/l;->a:Lk0/y0;

    if-ne v5, v6, :cond_0

    new-instance v5, Landroid/content/res/Configuration;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v7

    invoke-direct {v5, v7}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    sget-object v7, Lm0/o3;->a:Lm0/o3;

    invoke-static {v5, v7}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object v5

    invoke-virtual {v2, v5}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_0
    const/4 v7, 0x0

    invoke-virtual {v2, v7}, Lm0/q;->t(Z)V

    check-cast v5, Lm0/g1;

    const v8, -0x2f866d6d

    invoke-virtual {v2, v8}, Lm0/q;->Z(I)V

    invoke-virtual {v2, v5}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v2}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_1

    if-ne v9, v6, :cond_2

    :cond_1
    new-instance v9, Lu1/w0;

    invoke-direct {v9, v7, v5}, Lu1/w0;-><init>(ILm0/g1;)V

    invoke-virtual {v2, v9}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_2
    check-cast v9, Lc9/c;

    invoke-virtual {v2, v7}, Lm0/q;->t(Z)V

    invoke-virtual {v0, v9}, Lu1/w;->setConfigurationChangeObserver(Lc9/c;)V

    invoke-virtual {v2, v4}, Lm0/q;->Z(I)V

    invoke-virtual {v2}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v6, :cond_3

    new-instance v8, Lu1/h1;

    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v2, v8}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_3
    invoke-virtual {v2, v7}, Lm0/q;->t(Z)V

    check-cast v8, Lu1/h1;

    invoke-virtual/range {p0 .. p0}, Lu1/w;->getViewTreeOwners()Lu1/q;

    move-result-object v9

    if-eqz v9, :cond_d

    invoke-virtual {v2, v4}, Lm0/q;->Z(I)V

    invoke-virtual {v2}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v10

    iget-object v11, v9, Lu1/q;->b:Lb4/g;

    if-ne v10, v6, :cond_7

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v10

    const-string v12, "null cannot be cast to non-null type android.view.View"

    invoke-static {v10, v12}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v10, Landroid/view/View;

    const v12, 0x7f080057

    invoke-virtual {v10, v12}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v12

    instance-of v13, v12, Ljava/lang/String;

    const/4 v14, 0x0

    if-eqz v13, :cond_4

    check-cast v12, Ljava/lang/String;

    goto :goto_0

    :cond_4
    move-object v12, v14

    :goto_0
    if-nez v12, :cond_5

    invoke-virtual {v10}, Landroid/view/View;->getId()I

    move-result v10

    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v12

    :cond_5
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-class v13, Lv0/l;

    invoke-virtual {v13}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v13, 0x3a

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v11}, Lb4/g;->getSavedStateRegistry()Lb4/e;

    move-result-object v12

    invoke-virtual {v12, v10}, Lb4/e;->a(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v13

    if-eqz v13, :cond_6

    new-instance v14, Ljava/util/LinkedHashMap;

    invoke-direct {v14}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {v13}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v15

    check-cast v15, Ljava/lang/Iterable;

    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_1
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_6

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v4, v16

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v13, v4}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v7

    move-object/from16 v17, v13

    const-string v13, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }"

    invoke-static {v7, v13}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v14, v4, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v13, v17

    const v4, -0x1d58f75c

    const/4 v7, 0x0

    goto :goto_1

    :cond_6
    sget-object v4, Lu1/s;->o:Lu1/s;

    sget-object v7, Lv0/o;->a:Lm0/m3;

    new-instance v7, Lv0/n;

    invoke-direct {v7, v14, v4}, Lv0/n;-><init>(Ljava/util/Map;Lc9/c;)V

    const/4 v4, 0x1

    :try_start_0
    new-instance v13, Landroidx/activity/f;

    invoke-direct {v13, v7, v4}, Landroidx/activity/f;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v12, v10, v13}, Lb4/e;->d(Ljava/lang/String;Lb4/d;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move v13, v4

    goto :goto_2

    :catch_0
    const/4 v13, 0x0

    :goto_2
    new-instance v14, Lu1/w1;

    new-instance v15, Lf0/d0;

    invoke-direct {v15, v4, v12, v10, v13}, Lf0/d0;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    invoke-direct {v14, v7, v15}, Lu1/w1;-><init>(Lv0/n;Lf0/d0;)V

    invoke-virtual {v2, v14}, Lm0/q;->l0(Ljava/lang/Object;)V

    move-object v10, v14

    const/4 v4, 0x0

    goto :goto_3

    :cond_7
    move v4, v7

    :goto_3
    invoke-virtual {v2, v4}, Lm0/q;->t(Z)V

    check-cast v10, Lu1/w1;

    sget-object v4, Lq8/l;->a:Lq8/l;

    new-instance v7, Lh1/b;

    const/4 v12, 0x7

    invoke-direct {v7, v10, v12}, Lh1/b;-><init>(Ljava/lang/Object;I)V

    invoke-static {v4, v7, v2}, Lm0/s;->a(Ljava/lang/Object;Lc9/c;Lm0/m;)V

    invoke-interface {v5}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/res/Configuration;

    const v7, -0x1cf65f46

    invoke-virtual {v2, v7}, Lm0/q;->Z(I)V

    const v7, -0x1d58f75c

    invoke-virtual {v2, v7}, Lm0/q;->Z(I)V

    invoke-virtual {v2}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v6, :cond_8

    new-instance v13, Lx1/c;

    invoke-direct {v13}, Lx1/c;-><init>()V

    invoke-virtual {v2, v13}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_8
    const/4 v14, 0x0

    invoke-virtual {v2, v14}, Lm0/q;->t(Z)V

    check-cast v13, Lx1/c;

    invoke-virtual {v2, v7}, Lm0/q;->Z(I)V

    invoke-virtual {v2}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v6, :cond_a

    new-instance v7, Landroid/content/res/Configuration;

    invoke-direct {v7}, Landroid/content/res/Configuration;-><init>()V

    if-eqz v4, :cond_9

    invoke-virtual {v7, v4}, Landroid/content/res/Configuration;->setTo(Landroid/content/res/Configuration;)V

    :cond_9
    invoke-virtual {v2, v7}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_a
    const/4 v4, 0x0

    invoke-virtual {v2, v4}, Lm0/q;->t(Z)V

    check-cast v7, Landroid/content/res/Configuration;

    const v14, -0x1d58f75c

    invoke-virtual {v2, v14}, Lm0/q;->Z(I)V

    invoke-virtual {v2}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v14

    if-ne v14, v6, :cond_b

    new-instance v14, Lu1/x0;

    invoke-direct {v14, v7, v13}, Lu1/x0;-><init>(Landroid/content/res/Configuration;Lx1/c;)V

    invoke-virtual {v2, v14}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_b
    invoke-virtual {v2, v4}, Lm0/q;->t(Z)V

    check-cast v14, Lu1/x0;

    new-instance v6, Lu/s;

    const/16 v7, 0x14

    invoke-direct {v6, v7, v3, v14}, Lu/s;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v13, v6, v2}, Lm0/s;->a(Ljava/lang/Object;Lc9/c;Lm0/m;)V

    invoke-virtual {v2, v4}, Lm0/q;->t(Z)V

    invoke-interface {v5}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/res/Configuration;

    sget-object v5, Lu1/y0;->a:Lm0/p0;

    invoke-virtual {v5, v4}, Lm0/u1;->b(Ljava/lang/Object;)Lm0/v1;

    move-result-object v14

    sget-object v4, Lu1/y0;->b:Lm0/m3;

    invoke-virtual {v4, v3}, Lm0/u1;->b(Ljava/lang/Object;)Lm0/v1;

    move-result-object v15

    iget-object v3, v9, Lu1/q;->a:Landroidx/lifecycle/w;

    sget-object v4, Lu1/y0;->d:Lm0/m3;

    invoke-virtual {v4, v3}, Lm0/u1;->b(Ljava/lang/Object;)Lm0/v1;

    move-result-object v16

    sget-object v3, Lu1/y0;->e:Lm0/m3;

    invoke-virtual {v3, v11}, Lm0/u1;->b(Ljava/lang/Object;)Lm0/v1;

    move-result-object v17

    sget-object v3, Lv0/o;->a:Lm0/m3;

    invoke-virtual {v3, v10}, Lm0/u1;->b(Ljava/lang/Object;)Lm0/v1;

    move-result-object v18

    sget-object v3, Lu1/y0;->f:Lm0/m3;

    invoke-virtual/range {p0 .. p0}, Lu1/w;->getView()Landroid/view/View;

    move-result-object v4

    invoke-virtual {v3, v4}, Lm0/u1;->b(Ljava/lang/Object;)Lm0/v1;

    move-result-object v19

    sget-object v3, Lu1/y0;->c:Lm0/m3;

    invoke-virtual {v3, v13}, Lm0/u1;->b(Ljava/lang/Object;)Lm0/v1;

    move-result-object v20

    filled-new-array/range {v14 .. v20}, [Lm0/v1;

    move-result-object v3

    new-instance v4, Lk0/c;

    const/4 v5, 0x2

    invoke-direct {v4, v0, v8, v1, v5}, Lk0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lc9/e;I)V

    const v5, 0x57b729fc

    invoke-static {v2, v5, v4}, Ld7/t;->K(Lm0/m;ILd9/j;)Lu0/b;

    move-result-object v4

    const/16 v5, 0x38

    invoke-static {v3, v4, v2, v5}, Lf6/a;->c([Lm0/v1;Lc9/e;Lm0/m;I)V

    invoke-virtual {v2}, Lm0/q;->x()Lm0/x1;

    move-result-object v2

    if-eqz v2, :cond_c

    new-instance v3, Lu/x;

    move/from16 v4, p3

    invoke-direct {v3, v0, v1, v4, v12}, Lu/x;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v3, v2, Lm0/x1;->d:Lc9/e;

    :cond_c
    return-void

    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Called when the ViewTreeOwnersAvailability is not yet in Available state"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final b(Ljava/lang/String;)V
    .locals 3

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "CompositionLocal "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " not present"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
