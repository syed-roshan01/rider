.class public abstract Lt1/a;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lt1/b;

.field public b:Z

.field public c:Z

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:Z

.field public h:Lt1/b;

.field public final i:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Lt1/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt1/a;->a:Lt1/b;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lt1/a;->b:Z

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lt1/a;->i:Ljava/util/HashMap;

    return-void
.end method

.method public static final a(Lt1/a;Lr1/a;ILt1/c1;)V
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    int-to-float p2, p2

    invoke-static {p2, p2}, Ld9/i;->f(FF)J

    move-result-wide v0

    :cond_0
    :goto_0
    invoke-virtual {p0, p3, v0, v1}, Lt1/a;->b(Lt1/c1;J)J

    move-result-wide v0

    iget-object p3, p3, Lt1/c1;->r:Lt1/c1;

    invoke-static {p3}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object p2, p0, Lt1/a;->a:Lt1/b;

    invoke-interface {p2}, Lt1/b;->l()Lt1/x;

    move-result-object p2

    invoke-static {p3, p2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {p0, p3}, Lt1/a;->c(Lt1/c1;)Ljava/util/Map;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p0, p3, p1}, Lt1/a;->d(Lt1/c1;Lr1/a;)I

    move-result p2

    int-to-float p2, p2

    invoke-static {p2, p2}, Ld9/i;->f(FF)J

    move-result-wide v0

    goto :goto_0

    :cond_1
    instance-of p2, p1, Lr1/o;

    if-eqz p2, :cond_2

    invoke-static {v0, v1}, Ld1/c;->e(J)F

    move-result p2

    invoke-static {p2}, Ld7/t;->p0(F)I

    move-result p2

    goto :goto_1

    :cond_2
    invoke-static {v0, v1}, Ld1/c;->d(J)F

    move-result p2

    invoke-static {p2}, Ld7/t;->p0(F)I

    move-result p2

    :goto_1
    iget-object p0, p0, Lt1/a;->i:Ljava/util/HashMap;

    invoke-virtual {p0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-static {p1, p0}, Lr8/v;->B0(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    sget-object v0, Lr1/d;->a:Lr1/o;

    iget-object v0, p1, Lr1/a;->a:Lc9/e;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v0, p3, p2}, Lc9/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    :cond_3
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public abstract b(Lt1/c1;J)J
.end method

.method public abstract c(Lt1/c1;)Ljava/util/Map;
.end method

.method public abstract d(Lt1/c1;Lr1/a;)I
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lt1/a;->c:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lt1/a;->e:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lt1/a;->f:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lt1/a;->g:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final f()Z
    .locals 1

    invoke-virtual {p0}, Lt1/a;->i()V

    iget-object v0, p0, Lt1/a;->h:Lt1/b;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final g()V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lt1/a;->b:Z

    iget-object v0, p0, Lt1/a;->a:Lt1/b;

    invoke-interface {v0}, Lt1/b;->y()Lt1/b;

    move-result-object v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget-boolean v2, p0, Lt1/a;->c:Z

    if-eqz v2, :cond_1

    invoke-interface {v1}, Lt1/b;->R()V

    goto :goto_0

    :cond_1
    iget-boolean v2, p0, Lt1/a;->e:Z

    if-nez v2, :cond_2

    iget-boolean v2, p0, Lt1/a;->d:Z

    if-eqz v2, :cond_3

    :cond_2
    invoke-interface {v1}, Lt1/b;->requestLayout()V

    :cond_3
    :goto_0
    iget-boolean v2, p0, Lt1/a;->f:Z

    if-eqz v2, :cond_4

    invoke-interface {v0}, Lt1/b;->R()V

    :cond_4
    iget-boolean v2, p0, Lt1/a;->g:Z

    if-eqz v2, :cond_5

    invoke-interface {v0}, Lt1/b;->requestLayout()V

    :cond_5
    invoke-interface {v1}, Lt1/b;->d()Lt1/a;

    move-result-object v0

    invoke-virtual {v0}, Lt1/a;->g()V

    return-void
.end method

.method public final h()V
    .locals 3

    iget-object v0, p0, Lt1/a;->i:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    new-instance v1, Lh1/b;

    const/4 v2, 0x4

    invoke-direct {v1, p0, v2}, Lh1/b;-><init>(Ljava/lang/Object;I)V

    iget-object v2, p0, Lt1/a;->a:Lt1/b;

    invoke-interface {v2, v1}, Lt1/b;->k(Lc9/c;)V

    invoke-interface {v2}, Lt1/b;->l()Lt1/x;

    move-result-object v1

    invoke-virtual {p0, v1}, Lt1/a;->c(Lt1/c1;)Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lt1/a;->b:Z

    return-void
.end method

.method public final i()V
    .locals 2

    invoke-virtual {p0}, Lt1/a;->e()Z

    move-result v0

    iget-object v1, p0, Lt1/a;->a:Lt1/b;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v1}, Lt1/b;->y()Lt1/b;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-interface {v0}, Lt1/b;->d()Lt1/a;

    move-result-object v0

    iget-object v1, v0, Lt1/a;->h:Lt1/b;

    if-eqz v1, :cond_2

    invoke-interface {v1}, Lt1/b;->d()Lt1/a;

    move-result-object v0

    invoke-virtual {v0}, Lt1/a;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lt1/a;->h:Lt1/b;

    if-eqz v0, :cond_6

    invoke-interface {v0}, Lt1/b;->d()Lt1/a;

    move-result-object v1

    invoke-virtual {v1}, Lt1/a;->e()Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_1

    :cond_3
    invoke-interface {v0}, Lt1/b;->y()Lt1/b;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-interface {v1}, Lt1/b;->d()Lt1/a;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lt1/a;->i()V

    :cond_4
    invoke-interface {v0}, Lt1/b;->y()Lt1/b;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-interface {v0}, Lt1/b;->d()Lt1/a;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v1, v0, Lt1/a;->h:Lt1/b;

    goto :goto_0

    :cond_5
    const/4 v1, 0x0

    :goto_0
    iput-object v1, p0, Lt1/a;->h:Lt1/b;

    :cond_6
    :goto_1
    return-void
.end method
