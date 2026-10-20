.class public final Lw6/h;
.super Ld7/f;


# instance fields
.field public final synthetic d:I


# direct methods
.method public constructor <init>(I)V
    .locals 4

    iput p1, p0, Lw6/h;->d:I

    const-class v0, Lv6/a;

    const/4 v1, 0x0

    const/4 v2, 0x1

    packed-switch p1, :pswitch_data_0

    new-array p1, v2, [Ld7/p;

    new-instance v2, Lw6/f;

    invoke-direct {v2, v0, v1}, Lw6/f;-><init>(Ljava/lang/Class;I)V

    aput-object v2, p1, v1

    const-class v0, Li7/h;

    invoke-direct {p0, v0, p1}, Ld7/f;-><init>(Ljava/lang/Class;[Ld7/p;)V

    return-void

    :pswitch_0
    new-array p1, v2, [Ld7/p;

    new-instance v0, Lw6/f;

    const-class v2, Lv6/c;

    const/16 v3, 0x9

    invoke-direct {v0, v2, v3}, Lw6/f;-><init>(Ljava/lang/Class;I)V

    aput-object v0, p1, v1

    const-class v0, Li7/f0;

    invoke-direct {p0, v0, p1}, Ld7/f;-><init>(Ljava/lang/Class;[Ld7/p;)V

    return-void

    :pswitch_1
    new-array p1, v2, [Ld7/p;

    new-instance v2, Lw6/f;

    const/16 v3, 0x8

    invoke-direct {v2, v0, v3}, Lw6/f;-><init>(Ljava/lang/Class;I)V

    aput-object v2, p1, v1

    const-class v0, Li7/w1;

    invoke-direct {p0, v0, p1}, Ld7/f;-><init>(Ljava/lang/Class;[Ld7/p;)V

    return-void

    :pswitch_2
    new-array p1, v2, [Ld7/p;

    new-instance v2, Lw6/f;

    const/4 v3, 0x7

    invoke-direct {v2, v0, v3}, Lw6/f;-><init>(Ljava/lang/Class;I)V

    aput-object v2, p1, v1

    const-class v0, Li7/r1;

    invoke-direct {p0, v0, p1}, Ld7/f;-><init>(Ljava/lang/Class;[Ld7/p;)V

    return-void

    :pswitch_3
    new-array p1, v2, [Ld7/p;

    new-instance v2, Lw6/f;

    const/4 v3, 0x6

    invoke-direct {v2, v0, v3}, Lw6/f;-><init>(Ljava/lang/Class;I)V

    aput-object v2, p1, v1

    const-class v0, Li7/o1;

    invoke-direct {p0, v0, p1}, Ld7/f;-><init>(Ljava/lang/Class;[Ld7/p;)V

    return-void

    :pswitch_4
    new-array p1, v2, [Ld7/p;

    new-instance v2, Lw6/f;

    const/4 v3, 0x5

    invoke-direct {v2, v0, v3}, Lw6/f;-><init>(Ljava/lang/Class;I)V

    aput-object v2, p1, v1

    const-class v0, Li7/j0;

    invoke-direct {p0, v0, p1}, Ld7/f;-><init>(Ljava/lang/Class;[Ld7/p;)V

    return-void

    :pswitch_5
    new-array p1, v2, [Ld7/p;

    new-instance v2, Lw6/f;

    const/4 v3, 0x4

    invoke-direct {v2, v0, v3}, Lw6/f;-><init>(Ljava/lang/Class;I)V

    aput-object v2, p1, v1

    const-class v0, Li7/b0;

    invoke-direct {p0, v0, p1}, Ld7/f;-><init>(Ljava/lang/Class;[Ld7/p;)V

    return-void

    :pswitch_6
    new-array p1, v2, [Ld7/p;

    new-instance v2, Lw6/f;

    const/4 v3, 0x3

    invoke-direct {v2, v0, v3}, Lw6/f;-><init>(Ljava/lang/Class;I)V

    aput-object v2, p1, v1

    const-class v0, Li7/x;

    invoke-direct {p0, v0, p1}, Ld7/f;-><init>(Ljava/lang/Class;[Ld7/p;)V

    return-void

    :pswitch_7
    new-array p1, v2, [Ld7/p;

    new-instance v2, Lw6/f;

    const/4 v3, 0x2

    invoke-direct {v2, v0, v3}, Lw6/f;-><init>(Ljava/lang/Class;I)V

    aput-object v2, p1, v1

    const-class v0, Li7/r;

    invoke-direct {p0, v0, p1}, Ld7/f;-><init>(Ljava/lang/Class;[Ld7/p;)V

    return-void

    :pswitch_8
    new-array p1, v2, [Ld7/p;

    new-instance v0, Lw6/f;

    const-class v3, Lj7/l;

    invoke-direct {v0, v3, v2}, Lw6/f;-><init>(Ljava/lang/Class;I)V

    aput-object v0, p1, v1

    const-class v0, Li7/l;

    invoke-direct {p0, v0, p1}, Ld7/f;-><init>(Ljava/lang/Class;[Ld7/p;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static h(II)Ld7/e;
    .locals 2

    invoke-static {}, Li7/t;->B()Li7/s;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v1, v0, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v1, Li7/t;

    invoke-static {v1, p0}, Li7/t;->y(Li7/t;I)V

    invoke-static {}, Li7/v;->A()Li7/u;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v1, Li7/v;

    invoke-static {v1}, Li7/v;->x(Li7/v;)V

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/z;->a()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p0

    check-cast p0, Li7/v;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v1, v0, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v1, Li7/t;

    invoke-static {v1, p0}, Li7/t;->x(Li7/t;Li7/v;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->a()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p0

    check-cast p0, Li7/t;

    new-instance v0, Ld7/e;

    invoke-direct {v0, p0, p1}, Ld7/e;-><init>(Lcom/google/crypto/tink/shaded/protobuf/b0;I)V

    return-object v0
.end method

.method public static i(III)Ld7/e;
    .locals 5

    sget-object v0, Li7/r0;->e:Li7/r0;

    new-instance v1, Ld7/e;

    invoke-static {}, Li7/n;->C()Li7/m;

    move-result-object v2

    invoke-static {}, Li7/p;->A()Li7/o;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v4, v3, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v4, Li7/p;

    invoke-static {v4}, Li7/p;->x(Li7/p;)V

    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/z;->a()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object v3

    check-cast v3, Li7/p;

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v4, v2, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v4, Li7/n;

    invoke-static {v4, v3}, Li7/n;->x(Li7/n;Li7/p;)V

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v3, v2, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v3, Li7/n;

    invoke-static {v3, p0}, Li7/n;->y(Li7/n;I)V

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/z;->a()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p0

    check-cast p0, Li7/n;

    invoke-static {}, Li7/v0;->C()Li7/u0;

    move-result-object v2

    invoke-static {}, Li7/x0;->C()Li7/w0;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v4, v3, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v4, Li7/x0;

    invoke-static {v4, v0}, Li7/x0;->x(Li7/x0;Li7/r0;)V

    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v0, v3, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v0, Li7/x0;

    invoke-static {v0, p1}, Li7/x0;->y(Li7/x0;I)V

    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/z;->a()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p1

    check-cast p1, Li7/x0;

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v0, v2, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v0, Li7/v0;

    invoke-static {v0, p1}, Li7/v0;->x(Li7/v0;Li7/x0;)V

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object p1, v2, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast p1, Li7/v0;

    const/16 v0, 0x20

    invoke-static {p1, v0}, Li7/v0;->y(Li7/v0;I)V

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/z;->a()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p1

    check-cast p1, Li7/v0;

    invoke-static {}, Li7/j;->B()Li7/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v2, v0, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v2, Li7/j;

    invoke-static {v2, p0}, Li7/j;->x(Li7/j;Li7/n;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object p0, v0, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast p0, Li7/j;

    invoke-static {p0, p1}, Li7/j;->y(Li7/j;Li7/v0;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->a()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p0

    check-cast p0, Li7/j;

    invoke-direct {v1, p0, p2}, Ld7/e;-><init>(Lcom/google/crypto/tink/shaded/protobuf/b0;I)V

    return-object v1
.end method

.method public static j(II)Ld7/e;
    .locals 2

    invoke-static {}, Li7/z;->z()Li7/y;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v1, v0, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v1, Li7/z;

    invoke-static {v1, p0}, Li7/z;->x(Li7/z;I)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->a()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p0

    check-cast p0, Li7/z;

    new-instance v0, Ld7/e;

    invoke-direct {v0, p0, p1}, Ld7/e;-><init>(Lcom/google/crypto/tink/shaded/protobuf/b0;I)V

    return-object v0
.end method

.method public static k(II)Ld7/e;
    .locals 2

    invoke-static {}, Li7/d0;->z()Li7/c0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v1, v0, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v1, Li7/d0;

    invoke-static {v1, p0}, Li7/d0;->x(Li7/d0;I)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->a()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p0

    check-cast p0, Li7/d0;

    new-instance v0, Ld7/e;

    invoke-direct {v0, p0, p1}, Ld7/e;-><init>(Lcom/google/crypto/tink/shaded/protobuf/b0;I)V

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 2

    iget v0, p0, Lw6/h;->d:I

    const/4 v1, 0x2

    sparse-switch v0, :sswitch_data_0

    const/4 v0, 0x1

    return v0

    :sswitch_0
    return v1

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x3 -> :sswitch_0
    .end sparse-switch
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lw6/h;->d:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "type.googleapis.com/google.crypto.tink.AesSivKey"

    return-object v0

    :pswitch_0
    const-string v0, "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key"

    return-object v0

    :pswitch_1
    const-string v0, "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey"

    return-object v0

    :pswitch_2
    const-string v0, "type.googleapis.com/google.crypto.tink.KmsAeadKey"

    return-object v0

    :pswitch_3
    const-string v0, "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key"

    return-object v0

    :pswitch_4
    const-string v0, "type.googleapis.com/google.crypto.tink.AesGcmSivKey"

    return-object v0

    :pswitch_5
    const-string v0, "type.googleapis.com/google.crypto.tink.AesGcmKey"

    return-object v0

    :pswitch_6
    const-string v0, "type.googleapis.com/google.crypto.tink.AesEaxKey"

    return-object v0

    :pswitch_7
    const-string v0, "type.googleapis.com/google.crypto.tink.AesCtrKey"

    return-object v0

    :pswitch_8
    const-string v0, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d()Lw6/g;
    .locals 3

    iget v0, p0, Lw6/h;->d:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lw6/g;

    const-class v1, Li7/h0;

    const/16 v2, 0x9

    invoke-direct {v0, p0, v1, v2}, Lw6/g;-><init>(Ld7/f;Ljava/lang/Class;I)V

    return-object v0

    :pswitch_0
    new-instance v0, Lw6/g;

    const-class v1, Li7/x1;

    const/16 v2, 0x8

    invoke-direct {v0, p0, v1, v2}, Lw6/g;-><init>(Ld7/f;Ljava/lang/Class;I)V

    return-object v0

    :pswitch_1
    new-instance v0, Lw6/g;

    const-class v1, Li7/s1;

    const/4 v2, 0x7

    invoke-direct {v0, p0, v1, v2}, Lw6/g;-><init>(Ld7/f;Ljava/lang/Class;I)V

    return-object v0

    :pswitch_2
    new-instance v0, Lw6/g;

    const-class v1, Li7/p1;

    const/4 v2, 0x6

    invoke-direct {v0, p0, v1, v2}, Lw6/g;-><init>(Ld7/f;Ljava/lang/Class;I)V

    return-object v0

    :pswitch_3
    new-instance v0, Lw6/g;

    const-class v1, Li7/o0;

    const/4 v2, 0x5

    invoke-direct {v0, p0, v1, v2}, Lw6/g;-><init>(Ld7/f;Ljava/lang/Class;I)V

    return-object v0

    :pswitch_4
    new-instance v0, Lw6/g;

    const-class v1, Li7/d0;

    const/4 v2, 0x4

    invoke-direct {v0, p0, v1, v2}, Lw6/g;-><init>(Ld7/f;Ljava/lang/Class;I)V

    return-object v0

    :pswitch_5
    new-instance v0, Lw6/g;

    const-class v1, Li7/z;

    const/4 v2, 0x3

    invoke-direct {v0, p0, v1, v2}, Lw6/g;-><init>(Ld7/f;Ljava/lang/Class;I)V

    return-object v0

    :pswitch_6
    new-instance v0, Lw6/g;

    const-class v1, Li7/t;

    const/4 v2, 0x2

    invoke-direct {v0, p0, v1, v2}, Lw6/g;-><init>(Ld7/f;Ljava/lang/Class;I)V

    return-object v0

    :pswitch_7
    new-instance v0, Lw6/g;

    const-class v1, Li7/n;

    const/4 v2, 0x1

    invoke-direct {v0, p0, v1, v2}, Lw6/g;-><init>(Ld7/f;Ljava/lang/Class;I)V

    return-object v0

    :pswitch_8
    new-instance v0, Lw6/g;

    const-class v1, Li7/j;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lw6/g;-><init>(Ld7/f;Ljava/lang/Class;I)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final e()Li7/z0;
    .locals 3

    sget-object v0, Li7/z0;->f:Li7/z0;

    sget-object v1, Li7/z0;->c:Li7/z0;

    iget v2, p0, Lw6/h;->d:I

    packed-switch v2, :pswitch_data_0

    return-object v1

    :pswitch_0
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final f(Lcom/google/crypto/tink/shaded/protobuf/l;)Lcom/google/crypto/tink/shaded/protobuf/b;
    .locals 1

    iget v0, p0, Lw6/h;->d:I

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/t;->a()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v0

    invoke-static {p1, v0}, Li7/f0;->C(Lcom/google/crypto/tink/shaded/protobuf/l;Lcom/google/crypto/tink/shaded/protobuf/t;)Li7/f0;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/t;->a()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v0

    invoke-static {p1, v0}, Li7/w1;->C(Lcom/google/crypto/tink/shaded/protobuf/l;Lcom/google/crypto/tink/shaded/protobuf/t;)Li7/w1;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/t;->a()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v0

    invoke-static {p1, v0}, Li7/r1;->C(Lcom/google/crypto/tink/shaded/protobuf/l;Lcom/google/crypto/tink/shaded/protobuf/t;)Li7/r1;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/t;->a()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v0

    invoke-static {p1, v0}, Li7/o1;->C(Lcom/google/crypto/tink/shaded/protobuf/l;Lcom/google/crypto/tink/shaded/protobuf/t;)Li7/o1;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/t;->a()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v0

    invoke-static {p1, v0}, Li7/j0;->C(Lcom/google/crypto/tink/shaded/protobuf/l;Lcom/google/crypto/tink/shaded/protobuf/t;)Li7/j0;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/t;->a()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v0

    invoke-static {p1, v0}, Li7/b0;->C(Lcom/google/crypto/tink/shaded/protobuf/l;Lcom/google/crypto/tink/shaded/protobuf/t;)Li7/b0;

    move-result-object p1

    return-object p1

    :pswitch_5
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/t;->a()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v0

    invoke-static {p1, v0}, Li7/x;->C(Lcom/google/crypto/tink/shaded/protobuf/l;Lcom/google/crypto/tink/shaded/protobuf/t;)Li7/x;

    move-result-object p1

    return-object p1

    :pswitch_6
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/t;->a()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v0

    invoke-static {p1, v0}, Li7/r;->E(Lcom/google/crypto/tink/shaded/protobuf/l;Lcom/google/crypto/tink/shaded/protobuf/t;)Li7/r;

    move-result-object p1

    return-object p1

    :pswitch_7
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/t;->a()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v0

    invoke-static {p1, v0}, Li7/l;->F(Lcom/google/crypto/tink/shaded/protobuf/l;Lcom/google/crypto/tink/shaded/protobuf/t;)Li7/l;

    move-result-object p1

    return-object p1

    :pswitch_8
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/t;->a()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v0

    invoke-static {p1, v0}, Li7/h;->E(Lcom/google/crypto/tink/shaded/protobuf/l;Lcom/google/crypto/tink/shaded/protobuf/t;)Li7/h;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Lcom/google/crypto/tink/shaded/protobuf/b;)V
    .locals 5

    const-string v0, "invalid IV size"

    const/16 v1, 0x10

    const/16 v2, 0xc

    iget v3, p0, Lw6/h;->d:I

    const/16 v4, 0x20

    packed-switch v3, :pswitch_data_0

    check-cast p1, Li7/f0;

    invoke-virtual {p1}, Li7/f0;->A()I

    move-result v0

    invoke-static {v0}, Lj7/r;->c(I)V

    invoke-virtual {p1}, Li7/f0;->z()Lcom/google/crypto/tink/shaded/protobuf/l;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/l;->size()I

    move-result v0

    const/16 v1, 0x40

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/security/InvalidKeyException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "invalid key size: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Li7/f0;->z()Lcom/google/crypto/tink/shaded/protobuf/l;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/l;->size()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ". Valid keys must have 64 bytes."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    check-cast p1, Li7/w1;

    invoke-virtual {p1}, Li7/w1;->A()I

    move-result v0

    invoke-static {v0}, Lj7/r;->c(I)V

    invoke-virtual {p1}, Li7/w1;->z()Lcom/google/crypto/tink/shaded/protobuf/l;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/l;->size()I

    move-result p1

    if-ne p1, v4, :cond_1

    return-void

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "invalid XChaCha20Poly1305Key: incorrect key length"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    check-cast p1, Li7/r1;

    invoke-virtual {p1}, Li7/r1;->A()I

    move-result p1

    invoke-static {p1}, Lj7/r;->c(I)V

    return-void

    :pswitch_2
    check-cast p1, Li7/o1;

    invoke-virtual {p1}, Li7/o1;->A()I

    move-result p1

    invoke-static {p1}, Lj7/r;->c(I)V

    return-void

    :pswitch_3
    check-cast p1, Li7/j0;

    invoke-virtual {p1}, Li7/j0;->A()I

    move-result v0

    invoke-static {v0}, Lj7/r;->c(I)V

    invoke-virtual {p1}, Li7/j0;->z()Lcom/google/crypto/tink/shaded/protobuf/l;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/l;->size()I

    move-result p1

    if-ne p1, v4, :cond_2

    return-void

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "invalid ChaCha20Poly1305Key: incorrect key length"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_4
    check-cast p1, Li7/b0;

    invoke-virtual {p1}, Li7/b0;->A()I

    move-result v0

    invoke-static {v0}, Lj7/r;->c(I)V

    invoke-virtual {p1}, Li7/b0;->z()Lcom/google/crypto/tink/shaded/protobuf/l;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/l;->size()I

    move-result p1

    invoke-static {p1}, Lj7/r;->a(I)V

    return-void

    :pswitch_5
    check-cast p1, Li7/x;

    invoke-virtual {p1}, Li7/x;->A()I

    move-result v0

    invoke-static {v0}, Lj7/r;->c(I)V

    invoke-virtual {p1}, Li7/x;->z()Lcom/google/crypto/tink/shaded/protobuf/l;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/l;->size()I

    move-result p1

    invoke-static {p1}, Lj7/r;->a(I)V

    return-void

    :pswitch_6
    check-cast p1, Li7/r;

    invoke-virtual {p1}, Li7/r;->C()I

    move-result v0

    invoke-static {v0}, Lj7/r;->c(I)V

    invoke-virtual {p1}, Li7/r;->A()Lcom/google/crypto/tink/shaded/protobuf/l;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/l;->size()I

    move-result v0

    invoke-static {v0}, Lj7/r;->a(I)V

    invoke-virtual {p1}, Li7/r;->B()Li7/v;

    move-result-object v0

    invoke-virtual {v0}, Li7/v;->z()I

    move-result v0

    if-eq v0, v2, :cond_4

    invoke-virtual {p1}, Li7/r;->B()Li7/v;

    move-result-object p1

    invoke-virtual {p1}, Li7/v;->z()I

    move-result p1

    if-ne p1, v1, :cond_3

    goto :goto_0

    :cond_3
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "invalid IV size; acceptable values have 12 or 16 bytes"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_0
    return-void

    :pswitch_7
    check-cast p1, Li7/l;

    invoke-virtual {p1}, Li7/l;->D()I

    move-result v3

    invoke-static {v3}, Lj7/r;->c(I)V

    invoke-virtual {p1}, Li7/l;->B()Lcom/google/crypto/tink/shaded/protobuf/l;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/l;->size()I

    move-result v3

    invoke-static {v3}, Lj7/r;->a(I)V

    invoke-virtual {p1}, Li7/l;->C()Li7/p;

    move-result-object p1

    invoke-virtual {p1}, Li7/p;->z()I

    move-result v3

    if-lt v3, v2, :cond_5

    invoke-virtual {p1}, Li7/p;->z()I

    move-result p1

    if-gt p1, v1, :cond_5

    return-void

    :cond_5
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_8
    check-cast p1, Li7/h;

    invoke-virtual {p1}, Li7/h;->C()I

    move-result v3

    invoke-static {v3}, Lj7/r;->c(I)V

    new-instance v3, Lw6/h;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Lw6/h;-><init>(I)V

    invoke-virtual {p1}, Li7/h;->A()Li7/l;

    move-result-object v3

    invoke-virtual {v3}, Li7/l;->D()I

    move-result v4

    invoke-static {v4}, Lj7/r;->c(I)V

    invoke-virtual {v3}, Li7/l;->B()Lcom/google/crypto/tink/shaded/protobuf/l;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/crypto/tink/shaded/protobuf/l;->size()I

    move-result v4

    invoke-static {v4}, Lj7/r;->a(I)V

    invoke-virtual {v3}, Li7/l;->C()Li7/p;

    move-result-object v3

    invoke-virtual {v3}, Li7/p;->z()I

    move-result v4

    if-lt v4, v2, :cond_6

    invoke-virtual {v3}, Li7/p;->z()I

    move-result v2

    if-gt v2, v1, :cond_6

    new-instance v0, Le7/j;

    invoke-direct {v0}, Le7/j;-><init>()V

    invoke-virtual {p1}, Li7/h;->B()Li7/t0;

    move-result-object p1

    invoke-static {p1}, Le7/j;->i(Li7/t0;)V

    return-void

    :cond_6
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
