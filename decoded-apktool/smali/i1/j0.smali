.class public final Li1/j0;
.super Lh1/c;


# instance fields
.field public final f:Lm0/n1;

.field public final n:Lm0/n1;

.field public final o:Li1/e0;

.field public final p:Lm0/l1;

.field public q:F

.field public r:Le1/l;

.field public s:I


# direct methods
.method public constructor <init>(Li1/c;)V
    .locals 3

    invoke-direct {p0}, Lh1/c;-><init>()V

    sget-wide v0, Ld1/f;->b:J

    new-instance v2, Ld1/f;

    invoke-direct {v2, v0, v1}, Ld1/f;-><init>(J)V

    sget-object v0, Lm0/o3;->a:Lm0/o3;

    invoke-static {v2, v0}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object v1

    iput-object v1, p0, Li1/j0;->f:Lm0/n1;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1, v0}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object v0

    iput-object v0, p0, Li1/j0;->n:Lm0/n1;

    new-instance v0, Li1/e0;

    invoke-direct {v0, p1}, Li1/e0;-><init>(Li1/c;)V

    new-instance p1, Lt/l0;

    const/16 v1, 0x14

    invoke-direct {p1, p0, v1}, Lt/l0;-><init>(Ljava/lang/Object;I)V

    iput-object p1, v0, Li1/e0;->f:Lc9/a;

    iput-object v0, p0, Li1/j0;->o:Li1/e0;

    const/4 p1, 0x0

    invoke-static {p1}, Lo7/d0;->Z(I)Lm0/l1;

    move-result-object p1

    iput-object p1, p0, Li1/j0;->p:Lm0/l1;

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Li1/j0;->q:F

    const/4 p1, -0x1

    iput p1, p0, Li1/j0;->s:I

    return-void
.end method


# virtual methods
.method public final c(F)Z
    .locals 0

    iput p1, p0, Li1/j0;->q:F

    const/4 p1, 0x1

    return p1
.end method

.method public final e(Le1/l;)Z
    .locals 0

    iput-object p1, p0, Li1/j0;->r:Le1/l;

    const/4 p1, 0x1

    return p1
.end method

.method public final h()J
    .locals 2

    iget-object v0, p0, Li1/j0;->f:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld1/f;

    iget-wide v0, v0, Ld1/f;->a:J

    return-wide v0
.end method

.method public final i(Lg1/g;)V
    .locals 10

    iget-object v0, p0, Li1/j0;->r:Le1/l;

    iget-object v1, p0, Li1/j0;->o:Li1/e0;

    if-nez v0, :cond_0

    iget-object v0, v1, Li1/e0;->g:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le1/l;

    :cond_0
    iget-object v2, p0, Li1/j0;->n:Lm0/n1;

    invoke-virtual {v2}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Lg1/g;->getLayoutDirection()Lm2/l;

    move-result-object v2

    sget-object v3, Lm2/l;->b:Lm2/l;

    if-ne v2, v3, :cond_1

    invoke-interface {p1}, Lg1/g;->O()J

    move-result-wide v2

    invoke-interface {p1}, Lg1/g;->A()Lg1/b;

    move-result-object v4

    invoke-virtual {v4}, Lg1/b;->b()J

    move-result-wide v5

    invoke-virtual {v4}, Lg1/b;->a()Le1/p;

    move-result-object v7

    invoke-interface {v7}, Le1/p;->j()V

    const/high16 v7, -0x40800000    # -1.0f

    const/high16 v8, 0x3f800000    # 1.0f

    iget-object v9, v4, Lg1/b;->a:Lg1/d;

    invoke-virtual {v9, v7, v8, v2, v3}, Lg1/d;->b(FFJ)V

    iget v2, p0, Li1/j0;->q:F

    invoke-virtual {v1, p1, v2, v0}, Li1/e0;->e(Lg1/g;FLe1/l;)V

    invoke-virtual {v4}, Lg1/b;->a()Le1/p;

    move-result-object p1

    invoke-interface {p1}, Le1/p;->h()V

    invoke-virtual {v4, v5, v6}, Lg1/b;->c(J)V

    goto :goto_0

    :cond_1
    iget v2, p0, Li1/j0;->q:F

    invoke-virtual {v1, p1, v2, v0}, Li1/e0;->e(Lg1/g;FLe1/l;)V

    :goto_0
    iget-object p1, p0, Li1/j0;->p:Lm0/l1;

    invoke-virtual {p1}, Lm0/u2;->d()I

    move-result p1

    iput p1, p0, Li1/j0;->s:I

    return-void
.end method
