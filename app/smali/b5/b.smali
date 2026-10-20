.class public final synthetic Lb5/b;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/auto/accept/service/OverlayService;


# direct methods
.method public synthetic constructor <init>(Lcom/auto/accept/service/OverlayService;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lb5/b;->a:I

    iput-object p1, p0, Lb5/b;->b:Lcom/auto/accept/service/OverlayService;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget v0, p0, Lb5/b;->a:I

    iget-object v1, p0, Lb5/b;->b:Lcom/auto/accept/service/OverlayService;

    packed-switch v0, :pswitch_data_0

    invoke-static {v1, p1}, Lcom/auto/accept/service/OverlayService;->a(Lcom/auto/accept/service/OverlayService;Landroid/view/View;)V

    return-void

    :pswitch_0
    invoke-static {v1, p1}, Lcom/auto/accept/service/OverlayService;->c(Lcom/auto/accept/service/OverlayService;Landroid/view/View;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
