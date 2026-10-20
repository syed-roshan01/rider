.class public final Lj4/l;
.super Lh1/c;

# interfaces
.implements Lm0/i2;


# static fields
.field public static final synthetic B:I


# instance fields
.field public final A:Lm0/n1;

.field public f:Lr9/e;

.field public final n:Lp9/q0;

.field public final o:Lm0/n1;

.field public final p:Lm0/k1;

.field public final q:Lm0/n1;

.field public r:Lj4/f;

.field public s:Lh1/c;

.field public t:Lc9/c;

.field public u:Lc9/c;

.field public v:Lr1/l;

.field public w:I

.field public x:Z

.field public final y:Lm0/n1;

.field public final z:Lm0/n1;


# direct methods
.method public constructor <init>(Ls4/j;Li4/i;)V
    .locals 3

    invoke-direct {p0}, Lh1/c;-><init>()V

    sget-wide v0, Ld1/f;->b:J

    new-instance v2, Ld1/f;

    invoke-direct {v2, v0, v1}, Ld1/f;-><init>(J)V

    invoke-static {v2}, Lp9/d0;->a(Ljava/lang/Object;)Lp9/q0;

    move-result-object v0

    iput-object v0, p0, Lj4/l;->n:Lp9/q0;

    sget-object v0, Lm0/o3;->a:Lm0/o3;

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object v2

    iput-object v2, p0, Lj4/l;->o:Lm0/n1;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2}, Lm9/e0;->H(F)Lm0/k1;

    move-result-object v2

    iput-object v2, p0, Lj4/l;->p:Lm0/k1;

    invoke-static {v1, v0}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object v1

    iput-object v1, p0, Lj4/l;->q:Lm0/n1;

    sget-object v1, Lj4/b;->a:Lj4/b;

    iput-object v1, p0, Lj4/l;->r:Lj4/f;

    sget-object v2, Lj4/a;->a:Lj4/a;

    iput-object v2, p0, Lj4/l;->t:Lc9/c;

    sget-object v2, Lr1/k;->b:Lx9/v;

    iput-object v2, p0, Lj4/l;->v:Lr1/l;

    const/4 v2, 0x1

    iput v2, p0, Lj4/l;->w:I

    invoke-static {v1, v0}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object v1

    iput-object v1, p0, Lj4/l;->y:Lm0/n1;

    invoke-static {p1, v0}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p1

    iput-object p1, p0, Lj4/l;->z:Lm0/n1;

    invoke-static {p2, v0}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p1

    iput-object p1, p0, Lj4/l;->A:Lm0/n1;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    iget-object v0, p0, Lj4/l;->f:Lr9/e;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Ld7/t;->k()Lm9/y1;

    move-result-object v0

    sget-object v1, Lm9/m0;->a:Lt9/d;

    sget-object v1, Lr9/o;->a:Lm9/s1;

    check-cast v1, Ln9/d;

    iget-object v1, v1, Ln9/d;->f:Ln9/d;

    invoke-virtual {v0, v1}, Lm9/p1;->O(Lu8/j;)Lu8/j;

    move-result-object v0

    invoke-static {v0}, Ld7/a;->b(Lu8/j;)Lr9/e;

    move-result-object v0

    iput-object v0, p0, Lj4/l;->f:Lr9/e;

    iget-object v1, p0, Lj4/l;->s:Lh1/c;

    instance-of v2, v1, Lm0/i2;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    check-cast v1, Lm0/i2;

    goto :goto_0

    :cond_1
    move-object v1, v3

    :goto_0
    if-eqz v1, :cond_2

    invoke-interface {v1}, Lm0/i2;->a()V

    :cond_2
    iget-boolean v1, p0, Lj4/l;->x:Z

    if-eqz v1, :cond_4

    iget-object v0, p0, Lj4/l;->z:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls4/j;

    invoke-static {v0}, Ls4/j;->a(Ls4/j;)Ls4/h;

    move-result-object v0

    iget-object v1, p0, Lj4/l;->A:Lm0/n1;

    invoke-virtual {v1}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li4/i;

    check-cast v1, Li4/o;

    iget-object v1, v1, Li4/o;->a:Ls4/c;

    iput-object v1, v0, Ls4/h;->b:Ls4/c;

    iput-object v3, v0, Ls4/h;->O:Lt4/e;

    invoke-virtual {v0}, Ls4/h;->a()Ls4/j;

    move-result-object v0

    new-instance v1, Lj4/d;

    iget-object v2, v0, Ls4/j;->M:Ls4/c;

    iget-object v2, v2, Ls4/c;->j:Landroid/graphics/drawable/Drawable;

    iget-object v4, v0, Ls4/j;->G:Landroid/graphics/drawable/Drawable;

    iget-object v5, v0, Ls4/j;->F:Ljava/lang/Integer;

    invoke-static {v0, v4, v5, v2}, Lw4/d;->b(Ls4/j;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p0, v0}, Lj4/l;->j(Landroid/graphics/drawable/Drawable;)Lh1/c;

    move-result-object v3

    :cond_3
    invoke-direct {v1, v3}, Lj4/d;-><init>(Lh1/c;)V

    invoke-virtual {p0, v1}, Lj4/l;->k(Lj4/f;)V

    return-void

    :cond_4
    new-instance v1, Lj4/i;

    invoke-direct {v1, p0, v3}, Lj4/i;-><init>(Lj4/l;Lu8/e;)V

    const/4 v2, 0x3

    const/4 v4, 0x0

    invoke-static {v0, v3, v4, v1, v2}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    return-void
