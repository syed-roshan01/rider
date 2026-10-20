.class public final Lv/t2;
.super Lw8/h;

# interfaces
.implements Lc9/e;


# instance fields
.field public b:I

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lm9/d0;

.field public final synthetic e:Lc9/f;

.field public final synthetic f:Lc9/c;

.field public final synthetic n:Lv/l1;


# direct methods
.method public constructor <init>(Lm9/d0;Lc9/f;Lc9/c;Lv/l1;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lv/t2;->d:Lm9/d0;

    iput-object p2, p0, Lv/t2;->e:Lc9/f;

    iput-object p3, p0, Lv/t2;->f:Lc9/c;

    iput-object p4, p0, Lv/t2;->n:Lv/l1;

    invoke-direct {p0, p5}, Lw8/h;-><init>(Lu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 7

    new-instance v6, Lv/t2;

    iget-object v1, p0, Lv/t2;->d:Lm9/d0;

    iget-object v2, p0, Lv/t2;->e:Lc9/f;

    iget-object v3, p0, Lv/t2;->f:Lc9/c;

    iget-object v4, p0, Lv/t2;->n:Lv/l1;

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lv/t2;-><init>(Lm9/d0;Lc9/f;Lc9/c;Lv/l1;Lu8/e;)V

    iput-object p1, v6, Lv/t2;->c:Ljava/lang/Object;

    return-object v6
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo1/h0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lv/t2;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lv/t2;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lv/t2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lv/t2;->b:I

    const/4 v2, 0x0

    iget-object v3, p0, Lv/t2;->d:Lm9/d0;

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v6, 0x2

    const/4 v7, 0x1

    iget-object v8, p0, Lv/t2;->n:Lv/l1;

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
    iget-object v1, p0, Lv/t2;->c:Ljava/lang/Object;

    check-cast v1, Lo1/h0;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p1, p0, Lv/t2;->c:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lo1/h0;

    new-instance p1, Lv/p2;

    invoke-direct {p1, v8, v5}, Lv/p2;-><init>(Lv/l1;Lu8/e;)V

    invoke-static {v3, v5, v2, p1, v4}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    iput-object v1, p0, Lv/t2;->c:Ljava/lang/Object;

    iput v7, p0, Lv/t2;->b:I

    invoke-static {v1, p0, v4}, Lv/k3;->c(Lo1/h0;Lu8/e;I)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    check-cast p1, Lo1/u;

    invoke-virtual {p1}, Lo1/u;->a()V

    sget-object v7, Lv/k3;->a:Lv/p0;

    iget-object v9, p0, Lv/t2;->e:Lc9/f;

    if-eq v9, v7, :cond_4

    new-instance v7, Lv/q2;

    invoke-direct {v7, v9, v8, p1, v5}, Lv/q2;-><init>(Lc9/f;Lv/l1;Lo1/u;Lu8/e;)V

    invoke-static {v3, v5, v2, v7, v4}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    :cond_4
    iput-object v5, p0, Lv/t2;->c:Ljava/lang/Object;

    iput v6, p0, Lv/t2;->b:I

    sget-object p1, Lo1/l;->b:Lo1/l;

    invoke-static {v1, p1, p0}, Lv/k3;->d(Lo1/h0;Lo1/l;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_1
    check-cast p1, Lo1/u;

    if-nez p1, :cond_6

    new-instance p1, Lv/r2;

    invoke-direct {p1, v8, v5}, Lv/r2;-><init>(Lv/l1;Lu8/e;)V

    invoke-static {v3, v5, v2, p1, v4}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    goto :goto_2

    :cond_6
    invoke-virtual {p1}, Lo1/u;->a()V

    new-instance v0, Lv/s2;

    invoke-direct {v0, v8, v5}, Lv/s2;-><init>(Lv/l1;Lu8/e;)V

    invoke-static {v3, v5, v2, v0, v4}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    iget-object v0, p0, Lv/t2;->f:Lc9/c;

    if-eqz v0, :cond_7

    new-instance v1, Ld1/c;

    iget-wide v2, p1, Lo1/u;->c:J

    invoke-direct {v1, v2, v3}, Ld1/c;-><init>(J)V

    invoke-interface {v0, v1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    :goto_2
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
