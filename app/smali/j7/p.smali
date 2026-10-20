.class public final Lj7/p;
.super Ljava/lang/Object;

# interfaces
.implements Lv6/m;


# instance fields
.field public final a:Lh7/a;

.field public final b:I


# direct methods
.method public constructor <init>(Lh7/a;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj7/p;->a:Lh7/a;

    iput p2, p0, Lj7/p;->b:I

    const/16 v0, 0xa

    if-lt p2, v0, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [B

    invoke-interface {p1, p2, v0}, Lh7/a;->a(I[B)[B

    return-void

    :cond_0
    new-instance p1, Ljava/security/InvalidAlgorithmParameterException;

    const-string p2, "tag size too small, need at least 10 bytes"

    invoke-direct {p1, p2}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a([B[B)V
    .locals 0

    invoke-virtual {p0, p2}, Lj7/p;->b([B)[B

    move-result-object p2

    invoke-static {p2, p1}, Ljava/security/MessageDigest;->isEqual([B[B)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "invalid MAC"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b([B)[B
    .locals 2

    iget-object v0, p0, Lj7/p;->a:Lh7/a;

    iget v1, p0, Lj7/p;->b:I

    invoke-interface {v0, v1, p1}, Lh7/a;->a(I[B)[B

    move-result-object p1

    return-object p1
.end method
