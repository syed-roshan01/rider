.class public final synthetic Lb5/c;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic a:Lcom/auto/accept/service/OverlayService;

.field public final synthetic b:Landroid/view/WindowManager$LayoutParams;


# direct methods
.method public synthetic constructor <init>(Lcom/auto/accept/service/OverlayService;Landroid/view/WindowManager$LayoutParams;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb5/c;->a:Lcom/auto/accept/service/OverlayService;

    iput-object p2, p0, Lb5/c;->b:Landroid/view/WindowManager$LayoutParams;

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2

    iget-object v0, p0, Lb5/c;->a:Lcom/auto/accept/service/OverlayService;

    iget-object v1, p0, Lb5/c;->b:Landroid/view/WindowManager$LayoutParams;

    invoke-static {v0, v1, p1, p2}, Lcom/auto/accept/service/OverlayService;->b(Lcom/auto/accept/service/OverlayService;Landroid/view/WindowManager$LayoutParams;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method
