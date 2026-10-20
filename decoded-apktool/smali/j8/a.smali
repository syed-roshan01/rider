.class public final enum Lj8/a;
.super Ljava/lang/Enum;


# static fields
.field public static final enum b:Lj8/a;

.field public static final enum c:Lj8/a;

.field public static final enum d:Lj8/a;

.field public static final enum e:Lj8/a;

.field public static final enum f:Lj8/a;

.field public static final enum n:Lj8/a;

.field public static final enum o:Lj8/a;

.field public static final enum p:Lj8/a;

.field public static final enum q:Lj8/a;

.field public static final enum r:Lj8/a;

.field public static final enum s:Lj8/a;

.field public static final enum t:Lj8/a;

.field public static final synthetic u:[Lj8/a;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 22

    new-instance v1, Lj8/a;

    move-object v0, v1

    const-string v2, "NO_ERROR"

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3, v3}, Lj8/a;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lj8/a;->b:Lj8/a;

    new-instance v2, Lj8/a;

    move-object v1, v2

    const-string v3, "PROTOCOL_ERROR"

    const/4 v6, 0x1

    invoke-direct {v2, v3, v6, v6}, Lj8/a;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lj8/a;->c:Lj8/a;

    new-instance v3, Lj8/a;

    move-object v2, v3

    const-string v4, "INVALID_STREAM"

    const/4 v7, 0x2

    invoke-direct {v3, v4, v7, v6}, Lj8/a;-><init>(Ljava/lang/String;II)V

    new-instance v4, Lj8/a;

    move-object v3, v4

    const-string v5, "UNSUPPORTED_VERSION"

    const/4 v8, 0x3

    invoke-direct {v4, v5, v8, v6}, Lj8/a;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lj8/a;

    move-object v4, v5

    const-string v9, "STREAM_IN_USE"

    const/4 v10, 0x4

    invoke-direct {v5, v9, v10, v6}, Lj8/a;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lj8/a;

    move-object v5, v9

    const-string v10, "STREAM_ALREADY_CLOSED"

    const/4 v11, 0x5

    invoke-direct {v9, v10, v11, v6}, Lj8/a;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lj8/a;

    move-object v6, v9

    const-string v10, "INTERNAL_ERROR"

    const/4 v12, 0x6

    invoke-direct {v9, v10, v12, v7}, Lj8/a;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lj8/a;->d:Lj8/a;

    new-instance v9, Lj8/a;

    move-object v7, v9

    const-string v10, "FLOW_CONTROL_ERROR"

    const/4 v13, 0x7

    invoke-direct {v9, v10, v13, v8}, Lj8/a;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lj8/a;->e:Lj8/a;

    new-instance v9, Lj8/a;

    move-object v8, v9

    const-string v10, "STREAM_CLOSED"

    const/16 v14, 0x8

    invoke-direct {v9, v10, v14, v11}, Lj8/a;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lj8/a;->f:Lj8/a;

    new-instance v10, Lj8/a;

    move-object v9, v10

    const-string v11, "FRAME_TOO_LARGE"

    const/16 v15, 0x9

    invoke-direct {v10, v11, v15, v12}, Lj8/a;-><init>(Ljava/lang/String;II)V

    sput-object v10, Lj8/a;->n:Lj8/a;

    new-instance v11, Lj8/a;

    move-object v10, v11

    const-string v12, "REFUSED_STREAM"

    const/16 v15, 0xa

    invoke-direct {v11, v12, v15, v13}, Lj8/a;-><init>(Ljava/lang/String;II)V

    sput-object v11, Lj8/a;->o:Lj8/a;

    new-instance v12, Lj8/a;

    move-object v11, v12

    const-string v13, "CANCEL"

    const/16 v15, 0xb

    invoke-direct {v12, v13, v15, v14}, Lj8/a;-><init>(Ljava/lang/String;II)V

    sput-object v12, Lj8/a;->p:Lj8/a;

    new-instance v13, Lj8/a;

    move-object v12, v13

    const-string v14, "COMPRESSION_ERROR"

    const/16 v15, 0xc

    move-object/from16 v19, v0

    const/16 v0, 0x9

    invoke-direct {v13, v14, v15, v0}, Lj8/a;-><init>(Ljava/lang/String;II)V

    sput-object v13, Lj8/a;->q:Lj8/a;

    new-instance v0, Lj8/a;

    move-object v13, v0

    const-string v14, "CONNECT_ERROR"

    move-object/from16 v20, v1

    const/16 v1, 0xd

    const/16 v15, 0xa

    invoke-direct {v0, v14, v1, v15}, Lj8/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lj8/a;->r:Lj8/a;

    new-instance v0, Lj8/a;

    move-object v14, v0

    const-string v15, "ENHANCE_YOUR_CALM"

    const/16 v1, 0xe

    move-object/from16 v21, v2

    const/16 v2, 0xb

    invoke-direct {v0, v15, v1, v2}, Lj8/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lj8/a;->s:Lj8/a;

    new-instance v0, Lj8/a;

    const/16 v1, 0xc

    move-object v15, v0

    const-string v2, "INADEQUATE_SECURITY"

    move-object/from16 v18, v3

    const/16 v3, 0xf

    invoke-direct {v0, v2, v3, v1}, Lj8/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lj8/a;->t:Lj8/a;

    new-instance v0, Lj8/a;

    move-object/from16 v16, v0

    const-string v1, "HTTP_1_1_REQUIRED"

    const/16 v2, 0x10

    const/16 v3, 0xd

    invoke-direct {v0, v1, v2, v3}, Lj8/a;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lj8/a;

    move-object/from16 v17, v0

    const/16 v1, 0x11

    const/4 v2, -0x1

    const-string v3, "INVALID_CREDENTIALS"

    invoke-direct {v0, v3, v1, v2}, Lj8/a;-><init>(Ljava/lang/String;II)V

    move-object/from16 v3, v18

    move-object/from16 v0, v19

    move-object/from16 v1, v20

    move-object/from16 v2, v21

    filled-new-array/range {v0 .. v17}, [Lj8/a;

    move-result-object v0

    sput-object v0, Lj8/a;->u:[Lj8/a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lj8/a;->a:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lj8/a;
    .locals 1

    const-class v0, Lj8/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lj8/a;

    return-object p0
.end method

.method public static values()[Lj8/a;
    .locals 1

    sget-object v0, Lj8/a;->u:[Lj8/a;

    invoke-virtual {v0}, [Lj8/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lj8/a;

    return-object v0
.end method
