.class public final Lu/q1;
.super Ly0/n;

# interfaces
.implements Lt1/m;
.implements Lt1/t;
.implements Lt1/s;
.implements Lt1/r1;
.implements Lt1/f1;


# instance fields
.field public A:F

.field public B:F

.field public C:Z

.field public D:Lu/d2;

.field public E:Landroid/view/View;

.field public F:Lm2/b;

.field public G:Lu/c2;

.field public final H:Lm0/n1;

.field public I:J

.field public J:Lm2/k;

.field public u:Lc9/c;

.field public v:Lc9/c;

.field public w:Lc9/c;

.field public x:F

.field public y:Z

.field public z:J


# direct methods
.method public constructor <init>(Lc9/c;Lc9/c;Lc9/c;FZJFFZLu/d2;)V
    .locals 0

    invoke-direct {p0}, Ly0/n;-><init>()V

    iput-object p1, p0, Lu/q1;->u:Lc9/c;

    iput-object p2, p0, Lu/q1;->v:Lc9/c;

    iput-object p3, p0, Lu/q1;->w:Lc9/c;

    iput p4, p0, Lu/q1;->x:F

    iput-boolean p5, p0, Lu/q1;->y:Z

    iput-wide p6, p0, Lu/q1;->z:J

    iput p8, p0, Lu/q1;->A:F

    iput p9, p0, Lu/q1;->B:F

    iput-boolean p10, p0, Lu/q1;->C:Z

    iput-object p11, p0, Lu/q1;->D:Lu/d2;

    sget-wide p1, Ld1/c;->d:J

    new-instance p3, Ld1/c;

    invoke-direct {p3, p1, p2}, Ld1/c;-><init>(J)V

    sget-object p4, Lm0/o3;->a:Lm0/o3;

    invoke-static {p3, p4}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p3

    iput-object p3, p0, Lu/q1;->H:Lm0/n1;

    iput-wide p1, p0, Lu/q1;->I:J

    return-void
.end method


# virtual methods
.method public final A0()V
    .locals 1

    iget-object v0, p0, Lu/q1;->G:Lu/c2;

    if-eqz v0, :cond_0

    check-cast v0, Lu/e2;

    invoke-virtual {v0}, Lu/e2;->b()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lu/q1;->G:Lu/c2;

    return-void
.end method

.method public final G()V
    .locals 2

    new-instance v0, Lu/o1;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lu/o1;-><init>(Lu/q1;I)V

    invoke-static {p0, v0}, Lt1/g;->w(Ly0/n;Lc9/a;)V

    return-void
.end method

.method public final G0()V
    .locals 11

    iget-object v0, p0, Lu/q1;->G:Lu/c2;

    if-eqz v0, :cond_0

    check-cast v0, Lu/e2;

    invoke-virtual {v0}, Lu/e2;->b()V

    :cond_0
    iget-object v2, p0, Lu/q1;->E:Landroid/view/View;

    if-nez v2, :cond_1

    return-void

    :cond_1
    iget-object v9, p0, Lu/q1;->F:Lm2/b;

    if-nez v9, :cond_2

    return-void

    :cond_2
    iget-object v1, p0, Lu/q1;->D:Lu/d2;

    iget-boolean v3, p0, Lu/q1;->y:Z

    iget-wide v4, p0, Lu/q1;->z:J

    iget v6, p0, Lu/q1;->A:F

    iget v7, p0, Lu/q1;->B:F

    iget-boolean v8, p0, Lu/q1;->C:Z

    iget v10, p0, Lu/q1;->x:F

    invoke-interface/range {v1 .. v10}, Lu/d2;->b(Landroid/view/View;ZJFFZLm2/b;F)Lu/c2;

    move-result-object v0

    iput-object v0, p0, Lu/q1;->G:Lu/c2;

    invoke-virtual {p0}, Lu/q1;->I0()V

    return-void
.end method

