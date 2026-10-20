.class public final Lb0/e;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:I

.field public final synthetic b:Lo1/z;

.field public final synthetic c:Lb0/h0;


# direct methods
.method public constructor <init>(Lo1/z;Lb0/h0;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lb0/e;->b:Lo1/z;

    iput-object p2, p0, Lb0/e;->c:Lb0/h0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 2

    new-instance p1, Lb0/e;

    iget-object v0, p0, Lb0/e;->b:Lo1/z;

    iget-object v1, p0, Lb0/e;->c:Lb0/h0;

    invoke-direct {p1, v0, v1, p2}, Lb0/e;-><init>(Lo1/z;Lb0/h0;Lu8/e;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lb0/e;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lb0/e;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lb0/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lb0/e;->a:I

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

    new-instance p1, Lb0/d;

    iget-object v1, p0, Lb0/e;->c:Lb0/h0;

    const/4 v3, 0x0

    invoke-direct {p1, v1, v3}, Lb0/d;-><init>(Lb0/h0;Lu8/e;)V

    iput v2, p0, Lb0/e;->a:I

    iget-object v1, p0, Lb0/e;->b:Lo1/z;

    invoke-static {v1, p1, p0}, Lm9/e0;->q(Lo1/z;Lc9/e;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
