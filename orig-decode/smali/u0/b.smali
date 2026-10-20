.class public final Lu0/b;
.super Ljava/lang/Object;

# interfaces
.implements Lu0/a;


# instance fields
.field public final a:I

.field public final b:Z

.field public c:Ljava/lang/Object;

.field public d:Lm0/x1;

.field public e:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(ILd9/j;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lu0/b;->a:I

    iput-boolean p3, p0, Lu0/b;->b:Z

    iput-object p2, p0, Lu0/b;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lm0/m;I)Ljava/lang/Object;
    .locals 12

    move-object v8, p0

    move-object/from16 v9, p6

    check-cast v9, Lm0/q;

    iget v0, v8, Lu0/b;->a:I

    invoke-virtual {v9, v0}, Lm0/q;->a0(I)Lm0/q;

    invoke-virtual {p0, v9}, Lu0/b;->f(Lm0/m;)V

    invoke-virtual {v9, p0}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x5

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    invoke-static {v0, v1}, Ld7/t;->G(II)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-static {v0, v1}, Ld7/t;->G(II)I

    move-result v0

    :goto_0
    or-int v0, p7, v0

    iget-object v1, v8, Lu0/b;->c:Ljava/lang/Object;

    const-string v2, "null cannot be cast to non-null type kotlin.Function7<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'p3\')] kotlin.Any?, @[ParameterName(name = \'p4\')] kotlin.Any?, @[ParameterName(name = \'p5\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, kotlin.Any?>"

    invoke-static {v1, v2}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x7

    invoke-static {v2, v1}, Lz6/a;->f(ILjava/lang/Object;)V

    check-cast v1, Lc9/h;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    move-object v0, v1

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object v6, v9

    invoke-interface/range {v0 .. v7}, Lc9/h;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;)Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v9}, Lm0/q;->x()Lm0/x1;

    move-result-object v9

    if-eqz v9, :cond_1

    new-instance v11, Lk0/k2;

    move-object v0, v11

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lk0/k2;-><init>(Lu0/b;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput-object v11, v9, Lm0/x1;->d:Lc9/e;

    :cond_1
    return-object v10
.end method

.method public final b(Ljava/lang/Object;Ljava/lang/Object;Lm0/m;I)Ljava/lang/Object;
    .locals 8

    check-cast p3, Lm0/q;

    iget v0, p0, Lu0/b;->a:I

    invoke-virtual {p3, v0}, Lm0/q;->a0(I)Lm0/q;

    invoke-virtual {p0, p3}, Lu0/b;->f(Lm0/m;)V

    invoke-virtual {p3, p0}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    invoke-static {v1, v1}, Ld7/t;->G(II)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-static {v0, v1}, Ld7/t;->G(II)I

    move-result v0

    :goto_0
    or-int/2addr v0, p4

    iget-object v1, p0, Lu0/b;->c:Ljava/lang/Object;

    const-string v2, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'p2\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, kotlin.Any?>"

    invoke-static {v1, v2}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x4

    invoke-static {v2, v1}, Lz6/a;->f(ILjava/lang/Object;)V

    check-cast v1, Lc9/g;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, p1, p2, p3, v0}, Lc9/g;->g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p3}, Lm0/q;->x()Lm0/x1;

    move-result-object p3

    if-eqz p3, :cond_1

    new-instance v7, La0/g0;

    const/4 v3, 0x4

    move-object v1, v7

    move v2, p4

    move-object v4, p0

    move-object v5, p1

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, La0/g0;-><init>(IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v7, p3, Lm0/x1;->d:Lc9/e;

    :cond_1
    return-object v0
.end method

.method public final bridge synthetic c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;)Ljava/lang/Object;
    .locals 8

    move-object v6, p6

    check-cast v6, Lm0/m;

    invoke-virtual {p7}, Ljava/lang/Number;->intValue()I

    move-result v7

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v7}, Lu0/b;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lm0/m;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ljava/lang/Object;Lm0/m;I)Ljava/lang/Object;
    .locals 3

    check-cast p2, Lm0/q;

    iget v0, p0, Lu0/b;->a:I

    invoke-virtual {p2, v0}, Lm0/q;->a0(I)Lm0/q;

    invoke-virtual {p0, p2}, Lu0/b;->f(Lm0/m;)V

    invoke-virtual {p2, p0}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    invoke-static {v0, v1}, Ld7/t;->G(II)I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-static {v1, v1}, Ld7/t;->G(II)I

    move-result v0

    :goto_0
    or-int/2addr v0, p3

    iget-object v1, p0, Lu0/b;->c:Ljava/lang/Object;

    const-string v2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \'p1\')] kotlin.Any?, @[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, kotlin.Any?>"

    invoke-static {v1, v2}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x3

    invoke-static {v2, v1}, Lz6/a;->f(ILjava/lang/Object;)V

    check-cast v1, Lc9/f;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, p1, p2, v0}, Lc9/f;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p2}, Lm0/q;->x()Lm0/x1;

    move-result-object p2

    if-eqz p2, :cond_1

    new-instance v1, Lu/x;

    const/4 v2, 0x6

    invoke-direct {v1, p0, p1, p3, v2}, Lu/x;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v1, p2, Lm0/x1;->d:Lc9/e;

    :cond_1
    return-object v0
