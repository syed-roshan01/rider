.class public final Landroidx/lifecycle/e;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Closeable;
.implements Lm9/d0;


# instance fields
.field public final a:Lu8/j;


# direct methods
.method public constructor <init>(Lu8/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/e;->a:Lu8/j;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    sget-object v0, Lm9/a0;->b:Lm9/a0;

    iget-object v1, p0, Landroidx/lifecycle/e;->a:Lu8/j;

    invoke-interface {v1, v0}, Lu8/j;->f(Lu8/i;)Lu8/h;

    move-result-object v0

    check-cast v0, Lm9/f1;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lm9/f1;->a(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    return-void
.end method

.method public final q()Lu8/j;
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/e;->a:Lu8/j;

    return-object v0
.end method
