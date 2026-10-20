.class public final Lv/e2;
.super Lt1/o;

# interfaces
.implements Lt1/f1;
.implements Lt1/m;
.implements Lc1/j;
.implements Lm1/c;


# instance fields
.field public A:Z

.field public B:Lv/y0;

.field public C:Lx/m;

.field public final D:Ln1/d;

.field public final E:Lv/u;

.field public final F:Lv/l2;

.field public final G:Lv/b2;

.field public final H:Lv/s;

.field public final I:Lv/b1;

.field public final J:Lv/u1;

.field public w:Lv/f2;

.field public x:Lv/h1;

.field public y:Lu/b2;

.field public z:Z


# direct methods
.method public constructor <init>(Lv/f2;Lv/h1;Lu/b2;ZZLv/y0;Lx/m;Lv/o;)V
    .locals 2

    invoke-direct {p0}, Lt1/o;-><init>()V

    iput-object p1, p0, Lv/e2;->w:Lv/f2;

    iput-object p2, p0, Lv/e2;->x:Lv/h1;

    iput-object p3, p0, Lv/e2;->y:Lu/b2;

    iput-boolean p4, p0, Lv/e2;->z:Z

    iput-boolean p5, p0, Lv/e2;->A:Z

    iput-object p6, p0, Lv/e2;->B:Lv/y0;

    iput-object p7, p0, Lv/e2;->C:Lx/m;

    new-instance v0, Ln1/d;

    invoke-direct {v0}, Ln1/d;-><init>()V

    iput-object v0, p0, Lv/e2;->D:Ln1/d;

    new-instance p1, Lv/u;

    sget-object p2, Landroidx/compose/foundation/gestures/a;->e:Lv/y1;

    new-instance p3, Ls/z0;

    invoke-direct {p3, p2}, Ls/z0;-><init>(Lm2/b;)V

    new-instance p2, Lt/y;

    invoke-direct {p2, p3}, Lt/y;-><init>(Ls/z0;)V

    invoke-direct {p1, p2}, Lv/u;-><init>(Lt/y;)V

    iput-object p1, p0, Lv/e2;->E:Lv/u;

    new-instance v1, Lv/l2;

    iget-object p2, p0, Lv/e2;->w:Lv/f2;

    iget-object p3, p0, Lv/e2;->x:Lv/h1;

    iget-object p4, p0, Lv/e2;->y:Lu/b2;

    iget-boolean p5, p0, Lv/e2;->A:Z

    iget-object p6, p0, Lv/e2;->B:Lv/y0;

    if-nez p6, :cond_0

    move-object p6, p1

    :cond_0
    move-object p1, v1

    move-object p7, v0

    invoke-direct/range {p1 .. p7}, Lv/l2;-><init>(Lv/f2;Lv/h1;Lu/b2;ZLv/y0;Ln1/d;)V

    iput-object v1, p0, Lv/e2;->F:Lv/l2;

    iget-boolean p1, p0, Lv/e2;->z:Z

    new-instance p2, Lv/b2;

    invoke-direct {p2, v1, p1}, Lv/b2;-><init>(Lv/l2;Z)V

    iput-object p2, p0, Lv/e2;->G:Lv/b2;

    new-instance p1, Lv/s;

    iget-object p3, p0, Lv/e2;->x:Lv/h1;

    iget-object p4, p0, Lv/e2;->w:Lv/f2;

    iget-boolean p5, p0, Lv/e2;->A:Z

    invoke-direct {p1, p3, p4, p5, p8}, Lv/s;-><init>(Lv/h1;Lv/f2;ZLv/o;)V

    invoke-virtual {p0, p1}, Lt1/o;->G0(Ly0/n;)V

    iput-object p1, p0, Lv/e2;->H:Lv/s;

    new-instance p3, Lv/b1;

    iget-boolean p4, p0, Lv/e2;->z:Z

    invoke-direct {p3, p4}, Lv/b1;-><init>(Z)V

    invoke-virtual {p0, p3}, Lt1/o;->G0(Ly0/n;)V

    iput-object p3, p0, Lv/e2;->I:Lv/b1;

    sget-object p3, Ln1/i;->a:Ls1/i;

    new-instance p3, Ln1/g;

    invoke-direct {p3, p2, v0}, Ln1/g;-><init>(Ln1/a;Ln1/d;)V

    invoke-virtual {p0, p3}, Lt1/o;->G0(Ly0/n;)V

    new-instance p2, Lc1/p;

    invoke-direct {p2}, Lc1/p;-><init>()V

    invoke-virtual {p0, p2}, Lt1/o;->G0(Ly0/n;)V

    new-instance p2, Lc0/m;

    invoke-direct {p2, p1}, Lc0/m;-><init>(Lv/s;)V

    invoke-virtual {p0, p2}, Lt1/o;->G0(Ly0/n;)V

    new-instance p1, Lu/x0;

    new-instance p2, Lq/w;

    const/16 p3, 0xa

    invoke-direct {p2, p0, p3}, Lq/w;-><init>(Ljava/lang/Object;I)V

    invoke-direct {p1, p2}, Lu/x0;-><init>(Lq/w;)V

    invoke-virtual {p0, p1}, Lt1/o;->G0(Ly0/n;)V

    iget-object p6, p0, Lv/e2;->C:Lx/m;

    iget-object p3, p0, Lv/e2;->x:Lv/h1;

    iget-boolean p4, p0, Lv/e2;->z:Z

    new-instance p7, Lv/u1;

    move-object p1, p7

    move-object p2, v1

    move-object p5, v0

    invoke-direct/range {p1 .. p6}, Lv/u1;-><init>(Lv/l2;Lv/h1;ZLn1/d;Lx/m;)V

    invoke-virtual {p0, p7}, Lt1/o;->G0(Ly0/n;)V

    iput-object p7, p0, Lv/e2;->J:Lv/u1;

    return-void
