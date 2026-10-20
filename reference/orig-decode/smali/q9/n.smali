.class public final Lq9/n;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lq9/o;

.field public final synthetic d:Lp9/g;


# direct methods
.method public constructor <init>(Lq9/o;Lp9/g;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lq9/n;->c:Lq9/o;

    iput-object p2, p0, Lq9/n;->d:Lp9/g;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 3

    new-instance v0, Lq9/n;

    iget-object v1, p0, Lq9/n;->c:Lq9/o;

    iget-object v2, p0, Lq9/n;->d:Lp9/g;

    invoke-direct {v0, v1, v2, p2}, Lq9/n;-><init>(Lq9/o;Lp9/g;Lu8/e;)V

    iput-object p1, v0, Lq9/n;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lq9/n;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lq9/n;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lq9/n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lq9/n;->a:I

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

    iget-object p1, p0, Lq9/n;->b:Ljava/lang/Object;

    check-cast p1, Lm9/d0;

    new-instance v1, Ld9/u;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iget-object v3, p0, Lq9/n;->c:Lq9/o;

    iget-object v4, v3, Lq9/i;->d:Lp9/f;

    new-instance v5, Lq9/m;

    iget-object v6, p0, Lq9/n;->d:Lp9/g;

    invoke-direct {v5, v1, p1, v3, v6}, Lq9/m;-><init>(Ld9/u;Lm9/d0;Lq9/o;Lp9/g;)V

    iput v2, p0, Lq9/n;->a:I

    invoke-interface {v4, v5, p0}, Lp9/f;->collect(Lp9/g;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
