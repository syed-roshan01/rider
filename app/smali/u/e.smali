.class public abstract Lu/e;
.super Lt1/o;

# interfaces
.implements Ls1/f;
.implements Lt1/m;
.implements Lt1/p1;


# instance fields
.field public final A:Lt/l0;

.field public final B:Lo1/d0;

.field public w:Z

.field public x:Lx/m;

.field public y:Lc9/a;

.field public final z:Lu/a;


# direct methods
.method public constructor <init>(ZLx/m;Lc9/a;Lu/a;)V
    .locals 0

    invoke-direct {p0}, Lt1/o;-><init>()V

    iput-boolean p1, p0, Lu/e;->w:Z

    iput-object p2, p0, Lu/e;->x:Lx/m;

    iput-object p3, p0, Lu/e;->y:Lc9/a;

    iput-object p4, p0, Lu/e;->z:Lu/a;

    new-instance p1, Lt/l0;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Lt/l0;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lu/e;->A:Lt/l0;

    new-instance p1, Lu/d;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lu/d;-><init>(Lu/e;Lu8/e;)V

    sget-object p2, Lo1/c0;->a:Lo1/k;

    new-instance p2, Lo1/j0;

    invoke-direct {p2, p1}, Lo1/j0;-><init>(Lc9/e;)V

    invoke-virtual {p0, p2}, Lt1/o;->G0(Ly0/n;)V

    iput-object p2, p0, Lu/e;->B:Lo1/d0;

    return-void
.end method


# virtual methods
.method public final b0()V
    .locals 1

    iget-object v0, p0, Lu/e;->B:Lo1/d0;

    check-cast v0, Lo1/j0;

    invoke-virtual {v0}, Lo1/j0;->b0()V

    return-void
.end method

.method public final y(Lo1/k;Lo1/l;J)V
    .locals 1

    iget-object v0, p0, Lu/e;->B:Lo1/d0;

    check-cast v0, Lo1/j0;

    invoke-virtual {v0, p1, p2, p3, p4}, Lo1/j0;->y(Lo1/k;Lo1/l;J)V

    return-void
.end method
