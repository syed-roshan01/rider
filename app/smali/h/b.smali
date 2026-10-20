.class public final Lh/b;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/graphics/drawable/Drawable$Callback;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lh/b;->a:I

    iput-object p1, p0, Lh/b;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 3

    iget v0, p0, Lh/b;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "d"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lh/b;->b:Ljava/lang/Object;

    check-cast p1, Lh5/a;

    iget-object v0, p1, Lh5/a;->n:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iget-object p1, p1, Lh5/a;->n:Lm0/n1;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    iget-object p1, p0, Lh/b;->b:Ljava/lang/Object;

    check-cast p1, Lh5/a;

    iget-object v0, p1, Lh5/a;->f:Landroid/graphics/drawable/Drawable;

    sget-object v1, Lh5/c;->a:Lq8/c;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    if-ltz v1, :cond_0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    if-ltz v1, :cond_0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    int-to-float v0, v0

    invoke-static {v1, v0}, Ld7/t;->j(FF)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    sget-wide v0, Ld1/f;->c:J

    :goto_0
    new-instance v2, Ld1/f;

    invoke-direct {v2, v0, v1}, Ld1/f;-><init>(J)V

    iget-object p1, p1, Lh5/a;->o:Lm0/n1;

    invoke-virtual {p1, v2}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    return-void

    :pswitch_0
    iget-object p1, p0, Lh/b;->b:Ljava/lang/Object;

    check-cast p1, Lg4/a;

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :pswitch_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final scheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V
    .locals 1

    iget v0, p0, Lh/b;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "d"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "what"

    invoke-static {p2, p1}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lh5/c;->a:Lq8/c;

    invoke-interface {p1}, Lq8/c;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Handler;

    invoke-virtual {p1, p2, p3, p4}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;J)Z

    return-void

    :pswitch_0
    iget-object p1, p0, Lh/b;->b:Ljava/lang/Object;

    check-cast p1, Lg4/a;

    invoke-virtual {p1, p2, p3, p4}, Landroid/graphics/drawable/Drawable;->scheduleSelf(Ljava/lang/Runnable;J)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lh/b;->b:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/drawable/Drawable$Callback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2, p3, p4}, Landroid/graphics/drawable/Drawable$Callback;->scheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V

    :cond_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final unscheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V
    .locals 1

    iget v0, p0, Lh/b;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "d"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "what"

    invoke-static {p2, p1}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lh5/c;->a:Lq8/c;

    invoke-interface {p1}, Lq8/c;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Handler;

    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void

    :pswitch_0
    iget-object p1, p0, Lh/b;->b:Ljava/lang/Object;

    check-cast p1, Lg4/a;

    invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable;->unscheduleSelf(Ljava/lang/Runnable;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lh/b;->b:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/drawable/Drawable$Callback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Landroid/graphics/drawable/Drawable$Callback;->unscheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V

    :cond_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
