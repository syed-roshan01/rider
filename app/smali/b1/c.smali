.class public final Lb1/c;
.super Ly0/n;

# interfaces
.implements Lb1/b;
.implements Lt1/f1;
.implements Lb1/a;


# instance fields
.field public final u:Lb1/d;

.field public v:Z

.field public w:Lc9/c;


# direct methods
.method public constructor <init>(Lb1/d;Lc9/c;)V
    .locals 0

    invoke-direct {p0}, Ly0/n;-><init>()V

    iput-object p1, p0, Lb1/c;->u:Lb1/d;

    iput-object p2, p0, Lb1/c;->w:Lc9/c;

    iput-object p0, p1, Lb1/d;->a:Lb1/a;

    return-void
.end method


# virtual methods
.method public final G()V
    .locals 0

    invoke-virtual {p0}, Lb1/c;->G0()V

    return-void
.end method

.method public final G0()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lb1/c;->v:Z

    iget-object v0, p0, Lb1/c;->u:Lb1/d;

    const/4 v1, 0x0

    iput-object v1, v0, Lb1/d;->b:Lb1/g;

    invoke-static {p0}, Lt1/g;->s(Lt1/s;)V

    return-void
.end method

.method public final c()Lm2/b;
    .locals 1

    invoke-static {p0}, Lt1/g;->y(Lt1/n;)Landroidx/compose/ui/node/a;

    move-result-object v0

    iget-object v0, v0, Landroidx/compose/ui/node/a;->x:Lm2/b;

    return-object v0
.end method

.method public final e()J
    .locals 2

    const/16 v0, 0x80

    invoke-static {p0, v0}, Lt1/g;->x(Lt1/n;I)Lt1/c1;

    move-result-object v0

    iget-wide v0, v0, Lr1/x0;->c:J

    invoke-static {v0, v1}, Lo1/s;->m0(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final getLayoutDirection()Lm2/l;
    .locals 1

    invoke-static {p0}, Lt1/g;->y(Lt1/n;)Landroidx/compose/ui/node/a;

    move-result-object v0

    iget-object v0, v0, Landroidx/compose/ui/node/a;->y:Lm2/l;

    return-object v0
.end method

.method public final i(Lg1/e;)V
    .locals 3

    iget-boolean v0, p0, Lb1/c;->v:Z

    iget-object v1, p0, Lb1/c;->u:Lb1/d;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    iput-object v0, v1, Lb1/d;->b:Lb1/g;

    new-instance v0, Lu/r0;

    const/16 v2, 0x9

    invoke-direct {v0, v2, p0, v1}, Lu/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0, v0}, Lt1/g;->w(Ly0/n;Lc9/a;)V

    iget-object v0, v1, Lb1/d;->b:Lb1/g;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lb1/c;->v:Z

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "DrawResult not defined, did you forget to call onDraw?"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v0, v1, Lb1/d;->b:Lb1/g;

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v0, v0, Lb1/g;->a:Lc9/c;

    invoke-interface {v0, p1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final j0()V
    .locals 0

    invoke-virtual {p0}, Lb1/c;->G0()V

    return-void
.end method
