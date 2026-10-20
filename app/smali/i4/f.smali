.class public final Li4/f;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Li4/h;


# direct methods
.method public synthetic constructor <init>(Li4/h;I)V
    .locals 0

    iput p2, p0, Li4/f;->a:I

    iput-object p1, p0, Li4/f;->b:Li4/h;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    iget v0, p0, Li4/f;->a:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lw4/k;->a:Lw4/k;

    iget-object v1, p0, Li4/f;->b:Li4/h;

    iget-object v1, v1, Li4/h;->a:Landroid/content/Context;

    monitor-enter v0

    :try_start_0
    sget-object v2, Lw4/k;->b:Ll4/n;

    if-nez v2, :cond_0

    new-instance v2, Ll4/a;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    sget-object v3, Lja/m;->a:Lja/t;

    iput-object v3, v2, Ll4/a;->b:Lja/t;

    const-wide v3, 0x3f947ae147ae147bL    # 0.02

    iput-wide v3, v2, Ll4/a;->c:D

    const-wide/32 v3, 0xa00000

    iput-wide v3, v2, Ll4/a;->d:J

    const-wide/32 v3, 0xfa00000

    iput-wide v3, v2, Ll4/a;->e:J

    sget-object v3, Lm9/m0;->b:Lt9/c;

    iput-object v3, v2, Ll4/a;->f:Lt9/c;

    invoke-static {v1}, Lw4/e;->c(Landroid/content/Context;)Ljava/io/File;

    move-result-object v1

    invoke-static {v1}, Lb9/b;->U(Ljava/io/File;)Ljava/io/File;

    move-result-object v1

    sget-object v3, Lja/x;->b:Ljava/lang/String;

    invoke-static {v1}, Lfa/l;->j(Ljava/io/File;)Lja/x;

    move-result-object v1

    iput-object v1, v2, Ll4/a;->a:Lja/x;

    invoke-virtual {v2}, Ll4/a;->a()Ll4/n;

    move-result-object v2

    sput-object v2, Lw4/k;->b:Ll4/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-object v2

    :goto_1
    monitor-exit v0

    throw v1

    :pswitch_0
    new-instance v0, Lq4/b;

    iget-object v1, p0, Li4/f;->b:Li4/h;

    iget-object v1, v1, Li4/h;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lq4/b;-><init>(Landroid/content/Context;)V

    iget-boolean v2, v0, Lq4/b;->c:Z

    if-eqz v2, :cond_1

    new-instance v2, Lq4/k;

    invoke-direct {v2}, Lq4/k;-><init>()V

    goto :goto_2

    :cond_1
    new-instance v2, La4/q;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    :goto_2
    iget-boolean v3, v0, Lq4/b;->b:Z

    if-eqz v3, :cond_5

    iget-wide v3, v0, Lq4/b;->a:D

    const-wide/16 v5, 0x0

    cmpl-double v0, v3, v5

    if-lez v0, :cond_3

    sget-object v0, Lw4/e;->a:[Landroid/graphics/Bitmap$Config;

    :try_start_1
    const-class v0, Landroid/app/ActivityManager;

    invoke-static {v1, v0}, Lr2/k;->getSystemService(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    check-cast v0, Landroid/app/ActivityManager;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    iget v1, v1, Landroid/content/pm/ApplicationInfo;->flags:I

    const/high16 v5, 0x100000

    and-int/2addr v1, v5

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Landroid/app/ActivityManager;->getLargeMemoryClass()I

    move-result v0

    goto :goto_3

    :cond_2
    invoke-virtual {v0}, Landroid/app/ActivityManager;->getMemoryClass()I

    move-result v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :catch_0
    const/16 v0, 0x100

    :goto_3
    int-to-double v0, v0

    mul-double/2addr v3, v0

    const/16 v0, 0x400

    int-to-double v0, v0

    mul-double/2addr v3, v0

    mul-double/2addr v3, v0

    double-to-int v0, v3

    goto :goto_4

    :cond_3
    const/4 v0, 0x0

    :goto_4
    if-lez v0, :cond_4

    new-instance v1, Lq4/i;

    invoke-direct {v1, v0, v2}, Lq4/i;-><init>(ILq4/m;)V

    goto :goto_5

    :cond_4
    new-instance v1, Lq4/a;

    invoke-direct {v1, v2}, Lq4/a;-><init>(Lq4/m;)V

    goto :goto_5

    :cond_5
    new-instance v1, Lq4/a;

    invoke-direct {v1, v2}, Lq4/a;-><init>(Lq4/m;)V

    :goto_5
    new-instance v0, Lq4/f;

    invoke-direct {v0, v1, v2}, Lq4/f;-><init>(Lq4/l;Lq4/m;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
