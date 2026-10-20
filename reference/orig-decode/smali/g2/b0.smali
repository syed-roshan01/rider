.class public final Lg2/b0;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lg2/v;

.field public final b:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public constructor <init>(Lg2/v;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg2/b0;->a:Lg2/v;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lg2/b0;->b:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method
