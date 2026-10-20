.class public final enum Lk5/q;
.super Ljava/lang/Enum;


# static fields
.field public static final enum a:Lk5/q;

.field public static final synthetic b:[Lk5/q;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lk5/q;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v1, Lk5/q;

    const-string v2, "ANDROID_FIREBASE"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lk5/q;->a:Lk5/q;

    filled-new-array {v0, v1}, [Lk5/q;

    move-result-object v0

    sput-object v0, Lk5/q;->b:[Lk5/q;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lk5/q;
    .locals 1

    const-class v0, Lk5/q;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lk5/q;

    return-object p0
.end method

.method public static values()[Lk5/q;
    .locals 1

    sget-object v0, Lk5/q;->b:[Lk5/q;

    invoke-virtual {v0}, [Lk5/q;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lk5/q;

    return-object v0
.end method
