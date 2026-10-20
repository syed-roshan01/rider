.class public final Lg8/z3;
.super Ljava/io/OutputStream;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lg8/b4;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lg8/z3;->a:I

    .line 2
    invoke-direct {p0, p1, v0}, Lg8/z3;-><init>(Ljava/lang/Object;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lg8/z3;->a:I

    iput-object p1, p0, Lg8/z3;->b:Ljava/lang/Object;

    .line 1
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    iget v0, p0, Lg8/z3;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/io/OutputStream;->close()V

    :pswitch_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final flush()V
    .locals 1

    iget v0, p0, Lg8/z3;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/io/OutputStream;->flush()V

    :pswitch_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lg8/z3;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lg8/z3;->b:Ljava/lang/Object;

    check-cast v1, Lja/g;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".outputStream()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final write(I)V
    .locals 3

    iget v0, p0, Lg8/z3;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg8/z3;->b:Ljava/lang/Object;

    check-cast v0, Lja/g;

    .line 4
    invoke-virtual {v0, p1}, Lja/g;->h0(I)V

    return-void

    :pswitch_0
    const/4 v0, 0x1

    new-array v1, v0, [B

    int-to-byte p1, p1

    const/4 v2, 0x0

    aput-byte p1, v1, v2

    .line 5
    invoke-virtual {p0, v1, v2, v0}, Lg8/z3;->write([BII)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final write([BII)V
    .locals 2

    iget v0, p0, Lg8/z3;->a:I

    iget-object v1, p0, Lg8/z3;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    const-string v0, "data"

    .line 1
    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lja/g;

    .line 2
    invoke-virtual {v1, p1, p2, p3}, Lja/g;->f0([BII)V

    return-void

    :pswitch_0
    check-cast v1, Lg8/b4;

    .line 3
    invoke-virtual {v1, p1, p2, p3}, Lg8/b4;->i([BII)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
