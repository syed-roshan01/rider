.class public final Ly4/n;
.super Ly4/f;


# instance fields
.field public final a:Ldagger/hilt/android/internal/modules/ApplicationContextModule;

.field public final b:Ly4/n;

.field public final c:Ld8/b;

.field public final d:Ld8/b;

.field public final e:Ld8/b;

.field public final f:Ld8/b;

.field public final g:Ld8/b;


# direct methods
.method public constructor <init>(Ldagger/hilt/android/internal/modules/ApplicationContextModule;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Ly4/n;->b:Ly4/n;

    iput-object p1, p0, Ly4/n;->a:Ldagger/hilt/android/internal/modules/ApplicationContextModule;

    new-instance p1, Ly4/m;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Ly4/m;-><init>(Ly4/n;I)V

    invoke-static {p1}, Ld8/a;->a(Ld8/b;)Ld8/b;

    move-result-object p1

    iput-object p1, p0, Ly4/n;->c:Ld8/b;

    new-instance p1, Ly4/m;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Ly4/m;-><init>(Ly4/n;I)V

    invoke-static {p1}, Ld8/a;->a(Ld8/b;)Ld8/b;

    move-result-object p1

    iput-object p1, p0, Ly4/n;->d:Ld8/b;

    new-instance p1, Ly4/m;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v0}, Ly4/m;-><init>(Ly4/n;I)V

    invoke-static {p1}, Ld8/a;->a(Ld8/b;)Ld8/b;

    move-result-object p1

    iput-object p1, p0, Ly4/n;->e:Ld8/b;

    new-instance p1, Ly4/m;

    const/4 v0, 0x3

    invoke-direct {p1, p0, v0}, Ly4/m;-><init>(Ly4/n;I)V

    invoke-static {p1}, Ld8/a;->a(Ld8/b;)Ld8/b;

    move-result-object p1

    iput-object p1, p0, Ly4/n;->f:Ld8/b;

    new-instance p1, Ly4/m;

    const/4 v0, 0x4

    invoke-direct {p1, p0, v0}, Ly4/m;-><init>(Ly4/n;I)V

    invoke-static {p1}, Ld8/a;->a(Ld8/b;)Ld8/b;

    move-result-object p1

    iput-object p1, p0, Ly4/n;->g:Ld8/b;

    return-void
.end method


# virtual methods
.method public final getDisableFragmentGetContextFix()Ljava/util/Set;
    .locals 1

    sget v0, Lr6/t;->c:I

    sget-object v0, Lr6/g0;->q:Lr6/g0;

    return-object v0
.end method

.method public final retainedComponentBuilder()Ldagger/hilt/android/internal/builders/ActivityRetainedComponentBuilder;
    .locals 2

    new-instance v0, Ll/t;

    iget-object v1, p0, Ly4/n;->b:Ly4/n;

    invoke-direct {v0, v1}, Ll/t;-><init>(Ly4/n;)V

    return-object v0
.end method

.method public final serviceComponentBuilder()Ldagger/hilt/android/internal/builders/ServiceComponentBuilder;
    .locals 3

    new-instance v0, Ll/t;

    iget-object v1, p0, Ly4/n;->b:Ly4/n;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/t;-><init>(Ly4/n;I)V

    return-object v0
.end method
