.class public final enum Le8/j2;
.super Ljava/lang/Enum;


# static fields
.field public static final enum a:Le8/j2;

.field public static final enum b:Le8/j2;

.field public static final synthetic c:[Le8/j2;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Le8/j2;

    const-string v1, "FAKE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v1, Le8/j2;

    const-string v2, "MTLS"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Le8/j2;->a:Le8/j2;

    new-instance v2, Le8/j2;

    const-string v3, "CUSTOM_MANAGERS"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Le8/j2;->b:Le8/j2;

    filled-new-array {v0, v1, v2}, [Le8/j2;

    move-result-object v0

    sput-object v0, Le8/j2;->c:[Le8/j2;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Le8/j2;
    .locals 1

    const-class v0, Le8/j2;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le8/j2;

    return-object p0
.end method

.method public static values()[Le8/j2;
    .locals 1

    sget-object v0, Le8/j2;->c:[Le8/j2;

    invoke-virtual {v0}, [Le8/j2;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le8/j2;

    return-object v0
.end method
