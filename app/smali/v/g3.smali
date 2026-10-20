.class public final Lv/g3;
.super Lw8/h;

# interfaces
.implements Lc9/e;


# instance fields
.field public b:I

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lm9/d0;

.field public final synthetic e:Lc9/c;

.field public final synthetic f:Lc9/c;

.field public final synthetic n:Ld9/u;

.field public final synthetic o:Lv/l1;


# direct methods
.method public constructor <init>(Lm9/d0;Lc9/c;Lc9/c;Ld9/u;Lv/l1;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lv/g3;->d:Lm9/d0;

    iput-object p2, p0, Lv/g3;->e:Lc9/c;

    iput-object p3, p0, Lv/g3;->f:Lc9/c;

    iput-object p4, p0, Lv/g3;->n:Ld9/u;

    iput-object p5, p0, Lv/g3;->o:Lv/l1;

    invoke-direct {p0, p6}, Lw8/h;-><init>(Lu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 8

    new-instance v7, Lv/g3;

    iget-object v1, p0, Lv/g3;->d:Lm9/d0;

    iget-object v2, p0, Lv/g3;->e:Lc9/c;

    iget-object v3, p0, Lv/g3;->f:Lc9/c;

    iget-object v4, p0, Lv/g3;->n:Ld9/u;

    iget-object v5, p0, Lv/g3;->o:Lv/l1;

    move-object v0, v7

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lv/g3;-><init>(Lm9/d0;Lc9/c;Lc9/c;Ld9/u;Lv/l1;Lu8/e;)V

    iput-object p1, v7, Lv/g3;->c:Ljava/lang/Object;

    return-object v7
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo1/h0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lv/g3;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lv/g3;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lv/g3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lv/g3;->b:I

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

    iget-object p1, p0, Lv/g3;->c:Ljava/lang/Object;

    check-cast p1, Lo1/h0;

    iput v2, p0, Lv/g3;->b:I

    sget-object v1, Lo1/l;->b:Lo1/l;

    invoke-static {p1, v1, p0}, Lv/k3;->d(Lo1/h0;Lo1/l;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lo1/u;

    sget-object v0, Lq8/l;->a:Lq8/l;

    const/4 v1, 0x0

    const/4 v2, 0x3

    iget-object v3, p0, Lv/g3;->d:Lm9/d0;

    const/4 v4, 0x0

    iget-object v5, p0, Lv/g3;->o:Lv/l1;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lo1/u;->a()V

    new-instance v6, Lv/e3;

    invoke-direct {v6, v5, v4}, Lv/e3;-><init>(Lv/l1;Lu8/e;)V

    invoke-static {v3, v4, v1, v6, v2}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    new-instance v1, Ld1/c;

    iget-wide v2, p1, Lo1/u;->c:J

    invoke-direct {v1, v2, v3}, Ld1/c;-><init>(J)V

    iget-object p1, p0, Lv/g3;->e:Lc9/c;

    invoke-interface {p1, v1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    new-instance p1, Lv/f3;

    invoke-direct {p1, v5, v4}, Lv/f3;-><init>(Lv/l1;Lu8/e;)V

    invoke-static {v3, v4, v1, p1, v2}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    iget-object p1, p0, Lv/g3;->f:Lc9/c;

    if-eqz p1, :cond_4

    iget-object v1, p0, Lv/g3;->n:Ld9/u;

    iget-object v1, v1, Ld9/u;->a:Ljava/lang/Object;

    check-cast v1, Lo1/u;

    iget-wide v1, v1, Lo1/u;->c:J

    new-instance v3, Ld1/c;

    invoke-direct {v3, v1, v2}, Ld1/c;-><init>(J)V

    invoke-interface {p1, v3}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_4
    move-object v0, v4

    :goto_1
    return-object v0
.end method
