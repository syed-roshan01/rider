.class public final Lr1/n;
.super Lr1/x0;


# direct methods
.method public constructor <init>(III)V
    .locals 1

    const/4 v0, 0x1

    if-eq p3, v0, :cond_1

    const/4 v0, 0x2

    if-eq p3, v0, :cond_0

    invoke-direct {p0}, Lr1/x0;-><init>()V

    invoke-static {p1, p2}, Lo1/s;->e(II)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lr1/x0;->g0(J)V

    return-void

    :cond_0
    invoke-direct {p0}, Lr1/x0;-><init>()V

    invoke-static {p1, p2}, Lo1/s;->e(II)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lr1/x0;->g0(J)V

    return-void

    :cond_1
    invoke-direct {p0}, Lr1/x0;-><init>()V

    invoke-static {p1, p2}, Lo1/s;->e(II)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lr1/x0;->g0(J)V

    return-void
.end method


# virtual methods
.method public final d0(JFLc9/c;)V
    .locals 0

    return-void
.end method

.method public final p(Lr1/a;)I
    .locals 0

    const/high16 p1, -0x80000000

    return p1
.end method
