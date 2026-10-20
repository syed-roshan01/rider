.class public Lf1/h;
.super Ljava/lang/Object;


# static fields
.field public static final e:Lf1/f;

.field public static final f:Lf1/h;

.field public static final g:Lf1/h;


# instance fields
.field public final a:Lf1/d;

.field public final b:Lf1/d;

.field public final c:Lf1/d;

.field public final d:[F


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget-object v0, Lf1/e;->c:Lf1/q;

    new-instance v1, Lf1/f;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v0, v2}, Lf1/h;-><init>(Lf1/d;Lf1/d;I)V

    sput-object v1, Lf1/h;->e:Lf1/f;

    new-instance v1, Lf1/h;

    sget-object v2, Lf1/e;->t:Lf1/l;

    const/4 v3, 0x0

    invoke-direct {v1, v0, v2, v3}, Lf1/h;-><init>(Lf1/d;Lf1/d;I)V

    sput-object v1, Lf1/h;->f:Lf1/h;

    new-instance v1, Lf1/h;

    invoke-direct {v1, v2, v0, v3}, Lf1/h;-><init>(Lf1/d;Lf1/d;I)V

    sput-object v1, Lf1/h;->g:Lf1/h;

    return-void
.end method

.method public constructor <init>(Lf1/d;Lf1/d;I)V
    .locals 8

    .line 2
    iget-wide v0, p1, Lf1/d;->b:J

    .line 3
    sget-wide v2, Lf1/c;->a:J

    invoke-static {v0, v1, v2, v3}, Lf1/c;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lo7/d0;->g(Lf1/d;)Lf1/d;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p1

    .line 4
    :goto_0
    iget-wide v4, p2, Lf1/d;->b:J

    .line 5
    invoke-static {v4, v5, v2, v3}, Lf1/c;->a(JJ)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 6
    invoke-static {p2}, Lo7/d0;->g(Lf1/d;)Lf1/d;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, p2

    :goto_1
    const/4 v4, 0x0

    const/4 v5, 0x3

    if-ne p3, v5, :cond_7

    .line 7
    iget-wide v6, p1, Lf1/d;->b:J

    invoke-static {v6, v7, v2, v3}, Lf1/c;->a(JJ)Z

    move-result p3

    .line 8
    iget-wide v6, p2, Lf1/d;->b:J

    invoke-static {v6, v7, v2, v3}, Lf1/c;->a(JJ)Z

    move-result v2

    if-eqz p3, :cond_2

    if-eqz v2, :cond_2

    goto :goto_4

    :cond_2
    if-nez p3, :cond_3

    if-eqz v2, :cond_7

    :cond_3
    if-eqz p3, :cond_4

    goto :goto_2

    :cond_4
    move-object p1, p2

    .line 9
    :goto_2
    check-cast p1, Lf1/q;

    sget-object v3, Lf1/j;->e:[F

    .line 10
    iget-object p1, p1, Lf1/q;->d:Lf1/s;

    if-eqz p3, :cond_5

    invoke-virtual {p1}, Lf1/s;->a()[F

    move-result-object p3

    goto :goto_3

    :cond_5
    move-object p3, v3

    :goto_3
    if-eqz v2, :cond_6

    .line 11
    invoke-virtual {p1}, Lf1/s;->a()[F

    move-result-object v3

    :cond_6
    new-array v4, v5, [F

    const/4 p1, 0x0

    .line 12
    aget v2, p3, p1

    aget v5, v3, p1

    div-float/2addr v2, v5

    aput v2, v4, p1

    const/4 p1, 0x1

    .line 13
    aget v2, p3, p1

    aget v5, v3, p1

    div-float/2addr v2, v5

    aput v2, v4, p1

    const/4 p1, 0x2

    .line 14
    aget p3, p3, p1

    aget v2, v3, p1

    div-float/2addr p3, v2

    aput p3, v4, p1

    .line 15
    :cond_7
    :goto_4
    invoke-direct {p0, p2, v0, v1, v4}, Lf1/h;-><init>(Lf1/d;Lf1/d;Lf1/d;[F)V

    return-void
.end method

.method public constructor <init>(Lf1/d;Lf1/d;Lf1/d;[F)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/h;->a:Lf1/d;

    iput-object p2, p0, Lf1/h;->b:Lf1/d;

    iput-object p3, p0, Lf1/h;->c:Lf1/d;

    iput-object p4, p0, Lf1/h;->d:[F

    return-void
.end method


# virtual methods
.method public a(FFFF)J
    .locals 10

    iget-object v0, p0, Lf1/h;->b:Lf1/d;

    invoke-virtual {v0, p1, p2, p3}, Lf1/d;->d(FFF)J

    move-result-wide v1

    const/16 v3, 0x20

    shr-long v3, v1, v3

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    const-wide v4, 0xffffffffL

    and-long/2addr v1, v4

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    invoke-virtual {v0, p1, p2, p3}, Lf1/d;->e(FFF)F

    move-result p1

    iget-object p2, p0, Lf1/h;->d:[F

    if-eqz p2, :cond_0

    const/4 p3, 0x0

    aget p3, p2, p3

    mul-float/2addr v3, p3

    const/4 p3, 0x1

    aget p3, p2, p3

    mul-float/2addr v1, p3

    const/4 p3, 0x2

    aget p2, p2, p3

    mul-float/2addr p1, p2

    :cond_0
    move v7, p1

    move v6, v1

    move v5, v3

    iget-object v4, p0, Lf1/h;->c:Lf1/d;

    iget-object v9, p0, Lf1/h;->a:Lf1/d;

    move v8, p4

    invoke-virtual/range {v4 .. v9}, Lf1/d;->f(FFFFLf1/d;)J

    move-result-wide p1

    return-wide p1
.end method
