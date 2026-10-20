.class public final Lv/d3;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:I

.field public final synthetic b:Lc9/f;

.field public final synthetic c:Lv/l1;

.field public final synthetic d:Lo1/u;


# direct methods
.method public constructor <init>(Lc9/f;Lv/l1;Lo1/u;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lv/d3;->b:Lc9/f;

    iput-object p2, p0, Lv/d3;->c:Lv/l1;

    iput-object p3, p0, Lv/d3;->d:Lo1/u;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 3

    new-instance p1, Lv/d3;

    iget-object v0, p0, Lv/d3;->c:Lv/l1;

    iget-object v1, p0, Lv/d3;->d:Lo1/u;

    iget-object v2, p0, Lv/d3;->b:Lc9/f;

    invoke-direct {p1, v2, v0, v1, p2}, Lv/d3;-><init>(Lc9/f;Lv/l1;Lo1/u;Lu8/e;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lv/d3;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lv/d3;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lv/d3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lv/d3;->a:I

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

    iget-object p1, p0, Lv/d3;->d:Lo1/u;

    iget-wide v3, p1, Lo1/u;->c:J

    new-instance p1, Ld1/c;

    invoke-direct {p1, v3, v4}, Ld1/c;-><init>(J)V

    iput v2, p0, Lv/d3;->a:I

    iget-object v1, p0, Lv/d3;->b:Lc9/f;

    iget-object v2, p0, Lv/d3;->c:Lv/l1;

    invoke-interface {v1, v2, p1, p0}, Lc9/f;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
