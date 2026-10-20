.class public final enum Li7/t1;
.super Ljava/lang/Enum;

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/d0;


# static fields
.field public static final enum b:Li7/t1;

.field public static final enum c:Li7/t1;

.field public static final enum d:Li7/t1;

.field public static final enum e:Li7/t1;

.field public static final enum f:Li7/t1;

.field public static final enum n:Li7/t1;

.field public static final synthetic o:[Li7/t1;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Li7/t1;

    const-string v1, "UNKNOWN_PREFIX"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Li7/t1;-><init>(Ljava/lang/String;II)V

    sput-object v0, Li7/t1;->b:Li7/t1;

    new-instance v1, Li7/t1;

    const-string v2, "TINK"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, Li7/t1;-><init>(Ljava/lang/String;II)V

    sput-object v1, Li7/t1;->c:Li7/t1;

    new-instance v2, Li7/t1;

    const-string v3, "LEGACY"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4}, Li7/t1;-><init>(Ljava/lang/String;II)V

    sput-object v2, Li7/t1;->d:Li7/t1;

    new-instance v3, Li7/t1;

    const-string v4, "RAW"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5, v5}, Li7/t1;-><init>(Ljava/lang/String;II)V

    sput-object v3, Li7/t1;->e:Li7/t1;

    new-instance v4, Li7/t1;

    const-string v5, "CRUNCHY"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6, v6}, Li7/t1;-><init>(Ljava/lang/String;II)V

    sput-object v4, Li7/t1;->f:Li7/t1;

    new-instance v5, Li7/t1;

    const/4 v6, 0x5

    const/4 v7, -0x1

    const-string v8, "UNRECOGNIZED"

    invoke-direct {v5, v8, v6, v7}, Li7/t1;-><init>(Ljava/lang/String;II)V

    sput-object v5, Li7/t1;->n:Li7/t1;

    filled-new-array/range {v0 .. v5}, [Li7/t1;

    move-result-object v0

    sput-object v0, Li7/t1;->o:[Li7/t1;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Li7/t1;->a:I

    return-void
.end method

.method public static a(I)Li7/t1;
    .locals 1

    if-eqz p0, :cond_4

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Li7/t1;->f:Li7/t1;

    return-object p0

    :cond_1
    sget-object p0, Li7/t1;->e:Li7/t1;

    return-object p0

    :cond_2
    sget-object p0, Li7/t1;->d:Li7/t1;

    return-object p0

    :cond_3
    sget-object p0, Li7/t1;->c:Li7/t1;

    return-object p0

    :cond_4
    sget-object p0, Li7/t1;->b:Li7/t1;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Li7/t1;
    .locals 1

    const-class v0, Li7/t1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Li7/t1;

    return-object p0
.end method

.method public static values()[Li7/t1;
    .locals 1

    sget-object v0, Li7/t1;->o:[Li7/t1;

    invoke-virtual {v0}, [Li7/t1;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Li7/t1;

    return-object v0
.end method


# virtual methods
.method public final b()I
    .locals 2

    sget-object v0, Li7/t1;->n:Li7/t1;

    if-eq p0, v0, :cond_0

    iget v0, p0, Li7/t1;->a:I

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get the number of an unknown enum value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
