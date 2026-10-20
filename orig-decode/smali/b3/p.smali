.class public final Lb3/p;
.super Ljava/lang/Object;


# instance fields
.field public a:Landroid/view/ViewParent;

.field public b:Landroid/view/ViewParent;

.field public final c:Landroid/view/View;

.field public d:Z

.field public e:[I


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb3/p;->c:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final a(III[I[I)Z
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p5

    iget-boolean v2, v0, Lb3/p;->d:Z

    const/4 v3, 0x0

    if-eqz v2, :cond_8

    move/from16 v2, p3

    invoke-virtual {p0, v2}, Lb3/p;->c(I)Landroid/view/ViewParent;

    move-result-object v4

    if-nez v4, :cond_0

    return v3

    :cond_0
    const/4 v10, 0x1

    if-nez p1, :cond_2

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    if-eqz v1, :cond_8

    aput v3, v1, v3

    aput v3, v1, v10

    goto :goto_3

    :cond_2
    :goto_0
    iget-object v11, v0, Lb3/p;->c:Landroid/view/View;

    if-eqz v1, :cond_3

    invoke-virtual {v11, v1}, Landroid/view/View;->getLocationInWindow([I)V

    aget v5, v1, v3

    aget v6, v1, v10

    move v12, v5

    move v13, v6

    goto :goto_1

    :cond_3
    move v12, v3

    move v13, v12

    :goto_1
    if-nez p4, :cond_5

    iget-object v5, v0, Lb3/p;->e:[I

    if-nez v5, :cond_4

    const/4 v5, 0x2

    new-array v5, v5, [I

    iput-object v5, v0, Lb3/p;->e:[I

    :cond_4
    iget-object v5, v0, Lb3/p;->e:[I

    move-object v14, v5

    goto :goto_2

    :cond_5
    move-object/from16 v14, p4

    :goto_2
    aput v3, v14, v3

    aput v3, v14, v10

    iget-object v5, v0, Lb3/p;->c:Landroid/view/View;

    move/from16 v6, p1

    move/from16 v7, p2

    move-object v8, v14

    move/from16 v9, p3

    invoke-static/range {v4 .. v9}, Li1/b;->y(Landroid/view/ViewParent;Landroid/view/View;II[II)V

    if-eqz v1, :cond_6

    invoke-virtual {v11, v1}, Landroid/view/View;->getLocationInWindow([I)V

    aget v2, v1, v3

    sub-int/2addr v2, v12

    aput v2, v1, v3

    aget v2, v1, v10

    sub-int/2addr v2, v13

    aput v2, v1, v10

    :cond_6
    aget v1, v14, v3

    if-nez v1, :cond_7

    aget v1, v14, v10

    if-eqz v1, :cond_8

    :cond_7
    move v3, v10

    :cond_8
    :goto_3
    return v3
.end method

.method public final b(IIII[II[I)Z
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p5

    iget-boolean v2, v0, Lb3/p;->d:Z

    const/4 v3, 0x0

    if-eqz v2, :cond_7

    move/from16 v2, p6

    invoke-virtual {v0, v2}, Lb3/p;->c(I)Landroid/view/ViewParent;

    move-result-object v4

    if-nez v4, :cond_0

    return v3

    :cond_0
    const/4 v12, 0x1

    if-nez p1, :cond_2

    if-nez p2, :cond_2

    if-nez p3, :cond_2

    if-eqz p4, :cond_1

    goto :goto_0

    :cond_1
    if-eqz v1, :cond_7

    aput v3, v1, v3

    aput v3, v1, v12

    goto :goto_3

    :cond_2
    :goto_0
    iget-object v13, v0, Lb3/p;->c:Landroid/view/View;

    if-eqz v1, :cond_3

    invoke-virtual {v13, v1}, Landroid/view/View;->getLocationInWindow([I)V

    aget v5, v1, v3

    aget v6, v1, v12

    move v14, v5

    move v15, v6

    goto :goto_1

    :cond_3
    move v14, v3

    move v15, v14

    :goto_1
    if-nez p7, :cond_5

    iget-object v5, v0, Lb3/p;->e:[I

    if-nez v5, :cond_4

    const/4 v5, 0x2

    new-array v5, v5, [I

    iput-object v5, v0, Lb3/p;->e:[I

    :cond_4
    iget-object v5, v0, Lb3/p;->e:[I

    aput v3, v5, v3

    aput v3, v5, v12

    move-object v11, v5

    goto :goto_2

    :cond_5
    move-object/from16 v11, p7

    :goto_2
    iget-object v5, v0, Lb3/p;->c:Landroid/view/View;

    move/from16 v6, p1

    move/from16 v7, p2

    move/from16 v8, p3

    move/from16 v9, p4

    move/from16 v10, p6

    invoke-static/range {v4 .. v11}, Li1/b;->z(Landroid/view/ViewParent;Landroid/view/View;IIIII[I)V

    if-eqz v1, :cond_6

    invoke-virtual {v13, v1}, Landroid/view/View;->getLocationInWindow([I)V

    aget v2, v1, v3

    sub-int/2addr v2, v14

    aput v2, v1, v3

    aget v2, v1, v12

    sub-int/2addr v2, v15

    aput v2, v1, v12

    :cond_6
    return v12

    :cond_7
    :goto_3
    return v3
.end method

.method public final c(I)Landroid/view/ViewParent;
    .locals 1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object p1, p0, Lb3/p;->b:Landroid/view/ViewParent;

    return-object p1

    :cond_1
    iget-object p1, p0, Lb3/p;->a:Landroid/view/ViewParent;

    return-object p1
.end method

.method public final d(I)Z
    .locals 0

    invoke-virtual {p0, p1}, Lb3/p;->c(I)Landroid/view/ViewParent;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final e(II)Z
    .locals 8

    invoke-virtual {p0, p2}, Lb3/p;->d(I)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p0, Lb3/p;->d:Z

    if-eqz v0, :cond_8

    iget-object v0, p0, Lb3/p;->c:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    move-object v3, v0

    :goto_0
    if-eqz v2, :cond_8

    instance-of v4, v2, Lb3/q;

    const-string v5, "ViewParentCompat"

    const-string v6, "ViewParent "

    if-eqz v4, :cond_1

    move-object v7, v2

    check-cast v7, Lb3/q;

    invoke-interface {v7, v3, v0, p1, p2}, Lb3/q;->f(Landroid/view/View;Landroid/view/View;II)Z

    move-result v7

    goto :goto_1

    :cond_1
    if-nez p2, :cond_6

    :try_start_0
    invoke-static {v2, v3, v0, p1}, Lb3/v0;->f(Landroid/view/ViewParent;Landroid/view/View;Landroid/view/View;I)Z

    move-result v7
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_1

    :goto_1
    if-eqz v7, :cond_6

    if-eqz p2, :cond_3

    if-eq p2, v1, :cond_2

    goto :goto_2

    :cond_2
    iput-object v2, p0, Lb3/p;->b:Landroid/view/ViewParent;

    goto :goto_2

    :cond_3
    iput-object v2, p0, Lb3/p;->a:Landroid/view/ViewParent;

    :goto_2
    if-eqz v4, :cond_4

    check-cast v2, Lb3/q;

    invoke-interface {v2, v3, v0, p1, p2}, Lb3/q;->a(Landroid/view/View;Landroid/view/View;II)V

    goto :goto_3

    :cond_4
    if-nez p2, :cond_5

    :try_start_1
    invoke-static {v2, v3, v0, p1}, Lb3/v0;->e(Landroid/view/ViewParent;Landroid/view/View;Landroid/view/View;I)V
    :try_end_1
    .catch Ljava/lang/AbstractMethodError; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " does not implement interface method onNestedScrollAccepted"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v5, p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_5
    :goto_3
    return v1

    :catch_1
    move-exception v4

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " does not implement interface method onStartNestedScroll"

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_6
    instance-of v4, v2, Landroid/view/View;

    if-eqz v4, :cond_7

    move-object v3, v2

    check-cast v3, Landroid/view/View;

    :cond_7
    invoke-interface {v2}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    goto :goto_0

    :cond_8
    const/4 p1, 0x0

    return p1
.end method

.method public final f(I)V
    .locals 4

    invoke-virtual {p0, p1}, Lb3/p;->c(I)Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_4

    instance-of v1, v0, Lb3/q;

    iget-object v2, p0, Lb3/p;->c:Landroid/view/View;

    if-eqz v1, :cond_0

    check-cast v0, Lb3/q;

    invoke-interface {v0, v2, p1}, Lb3/q;->b(Landroid/view/View;I)V

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    :try_start_0
    invoke-static {v0, v2}, Lb3/v0;->g(Landroid/view/ViewParent;Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "ViewParent "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " does not implement interface method onStopNestedScroll"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "ViewParentCompat"

    invoke-static {v2, v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_1
    :goto_0
    const/4 v0, 0x0

    if-eqz p1, :cond_3

    const/4 v1, 0x1

    if-eq p1, v1, :cond_2

    goto :goto_1

    :cond_2
    iput-object v0, p0, Lb3/p;->b:Landroid/view/ViewParent;

    goto :goto_1

    :cond_3
    iput-object v0, p0, Lb3/p;->a:Landroid/view/ViewParent;

    :cond_4
    :goto_1
    return-void
.end method
