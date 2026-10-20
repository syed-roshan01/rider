.class public final Ln8/l;
.super Le8/p;


# instance fields
.field public final synthetic y:Ln8/m;


# direct methods
.method public constructor <init>(Ln8/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln8/l;->y:Ln8/m;

    return-void
.end method


# virtual methods
.method public final j0(Le8/c2;)V
    .locals 1

    iget-object v0, p0, Ln8/l;->y:Ln8/m;

    iget-object v0, v0, Ln8/m;->a:Ln8/g;

    invoke-virtual {p1}, Le8/c2;->e()Z

    move-result p1

    invoke-virtual {v0, p1}, Ln8/g;->d(Z)V

    return-void
.end method
