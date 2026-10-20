.class public final enum Lb8/a;
.super Ljava/lang/Enum;


# static fields
.field public static final enum b:Lb8/a;

.field public static final synthetic c:[Lb8/a;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lb8/a;

    const-string v1, "L"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lb8/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lb8/a;->b:Lb8/a;

    new-instance v1, Lb8/a;

    const-string v4, "M"

    invoke-direct {v1, v4, v3, v2}, Lb8/a;-><init>(Ljava/lang/String;II)V

    new-instance v2, Lb8/a;

    const-string v3, "Q"

    const/4 v4, 0x2

    const/4 v5, 0x3

    invoke-direct {v2, v3, v4, v5}, Lb8/a;-><init>(Ljava/lang/String;II)V

    new-instance v3, Lb8/a;

    const-string v6, "H"

    invoke-direct {v3, v6, v5, v4}, Lb8/a;-><init>(Ljava/lang/String;II)V

    filled-new-array {v0, v1, v2, v3}, [Lb8/a;

    move-result-object v0

    sput-object v0, Lb8/a;->c:[Lb8/a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lb8/a;->a:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lb8/a;
    .locals 1

    const-class v0, Lb8/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lb8/a;

    return-object p0
.end method

.method public static values()[Lb8/a;
    .locals 1

    sget-object v0, Lb8/a;->c:[Lb8/a;

    invoke-virtual {v0}, [Lb8/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb8/a;

    return-object v0
.end method
