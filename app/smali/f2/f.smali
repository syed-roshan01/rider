.class public final Lf2/f;
.super Ljava/lang/Object;

# interfaces
.implements Lf2/d;


# instance fields
.field public final a:Lf2/o;

.field public final b:Lf2/r;

.field public final c:Lf2/u;

.field public final d:Lf2/i;

.field public final e:Lf2/n;


# direct methods
.method public constructor <init>(La4/q;Lf2/a;)V
    .locals 3

    sget-object v0, Lf2/g;->a:Lf2/u;

    new-instance v1, Lf2/i;

    sget-object v2, Lf2/g;->b:La4/q;

    invoke-direct {v1, v2}, Lf2/i;-><init>(La4/q;)V

    new-instance v2, Lf2/n;

    invoke-direct {v2}, Lf2/n;-><init>()V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf2/f;->a:Lf2/o;

    iput-object p2, p0, Lf2/f;->b:Lf2/r;

    iput-object v0, p0, Lf2/f;->c:Lf2/u;

    iput-object v1, p0, Lf2/f;->d:Lf2/i;

    iput-object v2, p0, Lf2/f;->e:Lf2/n;

    return-void
.end method


# virtual methods
.method public final a(Lf2/t;)Lf2/w;
    .locals 5

    iget-object v0, p0, Lf2/f;->c:Lf2/u;

    new-instance v1, Lu/s;

    const/16 v2, 0x18

    invoke-direct {v1, v2, p0, p1}, Lu/s;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object v2, v0, Lf2/u;->a:La4/q;

    monitor-enter v2

    :try_start_0
    iget-object v3, v0, Lf2/u;->b:Le2/b;

    invoke-virtual {v3, p1}, Le2/b;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lf2/w;

    if-eqz v3, :cond_1

    move-object v4, v3

    check-cast v4, Lf2/v;

    iget-boolean v4, v4, Lf2/v;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v4, :cond_0

    monitor-exit v2

    goto :goto_2

    :cond_0
    :try_start_1
    iget-object v3, v0, Lf2/u;->b:Le2/b;

    invoke-virtual {v3, p1}, Le2/b;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lf2/w;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_1
    :goto_0
    monitor-exit v2

    :try_start_2
    new-instance v2, Lu/s;

    const/16 v3, 0x19

    invoke-direct {v2, v3, v0, p1}, Lu/s;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Lu/s;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lf2/w;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    iget-object v1, v0, Lf2/u;->a:La4/q;

    monitor-enter v1

    :try_start_3
    iget-object v2, v0, Lf2/u;->b:Le2/b;

    invoke-virtual {v2, p1}, Le2/b;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_2

    move-object v2, v3

    check-cast v2, Lf2/v;

    iget-boolean v2, v2, Lf2/v;->b:Z

    if-eqz v2, :cond_2

    iget-object v0, v0, Lf2/u;->b:Le2/b;

    invoke-virtual {v0, p1, v3}, Le2/b;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_3

    :cond_2
    :goto_1
    monitor-exit v1

    :goto_2
    return-object v3

    :goto_3
    monitor-exit v1

    throw p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Could not load font"

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :goto_4
    monitor-exit v2

    throw p1
.end method

.method public final b(Lf2/e;Lf2/l;II)Lf2/w;
    .locals 7

    new-instance v6, Lf2/t;

    iget-object v0, p0, Lf2/f;->b:Lf2/r;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0, p2}, Lf2/r;->a(Lf2/l;)Lf2/l;

    move-result-object v2

    iget-object p2, p0, Lf2/f;->a:Lf2/o;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v5, 0x0

    move-object v0, v6

    move-object v1, p1

    move v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lf2/t;-><init>(Lf2/e;Lf2/l;IILjava/lang/Object;)V

    invoke-virtual {p0, v6}, Lf2/f;->a(Lf2/t;)Lf2/w;

    move-result-object p1

    return-object p1
.end method
