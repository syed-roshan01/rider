.class public abstract Lu9/e;
.super Ljava/lang/Object;


# static fields
.field public static final a:Li3/u;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Li3/u;

    const-string v1, "NO_OWNER"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Li3/u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lu9/e;->a:Li3/u;

    return-void
.end method

.method public static a()Lu9/d;
    .locals 2

    new-instance v0, Lu9/d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lu9/d;-><init>(Z)V

    return-object v0
.end method
