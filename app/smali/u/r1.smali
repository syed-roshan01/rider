.class public abstract Lu/r1;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ly1/u;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ly1/u;

    const-string v1, "MagnifierPositionInRoot"

    invoke-direct {v0, v1}, Ly1/u;-><init>(Ljava/lang/String;)V

    sput-object v0, Lu/r1;->a:Ly1/u;

    return-void
.end method

.method public static a()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
