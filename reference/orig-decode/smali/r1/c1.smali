.class public final Lr1/c1;
.super Lt1/f0;


# static fields
.field public static final b:Lr1/c1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lr1/c1;

    const-string v1, "Undefined intrinsics block and it is required"

    invoke-direct {v0, v1}, Lt1/f0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lr1/c1;->b:Lr1/c1;

    return-void
.end method


# virtual methods
.method public final e(Lr1/l0;Ljava/util/List;J)Lr1/k0;
    .locals 7

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    sget-object v1, Lr8/s;->a:Lr8/s;

    if-eqz v0, :cond_0

    invoke-static {p3, p4}, Lm2/a;->k(J)I

    move-result p2

    invoke-static {p3, p4}, Lm2/a;->j(J)I

    move-result p3

    sget-object p4, Lr1/y0;->c:Lr1/y0;

    invoke-interface {p1, p2, p3, v1, p4}, Lr1/l0;->N(IILjava/util/Map;Lc9/c;)Lr1/k0;

    move-result-object p1

    goto/16 :goto_2

    :cond_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v2, :cond_1

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lr1/i0;

    invoke-interface {p2, p3, p4}, Lr1/i0;->f(J)Lr1/x0;

    move-result-object p2

    iget v0, p2, Lr1/x0;->a:I

    invoke-static {v0, p3, p4}, Lo1/s;->q(IJ)I

    move-result v0

    iget v2, p2, Lr1/x0;->b:I

    invoke-static {v2, p3, p4}, Lo1/s;->p(IJ)I

    move-result p3

    new-instance p4, Ls/z;

    const/16 v2, 0x9

    invoke-direct {p4, p2, v2}, Ls/z;-><init>(Lr1/x0;I)V

    invoke-interface {p1, v0, p3, v1, p4}, Lr1/l0;->N(IILjava/util/Map;Lc9/c;)Lr1/k0;

    move-result-object p1

    goto :goto_2

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_2

    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lr1/i0;

    invoke-interface {v5, p3, p4}, Lr1/i0;->f(J)Lr1/x0;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p2

    move v2, v3

    move v4, v2

    :goto_1
    if-ge v3, p2, :cond_3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lr1/x0;

    iget v6, v5, Lr1/x0;->a:I

    invoke-static {v6, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    iget v5, v5, Lr1/x0;->b:I

    invoke-static {v5, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    invoke-static {v2, p3, p4}, Lo1/s;->q(IJ)I

    move-result p2

    invoke-static {v4, p3, p4}, Lo1/s;->p(IJ)I

    move-result p3

    new-instance p4, Ls/x;

    const/4 v2, 0x3

    invoke-direct {p4, v2, v0}, Ls/x;-><init>(ILjava/util/List;)V

    invoke-interface {p1, p2, p3, v1, p4}, Lr1/l0;->N(IILjava/util/Map;Lc9/c;)Lr1/k0;

    move-result-object p1

    :goto_2
    return-object p1
.end method
