.class public final Lw0/m;
.super Lw8/h;

# interfaces
.implements Lc9/e;


# instance fields
.field public b:[I

.field public c:I

.field public d:I

.field public e:I

.field public synthetic f:Ljava/lang/Object;

.field public final synthetic n:Lw0/n;


# direct methods
.method public constructor <init>(Lw0/n;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lw0/m;->n:Lw0/n;

    invoke-direct {p0, p2}, Lw8/h;-><init>(Lu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 2

    new-instance v0, Lw0/m;

    iget-object v1, p0, Lw0/m;->n:Lw0/n;

    invoke-direct {v0, v1, p2}, Lw0/m;-><init>(Lw0/n;Lu8/e;)V

    iput-object p1, v0, Lw0/m;->f:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lk9/j;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lw0/m;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lw0/m;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lw0/m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    sget-object v1, Lv8/a;->a:Lv8/a;

    iget v2, v0, Lw0/m;->e:I

    const/16 v3, 0x40

    const/4 v4, 0x0

    const-wide/16 v5, 0x1

    const/4 v7, 0x3

    const/4 v8, 0x2

    const-wide/16 v10, 0x0

    const/4 v12, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v12, :cond_2

    if-eq v2, v8, :cond_1

    if-ne v2, v7, :cond_0

    iget v2, v0, Lw0/m;->c:I

    iget-object v8, v0, Lw0/m;->f:Ljava/lang/Object;

    check-cast v8, Lk9/j;

    invoke-static/range {p1 .. p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    move v9, v2

    move v13, v7

    move-object v2, v0

    goto/16 :goto_6

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget v2, v0, Lw0/m;->c:I

    iget-object v13, v0, Lw0/m;->f:Ljava/lang/Object;

    check-cast v13, Lk9/j;

    invoke-static/range {p1 .. p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    move-object v9, v0

    move v7, v8

    goto/16 :goto_4

    :cond_2
    iget v2, v0, Lw0/m;->d:I

    iget v13, v0, Lw0/m;->c:I

    iget-object v14, v0, Lw0/m;->b:[I

    iget-object v15, v0, Lw0/m;->f:Ljava/lang/Object;

    check-cast v15, Lk9/j;

    invoke-static/range {p1 .. p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    move-object v9, v0

    goto :goto_1

    :cond_3
    invoke-static/range {p1 .. p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object v2, v0, Lw0/m;->f:Ljava/lang/Object;

    check-cast v2, Lk9/j;

    iget-object v13, v0, Lw0/m;->n:Lw0/n;

    iget-object v13, v13, Lw0/n;->d:[I

    if-eqz v13, :cond_6

    array-length v14, v13

    move-object v9, v0

    move-object v15, v2

    move v2, v14

    move-object v14, v13

    const/4 v13, 0x0

    :goto_0
    if-ge v13, v2, :cond_5

    aget v7, v14, v13

    new-instance v8, Ljava/lang/Integer;

    invoke-direct {v8, v7}, Ljava/lang/Integer;-><init>(I)V

    iput-object v15, v9, Lw0/m;->f:Ljava/lang/Object;

    iput-object v14, v9, Lw0/m;->b:[I

    iput v13, v9, Lw0/m;->c:I

    iput v2, v9, Lw0/m;->d:I

    iput v12, v9, Lw0/m;->e:I

    invoke-virtual {v15, v8, v9}, Lk9/j;->c(Ljava/lang/Object;Lu8/e;)V

    sget-object v7, Lv8/a;->a:Lv8/a;

    if-ne v7, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    add-int/2addr v13, v12

    const/4 v7, 0x3

    const/4 v8, 0x2

    goto :goto_0

    :cond_5
    move-object v2, v15

    goto :goto_2

    :cond_6
    move-object v9, v0

    :goto_2
    iget-object v7, v9, Lw0/m;->n:Lw0/n;

    iget-wide v7, v7, Lw0/n;->b:J

    cmp-long v7, v7, v10

    if-eqz v7, :cond_a

    move-object v13, v2

    const/4 v2, 0x0

    :goto_3
    if-ge v2, v3, :cond_9

    iget-object v7, v9, Lw0/m;->n:Lw0/n;

    iget-wide v14, v7, Lw0/n;->b:J

    shl-long v17, v5, v2

    and-long v14, v14, v17

    cmp-long v8, v14, v10

    if-eqz v8, :cond_7

    iget v7, v7, Lw0/n;->c:I

    add-int/2addr v7, v2

    new-instance v8, Ljava/lang/Integer;

    invoke-direct {v8, v7}, Ljava/lang/Integer;-><init>(I)V

    iput-object v13, v9, Lw0/m;->f:Ljava/lang/Object;

    iput-object v4, v9, Lw0/m;->b:[I

    iput v2, v9, Lw0/m;->c:I

    const/4 v7, 0x2

    iput v7, v9, Lw0/m;->e:I

    invoke-virtual {v13, v8, v9}, Lk9/j;->c(Ljava/lang/Object;Lu8/e;)V

    sget-object v8, Lv8/a;->a:Lv8/a;

    if-ne v8, v1, :cond_8

    return-object v1

    :cond_7
    const/4 v7, 0x2

    :cond_8
    :goto_4
    add-int/2addr v2, v12

    goto :goto_3

    :cond_9
    move-object v2, v13

    :cond_a
    iget-object v7, v9, Lw0/m;->n:Lw0/n;

    iget-wide v7, v7, Lw0/n;->a:J

    cmp-long v7, v7, v10

    if-eqz v7, :cond_d

    move-object v8, v2

    move-object v2, v9

    const/4 v9, 0x0

    :goto_5
    if-ge v9, v3, :cond_d

    iget-object v7, v2, Lw0/m;->n:Lw0/n;

    iget-wide v13, v7, Lw0/n;->a:J

    shl-long v15, v5, v9

    and-long/2addr v13, v15

    cmp-long v13, v13, v10

    if-eqz v13, :cond_b

    add-int/lit8 v13, v9, 0x40

    iget v7, v7, Lw0/n;->c:I

    add-int/2addr v13, v7

    new-instance v7, Ljava/lang/Integer;

    invoke-direct {v7, v13}, Ljava/lang/Integer;-><init>(I)V

    iput-object v8, v2, Lw0/m;->f:Ljava/lang/Object;

    iput-object v4, v2, Lw0/m;->b:[I

    iput v9, v2, Lw0/m;->c:I

    const/4 v13, 0x3

    iput v13, v2, Lw0/m;->e:I

    invoke-virtual {v8, v7, v2}, Lk9/j;->c(Ljava/lang/Object;Lu8/e;)V

    sget-object v7, Lv8/a;->a:Lv8/a;

    if-ne v7, v1, :cond_c

    return-object v1

    :cond_b
    const/4 v13, 0x3

    :cond_c
    :goto_6
    add-int/2addr v9, v12

    goto :goto_5

    :cond_d
    sget-object v1, Lq8/l;->a:Lq8/l;

    return-object v1
.end method
