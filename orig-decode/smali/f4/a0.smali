.class public abstract Lf4/a0;
.super Lx9/v;


# static fields
.field public static n:Z = true


# direct methods
.method public constructor <init>()V
    .locals 2

    const/16 v0, 0x19

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lx9/v;-><init>(ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public L(Landroid/view/View;)F
    .locals 1

    sget-boolean v0, Lf4/a0;->n:Z

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {p1}, Le1/b;->b(Landroid/view/View;)F

    move-result p1
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    const/4 v0, 0x0

    sput-boolean v0, Lf4/a0;->n:Z

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getAlpha()F

    move-result p1

    return p1
.end method

.method public M(Landroid/view/View;F)V
    .locals 1

    sget-boolean v0, Lf4/a0;->n:Z

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {p1, p2}, Le1/b;->n(Landroid/view/View;F)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const/4 v0, 0x0

    sput-boolean v0, Lf4/a0;->n:Z

    :cond_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method