.end method

.method public final bridge synthetic e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Lm0/m;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lu0/b;->d(Ljava/lang/Object;Lm0/m;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final f(Lm0/m;)V
    .locals 4

    iget-boolean v0, p0, Lu0/b;->b:Z

    if-eqz v0, :cond_4

    check-cast p1, Lm0/q;

    invoke-virtual {p1}, Lm0/q;->D()Lm0/x1;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, v0, Lm0/x1;->a:I

    or-int/lit8 p1, p1, 0x1

    iput p1, v0, Lm0/x1;->a:I

    iget-object p1, p0, Lu0/b;->d:Lm0/x1;

    invoke-static {p1, v0}, Ld7/t;->n0(Lm0/w1;Lm0/x1;)Z

    move-result p1

    if-eqz p1, :cond_0

    iput-object v0, p0, Lu0/b;->d:Lm0/x1;

    goto :goto_1

    :cond_0
    iget-object p1, p0, Lu0/b;->e:Ljava/util/ArrayList;

    if-nez p1, :cond_1

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lu0/b;->e:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm0/w1;

    invoke-static {v3, v0}, Ld7/t;->n0(Lm0/w1;Lm0/x1;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p1, v2, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    :goto_1
    return-void
.end method

.method public final bridge synthetic g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p3, Lm0/m;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lu0/b;->b(Ljava/lang/Object;Ljava/lang/Object;Lm0/m;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p1, Lm0/q;

    iget v0, p0, Lu0/b;->a:I

    invoke-virtual {p1, v0}, Lm0/q;->a0(I)Lm0/q;

    invoke-virtual {p0, p1}, Lu0/b;->f(Lm0/m;)V

    invoke-virtual {p1, p0}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    if-eqz v0, :cond_0

    invoke-static {v2, v1}, Ld7/t;->G(II)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-static {v0, v1}, Ld7/t;->G(II)I

    move-result v0

    :goto_0
    or-int/2addr p2, v0

    iget-object v0, p0, Lu0/b;->c:Ljava/lang/Object;

    const-string v1, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \'c\')] androidx.compose.runtime.Composer, @[ParameterName(name = \'changed\')] kotlin.Int, kotlin.Any?>"

    invoke-static {v0, v1}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v0}, Lz6/a;->f(ILjava/lang/Object;)V

    check-cast v0, Lc9/e;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Lc9/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1}, Lm0/q;->x()Lm0/x1;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {v2, p0}, Lz6/a;->f(ILjava/lang/Object;)V

    iput-object p0, p1, Lm0/x1;->d:Lc9/e;

    :cond_1
    return-object p2
.end method
