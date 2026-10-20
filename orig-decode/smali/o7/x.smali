.class public final Lo7/x;
.super Lcom/google/protobuf/l0;

# interfaces
.implements Lcom/google/protobuf/u1;


# static fields
.field private static final DEFAULT_INSTANCE:Lo7/x;

.field public static final DOCUMENT_FIELD_NUMBER:I = 0x1

.field private static volatile PARSER:Lcom/google/protobuf/b2; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/b2;"
        }
    .end annotation
.end field

.field public static final READ_TIME_FIELD_NUMBER:I = 0x4

.field public static final REMOVED_TARGET_IDS_FIELD_NUMBER:I = 0x2


# instance fields
.field private document_:Ljava/lang/String;

.field private readTime_:Lcom/google/protobuf/q2;

.field private removedTargetIdsMemoizedSerializedSize:I

.field private removedTargetIds_:Lcom/google/protobuf/v0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo7/x;

    invoke-direct {v0}, Lo7/x;-><init>()V

    sput-object v0, Lo7/x;->DEFAULT_INSTANCE:Lo7/x;

    const-class v1, Lo7/x;

    invoke-static {v1, v0}, Lcom/google/protobuf/l0;->registerDefaultInstance(Ljava/lang/Class;Lcom/google/protobuf/l0;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/l0;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lo7/x;->removedTargetIdsMemoizedSerializedSize:I

    const-string v0, ""

    iput-object v0, p0, Lo7/x;->document_:Ljava/lang/String;

    invoke-static {}, Lcom/google/protobuf/l0;->emptyIntList()Lcom/google/protobuf/v0;

    move-result-object v0

    iput-object v0, p0, Lo7/x;->removedTargetIds_:Lcom/google/protobuf/v0;

    return-void
.end method

.method public static synthetic f()Lo7/x;
    .locals 1

    sget-object v0, Lo7/x;->DEFAULT_INSTANCE:Lo7/x;

    return-object v0
.end method

.method public static g()Lo7/x;
    .locals 1

    sget-object v0, Lo7/x;->DEFAULT_INSTANCE:Lo7/x;

    return-object v0
.end method


# virtual methods
.method public final dynamicMethod(Lcom/google/protobuf/k0;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    sget-object p1, Lo7/x;->PARSER:Lcom/google/protobuf/b2;

    if-nez p1, :cond_1

    const-class p2, Lo7/x;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lo7/x;->PARSER:Lcom/google/protobuf/b2;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/h0;

    sget-object p3, Lo7/x;->DEFAULT_INSTANCE:Lo7/x;

    invoke-direct {p1, p3}, Lcom/google/protobuf/h0;-><init>(Lcom/google/protobuf/l0;)V

    sput-object p1, Lo7/x;->PARSER:Lcom/google/protobuf/b2;

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
    sget-object p1, Lo7/x;->DEFAULT_INSTANCE:Lo7/x;

    return-object p1

    :pswitch_2
    new-instance p1, Lo7/b;

    const/4 p2, 0x7

    invoke-direct {p1, p2}, Lo7/b;-><init>(I)V

    return-object p1

    :pswitch_3
    new-instance p1, Lo7/x;

    invoke-direct {p1}, Lo7/x;-><init>()V

    return-object p1

    :pswitch_4
    const-string p1, "document_"

    const-string p2, "removedTargetIds_"

    const-string p3, "readTime_"

    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0001\u0000\u0001\u0208\u0002\'\u0004\t"

    sget-object p3, Lo7/x;->DEFAULT_INSTANCE:Lo7/x;

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

.method public final h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo7/x;->document_:Ljava/lang/String;

    return-object v0
.end method

.method public final i()Lcom/google/protobuf/v0;
    .locals 1

    iget-object v0, p0, Lo7/x;->removedTargetIds_:Lcom/google/protobuf/v0;

    return-object v0
.end method
