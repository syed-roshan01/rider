.class public abstract Landroidx/compose/ui/draw/a;
.super Ljava/lang/Object;


# direct methods
.method public static final a(Ly0/o;F)Ly0/o;
    .locals 9

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, p1, v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    const v8, 0x1effb

    move-object v1, p0

    move v4, p1

    invoke-static/range {v1 .. v8}, Landroidx/compose/ui/graphics/a;->k(Ly0/o;FFFFLe1/l0;ZI)Ly0/o;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static final b(Ly0/o;Le1/l0;)Ly0/o;
    .locals 8

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x1

    const v7, 0x1e7ff

    move-object v0, p0

    move-object v5, p1

    invoke-static/range {v0 .. v7}, Landroidx/compose/ui/graphics/a;->k(Ly0/o;FFFFLe1/l0;ZI)Ly0/o;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Ly0/o;)Ly0/o;
    .locals 8

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    const v7, 0x1efff

    move-object v0, p0

    invoke-static/range {v0 .. v7}, Landroidx/compose/ui/graphics/a;->k(Ly0/o;FFFFLe1/l0;ZI)Ly0/o;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Ly0/o;Lc9/c;)Ly0/o;
    .locals 1

    new-instance v0, Landroidx/compose/ui/draw/DrawBehindElement;

    invoke-direct {v0, p1}, Landroidx/compose/ui/draw/DrawBehindElement;-><init>(Lc9/c;)V

    invoke-interface {p0, v0}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Ly0/o;Lc9/c;)Ly0/o;
    .locals 1

    new-instance v0, Landroidx/compose/ui/draw/DrawWithCacheElement;

    invoke-direct {v0, p1}, Landroidx/compose/ui/draw/DrawWithCacheElement;-><init>(Lc9/c;)V

    invoke-interface {p0, v0}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Ly0/o;Lc9/c;)Ly0/o;
    .locals 1

    new-instance v0, Landroidx/compose/ui/draw/DrawWithContentElement;

    invoke-direct {v0, p1}, Landroidx/compose/ui/draw/DrawWithContentElement;-><init>(Lc9/c;)V

    invoke-interface {p0, v0}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object p0

    return-object p0
.end method

.method public static g(Ly0/o;Lh1/c;Ly0/d;Lr1/l;FLe1/l;I)Ly0/o;
    .locals 8

    and-int/lit8 v0, p6, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    move v3, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    and-int/lit8 v0, p6, 0x4

    if-eqz v0, :cond_1

    sget-object p2, Ly0/a;->c:Ly0/g;

    :cond_1
    move-object v4, p2

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_2

    sget-object p3, Lr1/k;->d:Lx9/v;

    :cond_2
    move-object v5, p3

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_3

    const/high16 p4, 0x3f800000    # 1.0f

    :cond_3
    move v6, p4

    and-int/lit8 p2, p6, 0x20

    if-eqz p2, :cond_4

    const/4 p5, 0x0

    :cond_4
    move-object v7, p5

    new-instance p2, Landroidx/compose/ui/draw/PainterElement;

    move-object v1, p2

    move-object v2, p1

    invoke-direct/range {v1 .. v7}, Landroidx/compose/ui/draw/PainterElement;-><init>(Lh1/c;ZLy0/d;Lr1/l;FLe1/l;)V

    invoke-interface {p0, p2}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Ly0/o;F)Ly0/o;
    .locals 9

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, p1, v0

    if-nez v0, :cond_0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const v8, 0x1fffc

    move-object v1, p0

    move v2, p1

    move v3, p1

    invoke-static/range {v1 .. v8}, Landroidx/compose/ui/graphics/a;->k(Ly0/o;FFFFLe1/l0;ZI)Ly0/o;

    move-result-object p0

    :goto_0
    return-object p0
.end method
