.class public final Landroidx/concurrent/futures/i;
.super Ljava/lang/Object;


# static fields
.field public static final c:Landroidx/concurrent/futures/i;


# instance fields
.field public volatile a:Ljava/lang/Thread;

.field public volatile b:Landroidx/concurrent/futures/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/concurrent/futures/i;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/concurrent/futures/i;->c:Landroidx/concurrent/futures/i;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Landroidx/concurrent/futures/j;->ATOMIC_HELPER:Landroidx/concurrent/futures/a;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Landroidx/concurrent/futures/a;->e(Landroidx/concurrent/futures/i;Ljava/lang/Thread;)V

    return-void
.end method
