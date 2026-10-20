.class public final Landroidx/activity/g0;
.super Ljava/lang/Object;

# interfaces
.implements Landroidx/activity/c;


# instance fields
.field public final a:Landroidx/activity/y;

.field public final synthetic b:Landroidx/activity/i0;


# direct methods
.method public constructor <init>(Landroidx/activity/i0;Landroidx/activity/y;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "onBackPressedCallback"

    invoke-static {p2, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Landroidx/activity/g0;->b:Landroidx/activity/i0;

    iput-object p2, p0, Landroidx/activity/g0;->a:Landroidx/activity/y;

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 4

    iget-object v0, p0, Landroidx/activity/g0;->b:Landroidx/activity/i0;

    iget-object v1, v0, Landroidx/activity/i0;->b:Lr8/l;

    iget-object v2, p0, Landroidx/activity/g0;->a:Landroidx/activity/y;

    invoke-virtual {v1, v2}, Lr8/l;->remove(Ljava/lang/Object;)Z

    iget-object v1, v0, Landroidx/activity/i0;->c:Landroidx/activity/y;

    invoke-static {v1, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v3, v0, Landroidx/activity/i0;->c:Landroidx/activity/y;

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v2, Landroidx/activity/y;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v0, v2, Landroidx/activity/y;->c:Lc9/a;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lc9/a;->invoke()Ljava/lang/Object;

    :cond_1
    iput-object v3, v2, Landroidx/activity/y;->c:Lc9/a;

    return-void
.end method
