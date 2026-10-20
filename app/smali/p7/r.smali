.class public final Lp7/r;
.super Lp7/p;


# static fields
.field public static final a:Lp7/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp7/r;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lp7/r;->a:Lp7/r;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    instance-of p1, p1, Lp7/r;

    return p1
.end method

.method public final hashCode()I
    .locals 1

    const-class v0, Lp7/r;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
