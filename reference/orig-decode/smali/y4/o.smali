.class public final Ly4/o;
.super Ljava/lang/Object;

# interfaces
.implements Ldagger/hilt/android/internal/builders/ViewModelComponentBuilder;


# instance fields
.field public final a:Ly4/n;

.field public final b:Ly4/j;

.field public c:Landroidx/lifecycle/p0;

.field public d:Ldagger/hilt/android/ViewModelLifecycle;


# direct methods
.method public constructor <init>(Ly4/n;Ly4/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly4/o;->a:Ly4/n;

    iput-object p2, p0, Ly4/o;->b:Ly4/j;

    return-void
.end method


# virtual methods
.method public final build()Ldagger/hilt/android/components/ViewModelComponent;
    .locals 3

    iget-object v0, p0, Ly4/o;->c:Landroidx/lifecycle/p0;

    const-class v1, Landroidx/lifecycle/p0;

    invoke-static {v1, v0}, Lz6/a;->g(Ljava/lang/Class;Ljava/lang/Object;)V

    iget-object v0, p0, Ly4/o;->d:Ldagger/hilt/android/ViewModelLifecycle;

    const-class v1, Ldagger/hilt/android/ViewModelLifecycle;

    invoke-static {v1, v0}, Lz6/a;->g(Ljava/lang/Class;Ljava/lang/Object;)V

    new-instance v0, Ly4/q;

    iget-object v1, p0, Ly4/o;->a:Ly4/n;

    iget-object v2, p0, Ly4/o;->b:Ly4/j;

    invoke-direct {v0, v1, v2}, Ly4/q;-><init>(Ly4/n;Ly4/j;)V

    return-object v0
.end method

.method public final savedStateHandle(Landroidx/lifecycle/p0;)Ldagger/hilt/android/internal/builders/ViewModelComponentBuilder;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Ly4/o;->c:Landroidx/lifecycle/p0;

    return-object p0
.end method

.method public final viewModelLifecycle(Ldagger/hilt/android/ViewModelLifecycle;)Ldagger/hilt/android/internal/builders/ViewModelComponentBuilder;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Ly4/o;->d:Ldagger/hilt/android/ViewModelLifecycle;

    return-object p0
.end method
