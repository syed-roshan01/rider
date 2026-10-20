.class public abstract Lo2/l;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lu0/b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget-object v0, Lo2/k;->b:Lo2/k;

    new-instance v1, Lu0/b;

    const v2, 0xc869e20

    const/4 v3, 0x0

    invoke-direct {v1, v2, v0, v3}, Lu0/b;-><init>(ILd9/j;Z)V

    sput-object v1, Lo2/l;->a:Lu0/b;

    return-void
.end method
