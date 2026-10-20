.class public final Ly4/p;
.super Ljava/lang/Object;

# interfaces
.implements Ld8/b;


# instance fields
.field public final a:Ly4/n;


# direct methods
.method public constructor <init>(Ly4/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly4/p;->a:Ly4/n;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 7

    new-instance v6, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iget-object v0, p0, Ly4/p;->a:Ly4/n;

    iget-object v1, v0, Ly4/n;->a:Ldagger/hilt/android/internal/modules/ApplicationContextModule;

    invoke-static {v1}, Ldagger/hilt/android/internal/modules/ApplicationContextModule_ProvideApplicationFactory;->provideApplication(Ldagger/hilt/android/internal/modules/ApplicationContextModule;)Landroid/app/Application;

    move-result-object v1

    iget-object v2, v0, Ly4/n;->d:Ld8/b;

    invoke-interface {v2}, Lp8/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz4/d;

    iget-object v3, v0, Ly4/n;->e:Ld8/b;

    invoke-interface {v3}, Lp8/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La5/j;

    iget-object v4, v0, Ly4/n;->f:Ld8/b;

    invoke-interface {v4}, Lp8/a;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La5/z;

    iget-object v0, v0, Ly4/n;->g:Ld8/b;

    invoke-interface {v0}, Lp8/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, La5/i0;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/auto/accept/ui/viewmodel/MainViewModel;-><init>(Landroid/app/Application;Lz4/d;La5/j;La5/z;La5/i0;)V

    return-object v6
.end method
