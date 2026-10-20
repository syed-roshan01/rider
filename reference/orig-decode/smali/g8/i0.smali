.class public final enum Lg8/i0;
.super Ljava/lang/Enum;


# static fields
.field public static final enum a:Lg8/i0;

.field public static final enum b:Lg8/i0;

.field public static final enum c:Lg8/i0;

.field public static final enum d:Lg8/i0;

.field public static final synthetic e:[Lg8/i0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lg8/i0;

    const-string v1, "PROCESSED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg8/i0;->a:Lg8/i0;

    new-instance v1, Lg8/i0;

    const-string v2, "REFUSED"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lg8/i0;->b:Lg8/i0;

    new-instance v2, Lg8/i0;

    const-string v3, "DROPPED"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lg8/i0;->c:Lg8/i0;

    new-instance v3, Lg8/i0;

    const-string v4, "MISCARRIED"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lg8/i0;->d:Lg8/i0;

    filled-new-array {v0, v1, v2, v3}, [Lg8/i0;

    move-result-object v0

    sput-object v0, Lg8/i0;->e:[Lg8/i0;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lg8/i0;
    .locals 1

    const-class v0, Lg8/i0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lg8/i0;

    return-object p0
.end method

.method public static values()[Lg8/i0;
    .locals 1

    sget-object v0, Lg8/i0;->e:[Lg8/i0;

    invoke-virtual {v0}, [Lg8/i0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lg8/i0;

    return-object v0
.end method
