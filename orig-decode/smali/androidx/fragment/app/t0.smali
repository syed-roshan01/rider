.class public final Landroidx/fragment/app/t0;
.super Ljava/lang/Object;

# interfaces
.implements Landroidx/fragment/app/c1;


# instance fields
.field public final synthetic a:Landroidx/fragment/app/d0;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/d0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/t0;->a:Landroidx/fragment/app/d0;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/fragment/app/d0;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/t0;->a:Landroidx/fragment/app/d0;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/d0;->onAttachFragment(Landroidx/fragment/app/d0;)V

    return-void
.end method
