.class public final Lb0/g0;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:I

.field public final synthetic b:Lb0/h0;

.field public final synthetic c:F

.field public final synthetic d:I


# direct methods
.method public constructor <init>(Lb0/h0;FILu8/e;)V
    .locals 0

    iput-object p1, p0, Lb0/g0;->b:Lb0/h0;

    iput p2, p0, Lb0/g0;->c:F

    iput p3, p0, Lb0/g0;->d:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 3

    new-instance p1, Lb0/g0;

    iget v0, p0, Lb0/g0;->c:F

    iget v1, p0, Lb0/g0;->d:I

    iget-object v2, p0, Lb0/g0;->b:Lb0/h0;

    invoke-direct {p1, v2, v0, v1, p2}, Lb0/g0;-><init>(Lb0/h0;FILu8/e;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lv/r1;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lb0/g0;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lb0/g0;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lb0/g0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lb0/g0;->a:I

    sget-object v2, Lq8/l;->a:Lq8/l;

    iget-object v3, p0, Lb0/g0;->b:Lb0/h0;

    const/4 v4, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v4, :cond_0

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iput v4, p0, Lb0/g0;->a:I

    iget-object p1, v3, Lb0/h0;->w:La0/b;

    invoke-virtual {p1, p0}, La0/b;->l(Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    goto :goto_0

    :cond_2
    move-object p1, v2

    :goto_0
    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_1
    iget p1, p0, Lb0/g0;->c:F

    float-to-double v0, p1

    const-wide/high16 v4, -0x4020000000000000L    # -0.5

    cmpg-double v4, v4, v0

    if-gtz v4, :cond_6

    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    cmpg-double v0, v0, v4

    if-gtz v0, :cond_6

    iget v0, p0, Lb0/g0;->d:I

    invoke-virtual {v3, v0}, Lb0/h0;->i(I)I

    move-result v0

    iget-object v1, v3, Lb0/h0;->e:Lb0/a0;

    iget-object v4, v1, Lb0/a0;->b:Lm0/l1;

    invoke-virtual {v4, v0}, Lm0/u2;->f(I)V

    iget-object v4, v1, Lb0/a0;->f:La0/y;

    invoke-virtual {v4, v0}, La0/y;->b(I)V

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/4 v4, 0x0

    cmpg-float v0, v0, v4

    if-nez v0, :cond_4

    move p1, v4

    :cond_4
    iget-object v0, v1, Lb0/a0;->c:Lm0/k1;

    invoke-virtual {v0, p1}, Lm0/s2;->f(F)V

    const/4 p1, 0x0

    iput-object p1, v1, Lb0/a0;->e:Ljava/lang/Object;

    iget-object p1, v3, Lb0/h0;->x:Lm0/n1;

    invoke-virtual {p1}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr1/a1;

    if-eqz p1, :cond_5

    check-cast p1, Landroidx/compose/ui/node/a;

    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->j()V

    :cond_5
    return-object v2

    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "pageOffsetFraction "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p1, " is not within the range -0.5 to 0.5"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
