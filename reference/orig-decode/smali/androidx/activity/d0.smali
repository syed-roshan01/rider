.class public final Landroidx/activity/d0;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/window/OnBackAnimationCallback;


# instance fields
.field public final synthetic a:Lc9/c;

.field public final synthetic b:Lc9/c;

.field public final synthetic c:Lc9/a;

.field public final synthetic d:Lc9/a;


# direct methods
.method public constructor <init>(Lc9/c;Lc9/c;Lc9/a;Lc9/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/activity/d0;->a:Lc9/c;

    iput-object p2, p0, Landroidx/activity/d0;->b:Lc9/c;

    iput-object p3, p0, Landroidx/activity/d0;->c:Lc9/a;

    iput-object p4, p0, Landroidx/activity/d0;->d:Lc9/a;

    return-void
.end method


# virtual methods
.method public final onBackCancelled()V
    .locals 1

    iget-object v0, p0, Landroidx/activity/d0;->d:Lc9/a;

    invoke-interface {v0}, Lc9/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public final onBackInvoked()V
    .locals 1

    iget-object v0, p0, Landroidx/activity/d0;->c:Lc9/a;

    invoke-interface {v0}, Lc9/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public final onBackProgressed(Landroid/window/BackEvent;)V
    .locals 2

    const-string v0, "backEvent"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/activity/d0;->b:Lc9/c;

    new-instance v1, Landroidx/activity/b;

    invoke-direct {v1, p1}, Landroidx/activity/b;-><init>(Landroid/window/BackEvent;)V

    invoke-interface {v0, v1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final onBackStarted(Landroid/window/BackEvent;)V
    .locals 2

    const-string v0, "backEvent"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/activity/d0;->a:Lc9/c;

    new-instance v1, Landroidx/activity/b;

    invoke-direct {v1, p1}, Landroidx/activity/b;-><init>(Landroid/window/BackEvent;)V

    invoke-interface {v0, v1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
