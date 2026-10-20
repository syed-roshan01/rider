.class public final Li4/h;
.super Ljava/lang/Object;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ls4/c;

.field public final c:Lw4/j;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Li4/h;->a:Landroid/content/Context;

    sget-object p1, Lw4/d;->a:Ls4/c;

    iput-object p1, p0, Li4/h;->b:Ls4/c;

    new-instance p1, Lw4/j;

    invoke-direct {p1}, Lw4/j;-><init>()V

    iput-object p1, p0, Li4/h;->c:Lw4/j;

    return-void
.end method
