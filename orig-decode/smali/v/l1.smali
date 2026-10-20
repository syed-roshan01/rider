.class public final Lv/l1;
.super Ljava/lang/Object;

# interfaces
.implements Lm2/b;


# instance fields
.field public final synthetic a:Lm2/b;

.field public b:Z

.field public c:Z

.field public final d:Lu9/d;


# direct methods
.method public constructor <init>(Lm2/b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv/l1;->a:Lm2/b;

    new-instance p1, Lu9/d;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lu9/d;-><init>(Z)V

    iput-object p1, p0, Lv/l1;->d:Lu9/d;

    return-void
.end method


# virtual methods
.method public final E(J)I
    .locals 1

    iget-object v0, p0, Lv/l1;->a:Lm2/b;

    invoke-interface {v0, p1, p2}, Lm2/b;->E(J)I

    move-result p1

    return p1
.end method

.method public final F(J)F
    .locals 1

    iget-object v0, p0, Lv/l1;->a:Lm2/b;

    invoke-interface {v0, p1, p2}, Lm2/b;->F(J)F

    move-result p1

    return p1
.end method

.method public final J(F)I
    .locals 1

    iget-object v0, p0, Lv/l1;->a:Lm2/b;

    invoke-interface {v0, p1}, Lm2/b;->J(F)I

    move-result p1

    return p1
.end method

.method public final S(J)J
    .locals 1

    iget-object v0, p0, Lv/l1;->a:Lm2/b;

    invoke-interface {v0, p1, p2}, Lm2/b;->S(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final Z(J)F
    .locals 1

    iget-object v0, p0, Lv/l1;->a:Lm2/b;

    invoke-interface {v0, p1, p2}, Lm2/b;->Z(J)F

    move-result p1

    return p1
.end method

.method public final a(Lu8/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, Lv/j1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lv/j1;

    iget v1, v0, Lv/j1;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lv/j1;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lv/j1;

    invoke-direct {v0, p0, p1}, Lv/j1;-><init>(Lv/l1;Lu8/e;)V

    :goto_0
    iget-object p1, v0, Lv/j1;->b:Ljava/lang/Object;

    sget-object v1, Lv8/a;->a:Lv8/a;

    iget v2, v0, Lv/j1;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lv/j1;->a:Lv/l1;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iput-object p0, v0, Lv/j1;->a:Lv/l1;

    iput v3, v0, Lv/j1;->d:I

    const/4 p1, 0x0

    iget-object v2, p0, Lv/l1;->d:Lu9/d;

    invoke-virtual {v2, p1, v0}, Lu9/d;->c(Ljava/lang/Object;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    const/4 p1, 0x0

    iput-boolean p1, v0, Lv/l1;->b:Z

    iput-boolean p1, v0, Lv/l1;->c:Z

    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method

.method public final b(Lu8/e;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p1, Lv/k1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lv/k1;

    iget v1, v0, Lv/k1;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lv/k1;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lv/k1;

    invoke-direct {v0, p0, p1}, Lv/k1;-><init>(Lv/l1;Lu8/e;)V

    :goto_0
    iget-object p1, v0, Lv/k1;->b:Ljava/lang/Object;

    sget-object v1, Lv8/a;->a:Lv8/a;

    iget v2, v0, Lv/k1;->d:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v0, v0, Lv/k1;->a:Lv/l1;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lv/l1;->b:Z

    if-nez p1, :cond_4

    iget-boolean p1, p0, Lv/l1;->c:Z

    if-nez p1, :cond_4

    iput-object p0, v0, Lv/k1;->a:Lv/l1;

    iput v4, v0, Lv/k1;->d:I

    iget-object p1, p0, Lv/l1;->d:Lu9/d;

    invoke-virtual {p1, v3, v0}, Lu9/d;->c(Ljava/lang/Object;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    iget-object p1, v0, Lv/l1;->d:Lu9/d;

    invoke-virtual {p1, v3}, Lu9/d;->d(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    move-object v0, p0

    :goto_2
    iget-boolean p1, v0, Lv/l1;->b:Z

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final c()F
    .locals 1

    iget-object v0, p0, Lv/l1;->a:Lm2/b;

    invoke-interface {v0}, Lm2/b;->c()F

    move-result v0

    return v0
.end method

.method public final e0(F)J
    .locals 2

    iget-object v0, p0, Lv/l1;->a:Lm2/b;

    invoke-interface {v0, p1}, Lm2/b;->e0(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public final m()F
    .locals 1

    iget-object v0, p0, Lv/l1;->a:Lm2/b;

    invoke-interface {v0}, Lm2/b;->m()F

    move-result v0

    return v0
.end method

.method public final o0(I)F
    .locals 1

    iget-object v0, p0, Lv/l1;->a:Lm2/b;

    invoke-interface {v0, p1}, Lm2/b;->o0(I)F

    move-result p1

    return p1
.end method

.method public final q0(F)F
    .locals 1

    iget-object v0, p0, Lv/l1;->a:Lm2/b;

    invoke-interface {v0, p1}, Lm2/b;->q0(F)F

    move-result p1

    return p1
.end method

.method public final t(F)J
    .locals 2

    iget-object v0, p0, Lv/l1;->a:Lm2/b;

    invoke-interface {v0, p1}, Lm2/b;->t(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public final u(J)J
    .locals 1

    iget-object v0, p0, Lv/l1;->a:Lm2/b;

    invoke-interface {v0, p1, p2}, Lm2/b;->u(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final v(F)F
    .locals 1

    iget-object v0, p0, Lv/l1;->a:Lm2/b;

    invoke-interface {v0, p1}, Lm2/b;->v(F)F

    move-result p1

    return p1
.end method
