.class public final Lv/b1;
.super Ly0/n;

# interfaces
.implements Ls1/f;


# instance fields
.field public u:Z

.field public final v:Ls1/j;


# direct methods
.method public constructor <init>(Z)V
    .locals 2

    invoke-direct {p0}, Ly0/n;-><init>()V

    iput-boolean p1, p0, Lv/b1;->u:Z

    sget-object p1, Landroidx/compose/foundation/gestures/a;->c:Ls1/i;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    new-instance v1, Ls1/j;

    invoke-direct {v1, p1}, Ls1/j;-><init>(Ls1/c;)V

    iget-object p1, v1, Ls1/j;->A:Lm0/n1;

    invoke-virtual {p1, v0}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    iput-object v1, p0, Lv/b1;->v:Ls1/j;

    return-void
.end method


# virtual methods
.method public final j()Lf6/a;
    .locals 1

    iget-boolean v0, p0, Lv/b1;->u:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lv/b1;->v:Ls1/j;

    goto :goto_0

    :cond_0
    sget-object v0, Ls1/b;->z:Ls1/b;

    :goto_0
    return-object v0
.end method
