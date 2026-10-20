.class public final Lu1/p3;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:I

.field public final synthetic b:Lp9/o0;

.field public final synthetic c:Lu1/h2;


# direct methods
.method public constructor <init>(Lp9/o0;Lu1/h2;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lu1/p3;->b:Lp9/o0;

    iput-object p2, p0, Lu1/p3;->c:Lu1/h2;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 2

    new-instance p1, Lu1/p3;

    iget-object v0, p0, Lu1/p3;->b:Lp9/o0;

    iget-object v1, p0, Lu1/p3;->c:Lu1/h2;

    invoke-direct {p1, v0, v1, p2}, Lu1/p3;-><init>(Lp9/o0;Lu1/h2;Lu8/e;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lu1/p3;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lu1/p3;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lu1/p3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lv8/a;->a:Lv8/a;

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lu1/p3;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-eq v1, v2, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    new-instance p1, Lu1/o3;

    iget-object v1, p0, Lu1/p3;->c:Lu1/h2;

    const/4 v3, 0x0

    invoke-direct {p1, v1, v3}, Lu1/o3;-><init>(Ljava/lang/Object;I)V

    iput v2, p0, Lu1/p3;->a:I

    iget-object v1, p0, Lu1/p3;->b:Lp9/o0;

    invoke-interface {v1, p1, p0}, Lp9/f;->collect(Lp9/g;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    new-instance p1, Landroidx/fragment/app/a0;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
.end method
