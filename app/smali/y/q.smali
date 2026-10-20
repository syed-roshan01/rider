.class public final Ly/q;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:Lr1/x0;

.field public final synthetic b:Lr1/i0;

.field public final synthetic c:Lr1/l0;

.field public final synthetic d:I

.field public final synthetic e:I

.field public final synthetic f:Ly/s;


# direct methods
.method public constructor <init>(Lr1/x0;Lr1/i0;Lr1/l0;IILy/s;)V
    .locals 0

    iput-object p1, p0, Ly/q;->a:Lr1/x0;

    iput-object p2, p0, Ly/q;->b:Lr1/i0;

    iput-object p3, p0, Ly/q;->c:Lr1/l0;

    iput p4, p0, Ly/q;->d:I

    iput p5, p0, Ly/q;->e:I

    iput-object p6, p0, Ly/q;->f:Ly/s;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    move-object v0, p1

    check-cast v0, Lr1/w0;

    iget-object v1, p0, Ly/q;->a:Lr1/x0;

    iget-object v2, p0, Ly/q;->b:Lr1/i0;

    iget-object p1, p0, Ly/q;->c:Lr1/l0;

    invoke-interface {p1}, Lr1/q;->getLayoutDirection()Lm2/l;

    move-result-object v3

    iget v4, p0, Ly/q;->d:I

    iget v5, p0, Ly/q;->e:I

    iget-object p1, p0, Ly/q;->f:Ly/s;

    iget-object v6, p1, Ly/s;->a:Ly0/d;

    invoke-static/range {v0 .. v6}, Ly/p;->b(Lr1/w0;Lr1/x0;Lr1/i0;Lm2/l;IILy0/d;)V

    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
