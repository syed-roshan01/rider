.class public final enum Lv/h1;
.super Ljava/lang/Enum;


# static fields
.field public static final enum a:Lv/h1;

.field public static final enum b:Lv/h1;

.field public static final synthetic c:[Lv/h1;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lv/h1;

    const-string v1, "Vertical"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lv/h1;->a:Lv/h1;

    new-instance v1, Lv/h1;

    const-string v2, "Horizontal"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lv/h1;->b:Lv/h1;

    filled-new-array {v0, v1}, [Lv/h1;

    move-result-object v0

    sput-object v0, Lv/h1;->c:[Lv/h1;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lv/h1;
    .locals 1

    const-class v0, Lv/h1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lv/h1;

    return-object p0
.end method

.method public static values()[Lv/h1;
    .locals 1

    sget-object v0, Lv/h1;->c:[Lv/h1;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lv/h1;

    return-object v0
.end method
