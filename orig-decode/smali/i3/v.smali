.class public final Li3/v;
.super Ljava/lang/Object;


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:Z

.field public final e:Ljava/lang/Object;

.field public f:Li3/z;

.field public g:Ljava/lang/Object;

.field public final h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Li3/z;Z[I)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Li3/v;->a:I

    iput-object p1, p0, Li3/v;->e:Ljava/lang/Object;

    iput-object p1, p0, Li3/v;->f:Li3/z;

    iput-boolean p2, p0, Li3/v;->d:Z

    iput-object p3, p0, Li3/v;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ly5/o;IILh8/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li3/v;->h:Ljava/lang/Object;

    .line 2
    new-instance p1, Lja/g;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li3/v;->e:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-boolean p1, p0, Li3/v;->d:Z

    iput p2, p0, Li3/v;->a:I

    iput p3, p0, Li3/v;->b:I

    iput-object p4, p0, Li3/v;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 4

    iget-object v0, p0, Li3/v;->e:Ljava/lang/Object;

    check-cast v0, Lja/g;

    iget-wide v0, v0, Lja/g;->b:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final b(I)I
    .locals 2

    if-lez p1, :cond_1

    const v0, 0x7fffffff

    sub-int/2addr v0, p1

    iget v1, p0, Li3/v;->b:I

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Window size overflow for stream: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Li3/v;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget v0, p0, Li3/v;->b:I

    add-int/2addr v0, p1

    iput v0, p0, Li3/v;->b:I

    return v0
.end method

.method public final c()V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Li3/v;->a:I

    iget-object v0, p0, Li3/v;->e:Ljava/lang/Object;

    check-cast v0, Li3/z;

    iput-object v0, p0, Li3/v;->f:Li3/z;

    const/4 v0, 0x0

    iput v0, p0, Li3/v;->c:I

    return-void
.end method

