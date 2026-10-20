.class public final Lh2/b;
.super Ljava/lang/Object;


# instance fields
.field public a:Landroid/os/LocaleList;

.field public b:Lh2/d;

.field public final c:La4/q;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, La4/q;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lh2/b;->c:La4/q;

    return-void
.end method


# virtual methods
.method public final a()Lh2/d;
    .locals 8

    invoke-static {}, Landroid/os/LocaleList;->getDefault()Landroid/os/LocaleList;

    move-result-object v0

    iget-object v1, p0, Lh2/b;->c:La4/q;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lh2/b;->b:Lh2/d;

    if-eqz v2, :cond_0

    iget-object v3, p0, Lh2/b;->a:Landroid/os/LocaleList;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v0, v3, :cond_0

    monitor-exit v1

    return-object v2

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :try_start_1
    invoke-virtual {v0}, Landroid/os/LocaleList;->size()I

    move-result v2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_1

    new-instance v5, Lh2/c;

    new-instance v6, Lh2/a;

    invoke-virtual {v0, v4}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    move-result-object v7

    invoke-direct {v6, v7}, Lh2/a;-><init>(Ljava/util/Locale;)V

    invoke-direct {v5, v6}, Lh2/c;-><init>(Lh2/a;)V

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    new-instance v2, Lh2/d;

    invoke-direct {v2, v3}, Lh2/d;-><init>(Ljava/util/List;)V

    iput-object v0, p0, Lh2/b;->a:Landroid/os/LocaleList;

    iput-object v2, p0, Lh2/b;->b:Lh2/d;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    return-object v2

    :goto_1
    monitor-exit v1

    throw v0
.end method
