.class public abstract Lj0/g;
.super Ljava/lang/Object;

# interfaces
.implements Lu/i1;


# instance fields
.field public final a:Z

.field public final b:F

.field public final c:Lm0/l3;


# direct methods
.method public constructor <init>(ZFLm0/g1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lj0/g;->a:Z

    iput p2, p0, Lj0/g;->b:F

    iput-object p3, p0, Lj0/g;->c:Lm0/l3;

    return-void
.end method


# virtual methods
.method public final a(Lx/l;Lm0/m;)Lu/j1;
    .locals 11

    check-cast p2, Lm0/q;

    const v0, 0x3aef0613

    invoke-virtual {p2, v0}, Lm0/q;->Z(I)V

    sget-object v0, Lj0/y;->a:Lm0/m3;

    invoke-virtual {p2, v0}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj0/w;

    const v1, -0x5adb992e

    invoke-virtual {p2, v1}, Lm0/q;->Z(I)V

    iget-object v1, p0, Lj0/g;->c:Lm0/l3;

    invoke-interface {v1}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le1/r;

    iget-wide v2, v2, Le1/r;->a:J

    sget-wide v4, Le1/r;->g:J

    cmp-long v2, v2, v4

    if-eqz v2, :cond_0

    invoke-interface {v1}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le1/r;

    iget-wide v1, v1, Le1/r;->a:J

    goto :goto_0

    :cond_0
    invoke-interface {v0, p2}, Lj0/w;->b(Lm0/m;)J

    move-result-wide v1

    :goto_0
    const/4 v3, 0x0

    invoke-virtual {p2, v3}, Lm0/q;->t(Z)V

    new-instance v4, Le1/r;

    invoke-direct {v4, v1, v2}, Le1/r;-><init>(J)V

    invoke-static {v4, p2}, Ld7/t;->m0(Ljava/lang/Object;Lm0/m;)Lm0/g1;

    move-result-object v8

    invoke-interface {v0, p2}, Lj0/w;->a(Lm0/m;)Lj0/h;

    move-result-object v0

    invoke-static {v0, p2}, Ld7/t;->m0(Ljava/lang/Object;Lm0/m;)Lm0/g1;

    move-result-object v9

    iget-boolean v6, p0, Lj0/g;->a:Z

    iget v7, p0, Lj0/g;->b:F

    move-object v0, p0

    check-cast v0, Lj0/e;

    const v1, 0x13be9e37

    invoke-virtual {p2, v1}, Lm0/q;->Z(I)V

    const v1, -0x67961d31

    invoke-virtual {p2, v1}, Lm0/q;->Z(I)V

    sget-object v1, Lu1/y0;->f:Lm0/m3;

    invoke-virtual {p2, v1}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v1

    :goto_1
    instance-of v2, v1, Landroid/view/ViewGroup;

    if-nez v2, :cond_2

    move-object v2, v1

    check-cast v2, Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    instance-of v4, v2, Landroid/view/View;

    if-eqz v4, :cond_1

    move-object v1, v2

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Couldn\'t find a valid parent for "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    move-object v10, v1

    check-cast v10, Landroid/view/ViewGroup;

    invoke-virtual {p2, v3}, Lm0/q;->t(Z)V

    const v1, 0x61f244dd

    invoke-virtual {p2, v1}, Lm0/q;->Z(I)V

    invoke-virtual {v10}, Landroid/view/View;->isInEditMode()Z

    move-result v1

    sget-object v2, Lm0/l;->a:Lk0/y0;

    if-eqz v1, :cond_5

    const v1, 0x1e7b2b64

    invoke-virtual {p2, v1}, Lm0/q;->Z(I)V

    invoke-virtual {p2, p1}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {p2, v0}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v0, v1

    invoke-virtual {p2}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_3

    if-ne v1, v2, :cond_4

    :cond_3
    new-instance v1, Lj0/c;

    invoke-direct {v1, v6, v7, v8, v9}, Lj0/c;-><init>(ZFLm0/g1;Lm0/g1;)V

    invoke-virtual {p2, v1}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_4
    invoke-virtual {p2, v3}, Lm0/q;->t(Z)V

    check-cast v1, Lj0/c;

    invoke-virtual {p2, v3}, Lm0/q;->t(Z)V

    invoke-virtual {p2, v3}, Lm0/q;->t(Z)V

    goto :goto_2

    :cond_5
    invoke-virtual {p2, v3}, Lm0/q;->t(Z)V

    const v1, 0x607fb4c4

    invoke-virtual {p2, v1}, Lm0/q;->Z(I)V

    invoke-virtual {p2, p1}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {p2, v0}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v0, v1

    invoke-virtual {p2, v10}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-virtual {p2}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_6

    if-ne v1, v2, :cond_7

    :cond_6
    new-instance v1, Lj0/a;

    move-object v5, v1

    invoke-direct/range {v5 .. v10}, Lj0/a;-><init>(ZFLm0/g1;Lm0/g1;Landroid/view/ViewGroup;)V

    invoke-virtual {p2, v1}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_7
    invoke-virtual {p2, v3}, Lm0/q;->t(Z)V

    check-cast v1, Lj0/a;

    invoke-virtual {p2, v3}, Lm0/q;->t(Z)V

    :goto_2
    new-instance v0, Lj0/f;

    const/4 v2, 0x0

    invoke-direct {v0, p1, v1, v2}, Lj0/f;-><init>(Lx/l;Lj0/u;Lu8/e;)V

    invoke-static {v1, p1, v0, p2}, Lm0/s;->c(Ljava/lang/Object;Ljava/lang/Object;Lc9/e;Lm0/m;)V

    invoke-virtual {p2, v3}, Lm0/q;->t(Z)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lj0/g;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lj0/g;

    iget-boolean v1, p1, Lj0/g;->a:Z

    iget-boolean v3, p0, Lj0/g;->a:Z

    if-eq v3, v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lj0/g;->b:F

    iget v3, p1, Lj0/g;->b:F

    invoke-static {v1, v3}, Lm2/e;->a(FF)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lj0/g;->c:Lm0/l3;

    iget-object p1, p1, Lj0/g;->c:Lm0/l3;

    invoke-static {v1, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-boolean v0, p0, Lj0/g;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lj0/g;->b:F

    invoke-static {v2, v0, v1}, Ll/q;->a(FII)I

    move-result v0

    iget-object v1, p0, Lj0/g;->c:Lm0/l3;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
