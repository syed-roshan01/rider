.class public final Lh0/y;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lh0/l;

.field public final synthetic d:Lf0/k1;


# direct methods
.method public constructor <init>(Lh0/l;Lf0/k1;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lh0/y;->c:Lh0/l;

    iput-object p2, p0, Lh0/y;->d:Lf0/k1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 3

    new-instance v0, Lh0/y;

    iget-object v1, p0, Lh0/y;->c:Lh0/l;

    iget-object v2, p0, Lh0/y;->d:Lf0/k1;

    invoke-direct {v0, v1, v2, p2}, Lh0/y;-><init>(Lh0/l;Lf0/k1;Lu8/e;)V

    iput-object p1, v0, Lh0/y;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo1/z;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lh0/y;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lh0/y;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lh0/y;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lh0/y;->a:I

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

    iget-object p1, p0, Lh0/y;->b:Ljava/lang/Object;

    check-cast p1, Lo1/z;

    new-instance v1, Lh0/i;

    move-object v3, p1

    check-cast v3, Lo1/j0;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3}, Lt1/g;->y(Lt1/n;)Landroidx/compose/ui/node/a;

    move-result-object v3

    iget-object v3, v3, Landroidx/compose/ui/node/a;->z:Lu1/y2;

    invoke-direct {v1, v3}, Lh0/i;-><init>(Lu1/y2;)V

    new-instance v3, Lh0/x;

    iget-object v4, p0, Lh0/y;->d:Lf0/k1;

    const/4 v5, 0x0

    iget-object v6, p0, Lh0/y;->c:Lh0/l;

    invoke-direct {v3, v6, v1, v4, v5}, Lh0/x;-><init>(Lh0/l;Lh0/i;Lf0/k1;Lu8/e;)V

    iput v2, p0, Lh0/y;->a:I

    invoke-static {p1, v3, p0}, Lm9/e0;->q(Lo1/z;Lc9/e;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
