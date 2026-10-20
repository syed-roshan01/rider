.class public final enum Li8/l;
.super Ljava/lang/Enum;


# static fields
.field public static final enum b:Li8/l;

.field public static final enum c:Li8/l;

.field public static final enum d:Li8/l;

.field public static final enum e:Li8/l;

.field public static final synthetic f:[Li8/l;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Li8/l;

    const/4 v1, 0x0

    const-string v2, "http/1.0"

    const-string v3, "HTTP_1_0"

    invoke-direct {v0, v3, v1, v2}, Li8/l;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Li8/l;->b:Li8/l;

    new-instance v1, Li8/l;

    const/4 v2, 0x1

    const-string v3, "http/1.1"

    const-string v4, "HTTP_1_1"

    invoke-direct {v1, v4, v2, v3}, Li8/l;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Li8/l;->c:Li8/l;

    new-instance v2, Li8/l;

    const/4 v3, 0x2

    const-string v4, "spdy/3.1"

    const-string v5, "SPDY_3"

    invoke-direct {v2, v5, v3, v4}, Li8/l;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Li8/l;->d:Li8/l;

    new-instance v3, Li8/l;

    const/4 v4, 0x3

    const-string v5, "h2"

    const-string v6, "HTTP_2"

    invoke-direct {v3, v6, v4, v5}, Li8/l;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Li8/l;->e:Li8/l;

    filled-new-array {v0, v1, v2, v3}, [Li8/l;

    move-result-object v0

    sput-object v0, Li8/l;->f:[Li8/l;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Li8/l;->a:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Li8/l;
    .locals 1

    const-class v0, Li8/l;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Li8/l;

    return-object p0
.end method

.method public static values()[Li8/l;
    .locals 1

    sget-object v0, Li8/l;->f:[Li8/l;

    invoke-virtual {v0}, [Li8/l;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Li8/l;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Li8/l;->a:Ljava/lang/String;

    return-object v0
.end method
