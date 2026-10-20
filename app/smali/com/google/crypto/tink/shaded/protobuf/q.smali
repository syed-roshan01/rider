.class public final Lcom/google/crypto/tink/shaded/protobuf/q;
.super Ljava/io/IOException;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/IndexOutOfBoundsException;)V
    .locals 2

    const/4 v0, 0x1

    const-string v1, "CodedOutputStream was writing to a flat byte array and ran out of space.: "

    if-eq p1, v0, :cond_0

    .line 1
    invoke-static {v1, p2}, Ll/q;->x(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 2
    invoke-direct {p0, p1, p3}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    .line 3
    :cond_0
    invoke-static {v1, p2}, Ll/q;->x(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 4
    invoke-direct {p0, p1, p3}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/IndexOutOfBoundsException;)V
    .locals 1

    const-string v0, "CodedOutputStream was writing to a flat byte array and ran out of space."

    .line 13
    invoke-direct {p0, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
