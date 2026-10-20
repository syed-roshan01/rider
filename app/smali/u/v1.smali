.class public final Lu/v1;
.super Ljava/lang/Object;


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicReference;

.field public final b:Lu9/d;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lu/v1;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {}, Lu9/e;->a()Lu9/d;

    move-result-object v0

    iput-object v0, p0, Lu/v1;->b:Lu9/d;

    return-void
.end method
