.class public final Ly4/q;
.super Ly4/g;


# instance fields
.field public final a:Ly4/p;


# direct methods
.method public constructor <init>(Ly4/n;Ly4/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p2, Ly4/p;

    invoke-direct {p2, p1}, Ly4/p;-><init>(Ly4/n;)V

    iput-object p2, p0, Ly4/q;->a:Ly4/p;

    return-void
.end method


# virtual methods
.method public final getHiltViewModelAssistedMap()Ljava/util/Map;
    .locals 1

    sget-object v0, Lr6/f0;->n:Lr6/f0;

    return-object v0
.end method

.method public final getHiltViewModelMap()Ljava/util/Map;
    .locals 3

    iget-object v0, p0, Ly4/q;->a:Ly4/p;

    const-string v1, "com.auto.accept.ui.viewmodel.MainViewModel"

    invoke-static {v1, v0}, Lz6/a;->j(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lr6/f0;->b(I[Ljava/lang/Object;Lr6/r;)Lr6/f0;

    move-result-object v0

    return-object v0
.end method
