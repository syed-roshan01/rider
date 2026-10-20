.class public abstract Lv/j;
.super Lt1/o;

# interfaces
.implements Lt1/p1;
.implements Lt1/m;


# instance fields
.field public A:Lc9/f;

.field public B:Lc9/f;

.field public C:Z

.field public final D:Lv/a;

.field public final E:Lt/l0;

.field public final F:Lp1/d;

.field public G:Z

.field public final H:Lo1/d0;

.field public final I:Lo9/c;

.field public J:Lx/b;

.field public w:Lc9/c;

.field public x:Z

.field public y:Lx/m;

.field public z:Lc9/a;


# direct methods
.method public constructor <init>(Lv/q0;ZLx/m;Lc9/a;Lc9/f;Lc9/f;Z)V
    .locals 0

    invoke-direct {p0}, Lt1/o;-><init>()V

    iput-object p1, p0, Lv/j;->w:Lc9/c;

    iput-boolean p2, p0, Lv/j;->x:Z

    iput-object p3, p0, Lv/j;->y:Lx/m;

    iput-object p4, p0, Lv/j;->z:Lc9/a;

    iput-object p5, p0, Lv/j;->A:Lc9/f;

    iput-object p6, p0, Lv/j;->B:Lc9/f;

    iput-boolean p7, p0, Lv/j;->C:Z

    new-instance p1, Lv/a;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lv/a;-><init>(Lv/j;I)V

    iput-object p1, p0, Lv/j;->D:Lv/a;

    new-instance p1, Lt/l0;

    const/4 p2, 0x3

    invoke-direct {p1, p0, p2}, Lt/l0;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lv/j;->E:Lt/l0;

    new-instance p1, Lp1/d;

    invoke-direct {p1}, Lp1/d;-><init>()V

    iput-object p1, p0, Lv/j;->F:Lp1/d;

    new-instance p1, Lv/d;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lv/d;-><init>(Lv/j;Lu8/e;)V

    sget-object p3, Lo1/c0;->a:Lo1/k;

    new-instance p3, Lo1/j0;

    invoke-direct {p3, p1}, Lo1/j0;-><init>(Lc9/e;)V

    invoke-virtual {p0, p3}, Lt1/o;->G0(Ly0/n;)V

    iput-object p3, p0, Lv/j;->H:Lo1/d0;

    const p1, 0x7fffffff

    const/4 p3, 0x6

    invoke-static {p1, p2, p3}, Lz6/a;->a(ILo9/a;I)Lo9/c;

    move-result-object p1

    iput-object p1, p0, Lv/j;->I:Lo9/c;

    return-void
.end method

