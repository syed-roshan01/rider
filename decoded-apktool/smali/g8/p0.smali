.class public final Lg8/p0;
.super Ljava/lang/Object;


# instance fields
.field public final a:Ljava/lang/Runnable;

.field public final b:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg8/p0;->a:Ljava/lang/Runnable;

    iput-object p2, p0, Lg8/p0;->b:Ljava/util/concurrent/Executor;

    return-void
.end method
