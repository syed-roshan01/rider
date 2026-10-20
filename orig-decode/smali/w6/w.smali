.class public final Lw6/w;
.super Ljava/lang/Object;


# static fields
.field public static final b:Lw6/w;

.field public static final c:Lw6/w;

.field public static final d:Lw6/w;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lw6/w;

    const-string v1, "TINK"

    invoke-direct {v0, v1}, Lw6/w;-><init>(Ljava/lang/String;)V

    sput-object v0, Lw6/w;->b:Lw6/w;

    new-instance v0, Lw6/w;

    const-string v1, "CRUNCHY"

    invoke-direct {v0, v1}, Lw6/w;-><init>(Ljava/lang/String;)V

    sput-object v0, Lw6/w;->c:Lw6/w;

    new-instance v0, Lw6/w;

    const-string v1, "NO_PREFIX"

    invoke-direct {v0, v1}, Lw6/w;-><init>(Ljava/lang/String;)V

    sput-object v0, Lw6/w;->d:Lw6/w;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw6/w;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lw6/w;->a:Ljava/lang/String;

    return-object v0
.end method
