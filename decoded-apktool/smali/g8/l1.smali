.class public final Lg8/l1;
.super Ljava/lang/Object;

# interfaces
.implements Lg8/e4;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lg8/l1;->a:I

    const-string v0, "object"

    .line 3
    invoke-static {p1, v0}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Lg8/l1;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lr7/e;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lg8/l1;->a:I

    iput-object p1, p0, Lg8/l1;->b:Ljava/lang/Object;

    return-void
.end method
