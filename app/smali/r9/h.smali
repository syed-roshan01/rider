.class public final Lr9/h;
.super Lm9/l0;

# interfaces
.implements Lw8/d;
.implements Lu8/e;


# static fields
.field public static final o:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile _reusableCancellableContinuation:Ljava/lang/Object;

.field public final d:Lm9/z;

.field public final e:Lu8/e;

.field public f:Ljava/lang/Object;

.field public final n:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Ljava/lang/Object;

    const-string v1, "_reusableCancellableContinuation"

    const-class v2, Lr9/h;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lr9/h;->o:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lm9/z;Lu8/e;)V
    .locals 1

    const/4 v0, -0x1

    invoke-direct {p0, v0}, Lm9/l0;-><init>(I)V

    iput-object p1, p0, Lr9/h;->d:Lm9/z;

    iput-object p2, p0, Lr9/h;->e:Lu8/e;

    sget-object p1, Lr9/a;->c:Li3/u;

    iput-object p1, p0, Lr9/h;->f:Ljava/lang/Object;

    invoke-interface {p2}, Lu8/e;->getContext()Lu8/j;

    move-result-object p1

    invoke-static {p1}, Lr9/a;->s(Lu8/j;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lr9/h;->n:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/util/concurrent/CancellationException;)V
    .locals 1

    instance-of v0, p1, Lm9/v;

    if-eqz v0, :cond_0

    check-cast p1, Lm9/v;

    iget-object p1, p1, Lm9/v;->b:Lc9/c;

    invoke-interface {p1, p2}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final e()Lu8/e;
    .locals 0

    return-object p0
.end method

.method public final getCallerFrame()Lw8/d;
    .locals 2

    iget-object v0, p0, Lr9/h;->e:Lu8/e;

    instance-of v1, v0, Lw8/d;

    if-eqz v1, :cond_0

    check-cast v0, Lw8/d;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final getContext()Lu8/j;
    .locals 1

    iget-object v0, p0, Lr9/h;->e:Lu8/e;

    invoke-interface {v0}, Lu8/e;->getContext()Lu8/j;

    move-result-object v0

    return-object v0
.end method

.method public final i()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lr9/h;->f:Ljava/lang/Object;

    sget-object v1, Lr9/a;->c:Li3/u;

    iput-object v1, p0, Lr9/h;->f:Ljava/lang/Object;

    return-object v0
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 6

    iget-object v0, p0, Lr9/h;->e:Lu8/e;

    invoke-interface {v0}, Lu8/e;->getContext()Lu8/j;

    move-result-object v1

    invoke-static {p1}, Lq8/h;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move-object v4, p1

    goto :goto_0

    :cond_0
    new-instance v4, Lm9/u;

    invoke-direct {v4, v2, v3}, Lm9/u;-><init>(Ljava/lang/Throwable;Z)V

    :goto_0
    iget-object v2, p0, Lr9/h;->d:Lm9/z;

    invoke-virtual {v2}, Lm9/z;->d0()Z

    move-result v5

    if-eqz v5, :cond_1

    iput-object v4, p0, Lr9/h;->f:Ljava/lang/Object;

    iput v3, p0, Lm9/l0;->c:I

    invoke-virtual {v2, v1, p0}, Lm9/z;->c0(Lu8/j;Ljava/lang/Runnable;)V

    goto :goto_3

    :cond_1
    invoke-static {}, Lm9/a2;->a()Lm9/w0;

    move-result-object v1

    invoke-virtual {v1}, Lm9/w0;->j0()Z

    move-result v2

    if-eqz v2, :cond_2

    iput-object v4, p0, Lr9/h;->f:Ljava/lang/Object;

    iput v3, p0, Lm9/l0;->c:I

    invoke-virtual {v1, p0}, Lm9/w0;->g0(Lm9/l0;)V

    goto :goto_3

    :cond_2
    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lm9/w0;->i0(Z)V

    :try_start_0
    invoke-interface {v0}, Lu8/e;->getContext()Lu8/j;

    move-result-object v3

    iget-object v4, p0, Lr9/h;->n:Ljava/lang/Object;

    invoke-static {v3, v4}, Lr9/a;->t(Lu8/j;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-interface {v0, p1}, Lu8/e;->resumeWith(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-static {v3, v4}, Lr9/a;->k(Lu8/j;Ljava/lang/Object;)V

    :cond_3
    invoke-virtual {v1}, Lm9/w0;->l0()Z

    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez p1, :cond_3

    :goto_1
    invoke-virtual {v1, v2}, Lm9/w0;->f0(Z)V

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_2

    :catchall_1
    move-exception p1

    :try_start_3
    invoke-static {v3, v4}, Lr9/a;->k(Lu8/j;Ljava/lang/Object;)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_2
    const/4 v0, 0x0

    :try_start_4
    invoke-virtual {p0, p1, v0}, Lm9/l0;->h(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_1

    :goto_3
    return-void

    :catchall_2
    move-exception p1

    invoke-virtual {v1, v2}, Lm9/w0;->f0(Z)V

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DispatchedContinuation["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lr9/h;->d:Lm9/z;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lr9/h;->e:Lu8/e;

    invoke-static {v1}, Lm9/e0;->M(Lu8/e;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
