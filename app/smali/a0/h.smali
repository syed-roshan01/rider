.class public abstract La0/h;
.super Ljava/lang/Object;


# static fields
.field public static final a:La0/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lm2/i;->c:I

    sget-object v0, Lt/i2;->a:Ljava/util/Map;

    const/4 v0, 0x1

    invoke-static {v0, v0}, Li1/b;->c(II)J

    new-instance v0, Lm2/i;

    sget-object v0, La0/g;->b:La0/g;

    sput-object v0, La0/h;->a:La0/g;

    return-void
.end method
