.class public final Lu/d;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lu/e;


# direct methods
.method public constructor <init>(Lu/e;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lu/d;->c:Lu/e;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 2

    new-instance v0, Lu/d;

    iget-object v1, p0, Lu/d;->c:Lu/e;

    invoke-direct {v0, v1, p2}, Lu/d;-><init>(Lu/e;Lu8/e;)V

    iput-object p1, v0, Lu/d;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo1/z;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lu/d;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lu/d;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lu/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lu/d;->a:I

    sget-object v2, Lq8/l;->a:Lq8/l;

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p1, p0, Lu/d;->b:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lo1/z;

    iput v3, p0, Lu/d;->a:I

    iget-object p1, p0, Lu/d;->c:Lu/e;

    check-cast p1, Lu/e0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v1, v5

    check-cast v1, Lo1/j0;

    iget-wide v3, v1, Lo1/j0;->A:J

    const/16 v1, 0x20

    shr-long v6, v3, v1

    long-to-int v6, v6

    div-int/lit8 v6, v6, 0x2

    const-wide v7, 0xffffffffL

    and-long/2addr v3, v7

    long-to-int v3, v3

    div-int/lit8 v3, v3, 0x2

    invoke-static {v6, v3}, Li1/b;->c(II)J

    move-result-wide v3

    sget v6, Lm2/i;->c:I

    shr-long v9, v3, v1

    long-to-int v1, v9

    int-to-float v1, v1

    and-long/2addr v3, v7

    long-to-int v3, v3

    int-to-float v3, v3

    invoke-static {v1, v3}, Ld9/i;->f(FF)J

    move-result-wide v3

    iget-object v1, p1, Lu/e;->z:Lu/a;

    iput-wide v3, v1, Lu/a;->c:J

    new-instance v6, Lu/d0;

    const/4 v1, 0x0

    invoke-direct {v6, p1, v1}, Lu/d0;-><init>(Lu/e0;Lu8/e;)V

    new-instance v7, Lq/w;

    const/4 v1, 0x6

    invoke-direct {v7, p1, v1}, Lq/w;-><init>(Ljava/lang/Object;I)V

    sget-object p1, Lv/k3;->a:Lv/p0;

    new-instance v8, Lv/l1;

    invoke-direct {v8, v5}, Lv/l1;-><init>(Lm2/b;)V

    new-instance p1, Lv/u2;

    const/4 v9, 0x0

    move-object v4, p1

    invoke-direct/range {v4 .. v9}, Lv/u2;-><init>(Lo1/z;Lc9/f;Lc9/c;Lv/l1;Lu8/e;)V

    invoke-static {p1, p0}, Ld7/a;->q(Lc9/e;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    goto :goto_0

    :cond_2
    move-object p1, v2

    :goto_0
    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    move-object p1, v2

    :goto_1
    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_2
    return-object v2
.end method
