.class public final Lo7/a2;
.super Lcom/google/protobuf/l0;

# interfaces
.implements Lcom/google/protobuf/u1;


# static fields
.field private static final DEFAULT_INSTANCE:Lo7/a2;

.field public static final DOCUMENTS_FIELD_NUMBER:I = 0x3

.field public static final EXPECTED_COUNT_FIELD_NUMBER:I = 0xc

.field public static final ONCE_FIELD_NUMBER:I = 0x6

.field private static volatile PARSER:Lcom/google/protobuf/b2; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/b2;"
        }
    .end annotation
.end field

.field public static final QUERY_FIELD_NUMBER:I = 0x2

.field public static final READ_TIME_FIELD_NUMBER:I = 0xb

.field public static final RESUME_TOKEN_FIELD_NUMBER:I = 0x4

.field public static final TARGET_ID_FIELD_NUMBER:I = 0x5


# instance fields
.field private expectedCount_:Lcom/google/protobuf/n0;

.field private once_:Z

.field private resumeTypeCase_:I

.field private resumeType_:Ljava/lang/Object;

.field private targetId_:I

.field private targetTypeCase_:I

.field private targetType_:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo7/a2;

    invoke-direct {v0}, Lo7/a2;-><init>()V

    sput-object v0, Lo7/a2;->DEFAULT_INSTANCE:Lo7/a2;

    const-class v1, Lo7/a2;

    invoke-static {v1, v0}, Lcom/google/protobuf/l0;->registerDefaultInstance(Ljava/lang/Class;Lcom/google/protobuf/l0;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/l0;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lo7/a2;->targetTypeCase_:I

    iput v0, p0, Lo7/a2;->resumeTypeCase_:I

    return-void
.end method

.method public static f(Lo7/a2;Lo7/z1;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lo7/a2;->targetType_:Ljava/lang/Object;

    const/4 p1, 0x2

    iput p1, p0, Lo7/a2;->targetTypeCase_:I

    return-void
.end method

.method public static g(Lo7/a2;Lo7/x1;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lo7/a2;->targetType_:Ljava/lang/Object;

    const/4 p1, 0x3

    iput p1, p0, Lo7/a2;->targetTypeCase_:I

    return-void
.end method

.method public static h(Lo7/a2;Lcom/google/protobuf/n;)V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    iput v0, p0, Lo7/a2;->resumeTypeCase_:I

    iput-object p1, p0, Lo7/a2;->resumeType_:Ljava/lang/Object;

    return-void
.end method

.method public static i(Lo7/a2;Lcom/google/protobuf/q2;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lo7/a2;->resumeType_:Ljava/lang/Object;

    const/16 p1, 0xb

    iput p1, p0, Lo7/a2;->resumeTypeCase_:I

    return-void
.end method

.method public static j(Lo7/a2;I)V
    .locals 0

    iput p1, p0, Lo7/a2;->targetId_:I

    return-void
.end method

.method public static k(Lo7/a2;Lcom/google/protobuf/n0;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lo7/a2;->expectedCount_:Lcom/google/protobuf/n0;

    return-void
.end method

.method public static l()Lo7/v1;
    .locals 1

    sget-object v0, Lo7/a2;->DEFAULT_INSTANCE:Lo7/a2;

    invoke-virtual {v0}, Lcom/google/protobuf/l0;->createBuilder()Lcom/google/protobuf/g0;

    move-result-object v0

    check-cast v0, Lo7/v1;

    return-object v0
.end method


# virtual methods
.method public final dynamicMethod(Lcom/google/protobuf/k0;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    sget-object p1, Lo7/a2;->PARSER:Lcom/google/protobuf/b2;

    if-nez p1, :cond_1

    const-class p2, Lo7/a2;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lo7/a2;->PARSER:Lcom/google/protobuf/b2;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/h0;

    sget-object p3, Lo7/a2;->DEFAULT_INSTANCE:Lo7/a2;

    invoke-direct {p1, p3}, Lcom/google/protobuf/h0;-><init>(Lcom/google/protobuf/l0;)V

    sput-object p1, Lo7/a2;->PARSER:Lcom/google/protobuf/b2;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p2

    goto :goto_2

    :goto_1
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_2
    return-object p1

    :pswitch_1
    sget-object p1, Lo7/a2;->DEFAULT_INSTANCE:Lo7/a2;

    return-object p1

    :pswitch_2
    new-instance p1, Lo7/v1;

    sget-object p2, Lo7/a2;->DEFAULT_INSTANCE:Lo7/a2;

    invoke-direct {p1, p2}, Lcom/google/protobuf/g0;-><init>(Lcom/google/protobuf/l0;)V

    return-object p1

    :pswitch_3
    new-instance p1, Lo7/a2;

    invoke-direct {p1}, Lo7/a2;-><init>()V

    return-object p1

    :pswitch_4
    const-string v0, "targetType_"

    const-string v1, "targetTypeCase_"

    const-string v2, "resumeType_"

    const-string v3, "resumeTypeCase_"

    const-class v4, Lo7/z1;

    const-class v5, Lo7/x1;

    const-string v6, "targetId_"

    const-string v7, "once_"

    const-class v8, Lcom/google/protobuf/q2;

    const-string v9, "expectedCount_"

    filled-new-array/range {v0 .. v9}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "\u0000\u0007\u0002\u0000\u0002\u000c\u0007\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004=\u0001\u0005\u0004\u0006\u0007\u000b<\u0001\u000c\t"

    sget-object p3, Lo7/a2;->DEFAULT_INSTANCE:Lo7/a2;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/l0;->newMessageInfo(Lcom/google/protobuf/t1;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    const/4 p1, 0x0

    return-object p1

    :pswitch_6
    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
