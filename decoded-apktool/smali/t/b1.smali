.class public final Lt/b1;
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

    iput-object v0, p0, Lt/b1;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {}, Lu9/e;->a()Lu9/d;

    move-result-object v0

    iput-object v0, p0, Lt/b1;->b:Lu9/d;

    return-void
.end method

.method public static a(Lt/b1;Lc9/c;Lu8/e;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lt/a1;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v2, p0, p1, v1}, Lt/a1;-><init>(ILt/b1;Lc9/c;Lu8/e;)V

    invoke-static {v0, p2}, Ld7/a;->q(Lc9/e;Lu8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
