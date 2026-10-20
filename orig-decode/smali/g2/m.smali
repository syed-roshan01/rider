.class public final Lg2/m;
.super Ljava/lang/Object;


# instance fields
.field public final synthetic a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/crypto/tink/shaded/protobuf/o;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lg2/m;->a:I

    const/4 v0, 0x0

    iput v0, p0, Lg2/m;->d:I

    .line 4
    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/f0;->a:Ljava/nio/charset/Charset;

    if-eqz p1, :cond_0

    iput-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    .line 5
    iput-object p0, p1, Lcom/google/crypto/tink/shaded/protobuf/o;->d:Lg2/m;

    return-void

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "input"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Lcom/google/protobuf/s;)V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    iput v0, p0, Lg2/m;->a:I

    const/4 v0, 0x0

    iput v0, p0, Lg2/m;->d:I

    .line 8
    sget-object v0, Lcom/google/protobuf/y0;->a:Ljava/nio/charset/Charset;

    if-eqz p1, :cond_0

    iput-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    .line 9
    iput-object p0, p1, Lcom/google/protobuf/s;->d:Lg2/m;

    return-void

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "input"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>([CII)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lg2/m;->a:I

    .line 2
    array-length v0, p1

    iput v0, p0, Lg2/m;->b:I

    iput-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    iput p2, p0, Lg2/m;->c:I

    iput p3, p0, Lg2/m;->d:I

    return-void
.end method


# virtual methods
.method public final A(Ljava/util/List;)V
    .locals 2

    iget v0, p0, Lg2/m;->a:I

    const/4 v1, 0x2

    packed-switch v0, :pswitch_data_0

    instance-of v0, p1, Lcom/google/protobuf/p0;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/protobuf/p0;

    iget p1, p0, Lg2/m;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->B()I

    move-result p1

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/protobuf/s;

    invoke-virtual {v1}, Lcom/google/protobuf/s;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->r()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/protobuf/p0;->i(I)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Lg2/m;->T(I)V

    goto/16 :goto_0

    :cond_1
    invoke-static {}, Lcom/google/protobuf/a1;->d()Lcom/google/protobuf/z0;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->r()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/protobuf/p0;->i(I)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    goto/16 :goto_0

    :cond_3
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->A()I

    move-result p1

    iget v1, p0, Lg2/m;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lg2/m;->d:I

    goto :goto_0

    :cond_4
    iget v0, p0, Lg2/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->B()I

    move-result v0

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/protobuf/s;

    invoke-virtual {v1}, Lcom/google/protobuf/s;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->r()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Lg2/m;->T(I)V

    goto :goto_0

    :cond_6
    invoke-static {}, Lcom/google/protobuf/a1;->d()Lcom/google/protobuf/z0;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->r()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_0

    :cond_8
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->A()I

    move-result v0

    iget v1, p0, Lg2/m;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lg2/m;->d:I

    :goto_0
    return-void

    :pswitch_0
    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/c0;

    if-eqz v0, :cond_d

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/c0;

    iget p1, p0, Lg2/m;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_b

    if-ne p1, v1, :cond_a

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->y()I

    move-result p1

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_9
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->p()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/c0;->i(I)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result p1

    if-lt p1, v1, :cond_9

    invoke-virtual {p0, v1}, Lg2/m;->T(I)V

    goto/16 :goto_1

    :cond_a
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->c()Lcom/google/crypto/tink/shaded/protobuf/g0;

    move-result-object p1

    throw p1

    :cond_b
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->p()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/c0;->i(I)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->e()Z

    move-result p1

    if-eqz p1, :cond_c

    goto/16 :goto_1

    :cond_c
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->x()I

    move-result p1

    iget v1, p0, Lg2/m;->b:I

    if-eq p1, v1, :cond_b

    iput p1, p0, Lg2/m;->d:I

    goto :goto_1

    :cond_d
    iget v0, p0, Lg2/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_10

    if-ne v0, v1, :cond_f

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->y()I

    move-result v0

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_e
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->p()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result v0

    if-lt v0, v1, :cond_e

    invoke-virtual {p0, v1}, Lg2/m;->T(I)V

    goto :goto_1

    :cond_f
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->c()Lcom/google/crypto/tink/shaded/protobuf/g0;

    move-result-object p1

    throw p1

    :cond_10
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->p()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->e()Z

    move-result v0

    if-eqz v0, :cond_11

    goto :goto_1

    :cond_11
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->x()I

    move-result v0

    iget v1, p0, Lg2/m;->b:I

    if-eq v0, v1, :cond_10

    iput v0, p0, Lg2/m;->d:I

    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final B()J
    .locals 2

    iget v0, p0, Lg2/m;->a:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, v1}, Lg2/m;->U(I)V

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->s()J

    move-result-wide v0

    return-wide v0

    :pswitch_0
    invoke-virtual {p0, v1}, Lg2/m;->U(I)V

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->q()J

    move-result-wide v0

    return-wide v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final C(Ljava/util/List;)V
    .locals 4

    iget v0, p0, Lg2/m;->a:I

    const/4 v1, 0x2

    packed-switch v0, :pswitch_data_0

    instance-of v0, p1, Lcom/google/protobuf/i1;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/protobuf/i1;

    iget p1, p0, Lg2/m;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->B()I

    move-result p1

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/protobuf/s;

    invoke-virtual {v1}, Lcom/google/protobuf/s;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->s()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/protobuf/i1;->i(J)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Lg2/m;->T(I)V

    goto/16 :goto_0

    :cond_1
    invoke-static {}, Lcom/google/protobuf/a1;->d()Lcom/google/protobuf/z0;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->s()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/i1;->i(J)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    goto/16 :goto_0

    :cond_3
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->A()I

    move-result p1

    iget v1, p0, Lg2/m;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lg2/m;->d:I

    goto :goto_0

    :cond_4
    iget v0, p0, Lg2/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->B()I

    move-result v0

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/protobuf/s;

    invoke-virtual {v1}, Lcom/google/protobuf/s;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->s()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Lg2/m;->T(I)V

    goto :goto_0

    :cond_6
    invoke-static {}, Lcom/google/protobuf/a1;->d()Lcom/google/protobuf/z0;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->s()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_0

    :cond_8
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->A()I

    move-result v0

    iget v1, p0, Lg2/m;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lg2/m;->d:I

    :goto_0
    return-void

    :pswitch_0
    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/o0;

    if-eqz v0, :cond_d

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o0;

    iget p1, p0, Lg2/m;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_b

    if-ne p1, v1, :cond_a

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->y()I

    move-result p1

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_9
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->q()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/o0;->i(J)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result p1

    if-lt p1, v1, :cond_9

    invoke-virtual {p0, v1}, Lg2/m;->T(I)V

    goto/16 :goto_1

    :cond_a
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->c()Lcom/google/crypto/tink/shaded/protobuf/g0;

    move-result-object p1

    throw p1

    :cond_b
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->q()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->i(J)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->e()Z

    move-result p1

    if-eqz p1, :cond_c

    goto/16 :goto_1

    :cond_c
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->x()I

    move-result p1

    iget v1, p0, Lg2/m;->b:I

    if-eq p1, v1, :cond_b

    iput p1, p0, Lg2/m;->d:I

    goto :goto_1

    :cond_d
    iget v0, p0, Lg2/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_10

    if-ne v0, v1, :cond_f

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->y()I

    move-result v0

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_e
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->q()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result v0

    if-lt v0, v1, :cond_e

    invoke-virtual {p0, v1}, Lg2/m;->T(I)V

    goto :goto_1

    :cond_f
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->c()Lcom/google/crypto/tink/shaded/protobuf/g0;

    move-result-object p1

    throw p1

    :cond_10
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->q()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->e()Z

    move-result v0

    if-eqz v0, :cond_11

    goto :goto_1

    :cond_11
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->x()I

    move-result v0

    iget v1, p0, Lg2/m;->b:I

    if-eq v0, v1, :cond_10

    iput v0, p0, Lg2/m;->d:I

    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final D(Ljava/lang/Class;Lcom/google/protobuf/z;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lg2/m;->U(I)V

    sget-object v0, Lcom/google/protobuf/d2;->c:Lcom/google/protobuf/d2;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/d2;->a(Ljava/lang/Class;)Lcom/google/protobuf/i2;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/protobuf/i2;->f()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p1, p2}, Lg2/m;->i(Ljava/lang/Object;Lcom/google/protobuf/i2;Lcom/google/protobuf/z;)V

    invoke-interface {p1, v0}, Lcom/google/protobuf/i2;->b(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final E()I
    .locals 2

    iget v0, p0, Lg2/m;->a:I

    const/4 v1, 0x5

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, v1}, Lg2/m;->U(I)V

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->u()I

    move-result v0

    return v0

    :pswitch_0
    invoke-virtual {p0, v1}, Lg2/m;->U(I)V

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->r()I

    move-result v0

    return v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final F(Ljava/util/List;)V
    .locals 4

    iget v0, p0, Lg2/m;->a:I

    const/4 v1, 0x2

    const/4 v2, 0x5

    packed-switch v0, :pswitch_data_0

    instance-of v0, p1, Lcom/google/protobuf/p0;

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Lcom/google/protobuf/p0;

    iget p1, p0, Lg2/m;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v1, :cond_3

    if-ne p1, v2, :cond_2

    :cond_0
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->u()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/protobuf/p0;->i(I)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->e()Z

    move-result p1

    if-eqz p1, :cond_1

    goto/16 :goto_0

    :cond_1
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->A()I

    move-result p1

    iget v1, p0, Lg2/m;->b:I

    if-eq p1, v1, :cond_0

    iput p1, p0, Lg2/m;->d:I

    goto/16 :goto_0

    :cond_2
    invoke-static {}, Lcom/google/protobuf/a1;->d()Lcom/google/protobuf/z0;

    move-result-object p1

    throw p1

    :cond_3
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->B()I

    move-result p1

    invoke-virtual {p0, p1}, Lg2/m;->W(I)V

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/protobuf/s;

    invoke-virtual {v1}, Lcom/google/protobuf/s;->d()I

    move-result v1

    add-int v3, v1, p1

    :cond_4
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->u()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/protobuf/p0;->i(I)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->d()I

    move-result p1

    if-lt p1, v3, :cond_4

    goto :goto_0

    :cond_5
    iget v0, p0, Lg2/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v1, :cond_9

    if-ne v0, v2, :cond_8

    :cond_6
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->u()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->e()Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_0

    :cond_7
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->A()I

    move-result v0

    iget v1, p0, Lg2/m;->b:I

    if-eq v0, v1, :cond_6

    iput v0, p0, Lg2/m;->d:I

    goto :goto_0

    :cond_8
    invoke-static {}, Lcom/google/protobuf/a1;->d()Lcom/google/protobuf/z0;

    move-result-object p1

    throw p1

    :cond_9
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->B()I

    move-result v0

    invoke-virtual {p0, v0}, Lg2/m;->W(I)V

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/protobuf/s;

    invoke-virtual {v1}, Lcom/google/protobuf/s;->d()I

    move-result v1

    add-int/2addr v0, v1

    :cond_a
    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/protobuf/s;

    invoke-virtual {v1}, Lcom/google/protobuf/s;->u()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/protobuf/s;

    invoke-virtual {v1}, Lcom/google/protobuf/s;->d()I

    move-result v1

    if-lt v1, v0, :cond_a

    :goto_0
    return-void

    :pswitch_0
    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/c0;

    if-eqz v0, :cond_10

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/c0;

    iget p1, p0, Lg2/m;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v1, :cond_e

    if-ne p1, v2, :cond_d

    :cond_b
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->r()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/c0;->i(I)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->e()Z

    move-result p1

    if-eqz p1, :cond_c

    goto/16 :goto_1

    :cond_c
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->x()I

    move-result p1

    iget v1, p0, Lg2/m;->b:I

    if-eq p1, v1, :cond_b

    iput p1, p0, Lg2/m;->d:I

    goto/16 :goto_1

    :cond_d
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->c()Lcom/google/crypto/tink/shaded/protobuf/g0;

    move-result-object p1

    throw p1

    :cond_e
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->y()I

    move-result p1

    invoke-virtual {p0, p1}, Lg2/m;->W(I)V

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result v1

    add-int v3, v1, p1

    :cond_f
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->r()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/c0;->i(I)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result p1

    if-lt p1, v3, :cond_f

    goto :goto_1

    :cond_10
    iget v0, p0, Lg2/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v1, :cond_14

    if-ne v0, v2, :cond_13

    :cond_11
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->r()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->e()Z

    move-result v0

    if-eqz v0, :cond_12

    goto :goto_1

    :cond_12
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->x()I

    move-result v0

    iget v1, p0, Lg2/m;->b:I

    if-eq v0, v1, :cond_11

    iput v0, p0, Lg2/m;->d:I

    goto :goto_1

    :cond_13
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->c()Lcom/google/crypto/tink/shaded/protobuf/g0;

    move-result-object p1

    throw p1

    :cond_14
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->y()I

    move-result v0

    invoke-virtual {p0, v0}, Lg2/m;->W(I)V

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_15
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->r()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result v0

    if-lt v0, v1, :cond_15

    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final G()J
    .locals 2

    iget v0, p0, Lg2/m;->a:I

    const/4 v1, 0x1

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, v1}, Lg2/m;->U(I)V

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->v()J

    move-result-wide v0

    return-wide v0

    :pswitch_0
    invoke-virtual {p0, v1}, Lg2/m;->U(I)V

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->s()J

    move-result-wide v0

    return-wide v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final H(Ljava/util/List;)V
    .locals 4

    iget v0, p0, Lg2/m;->a:I

    const/4 v1, 0x1

    const/4 v2, 0x2

    packed-switch v0, :pswitch_data_0

    instance-of v0, p1, Lcom/google/protobuf/i1;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/protobuf/i1;

    iget p1, p0, Lg2/m;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v1, :cond_2

    if-ne p1, v2, :cond_1

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->B()I

    move-result p1

    invoke-virtual {p0, p1}, Lg2/m;->X(I)V

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/protobuf/s;

    invoke-virtual {v1}, Lcom/google/protobuf/s;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->v()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/protobuf/i1;->i(J)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto/16 :goto_0

    :cond_1
    invoke-static {}, Lcom/google/protobuf/a1;->d()Lcom/google/protobuf/z0;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->v()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/i1;->i(J)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    goto/16 :goto_0

    :cond_3
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->A()I

    move-result p1

    iget v1, p0, Lg2/m;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lg2/m;->d:I

    goto :goto_0

    :cond_4
    iget v0, p0, Lg2/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v1, :cond_7

    if-ne v0, v2, :cond_6

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->B()I

    move-result v0

    invoke-virtual {p0, v0}, Lg2/m;->X(I)V

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/protobuf/s;

    invoke-virtual {v1}, Lcom/google/protobuf/s;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->v()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    goto :goto_0

    :cond_6
    invoke-static {}, Lcom/google/protobuf/a1;->d()Lcom/google/protobuf/z0;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->v()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_0

    :cond_8
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->A()I

    move-result v0

    iget v1, p0, Lg2/m;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lg2/m;->d:I

    :goto_0
    return-void

    :pswitch_0
    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/o0;

    if-eqz v0, :cond_d

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o0;

    iget p1, p0, Lg2/m;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v1, :cond_b

    if-ne p1, v2, :cond_a

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->y()I

    move-result p1

    invoke-virtual {p0, p1}, Lg2/m;->X(I)V

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_9
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->s()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/o0;->i(J)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result p1

    if-lt p1, v1, :cond_9

    goto/16 :goto_1

    :cond_a
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->c()Lcom/google/crypto/tink/shaded/protobuf/g0;

    move-result-object p1

    throw p1

    :cond_b
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->s()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->i(J)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->e()Z

    move-result p1

    if-eqz p1, :cond_c

    goto/16 :goto_1

    :cond_c
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->x()I

    move-result p1

    iget v1, p0, Lg2/m;->b:I

    if-eq p1, v1, :cond_b

    iput p1, p0, Lg2/m;->d:I

    goto :goto_1

    :cond_d
    iget v0, p0, Lg2/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v1, :cond_10

    if-ne v0, v2, :cond_f

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->y()I

    move-result v0

    invoke-virtual {p0, v0}, Lg2/m;->X(I)V

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_e
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->s()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result v0

    if-lt v0, v1, :cond_e

    goto :goto_1

    :cond_f
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->c()Lcom/google/crypto/tink/shaded/protobuf/g0;

    move-result-object p1

    throw p1

    :cond_10
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->s()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->e()Z

    move-result v0

    if-eqz v0, :cond_11

    goto :goto_1

    :cond_11
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->x()I

    move-result v0

    iget v1, p0, Lg2/m;->b:I

    if-eq v0, v1, :cond_10

    iput v0, p0, Lg2/m;->d:I

    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final I()I
    .locals 2

    iget v0, p0, Lg2/m;->a:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, v1}, Lg2/m;->U(I)V

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->w()I

    move-result v0

    return v0

    :pswitch_0
    invoke-virtual {p0, v1}, Lg2/m;->U(I)V

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->t()I

    move-result v0

    return v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final J(Ljava/util/List;)V
    .locals 2

    iget v0, p0, Lg2/m;->a:I

    const/4 v1, 0x2

    packed-switch v0, :pswitch_data_0

    instance-of v0, p1, Lcom/google/protobuf/p0;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/protobuf/p0;

    iget p1, p0, Lg2/m;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->B()I

    move-result p1

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/protobuf/s;

    invoke-virtual {v1}, Lcom/google/protobuf/s;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->w()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/protobuf/p0;->i(I)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Lg2/m;->T(I)V

    goto/16 :goto_0

    :cond_1
    invoke-static {}, Lcom/google/protobuf/a1;->d()Lcom/google/protobuf/z0;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->w()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/protobuf/p0;->i(I)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    goto/16 :goto_0

    :cond_3
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->A()I

    move-result p1

    iget v1, p0, Lg2/m;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lg2/m;->d:I

    goto :goto_0

    :cond_4
    iget v0, p0, Lg2/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->B()I

    move-result v0

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/protobuf/s;

    invoke-virtual {v1}, Lcom/google/protobuf/s;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->w()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Lg2/m;->T(I)V

    goto :goto_0

    :cond_6
    invoke-static {}, Lcom/google/protobuf/a1;->d()Lcom/google/protobuf/z0;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->w()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_0

    :cond_8
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->A()I

    move-result v0

    iget v1, p0, Lg2/m;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lg2/m;->d:I

    :goto_0
    return-void

    :pswitch_0
    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/c0;

    if-eqz v0, :cond_d

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/c0;

    iget p1, p0, Lg2/m;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_b

    if-ne p1, v1, :cond_a

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->y()I

    move-result p1

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_9
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->t()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/c0;->i(I)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result p1

    if-lt p1, v1, :cond_9

    invoke-virtual {p0, v1}, Lg2/m;->T(I)V

    goto/16 :goto_1

    :cond_a
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->c()Lcom/google/crypto/tink/shaded/protobuf/g0;

    move-result-object p1

    throw p1

    :cond_b
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->t()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/c0;->i(I)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->e()Z

    move-result p1

    if-eqz p1, :cond_c

    goto/16 :goto_1

    :cond_c
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->x()I

    move-result p1

    iget v1, p0, Lg2/m;->b:I

    if-eq p1, v1, :cond_b

    iput p1, p0, Lg2/m;->d:I

    goto :goto_1

    :cond_d
    iget v0, p0, Lg2/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_10

    if-ne v0, v1, :cond_f

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->y()I

    move-result v0

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_e
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->t()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result v0

    if-lt v0, v1, :cond_e

    invoke-virtual {p0, v1}, Lg2/m;->T(I)V

    goto :goto_1

    :cond_f
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->c()Lcom/google/crypto/tink/shaded/protobuf/g0;

    move-result-object p1

    throw p1

    :cond_10
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->t()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->e()Z

    move-result v0

    if-eqz v0, :cond_11

    goto :goto_1

    :cond_11
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->x()I

    move-result v0

    iget v1, p0, Lg2/m;->b:I

    if-eq v0, v1, :cond_10

    iput v0, p0, Lg2/m;->d:I

    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final K()J
    .locals 2

    iget v0, p0, Lg2/m;->a:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, v1}, Lg2/m;->U(I)V

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->x()J

    move-result-wide v0

    return-wide v0

    :pswitch_0
    invoke-virtual {p0, v1}, Lg2/m;->U(I)V

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->u()J

    move-result-wide v0

    return-wide v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final L(Ljava/util/List;)V
    .locals 4

    iget v0, p0, Lg2/m;->a:I

    const/4 v1, 0x2

    packed-switch v0, :pswitch_data_0

    instance-of v0, p1, Lcom/google/protobuf/i1;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/protobuf/i1;

    iget p1, p0, Lg2/m;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->B()I

    move-result p1

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/protobuf/s;

    invoke-virtual {v1}, Lcom/google/protobuf/s;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->x()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/protobuf/i1;->i(J)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Lg2/m;->T(I)V

    goto/16 :goto_0

    :cond_1
    invoke-static {}, Lcom/google/protobuf/a1;->d()Lcom/google/protobuf/z0;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->x()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/i1;->i(J)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    goto/16 :goto_0

    :cond_3
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->A()I

    move-result p1

    iget v1, p0, Lg2/m;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lg2/m;->d:I

    goto :goto_0

    :cond_4
    iget v0, p0, Lg2/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->B()I

    move-result v0

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/protobuf/s;

    invoke-virtual {v1}, Lcom/google/protobuf/s;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->x()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Lg2/m;->T(I)V

    goto :goto_0

    :cond_6
    invoke-static {}, Lcom/google/protobuf/a1;->d()Lcom/google/protobuf/z0;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->x()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_0

    :cond_8
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->A()I

    move-result v0

    iget v1, p0, Lg2/m;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lg2/m;->d:I

    :goto_0
    return-void

    :pswitch_0
    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/o0;

    if-eqz v0, :cond_d

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o0;

    iget p1, p0, Lg2/m;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_b

    if-ne p1, v1, :cond_a

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->y()I

    move-result p1

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_9
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->u()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/o0;->i(J)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result p1

    if-lt p1, v1, :cond_9

    invoke-virtual {p0, v1}, Lg2/m;->T(I)V

    goto/16 :goto_1

    :cond_a
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->c()Lcom/google/crypto/tink/shaded/protobuf/g0;

    move-result-object p1

    throw p1

    :cond_b
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->u()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->i(J)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->e()Z

    move-result p1

    if-eqz p1, :cond_c

    goto/16 :goto_1

    :cond_c
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->x()I

    move-result p1

    iget v1, p0, Lg2/m;->b:I

    if-eq p1, v1, :cond_b

    iput p1, p0, Lg2/m;->d:I

    goto :goto_1

    :cond_d
    iget v0, p0, Lg2/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_10

    if-ne v0, v1, :cond_f

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->y()I

    move-result v0

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_e
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->u()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result v0

    if-lt v0, v1, :cond_e

    invoke-virtual {p0, v1}, Lg2/m;->T(I)V

    goto :goto_1

    :cond_f
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->c()Lcom/google/crypto/tink/shaded/protobuf/g0;

    move-result-object p1

    throw p1

    :cond_10
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->u()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->e()Z

    move-result v0

    if-eqz v0, :cond_11

    goto :goto_1

    :cond_11
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->x()I

    move-result v0

    iget v1, p0, Lg2/m;->b:I

    if-eq v0, v1, :cond_10

    iput v0, p0, Lg2/m;->d:I

    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final M()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lg2/m;->a:I

    const/4 v1, 0x2

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, v1}, Lg2/m;->U(I)V

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->y()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-virtual {p0, v1}, Lg2/m;->U(I)V

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->v()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final N(Ljava/util/List;Z)V
    .locals 2

    iget v0, p0, Lg2/m;->a:I

    const/4 v1, 0x2

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lg2/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-ne v0, v1, :cond_5

    instance-of v0, p1, Lcom/google/protobuf/e1;

    if-eqz v0, :cond_2

    if-nez p2, :cond_2

    move-object v0, p1

    check-cast v0, Lcom/google/protobuf/e1;

    :cond_0
    invoke-virtual {p0}, Lg2/m;->m()Lcom/google/protobuf/n;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/google/protobuf/e1;->j(Lcom/google/protobuf/n;)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->e()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->A()I

    move-result p1

    iget p2, p0, Lg2/m;->b:I

    if-eq p1, p2, :cond_0

    iput p1, p0, Lg2/m;->d:I

    goto :goto_1

    :cond_2
    if-eqz p2, :cond_3

    invoke-virtual {p0}, Lg2/m;->O()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lg2/m;->M()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->e()Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->A()I

    move-result v0

    iget v1, p0, Lg2/m;->b:I

    if-eq v0, v1, :cond_2

    iput v0, p0, Lg2/m;->d:I

    :goto_1
    return-void

    :cond_5
    invoke-static {}, Lcom/google/protobuf/a1;->d()Lcom/google/protobuf/z0;

    move-result-object p1

    throw p1

    :pswitch_0
    iget v0, p0, Lg2/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-ne v0, v1, :cond_b

    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/k0;

    if-eqz v0, :cond_8

    if-nez p2, :cond_8

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/k0;

    :cond_6
    invoke-virtual {p0}, Lg2/m;->l()Lcom/google/crypto/tink/shaded/protobuf/l;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/k0;->l(Lcom/google/crypto/tink/shaded/protobuf/l;)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->e()Z

    move-result p1

    if-eqz p1, :cond_7

    goto :goto_3

    :cond_7
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->x()I

    move-result p1

    iget p2, p0, Lg2/m;->b:I

    if-eq p1, p2, :cond_6

    iput p1, p0, Lg2/m;->d:I

    goto :goto_3

    :cond_8
    if-eqz p2, :cond_9

    invoke-virtual {p0}, Lg2/m;->O()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_9
    invoke-virtual {p0}, Lg2/m;->M()Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->e()Z

    move-result v0

    if-eqz v0, :cond_a

    goto :goto_3

    :cond_a
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->x()I

    move-result v0

    iget v1, p0, Lg2/m;->b:I

    if-eq v0, v1, :cond_8

    iput v0, p0, Lg2/m;->d:I

    :goto_3
    return-void

    :cond_b
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->c()Lcom/google/crypto/tink/shaded/protobuf/g0;

    move-result-object p1

    throw p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final O()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lg2/m;->a:I

    const/4 v1, 0x2

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, v1}, Lg2/m;->U(I)V

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->z()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-virtual {p0, v1}, Lg2/m;->U(I)V

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->w()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final P()I
    .locals 2

    iget v0, p0, Lg2/m;->a:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, v1}, Lg2/m;->U(I)V

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->B()I

    move-result v0

    return v0

    :pswitch_0
    invoke-virtual {p0, v1}, Lg2/m;->U(I)V

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->y()I

    move-result v0

    return v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final Q(Ljava/util/List;)V
    .locals 2

    iget v0, p0, Lg2/m;->a:I

    const/4 v1, 0x2

    packed-switch v0, :pswitch_data_0

    instance-of v0, p1, Lcom/google/protobuf/p0;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/protobuf/p0;

    iget p1, p0, Lg2/m;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->B()I

    move-result p1

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/protobuf/s;

    invoke-virtual {v1}, Lcom/google/protobuf/s;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->B()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/protobuf/p0;->i(I)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Lg2/m;->T(I)V

    goto/16 :goto_0

    :cond_1
    invoke-static {}, Lcom/google/protobuf/a1;->d()Lcom/google/protobuf/z0;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->B()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/protobuf/p0;->i(I)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    goto/16 :goto_0

    :cond_3
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->A()I

    move-result p1

    iget v1, p0, Lg2/m;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lg2/m;->d:I

    goto :goto_0

    :cond_4
    iget v0, p0, Lg2/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->B()I

    move-result v0

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/protobuf/s;

    invoke-virtual {v1}, Lcom/google/protobuf/s;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->B()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Lg2/m;->T(I)V

    goto :goto_0

    :cond_6
    invoke-static {}, Lcom/google/protobuf/a1;->d()Lcom/google/protobuf/z0;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->B()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_0

    :cond_8
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->A()I

    move-result v0

    iget v1, p0, Lg2/m;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lg2/m;->d:I

    :goto_0
    return-void

    :pswitch_0
    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/c0;

    if-eqz v0, :cond_d

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/c0;

    iget p1, p0, Lg2/m;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_b

    if-ne p1, v1, :cond_a

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->y()I

    move-result p1

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_9
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->y()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/c0;->i(I)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result p1

    if-lt p1, v1, :cond_9

    invoke-virtual {p0, v1}, Lg2/m;->T(I)V

    goto/16 :goto_1

    :cond_a
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->c()Lcom/google/crypto/tink/shaded/protobuf/g0;

    move-result-object p1

    throw p1

    :cond_b
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->y()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/c0;->i(I)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->e()Z

    move-result p1

    if-eqz p1, :cond_c

    goto/16 :goto_1

    :cond_c
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->x()I

    move-result p1

    iget v1, p0, Lg2/m;->b:I

    if-eq p1, v1, :cond_b

    iput p1, p0, Lg2/m;->d:I

    goto :goto_1

    :cond_d
    iget v0, p0, Lg2/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_10

    if-ne v0, v1, :cond_f

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->y()I

    move-result v0

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_e
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->y()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result v0

    if-lt v0, v1, :cond_e

    invoke-virtual {p0, v1}, Lg2/m;->T(I)V

    goto :goto_1

    :cond_f
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->c()Lcom/google/crypto/tink/shaded/protobuf/g0;

    move-result-object p1

    throw p1

    :cond_10
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->y()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->e()Z

    move-result v0

    if-eqz v0, :cond_11

    goto :goto_1

    :cond_11
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->x()I

    move-result v0

    iget v1, p0, Lg2/m;->b:I

    if-eq v0, v1, :cond_10

    iput v0, p0, Lg2/m;->d:I

    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final R()J
    .locals 2

    iget v0, p0, Lg2/m;->a:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, v1}, Lg2/m;->U(I)V

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->C()J

    move-result-wide v0

    return-wide v0

    :pswitch_0
    invoke-virtual {p0, v1}, Lg2/m;->U(I)V

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->z()J

    move-result-wide v0

    return-wide v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final S(Ljava/util/List;)V
    .locals 4

    iget v0, p0, Lg2/m;->a:I

    const/4 v1, 0x2

    packed-switch v0, :pswitch_data_0

    instance-of v0, p1, Lcom/google/protobuf/i1;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/protobuf/i1;

    iget p1, p0, Lg2/m;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->B()I

    move-result p1

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/protobuf/s;

    invoke-virtual {v1}, Lcom/google/protobuf/s;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->C()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/protobuf/i1;->i(J)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Lg2/m;->T(I)V

    goto/16 :goto_0

    :cond_1
    invoke-static {}, Lcom/google/protobuf/a1;->d()Lcom/google/protobuf/z0;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->C()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/i1;->i(J)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    goto/16 :goto_0

    :cond_3
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->A()I

    move-result p1

    iget v1, p0, Lg2/m;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lg2/m;->d:I

    goto :goto_0

    :cond_4
    iget v0, p0, Lg2/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->B()I

    move-result v0

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/protobuf/s;

    invoke-virtual {v1}, Lcom/google/protobuf/s;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->C()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Lg2/m;->T(I)V

    goto :goto_0

    :cond_6
    invoke-static {}, Lcom/google/protobuf/a1;->d()Lcom/google/protobuf/z0;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->C()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_0

    :cond_8
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->A()I

    move-result v0

    iget v1, p0, Lg2/m;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lg2/m;->d:I

    :goto_0
    return-void

    :pswitch_0
    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/o0;

    if-eqz v0, :cond_d

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o0;

    iget p1, p0, Lg2/m;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_b

    if-ne p1, v1, :cond_a

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->y()I

    move-result p1

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_9
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->z()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/o0;->i(J)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result p1

    if-lt p1, v1, :cond_9

    invoke-virtual {p0, v1}, Lg2/m;->T(I)V

    goto/16 :goto_1

    :cond_a
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->c()Lcom/google/crypto/tink/shaded/protobuf/g0;

    move-result-object p1

    throw p1

    :cond_b
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->z()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->i(J)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->e()Z

    move-result p1

    if-eqz p1, :cond_c

    goto/16 :goto_1

    :cond_c
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->x()I

    move-result p1

    iget v1, p0, Lg2/m;->b:I

    if-eq p1, v1, :cond_b

    iput p1, p0, Lg2/m;->d:I

    goto :goto_1

    :cond_d
    iget v0, p0, Lg2/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_10

    if-ne v0, v1, :cond_f

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->y()I

    move-result v0

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_e
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->z()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result v0

    if-lt v0, v1, :cond_e

    invoke-virtual {p0, v1}, Lg2/m;->T(I)V

    goto :goto_1

    :cond_f
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->c()Lcom/google/crypto/tink/shaded/protobuf/g0;

    move-result-object p1

    throw p1

    :cond_10
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->z()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->e()Z

    move-result v0

    if-eqz v0, :cond_11

    goto :goto_1

    :cond_11
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->x()I

    move-result v0

    iget v1, p0, Lg2/m;->b:I

    if-eq v0, v1, :cond_10

    iput v0, p0, Lg2/m;->d:I

    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final T(I)V
    .locals 1

    iget v0, p0, Lg2/m;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->d()I

    move-result v0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/google/protobuf/a1;->h()Lcom/google/protobuf/a1;

    move-result-object p1

    throw p1

    :pswitch_0
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result v0

    if-ne v0, p1, :cond_1

    return-void

    :cond_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->g()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object p1

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final U(I)V
    .locals 1

    iget v0, p0, Lg2/m;->a:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lg2/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/google/protobuf/a1;->d()Lcom/google/protobuf/z0;

    move-result-object p1

    throw p1

    :pswitch_0
    iget v0, p0, Lg2/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-ne v0, p1, :cond_1

    return-void

    :cond_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->c()Lcom/google/crypto/tink/shaded/protobuf/g0;

    move-result-object p1

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final V()Z
    .locals 3

    iget v0, p0, Lg2/m;->a:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->e()Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Lg2/m;->b:I

    iget v2, p0, Lg2/m;->c:I

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/protobuf/s;

    invoke-virtual {v1, v0}, Lcom/google/protobuf/s;->D(I)Z

    move-result v1

    :cond_1
    :goto_0
    return v1

    :pswitch_0
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->e()Z

    move-result v0

    if-nez v0, :cond_3

    iget v0, p0, Lg2/m;->b:I

    iget v2, p0, Lg2/m;->c:I

    if-ne v0, v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->A(I)Z

    move-result v1

    :cond_3
    :goto_1
    return v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final W(I)V
    .locals 1

    iget v0, p0, Lg2/m;->a:I

    packed-switch v0, :pswitch_data_0

    and-int/lit8 p1, p1, 0x3

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/google/protobuf/a1;->g()Lcom/google/protobuf/a1;

    move-result-object p1

    throw p1

    :pswitch_0
    and-int/lit8 p1, p1, 0x3

    if-nez p1, :cond_1

    return-void

    :cond_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->f()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object p1

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final X(I)V
    .locals 1

    iget v0, p0, Lg2/m;->a:I

    packed-switch v0, :pswitch_data_0

    and-int/lit8 p1, p1, 0x7

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/google/protobuf/a1;->g()Lcom/google/protobuf/a1;

    move-result-object p1

    throw p1

    :pswitch_0
    and-int/lit8 p1, p1, 0x7

    if-nez p1, :cond_1

    return-void

    :cond_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->f()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object p1

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final a()I
    .locals 2

    iget v0, p0, Lg2/m;->d:I

    iget v1, p0, Lg2/m;->c:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public final b()I
    .locals 3

    iget v0, p0, Lg2/m;->a:I

    const v1, 0x7fffffff

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lg2/m;->d:I

    if-eqz v0, :cond_0

    iput v0, p0, Lg2/m;->b:I

    iput v2, p0, Lg2/m;->d:I

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->A()I

    move-result v0

    iput v0, p0, Lg2/m;->b:I

    :goto_0
    iget v0, p0, Lg2/m;->b:I

    if-eqz v0, :cond_2

    iget v2, p0, Lg2/m;->c:I

    if-ne v0, v2, :cond_1

    goto :goto_1

    :cond_1
    ushr-int/lit8 v1, v0, 0x3

    :cond_2
    :goto_1
    return v1

    :pswitch_0
    iget v0, p0, Lg2/m;->d:I

    if-eqz v0, :cond_3

    iput v0, p0, Lg2/m;->b:I

    iput v2, p0, Lg2/m;->d:I

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->x()I

    move-result v0

    iput v0, p0, Lg2/m;->b:I

    :goto_2
    iget v0, p0, Lg2/m;->b:I

    if-eqz v0, :cond_5

    iget v2, p0, Lg2/m;->c:I

    if-ne v0, v2, :cond_4

    goto :goto_3

    :cond_4
    ushr-int/lit8 v1, v0, 0x3

    :cond_5
    :goto_3
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lg2/m;->a:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lg2/m;->b:I

    return v0

    :pswitch_0
    iget v0, p0, Lg2/m;->b:I

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Lcom/google/crypto/tink/shaded/protobuf/b;Lcom/google/crypto/tink/shaded/protobuf/j1;Lcom/google/crypto/tink/shaded/protobuf/t;)V
    .locals 1

    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lg2/m;->U(I)V

    invoke-virtual {p0, p1, p2, p3}, Lg2/m;->f(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/j1;Lcom/google/crypto/tink/shaded/protobuf/t;)V

    return-void
