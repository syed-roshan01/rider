.class public final enum Li8/m;
.super Ljava/lang/Enum;


# static fields
.field public static final enum b:Li8/m;

.field public static final enum c:Li8/m;

.field public static final enum d:Li8/m;

.field public static final enum e:Li8/m;

.field public static final enum f:Li8/m;

.field public static final synthetic n:[Li8/m;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Li8/m;

    const/4 v1, 0x0

    const-string v2, "TLSv1.3"

    const-string v3, "TLS_1_3"

    invoke-direct {v0, v3, v1, v2}, Li8/m;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Li8/m;->b:Li8/m;

    new-instance v1, Li8/m;

    const/4 v2, 0x1

    const-string v3, "TLSv1.2"

    const-string v4, "TLS_1_2"

    invoke-direct {v1, v4, v2, v3}, Li8/m;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Li8/m;->c:Li8/m;

    new-instance v2, Li8/m;

    const/4 v3, 0x2

    const-string v4, "TLSv1.1"

    const-string v5, "TLS_1_1"

    invoke-direct {v2, v5, v3, v4}, Li8/m;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Li8/m;->d:Li8/m;

    new-instance v3, Li8/m;

    const/4 v4, 0x3

    const-string v5, "TLSv1"

    const-string v6, "TLS_1_0"

    invoke-direct {v3, v6, v4, v5}, Li8/m;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Li8/m;->e:Li8/m;

    new-instance v4, Li8/m;

    const/4 v5, 0x4

    const-string v6, "SSLv3"

    const-string v7, "SSL_3_0"

    invoke-direct {v4, v7, v5, v6}, Li8/m;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Li8/m;->f:Li8/m;

    filled-new-array {v0, v1, v2, v3, v4}, [Li8/m;

    move-result-object v0

    sput-object v0, Li8/m;->n:[Li8/m;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Li8/m;->a:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Li8/m;
    .locals 1

    const-class v0, Li8/m;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Li8/m;

    return-object p0
.end method

.method public static values()[Li8/m;
    .locals 1

    sget-object v0, Li8/m;->n:[Li8/m;

    invoke-virtual {v0}, [Li8/m;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Li8/m;

    return-object v0
.end method
