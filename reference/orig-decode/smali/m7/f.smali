.class public final enum Lm7/f;
.super Ljava/lang/Enum;

# interfaces
.implements Lcom/google/protobuf/s0;


# static fields
.field public static final enum b:Lm7/f;

.field public static final enum c:Lm7/f;

.field public static final synthetic d:[Lm7/f;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lm7/f;

    const-string v1, "QUERY_SCOPE_UNSPECIFIED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lm7/f;-><init>(Ljava/lang/String;II)V

    new-instance v1, Lm7/f;

    const-string v2, "COLLECTION"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, Lm7/f;-><init>(Ljava/lang/String;II)V

    new-instance v2, Lm7/f;

    const-string v3, "COLLECTION_GROUP"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4}, Lm7/f;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lm7/f;->b:Lm7/f;

    new-instance v3, Lm7/f;

    const/4 v4, 0x3

    const/4 v5, -0x1

    const-string v6, "UNRECOGNIZED"

    invoke-direct {v3, v6, v4, v5}, Lm7/f;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lm7/f;->c:Lm7/f;

    filled-new-array {v0, v1, v2, v3}, [Lm7/f;

    move-result-object v0

    sput-object v0, Lm7/f;->d:[Lm7/f;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lm7/f;->a:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lm7/f;
    .locals 1

    const-class v0, Lm7/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lm7/f;

    return-object p0
.end method

.method public static values()[Lm7/f;
    .locals 1

    sget-object v0, Lm7/f;->d:[Lm7/f;

    invoke-virtual {v0}, [Lm7/f;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lm7/f;

    return-object v0
.end method


# virtual methods
.method public final getNumber()I
    .locals 2

    sget-object v0, Lm7/f;->c:Lm7/f;

    if-eq p0, v0, :cond_0

    iget v0, p0, Lm7/f;->a:I

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get the number of an unknown enum value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
