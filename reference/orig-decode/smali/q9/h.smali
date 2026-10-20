.class public final Lq9/h;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lq9/i;


# direct methods
.method public constructor <init>(Lq9/i;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lq9/h;->c:Lq9/i;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 2

    new-instance v0, Lq9/h;

    iget-object v1, p0, Lq9/h;->c:Lq9/i;

    invoke-direct {v0, v1, p2}, Lq9/h;-><init>(Lq9/i;Lu8/e;)V

    iput-object p1, v0, Lq9/h;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lp9/g;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lq9/h;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lq9/h;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lq9/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lq9/h;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p1, p0, Lq9/h;->b:Ljava/lang/Object;

    check-cast p1, Lp9/g;

    iput v2, p0, Lq9/h;->a:I

    iget-object v1, p0, Lq9/h;->c:Lq9/i;

    invoke-virtual {v1, p1, p0}, Lq9/i;->g(Lp9/g;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
