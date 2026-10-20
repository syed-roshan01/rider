.class public final Lp9/w;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:I

.field public final synthetic b:Lp9/h0;

.field public final synthetic c:Lp9/f;

.field public final synthetic d:Lp9/x;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lp9/h0;Lp9/f;Lp9/x;Ljava/lang/Object;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lp9/w;->b:Lp9/h0;

    iput-object p2, p0, Lp9/w;->c:Lp9/f;

    iput-object p3, p0, Lp9/w;->d:Lp9/x;

    iput-object p4, p0, Lp9/w;->e:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 6

    new-instance p1, Lp9/w;

    iget-object v1, p0, Lp9/w;->b:Lp9/h0;

    iget-object v2, p0, Lp9/w;->c:Lp9/f;

    iget-object v3, p0, Lp9/w;->d:Lp9/x;

    iget-object v4, p0, Lp9/w;->e:Ljava/lang/Object;

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lp9/w;-><init>(Lp9/h0;Lp9/f;Lp9/x;Ljava/lang/Object;Lu8/e;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lp9/w;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lp9/w;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lp9/w;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    sget-object v1, Lv8/a;->a:Lv8/a;

    iget v2, v0, Lp9/w;->a:I

    sget-object v3, Lq8/l;->a:Lq8/l;

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x1

    iget-object v7, v0, Lp9/w;->c:Lp9/f;

    const/4 v8, 0x2

    iget-object v9, v0, Lp9/w;->d:Lp9/x;

    if-eqz v2, :cond_3

    if-eq v2, v6, :cond_2

    if-eq v2, v8, :cond_1

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    :goto_0
    invoke-static/range {p1 .. p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_3
    invoke-static/range {p1 .. p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    sget-object v2, Lp9/g0;->a:Lp9/i0;

    iget-object v10, v0, Lp9/w;->b:Lp9/h0;

    if-ne v10, v2, :cond_4

    iput v6, v0, Lp9/w;->a:I

    invoke-interface {v7, v9, v0}, Lp9/f;->collect(Lp9/g;Lu8/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_9

    return-object v1

    :cond_4
    sget-object v2, Lp9/g0;->b:Lp9/i0;

    const/4 v6, 0x0

    if-ne v10, v2, :cond_6

    move-object v2, v9

    check-cast v2, Lq9/b;

    invoke-virtual {v2}, Lq9/b;->h()Lq9/z;

    move-result-object v2

    new-instance v4, Lp9/u;

    invoke-direct {v4, v8, v6}, Lw8/i;-><init>(ILu8/e;)V

    iput v8, v0, Lp9/w;->a:I

    invoke-static {v2, v4, v0}, Lh6/g;->W(Lp9/f;Lc9/e;Lu8/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_5

    return-object v1

    :cond_5
    :goto_1
    iput v5, v0, Lp9/w;->a:I

    invoke-interface {v7, v9, v0}, Lp9/f;->collect(Lp9/g;Lu8/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_9

    return-object v1

    :cond_6
    move-object v2, v9

    check-cast v2, Lq9/b;

    invoke-virtual {v2}, Lq9/b;->h()Lq9/z;

    move-result-object v2

    invoke-interface {v10, v2}, Lp9/h0;->a(Lq9/z;)Lp9/f;

    move-result-object v2

    invoke-static {v2}, Lh6/g;->Q(Lp9/f;)Lp9/f;

    move-result-object v12

    new-instance v2, Lp9/v;

    iget-object v5, v0, Lp9/w;->e:Ljava/lang/Object;

    invoke-direct {v2, v7, v9, v5, v6}, Lp9/v;-><init>(Lp9/f;Lp9/x;Ljava/lang/Object;Lu8/e;)V

    iput v4, v0, Lp9/w;->a:I

    sget v4, Lp9/o;->a:I

    new-instance v11, Lp9/n;

    invoke-direct {v11, v2, v6}, Lp9/n;-><init>(Lc9/e;Lu8/e;)V

    new-instance v2, Lq9/o;

    sget-object v4, Lu8/k;->a:Lu8/k;

    const/4 v14, -0x2

    sget-object v5, Lo9/a;->a:Lo9/a;

    move-object v10, v2

    move-object v13, v4

    move-object v15, v5

    invoke-direct/range {v10 .. v15}, Lq9/o;-><init>(Lc9/f;Lp9/f;Lu8/j;ILo9/a;)V

    const/4 v6, 0x0

    invoke-interface {v2, v4, v6, v5}, Lq9/q;->b(Lu8/j;ILo9/a;)Lp9/f;

    move-result-object v2

    sget-object v4, Lq9/s;->a:Lq9/s;

    invoke-interface {v2, v4, v0}, Lp9/f;->collect(Lp9/g;Lu8/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_7

    goto :goto_2

    :cond_7
    move-object v2, v3

    :goto_2
    if-ne v2, v1, :cond_8

    goto :goto_3

    :cond_8
    move-object v2, v3

    :goto_3
    if-ne v2, v1, :cond_9

    return-object v1

    :cond_9
    :goto_4
    return-object v3
.end method
