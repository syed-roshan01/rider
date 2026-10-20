.class public final Landroidx/fragment/app/i;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/fragment/app/o1;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/o1;Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/i;->a:Landroidx/fragment/app/o1;

    iput-object p2, p0, Landroidx/fragment/app/i;->b:Landroid/view/View;

    iput-object p3, p0, Landroidx/fragment/app/i;->c:Landroid/graphics/Rect;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/i;->a:Landroidx/fragment/app/o1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Landroidx/fragment/app/i;->b:Landroid/view/View;

    iget-object v1, p0, Landroidx/fragment/app/i;->c:Landroid/graphics/Rect;

    invoke-static {v0, v1}, Landroidx/fragment/app/o1;->g(Landroid/view/View;Landroid/graphics/Rect;)V

    return-void
.end method
