.class public abstract Landroidx/fragment/app/m0;
.super Landroidx/fragment/app/j0;


# instance fields
.field public final a:Landroid/app/Activity;

.field public final b:Landroid/content/Context;

.field public final c:Landroid/os/Handler;

.field public final d:Landroidx/fragment/app/y0;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/g0;)V
    .locals 2

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Landroidx/fragment/app/y0;

    invoke-direct {v1}, Landroidx/fragment/app/x0;-><init>()V

    iput-object v1, p0, Landroidx/fragment/app/m0;->d:Landroidx/fragment/app/y0;

    iput-object p1, p0, Landroidx/fragment/app/m0;->a:Landroid/app/Activity;

    iput-object p1, p0, Landroidx/fragment/app/m0;->b:Landroid/content/Context;

    iput-object v0, p0, Landroidx/fragment/app/m0;->c:Landroid/os/Handler;

    return-void
.end method
