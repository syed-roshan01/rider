.class public final Le7/l;
.super Ljava/lang/Object;


# static fields
.field public static final b:Le7/l;

.field public static final c:Le7/l;

.field public static final d:Le7/l;

.field public static final e:Le7/l;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Le7/l;

    const-string v1, "TINK"

    invoke-direct {v0, v1}, Le7/l;-><init>(Ljava/lang/String;)V

    sput-object v0, Le7/l;->b:Le7/l;

    new-instance v0, Le7/l;

    const-string v1, "CRUNCHY"

    invoke-direct {v0, v1}, Le7/l;-><init>(Ljava/lang/String;)V

    sput-object v0, Le7/l;->c:Le7/l;

    new-instance v0, Le7/l;

    const-string v1, "LEGACY"

    invoke-direct {v0, v1}, Le7/l;-><init>(Ljava/lang/String;)V

    sput-object v0, Le7/l;->d:Le7/l;

    new-instance v0, Le7/l;

    const-string v1, "NO_PREFIX"

    invoke-direct {v0, v1}, Le7/l;-><init>(Ljava/lang/String;)V

    sput-object v0, Le7/l;->e:Le7/l;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le7/l;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Le7/l;->a:Ljava/lang/String;

    return-object v0
.end method
