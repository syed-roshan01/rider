.class public final Lu1/a2;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:Lo9/s;

.field public b:Lo9/b;

.field public c:I

.field public final synthetic d:Lo9/g;


# direct methods
.method public constructor <init>(Lo9/g;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lu1/a2;->d:Lo9/g;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 1

    new-instance p1, Lu1/a2;

    iget-object v0, p0, Lu1/a2;->d:Lo9/g;

    invoke-direct {p1, v0, p2}, Lu1/a2;-><init>(Lo9/g;Lu8/e;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lu1/a2;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lu1/a2;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lu1/a2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lu1/a2;->c:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lu1/a2;->b:Lo9/b;

    iget-object v3, p0, Lu1/a2;->a:Lo9/s;

    :try_start_0
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v4, v3

    move-object v3, v1

    move-object v1, v0

    move-object v0, p0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object v3, p0, Lu1/a2;->d:Lo9/g;

    :try_start_1
    invoke-interface {v3}, Lo9/s;->iterator()Lo9/b;

    move-result-object p1

    move-object v1, p1

    move-object p1, p0

    :goto_0
    iput-object v3, p1, Lu1/a2;->a:Lo9/s;

    iput-object v1, p1, Lu1/a2;->b:Lo9/b;

    iput v2, p1, Lu1/a2;->c:I

    invoke-virtual {v1, p1}, Lo9/b;->b(Lw8/c;)Ljava/lang/Object;

    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne v4, v0, :cond_2

    return-object v0

    :cond_2
    move-object v6, v0

    move-object v0, p1

    move-object p1, v4

    move-object v4, v3

    move-object v3, v1

    move-object v1, v6

    :goto_1
    :try_start_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {v3}, Lo9/b;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lq8/l;

    sget-object p1, Lu1/b2;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v5, 0x0

    invoke-virtual {p1, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-static {}, Lk0/y0;->g()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-object p1, v0

    move-object v0, v1

    move-object v1, v3

    move-object v3, v4

    goto :goto_0

    :catchall_1
    move-exception p1

    move-object v3, v4

    goto :goto_2

    :cond_3
    const/4 p1, 0x0

    invoke-static {v4, p1}, Lh6/g;->c(Lo9/s;Ljava/lang/Throwable;)V

    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1

    :goto_2
    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    move-exception v0

    invoke-static {v3, p1}, Lh6/g;->c(Lo9/s;Ljava/lang/Throwable;)V

    throw v0
.end method
