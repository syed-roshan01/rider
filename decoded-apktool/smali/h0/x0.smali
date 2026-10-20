.class public final Lh0/x0;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lf0/k1;


# direct methods
.method public constructor <init>(Lf0/k1;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lh0/x0;->c:Lf0/k1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 2

    new-instance v0, Lh0/x0;

    iget-object v1, p0, Lh0/x0;->c:Lf0/k1;

    invoke-direct {v0, v1, p2}, Lh0/x0;-><init>(Lf0/k1;Lu8/e;)V

    iput-object p1, v0, Lh0/x0;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo1/z;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lh0/x0;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lh0/x0;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lh0/x0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lh0/x0;->a:I

    sget-object v2, Lq8/l;->a:Lq8/l;

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p1, p0, Lh0/x0;->b:Ljava/lang/Object;

    check-cast p1, Lo1/z;

    iput v3, p0, Lh0/x0;->a:I

    new-instance v1, Lf0/e1;

    const/4 v3, 0x0

    iget-object v4, p0, Lh0/x0;->c:Lf0/k1;

    invoke-direct {v1, p1, v4, v3}, Lf0/e1;-><init>(Lo1/z;Lf0/k1;Lu8/e;)V

    invoke-static {v1, p0}, Ld7/a;->q(Lc9/e;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    goto :goto_0

    :cond_2
    move-object p1, v2

    :goto_0
    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_1
    return-object v2
.end method
