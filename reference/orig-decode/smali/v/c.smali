.class public final Lv/c;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lo1/z;

.field public final synthetic d:Lv/j;


# direct methods
.method public constructor <init>(Lo1/z;Lv/j;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lv/c;->c:Lo1/z;

    iput-object p2, p0, Lv/c;->d:Lv/j;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 3

    new-instance v0, Lv/c;

    iget-object v1, p0, Lv/c;->c:Lo1/z;

    iget-object v2, p0, Lv/c;->d:Lv/j;

    invoke-direct {v0, v1, v2, p2}, Lv/c;-><init>(Lo1/z;Lv/j;Lu8/e;)V

    iput-object p1, v0, Lv/c;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lv/c;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lv/c;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lv/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lv/c;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lv/c;->b:Ljava/lang/Object;

    check-cast v0, Lm9/d0;

    :try_start_0
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p1, p0, Lv/c;->b:Ljava/lang/Object;

    check-cast p1, Lm9/d0;

    :try_start_1
    iget-object v1, p0, Lv/c;->c:Lo1/z;

    new-instance v3, Lv/b;

    iget-object v4, p0, Lv/c;->d:Lv/j;

    const/4 v5, 0x0

    invoke-direct {v3, v4, v5, p1}, Lv/b;-><init>(Lv/j;Lu8/e;Lm9/d0;)V

    iput-object p1, p0, Lv/c;->b:Ljava/lang/Object;

    iput v2, p0, Lv/c;->a:I

    check-cast v1, Lo1/j0;

    invoke-virtual {v1, v3, p0}, Lo1/j0;->G0(Lc9/e;Lu8/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p1, v0, :cond_2

    return-object v0

    :goto_0
    move-object v6, v0

    move-object v0, p1

    move-object p1, v6

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_0

    :goto_1
    invoke-static {v0}, Ld7/a;->x(Lm9/d0;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    :goto_2
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1

    :cond_3
    throw p1
.end method
