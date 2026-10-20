.class public final Lv/l2;
.super Ljava/lang/Object;


# instance fields
.field public a:Lv/f2;

.field public b:Lv/h1;

.field public c:Lu/b2;

.field public d:Z

.field public e:Lv/y0;

.field public f:Ln1/d;

.field public final g:Lm0/n1;


# direct methods
.method public constructor <init>(Lv/f2;Lv/h1;Lu/b2;ZLv/y0;Ln1/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv/l2;->a:Lv/f2;

    iput-object p2, p0, Lv/l2;->b:Lv/h1;

    iput-object p3, p0, Lv/l2;->c:Lu/b2;

    iput-boolean p4, p0, Lv/l2;->d:Z

    iput-object p5, p0, Lv/l2;->e:Lv/y0;

    iput-object p6, p0, Lv/l2;->f:Ln1/d;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget-object p2, Lm0/o3;->a:Lm0/o3;

    invoke-static {p1, p2}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p1

    iput-object p1, p0, Lv/l2;->g:Lm0/n1;

    return-void
.end method


# virtual methods
.method public final a(Lv/r1;JI)J
    .locals 2

    new-instance v0, Lu/q2;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p4, p1, v1}, Lu/q2;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    iget-object p1, p0, Lv/l2;->c:Lu/b2;

    const/4 v1, 0x4

    if-ne p4, v1, :cond_0

    new-instance p1, Ld1/c;

    invoke-direct {p1, p2, p3}, Ld1/c;-><init>(J)V

    invoke-virtual {v0, p1}, Lu/q2;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld1/c;

    iget-wide p1, p1, Ld1/c;->a:J

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_2

    iget-object v1, p0, Lv/l2;->a:Lv/f2;

    invoke-interface {v1}, Lv/f2;->d()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lv/l2;->a:Lv/f2;

    invoke-interface {v1}, Lv/f2;->a()Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_1
    invoke-interface {p1, p2, p3, p4, v0}, Lu/b2;->a(JILu/q2;)J

    move-result-wide p1

    goto :goto_0

    :cond_2
    new-instance p1, Ld1/c;

    invoke-direct {p1, p2, p3}, Ld1/c;-><init>(J)V

    invoke-virtual {v0, p1}, Lu/q2;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld1/c;

    iget-wide p1, p1, Ld1/c;->a:J

    :goto_0
    return-wide p1
.end method

.method public final b(JLu8/e;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p3, Lv/g2;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lv/g2;

    iget v1, v0, Lv/g2;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lv/g2;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lv/g2;

    invoke-direct {v0, p0, p3}, Lv/g2;-><init>(Lv/l2;Lu8/e;)V

    :goto_0
    iget-object p3, v0, Lv/g2;->b:Ljava/lang/Object;

    sget-object v1, Lv8/a;->a:Lv8/a;

    iget v2, v0, Lv/g2;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lv/g2;->a:Ld9/t;

    invoke-static {p3}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Ld7/t;->v0(Ljava/lang/Object;)V

    new-instance p3, Ld9/t;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p3, Ld9/t;->a:J

    iget-object v2, p0, Lv/l2;->a:Lv/f2;

    new-instance v10, Lv/i2;

    const/4 v9, 0x0

    move-object v4, v10

    move-object v5, p0

    move-object v6, p3

    move-wide v7, p1

    invoke-direct/range {v4 .. v9}, Lv/i2;-><init>(Lv/l2;Ld9/t;JLu8/e;)V

    iput-object p3, v0, Lv/g2;->a:Ld9/t;

    iput v3, v0, Lv/g2;->d:I

    sget-object p1, Lu/s1;->a:Lu/s1;

    invoke-interface {v2, p1, v10, v0}, Lv/f2;->c(Lu/s1;Lc9/e;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p3

    :goto_1
    iget-wide p1, p1, Ld9/t;->a:J

    new-instance p3, Lm2/p;

    invoke-direct {p3, p1, p2}, Lm2/p;-><init>(J)V

    return-object p3
.end method

.method public final c(JLu8/e;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p3, Lv/j2;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lv/j2;

    iget v1, v0, Lv/j2;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lv/j2;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lv/j2;

    invoke-direct {v0, p0, p3}, Lv/j2;-><init>(Lv/l2;Lu8/e;)V

    :goto_0
    iget-object p3, v0, Lv/j2;->b:Ljava/lang/Object;

    sget-object v1, Lv8/a;->a:Lv8/a;

    iget v2, v0, Lv/j2;->d:I

    const/4 v3, 0x1

    const/4 v4, 0x2

    if-eqz v2, :cond_3

    if-eq v2, v3, :cond_2

    if-ne v2, v4, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_1
    iget-object p1, v0, Lv/j2;->a:Lv/l2;

    invoke-static {p3}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    invoke-static {p3}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p3, p0, Lv/l2;->g:Lm0/n1;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p3, v2}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    iget-object p3, p0, Lv/l2;->b:Lv/h1;

    sget-object v2, Lv/h1;->b:Lv/h1;

    const/4 v5, 0x0

    if-ne p3, v2, :cond_4

    invoke-static {p1, p2, v5, v5, v3}, Lm2/p;->a(JFFI)J

    move-result-wide p1

    goto :goto_2

    :cond_4
    invoke-static {p1, p2, v5, v5, v4}, Lm2/p;->a(JFFI)J

    move-result-wide p1

    :goto_2
    new-instance p3, Lv/k2;

    const/4 v2, 0x0

    invoke-direct {p3, p0, v2}, Lv/k2;-><init>(Lv/l2;Lu8/e;)V

    iget-object v2, p0, Lv/l2;->c:Lu/b2;

    if-eqz v2, :cond_7

    iget-object v5, p0, Lv/l2;->a:Lv/f2;

    invoke-interface {v5}, Lv/f2;->d()Z

    move-result v5

    if-nez v5, :cond_5

    iget-object v5, p0, Lv/l2;->a:Lv/f2;

    invoke-interface {v5}, Lv/f2;->a()Z

    move-result v5

    if-eqz v5, :cond_7

    :cond_5
    iput-object p0, v0, Lv/j2;->a:Lv/l2;

    iput v3, v0, Lv/j2;->d:I

    invoke-interface {v2, p1, p2, p3, v0}, Lu/b2;->d(JLv/k2;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    return-object v1

    :cond_6
    move-object p1, p0

    goto :goto_3

    :cond_7
    new-instance v2, Lm2/p;

    invoke-direct {v2, p1, p2}, Lm2/p;-><init>(J)V

    iput-object p0, v0, Lv/j2;->a:Lv/l2;

    iput v4, v0, Lv/j2;->d:I

    invoke-virtual {p3, v2, v0}, Lv/k2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    return-object v1

    :goto_3
    iget-object p1, p1, Lv/l2;->g:Lm0/n1;

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, p2}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method

.method public final d(F)J
    .locals 3

    const/4 v0, 0x0

    cmpg-float v1, p1, v0

    if-nez v1, :cond_0

    sget p1, Ld1/c;->e:I

    sget-wide v0, Ld1/c;->b:J

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lv/l2;->b:Lv/h1;

    sget-object v2, Lv/h1;->b:Lv/h1;

    if-ne v1, v2, :cond_1

    invoke-static {p1, v0}, Ld9/i;->f(FF)J

    move-result-wide v0

    goto :goto_0

    :cond_1
    invoke-static {v0, p1}, Ld9/i;->f(FF)J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method
