.class public final Ld7/i;
.super Ljava/lang/Object;


# static fields
.field public static final b:Ld7/i;

.field public static final c:Ld7/h;


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ld7/i;

    invoke-direct {v0}, Ld7/i;-><init>()V

    sput-object v0, Ld7/i;->b:Ld7/i;

    new-instance v0, Ld7/h;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ld7/i;->c:Ld7/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Ld7/i;->a:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method
