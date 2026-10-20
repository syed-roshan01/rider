.class public final Ly/g0;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;
.implements Lb3/t;
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public a:Landroid/view/WindowInsets;

.field public final b:I

.field public final c:Ly/j1;

.field public d:Z

.field public e:Z

.field public f:Lb3/u1;


# direct methods
.method public constructor <init>(Ly/j1;)V
    .locals 1

    iget-boolean v0, p1, Ly/j1;->r:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput v0, p0, Ly/g0;->b:I

    iput-object p1, p0, Ly/g0;->c:Ly/j1;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;Lb3/u1;)Lb3/u1;
    .locals 5

    iput-object p2, p0, Ly/g0;->f:Lb3/u1;

    iget-object v0, p0, Ly/g0;->c:Ly/j1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p2, Lb3/u1;->a:Lb3/r1;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Lb3/r1;->f(I)Lu2/c;

    move-result-object v3

    invoke-static {v3}, Landroidx/compose/foundation/layout/a;->s(Lu2/c;)Ly/k0;

    move-result-object v3

    iget-object v4, v0, Ly/j1;->p:Ly/g1;

    invoke-virtual {v4, v3}, Ly/g1;->f(Ly/k0;)V

    iget-boolean v3, p0, Ly/g0;->d:Z

    if-eqz v3, :cond_0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-ne v1, v2, :cond_1

    invoke-virtual {p1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    iget-boolean p1, p0, Ly/g0;->e:Z

    if-nez p1, :cond_1

    invoke-virtual {v1, v2}, Lb3/r1;->f(I)Lu2/c;

    move-result-object p1

    invoke-static {p1}, Landroidx/compose/foundation/layout/a;->s(Lu2/c;)Ly/k0;

    move-result-object p1

    iget-object v1, v0, Ly/j1;->q:Ly/g1;

    invoke-virtual {v1, p1}, Ly/g1;->f(Ly/k0;)V

    invoke-static {v0, p2}, Ly/j1;->a(Ly/j1;Lb3/u1;)V

    :cond_1
    :goto_0
    iget-boolean p1, v0, Ly/j1;->r:Z

    if-eqz p1, :cond_2

    sget-object p2, Lb3/u1;->b:Lb3/u1;

    :cond_2
    return-object p2
.end method

.method public final b(Lb3/g1;)V
    .locals 5

    const/4 v0, 0x0

    iput-boolean v0, p0, Ly/g0;->d:Z

    iput-boolean v0, p0, Ly/g0;->e:Z

    iget-object v0, p0, Ly/g0;->f:Lb3/u1;

    iget-object p1, p1, Lb3/g1;->a:Lb3/f1;

    invoke-virtual {p1}, Lb3/f1;->a()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long p1, v1, v3

    if-eqz p1, :cond_0

    if-eqz v0, :cond_0

    iget-object p1, p0, Ly/g0;->c:Ly/j1;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v0, Lb3/u1;->a:Lb3/r1;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Lb3/r1;->f(I)Lu2/c;

    move-result-object v3

    invoke-static {v3}, Landroidx/compose/foundation/layout/a;->s(Lu2/c;)Ly/k0;

    move-result-object v3

    iget-object v4, p1, Ly/j1;->q:Ly/g1;

    invoke-virtual {v4, v3}, Ly/g1;->f(Ly/k0;)V

    invoke-virtual {v1, v2}, Lb3/r1;->f(I)Lu2/c;

    move-result-object v1

    invoke-static {v1}, Landroidx/compose/foundation/layout/a;->s(Lu2/c;)Ly/k0;

    move-result-object v1

    iget-object v2, p1, Ly/j1;->p:Ly/g1;

    invoke-virtual {v2, v1}, Ly/g1;->f(Ly/k0;)V

    invoke-static {p1, v0}, Ly/j1;->a(Ly/j1;Lb3/u1;)V

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Ly/g0;->f:Lb3/u1;

    return-void
.end method

.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    invoke-virtual {p1}, Landroid/view/View;->requestApplyInsets()V

    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public final run()V
    .locals 4

    iget-boolean v0, p0, Ly/g0;->d:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Ly/g0;->d:Z

    iput-boolean v0, p0, Ly/g0;->e:Z

    iget-object v0, p0, Ly/g0;->f:Lb3/u1;

    if-eqz v0, :cond_0

    iget-object v1, p0, Ly/g0;->c:Ly/j1;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v0, Lb3/u1;->a:Lb3/r1;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Lb3/r1;->f(I)Lu2/c;

    move-result-object v2

    invoke-static {v2}, Landroidx/compose/foundation/layout/a;->s(Lu2/c;)Ly/k0;

    move-result-object v2

    iget-object v3, v1, Ly/j1;->q:Ly/g1;

    invoke-virtual {v3, v2}, Ly/g1;->f(Ly/k0;)V

    invoke-static {v1, v0}, Ly/j1;->a(Ly/j1;Lb3/u1;)V

    const/4 v0, 0x0

    iput-object v0, p0, Ly/g0;->f:Lb3/u1;

    :cond_0
    return-void
.end method
