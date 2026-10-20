.class public final Lj/a;
.super Ljava/lang/Object;

# interfaces
.implements Li3/k;


# instance fields
.field public a:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj/a;->a:Landroid/content/Context;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    const/4 v0, 0x4

    if-eq p2, v0, :cond_0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lj/a;->a:Landroid/content/Context;

    return-void

    .line 4
    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    invoke-static {p1}, Lf6/a;->x(Ljava/lang/Object;)V

    iput-object p1, p0, Lj/a;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final a(Lh6/g;)V
    .locals 9

    new-instance v7, Li3/a;

    const-string v0, "EmojiCompatInitializer"

    invoke-direct {v7, v0}, Li3/a;-><init>(Ljava/lang/String;)V

    new-instance v8, Ljava/util/concurrent/ThreadPoolExecutor;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const-wide/16 v3, 0xf

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/LinkedBlockingDeque;

    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingDeque;-><init>()V

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    new-instance v0, Li3/n;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v8, v1}, Li3/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v8, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final b()Ll5/k;
    .locals 21

    move-object/from16 v0, p0

    iget-object v1, v0, Lj/a;->a:Landroid/content/Context;

    if-eqz v1, :cond_0

    new-instance v2, Ll5/k;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    sget-object v3, Ll5/n;->a:Ll5/o;

    invoke-static {v3}, Ln5/a;->a(Ln5/b;)Lp8/a;

    move-result-object v3

    iput-object v3, v2, Ll5/k;->a:Lp8/a;

    new-instance v3, Ln5/c;

    invoke-direct {v3, v1}, Ln5/c;-><init>(Landroid/content/Context;)V

    iput-object v3, v2, Ll5/k;->b:Ln5/c;

    sget-object v1, Lt5/b;->a:Ll5/o;

    sget-object v11, Lt5/b;->b:Ll5/o;

    new-instance v4, Lm5/e;

    const/4 v12, 0x0

    invoke-direct {v4, v3, v1, v11, v12}, Lm5/e;-><init>(Lp8/a;Ll5/o;Ll5/o;I)V

    new-instance v5, Lm5/g;

    invoke-direct {v5, v3, v4}, Lm5/g;-><init>(Ln5/c;Lm5/e;)V

    invoke-static {v5}, Ln5/a;->a(Ln5/b;)Lp8/a;

    move-result-object v3

    iput-object v3, v2, Ll5/k;->c:Lp8/a;

    iget-object v3, v2, Ll5/k;->b:Ln5/c;

    sget-object v4, Lr5/e;->a:Ll5/o;

    sget-object v5, Lr5/e;->b:Ll5/o;

    new-instance v6, Lm5/e;

    const/4 v7, 0x1

    invoke-direct {v6, v3, v4, v5, v7}, Lm5/e;-><init>(Lp8/a;Ll5/o;Ll5/o;I)V

    iput-object v6, v2, Ll5/k;->d:Lm5/e;

    new-instance v4, Lp5/e;

    invoke-direct {v4, v3, v7}, Lp5/e;-><init>(Lp8/a;I)V

    invoke-static {v4}, Ln5/a;->a(Ln5/b;)Lp8/a;

    move-result-object v9

    sget-object v7, Lr5/e;->c:Ll5/o;

    iget-object v8, v2, Ll5/k;->d:Lm5/e;

    new-instance v3, Ll5/v;

    const/4 v10, 0x2

    move-object v4, v3

    move-object v5, v1

    move-object v6, v11

    invoke-direct/range {v4 .. v10}, Ll5/v;-><init>(Lp8/a;Lp8/a;Ln5/b;Lp8/a;Lp8/a;I)V

    invoke-static {v3}, Ln5/a;->a(Ln5/b;)Lp8/a;

    move-result-object v3

    iput-object v3, v2, Ll5/k;->e:Lp8/a;

    new-instance v7, Lp5/e;

    invoke-direct {v7, v1, v12}, Lp5/e;-><init>(Lp8/a;I)V

    iget-object v10, v2, Ll5/k;->b:Ln5/c;

    new-instance v12, Lp5/f;

    const/4 v9, 0x0

    move-object v4, v12

    move-object v5, v10

    move-object v6, v3

    move-object v8, v11

    invoke-direct/range {v4 .. v9}, Lp5/f;-><init>(Lp8/a;Lp8/a;Ln5/b;Lp8/a;I)V

    iget-object v4, v2, Ll5/k;->a:Lp8/a;

    iget-object v5, v2, Ll5/k;->c:Lp8/a;

    new-instance v7, Ll5/v;

    const/16 v19, 0x1

    move-object v13, v7

    move-object v14, v4

    move-object v15, v5

    move-object/from16 v16, v12

    move-object/from16 v17, v3

    move-object/from16 v18, v3

    invoke-direct/range {v13 .. v19}, Ll5/v;-><init>(Lp8/a;Lp8/a;Ln5/b;Lp8/a;Lp8/a;I)V

    new-instance v8, Lq5/j;

    move-object v13, v8

    move-object v14, v10

    move-object v15, v5

    move-object/from16 v16, v3

    move-object/from16 v17, v12

    move-object/from16 v18, v4

    move-object/from16 v19, v3

    move-object/from16 v20, v3

    invoke-direct/range {v13 .. v20}, Lq5/j;-><init>(Lp8/a;Lp8/a;Lp8/a;Lp5/f;Lp8/a;Lp8/a;Lp8/a;)V

    new-instance v9, Lp5/f;

    const/16 v18, 0x1

    move-object v13, v9

    move-object v14, v4

    move-object v15, v3

    move-object/from16 v16, v12

    move-object/from16 v17, v3

    invoke-direct/range {v13 .. v18}, Lp5/f;-><init>(Lp8/a;Lp8/a;Ln5/b;Lp8/a;I)V

    new-instance v3, Ll5/v;

    const/4 v10, 0x0

    move-object v4, v3

    move-object v5, v1

    move-object v6, v11

    invoke-direct/range {v4 .. v10}, Ll5/v;-><init>(Lp8/a;Lp8/a;Ln5/b;Lp8/a;Lp8/a;I)V

    invoke-static {v3}, Ln5/a;->a(Ln5/b;)Lp8/a;

    move-result-object v1

    iput-object v1, v2, Ll5/k;->f:Lp8/a;

    return-object v2

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-class v3, Landroid/content/Context;

    invoke-virtual {v3}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " must be set"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final c(ILjava/lang/String;)Landroid/content/pm/ApplicationInfo;
    .locals 1

    iget-object v0, p0, Lj/a;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {v0, p2, p1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object p1

    return-object p1
.end method

.method public final d(ILjava/lang/String;)Landroid/content/pm/PackageInfo;
    .locals 1

    iget-object v0, p0, Lj/a;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {v0, p2, p1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p1

    return-object p1
.end method

.method public final e()Z
    .locals 2

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v0

    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lj/a;->a:Landroid/content/Context;

    invoke-static {v0}, Lf6/a;->X(Landroid/content/Context;)Z

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lj/a;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getNameForUid(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lj/a;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/pm/PackageManager;->isInstantApp(Ljava/lang/String;)Z

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final f()Lk6/d4;
    .locals 2

    iget-object v0, p0, Lj/a;->a:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v1, v1}, Lk6/f5;->a(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/zzdd;Ljava/lang/Long;)Lk6/f5;

    move-result-object v0

    iget-object v0, v0, Lk6/f5;->i:Lk6/d4;

    invoke-static {v0}, Lk6/f5;->d(Lk6/o5;)V

    return-object v0
.end method
