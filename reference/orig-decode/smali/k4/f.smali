.class public final enum Lk4/f;
.super Ljava/lang/Enum;


# static fields
.field public static final enum a:Lk4/f;

.field public static final enum b:Lk4/f;

.field public static final enum c:Lk4/f;

.field public static final enum d:Lk4/f;

.field public static final synthetic e:[Lk4/f;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lk4/f;

    const-string v1, "MEMORY_CACHE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lk4/f;->a:Lk4/f;

    new-instance v1, Lk4/f;

    const-string v2, "MEMORY"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lk4/f;->b:Lk4/f;

    new-instance v2, Lk4/f;

    const-string v3, "DISK"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lk4/f;->c:Lk4/f;

    new-instance v3, Lk4/f;

    const-string v4, "NETWORK"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lk4/f;->d:Lk4/f;

    filled-new-array {v0, v1, v2, v3}, [Lk4/f;

    move-result-object v0

    sput-object v0, Lk4/f;->e:[Lk4/f;

    invoke-static {v0}, Lz6/a;->y([Ljava/lang/Enum;)Lx8/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lk4/f;
    .locals 1

    const-class v0, Lk4/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lk4/f;

    return-object p0
.end method

.method public static values()[Lk4/f;
    .locals 1

    sget-object v0, Lk4/f;->e:[Lk4/f;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lk4/f;

    return-object v0
.end method
