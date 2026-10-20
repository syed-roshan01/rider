.class public final enum Lo7/z;
.super Ljava/lang/Enum;

# interfaces
.implements Lcom/google/protobuf/s0;


# static fields
.field public static final enum b:Lo7/z;

.field public static final enum c:Lo7/z;

.field public static final enum d:Lo7/z;

.field public static final synthetic e:[Lo7/z;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lo7/z;

    const-string v1, "SERVER_VALUE_UNSPECIFIED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lo7/z;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo7/z;->b:Lo7/z;

    new-instance v1, Lo7/z;

    const-string v2, "REQUEST_TIME"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, Lo7/z;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lo7/z;->c:Lo7/z;

    new-instance v2, Lo7/z;

    const/4 v3, 0x2

    const/4 v4, -0x1

    const-string v5, "UNRECOGNIZED"

    invoke-direct {v2, v5, v3, v4}, Lo7/z;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lo7/z;->d:Lo7/z;

    filled-new-array {v0, v1, v2}, [Lo7/z;

    move-result-object v0

    sput-object v0, Lo7/z;->e:[Lo7/z;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lo7/z;->a:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo7/z;
    .locals 1

    const-class v0, Lo7/z;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lo7/z;

    return-object p0
.end method

.method public static values()[Lo7/z;
    .locals 1

    sget-object v0, Lo7/z;->e:[Lo7/z;

    invoke-virtual {v0}, [Lo7/z;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo7/z;

    return-object v0
.end method


# virtual methods
.method public final getNumber()I
    .locals 2

    sget-object v0, Lo7/z;->d:Lo7/z;

    if-eq p0, v0, :cond_0

    iget v0, p0, Lo7/z;->a:I

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get the number of an unknown enum value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
