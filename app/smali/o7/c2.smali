.class public final Lo7/c2;
.super Lcom/google/protobuf/l0;

# interfaces
.implements Lcom/google/protobuf/u1;


# static fields
.field public static final CAUSE_FIELD_NUMBER:I = 0x3

.field private static final DEFAULT_INSTANCE:Lo7/c2;

.field private static volatile PARSER:Lcom/google/protobuf/b2; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/b2;"
        }
    .end annotation
.end field

.field public static final READ_TIME_FIELD_NUMBER:I = 0x6

.field public static final RESUME_TOKEN_FIELD_NUMBER:I = 0x4

.field public static final TARGET_CHANGE_TYPE_FIELD_NUMBER:I = 0x1

.field public static final TARGET_IDS_FIELD_NUMBER:I = 0x2


# instance fields
.field private cause_:Lw7/a;

.field private readTime_:Lcom/google/protobuf/q2;

.field private resumeToken_:Lcom/google/protobuf/n;

.field private targetChangeType_:I

.field private targetIdsMemoizedSerializedSize:I

.field private targetIds_:Lcom/google/protobuf/v0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo7/c2;

    invoke-direct {v0}, Lo7/c2;-><init>()V

    sput-object v0, Lo7/c2;->DEFAULT_INSTANCE:Lo7/c2;

    const-class v1, Lo7/c2;

    invoke-static {v1, v0}, Lcom/google/protobuf/l0;->registerDefaultInstance(Ljava/lang/Class;Lcom/google/protobuf/l0;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/l0;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lo7/c2;->targetIdsMemoizedSerializedSize:I

    invoke-static {}, Lcom/google/protobuf/l0;->emptyIntList()Lcom/google/protobuf/v0;

    move-result-object v0

    iput-object v0, p0, Lo7/c2;->targetIds_:Lcom/google/protobuf/v0;

    sget-object v0, Lcom/google/protobuf/n;->b:Lcom/google/protobuf/m;

    iput-object v0, p0, Lo7/c2;->resumeToken_:Lcom/google/protobuf/n;

    return-void
.end method

.method public static synthetic f()Lo7/c2;
    .locals 1

    sget-object v0, Lo7/c2;->DEFAULT_INSTANCE:Lo7/c2;

    return-object v0
.end method

.method public static h()Lo7/c2;
    .locals 1

    sget-object v0, Lo7/c2;->DEFAULT_INSTANCE:Lo7/c2;

    return-object v0
.end method


# virtual methods
.method public final dynamicMethod(Lcom/google/protobuf/k0;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    sget-object p1, Lo7/c2;->PARSER:Lcom/google/protobuf/b2;

    if-nez p1, :cond_1

    const-class p2, Lo7/c2;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lo7/c2;->PARSER:Lcom/google/protobuf/b2;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/h0;

    sget-object p3, Lo7/c2;->DEFAULT_INSTANCE:Lo7/c2;

    invoke-direct {p1, p3}, Lcom/google/protobuf/h0;-><init>(Lcom/google/protobuf/l0;)V

    sput-object p1, Lo7/c2;->PARSER:Lcom/google/protobuf/b2;

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
    sget-object p1, Lo7/c2;->DEFAULT_INSTANCE:Lo7/c2;

    return-object p1

    :pswitch_2
    new-instance p1, Lo7/b;

    const/16 p2, 0xe

    invoke-direct {p1, p2}, Lo7/b;-><init>(I)V

    return-object p1

    :pswitch_3
    new-instance p1, Lo7/c2;

    invoke-direct {p1}, Lo7/c2;-><init>()V

    return-object p1

    :pswitch_4
    const-string p1, "targetChangeType_"

    const-string p2, "targetIds_"

    const-string p3, "cause_"

    const-string v0, "resumeToken_"

    const-string v1, "readTime_"

    filled-new-array {p1, p2, p3, v0, v1}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "\u0000\u0005\u0000\u0000\u0001\u0006\u0005\u0000\u0001\u0000\u0001\u000c\u0002\'\u0003\t\u0004\n\u0006\t"

    sget-object p3, Lo7/c2;->DEFAULT_INSTANCE:Lo7/c2;

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

.method public final g()Lw7/a;
    .locals 1

    iget-object v0, p0, Lo7/c2;->cause_:Lw7/a;

    if-nez v0, :cond_0

    invoke-static {}, Lw7/a;->h()Lw7/a;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final getReadTime()Lcom/google/protobuf/q2;
    .locals 1

    iget-object v0, p0, Lo7/c2;->readTime_:Lcom/google/protobuf/q2;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/protobuf/q2;->h()Lcom/google/protobuf/q2;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final getResumeToken()Lcom/google/protobuf/n;
    .locals 1

    iget-object v0, p0, Lo7/c2;->resumeToken_:Lcom/google/protobuf/n;

    return-object v0
.end method

.method public final i()Lo7/b2;
    .locals 1

    iget v0, p0, Lo7/c2;->targetChangeType_:I

    invoke-static {v0}, Lo7/b2;->a(I)Lo7/b2;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lo7/b2;->n:Lo7/b2;

    :cond_0
    return-object v0
.end method

.method public final j()I
    .locals 1

    iget-object v0, p0, Lo7/c2;->targetIds_:Lcom/google/protobuf/v0;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final k()Lcom/google/protobuf/v0;
    .locals 1

    iget-object v0, p0, Lo7/c2;->targetIds_:Lcom/google/protobuf/v0;

    return-object v0
.end method
