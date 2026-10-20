.class public final Lo1/f0;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:I

.field public final synthetic b:J

.field public final synthetic c:Lo1/h0;


# direct methods
.method public constructor <init>(JLo1/h0;Lu8/e;)V
    .locals 0

    iput-wide p1, p0, Lo1/f0;->b:J

    iput-object p3, p0, Lo1/f0;->c:Lo1/h0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 3

    new-instance p1, Lo1/f0;

    iget-wide v0, p0, Lo1/f0;->b:J

    iget-object v2, p0, Lo1/f0;->c:Lo1/h0;

    invoke-direct {p1, v0, v1, v2, p2}, Lo1/f0;-><init>(JLo1/h0;Lu8/e;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lo1/f0;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lo1/f0;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lo1/f0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lo1/f0;->a:I

    const-wide/16 v2, 0x1

    iget-wide v4, p0, Lo1/f0;->b:J

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v7, :cond_1

    if-ne v1, v6, :cond_0

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    sub-long v8, v4, v2

    iput v7, p0, Lo1/f0;->a:I

    invoke-static {v8, v9, p0}, Ld7/t;->P(JLu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    iput v6, p0, Lo1/f0;->a:I

    invoke-static {v2, v3, p0}, Ld7/t;->P(JLu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    iget-object p1, p0, Lo1/f0;->c:Lo1/h0;

    iget-object p1, p1, Lo1/h0;->c:Lm9/k;

    if-eqz p1, :cond_5

    new-instance v0, Lo1/m;

    invoke-direct {v0, v4, v5}, Lo1/m;-><init>(J)V

    invoke-static {v0}, Ld7/t;->N(Ljava/lang/Throwable;)Lq8/g;

    move-result-object v0

    invoke-interface {p1, v0}, Lu8/e;->resumeWith(Ljava/lang/Object;)V

    :cond_5
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
