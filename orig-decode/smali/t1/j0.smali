.class public final Lt1/j0;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# instance fields
.field public final synthetic a:Lt1/n0;

.field public final synthetic b:Lt1/l1;

.field public final synthetic c:J


# direct methods
.method public constructor <init>(Lt1/n0;Lt1/l1;J)V
    .locals 0

    iput-object p1, p0, Lt1/j0;->a:Lt1/n0;

    iput-object p2, p0, Lt1/j0;->b:Lt1/l1;

    iput-wide p3, p0, Lt1/j0;->c:J

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lt1/j0;->a:Lt1/n0;

    iget-object v1, v0, Lt1/n0;->a:Landroidx/compose/ui/node/a;

    invoke-static {v1}, Lt1/g;->v(Landroidx/compose/ui/node/a;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lt1/n0;->a()Lt1/c1;

    move-result-object v1

    iget-object v1, v1, Lt1/c1;->r:Lt1/c1;

    if-eqz v1, :cond_1

    iget-object v2, v1, Lt1/q0;->o:Lr1/g0;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lt1/n0;->a()Lt1/c1;

    move-result-object v1

    iget-object v1, v1, Lt1/c1;->r:Lt1/c1;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lt1/c1;->I0()Lt1/r0;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v2, v1, Lt1/q0;->o:Lr1/g0;

    :cond_1
    :goto_0
    if-nez v2, :cond_2

    iget-object v1, p0, Lt1/j0;->b:Lt1/l1;

    check-cast v1, Lu1/w;

    invoke-virtual {v1}, Lu1/w;->getPlacementScope()Lr1/w0;

    move-result-object v2

    :cond_2
    invoke-virtual {v0}, Lt1/n0;->a()Lt1/c1;

    move-result-object v0

    invoke-virtual {v0}, Lt1/c1;->I0()Lt1/r0;

    move-result-object v0

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-wide v3, p0, Lt1/j0;->c:J

    invoke-static {v2, v0, v3, v4}, Lr1/w0;->f(Lr1/w0;Lr1/x0;J)V

    sget-object v0, Lq8/l;->a:Lq8/l;

    return-object v0
.end method
