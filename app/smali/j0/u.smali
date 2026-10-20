.class public abstract Lj0/u;
.super Ljava/lang/Object;

# interfaces
.implements Lu/j1;


# instance fields
.field public final a:Lj0/b0;


# direct methods
.method public constructor <init>(ZLm0/g1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lj0/b0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, v0, Lj0/b0;->a:Z

    iput-object p2, v0, Lj0/b0;->b:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-static {p1}, Lt/e;->a(F)Lt/d;

    move-result-object p1

    iput-object p1, v0, Lj0/b0;->c:Ljava/lang/Object;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, v0, Lj0/b0;->d:Ljava/lang/Object;

    iput-object v0, p0, Lj0/u;->a:Lj0/b0;

    return-void
.end method


# virtual methods
.method public abstract e(Lx/o;Lm9/d0;)V
.end method

.method public final f(Lg1/g;FJ)V
    .locals 11

    iget-object v0, p0, Lj0/u;->a:Lj0/b0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean p2, v0, Lj0/b0;->a:Z

    invoke-interface {p1}, Lg1/g;->e()J

    move-result-wide v1

    invoke-static {p1, p2, v1, v2}, Lj0/q;->a(Lm2/b;ZJ)F

    move-result p2

    :goto_0
    move v4, p2

    goto :goto_1

    :cond_0
    invoke-interface {p1, p2}, Lm2/b;->v(F)F

    move-result p2

    goto :goto_0

    :goto_1
    iget-object p2, v0, Lj0/b0;->c:Ljava/lang/Object;

    check-cast p2, Lt/d;

    invoke-virtual {p2}, Lt/d;->d()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result p2

    const/4 v1, 0x0

    cmpl-float v1, p2, v1

    if-lez v1, :cond_2

    invoke-static {p3, p4, p2}, Le1/r;->b(JF)J

    move-result-wide v2

    iget-boolean p2, v0, Lj0/b0;->a:Z

    if-eqz p2, :cond_1

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-interface {p1}, Lg1/g;->e()J

    move-result-wide p2

    invoke-static {p2, p3}, Ld1/f;->d(J)F

    move-result v8

    invoke-interface {p1}, Lg1/g;->e()J

    move-result-wide p2

    invoke-static {p2, p3}, Ld1/f;->b(J)F

    move-result v9

    const/4 v10, 0x1

    invoke-interface {p1}, Lg1/g;->A()Lg1/b;

    move-result-object p2

    invoke-virtual {p2}, Lg1/b;->b()J

    move-result-wide p3

    invoke-virtual {p2}, Lg1/b;->a()Le1/p;

    move-result-object v0

    invoke-interface {v0}, Le1/p;->j()V

    iget-object v0, p2, Lg1/b;->a:Lg1/d;

    iget-object v0, v0, Lg1/d;->a:Lg1/b;

    invoke-virtual {v0}, Lg1/b;->a()Le1/p;

    move-result-object v5

    invoke-interface/range {v5 .. v10}, Le1/p;->d(FFFFI)V

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x7c

    move-object v1, p1

    invoke-static/range {v1 .. v8}, Lg1/g;->K(Lg1/g;JFJLg1/h;I)V

    invoke-virtual {p2}, Lg1/b;->a()Le1/p;

    move-result-object p1

    invoke-interface {p1}, Le1/p;->h()V

    invoke-virtual {p2, p3, p4}, Lg1/b;->c(J)V

    goto :goto_2

    :cond_1
    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x7c

    move-object v1, p1

    invoke-static/range {v1 .. v8}, Lg1/g;->K(Lg1/g;JFJLg1/h;I)V

    :cond_2
    :goto_2
    return-void
.end method

.method public abstract g(Lx/o;)V
.end method
