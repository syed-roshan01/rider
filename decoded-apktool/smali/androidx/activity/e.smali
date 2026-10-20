.class public final synthetic Landroidx/activity/e;
.super Ljava/lang/Object;

# interfaces
.implements Lc9/a;


# instance fields
.field public final synthetic a:Landroidx/activity/p;


# direct methods
.method public synthetic constructor <init>(Landroidx/activity/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/activity/e;->a:Landroidx/activity/p;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroidx/activity/e;->a:Landroidx/activity/p;

    invoke-virtual {v0}, Landroidx/activity/p;->reportFullyDrawn()V

    const/4 v0, 0x0

    return-object v0
.end method
