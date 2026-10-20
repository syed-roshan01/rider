.class public final Ld7/s;
.super Ljava/lang/Object;

# interfaces
.implements Ld7/u;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lk7/a;

.field public final c:Lcom/google/crypto/tink/shaded/protobuf/l;

.field public final d:Li7/z0;

.field public final e:Li7/t1;

.field public final f:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/l;Li7/z0;Li7/t1;Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld7/s;->a:Ljava/lang/String;

    invoke-static {p1}, Ld7/y;->b(Ljava/lang/String;)Lk7/a;

    move-result-object p1

    iput-object p1, p0, Ld7/s;->b:Lk7/a;

    iput-object p2, p0, Ld7/s;->c:Lcom/google/crypto/tink/shaded/protobuf/l;

    iput-object p3, p0, Ld7/s;->d:Li7/z0;

    iput-object p4, p0, Ld7/s;->e:Li7/t1;

    iput-object p5, p0, Ld7/s;->f:Ljava/lang/Integer;

    return-void
.end method

.method public static a(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/l;Li7/z0;Li7/t1;Ljava/lang/Integer;)Ld7/s;
    .locals 7

    sget-object v0, Li7/t1;->e:Li7/t1;

    if-ne p3, v0, :cond_1

    if-nez p4, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Keys with output prefix type raw should not have an id requirement."

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    if-eqz p4, :cond_2

    :goto_0
    new-instance v6, Ld7/s;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Ld7/s;-><init>(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/l;Li7/z0;Li7/t1;Ljava/lang/Integer;)V

    return-object v6

    :cond_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Keys with output prefix type different from raw should have an id requirement."

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
