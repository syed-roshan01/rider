.class public final Landroidx/lifecycle/k0;
.super Ljava/lang/Object;

# interfaces
.implements Landroidx/lifecycle/w;


# static fields
.field public static final p:Landroidx/lifecycle/k0;


# instance fields
.field public a:I

.field public b:I

.field public c:Z

.field public d:Z

.field public e:Landroid/os/Handler;

.field public final f:Landroidx/lifecycle/y;

.field public final n:Landroidx/activity/d;

.field public final o:Landroidx/lifecycle/j0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/lifecycle/k0;

    invoke-direct {v0}, Landroidx/lifecycle/k0;-><init>()V

    sput-object v0, Landroidx/lifecycle/k0;->p:Landroidx/lifecycle/k0;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/lifecycle/k0;->c:Z

    iput-boolean v0, p0, Landroidx/lifecycle/k0;->d:Z

    new-instance v0, Landroidx/lifecycle/y;

    invoke-direct {v0, p0}, Landroidx/lifecycle/y;-><init>(Landroidx/lifecycle/w;)V

    iput-object v0, p0, Landroidx/lifecycle/k0;->f:Landroidx/lifecycle/y;

    new-instance v0, Landroidx/activity/d;

    const/16 v1, 0x9

    invoke-direct {v0, p0, v1}, Landroidx/activity/d;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Landroidx/lifecycle/k0;->n:Landroidx/activity/d;

    new-instance v0, Landroidx/lifecycle/j0;

    invoke-direct {v0, p0}, Landroidx/lifecycle/j0;-><init>(Landroidx/lifecycle/k0;)V

    iput-object v0, p0, Landroidx/lifecycle/k0;->o:Landroidx/lifecycle/j0;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget v0, p0, Landroidx/lifecycle/k0;->b:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Landroidx/lifecycle/k0;->b:I

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Landroidx/lifecycle/k0;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/lifecycle/k0;->f:Landroidx/lifecycle/y;

    sget-object v1, Landroidx/lifecycle/p;->ON_RESUME:Landroidx/lifecycle/p;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/y;->f(Landroidx/lifecycle/p;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/lifecycle/k0;->c:Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/lifecycle/k0;->e:Landroid/os/Handler;

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v1, p0, Landroidx/lifecycle/k0;->n:Landroidx/activity/d;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final getLifecycle()Landroidx/lifecycle/r;
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/k0;->f:Landroidx/lifecycle/y;

    return-object v0
.end method
