.class public final Lc5/d;
.super Ljava/lang/Object;

# interfaces
.implements Lc/b;


# instance fields
.field public final synthetic a:Lc5/e;


# direct methods
.method public constructor <init>(Lcom/auto/accept/ui/MainActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc5/d;->a:Lc5/e;

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)V
    .locals 1

    iget-object p1, p0, Lc5/d;->a:Lc5/e;

    iget-boolean v0, p1, Lc5/e;->d:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p1, Lc5/e;->d:Z

    invoke-virtual {p1}, Lc5/e;->generatedComponent()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc5/x;

    invoke-static {p1}, Ldagger/hilt/internal/UnsafeCasts;->unsafeCast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/auto/accept/ui/MainActivity;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    return-void
.end method
