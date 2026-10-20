.class public final Ly/m1;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:Ly/n1;

.field public final synthetic b:I

.field public final synthetic c:Lr1/x0;

.field public final synthetic d:I

.field public final synthetic e:Lr1/l0;


# direct methods
.method public constructor <init>(Ly/n1;ILr1/x0;ILr1/l0;)V
    .locals 0

    iput-object p1, p0, Ly/m1;->a:Ly/n1;

    iput p2, p0, Ly/m1;->b:I

    iput-object p3, p0, Ly/m1;->c:Lr1/x0;

    iput p4, p0, Ly/m1;->d:I

    iput-object p5, p0, Ly/m1;->e:Lr1/l0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    check-cast p1, Lr1/w0;

    iget-object v0, p0, Ly/m1;->a:Ly/n1;

    iget-object v0, v0, Ly/n1;->w:Lc9/e;

    iget-object v1, p0, Ly/m1;->c:Lr1/x0;

    iget v2, v1, Lr1/x0;->a:I

    iget v3, p0, Ly/m1;->b:I

    sub-int/2addr v3, v2

    iget v2, v1, Lr1/x0;->b:I

    iget v4, p0, Ly/m1;->d:I

    sub-int/2addr v4, v2

    invoke-static {v3, v4}, Lo1/s;->e(II)J

    move-result-wide v2

    new-instance v4, Lm2/k;

    invoke-direct {v4, v2, v3}, Lm2/k;-><init>(J)V

    iget-object v2, p0, Ly/m1;->e:Lr1/l0;

    invoke-interface {v2}, Lr1/q;->getLayoutDirection()Lm2/l;

    move-result-object v2

    invoke-interface {v0, v4, v2}, Lc9/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm2/i;

    iget-wide v2, v0, Lm2/i;->a:J

    invoke-static {p1, v1, v2, v3}, Lr1/w0;->f(Lr1/w0;Lr1/x0;J)V

    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
