.class public final Li7/t;
.super Lcom/google/crypto/tink/shaded/protobuf/b0;


# static fields
.field private static final DEFAULT_INSTANCE:Li7/t;

.field public static final KEY_SIZE_FIELD_NUMBER:I = 0x2

.field public static final PARAMS_FIELD_NUMBER:I = 0x1

.field private static volatile PARSER:Lcom/google/crypto/tink/shaded/protobuf/e1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/e1;"
        }
    .end annotation
.end field


# instance fields
.field private keySize_:I

.field private params_:Li7/v;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li7/t;

    invoke-direct {v0}, Lcom/google/crypto/tink/shaded/protobuf/b0;-><init>()V

    sput-object v0, Li7/t;->DEFAULT_INSTANCE:Li7/t;

    const-class v1, Li7/t;

    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/b0;->u(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/b0;)V

    return-void
.end method

.method public static B()Li7/s;
    .locals 1

    sget-object v0, Li7/t;->DEFAULT_INSTANCE:Li7/t;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/b0;->i()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object v0

    check-cast v0, Li7/s;

    return-object v0
.end method

.method public static C(Lcom/google/crypto/tink/shaded/protobuf/l;Lcom/google/crypto/tink/shaded/protobuf/t;)Li7/t;
    .locals 1

    sget-object v0, Li7/t;->DEFAULT_INSTANCE:Li7/t;

    invoke-static {v0, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/b0;->s(Lcom/google/crypto/tink/shaded/protobuf/b0;Lcom/google/crypto/tink/shaded/protobuf/l;Lcom/google/crypto/tink/shaded/protobuf/t;)Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p0

    check-cast p0, Li7/t;

    return-object p0
.end method

.method public static x(Li7/t;Li7/v;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Li7/t;->params_:Li7/v;

    return-void
.end method

.method public static y(Li7/t;I)V
    .locals 0

    iput p1, p0, Li7/t;->keySize_:I

    return-void
.end method


# virtual methods
.method public final A()Li7/v;
    .locals 1

    iget-object v0, p0, Li7/t;->params_:Li7/v;

    if-nez v0, :cond_0

    invoke-static {}, Li7/v;->y()Li7/v;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final j(I)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    const/4 v1, 0x1

    sub-int/2addr p1, v1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    sget-object p1, Li7/t;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/e1;

    if-nez p1, :cond_1

    const-class v0, Li7/t;

    monitor-enter v0

    :try_start_0
    sget-object p1, Li7/t;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/e1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/a0;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    sput-object p1, Li7/t;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/e1;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_2
    return-object p1

    :pswitch_1
    sget-object p1, Li7/t;->DEFAULT_INSTANCE:Li7/t;

    return-object p1

    :pswitch_2
    new-instance p1, Li7/s;

    sget-object v0, Li7/t;->DEFAULT_INSTANCE:Li7/t;

    invoke-direct {p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/z;-><init>(Lcom/google/crypto/tink/shaded/protobuf/b0;)V

    return-object p1

    :pswitch_3
    new-instance p1, Li7/t;

    invoke-direct {p1}, Lcom/google/crypto/tink/shaded/protobuf/b0;-><init>()V

    return-object p1

    :pswitch_4
    const-string p1, "params_"

    const-string v0, "keySize_"

    filled-new-array {p1, v0}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b"

    sget-object v1, Li7/t;->DEFAULT_INSTANCE:Li7/t;

    new-instance v2, Lcom/google/crypto/tink/shaded/protobuf/i1;

    invoke-direct {v2, v1, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/i1;-><init>(Lcom/google/crypto/tink/shaded/protobuf/b0;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v2

    :pswitch_5
    return-object v0

    :pswitch_6
    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :cond_2
    throw v0

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

.method public final z()I
    .locals 1

    iget v0, p0, Li7/t;->keySize_:I

    return v0
.end method