.method public static final H0(Lv/j;Lu8/e;Lm9/d0;)Ljava/lang/Object;
    .locals 8

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v0, p1, Lv/e;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lv/e;

    iget v1, v0, Lv/e;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lv/e;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lv/e;

    invoke-direct {v0, p0, p1}, Lv/e;-><init>(Lv/j;Lu8/e;)V

    :goto_0
    iget-object p1, v0, Lv/e;->c:Ljava/lang/Object;

    sget-object v1, Lv8/a;->a:Lv8/a;

    iget v2, v0, Lv/e;->e:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p2, v0, Lv/e;->b:Lm9/d0;

    iget-object p0, v0, Lv/e;->a:Lv/j;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p1, p0, Lv/j;->J:Lx/b;

    if-eqz p1, :cond_5

    iget-object v2, p0, Lv/j;->y:Lx/m;

    if-eqz v2, :cond_4

    new-instance v6, Lx/a;

    invoke-direct {v6, p1}, Lx/a;-><init>(Lx/b;)V

    iput-object p0, v0, Lv/e;->a:Lv/j;

    iput-object p2, v0, Lv/e;->b:Lm9/d0;

    iput v4, v0, Lv/e;->e:I

    invoke-virtual {v2, v6, v0}, Lx/m;->a(Lx/k;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_3

    :cond_4
    :goto_1
    iput-object v5, p0, Lv/j;->J:Lx/b;

    :cond_5
    iget-object p0, p0, Lv/j;->B:Lc9/f;

    sget-wide v6, Lm2/p;->b:J

    new-instance p1, Lm2/p;

    invoke-direct {p1, v6, v7}, Lm2/p;-><init>(J)V

    iput-object v5, v0, Lv/e;->a:Lv/j;

    iput-object v5, v0, Lv/e;->b:Lm9/d0;

    iput v3, v0, Lv/e;->e:I

    invoke-interface {p0, p2, p1, v0}, Lc9/f;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_6

    goto :goto_3

    :cond_6
    :goto_2
    sget-object v1, Lq8/l;->a:Lq8/l;

    :goto_3
    return-object v1
.end method

.method public static final I0(Lv/j;Lm9/d0;Lv/b0;Lu8/e;)Ljava/lang/Object;
    .locals 8

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v0, p3, Lv/f;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lv/f;

    iget v1, v0, Lv/f;->n:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lv/f;->n:I

    goto :goto_0

    :cond_0
    new-instance v0, Lv/f;

    invoke-direct {v0, p0, p3}, Lv/f;-><init>(Lv/j;Lu8/e;)V

    :goto_0
    iget-object p3, v0, Lv/f;->e:Ljava/lang/Object;

    sget-object v1, Lv8/a;->a:Lv8/a;

    iget v2, v0, Lv/f;->n:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v0, Lv/f;->d:Lx/b;

    iget-object p1, v0, Lv/f;->c:Lv/b0;

    iget-object p2, v0, Lv/f;->b:Lm9/d0;

    iget-object v2, v0, Lv/f;->a:Lv/j;

    invoke-static {p3}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object p2, v0, Lv/f;->c:Lv/b0;

    iget-object p1, v0, Lv/f;->b:Lm9/d0;

    iget-object p0, v0, Lv/f;->a:Lv/j;

    invoke-static {p3}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p3}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p3, p0, Lv/j;->J:Lx/b;

    if-eqz p3, :cond_5

    iget-object v2, p0, Lv/j;->y:Lx/m;

    if-eqz v2, :cond_5

    new-instance v6, Lx/a;

    invoke-direct {v6, p3}, Lx/a;-><init>(Lx/b;)V

    iput-object p0, v0, Lv/f;->a:Lv/j;

    iput-object p1, v0, Lv/f;->b:Lm9/d0;

    iput-object p2, v0, Lv/f;->c:Lv/b0;

    iput v5, v0, Lv/f;->n:I

    invoke-virtual {v2, v6, v0}, Lx/m;->a(Lx/k;Lu8/e;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_5

    goto :goto_4

    :cond_5
    :goto_1
    new-instance p3, Lx/b;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    iget-object v2, p0, Lv/j;->y:Lx/m;

    if-eqz v2, :cond_7

    iput-object p0, v0, Lv/f;->a:Lv/j;

    iput-object p1, v0, Lv/f;->b:Lm9/d0;

    iput-object p2, v0, Lv/f;->c:Lv/b0;

    iput-object p3, v0, Lv/f;->d:Lx/b;

    iput v4, v0, Lv/f;->n:I

    invoke-virtual {v2, p3, v0}, Lx/m;->a(Lx/k;Lu8/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_6

    goto :goto_4

    :cond_6
    move-object v2, p0

    move-object p0, p3

    move-object v7, p2

    move-object p2, p1

    move-object p1, v7

    :goto_2
    move-object p3, p0

    move-object p0, v2

    move-object v7, p2

    move-object p2, p1

    move-object p1, v7

    :cond_7
    iput-object p3, p0, Lv/j;->J:Lx/b;

    iget-object p0, p0, Lv/j;->A:Lc9/f;

    iget-wide p2, p2, Lv/b0;->b:J

    new-instance v2, Ld1/c;

    invoke-direct {v2, p2, p3}, Ld1/c;-><init>(J)V

    const/4 p2, 0x0

    iput-object p2, v0, Lv/f;->a:Lv/j;

    iput-object p2, v0, Lv/f;->b:Lm9/d0;

    iput-object p2, v0, Lv/f;->c:Lv/b0;

    iput-object p2, v0, Lv/f;->d:Lx/b;

    iput v3, v0, Lv/f;->n:I

    invoke-interface {p0, p1, v2, v0}, Lc9/f;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_8

    goto :goto_4

    :cond_8
    :goto_3
    sget-object v1, Lq8/l;->a:Lq8/l;

    :goto_4
    return-object v1
.end method

.method public static final J0(Lv/j;Lm9/d0;Lv/c0;Lu8/e;)Ljava/lang/Object;
    .locals 7

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v0, p3, Lv/g;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lv/g;

    iget v1, v0, Lv/g;->f:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lv/g;->f:I

    goto :goto_0

    :cond_0
    new-instance v0, Lv/g;

    invoke-direct {v0, p0, p3}, Lv/g;-><init>(Lv/j;Lu8/e;)V

    :goto_0
    iget-object p3, v0, Lv/g;->d:Ljava/lang/Object;

    sget-object v1, Lv8/a;->a:Lv8/a;

    iget v2, v0, Lv/g;->f:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p2, v0, Lv/g;->c:Lv/c0;

    iget-object p1, v0, Lv/g;->b:Lm9/d0;

    iget-object p0, v0, Lv/g;->a:Lv/j;

    invoke-static {p3}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p3, p0, Lv/j;->J:Lx/b;

    if-eqz p3, :cond_5

    iget-object v2, p0, Lv/j;->y:Lx/m;

    if-eqz v2, :cond_4

    new-instance v6, Lx/c;

    invoke-direct {v6, p3}, Lx/c;-><init>(Lx/b;)V

    iput-object p0, v0, Lv/g;->a:Lv/j;

    iput-object p1, v0, Lv/g;->b:Lm9/d0;

    iput-object p2, v0, Lv/g;->c:Lv/c0;

    iput v4, v0, Lv/g;->f:I

    invoke-virtual {v2, v6, v0}, Lx/m;->a(Lx/k;Lu8/e;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    goto :goto_3

    :cond_4
    :goto_1
    iput-object v5, p0, Lv/j;->J:Lx/b;

    :cond_5
    iget-object p0, p0, Lv/j;->B:Lc9/f;

    iget-wide p2, p2, Lv/c0;->b:J

    new-instance v2, Lm2/p;

    invoke-direct {v2, p2, p3}, Lm2/p;-><init>(J)V

    iput-object v5, v0, Lv/g;->a:Lv/j;

    iput-object v5, v0, Lv/g;->b:Lm9/d0;

    iput-object v5, v0, Lv/g;->c:Lv/c0;

    iput v3, v0, Lv/g;->f:I

    invoke-interface {p0, p1, v2, v0}, Lc9/f;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_6

    goto :goto_3

    :cond_6
    :goto_2
    sget-object v1, Lq8/l;->a:Lq8/l;

    :goto_3
    return-object v1
.end method


# virtual methods
.method public final A0()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lv/j;->G:Z

    invoke-virtual {p0}, Lv/j;->K0()V

    return-void
.end method

.method public final K0()V
    .locals 3

    iget-object v0, p0, Lv/j;->J:Lx/b;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lv/j;->y:Lx/m;

    if-eqz v1, :cond_0

    new-instance v2, Lx/a;

    invoke-direct {v2, v0}, Lx/a;-><init>(Lx/b;)V

    invoke-virtual {v1, v2}, Lx/m;->b(Lx/k;)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lv/j;->J:Lx/b;

    :cond_1
    return-void
.end method

.method public final b0()V
    .locals 1

    iget-object v0, p0, Lv/j;->H:Lo1/d0;

    check-cast v0, Lo1/j0;

    invoke-virtual {v0}, Lo1/j0;->b0()V

    return-void
.end method

.method public final y(Lo1/k;Lo1/l;J)V
    .locals 1

    iget-object v0, p0, Lv/j;->H:Lo1/d0;

    check-cast v0, Lo1/j0;

    invoke-virtual {v0, p1, p2, p3, p4}, Lo1/j0;->y(Lo1/k;Lo1/l;J)V

    return-void
.end method
