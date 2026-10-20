.class public final Lo9/l;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lo9/t;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lo9/t;Ljava/lang/Object;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lo9/l;->c:Lo9/t;

    iput-object p2, p0, Lo9/l;->d:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 3

    new-instance v0, Lo9/l;

    iget-object v1, p0, Lo9/l;->c:Lo9/t;

    iget-object v2, p0, Lo9/l;->d:Ljava/lang/Object;

    invoke-direct {v0, v1, v2, p2}, Lo9/l;-><init>(Lo9/t;Ljava/lang/Object;Lu8/e;)V

    iput-object p1, v0, Lo9/l;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lo9/l;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lo9/l;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lo9/l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lo9/l;->a:I

    sget-object v2, Lq8/l;->a:Lq8/l;

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

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

    iget-object p1, p0, Lo9/l;->b:Ljava/lang/Object;

    check-cast p1, Lm9/d0;

    iget-object p1, p0, Lo9/l;->c:Lo9/t;

    iget-object v1, p0, Lo9/l;->d:Ljava/lang/Object;

    :try_start_1
    iput v3, p0, Lo9/l;->a:I

    invoke-interface {p1, v1, p0}, Lo9/t;->h(Ljava/lang/Object;Lu8/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    move-object p1, v2

    goto :goto_2

    :goto_1
    invoke-static {p1}, Ld7/t;->N(Ljava/lang/Throwable;)Lq8/g;

    move-result-object p1

    :goto_2
    instance-of v0, p1, Lq8/g;

    xor-int/2addr v0, v3

    if-eqz v0, :cond_3

    goto :goto_3

    :cond_3
    invoke-static {p1}, Lq8/h;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    new-instance v2, Lo9/h;

    invoke-direct {v2, p1}, Lo9/h;-><init>(Ljava/lang/Throwable;)V

    :goto_3
    new-instance p1, Lo9/j;

    invoke-direct {p1, v2}, Lo9/j;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method
