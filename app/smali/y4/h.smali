.class public final Ly4/h;
.super Ly4/c;


# instance fields
.field public final a:Ly4/n;

.field public final b:Ly4/j;

.field public final c:Ly4/h;


# direct methods
.method public constructor <init>(Ly4/n;Ly4/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Ly4/h;->c:Ly4/h;

    iput-object p1, p0, Ly4/h;->a:Ly4/n;

    iput-object p2, p0, Ly4/h;->b:Ly4/j;

    return-void
.end method


# virtual methods
.method public final fragmentComponentBuilder()Ldagger/hilt/android/internal/builders/FragmentComponentBuilder;
    .locals 4

    new-instance v0, Li3/a0;

    iget-object v1, p0, Ly4/h;->a:Ly4/n;

    iget-object v2, p0, Ly4/h;->b:Ly4/j;

    iget-object v3, p0, Ly4/h;->c:Ly4/h;

    invoke-direct {v0, v1, v2, v3}, Li3/a0;-><init>(Ly4/n;Ly4/j;Ly4/h;)V

    return-object v0
.end method

.method public final getHiltInternalFactoryFactory()Ldagger/hilt/android/internal/lifecycle/DefaultViewModelFactories$InternalFactoryFactory;
    .locals 4

    invoke-virtual {p0}, Ly4/h;->getViewModelKeys()Ljava/util/Set;

    move-result-object v0

    new-instance v1, Ly4/o;

    iget-object v2, p0, Ly4/h;->b:Ly4/j;

    iget-object v3, p0, Ly4/h;->a:Ly4/n;

    invoke-direct {v1, v3, v2}, Ly4/o;-><init>(Ly4/n;Ly4/j;)V

    invoke-static {v0, v1}, Ldagger/hilt/android/internal/lifecycle/DefaultViewModelFactories_InternalFactoryFactory_Factory;->newInstance(Ljava/util/Set;Ldagger/hilt/android/internal/builders/ViewModelComponentBuilder;)Ldagger/hilt/android/internal/lifecycle/DefaultViewModelFactories$InternalFactoryFactory;

    move-result-object v0

    return-object v0
.end method

.method public final getViewModelComponentBuilder()Ldagger/hilt/android/internal/builders/ViewModelComponentBuilder;
    .locals 3

    new-instance v0, Ly4/o;

    iget-object v1, p0, Ly4/h;->b:Ly4/j;

    iget-object v2, p0, Ly4/h;->a:Ly4/n;

    invoke-direct {v0, v2, v1}, Ly4/o;-><init>(Ly4/n;Ly4/j;)V

    return-object v0
.end method

.method public final getViewModelKeys()Ljava/util/Set;
    .locals 2

    sget v0, Lr6/t;->c:I

    new-instance v0, Lr6/i0;

    const-string v1, "com.auto.accept.ui.viewmodel.MainViewModel"

    invoke-direct {v0, v1}, Lr6/i0;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final viewComponentBuilder()Ldagger/hilt/android/internal/builders/ViewComponentBuilder;
    .locals 4

    new-instance v0, Li3/a0;

    iget-object v1, p0, Ly4/h;->a:Ly4/n;

    iget-object v2, p0, Ly4/h;->b:Ly4/j;

    iget-object v3, p0, Ly4/h;->c:Ly4/h;

    invoke-direct {v0, v1, v2, v3}, Li3/a0;-><init>(Ly4/n;Ly4/j;Ly4/h;)V

    return-object v0
.end method
