.class public abstract Le8/o0;
.super Ljava/lang/Object;


# static fields
.field public static final a:Le8/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Le8/b;

    const-string v1, "internal:io.grpc.config-selector"

    invoke-direct {v0, v1}, Le8/b;-><init>(Ljava/lang/String;)V

    sput-object v0, Le8/o0;->a:Le8/b;

    return-void
.end method


# virtual methods
.method public abstract a()Ll/z2;
.end method
