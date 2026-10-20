.class public final enum Lo7/f1;
.super Ljava/lang/Enum;

# interfaces
.implements Lcom/google/protobuf/s0;


# static fields
.field public static final enum b:Lo7/f1;

.field public static final enum c:Lo7/f1;

.field public static final enum d:Lo7/f1;

.field public static final enum e:Lo7/f1;

.field public static final synthetic f:[Lo7/f1;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lo7/f1;

    const-string v1, "DIRECTION_UNSPECIFIED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lo7/f1;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo7/f1;->b:Lo7/f1;

    new-instance v1, Lo7/f1;

    const-string v2, "ASCENDING"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, Lo7/f1;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lo7/f1;->c:Lo7/f1;

    new-instance v2, Lo7/f1;

    const-string v3, "DESCENDING"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4}, Lo7/f1;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lo7/f1;->d:Lo7/f1;

    new-instance v3, Lo7/f1;

    const/4 v4, 0x3

    const/4 v5, -0x1

    const-string v6, "UNRECOGNIZED"

    invoke-direct {v3, v6, v4, v5}, Lo7/f1;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lo7/f1;->e:Lo7/f1;

    filled-new-array {v0, v1, v2, v3}, [Lo7/f1;

    move-result-object v0

    sput-object v0, Lo7/f1;->f:[Lo7/f1;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lo7/f1;->a:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo7/f1;
    .locals 1

    const-class v0, Lo7/f1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lo7/f1;

    return-object p0
.end method

.method public static values()[Lo7/f1;
    .locals 1

    sget-object v0, Lo7/f1;->f:[Lo7/f1;

    invoke-virtual {v0}, [Lo7/f1;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo7/f1;

    return-object v0
.end method


# virtual methods
.method public final getNumber()I
    .locals 2

    sget-object v0, Lo7/f1;->e:Lo7/f1;

    if-eq p0, v0, :cond_0

    iget v0, p0, Lo7/f1;->a:I

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get the number of an unknown enum value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
