.class public final enum Lk4/k;
.super Ljava/lang/Enum;


# static fields
.field public static final enum a:Lk4/k;

.field public static final synthetic b:[Lk4/k;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lk4/k;

    const-string v1, "IGNORE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v1, Lk4/k;

    const-string v2, "RESPECT_PERFORMANCE"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lk4/k;->a:Lk4/k;

    new-instance v2, Lk4/k;

    const-string v3, "RESPECT_ALL"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    filled-new-array {v0, v1, v2}, [Lk4/k;

    move-result-object v0

    sput-object v0, Lk4/k;->b:[Lk4/k;

    invoke-static {v0}, Lz6/a;->y([Ljava/lang/Enum;)Lx8/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lk4/k;
    .locals 1

    const-class v0, Lk4/k;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lk4/k;

    return-object p0
.end method

.method public static values()[Lk4/k;
    .locals 1

    sget-object v0, Lk4/k;->b:[Lk4/k;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lk4/k;

    return-object v0
.end method
