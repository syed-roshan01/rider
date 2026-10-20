.class public final Lu/b0;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:Z

.field public b:I

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lv/l1;

.field public final synthetic e:J

.field public final synthetic f:Lx/m;

.field public final synthetic n:Lu/a;

.field public final synthetic o:Lc9/a;


# direct methods
.method public constructor <init>(Lv/l1;JLx/m;Lu/a;Lc9/a;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lu/b0;->d:Lv/l1;

    iput-wide p2, p0, Lu/b0;->e:J

    iput-object p4, p0, Lu/b0;->f:Lx/m;

    iput-object p5, p0, Lu/b0;->n:Lu/a;

    iput-object p6, p0, Lu/b0;->o:Lc9/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 9

    new-instance v8, Lu/b0;

    iget-object v1, p0, Lu/b0;->d:Lv/l1;

    iget-wide v2, p0, Lu/b0;->e:J

    iget-object v4, p0, Lu/b0;->f:Lx/m;

    iget-object v5, p0, Lu/b0;->n:Lu/a;

    iget-object v6, p0, Lu/b0;->o:Lc9/a;

    move-object v0, v8

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lu/b0;-><init>(Lv/l1;JLx/m;Lu/a;Lc9/a;Lu8/e;)V

    iput-object p1, v8, Lu/b0;->c:Ljava/lang/Object;

    return-object v8
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lu/b0;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lu/b0;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lu/b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    sget-object v1, Lv8/a;->a:Lv8/a;

    iget v2, v0, Lu/b0;->b:I

    sget-object v3, Lq8/l;->a:Lq8/l;

    const/4 v4, 0x3

    const/4 v5, 0x0

    iget-object v6, v0, Lu/b0;->n:Lu/a;

    const/4 v7, 0x5

    const/4 v8, 0x4

    const/4 v9, 0x2

    iget-object v10, v0, Lu/b0;->f:Lx/m;

    const/4 v11, 0x1

    if-eqz v2, :cond_5

    if-eq v2, v11, :cond_4

    if-eq v2, v9, :cond_3

    if-eq v2, v4, :cond_2

    if-eq v2, v8, :cond_1

    if-ne v2, v7, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    invoke-static/range {p1 .. p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_2
    iget-object v2, v0, Lu/b0;->c:Ljava/lang/Object;

    check-cast v2, Lx/p;

    invoke-static/range {p1 .. p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_3
    iget-boolean v2, v0, Lu/b0;->a:Z

    invoke-static/range {p1 .. p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_3

    :cond_4
    iget-object v2, v0, Lu/b0;->c:Ljava/lang/Object;

    check-cast v2, Lm9/f1;

    invoke-static/range {p1 .. p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    move-object/from16 v7, p1

    goto :goto_1

    :cond_5
    invoke-static/range {p1 .. p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object v2, v0, Lu/b0;->c:Ljava/lang/Object;

    check-cast v2, Lm9/d0;

    new-instance v14, Lu/a0;

    iget-object v13, v0, Lu/b0;->o:Lc9/a;

    iget-wide v7, v0, Lu/b0;->e:J

    iget-object v15, v0, Lu/b0;->f:Lx/m;

    iget-object v12, v0, Lu/b0;->n:Lu/a;

    const/16 v18, 0x0

    move-object/from16 v17, v12

    move-object v12, v14

    move-object v9, v14

    move-object/from16 v16, v15

    move-wide v14, v7

    invoke-direct/range {v12 .. v18}, Lu/a0;-><init>(Lc9/a;JLx/m;Lu/a;Lu8/e;)V

    const/4 v7, 0x0

    invoke-static {v2, v5, v7, v9, v4}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    move-result-object v2

    iput-object v2, v0, Lu/b0;->c:Ljava/lang/Object;

    iput v11, v0, Lu/b0;->b:I

    iget-object v7, v0, Lu/b0;->d:Lv/l1;

    invoke-virtual {v7, v0}, Lv/l1;->b(Lu8/e;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v1, :cond_6

    return-object v1

    :cond_6
    :goto_1
    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    invoke-interface {v2}, Lm9/f1;->b()Z

    move-result v8

    if-eqz v8, :cond_a

    iput-object v5, v0, Lu/b0;->c:Ljava/lang/Object;

    iput-boolean v7, v0, Lu/b0;->a:Z

    const/4 v8, 0x2

    iput v8, v0, Lu/b0;->b:I

    invoke-interface {v2, v5}, Lm9/f1;->a(Ljava/util/concurrent/CancellationException;)V

    check-cast v2, Lm9/p1;

    invoke-virtual {v2, v0}, Lm9/p1;->W(Lu8/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_7

    goto :goto_2

    :cond_7
    move-object v2, v3

    :goto_2
    if-ne v2, v1, :cond_8

    return-object v1

    :cond_8
    move v2, v7

    :goto_3
    if-eqz v2, :cond_c

    new-instance v2, Lx/o;

    iget-wide v7, v0, Lu/b0;->e:J

    invoke-direct {v2, v7, v8}, Lx/o;-><init>(J)V

    new-instance v7, Lx/p;

    invoke-direct {v7, v2}, Lx/p;-><init>(Lx/o;)V

    iput-object v7, v0, Lu/b0;->c:Ljava/lang/Object;

    iput v4, v0, Lu/b0;->b:I

    invoke-virtual {v10, v2, v0}, Lx/m;->a(Lx/k;Lu8/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_9

    return-object v1

    :cond_9
    move-object v2, v7

    :goto_4
    iput-object v5, v0, Lu/b0;->c:Ljava/lang/Object;

    const/4 v4, 0x4

    iput v4, v0, Lu/b0;->b:I

    invoke-virtual {v10, v2, v0}, Lx/m;->a(Lx/k;Lu8/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_c

    return-object v1

    :cond_a
    iget-object v2, v6, Lu/a;->b:Lx/o;

    if-eqz v2, :cond_c

    if-eqz v7, :cond_b

    new-instance v4, Lx/p;

    invoke-direct {v4, v2}, Lx/p;-><init>(Lx/o;)V

    goto :goto_5

    :cond_b
    new-instance v4, Lx/n;

    invoke-direct {v4, v2}, Lx/n;-><init>(Lx/o;)V

    :goto_5
    iput-object v5, v0, Lu/b0;->c:Ljava/lang/Object;

    const/4 v2, 0x5

    iput v2, v0, Lu/b0;->b:I

    invoke-virtual {v10, v4, v0}, Lx/m;->a(Lx/k;Lu8/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_c

    return-object v1

    :cond_c
    :goto_6
    iput-object v5, v6, Lu/a;->b:Lx/o;

    return-object v3
.end method
