.class public final Lg8/m5;
.super Lg8/o1;


# static fields
.field public static final d:Le8/b;


# instance fields
.field public final b:Lg8/j5;

.field public final c:Le8/h2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Le8/b;

    const-string v1, "io.grpc.internal.RetryingNameResolver.RESOLUTION_RESULT_LISTENER_KEY"

    invoke-direct {v0, v1}, Le8/b;-><init>(Ljava/lang/String;)V

    sput-object v0, Lg8/m5;->d:Le8/b;

    return-void
.end method

.method public constructor <init>(Le8/j0;Lg8/t;Le8/h2;)V
    .locals 0

    invoke-direct {p0, p1}, Lg8/o1;-><init>(Le8/j0;)V

    iput-object p2, p0, Lg8/m5;->b:Lg8/j5;

    iput-object p3, p0, Lg8/m5;->c:Le8/h2;

    return-void
.end method


# virtual methods
.method public final p()V
    .locals 4

    invoke-super {p0}, Lg8/o1;->p()V

    iget-object v0, p0, Lg8/m5;->b:Lg8/j5;

    check-cast v0, Lg8/t;

    iget-object v1, v0, Lg8/t;->b:Le8/h2;

    invoke-virtual {v1}, Le8/h2;->d()V

    new-instance v2, Landroidx/activity/d;

    const/16 v3, 0xe

    invoke-direct {v2, v0, v3}, Landroidx/activity/d;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v1, v2}, Le8/h2;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final q(Le8/i;)V
    .locals 1

    new-instance v0, Lg8/l5;

    invoke-direct {v0, p0, p1}, Lg8/l5;-><init>(Lg8/m5;Le8/i;)V

    invoke-super {p0, v0}, Lg8/o1;->q(Le8/i;)V

    return-void
.end method
