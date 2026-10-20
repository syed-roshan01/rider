.class public final Lg8/z2;
.super Le8/i0;


# instance fields
.field public final a:Le8/o0;

.field public final b:Le8/j0;

.field public final c:Ljava/util/concurrent/Executor;

.field public final d:Le8/p1;

.field public final e:Le8/b0;

.field public f:Le8/h;

.field public g:Le8/k;


# direct methods
.method public constructor <init>(Le8/o0;Lg8/e3;Ljava/util/concurrent/Executor;Le8/p1;Le8/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg8/z2;->a:Le8/o0;

    iput-object p2, p0, Lg8/z2;->b:Le8/j0;

    iput-object p4, p0, Lg8/z2;->d:Le8/p1;

    iget-object p1, p5, Le8/h;->b:Ljava/util/concurrent/Executor;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move-object p3, p1

    :goto_0
    iput-object p3, p0, Lg8/z2;->c:Ljava/util/concurrent/Executor;

    invoke-static {p5}, Le8/h;->b(Le8/h;)Le8/g;

    move-result-object p1

    iput-object p3, p1, Le8/g;->b:Ljava/util/concurrent/Executor;

    new-instance p2, Le8/h;

    invoke-direct {p2, p1}, Le8/h;-><init>(Le8/g;)V

    iput-object p2, p0, Lg8/z2;->f:Le8/h;

    invoke-static {}, Le8/b0;->b()Le8/b0;

    move-result-object p1

    iput-object p1, p0, Lg8/z2;->e:Le8/b0;

    return-void
.end method


# virtual methods
.method public final cancel(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lg8/z2;->g:Le8/k;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Le8/k;->cancel(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public final delegate()Le8/k;
    .locals 1

    iget-object v0, p0, Lg8/z2;->g:Le8/k;

    return-object v0
.end method

.method public final start(Le8/j;Le8/l1;)V
    .locals 4

    iget-object v0, p0, Lg8/z2;->f:Le8/h;

    const-string v1, "method"

    iget-object v2, p0, Lg8/z2;->d:Le8/p1;

    invoke-static {v2, v1}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "headers"

    invoke-static {p2, v1}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "callOptions"

    invoke-static {v0, v1}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, p0, Lg8/z2;->a:Le8/o0;

    invoke-virtual {v0}, Le8/o0;->a()Ll/z2;

    move-result-object v0

    iget-object v1, v0, Ll/z2;->b:Ljava/lang/Object;

    check-cast v1, Le8/c2;

    invoke-virtual {v1}, Le8/c2;->e()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-static {v1}, Lg8/s1;->h(Le8/c2;)Le8/c2;

    move-result-object p2

    new-instance v0, Lg8/d0;

    invoke-direct {v0, p0, p1, p2}, Lg8/d0;-><init>(Lg8/z2;Le8/j;Le8/c2;)V

    iget-object p1, p0, Lg8/z2;->c:Ljava/util/concurrent/Executor;

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    sget-object p1, Lg8/l3;->i0:Le8/l;

    iput-object p1, p0, Lg8/z2;->g:Le8/k;

    return-void

    :cond_0
    iget-object v1, v0, Ll/z2;->d:Ljava/lang/Object;

    invoke-static {v1}, La7/a;->w(Ljava/lang/Object;)V

    iget-object v0, v0, Ll/z2;->c:Ljava/lang/Object;

    check-cast v0, Lg8/s3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v0, Lg8/s3;->b:Ljava/util/Map;

    iget-object v3, v2, Le8/p1;->b:Ljava/lang/String;

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg8/q3;

    if-nez v1, :cond_1

    iget-object v1, v0, Lg8/s3;->c:Ljava/util/Map;

    iget-object v3, v2, Le8/p1;->c:Ljava/lang/String;

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg8/q3;

    :cond_1
    if-nez v1, :cond_2

    iget-object v1, v0, Lg8/s3;->a:Lg8/q3;

    :cond_2
    if-eqz v1, :cond_3

    iget-object v0, p0, Lg8/z2;->f:Le8/h;

    sget-object v3, Lg8/q3;->g:Lv6/d;

    invoke-virtual {v0, v3, v1}, Le8/h;->c(Lv6/d;Ljava/lang/Object;)Le8/h;

    move-result-object v0

    iput-object v0, p0, Lg8/z2;->f:Le8/h;

    :cond_3
    iget-object v0, p0, Lg8/z2;->b:Le8/j0;

    iget-object v1, p0, Lg8/z2;->f:Le8/h;

    invoke-virtual {v0, v2, v1}, Le8/j0;->m(Le8/p1;Le8/h;)Le8/k;

    move-result-object v0

    iput-object v0, p0, Lg8/z2;->g:Le8/k;

    invoke-virtual {v0, p1, p2}, Le8/k;->start(Le8/j;Le8/l1;)V

    return-void
.end method
