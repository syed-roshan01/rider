.class public final Li7/w1;
.super Lcom/google/crypto/tink/shaded/protobuf/b0;


# static fields
.field private static final DEFAULT_INSTANCE:Li7/w1;

.field public static final KEY_VALUE_FIELD_NUMBER:I = 0x3

.field private static volatile PARSER:Lcom/google/crypto/tink/shaded/protobuf/e1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/e1;"
        }
    .end annotation
.end field

.field public static final VERSION_FIELD_NUMBER:I = 0x1


# instance fields
.field private keyValue_:Lcom/google/crypto/tink/shaded/protobuf/l;

.field private version_:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li7/w1;

    invoke-direct {v0}, Li7/w1;-><init>()V

    sput-object v0, Li7/w1;->DEFAULT_INSTANCE:Li7/w1;

    const-class v1, Li7/w1;

    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/b0;->u(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/b0;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/b0;-><init>()V

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:Lcom/google/crypto/tink/shaded/protobuf/k;

    iput-object v0, p0, Li7/w1;->keyValue_:Lcom/google/crypto/tink/shaded/protobuf/l;

    return-void
.end method

.method public static B()Li7/v1;
    .locals 1

    sget-object v0, Li7/w1;->DEFAULT_INSTANCE:Li7/w1;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/b0;->i()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object v0

    check-cast v0, Li7/v1;

    return-object v0
.end method

.method public static C(Lcom/google/crypto/tink/shaded/protobuf/l;Lcom/google/crypto/tink/shaded/protobuf/t;)Li7/w1;
    .locals 1

    sget-object v0, Li7/w1;->DEFAULT_INSTANCE:Li7/w1;

    invoke-static {v0, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/b0;->s(Lcom/google/crypto/tink/shaded/protobuf/b0;Lcom/google/crypto/tink/shaded/protobuf/l;Lcom/google/crypto/tink/shaded/protobuf/t;)Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p0

    check-cast p0, Li7/w1;

    return-object p0
.end method

.method public static x(Li7/w1;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Li7/w1;->version_:I

    return-void
.end method

.method public static y(Li7/w1;Lcom/google/crypto/tink/shaded/protobuf/k;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Li7/w1;->keyValue_:Lcom/google/crypto/tink/shaded/protobuf/l;

    return-void
.end method


# virtual methods
.method public final A()I
    .locals 1

    iget v0, p0, Li7/w1;->version_:I

    return v0
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
    sget-object p1, Li7/w1;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/e1;

    if-nez p1, :cond_1

    const-class v0, Li7/w1;

    monitor-enter v0

    :try_start_0
    sget-object p1, Li7/w1;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/e1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/a0;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    sput-object p1, Li7/w1;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/e1;

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
    sget-object p1, Li7/w1;->DEFAULT_INSTANCE:Li7/w1;

    return-object p1

    :pswitch_2
    new-instance p1, Li7/v1;

    sget-object v0, Li7/w1;->DEFAULT_INSTANCE:Li7/w1;

    invoke-direct {p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/z;-><init>(Lcom/google/crypto/tink/shaded/protobuf/b0;)V

    return-object p1

    :pswitch_3
    new-instance p1, Li7/w1;

    invoke-direct {p1}, Li7/w1;-><init>()V

    return-object p1

    :pswitch_4
    const-string p1, "version_"

    const-string v0, "keyValue_"

    filled-new-array {p1, v0}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n"

    sget-object v1, Li7/w1;->DEFAULT_INSTANCE:Li7/w1;

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

.method public final z()Lcom/google/crypto/tink/shaded/protobuf/l;
    .locals 1

    iget-object v0, p0, Li7/w1;->keyValue_:Lcom/google/crypto/tink/shaded/protobuf/l;

    return-object v0
.end method
