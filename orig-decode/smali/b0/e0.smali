.class public final Lb0/e0;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lb0/h0;

.field public final synthetic d:I

.field public final synthetic e:La0/f;

.field public final synthetic f:I

.field public final synthetic n:Lt/n;


# direct methods
.method public constructor <init>(Lb0/h0;ILa0/f;ILt/n;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lb0/e0;->c:Lb0/h0;

    iput p2, p0, Lb0/e0;->d:I

    iput-object p3, p0, Lb0/e0;->e:La0/f;

    iput p4, p0, Lb0/e0;->f:I

    iput-object p5, p0, Lb0/e0;->n:Lt/n;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 8

    new-instance v7, Lb0/e0;

    iget-object v1, p0, Lb0/e0;->c:Lb0/h0;

    iget v2, p0, Lb0/e0;->d:I

    iget-object v3, p0, Lb0/e0;->e:La0/f;

    iget v4, p0, Lb0/e0;->f:I

    iget-object v5, p0, Lb0/e0;->n:Lt/n;

    move-object v0, v7

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lb0/e0;-><init>(Lb0/h0;ILa0/f;ILt/n;Lu8/e;)V

    iput-object p1, v7, Lb0/e0;->b:Ljava/lang/Object;

    return-object v7
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lv/r1;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lb0/e0;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lb0/e0;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lb0/e0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lb0/e0;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p1, p0, Lb0/e0;->b:Ljava/lang/Object;

    check-cast p1, Lv/r1;

    iget-object v1, p0, Lb0/e0;->c:Lb0/h0;

    iget v3, p0, Lb0/e0;->d:I

    invoke-virtual {v1, v3}, Lb0/h0;->i(I)I

    move-result v4

    iget-object v5, v1, Lb0/h0;->s:Lm0/l1;

    invoke-virtual {v5, v4}, Lm0/u2;->f(I)V

    iget-object v4, p0, Lb0/e0;->e:La0/f;

    check-cast v4, Lb0/s;

    iget-object v5, v4, Lb0/s;->a:Lb0/h0;

    iget v6, v5, Lb0/h0;->f:I

    const/4 v7, 0x0

    if-le v3, v6, :cond_2

    move v6, v2

    goto :goto_0

    :cond_2
    move v6, v7

    :goto_0
    invoke-virtual {v5}, Lb0/h0;->j()Lb0/q;

    move-result-object v5

    check-cast v5, Lb0/x;

    iget-object v5, v5, Lb0/x;->a:Ljava/util/List;

    invoke-static {v5}, Lr8/p;->L0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lb0/h;

    check-cast v5, Lb0/g;

    iget v5, v5, Lb0/g;->a:I

    iget-object v8, v4, Lb0/s;->a:Lb0/h0;

    iget v9, v8, Lb0/h0;->f:I

    sub-int/2addr v5, v9

    add-int/2addr v5, v2

    if-eqz v6, :cond_3

    invoke-virtual {v8}, Lb0/h0;->j()Lb0/q;

    move-result-object v8

    check-cast v8, Lb0/x;

    iget-object v8, v8, Lb0/x;->a:Ljava/util/List;

    invoke-static {v8}, Lr8/p;->L0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lb0/h;

    check-cast v8, Lb0/g;

    iget v8, v8, Lb0/g;->a:I

    if-gt v3, v8, :cond_4

    :cond_3
    if-nez v6, :cond_8

    iget-object v8, v4, Lb0/s;->a:Lb0/h0;

    iget v8, v8, Lb0/h0;->f:I

    if-ge v3, v8, :cond_8

    :cond_4
    iget-object v8, v4, Lb0/s;->a:Lb0/h0;

    iget v8, v8, Lb0/h0;->f:I

    sub-int v8, v3, v8

    invoke-static {v8}, Ljava/lang/Math;->abs(I)I

    move-result v8

    const/4 v9, 0x3

    if-lt v8, v9, :cond_8

    if-eqz v6, :cond_5

    sub-int v5, v3, v5

    iget-object v6, v4, Lb0/s;->a:Lb0/h0;

    iget v6, v6, Lb0/h0;->f:I

    if-ge v5, v6, :cond_6

    :goto_1
    move v5, v6

    goto :goto_2

    :cond_5
    add-int/2addr v5, v3

    iget-object v6, v4, Lb0/s;->a:Lb0/h0;

    iget v6, v6, Lb0/h0;->f:I

    if-le v5, v6, :cond_6

    goto :goto_1

    :cond_6
    :goto_2
    int-to-float v6, v7

    iget-object v7, v4, Lb0/s;->a:Lb0/h0;

    invoke-virtual {v7}, Lb0/h0;->m()I

    move-result v8

    int-to-float v8, v8

    div-float/2addr v6, v8

    iget-object v8, v7, Lb0/h0;->e:Lb0/a0;

    iget-object v9, v8, Lb0/a0;->b:Lm0/l1;

    invoke-virtual {v9, v5}, Lm0/u2;->f(I)V

    iget-object v9, v8, Lb0/a0;->f:La0/y;

    invoke-virtual {v9, v5}, La0/y;->b(I)V

    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v5

    const/4 v9, 0x0

    cmpg-float v5, v5, v9

    if-nez v5, :cond_7

    move v6, v9

    :cond_7
    iget-object v5, v8, Lb0/a0;->c:Lm0/k1;

    invoke-virtual {v5, v6}, Lm0/s2;->f(F)V

    const/4 v5, 0x0

    iput-object v5, v8, Lb0/a0;->e:Ljava/lang/Object;

    iget-object v5, v7, Lb0/h0;->x:Lm0/n1;

    invoke-virtual {v5}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lr1/a1;

    if-eqz v5, :cond_8

    check-cast v5, Landroidx/compose/ui/node/a;

    invoke-virtual {v5}, Landroidx/compose/ui/node/a;->j()V

    :cond_8
    iget-object v4, v4, Lb0/s;->a:Lb0/h0;

    invoke-virtual {v4}, Lb0/h0;->l()I

    move-result v5

    invoke-virtual {v4}, Lb0/h0;->n()I

    move-result v4

    add-int/2addr v4, v5

    iget-object v1, v1, Lb0/h0;->e:Lb0/a0;

    iget-object v5, v1, Lb0/a0;->b:Lm0/l1;

    invoke-virtual {v5}, Lm0/u2;->d()I

    move-result v5

    mul-int/2addr v3, v4

    mul-int/2addr v5, v4

    int-to-float v4, v4

    iget-object v1, v1, Lb0/a0;->c:Lm0/k1;

    invoke-virtual {v1}, Lm0/s2;->d()F

    move-result v1

    mul-float/2addr v1, v4

    sub-int/2addr v3, v5

    iget v4, p0, Lb0/e0;->f:I

    add-int/2addr v3, v4

    int-to-float v3, v3

    sub-float/2addr v3, v1

    new-instance v1, Ld9/r;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    new-instance v4, Lv/p1;

    invoke-direct {v4, v1, p1, v2}, Lv/p1;-><init>(Ld9/r;Lv/r1;I)V

    iput v2, p0, Lb0/e0;->a:I

    iget-object p1, p0, Lb0/e0;->n:Lt/n;

    invoke-static {v3, p1, v4, p0}, Lt/e;->d(FLt/n;Lv/p1;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_9

    return-object v0

    :cond_9
    :goto_3
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
