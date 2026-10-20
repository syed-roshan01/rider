.class public final Lv/k2;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:J

.field public b:I

.field public synthetic c:J

.field public final synthetic d:Lv/l2;


# direct methods
.method public constructor <init>(Lv/l2;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lv/k2;->d:Lv/l2;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 2

    new-instance v0, Lv/k2;

    iget-object v1, p0, Lv/k2;->d:Lv/l2;

    invoke-direct {v0, v1, p2}, Lv/k2;-><init>(Lv/l2;Lu8/e;)V

    check-cast p1, Lm2/p;

    iget-wide p1, p1, Lm2/p;->a:J

    iput-wide p1, v0, Lv/k2;->c:J

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lm2/p;

    iget-wide v0, p1, Lm2/p;->a:J

    check-cast p2, Lu8/e;

    new-instance p1, Lm2/p;

    invoke-direct {p1, v0, v1}, Lm2/p;-><init>(J)V

    invoke-virtual {p0, p1, p2}, Lv/k2;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lv/k2;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lv/k2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    sget-object v6, Lv8/a;->a:Lv8/a;

    iget v0, p0, Lv/k2;->b:I

    const/4 v1, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    iget-object v4, p0, Lv/k2;->d:Lv/l2;

    if-eqz v0, :cond_3

    if-eq v0, v3, :cond_2

    if-eq v0, v2, :cond_1

    if-ne v0, v1, :cond_0

    iget-wide v0, p0, Lv/k2;->a:J

    iget-wide v2, p0, Lv/k2;->c:J

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    move-wide v9, v0

    move-object v0, p1

    goto :goto_2

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-wide v2, p0, Lv/k2;->a:J

    iget-wide v7, p0, Lv/k2;->c:J

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    move-object v0, p1

    goto :goto_1

    :cond_2
    iget-wide v7, p0, Lv/k2;->c:J

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    move-object v0, p1

    goto :goto_0

    :cond_3
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-wide v7, p0, Lv/k2;->c:J

    iget-object v0, v4, Lv/l2;->f:Ln1/d;

    iput-wide v7, p0, Lv/k2;->c:J

    iput v3, p0, Lv/k2;->b:I

    invoke-virtual {v0, v7, v8, p0}, Ln1/d;->b(JLu8/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_4

    return-object v6

    :cond_4
    :goto_0
    check-cast v0, Lm2/p;

    iget-wide v9, v0, Lm2/p;->a:J

    invoke-static {v7, v8, v9, v10}, Lm2/p;->d(JJ)J

    move-result-wide v9

    iput-wide v7, p0, Lv/k2;->c:J

    iput-wide v9, p0, Lv/k2;->a:J

    iput v2, p0, Lv/k2;->b:I

    invoke-virtual {v4, v9, v10, p0}, Lv/l2;->b(JLu8/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_5

    return-object v6

    :cond_5
    move-wide v2, v9

    :goto_1
    check-cast v0, Lm2/p;

    iget-wide v9, v0, Lm2/p;->a:J

    iget-object v0, v4, Lv/l2;->f:Ln1/d;

    invoke-static {v2, v3, v9, v10}, Lm2/p;->d(JJ)J

    move-result-wide v2

    iput-wide v7, p0, Lv/k2;->c:J

    iput-wide v9, p0, Lv/k2;->a:J

    iput v1, p0, Lv/k2;->b:I

    move-wide v1, v2

    move-wide v3, v9

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, Ln1/d;->a(JJLu8/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_6

    return-object v6

    :cond_6
    move-wide v2, v7

    :goto_2
    check-cast v0, Lm2/p;

    iget-wide v0, v0, Lm2/p;->a:J

    invoke-static {v9, v10, v0, v1}, Lm2/p;->d(JJ)J

    move-result-wide v0

    invoke-static {v2, v3, v0, v1}, Lm2/p;->d(JJ)J

    move-result-wide v0

    new-instance v2, Lm2/p;

    invoke-direct {v2, v0, v1}, Lm2/p;-><init>(J)V

    return-object v2
.end method
