.class public final Le7/j;
.super Ld7/f;


# static fields
.field public static final d:Ld7/n;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lw6/t;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lw6/t;-><init>(I)V

    new-instance v1, Ld7/n;

    const-class v2, Le7/i;

    invoke-direct {v1, v0, v2}, Ld7/n;-><init>(Lw6/t;Ljava/lang/Class;)V

    sput-object v1, Le7/j;->d:Ld7/n;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    const/4 v0, 0x1

    new-array v0, v0, [Ld7/p;

    new-instance v1, Lw6/f;

    const-class v2, Lv6/m;

    const/16 v3, 0xb

    invoke-direct {v1, v2, v3}, Lw6/f;-><init>(Ljava/lang/Class;I)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Li7/t0;

    invoke-direct {p0, v1, v0}, Ld7/f;-><init>(Ljava/lang/Class;[Ld7/p;)V

    return-void
.end method

.method public static h(IILi7/r0;I)Ld7/e;
    .locals 4

    new-instance v0, Ld7/e;

    invoke-static {}, Li7/v0;->C()Li7/u0;

    move-result-object v1

    invoke-static {}, Li7/x0;->C()Li7/w0;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v3, v2, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v3, Li7/x0;

    invoke-static {v3, p2}, Li7/x0;->x(Li7/x0;Li7/r0;)V

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object p2, v2, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast p2, Li7/x0;

    invoke-static {p2, p1}, Li7/x0;->y(Li7/x0;I)V

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/z;->a()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p1

    check-cast p1, Li7/x0;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object p2, v1, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast p2, Li7/v0;

    invoke-static {p2, p1}, Li7/v0;->x(Li7/v0;Li7/x0;)V

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object p1, v1, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast p1, Li7/v0;

    invoke-static {p1, p0}, Li7/v0;->y(Li7/v0;I)V

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/z;->a()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p0

    check-cast p0, Li7/v0;

    invoke-direct {v0, p0, p3}, Ld7/e;-><init>(Lcom/google/crypto/tink/shaded/protobuf/b0;I)V

    return-object v0
.end method

.method public static i(Li7/t0;)V
    .locals 2

    invoke-virtual {p0}, Li7/t0;->D()I

    move-result v0

    invoke-static {v0}, Lj7/r;->c(I)V

    invoke-virtual {p0}, Li7/t0;->B()Lcom/google/crypto/tink/shaded/protobuf/l;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/l;->size()I

    move-result v0

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Li7/t0;->C()Li7/x0;

    move-result-object p0

    invoke-static {p0}, Le7/j;->j(Li7/x0;)V

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "key too short"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static j(Li7/x0;)V
    .locals 3

    invoke-virtual {p0}, Li7/x0;->B()I

    move-result v0

    const/16 v1, 0xa

    if-lt v0, v1, :cond_a

    invoke-virtual {p0}, Li7/x0;->A()Li7/r0;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x1

    const-string v2, "tag size too big"

    if-eq v0, v1, :cond_8

    const/4 v1, 0x2

    if-eq v0, v1, :cond_6

    const/4 v1, 0x3

    if-eq v0, v1, :cond_4

    const/4 v1, 0x4

    if-eq v0, v1, :cond_2

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Li7/x0;->B()I

    move-result p0

    const/16 v0, 0x1c

    if-gt p0, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "unknown hash type"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-virtual {p0}, Li7/x0;->B()I

    move-result p0

    const/16 v0, 0x40

    if-gt p0, v0, :cond_3

    goto :goto_0

    :cond_3
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    invoke-virtual {p0}, Li7/x0;->B()I

    move-result p0

    const/16 v0, 0x20

    if-gt p0, v0, :cond_5

    goto :goto_0

    :cond_5
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    invoke-virtual {p0}, Li7/x0;->B()I

    move-result p0

    const/16 v0, 0x30

    if-gt p0, v0, :cond_7

    goto :goto_0

    :cond_7
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8
    invoke-virtual {p0}, Li7/x0;->B()I

    move-result p0

    const/16 v0, 0x14

    if-gt p0, v0, :cond_9

    :goto_0
    return-void

    :cond_9
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_a
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "tag size too small"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final a()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.HmacKey"

    return-object v0
.end method

.method public final d()Lw6/g;
    .locals 3

    new-instance v0, Lw6/g;

    const-class v1, Li7/v0;

    const/16 v2, 0xb

    invoke-direct {v0, p0, v1, v2}, Lw6/g;-><init>(Ld7/f;Ljava/lang/Class;I)V

    return-object v0
.end method

.method public final e()Li7/z0;
    .locals 1

    sget-object v0, Li7/z0;->c:Li7/z0;

    return-object v0
.end method

.method public final f(Lcom/google/crypto/tink/shaded/protobuf/l;)Lcom/google/crypto/tink/shaded/protobuf/b;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/t;->a()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v0

    invoke-static {p1, v0}, Li7/t0;->F(Lcom/google/crypto/tink/shaded/protobuf/l;Lcom/google/crypto/tink/shaded/protobuf/t;)Li7/t0;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic g(Lcom/google/crypto/tink/shaded/protobuf/b;)V
    .locals 0

    check-cast p1, Li7/t0;

    invoke-static {p1}, Le7/j;->i(Li7/t0;)V

    return-void
.end method
