.class public final Le7/k;
.super Ljava/lang/Object;


# static fields
.field public static final b:Le7/k;

.field public static final c:Le7/k;

.field public static final d:Le7/k;

.field public static final e:Le7/k;

.field public static final f:Le7/k;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Le7/k;

    const-string v1, "SHA1"

    invoke-direct {v0, v1}, Le7/k;-><init>(Ljava/lang/String;)V

    sput-object v0, Le7/k;->b:Le7/k;

    new-instance v0, Le7/k;

    const-string v1, "SHA224"

    invoke-direct {v0, v1}, Le7/k;-><init>(Ljava/lang/String;)V

    sput-object v0, Le7/k;->c:Le7/k;

    new-instance v0, Le7/k;

    const-string v1, "SHA256"

    invoke-direct {v0, v1}, Le7/k;-><init>(Ljava/lang/String;)V

    sput-object v0, Le7/k;->d:Le7/k;

    new-instance v0, Le7/k;

    const-string v1, "SHA384"

    invoke-direct {v0, v1}, Le7/k;-><init>(Ljava/lang/String;)V

    sput-object v0, Le7/k;->e:Le7/k;

    new-instance v0, Le7/k;

    const-string v1, "SHA512"

    invoke-direct {v0, v1}, Le7/k;-><init>(Ljava/lang/String;)V

    sput-object v0, Le7/k;->f:Le7/k;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le7/k;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Le7/k;->a:Ljava/lang/String;

    return-object v0
.end method
