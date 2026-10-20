.class public abstract Lu1/u3;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ljava/util/LinkedHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    sput-object v0, Lu1/u3;->a:Ljava/util/LinkedHashMap;

    return-void
.end method

.method public static final a(Landroid/content/Context;)Lp9/o0;
    .locals 9

    sget-object v0, Lu1/u3;->a:Ljava/util/LinkedHashMap;

    monitor-enter v0

    :try_start_0
    invoke-virtual {v0, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    const-string v1, "animator_duration_scale"

    invoke-static {v1}, Landroid/provider/Settings$Global;->getUriFor(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    const/4 v1, 0x0

    const/4 v2, -0x1

    const/4 v5, 0x6

    invoke-static {v2, v1, v5}, Lz6/a;->a(ILo9/a;I)Lo9/c;

    move-result-object v6

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {v1}, Lo1/s;->r(Landroid/os/Looper;)Landroid/os/Handler;

    move-result-object v1

    new-instance v5, Lu1/t3;

    const/4 v2, 0x0

    invoke-direct {v5, v6, v1, v2}, Lu1/t3;-><init>(Lo9/c;Landroid/os/Handler;I)V

    new-instance v1, Lu1/s3;

    const/4 v8, 0x0

    move-object v2, v1

    move-object v7, p0

    invoke-direct/range {v2 .. v8}, Lu1/s3;-><init>(Landroid/content/ContentResolver;Landroid/net/Uri;Lu1/t3;Lo9/g;Landroid/content/Context;Lu8/e;)V

    new-instance v2, La4/c0;

    invoke-direct {v2, v1}, La4/c0;-><init>(Ljava/lang/Object;)V

    new-instance v1, Lr9/e;

    invoke-static {}, Ld7/t;->k()Lm9/y1;

    move-result-object v3

    sget-object v4, Lm9/m0;->a:Lt9/d;

    sget-object v4, Lr9/o;->a:Lm9/s1;

    invoke-virtual {v3, v4}, Lm9/p1;->O(Lu8/j;)Lu8/j;

    move-result-object v3

    invoke-direct {v1, v3}, Lr9/e;-><init>(Lu8/j;)V

    new-instance v3, Lp9/n0;

    const-wide/16 v4, 0x0

    const-wide v6, 0x7fffffffffffffffL

    invoke-direct {v3, v4, v5, v6, v7}, Lp9/n0;-><init>(JJ)V

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v4

    const-string v5, "animator_duration_scale"

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v4, v5, v6}, Landroid/provider/Settings$Global;->getFloat(Landroid/content/ContentResolver;Ljava/lang/String;F)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-static {v2, v1, v3, v4}, Lh6/g;->w0(La4/c0;Lr9/e;Lp9/n0;Ljava/lang/Float;)Lp9/z;

    move-result-object v1

    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    check-cast v1, Lp9/o0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :goto_1
    monitor-exit v0

    throw p0
.end method

.method public static final b(Landroid/view/View;)Lm0/u;
    .locals 1

    const v0, 0x7f080040

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Lm0/u;

    if-eqz v0, :cond_0

    check-cast p0, Lm0/u;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method
