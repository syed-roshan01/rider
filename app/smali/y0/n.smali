.class public abstract Ly0/n;
.super Ljava/lang/Object;

# interfaces
.implements Lt1/n;


# instance fields
.field public a:Ly0/n;

.field public b:Lr9/e;

.field public c:I

.field public d:I

.field public e:Ly0/n;

.field public f:Ly0/n;

.field public n:Lt1/g1;

.field public o:Lt1/c1;

.field public p:Z

.field public q:Z

.field public r:Z

.field public s:Z

.field public t:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Ly0/n;->a:Ly0/n;

    const/4 v0, -0x1

    iput v0, p0, Ly0/n;->d:I

    return-void
.end method


# virtual methods
.method public A0()V
    .locals 0

    return-void
.end method

.method public B0()V
    .locals 0

    return-void
.end method

.method public C0()V
    .locals 2

    iget-boolean v0, p0, Ly0/n;->t:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ly0/n;->B0()V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "reset() called on an unattached node"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public D0()V
    .locals 2

    iget-boolean v0, p0, Ly0/n;->t:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Ly0/n;->r:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Ly0/n;->r:Z

    invoke-virtual {p0}, Ly0/n;->z0()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Ly0/n;->s:Z

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Must run runAttachLifecycle() only once after markAsAttached()"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Must run markAsAttached() prior to runAttachLifecycle"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public E0()V
    .locals 2

    iget-boolean v0, p0, Ly0/n;->t:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Ly0/n;->o:Lt1/c1;

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Ly0/n;->s:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Ly0/n;->s:Z

    invoke-virtual {p0}, Ly0/n;->A0()V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "detach invoked on a node without a coordinator"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "node detached multiple times"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public F0(Lt1/c1;)V
    .locals 0

    iput-object p1, p0, Ly0/n;->o:Lt1/c1;

    return-void
.end method

.method public final v0()Lm9/d0;
    .locals 3

    iget-object v0, p0, Ly0/n;->b:Lr9/e;

    if-nez v0, :cond_0

    invoke-static {p0}, Lt1/g;->A(Lt1/n;)Lt1/l1;

    move-result-object v0

    check-cast v0, Lu1/w;

    invoke-virtual {v0}, Lu1/w;->getCoroutineContext()Lu8/j;

    move-result-object v0

    invoke-static {p0}, Lt1/g;->A(Lt1/n;)Lt1/l1;

    move-result-object v1

    check-cast v1, Lu1/w;

    invoke-virtual {v1}, Lu1/w;->getCoroutineContext()Lu8/j;

    move-result-object v1

    sget-object v2, Lm9/a0;->b:Lm9/a0;

    invoke-interface {v1, v2}, Lu8/j;->f(Lu8/i;)Lu8/h;

    move-result-object v1

    check-cast v1, Lm9/f1;

    new-instance v2, Lm9/i1;

    invoke-direct {v2, v1}, Lm9/i1;-><init>(Lm9/f1;)V

    invoke-interface {v0, v2}, Lu8/j;->O(Lu8/j;)Lu8/j;

    move-result-object v0

    invoke-static {v0}, Ld7/a;->b(Lu8/j;)Lr9/e;

    move-result-object v0

    iput-object v0, p0, Ly0/n;->b:Lr9/e;

    :cond_0
    return-object v0
.end method

.method public w0()Z
    .locals 0

    instance-of p0, p0, Lb1/j;

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public x0()V
    .locals 2

    iget-boolean v0, p0, Ly0/n;->t:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-eqz v0, :cond_1

    iget-object v0, p0, Ly0/n;->o:Lt1/c1;

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Ly0/n;->t:Z

    iput-boolean v1, p0, Ly0/n;->r:Z

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "attach invoked on a node without a coordinator"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "node attached multiple times"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public y0()V
    .locals 3

    iget-boolean v0, p0, Ly0/n;->t:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Ly0/n;->r:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Ly0/n;->s:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Ly0/n;->t:Z

    iget-object v0, p0, Ly0/n;->b:Lr9/e;

    if-eqz v0, :cond_0

    new-instance v1, Lt/y0;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Lt/y0;-><init>(I)V

    invoke-static {v0, v1}, Ld7/a;->i(Lm9/d0;Ljava/util/concurrent/CancellationException;)V

    const/4 v0, 0x0

    iput-object v0, p0, Ly0/n;->b:Lr9/e;

    :cond_0
    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Must run runDetachLifecycle() before markAsDetached()"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Must run runAttachLifecycle() before markAsDetached()"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot detach a node that is not attached"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public z0()V
    .locals 0

    return-void
.end method
