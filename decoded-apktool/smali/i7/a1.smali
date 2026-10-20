.class public final Li7/a1;
.super Lcom/google/crypto/tink/shaded/protobuf/b0;


# static fields
.field private static final DEFAULT_INSTANCE:Li7/a1;

.field public static final KEY_MATERIAL_TYPE_FIELD_NUMBER:I = 0x3

.field private static volatile PARSER:Lcom/google/crypto/tink/shaded/protobuf/e1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/e1;"
        }
    .end annotation
.end field

.field public static final TYPE_URL_FIELD_NUMBER:I = 0x1

.field public static final VALUE_FIELD_NUMBER:I = 0x2


# instance fields
.field private keyMaterialType_:I

.field private typeUrl_:Ljava/lang/String;

.field private value_:Lcom/google/crypto/tink/shaded/protobuf/l;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li7/a1;

    invoke-direct {v0}, Li7/a1;-><init>()V

    sput-object v0, Li7/a1;->DEFAULT_INSTANCE:Li7/a1;

    const-class v1, Li7/a1;

    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/b0;->u(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/b0;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/b0;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Li7/a1;->typeUrl_:Ljava/lang/String;

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/l;->b:Lcom/google/crypto/tink/shaded/protobuf/k;

    iput-object v0, p0, Li7/a1;->value_:Lcom/google/crypto/tink/shaded/protobuf/l;

    return-void
.end method

.method public static A()Li7/a1;
    .locals 1

    sget-object v0, Li7/a1;->DEFAULT_INSTANCE:Li7/a1;

    return-object v0
.end method

.method public static E()Li7/y0;
    .locals 1

    sget-object v0, Li7/a1;->DEFAULT_INSTANCE:Li7/a1;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/b0;->i()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object v0

    check-cast v0, Li7/y0;

    return-object v0
.end method

.method public static x(Li7/a1;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Li7/a1;->typeUrl_:Ljava/lang/String;

    return-void
.end method

.method public static y(Li7/a1;Lcom/google/crypto/tink/shaded/protobuf/k;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Li7/a1;->value_:Lcom/google/crypto/tink/shaded/protobuf/l;

    return-void
.end method

.method public static z(Li7/a1;Li7/z0;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Li7/z0;->b()I

    move-result p1

    iput p1, p0, Li7/a1;->keyMaterialType_:I

    return-void
.end method


# virtual methods
.method public final B()Li7/z0;
    .locals 1

    iget v0, p0, Li7/a1;->keyMaterialType_:I

    invoke-static {v0}, Li7/z0;->a(I)Li7/z0;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Li7/z0;->n:Li7/z0;

    :cond_0
    return-object v0
.end method

.method public final C()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Li7/a1;->typeUrl_:Ljava/lang/String;

    return-object v0
.end method

.method public final D()Lcom/google/crypto/tink/shaded/protobuf/l;
    .locals 1

    iget-object v0, p0, Li7/a1;->value_:Lcom/google/crypto/tink/shaded/protobuf/l;

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
    sget-object p1, Li7/a1;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/e1;

    if-nez p1, :cond_1

    const-class v0, Li7/a1;

    monitor-enter v0

    :try_start_0
    sget-object p1, Li7/a1;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/e1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/a0;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    sput-object p1, Li7/a1;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/e1;

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
    sget-object p1, Li7/a1;->DEFAULT_INSTANCE:Li7/a1;

    return-object p1

    :pswitch_2
    new-instance p1, Li7/y0;

    sget-object v0, Li7/a1;->DEFAULT_INSTANCE:Li7/a1;

    invoke-direct {p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/z;-><init>(Lcom/google/crypto/tink/shaded/protobuf/b0;)V

    return-object p1

    :pswitch_3
    new-instance p1, Li7/a1;

    invoke-direct {p1}, Li7/a1;-><init>()V

    return-object p1

    :pswitch_4
    const-string p1, "typeUrl_"

    const-string v0, "value_"

    const-string v1, "keyMaterialType_"

    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\n\u0003\u000c"

    sget-object v1, Li7/a1;->DEFAULT_INSTANCE:Li7/a1;

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
