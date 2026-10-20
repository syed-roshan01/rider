.class public final Lo1/o;
.super Ly0/n;

# interfaces
.implements Lt1/u1;
.implements Lt1/p1;
.implements Lt1/m;


# instance fields
.field public u:Lo1/q;

.field public v:Z

.field public w:Z


# direct methods
.method public constructor <init>(Lo1/q;Z)V
    .locals 0

    invoke-direct {p0}, Ly0/n;-><init>()V

    iput-object p1, p0, Lo1/o;->u:Lo1/q;

    iput-boolean p2, p0, Lo1/o;->v:Z

    return-void
.end method


# virtual methods
.method public final A0()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lo1/o;->w:Z

    invoke-virtual {p0}, Lo1/o;->H0()V

    return-void
.end method

.method public final G0()V
    .locals 3

    new-instance v0, Ld9/u;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lo1/n;

    const/4 v2, 0x2

    invoke-direct {v1, v2, v0}, Lo1/n;-><init>(ILd9/u;)V

    invoke-static {p0, v1}, Lt1/g;->B(Lt1/u1;Lo1/n;)V

    iget-object v0, v0, Ld9/u;->a:Ljava/lang/Object;

    check-cast v0, Lo1/o;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lo1/o;->u:Lo1/q;

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lo1/o;->u:Lo1/q;

    :cond_1
    sget-object v1, Lu1/s1;->r:Lm0/m3;

    invoke-static {p0, v1}, Lt1/g;->p(Lt1/m;Lm0/u1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo1/r;

    if-eqz v1, :cond_3

    check-cast v1, Lu1/t;

    if-nez v0, :cond_2

    sget-object v0, Lo1/q;->a:Lo1/p;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lo1/s;->a:Lo1/a;

    :cond_2
    sget-object v2, Lu1/u0;->a:Lu1/u0;

    iget-object v1, v1, Lu1/t;->a:Lu1/w;

    invoke-virtual {v2, v1, v0}, Lu1/u0;->a(Landroid/view/View;Lo1/q;)V

    :cond_3
    return-void
.end method

.method public final H0()V
    .locals 3

    new-instance v0, Ld9/u;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lo1/n;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v0}, Lo1/n;-><init>(ILd9/u;)V

    invoke-static {p0, v1}, Lt1/g;->B(Lt1/u1;Lo1/n;)V

    iget-object v0, v0, Ld9/u;->a:Ljava/lang/Object;

    check-cast v0, Lo1/o;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lo1/o;->G0()V

    sget-object v0, Lq8/l;->a:Lq8/l;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    sget-object v0, Lu1/s1;->r:Lm0/m3;

    invoke-static {p0, v0}, Lt1/g;->p(Lt1/m;Lm0/u1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo1/r;

    if-eqz v0, :cond_1

    check-cast v0, Lu1/t;

    sget-object v1, Lo1/q;->a:Lo1/p;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lo1/s;->a:Lo1/a;

    sget-object v2, Lu1/u0;->a:Lu1/u0;

    iget-object v0, v0, Lu1/t;->a:Lu1/w;

    invoke-virtual {v2, v0, v1}, Lu1/u0;->a(Landroid/view/View;Lo1/q;)V

    :cond_1
    return-void
.end method

.method public final I0()V
    .locals 2

    new-instance v0, Ld9/q;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x1

    iput-boolean v1, v0, Ld9/q;->a:Z

    iget-boolean v1, p0, Lo1/o;->v:Z

    if-nez v1, :cond_0

    new-instance v1, Lh0/f0;

    invoke-direct {v1, v0}, Lh0/f0;-><init>(Ld9/q;)V

    invoke-static {p0, v1}, Lt1/g;->D(Lt1/u1;Lc9/c;)V

    :cond_0
    iget-boolean v0, v0, Ld9/q;->a:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lo1/o;->G0()V

    :cond_1
    return-void
.end method

.method public final b0()V
    .locals 0

    return-void
.end method

.method public final bridge synthetic o()Ljava/lang/Object;
    .locals 1

    const-string v0, "androidx.compose.ui.input.pointer.PointerHoverIcon"

    return-object v0
.end method

.method public final y(Lo1/k;Lo1/l;J)V
    .locals 0

    sget-object p3, Lo1/l;->b:Lo1/l;

    if-ne p2, p3, :cond_1

    iget p2, p1, Lo1/k;->c:I

    const/4 p3, 0x4

    invoke-static {p2, p3}, Lo1/s;->t(II)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lo1/o;->w:Z

    invoke-virtual {p0}, Lo1/o;->I0()V

    goto :goto_0

    :cond_0
    iget p1, p1, Lo1/k;->c:I

    const/4 p2, 0x5

    invoke-static {p1, p2}, Lo1/s;->t(II)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    iput-boolean p1, p0, Lo1/o;->w:Z

    invoke-virtual {p0}, Lo1/o;->H0()V

    :cond_1
    :goto_0
    return-void
.end method
