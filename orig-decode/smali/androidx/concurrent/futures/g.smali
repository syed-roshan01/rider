.class public final Landroidx/concurrent/futures/g;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:Landroidx/concurrent/futures/j;

.field public final b:Lu6/b;


# direct methods
.method public constructor <init>(Landroidx/concurrent/futures/j;Lu6/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/concurrent/futures/g;->a:Landroidx/concurrent/futures/j;

    iput-object p2, p0, Landroidx/concurrent/futures/g;->b:Lu6/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Landroidx/concurrent/futures/g;->a:Landroidx/concurrent/futures/j;

    iget-object v0, v0, Landroidx/concurrent/futures/j;->value:Ljava/lang/Object;

    if-eq v0, p0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/concurrent/futures/g;->b:Lu6/b;

    invoke-static {v0}, Landroidx/concurrent/futures/j;->getFutureValue(Lu6/b;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Landroidx/concurrent/futures/j;->ATOMIC_HELPER:Landroidx/concurrent/futures/a;

    iget-object v2, p0, Landroidx/concurrent/futures/g;->a:Landroidx/concurrent/futures/j;

    invoke-virtual {v1, v2, p0, v0}, Landroidx/concurrent/futures/a;->b(Landroidx/concurrent/futures/j;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/concurrent/futures/g;->a:Landroidx/concurrent/futures/j;

    invoke-static {v0}, Landroidx/concurrent/futures/j;->complete(Landroidx/concurrent/futures/j;)V

    :cond_1
    return-void
.end method
