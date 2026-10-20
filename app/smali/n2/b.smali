.class public abstract Ln2/b;
.super Ljava/lang/Object;


# static fields
.field public static volatile a:Lq/a0;

.field public static final b:[Ljava/lang/Object;

.field public static final c:F


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lq/a0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lq/a0;-><init>(I)V

    sput-object v0, Ln2/b;->a:Lq/a0;

    new-array v0, v1, [Ljava/lang/Object;

    sput-object v0, Ln2/b;->b:[Ljava/lang/Object;

    const v2, 0x3f866666    # 1.05f

    sput v2, Ln2/b;->c:F

    monitor-enter v0

    :try_start_0
    sget-object v2, Ln2/b;->a:Lq/a0;

    new-instance v3, Ln2/c;

    const/16 v4, 0x9

    new-array v5, v4, [F

    fill-array-data v5, :array_0

    new-array v6, v4, [F

    fill-array-data v6, :array_1

    invoke-direct {v3, v5, v6}, Ln2/c;-><init>([F[F)V

    const/high16 v5, 0x42e60000    # 115.0f

    float-to-int v5, v5

    invoke-virtual {v2, v5, v3}, Lq/a0;->d(ILjava/lang/Object;)V

    sget-object v2, Ln2/b;->a:Lq/a0;

    new-instance v3, Ln2/c;

    new-array v5, v4, [F

    fill-array-data v5, :array_2

    new-array v6, v4, [F

    fill-array-data v6, :array_3

    invoke-direct {v3, v5, v6}, Ln2/c;-><init>([F[F)V

    const/high16 v5, 0x43020000    # 130.0f

    float-to-int v5, v5

    invoke-virtual {v2, v5, v3}, Lq/a0;->d(ILjava/lang/Object;)V

    sget-object v2, Ln2/b;->a:Lq/a0;

    new-instance v3, Ln2/c;

    new-array v5, v4, [F

    fill-array-data v5, :array_4

    new-array v6, v4, [F

    fill-array-data v6, :array_5

    invoke-direct {v3, v5, v6}, Ln2/c;-><init>([F[F)V

    const/high16 v5, 0x43160000    # 150.0f

    float-to-int v5, v5

    invoke-virtual {v2, v5, v3}, Lq/a0;->d(ILjava/lang/Object;)V

    sget-object v2, Ln2/b;->a:Lq/a0;

    new-instance v3, Ln2/c;

    new-array v5, v4, [F

    fill-array-data v5, :array_6

    new-array v6, v4, [F

    fill-array-data v6, :array_7

    invoke-direct {v3, v5, v6}, Ln2/c;-><init>([F[F)V

    const/high16 v5, 0x43340000    # 180.0f

    float-to-int v5, v5

    invoke-virtual {v2, v5, v3}, Lq/a0;->d(ILjava/lang/Object;)V

    sget-object v2, Ln2/b;->a:Lq/a0;

    new-instance v3, Ln2/c;

    new-array v5, v4, [F

    fill-array-data v5, :array_8

    new-array v4, v4, [F

    fill-array-data v4, :array_9

    invoke-direct {v3, v5, v4}, Ln2/c;-><init>([F[F)V

    const/high16 v4, 0x43480000    # 200.0f

    float-to-int v4, v4

    invoke-virtual {v2, v4, v3}, Lq/a0;->d(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    sget-object v0, Ln2/b;->a:Lq/a0;

    iget-object v0, v0, Lq/a0;->a:[I

    aget v0, v0, v1

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    const v1, 0x3ca3d70a    # 0.02f

    sub-float/2addr v0, v1

    sput v0, Ln2/b;->c:F

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "You should only apply non-linear scaling to font scales > 1"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    :array_0
    .array-data 4
        0x41000000    # 8.0f
        0x41200000    # 10.0f
        0x41400000    # 12.0f
        0x41600000    # 14.0f
        0x41900000    # 18.0f
        0x41a00000    # 20.0f
        0x41c00000    # 24.0f
        0x41f00000    # 30.0f
        0x42c80000    # 100.0f
    .end array-data

    :array_1
    .array-data 4
        0x41133333    # 9.2f
        0x41380000    # 11.5f
        0x415ccccd    # 13.8f
        0x41833333    # 16.4f
        0x419e6666    # 19.8f
        0x41ae6666    # 21.8f
        0x41c9999a    # 25.2f
        0x41f00000    # 30.0f
        0x42c80000    # 100.0f
    .end array-data

    :array_2
    .array-data 4
        0x41000000    # 8.0f
        0x41200000    # 10.0f
        0x41400000    # 12.0f
        0x41600000    # 14.0f
        0x41900000    # 18.0f
        0x41a00000    # 20.0f
        0x41c00000    # 24.0f
        0x41f00000    # 30.0f
        0x42c80000    # 100.0f
    .end array-data

    :array_3
    .array-data 4
        0x41266666    # 10.4f
        0x41500000    # 13.0f
        0x4179999a    # 15.6f
        0x41966666    # 18.8f
        0x41accccd    # 21.6f
        0x41bccccd    # 23.6f
        0x41d33333    # 26.4f
        0x41f00000    # 30.0f
        0x42c80000    # 100.0f
    .end array-data

    :array_4
    .array-data 4
        0x41000000    # 8.0f
        0x41200000    # 10.0f
        0x41400000    # 12.0f
        0x41600000    # 14.0f
        0x41900000    # 18.0f
        0x41a00000    # 20.0f
        0x41c00000    # 24.0f
        0x41f00000    # 30.0f
        0x42c80000    # 100.0f
    .end array-data

    :array_5
    .array-data 4
        0x41400000    # 12.0f
        0x41700000    # 15.0f
        0x41900000    # 18.0f
        0x41b00000    # 22.0f
        0x41c00000    # 24.0f
        0x41d00000    # 26.0f
        0x41e00000    # 28.0f
        0x41f00000    # 30.0f
        0x42c80000    # 100.0f
    .end array-data

    :array_6
    .array-data 4
        0x41000000    # 8.0f
        0x41200000    # 10.0f
        0x41400000    # 12.0f
        0x41600000    # 14.0f
        0x41900000    # 18.0f
        0x41a00000    # 20.0f
        0x41c00000    # 24.0f
        0x41f00000    # 30.0f
        0x42c80000    # 100.0f
    .end array-data

    :array_7
    .array-data 4
        0x41666666    # 14.4f
        0x41900000    # 18.0f
        0x41accccd    # 21.6f
        0x41c33333    # 24.4f
        0x41dccccd    # 27.6f
        0x41f66666    # 30.8f
        0x42033333    # 32.8f
        0x420b3333    # 34.8f
        0x42c80000    # 100.0f
    .end array-data

    :array_8
    .array-data 4
        0x41000000    # 8.0f
        0x41200000    # 10.0f
        0x41400000    # 12.0f
        0x41600000    # 14.0f
        0x41900000    # 18.0f
        0x41a00000    # 20.0f
        0x41c00000    # 24.0f
        0x41f00000    # 30.0f
        0x42c80000    # 100.0f
    .end array-data

    :array_9
    .array-data 4
        0x41800000    # 16.0f
        0x41a00000    # 20.0f
        0x41c00000    # 24.0f
        0x41d00000    # 26.0f
        0x41f00000    # 30.0f
        0x42080000    # 34.0f
        0x42100000    # 36.0f
        0x42180000    # 38.0f
        0x42c80000    # 100.0f
    .end array-data
.end method

.method public static a(F)Ln2/a;
    .locals 9

    sget v0, Ln2/b;->c:F

    cmpl-float v0, p0, v0

    if-ltz v0, :cond_6

    sget-object v0, Ln2/b;->a:Lq/a0;

    const/high16 v1, 0x42c80000    # 100.0f

    mul-float v2, p0, v1

    float-to-int v2, v2

    invoke-virtual {v0, v2}, Lq/a0;->c(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln2/a;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    sget-object v0, Ln2/b;->a:Lq/a0;

    iget-object v3, v0, Lq/a0;->a:[I

    iget v0, v0, Lq/a0;->c:I

    invoke-static {v0, v2, v3}, Lr/a;->a(II[I)I

    move-result v0

    if-ltz v0, :cond_1

    sget-object p0, Ln2/b;->a:Lq/a0;

    iget-object p0, p0, Lq/a0;->b:[Ljava/lang/Object;

    aget-object p0, p0, v0

    check-cast p0, Ln2/a;

    return-object p0

    :cond_1
    const/4 v2, 0x1

    add-int/2addr v0, v2

    neg-int v0, v0

    add-int/lit8 v3, v0, -0x1

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v5, 0x0

    if-ltz v3, :cond_5

    sget-object v6, Ln2/b;->a:Lq/a0;

    iget v6, v6, Lq/a0;->c:I

    if-lt v0, v6, :cond_2

    goto :goto_2

    :cond_2
    sget-object v2, Ln2/b;->a:Lq/a0;

    iget-object v2, v2, Lq/a0;->a:[I

    aget v2, v2, v3

    int-to-float v2, v2

    div-float/2addr v2, v1

    sget-object v6, Ln2/b;->a:Lq/a0;

    iget-object v6, v6, Lq/a0;->a:[I

    aget v6, v6, v0

    int-to-float v6, v6

    div-float/2addr v6, v1

    cmpg-float v1, v2, v6

    const/4 v7, 0x0

    if-nez v1, :cond_3

    move v1, v7

    goto :goto_0

    :cond_3
    sub-float v1, p0, v2

    sub-float/2addr v6, v2

    div-float/2addr v1, v6

    :goto_0
    invoke-static {v4, v1}, Ljava/lang/Math;->min(FF)F

    move-result v1

    invoke-static {v7, v1}, Ljava/lang/Math;->max(FF)F

    move-result v1

    mul-float/2addr v1, v4

    add-float/2addr v1, v7

    sget-object v2, Ln2/b;->a:Lq/a0;

    iget-object v2, v2, Lq/a0;->b:[Ljava/lang/Object;

    aget-object v2, v2, v3

    check-cast v2, Ln2/a;

    sget-object v3, Ln2/b;->a:Lq/a0;

    iget-object v3, v3, Lq/a0;->b:[Ljava/lang/Object;

    aget-object v0, v3, v0

    check-cast v0, Ln2/a;

    const/16 v3, 0x9

    new-array v4, v3, [F

    fill-array-data v4, :array_0

    new-array v6, v3, [F

    :goto_1
    if-ge v5, v3, :cond_4

    aget v7, v4, v5

    invoke-interface {v2, v7}, Ln2/a;->b(F)F

    move-result v8

    invoke-interface {v0, v7}, Ln2/a;->b(F)F

    move-result v7

    sub-float/2addr v7, v8

    mul-float/2addr v7, v1

    add-float/2addr v7, v8

    aput v7, v6, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_4
    new-instance v0, Ln2/c;

    invoke-direct {v0, v4, v6}, Ln2/c;-><init>([F[F)V

    invoke-static {p0, v0}, Ln2/b;->b(FLn2/c;)V

    goto :goto_3

    :cond_5
    :goto_2
    new-instance v0, Ln2/c;

    new-array v1, v2, [F

    aput v4, v1, v5

    new-array v2, v2, [F

    aput p0, v2, v5

    invoke-direct {v0, v1, v2}, Ln2/c;-><init>([F[F)V

    invoke-static {p0, v0}, Ln2/b;->b(FLn2/c;)V

    :goto_3
    return-object v0

    :cond_6
    const/4 p0, 0x0

    return-object p0

    :array_0
    .array-data 4
        0x41000000    # 8.0f
        0x41200000    # 10.0f
        0x41400000    # 12.0f
        0x41600000    # 14.0f
        0x41900000    # 18.0f
        0x41a00000    # 20.0f
        0x41c00000    # 24.0f
        0x41f00000    # 30.0f
        0x42c80000    # 100.0f
    .end array-data
.end method

.method public static b(FLn2/c;)V
    .locals 3

    sget-object v0, Ln2/b;->b:[Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Ln2/b;->a:Lq/a0;

    invoke-virtual {v1}, Lq/a0;->b()Lq/a0;

    move-result-object v1

    const/high16 v2, 0x42c80000    # 100.0f

    mul-float/2addr p0, v2

    float-to-int p0, p0

    invoke-virtual {v1, p0, p1}, Lq/a0;->d(ILjava/lang/Object;)V

    sput-object v1, Ln2/b;->a:Lq/a0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method
