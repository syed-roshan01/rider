.class public final Lm0/o3;
.super Ljava/lang/Object;

# interfaces
.implements Lm0/z2;


# static fields
.field public static final a:Lm0/o3;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm0/o3;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lm0/o3;->a:Lm0/o3;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p1, p2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "StructuralEqualityPolicy"

    return-object v0
.end method
