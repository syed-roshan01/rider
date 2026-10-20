.class public final Lv6/g;
.super Ljava/lang/Object;


# static fields
.field public static final b:Lv6/g;

.field public static final c:Lv6/g;

.field public static final d:Lv6/g;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lv6/g;

    const-string v1, "ENABLED"

    invoke-direct {v0, v1}, Lv6/g;-><init>(Ljava/lang/String;)V

    sput-object v0, Lv6/g;->b:Lv6/g;

    new-instance v0, Lv6/g;

    const-string v1, "DISABLED"

    invoke-direct {v0, v1}, Lv6/g;-><init>(Ljava/lang/String;)V

    sput-object v0, Lv6/g;->c:Lv6/g;

    new-instance v0, Lv6/g;

    const-string v1, "DESTROYED"

    invoke-direct {v0, v1}, Lv6/g;-><init>(Ljava/lang/String;)V

    sput-object v0, Lv6/g;->d:Lv6/g;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv6/g;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lv6/g;->a:Ljava/lang/String;

    return-object v0
.end method
