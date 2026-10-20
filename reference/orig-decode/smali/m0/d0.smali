.class public final Lm0/d0;
.super Ljava/lang/Object;

# interfaces
.implements Lm0/i2;


# instance fields
.field public final a:Lm9/d0;


# direct methods
.method public constructor <init>(Lr9/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/d0;->a:Lm9/d0;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    return-void
.end method

.method public final b()V
    .locals 2

    new-instance v0, Lt/y0;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lt/y0;-><init>(I)V

    iget-object v1, p0, Lm0/d0;->a:Lm9/d0;

    invoke-static {v1, v0}, Ld7/a;->i(Lm9/d0;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public final d()V
    .locals 2

    new-instance v0, Lt/y0;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lt/y0;-><init>(I)V

    iget-object v1, p0, Lm0/d0;->a:Lm9/d0;

    invoke-static {v1, v0}, Ld7/a;->i(Lm9/d0;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method
