.class public final Lm9/u1;
.super Ljava/lang/Object;

# interfaces
.implements Lm9/o0;
.implements Lm9/o;


# static fields
.field public static final a:Lm9/u1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm9/u1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lm9/u1;->a:Lm9/u1;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    return-void
.end method

.method public final d(Ljava/lang/Throwable;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final getParent()Lm9/f1;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "NonDisposableHandle"

    return-object v0
.end method
