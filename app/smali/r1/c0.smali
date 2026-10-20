.class public final Lr1/c0;
.super Lt1/f0;


# instance fields
.field public final synthetic b:Lr1/f0;

.field public final synthetic c:Lc9/e;


# direct methods
.method public constructor <init>(Lr1/f0;Lc9/e;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lr1/c0;->b:Lr1/f0;

    iput-object p2, p0, Lr1/c0;->c:Lc9/e;

    invoke-direct {p0, p3}, Lt1/f0;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final e(Lr1/l0;Ljava/util/List;J)Lr1/k0;
    .locals 6

    iget-object v2, p0, Lr1/c0;->b:Lr1/f0;

    iget-object p2, v2, Lr1/f0;->o:Lr1/a0;

    invoke-interface {p1}, Lr1/q;->getLayoutDirection()Lm2/l;

    move-result-object v0

    iput-object v0, p2, Lr1/a0;->a:Lm2/l;

    invoke-interface {p1}, Lm2/b;->c()F

    move-result p2

    iget-object v0, v2, Lr1/f0;->o:Lr1/a0;

    iput p2, v0, Lr1/a0;->b:F

    invoke-interface {p1}, Lm2/b;->m()F

    move-result p2

    iput p2, v0, Lr1/a0;->c:F

    invoke-interface {p1}, Lr1/q;->q()Z

    move-result p1

    iget-object p2, p0, Lr1/c0;->c:Lc9/e;

    const/4 v1, 0x0

    if-nez p1, :cond_0

    iget-object p1, v2, Lr1/f0;->a:Landroidx/compose/ui/node/a;

    iget-object p1, p1, Landroidx/compose/ui/node/a;->c:Landroidx/compose/ui/node/a;

    if-eqz p1, :cond_0

    iput v1, v2, Lr1/f0;->e:I

    new-instance p1, Lm2/a;

    invoke-direct {p1, p3, p4}, Lm2/a;-><init>(J)V

    iget-object p3, v2, Lr1/f0;->p:Lr1/y;

    invoke-interface {p2, p3, p1}, Lc9/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Lr1/k0;

    iget v3, v2, Lr1/f0;->e:I

    new-instance p1, Lr1/b0;

    const/4 v5, 0x0

    move-object v0, p1

    move-object v1, v4

    invoke-direct/range {v0 .. v5}, Lr1/b0;-><init>(Lr1/k0;Lr1/f0;ILr1/k0;I)V

    return-object p1

    :cond_0
    iput v1, v2, Lr1/f0;->d:I

    new-instance p1, Lm2/a;

    invoke-direct {p1, p3, p4}, Lm2/a;-><init>(J)V

    invoke-interface {p2, v0, p1}, Lc9/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Lr1/k0;

    iget v3, v2, Lr1/f0;->d:I

    new-instance p1, Lr1/b0;

    const/4 v5, 0x1

    move-object v0, p1

    move-object v1, v4

    invoke-direct/range {v0 .. v5}, Lr1/b0;-><init>(Lr1/k0;Lr1/f0;ILr1/k0;I)V

    return-object p1
.end method
