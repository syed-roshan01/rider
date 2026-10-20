.class public final Ls1/b;
.super Lf6/a;


# static fields
.field public static final z:Ls1/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls1/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ls1/b;->z:Ls1/b;

    return-void
.end method


# virtual methods
.method public final B(Ls1/c;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final I(Ls1/i;)Ljava/lang/Object;
    .locals 1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, ""

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
