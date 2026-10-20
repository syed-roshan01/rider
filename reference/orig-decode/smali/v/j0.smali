.class public abstract Lv/j0;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lv/d0;

.field public static final b:Lv/d0;

.field public static final c:Lv/d0;

.field public static final d:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lv/d0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lv/d0;-><init>(I)V

    sput-object v0, Lv/j0;->a:Lv/d0;

    new-instance v0, Lv/d0;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lv/d0;-><init>(I)V

    sput-object v0, Lv/j0;->b:Lv/d0;

    new-instance v0, Lv/d0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lv/d0;-><init>(I)V

    sput-object v0, Lv/j0;->c:Lv/d0;

    const-wide/high16 v0, 0x3fc0000000000000L    # 0.125

    double-to-float v0, v0

    const/16 v1, 0x12

    int-to-float v1, v1

    div-float/2addr v0, v1

    sput v0, Lv/j0;->d:F

    return-void
.end method

.method public static final a(JLo1/h0;Lu8/e;)Ljava/lang/Object;
    .locals 12

    instance-of v0, p3, Lv/e0;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lv/e0;

    iget v1, v0, Lv/e0;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lv/e0;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lv/e0;

    invoke-direct {v0, p3}, Lw8/c;-><init>(Lu8/e;)V

    :goto_0
    iget-object p3, v0, Lv/e0;->c:Ljava/lang/Object;

    sget-object v1, Lv8/a;->a:Lv8/a;

    iget v2, v0, Lv/e0;->d:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lv/e0;->b:Ld9/t;

    iget-object p1, v0, Lv/e0;->a:Lo1/h0;

    invoke-static {p3}, Ld7/t;->v0(Ljava/lang/Object;)V

    move-object p2, p1

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p3}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p3, p2, Lo1/h0;->e:Lo1/j0;

    iget-object p3, p3, Lo1/j0;->w:Lo1/k;

    invoke-static {p3, p0, p1}, Lv/j0;->d(Lo1/k;J)Z

    move-result p3

    if-eqz p3, :cond_3

    return-object v4

    :cond_3
    new-instance p3, Ld9/t;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    iput-wide p0, p3, Ld9/t;->a:J

    move-object p0, p3

    :cond_4
    :goto_1
    iput-object p2, v0, Lv/e0;->a:Lo1/h0;

    iput-object p0, v0, Lv/e0;->b:Ld9/t;

    iput v3, v0, Lv/e0;->d:I

    sget-object p1, Lo1/l;->b:Lo1/l;

    invoke-virtual {p2, p1, v0}, Lo1/h0;->a(Lo1/l;Lw8/a;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    check-cast p3, Lo1/k;

    iget-object p1, p3, Lo1/k;->a:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v5, 0x0

    move v6, v5

    :goto_3
    if-ge v6, v2, :cond_7

    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lo1/u;

    iget-wide v8, v8, Lo1/u;->a:J

    iget-wide v10, p0, Ld9/t;->a:J

    invoke-static {v8, v9, v10, v11}, Lo1/t;->a(JJ)Z

    move-result v8

    if-eqz v8, :cond_6

    goto :goto_4

    :cond_6
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_7
    move-object v7, v4

    :goto_4
    check-cast v7, Lo1/u;

    if-nez v7, :cond_8

    move-object v7, v4

    goto :goto_7

    :cond_8
    invoke-static {v7}, Lm9/e0;->t(Lo1/u;)Z

    move-result p1

    if-eqz p1, :cond_c

    iget-object p1, p3, Lo1/k;->a:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p3

    :goto_5
    if-ge v5, p3, :cond_a

    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lo1/u;

    iget-boolean v6, v6, Lo1/u;->d:Z

    if-eqz v6, :cond_9

    goto :goto_6

    :cond_9
    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    :cond_a
    move-object v2, v4

    :goto_6
    check-cast v2, Lo1/u;

    if-nez v2, :cond_b

    goto :goto_7

    :cond_b
    iget-wide v5, v2, Lo1/u;->a:J

    iput-wide v5, p0, Ld9/t;->a:J

    goto :goto_1

    :cond_c
    invoke-static {v7, v3}, Lm9/e0;->I(Lo1/u;Z)J

    move-result-wide v5

    sget-wide v8, Ld1/c;->b:J

    invoke-static {v5, v6, v8, v9}, Ld1/c;->b(JJ)Z

    move-result p1

    xor-int/2addr p1, v3

    if-eqz p1, :cond_4

    :goto_7
    if-eqz v7, :cond_d

    invoke-virtual {v7}, Lo1/u;->b()Z

    move-result p0

    if-nez p0, :cond_d

    move-object v4, v7

    :cond_d
    return-object v4
.end method

.method public static final b(JLo1/h0;Lu8/e;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p3, Lv/f0;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lv/f0;

    iget v1, v0, Lv/f0;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lv/f0;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lv/f0;

    invoke-direct {v0, p3}, Lw8/c;-><init>(Lu8/e;)V

    :goto_0
    iget-object p3, v0, Lv/f0;->c:Ljava/lang/Object;

    sget-object v1, Lv8/a;->a:Lv8/a;

    iget v2, v0, Lv/f0;->d:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lv/f0;->b:Ld9/u;

    iget-object p1, v0, Lv/f0;->a:Lo1/u;

    :try_start_0
    invoke-static {p3}, Ld7/t;->v0(Ljava/lang/Object;)V
    :try_end_0
    .catch Lo1/m; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p3}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p3, p2, Lo1/h0;->e:Lo1/j0;

    iget-object p3, p3, Lo1/j0;->w:Lo1/k;

    invoke-static {p3, p0, p1}, Lv/j0;->d(Lo1/k;J)Z

    move-result p3

    if-eqz p3, :cond_3

    return-object v4

    :cond_3
    iget-object p3, p2, Lo1/h0;->e:Lo1/j0;

    iget-object p3, p3, Lo1/j0;->w:Lo1/k;

    iget-object p3, p3, Lo1/k;->a:Ljava/util/List;

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v2

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v2, :cond_5

    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lo1/u;

    iget-wide v7, v7, Lo1/u;->a:J

    invoke-static {v7, v8, p0, p1}, Lo1/t;->a(JJ)Z

    move-result v7

    if-eqz v7, :cond_4

    goto :goto_2

    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_5
    move-object v6, v4

    :goto_2
    move-object p1, v6

    check-cast p1, Lo1/u;

    if-nez p1, :cond_6

    return-object v4

    :cond_6
    new-instance p0, Ld9/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p3, Ld9/u;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    iput-object p1, p3, Ld9/u;->a:Ljava/lang/Object;

    invoke-virtual {p2}, Lo1/h0;->g()Lu1/y2;

    move-result-object v2

    invoke-interface {v2}, Lu1/y2;->d()J

    move-result-wide v5

    :try_start_1
    new-instance v2, Lv/g0;

    invoke-direct {v2, p3, p0, v4}, Lv/g0;-><init>(Ld9/u;Ld9/u;Lu8/e;)V

    iput-object p1, v0, Lv/f0;->a:Lo1/u;

    iput-object p0, v0, Lv/f0;->b:Ld9/u;

    iput v3, v0, Lv/f0;->d:I

    invoke-virtual {p2, v5, v6, v2, v0}, Lo1/h0;->h(JLc9/e;Lu8/e;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch Lo1/m; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p0, v1, :cond_8

    return-object v1

    :catch_0
    iget-object p0, p0, Ld9/u;->a:Ljava/lang/Object;

    check-cast p0, Lo1/u;

    if-nez p0, :cond_7

    move-object v4, p1

    goto :goto_3

    :cond_7
    move-object v4, p0

    :cond_8
    :goto_3
    return-object v4
.end method

.method public static final c(Lo1/h0;JLc9/c;Lu8/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p4, Lv/i0;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lv/i0;

    iget v1, v0, Lv/i0;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lv/i0;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lv/i0;

    invoke-direct {v0, p4}, Lw8/c;-><init>(Lu8/e;)V

    :goto_0
    iget-object p4, v0, Lv/i0;->c:Ljava/lang/Object;

    sget-object v1, Lv8/a;->a:Lv8/a;

    iget v2, v0, Lv/i0;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lv/i0;->b:Lc9/c;

    iget-object p1, v0, Lv/i0;->a:Lo1/h0;

    invoke-static {p4}, Ld7/t;->v0(Ljava/lang/Object;)V

    move-object p3, p0

    move-object p0, p1

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p4}, Ld7/t;->v0(Ljava/lang/Object;)V

    :goto_1
    iput-object p0, v0, Lv/i0;->a:Lo1/h0;

    iput-object p3, v0, Lv/i0;->b:Lc9/c;

    iput v3, v0, Lv/i0;->d:I

    invoke-static {p1, p2, p0, v0}, Lv/j0;->a(JLo1/h0;Lu8/e;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    :goto_2
    check-cast p4, Lo1/u;

    if-nez p4, :cond_4

    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0

    :cond_4
    invoke-static {p4}, Lm9/e0;->t(Lo1/u;)Z

    move-result p1

    if-eqz p1, :cond_5

    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p0

    :cond_5
    invoke-interface {p3, p4}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-wide p1, p4, Lo1/u;->a:J

    goto :goto_1
.end method

.method public static final d(Lo1/k;J)Z
    .locals 6

    iget-object p0, p0, Lo1/k;->a:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lo1/u;

    iget-wide v4, v4, Lo1/u;->a:J

    invoke-static {v4, v5, p1, p2}, Lo1/t;->a(JJ)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_1
    check-cast v3, Lo1/u;

    const/4 p0, 0x1

    if-eqz v3, :cond_2

    iget-boolean p1, v3, Lo1/u;->d:Z

    if-ne p1, p0, :cond_2

    move v1, p0

    :cond_2
    xor-int/2addr p0, v1

    return p0
.end method
