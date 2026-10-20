.class public final Ly4/m;
.super Ljava/lang/Object;

# interfaces
.implements Ld8/b;


# instance fields
.field public final a:Ly4/n;

.field public final b:I


# direct methods
.method public constructor <init>(Ly4/n;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly4/m;->a:Ly4/n;

    iput p2, p0, Ly4/m;->b:I

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Ly4/m;->a:Ly4/n;

    iget v1, p0, Ly4/m;->b:I

    if-eqz v1, :cond_4

    const/4 v2, 0x1

    if-eq v1, v2, :cond_3

    const/4 v0, 0x2

    if-eq v1, v0, :cond_2

    const/4 v0, 0x3

    if-eq v1, v0, :cond_1

    const/4 v0, 0x4

    if-ne v1, v0, :cond_0

    new-instance v0, La5/i0;

    invoke-direct {v0}, La5/i0;-><init>()V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(I)V

    throw v0

    :cond_1
    new-instance v0, La5/z;

    invoke-direct {v0}, La5/z;-><init>()V

    return-object v0

    :cond_2
    new-instance v0, La5/j;

    invoke-direct {v0}, La5/j;-><init>()V

    return-object v0

    :cond_3
    new-instance v1, Lz4/b;

    iget-object v0, v0, Ly4/n;->a:Ldagger/hilt/android/internal/modules/ApplicationContextModule;

    invoke-static {v0}, Ldagger/hilt/android/internal/modules/ApplicationContextModule_ProvideContextFactory;->provideContext(Ldagger/hilt/android/internal/modules/ApplicationContextModule;)Landroid/content/Context;

    move-result-object v0

    invoke-direct {v1, v0}, Lz4/b;-><init>(Landroid/content/Context;)V

    return-object v1

    :cond_4
    new-instance v1, Lz4/d;

    iget-object v2, v0, Ly4/n;->a:Ldagger/hilt/android/internal/modules/ApplicationContextModule;

    invoke-static {v2}, Ldagger/hilt/android/internal/modules/ApplicationContextModule_ProvideContextFactory;->provideContext(Ldagger/hilt/android/internal/modules/ApplicationContextModule;)Landroid/content/Context;

    move-result-object v2

    iget-object v0, v0, Ly4/n;->c:Ld8/b;

    invoke-interface {v0}, Lp8/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz4/b;

    invoke-direct {v1, v2, v0}, Lz4/d;-><init>(Landroid/content/Context;Lz4/b;)V

    return-object v1
.end method