.end method

.method public final e(Ljava/lang/Object;Lcom/google/protobuf/i2;Lcom/google/protobuf/z;)V
    .locals 1

    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lg2/m;->U(I)V

    invoke-virtual {p0, p1, p2, p3}, Lg2/m;->g(Ljava/lang/Object;Lcom/google/protobuf/i2;Lcom/google/protobuf/z;)V

    return-void
.end method

.method public final f(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/j1;Lcom/google/crypto/tink/shaded/protobuf/t;)V
    .locals 2

    iget v0, p0, Lg2/m;->c:I

    iget v1, p0, Lg2/m;->b:I

    ushr-int/lit8 v1, v1, 0x3

    shl-int/lit8 v1, v1, 0x3

    or-int/lit8 v1, v1, 0x4

    iput v1, p0, Lg2/m;->c:I

    :try_start_0
    invoke-interface {p2, p1, p0, p3}, Lcom/google/crypto/tink/shaded/protobuf/j1;->j(Ljava/lang/Object;Lg2/m;Lcom/google/crypto/tink/shaded/protobuf/t;)V

    iget p1, p0, Lg2/m;->b:I

    iget p2, p0, Lg2/m;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne p1, p2, :cond_0

    iput v0, p0, Lg2/m;->c:I

    return-void

    :cond_0
    :try_start_1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->f()Lcom/google/crypto/tink/shaded/protobuf/h0;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    iput v0, p0, Lg2/m;->c:I

    throw p1
