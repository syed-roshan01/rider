.class public final Lt9/c;
.super Lm9/x0;

# interfaces
.implements Ljava/util/concurrent/Executor;


# static fields
.field public static final c:Lt9/c;

.field public static final d:Lm9/z;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lt9/c;

    invoke-direct {v0}, Lm9/z;-><init>()V

    sput-object v0, Lt9/c;->c:Lt9/c;

    sget-object v0, Lt9/k;->c:Lt9/k;

    sget v1, Lr9/v;->a:I

    const/16 v2, 0x40

    if-ge v2, v1, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    const/16 v2, 0xc

    const-string v3, "kotlinx.coroutines.io.parallelism"

    const/4 v4, 0x0

    invoke-static {v3, v1, v4, v4, v2}, Lr9/a;->r(Ljava/lang/String;IIII)I

    move-result v1

    invoke-virtual {v0, v1}, Lt9/k;->e0(I)Lm9/z;

    move-result-object v0

    sput-object v0, Lt9/c;->d:Lm9/z;

    return-void
.end method


# virtual methods
.method public final c0(Lu8/j;Ljava/lang/Runnable;)V
    .locals 1

    sget-object v0, Lt9/c;->d:Lm9/z;

    invoke-virtual {v0, p1, p2}, Lm9/z;->c0(Lu8/j;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final close()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot be invoked on Dispatchers.IO"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final e0(I)Lm9/z;
    .locals 1

    const/4 p1, 0x1

    sget-object v0, Lt9/k;->c:Lt9/k;

    invoke-virtual {v0, p1}, Lt9/k;->e0(I)Lm9/z;

    move-result-object p1

    return-object p1
.end method

.method public final execute(Ljava/lang/Runnable;)V
    .locals 1

    sget-object v0, Lu8/k;->a:Lu8/k;

    invoke-virtual {p0, v0, p1}, Lt9/c;->c0(Lu8/j;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Dispatchers.IO"

    return-object v0
.end method
