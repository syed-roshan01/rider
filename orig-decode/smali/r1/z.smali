.class public final Lr1/z;
.super Ljava/lang/Object;

# interfaces
.implements Lr1/k0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/util/Map;

.field public final synthetic d:Lr1/a0;

.field public final synthetic e:Lr1/f0;

.field public final synthetic f:Lc9/c;


# direct methods
.method public constructor <init>(IILjava/util/Map;Lr1/a0;Lr1/f0;Lc9/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lr1/z;->a:I

    iput p2, p0, Lr1/z;->b:I

    iput-object p3, p0, Lr1/z;->c:Ljava/util/Map;

    iput-object p4, p0, Lr1/z;->d:Lr1/a0;

    iput-object p5, p0, Lr1/z;->e:Lr1/f0;

    iput-object p6, p0, Lr1/z;->f:Lc9/c;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lr1/z;->b:I

    return v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lr1/z;->a:I

    return v0
.end method

.method public final d()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lr1/z;->c:Ljava/util/Map;

    return-object v0
.end method

.method public final e()V
    .locals 3

    iget-object v0, p0, Lr1/z;->d:Lr1/a0;

    invoke-virtual {v0}, Lr1/a0;->q()Z

    move-result v0

    iget-object v1, p0, Lr1/z;->f:Lc9/c;

    iget-object v2, p0, Lr1/z;->e:Lr1/f0;

    if-eqz v0, :cond_0

    iget-object v0, v2, Lr1/f0;->a:Landroidx/compose/ui/node/a;

    iget-object v0, v0, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v0, v0, Lt1/x0;->b:Lt1/x;

    iget-object v0, v0, Lt1/x;->O:Lt1/r0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lt1/q0;->o:Lr1/g0;

    invoke-interface {v1, v0}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    iget-object v0, v2, Lr1/f0;->a:Landroidx/compose/ui/node/a;

    iget-object v0, v0, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v0, v0, Lt1/x0;->b:Lt1/x;

    iget-object v0, v0, Lt1/q0;->o:Lr1/g0;

    invoke-interface {v1, v0}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
