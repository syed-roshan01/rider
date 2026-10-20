.class public final Lm0/h2;
.super Ljava/lang/Object;

# interfaces
.implements Lm0/z2;


# static fields
.field public static final a:Lm0/h2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm0/h2;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lm0/h2;->a:Lm0/h2;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "ReferentialEqualityPolicy"

    return-object v0
.end method
