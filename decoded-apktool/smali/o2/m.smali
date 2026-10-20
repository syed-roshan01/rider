.class public abstract Lo2/m;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lu0/b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget-object v0, Lo2/k;->c:Lo2/k;

    new-instance v1, Lu0/b;

    const v2, -0x43764c14

    const/4 v3, 0x0

    invoke-direct {v1, v2, v0, v3}, Lu0/b;-><init>(ILd9/j;Z)V

    sput-object v1, Lo2/m;->a:Lu0/b;

    return-void
.end method
