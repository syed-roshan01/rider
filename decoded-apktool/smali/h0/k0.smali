.class public abstract Lh0/k0;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lt/q;

.field public static final b:Lt/x1;

.field public static final c:J

.field public static final d:Lt/d1;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lt/q;

    const/high16 v1, 0x7fc00000    # Float.NaN

    invoke-direct {v0, v1, v1}, Lt/q;-><init>(FF)V

    sput-object v0, Lh0/k0;->a:Lt/q;

    sget-object v0, Lh0/g0;->b:Lh0/g0;

    sget-object v1, Lh0/g0;->c:Lh0/g0;

    sget-object v2, Lt/y1;->a:Lt/x1;

    new-instance v2, Lt/x1;

    invoke-direct {v2, v0, v1}, Lt/x1;-><init>(Lc9/c;Lc9/c;)V

    sput-object v2, Lh0/k0;->b:Lt/x1;

    const v0, 0x3c23d70a    # 0.01f

    invoke-static {v0, v0}, Ld9/i;->f(FF)J

    move-result-wide v0

    sput-wide v0, Lh0/k0;->c:J

    new-instance v2, Lt/d1;

    new-instance v3, Ld1/c;

    invoke-direct {v3, v0, v1}, Ld1/c;-><init>(J)V

    invoke-direct {v2, v3}, Lt/d1;-><init>(Ljava/lang/Object;)V

    sput-object v2, Lh0/k0;->d:Lt/d1;

    return-void
.end method
