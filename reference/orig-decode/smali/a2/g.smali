.class public final enum La2/g;
.super Ljava/lang/Enum;


# static fields
.field public static final enum a:La2/g;

.field public static final enum b:La2/g;

.field public static final enum c:La2/g;

.field public static final enum d:La2/g;

.field public static final enum e:La2/g;

.field public static final synthetic f:[La2/g;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, La2/g;

    const-string v1, "Paragraph"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, La2/g;->a:La2/g;

    new-instance v1, La2/g;

    const-string v2, "Span"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, La2/g;->b:La2/g;

    new-instance v2, La2/g;

    const-string v3, "VerbatimTts"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, La2/g;->c:La2/g;

    new-instance v3, La2/g;

    const-string v4, "Url"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v3, La2/g;->d:La2/g;

    new-instance v4, La2/g;

    const-string v5, "String"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v4, La2/g;->e:La2/g;

    filled-new-array {v0, v1, v2, v3, v4}, [La2/g;

    move-result-object v0

    sput-object v0, La2/g;->f:[La2/g;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La2/g;
    .locals 1

    const-class v0, La2/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, La2/g;

    return-object p0
.end method

.method public static values()[La2/g;
    .locals 1

    sget-object v0, La2/g;->f:[La2/g;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [La2/g;

    return-object v0
.end method
