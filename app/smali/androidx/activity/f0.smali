.class public final Landroidx/activity/f0;
.super Ljava/lang/Object;

# interfaces
.implements Landroidx/lifecycle/u;
.implements Landroidx/activity/c;


# instance fields
.field public final a:Landroidx/lifecycle/r;

.field public final b:Landroidx/activity/y;

.field public c:Landroidx/activity/g0;

.field public final synthetic d:Landroidx/activity/i0;


# direct methods
.method public constructor <init>(Landroidx/activity/i0;Landroidx/lifecycle/r;Landroidx/activity/y;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "onBackPressedCallback"

    invoke-static {p3, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Landroidx/activity/f0;->d:Landroidx/activity/i0;

    iput-object p2, p0, Landroidx/activity/f0;->a:Landroidx/lifecycle/r;

    iput-object p3, p0, Landroidx/activity/f0;->b:Landroidx/activity/y;

    invoke-virtual {p2, p0}, Landroidx/lifecycle/r;->a(Landroidx/lifecycle/v;)V

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 1

    iget-object v0, p0, Landroidx/activity/f0;->a:Landroidx/lifecycle/r;

    invoke-virtual {v0, p0}, Landroidx/lifecycle/r;->c(Landroidx/lifecycle/v;)V

    iget-object v0, p0, Landroidx/activity/f0;->b:Landroidx/activity/y;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Landroidx/activity/y;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Landroidx/activity/f0;->c:Landroidx/activity/g0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/activity/g0;->cancel()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/activity/f0;->c:Landroidx/activity/g0;

    return-void
.end method

.method public final onStateChanged(Landroidx/lifecycle/w;Landroidx/lifecycle/p;)V
    .locals 3

    sget-object p1, Landroidx/lifecycle/p;->ON_START:Landroidx/lifecycle/p;

    if-ne p2, p1, :cond_0

    iget-object p1, p0, Landroidx/activity/f0;->d:Landroidx/activity/i0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p2, "onBackPressedCallback"

    iget-object v0, p0, Landroidx/activity/f0;->b:Landroidx/activity/y;

    invoke-static {v0, p2}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p1, Landroidx/activity/i0;->b:Lr8/l;

    invoke-virtual {p2, v0}, Lr8/l;->addLast(Ljava/lang/Object;)V

    new-instance p2, Landroidx/activity/g0;

    invoke-direct {p2, p1, v0}, Landroidx/activity/g0;-><init>(Landroidx/activity/i0;Landroidx/activity/y;)V

    iget-object v1, v0, Landroidx/activity/y;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1, p2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Landroidx/activity/i0;->d()V

    new-instance v1, Landroidx/activity/h0;

    const/4 v2, 0x1

    invoke-direct {v1, p1, v2}, Landroidx/activity/h0;-><init>(Ljava/lang/Object;I)V

    iput-object v1, v0, Landroidx/activity/y;->c:Lc9/a;

    iput-object p2, p0, Landroidx/activity/f0;->c:Landroidx/activity/g0;

    goto :goto_0

    :cond_0
    sget-object p1, Landroidx/lifecycle/p;->ON_STOP:Landroidx/lifecycle/p;

    if-ne p2, p1, :cond_1

    iget-object p1, p0, Landroidx/activity/f0;->c:Landroidx/activity/g0;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroidx/activity/g0;->cancel()V

    goto :goto_0

    :cond_1
    sget-object p1, Landroidx/lifecycle/p;->ON_DESTROY:Landroidx/lifecycle/p;

    if-ne p2, p1, :cond_2

    invoke-virtual {p0}, Landroidx/activity/f0;->cancel()V

    :cond_2
    :goto_0
    return-void
.end method
