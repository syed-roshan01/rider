.class public final Lk4/e;
.super Ljava/lang/Object;

# interfaces
.implements Lk4/h;


# instance fields
.field public final a:Lk4/o;

.field public final b:Ls4/n;

.field public final c:Lu9/f;

.field public final d:Lk4/k;


# direct methods
.method public constructor <init>(Lk4/o;Ls4/n;Lu9/i;Lk4/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk4/e;->a:Lk4/o;

    iput-object p2, p0, Lk4/e;->b:Ls4/n;

    iput-object p3, p0, Lk4/e;->c:Lu9/f;

    iput-object p4, p0, Lk4/e;->d:Lk4/k;

    return-void
.end method


# virtual methods
.method public final a(Lu8/e;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p1, Lk4/d;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lk4/d;

    iget v1, v0, Lk4/d;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lk4/d;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lk4/d;

    invoke-direct {v0, p0, p1}, Lk4/d;-><init>(Lk4/e;Lu8/e;)V

    :goto_0
    iget-object p1, v0, Lk4/d;->c:Ljava/lang/Object;

    sget-object v1, Lv8/a;->a:Lv8/a;

    iget v2, v0, Lk4/d;->e:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lk4/d;->a:Ljava/lang/Object;

    check-cast v0, Lu9/f;

    :try_start_0
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_5

    :catchall_0
    move-exception p1

    goto/16 :goto_7

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lk4/d;->b:Lu9/f;

    iget-object v4, v0, Lk4/d;->a:Ljava/lang/Object;

    check-cast v4, Lk4/e;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    move-object p1, v2

    goto :goto_4

    :cond_3
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iput-object p0, v0, Lk4/d;->a:Ljava/lang/Object;

    iget-object p1, p0, Lk4/e;->c:Lu9/f;

    iput-object p1, v0, Lk4/d;->b:Lu9/f;

    iput v4, v0, Lk4/d;->e:I

    move-object v2, p1

    check-cast v2, Lu9/i;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_4
    sget-object v4, Lu9/i;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v4, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->getAndDecrement(Ljava/lang/Object;)I

    move-result v4

    iget v5, v2, Lu9/i;->a:I

    if-gt v4, v5, :cond_4

    sget-object v6, Lq8/l;->a:Lq8/l;

    if-lez v4, :cond_5

    goto :goto_3

    :cond_5
    invoke-static {v0}, Ld7/t;->b0(Lu8/e;)Lu8/e;

    move-result-object v4

    invoke-static {v4}, Ld7/a;->w(Lu8/e;)Lm9/l;

    move-result-object v4

    :try_start_1
    invoke-virtual {v2, v4}, Lu9/i;->a(Lm9/i2;)Z

    move-result v7

    if-nez v7, :cond_8

    :cond_6
    sget-object v7, Lu9/i;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v7, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->getAndDecrement(Ljava/lang/Object;)I

    move-result v7

    if-gt v7, v5, :cond_6

    if-lez v7, :cond_7

    iget-object v2, v2, Lu9/i;->b:Lh1/b;

    invoke-virtual {v4, v2, v6}, Lm9/l;->o(Lc9/c;Ljava/lang/Object;)V

    goto :goto_1

    :cond_7
    invoke-virtual {v2, v4}, Lu9/i;->a(Lm9/i2;)Z

    move-result v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v7, :cond_6

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_8

    :cond_8
    :goto_1
    invoke-virtual {v4}, Lm9/l;->s()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_9

    goto :goto_2

    :cond_9
    move-object v2, v6

    :goto_2
    if-ne v2, v1, :cond_a

    move-object v6, v2

    :cond_a
    :goto_3
    if-ne v6, v1, :cond_b

    return-object v1

    :cond_b
    move-object v4, p0

    :goto_4
    :try_start_2
    new-instance v2, Lu1/z0;

    const/16 v5, 0x9

    invoke-direct {v2, v4, v5}, Lu1/z0;-><init>(Ljava/lang/Object;I)V

    iput-object p1, v0, Lk4/d;->a:Ljava/lang/Object;

    const/4 v4, 0x0

    iput-object v4, v0, Lk4/d;->b:Lu9/f;

    iput v3, v0, Lk4/d;->e:I

    sget-object v3, Lu8/k;->a:Lu8/k;

    new-instance v5, Lm9/d1;

    invoke-direct {v5, v2, v4}, Lm9/d1;-><init>(Lc9/a;Lu8/e;)V

    invoke-static {v3, v5, v0}, Lz6/a;->u0(Lu8/j;Lc9/e;Lu8/e;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-ne v0, v1, :cond_c

    return-object v1

    :cond_c
    move-object v8, v0

    move-object v0, p1

    move-object p1, v8

    :goto_5
    :try_start_3
    check-cast p1, Lk4/g;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    check-cast v0, Lu9/i;

    invoke-virtual {v0}, Lu9/i;->b()V

    return-object p1

    :goto_6
    move-object v8, v0

    move-object v0, p1

    move-object p1, v8

    goto :goto_7

    :catchall_2
    move-exception v0

    goto :goto_6

    :goto_7
    check-cast v0, Lu9/i;

    invoke-virtual {v0}, Lu9/i;->b()V

    throw p1

    :goto_8
    invoke-virtual {v4}, Lm9/l;->C()V

    throw p1
.end method
