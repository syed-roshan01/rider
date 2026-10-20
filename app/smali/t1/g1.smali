.class public final Lt1/g1;
.super Ljava/lang/Object;

# interfaces
.implements Lt1/m1;


# instance fields
.field public final a:Lt1/f1;


# direct methods
.method public constructor <init>(Lt1/f1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt1/g1;->a:Lt1/f1;

    return-void
.end method


# virtual methods
.method public final w()Z
    .locals 1

    iget-object v0, p0, Lt1/g1;->a:Lt1/f1;

    check-cast v0, Ly0/n;

    iget-object v0, v0, Ly0/n;->a:Ly0/n;

    iget-boolean v0, v0, Ly0/n;->t:Z

    return v0
.end method
