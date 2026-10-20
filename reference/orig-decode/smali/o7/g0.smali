.class public final Lo7/g0;
.super Lcom/google/protobuf/l0;

# interfaces
.implements Lcom/google/protobuf/u1;


# static fields
.field public static final ADD_TARGET_FIELD_NUMBER:I = 0x2

.field public static final DATABASE_FIELD_NUMBER:I = 0x1

.field private static final DEFAULT_INSTANCE:Lo7/g0;

.field public static final LABELS_FIELD_NUMBER:I = 0x4

.field private static volatile PARSER:Lcom/google/protobuf/b2; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/b2;"
        }
    .end annotation
.end field

.field public static final REMOVE_TARGET_FIELD_NUMBER:I = 0x3


# instance fields
.field private database_:Ljava/lang/String;

.field private labels_:Lcom/google/protobuf/n1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/n1;"
        }
    .end annotation
.end field

.field private targetChangeCase_:I

.field private targetChange_:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo7/g0;

    invoke-direct {v0}, Lo7/g0;-><init>()V

    sput-object v0, Lo7/g0;->DEFAULT_INSTANCE:Lo7/g0;

    const-class v1, Lo7/g0;

    invoke-static {v1, v0}, Lcom/google/protobuf/l0;->registerDefaultInstance(Ljava/lang/Class;Lcom/google/protobuf/l0;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/l0;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lo7/g0;->targetChangeCase_:I

    sget-object v0, Lcom/google/protobuf/n1;->b:Lcom/google/protobuf/n1;

    iput-object v0, p0, Lo7/g0;->labels_:Lcom/google/protobuf/n1;

    const-string v0, ""

    iput-object v0, p0, Lo7/g0;->database_:Ljava/lang/String;

    return-void
.end method

.method public static f(Lo7/g0;)Lcom/google/protobuf/n1;
    .locals 2

    iget-object v0, p0, Lo7/g0;->labels_:Lcom/google/protobuf/n1;

    iget-boolean v1, v0, Lcom/google/protobuf/n1;->a:Z

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/google/protobuf/n1;->c()Lcom/google/protobuf/n1;

    move-result-object v0

    iput-object v0, p0, Lo7/g0;->labels_:Lcom/google/protobuf/n1;

    :cond_0
    iget-object p0, p0, Lo7/g0;->labels_:Lcom/google/protobuf/n1;

    return-object p0
.end method

.method public static g(Lo7/g0;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lo7/g0;->database_:Ljava/lang/String;

    return-void
.end method

.method public static h(Lo7/g0;Lo7/a2;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lo7/g0;->targetChange_:Ljava/lang/Object;

    const/4 p1, 0x2

    iput p1, p0, Lo7/g0;->targetChangeCase_:I

    return-void
.end method

.method public static i(Lo7/g0;I)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lo7/g0;->targetChangeCase_:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lo7/g0;->targetChange_:Ljava/lang/Object;

    return-void
.end method

.method public static j()Lo7/g0;
    .locals 1

    sget-object v0, Lo7/g0;->DEFAULT_INSTANCE:Lo7/g0;

    return-object v0
.end method

.method public static k()Lo7/e0;
    .locals 1

    sget-object v0, Lo7/g0;->DEFAULT_INSTANCE:Lo7/g0;

    invoke-virtual {v0}, Lcom/google/protobuf/l0;->createBuilder()Lcom/google/protobuf/g0;

    move-result-object v0

    check-cast v0, Lo7/e0;

    return-object v0
.end method


# virtual methods
.method public final dynamicMethod(Lcom/google/protobuf/k0;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    sget-object p1, Lo7/g0;->PARSER:Lcom/google/protobuf/b2;

    if-nez p1, :cond_1

    const-class p2, Lo7/g0;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lo7/g0;->PARSER:Lcom/google/protobuf/b2;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/h0;

    sget-object p3, Lo7/g0;->DEFAULT_INSTANCE:Lo7/g0;

    invoke-direct {p1, p3}, Lcom/google/protobuf/h0;-><init>(Lcom/google/protobuf/l0;)V

    sput-object p1, Lo7/g0;->PARSER:Lcom/google/protobuf/b2;

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
    sget-object p1, Lo7/g0;->DEFAULT_INSTANCE:Lo7/g0;

    return-object p1

    :pswitch_2
    new-instance p1, Lo7/e0;

    sget-object p2, Lo7/g0;->DEFAULT_INSTANCE:Lo7/g0;

    invoke-direct {p1, p2}, Lcom/google/protobuf/g0;-><init>(Lcom/google/protobuf/l0;)V

    return-object p1

    :pswitch_3
    new-instance p1, Lo7/g0;

    invoke-direct {p1}, Lo7/g0;-><init>()V

    return-object p1

    :pswitch_4
    const-string v0, "targetChange_"

    const-string v1, "targetChangeCase_"

    const-string v2, "database_"

    const-class v3, Lo7/a2;

    const-string v4, "labels_"

    sget-object v5, Lo7/f0;->a:Lcom/google/protobuf/m1;

    filled-new-array/range {v0 .. v5}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0208\u0002<\u0000\u00037\u0000\u00042"

    sget-object p3, Lo7/g0;->DEFAULT_INSTANCE:Lo7/g0;

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