.end method

.method public final b()V
    .locals 3

    iget-object v0, p0, Lj4/l;->f:Lr9/e;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0, v1}, Ld7/a;->i(Lm9/d0;Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iput-object v1, p0, Lj4/l;->f:Lr9/e;

    iget-object v0, p0, Lj4/l;->s:Lh1/c;

    instance-of v2, v0, Lm0/i2;

    if-eqz v2, :cond_1

    move-object v1, v0

    check-cast v1, Lm0/i2;

    :cond_1
    if-eqz v1, :cond_2

    invoke-interface {v1}, Lm0/i2;->b()V

    :cond_2
    return-void
.end method

.method public final c(F)Z
    .locals 1

    iget-object v0, p0, Lj4/l;->p:Lm0/k1;

    invoke-virtual {v0, p1}, Lm0/s2;->f(F)V

    const/4 p1, 0x1

    return p1
.end method

.method public final d()V
    .locals 3

    iget-object v0, p0, Lj4/l;->f:Lr9/e;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0, v1}, Ld7/a;->i(Lm9/d0;Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iput-object v1, p0, Lj4/l;->f:Lr9/e;

    iget-object v0, p0, Lj4/l;->s:Lh1/c;

    instance-of v2, v0, Lm0/i2;

    if-eqz v2, :cond_1

    move-object v1, v0

    check-cast v1, Lm0/i2;

    :cond_1
    if-eqz v1, :cond_2

    invoke-interface {v1}, Lm0/i2;->d()V

    :cond_2
    return-void
.end method

.method public final e(Le1/l;)Z
    .locals 1

    iget-object v0, p0, Lj4/l;->q:Lm0/n1;

    invoke-virtual {v0, p1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final h()J
    .locals 2

    iget-object v0, p0, Lj4/l;->o:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh1/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lh1/c;->h()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    sget-wide v0, Ld1/f;->c:J

    :goto_0
    return-wide v0
.end method

.method public final i(Lg1/g;)V
    .locals 7

    invoke-interface {p1}, Lg1/g;->e()J

    move-result-wide v0

    new-instance v2, Ld1/f;

    invoke-direct {v2, v0, v1}, Ld1/f;-><init>(J)V

    iget-object v0, p0, Lj4/l;->n:Lp9/q0;

    invoke-virtual {v0, v2}, Lp9/q0;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lj4/l;->o:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lh1/c;

    if-eqz v1, :cond_0

    invoke-interface {p1}, Lg1/g;->e()J

    move-result-wide v3

    iget-object v0, p0, Lj4/l;->p:Lm0/k1;

    invoke-virtual {v0}, Lm0/s2;->d()F

    move-result v5

    iget-object v0, p0, Lj4/l;->q:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Le1/l;

    move-object v2, p1

    invoke-virtual/range {v1 .. v6}, Lh1/c;->g(Lg1/g;JFLe1/l;)V

    :cond_0
    return-void
.end method

.method public final j(Landroid/graphics/drawable/Drawable;)Lh1/c;
    .locals 1

    instance-of v0, p1, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v0, :cond_0

    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p1

    new-instance v0, Le1/f;

    invoke-direct {v0, p1}, Le1/f;-><init>(Landroid/graphics/Bitmap;)V

    iget p1, p0, Lj4/l;->w:I

    invoke-static {v0, p1}, Lm9/e0;->c(Le1/f;I)Lh1/a;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance v0, Lh5/a;

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-direct {v0, p1}, Lh5/a;-><init>(Landroid/graphics/drawable/Drawable;)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method

.method public final k(Lj4/f;)V
    .locals 3

    iget-object v0, p0, Lj4/l;->r:Lj4/f;

    iget-object v1, p0, Lj4/l;->t:Lc9/c;

    invoke-interface {v1, p1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj4/f;

    iput-object p1, p0, Lj4/l;->r:Lj4/f;

    iget-object v1, p0, Lj4/l;->y:Lm0/n1;

    invoke-virtual {v1, p1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    instance-of v1, p1, Lj4/e;

    if-eqz v1, :cond_0

    move-object v1, p1

    check-cast v1, Lj4/e;

    iget-object v1, v1, Lj4/e;->b:Ls4/q;

    goto :goto_0

    :cond_0
    instance-of v1, p1, Lj4/c;

    if-eqz v1, :cond_1

    move-object v1, p1

    check-cast v1, Lj4/c;

    iget-object v1, v1, Lj4/c;->b:Ls4/e;

    :goto_0
    invoke-virtual {v1}, Ls4/k;->b()Ls4/j;

    move-result-object v1

    iget-object v1, v1, Ls4/j;->m:Lv4/b;

    check-cast v1, Lv4/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_1
    invoke-virtual {p1}, Lj4/f;->a()Lh1/c;

    move-result-object v1

    iput-object v1, p0, Lj4/l;->s:Lh1/c;

    iget-object v2, p0, Lj4/l;->o:Lm0/n1;

    invoke-virtual {v2, v1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    iget-object v1, p0, Lj4/l;->f:Lr9/e;

    if-eqz v1, :cond_5

    invoke-virtual {v0}, Lj4/f;->a()Lh1/c;

    move-result-object v1

    invoke-virtual {p1}, Lj4/f;->a()Lh1/c;

    move-result-object v2

    if-eq v1, v2, :cond_5

    invoke-virtual {v0}, Lj4/f;->a()Lh1/c;

    move-result-object v0

    instance-of v1, v0, Lm0/i2;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast v0, Lm0/i2;

    goto :goto_1

    :cond_2
    move-object v0, v2

    :goto_1
    if-eqz v0, :cond_3

    invoke-interface {v0}, Lm0/i2;->d()V

    :cond_3
    invoke-virtual {p1}, Lj4/f;->a()Lh1/c;

    move-result-object v0

    instance-of v1, v0, Lm0/i2;

    if-eqz v1, :cond_4

    move-object v2, v0

    check-cast v2, Lm0/i2;

    :cond_4
    if-eqz v2, :cond_5

    invoke-interface {v2}, Lm0/i2;->a()V

    :cond_5
    iget-object v0, p0, Lj4/l;->u:Lc9/c;

    if-eqz v0, :cond_6

    invoke-interface {v0, p1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    return-void
.end method
