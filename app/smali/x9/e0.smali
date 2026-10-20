.class public final enum Lx9/e0;
.super Ljava/lang/Enum;


# static fields
.field public static final enum b:Lx9/e0;

.field public static final enum c:Lx9/e0;

.field public static final enum d:Lx9/e0;

.field public static final enum e:Lx9/e0;

.field public static final enum f:Lx9/e0;

.field public static final synthetic n:[Lx9/e0;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lx9/e0;

    const-string v1, "TLSv1.3"

    const-string v2, "TLS_1_3"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lx9/e0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lx9/e0;->b:Lx9/e0;

    new-instance v1, Lx9/e0;

    const-string v2, "TLSv1.2"

    const-string v3, "TLS_1_2"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v2}, Lx9/e0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lx9/e0;->c:Lx9/e0;

    new-instance v2, Lx9/e0;

    const-string v3, "TLSv1.1"

    const-string v4, "TLS_1_1"

    const/4 v5, 0x2

    invoke-direct {v2, v4, v5, v3}, Lx9/e0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lx9/e0;->d:Lx9/e0;

    new-instance v3, Lx9/e0;

    const-string v4, "TLSv1"

    const-string v5, "TLS_1_0"

    const/4 v6, 0x3

    invoke-direct {v3, v5, v6, v4}, Lx9/e0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lx9/e0;->e:Lx9/e0;

    new-instance v4, Lx9/e0;

    const-string v5, "SSL_3_0"

    const/4 v6, 0x4

    const-string v7, "SSLv3"

    invoke-direct {v4, v5, v6, v7}, Lx9/e0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lx9/e0;->f:Lx9/e0;

    filled-new-array {v0, v1, v2, v3, v4}, [Lx9/e0;

    move-result-object v0

    sput-object v0, Lx9/e0;->n:[Lx9/e0;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lx9/e0;->a:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lx9/e0;
    .locals 1

    const-class v0, Lx9/e0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lx9/e0;

    return-object p0
.end method

.method public static values()[Lx9/e0;
    .locals 1

    sget-object v0, Lx9/e0;->n:[Lx9/e0;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lx9/e0;

    return-object v0
.end method
