.class public final Lj0/b;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:I

.field public final synthetic b:Lj0/p;

.field public final synthetic c:Lj0/c;

.field public final synthetic d:Lx/o;


# direct methods
.method public constructor <init>(Lj0/p;Lj0/c;Lx/o;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lj0/b;->b:Lj0/p;

    iput-object p2, p0, Lj0/b;->c:Lj0/c;

    iput-object p3, p0, Lj0/b;->d:Lx/o;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 3

    new-instance p1, Lj0/b;

    iget-object v0, p0, Lj0/b;->c:Lj0/c;

    iget-object v1, p0, Lj0/b;->d:Lx/o;

    iget-object v2, p0, Lj0/b;->b:Lj0/p;

    invoke-direct {p1, v2, v0, v1, p2}, Lj0/b;-><init>(Lj0/p;Lj0/c;Lx/o;Lu8/e;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lj0/b;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lj0/b;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lj0/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lj0/b;->a:I

    iget-object v2, p0, Lj0/b;->d:Lx/o;

    iget-object v3, p0, Lj0/b;->c:Lj0/c;

    const/4 v4, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v4, :cond_0

    :try_start_0
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lj0/b;->b:Lj0/p;

    iput v4, p0, Lj0/b;->a:I

    invoke-virtual {p1, p0}, Lj0/p;->a(Lu8/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, v3, Lj0/c;->f:Lw0/x;

    invoke-virtual {p1, v2}, Lw0/x;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1

    :goto_1
    iget-object v0, v3, Lj0/c;->f:Lw0/x;

    invoke-virtual {v0, v2}, Lw0/x;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    throw p1
.end method
