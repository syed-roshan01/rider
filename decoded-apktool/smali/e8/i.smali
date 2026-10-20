.class public abstract Le8/i;
.super Ljava/lang/Object;


# static fields
.field public static final a:Le8/b;

.field public static final b:Le8/b;

.field public static final c:Le8/b;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Le8/b;

    const-string v1, "io.grpc.Grpc.TRANSPORT_ATTR_REMOTE_ADDR"

    invoke-direct {v0, v1}, Le8/b;-><init>(Ljava/lang/String;)V

    sput-object v0, Le8/i;->a:Le8/b;

    new-instance v0, Le8/b;

    const-string v1, "io.grpc.Grpc.TRANSPORT_ATTR_LOCAL_ADDR"

    invoke-direct {v0, v1}, Le8/b;-><init>(Ljava/lang/String;)V

    sput-object v0, Le8/i;->b:Le8/b;

    new-instance v0, Le8/b;

    const-string v1, "io.grpc.Grpc.TRANSPORT_ATTR_SSL_SESSION"

    invoke-direct {v0, v1}, Le8/b;-><init>(Ljava/lang/String;)V

    sput-object v0, Le8/i;->c:Le8/b;

    return-void
.end method


# virtual methods
.method public abstract a(ILjava/lang/String;)V
.end method

.method public varargs abstract b(ILjava/lang/String;[Ljava/lang/Object;)V
.end method

.method public abstract c(Le8/j0;)Le8/z0;
.end method

.method public abstract d(Le8/c2;)V
.end method

.method public abstract e(Le8/s1;)V
.end method
