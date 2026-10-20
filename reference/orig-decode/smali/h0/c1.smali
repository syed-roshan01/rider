.class public abstract Lh0/c1;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lm0/p0;

.field public static final b:Lh0/b1;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    sget-object v0, Lh0/m0;->c:Lh0/m0;

    sget-object v1, Lm0/o3;->a:Lm0/o3;

    new-instance v2, Lm0/p0;

    invoke-direct {v2, v1, v0}, Lm0/p0;-><init>(Lm0/z2;Lc9/a;)V

    sput-object v2, Lh0/c1;->a:Lm0/p0;

    const-wide v0, 0xff4286f4L

    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/a;->c(J)J

    move-result-wide v0

    new-instance v2, Lh0/b1;

    const v3, 0x3ecccccd    # 0.4f

    invoke-static {v0, v1, v3}, Le1/r;->b(JF)J

    move-result-wide v3

    invoke-direct {v2, v0, v1, v3, v4}, Lh0/b1;-><init>(JJ)V

    sput-object v2, Lh0/c1;->b:Lh0/b1;

    return-void
.end method