.end method


# virtual methods
.method public final G()V
    .locals 2

    sget-object v0, Lu1/s1;->e:Lm0/m3;

    invoke-static {p0, v0}, Lt1/g;->p(Lt1/m;Lm0/u1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm2/b;

    new-instance v1, Ls/z0;

    invoke-direct {v1, v0}, Ls/z0;-><init>(Lm2/b;)V

    new-instance v0, Lt/y;

    invoke-direct {v0, v1}, Lt/y;-><init>(Ls/z0;)V

    iget-object v1, p0, Lv/e2;->E:Lv/u;

    iput-object v0, v1, Lv/u;->a:Lt/y;

    return-void
.end method

.method public final M(Landroid/view/KeyEvent;)Z
    .locals 8

    iget-boolean v0, p0, Lv/e2;->z:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-static {v0}, Landroidx/compose/ui/input/key/a;->a(I)J

    move-result-wide v2

    sget-wide v4, Lm1/a;->l:J

    invoke-static {v2, v3, v4, v5}, Lm1/a;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-static {v0}, Landroidx/compose/ui/input/key/a;->a(I)J

    move-result-wide v2

    sget-wide v4, Lm1/a;->k:J

    invoke-static {v2, v3, v4, v5}, Lm1/a;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_0
    invoke-static {p1}, Landroidx/compose/ui/input/key/a;->b(Landroid/view/KeyEvent;)I

    move-result v0

    const/4 v2, 0x2

    invoke-static {v0, v2}, Lz6/a;->B(II)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Landroid/view/KeyEvent;->isCtrlPressed()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lv/e2;->x:Lv/h1;

    sget-object v2, Lv/h1;->a:Lv/h1;

    const/4 v3, 0x0

    iget-object v4, p0, Lv/e2;->H:Lv/s;

    if-ne v0, v2, :cond_2

    iget-wide v4, v4, Lv/s;->D:J

    const-wide v6, 0xffffffffL

    and-long/2addr v4, v6

    long-to-int v0, v4

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result p1

    invoke-static {p1}, Landroidx/compose/ui/input/key/a;->a(I)J

    move-result-wide v4

    sget-wide v6, Lm1/a;->k:J

    invoke-static {v4, v5, v6, v7}, Lm1/a;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_1

    int-to-float p1, v0

    goto :goto_0

    :cond_1
    int-to-float p1, v0

    neg-float p1, p1

    :goto_0
    invoke-static {v3, p1}, Ld9/i;->f(FF)J

    move-result-wide v2

    goto :goto_2

    :cond_2
    iget-wide v4, v4, Lv/s;->D:J

    const/16 v0, 0x20

    shr-long/2addr v4, v0

    long-to-int v0, v4

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result p1

    invoke-static {p1}, Landroidx/compose/ui/input/key/a;->a(I)J

    move-result-wide v4

    sget-wide v6, Lm1/a;->k:J

    invoke-static {v4, v5, v6, v7}, Lm1/a;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_3

    int-to-float p1, v0

    goto :goto_1

    :cond_3
    int-to-float p1, v0

    neg-float p1, p1

    :goto_1
    invoke-static {p1, v3}, Ld9/i;->f(FF)J

    move-result-wide v2

    :goto_2
    invoke-virtual {p0}, Ly0/n;->v0()Lm9/d0;

    move-result-object p1

    new-instance v0, Lv/d2;

    iget-object v4, p0, Lv/e2;->F:Lv/l2;

    const/4 v5, 0x0

    invoke-direct {v0, v4, v2, v3, v5}, Lv/d2;-><init>(Lv/l2;JLu8/e;)V

    const/4 v2, 0x3

    invoke-static {p1, v5, v1, v0, v2}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    const/4 v1, 0x1

    :cond_4
    return v1
.end method

.method public final l(Landroid/view/KeyEvent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final s0(Lc1/h;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lc1/h;->b(Z)V

    return-void
.end method

.method public final z0()V
    .locals 2

    sget-object v0, Lu1/s1;->e:Lm0/m3;

    invoke-static {p0, v0}, Lt1/g;->p(Lt1/m;Lm0/u1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm2/b;

    new-instance v1, Ls/z0;

    invoke-direct {v1, v0}, Ls/z0;-><init>(Lm2/b;)V

    new-instance v0, Lt/y;

    invoke-direct {v0, v1}, Lt/y;-><init>(Ls/z0;)V

    iget-object v1, p0, Lv/e2;->E:Lv/u;

    iput-object v0, v1, Lv/u;->a:Lt/y;

    new-instance v0, Lt/l0;

    const/4 v1, 0x6

    invoke-direct {v0, p0, v1}, Lt/l0;-><init>(Ljava/lang/Object;I)V

    invoke-static {p0, v0}, Lt1/g;->w(Ly0/n;Lc9/a;)V

    return-void
.end method
