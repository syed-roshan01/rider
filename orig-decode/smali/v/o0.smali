.class public final Lv/o0;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lo9/c;Z)V
    .locals 0

    iput-object p1, p0, Lv/o0;->b:Ljava/lang/Object;

    iput-object p2, p0, Lv/o0;->c:Ljava/lang/Object;

    iput-boolean p3, p0, Lv/o0;->a:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    check-cast p1, Lo1/u;

    iget-object v0, p0, Lv/o0;->b:Ljava/lang/Object;

    check-cast v0, Lp1/d;

    invoke-static {v0, p1}, Lp1/e;->a(Lp1/d;Lo1/u;)V

    invoke-static {p1}, Lm9/e0;->t(Lo1/u;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lm9/e0;->I(Lo1/u;Z)J

    move-result-wide v0

    invoke-virtual {p1}, Lo1/u;->a()V

    iget-object p1, p0, Lv/o0;->c:Ljava/lang/Object;

    check-cast p1, Lo9/t;

    new-instance v2, Lv/a0;

    iget-boolean v3, p0, Lv/o0;->a:Z

    if-eqz v3, :cond_0

    const/high16 v3, -0x40800000    # -1.0f

    invoke-static {v3, v0, v1}, Ld1/c;->h(FJ)J

    move-result-wide v0

    :cond_0
    invoke-direct {v2, v0, v1}, Lv/a0;-><init>(J)V

    invoke-interface {p1, v2}, Lo9/t;->n(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
