.class public final enum Lo7/s1;
.super Ljava/lang/Enum;

# interfaces
.implements Lcom/google/protobuf/s0;


# static fields
.field public static final enum b:Lo7/s1;

.field public static final enum c:Lo7/s1;

.field public static final enum d:Lo7/s1;

.field public static final enum e:Lo7/s1;

.field public static final enum f:Lo7/s1;

.field public static final enum n:Lo7/s1;

.field public static final synthetic o:[Lo7/s1;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lo7/s1;

    const-string v1, "OPERATOR_UNSPECIFIED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lo7/s1;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo7/s1;->b:Lo7/s1;

    new-instance v1, Lo7/s1;

    const-string v2, "IS_NAN"

    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-direct {v1, v2, v3, v4}, Lo7/s1;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lo7/s1;->c:Lo7/s1;

    new-instance v2, Lo7/s1;

    const-string v3, "IS_NULL"

    const/4 v5, 0x3

    invoke-direct {v2, v3, v4, v5}, Lo7/s1;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lo7/s1;->d:Lo7/s1;

    new-instance v3, Lo7/s1;

    const-string v4, "IS_NOT_NAN"

    const/4 v6, 0x4

    invoke-direct {v3, v4, v5, v6}, Lo7/s1;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lo7/s1;->e:Lo7/s1;

    new-instance v4, Lo7/s1;

    const-string v5, "IS_NOT_NULL"

    const/4 v7, 0x5

    invoke-direct {v4, v5, v6, v7}, Lo7/s1;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lo7/s1;->f:Lo7/s1;

    new-instance v5, Lo7/s1;

    const-string v6, "UNRECOGNIZED"

    const/4 v8, -0x1

    invoke-direct {v5, v6, v7, v8}, Lo7/s1;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lo7/s1;->n:Lo7/s1;

    filled-new-array/range {v0 .. v5}, [Lo7/s1;

    move-result-object v0

    sput-object v0, Lo7/s1;->o:[Lo7/s1;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lo7/s1;->a:I

    return-void
.end method

.method public static a(I)Lo7/s1;
    .locals 1

    if-eqz p0, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/4 v0, 0x5

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Lo7/s1;->f:Lo7/s1;

    return-object p0

    :cond_1
    sget-object p0, Lo7/s1;->e:Lo7/s1;

    return-object p0

    :cond_2
    sget-object p0, Lo7/s1;->d:Lo7/s1;

    return-object p0

    :cond_3
    sget-object p0, Lo7/s1;->c:Lo7/s1;

    return-object p0

    :cond_4
    sget-object p0, Lo7/s1;->b:Lo7/s1;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lo7/s1;
    .locals 1

    const-class v0, Lo7/s1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lo7/s1;

    return-object p0
.end method

.method public static values()[Lo7/s1;
    .locals 1

    sget-object v0, Lo7/s1;->o:[Lo7/s1;

    invoke-virtual {v0}, [Lo7/s1;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo7/s1;

    return-object v0
.end method


# virtual methods
.method public final getNumber()I
    .locals 2

    sget-object v0, Lo7/s1;->n:Lo7/s1;

    if-eq p0, v0, :cond_0

    iget v0, p0, Lo7/s1;->a:I

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get the number of an unknown enum value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
