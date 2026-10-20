.class public final Lt1/m0;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# instance fields
.field public final synthetic a:Lt1/n0;

.field public final synthetic b:J


# direct methods
.method public constructor <init>(Lt1/n0;J)V
    .locals 0

    iput-object p1, p0, Lt1/m0;->a:Lt1/n0;

    iput-wide p2, p0, Lt1/m0;->b:J

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lt1/m0;->a:Lt1/n0;

    invoke-virtual {v0}, Lt1/n0;->a()Lt1/c1;

    move-result-object v0

    invoke-virtual {v0}, Lt1/c1;->I0()Lt1/r0;

    move-result-object v0

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-wide v1, p0, Lt1/m0;->b:J

    check-cast v0, Lt1/w;

    invoke-virtual {v0, v1, v2}, Lt1/w;->f(J)Lr1/x0;

    sget-object v0, Lq8/l;->a:Lq8/l;

    return-object v0
.end method