.end method

.method public final g(Ljava/lang/Object;Lcom/google/protobuf/i2;Lcom/google/protobuf/z;)V
    .locals 2

    iget v0, p0, Lg2/m;->c:I

    iget v1, p0, Lg2/m;->b:I

    ushr-int/lit8 v1, v1, 0x3

    shl-int/lit8 v1, v1, 0x3

    or-int/lit8 v1, v1, 0x4

    iput v1, p0, Lg2/m;->c:I

    :try_start_0
    invoke-interface {p2, p1, p0, p3}, Lcom/google/protobuf/i2;->h(Ljava/lang/Object;Lg2/m;Lcom/google/protobuf/z;)V

    iget p1, p0, Lg2/m;->b:I

    iget p2, p0, Lg2/m;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne p1, p2, :cond_0

    iput v0, p0, Lg2/m;->c:I

    return-void

    :cond_0
    :try_start_1
    invoke-static {}, Lcom/google/protobuf/a1;->g()Lcom/google/protobuf/a1;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    iput v0, p0, Lg2/m;->c:I

    throw p1
.end method

.method public final h(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/j1;Lcom/google/crypto/tink/shaded/protobuf/t;)V
    .locals 4

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->y()I

    move-result v0

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/o;

    iget v2, v1, Lcom/google/crypto/tink/shaded/protobuf/o;->a:I

    iget v3, v1, Lcom/google/crypto/tink/shaded/protobuf/o;->b:I

    if-ge v2, v3, :cond_0

    invoke-virtual {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->h(I)I

    move-result v0

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/o;

    iget v2, v1, Lcom/google/crypto/tink/shaded/protobuf/o;->a:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v1, Lcom/google/crypto/tink/shaded/protobuf/o;->a:I

    invoke-interface {p2, p1, p0, p3}, Lcom/google/crypto/tink/shaded/protobuf/j1;->j(Ljava/lang/Object;Lg2/m;Lcom/google/crypto/tink/shaded/protobuf/t;)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/o;->a(I)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    iget p2, p1, Lcom/google/crypto/tink/shaded/protobuf/o;->a:I

    add-int/lit8 p2, p2, -0x1

    iput p2, p1, Lcom/google/crypto/tink/shaded/protobuf/o;->a:I

    invoke-virtual {p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->g(I)V

    return-void

    :cond_0
    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/h0;

    const-string p2, "Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit."

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final i(Ljava/lang/Object;Lcom/google/protobuf/i2;Lcom/google/protobuf/z;)V
    .locals 4

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->B()I

    move-result v0

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/protobuf/s;

    iget v2, v1, Lcom/google/protobuf/s;->a:I

    iget v3, v1, Lcom/google/protobuf/s;->b:I

    if-ge v2, v3, :cond_0

    invoke-virtual {v1, v0}, Lcom/google/protobuf/s;->j(I)I

    move-result v0

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/protobuf/s;

    iget v2, v1, Lcom/google/protobuf/s;->a:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v1, Lcom/google/protobuf/s;->a:I

    invoke-interface {p2, p1, p0, p3}, Lcom/google/protobuf/i2;->h(Ljava/lang/Object;Lg2/m;Lcom/google/protobuf/z;)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/google/protobuf/s;->a(I)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    iget p2, p1, Lcom/google/protobuf/s;->a:I

    add-int/lit8 p2, p2, -0x1

    iput p2, p1, Lcom/google/protobuf/s;->a:I

    invoke-virtual {p1, v0}, Lcom/google/protobuf/s;->i(I)V

    return-void

    :cond_0
    new-instance p1, Lcom/google/protobuf/a1;

    const-string p2, "Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit."

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final j()Z
    .locals 2

    iget v0, p0, Lg2/m;->a:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, v1}, Lg2/m;->U(I)V

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->k()Z

    move-result v0

    return v0

    :pswitch_0
    invoke-virtual {p0, v1}, Lg2/m;->U(I)V

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->i()Z

    move-result v0

    return v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final k(Ljava/util/List;)V
    .locals 2

    iget v0, p0, Lg2/m;->a:I

    const/4 v1, 0x2

    packed-switch v0, :pswitch_data_0

    instance-of v0, p1, Lcom/google/protobuf/g;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/protobuf/g;

    iget p1, p0, Lg2/m;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->B()I

    move-result p1

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/protobuf/s;

    invoke-virtual {v1}, Lcom/google/protobuf/s;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->k()Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/protobuf/g;->i(Z)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Lg2/m;->T(I)V

    goto/16 :goto_0

    :cond_1
    invoke-static {}, Lcom/google/protobuf/a1;->d()Lcom/google/protobuf/z0;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->k()Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/protobuf/g;->i(Z)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    goto/16 :goto_0

    :cond_3
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->A()I

    move-result p1

    iget v1, p0, Lg2/m;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lg2/m;->d:I

    goto :goto_0

    :cond_4
    iget v0, p0, Lg2/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->B()I

    move-result v0

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/protobuf/s;

    invoke-virtual {v1}, Lcom/google/protobuf/s;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->k()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Lg2/m;->T(I)V

    goto :goto_0

    :cond_6
    invoke-static {}, Lcom/google/protobuf/a1;->d()Lcom/google/protobuf/z0;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->k()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_0

    :cond_8
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->A()I

    move-result v0

    iget v1, p0, Lg2/m;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lg2/m;->d:I

    :goto_0
    return-void

    :pswitch_0
    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/f;

    if-eqz v0, :cond_d

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/f;

    iget p1, p0, Lg2/m;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_b

    if-ne p1, v1, :cond_a

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->y()I

    move-result p1

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_9
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->i()Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/f;->i(Z)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result p1

    if-lt p1, v1, :cond_9

    invoke-virtual {p0, v1}, Lg2/m;->T(I)V

    goto/16 :goto_1

    :cond_a
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->c()Lcom/google/crypto/tink/shaded/protobuf/g0;

    move-result-object p1

    throw p1

    :cond_b
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->i()Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/f;->i(Z)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->e()Z

    move-result p1

    if-eqz p1, :cond_c

    goto/16 :goto_1

    :cond_c
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->x()I

    move-result p1

    iget v1, p0, Lg2/m;->b:I

    if-eq p1, v1, :cond_b

    iput p1, p0, Lg2/m;->d:I

    goto :goto_1

    :cond_d
    iget v0, p0, Lg2/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_10

    if-ne v0, v1, :cond_f

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->y()I

    move-result v0

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_e
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->i()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result v0

    if-lt v0, v1, :cond_e

    invoke-virtual {p0, v1}, Lg2/m;->T(I)V

    goto :goto_1

    :cond_f
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->c()Lcom/google/crypto/tink/shaded/protobuf/g0;

    move-result-object p1

    throw p1

    :cond_10
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->i()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->e()Z

    move-result v0

    if-eqz v0, :cond_11

    goto :goto_1

    :cond_11
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->x()I

    move-result v0

    iget v1, p0, Lg2/m;->b:I

    if-eq v0, v1, :cond_10

    iput v0, p0, Lg2/m;->d:I

    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final l()Lcom/google/crypto/tink/shaded/protobuf/l;
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lg2/m;->U(I)V

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->j()Lcom/google/crypto/tink/shaded/protobuf/k;

    move-result-object v0

    return-object v0
.end method

.method public final m()Lcom/google/protobuf/n;
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lg2/m;->U(I)V

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->l()Lcom/google/protobuf/m;

    move-result-object v0

    return-object v0
.end method

.method public final n(Ljava/util/List;)V
    .locals 2

    iget v0, p0, Lg2/m;->a:I

    const/4 v1, 0x2

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lg2/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-ne v0, v1, :cond_2

    :cond_0
    invoke-virtual {p0}, Lg2/m;->m()Lcom/google/protobuf/n;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->A()I

    move-result v0

    iget v1, p0, Lg2/m;->b:I

    if-eq v0, v1, :cond_0

    iput v0, p0, Lg2/m;->d:I

    :goto_0
    return-void

    :cond_2
    invoke-static {}, Lcom/google/protobuf/a1;->d()Lcom/google/protobuf/z0;

    move-result-object p1

    throw p1

    :pswitch_0
    iget v0, p0, Lg2/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-ne v0, v1, :cond_5

    :cond_3
    invoke-virtual {p0}, Lg2/m;->l()Lcom/google/crypto/tink/shaded/protobuf/l;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->e()Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->x()I

    move-result v0

    iget v1, p0, Lg2/m;->b:I

    if-eq v0, v1, :cond_3

    iput v0, p0, Lg2/m;->d:I

    :goto_1
    return-void

    :cond_5
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->c()Lcom/google/crypto/tink/shaded/protobuf/g0;

    move-result-object p1

    throw p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final o()D
    .locals 2

    iget v0, p0, Lg2/m;->a:I

    const/4 v1, 0x1

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, v1}, Lg2/m;->U(I)V

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->m()D

    move-result-wide v0

    return-wide v0

    :pswitch_0
    invoke-virtual {p0, v1}, Lg2/m;->U(I)V

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->k()D

    move-result-wide v0

    return-wide v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final p(Ljava/util/List;)V
    .locals 4

    iget v0, p0, Lg2/m;->a:I

    const/4 v1, 0x1

    const/4 v2, 0x2

    packed-switch v0, :pswitch_data_0

    instance-of v0, p1, Lcom/google/protobuf/w;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/protobuf/w;

    iget p1, p0, Lg2/m;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v1, :cond_2

    if-ne p1, v2, :cond_1

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->B()I

    move-result p1

    invoke-virtual {p0, p1}, Lg2/m;->X(I)V

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/protobuf/s;

    invoke-virtual {v1}, Lcom/google/protobuf/s;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->m()D

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/protobuf/w;->i(D)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto/16 :goto_0

    :cond_1
    invoke-static {}, Lcom/google/protobuf/a1;->d()Lcom/google/protobuf/z0;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->m()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/w;->i(D)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    goto/16 :goto_0

    :cond_3
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->A()I

    move-result p1

    iget v1, p0, Lg2/m;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lg2/m;->d:I

    goto :goto_0

    :cond_4
    iget v0, p0, Lg2/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v1, :cond_7

    if-ne v0, v2, :cond_6

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->B()I

    move-result v0

    invoke-virtual {p0, v0}, Lg2/m;->X(I)V

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/protobuf/s;

    invoke-virtual {v1}, Lcom/google/protobuf/s;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->m()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    goto :goto_0

    :cond_6
    invoke-static {}, Lcom/google/protobuf/a1;->d()Lcom/google/protobuf/z0;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->m()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_0

    :cond_8
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->A()I

    move-result v0

    iget v1, p0, Lg2/m;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lg2/m;->d:I

    :goto_0
    return-void

    :pswitch_0
    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/r;

    if-eqz v0, :cond_d

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/r;

    iget p1, p0, Lg2/m;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v1, :cond_b

    if-ne p1, v2, :cond_a

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->y()I

    move-result p1

    invoke-virtual {p0, p1}, Lg2/m;->X(I)V

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_9
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->k()D

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/r;->i(D)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result p1

    if-lt p1, v1, :cond_9

    goto/16 :goto_1

    :cond_a
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->c()Lcom/google/crypto/tink/shaded/protobuf/g0;

    move-result-object p1

    throw p1

    :cond_b
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->k()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/r;->i(D)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->e()Z

    move-result p1

    if-eqz p1, :cond_c

    goto/16 :goto_1

    :cond_c
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->x()I

    move-result p1

    iget v1, p0, Lg2/m;->b:I

    if-eq p1, v1, :cond_b

    iput p1, p0, Lg2/m;->d:I

    goto :goto_1

    :cond_d
    iget v0, p0, Lg2/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v1, :cond_10

    if-ne v0, v2, :cond_f

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->y()I

    move-result v0

    invoke-virtual {p0, v0}, Lg2/m;->X(I)V

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_e
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->k()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result v0

    if-lt v0, v1, :cond_e

    goto :goto_1

    :cond_f
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->c()Lcom/google/crypto/tink/shaded/protobuf/g0;

    move-result-object p1

    throw p1

    :cond_10
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->k()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->e()Z

    move-result v0

    if-eqz v0, :cond_11

    goto :goto_1

    :cond_11
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->x()I

    move-result v0

    iget v1, p0, Lg2/m;->b:I

    if-eq v0, v1, :cond_10

    iput v0, p0, Lg2/m;->d:I

    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final q()I
    .locals 2

    iget v0, p0, Lg2/m;->a:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, v1}, Lg2/m;->U(I)V

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->n()I

    move-result v0

    return v0

    :pswitch_0
    invoke-virtual {p0, v1}, Lg2/m;->U(I)V

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->l()I

    move-result v0

    return v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final r(Ljava/util/List;)V
    .locals 2

    iget v0, p0, Lg2/m;->a:I

    const/4 v1, 0x2

    packed-switch v0, :pswitch_data_0

    instance-of v0, p1, Lcom/google/protobuf/p0;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/protobuf/p0;

    iget p1, p0, Lg2/m;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->B()I

    move-result p1

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/protobuf/s;

    invoke-virtual {v1}, Lcom/google/protobuf/s;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->n()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/protobuf/p0;->i(I)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v1}, Lg2/m;->T(I)V

    goto/16 :goto_0

    :cond_1
    invoke-static {}, Lcom/google/protobuf/a1;->d()Lcom/google/protobuf/z0;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->n()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/protobuf/p0;->i(I)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    goto/16 :goto_0

    :cond_3
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->A()I

    move-result p1

    iget v1, p0, Lg2/m;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lg2/m;->d:I

    goto :goto_0

    :cond_4
    iget v0, p0, Lg2/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->B()I

    move-result v0

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/protobuf/s;

    invoke-virtual {v1}, Lcom/google/protobuf/s;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->n()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-virtual {p0, v1}, Lg2/m;->T(I)V

    goto :goto_0

    :cond_6
    invoke-static {}, Lcom/google/protobuf/a1;->d()Lcom/google/protobuf/z0;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->n()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_0

    :cond_8
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->A()I

    move-result v0

    iget v1, p0, Lg2/m;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lg2/m;->d:I

    :goto_0
    return-void

    :pswitch_0
    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/c0;

    if-eqz v0, :cond_d

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/c0;

    iget p1, p0, Lg2/m;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_b

    if-ne p1, v1, :cond_a

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->y()I

    move-result p1

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_9
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->l()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/c0;->i(I)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result p1

    if-lt p1, v1, :cond_9

    invoke-virtual {p0, v1}, Lg2/m;->T(I)V

    goto/16 :goto_1

    :cond_a
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->c()Lcom/google/crypto/tink/shaded/protobuf/g0;

    move-result-object p1

    throw p1

    :cond_b
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->l()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/c0;->i(I)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->e()Z

    move-result p1

    if-eqz p1, :cond_c

    goto/16 :goto_1

    :cond_c
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->x()I

    move-result p1

    iget v1, p0, Lg2/m;->b:I

    if-eq p1, v1, :cond_b

    iput p1, p0, Lg2/m;->d:I

    goto :goto_1

    :cond_d
    iget v0, p0, Lg2/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_10

    if-ne v0, v1, :cond_f

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->y()I

    move-result v0

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_e
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->l()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result v0

    if-lt v0, v1, :cond_e

    invoke-virtual {p0, v1}, Lg2/m;->T(I)V

    goto :goto_1

    :cond_f
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->c()Lcom/google/crypto/tink/shaded/protobuf/g0;

    move-result-object p1

    throw p1

    :cond_10
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->l()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->e()Z

    move-result v0

    if-eqz v0, :cond_11

    goto :goto_1

    :cond_11
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->x()I

    move-result v0

    iget v1, p0, Lg2/m;->b:I

    if-eq v0, v1, :cond_10

    iput v0, p0, Lg2/m;->d:I

    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final s(Lcom/google/protobuf/h3;Ljava/lang/Class;Lcom/google/protobuf/z;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    packed-switch p1, :pswitch_data_0

    :pswitch_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "unsupported field type."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    invoke-virtual {p0}, Lg2/m;->K()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-virtual {p0}, Lg2/m;->I()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-virtual {p0}, Lg2/m;->G()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-virtual {p0}, Lg2/m;->E()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_5
    invoke-virtual {p0}, Lg2/m;->q()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_6
    invoke-virtual {p0}, Lg2/m;->P()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_7
    invoke-virtual {p0}, Lg2/m;->m()Lcom/google/protobuf/n;

    move-result-object p1

    return-object p1

    :pswitch_8
    invoke-virtual {p0, p2, p3}, Lg2/m;->D(Ljava/lang/Class;Lcom/google/protobuf/z;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_9
    invoke-virtual {p0}, Lg2/m;->O()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_a
    invoke-virtual {p0}, Lg2/m;->j()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_b
    invoke-virtual {p0}, Lg2/m;->t()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_c
    invoke-virtual {p0}, Lg2/m;->v()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_d
    invoke-virtual {p0}, Lg2/m;->z()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_e
    invoke-virtual {p0}, Lg2/m;->R()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_f
    invoke-virtual {p0}, Lg2/m;->B()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_10
    invoke-virtual {p0}, Lg2/m;->x()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1

    :pswitch_11
    invoke-virtual {p0}, Lg2/m;->o()D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final t()I
    .locals 2

    iget v0, p0, Lg2/m;->a:I

    const/4 v1, 0x5

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, v1}, Lg2/m;->U(I)V

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->o()I

    move-result v0

    return v0

    :pswitch_0
    invoke-virtual {p0, v1}, Lg2/m;->U(I)V

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->m()I

    move-result v0

    return v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lg2/m;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    const-string v0, ""

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final u(Ljava/util/List;)V
    .locals 4

    iget v0, p0, Lg2/m;->a:I

    const/4 v1, 0x2

    const/4 v2, 0x5

    packed-switch v0, :pswitch_data_0

    instance-of v0, p1, Lcom/google/protobuf/p0;

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Lcom/google/protobuf/p0;

    iget p1, p0, Lg2/m;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v1, :cond_3

    if-ne p1, v2, :cond_2

    :cond_0
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->o()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/protobuf/p0;->i(I)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->e()Z

    move-result p1

    if-eqz p1, :cond_1

    goto/16 :goto_0

    :cond_1
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->A()I

    move-result p1

    iget v1, p0, Lg2/m;->b:I

    if-eq p1, v1, :cond_0

    iput p1, p0, Lg2/m;->d:I

    goto/16 :goto_0

    :cond_2
    invoke-static {}, Lcom/google/protobuf/a1;->d()Lcom/google/protobuf/z0;

    move-result-object p1

    throw p1

    :cond_3
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->B()I

    move-result p1

    invoke-virtual {p0, p1}, Lg2/m;->W(I)V

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/protobuf/s;

    invoke-virtual {v1}, Lcom/google/protobuf/s;->d()I

    move-result v1

    add-int v3, v1, p1

    :cond_4
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->o()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/protobuf/p0;->i(I)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->d()I

    move-result p1

    if-lt p1, v3, :cond_4

    goto :goto_0

    :cond_5
    iget v0, p0, Lg2/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v1, :cond_9

    if-ne v0, v2, :cond_8

    :cond_6
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->o()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->e()Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_0

    :cond_7
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->A()I

    move-result v0

    iget v1, p0, Lg2/m;->b:I

    if-eq v0, v1, :cond_6

    iput v0, p0, Lg2/m;->d:I

    goto :goto_0

    :cond_8
    invoke-static {}, Lcom/google/protobuf/a1;->d()Lcom/google/protobuf/z0;

    move-result-object p1

    throw p1

    :cond_9
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->B()I

    move-result v0

    invoke-virtual {p0, v0}, Lg2/m;->W(I)V

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/protobuf/s;

    invoke-virtual {v1}, Lcom/google/protobuf/s;->d()I

    move-result v1

    add-int/2addr v0, v1

    :cond_a
    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/protobuf/s;

    invoke-virtual {v1}, Lcom/google/protobuf/s;->o()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/protobuf/s;

    invoke-virtual {v1}, Lcom/google/protobuf/s;->d()I

    move-result v1

    if-lt v1, v0, :cond_a

    :goto_0
    return-void

    :pswitch_0
    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/c0;

    if-eqz v0, :cond_10

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/c0;

    iget p1, p0, Lg2/m;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v1, :cond_e

    if-ne p1, v2, :cond_d

    :cond_b
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->m()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/c0;->i(I)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->e()Z

    move-result p1

    if-eqz p1, :cond_c

    goto/16 :goto_1

    :cond_c
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->x()I

    move-result p1

    iget v1, p0, Lg2/m;->b:I

    if-eq p1, v1, :cond_b

    iput p1, p0, Lg2/m;->d:I

    goto/16 :goto_1

    :cond_d
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->c()Lcom/google/crypto/tink/shaded/protobuf/g0;

    move-result-object p1

    throw p1

    :cond_e
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->y()I

    move-result p1

    invoke-virtual {p0, p1}, Lg2/m;->W(I)V

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result v1

    add-int v3, v1, p1

    :cond_f
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->m()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/c0;->i(I)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result p1

    if-lt p1, v3, :cond_f

    goto :goto_1

    :cond_10
    iget v0, p0, Lg2/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v1, :cond_14

    if-ne v0, v2, :cond_13

    :cond_11
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->m()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->e()Z

    move-result v0

    if-eqz v0, :cond_12

    goto :goto_1

    :cond_12
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->x()I

    move-result v0

    iget v1, p0, Lg2/m;->b:I

    if-eq v0, v1, :cond_11

    iput v0, p0, Lg2/m;->d:I

    goto :goto_1

    :cond_13
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->c()Lcom/google/crypto/tink/shaded/protobuf/g0;

    move-result-object p1

    throw p1

    :cond_14
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->y()I

    move-result v0

    invoke-virtual {p0, v0}, Lg2/m;->W(I)V

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_15
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->m()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result v0

    if-lt v0, v1, :cond_15

    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final v()J
    .locals 2

    iget v0, p0, Lg2/m;->a:I

    const/4 v1, 0x1

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, v1}, Lg2/m;->U(I)V

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->p()J

    move-result-wide v0

    return-wide v0

    :pswitch_0
    invoke-virtual {p0, v1}, Lg2/m;->U(I)V

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->n()J

    move-result-wide v0

    return-wide v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final w(Ljava/util/List;)V
    .locals 4

    iget v0, p0, Lg2/m;->a:I

    const/4 v1, 0x1

    const/4 v2, 0x2

    packed-switch v0, :pswitch_data_0

    instance-of v0, p1, Lcom/google/protobuf/i1;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/protobuf/i1;

    iget p1, p0, Lg2/m;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v1, :cond_2

    if-ne p1, v2, :cond_1

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->B()I

    move-result p1

    invoke-virtual {p0, p1}, Lg2/m;->X(I)V

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/protobuf/s;

    invoke-virtual {v1}, Lcom/google/protobuf/s;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->p()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/protobuf/i1;->i(J)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->d()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto/16 :goto_0

    :cond_1
    invoke-static {}, Lcom/google/protobuf/a1;->d()Lcom/google/protobuf/z0;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->p()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/i1;->i(J)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    goto/16 :goto_0

    :cond_3
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->A()I

    move-result p1

    iget v1, p0, Lg2/m;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lg2/m;->d:I

    goto :goto_0

    :cond_4
    iget v0, p0, Lg2/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v1, :cond_7

    if-ne v0, v2, :cond_6

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->B()I

    move-result v0

    invoke-virtual {p0, v0}, Lg2/m;->X(I)V

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/protobuf/s;

    invoke-virtual {v1}, Lcom/google/protobuf/s;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->p()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->d()I

    move-result v0

    if-lt v0, v1, :cond_5

    goto :goto_0

    :cond_6
    invoke-static {}, Lcom/google/protobuf/a1;->d()Lcom/google/protobuf/z0;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->p()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_0

    :cond_8
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->A()I

    move-result v0

    iget v1, p0, Lg2/m;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lg2/m;->d:I

    :goto_0
    return-void

    :pswitch_0
    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/o0;

    if-eqz v0, :cond_d

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o0;

    iget p1, p0, Lg2/m;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v1, :cond_b

    if-ne p1, v2, :cond_a

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->y()I

    move-result p1

    invoke-virtual {p0, p1}, Lg2/m;->X(I)V

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result v1

    add-int/2addr v1, p1

    :cond_9
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->n()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/o0;->i(J)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result p1

    if-lt p1, v1, :cond_9

    goto/16 :goto_1

    :cond_a
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->c()Lcom/google/crypto/tink/shaded/protobuf/g0;

    move-result-object p1

    throw p1

    :cond_b
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->n()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/o0;->i(J)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->e()Z

    move-result p1

    if-eqz p1, :cond_c

    goto/16 :goto_1

    :cond_c
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->x()I

    move-result p1

    iget v1, p0, Lg2/m;->b:I

    if-eq p1, v1, :cond_b

    iput p1, p0, Lg2/m;->d:I

    goto :goto_1

    :cond_d
    iget v0, p0, Lg2/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v1, :cond_10

    if-ne v0, v2, :cond_f

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->y()I

    move-result v0

    invoke-virtual {p0, v0}, Lg2/m;->X(I)V

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_e
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->n()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result v0

    if-lt v0, v1, :cond_e

    goto :goto_1

    :cond_f
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->c()Lcom/google/crypto/tink/shaded/protobuf/g0;

    move-result-object p1

    throw p1

    :cond_10
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->n()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->e()Z

    move-result v0

    if-eqz v0, :cond_11

    goto :goto_1

    :cond_11
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->x()I

    move-result v0

    iget v1, p0, Lg2/m;->b:I

    if-eq v0, v1, :cond_10

    iput v0, p0, Lg2/m;->d:I

    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final x()F
    .locals 2

    iget v0, p0, Lg2/m;->a:I

    const/4 v1, 0x5

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, v1}, Lg2/m;->U(I)V

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->q()F

    move-result v0

    return v0

    :pswitch_0
    invoke-virtual {p0, v1}, Lg2/m;->U(I)V

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->o()F

    move-result v0

    return v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final y(Ljava/util/List;)V
    .locals 4

    iget v0, p0, Lg2/m;->a:I

    const/4 v1, 0x2

    const/4 v2, 0x5

    packed-switch v0, :pswitch_data_0

    instance-of v0, p1, Lcom/google/protobuf/e0;

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Lcom/google/protobuf/e0;

    iget p1, p0, Lg2/m;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v1, :cond_3

    if-ne p1, v2, :cond_2

    :cond_0
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->q()F

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/protobuf/e0;->i(F)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->e()Z

    move-result p1

    if-eqz p1, :cond_1

    goto/16 :goto_0

    :cond_1
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->A()I

    move-result p1

    iget v1, p0, Lg2/m;->b:I

    if-eq p1, v1, :cond_0

    iput p1, p0, Lg2/m;->d:I

    goto/16 :goto_0

    :cond_2
    invoke-static {}, Lcom/google/protobuf/a1;->d()Lcom/google/protobuf/z0;

    move-result-object p1

    throw p1

    :cond_3
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->B()I

    move-result p1

    invoke-virtual {p0, p1}, Lg2/m;->W(I)V

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/protobuf/s;

    invoke-virtual {v1}, Lcom/google/protobuf/s;->d()I

    move-result v1

    add-int v3, v1, p1

    :cond_4
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->q()F

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/protobuf/e0;->i(F)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/s;

    invoke-virtual {p1}, Lcom/google/protobuf/s;->d()I

    move-result p1

    if-lt p1, v3, :cond_4

    goto :goto_0

    :cond_5
    iget v0, p0, Lg2/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v1, :cond_9

    if-ne v0, v2, :cond_8

    :cond_6
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->q()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->e()Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_0

    :cond_7
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->A()I

    move-result v0

    iget v1, p0, Lg2/m;->b:I

    if-eq v0, v1, :cond_6

    iput v0, p0, Lg2/m;->d:I

    goto :goto_0

    :cond_8
    invoke-static {}, Lcom/google/protobuf/a1;->d()Lcom/google/protobuf/z0;

    move-result-object p1

    throw p1

    :cond_9
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->B()I

    move-result v0

    invoke-virtual {p0, v0}, Lg2/m;->W(I)V

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/protobuf/s;

    invoke-virtual {v1}, Lcom/google/protobuf/s;->d()I

    move-result v1

    add-int/2addr v0, v1

    :cond_a
    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/protobuf/s;

    invoke-virtual {v1}, Lcom/google/protobuf/s;->q()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/protobuf/s;

    invoke-virtual {v1}, Lcom/google/protobuf/s;->d()I

    move-result v1

    if-lt v1, v0, :cond_a

    :goto_0
    return-void

    :pswitch_0
    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/x;

    if-eqz v0, :cond_10

    move-object v0, p1

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/x;

    iget p1, p0, Lg2/m;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v1, :cond_e

    if-ne p1, v2, :cond_d

    :cond_b
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->o()F

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/x;->i(F)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->e()Z

    move-result p1

    if-eqz p1, :cond_c

    goto/16 :goto_1

    :cond_c
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->x()I

    move-result p1

    iget v1, p0, Lg2/m;->b:I

    if-eq p1, v1, :cond_b

    iput p1, p0, Lg2/m;->d:I

    goto/16 :goto_1

    :cond_d
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->c()Lcom/google/crypto/tink/shaded/protobuf/g0;

    move-result-object p1

    throw p1

    :cond_e
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->y()I

    move-result p1

    invoke-virtual {p0, p1}, Lg2/m;->W(I)V

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result v1

    add-int v3, v1, p1

    :cond_f
    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->o()F

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/x;->i(F)V

    iget-object p1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result p1

    if-lt p1, v3, :cond_f

    goto :goto_1

    :cond_10
    iget v0, p0, Lg2/m;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v1, :cond_14

    if-ne v0, v2, :cond_13

    :cond_11
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->o()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->e()Z

    move-result v0

    if-eqz v0, :cond_12

    goto :goto_1

    :cond_12
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->x()I

    move-result v0

    iget v1, p0, Lg2/m;->b:I

    if-eq v0, v1, :cond_11

    iput v0, p0, Lg2/m;->d:I

    goto :goto_1

    :cond_13
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/h0;->c()Lcom/google/crypto/tink/shaded/protobuf/g0;

    move-result-object p1

    throw p1

    :cond_14
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->y()I

    move-result v0

    invoke-virtual {p0, v0}, Lg2/m;->W(I)V

    iget-object v1, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result v1

    add-int/2addr v1, v0

    :cond_15
    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->o()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->d()I

    move-result v0

    if-lt v0, v1, :cond_15

    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final z()I
    .locals 2

    iget v0, p0, Lg2/m;->a:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, v1}, Lg2/m;->U(I)V

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/s;

    invoke-virtual {v0}, Lcom/google/protobuf/s;->r()I

    move-result v0

    return v0

    :pswitch_0
    invoke-virtual {p0, v1}, Lg2/m;->U(I)V

    iget-object v0, p0, Lg2/m;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/o;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/o;->p()I

    move-result v0

    return v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
