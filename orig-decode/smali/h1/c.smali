.class public abstract Lh1/c;
.super Ljava/lang/Object;


# instance fields
.field public a:Le1/g;

.field public b:Z

.field public c:Le1/l;

.field public d:F

.field public e:Lm2/l;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lh1/c;->d:F

    sget-object v0, Lm2/l;->a:Lm2/l;

    iput-object v0, p0, Lh1/c;->e:Lm2/l;

    return-void
.end method


# virtual methods
.method public abstract c(F)Z
.end method

.method public abstract e(Le1/l;)Z
.end method

.method public f(Lm2/l;)V
    .locals 0

    return-void
.end method

.method public final g(Lg1/g;JFLe1/l;)V
    .locals 3

    iget v0, p0, Lh1/c;->d:F

    cmpg-float v0, v0, p4

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {p0, p4}, Lh1/c;->c(F)Z

    move-result v0

    if-nez v0, :cond_4

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, p4, v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lh1/c;->a:Le1/g;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0, p4}, Le1/g;->c(F)V

    :goto_0
    iput-boolean v2, p0, Lh1/c;->b:Z

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lh1/c;->a:Le1/g;

    if-nez v0, :cond_3

    invoke-static {}, Landroidx/compose/ui/graphics/a;->f()Le1/g;

    move-result-object v0

    iput-object v0, p0, Lh1/c;->a:Le1/g;

    :cond_3
    invoke-virtual {v0, p4}, Le1/g;->c(F)V

    iput-boolean v1, p0, Lh1/c;->b:Z

    :cond_4
    :goto_1
    iput p4, p0, Lh1/c;->d:F

    :goto_2
    iget-object v0, p0, Lh1/c;->c:Le1/l;

    invoke-static {v0, p5}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    invoke-virtual {p0, p5}, Lh1/c;->e(Le1/l;)Z

    move-result v0

    if-nez v0, :cond_8

    if-nez p5, :cond_6

    iget-object v0, p0, Lh1/c;->a:Le1/g;

    if-nez v0, :cond_5

    goto :goto_3

    :cond_5
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Le1/g;->f(Le1/l;)V

    :goto_3
    iput-boolean v2, p0, Lh1/c;->b:Z

    goto :goto_4

    :cond_6
    iget-object v0, p0, Lh1/c;->a:Le1/g;

    if-nez v0, :cond_7

    invoke-static {}, Landroidx/compose/ui/graphics/a;->f()Le1/g;

    move-result-object v0

    iput-object v0, p0, Lh1/c;->a:Le1/g;

    :cond_7
    invoke-virtual {v0, p5}, Le1/g;->f(Le1/l;)V

    iput-boolean v1, p0, Lh1/c;->b:Z

    :cond_8
    :goto_4
    iput-object p5, p0, Lh1/c;->c:Le1/l;

    :cond_9
    invoke-interface {p1}, Lg1/g;->getLayoutDirection()Lm2/l;

    move-result-object p5

    iget-object v0, p0, Lh1/c;->e:Lm2/l;

    if-eq v0, p5, :cond_a

    invoke-virtual {p0, p5}, Lh1/c;->f(Lm2/l;)V

    iput-object p5, p0, Lh1/c;->e:Lm2/l;

    :cond_a
    invoke-interface {p1}, Lg1/g;->e()J

    move-result-wide v0

    invoke-static {v0, v1}, Ld1/f;->d(J)F

    move-result p5

    invoke-static {p2, p3}, Ld1/f;->d(J)F

    move-result v0

    sub-float/2addr p5, v0

    invoke-interface {p1}, Lg1/g;->e()J

    move-result-wide v0

    invoke-static {v0, v1}, Ld1/f;->b(J)F

    move-result v0

    invoke-static {p2, p3}, Ld1/f;->b(J)F

    move-result v1

    sub-float/2addr v0, v1

    invoke-interface {p1}, Lg1/g;->A()Lg1/b;

    move-result-object v1

    iget-object v1, v1, Lg1/b;->a:Lg1/d;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v2, p5, v0}, Lg1/d;->a(FFFF)V

    cmpl-float p4, p4, v2

    if-lez p4, :cond_d

    invoke-static {p2, p3}, Ld1/f;->d(J)F

    move-result p4

    cmpl-float p4, p4, v2

    if-lez p4, :cond_d

    invoke-static {p2, p3}, Ld1/f;->b(J)F

    move-result p4

    cmpl-float p4, p4, v2

    if-lez p4, :cond_d

    iget-boolean p4, p0, Lh1/c;->b:Z

    if-eqz p4, :cond_c

    sget-wide v1, Ld1/c;->b:J

    invoke-static {p2, p3}, Ld1/f;->d(J)F

    move-result p4

    invoke-static {p2, p3}, Ld1/f;->b(J)F

    move-result p2

    invoke-static {p4, p2}, Ld7/t;->j(FF)J

    move-result-wide p2

    invoke-static {v1, v2, p2, p3}, Lm9/e0;->h(JJ)Ld1/d;

    move-result-object p2

    invoke-interface {p1}, Lg1/g;->A()Lg1/b;

    move-result-object p3

    invoke-virtual {p3}, Lg1/b;->a()Le1/p;

    move-result-object p3

    iget-object p4, p0, Lh1/c;->a:Le1/g;

    if-nez p4, :cond_b

    invoke-static {}, Landroidx/compose/ui/graphics/a;->f()Le1/g;

    move-result-object p4

    iput-object p4, p0, Lh1/c;->a:Le1/g;

    :cond_b
    :try_start_0
    invoke-interface {p3, p2, p4}, Le1/p;->i(Ld1/d;Le1/g;)V

    invoke-virtual {p0, p1}, Lh1/c;->i(Lg1/g;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p3}, Le1/p;->h()V

    goto :goto_5

    :catchall_0
    move-exception p1

    invoke-interface {p3}, Le1/p;->h()V

    throw p1

    :cond_c
    invoke-virtual {p0, p1}, Lh1/c;->i(Lg1/g;)V

    :cond_d
    :goto_5
    invoke-interface {p1}, Lg1/g;->A()Lg1/b;

    move-result-object p1

    iget-object p1, p1, Lg1/b;->a:Lg1/d;

    neg-float p2, p5

    neg-float p3, v0

    const/high16 p4, -0x80000000

    invoke-virtual {p1, p4, p4, p2, p3}, Lg1/d;->a(FFFF)V

    return-void
.end method

.method public abstract h()J
.end method

.method public abstract i(Lg1/g;)V
.end method
