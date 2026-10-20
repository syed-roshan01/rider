.class public final Lo7/p1;
.super Lcom/google/protobuf/l0;

# interfaces
.implements Lcom/google/protobuf/u1;


# static fields
.field private static final DEFAULT_INSTANCE:Lo7/p1;

.field public static final DIRECTION_FIELD_NUMBER:I = 0x2

.field public static final FIELD_FIELD_NUMBER:I = 0x1

.field private static volatile PARSER:Lcom/google/protobuf/b2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/b2;"
        }
    .end annotation
.end field


# instance fields
.field private direction_:I

.field private field_:Lo7/k1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo7/p1;

    invoke-direct {v0}, Lcom/google/protobuf/l0;-><init>()V

    sput-object v0, Lo7/p1;->DEFAULT_INSTANCE:Lo7/p1;

    const-class v1, Lo7/p1;

    invoke-static {v1, v0}, Lcom/google/protobuf/l0;->registerDefaultInstance(Ljava/lang/Class;Lcom/google/protobuf/l0;)V

    return-void
.end method

.method public static f(Lo7/p1;Lo7/k1;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lo7/p1;->field_:Lo7/k1;

    return-void
.end method

.method public static g(Lo7/p1;Lo7/f1;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Lo7/f1;->getNumber()I

    move-result p1

    iput p1, p0, Lo7/p1;->direction_:I

    return-void
.end method

.method public static j()Lo7/o1;
    .locals 1

    sget-object v0, Lo7/p1;->DEFAULT_INSTANCE:Lo7/p1;

    invoke-virtual {v0}, Lcom/google/protobuf/l0;->createBuilder()Lcom/google/protobuf/g0;

    move-result-object v0

    check-cast v0, Lo7/o1;

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
    sget-object p1, Lo7/p1;->PARSER:Lcom/google/protobuf/b2;

    if-nez p1, :cond_1

    const-class p2, Lo7/p1;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lo7/p1;->PARSER:Lcom/google/protobuf/b2;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/h0;

    sget-object p3, Lo7/p1;->DEFAULT_INSTANCE:Lo7/p1;

    invoke-direct {p1, p3}, Lcom/google/protobuf/h0;-><init>(Lcom/google/protobuf/l0;)V

    sput-object p1, Lo7/p1;->PARSER:Lcom/google/protobuf/b2;

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
    sget-object p1, Lo7/p1;->DEFAULT_INSTANCE:Lo7/p1;

    return-object p1

    :pswitch_2
    new-instance p1, Lo7/o1;

    sget-object p2, Lo7/p1;->DEFAULT_INSTANCE:Lo7/p1;

    invoke-direct {p1, p2}, Lcom/google/protobuf/g0;-><init>(Lcom/google/protobuf/l0;)V

    return-object p1

    :pswitch_3
    new-instance p1, Lo7/p1;

    invoke-direct {p1}, Lcom/google/protobuf/l0;-><init>()V

    return-object p1

    :pswitch_4
    const-string p1, "field_"

    const-string p2, "direction_"

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000c"

    sget-object p3, Lo7/p1;->DEFAULT_INSTANCE:Lo7/p1;

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

.method public final h()Lo7/f1;
    .locals 2

    iget v0, p0, Lo7/p1;->direction_:I

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    sget-object v0, Lo7/f1;->d:Lo7/f1;

    goto :goto_0

    :cond_1
    sget-object v0, Lo7/f1;->c:Lo7/f1;

    goto :goto_0

    :cond_2
    sget-object v0, Lo7/f1;->b:Lo7/f1;

    :goto_0
    if-nez v0, :cond_3

    sget-object v0, Lo7/f1;->e:Lo7/f1;

    :cond_3
    return-object v0
.end method

.method public final i()Lo7/k1;
    .locals 1

    iget-object v0, p0, Lo7/p1;->field_:Lo7/k1;

    if-nez v0, :cond_0

    invoke-static {}, Lo7/k1;->g()Lo7/k1;

    move-result-object v0

    :cond_0
    return-object v0
.end method
