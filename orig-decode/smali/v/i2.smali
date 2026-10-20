.class public final Lv/i2;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:Lv/l2;

.field public b:Ld9/t;

.field public c:J

.field public d:I

.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:Lv/l2;

.field public final synthetic n:Ld9/t;

.field public final synthetic o:J


# direct methods
.method public constructor <init>(Lv/l2;Ld9/t;JLu8/e;)V
    .locals 0

    iput-object p1, p0, Lv/i2;->f:Lv/l2;

    iput-object p2, p0, Lv/i2;->n:Ld9/t;

    iput-wide p3, p0, Lv/i2;->o:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 7

    new-instance v6, Lv/i2;

    iget-object v1, p0, Lv/i2;->f:Lv/l2;

    iget-object v2, p0, Lv/i2;->n:Ld9/t;

    iget-wide v3, p0, Lv/i2;->o:J

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lv/i2;-><init>(Lv/l2;Ld9/t;JLu8/e;)V

    iput-object p1, v6, Lv/i2;->e:Ljava/lang/Object;

    return-object v6
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lv/r1;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lv/i2;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lv/i2;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lv/i2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lv/i2;->d:I

    sget-object v2, Lv/h1;->b:Lv/h1;

    const/4 v3, -0x1

    const/4 v4, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v4, :cond_0

    iget-wide v0, p0, Lv/i2;->c:J

    iget-object v5, p0, Lv/i2;->b:Ld9/t;

    iget-object v6, p0, Lv/i2;->a:Lv/l2;

    iget-object v7, p0, Lv/i2;->e:Ljava/lang/Object;

    check-cast v7, Lv/l2;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p1, p0, Lv/i2;->e:Ljava/lang/Object;

    check-cast p1, Lv/r1;

    new-instance v1, Lu/s;

    const/4 v5, 0x4

    iget-object v6, p0, Lv/i2;->f:Lv/l2;

    invoke-direct {v1, v5, v6, p1}, Lu/s;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance p1, Lv/h2;

    invoke-direct {p1, v6, v1}, Lv/h2;-><init>(Lv/l2;Lu/s;)V

    iget-object v1, v6, Lv/l2;->e:Lv/y0;

    iget-object v5, p0, Lv/i2;->n:Ld9/t;

    iget-wide v7, v5, Ld9/t;->a:J

    iget-object v9, v6, Lv/l2;->b:Lv/h1;

    iget-wide v10, p0, Lv/i2;->o:J

    if-ne v9, v2, :cond_2

    invoke-static {v10, v11}, Lm2/p;->b(J)F

    move-result v9

    goto :goto_0

    :cond_2
    invoke-static {v10, v11}, Lm2/p;->c(J)F

    move-result v9

    :goto_0
    iget-boolean v10, v6, Lv/l2;->d:Z

    if-eqz v10, :cond_3

    int-to-float v10, v3

    mul-float/2addr v9, v10

    :cond_3
    iput-object v6, p0, Lv/i2;->e:Ljava/lang/Object;

    iput-object v6, p0, Lv/i2;->a:Lv/l2;

    iput-object v5, p0, Lv/i2;->b:Ld9/t;

    iput-wide v7, p0, Lv/i2;->c:J

    iput v4, p0, Lv/i2;->d:I

    invoke-interface {v1, p1, v9, p0}, Lv/y0;->a(Lv/h2;FLu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    move-wide v0, v7

    move-object v7, v6

    :goto_1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    iget-boolean v7, v7, Lv/l2;->d:Z

    if-eqz v7, :cond_5

    int-to-float v3, v3

    mul-float/2addr p1, v3

    :cond_5
    iget-object v3, v6, Lv/l2;->b:Lv/h1;

    const/4 v6, 0x0

    if-ne v3, v2, :cond_6

    const/4 v2, 0x2

    invoke-static {v0, v1, p1, v6, v2}, Lm2/p;->a(JFFI)J

    move-result-wide v0

    goto :goto_2

    :cond_6
    invoke-static {v0, v1, v6, p1, v4}, Lm2/p;->a(JFFI)J

    move-result-wide v0

    :goto_2
    iput-wide v0, v5, Ld9/t;->a:J

    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
