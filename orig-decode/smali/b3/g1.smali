.class public final Lb3/g1;
.super Ljava/lang/Object;


# instance fields
.field public a:Lb3/f1;


# direct methods
.method public constructor <init>(ILandroid/view/animation/Interpolator;J)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    new-instance v0, Lb3/e1;

    invoke-static {p1, p2, p3, p4}, Lb2/t;->h(ILandroid/view/animation/Interpolator;J)Landroid/view/WindowInsetsAnimation;

    move-result-object p1

    invoke-direct {v0, p1}, Lb3/e1;-><init>(Landroid/view/WindowInsetsAnimation;)V

    iput-object v0, p0, Lb3/g1;->a:Lb3/f1;

    goto :goto_0

    :cond_0
    new-instance p1, Lb3/c1;

    invoke-direct {p1, p2, p3, p4}, Lb3/f1;-><init>(Landroid/view/animation/Interpolator;J)V

    iput-object p1, p0, Lb3/g1;->a:Lb3/f1;

    :goto_0
    return-void
.end method
