.class public final Lu/g;
.super Lw8/h;

# interfaces
.implements Lc9/e;


# instance fields
.field public b:I

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lu/j;


# direct methods
.method public constructor <init>(Lu/j;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lu/g;->d:Lu/j;

    invoke-direct {p0, p2}, Lw8/h;-><init>(Lu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 2

    new-instance v0, Lu/g;

    iget-object v1, p0, Lu/g;->d:Lu/j;

    invoke-direct {v0, v1, p2}, Lu/g;-><init>(Lu/j;Lu8/e;)V

    iput-object p1, v0, Lu/g;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo1/h0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lu/g;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lu/g;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lu/g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    sget-object v1, Lv8/a;->a:Lv8/a;

    iget v2, v0, Lu/g;->b:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v2, v0, Lu/g;->c:Ljava/lang/Object;

    check-cast v2, Lo1/h0;

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
    iget-object v2, v0, Lu/g;->c:Ljava/lang/Object;

    check-cast v2, Lo1/h0;

    invoke-static/range {p1 .. p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    move-object/from16 v5, p1

    goto :goto_0

    :cond_2
    invoke-static/range {p1 .. p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object v2, v0, Lu/g;->c:Ljava/lang/Object;

    check-cast v2, Lo1/h0;

    iput-object v2, v0, Lu/g;->c:Ljava/lang/Object;

    iput v4, v0, Lu/g;->b:I

    invoke-static {v2, v0, v3}, Lv/k3;->c(Lo1/h0;Lu8/e;I)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_3

    return-object v1

    :cond_3
    :goto_0
    check-cast v5, Lo1/u;

    iget-wide v6, v5, Lo1/u;->a:J

    new-instance v8, Lo1/t;

    invoke-direct {v8, v6, v7}, Lo1/t;-><init>(J)V

    iget-object v6, v0, Lu/g;->d:Lu/j;

    iput-object v8, v6, Lu/j;->q:Lo1/t;

    new-instance v7, Ld1/c;

    iget-wide v8, v5, Lo1/u;->c:J

    invoke-direct {v7, v8, v9}, Ld1/c;-><init>(J)V

    iput-object v7, v6, Lu/j;->b:Ld1/c;

    move-object v5, v0

    :cond_4
    iput-object v2, v5, Lu/g;->c:Ljava/lang/Object;

    iput v3, v5, Lu/g;->b:I

    sget-object v6, Lo1/l;->b:Lo1/l;

    invoke-virtual {v2, v6, v5}, Lo1/h0;->a(Lo1/l;Lw8/a;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v1, :cond_5

    return-object v1

    :cond_5
    :goto_1
    check-cast v6, Lo1/k;

    iget-object v6, v6, Lo1/k;->a:Ljava/util/List;

    new-instance v7, Ljava/util/ArrayList;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v8

    const/4 v9, 0x0

    move v10, v9

    :goto_2
    if-ge v10, v8, :cond_7

    invoke-interface {v6, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, Lo1/u;

    iget-boolean v12, v12, Lo1/u;->d:Z

    if-eqz v12, :cond_6

    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    :cond_7
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v6

    :goto_3
    const/4 v8, 0x0

    iget-object v10, v5, Lu/g;->d:Lu/j;

    if-ge v9, v6, :cond_9

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, Lo1/u;

    iget-wide v12, v12, Lo1/u;->a:J

    iget-object v14, v10, Lu/j;->q:Lo1/t;

    instance-of v15, v14, Lo1/t;

    if-nez v15, :cond_8

    goto :goto_4

    :cond_8
    iget-wide v14, v14, Lo1/t;->a:J

    cmp-long v12, v12, v14

    if-eqz v12, :cond_a

    :goto_4
    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    :cond_9
    move-object v11, v8

    :cond_a
    check-cast v11, Lo1/u;

    if-nez v11, :cond_b

    invoke-static {v7}, Lr8/p;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    move-object v11, v6

    check-cast v11, Lo1/u;

    :cond_b
    if-eqz v11, :cond_c

    new-instance v6, Lo1/t;

    iget-wide v12, v11, Lo1/u;->a:J

    invoke-direct {v6, v12, v13}, Lo1/t;-><init>(J)V

    iput-object v6, v10, Lu/j;->q:Lo1/t;

    new-instance v6, Ld1/c;

    iget-wide v11, v11, Lo1/u;->c:J

    invoke-direct {v6, v11, v12}, Ld1/c;-><init>(J)V

    iput-object v6, v10, Lu/j;->b:Ld1/c;

    :cond_c
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    xor-int/2addr v6, v4

    if-nez v6, :cond_4

    iput-object v8, v10, Lu/j;->q:Lo1/t;

    sget-object v1, Lq8/l;->a:Lq8/l;

    return-object v1
.end method
