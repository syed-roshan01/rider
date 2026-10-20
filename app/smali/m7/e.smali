.class public final Lm7/e;
.super Lcom/google/protobuf/l0;

# interfaces
.implements Lcom/google/protobuf/u1;


# static fields
.field public static final ARRAY_CONFIG_FIELD_NUMBER:I = 0x3

.field private static final DEFAULT_INSTANCE:Lm7/e;

.field public static final FIELD_PATH_FIELD_NUMBER:I = 0x1

.field public static final ORDER_FIELD_NUMBER:I = 0x2

.field private static volatile PARSER:Lcom/google/protobuf/b2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/b2;"
        }
    .end annotation
.end field


# instance fields
.field private fieldPath_:Ljava/lang/String;

.field private valueModeCase_:I

.field private valueMode_:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lm7/e;

    invoke-direct {v0}, Lm7/e;-><init>()V

    sput-object v0, Lm7/e;->DEFAULT_INSTANCE:Lm7/e;

    const-class v1, Lm7/e;

    invoke-static {v1, v0}, Lcom/google/protobuf/l0;->registerDefaultInstance(Ljava/lang/Class;Lcom/google/protobuf/l0;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/l0;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lm7/e;->valueModeCase_:I

    const-string v0, ""

    iput-object v0, p0, Lm7/e;->fieldPath_:Ljava/lang/String;

    return-void
.end method

.method public static f(Lm7/e;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lm7/e;->fieldPath_:Ljava/lang/String;

    return-void
.end method

.method public static g(Lm7/e;Lm7/d;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Lm7/d;->getNumber()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lm7/e;->valueMode_:Ljava/lang/Object;

    const/4 p1, 0x2

    iput p1, p0, Lm7/e;->valueModeCase_:I

    return-void
.end method

.method public static h(Lm7/e;)V
    .locals 1

    sget-object v0, Lm7/b;->b:Lm7/b;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Lm7/b;->getNumber()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lm7/e;->valueMode_:Ljava/lang/Object;

    const/4 v0, 0x3

    iput v0, p0, Lm7/e;->valueModeCase_:I

    return-void
.end method

.method public static l()Lm7/c;
    .locals 1

    sget-object v0, Lm7/e;->DEFAULT_INSTANCE:Lm7/e;

    invoke-virtual {v0}, Lcom/google/protobuf/l0;->createBuilder()Lcom/google/protobuf/g0;

    move-result-object v0

    check-cast v0, Lm7/c;

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
    sget-object p1, Lm7/e;->PARSER:Lcom/google/protobuf/b2;

    if-nez p1, :cond_1

    const-class p2, Lm7/e;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lm7/e;->PARSER:Lcom/google/protobuf/b2;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/h0;

    sget-object p3, Lm7/e;->DEFAULT_INSTANCE:Lm7/e;

    invoke-direct {p1, p3}, Lcom/google/protobuf/h0;-><init>(Lcom/google/protobuf/l0;)V

    sput-object p1, Lm7/e;->PARSER:Lcom/google/protobuf/b2;

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
    sget-object p1, Lm7/e;->DEFAULT_INSTANCE:Lm7/e;

    return-object p1

    :pswitch_2
    new-instance p1, Lm7/c;

    sget-object p2, Lm7/e;->DEFAULT_INSTANCE:Lm7/e;

    invoke-direct {p1, p2}, Lcom/google/protobuf/g0;-><init>(Lcom/google/protobuf/l0;)V

    return-object p1

    :pswitch_3
    new-instance p1, Lm7/e;

    invoke-direct {p1}, Lm7/e;-><init>()V

    return-object p1

    :pswitch_4
    const-string p1, "valueMode_"

    const-string p2, "valueModeCase_"

    const-string p3, "fieldPath_"

    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002?\u0000\u0003?\u0000"

    sget-object p3, Lm7/e;->DEFAULT_INSTANCE:Lm7/e;

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

.method public final i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lm7/e;->fieldPath_:Ljava/lang/String;

    return-object v0
.end method

.method public final j()Lm7/d;
    .locals 3

    iget v0, p0, Lm7/e;->valueModeCase_:I

    sget-object v1, Lm7/d;->b:Lm7/d;

    const/4 v2, 0x2

    if-ne v0, v2, :cond_3

    iget-object v0, p0, Lm7/e;->valueMode_:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    if-eq v0, v2, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    sget-object v1, Lm7/d;->d:Lm7/d;

    goto :goto_0

    :cond_1
    sget-object v1, Lm7/d;->c:Lm7/d;

    :cond_2
    :goto_0
    if-nez v1, :cond_3

    sget-object v1, Lm7/d;->e:Lm7/d;

    :cond_3
    return-object v1
.end method

.method public final k()I
    .locals 3

    iget v0, p0, Lm7/e;->valueModeCase_:I

    const/4 v1, 0x3

    if-eqz v0, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    if-eq v0, v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    move v1, v2

    goto :goto_0

    :cond_1
    const/4 v1, 0x1

    :cond_2
    :goto_0
    return v1
.end method
