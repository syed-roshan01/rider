.class public final enum Lb8/b;
.super Ljava/lang/Enum;


# static fields
.field public static final enum c:Lb8/b;

.field public static final enum d:Lb8/b;

.field public static final enum e:Lb8/b;

.field public static final enum f:Lb8/b;

.field public static final enum n:Lb8/b;

.field public static final enum o:Lb8/b;

.field public static final synthetic p:[Lb8/b;


# instance fields
.field public final a:[I

.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 16

    new-instance v0, Lb8/b;

    const/4 v1, 0x0

    filled-new-array {v1, v1, v1}, [I

    move-result-object v2

    const-string v3, "TERMINATOR"

    invoke-direct {v0, v3, v1, v2, v1}, Lb8/b;-><init>(Ljava/lang/String;I[II)V

    new-instance v2, Lb8/b;

    const/16 v3, 0xa

    const/16 v4, 0xc

    const/16 v5, 0xe

    filled-new-array {v3, v4, v5}, [I

    move-result-object v5

    const-string v6, "NUMERIC"

    const/4 v7, 0x1

    invoke-direct {v2, v6, v7, v5, v7}, Lb8/b;-><init>(Ljava/lang/String;I[II)V

    sput-object v2, Lb8/b;->c:Lb8/b;

    new-instance v5, Lb8/b;

    const/16 v6, 0x9

    const/16 v7, 0xb

    const/16 v8, 0xd

    filled-new-array {v6, v7, v8}, [I

    move-result-object v7

    const-string v9, "ALPHANUMERIC"

    const/4 v10, 0x2

    invoke-direct {v5, v9, v10, v7, v10}, Lb8/b;-><init>(Ljava/lang/String;I[II)V

    sput-object v5, Lb8/b;->d:Lb8/b;

    new-instance v7, Lb8/b;

    filled-new-array {v1, v1, v1}, [I

    move-result-object v9

    const-string v10, "STRUCTURED_APPEND"

    const/4 v11, 0x3

    invoke-direct {v7, v10, v11, v9, v11}, Lb8/b;-><init>(Ljava/lang/String;I[II)V

    new-instance v9, Lb8/b;

    const/16 v10, 0x8

    const/16 v11, 0x10

    filled-new-array {v10, v11, v11}, [I

    move-result-object v11

    const-string v12, "BYTE"

    const/4 v13, 0x4

    invoke-direct {v9, v12, v13, v11, v13}, Lb8/b;-><init>(Ljava/lang/String;I[II)V

    sput-object v9, Lb8/b;->e:Lb8/b;

    new-instance v11, Lb8/b;

    filled-new-array {v1, v1, v1}, [I

    move-result-object v12

    const-string v13, "ECI"

    const/4 v14, 0x5

    const/4 v15, 0x7

    invoke-direct {v11, v13, v14, v12, v15}, Lb8/b;-><init>(Ljava/lang/String;I[II)V

    sput-object v11, Lb8/b;->f:Lb8/b;

    new-instance v12, Lb8/b;

    filled-new-array {v10, v3, v4}, [I

    move-result-object v13

    const-string v8, "KANJI"

    const/4 v3, 0x6

    invoke-direct {v12, v8, v3, v13, v10}, Lb8/b;-><init>(Ljava/lang/String;I[II)V

    sput-object v12, Lb8/b;->n:Lb8/b;

    new-instance v8, Lb8/b;

    const-string v3, "FNC1_FIRST_POSITION"

    filled-new-array {v1, v1, v1}, [I

    move-result-object v13

    invoke-direct {v8, v3, v15, v13, v14}, Lb8/b;-><init>(Ljava/lang/String;I[II)V

    sput-object v8, Lb8/b;->o:Lb8/b;

    new-instance v13, Lb8/b;

    const-string v3, "FNC1_SECOND_POSITION"

    filled-new-array {v1, v1, v1}, [I

    move-result-object v1

    invoke-direct {v13, v3, v10, v1, v6}, Lb8/b;-><init>(Ljava/lang/String;I[II)V

    new-instance v14, Lb8/b;

    const-string v1, "HANZI"

    const/16 v3, 0xa

    filled-new-array {v10, v3, v4}, [I

    move-result-object v3

    const/16 v4, 0xd

    invoke-direct {v14, v1, v6, v3, v4}, Lb8/b;-><init>(Ljava/lang/String;I[II)V

    move-object v1, v2

    move-object v2, v5

    move-object v3, v7

    move-object v4, v9

    move-object v5, v11

    move-object v6, v12

    move-object v7, v8

    move-object v8, v13

    move-object v9, v14

    filled-new-array/range {v0 .. v9}, [Lb8/b;

    move-result-object v0

    sput-object v0, Lb8/b;->p:[Lb8/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I[II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lb8/b;->a:[I

    iput p4, p0, Lb8/b;->b:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lb8/b;
    .locals 1

    const-class v0, Lb8/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lb8/b;

    return-object p0
.end method

.method public static values()[Lb8/b;
    .locals 1

    sget-object v0, Lb8/b;->p:[Lb8/b;

    invoke-virtual {v0}, [Lb8/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb8/b;

    return-object v0
.end method


# virtual methods
.method public final a(Lb8/c;)I
    .locals 1

    iget p1, p1, Lb8/c;->a:I

    const/16 v0, 0x9

    if-gt p1, v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 v0, 0x1a

    if-gt p1, v0, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x2

    :goto_0
    iget-object v0, p0, Lb8/b;->a:[I

    aget p1, v0, p1

    return p1
.end method
