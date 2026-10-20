.class public abstract Lf0/l;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lu0/b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    invoke-static {}, Lk7/۟ۤۥۡ;->۟ۧۦۨۥ()Lf0/e;

    move-result-object v0

    new-instance v1, Lu0/b;

    const v2, 0x28032617

    sget v3, Landroidx/compose/foundation/text/modifiers/۠۠ۧ;->ۢ۟ۢ۟:I

    xor-int/2addr v2, v3

    const/4 v3, 0x0

    invoke-direct {v1, v2, v0, v3}, Lu0/b;-><init>(ILd9/j;Z)V

    sput-object v1, Lf0/l;->a:Lu0/b;

    return-void
.end method
