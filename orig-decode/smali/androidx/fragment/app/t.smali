.class public final Landroidx/fragment/app/t;
.super Landroidx/fragment/app/b0;


# instance fields
.field public final synthetic a:Landroidx/fragment/app/d0;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/d0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/t;->a:Landroidx/fragment/app/d0;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/t;->a:Landroidx/fragment/app/d0;

    iget-object v1, v0, Landroidx/fragment/app/d0;->mSavedStateRegistryController:Lb4/f;

    invoke-virtual {v1}, Lb4/f;->a()V

    invoke-static {v0}, Landroidx/lifecycle/s0;->c(Lb4/g;)V

    return-void
.end method
