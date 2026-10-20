.class public abstract Lh0/d0;
.super Ljava/lang/Object;


# static fields
.field public static final a:F

.field public static final b:F

.field public static final c:Ly1/u;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x19

    int-to-float v0, v0

    sput v0, Lh0/d0;->a:F

    sput v0, Lh0/d0;->b:F

    new-instance v0, Ly1/u;

    const-string v1, "SelectionHandleInfo"

    invoke-direct {v0, v1}, Ly1/u;-><init>(Ljava/lang/String;)V

    sput-object v0, Lh0/d0;->c:Ly1/u;

    return-void
.end method
