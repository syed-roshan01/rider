.class public abstract Lf4/c0;
.super Lf4/b0;


# static fields
.field public static q:Z = true


# virtual methods
.method public P(Landroid/view/View;IIII)V
    .locals 1

    sget-boolean v0, Lf4/c0;->q:Z

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {p1, p2, p3, p4, p5}, Le1/b;->p(Landroid/view/View;IIII)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    sput-boolean p1, Lf4/c0;->q:Z

    :cond_0
    :goto_0
    return-void
.end method
