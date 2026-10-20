.class public final Lp9/v;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lp9/f;

.field public final synthetic d:Lp9/x;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lp9/f;Lp9/x;Ljava/lang/Object;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lp9/v;->c:Lp9/f;

    iput-object p2, p0, Lp9/v;->d:Lp9/x;

    iput-object p3, p0, Lp9/v;->e:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 4

    new-instance v0, Lp9/v;

    iget-object v1, p0, Lp9/v;->d:Lp9/x;

    iget-object v2, p0, Lp9/v;->e:Ljava/lang/Object;

    iget-object v3, p0, Lp9/v;->c:Lp9/f;

    invoke-direct {v0, v3, v1, v2, p2}, Lp9/v;-><init>(Lp9/f;Lp9/x;Ljava/lang/Object;Lu8/e;)V

    iput-object p1, v0, Lp9/v;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lp9/f0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lp9/v;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lp9/v;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lp9/v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lp9/v;->a:I

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

    iget-object p1, p0, Lp9/v;->b:Ljava/lang/Object;

    check-cast p1, Lp9/f0;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    iget-object v1, p0, Lp9/v;->d:Lp9/x;

    if-eqz p1, :cond_4

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    goto :goto_0

    :cond_2
    sget-object p1, Lp9/d0;->a:Li3/u;

    iget-object v0, p0, Lp9/v;->e:Ljava/lang/Object;

    if-ne v0, p1, :cond_3

    invoke-interface {v1}, Lp9/x;->a()V

    goto :goto_0

    :cond_3
    invoke-interface {v1, v0}, Lp9/x;->f(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    iput v2, p0, Lp9/v;->a:I

    iget-object p1, p0, Lp9/v;->c:Lp9/f;

    invoke-interface {p1, v1, p0}, Lp9/f;->collect(Lp9/g;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_0
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
