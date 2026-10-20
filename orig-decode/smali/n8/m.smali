.class public final Ln8/m;
.super Le8/n;


# instance fields
.field public final a:Ln8/g;

.field public final b:Le8/n;


# direct methods
.method public constructor <init>(Ln8/g;Le8/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln8/m;->a:Ln8/g;

    iput-object p2, p0, Ln8/m;->b:Le8/n;

    return-void
.end method


# virtual methods
.method public final a(Le8/o;Le8/l1;)Le8/p;
    .locals 1

    iget-object v0, p0, Ln8/m;->b:Le8/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Le8/n;->a(Le8/o;Le8/l1;)Le8/p;

    move-result-object p1

    new-instance p2, Ln8/k;

    invoke-direct {p2, p0, p1}, Ln8/k;-><init>(Ln8/m;Le8/p;)V

    return-object p2

    :cond_0
    new-instance p1, Ln8/l;

    invoke-direct {p1, p0}, Ln8/l;-><init>(Ln8/m;)V

    return-object p1
.end method
