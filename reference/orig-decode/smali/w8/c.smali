.class public abstract Lw8/c;
.super Lw8/a;


# instance fields
.field private final _context:Lu8/j;

.field private transient intercepted:Lu8/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu8/e;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lu8/e;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 2
    invoke-interface {p1}, Lu8/e;->getContext()Lu8/j;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, p1, v0}, Lw8/c;-><init>(Lu8/e;Lu8/j;)V

    return-void
.end method

.method public constructor <init>(Lu8/e;Lu8/j;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lw8/a;-><init>(Lu8/e;)V

    iput-object p2, p0, Lw8/c;->_context:Lu8/j;

    return-void
.end method


# virtual methods
.method public getContext()Lu8/j;
    .locals 1

    iget-object v0, p0, Lw8/c;->_context:Lu8/j;

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final intercepted()Lu8/e;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lu8/e;"
        }
    .end annotation

    iget-object v0, p0, Lw8/c;->intercepted:Lu8/e;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lw8/c;->getContext()Lu8/j;

    move-result-object v0

    sget-object v1, Lu8/f;->a:Lu8/f;

    invoke-interface {v0, v1}, Lu8/j;->f(Lu8/i;)Lu8/h;

    move-result-object v0

    check-cast v0, Lu8/g;

    if-eqz v0, :cond_0

    check-cast v0, Lm9/z;

    new-instance v1, Lr9/h;

    invoke-direct {v1, v0, p0}, Lr9/h;-><init>(Lm9/z;Lu8/e;)V

    move-object v0, v1

    goto :goto_0

    :cond_0
    move-object v0, p0

    :goto_0
    iput-object v0, p0, Lw8/c;->intercepted:Lu8/e;

    :cond_1
    return-object v0
.end method

.method public releaseIntercepted()V
    .locals 4

    iget-object v0, p0, Lw8/c;->intercepted:Lu8/e;

    if-eqz v0, :cond_2

    if-eq v0, p0, :cond_2

    invoke-virtual {p0}, Lw8/c;->getContext()Lu8/j;

    move-result-object v1

    sget-object v2, Lu8/f;->a:Lu8/f;

    invoke-interface {v1, v2}, Lu8/j;->f(Lu8/i;)Lu8/h;

    move-result-object v1

    invoke-static {v1}, Ld7/a;->j(Ljava/lang/Object;)V

    check-cast v1, Lu8/g;

    check-cast v0, Lr9/h;

    :cond_0
    sget-object v1, Lr9/h;->o:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lr9/a;->d:Li3/u;

    if-eq v2, v3, :cond_0

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lm9/l;

    if-eqz v1, :cond_1

    check-cast v0, Lm9/l;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lm9/l;->p()V

    :cond_2
    sget-object v0, Lw8/b;->a:Lw8/b;

    iput-object v0, p0, Lw8/c;->intercepted:Lu8/e;

    return-void
.end method
