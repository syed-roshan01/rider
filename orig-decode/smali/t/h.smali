.class public final Lt/h;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:Lo9/b;

.field public b:I

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lo9/g;

.field public final synthetic e:Lt/d;

.field public final synthetic f:Lm0/l3;

.field public final synthetic n:Lm0/l3;


# direct methods
.method public constructor <init>(Lo9/g;Lt/d;Lm0/l3;Lm0/l3;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lt/h;->d:Lo9/g;

    iput-object p2, p0, Lt/h;->e:Lt/d;

    iput-object p3, p0, Lt/h;->f:Lm0/l3;

    iput-object p4, p0, Lt/h;->n:Lm0/l3;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 7

    new-instance v6, Lt/h;

    iget-object v1, p0, Lt/h;->d:Lo9/g;

    iget-object v2, p0, Lt/h;->e:Lt/d;

    iget-object v3, p0, Lt/h;->f:Lm0/l3;

    iget-object v4, p0, Lt/h;->n:Lm0/l3;

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lt/h;-><init>(Lo9/g;Lt/d;Lm0/l3;Lm0/l3;Lu8/e;)V

    iput-object p1, v6, Lt/h;->c:Ljava/lang/Object;

    return-object v6
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lt/h;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lt/h;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lt/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    sget-object v1, Lv8/a;->a:Lv8/a;

    iget v2, v0, Lt/h;->b:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v2, v0, Lt/h;->a:Lo9/b;

    iget-object v4, v0, Lt/h;->c:Ljava/lang/Object;

    check-cast v4, Lm9/d0;

    invoke-static/range {p1 .. p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    move-object/from16 v6, p1

    move-object v5, v0

    goto :goto_1

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object v2, v0, Lt/h;->c:Ljava/lang/Object;

    check-cast v2, Lm9/d0;

    iget-object v4, v0, Lt/h;->d:Lo9/g;

    invoke-interface {v4}, Lo9/s;->iterator()Lo9/b;

    move-result-object v4

    move-object v5, v0

    move-object/from16 v16, v4

    move-object v4, v2

    move-object/from16 v2, v16

    :goto_0
    iput-object v4, v5, Lt/h;->c:Ljava/lang/Object;

    iput-object v2, v5, Lt/h;->a:Lo9/b;

    iput v3, v5, Lt/h;->b:I

    invoke-virtual {v2, v5}, Lo9/b;->b(Lw8/c;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v1, :cond_2

    return-object v1

    :cond_2
    :goto_1
    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-virtual {v2}, Lo9/b;->c()Ljava/lang/Object;

    move-result-object v6

    iget-object v7, v5, Lt/h;->d:Lo9/g;

    invoke-interface {v7}, Lo9/s;->m()Ljava/lang/Object;

    move-result-object v7

    instance-of v8, v7, Lo9/i;

    const/4 v9, 0x0

    if-nez v8, :cond_3

    goto :goto_2

    :cond_3
    move-object v7, v9

    :goto_2
    if-nez v7, :cond_4

    move-object v11, v6

    goto :goto_3

    :cond_4
    move-object v11, v7

    :goto_3
    new-instance v6, Lt/g;

    iget-object v12, v5, Lt/h;->e:Lt/d;

    iget-object v13, v5, Lt/h;->f:Lm0/l3;

    iget-object v14, v5, Lt/h;->n:Lm0/l3;

    const/4 v15, 0x0

    move-object v10, v6

    invoke-direct/range {v10 .. v15}, Lt/g;-><init>(Ljava/lang/Object;Lt/d;Lm0/l3;Lm0/l3;Lu8/e;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    invoke-static {v4, v9, v8, v6, v7}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    goto :goto_0

    :cond_5
    sget-object v1, Lq8/l;->a:Lq8/l;

    return-object v1
.end method
