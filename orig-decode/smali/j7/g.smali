.class public final Lj7/g;
.super Ljava/lang/Object;

# interfaces
.implements Lv6/a;


# instance fields
.field public final synthetic a:I

.field public final b:Lx6/e;


# direct methods
.method public constructor <init>([BI)V
    .locals 1

    iput p2, p0, Lj7/g;->a:I

    const/4 v0, 0x1

    if-eq p2, v0, :cond_0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p2, Lx6/e;

    const/4 v0, 0x0

    invoke-direct {p2, p1, v0}, Lx6/e;-><init>([BI)V

    iput-object p2, p0, Lj7/g;->b:Lx6/e;

    return-void

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p2, Lx6/e;

    invoke-direct {p2, p1, v0}, Lx6/e;-><init>([BI)V

    iput-object p2, p0, Lj7/g;->b:Lx6/e;

    return-void
.end method


# virtual methods
.method public final a([B[B)[B
    .locals 3

    iget v0, p0, Lj7/g;->a:I

    iget-object v1, p0, Lj7/g;->b:Lx6/e;

    packed-switch v0, :pswitch_data_0

    array-length v0, p1

    add-int/lit8 v0, v0, 0x28

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    const/16 v2, 0x18

    invoke-static {v2}, Lj7/q;->a(I)[B

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v0, v2, p1, p2}, Lx6/f;->b(Ljava/nio/ByteBuffer;[B[B[B)V

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p1

    return-object p1

    :pswitch_0
    array-length v0, p1

    add-int/lit8 v0, v0, 0x1c

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    const/16 v2, 0xc

    invoke-static {v2}, Lj7/q;->a(I)[B

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v0, v2, p1, p2}, Lx6/f;->b(Ljava/nio/ByteBuffer;[B[B[B)V

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b([B[B)[B
    .locals 4

    iget v0, p0, Lj7/g;->a:I

    const-string v1, "ciphertext too short"

    iget-object v2, p0, Lj7/g;->b:Lx6/e;

    packed-switch v0, :pswitch_data_0

    array-length v0, p1

    const/16 v3, 0x28

    if-lt v0, v3, :cond_0

    const/16 v0, 0x18

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v1

    array-length v3, p1

    sub-int/2addr v3, v0

    invoke-static {p1, v0, v3}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {v2, p1, v1, p2}, Lx6/f;->a(Ljava/nio/ByteBuffer;[B[B)[B

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-direct {p1, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    array-length v0, p1

    const/16 v3, 0x1c

    if-lt v0, v3, :cond_1

    const/16 v0, 0xc

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v1

    array-length v3, p1

    sub-int/2addr v3, v0

    invoke-static {p1, v0, v3}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {v2, p1, v1, p2}, Lx6/f;->a(Ljava/nio/ByteBuffer;[B[B)[B

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-direct {p1, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
