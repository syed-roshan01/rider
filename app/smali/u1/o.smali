.class public final synthetic Lu1/o;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;


# instance fields
.field public final synthetic a:Lu1/w;


# direct methods
.method public synthetic constructor <init>(Lu1/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu1/o;->a:Lu1/w;

    return-void
.end method


# virtual methods
.method public final onTouchModeChanged(Z)V
    .locals 2

    iget-object v0, p0, Lu1/o;->a:Lu1/w;

    iget-object v0, v0, Lu1/w;->o0:Ll1/c;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Ll1/a;

    invoke-direct {v1, p1}, Ll1/a;-><init>(I)V

    iget-object p1, v0, Ll1/c;->a:Lm0/n1;

    invoke-virtual {p1, v1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    return-void
.end method
