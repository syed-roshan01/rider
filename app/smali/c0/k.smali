.class public final Lc0/k;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:I

.field public final synthetic b:Lc0/m;

.field public final synthetic c:Lc9/a;


# direct methods
.method public constructor <init>(Lc0/m;Lc9/a;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lc0/k;->b:Lc0/m;

    iput-object p2, p0, Lc0/k;->c:Lc9/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 2

    new-instance p1, Lc0/k;

    iget-object v0, p0, Lc0/k;->b:Lc0/m;

    iget-object v1, p0, Lc0/k;->c:Lc9/a;

    invoke-direct {p1, v0, v1, p2}, Lc0/k;-><init>(Lc0/m;Lc9/a;Lu8/e;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lc0/k;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lc0/k;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lc0/k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lc0/k;->a:I

    sget-object v2, Lq8/l;->a:Lq8/l;

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p1, p0, Lc0/k;->b:Lc0/m;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lc0/c;->a:Ls1/i;

    invoke-interface {p1, v1}, Ls1/f;->g(Ls1/i;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc0/d;

    if-nez v1, :cond_2

    iget-object v1, p1, Lc0/a;->u:Lc0/n;

    :cond_2
    invoke-virtual {p1}, Lc0/a;->G0()Lr1/s;

    move-result-object p1

    if-nez p1, :cond_3

    return-object v2

    :cond_3
    iput v3, p0, Lc0/k;->a:I

    iget-object v3, p0, Lc0/k;->c:Lc9/a;

    invoke-interface {v1, p1, v3, p0}, Lc0/d;->x(Lr1/s;Lc9/a;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_0
    return-object v2
.end method
