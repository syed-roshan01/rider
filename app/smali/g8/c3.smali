.class public final Lg8/c3;
.super Le8/j0;


# instance fields
.field public a:Li3/a0;

.field public final synthetic b:Lg8/l3;


# direct methods
.method public constructor <init>(Lg8/l3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg8/c3;->b:Lg8/l3;

    return-void
.end method


# virtual methods
.method public final h(Le8/u0;)Le8/x0;
    .locals 3

    iget-object v0, p0, Lg8/c3;->b:Lg8/l3;

    iget-object v1, v0, Lg8/l3;->m:Le8/h2;

    invoke-virtual {v1}, Le8/h2;->d()V

    iget-boolean v1, v0, Lg8/l3;->H:Z

    xor-int/lit8 v1, v1, 0x1

    const-string v2, "Channel is being terminated"

    invoke-static {v2, v1}, Ly3/e;->N(Ljava/lang/String;Z)V

    new-instance v1, Lg8/k3;

    invoke-direct {v1, v0, p1}, Lg8/k3;-><init>(Lg8/l3;Le8/u0;)V

    return-object v1
.end method

.method public final i()Le8/i;
    .locals 1

    iget-object v0, p0, Lg8/c3;->b:Lg8/l3;

    iget-object v0, v0, Lg8/l3;->N:Lg8/z;

    return-object v0
.end method

.method public final j()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    iget-object v0, p0, Lg8/c3;->b:Lg8/l3;

    iget-object v0, v0, Lg8/l3;->g:Lg8/j3;

    return-object v0
.end method

.method public final l()Le8/h2;
    .locals 1

    iget-object v0, p0, Lg8/c3;->b:Lg8/l3;

    iget-object v0, v0, Lg8/l3;->m:Le8/h2;

    return-object v0
.end method

.method public final o()V
    .locals 3

    iget-object v0, p0, Lg8/c3;->b:Lg8/l3;

    iget-object v1, v0, Lg8/l3;->m:Le8/h2;

    invoke-virtual {v1}, Le8/h2;->d()V

    iget-object v0, v0, Lg8/l3;->m:Le8/h2;

    new-instance v1, Lg8/t0;

    const/4 v2, 0x5

    invoke-direct {v1, p0, v2}, Lg8/t0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Le8/h2;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final r(Le8/x;Lz6/a;)V
    .locals 3

    iget-object v0, p0, Lg8/c3;->b:Lg8/l3;

    iget-object v1, v0, Lg8/l3;->m:Le8/h2;

    invoke-virtual {v1}, Le8/h2;->d()V

    const-string v1, "newState"

    invoke-static {p1, v1}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "newPicker"

    invoke-static {p2, v1}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ly2/a;

    const/16 v2, 0x15

    invoke-direct {v1, p0, p2, p1, v2}, Ly2/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iget-object p1, v0, Lg8/l3;->m:Le8/h2;

    invoke-virtual {p1, v1}, Le8/h2;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
