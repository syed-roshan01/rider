.class final Landroidx/compose/foundation/gestures/ScrollableElement;
.super Lt1/u0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lt1/u0;"
    }
.end annotation


# instance fields
.field public final b:Lv/f2;

.field public final c:Lv/h1;

.field public final d:Lu/b2;

.field public final e:Z

.field public final f:Z

.field public final g:Lv/y0;

.field public final h:Lx/m;

.field public final i:Lv/o;


# direct methods
.method public constructor <init>(Lv/f2;Lv/h1;Lu/b2;ZZLv/y0;Lx/m;Lv/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->b:Lv/f2;

    iput-object p2, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->c:Lv/h1;

    iput-object p3, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->d:Lu/b2;

    iput-boolean p4, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->e:Z

    iput-boolean p5, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->f:Z

    iput-object p6, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->g:Lv/y0;

    iput-object p7, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->h:Lx/m;

    iput-object p8, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->i:Lv/o;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/foundation/gestures/ScrollableElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/foundation/gestures/ScrollableElement;

    iget-object v1, p1, Landroidx/compose/foundation/gestures/ScrollableElement;->b:Lv/f2;

    iget-object v3, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->b:Lv/f2;

    invoke-static {v3, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->c:Lv/h1;

    iget-object v3, p1, Landroidx/compose/foundation/gestures/ScrollableElement;->c:Lv/h1;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->d:Lu/b2;

    iget-object v3, p1, Landroidx/compose/foundation/gestures/ScrollableElement;->d:Lu/b2;

    invoke-static {v1, v3}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->e:Z

    iget-boolean v3, p1, Landroidx/compose/foundation/gestures/ScrollableElement;->e:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->f:Z

    iget-boolean v3, p1, Landroidx/compose/foundation/gestures/ScrollableElement;->f:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->g:Lv/y0;

    iget-object v3, p1, Landroidx/compose/foundation/gestures/ScrollableElement;->g:Lv/y0;

    invoke-static {v1, v3}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->h:Lx/m;

    iget-object v3, p1, Landroidx/compose/foundation/gestures/ScrollableElement;->h:Lx/m;

    invoke-static {v1, v3}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->i:Lv/o;

    iget-object p1, p1, Landroidx/compose/foundation/gestures/ScrollableElement;->i:Lv/o;

    invoke-static {v1, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->b:Lv/f2;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->c:Lv/h1;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    const/4 v0, 0x0

    iget-object v3, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->d:Lu/b2;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_0

    :cond_0
    move v3, v0

    :goto_0
    add-int/2addr v2, v3

    mul-int/2addr v2, v1

    iget-boolean v3, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->e:Z

    invoke-static {v3, v2, v1}, Ll/q;->c(ZII)I

    move-result v2

    iget-boolean v3, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->f:Z

    invoke-static {v3, v2, v1}, Ll/q;->c(ZII)I

    move-result v2

    iget-object v3, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->g:Lv/y0;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_1

    :cond_1
    move v3, v0

    :goto_1
    add-int/2addr v2, v3

    mul-int/2addr v2, v1

    iget-object v3, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->h:Lx/m;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :cond_2
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->i:Lv/o;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public final l()Ly0/n;
    .locals 10

    new-instance v9, Lv/e2;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->b:Lv/f2;

    iget-object v2, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->c:Lv/h1;

    iget-object v3, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->d:Lu/b2;

    iget-boolean v4, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->e:Z

    iget-boolean v5, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->f:Z

    iget-object v6, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->g:Lv/y0;

    iget-object v7, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->h:Lx/m;

    iget-object v8, p0, Landroidx/compose/foundation/gestures/ScrollableElement;->i:Lv/o;

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lv/e2;-><init>(Lv/f2;Lv/h1;Lu/b2;ZZLv/y0;Lx/m;Lv/o;)V

    return-object v9
.end method

.method public final m(Ly0/n;)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Lv/e2;

    iget-object v12, v0, Landroidx/compose/foundation/gestures/ScrollableElement;->c:Lv/h1;

    iget-boolean v13, v0, Landroidx/compose/foundation/gestures/ScrollableElement;->e:Z

    iget-object v14, v0, Landroidx/compose/foundation/gestures/ScrollableElement;->h:Lx/m;

    iget-boolean v2, v1, Lv/e2;->z:Z

    if-eq v2, v13, :cond_0

    iget-object v2, v1, Lv/e2;->G:Lv/b2;

    iput-boolean v13, v2, Lv/b2;->b:Z

    iget-object v2, v1, Lv/e2;->I:Lv/b1;

    iput-boolean v13, v2, Lv/b1;->u:Z

    :cond_0
    iget-object v15, v0, Landroidx/compose/foundation/gestures/ScrollableElement;->g:Lv/y0;

    if-nez v15, :cond_1

    iget-object v2, v1, Lv/e2;->E:Lv/u;

    goto :goto_0

    :cond_1
    move-object v2, v15

    :goto_0
    iget-object v3, v1, Lv/e2;->F:Lv/l2;

    iget-object v11, v0, Landroidx/compose/foundation/gestures/ScrollableElement;->b:Lv/f2;

    iput-object v11, v3, Lv/l2;->a:Lv/f2;

    iput-object v12, v3, Lv/l2;->b:Lv/h1;

    iget-object v10, v0, Landroidx/compose/foundation/gestures/ScrollableElement;->d:Lu/b2;

    iput-object v10, v3, Lv/l2;->c:Lu/b2;

    iget-boolean v9, v0, Landroidx/compose/foundation/gestures/ScrollableElement;->f:Z

    iput-boolean v9, v3, Lv/l2;->d:Z

    iput-object v2, v3, Lv/l2;->e:Lv/y0;

    iget-object v2, v1, Lv/e2;->D:Ln1/d;

    iput-object v2, v3, Lv/l2;->f:Ln1/d;

    iget-object v2, v1, Lv/e2;->J:Lv/u1;

    iget-object v3, v2, Lv/u1;->B:Lv/w0;

    iget-object v4, v2, Lv/u1;->y:Lv/n1;

    iget-object v8, v2, Lv/u1;->z:Lt/l0;

    sget-object v16, Landroidx/compose/foundation/gestures/a;->a:Lv/p0;

    iget-object v7, v2, Lv/u1;->A:Lv/t1;

    sget-object v5, Lv/q0;->b:Lv/q0;

    const/16 v17, 0x0

    move-object v2, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v12

    move v6, v13

    move-object/from16 v18, v7

    move-object v7, v14

    move/from16 v19, v9

    move-object/from16 v9, v16

    move-object/from16 v16, v14

    move-object v14, v10

    move-object/from16 v10, v18

    move-object/from16 v18, v15

    move-object v15, v11

    move/from16 v11, v17

    invoke-virtual/range {v2 .. v11}, Lv/w0;->L0(Lv/x0;Lv/q0;Lv/h1;ZLx/m;Lc9/a;Lc9/f;Lc9/f;Z)V

    iget-object v2, v1, Lv/e2;->H:Lv/s;

    iput-object v12, v2, Lv/s;->u:Lv/h1;

    iput-object v15, v2, Lv/s;->v:Lv/f2;

    move/from16 v3, v19

    iput-boolean v3, v2, Lv/s;->w:Z

    iget-object v4, v0, Landroidx/compose/foundation/gestures/ScrollableElement;->i:Lv/o;

    iput-object v4, v2, Lv/s;->x:Lv/o;

    iput-object v15, v1, Lv/e2;->w:Lv/f2;

    iput-object v12, v1, Lv/e2;->x:Lv/h1;

    iput-object v14, v1, Lv/e2;->y:Lu/b2;

    iput-boolean v13, v1, Lv/e2;->z:Z

    iput-boolean v3, v1, Lv/e2;->A:Z

    move-object/from16 v2, v18

    iput-object v2, v1, Lv/e2;->B:Lv/y0;

    move-object/from16 v2, v16

    iput-object v2, v1, Lv/e2;->C:Lx/m;

    return-void
.end method
