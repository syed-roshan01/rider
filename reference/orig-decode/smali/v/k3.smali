.class public abstract Lv/k3;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lv/p0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lv/p0;

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-direct {v0, v2, v1}, Lv/p0;-><init>(ILu8/e;)V

    sput-object v0, Lv/k3;->a:Lv/p0;

    return-void
.end method

.method public static final a(Lo1/h0;Lu8/e;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p1, Lv/o2;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lv/o2;

    iget v1, v0, Lv/o2;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lv/o2;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lv/o2;

    invoke-direct {v0, p1}, Lw8/c;-><init>(Lu8/e;)V

    :goto_0
    iget-object p1, v0, Lv/o2;->b:Ljava/lang/Object;

    sget-object v1, Lv8/a;->a:Lv8/a;

    iget v2, v0, Lv/o2;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lv/o2;->a:Lo1/h0;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    :goto_1
    iput-object p0, v0, Lv/o2;->a:Lo1/h0;

    iput v3, v0, Lv/o2;->c:I

    sget-object p1, Lo1/l;->b:Lo1/l;

    invoke-virtual {p0, p1, v0}, Lo1/h0;->a(Lo1/l;Lw8/a;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_5

    :cond_3
    :goto_2
    check-cast p1, Lo1/k;

    iget-object v2, p1, Lo1/k;->a:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x0

    move v6, v5

    :goto_3
    if-ge v6, v4, :cond_4

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lo1/u;

    invoke-virtual {v7}, Lo1/u;->a()V

    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_4
    iget-object p1, p1, Lo1/k;->a:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    :goto_4
    if-ge v5, v2, :cond_6

    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo1/u;

    iget-boolean v4, v4, Lo1/u;->d:Z

    if-eqz v4, :cond_5

    goto :goto_1

    :cond_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    :cond_6
    sget-object v1, Lq8/l;->a:Lq8/l;

    :goto_5
    return-object v1
.end method

.method public static final b(Lo1/h0;ZLo1/l;Lu8/e;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p3, Lv/m2;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lv/m2;

    iget v1, v0, Lv/m2;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lv/m2;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lv/m2;

    invoke-direct {v0, p3}, Lw8/c;-><init>(Lu8/e;)V

    :goto_0
    iget-object p3, v0, Lv/m2;->d:Ljava/lang/Object;

    sget-object v1, Lv8/a;->a:Lv8/a;

    iget v2, v0, Lv/m2;->e:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-boolean p0, v0, Lv/m2;->c:Z

    iget-object p1, v0, Lv/m2;->b:Lo1/l;

    iget-object p2, v0, Lv/m2;->a:Lo1/h0;

    invoke-static {p3}, Ld7/t;->v0(Ljava/lang/Object;)V

    move-object v9, p1

    move p1, p0

    move-object p0, p2

    move-object p2, v9

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p3}, Ld7/t;->v0(Ljava/lang/Object;)V

    :cond_3
    :goto_1
    iput-object p0, v0, Lv/m2;->a:Lo1/h0;

    iput-object p2, v0, Lv/m2;->b:Lo1/l;

    iput-boolean p1, v0, Lv/m2;->c:Z

    iput v3, v0, Lv/m2;->e:I

    invoke-virtual {p0, p2, v0}, Lo1/h0;->a(Lo1/l;Lw8/a;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    return-object v1

    :cond_4
    :goto_2
    check-cast p3, Lo1/k;

    iget-object v2, p3, Lo1/k;->a:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x0

    move v6, v5

    :goto_3
    if-ge v6, v4, :cond_7

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lo1/u;

    if-eqz p1, :cond_5

    invoke-virtual {v7}, Lo1/u;->b()Z

    move-result v8

    if-nez v8, :cond_3

    iget-boolean v8, v7, Lo1/u;->h:Z

    if-nez v8, :cond_3

    iget-boolean v7, v7, Lo1/u;->d:Z

    if-eqz v7, :cond_3

    goto :goto_4

    :cond_5
    invoke-static {v7}, Lm9/e0;->r(Lo1/u;)Z

    move-result v7

    if-nez v7, :cond_6

    goto :goto_1

    :cond_6
    :goto_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_7
    iget-object p0, p3, Lo1/k;->a:Ljava/util/List;

    invoke-interface {p0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lo1/h0;Lu8/e;I)Ljava/lang/Object;
    .locals 1

    and-int/lit8 v0, p2, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_1

    sget-object p2, Lo1/l;->b:Lo1/l;

    goto :goto_1

    :cond_1
    const/4 p2, 0x0

    :goto_1
    invoke-static {p0, v0, p2, p1}, Lv/k3;->b(Lo1/h0;ZLo1/l;Lu8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lo1/h0;Lo1/l;Lu8/e;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p2

    instance-of v1, v0, Lv/j3;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lv/j3;

    iget v2, v1, Lv/j3;->d:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lv/j3;->d:I

    goto :goto_0

    :cond_0
    new-instance v1, Lv/j3;

    invoke-direct {v1, v0}, Lw8/c;-><init>(Lu8/e;)V

    :goto_0
    iget-object v0, v1, Lv/j3;->c:Ljava/lang/Object;

    sget-object v2, Lv8/a;->a:Lv8/a;

    iget v3, v1, Lv/j3;->d:I

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x2

    if-eqz v3, :cond_4

    if-eq v3, v4, :cond_3

    if-ne v3, v6, :cond_2

    iget-object v3, v1, Lv/j3;->b:Lo1/l;

    iget-object v8, v1, Lv/j3;->a:Lo1/h0;

    invoke-static {v0}, Ld7/t;->v0(Ljava/lang/Object;)V

    :cond_1
    move-object v15, v2

    move-object v2, v1

    move-object v1, v3

    move-object v3, v15

    goto/16 :goto_6

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    iget-object v3, v1, Lv/j3;->b:Lo1/l;

    iget-object v8, v1, Lv/j3;->a:Lo1/h0;

    invoke-static {v0}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    invoke-static {v0}, Ld7/t;->v0(Ljava/lang/Object;)V

    move-object/from16 v0, p0

    move-object v3, v2

    move-object v2, v1

    move-object/from16 v1, p1

    :goto_1
    iput-object v0, v2, Lv/j3;->a:Lo1/h0;

    iput-object v1, v2, Lv/j3;->b:Lo1/l;

    iput v4, v2, Lv/j3;->d:I

    invoke-virtual {v0, v1, v2}, Lo1/h0;->a(Lo1/l;Lw8/a;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v3, :cond_5

    return-object v3

    :cond_5
    move-object v15, v8

    move-object v8, v0

    move-object v0, v15

    move-object/from16 v16, v3

    move-object v3, v1

    move-object v1, v2

    move-object/from16 v2, v16

    :goto_2
    check-cast v0, Lo1/k;

    iget-object v9, v0, Lo1/k;->a:Ljava/util/List;

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v10

    const/4 v11, 0x0

    :goto_3
    iget-object v12, v0, Lo1/k;->a:Ljava/util/List;

    if-ge v11, v10, :cond_c

    invoke-interface {v9, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lo1/u;

    invoke-static {v13}, Lm9/e0;->s(Lo1/u;)Z

    move-result v13

    if-nez v13, :cond_b

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v0

    const/4 v9, 0x0

    :goto_4
    if-ge v9, v0, :cond_8

    invoke-interface {v12, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lo1/u;

    invoke-virtual {v10}, Lo1/u;->b()Z

    move-result v11

    if-nez v11, :cond_7

    iget-object v11, v8, Lo1/h0;->e:Lo1/j0;

    iget-wide v13, v11, Lo1/j0;->A:J

    invoke-virtual {v8}, Lo1/h0;->f()J

    move-result-wide v6

    invoke-static {v10, v13, v14, v6, v7}, Lm9/e0;->E(Lo1/u;JJ)Z

    move-result v6

    if-eqz v6, :cond_6

    goto :goto_5

    :cond_6
    add-int/lit8 v9, v9, 0x1

    const/4 v6, 0x2

    goto :goto_4

    :cond_7
    :goto_5
    return-object v5

    :cond_8
    sget-object v0, Lo1/l;->c:Lo1/l;

    iput-object v8, v1, Lv/j3;->a:Lo1/h0;

    iput-object v3, v1, Lv/j3;->b:Lo1/l;

    const/4 v6, 0x2

    iput v6, v1, Lv/j3;->d:I

    invoke-virtual {v8, v0, v1}, Lo1/h0;->a(Lo1/l;Lw8/a;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_1

    return-object v2

    :goto_6
    check-cast v0, Lo1/k;

    iget-object v0, v0, Lo1/k;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v7

    const/4 v9, 0x0

    :goto_7
    if-ge v9, v7, :cond_a

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lo1/u;

    invoke-virtual {v10}, Lo1/u;->b()Z

    move-result v10

    if-eqz v10, :cond_9

    return-object v5

    :cond_9
    add-int/lit8 v9, v9, 0x1

    goto :goto_7

    :cond_a
    move-object v0, v8

    goto/16 :goto_1

    :cond_b
    add-int/lit8 v11, v11, 0x1

    goto :goto_3

    :cond_c
    const/4 v7, 0x0

    invoke-interface {v12, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
