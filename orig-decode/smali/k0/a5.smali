.class public final enum Lk0/a5;
.super Ljava/lang/Enum;


# static fields
.field public static final enum a:Lk0/a5;

.field public static final b:[Lk0/a5;

.field private static final short:[S


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/4 v4, 0x0

    const/16 v0, 0xe

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lk0/a5;->short:[S

    new-instance v0, Lk0/a5;

    sget-object v1, Lk0/a5;->short:[S

    sget v2, Li4/ۨ۟ۨ;->۟ۧ۠ۥ۟:I

    xor-int/lit16 v2, v2, 0x153

    const/16 v3, 0x7ee

    invoke-static {v1, v4, v2, v3}, Lh5/ۢ۠۠۟;->ۣ۟ۤ۠ۨ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v4}, Lk0/a5;-><init>(Ljava/lang/String;I)V

    new-instance v1, Lk0/a5;

    sget-object v2, Lk0/a5;->short:[S

    const/4 v3, 0x6

    sget v4, Landroidx/compose/foundation/۟ۥۦ۟ۨ;->ۨۥۣۢ:I

    xor-int/lit16 v4, v4, -0x131

    const/16 v5, 0x761

    invoke-static {v2, v3, v4, v5}, Lr5/۟ۤۨۥۡ;->۟۟ۥۢۤ([SIII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lk0/a5;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lk0/a5;->a:Lk0/a5;

    const/4 v2, 0x2

    new-array v2, v2, [Lk0/a5;

    sget v3, Lv7/ۤۦۧ۟;->۠ۡ۟:I

    xor-int/lit16 v3, v3, 0x168

    aput-object v0, v2, v3

    sget v0, Lcom/google/firebase/firestore/ktx/۟ۢۡۧۨ;->۟۟ۨۢۥ:I

    xor-int/lit16 v0, v0, 0x18b

    aput-object v1, v2, v0

    sput-object v2, Lk0/a5;->b:[Lk0/a5;

    return-void

    :array_0
    .array-data 2
        0x7a8s
        0x787s
        0x782s
        0x782s
        0x78bs
        0x78as
        0x72es
        0x714s
        0x715s
        0x70ds
        0x708s
        0x70fs
        0x704s
        0x705s
    .end array-data
.end method

.method public static valueOf(Ljava/lang/String;)Lk0/a5;
    .locals 1

    const-class v0, Lk0/a5;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lk0/a5;

    return-object v0
.end method

.method public static values()[Lk0/a5;
    .locals 1

    sget-object v0, Lk0/a5;->b:[Lk0/a5;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lk0/a5;

    return-object v0
.end method
