.class public final Lg8/e3;
.super Le8/j0;


# instance fields
.field public final synthetic a:Lg8/i3;


# direct methods
.method public constructor <init>(Lg8/i3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg8/e3;->a:Lg8/i3;

    return-void
.end method


# virtual methods
.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lg8/e3;->a:Lg8/i3;

    iget-object v0, v0, Lg8/i3;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final m(Le8/p1;Le8/h;)Le8/k;
    .locals 8

    new-instance v7, Lg8/g0;

    iget-object v0, p0, Lg8/e3;->a:Lg8/i3;

    iget-object v0, v0, Lg8/i3;->d:Lg8/l3;

    sget-object v1, Lg8/l3;->b0:Ljava/util/logging/Logger;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p2, Le8/h;->b:Ljava/util/concurrent/Executor;

    if-nez v1, :cond_0

    iget-object v0, v0, Lg8/l3;->h:Ljava/util/concurrent/Executor;

    move-object v2, v0

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    iget-object v0, p0, Lg8/e3;->a:Lg8/i3;

    iget-object v0, v0, Lg8/i3;->d:Lg8/l3;

    iget-object v4, v0, Lg8/l3;->Y:Lz5/k;

    iget-boolean v0, v0, Lg8/l3;->I:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    :goto_1
    move-object v5, v0

    goto :goto_2

    :cond_1
    iget-object v0, p0, Lg8/e3;->a:Lg8/i3;

    iget-object v0, v0, Lg8/i3;->d:Lg8/l3;

    iget-object v0, v0, Lg8/l3;->f:Lg8/x;

    iget-object v0, v0, Lg8/x;->a:Lg8/m0;

    invoke-interface {v0}, Lg8/m0;->L()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    goto :goto_1

    :goto_2
    iget-object v0, p0, Lg8/e3;->a:Lg8/i3;

    iget-object v0, v0, Lg8/i3;->d:Lg8/l3;

    iget-object v6, v0, Lg8/l3;->L:Lg8/y;

    move-object v0, v7

    move-object v1, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v6}, Lg8/g0;-><init>(Le8/p1;Ljava/util/concurrent/Executor;Le8/h;Lz5/k;Ljava/util/concurrent/ScheduledExecutorService;Lg8/y;)V

    iget-object p1, p0, Lg8/e3;->a:Lg8/i3;

    iget-object p1, p1, Lg8/i3;->d:Lg8/l3;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    iput-boolean p1, v7, Lg8/g0;->q:Z

    iget-object p1, p0, Lg8/e3;->a:Lg8/i3;

    iget-object p1, p1, Lg8/i3;->d:Lg8/l3;

    iget-object p2, p1, Lg8/l3;->n:Le8/e0;

    iput-object p2, v7, Lg8/g0;->r:Le8/e0;

    iget-object p1, p1, Lg8/l3;->o:Le8/w;

    iput-object p1, v7, Lg8/g0;->s:Le8/w;

    return-object v7
.end method
