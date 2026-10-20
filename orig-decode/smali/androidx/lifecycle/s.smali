.class public final Landroidx/lifecycle/s;
.super Landroidx/lifecycle/j;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    const-string p2, "activity"

    invoke-static {p1, p2}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    sget p2, Landroidx/lifecycle/n0;->b:I

    invoke-static {p1}, Lx9/v;->y(Landroid/app/Activity;)V

    return-void
.end method
