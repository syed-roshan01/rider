.class public final enum Lm8/a;
.super Ljava/lang/Enum;


# static fields
.field public static final enum a:Lm8/a;

.field public static final synthetic b:[Lm8/a;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lm8/a;

    const-string v1, "BLOCKING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v1, Lm8/a;

    const-string v2, "FUTURE"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance v2, Lm8/a;

    const-string v3, "ASYNC"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lm8/a;->a:Lm8/a;

    filled-new-array {v0, v1, v2}, [Lm8/a;

    move-result-object v0

    sput-object v0, Lm8/a;->b:[Lm8/a;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lm8/a;
    .locals 1

    const-class v0, Lm8/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lm8/a;

    return-object p0
.end method

.method public static values()[Lm8/a;
    .locals 1

    sget-object v0, Lm8/a;->b:[Lm8/a;

    invoke-virtual {v0}, [Lm8/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lm8/a;

    return-object v0
.end method
