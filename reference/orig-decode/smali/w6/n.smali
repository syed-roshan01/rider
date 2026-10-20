.class public final Lw6/n;
.super Ljava/lang/Object;


# static fields
.field public static final b:Lw6/n;

.field public static final c:Lw6/n;

.field public static final d:Lw6/n;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lw6/n;

    const-string v1, "TINK"

    invoke-direct {v0, v1}, Lw6/n;-><init>(Ljava/lang/String;)V

    sput-object v0, Lw6/n;->b:Lw6/n;

    new-instance v0, Lw6/n;

    const-string v1, "CRUNCHY"

    invoke-direct {v0, v1}, Lw6/n;-><init>(Ljava/lang/String;)V

    sput-object v0, Lw6/n;->c:Lw6/n;

    new-instance v0, Lw6/n;

    const-string v1, "NO_PREFIX"

    invoke-direct {v0, v1}, Lw6/n;-><init>(Ljava/lang/String;)V

    sput-object v0, Lw6/n;->d:Lw6/n;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw6/n;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lw6/n;->a:Ljava/lang/String;

    return-object v0
.end method
