.class public final Lba/d;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lba/i;

.field public final b:Lx9/n;

.field public final c:Lba/e;

.field public final d:Lca/d;

.field public e:Z

.field public f:Z

.field public final g:Lba/k;


# direct methods
.method public constructor <init>(Lba/i;Lx9/n;Lba/e;Lca/d;)V
    .locals 1

    const-string v0, "eventListener"

    invoke-static {p2, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lba/d;->a:Lba/i;

    iput-object p2, p0, Lba/d;->b:Lx9/n;

    iput-object p3, p0, Lba/d;->c:Lba/e;

    iput-object p4, p0, Lba/d;->d:Lca/d;

    invoke-interface {p4}, Lca/d;->h()Lba/k;

    move-result-object p1

    iput-object p1, p0, Lba/d;->g:Lba/k;

    return-void
.end method


# virtual methods
.method public final a(ZZLjava/io/IOException;)Ljava/io/IOException;
    .locals 3

    if-eqz p3, :cond_0

    invoke-virtual {p0, p3}, Lba/d;->d(Ljava/io/IOException;)V

    :cond_0
    const-string v0, "call"

    iget-object v1, p0, Lba/d;->b:Lx9/n;

    iget-object v2, p0, Lba/d;->a:Lba/i;

    if-eqz p2, :cond_2

    if-eqz p3, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    :goto_0
    if-eqz p1, :cond_4

    if-eqz p3, :cond_3

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_4
    :goto_1
    invoke-virtual {v2, p0, p2, p1, p3}, Lba/i;->g(Lba/d;ZZLjava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lx9/b0;)Lx9/c0;
    .locals 4

    iget-object v0, p0, Lba/d;->d:Lca/d;

    :try_start_0
    const-string v1, "Content-Type"

    invoke-static {p1, v1}, Lx9/b0;->b(Lx9/b0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, p1}, Lca/d;->a(Lx9/b0;)J

    move-result-wide v2

    invoke-interface {v0, p1}, Lca/d;->b(Lx9/b0;)Lja/g0;

    move-result-object p1

    new-instance v0, Lba/c;

    invoke-direct {v0, p0, p1, v2, v3}, Lba/c;-><init>(Lba/d;Lja/g0;J)V

    new-instance p1, Lx9/c0;

    invoke-static {v0}, Lr9/a;->c(Lja/g0;)Lja/a0;

    move-result-object v0

    invoke-direct {p1, v1, v2, v3, v0}, Lx9/c0;-><init>(Ljava/lang/String;JLja/a0;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    iget-object v0, p0, Lba/d;->b:Lx9/n;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "call"

    iget-object v1, p0, Lba/d;->a:Lba/i;

    invoke-static {v1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lba/d;->d(Ljava/io/IOException;)V

    throw p1
.end method

.method public final c(Z)Lx9/a0;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lba/d;->d:Lca/d;

    invoke-interface {v0, p1}, Lca/d;->g(Z)Lx9/a0;

    move-result-object p1

    if-eqz p1, :cond_0

    iput-object p0, p1, Lx9/a0;->m:Lba/d;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p1

    :catch_0
    move-exception p1

    iget-object v0, p0, Lba/d;->b:Lx9/n;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "call"

    iget-object v1, p0, Lba/d;->a:Lba/i;

    invoke-static {v1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lba/d;->d(Ljava/io/IOException;)V

    throw p1
.end method

.method public final d(Ljava/io/IOException;)V
    .locals 5

    const/4 v0, 0x1

    iput-boolean v0, p0, Lba/d;->f:Z

    iget-object v1, p0, Lba/d;->c:Lba/e;

    invoke-virtual {v1, p1}, Lba/e;->c(Ljava/io/IOException;)V

    iget-object v1, p0, Lba/d;->d:Lca/d;

    invoke-interface {v1}, Lca/d;->h()Lba/k;

    move-result-object v1

    iget-object v2, p0, Lba/d;->a:Lba/i;

    monitor-enter v1

    :try_start_0
    const-string v3, "call"

    invoke-static {v2, v3}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v3, p1, Lea/d0;

    if-eqz v3, :cond_2

    move-object v3, p1

    check-cast v3, Lea/d0;

    iget-object v3, v3, Lea/d0;->a:Lea/b;

    sget-object v4, Lea/b;->f:Lea/b;

    if-ne v3, v4, :cond_0

    iget p1, v1, Lba/k;->n:I

    add-int/2addr p1, v0

    iput p1, v1, Lba/k;->n:I

    if-le p1, v0, :cond_4

    iput-boolean v0, v1, Lba/k;->j:Z

    iget p1, v1, Lba/k;->l:I

    add-int/2addr p1, v0

    iput p1, v1, Lba/k;->l:I

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    check-cast p1, Lea/d0;

    iget-object p1, p1, Lea/d0;->a:Lea/b;

    sget-object v3, Lea/b;->n:Lea/b;

    if-ne p1, v3, :cond_1

    iget-boolean p1, v2, Lba/i;->w:Z

    if-nez p1, :cond_4

    :cond_1
    iput-boolean v0, v1, Lba/k;->j:Z

    iget p1, v1, Lba/k;->l:I

    add-int/2addr p1, v0

    iput p1, v1, Lba/k;->l:I

    goto :goto_0

    :cond_2
    iget-object v3, v1, Lba/k;->g:Lea/r;

    if-eqz v3, :cond_3

    instance-of v3, p1, Lea/a;

    if-eqz v3, :cond_4

    :cond_3
    iput-boolean v0, v1, Lba/k;->j:Z

    iget v3, v1, Lba/k;->m:I

    if-nez v3, :cond_4

    iget-object v2, v2, Lba/i;->a:Lx9/w;

    iget-object v3, v1, Lba/k;->b:Lx9/d0;

    invoke-static {v2, v3, p1}, Lba/k;->d(Lx9/w;Lx9/d0;Ljava/io/IOException;)V

    iget p1, v1, Lba/k;->l:I

    add-int/2addr p1, v0

    iput p1, v1, Lba/k;->l:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_4
    :goto_0
    monitor-exit v1

    return-void

    :goto_1
    monitor-exit v1

    throw p1
.end method
