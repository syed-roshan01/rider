.class public final Ln1/d;
.super Ljava/lang/Object;


# instance fields
.field public a:Ls1/f;

.field public b:Lc9/a;

.field public c:Lm9/d0;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lt/l0;

    const/16 v1, 0x15

    invoke-direct {v0, p0, v1}, Lt/l0;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Ln1/d;->b:Lc9/a;

    return-void
.end method


# virtual methods
.method public final a(JJLu8/e;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p5, Ln1/b;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, Ln1/b;

    iget v1, v0, Ln1/b;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ln1/b;->c:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Ln1/b;

    invoke-direct {v0, p0, p5}, Ln1/b;-><init>(Ln1/d;Lu8/e;)V

    goto :goto_0

    :goto_1
    iget-object p5, v6, Ln1/b;->a:Ljava/lang/Object;

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, v6, Ln1/b;->c:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p5}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p5}, Ld7/t;->v0(Ljava/lang/Object;)V

    invoke-virtual {p0}, Ln1/d;->c()Ln1/g;

    move-result-object v1

    if-eqz v1, :cond_4

    iput v2, v6, Ln1/b;->c:I

    move-wide v2, p1

    move-wide v4, p3

    invoke-virtual/range {v1 .. v6}, Ln1/g;->L(JJLu8/e;)Ljava/lang/Object;

    move-result-object p5

    if-ne p5, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p5, Lm2/p;

    iget-wide p1, p5, Lm2/p;->a:J

    goto :goto_3

    :cond_4
    sget-wide p1, Lm2/p;->b:J

    :goto_3
    new-instance p3, Lm2/p;

    invoke-direct {p3, p1, p2}, Lm2/p;-><init>(J)V

    return-object p3
.end method

.method public final b(JLu8/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p3, Ln1/c;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Ln1/c;

    iget v1, v0, Ln1/c;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ln1/c;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Ln1/c;

    invoke-direct {v0, p0, p3}, Ln1/c;-><init>(Ln1/d;Lu8/e;)V

    :goto_0
    iget-object p3, v0, Ln1/c;->a:Ljava/lang/Object;

    sget-object v1, Lv8/a;->a:Lv8/a;

    iget v2, v0, Ln1/c;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Ld7/t;->v0(Ljava/lang/Object;)V

    invoke-virtual {p0}, Ln1/d;->c()Ln1/g;

    move-result-object p3

    if-eqz p3, :cond_4

    iput v3, v0, Ln1/c;->c:I

    invoke-virtual {p3, p1, p2, v0}, Ln1/g;->B(JLu8/e;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p3, Lm2/p;

    iget-wide p1, p3, Lm2/p;->a:J

    goto :goto_2

    :cond_4
    sget-wide p1, Lm2/p;->b:J

    :goto_2
    new-instance p3, Lm2/p;

    invoke-direct {p3, p1, p2}, Lm2/p;-><init>(J)V

    return-object p3
.end method

.method public final c()Ln1/g;
    .locals 2

    iget-object v0, p0, Ln1/d;->a:Ls1/f;

    if-eqz v0, :cond_0

    sget-object v1, Ln1/i;->a:Ls1/i;

    invoke-interface {v0, v1}, Ls1/f;->g(Ls1/i;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln1/g;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
