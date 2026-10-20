.class public final Le8/r;
.super Ljava/lang/Object;

# interfaces
.implements Le8/s;


# static fields
.field public static final a:Le8/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Le8/r;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Le8/r;->a:Le8/r;

    return-void
.end method


# virtual methods
.method public final a(Lg8/y3;)Ljava/io/OutputStream;
    .locals 0

    return-object p1
.end method

.method public final b(Lg8/n4;)Ljava/io/InputStream;
    .locals 0

    return-object p1
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    const-string v0, "identity"

    return-object v0
.end method
