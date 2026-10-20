.class public final Lu1/l0;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lu1/p0;


# direct methods
.method public synthetic constructor <init>(Lu1/p0;I)V
    .locals 0

    iput p2, p0, Lu1/l0;->a:I

    iput-object p1, p0, Lu1/l0;->b:Lu1/p0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lu1/l0;->a:I

    iget-object v1, p0, Lu1/l0;->b:Lu1/p0;

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lu1/r2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p1, Lu1/r2;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, v1, Lu1/p0;->d:Lu1/w;

    invoke-virtual {v0}, Lu1/w;->getSnapshotObserver()Lt1/n1;

    move-result-object v0

    new-instance v2, Lu/r0;

    const/16 v3, 0xf

    invoke-direct {v2, v3, p1, v1}, Lu/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, v1, Lu1/p0;->V:Lu1/l0;

    invoke-virtual {v0, p1, v1, v2}, Lt1/n1;->a(Lt1/m1;Lc9/c;Lc9/a;)V

    :goto_0
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1

    :pswitch_0
    check-cast p1, Landroid/view/accessibility/AccessibilityEvent;

    iget-object v0, v1, Lu1/p0;->d:Lu1/w;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    iget-object v1, v1, Lu1/p0;->d:Lu1/w;

    invoke-interface {v0, v1, p1}, Landroid/view/ViewParent;->requestSendAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
