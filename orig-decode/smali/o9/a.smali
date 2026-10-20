.class public final enum Lo9/a;
.super Ljava/lang/Enum;


# static fields
.field public static final enum a:Lo9/a;

.field public static final enum b:Lo9/a;

.field public static final enum c:Lo9/a;

.field public static final synthetic d:[Lo9/a;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lo9/a;

    const-string v1, "SUSPEND"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo9/a;->a:Lo9/a;

    new-instance v1, Lo9/a;

    const-string v2, "DROP_OLDEST"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lo9/a;->b:Lo9/a;

    new-instance v2, Lo9/a;

    const-string v3, "DROP_LATEST"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lo9/a;->c:Lo9/a;

    filled-new-array {v0, v1, v2}, [Lo9/a;

    move-result-object v0

    sput-object v0, Lo9/a;->d:[Lo9/a;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo9/a;
    .locals 1

    const-class v0, Lo9/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lo9/a;

    return-object p0
.end method

.method public static values()[Lo9/a;
    .locals 1

    sget-object v0, Lo9/a;->d:[Lo9/a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo9/a;

    return-object v0
.end method
