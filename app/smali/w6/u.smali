.class public abstract Lw6/u;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ld7/m;

.field public static final b:Ld7/l;

.field public static final c:Ld7/d;

.field public static final d:Ld7/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "type.googleapis.com/google.crypto.tink.AesGcmSivKey"

    invoke-static {v0}, Ld7/y;->b(Ljava/lang/String;)Lk7/a;

    move-result-object v0

    new-instance v1, Ld7/m;

    const-class v2, Lw6/s;

    invoke-direct {v1, v2}, Ld7/m;-><init>(Ljava/lang/Class;)V

    sput-object v1, Lw6/u;->a:Ld7/m;

    new-instance v1, Ld7/l;

    invoke-direct {v1, v0}, Ld7/l;-><init>(Lk7/a;)V

    sput-object v1, Lw6/u;->b:Ld7/l;

    new-instance v1, Ld7/d;

    const-class v2, Lw6/q;

    invoke-direct {v1, v2}, Ld7/d;-><init>(Ljava/lang/Class;)V

    sput-object v1, Lw6/u;->c:Ld7/d;

    new-instance v1, Lw6/t;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Lw6/t;-><init>(I)V

    new-instance v2, Ld7/b;

    invoke-direct {v2, v1, v0}, Ld7/b;-><init>(Ld7/c;Lk7/a;)V

    sput-object v2, Lw6/u;->d:Ld7/b;

    return-void
.end method
