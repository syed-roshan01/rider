.class public abstract Lr1/x0;
.super Ljava/lang/Object;

# interfaces
.implements Lr1/m0;


# instance fields
.field public a:I

.field public b:I

.field public c:J

.field public d:J

.field public e:J


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    invoke-static {v0, v0}, Lo1/s;->e(II)J

    move-result-wide v0

    iput-wide v0, p0, Lr1/x0;->c:J

    sget-wide v0, Lr1/z0;->a:J

    iput-wide v0, p0, Lr1/x0;->d:J

    sget v0, Lm2/i;->c:I

    sget-wide v0, Lm2/i;->b:J

    iput-wide v0, p0, Lr1/x0;->e:J

    return-void
.end method


# virtual methods
.method public a0()I
    .locals 4

    iget-wide v0, p0, Lr1/x0;->c:J

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method

.method public b0()I
    .locals 3

    iget-wide v0, p0, Lr1/x0;->c:J

    const/16 v2, 0x20

    shr-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method

.method public final c0()V
    .locals 9

    iget-wide v0, p0, Lr1/x0;->c:J

    const/16 v2, 0x20

    shr-long/2addr v0, v2

    long-to-int v0, v0

    iget-wide v3, p0, Lr1/x0;->d:J

    invoke-static {v3, v4}, Lm2/a;->k(J)I

    move-result v1

    iget-wide v3, p0, Lr1/x0;->d:J

    invoke-static {v3, v4}, Lm2/a;->i(J)I

    move-result v3

    invoke-static {v0, v1, v3}, Lz6/a;->r(III)I

    move-result v0

    iput v0, p0, Lr1/x0;->a:I

    iget-wide v0, p0, Lr1/x0;->c:J

    const-wide v3, 0xffffffffL

    and-long/2addr v0, v3

    long-to-int v0, v0

    iget-wide v5, p0, Lr1/x0;->d:J

    invoke-static {v5, v6}, Lm2/a;->j(J)I

    move-result v1

    iget-wide v5, p0, Lr1/x0;->d:J

    invoke-static {v5, v6}, Lm2/a;->h(J)I

    move-result v5

    invoke-static {v0, v1, v5}, Lz6/a;->r(III)I

    move-result v0

    iput v0, p0, Lr1/x0;->b:I

    iget v1, p0, Lr1/x0;->a:I

    iget-wide v5, p0, Lr1/x0;->c:J

    shr-long v7, v5, v2

    long-to-int v2, v7

    sub-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x2

    and-long v2, v5, v3

    long-to-int v2, v2

    sub-int/2addr v0, v2

    div-int/lit8 v0, v0, 0x2

    invoke-static {v1, v0}, Li1/b;->c(II)J

    move-result-wide v0

    iput-wide v0, p0, Lr1/x0;->e:J

    return-void
.end method

.method public abstract d0(JFLc9/c;)V
.end method

.method public final g0(J)V
    .locals 2

    iget-wide v0, p0, Lr1/x0;->c:J

    invoke-static {v0, v1, p1, p2}, Lm2/k;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    iput-wide p1, p0, Lr1/x0;->c:J

    invoke-virtual {p0}, Lr1/x0;->c0()V

    :cond_0
    return-void
.end method

.method public final h0(J)V
    .locals 2

    iget-wide v0, p0, Lr1/x0;->d:J

    invoke-static {v0, v1, p1, p2}, Lm2/a;->c(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    iput-wide p1, p0, Lr1/x0;->d:J

    invoke-virtual {p0}, Lr1/x0;->c0()V

    :cond_0
    return-void
.end method
