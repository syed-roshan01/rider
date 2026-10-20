.class public abstract Lf4/b0;
.super Lf4/a0;


# static fields
.field public static o:Z = true

.field public static p:Z = true


# virtual methods
.method public N(Landroid/view/View;Landroid/graphics/Matrix;)V
    .locals 1

    sget-boolean v0, Lf4/b0;->o:Z

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {p1, p2}, Lu1/n1;->j(Landroid/view/View;Landroid/graphics/Matrix;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    sput-boolean p1, Lf4/b0;->o:Z

    :cond_0
    :goto_0
    return-void
.end method

.method public O(Landroid/view/View;Landroid/graphics/Matrix;)V
    .locals 1

    sget-boolean v0, Lf4/b0;->p:Z

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {p1, p2}, Le1/b;->q(Landroid/view/View;Landroid/graphics/Matrix;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    sput-boolean p1, Lf4/b0;->p:Z

    :cond_0
    :goto_0
    return-void
.end method
