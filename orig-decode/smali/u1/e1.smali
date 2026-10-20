.class public final Lu1/e1;
.super Lm9/z;


# static fields
.field public static final t:Lq8/i;

.field public static final u:Lu1/c1;


# instance fields
.field public final c:Landroid/view/Choreographer;

.field public final d:Landroid/os/Handler;

.field public final e:Ljava/lang/Object;

.field public final f:Lr8/l;

.field public n:Ljava/util/List;

.field public o:Ljava/util/List;

.field public p:Z

.field public q:Z

.field public final r:Lu1/d1;

.field public final s:Lu1/g1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lu1/q0;->q:Lu1/q0;

    new-instance v1, Lq8/i;

    invoke-direct {v1, v0}, Lq8/i;-><init>(Lc9/a;)V

    sput-object v1, Lu1/e1;->t:Lq8/i;

    new-instance v0, Lu1/c1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lu1/c1;-><init>(I)V

    sput-object v0, Lu1/e1;->u:Lu1/c1;

    return-void
.end method

.method public constructor <init>(Landroid/view/Choreographer;Landroid/os/Handler;)V
    .locals 0

    invoke-direct {p0}, Lm9/z;-><init>()V

    iput-object p1, p0, Lu1/e1;->c:Landroid/view/Choreographer;

    iput-object p2, p0, Lu1/e1;->d:Landroid/os/Handler;

    new-instance p2, Ljava/lang/Object;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lu1/e1;->e:Ljava/lang/Object;

    new-instance p2, Lr8/l;

    invoke-direct {p2}, Lr8/l;-><init>()V

    iput-object p2, p0, Lu1/e1;->f:Lr8/l;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lu1/e1;->n:Ljava/util/List;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lu1/e1;->o:Ljava/util/List;

    new-instance p2, Lu1/d1;

    invoke-direct {p2, p0}, Lu1/d1;-><init>(Lu1/e1;)V

    iput-object p2, p0, Lu1/e1;->r:Lu1/d1;

    new-instance p2, Lu1/g1;

    invoke-direct {p2, p1, p0}, Lu1/g1;-><init>(Landroid/view/Choreographer;Lu1/e1;)V

    iput-object p2, p0, Lu1/e1;->s:Lu1/g1;

    return-void
.end method

.method public static final f0(Lu1/e1;)V
    .locals 4

    :cond_0
    iget-object v0, p0, Lu1/e1;->e:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lu1/e1;->f:Lr8/l;

    invoke-virtual {v1}, Lr8/l;->isEmpty()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    move-object v1, v3

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lr8/l;->removeFirst()Ljava/lang/Object;

    move-result-object v1

    :goto_0
    check-cast v1, Ljava/lang/Runnable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v0

    :goto_1
    if-eqz v1, :cond_3

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    iget-object v0, p0, Lu1/e1;->e:Ljava/lang/Object;

    monitor-enter v0

    :try_start_1
    iget-object v1, p0, Lu1/e1;->f:Lr8/l;

    invoke-virtual {v1}, Lr8/l;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    move-object v1, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lr8/l;->removeFirst()Ljava/lang/Object;

    move-result-object v1

    :goto_2
    check-cast v1, Ljava/lang/Runnable;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    goto :goto_1

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0

    :cond_3
    iget-object v0, p0, Lu1/e1;->e:Ljava/lang/Object;

    monitor-enter v0

    :try_start_2
    iget-object v1, p0, Lu1/e1;->f:Lr8/l;

    invoke-virtual {v1}, Lr8/l;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, 0x0

    iput-boolean v1, p0, Lu1/e1;->p:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p0

    goto :goto_4

    :cond_4
    const/4 v1, 0x1

    :goto_3
    monitor-exit v0

    if-nez v1, :cond_0

    return-void

    :goto_4
    monitor-exit v0

    throw p0

    :catchall_2
    move-exception p0

    monitor-exit v0

    throw p0
.end method


# virtual methods
.method public final c0(Lu8/j;Ljava/lang/Runnable;)V
    .locals 2

    iget-object p1, p0, Lu1/e1;->e:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lu1/e1;->f:Lr8/l;

    invoke-virtual {v0, p2}, Lr8/l;->addLast(Ljava/lang/Object;)V

    iget-boolean p2, p0, Lu1/e1;->p:Z

    if-nez p2, :cond_0

    const/4 p2, 0x1

    iput-boolean p2, p0, Lu1/e1;->p:Z

    iget-object v0, p0, Lu1/e1;->d:Landroid/os/Handler;

    iget-object v1, p0, Lu1/e1;->r:Lu1/d1;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    iget-boolean v0, p0, Lu1/e1;->q:Z

    if-nez v0, :cond_0

    iput-boolean p2, p0, Lu1/e1;->q:Z

    iget-object p2, p0, Lu1/e1;->c:Landroid/view/Choreographer;

    iget-object v0, p0, Lu1/e1;->r:Lu1/d1;

    invoke-virtual {p2, v0}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p1

    return-void

    :goto_1
    monitor-exit p1

    throw p2
.end method
