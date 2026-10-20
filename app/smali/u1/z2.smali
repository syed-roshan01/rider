.class public final Lu1/z2;
.super Landroid/view/ViewOutlineProvider;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lu1/z2;->a:I

    invoke-direct {p0}, Landroid/view/ViewOutlineProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public final getOutline(Landroid/view/View;Landroid/graphics/Outline;)V
    .locals 3

    iget v0, p0, Lu1/z2;->a:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    invoke-virtual {p2, v2, v2, v0, p1}, Landroid/graphics/Outline;->setRect(IIII)V

    invoke-virtual {p2, v1}, Landroid/graphics/Outline;->setAlpha(F)V

    return-void

    :pswitch_0
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    invoke-virtual {p2, v2, v2, v0, p1}, Landroid/graphics/Outline;->setRect(IIII)V

    invoke-virtual {p2, v1}, Landroid/graphics/Outline;->setAlpha(F)V

    return-void

    :pswitch_1
    const-string v0, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer"

    invoke-static {p1, v0}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lu1/b3;

    iget-object p1, p1, Lu1/b3;->e:Lu1/j2;

    invoke-virtual {p1}, Lu1/j2;->b()Landroid/graphics/Outline;

    move-result-object p1

    invoke-static {p1}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-virtual {p2, p1}, Landroid/graphics/Outline;->set(Landroid/graphics/Outline;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
