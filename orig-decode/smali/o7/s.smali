.class public final Lo7/s;
.super Lcom/google/protobuf/l0;

# interfaces
.implements Lcom/google/protobuf/u1;


# static fields
.field public static final CREATE_TIME_FIELD_NUMBER:I = 0x3

.field private static final DEFAULT_INSTANCE:Lo7/s;

.field public static final FIELDS_FIELD_NUMBER:I = 0x2

.field public static final NAME_FIELD_NUMBER:I = 0x1

.field private static volatile PARSER:Lcom/google/protobuf/b2; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/b2;"
        }
    .end annotation
.end field

.field public static final UPDATE_TIME_FIELD_NUMBER:I = 0x4


# instance fields
.field private createTime_:Lcom/google/protobuf/q2;

.field private fields_:Lcom/google/protobuf/n1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/n1;"
        }
    .end annotation
.end field

.field private name_:Ljava/lang/String;

.field private updateTime_:Lcom/google/protobuf/q2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo7/s;

    invoke-direct {v0}, Lo7/s;-><init>()V

    sput-object v0, Lo7/s;->DEFAULT_INSTANCE:Lo7/s;

    const-class v1, Lo7/s;

    invoke-static {v1, v0}, Lcom/google/protobuf/l0;->registerDefaultInstance(Ljava/lang/Class;Lcom/google/protobuf/l0;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/l0;-><init>()V

    sget-object v0, Lcom/google/protobuf/n1;->b:Lcom/google/protobuf/n1;

    iput-object v0, p0, Lo7/s;->fields_:Lcom/google/protobuf/n1;

    const-string v0, ""

    iput-object v0, p0, Lo7/s;->name_:Ljava/lang/String;

    return-void
.end method

.method public static f(Lo7/s;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lo7/s;->name_:Ljava/lang/String;

    return-void
.end method

.method public static g(Lo7/s;)Lcom/google/protobuf/n1;
    .locals 2

    iget-object v0, p0, Lo7/s;->fields_:Lcom/google/protobuf/n1;

    iget-boolean v1, v0, Lcom/google/protobuf/n1;->a:Z

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/google/protobuf/n1;->c()Lcom/google/protobuf/n1;

    move-result-object v0

    iput-object v0, p0, Lo7/s;->fields_:Lcom/google/protobuf/n1;

    :cond_0
    iget-object p0, p0, Lo7/s;->fields_:Lcom/google/protobuf/n1;

    return-object p0
.end method

.method public static h(Lo7/s;Lcom/google/protobuf/q2;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lo7/s;->updateTime_:Lcom/google/protobuf/q2;

    return-void
.end method

.method public static i()Lo7/s;
    .locals 1

    sget-object v0, Lo7/s;->DEFAULT_INSTANCE:Lo7/s;

    return-object v0
.end method

.method public static l()Lo7/q;
    .locals 1

    sget-object v0, Lo7/s;->DEFAULT_INSTANCE:Lo7/s;

    invoke-virtual {v0}, Lcom/google/protobuf/l0;->createBuilder()Lcom/google/protobuf/g0;

    move-result-object v0

    check-cast v0, Lo7/q;

    return-object v0
.end method

.method public static m(Lo7/s;)Lo7/q;
    .locals 1

    sget-object v0, Lo7/s;->DEFAULT_INSTANCE:Lo7/s;

    invoke-virtual {v0, p0}, Lcom/google/protobuf/l0;->createBuilder(Lcom/google/protobuf/l0;)Lcom/google/protobuf/g0;

    move-result-object p0

    check-cast p0, Lo7/q;

    return-object p0
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
    sget-object p1, Lo7/s;->PARSER:Lcom/google/protobuf/b2;

    if-nez p1, :cond_1

    const-class p2, Lo7/s;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lo7/s;->PARSER:Lcom/google/protobuf/b2;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/h0;

    sget-object p3, Lo7/s;->DEFAULT_INSTANCE:Lo7/s;

    invoke-direct {p1, p3}, Lcom/google/protobuf/h0;-><init>(Lcom/google/protobuf/l0;)V

    sput-object p1, Lo7/s;->PARSER:Lcom/google/protobuf/b2;

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
    sget-object p1, Lo7/s;->DEFAULT_INSTANCE:Lo7/s;

    return-object p1

    :pswitch_2
    new-instance p1, Lo7/q;

    sget-object p2, Lo7/s;->DEFAULT_INSTANCE:Lo7/s;

    invoke-direct {p1, p2}, Lcom/google/protobuf/g0;-><init>(Lcom/google/protobuf/l0;)V

    return-object p1

    :pswitch_3
    new-instance p1, Lo7/s;

    invoke-direct {p1}, Lo7/s;-><init>()V

    return-object p1

    :pswitch_4
    const-string p1, "name_"

    const-string p2, "fields_"

    sget-object p3, Lo7/r;->a:Lcom/google/protobuf/m1;

    const-string v0, "createTime_"

    const-string v1, "updateTime_"

    filled-new-array {p1, p2, p3, v0, v1}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0208\u00022\u0003\t\u0004\t"

    sget-object p3, Lo7/s;->DEFAULT_INSTANCE:Lo7/s;

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

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo7/s;->name_:Ljava/lang/String;

    return-object v0
.end method

.method public final j()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lo7/s;->fields_:Lcom/google/protobuf/n1;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final k()Lcom/google/protobuf/q2;
    .locals 1

    iget-object v0, p0, Lo7/s;->updateTime_:Lcom/google/protobuf/q2;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/protobuf/q2;->h()Lcom/google/protobuf/q2;

    move-result-object v0

    :cond_0
    return-object v0
.end method
