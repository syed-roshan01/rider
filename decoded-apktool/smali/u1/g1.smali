.class public final Lu1/g1;
.super Ljava/lang/Object;

# interfaces
.implements Lm0/a1;


# instance fields
.field public final a:Landroid/view/Choreographer;

.field public final b:Lu1/e1;


# direct methods
.method public constructor <init>(Landroid/view/Choreographer;Lu1/e1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu1/g1;->a:Landroid/view/Choreographer;

    iput-object p2, p0, Lu1/g1;->b:Lu1/e1;

    return-void
.end method


# virtual methods
.method public final O(Lu8/j;)Lu8/j;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Ld7/a;->A(Lu8/j;Lu8/j;)Lu8/j;

    move-result-object p1

    return-object p1
.end method

.method public final T(Lc9/c;Lu8/e;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lu1/g1;->b:Lu1/e1;

    if-nez v0, :cond_1

    invoke-interface {p2}, Lu8/e;->getContext()Lu8/j;

    move-result-object v0

    sget-object v1, Lu8/f;->a:Lu8/f;

    invoke-interface {v0, v1}, Lu8/j;->f(Lu8/i;)Lu8/h;

    move-result-object v0

    instance-of v1, v0, Lu1/e1;

    if-eqz v1, :cond_0

    check-cast v0, Lu1/e1;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    new-instance v1, Lm9/l;

    invoke-static {p2}, Ld7/t;->b0(Lu8/e;)Lu8/e;

    move-result-object p2

    const/4 v2, 0x1

    invoke-direct {v1, v2, p2}, Lm9/l;-><init>(ILu8/e;)V

    invoke-virtual {v1}, Lm9/l;->t()V

    new-instance p2, Lu1/f1;

    invoke-direct {p2, v1, p0, p1}, Lu1/f1;-><init>(Lm9/l;Lu1/g1;Lc9/c;)V

    if-eqz v0, :cond_3

    iget-object p1, v0, Lu1/e1;->c:Landroid/view/Choreographer;

    iget-object v3, p0, Lu1/g1;->a:Landroid/view/Choreographer;

    invoke-static {p1, v3}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, v0, Lu1/e1;->e:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-object v3, v0, Lu1/e1;->n:Ljava/util/List;

    invoke-interface {v3, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-boolean v3, v0, Lu1/e1;->q:Z

    if-nez v3, :cond_2

    iput-boolean v2, v0, Lu1/e1;->q:Z

    iget-object v2, v0, Lu1/e1;->c:Landroid/view/Choreographer;

    iget-object v3, v0, Lu1/e1;->r:Lu1/d1;

    invoke-virtual {v2, v3}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_2

    :cond_2
    :goto_1
    monitor-exit p1

    new-instance p1, Lu/s;

    const/16 v2, 0x15

    invoke-direct {p1, v2, v0, p2}, Lu/s;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, p1}, Lm9/l;->v(Lc9/c;)V

    goto :goto_3

    :goto_2
    monitor-exit p1

    throw p2

    :cond_3
    iget-object p1, p0, Lu1/g1;->a:Landroid/view/Choreographer;

    invoke-virtual {p1, p2}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    new-instance p1, Lu/s;

    const/16 v0, 0x16

    invoke-direct {p1, v0, p0, p2}, Lu/s;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, p1}, Lm9/l;->v(Lc9/c;)V

    :goto_3
    invoke-virtual {v1}, Lm9/l;->s()Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lv8/a;->a:Lv8/a;

    return-object p1
.end method

.method public final e(Ljava/lang/Object;Lc9/e;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p2, p1, p0}, Lc9/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final f(Lu8/i;)Lu8/h;
    .locals 0

    invoke-static {p0, p1}, Lz6/a;->D(Lu8/h;Lu8/i;)Lu8/h;

    move-result-object p1

    return-object p1
.end method

.method public final u(Lu8/i;)Lu8/j;
    .locals 0

    invoke-static {p0, p1}, Lz6/a;->V(Lu8/h;Lu8/i;)Lu8/j;

    move-result-object p1

    return-object p1
.end method