.method public final H0()V
    .locals 7

    iget-object v0, p0, Lu/q1;->G:Lu/c2;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lu/q1;->F:Lm2/b;

    if-nez v1, :cond_1

    return-void

    :cond_1
    iget-object v2, p0, Lu/q1;->u:Lc9/c;

    invoke-interface {v2, v1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ld1/c;

    iget-wide v2, v2, Ld1/c;->a:J

    iget-object v4, p0, Lu/q1;->H:Lm0/n1;

    invoke-virtual {v4}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ld1/c;

    iget-wide v5, v5, Ld1/c;->a:J

    invoke-static {v5, v6}, Ld9/i;->u(J)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-static {v2, v3}, Ld9/i;->u(J)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {v4}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ld1/c;

    iget-wide v5, v5, Ld1/c;->a:J

    invoke-static {v5, v6, v2, v3}, Ld1/c;->g(JJ)J

    move-result-wide v2

    goto :goto_0

    :cond_2
    sget-wide v2, Ld1/c;->d:J

    :goto_0
    iput-wide v2, p0, Lu/q1;->I:J

    invoke-static {v2, v3}, Ld9/i;->u(J)Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, p0, Lu/q1;->v:Lc9/c;

    if-eqz v2, :cond_4

    invoke-interface {v2, v1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ld1/c;

    iget-wide v1, v1, Ld1/c;->a:J

    new-instance v3, Ld1/c;

    invoke-direct {v3, v1, v2}, Ld1/c;-><init>(J)V

    invoke-static {v1, v2}, Ld9/i;->u(J)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_4

    invoke-virtual {v4}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ld1/c;

    iget-wide v1, v1, Ld1/c;->a:J

    iget-wide v3, v3, Ld1/c;->a:J

    invoke-static {v1, v2, v3, v4}, Ld1/c;->g(JJ)J

    move-result-wide v1

    :goto_2
    move-wide v3, v1

    goto :goto_3

    :cond_4
    sget-wide v1, Ld1/c;->d:J

    goto :goto_2

    :goto_3
    iget-wide v1, p0, Lu/q1;->I:J

    iget v5, p0, Lu/q1;->x:F

    invoke-interface/range {v0 .. v5}, Lu/c2;->a(JJF)V

    invoke-virtual {p0}, Lu/q1;->I0()V

    goto :goto_4

    :cond_5
    check-cast v0, Lu/e2;

    invoke-virtual {v0}, Lu/e2;->b()V

    :goto_4
    return-void
.end method

.method public final I0()V
    .locals 6

    iget-object v0, p0, Lu/q1;->G:Lu/c2;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lu/q1;->F:Lm2/b;

    if-nez v1, :cond_1

    return-void

    :cond_1
    check-cast v0, Lu/e2;

    invoke-virtual {v0}, Lu/e2;->c()J

    move-result-wide v2

    iget-object v4, p0, Lu/q1;->J:Lm2/k;

    instance-of v5, v4, Lm2/k;

    if-nez v5, :cond_2

    goto :goto_0

    :cond_2
    iget-wide v4, v4, Lm2/k;->a:J

    cmp-long v2, v2, v4

    if-eqz v2, :cond_4

    :goto_0
    iget-object v2, p0, Lu/q1;->w:Lc9/c;

    if-eqz v2, :cond_3

    invoke-virtual {v0}, Lu/e2;->c()J

    move-result-wide v3

    invoke-static {v3, v4}, Lo1/s;->m0(J)J

    move-result-wide v3

    invoke-interface {v1, v3, v4}, Lm2/b;->u(J)J

    move-result-wide v3

    new-instance v1, Lm2/g;

    invoke-direct {v1, v3, v4}, Lm2/g;-><init>(J)V

    invoke-interface {v2, v1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    invoke-virtual {v0}, Lu/e2;->c()J

    move-result-wide v0

    new-instance v2, Lm2/k;

    invoke-direct {v2, v0, v1}, Lm2/k;-><init>(J)V

    iput-object v2, p0, Lu/q1;->J:Lm2/k;

    :cond_4
    return-void
.end method

.method public final Q(Ly1/j;)V
    .locals 3

    sget-object v0, Lu/r1;->a:Ly1/u;

    new-instance v1, Lu/o1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lu/o1;-><init>(Lu/q1;I)V

    invoke-virtual {p1, v0, v1}, Ly1/j;->k(Ly1/u;Ljava/lang/Object;)V

    return-void
.end method

.method public final i(Lg1/e;)V
    .locals 4

    check-cast p1, Lt1/i0;

    invoke-virtual {p1}, Lt1/i0;->a()V

    invoke-virtual {p0}, Ly0/n;->v0()Lm9/d0;

    move-result-object p1

    new-instance v0, Lu/p1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lu/p1;-><init>(Lu/q1;Lu8/e;)V

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-static {p1, v1, v3, v0, v2}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    return-void
.end method

.method public final r0(Lt1/c1;)V
    .locals 2

    sget-wide v0, Ld1/c;->b:J

    invoke-virtual {p1, v0, v1}, Lt1/c1;->P(J)J

    move-result-wide v0

    new-instance p1, Ld1/c;

    invoke-direct {p1, v0, v1}, Ld1/c;-><init>(J)V

    iget-object v0, p0, Lu/q1;->H:Lm0/n1;

    invoke-virtual {v0, p1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final z0()V
    .locals 0

    invoke-virtual {p0}, Lu/q1;->G()V

    return-void
.end method