.method public final d()Z
    .locals 4

    iget-object v0, p0, Li3/v;->f:Li3/z;

    iget-object v0, v0, Li3/z;->b:Li3/d0;

    invoke-virtual {v0}, Li3/d0;->c()Lj3/a;

    move-result-object v0

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lj3/c;->a(I)I

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    iget-object v3, v0, Lj3/c;->b:Ljava/nio/ByteBuffer;

    iget v0, v0, Lj3/c;->a:I

    add-int/2addr v1, v0

    invoke-virtual {v3, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    if-eqz v0, :cond_0

    return v2

    :cond_0
    iget v0, p0, Li3/v;->b:I

    const v1, 0xfe0f

    if-ne v0, v1, :cond_1

    return v2

    :cond_1
    iget-boolean v0, p0, Li3/v;->d:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    iget-object v0, p0, Li3/v;->h:Ljava/lang/Object;

    check-cast v0, [I

    if-nez v0, :cond_2

    return v2

    :cond_2
    iget-object v3, p0, Li3/v;->f:Li3/z;

    iget-object v3, v3, Li3/z;->b:Li3/d0;

    invoke-virtual {v3, v1}, Li3/d0;->a(I)I

    move-result v3

    invoke-static {v0, v3}, Ljava/util/Arrays;->binarySearch([II)I

    move-result v0

    if-gez v0, :cond_3

    return v2

    :cond_3
    return v1
.end method

.method public final e()I
    .locals 2

    iget v0, p0, Li3/v;->b:I

    iget-object v1, p0, Li3/v;->h:Ljava/lang/Object;

    check-cast v1, Ly5/o;

    iget-object v1, v1, Ly5/o;->d:Ljava/lang/Object;

    check-cast v1, Li3/v;

    iget v1, v1, Li3/v;->b:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0
.end method

.method public final f(ILja/g;Z)V
    .locals 8

    :cond_0
    iget-object v0, p0, Li3/v;->h:Ljava/lang/Object;

    check-cast v0, Ly5/o;

    iget-object v0, v0, Ly5/o;->c:Ljava/lang/Object;

    check-cast v0, Lj8/b;

    invoke-interface {v0}, Lj8/b;->R()I

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget-object v1, p0, Li3/v;->h:Ljava/lang/Object;

    check-cast v1, Ly5/o;

    iget-object v1, v1, Ly5/o;->d:Ljava/lang/Object;

    check-cast v1, Li3/v;

    neg-int v2, v0

    invoke-virtual {v1, v2}, Li3/v;->b(I)I

    invoke-virtual {p0, v2}, Li3/v;->b(I)I

    :try_start_0
    iget-wide v1, p2, Lja/g;->b:J

    int-to-long v3, v0

    cmp-long v1, v1, v3

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_1

    if-eqz p3, :cond_1

    move v1, v3

    goto :goto_0

    :cond_1
    move v1, v2

    :goto_0
    iget-object v4, p0, Li3/v;->h:Ljava/lang/Object;

    check-cast v4, Ly5/o;

    iget-object v4, v4, Ly5/o;->c:Ljava/lang/Object;

    check-cast v4, Lj8/b;

    iget v5, p0, Li3/v;->a:I

    invoke-interface {v4, v5, v0, p2, v1}, Lj8/b;->r(IILja/g;Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v1, p0, Li3/v;->g:Ljava/lang/Object;

    check-cast v1, Lh8/u;

    check-cast v1, Lg8/f;

    iget-object v4, v1, Lg8/f;->b:Ljava/lang/Object;

    monitor-enter v4

    :try_start_1
    iget-boolean v5, v1, Lg8/f;->f:Z

    const-string v6, "onStreamAllocated was not called, but it seems the stream is active"

    invoke-static {v6, v5}, Ly3/e;->N(Ljava/lang/String;Z)V

    iget v5, v1, Lg8/f;->e:I

    const v6, 0x8000

    if-ge v5, v6, :cond_2

    move v7, v3

    goto :goto_1

    :cond_2
    move v7, v2

    :goto_1
    sub-int/2addr v5, v0

    iput v5, v1, Lg8/f;->e:I

    if-ge v5, v6, :cond_3

    move v5, v3

    goto :goto_2

    :cond_3
    move v5, v2

    :goto_2
    if-nez v7, :cond_4

    if-eqz v5, :cond_4

    move v2, v3

    :cond_4
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v2, :cond_5

    iget-object v2, v1, Lg8/f;->b:Ljava/lang/Object;

    monitor-enter v2

    :try_start_2
    invoke-virtual {v1}, Lg8/f;->e()Z

    move-result v3

    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v3, :cond_5

    check-cast v1, Lg8/a;

    iget-object v1, v1, Lg8/a;->j:Lg8/j0;

    invoke-interface {v1}, Lg8/b6;->b()V

    goto :goto_3

    :catchall_0
    move-exception p1

    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1

    :cond_5
    :goto_3
    sub-int/2addr p1, v0

    if-gtz p1, :cond_0

    return-void

    :catchall_1
    move-exception p1

    :try_start_4
    monitor-exit v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p1

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final g(ILx9/v;)V
    .locals 8

    invoke-virtual {p0}, Li3/v;->e()I

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-virtual {p0}, Li3/v;->a()Z

    move-result v3

    if-eqz v3, :cond_1

    if-lez v0, :cond_1

    int-to-long v3, v0

    iget-object v5, p0, Li3/v;->e:Ljava/lang/Object;

    check-cast v5, Lja/g;

    iget-wide v6, v5, Lja/g;->b:J

    cmp-long v3, v3, v6

    if-ltz v3, :cond_0

    long-to-int v0, v6

    add-int/2addr v2, v0

    long-to-int v0, v6

    iget-boolean v3, p0, Li3/v;->d:Z

    invoke-virtual {p0, v0, v5, v3}, Li3/v;->f(ILja/g;Z)V

    goto :goto_1

    :cond_0
    add-int/2addr v2, v0

    invoke-virtual {p0, v0, v5, v1}, Li3/v;->f(ILja/g;Z)V

    :goto_1
    iget v0, p2, Lx9/v;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p2, Lx9/v;->a:I

    sub-int v0, p1, v2

    invoke-virtual {p0}, Li3/v;->e()I

    move-result v3

    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Li3/v;->a()Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Li3/v;->f:Li3/z;

    check-cast p1, Ljava/lang/Runnable;

    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    const/4 p1, 0x0

    iput-object p1, p0, Li3/v;->f:Li3/z;

    :cond_2
    return-void
.end method
