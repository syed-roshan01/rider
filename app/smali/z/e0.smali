.class public final Lz/e0;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:I

.field public final synthetic b:Lz/g0;


# direct methods
.method public constructor <init>(Lz/g0;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lz/e0;->b:Lz/g0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 1

    new-instance p1, Lz/e0;

    iget-object v0, p0, Lz/e0;->b:Lz/g0;

    invoke-direct {p1, v0, p2}, Lz/e0;-><init>(Lz/g0;Lu8/e;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lz/e0;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lz/e0;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lz/e0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lz/e0;->a:I

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

    iget-object p1, p0, Lz/e0;->b:Lz/g0;

    iget-object p1, p1, Lz/g0;->y:Lt/o;

    new-instance v1, Ljava/lang/Float;

    const/4 v3, 0x0

    invoke-direct {v1, v3}, Ljava/lang/Float;-><init>(F)V

    new-instance v3, Ljava/lang/Float;

    const/high16 v4, 0x3f000000    # 0.5f

    invoke-direct {v3, v4}, Ljava/lang/Float;-><init>(F)V

    const/high16 v4, 0x43c80000    # 400.0f

    invoke-static {v4, v3, v2}, Lt/e;->r(FLjava/lang/Object;I)Lt/d1;

    move-result-object v3

    iput v2, p0, Lz/e0;->a:I

    invoke-static {p1, v1, v3, p0}, Lt/e;->h(Lt/o;Ljava/lang/Float;Lt/d1;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
