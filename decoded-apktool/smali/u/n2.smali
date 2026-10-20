.class public final Lu/n2;
.super Ld9/j;

# interfaces
.implements Lc9/f;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Z

.field public final synthetic c:Lu/p2;

.field public final synthetic d:Z

.field public final synthetic e:Lv/y0;


# direct methods
.method public constructor <init>(Lu/p2;Lv/y0;ZZ)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lu/n2;->a:Z

    iput-boolean p3, p0, Lu/n2;->b:Z

    iput-object p1, p0, Lu/n2;->c:Lu/p2;

    iput-boolean p4, p0, Lu/n2;->d:Z

    iput-object p2, p0, Lu/n2;->e:Lv/y0;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Ly0/o;

    move-object/from16 v1, p2

    check-cast v1, Lm0/m;

    move-object/from16 v2, p3

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    check-cast v1, Lm0/q;

    const v2, 0x581dd9c4

    invoke-virtual {v1, v2}, Lm0/q;->Z(I)V

    invoke-static {v1}, Lv/t0;->d(Lm0/m;)Lu/b2;

    move-result-object v2

    const v3, 0x2e20b340

    invoke-virtual {v1, v3}, Lm0/q;->Z(I)V

    const v3, -0x1d58f75c

    invoke-virtual {v1, v3}, Lm0/q;->Z(I)V

    invoke-virtual {v1}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lm0/l;->a:Lk0/y0;

    if-ne v3, v4, :cond_0

    invoke-static {v1}, Lm0/s;->h(Lm0/m;)Lr9/e;

    move-result-object v3

    new-instance v4, Lm0/d0;

    invoke-direct {v4, v3}, Lm0/d0;-><init>(Lr9/e;)V

    invoke-virtual {v1, v4}, Lm0/q;->l0(Ljava/lang/Object;)V

    move-object v3, v4

    :cond_0
    const/4 v11, 0x0

    invoke-virtual {v1, v11}, Lm0/q;->t(Z)V

    check-cast v3, Lm0/d0;

    iget-object v9, v3, Lm0/d0;->a:Lm9/d0;

    invoke-virtual {v1, v11}, Lm0/q;->t(Z)V

    sget-object v3, Ly0/l;->b:Ly0/l;

    new-instance v10, Lu/j2;

    iget-boolean v5, v0, Lu/n2;->b:Z

    iget-boolean v6, v0, Lu/n2;->a:Z

    iget-boolean v7, v0, Lu/n2;->d:Z

    iget-object v8, v0, Lu/n2;->c:Lu/p2;

    move-object v4, v10

    invoke-direct/range {v4 .. v9}, Lu/j2;-><init>(ZZZLu/p2;Lm9/d0;)V

    invoke-static {v3, v11, v10}, Ly1/l;->a(Ly0/o;ZLc9/c;)Ly0/o;

    move-result-object v12

    sget-object v13, Lv/h1;->a:Lv/h1;

    iget-boolean v14, v0, Lu/n2;->a:Z

    if-eqz v14, :cond_1

    move-object v15, v13

    goto :goto_0

    :cond_1
    sget-object v4, Lv/h1;->b:Lv/h1;

    move-object v15, v4

    :goto_0
    sget-object v4, Lu1/s1;->k:Lm0/m3;

    invoke-virtual {v1, v4}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lm2/l;

    iget-boolean v10, v0, Lu/n2;->b:Z

    xor-int/lit8 v5, v10, 0x1

    sget-object v6, Lm2/l;->b:Lm2/l;

    if-ne v4, v6, :cond_2

    if-eq v15, v13, :cond_2

    move v8, v10

    goto :goto_1

    :cond_2
    move v8, v5

    :goto_1
    iget-object v9, v0, Lu/n2;->c:Lu/p2;

    iget-object v7, v9, Lu/p2;->c:Lx/m;

    iget-boolean v6, v0, Lu/n2;->d:Z

    iget-object v5, v0, Lu/n2;->e:Lv/y0;

    move-object v4, v9

    move-object/from16 v16, v5

    move-object v5, v15

    move/from16 v17, v6

    move-object v6, v2

    move-object/from16 v18, v7

    move/from16 v7, v17

    move-object v11, v9

    move-object/from16 v9, v16

    move v0, v10

    move-object/from16 v10, v18

    invoke-static/range {v3 .. v10}, Landroidx/compose/foundation/gestures/a;->c(Ly0/o;Lv/f2;Lv/h1;Lu/b2;ZZLv/y0;Lx/m;)Ly0/o;

    move-result-object v3

    new-instance v4, Landroidx/compose/foundation/ScrollingLayoutElement;

    invoke-direct {v4, v11, v0, v14}, Landroidx/compose/foundation/ScrollingLayoutElement;-><init>(Lu/p2;ZZ)V

    if-ne v15, v13, :cond_3

    sget-object v0, Lu/i0;->c:Ly0/o;

    goto :goto_2

    :cond_3
    sget-object v0, Lu/i0;->b:Ly0/o;

    :goto_2
    invoke-interface {v12, v0}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object v0

    invoke-interface {v2}, Lu/b2;->c()Ly0/o;

    move-result-object v2

    invoke-interface {v0, v2}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object v0

    invoke-interface {v0, v3}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object v0

    invoke-interface {v0, v4}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lm0/q;->t(Z)V

    return-object v0
.end method
