.class public final Lr9/i;
.super Lm9/z;

# interfaces
.implements Lm9/j0;


# static fields
.field public static final o:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field public final c:Lm9/z;

.field public final d:I

.field public final synthetic e:Lm9/j0;

.field public final f:Lr9/k;

.field public final n:Ljava/lang/Object;

.field private volatile runningWorkers:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lr9/i;

    const-string v1, "runningWorkers"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Lr9/i;->o:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lm9/z;I)V
    .locals 0

    invoke-direct {p0}, Lm9/z;-><init>()V

    iput-object p1, p0, Lr9/i;->c:Lm9/z;

    iput p2, p0, Lr9/i;->d:I

    instance-of p2, p1, Lm9/j0;

    if-eqz p2, :cond_0

    check-cast p1, Lm9/j0;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    sget-object p1, Lm9/g0;->a:Lm9/j0;

    :cond_1
    iput-object p1, p0, Lr9/i;->e:Lm9/j0;

    new-instance p1, Lr9/k;

    invoke-direct {p1}, Lr9/k;-><init>()V

    iput-object p1, p0, Lr9/i;->f:Lr9/k;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr9/i;->n:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final M(JLm9/l;)V
    .locals 1

    iget-object v0, p0, Lr9/i;->e:Lm9/j0;

    invoke-interface {v0, p1, p2, p3}, Lm9/j0;->M(JLm9/l;)V

    return-void
.end method

.method public final Q(JLjava/lang/Runnable;Lu8/j;)Lm9/o0;
    .locals 1

    iget-object v0, p0, Lr9/i;->e:Lm9/j0;

    invoke-interface {v0, p1, p2, p3, p4}, Lm9/j0;->Q(JLjava/lang/Runnable;Lu8/j;)Lm9/o0;

    move-result-object p1

    return-object p1
.end method

.method public final c0(Lu8/j;Ljava/lang/Runnable;)V
    .locals 1

    iget-object p1, p0, Lr9/i;->f:Lr9/k;

    invoke-virtual {p1, p2}, Lr9/k;->a(Ljava/lang/Object;)Z

    sget-object p1, Lr9/i;->o:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result p1

    iget p2, p0, Lr9/i;->d:I

    if-ge p1, p2, :cond_1

    invoke-virtual {p0}, Lr9/i;->g0()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lr9/i;->f0()Ljava/lang/Runnable;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p2, Ll/h;

    const/16 v0, 0x16

    invoke-direct {p2, v0, p0, p1}, Ll/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, Lr9/i;->c:Lm9/z;

    invoke-virtual {p1, p0, p2}, Lm9/z;->c0(Lu8/j;Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final f0()Ljava/lang/Runnable;
    .locals 3

    :goto_0
    iget-object v0, p0, Lr9/i;->f:Lr9/k;

    invoke-virtual {v0}, Lr9/k;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    if-nez v0, :cond_1

    iget-object v0, p0, Lr9/i;->n:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lr9/i;->o:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I

    iget-object v2, p0, Lr9/i;->f:Lr9/k;

    invoke-virtual {v2}, Lr9/k;->c()I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_0

    monitor-exit v0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    :try_start_1
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    :cond_1
    return-object v0
.end method

.method public final g0()Z
    .locals 4

    iget-object v0, p0, Lr9/i;->n:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lr9/i;->o:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v2

    iget v3, p0, Lr9/i;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lt v2, v3, :cond_0

    monitor-exit v0

    const/4 v0, 0x0

    return v0

    :cond_0
    :try_start_1
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    const/4 v0, 0x1

    return v0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method
