.class public abstract Lu0/g;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lu0/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lu0/f;

    const/4 v1, 0x0

    new-array v2, v1, [J

    new-array v3, v1, [Ljava/lang/Object;

    invoke-direct {v0, v1, v2, v3}, Lu0/f;-><init>(I[J[Ljava/lang/Object;)V

    sput-object v0, Lu0/g;->a:Lu0/f;

    return-void
.end method
