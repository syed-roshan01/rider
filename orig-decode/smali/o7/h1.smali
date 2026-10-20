.class public final enum Lo7/h1;
.super Ljava/lang/Enum;

# interfaces
.implements Lcom/google/protobuf/s0;


# static fields
.field public static final enum b:Lo7/h1;

.field public static final enum c:Lo7/h1;

.field public static final enum d:Lo7/h1;

.field public static final enum e:Lo7/h1;

.field public static final enum f:Lo7/h1;

.field public static final enum n:Lo7/h1;

.field public static final enum o:Lo7/h1;

.field public static final enum p:Lo7/h1;

.field public static final enum q:Lo7/h1;

.field public static final enum r:Lo7/h1;

.field public static final enum s:Lo7/h1;

.field public static final enum t:Lo7/h1;

.field public static final synthetic u:[Lo7/h1;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 15

    new-instance v0, Lo7/h1;

    const-string v1, "OPERATOR_UNSPECIFIED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lo7/h1;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo7/h1;->b:Lo7/h1;

    new-instance v1, Lo7/h1;

    const-string v2, "LESS_THAN"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, Lo7/h1;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lo7/h1;->c:Lo7/h1;

    new-instance v2, Lo7/h1;

    const-string v3, "LESS_THAN_OR_EQUAL"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4}, Lo7/h1;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lo7/h1;->d:Lo7/h1;

    new-instance v3, Lo7/h1;

    const-string v4, "GREATER_THAN"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5, v5}, Lo7/h1;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lo7/h1;->e:Lo7/h1;

    new-instance v4, Lo7/h1;

    const-string v5, "GREATER_THAN_OR_EQUAL"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6, v6}, Lo7/h1;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lo7/h1;->f:Lo7/h1;

    new-instance v5, Lo7/h1;

    const-string v6, "EQUAL"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7, v7}, Lo7/h1;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lo7/h1;->n:Lo7/h1;

    new-instance v6, Lo7/h1;

    const-string v7, "NOT_EQUAL"

    const/4 v8, 0x6

    invoke-direct {v6, v7, v8, v8}, Lo7/h1;-><init>(Ljava/lang/String;II)V

    sput-object v6, Lo7/h1;->o:Lo7/h1;

    new-instance v7, Lo7/h1;

    const-string v8, "ARRAY_CONTAINS"

    const/4 v9, 0x7

    invoke-direct {v7, v8, v9, v9}, Lo7/h1;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lo7/h1;->p:Lo7/h1;

    new-instance v8, Lo7/h1;

    const-string v9, "IN"

    const/16 v10, 0x8

    invoke-direct {v8, v9, v10, v10}, Lo7/h1;-><init>(Ljava/lang/String;II)V

    sput-object v8, Lo7/h1;->q:Lo7/h1;

    new-instance v9, Lo7/h1;

    const-string v10, "ARRAY_CONTAINS_ANY"

    const/16 v11, 0x9

    invoke-direct {v9, v10, v11, v11}, Lo7/h1;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lo7/h1;->r:Lo7/h1;

    new-instance v10, Lo7/h1;

    const-string v11, "NOT_IN"

    const/16 v12, 0xa

    invoke-direct {v10, v11, v12, v12}, Lo7/h1;-><init>(Ljava/lang/String;II)V

    sput-object v10, Lo7/h1;->s:Lo7/h1;

    new-instance v11, Lo7/h1;

    const/16 v12, 0xb

    const/4 v13, -0x1

    const-string v14, "UNRECOGNIZED"

    invoke-direct {v11, v14, v12, v13}, Lo7/h1;-><init>(Ljava/lang/String;II)V

    sput-object v11, Lo7/h1;->t:Lo7/h1;

    filled-new-array/range {v0 .. v11}, [Lo7/h1;

    move-result-object v0

    sput-object v0, Lo7/h1;->u:[Lo7/h1;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lo7/h1;->a:I

    return-void
.end method

.method public static a(I)Lo7/h1;
    .locals 0

    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    :pswitch_0
    sget-object p0, Lo7/h1;->s:Lo7/h1;

    return-object p0

    :pswitch_1
    sget-object p0, Lo7/h1;->r:Lo7/h1;

    return-object p0

    :pswitch_2
    sget-object p0, Lo7/h1;->q:Lo7/h1;

    return-object p0

    :pswitch_3
    sget-object p0, Lo7/h1;->p:Lo7/h1;

    return-object p0

    :pswitch_4
    sget-object p0, Lo7/h1;->o:Lo7/h1;

    return-object p0

    :pswitch_5
    sget-object p0, Lo7/h1;->n:Lo7/h1;

    return-object p0

    :pswitch_6
    sget-object p0, Lo7/h1;->f:Lo7/h1;

    return-object p0

    :pswitch_7
    sget-object p0, Lo7/h1;->e:Lo7/h1;

    return-object p0

    :pswitch_8
    sget-object p0, Lo7/h1;->d:Lo7/h1;

    return-object p0

    :pswitch_9
    sget-object p0, Lo7/h1;->c:Lo7/h1;

    return-object p0

    :pswitch_a
    sget-object p0, Lo7/h1;->b:Lo7/h1;

    return-object p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static valueOf(Ljava/lang/String;)Lo7/h1;
    .locals 1

    const-class v0, Lo7/h1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lo7/h1;

    return-object p0
.end method

.method public static values()[Lo7/h1;
    .locals 1

    sget-object v0, Lo7/h1;->u:[Lo7/h1;

    invoke-virtual {v0}, [Lo7/h1;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo7/h1;

    return-object v0
.end method


# virtual methods
.method public final getNumber()I
    .locals 2

    sget-object v0, Lo7/h1;->t:Lo7/h1;

    if-eq p0, v0, :cond_0

    iget v0, p0, Lo7/h1;->a:I

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get the number of an unknown enum value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
