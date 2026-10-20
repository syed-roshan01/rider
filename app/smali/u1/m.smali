.class public final synthetic Lu1/m;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic a:Lu1/w;


# direct methods
.method public synthetic constructor <init>(Lu1/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu1/m;->a:Lu1/w;

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 1

    iget-object v0, p0, Lu1/m;->a:Lu1/w;

    invoke-virtual {v0}, Lu1/w;->D()V

    return-void
.end method
