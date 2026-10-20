.class public final enum Lq5/d;
.super Ljava/lang/Enum;


# static fields
.field public static final enum a:Lq5/d;

.field public static final enum b:Lq5/d;

.field public static final enum c:Lq5/d;

.field public static final synthetic d:[Lq5/d;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lq5/d;

    const-string v1, "NETWORK_UNMETERED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lq5/d;->a:Lq5/d;

    new-instance v1, Lq5/d;

    const-string v2, "DEVICE_IDLE"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lq5/d;->b:Lq5/d;

    new-instance v2, Lq5/d;

    const-string v3, "DEVICE_CHARGING"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lq5/d;->c:Lq5/d;

    filled-new-array {v0, v1, v2}, [Lq5/d;

    move-result-object v0

    sput-object v0, Lq5/d;->d:[Lq5/d;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lq5/d;
    .locals 1

    const-class v0, Lq5/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lq5/d;

    return-object p0
.end method

.method public static values()[Lq5/d;
    .locals 1

    sget-object v0, Lq5/d;->d:[Lq5/d;

    invoke-virtual {v0}, [Lq5/d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lq5/d;

    return-object v0
.end method
