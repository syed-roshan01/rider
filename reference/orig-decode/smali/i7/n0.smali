.class public final Li7/n0;
.super Lcom/google/crypto/tink/shaded/protobuf/z;

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/y0;


# instance fields
.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Li7/n0;->c:I

    .line 1
    invoke-direct {p0, v0}, Li7/n0;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    iput p1, p0, Li7/n0;->c:I

    const/4 v0, 0x1

    if-eq p1, v0, :cond_4

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    const/4 v0, 0x3

    if-eq p1, v0, :cond_2

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    const/4 v0, 0x5

    if-eq p1, v0, :cond_0

    .line 2
    invoke-static {}, Li7/o0;->x()Li7/o0;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/z;-><init>(Lcom/google/crypto/tink/shaded/protobuf/b0;)V

    return-void

    .line 3
    :cond_0
    invoke-static {}, Li7/x1;->x()Li7/x1;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/z;-><init>(Lcom/google/crypto/tink/shaded/protobuf/b0;)V

    return-void

    .line 4
    :cond_1
    invoke-static {}, Li7/u1;->x()Li7/u1;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/z;-><init>(Lcom/google/crypto/tink/shaded/protobuf/b0;)V

    return-void

    .line 5
    :cond_2
    invoke-static {}, Li7/s1;->x()Li7/s1;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/z;-><init>(Lcom/google/crypto/tink/shaded/protobuf/b0;)V

    return-void

    .line 6
    :cond_3
    invoke-static {}, Li7/p1;->x()Li7/p1;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/z;-><init>(Lcom/google/crypto/tink/shaded/protobuf/b0;)V

    return-void

    .line 7
    :cond_4
    invoke-static {}, Li7/e1;->x()Li7/e1;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/z;-><init>(Lcom/google/crypto/tink/shaded/protobuf/b0;)V

    return-void
.end method

.method public synthetic constructor <init>(La7/a;)V
    .locals 0

    const/4 p1, 0x2

    iput p1, p0, Li7/n0;->c:I

    .line 9
    invoke-direct {p0, p1}, Li7/n0;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(Li7/k0;)V
    .locals 0

    const/4 p1, 0x3

    iput p1, p0, Li7/n0;->c:I

    .line 11
    invoke-direct {p0, p1}, Li7/n0;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(Li7/l0;)V
    .locals 0

    const/4 p1, 0x5

    iput p1, p0, Li7/n0;->c:I

    .line 8
    invoke-direct {p0, p1}, Li7/n0;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(Li7/m0;)V
    .locals 0

    const/4 p1, 0x4

    iput p1, p0, Li7/n0;->c:I

    .line 10
    invoke-direct {p0, p1}, Li7/n0;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    const/4 p1, 0x1

    iput p1, p0, Li7/n0;->c:I

    .line 12
    invoke-direct {p0, p1}, Li7/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic buildPartial()Lcom/google/crypto/tink/shaded/protobuf/b0;
    .locals 1

    iget v0, p0, Li7/n0;->c:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/z;->b()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/z;->b()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/z;->b()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/z;->b()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/z;->b()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object v0

    return-object v0

    :pswitch_4
    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/z;->b()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Li7/n0;->c:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/z;->c()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/z;->c()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/z;->c()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/z;->c()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/z;->c()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object v0

    return-object v0

    :pswitch_4
    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/z;->c()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getDefaultInstanceForType()Lcom/google/crypto/tink/shaded/protobuf/b0;
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/z;->a:Lcom/google/crypto/tink/shaded/protobuf/b0;

    return-object v0
.end method
