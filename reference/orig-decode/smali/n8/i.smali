.class public final Ln8/i;
.super Ljava/lang/Object;

# interfaces
.implements Ln8/o;


# instance fields
.field public final synthetic a:I

.field public final b:Ln8/j;

.field public final c:Le8/i;


# direct methods
.method public constructor <init>(Ln8/j;Le8/i;I)V
    .locals 1

    iput p3, p0, Ln8/i;->a:I

    const/4 v0, 0x1

    if-eq p3, v0, :cond_0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln8/i;->b:Ln8/j;

    iput-object p2, p0, Ln8/i;->c:Le8/i;

    return-void

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object p3, p1, Ln8/j;->e:Lp/a;

    if-eqz p3, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    const-string p3, "success rate ejection config is null"

    invoke-static {p3, v0}, Ly3/e;->G(Ljava/lang/String;Z)V

    iput-object p1, p0, Ln8/i;->b:Ln8/j;

    iput-object p2, p0, Ln8/i;->c:Le8/i;

    return-void
.end method
