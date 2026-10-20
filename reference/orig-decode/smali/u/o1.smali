.class public final Lu/o1;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lu/q1;


# direct methods
.method public synthetic constructor <init>(Lu/q1;I)V
    .locals 0

    iput p2, p0, Lu/o1;->a:I

    iput-object p1, p0, Lu/o1;->b:Lu/q1;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lu/o1;->a:I

    iget-object v1, p0, Lu/o1;->b:Lu/q1;

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, Lu/q1;->E:Landroid/view/View;

    sget-object v2, Lu1/y0;->f:Lm0/m3;

    invoke-static {v1, v2}, Lt1/g;->p(Lt1/m;Lm0/u1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    iput-object v2, v1, Lu/q1;->E:Landroid/view/View;

    iget-object v3, v1, Lu/q1;->F:Lm2/b;

    sget-object v4, Lu1/s1;->e:Lm0/m3;

    invoke-static {v1, v4}, Lt1/g;->p(Lt1/m;Lm0/u1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lm2/b;

    iput-object v4, v1, Lu/q1;->F:Lm2/b;

    iget-object v5, v1, Lu/q1;->G:Lu/c2;

    if-eqz v5, :cond_0

    invoke-static {v2, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {v4, v3}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-virtual {v1}, Lu/q1;->G0()V

    :cond_1
    invoke-virtual {v1}, Lu/q1;->H0()V

    sget-object v0, Lq8/l;->a:Lq8/l;

    return-object v0

    :pswitch_0
    iget-wide v0, v1, Lu/q1;->I:J

    new-instance v2, Ld1/c;

    invoke-direct {v2, v0, v1}, Ld1/c;-><init>(J)V

    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
