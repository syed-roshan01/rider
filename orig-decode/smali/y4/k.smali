.class public final Ly4/k;
.super Ly4/e;


# instance fields
.field public final a:Ly4/n;

.field public final b:Ly4/j;

.field public final c:Ly4/h;

.field public final d:Ly4/k;


# direct methods
.method public constructor <init>(Ly4/n;Ly4/j;Ly4/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Ly4/k;->d:Ly4/k;

    iput-object p1, p0, Ly4/k;->a:Ly4/n;

    iput-object p2, p0, Ly4/k;->b:Ly4/j;

    iput-object p3, p0, Ly4/k;->c:Ly4/h;

    return-void
.end method


# virtual methods
.method public final getHiltInternalFactoryFactory()Ldagger/hilt/android/internal/lifecycle/DefaultViewModelFactories$InternalFactoryFactory;
    .locals 1

    iget-object v0, p0, Ly4/k;->c:Ly4/h;

    invoke-virtual {v0}, Ly4/h;->getHiltInternalFactoryFactory()Ldagger/hilt/android/internal/lifecycle/DefaultViewModelFactories$InternalFactoryFactory;

    move-result-object v0

    return-object v0
.end method

.method public final viewWithFragmentComponentBuilder()Ldagger/hilt/android/internal/builders/ViewWithFragmentComponentBuilder;
    .locals 2

    new-instance v0, Landroidx/fragment/app/g;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p0, Ly4/k;->a:Ly4/n;

    iput-object v1, v0, Landroidx/fragment/app/g;->b:Ljava/lang/Object;

    iget-object v1, p0, Ly4/k;->b:Ly4/j;

    iput-object v1, v0, Landroidx/fragment/app/g;->c:Ljava/lang/Object;

    iget-object v1, p0, Ly4/k;->c:Ly4/h;

    iput-object v1, v0, Landroidx/fragment/app/g;->d:Ljava/lang/Object;

    iget-object v1, p0, Ly4/k;->d:Ly4/k;

    iput-object v1, v0, Landroidx/fragment/app/g;->e:Ljava/lang/Object;

    return-object v0
.end method
