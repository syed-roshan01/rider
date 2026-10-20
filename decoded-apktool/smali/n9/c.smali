.class public final synthetic Ln9/c;
.super Ljava/lang/Object;

# interfaces
.implements Lm9/o0;


# instance fields
.field public final synthetic a:Ln9/d;

.field public final synthetic b:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Ln9/d;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln9/c;->a:Ln9/d;

    iput-object p2, p0, Ln9/c;->b:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Ln9/c;->a:Ln9/d;

    iget-object v0, v0, Ln9/d;->c:Landroid/os/Handler;

    iget-object v1, p0, Ln9/c;->b:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method
