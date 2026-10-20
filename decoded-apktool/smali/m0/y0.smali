.class public final Lm0/y0;
.super Ljava/lang/Object;

# interfaces
.implements Lm0/i2;


# instance fields
.field public final a:Lc9/e;

.field public final b:Lr9/e;

.field public c:Lm9/x1;


# direct methods
.method public constructor <init>(Lu8/j;Lc9/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lm0/y0;->a:Lc9/e;

    invoke-static {p1}, Ld7/a;->b(Lu8/j;)Lr9/e;

    move-result-object p1

    iput-object p1, p0, Lm0/y0;->b:Lr9/e;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-object v0, p0, Lm0/y0;->c:Lm9/x1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v2, "Old job was still running!"

    invoke-static {v2, v1}, Ld7/a;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object v2

    invoke-virtual {v0, v2}, Lm9/p1;->a(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    const/4 v0, 0x3

    const/4 v2, 0x0

    iget-object v3, p0, Lm0/y0;->b:Lr9/e;

    iget-object v4, p0, Lm0/y0;->a:Lc9/e;

    invoke-static {v3, v1, v2, v4, v0}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    move-result-object v0

    iput-object v0, p0, Lm0/y0;->c:Lm9/x1;

    return-void
.end method

.method public final b()V
    .locals 3

    iget-object v0, p0, Lm0/y0;->c:Lm9/x1;

    if-eqz v0, :cond_0

    new-instance v1, Lt/y0;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lt/y0;-><init>(I)V

    invoke-virtual {v0, v1}, Lm9/p1;->a(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lm0/y0;->c:Lm9/x1;

    return-void
.end method

.method public final d()V
    .locals 3

    iget-object v0, p0, Lm0/y0;->c:Lm9/x1;

    if-eqz v0, :cond_0

    new-instance v1, Lt/y0;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lt/y0;-><init>(I)V

    invoke-virtual {v0, v1}, Lm9/p1;->a(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lm0/y0;->c:Lm9/x1;

    return-void
.end method
