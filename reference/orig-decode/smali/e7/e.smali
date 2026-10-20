.class public abstract Le7/e;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ld7/m;

.field public static final b:Ld7/l;

.field public static final c:Ld7/d;

.field public static final d:Ld7/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "type.googleapis.com/google.crypto.tink.AesCmacKey"

    invoke-static {v0}, Ld7/y;->b(Ljava/lang/String;)Lk7/a;

    move-result-object v0

    new-instance v1, Ld7/m;

    const-class v2, Le7/d;

    invoke-direct {v1, v2}, Ld7/m;-><init>(Ljava/lang/Class;)V

    sput-object v1, Le7/e;->a:Ld7/m;

    new-instance v1, Ld7/l;

    invoke-direct {v1, v0}, Ld7/l;-><init>(Lk7/a;)V

    sput-object v1, Le7/e;->b:Ld7/l;

    new-instance v1, Ld7/d;

    const-class v2, Le7/a;

    invoke-direct {v1, v2}, Ld7/d;-><init>(Ljava/lang/Class;)V

    sput-object v1, Le7/e;->c:Ld7/d;

    new-instance v1, Lw6/t;

    const/16 v2, 0x10

    invoke-direct {v1, v2}, Lw6/t;-><init>(I)V

    new-instance v2, Ld7/b;

    invoke-direct {v2, v1, v0}, Ld7/b;-><init>(Ld7/c;Lk7/a;)V

    sput-object v2, Le7/e;->d:Ld7/b;

    return-void
.end method

.method public static a(Li7/t1;)Le7/c;
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    sget-object p0, Le7/c;->c:Le7/c;

    return-object p0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unable to parse OutputPrefixType: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Li7/t1;->b()I

    move-result p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-object p0, Le7/c;->e:Le7/c;

    return-object p0

    :cond_2
    sget-object p0, Le7/c;->d:Le7/c;

    return-object p0

    :cond_3
    sget-object p0, Le7/c;->b:Le7/c;

    return-object p0
.end method
