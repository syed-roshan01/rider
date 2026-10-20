.class public final Lw6/b0;
.super Ljava/lang/Object;


# static fields
.field public static final b:Lw6/b0;

.field public static final c:Lw6/b0;

.field public static final d:Lw6/b0;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lw6/b0;

    const-string v1, "TINK"

    invoke-direct {v0, v1}, Lw6/b0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lw6/b0;->b:Lw6/b0;

    new-instance v0, Lw6/b0;

    const-string v1, "CRUNCHY"

    invoke-direct {v0, v1}, Lw6/b0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lw6/b0;->c:Lw6/b0;

    new-instance v0, Lw6/b0;

    const-string v1, "NO_PREFIX"

    invoke-direct {v0, v1}, Lw6/b0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lw6/b0;->d:Lw6/b0;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw6/b0;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lw6/b0;->a:Ljava/lang/String;

    return-object v0
.end method
