.class public final Lt/b;
.super Lw8/i;

# interfaces
.implements Lc9/c;


# instance fields
.field public a:Lt/o;

.field public b:Ld9/q;

.field public c:I

.field public final synthetic d:Lt/d;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Lt/j;

.field public final synthetic n:J

.field public final synthetic o:Lc9/c;


# direct methods
.method public constructor <init>(Lt/d;Ljava/lang/Object;Lt/j;JLc9/c;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lt/b;->d:Lt/d;

    iput-object p2, p0, Lt/b;->e:Ljava/lang/Object;

    iput-object p3, p0, Lt/b;->f:Lt/j;

    iput-wide p4, p0, Lt/b;->n:J

    iput-object p6, p0, Lt/b;->o:Lc9/c;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p7}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Lu8/e;)Lu8/e;
    .locals 9

    new-instance v8, Lt/b;

    iget-object v1, p0, Lt/b;->d:Lt/d;

    iget-object v2, p0, Lt/b;->e:Ljava/lang/Object;

    iget-object v3, p0, Lt/b;->f:Lt/j;

    iget-wide v4, p0, Lt/b;->n:J

    iget-object v6, p0, Lt/b;->o:Lc9/c;

    move-object v0, v8

    move-object v7, p1

    invoke-direct/range {v0 .. v7}, Lt/b;-><init>(Lt/d;Ljava/lang/Object;Lt/j;JLc9/c;Lu8/e;)V

    return-object v8
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lu8/e;

    invoke-virtual {p0, p1}, Lt/b;->create(Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lt/b;

    sget-object v0, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, v0}, Lt/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    move-object/from16 v7, p0

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, v7, Lt/b;->c:I

    const/4 v8, 0x1

    iget-object v9, v7, Lt/b;->d:Lt/d;

    if-eqz v1, :cond_1

    if-ne v1, v8, :cond_0

    iget-object v0, v7, Lt/b;->b:Ld9/q;

    iget-object v1, v7, Lt/b;->a:Lt/o;

    :try_start_0
    invoke-static/range {p1 .. p1}, Ld7/t;->v0(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :catch_0
    move-exception v0

    goto/16 :goto_2

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    :try_start_1
    iget-object v1, v9, Lt/d;->c:Lt/o;

    iget-object v2, v9, Lt/d;->a:Lt/x1;

    iget-object v2, v2, Lt/x1;->a:Lc9/c;

    iget-object v3, v7, Lt/b;->e:Ljava/lang/Object;

    invoke-interface {v2, v3}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lt/t;

    iput-object v2, v1, Lt/o;->c:Lt/t;

    iget-object v1, v7, Lt/b;->f:Lt/j;

    invoke-interface {v1}, Lt/j;->e()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, v9, Lt/d;->e:Lm0/n1;

    invoke-virtual {v2, v1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    iget-object v1, v9, Lt/d;->d:Lm0/n1;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    iget-object v1, v9, Lt/d;->c:Lt/o;

    iget-object v2, v1, Lt/o;->b:Lm0/n1;

    invoke-virtual {v2}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v12

    iget-object v2, v1, Lt/o;->c:Lt/t;

    invoke-static {v2}, Lt/e;->j(Lt/t;)Lt/t;

    move-result-object v13

    iget-wide v14, v1, Lt/o;->d:J

    const-wide/high16 v16, -0x8000000000000000L

    iget-boolean v2, v1, Lt/o;->f:Z

    new-instance v6, Lt/o;

    iget-object v11, v1, Lt/o;->a:Lt/x1;

    move-object v10, v6

    move/from16 v18, v2

    invoke-direct/range {v10 .. v18}, Lt/o;-><init>(Lt/x1;Ljava/lang/Object;Lt/t;JJZ)V

    new-instance v10, Ld9/q;

    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    iget-object v2, v7, Lt/b;->f:Lt/j;

    iget-wide v3, v7, Lt/b;->n:J

    new-instance v5, Lt/a;

    iget-object v1, v7, Lt/b;->d:Lt/d;

    iget-object v11, v7, Lt/b;->o:Lc9/c;

    const/16 v23, 0x0

    move-object/from16 v18, v5

    move-object/from16 v19, v1

    move-object/from16 v20, v6

    move-object/from16 v21, v11

    move-object/from16 v22, v10

    invoke-direct/range {v18 .. v23}, Lt/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput-object v6, v7, Lt/b;->a:Lt/o;

    iput-object v10, v7, Lt/b;->b:Ld9/q;

    iput v8, v7, Lt/b;->c:I

    move-object v1, v6

    move-object v11, v6

    move-object/from16 v6, p0

    invoke-static/range {v1 .. v6}, Lt/e;->c(Lt/o;Lt/j;JLc9/c;Lu8/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2

    return-object v0

    :cond_2
    move-object v0, v10

    move-object v1, v11

    :goto_0
    iget-boolean v0, v0, Ld9/q;->a:Z

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    const/4 v8, 0x2

    :goto_1
    invoke-static {v9}, Lt/d;->a(Lt/d;)V

    new-instance v0, Lt/l;

    invoke-direct {v0, v1, v8}, Lt/l;-><init>(Lt/o;I)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    return-object v0

    :goto_2
    invoke-static {v9}, Lt/d;->a(Lt/d;)V

    throw v0
.end method
