.class public final Ls/n;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# static fields
.field public static final a:Ls/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ls/n;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ld9/j;-><init>(I)V

    sput-object v0, Ls/n;->a:Ls/n;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lm2/k;

    iget-wide v0, p1, Lm2/k;->a:J

    check-cast p2, Lm2/k;

    iget-wide p1, p2, Lm2/k;->a:J

    sget-object p1, Lt/i2;->a:Ljava/util/Map;

    const/4 p1, 0x1

    invoke-static {p1, p1}, Lo1/s;->e(II)J

    move-result-wide v0

    new-instance p2, Lm2/k;

    invoke-direct {p2, v0, v1}, Lm2/k;-><init>(J)V

    const/high16 v0, 0x43c80000    # 400.0f

    invoke-static {v0, p2, p1}, Lt/e;->r(FLjava/lang/Object;I)Lt/d1;

    move-result-object p1

    return-object p1
.end method
