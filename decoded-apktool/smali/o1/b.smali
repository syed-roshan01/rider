.class public final Lo1/b;
.super Ljava/util/concurrent/CancellationException;


# static fields
.field public static final a:Lo1/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo1/b;

    invoke-direct {v0}, Ljava/util/concurrent/CancellationException;-><init>()V

    sput-object v0, Lo1/b;->a:Lo1/b;

    return-void
.end method


# virtual methods
.method public final fillInStackTrace()Ljava/lang/Throwable;
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/StackTraceElement;

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V

    return-object p0
.end method
