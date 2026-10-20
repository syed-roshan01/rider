.class public final Lu1/u;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lu1/w;


# direct methods
.method public synthetic constructor <init>(Lu1/w;I)V
    .locals 0

    iput p2, p0, Lu1/u;->a:I

    iput-object p1, p0, Lu1/u;->b:Lu1/w;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lu1/u;->a:I

    iget-object v1, p0, Lu1/u;->b:Lu1/w;

    packed-switch v0, :pswitch_data_0

    invoke-static {v1}, Lu1/w;->e(Lu1/w;)Lu1/q;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, v1, Lu1/w;->r0:Landroid/view/MotionEvent;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v2, 0x7

    if-eq v0, v2, :cond_0

    const/16 v2, 0x9

    if-eq v0, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    iput-wide v2, v1, Lu1/w;->s0:J

    iget-object v0, v1, Lu1/w;->v0:Lh/a;

    invoke-virtual {v1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_1
    :goto_0
    sget-object v0, Lq8/l;->a:Lq8/l;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
