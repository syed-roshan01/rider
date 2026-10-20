.class public final Lu/i;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:Lu/j;


# direct methods
.method public synthetic constructor <init>(Lu/j;)V
    .locals 0

    iput-object p1, p0, Lu/i;->a:Lu/j;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    check-cast p1, Lm2/k;

    iget-wide v0, p1, Lm2/k;->a:J

    invoke-static {v0, v1}, Lo1/s;->m0(J)J

    move-result-wide v2

    iget-object p1, p0, Lu/i;->a:Lu/j;

    iget-wide v4, p1, Lu/j;->p:J

    invoke-static {v2, v3, v4, v5}, Ld1/f;->a(JJ)Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    invoke-static {v0, v1}, Lo1/s;->m0(J)J

    move-result-wide v3

    iput-wide v3, p1, Lu/j;->p:J

    if-eqz v2, :cond_0

    const/16 v3, 0x20

    shr-long v3, v0, v3

    long-to-int v3, v3

    const-wide v4, 0xffffffffL

    and-long/2addr v0, v4

    long-to-int v0, v0

    iget-object v1, p1, Lu/j;->c:Landroid/widget/EdgeEffect;

    invoke-virtual {v1, v3, v0}, Landroid/widget/EdgeEffect;->setSize(II)V

    iget-object v1, p1, Lu/j;->d:Landroid/widget/EdgeEffect;

    invoke-virtual {v1, v3, v0}, Landroid/widget/EdgeEffect;->setSize(II)V

    iget-object v1, p1, Lu/j;->e:Landroid/widget/EdgeEffect;

    invoke-virtual {v1, v0, v3}, Landroid/widget/EdgeEffect;->setSize(II)V

    iget-object v1, p1, Lu/j;->f:Landroid/widget/EdgeEffect;

    invoke-virtual {v1, v0, v3}, Landroid/widget/EdgeEffect;->setSize(II)V

    iget-object v1, p1, Lu/j;->h:Landroid/widget/EdgeEffect;

    invoke-virtual {v1, v3, v0}, Landroid/widget/EdgeEffect;->setSize(II)V

    iget-object v1, p1, Lu/j;->i:Landroid/widget/EdgeEffect;

    invoke-virtual {v1, v3, v0}, Landroid/widget/EdgeEffect;->setSize(II)V

    iget-object v1, p1, Lu/j;->j:Landroid/widget/EdgeEffect;

    invoke-virtual {v1, v0, v3}, Landroid/widget/EdgeEffect;->setSize(II)V

    iget-object v1, p1, Lu/j;->k:Landroid/widget/EdgeEffect;

    invoke-virtual {v1, v0, v3}, Landroid/widget/EdgeEffect;->setSize(II)V

    :cond_0
    if-eqz v2, :cond_1

    invoke-virtual {p1}, Lu/j;->i()V

    invoke-virtual {p1}, Lu/j;->e()V

    :cond_1
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
