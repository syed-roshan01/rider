.class public abstract Landroidx/lifecycle/a;
.super Landroidx/lifecycle/x0;


# instance fields
.field public final a:Landroid/app/Application;


# direct methods
.method public constructor <init>(Landroid/app/Application;)V
    .locals 1

    const-string v0, "application"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/x0;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/a;->a:Landroid/app/Application;

    return-void
.end method


# virtual methods
.method public final b()Landroid/app/Application;
    .locals 2

    const-string v0, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication"

    iget-object v1, p0, Landroidx/lifecycle/a;->a:Landroid/app/Application;

    invoke-static {v1, v0}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1
.end method
