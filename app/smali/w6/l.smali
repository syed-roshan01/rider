.class public abstract Lw6/l;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ld7/m;

.field public static final b:Ld7/l;

.field public static final c:Ld7/d;

.field public static final d:Ld7/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "type.googleapis.com/google.crypto.tink.AesEaxKey"

    invoke-static {v0}, Ld7/y;->b(Ljava/lang/String;)Lk7/a;

    move-result-object v0

    new-instance v1, Ld7/m;

    const-class v2, Lw6/k;

    invoke-direct {v1, v2}, Ld7/m;-><init>(Ljava/lang/Class;)V

    sput-object v1, Lw6/l;->a:Ld7/m;

    new-instance v1, Ld7/l;

    invoke-direct {v1, v0}, Ld7/l;-><init>(Lk7/a;)V

    sput-object v1, Lw6/l;->b:Ld7/l;

    new-instance v1, Ld7/d;

    const-class v2, Lw6/i;

    invoke-direct {v1, v2}, Ld7/d;-><init>(Ljava/lang/Class;)V

    sput-object v1, Lw6/l;->c:Ld7/d;

    new-instance v1, Lb0/l0;

    const/16 v2, 0x19

    invoke-direct {v1, v2}, Lb0/l0;-><init>(I)V

    new-instance v2, Ld7/b;

    invoke-direct {v2, v1, v0}, Ld7/b;-><init>(Ld7/c;Lk7/a;)V

    sput-object v2, Lw6/l;->d:Ld7/b;

    return-void
.end method
