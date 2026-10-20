.class public final Lb/h;
.super Landroidx/activity/y;


# instance fields
.field public final synthetic d:Lm0/l3;


# direct methods
.method public constructor <init>(ZLm0/g1;)V
    .locals 0

    iput-object p2, p0, Lb/h;->d:Lm0/l3;

    invoke-direct {p0, p1}, Landroidx/activity/y;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lb/h;->d:Lm0/l3;

    invoke-interface {v0}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc9/a;

    invoke-interface {v0}, Lc9/a;->invoke()Ljava/lang/Object;

    return-void
.end method
