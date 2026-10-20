.class public final Lo2/q;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# instance fields
.field public final synthetic a:Ld9/t;

.field public final synthetic b:Lo2/r;

.field public final synthetic c:Lm2/j;

.field public final synthetic d:J


# direct methods
.method public constructor <init>(Ld9/t;Lo2/r;Lm2/j;JJ)V
    .locals 0

    iput-object p1, p0, Lo2/q;->a:Ld9/t;

    iput-object p2, p0, Lo2/q;->b:Lo2/r;

    iput-object p3, p0, Lo2/q;->c:Lm2/j;

    iput-wide p6, p0, Lo2/q;->d:J

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lo2/q;->b:Lo2/r;

    invoke-virtual {v0}, Lo2/r;->getPositionProvider()Lo2/t;

    move-result-object v1

    invoke-virtual {v0}, Lo2/r;->getParentLayoutDirection()Lm2/l;

    check-cast v1, Lh0/j;

    iget-object v0, v1, Lh0/j;->b:Lh0/m;

    invoke-interface {v0}, Lh0/m;->a()J

    move-result-wide v2

    invoke-static {v2, v3}, Ld9/i;->u(J)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v2, v1, Lh0/j;->c:J

    :goto_0
    iput-wide v2, v1, Lh0/j;->c:J

    iget-object v0, v1, Lh0/j;->a:Lh0/k;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/16 v1, 0x20

    if-eqz v0, :cond_3

    const/4 v4, 0x1

    iget-wide v5, p0, Lo2/q;->d:J

    if-eq v0, v4, :cond_2

    const/4 v4, 0x2

    if-ne v0, v4, :cond_1

    shr-long/2addr v5, v1

    long-to-int v0, v5

    div-int/2addr v0, v4

    goto :goto_1

    :cond_1
    new-instance v0, Landroidx/fragment/app/a0;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    :cond_2
    shr-long v4, v5, v1

    long-to-int v0, v4

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    invoke-static {v2, v3}, Ld1/c;->d(J)F

    move-result v4

    invoke-static {v4}, Ld7/t;->p0(F)I

    move-result v4

    invoke-static {v2, v3}, Ld1/c;->e(J)F

    move-result v2

    invoke-static {v2}, Ld7/t;->p0(F)I

    move-result v2

    invoke-static {v4, v2}, Li1/b;->c(II)J

    move-result-wide v2

    iget-object v4, p0, Lo2/q;->c:Lm2/j;

    iget v5, v4, Lm2/j;->a:I

    sget v6, Lm2/i;->c:I

    shr-long v6, v2, v1

    long-to-int v1, v6

    add-int/2addr v5, v1

    sub-int/2addr v5, v0

    const-wide v0, 0xffffffffL

    and-long/2addr v0, v2

    long-to-int v0, v0

    iget v1, v4, Lm2/j;->b:I

    add-int/2addr v1, v0

    invoke-static {v5, v1}, Li1/b;->c(II)J

    move-result-wide v0

    iget-object v2, p0, Lo2/q;->a:Ld9/t;

    iput-wide v0, v2, Ld9/t;->a:J

    sget-object v0, Lq8/l;->a:Lq8/l;

    return-object v0
.end method
