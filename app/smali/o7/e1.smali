.class public final Lo7/e1;
.super Lcom/google/protobuf/l0;

# interfaces
.implements Lcom/google/protobuf/u1;


# static fields
.field private static final DEFAULT_INSTANCE:Lo7/e1;

.field public static final FILTERS_FIELD_NUMBER:I = 0x2

.field public static final OP_FIELD_NUMBER:I = 0x1

.field private static volatile PARSER:Lcom/google/protobuf/b2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/b2;"
        }
    .end annotation
.end field


# instance fields
.field private filters_:Lcom/google/protobuf/x0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/x0;"
        }
    .end annotation
.end field

.field private op_:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo7/e1;

    invoke-direct {v0}, Lo7/e1;-><init>()V

    sput-object v0, Lo7/e1;->DEFAULT_INSTANCE:Lo7/e1;

    const-class v1, Lo7/e1;

    invoke-static {v1, v0}, Lcom/google/protobuf/l0;->registerDefaultInstance(Ljava/lang/Class;Lcom/google/protobuf/l0;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/l0;-><init>()V

    invoke-static {}, Lcom/google/protobuf/l0;->emptyProtobufList()Lcom/google/protobuf/x0;

    move-result-object v0

    iput-object v0, p0, Lo7/e1;->filters_:Lcom/google/protobuf/x0;

    return-void
.end method

.method public static f(Lo7/e1;Lo7/d1;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Lo7/d1;->getNumber()I

    move-result p1

    iput p1, p0, Lo7/e1;->op_:I

    return-void
.end method

.method public static g(Lo7/e1;Ljava/util/ArrayList;)V
    .locals 2

    iget-object v0, p0, Lo7/e1;->filters_:Lcom/google/protobuf/x0;

    move-object v1, v0

    check-cast v1, Lcom/google/protobuf/d;

    iget-boolean v1, v1, Lcom/google/protobuf/d;->a:Z

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/protobuf/l0;->mutableCopy(Lcom/google/protobuf/x0;)Lcom/google/protobuf/x0;

    move-result-object v0

    iput-object v0, p0, Lo7/e1;->filters_:Lcom/google/protobuf/x0;

    :cond_0
    iget-object p0, p0, Lo7/e1;->filters_:Lcom/google/protobuf/x0;

    invoke-static {p1, p0}, Lcom/google/protobuf/c;->addAll(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method public static h()Lo7/e1;
    .locals 1

    sget-object v0, Lo7/e1;->DEFAULT_INSTANCE:Lo7/e1;

    return-object v0
.end method

.method public static k()Lo7/c1;
    .locals 1

    sget-object v0, Lo7/e1;->DEFAULT_INSTANCE:Lo7/e1;

    invoke-virtual {v0}, Lcom/google/protobuf/l0;->createBuilder()Lcom/google/protobuf/g0;

    move-result-object v0

    check-cast v0, Lo7/c1;

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
    sget-object p1, Lo7/e1;->PARSER:Lcom/google/protobuf/b2;

    if-nez p1, :cond_1

    const-class p2, Lo7/e1;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lo7/e1;->PARSER:Lcom/google/protobuf/b2;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/h0;

    sget-object p3, Lo7/e1;->DEFAULT_INSTANCE:Lo7/e1;

    invoke-direct {p1, p3}, Lcom/google/protobuf/h0;-><init>(Lcom/google/protobuf/l0;)V

    sput-object p1, Lo7/e1;->PARSER:Lcom/google/protobuf/b2;

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
    sget-object p1, Lo7/e1;->DEFAULT_INSTANCE:Lo7/e1;

    return-object p1

    :pswitch_2
    new-instance p1, Lo7/c1;

    sget-object p2, Lo7/e1;->DEFAULT_INSTANCE:Lo7/e1;

    invoke-direct {p1, p2}, Lcom/google/protobuf/g0;-><init>(Lcom/google/protobuf/l0;)V

    return-object p1

    :pswitch_3
    new-instance p1, Lo7/e1;

    invoke-direct {p1}, Lo7/e1;-><init>()V

    return-object p1

    :pswitch_4
    const-string p1, "op_"

    const-string p2, "filters_"

    const-class p3, Lo7/n1;

    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000c\u0002\u001b"

    sget-object p3, Lo7/e1;->DEFAULT_INSTANCE:Lo7/e1;

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

.method public final i()Lcom/google/protobuf/x0;
    .locals 1

    iget-object v0, p0, Lo7/e1;->filters_:Lcom/google/protobuf/x0;

    return-object v0
.end method

.method public final j()Lo7/d1;
    .locals 2

    iget v0, p0, Lo7/e1;->op_:I

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    sget-object v0, Lo7/d1;->d:Lo7/d1;

    goto :goto_0

    :cond_1
    sget-object v0, Lo7/d1;->c:Lo7/d1;

    goto :goto_0

    :cond_2
    sget-object v0, Lo7/d1;->b:Lo7/d1;

    :goto_0
    if-nez v0, :cond_3

    sget-object v0, Lo7/d1;->e:Lo7/d1;

    :cond_3
    return-object v0
.end method
